package CTS.MultipleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Facebook
{
	static WebDriver driver;
    public static WebDriver getSetup()
    {
    	ChromeOptions option=new ChromeOptions();
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver(option);
    	return driver;
    }
    public static void getTheUrl()
    {
    	driver.get("https://facebook.com");
    	driver.manage().window().maximize();
    }
}
