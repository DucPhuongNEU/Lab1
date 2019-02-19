import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/customerdetail?id=3")
public class customerdetail3 extends HttpServlet {
    public customerdetail3() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("txt/html");
        resp.setCharacterEncoding("UTF-8");
        String id = req.getParameter("3");
        PrintWriter out =resp.getWriter();
        out.print("Họ và tên: Downg Thị Minh Hằng, 18 tuổi");
    }
}
