package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b3")
public class magazine implements Book{
	private String name;
	private int price;
	private String book;
	
	public magazine(@Value("kim")String name, @Value("spring")String book, @Value("8000")int price){
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

