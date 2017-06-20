<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/loginPost" method="post">
		<input type="text" name="uid" class="form-control" placeholder="USER ID">		
		<input type="password" name="upw" class="form-control" placeholder="Password"> 
		<button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
	</form>
</body>
</html>