public class Employee extends Company {
	
	String location="Pune";

	public void getLocation()
	{
		System.out.println("Pune");
		System.out.println(super.comp_name);
		super.companyName();
	}

}
