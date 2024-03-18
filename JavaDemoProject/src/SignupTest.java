public class SignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Signup signup=new Signup();
		String mail_id=signup.email("radical@gmail.com");
		System.out.println("email_id::"+mail_id);
		int id=signup.id(101);
		System.out.println("id of mail::"+id);
		
	}

}
