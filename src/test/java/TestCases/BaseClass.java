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
	 
	 String firstname=readconfig.getfirstName();
	 String lastname=readconfig.getlastName();
	 String dob=readconfig.getDOB();
	 String age=readconfig.getAge();
	 String address=readconfig.getAddress();
	 String number=readconfig.getNumber();
	 String ailment=readconfig.getAilment();
	 String type=readconfig.getType();



	 static WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
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
