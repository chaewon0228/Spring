package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b1")
public class novel implements Book{

	private String name;
	private int price;
	private String book;
	
	public novel(@Value("lee")String name, @Value("spring2")String book, @Value("10000")int price){
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
