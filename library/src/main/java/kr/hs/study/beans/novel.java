package kr.hs.study.beans;

public class novel implements Book{

	private String name;
	private int price;
	private String book;
	
	public novel(String name, String book, int price){
		this.name = name;
		this.price = price;
		this.book = book;
	}
	
	public void buy() {
		System.out.println(name + "�� �Ҽ� '" + book + "'�� " + price + "���� ���");
	}

	public void sell() {
		System.out.println(name + "�� �Ҽ� '" + book + "'�� " + price + "���� �Ǵ�");
	}

	public void create() {
		System.out.println(name + "�� �Ҽ� '" + book + "'�� �����");
	}

	public void pr() {
		buy();
	}

}
