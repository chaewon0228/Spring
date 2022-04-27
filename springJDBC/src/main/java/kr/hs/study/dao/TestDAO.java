package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

//실제 쿼리를 작성하는 곳
@Component
public class TestDAO {

	//jdbcTemplate을 자동주입
	//실제 쿼리를 날려주는 애
	@Autowired
	private JdbcTemplate db;



	//1. insert
	public void insert_data(TestBean bean) {
		//container에 있는 TestBean의 객체가 bean에 자동주입 된다.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}

















}
