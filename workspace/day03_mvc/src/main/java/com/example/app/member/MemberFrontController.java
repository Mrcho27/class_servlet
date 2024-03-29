package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	    	
	    	new JoinOkController().execute(req, resp);
	    	
	    	resp.sendRedirect("/");
	    	break;
	    case "/member/login.me":
	    	HttpSession session = req.getSession();
	    	Integer memberId = (Integer)session.getAttribute("memberId");
	    	
	    	if(memberId != null) {
	    		resp.sendRedirect("/");
	    		break;
	    	}
	    	
	    	new LoginController().execute(req,resp);
	    	req.getRequestDispatcher("/app/member/login.jsp").forward(req, resp);
	    	break;
	    case "/member/loginOk.me":
	    	new LoginOkController().execute(req, resp);
	    	
	    	resp.sendRedirect("/");
	    	break;
	    }
	    
	}
}

















