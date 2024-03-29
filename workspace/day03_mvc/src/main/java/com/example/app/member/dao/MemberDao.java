package com.example.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.member.dto.MemberDto;
import com.mybatis.config.MyBatisConfig;

public class MemberDao {
	private SqlSession sqlSession;
	
	public MemberDao() {
		sqlSession = MyBatisConfig.getSessionfactory().openSession(true);
	}
	
	public void join(MemberDto memberDto) {
		sqlSession.insert("member.join", memberDto);
	}
	
	public MemberDto login(MemberDto memberDto) {
		MemberDto foundMember = sqlSession.selectOne("member.login", memberDto);
		return foundMember;
	}
	
}
