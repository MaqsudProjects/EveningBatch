import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*****
		 * Steps to create a file in java-< text file
		 * -< Create an object of File class
		 * -< Create an object FileWriter class
		 * -< Create an object of BufferedWriter class
		 * */
		
		File f= new File("Login.txt");
		
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		//System.out.println("File is Successfully Created!");
		String email="abc@gmail.com";
		String password="1234566";
		bw.write(email);
		bw.newLine();
		bw.write(password);
		bw.close();
		System.out.println("Data is Successfully written inside the file");
		
		
		
		
		

	}

}
