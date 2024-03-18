import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListofData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of ArrayList
		List<Object> list1=new ArrayList<Object>();//Generic Object
		
		//Add value inside a list
		list1.add("Python");
		list1.add("Java");
		list1.add("C#");
		list1.add("Ruby");
		
		
		//Remove an element from given list
		//list1.remove(true);
		
		System.out.println(list1);
		System.out.println("-------------------------------------------------------------");
		
		
		//Check whether C# is present inside a list or not
		boolean search_result=list1.contains("PHP");
		
		if(search_result)
		{
			System.out.println("PHP is Present in the list");
		}
		else
		{
			System.out.println("PHP is not present in the list");
		}
		System.out.println("-------------------------------------------------------------------");
		
		//Get method  is used to retrieve the element from the list based on index
		String data=(String) list1.get(2);
		System.out.println("The element at the index 2 is::"+data);
		//
		System.out.println("-------------------------------------------------------------------");

		boolean status=false;
		if(list1.isEmpty())
		{
			status=true;
			System.out.println(status);
		}
		else
		{
			status=false;
			System.out.println(status);
		}
		System.out.println("-----------------------------------------------------------------");
		//Get size of the arraylist
		int countNoItems=list1.size();
		System.out.println("No.of Elements::"+countNoItems);
		
		System.out.println("-----------------------------------------------------------------");
		
		//to get the position of an item from the list-< indexOF()
		int position_index_element=list1.indexOf("Java");
		System.out.println("Index where Java store::"+position_index_element);
		
		System.out.println("-----------------------------------------------------------------");
		Iterator<Object> itr=list1.iterator();
		
		//traversing through iterator
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"||");
		}
		
		
		
		

	}

}
