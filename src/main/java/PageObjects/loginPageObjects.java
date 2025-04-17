package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageObjects {

	@FindBy(id="user-name")
	public static WebElement username;
	
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(id="login-button")
	public static WebElement login;
}
