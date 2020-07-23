package weeklyassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	

	public static void main(String[] args) throws InterruptedException {
	
		String str="Duplicate Lead";
			
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		driver.findElementByXPath("//span[@class='x-tab-strip-text ' and text()='Email']").click();
		driver.findElementByXPath("//input[@type='text' and @name='emailAddress']").sendKeys("Test@gmail.com");
		driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//a[@class='linktext' and text()='10628']").getText();
				System.out.println(text);
				driver.findElementByXPath("//a[@class='linktext' and text()='10628']").click();
				Thread.sleep(3000);
				driver.findElementByXPath("//a[@class='subMenuButton'][@href='duplicateLeadForm?partyId=10628'][text()='Duplicate Lead']").click();
				Thread.sleep(3000);
				String title = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle' and @id='sectionHeaderTitle_leads']").getText();
				if(str.equalsIgnoreCase(title))
		{
			
			driver.findElementByXPath("//input[@type='submit'][@class='smallSubmit'][@value='Create Lead']").click();
			System.out.println("Duplicate topa created sucessfully");
			
		}
		else
		{
			System.out.println("the text is not matching");
		}
			
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
