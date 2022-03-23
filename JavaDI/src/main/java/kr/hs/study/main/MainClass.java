package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean4 obj1 = ctx.getBean("java4", TestBean4.class);
		System.out.println("obj1 : " + obj1);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		System.out.println(obj1.getData4());
		
		System.out.println("======================================");
		
		TestBean4 obj2 = ctx.getBean("java5", TestBean4.class);
		System.out.println("obj2 : " + obj2);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		System.out.println(obj2.getData4());
	}

}
