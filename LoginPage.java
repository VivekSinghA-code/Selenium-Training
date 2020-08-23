package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	

	public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}

	
	  public MyHome clickLoginButton() {
	  driver.findElementByClassName("decorativeSubmit").click(); 
	  return new MyHome(driver);
	  }
	  
	  public MyHome clickLink() {
			driver.findElementByLinkText("CRM/SFA").click();
			return new MyHome(driver);
		}
	  
	  
	 
}
