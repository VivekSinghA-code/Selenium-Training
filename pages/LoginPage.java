package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement eleUserName;
	public LoginPage enterUserName() {
		eleUserName.sendKeys("democsr2");
		return this;
	}

	@FindBy(id="password")
	WebElement elepassWord;
	public LoginPage enterPassword() {
		elepassWord.sendKeys("crmsfa");
		return this;
		
	}
	
	@FindBy(xpath="//input[@class='decorativeSubmit']")
	WebElement eleLoginButton;
	public HomePage clickLoginButton() {
	  
	eleLoginButton.click();
	  return new HomePage(driver);
	  
	  
  }
	
	
}
