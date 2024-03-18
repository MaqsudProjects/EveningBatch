public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int
		/*int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;*/
		
		//Single Dimensional Array
		//int a[]={1,2,3,4,5}; //Create and declare array
		
		
		
		//System.out.println(a[1]); //2
		
		//System.out.println(a[2]);
		
		//Length of the array
		/*int length_array=a.length;
		
		System.out.println("Size of the Array::"+length_array);
		*/
		
		//Traversing Array
		/*for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		
		String a[]=getValue();
		
		/*for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		for(String s:a)
		{
			System.out.println(s);
		}
		
		
		
	}
	public static String[] getValue()
	{
		return new String[]{"Python","Java"};
	}
	

}
