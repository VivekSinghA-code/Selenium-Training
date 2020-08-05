package Week4.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragme {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElementByTagName("iframe");
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElementById("draggable");
		
		WebElement target = driver.findElementById("droppable");
		
		Actions builder= new Actions(driver);
		
		builder.dragAndDrop(source, target).perform();
		
		
		
		
		
		

	}

}
