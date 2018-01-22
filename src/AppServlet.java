import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/app")
public class AppServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname=request.getParameter("username");
        out.print("Hello, my dear "+ uname);
        out.close();
    }
}
