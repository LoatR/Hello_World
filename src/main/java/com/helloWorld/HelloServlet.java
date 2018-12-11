package com.helloWorld;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("serial")
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	private static final Logger LOGGER = Logger.getLogger(HelloServlet.class.getCanonicalName());
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("Request GET on HelloServlet");
		
		response.setCharacterEncoding(StandardCharsets.UTF_8.name());
		response.setContentType(MediaType.TEXT_PLAIN);
		response.setLocale(Locale.FRENCH);
		response.setStatus(200);
		response.getWriter().append(sayHello());
	}
	
	public String sayHello() {
		return "Hello world";
	}
	
}
