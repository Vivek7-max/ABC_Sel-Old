package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S34_UsageOfGetRectMethod2 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//find the x co-ordinate and width of the email text field 
		WebElement emailTbx = driver.findElement(By.id("email"));
		Rectangle rect1 = emailTbx.getRect();
		int statrXofEmailTbx = rect1.getX();
		int endXofEmeilTbx = statrXofEmailTbx + rect1.getWidth();
		
		//find the x co-ordinate and width of the password text field 
		WebElement passTbx = driver.findElement(By.id("passContainer"));
		Rectangle rect2 = passTbx.getRect();
		int statrXofPassTbx = rect2.getX();
		int endXofPassTbx = statrXofPassTbx + rect2.getWidth();
		
		System.out.println("statrXofEmailTbx: "+statrXofEmailTbx);
		System.out.println("statrXofPassTbx: "+statrXofPassTbx);
		
		System.out.println("endXofEmeilTbx: "+endXofEmeilTbx);
		System.out.println("endXofPassTbx: "+endXofPassTbx);
		
		//verification
		if(statrXofEmailTbx==statrXofPassTbx && endXofEmeilTbx==endXofPassTbx) {
			System.out.println("PASS:: Side alignment of the text fields are correct");
		}else {
			System.out.println("FAIL:: Side alignment of the text fields are not correct");
		}
		
		//close the browser and stop the server
		driver.quit();

	}

}
