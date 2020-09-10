package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class SalesForce extends BaseClass{
	
	@Test
	public void runSalesForce() throws InterruptedException {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCreate()
		.clickUser()
		.enterFirstName()
		.enterLastName()
		.selectUserLicence()
		.selectRloe()
		.enterAias()
		.selectProfile()
		.enterEmail()
		.enterUsername()
		.enterNickname()
		.enterEmailEncoding()
		.selectTimeZone()
		.selectLocale()
		.selectLanguage()
		.selectDelegatedApprover()
		.selectRequestEmails()
		.clickSave();
		
		
	}

}
