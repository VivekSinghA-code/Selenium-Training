package pages;

import base.BaseClass;

public class DuplicateLead extends BaseClass{

	public ViewLead duplicateLead() {
		driver.findElementByXPath("//input[@type='submit'][@name='submitButton']").click();
		return new ViewLead();
	}
	
	
}
