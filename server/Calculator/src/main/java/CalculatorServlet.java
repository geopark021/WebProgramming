
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
response.setContentType("text/html;charset=UTF-8"); // 클라이언트에게 보낼 컨텐츠의 타입지정
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int IntNum1 = Integer.parseInt(num1);
		int IntNum2 = Integer.parseInt(num2);
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD></HEAD>");
		out.println("<BODY>");
		out.println("ADD = " + (IntNum1 + IntNum2) + "<br>");
		out.println("SUB = " + (IntNum1 - IntNum2) + "<br>");
		out.println("MUL = " + (IntNum1 * IntNum2) + "<br>");
		out.println("DIV = " + (IntNum1 / IntNum2) + "<br>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
