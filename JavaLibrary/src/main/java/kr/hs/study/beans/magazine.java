package kr.hs.study.beans;

public class magazine implements Book{
	private String name;
	private int price;
	private String book;
	
	public magazine() {
		
	}
	public magazine(String name, String book, int price){
		this.name = name;
		this.price = price;
		this.book = book;
	}
	
	public void buy() {
		System.out.println(name + "�� ���� '" + book + "'�� " + price + "���� ���");
	}

	public void sell() {
		System.out.println(name + "�� ���� '" + book + "'�� " + price + "���� �Ǵ�");
	}

	public void create() {
		System.out.println(name + "�� ���� '" + book + "'�� �����");
	}

	public void pr() {
		buy();
	}

}

