package kr.hs.study.beans;

public class Publisher implements Employee{
	@Override
	public void Checkin() {
		System.out.println("�ۺ��� 11�� ���");
	}

	@Override
	public void Checkout() {
		System.out.println("�ۺ��� 6�� ���");
	}
}
