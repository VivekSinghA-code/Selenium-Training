package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class DuplicateLead extends BaseClass{
	public DuplicateLead (ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='submit'][@name='submitButton']")
	WebElement eleSubmitButton;
	public ViewLead duplicateLead() {
		eleSubmitButton.click();
		return new ViewLead(driver);
	}
	
	
}
