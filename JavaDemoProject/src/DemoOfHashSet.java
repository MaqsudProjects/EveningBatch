import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoOfHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<String>();
		//add element inside a queue
		set.add("Java"); //head
		set.add("Python");
		set.add("C#");
		set.add("Java");
		
		//Travesing elements
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
