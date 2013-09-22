package kz.sayan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kz.sayan.entity.User;
import kz.sayan.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login check start");
		String login = request.getParameter("name");
		String password = request.getParameter("password");	
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(login, password);
		if(result){
			User user = loginService.getUser(login);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success");
			dispatcher.forward(request, response);
			return;
		}
		else{
			response.sendRedirect("");	
		}
	}

}
