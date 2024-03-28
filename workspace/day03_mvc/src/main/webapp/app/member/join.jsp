<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/member/join.css">
</head>
<body>
   <main>
      <form action="/member/joinOk.me" method="post">
         <div class="id">
            id : <input type="text" name="loginId" />
         </div>
         <div class="password">
            pw : <input type="password" name="password" />
         </div>
         <div class="name">
            name : <input type="text" name="name" />
         </div>
         <div class="age">
            age : <input type="text" name="age" />
         </div>
         <div class="gender">
            <div>
               남자 : <input type="radio" name="gender" value="M" />
            </div>
            <div>
               여자 : <input type="radio" name="gender" value="F" />
            </div>
         </div>
         <div class="btn">
            <button>회원가입</button>
         </div>
      </form>
   </main>
</body>
</html>