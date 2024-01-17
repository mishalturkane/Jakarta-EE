import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;

public class DigitalClockServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Digital Clock</title>");
        pw.println("<script>");
        pw.println("function displayTime() {");
        pw.println("    let date = new Date();");
        pw.println("    let hours = date.getHours();");
        pw.println("    let minutes = date.getMinutes();");
        pw.println("    let seconds = date.getSeconds();");
        pw.println("    let time = hours + ':' + minutes + ':' + seconds;");
        pw.println("    document.getElementById('clock').innerText = time;");
        pw.println("    setTimeout(displayTime, 1000);"); // Update every second
        pw.println("}");
        pw.println("displayTime();"); // Initial call to start displaying time
        pw.println("</script>");
        pw.println("</head>");

        pw.println("<body>");
        pw.println("<h1>Digital Clock</h1>");
        pw.println("<p id='clock'></p>"); // Element to display the time
        pw.println("</body>");

        pw.println("</html>");

        pw.close();
    }
}
