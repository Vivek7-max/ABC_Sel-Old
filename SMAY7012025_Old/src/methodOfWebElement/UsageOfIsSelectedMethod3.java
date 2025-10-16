package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelectedMethod3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(3000);
		
		//check box is not having input tag.
		WebElement checkBox = driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']"));
		boolean select = checkBox.isSelected();
		
		if(!select) {
			System.out.println("PASS:: Checkbox is not selected before click");	
		}else {
			System.out.println("FAIL:: Checkbox is selected before click");
		}
		
		checkBox.click();
		Thread.sleep(3000);
		select = checkBox.isSelected();
		if(select) {
			System.out.println("PASS:: Checkbox is selected after click");	
		}else {
			System.out.println("FAIL:: Checkbox is not selected after click");
		}
		
		driver.quit();
		
	}

}
