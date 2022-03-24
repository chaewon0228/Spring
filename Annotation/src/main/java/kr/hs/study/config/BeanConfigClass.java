package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;

@Configuration
public class BeanConfigClass {
	
@Bean
public TestBean2 java1() {
	return new TestBean2();
}
@Bean
public DataBean2 java2() {
	return new DataBean2();
}
}
