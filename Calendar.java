package Week4.Assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		
		driver.findElementByXPath("//input[@id='datepicker']").click();
		driver.findElementByXPath("//table//tr[3]/td[2]").click();
		String text= driver.findElementByXPath("//table//tr[3]/td[2]").getText();
		System.out.println(text);
		
	}

}
