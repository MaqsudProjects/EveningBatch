public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Create an object of Dropdown
		new Dropdown();
		Dropdown.invokeBrowser();
		Dropdown.getAppURL();
		int noofDropdown=Dropdown.countNoDropdown();
		System.out.println("Number of Dropdown::"+noofDropdown);
		System.out.println("---------------------------------------------------------------");
		boolean status_dropdown=Dropdown.isDropdownMultiple();
		System.out.println("IS Dropdown single or multiple:: True/False::"+status_dropdown);
		Dropdown.selectValue();
		System.out.println("---------------------------------------------------------------");
		String firstValue_selected=Dropdown.selectFirstValue();
		System.out.println("Value Selected From Dropdown::"+firstValue_selected);
		System.out.println("---------------------------------------------------------------");
		Dropdown.listOfValues();
		System.out.println("----------------------------------------------------------------");
		Dropdown.verifySelectedValue();
		System.out.println("--------------------------------------------------------------");
		Dropdown.closeTheBrowser();
		
		
	}

}
