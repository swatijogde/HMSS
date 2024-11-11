package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	// identify username webelement
	
	@FindBy(name="ad_email") 
	WebElement userName;
	
	// identify password webelement
	
	@FindBy(name = "ad_pwd")
	WebElement passWord;
	
	//identify login button
	
	@FindBy(name ="admin_login")
	WebElement button;
	
	public void setUsername(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	
	public void click()
	{
		button.click();
	}

}
