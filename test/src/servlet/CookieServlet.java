package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {

	private int count1;
	
	private int count2;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie cookie = new Cookie("cookieName" + count1++, "cookieValue" + count2++);
		
		cookie.setMaxAge(10);
		
		response.addCookie(cookie);
		
		Cookie[] cookies = request.getCookies();
		
		if(null == cookies)
		{
			return;
		}
		for(Cookie c : cookies)
		{
			System.out.println("cookie name " + c.getName());
			System.out.println("cookie value" + c.getValue());
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
