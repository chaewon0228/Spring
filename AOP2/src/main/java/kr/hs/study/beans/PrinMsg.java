package kr.hs.study.beans;

import org.aspectj.lang.annotation.Around;

public class PrinMsg implements IPrintMsg{

	
	public void sayHello1() {
		System.out.println("hello aop1!");
	}
	
	public void sayHello2() {
		System.out.println("hello aop2!");
	}

}
