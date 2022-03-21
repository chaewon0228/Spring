package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration
// �� ������ bean�� ������ ����ϴ� ���� �����̴�.
public class BeanConfigClass {

	// ���� �Ʒ� �޼��� ������ �ָ� bean���� ����� �����̳ʿ� ���
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	// id�� java2�� �ƴ� new�� �ٲ� (java2�� ȣ������ ����)
	@Bean(name="new")
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	@Lazy // ������ ������ ��ü�� �����
	@Scope("prototype")
	public TestBean1 java3() {
		return new TestBean1();
	}
}
