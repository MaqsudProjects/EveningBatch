public class Browser implements CrossBrowser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object
		Browser browser=new Browser();
		System.out.println(browser.browserName());
		System.out.println(browser.browserId());

	}

	
	public String browserName() {
		// TODO Auto-generated method stub
		return "Chrome Browser Launched!";
	}

	
	public int browserId() {
		// TODO Auto-generated method stub
		return 101;
	}

}
