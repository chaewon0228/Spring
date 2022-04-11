package kr.hs.study.beans;

public class Person {
	String name;
	int age;
	String food;
	
	public Person() {}
	
	public Person(String name, int age, String food) {
		this.name = name;
		this.age = age;
		this.food = food;
		eat();
	}
	
	void eat() {
		System.out.println(name + ", " + age + ", " + food + "À» ¸Ô´Ù");
	}
	
}
          