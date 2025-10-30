package findElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_UsageOfFindElementsMethod4 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
		//Enter the user name into the user name text field
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		//Enter the password into the password text field
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		//submit() is used to submit the form
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		
		List<String> expctedOrder = Arrays.asList("About","Support","Change Password","Logout");
		
		
		List<WebElement> allLogoutOptions = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		
		List<String> actualOrder = new ArrayList<String>();
		
		for (WebElement ele : allLogoutOptions) {
			actualOrder.add(ele.getText());
		}
		
		System.out.println("expctedOrder: "+expctedOrder);
		System.out.println("actualOrder: "+actualOrder);
		
		if(actualOrder.equals(expctedOrder)) {
			System.out.println("PASS:: Logout options are in correct order");
		}else {
			System.out.println("FAIL:: Logout options are not in correct order");
		}
		
		driver.quit();

	}

}

//Assignment - 
//Verify the entered text is present in the auto suggestion

