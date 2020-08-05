package Week4.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergerLeads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement findElementById = driver.findElementById("username");
		
		findElementById.sendKeys("demosalesmanager");  
		
		WebElement findElementByName = driver.findElementByName("PASSWORD");
		
		
		findElementByName.sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeLeadsForm']")).click();
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> listWindows= new ArrayList<String>(windowHandles);
		 String window2 = listWindows.get(1);
		 String window1 = listWindows.get(0);
		 driver.switchTo().window(window2);
		 
		 driver.findElementByXPath("//input[@type='text' and @name='id']").sendKeys("Topa Babu");
		 driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
		 driver.close();
		  driver.switchTo().window(window1);
		  driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		  
		  Set<String> windowHandles2 = driver.getWindowHandles();
		  
		  List<String> listWindow2= new ArrayList<String>(windowHandles2);
		  String window3 = listWindow2.get(1);
		  driver.switchTo().window(window3);
		  driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys("Psycho");
		  driver.findElement(By.xpath("//button[@type='button']")).click();
		  driver.close();
		  driver.switchTo().window(listWindows.get(0));
		 
		  driver.findElement(By.linkText("Merge")).click();
		  Alert alert= driver.switchTo().alert();
		  alert.accept();
		  driver.findElement(By.linkText("Find Leads")).click();
		  driver.close();

	}

}
