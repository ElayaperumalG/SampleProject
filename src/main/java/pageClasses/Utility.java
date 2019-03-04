package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	static WebDriver driver;
	static By by;
	public static void clickWebelement(By locator) 
	{
		WebElement element = driver.findElement(locator);
			
		try {
		boolean elementIsClickable = element.isEnabled();
		while (elementIsClickable) 
			{
			element.click();
			}
 		} catch (Exception e) 
			{
			System.out.println("Element is not enabled");
			e.printStackTrace();
			}
	}
	
	public static void enterText(By locator, String givenTxt) {
		WebElement element = driver.findElement(locator);
		try {
			boolean elementIsPresent = element.isDisplayed();
			while (elementIsPresent) {
				element.clear();
				element.sendKeys(givenTxt);
			}
		
		} catch (Exception e) {
		System.out.println("Element is not displayed");
		e.printStackTrace();
		}
		}
}
