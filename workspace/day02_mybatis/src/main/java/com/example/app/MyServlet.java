package com.example.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.config.MyBatisConfig;

@WebServlet("/my-servlet")
public class MyServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		
		SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSessionfactory();
//		sql세션팩토리의 openSession()을 사용하면 sqlSession객체를 반환한다.
//		openSession()에 true를 전달해야 auto commit이 된다.
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		Map<String, String> userMap = new HashMap<>();
		userMap.put("loginId", loginId);
		userMap.put("password", password);
		userMap.put("name", name);
		userMap.put("age", age);
		userMap.put("gender", gender);
		
		sqlSession.insert("user.join",userMap);
		
		
		req.setAttribute("loginId", loginId);
		req.setAttribute("password", password);
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		req.setAttribute("gender", gender);
		
		req.getRequestDispatcher("result.jsp").forward(req,resp);
		
	}
}
