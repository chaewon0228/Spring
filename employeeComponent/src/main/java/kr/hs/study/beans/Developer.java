package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d2")
public class Developer implements Employee{
	private String job;
	private int in;
	private int out;
	
	public void Checkin() {
		System.out.println(job + " " + in + "시 출근");
	}

	public void Checkout() {
		System.out.println(job + " " + out + "시 퇴근");
	}
	
	public Developer(@Value("개발자")String job, @Value("9")int in, @Value("18")int out) {
		this.job = job; 
		this.in = in; 
		this.out = out; 
	}
}
