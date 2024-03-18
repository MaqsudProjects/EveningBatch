import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter user_Id::");
		String user_id=sc.next();
		System.out.println("User ID::"+user_id);
		System.out.println("-------------------------------------");
		
		System.out.println("Enter user_Name::");
		String user_Name=sc.next();
		System.out.println("User Name::"+user_Name);
		
		//close scanner
		sc.close();

	}

}
