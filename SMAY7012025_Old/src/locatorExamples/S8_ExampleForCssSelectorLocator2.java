package locatorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_ExampleForCssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser and Navigate to URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Sheela");
		//Close the browser and stop the server
		driver.quit();
	}

}

//xpath Syntaxes
//0.0 - Absolute xpath - Starts with root tagname of the page 
// Single forward slash (/) used to find immediate child
// 0.1 - Relative xpath - starts with particular element
// double forward slash (//) used to find the any child of any parent tag

//1. Xpath By Attribute:         //tagName[@attName='attValue']
//2. Xpath By Text Function:     //tagName[text()='textValue']
//3. Xpath By Contains Function: //tagName[contains(text(),'textValue')]
//4. Dynamic xpath (common parent): xpath/..
//5. Xpath By Group Index: (xpath)[index]
//6. Xpath By axes - parent, child, ancestor, descendant, following, following-sibling, preceding, preceding sibling
// Syntax: xpath//axces::tagName[attributeIfAny]

//For in detail explanation see notes / watch recorded videos














