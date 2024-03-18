import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalendar {

	public static String expected_month_year="April 2024";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		getAppURL();
		clickOnCalendar();
		boolean visibility=checkVisibilityCalendar();
		System.out.println("Visibility of Calendar control:: true/false::"+visibility);
		System.out.println("----------------------------------------------------------");
		String actualMonthYear=actualMonthYear();
		System.out.println("Actual Month and Year::"+actualMonthYear);
		compareMonthYear();

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
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void clickOnCalendar()
	{
		WebElement calendar_click=driver.findElement(By.id("datepicker1"));
		calendar_click.click();
	}
	public static boolean checkVisibilityCalendar()
	{
		boolean status=false;
		try {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#ui-datepicker-div")));
		status=true;
		}
		catch(Exception e)
		{
			status=false;
			System.out.println("Calendar is not visible!");
		}
		return status;
	}
	public static String actualMonthYear()
	{
		WebElement actual_month_year=driver.findElement(By.cssSelector("div.ui-datepicker-title"));
		return actual_month_year.getText();
	}
	public static void compareMonthYear() throws InterruptedException
	{
		while(true)
		{
			if(actualMonthYear().equals(expected_month_year))
			{
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Next']")).click(); //April 2024
			}
		}
		WebElement clickOnDate=driver.findElement(By.xpath("//a[text()='25']"));
		clickOnDate.click();
	}
	
}
