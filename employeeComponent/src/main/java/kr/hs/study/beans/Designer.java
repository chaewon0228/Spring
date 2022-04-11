package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d1")
public class Designer implements Employee {

	private String job;
	private int in;
	private int out;
	
	public void Checkin() {
		System.out.println(job + " " + in + "�� ���");
	}

	public void Checkout() {
		System.out.println(job + " " + out + "�� ���");
	}
	
	public Designer(@Value("�����̳�")String job, @Value("10")int in, @Value("16")int out) {
		this.job = job; 
		this.in = in; 
		this.out = out; 
	}
}
