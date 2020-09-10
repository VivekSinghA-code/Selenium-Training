package testcases;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Nykaa {
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
		driver.get("https://www.nykaa.com/");
		WebElement brand = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();
		WebElement popular = driver.findElementByXPath("//div[@class='BrandsCategoryHeading']/a[1]");
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(popular).perform();
		driver.findElementByXPath("//a[@href='/brands/loreal-paris/c/595?eq=desktop']/img").click();

		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> listHandles = new ArrayList<String>(windowHandles);
		String secondWin = listHandles.get(1);
		driver.switchTo().window(secondWin);
		driver.findElementByXPath("//div[@id='sortComponent']").click();
		driver.findElementByXPath("//div[@for='3']/span").click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='HeaderNav']//a")).click();
		WebElement hair = driver.findElementByXPath("(//li[@class='MegaDropdownHeadingbox'])[3]/a");
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(hair).perform();
		// driver.findElementByLinkText("Shampoo").click();

		driver.findElement(
				By.xpath("//div[@id='my-menu']/ul[1]/li[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> listHandles2 = new ArrayList<String>(windowHandles2);
		String secondWin2 = listHandles2.get(2);
		driver.switchTo().window(secondWin2);
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElementByXPath("(//div[@class='clearfix'])[2]").click();
		driver.findElementByXPath("//div[@class='control__indicator']").click();
		Thread.sleep(20000);
		driver.findElementByXPath("(//img[@class='listing-img'])[6]").click();

		Set<String> windowHandles3 = driver.getWindowHandles();
		ArrayList<String> listHandles3 = new ArrayList<String>(windowHandles3);
		String secondWin3 = listHandles3.get(3);
		driver.switchTo().window(secondWin3);
		String title1 = driver.getTitle();
		System.out.println(title1);

		String rate = driver.findElement(By.xpath("//span[text()='150']")).getText();
		String ratefinal = rate.replaceAll("\\D", "");
		System.out.println(ratefinal);

		driver.findElementByXPath("//div[@class='pull-left']//button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='cursor-hand arrowup-tooltip']/div").click();
		String grandtotal = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
		// System.out.println(grandtotal);
		
		String grandtotal1 = grandtotal.replaceAll("\\D", "");
		System.out.println(grandtotal1);
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='second-col']/button").click();
		
		driver.findElementByXPath("(//button[@type='button'])[2]").click();
		String finaltext = driver.findElement(By.xpath("//i[@class='icon mr10']/following-sibling::div[1]")).getText();
		System.out.println(finaltext);
		driver.quit();

	}
}
