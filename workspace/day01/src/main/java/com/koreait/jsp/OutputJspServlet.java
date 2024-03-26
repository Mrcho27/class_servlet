package com.koreait.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/output-jsp")
public class OutputJspServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId = req.getParameter("loginId");
		String email = req.getParameter("email");
		
		String result1 =loginId + "님";
		
//		사용자가 보낸 데이터를 꺼내 쓸 때 getParameter를 사용한다.
//		우리가 화면에 보내줄 데이터를 저장할 때 setAttribute를 사용한다.
//		jsp에서는 데이터를 꺼내서 사용할 때 getAttribute를 사용한다.
		req.setAttribute("loginId", result1);
		req.setAttribute("email", email);
		
		
//		req.getRequestDispatcher("jsp파일 경로").forward(req, resp);
//		다른 서블릿이나 jsp로 요청과 응답객체를 전달한다.
//		forward()에 request와 response 객체를 넘겨주므로
//		사용자가 입력한 데이터를 request가 유지한 상태로 전달된다.
//		그 데이터를 jsp파일에서 꺼내 사용할 수 있다.
		req.getRequestDispatcher("/output.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
