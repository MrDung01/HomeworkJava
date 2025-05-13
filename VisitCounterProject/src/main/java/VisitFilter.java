import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class VisitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Khởi tạo filter
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();
        ServletContext context = request.getServletContext();
        
        // Kiểm tra xem người dùng đã truy cập trước đó chưa
        Boolean hasVisited = (Boolean) session.getAttribute("hasVisited");
        
        if (hasVisited == null || !hasVisited) {
            // Người dùng mới, tăng bộ đếm
            Integer visitCount = (Integer) context.getAttribute("visitCount");
            if (visitCount == null) {
                visitCount = 0;
            }
            visitCount++;
            context.setAttribute("visitCount", visitCount);
            session.setAttribute("hasVisited", true);
        }
        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Hủy filter
    }
}