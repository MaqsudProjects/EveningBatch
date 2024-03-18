public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=6; //Declaration and Initialization of variable
		
		String browserName="";
		
		switch(x)
		{
		 //Case Statements
		case 1:browserName="Chrome"; 
			break;
		case 2:browserName="Firefox";
			//System.out.println("Firefox");
			break;
		case 3:browserName="Opera";
		//System.out.println("Firefox");
			break;
		case 4:browserName="Edge";
		//System.out.println("Firefox");
			break;
		case 5:browserName="Safari";
		//System.out.println("Firefox");
			break;
		default:
			System.out.println("No Option Found!");
		}
		System.out.println(browserName);
		
	}

}
