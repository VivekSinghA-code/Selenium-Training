package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeads extends BaseClass{
	
	public CreateLeads(ChromeDriver driver) {
	this.driver= driver;
	}
	
	
	public CreateLeads enterCompany() {
		driver.findElementByXPath("//input[@class='inputBox']").sendKeys("TestLeaf POM");
		return this;
		
	}
	 public CreateLeads enterFName() {
		 driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Vivek");
		 return this;
	 }
	
	public CreateLeads enterLName() {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Singh");
		return this;
	}
	
	public ViewLead clickCreateLeadButton() {
		driver.findElementByXPath("//input[@type='submit'][@class='smallSubmit']").click();
		return new ViewLead(driver);
	}
	

}
