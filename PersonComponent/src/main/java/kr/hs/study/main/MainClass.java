package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Test obj1 = ctx.getBean(Test.class);
		obj1.getP1().setValue("kim", 10, "¹ä");
		obj1.getP2().setValue("lee", 19, "¸¶¶óÅÁ");
		obj1.getP3().setValue("park", 22, "Ä¡Å²");
		
		ctx.close();
	}

}
