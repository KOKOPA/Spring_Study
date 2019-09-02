<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("loginchk").hide();
	});	
	function login() {
		var idVal = $("input[name=id]").val();
		var pwVal = $("input[name=pw]").val();
		
		alert(idVal + " : " + pwVal);
		
		if(idVal == "" || idVal == null) {
			alert("ID를 다시한번 확인해 주세요.");
		}else if(pwVal == "" || pwVal == null) {
			alert("PW를 다시한번 확인해 주세요.");
		}else {
			$("#loginchk").show();
			
			$.ajax({
				type : "post",
				url : "loginajax.do",
				data : "id=" + idVal + "&pw=" + pwVal,
				success : function(msg) {
					alert(msg);
					if(msg.loginchk == true) {
						location.href = "list.do";
					}else {
						document.getElementById("loginchk").innerHTML = "ID 혹은 PW를 다시한번 확인해 주세요!";
					}
				},
				error : function() {
					alert("로그인 실패!");
				}
			});
		}
	}
</script>
</head>
<body>

	<h1>login</h1>

	<form action="" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="text" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="login" onclick="login()"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" id="loginchk"></td>
			</tr>
		</table>
	</form>	
	
</body>
</html>