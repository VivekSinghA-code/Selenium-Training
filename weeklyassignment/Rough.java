package weeklyassignment;
import org.openqa.selenium.chrome.ChromeDriver;
public class Rough {

	
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

		String text = driver.findElementByXPath("(//a[@class='linktext'][@href='/crmsfa/control/viewLead?partyId=10081'])[1]").getText();
		driver.findElementByXPath("//input[@type='text'][@autocomplete='off'][@name='id']").sendKeys("123456");
		driver.findElementByXPath("(//button[@class='x-btn-text' and @type='button'])[7]").click();//div[@class='x-paging-info']
		Thread.sleep(2000);
		String text2 = driver.findElementByXPath("//div[@class='x-paging-info' and contains(text(),'records')]").getText();
		
		//String text2 = driver.findElementByXPath("(//button[@class='x-btn-text'][@type='button'])[8]").getText();
		
		System.out.println(text2);
		
		System.out.println(text);
		//System.out.println(text2);	
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
