package com.aufe.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.aufe.pojo.Flower;

public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		// 使用工厂模式
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();

		
		
		/*
		 * List<Flower> list = session.selectList("a.b.selAll"); for (Flower flower :
		 * list) { System.out.println(flower.toString()); }
		 */
		 Flower f = session.selectOne("a.b.selById", 2);
		 System.out.println(f);

		/*
		 * Map<Object, Object> map = session.selectMap("a.b.x", "name");
		 * System.out.println(map+"\n");
		 */

		
		 // int count = session.selectOne("a.b.selOne"); System.out.println(count);
		 
		session.close();
	}
}
