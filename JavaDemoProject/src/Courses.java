public class Courses  extends Institute{
	
	static Courses course;
	public static void main(String[] args) {
		
		/*Institute c=new Courses();
		Institute d=new TechnicalCourses();
		
		//Check Equality of two objects
		System.out.println(d.equals(c));*/
		
		/*@SuppressWarnings("removal")
		Integer first_value=new Integer(10);
		Integer second_value=new Integer(20);
		
		if(first_value.equals(second_value))
		{
			System.out.println("Objects are Same!");
		}
		else
		{
			System.out.println("Objects are not Same!");
		}*/
		course=new Courses();
		boolean current_status=course.equalityOfTwoObjects(20);
		System.out.println("Class objects are equal or not :: True/False::"+current_status);
		Class demo=Courses.getClassName();
		System.out.println("Name of the Class::"+demo);
		
		
	}
	public boolean equalityOfTwoObjects(Integer second_value)
	{
		boolean status=false;
		Integer first_value=new Integer(10);
		if(first_value.equals(second_value))
		{
			status=true;
			return status;
		}
		else
		{
			status=false;
			
		}
		return status;	
	}
	public static  Class getClassName()
	{
		//System.out.println(course.getClass());
		return course.getClass();
	}
	

}
