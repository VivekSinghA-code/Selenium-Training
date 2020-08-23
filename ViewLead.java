package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLead extends BaseClass {
	
public ViewLead(ChromeDriver driver) {
this.driver= driver;
}

public EditLead clickEdit() {
	driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
	return new EditLead(driver);
	
}



public void verifyTitle() {
	String title = driver.getTitle();
	
	if (title.contains("View Lead")) {
		System.out.println("Execution pass");
		
	}
	
	else {
		System.out.println("Execution fail");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
}
