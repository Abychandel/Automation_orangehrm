package orangrhrm.testcases;

import Utils.apputils;
import orangehrm.labrary.Employee;
import orangehrm.labrary.LoginPage;

public class Employee_registration {

	public static void main(String[] args)
	{
		apputils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp = new LoginPage();
 		lp.Login("Admin", "Qedge123!@#");
	
		Employee emp = new Employee();
	    boolean res = emp.AddEmployee("Ashok", "Kumar");
	    if(res)
		{
			System.out.println("Employee Registration Pass");
		}else
		{
			System.out.println("Employee Registration Fail");
		}
	
      lp.Logout();
      apputils.CloseApp();
	} 

	
	}
