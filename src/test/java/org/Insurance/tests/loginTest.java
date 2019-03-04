package org.Insurance.tests;
import pageClasses.loginPage;
import org.testng.annotations.Test;

public class loginTest
	{	
	
	@Test (priority=0)
	public void enterCredentials()
	{
		loginPage.openURL();
		loginPage.login();
	}
	
	@Test (priority=1)
	public void verifyTitle() throws Exception
	{
		loginPage.validTitle();
		loginPage.closeBrowser();
	}

}
