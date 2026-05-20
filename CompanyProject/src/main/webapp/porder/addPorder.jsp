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
			<td align=center><jsp:include page="/title.jsp"/>
		<tr height=400>
			<td>
			<form action="confirm.jsp" method="post">
				<table width="350" align=center>
					<tr>
						<td align=center>
						<h3>${M.getName() }歡迎</h3>
						<hr>
						
					<tr>
						<td align=center>
						A:<input type="text" name="a"><br>
						B:<input type="text" name="b"><br>
						C:<input type="text" name="c"><br>
					<tr>
						<td align=center>
					<hr>
					<input type="submit" value="ok">
				</table>
			
			
			</form>
			
		<tr height=50>
			<td align=center><jsp:include page="/end.jsp"/>	
	
	</table>

</body>
</html>