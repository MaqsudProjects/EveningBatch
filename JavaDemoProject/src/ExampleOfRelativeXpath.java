import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfRelativeXpath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser();
		url();
		idenfyElementsXpath();
		closeBrowser();

	}
	public static WebDriver invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser Launched Successfully");
		return driver;
		
	}
	public static void url()
	{
		driver.get("https://www.facebook.com/");
		System.out.println("Browser got URL");
	}
	public static void idenfyElementsXpath() throws InterruptedException
	{
		//Identify Login elements through Relative Xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Radical@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234645");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("Xpath is successfully finds the elements");
	}
	public static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser is Closed Successfully");
	}
	
}
