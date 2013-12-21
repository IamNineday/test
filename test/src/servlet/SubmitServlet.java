package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubmitServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String rePassword = req.getParameter("rePassword");
		int age = Integer.parseInt(req.getParameter("age"));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(password.equals( rePassword))
			if(age > 18)
			{
				out.println("<html><head><title> congratulations: successful submit!</title></head>");
				out.println("<body>username "+ username +" have been successful submit!</body></html>");
				
			}
			else{
				out.println("<html><head><title>Forbiden</title></head>");
				out.println("<body>under 18 are not allowed to submit!</body></html>");
				
			}
		else
		{
			out.println("<html><head><title>Error</title></head>");
			out.println("<body>the passwords you insert are not the same!</body></html>");
		}
		out.flush();
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
