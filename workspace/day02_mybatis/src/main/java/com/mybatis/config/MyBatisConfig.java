package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory sessionfactory;
	
	static {
		try {
			String resource = "./com/mybatis/config/config.xml";
			
			Reader reader = Resources.getResourceAsReader(resource);
			
			sessionfactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			System.out.println("MyBatisConfig.java 초기화 문제 발생!");
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
	
}
