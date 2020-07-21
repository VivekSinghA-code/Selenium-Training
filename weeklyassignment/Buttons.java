package weeklyassignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='email']").sendKeys("test@gmail.com");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Append Test");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
		String attribute = driver.findElementByXPath("//input[@name='username' and @value='TestLeaf']").getAttribute("value");
		System.out.println(attribute);
		driver.findElementByXPath("(//input[@type='text' and @name= 'username'])[2]").clear();
		boolean enabled = driver.findElementByXPath("//input[@type='text'and @disabled='true']").isEnabled();
		System.err.println(enabled);
		
		
		
		

	}

}
