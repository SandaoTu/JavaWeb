package day2;
import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet{
	public void destroy() {
		
	}
	public void  init(ServletConfig arg0) throws ServletException{
		
	}
	public ServletConfig getServletConfig() {
		
		return null;
	}
	public String getServletInfo() {
		return null;
	}
	public void service(ServletRequest arg0,ServletResponse arg1) throws ServletException,IOException{
		arg1.getWriter().println("this is ss my firstServlet");
		
	}
	
	
	
}