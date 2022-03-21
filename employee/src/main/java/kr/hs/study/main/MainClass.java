package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Employee;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
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
