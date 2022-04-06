package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class testBean2 {
	
	@Autowired
	@Qualifier("xml2")
	private dataBean1 data1;
	
	@Autowired
	@Qualifier("xml3") // �̸����� �ڵ�����
	private dataBean2 data2;
	
	public dataBean1 getData1() {
		return data1;
	}
	public dataBean2 getData2() {
		return data2;
	}
}
