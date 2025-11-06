package selenium_basics;

public class HandlingNavigationCommands  extends Base  {
	
	public void verifyNavigation() { //to go and come after the page
		
		//naavigate to other url input form
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().back(); //back to previous page
		driver.navigate().to("https://www.amazon.in/"); //navigating to amazon
		
		driver.navigate().refresh(); //refreshing the current amazon page
	}

	public static void main(String[] args) {
		
		HandlingNavigationCommands handlingNavigationCommands= new HandlingNavigationCommands();
		handlingNavigationCommands.initializeBrowser();
		handlingNavigationCommands.verifyNavigation();

	}

}
