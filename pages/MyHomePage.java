package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage (ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")
	WebElement eleLeadTab;
	public MyLeads clickLeadTab() {
		eleLeadTab.click();
		return new MyLeads(driver);
	}
	
	
	
	
	
	
	
	
	
}
