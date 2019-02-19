import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/customerdetail?id=2")
public class Customerdetail2 extends HttpServlet {
    /*public Customerdetail2() {
        super();
        // TODO Auto-generated constructor stub
    }
*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("txt/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out =resp.getWriter();
        String id = req.getParameter("2");
        out.println("Họ và tên: Trần Văn Đạt, 19 tuổi ");
    }
}
