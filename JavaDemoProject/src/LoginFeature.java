import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LoginFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare List
		List<String> list=new LinkedList<String>();
		
		
		System.out.println("Login Field is Empty::"+list.isEmpty()); //true
		//Add
		System.out.println("User Name and Passowor!");
		list.add("Radical@gmail.com");
		list.add("123456");
		
		list.add("Radical@gmail.com");
		
		System.out.println(list.toString());
		System.out.println("Login Fields are not Empty::"+list.isEmpty());//false
		//Check whether the list is empty or not
		
		//Check whether the username is expected or not
		Boolean expected_result=list.contains("abc@gmail.com");
		System.out.println("Email/Username is Present inside the list::"+expected_result);
		
		String password=list.get(1);
		System.out.println(password);
		
		
		
	}

}
