package orangrhrm.testcases;

import Utils.apputils;
import orangehrm.labrary.LoginPage;

public class AdminLoginWithInvalidInputs {

	public static void main(String[] args)
	
   {
		apputils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp = new LoginPage();
		lp.Login("abc", "xyz");
	    boolean res =	lp.isErrorMsgDisplay();
	    
	    if(res)
	    {
	    	System.out.println("if system displaying error message,Test Pass");
	    }else
	    {
	    	System.out.println("if system not displaying error message,Test Fail");
	    }
		apputils.CloseApp();

	}
	

}
