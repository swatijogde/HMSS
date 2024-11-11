package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPatient {

	WebDriver ldriver;


	public TransferPatient(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}
	
	@FindBy(xpath="//*[@id=\"demo-foo-filtering\"]/tbody[1]/tr/td[6]/a")
	WebElement TP;
	
	public void transferP() {
		TP.click();
	}
	@FindBy(name="t_pat_name")
	WebElement pName;
	
	@FindBy(name="t_hospital")
	WebElement Hospital;
	
	@FindBy(name="t_date")
	WebElement tDate;
	
	public void setPatientName(String pname) {
		pName.clear();
		pName.sendKeys(pname);
	}
	
	public void setRefferalHospital(String rhospital) {
		Hospital.sendKeys(rhospital);
	}
	
	public void setDate(String date) {
		
		tDate.sendKeys(date);
	}
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[3]/div/div/div[2]/div/div/div/form/button/span[1]")
	WebElement buttonTransferPatient;
	
	public void setButton() {
		buttonTransferPatient.click();
		
	}
	
}
