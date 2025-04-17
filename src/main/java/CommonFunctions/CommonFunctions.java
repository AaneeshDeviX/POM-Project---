package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	//set webderiver

	public static WebDriver driver ;

	//LoadProperty Config File
	 protected static Properties properties = null; ;
	
	public Properties LoadPropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("Config.Properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties ;

	}


	//LaunchBrowser
	//@SuppressWarnings("deprecation")
	@BeforeSuite
	public void LaunchBrowser() {

		String browser=properties.getProperty("browser");
		String url = properties.getProperty("url");

		if (browser.equalsIgnoreCase("chrome")) { // When unaware of how the user type chrome [caps /small]
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = (WebDriver) new GeckoDriverInfo();
		}
		driver.manage().window().maximize();
		driver.get(url);

		//Add Implicit waits	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}


	//Browser Close
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
