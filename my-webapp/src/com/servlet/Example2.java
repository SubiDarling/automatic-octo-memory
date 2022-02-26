package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example2
 */
@WebServlet("/Example2")
public class Example2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/vnd.ms-excel"); // telling the client which type of response  given t the client --MIME\\
		PrintWriter out = response.getWriter();
		
		out.println("EMPNO\tName\tSalary");
		out.println("100\tsubi\t234567");
		out.println("101\tyespee\t122222");
		
		
	}


}
