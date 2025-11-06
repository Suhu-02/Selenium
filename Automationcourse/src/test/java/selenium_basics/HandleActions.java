package selenium_basics; 

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleActions extends Base {
	
	public void verifyRightClick() {
		
		WebElement rightclick= driver.findElement(By.xpath("//a[text()='Home']")); //to simulate right click of home of se
		Actions	act= new Actions(driver); //actions is a class- invoking object name
		act.contextClick(rightclick).build().perform(); //build- be prepared for action, perform- to execute right click
		
		
	}
	
	public void verifyMouseHover() { 
		WebElement right= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act =  new Actions(driver);
		act.moveToElement(right).build().perform(); //move to element for mouse hovering
	}

	public void verifyDragandDrop() {
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']")); //to make drag me button blue colur
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop).build().perform();		
		
	}
	
	public void verifyKeyboardAction() throws AWTException { //to simulate keyboardactions
		Robot robot = new Robot();
		//VK - Virtual key. keypress simulates key press activity.
		robot.keyPress(KeyEvent.VK_CONTROL); //using keyevent passing control
		robot.keyPress(KeyEvent.VK_T); //using keyevent passing tab (control+ tab for opening new tab)
		//keyrelease to release the press of key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T); //output: se obsqura open then new tab open
	}
	
	public static void main(String[] args) {
		HandleActions handleActions = new HandleActions();
		handleActions.initializeBrowser();
		//handleActions.verifyRightClick();
		//handleActions.verifyMouseHover();
		//handleActions.verifyDragandDrop();
		try {
			handleActions.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}

}
