package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		List<WebElement> allLinkList = driver.findElements(By.xpath("//a"));
		
		System.out.println("Count of all links: "+allLinkList.size());
		
		for (WebElement link : allLinkList) {
			System.out.println(link.getText());
		}
		
		driver.quit();

	}

}
