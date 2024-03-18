import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

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
		driver.get("https://www.amazon.in/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static Actions action()
	{
		return new Actions(driver);
	}
	public static void mouseOpeations() throws InterruptedException
	{
		Actions act=action();
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		Thread.sleep(1000);
		act.contextClick(driver.findElement(By.id("nav-link-accountList"))).perform();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		getAppURL();
		mouseOpeations();
		
		

	}

}
