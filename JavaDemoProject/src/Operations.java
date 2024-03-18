public class Operations {
	
	static int staticVar=0;
	int nonStaticVar=0;
	
	public Operations()
	{
	staticVar++; //1
	nonStaticVar++;//1
	
	System.out.println("Static Variable Incrementation::"+staticVar);
	System.out.println("Non Static Variable Incrementation::"+nonStaticVar);
	
	}
		
	

}
