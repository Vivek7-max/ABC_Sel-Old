package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement bookTable = driver.findElement(By.name("BookTable"));

		List<WebElement> tableHeaders = bookTable.findElements(By.tagName("th"));
		int expectedHeaderCount = 4;
		int actualHeaderCount = tableHeaders.size();
		
		System.out.println("expectedHeaderCount: "+expectedHeaderCount);
		System.out.println("actualHeaderCount: "+actualHeaderCount);
		
		if(actualHeaderCount == expectedHeaderCount) {
			System.out.println("PASS:: count of table headers are correct");
			System.out.println("TABLE HEADERS: ");
			for (WebElement ele : tableHeaders) {
				System.out.println(ele.getText());
			}
		}else {
			System.out.println("FAIL:: count of table Headers are incorrect");
		}

		System.out.println("============================================");


		List<WebElement> tableRows = bookTable.findElements(By.tagName("tr"));
		int expectedRowCount = 7;
		int actualRowCount = tableRows.size();
		System.out.println("expectedRowCount: "+expectedRowCount);
		System.out.println("actualRowCount: "+actualRowCount);
		
		
		if(actualRowCount == expectedRowCount) {
			System.out.println("PASS:: count of table headers are correct");
		}else {
			System.out.println("FAIL:: count of table Rows are incorrect");
		}

		System.out.println("============================================");


		List<WebElement> tableData = bookTable.findElements(By.tagName("td"));
		int expectedDataCount = 24;
		int actualDataCount = tableData.size();
		
		
		System.out.println("expectedDataCount: "+expectedDataCount);
		System.out.println("actualDataCount: "+actualDataCount);
		
		if(actualDataCount == expectedDataCount) {
			System.out.println("PASS:: count of table data are correct");
			for (WebElement ele : tableData) {
				System.out.println(ele.getText());
			}
			
		}else {
			System.out.println("FAIL:: count of table Data are incorrect");
		}



		driver.quit();
	}
}
