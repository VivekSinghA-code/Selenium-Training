package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC004_EditLead extends BaseClass {
	
	@Test
	public void runEditLead(){
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadTab()
		.selectLead()
		.clickEditButton()
		.editLastName()
		.clickUpdate();
		
	}

}
