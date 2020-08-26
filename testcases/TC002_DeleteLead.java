package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_DeleteLead extends BaseClass {
	
	@Test
	public void deleteLead() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadTab()
		.selectLead()
		.clickDeleteButton();
		
	
		
	}
	
	
	
	
	
	

}
