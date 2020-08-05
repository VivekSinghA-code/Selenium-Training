package Week4.Assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		//row count
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> rowcount = driver.findElementsByXPath("//table//tr");
		
		int size = rowcount.size();
		
		System.out.println(size);
		
		//column count
		List<WebElement> columncount = driver.findElementsByXPath("//table//tr[2]/td");
		
		int size2 = columncount.size();
		System.out.println(size2);
		
		//progress value of learn to interact with elements
		 WebElement element = driver.findElementByXPath("//table//tr[3]/td[2]");
		System.out.println(element.getText());
		
		//clicking the checkbox
		WebElement element1 = driver.findElementByXPath("//table//tr[4]/td[3]/input");
		 element1.click();
		 
	}

}
