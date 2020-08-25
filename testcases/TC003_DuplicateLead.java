package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC003_DuplicateLead extends BaseClass{

	@Test()
	public void runduplicateLead() {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadTab()
		.selectLead()
		.clickDuplicateLeadButton()
		.duplicateLead();
		
		
		
		
	}
}
