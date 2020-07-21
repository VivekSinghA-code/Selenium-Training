package weeklyassignment;



import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		driver.findElementByXPath("//div[@class='example']//input").click();
		driver.findElementByXPath("//div[@class='example']/div[2]/input").click();
		driver.findElementByXPath("//div[@class='example']/div[3]/input").click();
		boolean enabled = driver.findElementByXPath("//div[@class='example']/div").isEnabled();
		
		System.out.println(enabled);
		driver.findElementByXPath("//label[@for ='java' and text()='DeSelect only checked']/following::input[2]").click();
		driver.findElementByXPath("//label[@for ='java' and text()='Select all below checkboxes ']/following::input[1]").click();
		driver.findElementByXPath("//label[@for ='java' and text()='Select all below checkboxes ']/following::input[2]").click();
		driver.findElementByXPath("//label[@for ='java' and text()='Select all below checkboxes ']/following::input[3]").click();
		driver.findElementByXPath("//label[@for ='java' and text()='Select all below checkboxes ']/following::input[4]").click();
		driver.findElementByXPath("//label[@for ='java' and text()='Select all below checkboxes ']/following::input[5]").click();
	    driver.close();
	
	}
	

}
