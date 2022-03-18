package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml의 역할과 동일 (bean 객체 생성)'

@Configuration // (이 파일은 spring 객체 생성 설정 파일이다. 알려줌)
public class BeanClassConfiguration {
	
	// <bean id="t1" class="kr.hs.study.beans.TestBean1"/>
	
	// 이 아래나온 메서드를 실행해서 객체를 생성해
	@Bean
	public TestBean1 java1() { 
		// id는 java1이다.
		TestBean1 t1 = new TestBean1();
		return t1; // t1 객체 생성
	}
	
	@Bean
	public TestBean1 java2() { 
		// id는 java1이다.
		TestBean1 t2 = new TestBean1();
		return t2; // t2 객체 생성
	}
}
