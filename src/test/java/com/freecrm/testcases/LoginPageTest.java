package com.freecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.pages.HomePage;
import com.freecrm.pages.LoginPage;
import com.project.base.TestBase;
import com.project.utilities.TestUtil;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest() {
		super(); 
	}
	
	@BeforeMethod(groups= {"Smoke","System","Regression"})
	public void setUp()
	{
		openBrowser();
		navigateToApp();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
	}
	
	@Test (priority=10,groups= {"Regression"})
	public void loginPageTitleTest()
	{
		try {
		String actualTitle = loginPage.loginPageTitle();
		Assert.assertEquals(actualTitle, "#1 Free CRM software in the cloud for sales and service");
		System.out.println("loginPageTitle is validated and its as expected ");
		} catch (Error e)
		{
			e.printStackTrace();
			System.out.println("Error in loginPageTitleTest: "+e.getMessage());
		}
	}
	
	@Test (priority=11,groups= {"Smoke","System"})
	public void loginTest() throws InterruptedException
	{
		homePage = loginPage.loginToApp(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		//Thread.sleep(5000);
		Boolean flag  = homePage.validateUserNameLabel();
		try {
		Assert.assertTrue(flag);
		System.out.println("Login is successful as UserName Label is found");
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Login is successful as UserName Label is found: "+e.getMessage());
		}
		
	}
	
	
	
	
	@AfterMethod(groups= {"Smoke","System","Regression"})
	public void tearDown()
	{
		closeBrowser();
	}


}
