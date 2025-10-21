package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S09_UsageOfGetTextMethod3 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//getText() - No Arg. method (return type: String)
		String text = driver.findElement(By.xpath("//div[@id='header-inner']")).getText();
		//getText() returns the tagText as well as sub tag text
		//no actual text is present for - //div[@id='header-inner']
		
		//Print sub tag text
		System.out.println(text);
		
		//close the browser and stop the server
		driver.quit();

	}

}
