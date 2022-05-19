package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);

		// 1. dao ������ ����
		TestDAO dao = ctx.getBean(TestDAO.class);

		//		// 2. TestBean ��ü t1 ���� 10, spring �ֱ�
		//		TestBean t1=new TestBean();
		//		t1.setData1(10);
		//		t1.setData2("spring");
		//
		//		// 3. dao�� insert_data ȣ��
		//		dao.insert_data(t1);
		//
		//		// 4. TestBean ��ü t2 ���� 20, spring2 �ֱ�
		//		TestBean t2=new TestBean();
		//		t2.setData1(20);
		//		t2.setData2("spring2");
		//
		//		// 5. dao�� insert_data ȣ��
		//		dao.insert_data(t2);
		//
		//		System.out.println("Inserted!!!");

		// update
		TestBean t3 = new TestBean();
		t3.setData1(10);
		t3.setData2("sts10");
		dao.update_data(t3);
		System.out.println("updated!!!!!!!!");

		// delete
		dao.delete_data(10);
		System.out.println("deleted!!!!!!!!");

		ctx.close();
	}

}
