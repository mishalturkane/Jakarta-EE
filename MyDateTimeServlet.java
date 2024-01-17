import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
public class MyClientInfoServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
   {
 	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();

	pw.println("<html>");
	pw.println("<head><title>Client Details</title>  <style> h2{color: red;} </style> </head>");

	pw.println("<body>");
	pw.println("<p>Current data and time:</p>");

	 // Get the current date and time
        Date today = new Date();
        
        // Display the current date and time within an h2 tag
	pw.println("<h2>" + today + "</h2>");

	pw.println("</body>");
	pw.println("</html>");

	pw.close();
    }
}
