package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	
	@Test
	public void EditLeads() {
		new LoginPage(driver)
		
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLead()
		.clickFName()
		.clickEdit()
		.editCompanyName()
		.editfirstName()
		.editLastName();
		
		
	
	
	
	
}
		
}


