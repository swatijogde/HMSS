package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver ldriver;


	public Dashboard(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/a")
	WebElement patient;
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement Register;
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
		WebElement viewPatient;
	

	@FindBy(xpath="//*[@id=\"demo-foo-filtering\"]/tbody[6]/tr/td[8]/a")
	WebElement clickViewPage;
		
	@FindBy(partialLinkText="Manage")
	WebElement clickManagePatients;
	
	public void clickPatients() {
		
		patient.click();	}


    public void registerPatient() {
	Register.click();
	
    }
  
   public void viewPatients() {
		
		viewPatient.click();;
	}
   
   public void clickOnView() {
		clickViewPage.click();
		
	}
   public void managePatients() {
	   clickManagePatients.click();
   }
   
   @FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/ul/li[5]/a")
   WebElement patientTransfer;
   
   public void patientTransfer() {
	   
	   patientTransfer.click();
	   
   }
   
   @FindBy(xpath="//*[@id=\"side-menu\"]/li[4]/a")
   WebElement emp;
   
   public void employee() {
	   emp.click();
   }
   
   @FindBy(xpath="//*[@id=\"side-menu\"]/li[4]/ul/li[1]/a")
   WebElement addemp;
   
   public void addEmployee() {
	   addemp.click();
   }
   
     
	
		

	
	
}
