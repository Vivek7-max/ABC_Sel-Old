package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelectedMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String day = "Sunday";
		
//		WebElement sundayCheckBox = driver.findElement(By.id(day)); //Parameterized locator
		//OR
		WebElement sundayCheckBox=driver.findElement(By.xpath("//label[text()='"+day+"']/preceding-sibling::input")); //Parameterized xpath
		
		if(!sundayCheckBox.isSelected()) {
			System.out.println("PASS:: Check box is not selected before clicking");
		}else {
			System.out.println("FAIL:: Check box is selected before clicking");
		}
		
		sundayCheckBox.click();
		Thread.sleep(1000);
		
		if(sundayCheckBox.isSelected()) {
			System.out.println("PASS:: Check box is selected after clicking");
		}else {
			System.out.println("FAIL:: Check box is not selected after clicking");
		}
		
		driver.quit();

	}

}
