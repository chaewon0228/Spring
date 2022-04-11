package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class BeanConfigClass {
	
}
