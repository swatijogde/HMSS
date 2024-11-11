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
	
	public String getFirstName() {
		String fname =pro.getProperty("firstname");
		return fname;
	}
	public String getLastName() {
	String lname=pro.getProperty("lastname");
	return lname;
	}
	
	public String getDOB() {
		String dob=pro.getProperty("dob");
				return dob;
				
	}
	
	public String getAge() {
		String age=pro.getProperty("age");
		return age;
	}
	public String getAddress() {
		String address=pro.getProperty("address");
				return address;
	}
	public String getPhone() {
		String phone=pro.getProperty("number");
		return phone;
	}
	public String getAilment() {
		String ailment=pro.getProperty("patientAilment");
		return ailment;
	}
	public String getType() {
		String type=pro.getProperty("patienttype");
		return type;
	}
	
	
	public String getUFirstName() {
		String fname =pro.getProperty("Ufirstname");
		return fname;
	}
	public String getULastName() {
	String lname=pro.getProperty("Ulastname");
	return lname;
	}
	
	public String getUDOB() {
		String dob=pro.getProperty("Udob");
				return dob;
				
	}
	
	public String getUAge() {
		String age=pro.getProperty("Uage");
		return age;
	}
	public String getUAddress() {
		String address=pro.getProperty("Uaddress");
				return address;
	}
	public String getUPhone() {
		String phone=pro.getProperty("Unumber");
		return phone;
	}
	public String getUAilment() {
		String ailment=pro.getProperty("Ualiment");
		return ailment;
	}
	public String getUType() {
		String type=pro.getProperty("UType");
		return type;
	}
	
	public String getPatientName() {
		
		String pName=pro.getProperty("patientName");
		return pName;
	}
	
	public String getHospital() {
		
		String hospitalName = pro.getProperty("refferalHospital");
		return hospitalName;
	}
	public String getDate() {
		
		String date = pro.getProperty("transferDate");
		return date;
	}
	
	public String getEmpFirstName() {
		
		String fname = pro.getProperty("eFirstName");
		return fname;
	}
	
    public String getEmpLastName() {
		
		String lname = pro.getProperty("eLastName");
		return lname;
	}
	
   public String getEmpEmail() {
	
	String email = pro.getProperty("employeeEmail");
	return email;
}

  public String getEmpPassword() {
	
	String pwd = pro.getProperty("pass ");
	return pwd;
}

	
}
