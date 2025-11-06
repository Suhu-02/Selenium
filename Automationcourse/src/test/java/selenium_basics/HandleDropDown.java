package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown  extends Base  {
	
	public void verifyDropdowns() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		
		Select select= new Select(dropDown);
		//select.selectByIndex(1); //select by index
		//select.selectByValue("python"); //select by value
		select.selectByVisibleText("SQL"); //select by visible text
		
		}
	
	public void verifyCheckBox() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
	}
	
	public void verifyRadiobutton(){
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='purple']"));
		radiobutton.click();
		
				
	}
	
	public static void main(String[] args) {
		HandleDropDown handleDropDown = new HandleDropDown();
		handleDropDown.initializeBrowser();
		//handleDropDown.verifyDropdowns();
		//handleDropDown.verifyCheckBox();
		handleDropDown.verifyRadiobutton();
		
		}

}
