package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b2")
public class poet implements Book{
	private String name;
	private int price;
	private String book;
	
	public poet(@Value("park")String name, @Value("spring3")String book, @Value("20000")int price){
		this.name = name;
		this.price = price;
		this.book = book;
	}
	public void buy() {
		System.out.println(name + "�� �� '" + book + "'�� " + price + "���� ���");
	}

	public void sell() {
		System.out.println(name + "�� �� '" + book + "'�� " + price + "���� �Ǵ�");
	}

	public void create() {
		System.out.println(name + "�� �� '" + book + "'�� �����");
	}

	public void pr() {
		
		buy();
	}

}
