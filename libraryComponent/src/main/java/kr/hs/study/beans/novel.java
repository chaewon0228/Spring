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
		System.out.println(name + "의 소설 '" + book + "'을 " + price + "원에 산다");
	}

	public void sell() {
		System.out.println(name + "의 소설 '" + book + "'을 " + price + "원에 판다");
	}

	public void create() {
		System.out.println(name + "의 소설 '" + book + "'을 만든다");
	}

	public void pr() {
		buy();
	}

}
