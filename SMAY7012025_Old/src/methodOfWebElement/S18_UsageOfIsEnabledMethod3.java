package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S18_UsageOfIsEnabledMethod3 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");

		//click on 1st link
		driver.findElement(By.linkText("jdk-17.0.16_linux-aarch64_bin.tar.gz")).click();

		Thread.sleep(3000);

		//isEnabled() - No Arg method - return type is boolean
		//It is used to verify if element is enabled or not
		//verification
		if(driver.findElement(By.xpath("//a[@class='download-file icn-lock']")).isEnabled()) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disabled");
		}
		
		//In this example isEnable() will not work as per expectation
		//Because element is not made up of input tag

		//close the browser and stop the server
		driver.quit();
	}

}
