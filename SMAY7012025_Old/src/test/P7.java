package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		WebElement searchTbx = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchTbx.sendKeys("tshirt");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> autosuggetionList = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		
		System.out.println("autosuggetionList size = "+autosuggetionList.size());
		
		if(autosuggetionList.size()>1 && autosuggetionList.size()<=10) {
			System.out.println("PASS:: Autosuggetions count is correct");
		}else {
			System.out.println("PASS:: Autosuggetions count is not correct");
		}
		
		String expectedAutosuggetion = "Tshirts Men";
		String expectedUrlFraction = "tshirts-men?";
		for (WebElement ele : autosuggetionList) {
			if(ele.getText().equals(expectedAutosuggetion)) {
				ele.click();
				break;
			}
			
		}
		
		if(driver.getCurrentUrl().contains(expectedUrlFraction)) {
			System.out.println("PASS:: clicked on "+expectedAutosuggetion);
		}else {
			System.out.println("FAIL:: unable to clicked on "+expectedAutosuggetion);
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
