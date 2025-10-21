package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S13_UsageOfGetAttributeMethod4 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//getAttribute(String attName)
		String actualImgAltText = driver.findElement(By.xpath("//picture[@title='Flipkart']/img")).getAttribute("title");
		String exptectedImgAltText = "Flipkart";
		
		//Print actual and expected values
		System.out.println("actualImgAltText "+actualImgAltText);
		System.out.println("exptectedImgAltText "+exptectedImgAltText);
		
		//Verification
		if(actualImgAltText!=null) {
			if(actualImgAltText.equals(exptectedImgAltText)) {
				System.out.println("PASS:: Alternative text of the image is correct");
			}else {
				System.out.println("FAIL:: Alternative text of the image is not correct");
			}
		}else {
			System.out.println("FAIL:: Attribute is wrong or not present");
		}
		
		//close the browser and stop the server
		driver.quit();
	}

}
