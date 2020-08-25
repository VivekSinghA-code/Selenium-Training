package pages;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("democsr2");
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
		
	}
	
	
  public HomePage clickLoginButton() {
	  
	  driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	  return new HomePage();
	  
	  
  }
	
	
}
