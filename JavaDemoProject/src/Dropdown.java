import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
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
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static int countNoDropdown()
	{
		//Count number of dropdown
		List<WebElement> list=driver.findElements(By.tagName("select"));
		return list.size();
		
	}
	public static Select applyDropDown() 
	{
		return new Select(driver.findElement(By.id("Skills")));
	}
	public static boolean isDropdownMultiple()
	{
		return applyDropDown().isMultiple();
	}
	public static void selectValue() throws InterruptedException
	{
		driver.findElement(By.id("Skills")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		applyDropDown().selectByIndex(4);  //Android
	}
	public static String selectFirstValue()
	{
		WebElement first_element=applyDropDown().getFirstSelectedOption();
		return first_element.getText();
		
	}
	public static void listOfValues()
	{
		List<WebElement> list=applyDropDown().getOptions();
		System.out.println("Values present inside the dropdown");
		for(WebElement value:list)
		{
			System.out.println(value.getText());
		}
	}
	public static void verifySelectedValue()
	{
		WebElement selectOption=applyDropDown().getFirstSelectedOption();
		String actual_selected_value=selectOption.getText();
		String expected_value="Android";
		
		if(actual_selected_value.equals(expected_value))
		{
			System.out.println("Test Case is passed!");
		}
		else
		{
			System.out.println("Test Case is Failed!");
		}
	}
	public static void closeTheBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
		System.out.println("Browser is Successfully Closed!");
	}
}
