package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

@Component
public class BeanConfigClass {

	@Bean
	public Test java1() {
		Person p1 = new Person("kim", 19, "π‰");
		Person p2 = new Person("yun", 19, "∏∂∂Û≈¡");
		
		Test t1 = new Test(p1, p2);
		return t1;
	}
}
