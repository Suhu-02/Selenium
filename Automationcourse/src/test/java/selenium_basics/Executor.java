package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executor extends Base {
	
	public void verifyExecutor() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; //object creation for je and typecasted into js executor
		js.executeScript("arguments[0].click();", showMessageButton); //format in js to simulate click
        js.executeScript("window.scrollBy(0,200)", ""); //relative scroll
        js.executeScript("window.scrollTo(0,0)", ""); //absolute scroll
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)", ""); //by default pxl value=0
	}

	public static void main(String[] args) {
		Executor executor = new Executor();
		executor.initializeBrowser();
		executor.verifyExecutor();
		

	}

}
