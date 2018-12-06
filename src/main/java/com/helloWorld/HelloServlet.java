package com.helloWorld;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/sayHello")
public class HelloServlet extends HttpServlet {

	private static final Logger LOGGER = Logger.getLogger(HelloServlet.class.getCanonicalName());
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("Request GET on HelloServlet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
