import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * Requirement:
		 * -< File
		 * -< FileInputStream
		 * -< Properties
		 * -< getProperty(key,value);
		 * 
		 */
		//Create an object of File Class
		File f=new File(System.getProperty("user.dir")+"//TestData//Login.properties");
		try {
			//Create an object of FileInputStream
			FileInputStream fis=new FileInputStream(f);
			//Create an Object of Properties Class
			Properties prop=new Properties();
			//Load a properties file
			prop.load(fis);
			//Read and Display data in console
			String uname=prop.getProperty("username");
			String pass=prop.getProperty("password");
			
			//Print values
			System.out.println("Username of Application::"+uname);
			System.out.println("Password of Application::"+pass);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
