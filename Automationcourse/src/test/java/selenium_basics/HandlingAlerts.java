package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	
	public void verifysimpleAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton= driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealertbutton.click();
		Alert alert1= driver.switchTo().alert(); //to switch focus to alert
		System.out.println(alert1.getText());
		alert1.accept(); //to simulate Ok button of click me			
		
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmealertbutton= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmealertbutton.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		//alert2.accept(); //third click me buton
		alert2.dismiss(); //to cancel the pop up
		
		}
	
    public void verifyPromptAlert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement promptalert= driver.findElement(By.xpath("//button[@id='promtButton']"));
	promptalert.click();
	Alert alert3= driver.switchTo().alert();
	alert3.sendKeys("Suhana");
	//alert3.accept(); //invoking ok button
	alert3.dismiss();
	
	
	
}
	
	

	public static void main(String[] args) {
		HandlingAlerts handlingAlerts = new HandlingAlerts();
		handlingAlerts.initializeBrowser();
		//handlingAlerts.verifysimpleAlerts();
		//handlingAlerts.verifyConfirmAlert();	
		handlingAlerts.verifyPromptAlert();
		
		

	}

}
