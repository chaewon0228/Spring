package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

//���� ������ �ۼ��ϴ� ��
@Component
public class TestDAO {

	//jdbcTemplate�� �ڵ�����
	//���� ������ �����ִ� ��
	@Autowired
	private JdbcTemplate db;

	//1. insert
	public void insert_data(TestBean bean) {
		//container�� �ִ� TestBean�� ��ü�� bean�� �ڵ����� �ȴ�.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}

	//2. update
	public void update_data(TestBean bean) {
		String sql = "update test set data2 = ? where data1 = ?";
		db.update(sql, bean.getData2(), bean.getData1());
	}

	//3. delete
	public void delete_data(int data1) {
		String sql = "delete from test where data1 = ?";
		db.update(sql, data1);
	}

}
