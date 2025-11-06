package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementsCommands  extends Base  {
	
	public void verifyCommands() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));//WebElement is an interface
		messageBox.sendKeys("Hello"); //using sendkeys method
		
		WebElement showbutton= driver.findElement(By.xpath("//button[@id='button-one']"));
		showbutton.click(); //after clicking show message "hello" displays - click method
		
		System.out.println(showbutton.isDisplayed()); //returns boolean value
		System.out.println(showbutton.isEnabled());
		
		WebElement message= driver.findElement(By.xpath("//div[@id='message-one']")); 
		System.out.println(message.getText()); //show message text 
		System.out.println(message.getTagName());
		
		//to clear data (hello) from text box
		messageBox.clear();

	}
	
	

	public static void main(String[] args) {
		HandlingWebElementsCommands handlingWebElementsCommands = new HandlingWebElementsCommands();
		handlingWebElementsCommands.initializeBrowser();
		handlingWebElementsCommands.verifyCommands();
		

	}

}
