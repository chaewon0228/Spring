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
		System.out.println(name + "의 잡지 '" + book + "'을 " + price + "원에 산다");
	}

	public void sell() {
		System.out.println(name + "의 잡지 '" + book + "'을 " + price + "원에 판다");
	}

	public void create() {
		System.out.println(name + "의 잡지 '" + book + "'을 만든다");
	}

	public void pr() {
		buy();
	}

}

