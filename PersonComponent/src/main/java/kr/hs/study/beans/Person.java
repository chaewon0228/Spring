package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	private String name;
	private int age;
	private String food;
	
	public void setValue(String name, int age, String food) {
		this.name = name;
		this.age = age;
		this.food = food;
		eat();
	}
	
	void eat() {
		System.out.println(name + ", " + age + ", " + food + "À» ¸Ô´Ù");
	}
	
}
          