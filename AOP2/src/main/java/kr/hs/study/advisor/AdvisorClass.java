package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void adviceMethod() {
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
		pjp.proceed(); // ���� �ٽ� �޼��� ����
		System.out.println("��� advice Ⱦ�ܰ��ɻ�");
	}
}
