package pages;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyLeads clickLeadTab() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();
	}
	
	
	
	
	
	
	
	
	
}
