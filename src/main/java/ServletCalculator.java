import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculator",urlPatterns = "/calculator")
public class ServletCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Result</h1>");
        try {
            float result = Calculator.calculator(first, second, operator);
            printWriter.println(first+ " " + operator+ " " +second+ " =" + result);
        } catch (Exception e) {
            printWriter.println("loi");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
