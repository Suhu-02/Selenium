package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGbase {	
	
		
		public WebDriver driver; //its an interface
		
		@BeforeMethod 
		
		public void initializeBrowser() {
			driver= new ChromeDriver(); //chromedriver is a class which implements web browser
			//driver = new EdgeDriver();
			//driver = new FireFox();
			
			driver.get("https://www.saucedemo.com/v1/"); //open url
			driver.manage().window().maximize();
			//driver.manage().window().minimize();
					
		}
		
		@AfterMethod
		
		public void closeBrowser() {
			//driver.close();
			//System.out.println("closed");
			driver.quit();
		}
		
	
}


