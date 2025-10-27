package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> logoutMenuList = driver.findElements(By.xpath("//ul[@role='menu']//li/a"));
		List<String> actualOrder = new ArrayList<String>();
		
		List<String> expectedOrder = Arrays.asList("About", "Support", "Change Password", "Logout");
		
		for (WebElement ele : logoutMenuList) {
			actualOrder.add(ele.getText());
		}
		
		System.out.println("actualOrder: "+actualOrder);
		System.out.println("expectedOrder: "+expectedOrder);
		
		if(actualOrder.equals(expectedOrder)){
			System.out.println("PASS:: Elements are present in the order");
		}else {
			System.out.println("FAIL:: Elements are not present in the order");
		}
		
		driver.quit();

	}

}
