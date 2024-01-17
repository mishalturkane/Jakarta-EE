import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class MyUserDataServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
   {
 	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();

	pw.println("<html>");
	pw.println("<head><title>Form Demo</title></head>");

	pw.println("<body>");
	
	String name=req.getParameter("name");
	String gender=req.getParameter("gender");

	String [] hobbies=req.getParameterValues("hobbies");
	StringBuffer sb=new StringBuffer();
	for(StringBuffer h:hobbies){
		sb=sb.append(hobbies).append(",");
	}
	sb=sb.substring(0, sb.length()-1);
	pw.println("<b> Your Name:</b>"+name+"<br>");
	pw.println("<b> Your Gender:</b>"+gender+"<br>");
	pw.println("<b> YourHobbies:</b>"+sb);

	pw.println("</body>");
	pw.println("</html>");

	pw.close();
    }
}
