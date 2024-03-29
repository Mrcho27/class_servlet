package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.member.dao.MemberDao;
import com.example.app.member.dto.MemberDto;

public class LoginOkController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = new MemberDto();
		MemberDto result = null;
		
		memberDto.setLoginId(req.getParameter("loginId"));
		memberDto.setPassword(req.getParameter("password"));
		result = memberDao.login(memberDto);
		
		HttpSession session = req.getSession();
		session.setAttribute("memberId", result.getMemberId());
		session.setAttribute("name", result.getName());
		
		Cookie cookie = new Cookie("loginId", req.getParameter("loginId"));
		cookie.setMaxAge(60*10);
		
		resp.addCookie(cookie);
		
		System.out.println(result);
	}
}
