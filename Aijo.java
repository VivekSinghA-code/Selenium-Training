package testcases;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Aijo {
	@Test
	public void TC001() throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/shop/women");

		WebElement women = driver.findElementByXPath("//a[@href='/shop/women']");

		Actions builder = new Actions(driver);
		builder.moveToElement(women).perform();

		driver.findElementByXPath("(//a[@title='Kurtas'])[2]").click();

		driver.findElement(By.xpath("//span[text()='brands']")).click();
		driver.executeScript("scroll(0, 300);");
		driver.findElementByXPath("//label[@for='AJIO']").click();
		driver.executeScript("scroll(0, 500);");
		driver.findElement(By.xpath("//span[text()='discount']")).click();
		driver.findElement(By.xpath("//input[@id='0-20%']/following-sibling::label[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='imgHolder']//img")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> listHandles = new ArrayList<String>(windowHandles);
		String secondWindow = listHandles.get(1);
		driver.switchTo().window(secondWindow);
		driver.executeScript("scroll(0, 200);");
		driver.findElementByXPath("//div[@class='pdp-addtocart-button']").click();
		String ip = driver.findElement(By.xpath("//div[@class='err-msg-blk']//div[1]")).getText();
		System.out.println(ip);
		driver.findElement(By.xpath("//span[@class='ic-error-close']")).click();

		driver.findElement(By.xpath("//div[text()='M']")).click();
		driver.findElementByXPath("//div[@class='pdp-addtocart-button']").click();
		Thread.sleep(5000);

		driver.findElementByXPath("//div[@class='edd-pincode-msg-container']//span[2]").click();
		driver.findElementByXPath("//input[@name='pincode']").sendKeys("603103");
		driver.findElementByXPath("(//button[@type='submit'])[2]").click();

		String currentlyWeDo = driver.findElement(By.xpath("//ul[@class='edd-message-success-details']")).getText();
		System.out.println(currentlyWeDo);
		driver.findElementByXPath("(//div[@class='btn-cart']/span)[2]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@id='LUCKY']").click();
		driver.findElementByXPath("//button[text()='Apply']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@id='orderSummary']/following::button[1]").click();
		Thread.sleep(3000);

		driver.findElementByXPath("//input[@type='text'][@name='username']").sendKeys("9940389585");
		driver.findElementByXPath("//input[@type='submit'][@class='login-btn']").click();
		Thread.sleep(5000);

//		driver.findElementByXPath("//input[@name='username']").sendKeys("VivekSingh@testLeaf.com");
	//	driver.findElementByXPath("//input[@class='login-btn']").click();
		
		/*
		 * Set<String> windowHandles1 = driver.getWindowHandles(); ArrayList<String>
		 * listHandles1 = new ArrayList<String>(windowHandles1); String secondWindow1 =
		 * listHandles1.get(1); driver.switchTo().window(secondWindow1);
		 */
		
		driver.findElementByXPath("//input[@class='radio-gender'][@value='Male']").click();
		//driver.findElementByXPath("//input[@name='user-name']").sendKeys("abc");
		//driver.findElementByXPath("//input[@name='email-mob']").sendKeys("9940389585");
		//driver.findElementByXPath("//div[@class='btn-action-txt']//input").click();
		//driver.findElementByXPath("//input[@type='submit']").click();

		// driver.close();

	}
}