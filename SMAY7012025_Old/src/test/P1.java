package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		WebElement maleRaidoButton = driver.findElement(By.xpath("//i[@class=\"ico resman-icon resman-icon-check-box\"]"));
		
		if(maleRaidoButton.isSelected()){
			System.out.println("selected");
		}else {
			System.out.println("not seleted");
		}
		
		maleRaidoButton.click();
		Thread.sleep(2000);
		if(maleRaidoButton.isSelected()){
			System.out.println("selected");
		}else {
			System.out.println("not seleted");
		}
		
		
	
		driver.quit();
		
	}

}
