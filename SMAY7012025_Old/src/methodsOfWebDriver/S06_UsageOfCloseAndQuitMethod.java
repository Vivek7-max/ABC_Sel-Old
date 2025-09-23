package methodsOfWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_UsageOfCloseAndQuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		
		driver.close();
		//close() - 
		//1. No arg. method
		//2. Return type is void
		//3. it is used to close the browser window: window/tab will 
		//   be closed where the control is present (Parent Window)
		
		driver.quit();
		//quite()
		//1. No arg. method
		//2. return type is void
		//3. it is used to close all the browser windows/tabs opened.
		//4. it is used to stop the server
		
		//Difference
		//It is good programmer practice to use the quite() as the post condition at
		// the end of automation script instead of close()
	}
}
