package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	
		// 객체 생성 시, 항상 생성자 실행
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class); 
		System.out.println("t1 : " + t1);
		
		//lazy-init = true  =>  getBean() 호출 후 객체 생성
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class); 
		System.out.println("t2 : " + t2);
		
		//scope = prototype  =>  singleton이 아닌 객체 만들 때마다 새로운 객체를 생성
		TestBean2 t3 = ctx.getBean("t2", TestBean2.class);
		System.out.println("t3 : " + t3);
		
		ctx.close();
	}

}
