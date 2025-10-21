package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S21_UsageOfIsEnabledMethod6 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		//click on first link
		driver.findElement(By.linkText("jdk-17.0.16_linux-aarch64_bin.tar.gz")).click();
		
		Thread.sleep(3000);
		//find the element which needs to check enabled or disabled & find class attribute
		String classAttValue = driver.findElement(By.xpath("//a[@class='download-file icn-lock']/..")).getAttribute("class");
		
		//verification: check class attribute contains disabled text or not
		if(classAttValue.contains("disabled")) {
			System.out.println("PASS:: Button is disabled before checking the check box");
		}else {
			System.out.println("FAIL:: Button is enabled before checking the check box");
		}
		
		//close the browser and stop the server
		driver.quit();

	}

}
