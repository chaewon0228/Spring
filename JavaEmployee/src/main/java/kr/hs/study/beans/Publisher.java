package kr.hs.study.beans;

public class Publisher implements Employee{

	private String job;
	private int in;
	private int out;
	
	
	@Override
	public void Checkin() {
		System.out.println(job + " " + in + "�� ���");
	}

	@Override
	public void Checkout() {
		System.out.println(job + " " + out + "�� ���");
	}
	
	public Publisher(String job, int in, int out) {
		this.job = job; 
		this.in = in; 
		this.out = out; 
	}
	public Publisher() {
		
	}
}
