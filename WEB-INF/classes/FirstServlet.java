import jakarta.servlet.*;  // Corrected double dot
import java.io.*;

public class FirstServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        PrintWriter pw = res.getWriter();
        pw.println("Hello, Paras");
        pw.close();  // Corrected from pw.close to pw.close();
    }

    @Override
    public void init() throws ServletException {
        // Initialization logic if needed
    }

    @Override
    public void destroy() {
        // Cleanup logic if needed
    }
}
