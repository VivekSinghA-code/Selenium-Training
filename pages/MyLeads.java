package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyLeads extends BaseClass{
	
	public MyLeads (ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


@FindBy (how=How.XPATH, using="//a[text()='Create Lead']")	
WebElement eleCreateLead;
	public CreateLead clickCreateLead() {
		eleCreateLead.click();
		return new CreateLead();
		
	}
	@FindBy(xpath="//a[@href='/crmsfa/control/viewLead?partyId=10528']")
	WebElement eleSelectLead;
	public ViewLead selectLead() {
	eleSelectLead.click();
	return new ViewLead(driver);
	
	}
	
	@FindBy (how=How.LINK_TEXT, using="Delete")
	WebElement eleDeleteButton;
	public ViewLead clickDeleteButton() {
	eleDeleteButton.click();
	return new ViewLead(driver);
	}
	
	@FindBy(how=How.LINK_TEXT, using ="Duplicate Lead")
	WebElement eleDuplicateLeadButton;
	public DuplicateLead clickDuplicateLeadButton() {
		eleDuplicateLeadButton.click();
		return new DuplicateLead(driver);
		}
	
	
	
}
