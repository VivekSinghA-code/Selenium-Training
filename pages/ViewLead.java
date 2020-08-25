package pages;

import base.BaseClass;

public class ViewLead extends BaseClass {
	
	public ViewLead pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return this;
		
	}
	public ViewLead clickDeleteButton() {
		driver.findElementByLinkText("Delete").click();
		return this;
		}
	public DuplicateLead clickDuplicateLeadButton() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLead();

		
	} 
	
	public EditLead clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new EditLead();
		}

}
