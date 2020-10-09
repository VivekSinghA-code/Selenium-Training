package testcases;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MakeMyTrip {
	@Test
	public void TC001() throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		//driver.findElement(By.xpath("//div[@role='combobox']//input[1]")).sendKeys("goa");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//p[text()='Goa, India']/following-sibling::p")).click();
		driver.findElement(By.id("checkin")).click();
		driver.findElement(By.xpath("(//div[text()='15'])[2]")).click();
		driver.findElement(By.xpath("(//div[text()='20'])[2]")).click();
		driver.findElement(By.id("guest")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		WebElement cHILDAGESelect = driver.findElement(By.className("ageSelectBox")); 
		new Select(cHILDAGESelect).selectByIndex(3);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.id("hsw_search_button")).click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='checkmarkOuter'])[8]").click();
		driver.findElementByXPath("(//span[@class='checkmarkOuter'])[16]").click();
		driver.findElement(By.xpath("//div[@class='imgCont']//img")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		  ArrayList<String> listHandles= new ArrayList<String>(windowHandles);
		  String secondWindow=listHandles.get(1);
		  driver.switchTo().window(secondWindow);
		  String theParkBaga = driver.findElementByXPath("(//ul[@id='detpg_bread_crumbs'])//li[3]").getText();
		  System.out.println("The hotel name is "+theParkBaga);
		  String iNR = driver.findElement(By.xpath("(//span[text()='10,450'])[2]")).getText();
		  System.out.println("The amount payable is "+iNR);
		  driver.findElement(By.xpath("//span[text()='Book this combo']")).click();
		  driver.quit();
		  
		
		
}
}