package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	@Autowired
	@Qualifier("d1")
	private Designer data1;
	
	@Autowired
	@Qualifier("d2")
	private Developer data2;
	
	@Autowired
	@Qualifier("d3")
	private Publisher data3;
	
	public TestBean1(Designer data1, Developer data2, Publisher data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

}
