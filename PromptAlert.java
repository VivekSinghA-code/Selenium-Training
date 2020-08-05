package Week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		
		Thread.sleep(2000);
		
		 // driver.switchTo().defaultContent();
		  
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Vivek");
		alert.accept();
		WebElement text = driver.findElementByXPath("//p[@id='demo']");

		
		  System.out.println(text.getText());
		  String text2 = text.getText();
		  if (text2.contains("Vivek")) {
			  System.out.println("Pass");
		  }
		  else {
			  System.out.println("fail");
		  }
	}

}
