package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		driver.findElement(By.linkText("jdk-17.0.16_linux-aarch64_bin.tar.gz")).click();
		
		Thread.sleep(3000);
		
		String classAttValue = driver.findElement(By.xpath("//a[@class='download-file icn-lock']/..")).getAttribute("class");
		
		if(classAttValue.contains("disabled")) {
			System.out.println("PASS:: Button is disabled before checking the check box");
		}else {
			System.out.println("FAIL:: Button is enabled before checking the check box");
		}
		
		driver.quit();

	}

}
