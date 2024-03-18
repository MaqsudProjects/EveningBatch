public class TestBank {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bank b,b1;
		b=new Axis();
		b1=new HDFC();
		System.out.println("Interest Rate of Axis::"+b.interestRate());
		System.out.println("Interest Rate of HDFC::"+b1.interestRate());
		
		/*Employee emp=new Employee();
		System.out.println("Name of the Company::"+emp.comp_name);
		System.out.println("Location of the company::"+emp.location);
		*/
		/*HSBC hsbc_bank=new HSBC();
		hsbc_bank.transaction();
		hsbc_bank.interestRate();*/
				
		
		/*Bank[] a=new Bank[3];
		a[0]=new Axis();
		a[1]=new HSBC();
		a[2]=new HDFC();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i].interestRate());
		}*/
		/*Bank b=new Bank(); //PolyMorphic Arguments with Parameters
		Axis a=new Axis();
		HSBC c=new HSBC();
		b.getName(a);
		b.getName(c);
		
		//DownCasting
		Axis a1=(Axis) new Bank(); 
		
		
		boolean status_equal=b.equals(c);
		System.out.println("Status of two objects b and a::"+status_equal);
				
		System.out.println(b.getClass());
		System.out.println(a.getClass());
		System.out.println(c.getClass());
		
		System.out.println(b.hashCode()); //It will represent hashcode of object b
		System.out.println(a.hashCode()); 
		System.out.println(c.hashCode()); 
		
		/*String s=new String("Radical Technology");
		System.out.println("HashCode of String s:::"+s.toString());*/
		/*System.out.println(b);
		System.out.println(b.toString());
		
		/*if(b.equals(b.toString()))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}*/
		/*TestBank tBank=new TestBank();
		String string_represent=b.toString();
		System.out.println("String convertion of Object::"+string_represent);
		
		//Object o
		//Object o=new TestBank();
		
		System.out.println(b instanceof Bank);//true
		System.out.println(a instanceof Bank);//true
		*/
		
		
	}
	/*public  String toString()
	{
		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		
	}*/
	
	
	
	

}
