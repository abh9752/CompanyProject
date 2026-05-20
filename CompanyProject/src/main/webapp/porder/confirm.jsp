<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="entity.Member"
    import="entity.Porder"%>
<%
Member member=(Member)session.getAttribute("M");
int A=Integer.parseInt(request.getParameter("a"));
int B=Integer.parseInt(request.getParameter("b"));
int C=Integer.parseInt(request.getParameter("c"));

Porder porder=new Porder(member.getName(),A,B,C);

session.setAttribute("P", porder);

%>
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
			${P.getName() }這是你的訂單<br>
			A:${P.getA() }(150)<br>
			B:${P.getB() }(120)<br>
			C:${P.getC() }(100)<br>
			<hr>
			共:${P.getA()*150+P.getB()*120+P.getC()*100 }元<br>
			<a href="addPorder.jsp">上一頁</a><br>
			<a href="../AddPorderController">確定</a>
			
		<tr height=50>
			<td align=center><jsp:include page="/end.jsp"/>	
	
	</table>

</body>
</html>