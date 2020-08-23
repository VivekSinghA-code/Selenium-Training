package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginAndVerify extends BaseClass{
	
	@Test
	public void runTitle() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
	.verifyTitle();

}
}