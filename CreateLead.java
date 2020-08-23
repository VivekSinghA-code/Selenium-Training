package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.MyHome;

public class CreateLead extends BaseClass {

	@Test
	public void createLead() {
		new LoginPage(driver)
		
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLead()
		.clickCreateLeads()
		.enterCompany()
		.enterFName()
		.enterLName()
		.clickCreateLeadButton()
		.verifyTitle();
	
		
		
		
		
		
	}
	
}
