import javax.servlet.*;
import java.io.IOException;

public class Loginc implements Servlet{

	public void destroy() {
		
	}
	public void init(ServletConfig arg0) throws ServletException{
		
	}
	public String getServletInfo() {
		return null;
	}
	public ServletConfig getServletConfig() {
		return null;
	}
	public void service(ServletRequest arg0,ServletResponse arg1) throws ServletException,IOException{
		
		String user=arg0.getParameter("username");
		String password=arg0.getParameter("password");
		arg1.setCharacterEncoding("GB2312");
//		arg1.setContentType("text/html;charset=GB2312");
		if(user.equals("aaa")&&password.equals("111")) {
			arg1.getWriter().println("ª∂”≠,welcome");
			
		}else {
			arg1.getWriter().println("—È÷§ ß∞‹,sorry");
		}
	}
}
