package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;

@Configuration
// 이 파일은 bean을 만들라고 명령하는 설정 파일이다.
public class BeanConfigClass {

	// 나는 아래 메서드 실행한 애를 bean으로 만들어 컨테이너에 등록
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	// id를 java2가 아닌 new로 바꿈 (java2로 호출하지 못함)
	@Bean(name="new")
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	@Lazy // 생성할 때마다 객체도 만들어
	@Scope("prototype")
	public TestBean1 java3() {
		return new TestBean1();
	}
	
	@Bean(name="test")
	@Lazy
	@Scope("prototype")
	public TestBean3 t1() {
		return new TestBean3();
	}
	@Bean
	public TestBean3 t2() {
		return new TestBean3();
	}
}
