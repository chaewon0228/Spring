package kr.hs.study.beans;

public class TestBean3 {
	private DataBean3 data3;
	private DataBean3 data4;
	
	public TestBean3(DataBean3 data3, DataBean3 data4) {
		System.out.println("TestBean3의 매개변수 2개의 생성자");
		this.data3 = data3;
		this.data4 = data4;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public void setData3(DataBean3 data3) {
		this.data3 = data3;
	}

	public DataBean3 getData4() {
		return data4;
	}

	public void setData4(DataBean3 data4) {
		this.data4 = data4;
	}
}
