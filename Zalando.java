package testcases;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Zalando {
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
		driver.get("https://www.zalando.com");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		driver.findElement(By.xpath("//a[@href='https://www.zalando.co.uk/']")).click();
		String text2 = driver.findElement(By.xpath(
				"//span[@title='*Free delivery for orders over £19.90. For orders below this amount, the delivery fee is £3.00.']//a[1]"))
				.getText();
		System.out.println(text2);
		WebElement clothing = driver.findElementByXPath("//a[@href='/clothing/']//span[1]");
		Actions builder = new Actions(driver);
		builder.moveToElement(clothing).perform();
		driver.findElement(By.xpath("//span[text()='Coats']")).click();
		Thread.sleep(8000);
		driver.findElementByXPath("//button[@id='uc-btn-accept-banner']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='cat_container-109XU']/button)[7]").click();

		driver.findElementByXPath("//span[@class='cat_label-3NBdm cat_ellipsis-MujnT'][text()='Cotton']").click();
		driver.findElementByXPath("//button[text()='Save']").click();

		Thread.sleep(3000);
		driver.findElementByXPath("//button[@aria-label='filter by Length']").click();
		
		
		driver.findElementByXPath("//span[text()='thigh-length']").click();
		driver.executeScript("scroll(0,200);");
		driver.findElementByXPath("//button[@data-testid='filter_btn-apply'][text()='Save']").click();
		
		Thread.sleep(3000);
		driver.executeScript("scroll(0,100);");
		
		driver.findElementByXPath("(//img[@draggable='false'][@aria-hidden='true'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@aria-haspopup='true']").click();
		driver.findElementByXPath("(//div[@class='_0xLoFW FCIprz'])[7]").click();
		driver.findElementByXPath("//button [@aria-label='Add to bag']").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Free delivery and returns*").click();
		driver.findElement(By.xpath("//div[@class='channel__button']//button")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> listHandles=new ArrayList<String>(windowHandles);
		String secWindow=listHandles.get(1);
		driver.switchTo().window(secWindow);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='inputText']")).sendKeys("Vivek");
		driver.findElement(By.xpath("(//input[@class='inputText'])[2]")).sendKeys("Vivek@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
		driver.findElementByXPath("//textarea[@id='liveAgentChatTextArea']").sendKeys("Hi");
		driver.findElementByXPath("//button[@title='Send']").click();
		String txt = driver.findElement(By.xpath("(//span[@class='operator'])[3]")).getText();
		System.out.println(txt);
		driver.close();
		driver.quit();
		
		
		/*
		 * WebElement bag =
		 * driver.findElementByXPath("//a[@class='z-navicat-header_navToolItemLink']");
		 * Actions builder1= new Actions(driver); builder1.moveToElement(bag);
		 * driver.findElementByXPath("//div[text()='Go to bag']").click();
		 */
		
		
		 
	}
}
