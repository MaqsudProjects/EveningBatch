public class NonAccessModifiers  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonAccessModifiers modifiers=new NonAccessModifiers();
		//System.out.println("Division of two numbers::"+c);
		modifiers.divisionException();
	
		
		

	}
	public void divisionException()
	{
		int a=10;
		//int b=0;// zero
		
		//int c=a/b; //Risky Code
		if(a==10)
		{	
			throw new ArithmeticException("Exception is Generated and Managed! and Thrown"+a);
		}
	}
	
}
