package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Snapdeal {
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
		driver.get("https://www.snapdeal.com");
		WebElement toys = driver.findElementByXPath("(//span[@class='catText'])[8]");
		Actions builder = new Actions(driver);
		builder.moveToElement(toys).perform();
		driver.findElement(By.xpath("//span[text()='Educational Toys']")).click();
		Thread.sleep(3000);
		int y = driver.findElement(By.xpath("//label[@for='avgRating-4.0']")).getLocation().getY();
		driver.executeScript("scroll(0,"+ y +");");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='avgRating-4.0']/following-sibling::label[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='discount-40%20-%2050']")).click();
		int y1 = driver.findElement(By.xpath("(//input[@class='sd-input'])[2]")).getLocation().getY();

		driver.executeScript("scroll(0,"+y1+");");
		driver.findElement(By.xpath("(//input[@class='sd-input'])[2]")).sendKeys("600002");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//img[@class='product-image wooble']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> listHandles = new ArrayList<String>(windowHandles);
		String secondWindow = listHandles.get(1);
		driver.switchTo().window(secondWindow);
		String price = driver.findElement(By.xpath("//span[@itemprop='price']")).getText();
		System.out.println(price);
		driver.findElement(By.id("add-cart-button-id")).click();
		driver.findElement(By.id("inputValEnter")).sendKeys("handwash & sanitizers vedic valley");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='product-image ']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> listHandles2 = new ArrayList<String>(windowHandles2);
		String thirdWindow = listHandles2.get(2);
		driver.switchTo().window(thirdWindow);
		String price2 = driver.findElement(By.xpath("//span[@itemprop='price']")).getText();
		System.out.println("Price of sanitizer is" + price2);
		int int1=Integer.parseInt(price);
		int int2=Integer.parseInt(price2);
		int price3 = int1 + int2;
		System.out.println("Total cost of two items is" + price3);
		driver.quit();

	}
}