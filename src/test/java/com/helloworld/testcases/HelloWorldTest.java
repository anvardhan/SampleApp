package com.helloworld.testcases;

import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void printHellowWorld()
	{
		String helloWorld = "Hello World";
		System.out.println("Hello World Application name is: "+helloWorld);
	}

}
