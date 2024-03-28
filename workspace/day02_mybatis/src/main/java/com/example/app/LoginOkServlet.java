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

import com.mybatis.config.MyBatisConfig;

@WebServlet("/login-ok")
public class LoginOkServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		
		System.out.println(loginId);
		System.out.println(password);
		
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("loginId", loginId);
		userMap.put("password", password);
		
		SqlSession sqlSession = MyBatisConfig.getSessionfactory().openSession(true);
		int userId = sqlSession.selectOne("user.login", userMap);
		
		System.out.println(userId);
	}
}
