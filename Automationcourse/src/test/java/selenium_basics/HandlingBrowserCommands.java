package selenium_basics;

public class HandlingBrowserCommands extends Base{
	
	public void verifyBrowserCommands() {
		System.out.println(driver.getCurrentUrl()); //to return current url
		
		System.out.println(driver.getTitle()); //to get the title
		System.out.println(driver.getWindowHandles()); //to return id if only one tab is open
		System.out.println(driver.getWindowHandles()); //to return ids if multiple tabs open
		System.out.println(driver.getPageSource()); //to return the dome of web while inspecting			
	}	

	public static void main(String[] args) {
		HandlingBrowserCommands handlingBrowserCommands = new HandlingBrowserCommands();
		handlingBrowserCommands.initializeBrowser();
		handlingBrowserCommands.verifyBrowserCommands();		

	}

}
