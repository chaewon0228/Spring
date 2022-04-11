package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Employee;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		Employee obj1 = ctx.getBean("d1", Employee.class);
		obj1.Checkin();
		obj1.Checkout();
		
		Employee obj2 = ctx.getBean("d2", Employee.class);
		obj2.Checkin();
		obj2.Checkout();
		
		Employee obj3 = ctx.getBean("d3", Employee.class);
		obj3.Checkin();
		obj3.Checkout();
		
		ctx.close();
	}

}
