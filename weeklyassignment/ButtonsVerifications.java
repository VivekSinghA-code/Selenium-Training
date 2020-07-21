package weeklyassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsVerifications {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//opwninthe driver

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();


Point location = driver.findElementByXPath("//button[contains(text(),'Get Position')]").getLocation();
System.out.println("The location of the button is"+" "+location);
String c = driver.findElementByXPath("//button[@id='color']").getCssValue("Color");

System.out.println("Thecolor of the buton is"+ " "+c);

Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
System.out.println(size);

driver.findElementById("home").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
