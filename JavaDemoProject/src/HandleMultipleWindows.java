import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
		
	static WebDriver driver;
	public static void invokeBrowser()
	{
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	public static  void getAppURL() throws InterruptedException
	{
		//Get the URL
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Get the UNIQUE Id of the windows
		String current_id=driver.getWindowHandle();
		//System.out.println("Unique ID of Parent Window::"+current_id);*/
		
		//Click on Link
		WebElement click_Here=driver.findElement(By.linkText("Click Here"));
		click_Here.click();
		
		//Get the unique Id of windows
		Set<String> str_ids=driver.getWindowHandles();
		//System.out.println(str_ids);
		
		//Traverse from one tab to another
		Iterator<String> it=str_ids.iterator();
		
		//while loop to navigate from parent to child
		while(it.hasNext()) //true
		{
			String child_window=it.next();
			
			if(!current_id.equals(child_window))
			{
				driver.switchTo().window(child_window);
				
				System.out.println(driver.switchTo().window(child_window).getTitle());
				
				Thread.sleep(2000);
				
				driver.close();
				
			}
			
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		getAppURL();

	}
	
	
	
}
