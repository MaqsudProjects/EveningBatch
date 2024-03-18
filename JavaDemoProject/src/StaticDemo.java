public class StaticDemo {

	//Variable Declare
	static int roll_no;
	static String name;
	static String location="Pune"; //static
	
	public StaticDemo(int r,String n)//Parameterized Constructor
	{
		roll_no=r;
		name=n;
	}
	//create a user define method
	public static void display()
	{
		System.out.println(roll_no+"\n"+name+"\n"+location);
	}
	public static void courseName()
	{
		System.out.println("Software Testing Combo!");
	}
	public static int staticMethod()
	{
		return (int) (Math.random()*5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StaticDemo(101,"Automation Testing");
		StaticDemo.display();
		StaticDemo.courseName();
		double random_value=staticMethod();
		System.out.println("Random Value is::"+random_value);
		
	}

}
