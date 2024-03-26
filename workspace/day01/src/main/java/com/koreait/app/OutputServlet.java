package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputServlet
 */
@WebServlet("/output")
public class OutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("output 서블릿이 실행되고 doGet()메서드가 실행되었다! ");
		
//		request는 사용자가 입력한 폼 데이터를 가지고 있다.
//		입력한 데이터를 꺼내는 방법은 getParameter("데이터이름")을 사용하면 된다.
//		데이터의 이름은 input태그의 name속성에 입력한 이름과 동일하다.
//		반환타입은 문자열이다!!!
		
		String userName = request.getParameter("userName");
		
		System.out.println(userName);
		
		String userAge = request.getParameter("userAge");
		
		System.out.println(userAge);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("Name : "+ userName +" <br>");
		out.println("Age : "+ userAge +" <br>");
		
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
