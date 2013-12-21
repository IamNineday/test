<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test1ForwordTo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table border="1" align="center">
    <%
    int row = Integer.parseInt(request.getParameter("row"));
    int col = Integer.parseInt(request.getParameter("col"));
    for(int i=0; i< row; i++){
    %>
    <tr>
   <% for(int j=0; j<col; j++){ %>
   <td>a</td>
    <%} %>
    </tr>
    <%} %>
 
    </table>
    
 
  </body>
</html>
