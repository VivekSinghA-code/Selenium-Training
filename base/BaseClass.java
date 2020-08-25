package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postcondition(){
		driver.close();
		
		
	}
	
	
}
