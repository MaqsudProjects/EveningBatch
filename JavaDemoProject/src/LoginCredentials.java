public class LoginCredentials {
	
	String userName;
	int userId;
	String location;
	
	//Parameterized Constructor
	public LoginCredentials(String user,int id) //create constructor
	{
		System.out.println("User Successfully LoggedIn!");
		this.userName=user; //initialize data member through constructor
		this.userId=id;
	}
	public LoginCredentials(String location)
	{
		this.location=location;
	}
	public void display()
	{
		System.out.println("User Name is::"+userName+"\n"+"User Id::"+userId);
	}
	public void displayOne()
	{
		System.out.println("Location of Training::"+location);
	}
	public static void main(String[] args) {
		LoginCredentials login=new LoginCredentials("AutomationTester",102);
		LoginCredentials login1=new LoginCredentials("Bengalore");
		login.display();
		login1.displayOne();
		
	}

}
