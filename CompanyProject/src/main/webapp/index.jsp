<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=500 align=center border=1>
		<tr height=100>
			<td align=center><jsp:include page="title.jsp"/>
		<tr height=400>
			<td >
			
			<!-- 巢狀表格 -->
			
			<form action="LoginController" method="post">
				<table width=400 align=center >
					<tr>
						<td align=center><h4>登入</h4>
					<tr>
						<td align="center">
						帳號:<input type="text" name="username"><br>
						密碼:<input type="password" name="password"><br>
					<tr>
						<td align="center">
							<input type="submit" value="確定">
							<a href="addMember.jsp">註冊</a>			
				</table>
			</form>	
			
			
			
			
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"/>	
	
	</table>
	
</body>
</html>