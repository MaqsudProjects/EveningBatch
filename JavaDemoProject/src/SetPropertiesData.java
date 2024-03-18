import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetPropertiesData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * File Object
		 * FileOutputStream
		 * Properties 
		 * setPropery(Key,Value)
		 * store()
		 * 
		 */
		File f=new File(System.getProperty("user.dir")+"//TestData//SignIn.properties");
		
		//To perform create and writing operation over the file
		/*FileOutputStream fos=new FileOutputStream(f);
		System.out.println("File is Successfully Created!");
		fos.close();*/
		
		Properties prop=new Properties();
		prop.setProperty("name", "Selenium Java");
		prop.setProperty("city", "Pune");
		
		prop.store(new FileWriter(f),"Training Username and Location");
		System.out.println("Data is Successfully Written in Properties file");
		
		
		
		

	}

}
