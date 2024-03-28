package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.example.app.member.dto.MemberDto;
import com.mybatis.config.MyBatisConfig;

@WebServlet("*.me")
public class MemberFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Member 프론트 컨트롤러 실행!!!");
		
//		URL 루트 경로를 확인
//		System.out.println(req.getContextPath());
		
//		현재 요청의 URI를 확인
//		System.out.println(req.getRequestURI());
		
	    String target = req.getRequestURI().substring(req.getContextPath().length());
	    System.out.println(target);
	    
	    switch(target) {
	    case "/member/join.me":
	    	System.out.println("join!!");
	    	req.getRequestDispatcher("/app/member/join.jsp").forward(req, resp);
	    	break;
	    case "/member/joinOk.me":
	    	System.out.println("joinOk!!");
	    	
	    	MemberDto memberDto = new MemberDto();
	    	memberDto.setLoginId(req.getParameter("loginId"));
	    	memberDto.setPassword(req.getParameter("password"));
	    	memberDto.setName(req.getParameter("name"));
	    	memberDto.setGender(req.getParameter("gender"));
	    	memberDto.setAge(Integer.parseInt(req.getParameter("age")));
	    	
	    	
	    	SqlSession sqlSession = MyBatisConfig.getSessionfactory().openSession(true);
	    	sqlSession.insert("member.join", memberDto);
	    	
	    	resp.sendRedirect("/");
	    	break;
	    case "/member/login.me":
	    	req.getRequestDispatcher("/app/member/login.jsp").forward(req, resp);
	    	break;
	    case "/member/loginOk.me":
	    	break;
	    }
	    
	}
}

















