import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

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
		driver.get("https://jqueryui.com/droppable/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static Actions action()
	{
		return new Actions(driver);
	}
	public static void dragDrop()
	{
		WebElement frame_class=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame_class);
		Actions act=action();
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, destination).perform();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser();
		getAppURL();
		dragDrop();
	}

}
