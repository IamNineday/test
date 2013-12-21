package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContentextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("destoryed" + sce.getServletContext());
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("initialized" + sce.getServletContext());
	}

}
