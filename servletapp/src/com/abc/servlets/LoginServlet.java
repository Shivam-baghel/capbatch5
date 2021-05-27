package com.abc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><body bgcolor='cyan'>");
//		
//		if(uname.equals("admin") && pwd.equals("123")) {
//			
//			out.println("<h2>Welcome Admin</h2>");
//		}
//		else {
//			out.println("<h2>Login failed</h2>");
//		}
//		
//		out.println("</body></html>");
//		out.close();	
		
		
		if(uname.equals("admin") && pwd.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.jsp");
			rd.forward(request, response);			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("loginfailure.jsp");
			rd.forward(request, response);
		}		
		
	}

}
