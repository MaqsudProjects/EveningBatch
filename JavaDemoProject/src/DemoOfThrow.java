public class DemoOfThrow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//DemoOfThrow demo=new DemoOfThrow();
		ageOfVote(20);
				

	}
	public static void ageOfVote(int age) throws Exception
	{
		try {
		if(age<18)
		{
			throw new Exception("Age is not applicable for casting a vote!");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exception Handled Successfully");
		}
		
	}
}
