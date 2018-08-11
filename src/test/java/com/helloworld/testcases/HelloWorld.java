package com.helloworld.testcases;

import org.testng.annotations.Test;

public class HelloWorld {
	
	@Test
	public void printHellowWorld()
	{
		String helloWorld = "Hello World";
		System.out.println("Hello World App is: "+helloWorld);
	}

}
