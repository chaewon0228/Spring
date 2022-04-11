package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d3")
public class Publisher implements Employee{
	private String job;
	private int in;
	private int out;
	
	
	public void Checkin() {
		System.out.println(job + " " + in + "½Ã Ãâ±Ù");
	}

	public void Checkout() {
		System.out.println(job + " " + out + "½Ã Åð±Ù");
	}
	
	public Publisher(@Value("ÆÛºí¸®¼Å")String job, @Value("9")int in, @Value("16")int out) {
		this.job = job; 
		this.in = in; 
		this.out = out; 
	}
}
