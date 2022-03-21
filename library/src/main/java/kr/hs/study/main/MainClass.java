package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Book obj1 = ctx.getBean("b1", Book.class);
		obj1.pr();
		
		Book obj2 = ctx.getBean("b2", Book.class);
		obj2.pr();
		
		Book obj3 = ctx.getBean("b3", Book.class);
		obj3.pr();
		
		ctx.close();
	}

}
