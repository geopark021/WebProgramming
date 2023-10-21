
import java.io.PrintWriter; 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTestClass
 */
// @WebServlet("/LoginTestClass") 어노테이션 주석처리 url 매핑 중복때문
public class LoginTestClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginTestClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("mylogin.do");

		
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("id"); // name이 id인 것의 값을 가져온다.
		String pwd = request.getParameter("pwd"); // name이 pwd 속성의 값을 가져온다.
		
		
		PrintWriter out = response.getWriter(); 
		
		// 응답의 body로 보낼 html문서
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		if(id.equals("hong")&& pwd.equals("1234")) {
			//response.sendRedirect("mylogin.html");
			out.println(id + "님이 들어옴 ");
		} else {
			
			out.println("아이디 또는 비밀번호를 다시 확인하세요.");
		}
		out.println("</body>");
		out.println("</html>");
		
	}

}
