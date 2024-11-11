package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import junit.framework.Assert;

public class TC_Login extends BaseClass {
	

	@Test
	public void loginTest()
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();;
		
		
		/*String title=driver.getTitle();
		System.out.println(title);
		
		if(driver.getTitle().equalsIgnoreCase("Hospital Management System -A Super Responsive Information System")) {
			
			Assert.assertTrue(true);
		}else {
			
			Assert.assertTrue(false);
		}*/
	}

}
