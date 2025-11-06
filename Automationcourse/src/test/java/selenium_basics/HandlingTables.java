package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables  extends Base  {

	public void verifyTables() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table.getText());
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]"));
		//fetch a specific row
		System.out.println(tableRow.getText());
		//Fetch a specific column
		WebElement tableColumn=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]/td[2]"));
		System.out.println(tableColumn.getText());
		
		}


public static void main(String[] args) {
	HandlingTables handlingtables = new HandlingTables();
	handlingtables.initializeBrowser();
	handlingtables.verifyTables();
	
	
}
	
}

