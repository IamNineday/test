package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InfFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		String inf = request.getParameter("inf");
		String name = request.getParameter("name");
		
		String sensitive1 = "shengsiyuan";
		String sensitive2 = "sb";
		
		System.out.println(inf);
		String text = inf.replace(sensitive1, "***");
		String n = name.replace(sensitive2, "**");
		
		request.setAttribute("text", text);
		request.setAttribute("name", n);
		chain.doFilter(request, response);
	}

	public void destroy() {

	}

}
