package rough1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		driver.findElementByXPath("//a[@href='../home.html']").click();
		driver.findElementByXPath("//a[@class='wp-categories-link maxheight']").click();
		driver.findElementByXPath("//input[@id='email']").sendKeys("Vivek@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").clear();
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Append Text");
		String attribute = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");
		System.out.println(attribute);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
		
		driver.navigate().back();
		Thread.sleep(5000);
		//Button link
		driver.findElementByXPath("//img[@alt='Buttons' and @class='wp-categories-icon svg-image']").click();
		Thread.sleep(5000);
		System.out.println("clicked the buttons link");
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("//img[@alt='Buttons' and @class='wp-categories-icon svg-image']").click();
		Thread.sleep(2000);
		
		Point location = driver.findElementByXPath("//*[@id=\"position\"]").getLocation();
		
          System.out.println(location);
	String cssValue = driver.findElementByXPath("//button[@id='color']").getCssValue("color");
		
	System.out.println(cssValue);
	Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		
		System.out.println(size);
		driver.navigate().back();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		//hyperlink
		driver.findElementByXPath("//a[@class='wp-categories-link maxheight'][@href='pages/Link.html']").click();
		driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[1]").click();
		Thread.sleep(2000);
		System.out.println("Hyperlink testing");

		driver.findElementByXPath("//a[@class='wp-categories-link maxheight'][@href='pages/Link.html']").click();
		driver.findElementByXPath("//a[@href='Button.html' and contains(text(),'supposed')]").click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@href='error.html']").click();
		String brokenTitle = driver.getTitle();
		System.out.println(brokenTitle);
		driver.navigate().back();
		driver.findElementByXPath("(//a[@href='../home.html'][@style='color: #CC0000'])[2]").click();
		System.out.println("Completed hyperlink module");
		Thread.sleep(2000);

		// image driver.
		driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a").click();
		driver.findElementByXPath("(//div[contains(@class,'large-6')])[1]/img").click();
		driver.findElementByXPath("//a[@class='wp-categories-link maxheight'][@href='pages/Image.html']").click();
		String text = driver.findElementByXPath("//label[@for='position'][contains(text(),'Broken')]").getText();
		System.out.println(text);

		driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
		Thread.sleep(2000);
		System.out.println("Completed image module");

		  //dropdown
		  driver.findElementByXPath("//a[@class='wp-categories-link maxheight' and @href='pages/Dropdown.html']").click();      
		  WebElement Lb1 = driver.findElementByXPath("//select[@id='dropdown1']");
		  Select dropdown1= new Select(Lb1);
		  dropdown1.selectByIndex(1);
		  WebElement Lb2 = driver.findElementByXPath("//select[@name='dropdown2']");
		  Select dropdown2= new Select(Lb2);
		  dropdown2.selectByVisibleText("Appium");
		  WebElement Lb3 = driver.findElementByXPath("//select[@id='dropdown3']");
		  Select dropdown3= new Select(Lb3);
		  dropdown3.selectByValue("3");
		  
		  WebElement Lb4 = driver.findElementByXPath("//select[@class='dropdown']");
		  Select dropdown4= new Select(Lb4);
		  List<WebElement> options = dropdown4.getOptions();
		  int size2 = options.size();
		  System.out.println(size2);
		  
		  WebElement Lb5 = driver.findElementByXPath("(//div[@class='example'])[5]/select");
		  Select dropdown5= new Select(Lb5);
		  Actions action = new Actions(driver);
		  action.moveToElement(Lb5).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  
		  WebElement Lb6 = driver.findElementByXPath("(//div[@class='example'])[6]/select");
		  Select dropdown6= new Select(Lb6);
		  dropdown6.selectByVisibleText("Loadrunner");
		  driver.navigate().back();
		  Thread.sleep(2000);
		  
		  //radio button
		  driver.findElementByXPath("//a[@class='wp-categories-link maxheight'][@href='pages/radio.html']").click();
		  
		  driver.findElementByXPath("//input[@type='radio' and @id='yes']").click();
			Thread.sleep(2000);
		boolean b=	driver.findElementByXPath("(//input[@type='radio' and @name='news'])[2]").isSelected();
			
		System.out.println(b);	
			 driver.findElementByXPath("//input[@name='age' and @value='0']").click();
			
		Point s= driver.findElementByXPath("//input[@type='radio' and @value='2']").getLocation();
			
			System.out.println(s);
			driver.navigate().back();
			
			//checkbox
			driver.findElementByXPath("//img[@src='images/checkbox.png']").click();
			driver.findElementByXPath("//input[@type='checkbox']").click();
			driver.findElementByXPath("(//input[@type='checkbox'])[2]").click();
			
			boolean selected = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
			System.out.println(selected);
			
			
			driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
			driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
			driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
			driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
			driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
			driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
			
			driver.navigate().back();
			
			driver.manage().window().minimize();
			
		  //driver.close();
		 
		
		
		

	}

}
