import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/home")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("username");
        String pword=request.getParameter("password");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if(isAllowed(uname, pword)) {
            out.println("Hello admin");
        }
        else{
            response.setContentType("text/html");
            request.getRequestDispatcher("/loginWithError.html").include(request, response);
            out.close();
        }
    }
    private static boolean isAllowed(String username, String password) {
        return username.contentEquals("admin") && password.contentEquals("admin");
    }
}

