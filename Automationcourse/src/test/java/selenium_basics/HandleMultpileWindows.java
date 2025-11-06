package selenium_basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleMultpileWindows extends Base {
	
	public void verifyMultipleWindows() {
		
		driver.navigate().to("https://demo.guru99.com/popup.php");
		//For getting handle ID
		String firstWindowHandleId = driver.getWindowHandle(); //storing the unique id of the tab open in a string
	
		WebElement clickMe = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickMe.click();
		Set<String>handleIDs = driver.getWindowHandles();
		System.out.println(handleIDs);
		Iterator<String>values=handleIDs.iterator();
		while(values.hasNext())
		{
			String current_id=values.next();
			if(!current_id.equals(firstWindowHandleId))
			{
				driver.switchTo().window(current_id);
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("abc@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		HandleMultpileWindows handlemultpilewindows = new HandleMultpileWindows();
		handlemultpilewindows.initializeBrowser();
		handlemultpilewindows.verifyMultipleWindows();
		
		
		
		

	}

}
