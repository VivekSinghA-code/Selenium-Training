package pages;

import base.BaseClass;

public class EditLead extends BaseClass{
	
	public EditLead clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return this;
		}

	public EditLead editLastName() {
		String attribute = driver.findElementByXPath("(//input[@type='text'][@class='inputBox'])[4]").getAttribute("value");
		driver.findElementByXPath("(//input[@type='text'][@class='inputBox'])[4]").clear();
		driver.findElementByXPath("(//input[@type='text'][@class='inputBox'])[4]").sendKeys(attribute +"_Update");
		return this;
		
	}
	
	public ViewLead clickUpdate() {
		driver.findElementByXPath("//input[@value='Update']").click();
		return new ViewLead();
	}
	
	
}
