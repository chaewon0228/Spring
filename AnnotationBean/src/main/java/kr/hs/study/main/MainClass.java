package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.hs.study.beans.testBean1;
import kr.hs.study.beans.testBean2;
import kr.hs.study.beans.testBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		/* xml
		 * TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
		 * System.out.println("data1:"+obj1.getData1());
		 * System.out.println("data2:"+obj1.getData2());
		 * 
		 * System.out.println("--------------------------------------"); TestBean3
		 * obj3=ctx.getBean("t3",TestBean3.class);
		 * System.out.println("data1:"+obj3.getData1());
		 * System.out.println("data2:"+obj3.getData2());
		 * System.out.println("data3:"+obj3.getData3());
		 * System.out.println("data4:"+obj3.getData4());
		 * System.out.println("--------------------------------------");
		 */

		testBean1 obj1 = ctx2.getBean("java3", testBean1.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());

		System.out.println("=================================");

		testBean2 obj2 = ctx2.getBean("java4", testBean2.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());

		System.out.println("=================================");

		testBean3 obj3 = ctx2.getBean("java5", testBean3.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		System.out.println(obj3.getData3());
		System.out.println(obj3.getData4());

		ctx.close();
		ctx2.close();
	}

}
