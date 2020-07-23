package weeklyassignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[1]").click();
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();// tow workk
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@type='text'][@size='20'][@name='phoneCountryCode']").clear();
		driver.findElementByXPath("//input[@type='text'][@size='20'][@name='phoneCountryCode']").sendKeys("91");
		driver.findElementByXPath("//input[@type='text'][@name='phoneAreaCode']").sendKeys("+");
		driver.findElementByXPath("//input[@type='text'][@name='phoneNumber']").sendKeys("9940389585");
		
		  driver.findElementByXPath("//button[@class='x-btn-text'][1]").click();
		  String text =driver.findElementByXPath("//a[@class='linktext' and @href='/crmsfa/control/viewLead?partyId=10071'][1]").getText(); 
		  System.out.println(text);
		  driver.findElementByXPath("//a[@class='linktext' and @href='/crmsfa/control/viewLead?partyId=10071'][1]").click(); 
		  driver.findElementByXPath("//a[@class='subMenuButtonDangerous' and @href='javascript:document.deleteLeadForm.submit()']").click();// clicking the delete button Thread.sleep(5000);
		  driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		  // find leads page 
		  driver.findElementByXPath("//input[@type='text'][@autocomplete='off'][@name='id']").sendKeys(text);
		  driver.findElementByXPath("(//button[@class='x-btn-text' and @type='button'])[7]").click(); 
		  Thread.sleep(2000);
		  String text2 =driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		  Thread.sleep(2000);
		  System.out.println(text2);
		 
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
