public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create and Initialize 2 Dimensional Array
		
		//int[][] demo=new int[3][3];//row -3 , column-3
		
		String[][] demo= {{"Java","Python","C#"},{"PHP","C","C++"},{"BASIC","COBOL","FORTRAN"}};
		
		//Traversing Array
		for(int i=0; i<demo.length; i++)
		{
			for(int j=0; j<demo.length; j++)
			{
				System.out.print(demo[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
