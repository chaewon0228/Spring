package kr.hs.study.beans;

public class Designer implements Employee {

	@Override
	public void Checkin() {
		System.out.println("�����̳� 7�� ���");
	}

	@Override
	public void Checkout() {
		System.out.println("�����̳� 10�� ���");
	}

}
