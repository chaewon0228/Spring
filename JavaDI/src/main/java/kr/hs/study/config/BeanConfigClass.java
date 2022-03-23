package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean4;


@Configuration
// 이 파일은 bean을 만들라고 명령하는 설정 파일이다.
public class BeanConfigClass {

	// 나는 아래 메서드 실행한 애를 bean으로 만들어 컨테이너에 등록
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
