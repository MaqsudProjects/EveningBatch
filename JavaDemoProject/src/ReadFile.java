import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*****
		 * Steps to create a file in java-< text file
		 * -< Create an object of File class
		 * -< Create an object FileReader class
		 * -< Create an object of BufferedReader class
		 * */
		
		File f= new File("Login.txt");
		
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);
		
		String r=null;
		while((r=br.readLine())!=null) //true
		{
			System.out.println(r);
		}
		br.close();
		

	}

}
