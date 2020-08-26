package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ViewLead extends BaseClass {
	
	public ViewLead (ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ViewLead pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return this;
		
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	WebElement eleDeleteButton;
	public ViewLead clickDeleteButton() {
		eleDeleteButton.click();
		return this;
		}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	WebElement eleDuplicateLeadButton;
	public DuplicateLead clickDuplicateLeadButton() {
		eleDuplicateLeadButton.click();
		return new DuplicateLead(driver);

		
	} 
	
	public EditLead clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new EditLead(driver);
		}

}
