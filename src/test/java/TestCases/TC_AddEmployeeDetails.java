package TestCases;

import org.testng.annotations.Test;

import PageObject.AddEmployeeDetails;
import PageObject.Dashboard;
import PageObject.LoginPage;

public class TC_AddEmployeeDetails extends BaseClass {
	@Test
	public void addEmployeeDetails() {
		

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
		
		Dashboard db = new Dashboard(driver);
		db.employee();
		db.addEmployee();
		
		AddEmployeeDetails ed = new AddEmployeeDetails(driver);
		ed.setEmployeeFirstName(eFirstName);
		ed.setEmployeeLastName(eLastName);
		ed.setEmployeeEmail(email);
		ed.setEmployeePassword(pwd);
		ed.setEmployee();
		
	}

}
