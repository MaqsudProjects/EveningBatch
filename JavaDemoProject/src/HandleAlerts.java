public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new JavascriptPopup();
		JavascriptPopup.invokeBrowser();
		JavascriptPopup.getAppURL();
		JavascriptPopup.clickonAlertButton();
		boolean current_status_Alert=JavascriptPopup.isAlertPresent();
		System.out.println("Current Status of Alert is displayed or not:: True/False::"+current_status_Alert);
		System.out.println("-------------------------------------------------------------------------");
		String caption=JavascriptPopup.captureText();
		System.out.println("The value displayed in Alert is::"+caption);
		System.out.println("-------------------------------------------------------------------------");
		JavascriptPopup.verifyCaption();
		System.out.println("-----------------------------------------------------------------------");
		JavascriptPopup.clickOnOK();
		JavascriptPopup.clickOnConfirmButton();
		System.out.println("--------------------------------------------------------------------");
		JavascriptPopup.clickOnCancel();
		System.out.println("---------------------------------------------------------------------");
		JavascriptPopup.verifyMsgCancel();
		System.out.println("---------------------------------------------------------------------");
		JavascriptPopup.clickOnPrompt();
		JavascriptPopup.setValuePrompt();
		//JavascriptPopup.closeBrowser();
	}

}
