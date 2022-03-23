package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean4;


@Configuration
// �� ������ bean�� ������ ����ϴ� ���� �����̴�.
public class BeanConfigClass {

	// ���� �Ʒ� �޼��� ������ �ָ� bean���� ����� �����̳ʿ� ���
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4(100, "spring4", new DataBean4());
		return t4;
	}
	
	@Bean
	public TestBean4 java5() {
		TestBean4 t5 = new TestBean4();
		t5.setData1(200);
		t5.setData2("spring5");
		t5.setData4(new DataBean4());
		return t5;
	}
}
