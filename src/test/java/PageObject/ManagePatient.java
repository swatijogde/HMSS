package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePatient {
	

	WebDriver ldriver;


	public ManagePatient(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}

	@FindBy(xpath="//*[@id=\"demo-foo-filtering\"]/tbody[1]/tr/td[6]/a[1]")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\"demo-foo-filtering\"]/tbody[2]/tr/td[6]/a[2]")
	WebElement view;
	
	@FindBy(xpath="/html/body/div[3]/div/div[4]/div/button")
	WebElement ok;
	
	public void deletepatient() {
		delete.click();
		ok.click();
	}
	
	public void viewPatient() {
		view.click();
	}
}
