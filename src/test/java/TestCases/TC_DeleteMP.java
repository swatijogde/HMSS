package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.ManagePatient;

public class TC_DeleteMP extends BaseClass{
	
	
	@Test
	public void deleteMP() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
		
		
		Dashboard db = new Dashboard(driver);
		db.clickPatients();
		db.managePatients();
		
		ManagePatient mp= new ManagePatient(driver);
		Thread.sleep(3000);
		mp.deletepatient();
		Thread.sleep(3000);
		mp.viewPatient();
		
	
	
	
	
	
	
	
	
	
	
	
}
}