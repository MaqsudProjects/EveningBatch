import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map-< Object Creation
		Map<Integer,String> map=new HashMap<Integer,String>();//Integer-Key, String-Value
		
		map.put(1, "Java");
		map.put(2, "C#");
		map.put(3, "Python");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
				

	}

}
