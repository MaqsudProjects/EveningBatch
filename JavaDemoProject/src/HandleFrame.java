import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandleFrame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		invokeBrowser();
		getAppURL();
		int noOfFrames=countFrame();
		System.out.println("Number of Frames present inside application::"+noOfFrames);
		System.out.println("------------------------------------------------------------");
		String textMsg=captureMsg();
		System.out.println("Caption Message is::"+textMsg);
		captureScreenshot(driver,"frame");

	}
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
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static int countFrame()
	{
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		return list.size();
	}
	public static void switchToFrame()
	{
		driver.switchTo().frame("mce_0_ifr");
	}
	public static String captureMsg()
	{
		switchToFrame();
		WebElement caption=driver.findElement(By.id("tinymce"));
		return caption.getText();
	}
	public static void captureScreenshot(WebDriver driver,String filename) throws IOException {
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//setting up the screenshot inside Screenshot folder
		FileHandler.copy(f, new File("Screenshot//"+filename+".png"));
		System.out.println("Screenshot successfully captured!");
		
	}
	
}
