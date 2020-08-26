package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class EditLead extends BaseClass{
	
	public EditLead (ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText="Edit")
	WebElement eleEditButton;
	public EditLead clickEditButton() {
		eleEditButton.click();
		return this;
		}

	@FindBy(xpath="(//input[@type='text'][@class='inputBox'])[4]")
	WebElement eleLastName;
	public EditLead editLastName() {
		String attribute = eleLastName.getAttribute("value");
		eleLastName.clear();
		eleLastName.sendKeys(attribute +"_Update");
		return this;
		
	}
	
	@FindBy(xpath="//input[@value='Update']")
	WebElement eleUpdateButton;
	public ViewLead clickUpdate() {
		eleUpdateButton.click();
		return new ViewLead(driver);
	}
	
	
}
