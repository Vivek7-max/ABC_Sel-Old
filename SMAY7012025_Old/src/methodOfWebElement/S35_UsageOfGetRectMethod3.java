package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S35_UsageOfGetRectMethod3 {

	public static void main(String[] args) {
		//Open Browser, Maximize it and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		//find the elements and get X & Y co-ordinates as well as height 
		Rectangle rect1 = driver.findElement(By.name("firstname")).getRect();
		Rectangle rect2 = driver.findElement(By.name("lastname")).getRect();
		
		int startYofFirstNameTbx = rect1.getY();
		int startXofFirstNameTbx = rect1.getX();
		
		int startYofSurnameTbx = rect2.getY();
		int startXofSurnameTbx = rect2.getX();
		
		int endYofFirstNameTbx = startYofFirstNameTbx + rect1.getHeight();
		int widthOfFirstNameTbx = rect1.getWidth();
		
		int endYofSurnameTbx = startYofSurnameTbx + rect2.getHeight();
		
		
		System.out.println("startYofFirstNameTbx: "+startYofFirstNameTbx);
		System.out.println("endYofFirstNameTbx: "+endYofFirstNameTbx);
		
		System.out.println("startYofSurnameTbx: "+startYofSurnameTbx);
		System.out.println("endYofSurnameTbx: "+endYofSurnameTbx);
		
		//Verify the top alignment of the text fields
		if(startYofFirstNameTbx==startYofSurnameTbx && endYofFirstNameTbx==endYofSurnameTbx) {
			System.out.println("PASS:: Top alignemnt of the text fileds are correct");
		}else {
			System.out.println("FAIL:: Top alignemnt of the text fileds are not correct");
		}
		
		//Verify the text fields are not overlapping 
		if(startXofFirstNameTbx+widthOfFirstNameTbx < startXofSurnameTbx) {
			System.out.println("PASS:: fields are not overlapping");
		}else {
			System.out.println("FAIL:: fields are overlapping");
		}
		
		
		//close the browser and stop the server
		driver.quit();

	}

}
