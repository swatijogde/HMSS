package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.RegisterPatients;

public class TC_Register extends BaseClass {


	@Test(priority=06)
	public void loginTest1() {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
		
		
		Dashboard db = new Dashboard(driver);
		db.clickPatient();
		db.registerPatient();
}

     @Test
     public void registerPatient() {
    	 
    	 RegisterPatients rs = new RegisterPatients(driver);
    	 rs.setFirstName(firstname);
    	 rs.setLastName(lastname);
		rs.setpatientDOB(dd mm yy);
		rs.setAge(age);
    	rs.setAddress(address);
    	rs.setPhone(number);
    	rs.setAilment(ailment);
    	rs.setType(1);
    	 
     }
	
}