package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserValidationService userValidationService = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		if(userValidationService.isValid(name, pwd)) {
			request.setAttribute("name", name);
			request.setAttribute("pwd", pwd);
			request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("errormsg", "Something wrong happen");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);;
		}
		
	}

}
