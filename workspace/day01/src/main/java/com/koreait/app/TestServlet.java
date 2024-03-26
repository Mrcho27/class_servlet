package com.koreait.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
// @WebServlet() 은 이 서블릿의 경로를 지정한다.
// 서버컴퓨터의 주소:포트번호/루트경로/서블릿경로 를 사용하여 요청을 보내면 해당 서블릿이 실행된다.
// www.naver.com은 DNS이다. (Domain Name Service)
// 사용자가 서버 컴퓨터의 ip주소와 포트번호를 외워서 쓰기 힘드므로 DNS를 이용한다.
// DNS는 돈주고 사야한다.

// DNS를 사용하면 자동으로 서버컴퓨터의주소:포트번호 로 변환된다.
// 우리는 돈이 없으므로 localhost:포트번호 로 사용한다.
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//    get방식으로 요청을 받았을 때 실행되는 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request는 사용자의 요청 객체 , response는 우리가 응답을 보낼때 사용하는 객체
		
//		response의 getWriter()를 사용하면 응답 객체에 데이터를 담아줄 수 있다.
//		request.getContextPath()는 서버에서 설정한 최상위(루트) 경로이다.
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		response.setContentType("text/plain; charset=utf-8");
//		response.getWriter().append("Hello World!!")
//		.append("이건 제목이다.")
//		.append("이건 문단이다.");
		
//		응답 데이터(컨텐츠)의 타입을 설정한다.
//		우리는 응답으로 html 코드를 보낼것이고 인코딩타입이 utf-8이라는 것을 설정했다.
//		ContentType : 우리가 보낼 데이터의 타입을 지정한다.
		response.setContentType("text/html; charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.append("<html>")
		.append("<head>")
		.append("</head>")
		.append("<body>")
		.append("<h1>제목입니다!!!</h1>")
		.append("</body>")
		.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
