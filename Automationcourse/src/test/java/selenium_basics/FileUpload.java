package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void FileUploadingUsingMouse() {
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		//uploading file from our system
		choosefile.sendKeys("C:\\Users\\gopik\\git\\automation\\Automationcourse\\src\\test\\resources\\Interview se.pdf");
		//simulating checkbox
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		//simulating submit button
		WebElement button= driver.findElement(By.xpath("//button[@id='submitbutton']"));
		button.click();
				
		
	}
	
	public void FileUploadingUsingKeyBoard() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pdfupload= driver.findElement(By.xpath("//a[@id='pickfiles']"));
		pdfupload.click();
		//new object creation..a built in class used to pass on a string
		StringSelection selection= new StringSelection("C:\\Users\\gopik\\git\\automation\\Automationcourse\\src\\test\\resources\\Interview se.PDF");
		//copies the contnet of the file path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		FileUpload fileUpload = new FileUpload();
		fileUpload.initializeBrowser();
		fileUpload.FileUploadingUsingMouse();
		try {
			fileUpload.FileUploadingUsingKeyBoard();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		

	}

}
