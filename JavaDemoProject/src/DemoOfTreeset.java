import java.util.Iterator;
import java.util.TreeSet;

public class DemoOfTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object of Treeset
		TreeSet<String> treeValue=new TreeSet<String>();
		
		System.out.println("Ascending Order Data::");
		treeValue.add("Python");
		treeValue.add("Php");
		treeValue.add("Java");
		
		//Traversing Elements
		Iterator<String> itr=treeValue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Descending Order Data::");
		Iterator<String> itr1=treeValue.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
			

	}

}
