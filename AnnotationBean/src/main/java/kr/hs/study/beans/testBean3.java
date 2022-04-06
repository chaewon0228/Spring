package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class testBean3 {
	private int data1;
	private String data2;
	private dataBean3 data3;
	private dataBean4 data4;
	
	// �ڵ����� autowired �����
	public testBean3(dataBean3 data3, dataBean4  data4) {
		this.data3 = data3;
		this.data4 = data4;
	}
	
	// @���� �ʱ�ȭ ��Ű�� ������̼�
	public testBean3(@Value("100") int data1, @Value("spring1111") String data2, dataBean3 data3, dataBean4  data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public testBean3() {}
	
	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public dataBean3 getData3() {
		return data3;
	}

	public dataBean4 getData4() {
		return data4;
	}
	
}
