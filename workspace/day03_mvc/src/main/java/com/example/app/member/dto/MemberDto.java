package com.example.app.member.dto;

import javax.servlet.annotation.WebServlet;


public class MemberDto{
	private int memberId;
	private String loginId;
	private String password;
	private String name;
	private int age;
	private String gender;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", loginId=" + loginId + ", password=" + password + ", name=" + name
				+ ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}   
