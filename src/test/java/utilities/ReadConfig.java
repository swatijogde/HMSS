package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
     Properties pro;
	
	String path = "D:\\selenium\\HospitalManagementSystem\\src\\test\\resources\\configuration\\Config.properties";
	
	public ReadConfig()
	{
		
		pro = new Properties();
		
		
		try {
			
			pro = new Properties();
		
			FileInputStream fis = new FileInputStream(path);
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String Url = pro.getProperty("baseUrl");
		
		return Url;
	}
	
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
	  String password = pro.getProperty("password");
	  return password;
	}
	
	public String getfirstName() {
		String fname =pro.getProperty("firstname");
		return fname;
	}
	public String getlastName() {
	String lname=pro.getProperty("lastname");
	return lname;
	}
	
	public String getDOB() {
		String dob=pro.getProperty("dd mm yy");
				return dob;
				
	}
	
	public String getAge() {
		String age=pro.getProperty("age");
		return age;
	}
	public String getAddress() {
		String address=pro.getProperty("adr");
				return address;
	}
	public String getNumber() {
		String number=pro.getProperty("no");
		return number;
	}
	public String getAilment() {
		String ailment=pro.getProperty("patientAilment");
		return ailment;
	}
	public String getType() {
		String type=pro.getProperty("patienttype");
		return type;
	}
}
