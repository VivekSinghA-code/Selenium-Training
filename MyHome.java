package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHome extends BaseClass {
	
	public MyHome(ChromeDriver driver) {
		this.driver= driver;
		
	}
	public MyHome clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHome(driver);
	}
	
	public MyLeads clickLead() {
		driver.findElementByXPath("(//div[@class='x-panel-header']//a)[2]").click();
		return new MyLeads(driver);
		}
	
	
	
	
	
	
	
	
	
	
}
