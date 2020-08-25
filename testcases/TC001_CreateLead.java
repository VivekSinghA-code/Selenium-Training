package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLead extends BaseClass {
	
	
	@Test
	public void runCreateLead() {
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadTab()
		.clickCreateLead()
		.enterCompany()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.pageTitle();
		
		
		
	}
	

}
