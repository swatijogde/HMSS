package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_Login extends BaseClass {
	

	@Test
	public void loginTest()
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.click();
	}

}
