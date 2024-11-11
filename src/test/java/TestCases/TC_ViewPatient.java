package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.RegisterPatients;
import PageObject.ViewPatient;

public class TC_ViewPatient extends BaseClass {
	

	@Test(priority=0)
	public void loginTest1() {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();

		
		Dashboard db = new Dashboard(driver);
		
		db.clickPatients();
		db.viewPatients();
		
		ViewPatient vp = new ViewPatient(driver);
		
		vp.findNameAndClick("Aman Kumar");
		
}
	
	    	 
	
	  
}