package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();

	
	 String Url = readconfig.getApplicationURL() ;
	 String username =readconfig.getUsername();
	 String password =readconfig.getPassword();
	 
	 String firstname=readconfig.getFirstName();
	 String lastname=readconfig.getLastName();
	 String dob=readconfig.getDOB();
	 String age=readconfig.getAge();
	 String address=readconfig.getAddress();
	 String phone=readconfig.getPhone();
	 String ailment=readconfig.getAilment();
	 String type=readconfig.getType();
	 
	 String Ufirstname = readconfig.getUFirstName();
	 String Ulastname = readconfig.getULastName();
	 String Udob=readconfig.getUDOB();
	 String Uage =readconfig.getUAge();
	 String Uaddress =readconfig.getUAddress();
	 String Uphone = readconfig.getUPhone();
	 String Uailment = readconfig.getUAilment();
	 String Utype = readconfig.getUType();

	 String pname=readconfig.getPatientName();
	 String hospital =readconfig.getHospital();
	 String date = readconfig.getDate();

	 String eFirstName=readconfig.getEmpFirstName();
	 String eLastName = readconfig.getEmpLastName();
	 String email = readconfig.getEmpEmail();
	 String pwd = readconfig.getEmpPassword();

	 static WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		
		System.out.println("Driver=" +driver);
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get(Url);
			
			
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

	

}
