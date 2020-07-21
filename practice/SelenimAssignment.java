package practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelenimAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf technologies");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vivek");
		driver.findElementById("createLeadForm_lastName").sendKeys("Singh");

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		dropDown.selectByVisibleText("Employee");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select drop2 = new Select(market);
		drop2.selectByValue("9001");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select drop3 = new Select(industry);
		List<WebElement> options = drop3.getOptions();
		int size = options.size();
		drop3.selectByIndex(size - 2);
		WebElement ownerShip = driver.findElementById("createLeadForm_ownershipEnumId");
		Select drop4 = new Select(ownerShip);
		List<WebElement> opts = drop4.getOptions();
		drop4.selectByIndex(5);
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select cnt = new Select(country);
		cnt.selectByVisibleText("India");

		driver.findElementByName("submitButton").click();

		 String title = driver.getTitle();
		 System.out.println(title);

	}

}
