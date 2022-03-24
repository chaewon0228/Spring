package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;


@Configuration
public class BeanConfigClass {

	@Bean
	public novel b1() {
		return new novel("kim", "kikiki", 1000);
	}
	@Bean
	public poet b2() {
		return new poet("lee", "lalala", 2000);
	}
	@Bean
	public magazine b3() {
		return new magazine("park", "parking", 3000);
	}
}
