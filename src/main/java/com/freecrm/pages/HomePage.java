package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.base.TestBase;

public class HomePage extends TestBase{
	
	//constructor- Initializing page objects
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Page Factory -OR
		
		@FindBy(xpath="//*[contains(text(),'User: Anand Vardhan')]") WebElement userNameLabel;
		
		//Actions or Methods
		
		public String homePageTitle()
		{
			return driver.getTitle();
		}
		
		public boolean validateUserNameLabel()
		{
			return userNameLabel.isDisplayed();
		}
		
		
}
