<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
var xmlHttpRequest = null;//声明一个空对象以接受xmlHttpRequest对象

function ajaxSubmit()
{
	
	//存在则为IE浏览器
	if(window.ActiveXObject)
		{
		xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
		}
	else if(window.XMLHttpRequest)//除IE外的其他浏览器
		{
		xmlHttpRequest = new XMLHttpRequest();
		}
	//get方式发送数据
/*	if(null != xmlHttpRequest)
		{
		xmlHttpRequest.open("GET", "AjaxServlet", true);
		//关联好ajax的回调函数
		xmlHttpRequest.onreadystatechange = ajaxCallBack;//千万不能有（）
		//真正向服务器发送数据
		xmlHttpRequest.send(null);
		}
	*/
	
	//post方式发送数据
	
	if(null != xmlHttpRequest)
		{
		xmlHttpRequest.open("POST", "AjaxServlet", true);
		
		//关联好ajax的回调函数
		xmlHttpRequest.onreadystatechange = ajaxCallBack;
		
		//真正向服务器端发送数据
		//使用post方式发送，必须加上如下一行
		xmlHttpRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		//<form enctype="application/x-www-form-urlencoded"></form>
		
		xmlHttpRequest.send(null);//此处填要传过去的参数（以字符串拼接的形式）
		}
	
	
	
	

}

function ajaxCallBack()
{
	if(xmlHttpRequest.readyState == 4)
		{
			if(xmlHttpRequest.status == 200)
				{
				  var responseText = xmlHttpRequest.responseText;
				  
				  document.getElementById("div1").innerHTML = responseText;
				}
		}
	
}

</script>


  </head>
  
  <body>
  
   
	<input type="button" value="get content from server" onclick="ajaxSubmit();"><br>

 	<input type="text" name="value1"><br>
	<input type="text" name="value2"><br>

	<div id="div1"></div>


  </body>
</html>
