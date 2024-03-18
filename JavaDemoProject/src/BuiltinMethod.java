public class BuiltinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		BuiltinMethod method=new BuiltinMethod();
		int value=method.inbuilt_method();
		System.out.println(value);
		
	}
	public int inbuilt_method()
	{
		int random_value=(int) (Math.random()*4);
		//System.out.println(random_value);
		return random_value;
		
	}
	

}
