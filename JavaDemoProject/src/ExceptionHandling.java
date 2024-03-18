public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of a class
		ExceptionHandling handling=new ExceptionHandling();
		handling.lengthString();
		

	}
	public void lengthString()
	{
		try {
		String s=null;
		System.out.println(s.length());//print length of String
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception is Handled Successfully!");
		}
		finally {
			System.out.println("There is no Runtime Exception");
		}
	}

}
