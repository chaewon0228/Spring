package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		
		System.out.println("=======================");
		TestBean1 obj2 = ctx.getBean("new", TestBean1.class);
		System.out.println("obj2 : " + obj2);
		
		System.out.println("=======================");
		TestBean1 obj3 = ctx.getBean("new", TestBean1.class);
		System.out.println("obj3 : " + obj3);
		
		//
		System.out.println("=======================");
		TestBean3 obj4 = ctx.getBean("test", TestBean3.class);
		System.out.println("obj4 : " + obj4);
		
		System.out.println("=======================");
		TestBean3 obj5 = ctx.getBean("t2", TestBean3.class);
		System.out.println("obj5 : " + obj5);
		ctx.close();
	}

}
