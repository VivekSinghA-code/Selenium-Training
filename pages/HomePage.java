package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage (ChromeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using ="//div[@id='label']")
	WebElement eleCRMSFALink;
	public MyHomePage clickCRMSFALink(){
		eleCRMSFALink.click();
		return new MyHomePage(driver);
				
	}

}
