package pages;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public MyHomePage clickCRMSFALink(){
		driver.findElementByXPath("//div[@id='label']").click();
		return new MyHomePage();
				
	}

}
