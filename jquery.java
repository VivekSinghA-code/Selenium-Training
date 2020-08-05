package Week4.Assignments;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElementByTagName("iframe");
		driver.switchTo().frame(frame);
				
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		//driver.executeScript("arguments[0].scrollIntoView();", item3);
		//driver.executeScript("window.scrollBy(0,100)");
		driver.executeScript("arguments[0].click();", item3);
		Actions builder= new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();
	
		
		
		
		
		

	}

}
