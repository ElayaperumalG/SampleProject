package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage{
	
	static WebDriver driver;	
	
	static By userName = By.id("login-form:email");
	static By passWord = By.id("login-form:password");
	static By login = By.id("login-form:login");
	
	static String appURL = "http://demo.borland.com/InsuranceWebExtJS/";
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		
	}
	public static void login()
	{
		
		driver.findElement(userName).sendKeys("john.smith@gmail.com");
		driver.findElement(passWord).sendKeys("john");
		driver.findElement(login).click();
		
	//Utility.enterText(userName, "john.smith@gmail.com");
	//Utility.enterText(passWord, "john");
	//Utility.clickWebelement(login);
	}
	
	public static void validTitle() throws Exception
	{
		Thread.sleep(3000);
		String expectedTitle = "InsuranceWeb: Home";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equalsIgnoreCase(actualTitle))
			System.out.println("title is verified");
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	}


