package selenium_basics; //class name HandleLocators

import org.openqa.selenium.By;

public class HandleLocations  extends Base  {
	
	public void verifyLocators() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one")); //show message
		driver.findElement(By.className("form-control")); //class name locator for message bar(above show message)
		driver.findElement(By.tagName("button"));
		driver.findElement(By.linkText("Simple Form Demo")); //for accessing simple form demo
		driver.findElement(By.partialLinkText("Simple Form"));//for pasting half portion of link
		driver.findElement(By.cssSelector("button[id='button-one']"));//tagname[attribute='value'] css identify top-bottom
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));//identifying unique element from more than one element
		//xpath of uniquely identified element//parent::path of element to be located
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); //child xpath access method1
		driver.findElement(By.xpath("//div[@class='card']//child::div[@class='form-group']")); //child xpath access method2
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));//preceedig
		driver.findElement(By.xpath("//div/ancestor::div[@class='card']")); //ancestor
		driver.findElement(By.xpath("//div[@class='card']//descendant::div")); //descendant
	}

	public static void main(String[] args) {
		HandleLocations handlelocations = new HandleLocations();
		handlelocations.initializeBrowser();
		handlelocations.verifyLocators();
		
	}

}
