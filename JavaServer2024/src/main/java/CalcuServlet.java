

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcuServlet
 */
@WebServlet("/calcuServlet")
public class CalcuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: CalcuServlet ").append(request.getContextPath());
		Integer n1 = Integer.parseInt(request.getParameter("n1"));
		Integer n2 = Integer.parseInt(request.getParameter("n2"));
		String op = request.getParameter("op");
		
		Integer result = 0;
		
	
		switch(op) {
		case "+": result = n1 + n2; break;
		case "-": result = n1 - n2; break;
		case "*": result = n1 * n2; break;
		case "/": result = n1 / n2; break;
		}
		
		if(n1 < 200) {
			// 비교를 위해 n1 200을 기준으로 삼음
			// 직접 html 페이지를 그림
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.append("<html><body><h2> 계산기 서블릿 결과화면  </h2><hr>")
			.append("/javaserver2024/src/main/java/ch06/CalcServlet.java <br>")
			.append("계산결과: " + n1 + op + n2 + "==servlet==>" +  result )
			.append("</body></html>");
			
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

		
	
	



