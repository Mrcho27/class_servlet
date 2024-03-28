package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
//	SqlSession객체를 만들기 위해서 sql 세션 팩토리가 필요하다.
	private static SqlSessionFactory sessionfactory;
	
//	팩토리는 딱 한번만 프로그램이 시작될 때 만들면 된다.
//	그러므로 static 초기화 블럭으로 생성해준다.
	static {
		try {
//			공장을 짓기위한 설계도(설정파일)의 위치를 알려줘야한다.
			String resource = "./com/mybatis/config/config.xml";
			
//			Resources 클래스를 이용하여 리소스를 읽어오고 Reader타입으로 반환한다.
//			ibatis는 mybatis의 예전버전 이름이다.(동일하다.)
			Reader reader = Resources.getResourceAsReader(resource);
			
//			빌더에게 공장을 지어달라고 한다. (build)
//			공장을 짓기 위해서 설계도가 필요하다.
//			설계도는 설정값을 가진 reader객체이다.
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
