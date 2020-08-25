package pages;

import base.BaseClass;

public class MyLeads extends BaseClass{

		
	public CreateLead clickCreateLead() {
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		return new CreateLead();
		
	}
	
	public ViewLead selectLead() {
	driver.findElementByXPath("//a[@href='/crmsfa/control/viewLead?partyId=10528']").click();
	return new ViewLead();
	
	}
	
	public ViewLead clickDeleteButton() {
	driver.findElementByLinkText("Delete").click();
	return new ViewLead();
	}
	
	
	public DuplicateLead clickDuplicateLeadButton() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLead();
		}
	
	
	
}
