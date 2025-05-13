import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/visitCounter")
public class VisitCounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer visitCount = (Integer) context.getAttribute("visitCount");
        
        if (visitCount == null) {
            visitCount = 0;
        }
        
        context.setAttribute("visitCount", visitCount);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}