import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	static WebDriver driver;
	static File f;
	static FileInputStream fis;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		System.out.println("Chrome Browser Successfully Launched!");
		
		driver.get("https://webapps.tekstac.com/FormRegistration/FormRegistration.html");
		f=new File(System.getProperty("user.dir")+"//TestData//Sample.xls");
		fis=new FileInputStream(f);
		
		
		
		
		

	}

}
