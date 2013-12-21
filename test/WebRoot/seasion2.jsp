<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
	<body>
	 <%
	 	String name = request.getParameter("username");
	 	session.setAttribute("LogName",name);
	 
	 %>
	 你的名字" <%=name %>"已经写入session;
	
	<br>
	
	<a href='session3.jsp'>check</a>
	</body>

</html>