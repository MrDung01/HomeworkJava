import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web application started at " + new java.util.Date());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web application stopped at " + new java.util.Date());
    }
}