package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		DataBean1 obj1 = ctx.getBean("d1", DataBean1.class);
		// DataBean1 기본 생성자
		
		/*DataBean1 obj2 = ctx.getBean("d2", DataBean1.class);
		// DataBean1 기본 생성자
		
		DataBean1 obj3 = ctx.getBean("d3", DataBean1.class);
		DataBean1 obj4 = ctx.getBean("d3", DataBean1.class);
		
		*/
		DataBean1 obj4 = ctx.getBean("d4", DataBean1.class);
		
		System.out.println("d1 : "+obj1);
		/*
		System.out.println("d2 : "+obj2);
		System.out.println("d3 : "+obj3);
		*/
		System.out.println("obj4 : "+obj4);
		
		ctx.close();
	}

}
