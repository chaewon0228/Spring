package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloWorldEn h1 = ctx.getBean("h1", HelloWorldEn.class);
		System.out.println("h1 : " + h1);
		
		ctx.close();
	}

}
