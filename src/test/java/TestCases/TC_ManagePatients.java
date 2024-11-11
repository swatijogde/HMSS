package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.ManagePatient;
import PageObject.UpdatePatient;

public class TC_ManagePatients extends BaseClass{
	
	
	@Test(priority=0)
	public void update() {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();

		Dashboard db = new Dashboard(driver);
		db.clickPatients();
		db.managePatients();;
	
		
		UpdatePatient up = new UpdatePatient(driver);
		up.clickOnUpdate();
		
		up.setFirstName(Ufirstname);
		up.setLastName(Ulastname);
		up.setpatientDOB(Udob);
		up.setAge(Uage);
		up.setAddress(Uaddress);
		up.setPhone(Uphone);
		up.setAilment(Uailment);
		up.setType(1);
		
	
	}
}