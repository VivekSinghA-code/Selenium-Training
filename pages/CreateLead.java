package pages;

import base.BaseClass;

public class CreateLead extends BaseClass{

	public CreateLead enterCompany() {
		
		driver.findElementByXPath("//input[@name='companyName'][@class='inputBox']").sendKeys("TCS");
		return this;
		
	}
	
	public CreateLead enterFirstName() {
		driver.findElementByXPath("//input[@name='firstName'][@class='inputBox']").sendKeys("Vivek");
		return this;
	
		}
	
	public CreateLead enterLastName() {
		driver.findElementByXPath("//input[@name='lastName'][@class='inputBox']").sendKeys("Singh");
		return this;
	
	}
	
	public ViewLead clickCreateLeadButton() {
		driver.findElementByXPath("//input[@name='submitButton']").click();
		return new ViewLead(driver);
	}
	
	
	
	
	
	
	
	
}
