<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
	<body>
		<%
			String yourname = (String)session.getAttribute("LogName");
			if(yourname == null){
		%>
		您还未登录！
		<% }else{ %>
		"<%=yourname %>" 已经登录
		<%} %>
	
	</body>

</html>