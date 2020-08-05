package Week4.Assignments;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickInsideFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Click Me']").click();
		driver.switchTo().defaultContent();
		
		//nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Click Me']").click();
		driver.switchTo().defaultContent();
		
		// number of frames
		java.util.List<WebElement> framelist = driver.findElementsByTagName("iframe");
		System.out.println(framelist.size());
		
		driver.close();

	}

}
