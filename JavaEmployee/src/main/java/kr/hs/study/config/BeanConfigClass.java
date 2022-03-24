package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;


@Configuration
public class BeanConfigClass {

	@Bean
	public Designer d1() {
		return new Designer("디자이너", 7, 10);
	}
	@Bean
	public Developer d2() {
		return new Developer("개발자", 10, 7);
	}
	@Bean
	public Publisher d3() {
		return new Publisher("퍼블리셔", 11, 6);
	}
}
