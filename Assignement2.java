package weeklyassignment;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
public class Assignement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		//driver.findElementByXPath("//a[@href='/crmsfa/control/createLeadForm']").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Vivek");
		driver.findElementByXPath("//button[contains(@class,'x-btn-text') and text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext' and @href='/crmsfa/control/viewLead?partyId=10119'])[1]").click();
		String title = driver.getTitle();
		System.err.println(title);
		driver.findElementByXPath("//a[@class='subMenuButton'][@href='updateLeadForm?partyId=10119']").click();
		Thread.sleep(5000);
		String attribute = driver.findElementByXPath("(//input[@type='text' and @name='companyName'])[2]").getAttribute("value");
		System.out.println("The previous company name was:"+" "+attribute);
		driver.findElementByXPath("(//input[@type='text' and @name='companyName'])[2]").clear();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@type='text' and @name='companyName'])[2]").sendKeys("TestLeafNew");
		Thread.sleep(2000);	
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
