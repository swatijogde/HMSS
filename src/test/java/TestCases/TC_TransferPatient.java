package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.TransferPatient;

public class TC_TransferPatient extends BaseClass{
	

	@Test
	public void loginTest()
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();;
		
		Dashboard db= new Dashboard(driver);
		db.clickPatients();
		db.patientTransfer();
		
		TransferPatient tp = new TransferPatient(driver);
		tp.transferP();
		tp.setPatientName(pname);
		tp.setRefferalHospital(hospital);
		tp.setDate(date);
		tp.setButton();

}
}