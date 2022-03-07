package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// config.xml를 로딩시킨다 : 객체를 생성해서 컨테이너에 보관한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*1.*/
		
		// container에 있는 객체를 가져옴
		// getBean의 리턴값은 오브젝트 : t1은 객체
		TestBean t1 = (TestBean) ctx.getBean("t1");
		System.out.println("t1 : " + t1);
		
		// 같은 t1을 가져옴 : singleton
		TestBean t2 = (TestBean) ctx.getBean("t1");
		System.out.println("t2 : " + t2);
		
		/*2.*/
		
		TestBean t3 = ctx.getBean("t1", TestBean.class);
		System.out.println("t3 : "+t3);
		
		
		// container에 있는 객체를 소멸
		ctx.close();
	}

}
