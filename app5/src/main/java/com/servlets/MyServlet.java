package com.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login",name="loginServlet")
public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  System.out.println("First servlet");
		  var writer = resp.getWriter();
		  writer.println("<h1>Printing from the server</h1>");
		  String greeting = "Hello";
		  writer.println(greeting);
	}
}
