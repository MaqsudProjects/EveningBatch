import java.io.Console;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//invoke Browser
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
					
		//get the url
		driver.get("https://facebook.com");
		
		JavaScriptExecutorDemo demo=new JavaScriptExecutorDemo();
		
		//JavaScriptExecutor apply with find element
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url_app=js.executeScript("return document.URL").toString();
		System.out.println(url_app);
		//js.executeScript("document.getElementById('email').value='Radical@gmail.com'");
		//js.executeScript("document.getElementById('pass').value='123@456'");
		Thread.sleep(2000);
		//js.executeScript("document.getElementsByName('login')[0].click()");
		Thread.sleep(2000);
		///js.executeScript("window.scrollBy(0,200)");
		//Get the title
		Object title=js.executeScript("return document.title").toString();
		System.out.println(title);
		
		Object email=js.executeScript("return document.getElementById('email')");
		((WebElement) email).sendKeys("Radical@gmail.com");
		
		String email_id=(String) js.executeScript("return document.getElementById('email').value");
		System.out.println(email_id);
		//driver.close();
		
		Object password=js.executeScript("return document.getElementById('pass')");
		((WebElement)password).sendKeys("123456");
		
		String pass=(String) js.executeScript("return document.getElementById('pass').value");
		System.out.println(pass);
		
		
		
	}

}
