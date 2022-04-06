package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class testBean1 {
	
	@Autowired
	private dataBean1 data1;
	
	@Autowired
	private dataBean2 data2;
	
	
	public dataBean1 getData1() {
		return data1;
	}
	public dataBean2 getData2() {
		return data2;
	}
	
	public testBean1() {
		
	}
	
	
}
