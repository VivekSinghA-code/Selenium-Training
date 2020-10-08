package testcases;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonPhone {

	@Test
	public void TC001() throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 7 pro mobiles");
		
		  Actions action=new Actions(driver);
		  action.sendKeys(Keys.ENTER).build().perform();
		  String onePlusPro = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		  String replaceAll = onePlusPro.replaceAll("\\D","");
		  System.out.println(replaceAll);
		  int value= Integer.parseInt(replaceAll);
		  //System.out.println(value);
		  driver.findElement(By.xpath("//img[@data-image-index='2']")).click();
		  Set<String> windowHandles= driver.getWindowHandles();
		  ArrayList<String> listHandles= new ArrayList<String>(windowHandles);
		  String secondWindow=listHandles.get(1);
		  driver.switchTo().window(secondWindow);
		  String rating = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']")).getText();
		  System.out.println("The number of rating is- "+ rating);
		  String replaceAll2 = rating.replaceAll("\\D", "");
		  System.out.println("The rating without the comma"+ replaceAll2);
		  
		  driver.findElement(By.id("add-to-cart-button")).click();
		  String addedToCart = driver.findElement(By.xpath("(//h4[@class='a-alert-heading'])[3]")).getText();
		  System.out.println("The confirmation text is displayed as "+ addedToCart);
		  driver.findElement(By.cssSelector("span#attach-sidesheet-checkout-button>span>input")).click();
		  String title= driver.getTitle();
		  System.out.println(title);
		  if(title.contains("Amazon")){
				  
			  System.out.println("The page is correct");
				  }
		  else
		  {
			  System.out.println("The page is wrong");
		  }
		  
	  driver.quit();
		  

}
}