package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void VerifyFrames() {
		
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframes= driver.findElements(By.tagName("iframe")); //fetch total no.of elements
		System.out.println(totalframes.size());
		//driver.switchTo().frame("frame1"); //frame is a method invoking inside swithcTo()
		//driver.switchTo().frame(1); //
		//driver.switchTo().parentFrame();
		WebElement frameElement= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frameElement); //another method for switching to frame
		WebElement frameHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameHeading.getText());
		driver.switchTo().defaultContent(); //to cancel the control 
		
		
		
	}
	
	
	public static void main(String[] args) {
	HandlingFrames handlingframes = new HandlingFrames();
	handlingframes.initializeBrowser();
	handlingframes.VerifyFrames();
		
}

}
