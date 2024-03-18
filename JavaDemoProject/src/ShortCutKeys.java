import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShortCutKeys {

	static WebDriver driver;
	public static void invokeBrowser() 
	{
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	public static  void getAppURL()
	{
		//Get the URL
		driver.get("https://formy-project.herokuapp.com/form");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void keyboardKeys() throws InterruptedException
	{
		WebElement fname=driver.findElement(By.id("first-name"));
		fname.sendKeys("John");
		Thread.sleep(2000);
		fname.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		fname.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys(Keys.CONTROL+"v");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		getAppURL();
		keyboardKeys();
		

	}

}
