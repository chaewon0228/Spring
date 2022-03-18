package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml�� ���Ұ� ���� (bean ��ü ����)'

@Configuration // (�� ������ spring ��ü ���� ���� �����̴�. �˷���)
public class BeanClassConfiguration {
	
	// <bean id="t1" class="kr.hs.study.beans.TestBean1"/>
	
	// �� �Ʒ����� �޼��带 �����ؼ� ��ü�� ������
	@Bean
	public TestBean1 java1() { 
		// id�� java1�̴�.
		TestBean1 t1 = new TestBean1();
		return t1; // t1 ��ü ����
	}
	
	@Bean
	public TestBean1 java2() { 
		// id�� java1�̴�.
		TestBean1 t2 = new TestBean1();
		return t2; // t2 ��ü ����
	}
}
