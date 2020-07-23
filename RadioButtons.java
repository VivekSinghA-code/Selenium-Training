package weeklyassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();

		
		driver.findElementByXPath("//input[@type='radio' and @id='yes']").click();
		Thread.sleep(2000);
	boolean b=	driver.findElementByXPath("(//input[@type='radio' and @name='news'])[2]").isSelected();
		
	System.out.println(b);	
		 driver.findElementByXPath("//input[@name='age' and @value='0']").click();
		
	Point s= driver.findElementByXPath("//input[@type='radio' and @value='2']").getLocation();
		
		System.out.println(s);
		driver.quit();
		
		
		
		
		
		

	}

}
