package com.servlets;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var writer = resp.getWriter();
		writer.println("<h1>Thi is the second servlet</h1>");
		writer.println(new Date().toString());
		
	}
}
