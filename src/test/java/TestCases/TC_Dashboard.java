package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;

public class TC_Dashboard extends BaseClass {

	@Test
	public void loginTest1() {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
		
		
		Dashboard db = new Dashboard(driver);
		db.clickPatients();
		db.registerPatient();
		db.viewPatients();
		//db.clickOnView();
		db.managePatients();
		db.patientTransfer();
		
		db.employee();
		db.addEmployee();
	}
	
	
}
