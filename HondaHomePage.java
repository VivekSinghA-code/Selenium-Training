package testcases;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HondaHomePage {

	@Test
	public void Home() throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		Thread.sleep(5000);	
		driver.findElement(By.className("close")).click();
		driver.findElement(By.id("link_Scooter")).click();
		driver.findElement(By.xpath("//div[@id='scooter']/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		driver.findElement(By.linkText("Specifications")).click();
		Thread.sleep(3000);
		WebElement engine = driver.findElement(By.linkText("ENGINE"));
		Actions builder = new Actions(driver);
		builder.moveToElement(engine).perform();
		String cc = driver.findElement(By.xpath("//span[text()='109.51cc']")).getText();
		String ccnum = cc.replaceAll("[a-z]", "");
		System.out.println(ccnum);
		double c1 = Double.parseDouble(ccnum);
		Thread.sleep(5000);
		driver.findElement(By.id("link_Scooter")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='/assets/images/thumb/activa-125new-icon.png']")).click();
		driver.findElement(By.linkText("Specifications")).click();
		WebElement engine2 = driver.findElement(By.linkText("ENGINE"));
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(engine2).perform();
		String cc2 = driver.findElement(By.xpath("//span[text()='124 cc']")).getText();
		String ccnum2 = cc2.replaceAll("\\D", "");
		int c2 = Integer.parseInt(ccnum2);
		System.out.println("The displacement of 125 engine is " + c2);

		if (c1 > c2) {
			System.out.println("Dio has better displacement");
		} else {
			System.out.println("Activa 125 has better displacement");
		}

		driver.findElement(By.xpath("//a[@href='/FAQ']")).click();
		driver.findElement(By.linkText("Activa 125 BS-VI")).click();
		Thread.sleep(2000);
		int len=driver.findElement(By.xpath("//a[@href='#6a']")).getLocation().getY();
		driver.executeScript("scroll(0,"+len+");");
		driver.findElement(By.xpath("//a[@href='#6a']")).click();
		driver.findElement(By.id("submit6")).click();
		driver.findElement(By.xpath("//table[@rules='all']//a[1]")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		ArrayList<String> listHandles= new ArrayList<String>(windowHandles);
		String secondWindow= listHandles.get(1);
		driver.switchTo().window(secondWindow);
		WebElement statelist = driver.findElementByXPath("//select[@id='StateID']");
		Select dropdown=new Select(statelist);
		dropdown.selectByValue("28");
		WebElement citylist = driver.findElementByXPath("//select[@id='CityID']");
		Select dropdown1=new Select(citylist);
		dropdown1.selectByVisibleText("Chennai");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		List<WebElement> allRows=driver.findElementsByXPath("//table//tr");
		int size=allRows.size();
		for (int i=2; i <=size;i++) {
			List<WebElement> allCells=driver.findElementsByXPath("//table//tr["+i+"]/td");
			int cellCount=allCells.size();
			for(int j=1; j<=cellCount;j++) {
				String text=driver.findElementByXPath("//table//tr["+i+"]/td["+j+"]").getText();
				System.out.println(text+" ");
				
			}
			System.out.println();
		}
		
		}

}
