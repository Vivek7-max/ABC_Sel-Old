package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class S02_OpenEdgeBrowserAndNavigateToURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		//if there is mismatch for browser version then
		//we get SessionNotCreatedException
		//How to handle it? => simply update the browser version
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
