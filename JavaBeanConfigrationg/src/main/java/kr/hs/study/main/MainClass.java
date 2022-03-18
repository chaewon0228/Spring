package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanClassConfiguration;

public class MainClass {

	public static void main(String[] args) {
		// BeanClassConfiguration.class ������ �ε��ؼ� bean ���
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanClassConfiguration.class);

		TestBean1 obj1 = ctx.getBean("java1()", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		
		TestBean1 obj2 = ctx.getBean("java2()", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		ctx.close();
	}

}
