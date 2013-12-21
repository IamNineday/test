package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String> result = new ArrayList<String>();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(null == username || "".equals("username") || username.length() < 4 || username.length() > 10)
		{
			result.add("用户名必须为4～10位！");
		}
		if(null == password || "".equals(password) || password.length() < 4 || password.length() > 10)
		{
			result.add("密码必须为4～10位");
		}
		if(null == request.getParameterValues("sex"))
		{
			result.add("请选择性别");
		}
		if(null == request.getParameterValues("hobby") || request.getParameterValues("hobby").length > 3)
		{
			result.add("兴趣只能选择1～3个");
		}
		if (null == request.getParameter("info") || "".equals(request.getParameter("info")))
		{
			result.add("说明不能为空！");
		}
		
		if(result.isEmpty())
		{
			request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("error", result);
			request.getRequestDispatcher("loginError.jsp").forward(request, response);
		}

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
