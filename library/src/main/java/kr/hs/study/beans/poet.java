package kr.hs.study.beans;


public class poet implements Book{
	private String name;
	private int price;
	private String book;
	
	public poet(String name, String book, int price){
		this.name = name;
		this.price = price;
		this.book = book;
	}
	public void buy() {
		System.out.println(name + "의 시 '" + book + "'을 " + price + "원에 산다");
	}

	public void sell() {
		System.out.println(name + "의 시 '" + book + "'을 " + price + "원에 판다");
	}

	public void create() {
		System.out.println(name + "의 시 '" + book + "'을 만든다");
	}

	public void pr() {
		
		buy();
	}

}
