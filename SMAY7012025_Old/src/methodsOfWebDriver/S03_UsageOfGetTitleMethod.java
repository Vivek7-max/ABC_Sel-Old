package methodsOfWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class S03_UsageOfGetTitleMethod {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");

		//getTitle() => no arg Method (Return type: String) => title of the web page
		String actualTitle = driver.getTitle();

		//Store Expected Title
		String exptectedTitle = "Selenium";
		
		//Print Expected and Actual Title of the web page
		System.out.println("actualTitle = "+actualTitle);
		System.out.println("exptectedTitle = "+exptectedTitle);

		//Verification
		if(actualTitle.equals(exptectedTitle)) {
			System.out.println("PASS:: Titel of the page is correct and it is verified");
		}else {
			System.out.println("FAIL:: Titel of the page is incorrect and it is verified");
		}

		//close the browser and stop the server
		driver.quit();
	}

}
