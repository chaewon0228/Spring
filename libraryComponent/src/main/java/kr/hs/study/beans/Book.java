package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public interface Book {
	public void buy();
	public void sell();
	public void create();
	public void pr();
}
