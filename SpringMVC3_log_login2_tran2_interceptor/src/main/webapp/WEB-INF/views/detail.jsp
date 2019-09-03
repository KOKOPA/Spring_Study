<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>고객 정보</h1>
	
	<form action="update.do" method="post">
	<input type="hidden" name="id" value="${dto.id }">
		<table border="1">
			<tr>
				<th>ID</th><td>${dto.id }</td>
			</tr>
			<tr>
				<th>PASSWORD</th><td>${dto.password }</td>
			</tr>
			
			<tr>
				<th>이름</th><td>${dto.name }</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					<input type="button" value="삭제" onclick="location.href='delete.do?id=${dto.id}'">
					<input type="button" value="목록" onclick="location.href='list.do'">
				</td>
			</tr>

		</table>
	</form>

</body>
</html>