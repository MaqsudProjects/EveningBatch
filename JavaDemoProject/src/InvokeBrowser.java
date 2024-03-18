import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokeBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create an object of Chrome Driver
		/*System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Browser Successfully Launched!");
		*/
		
		//Create an object of Firefox Driver
		/*System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Firefox Browser Successfully Launched!");*/
		
		//Create an object of internet explorer 
		/*System.setProperty("webdriver.edge.driver", "Drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		System.out.println("Edge Browser Successfully Launched!");
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name::");
		String browserName=sc.next();
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			 driver=new ChromeDriver();
			System.out.println("Chrome Browser Successfully Launched!");
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			 driver=new FirefoxDriver();
			System.out.println("Firefox Browser Successfully Launched!");
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "Drivers//msedgedriver.exe");
			driver=new EdgeDriver();
			System.out.println("Edge Browser Successfully Launched!");
		}
		
		//After Launching a browser kindly get the url
		driver.get("https://www.facebook.com/");
		
			
		//Maximize the window
		driver.manage().window().maximize();
		
		System.out.println("-----------------------------------------------------------------------");
		
		
		//Synchronization using implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Get Title of an application
		String title_Application=driver.getTitle();
		System.out.println("Title of the application::"+title_Application);
		System.out.println("-----------------------------------------------------------------------");
		
		//Get the URL of an application
		String current_URL=driver.getCurrentUrl();
		System.out.println("URL of the application::"+current_URL);
		
		//Waiting time for to close the browser
		Thread.sleep(2000);
		
		System.out.println("-----------------------------------------------------------------------");
		//clickOnLink();
		//verfyURL();
		formLogin();
		//applyAbsoluteXpath();
		explicitWaitApply();
		closeTheBrowser();
		//Verify title of the given application
		/*String actual_title=driver.getTitle();
		String expected_title="Facebook – log in or sign up";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Successfully Verified!");
		}
		else
		{
			System.out.println("Both are different!");
		}
		*/
		
		
		//Insert value in Email TextBox
	/*	driver.findElement(By.id("email")).sendKeys("Radical@gmail.com");
		
		//Waiting time for to close the browser
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).clear();
		
		//Waiting time for to close the browser
		Thread.sleep(3000);
		
		//Click on Login Button
		driver.findElement(By.tagName("button")).submit();
		
		//Waiting time for to close the browser
		Thread.sleep(5000);
		
		//Close the Browser by using close command
		//driver.close();
		
		System.out.println("-------------------------------------------------------------------------");
	//	System.out.println("Browser Successfully Close!");
		
		boolean checkEnabled=checkEmailEnable();
		System.out.println("Is CheckBox Enabled or not True/False::"+checkEnabled);
		
		System.out.println("-------------------------------------------------------------------------");
		
		boolean element_display=checkLoginButtonDisplay();
		System.out.println("Element is Displayed or not::True/False:::"+element_display);

	clickOnLink()
	}
	public static boolean checkEmailEnable()
	{
		WebElement email_id=driver.findElement(By.id("email"));
		return email_id.isEnabled();
		
	}
	public static boolean checkLoginButtonDisplay()
	{
		WebElement login_id=driver.findElement(By.name("login"));
		return login_id.isDisplayed();
		
	}
	*/
	//	selectRadioButton();
		//boolean collegeIsSelected=collegeSelected();
		//System.out.println("College is Selected or not:: True/False::"+collegeIsSelected);
	}
	/*public static void selectRadioButton()
	{
		WebElement college_button=driver.findElement(By.id("radio-button-2"));
		college_button.click();
	}
	public static boolean collegeSelected()
	{
		WebElement college_button=driver.findElement(By.id("radio-button-2"));
		return college_button.isSelected();
	}*/
	
	
	/*public static void clickOnLink()
	{
		//WE can utilize linkText Locator for to identify link from the  application
		WebElement form_Link=driver.findElement(By.linkText("Form"));
		form_Link.click();
	}*/
	/*public static void verfyURL()
	{
		String expected_url="https://formy-project.herokuapp.com/form";
		String actual_url=driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url))
		{
			System.out.println("Test Case is Passed!");
		}
		else
		{
			System.out.println("Test Case is Failed!");
		}
	}*/
	public static void formLogin() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#email")).sendKeys("Radical@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12646");
		Thread.sleep(1000);
		
	}
	/*public static void applyAbsoluteXpath()
	{
		//Identify a link through PartialLinkText() Locator
		WebElement login_link=driver.findElement(By.cssSelector("button[name='login']"));
		login_link.click();
	}*/
	public static void explicitWaitApply()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[name='login']")));
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
	
	public static void closeTheBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		
	}
		
	
}
