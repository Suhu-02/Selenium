package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base  {
	
	public WebDriver driver; //its an interface
	
	public void initializeBrowser() {
		driver= new ChromeDriver(); //chromedriver is a class which implements web browser
		//driver = new EdgeDriver();
		//driver = new FireFox();
		
		driver.get("https://selenium.qabible.in/"); //open url
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
				
	}
	
	public void closeBrowser() {
		//driver.close();
		//System.out.println("closed");
		driver.quit();
	}
	

	public static void main(String[] args) {
		Base base= new Base();
		base.initializeBrowser();
		base.closeBrowser();

	}

}
