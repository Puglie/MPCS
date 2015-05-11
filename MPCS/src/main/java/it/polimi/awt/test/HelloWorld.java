package it.polimi.awt.test;

import java.io.IOException;
import javax.servlet.*;

import javax.servlet.http.*;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.println("Hello");
		out.close();
	}
}