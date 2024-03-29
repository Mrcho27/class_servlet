<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/member/login.css">
</head>
<body>
	 <main>
      <form action="/member/loginOk.me" method="post">
         <div class="id">
            id : <input type="text" name="loginId" value="${loginId} }"/>
         </div>
         <div class="password">
            pw : <input type="password" name="password" />
         </div>
         
         <div class="btn">
            <button>로그인</button>
         </div>
      </form>
   </main>
</body>
</html>