package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public interface Employee {
	public void Checkin();
	public void Checkout();
}
