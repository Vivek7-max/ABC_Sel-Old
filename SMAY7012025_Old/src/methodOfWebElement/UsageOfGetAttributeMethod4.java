package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttributeMethod4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String actualImgAltText = driver.findElement(By.xpath("//picture[@title='Flipkart']/img")).getAttribute("title");
		String exptectedImgAltText = "Flipkart";
		
		System.out.println("actualImgAltText "+actualImgAltText);
		System.out.println("exptectedImgAltText "+exptectedImgAltText);
		
		if(actualImgAltText!=null) {
			if(actualImgAltText.equals(exptectedImgAltText)) {
				System.out.println("PASS:: Alternative text of the image is correct");
			}else {
				System.out.println("FAIL:: Alternative text of the image is not correct");
			}
		}else {
			System.out.println("FAIL:: Attribute is wrong or not present");
		}
		
		
		driver.quit();
	}

}
