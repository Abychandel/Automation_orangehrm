package orangrhrm.testcases;

import Utils.apputils;
import orangehrm.labrary.LoginPage;

public class AdminLoginwithValidInputs {

	public static void main(String[] args)
	{
		apputils.launchApp("http://Orangehrm.qedgetech.com");
		LoginPage lp = new LoginPage();
		lp.Login("Admin", "Qedge123!@#");
	boolean	res=lp.isAdminModuleDisplay();
	if(res) 
	{
		System.out.println("Admin Login Test Pass");
	}else 
	{
		System.out.println("Admin Login Test Fail");
	}
    lp.Logout();
    apputils.CloseApp();

	}

}
