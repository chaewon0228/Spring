package kr.hs.study.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestBean1 {
	public void method1() {
		System.out.println("TestBean1의 method1");
		//예외 발생
		int a = 100 / 0;
	}

	public void method2() {
		System.out.println("TestBean2의 method2");
	}
}
