package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
//Verify the side alignment of the text fields in the face book
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement emailTbx = driver.findElement(By.name("email"));
		WebElement passwordTbx = driver.findElement(By.id("passContainer"));
		
		int startXofEmailTbx = emailTbx.getLocation().getX();
		int widthOfEmailTbx = emailTbx.getSize().getWidth();
		int startXofUserNameTbx = passwordTbx.getLocation().getX();
		int widthOfPasswordTbx = passwordTbx.getSize().getWidth();
		
		System.out.println("startXofEmailTbx: "+startXofEmailTbx);
		System.out.println("endXofEmailTbx: "+(startXofEmailTbx+widthOfEmailTbx));
		System.out.println("startXofUserNameTbx: "+startXofUserNameTbx);
		System.out.println("endXofPasswordTbx: "+(startXofUserNameTbx+widthOfPasswordTbx));
		
		//To check the side alignment
		if(startXofEmailTbx+widthOfEmailTbx==startXofUserNameTbx+widthOfPasswordTbx) {
			System.out.println("PASS: side alginment of the both the text fields are correct");
		}else {
			System.out.println("FAIL: side alginment of the both the text fields are correct");
		}
		
		//To verify the overlapping
		int startYofEmailTbx = emailTbx.getLocation().getY();
		int heightOfEmailTbx = emailTbx.getSize().getHeight();
		int startYofUserNameTbx = passwordTbx.getLocation().getY();
		int heightOfPasswordTbx = passwordTbx.getSize().getHeight();
		
		System.out.println("startYofEmailTbx: "+startYofEmailTbx);
		System.out.println("endYofEmailTbx: "+(startYofEmailTbx+heightOfEmailTbx));
		System.out.println("startYofUserNameTbx: "+startYofUserNameTbx);
		System.out.println("endYofPasswordTbx: "+(startYofUserNameTbx+heightOfPasswordTbx));
		
		if(startYofUserNameTbx+heightOfPasswordTbx>startYofEmailTbx+heightOfEmailTbx) {
			System.out.println("PASS: side alginment of the both the text fields are correct");
		}else {
			System.out.println("FAIL: side alginment of the both the text fields are correct");
		}
		
		driver.quit();

	}

}
