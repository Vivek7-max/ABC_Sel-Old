package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttributeMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		String actualPlaceholder = driver.findElement(By.name("username")).getAttribute("placeholde");
		
		String exptextdPlaceholder = "Username";
		
		System.out.println("actualPlaceholder: "+actualPlaceholder);
		System.out.println("exptextdPlaceholder: "+exptextdPlaceholder);
		
		if(actualPlaceholder!=null) {
			if(actualPlaceholder.equals(exptextdPlaceholder)) {
				System.out.println("PASS:: The placeholder is persent and having expected value");
			}else {
				System.out.println("FAIL:: The placeholder is persent and not having expected value");
			}
		}else {
			System.out.println("FAIL:: The attribute name is worng or not present");
		}
		
		
		
		driver.close();
	}

}
