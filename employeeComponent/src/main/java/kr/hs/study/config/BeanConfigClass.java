package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class BeanConfigClass {

	
}
