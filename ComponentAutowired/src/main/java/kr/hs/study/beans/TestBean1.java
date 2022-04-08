package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TestBean1 {
	@Autowired
	private DataBean1 data1;
	@Autowired
	private DataBean2 data2;
	
	@Autowired
	@Qualifier("obj3") //멤버변수에 이름을 주는 것임, component는 클래스 밖에서 선언 / 이름이 obj3인 객체를 가져와서 주입해라
	private DataBean3 data3;
	
	public TestBean1(DataBean1 data1, DataBean2 data2, DataBean3 data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	public DataBean3 getData3() {
		return data3;
	}
	
}
