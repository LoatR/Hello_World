package com.helloWorld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Class JUnit 5")
public class HelloTest {

	private HelloServlet helloServlet = new HelloServlet();
	
	@Test
	public void sayHelloTest() {
		assertEquals("Hello world", helloServlet.sayHello());
	}
}
