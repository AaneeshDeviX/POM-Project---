package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.loginPageObjects;


public class ClickBackpack extends CommonFunctions{
	
	@Test
	public void ClickPack() {
		
		PageFactory.initElements(driver, loginPageObjects.class);
		loginPageObjects.username.sendKeys(properties.getProperty("username"));
		loginPageObjects.Password.sendKeys(properties.getProperty("Password"));
		loginPageObjects.login.click();
		

	}	
}
