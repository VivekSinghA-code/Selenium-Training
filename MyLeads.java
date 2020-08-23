package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeads extends BaseClass{
	
	public MyLeads(ChromeDriver driver) {
		this.driver= driver;
		
	}

	public CreateLeads clickCreateLeads() {
		driver.findElementByXPath("//a[@href='/crmsfa/control/createLeadForm']").click();
		return new CreateLeads(driver);
	}
	
	public ViewLead clickFName() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").click();
	return new ViewLead(driver);
	
	}
	
	
	
	/*
	 * public void clickCreateLead() {
	 * driver.findElementByXPath("//a[@href='/crmsfa/control/createLeadForm']").
	 * click(); return new CreateLeads(driver); }
	 */
	
	
	
}
