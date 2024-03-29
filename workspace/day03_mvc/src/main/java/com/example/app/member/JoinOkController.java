package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.member.dao.MemberDao;
import com.example.app.member.dto.MemberDto;

public class JoinOkController implements Execute{
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDto memberDto = new MemberDto();
    	memberDto.setLoginId(req.getParameter("loginId"));
    	memberDto.setPassword(req.getParameter("password"));
    	memberDto.setName(req.getParameter("name"));
    	memberDto.setGender(req.getParameter("gender"));
    	memberDto.setAge(Integer.parseInt(req.getParameter("age")));
    	
    	
    	MemberDao memberDao = new MemberDao();
    	memberDao.join(memberDto);
	}

}
