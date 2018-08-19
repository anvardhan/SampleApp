package com.addition.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.utilities.TestUtil;

public class AddingNumbersTest {
	
	TestUtil testUtil;
	
	@BeforeMethod (groups= {"Smoke","System","Regression"})
	public void setUp()
	{
		testUtil = new TestUtil();
	}
	
	
	@Test(priority=1,groups= {"System"})
	public void add2Numbers()
	{
		int num1=10;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
	@Test(priority=2,groups= {"Regression"})
	public void add2NumbersTest2()
	{
		int num1=20;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
	@Test(priority=3,groups= {"Smoke","System"})
	public void add2NumbersTest3()
	{
		int num1=30;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
	@Test(priority=4,groups= {"Smoke","Regression"})
	public void add2NumbersTest4()
	{
		int num1=40;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
	@Test(priority=5,groups= {"Regression"})
	public void add2NumbersTest5()
	{
		int num1=50;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
	@Test(priority=6,groups= {"Regression"})
	public void add2NumbersTest6()
	{
		int num1=70;
		int num2=30;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
	@Test(priority=7,groups= {"System"})
	public void add2NumbersTest7()
	{
		int num1=50;
		int num2=40;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}

	@Test(priority=8,groups= {"System"})
	public void add2NumbersTest8()
	{
		int num1=40;
		int num2=80;
		int sum2num=testUtil.addNumbers(num1,num2);
		
		System.out.println("Result of Addition of 2 numbers: "+sum2num);
					
	}
	
}
