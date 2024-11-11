package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeeDetails {
	
	WebDriver ldriver;


	public AddEmployeeDetails(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}
	
	@FindBy(name="doc_fname")
	WebElement eFirstName;
	
	@FindBy(name="doc_lname")
	WebElement eLastName;
	
	@FindBy(name="doc_email")
	WebElement email;
	
	@FindBy(name="doc_pwd")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[3]/div/div/div[2]/div/div/div/form/button/span[1]")
	WebElement button;
	
	public void setEmployeeFirstName(String fname) {
		eFirstName.sendKeys(fname);
	}
	public void setEmployeeLastName(String lname) {
		eLastName.sendKeys(lname);
	}
	public void setEmployeeEmail(String email1) {
		email.sendKeys(email1);
	}
	public void setEmployeePassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void setEmployee(){
		button.click();
	}

}
