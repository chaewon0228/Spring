package kr.hs.study.beans;

public class Designer implements Employee {
	private String job;
	private int in;
	private int out;
	
	public void Checkin() {
		System.out.println(job + " " + in + "시 출근");
	}

	public void Checkout() {
		System.out.println(job + " " + out + "시 퇴근");
	}

	public Designer(String job, int in, int out) {
		this.job = job; 
		this.in = in; 
		this.out = out; 
	}
	public Designer() {
		
	}
}
