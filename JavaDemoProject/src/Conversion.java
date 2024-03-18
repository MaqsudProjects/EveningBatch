public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Converting int to Integer
	/*	int i=10;//Primitive Data Type
		
		Integer j=Integer.valueOf(i);
		Integer k=i; //autoboxing, 
		
		System.out.println(i+" "+j+" "+k);*/
		
		@SuppressWarnings("removal")
		Integer a=new Integer(5); //Wrapper convert into primitive
		int i=a.intValue();//Explicitly Conversion-< unboxing
		int k=a;
		System.out.println(a+" "+i+" "+k); 
		
		
		
		

	}

}
