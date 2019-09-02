<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원 등록</h1>
	
	<form action="insertres.do" method="post">
		<table border="1">
			<tr>
				<th>id</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>password</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<th>name</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록">
					<input type="button" value="목록" onclick="location.href='list.do'">
				</td>
			</tr>
		</table>	
	</form>

</body>
</html>