<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Index Page</h1>
	<h1>회원가입</h1>
   <form action="/mybatis/my-servlet">
      아이디 : <input type="text" name="loginId">
      <br>
      비밀번호 : <input type="password" name="password">
      <br>
      이름 : <input type="text" name="name">
      <br>
      나이 : <input type="text" name="age">
      <br>
      성별 : 
      선택안함 <input type="radio" name="gender" value="N" checked>
      남 <input type="radio" name="gender" value="M">
      여 <input type="radio" name="gender" value="F">
      <br>
      <button>회원가입</button>
   </form>
</body>
</html>