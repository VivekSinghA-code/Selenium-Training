package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


public class LoginAndLogout extends BaseClass {
	@Test
	public void runloginlogout() {
		//LoginPage lp= new LoginPage();
		new LoginPage(driver)
		//lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickLogout();
		
		
		
	}
	
	
}
