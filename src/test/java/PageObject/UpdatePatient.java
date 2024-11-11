package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdatePatient {
	
WebDriver ldriver;
	
	public UpdatePatient(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//*[@id=\"demo-foo-filtering\"]/tbody[1]/tr/td[6]/a[3]")
	WebElement update;
	
	public void clickOnUpdate() {
		
		update.click();
		
	}
	
	@FindBy(name="pat_fname")
	WebElement firstname;
	
	@FindBy(name="pat_lname")
	WebElement lastname;
	
	@FindBy(name="pat_dob")
			WebElement dob;
	
	@FindBy(name="pat_age")
	WebElement age;
	
	@FindBy(name="pat_addr")
	WebElement address;
	
	@FindBy(name="pat_phone")
	WebElement phone;
	
	@FindBy(name="pat_ailment")
	WebElement ailment;
	
	
	@FindBy(name="pat_type")
	WebElement type;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[3]/div/div/div[2]/div/div/div/form/button/span[1]")
	WebElement clickAddPatientButton;
	
	
	public void setFirstName(String fname) {
		firstname.clear();
		firstname.sendKeys(fname);
		
		}
	public void setLastName(String lname) {
		lastname.clear();
		lastname.sendKeys(lname);
	}
	
	public void setpatientDOB(String dob2) {
        dob.clear();
		dob.sendKeys(dob2);
	}
	public void setAge(String x) {
		age.clear();
		age.sendKeys(String.valueOf(x));
	}
	public void setAddress(String addr) {
		address.clear();
		address.sendKeys(addr);
		
	}
	public void setPhone(String number) {
		phone.clear();
		phone.sendKeys(number);
	}
	public void setAilment(String type) {
		ailment.clear();
		ailment.sendKeys(type);
	}
	
	
	 public void setType(int a) {
		
		Select ss = new Select(type);
		ss.selectByIndex(a);
	}
		public void clickAddPatientButton() {
			clickAddPatientButton.click();
		}
}
