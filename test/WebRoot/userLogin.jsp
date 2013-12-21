<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'userLogin.jsp' starting page</title>

<script type="text/javascript">
		function loginCheck()
		{
			var username = document.getElementsByName("username")[0];
			var password = document.getElementsByName("password")[0];
			
			if(null == username.value || "" == username.value || username.value.length < 4 || username.value.length > 10)
				{
					alert("用户名长度必须为4～10之间！");
					return false;
				}
			if(null == password.value || "" == password.value || password.value.length <4 || password.value.length > 10)
				{
				 	alert("密码长度在4～10之间！");
				 	return false;
				}
			var male = document.getElementById("male");
			var famale = document.getElementById("female");
			
			if(!male.checked && !female.checked)
				{
					alert("请选择性别！");
					return false;
				}
			var hobby = document.getElementsByName("hobby");
			if((hobby[0].checked && hobby[1].checked && hobby[2].checked && hobby[3].checked)|| (!hobby[0].checked && !hobby[1].checked && !hobby[2].checked && !hobby[3].checked))
			  {
				alert("兴趣只能选择1～3个！");
				return false;
			  }
			var info = document.getElementsByName("info")[0];
			if(null == info.value || "" == info.value)
				{
					alert("说明不能为空！");
					return false;
				}
			return true;
		}
	
	
	</script>

</head>

<body>

	<form onsubmit=" return loginCheck()" action="LoginCheckServlet">
		用户名： <input type="text" name="username" id="username" ><br>
		密 码: <input type="text" name="password" id="password"><br>
		性 别： 男 <input type="radio" name="sex" id="male" value="男"> 
			 女<input type="radio" name="sex" id="female" value="女"><br> 
		兴 趣： 
			足球 <input type="checkbox" name="hobby" value="足球"> 
			篮球<input type="checkbox"name="hobby" value="篮球"> 
			排球<input type="checkbox" name="hobby" value="排球">
			羽毛球<input type="checkbox" name="hobby"value="羽毛球"><br> 
		地 址： <select name="address">
			<option value="shanghai" selected="selected">上海</option>
			<option value="beijing">北京</option>
			<option value="guangzhou">广州</option>
		</select><br> 
		说 明：
		<textarea cols="50" rows="8" name="info" ></textarea>
		<br> <input type="submit" value="submit">&nbsp;&nbsp;&nbsp;
		<input type="reset" value="reset">

	</form>
</body>
</html>
