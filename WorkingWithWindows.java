package Week4.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		//home page
		driver.findElementByXPath("//button[@id='home']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		
		//open multiple windows
		
				driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
				Set<String> windowHandles3 = driver.getWindowHandles();
				List<String>Winhandle3= new ArrayList<String>(windowHandles3);
				System.out.println(windowHandles3.size());
				driver.switchTo().window(Winhandle3.get(1));
				driver.close();
				driver.switchTo().window(Winhandle3.get(2));
				driver.close();
				driver.switchTo().window(Winhandle3.get(0));
		
		
		
		// close the browsers
		driver.findElementByXPath("//button[@onclick='openWindows()']").click();
		Set<String> windowHandles5 = driver.getWindowHandles();

		List<String> windows5 = new ArrayList<String>(windowHandles5);
		driver.switchTo().window(windows5.get(1));
		driver.close();
		driver.switchTo().window(windows.get(0));  
		 				
		// wait for 5 seconds
		driver.findElementByXPath("//label[text()='Wait for 2 new Windows to open ']/following-sibling::button").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> windowHandlesopen = driver.getWindowHandles();
		List<String> window123= new ArrayList<String>(windowHandlesopen);
		System.out.println("The number of windows in the list is"+ window123.size());
		String closewindow1=window123.get(1);
		driver.switchTo().window(closewindow1);
		driver.close();
		
		String closewindow2=window123.get(2);
		driver.switchTo().window(closewindow2);
		driver.close();
		
		String closewindow3=window123.get(3);
		driver.switchTo().window(closewindow3);
		driver.close();

		String closewindow0=window123.get(0);
		driver.switchTo().window(closewindow0);
		driver.close();
		
		System.out.println("Completed");
	}

}
