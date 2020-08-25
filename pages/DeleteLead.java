package pages;

import base.BaseClass;

public class DeleteLead extends BaseClass{
	
	public ViewLeadsDelete  selectLead() {
		driver.findElementByXPath("//a[@href='/crmsfa/control/viewLead?partyId=10526']").click();
		return new ViewLeadsDelete();
		
	}
	
	
	
	
	
	
	
}
