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
				<table width="400" align=center border=0>
					<tr>
						<td align=center colspan=2>
						<h3>購物完成,${M.getName() }這是你的訂單細目</h3>
						<hr>
					<tr>
						<td align=center width=100>A:<td align=center>${P.getA() }份
					<tr>
						<td align=center width=100>B:<td align=center>${P.getB() }份
					<tr>
						<td align=center width=100>C:<td align=center>${P.getC() }份
					<tr>
						<td colspan=2>
						<hr>
					<tr>
						<td align=center width=100>共:<td align=center>${P.getA()*150+P.getB()*120+P.getC()*100 }元
					<tr>
						<td colspan=2>
						<hr>
						宅配地址:${M.getAddress() }<br>
						連絡電話:${M.getPhone() }<br>
						<a href="porder.jsp">回購物頁</a>
				
				</table>
			
		<tr height=50>
			<td align=center><jsp:include page="/end.jsp"/>	
	
	</table>

</body>
</html>