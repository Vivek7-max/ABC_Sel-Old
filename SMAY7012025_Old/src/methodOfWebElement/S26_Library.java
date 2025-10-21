package methodOfWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S26_Library {
	
	public static void verifyEleSelection(WebElement ele) {
		String tagName = ele.getTagName();
		if(tagName=="input") {
			if(ele.isSelected()) {
				System.out.println("Element is selected");
			}else {
				System.out.println("Element is not selected");
			}
		}else {
			throw new IllegalArgumentException();
		}
	}
}
