package kr.hs.study.beans;

public class Developer implements Employee{
	@Override
	public void Checkin() {
		System.out.println("������ 10�� ���");
	}

	@Override
	public void Checkout() {
		System.out.println("������ 7�� ���");
	}
}
