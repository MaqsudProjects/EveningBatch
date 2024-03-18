public class UserDefineMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*boolean b=true;
		
		//Ternary Operator
		String result=b==true?"True":"False";
		System.out.println(result);*/
		//UserDefineMethods udm=new UserDefineMethods();
		UDMethods udm=new UDMethods();
		//Call a user defined method
		String actual_result=udm.getEmployeeEmail("JohnSmith@gmail.com");
		//System.out.println("Employee Name::"+employee_name);
		String expected_result="John1Smith@gmail.com";
		
		if(expected_result.equals(actual_result))
		{
			System.out.println("Test Case is Passed!");
		}
		else
		{
			System.out.println("Test Case is Failed!");
		}
		
		
		String eid=udm.getEmployeeId("123456");
		System.out.println("Employee ID::"+eid);
		
		/*boolean validity_status=udm.courseValidity();
		System.out.println("Validation Status::"+validity_status);*/
		
		

	}
	
	
}
