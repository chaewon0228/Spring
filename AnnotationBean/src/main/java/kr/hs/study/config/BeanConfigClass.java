package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.dataBean1;
import kr.hs.study.beans.dataBean2;
import kr.hs.study.beans.dataBean3;
import kr.hs.study.beans.dataBean4;
import kr.hs.study.beans.testBean1;
import kr.hs.study.beans.testBean2;
import kr.hs.study.beans.testBean3;

@Configuration
public class BeanConfigClass {

	@Bean(name="xml2")
	public dataBean1 java1() {
		dataBean1 d1 = new dataBean1();
		return d1;
	}
	@Bean(name="xml3")
	public dataBean2 java2() {
		dataBean2 d2 = new dataBean2();
		return d2;
	}
	
	@Bean
	public testBean1 java3() {
		testBean1 d3 = new testBean1();
		return d3;
	}
	
	@Bean
	public testBean2 java4() {
		testBean2 t2 = new testBean2();
		return t2;
	}
	
	@Bean
	public testBean3 java5() {
		dataBean3 d3 = new dataBean3();
		dataBean4 d4 = new dataBean4();
		
		testBean3 t3 = new testBean3(d3, d4);
		return t3;
	}
}
