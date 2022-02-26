package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String captchaText = (String) session.getAttribute("captcha1");
		String captchainput = request.getParameter("captchaInput1");
		
		
		
		if(captchaText.equals(captchainput)) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("subhiksha")&& password.equals("123")) {
			
			response.sendRedirect("welcome.html");
		
		}

		else
			response.sendRedirect("form.html");
		
	}
	}

	
}
