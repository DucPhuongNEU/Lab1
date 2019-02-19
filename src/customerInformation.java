import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns ="/customerdetail?id=1")
public class customerInformation extends HttpServlet {
/*
    public customerInformation() {
        super();
        // TODO Auto-generated constructor stub
    }
*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       /* protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String codeSP = req.getParameter("id");



            resp.sendRedirect("./Customer?id=1");
        }

        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String codeSP = req.getParameter("id");
            Customerdetail c = new Customerdetail();
            c.setid(id);
        */
        resp.setContentType("txt/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out =resp.getWriter();
        String id = req.getParameter("1");
        out.println("Họ và tên: Phạm Văn Thanh, 22 tuổi ");

    }
}

