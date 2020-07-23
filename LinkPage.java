package weeklyassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElementByXPath("//a[@href='Button.html']").click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElementByXPath("//a[@href='error.html']").click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElementByXPath("//a[@link='blue' and @href='../home.html']").click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElementByXPath("//a[@href='#']").click();
		 String title = driver.getTitle();
		 System.out.println(title);
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		

	}

}
