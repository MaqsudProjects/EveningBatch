import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptPopup {
	
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
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void clickonAlertButton()
	{
		WebElement click_button_Alert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		click_button_Alert.click();
	}
	public static boolean isAlertPresent()
	{
		boolean status=false;
		//Create an object of webdriverwait
		try {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		status=true;
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("No Such Alert Present in UI!");
			status=false;
		}
		return status;
	}
	public static Alert switchToAlert()
	{
		//Switch to alert
		return driver.switchTo().alert();
	}
	public static String captureText()
	{
		//Get the text value from alert popup
		return switchToAlert().getText();
	}
	public static void verifyCaption()
	{
		//Verify the caption value
		String actual_result_text=captureText();
		String expected_result_text="I am a JS Alert";
		
		if(actual_result_text.equals(expected_result_text))
		{
			System.out.println("Test Case is passed Successfully!");
		}
		else
		{
			System.out.println("Test Case is failed Successfully!");
		}
		
	}
	public static void clickOnOK() throws InterruptedException
	{
		Thread.sleep(2000);
		switchToAlert().accept();
		System.out.println("OK button is Clicked Successfully!");
	}
	public static void clickOnConfirmButton()
	{
		WebElement click_confirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		click_confirm.click();
	}
	public static void clickOnCancel() throws InterruptedException
	{
		Thread.sleep(2000);
		switchToAlert().dismiss();
		System.out.println("Cancel button is Successfully Clicked!");
		
	}
	public static void verifyMsgCancel()
	{
		WebElement cancel_msg=driver.findElement(By.id("result"));
		String actual_result=cancel_msg.getText();
		
		if(actual_result.contains("Cancel"))
		{
			System.out.println("Message Contains: Cancel");
		}
		else
		{
			System.out.println("Message Does not contain Cancel!");
		}
		
	}
	public static void clickOnPrompt()
	{
		WebElement clickPrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		clickPrompt.click();
	}
	public static void setValuePrompt() throws InterruptedException
	{
		switchToAlert().sendKeys("Automation Testing using Selenium!");
		Thread.sleep(2000);
		switchToAlert().accept();
	}
	
	public static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Browser Successfully Closed!");
	}
	
}
