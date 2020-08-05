package Week4.Assignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraginPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
	    Point location = driver.findElementByXPath("//li[text()='Item 4']").getLocation();
		
		int x= location.getX();
		int y= location.getY();
		
		Actions builder= new Actions(driver);
		
		builder.dragAndDropBy(item1, x, y).perform();
		
		
		
	}

}
