package com.addition.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.utilities.TestUtil;

public class AddingNumbers {
	
	TestUtil testUtil;
	
	@BeforeMethod
	public void setUp()
	{
		testUtil = new TestUtil();
	}
	
	
	@Test
	public void add2Numbers()
	{
		int num1=10;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Additions of 2 numbers: "+sum2num);
					
	}

}
