package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.RegisterPatients;

public class TC_Register extends BaseClass {


	@Test
	public void registerPatient() {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
		
		
		Dashboard db = new Dashboard(driver);
		db.clickPatients();
		db.registerPatient();

		RegisterPatients rs = new RegisterPatients(driver);
    	rs.setFirstName(firstname);
    	rs.setLastName(lastname);
		rs.setpatientDOB(dob);
		rs.setAge(age);
    	rs.setAddress(address);
    	rs.setPhone(phone);
    	rs.setAilment(ailment);
    	rs.setType(1);
    	 
     }
    
}
	
