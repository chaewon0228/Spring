package kr.hs.study.advisor;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("Advice의 Before 메서드");
	}
	
	public void afterMethod() {
		System.out.println("Advice의 after 메서드");
	}

}
