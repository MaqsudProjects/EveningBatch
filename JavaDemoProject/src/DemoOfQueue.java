import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoOfQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue=new PriorityQueue<String>();
		
		//add element inside a queue
		queue.add("Java"); //head
		queue.add("Python");
		queue.add("C#");
		
		System.out.println("head::"+queue.element());
		System.out.println("head::"+queue.peek());
		
		System.out.println("Iterating Elements from queue");
		
		Iterator itr=queue.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove(); //remove head from queue
		queue.poll();
		
		System.out.println("After Removing elements");
		Iterator itr1=queue.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
	}

}
