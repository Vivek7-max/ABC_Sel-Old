package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		driver.findElement(By.linkText("jdk-17.0.16_linux-aarch64_bin.tar.gz")).click();
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//a[@class='download-file icn-lock']")).isEnabled()) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disabled");
		}
		
		driver.quit();
		
	}

}
