package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPatient {
	
	WebDriver ldriver;


	public ViewPatient(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}

	@FindBy(xpath="//ul[@class='pagination pagination-rounded justify-content-end footable-pagination m-t-10 mb-0']//a")
	List<WebElement> paginationLink;
	
	@FindBy(xpath="//table[@id='demo-foo-filtering']//tr")
	List<WebElement> tablerows;
	
	public void findNameAndClick(String ename) {
		
		boolean nameFound=false;
		
		for(int pageIndex=1;pageIndex<paginationLink.size();pageIndex++) {
			
		
	for(int i=1;i<tablerows.size();i++) {
				
	WebElement fullName =tablerows.get(i-1).findElement(By.xpath("//table[@id='demo-foo-filtering']//tbody//tr[" +i+ "]//td[2]"));
				
				String name = fullName.getText();
				System.out.println("Searching name in row " + i + ": " + name);
				
				if(name.equals(ename)) {
					
					System.out.println("Name Found");
					
		WebElement view=tablerows.get(i-1).findElement(By.xpath("//table[@id='demo-foo-filtering']//tbody//tr["+i+"]//td[8]"));
					view.click();
					
					nameFound=true;
					break;
					
					
				}
			}
			if(nameFound==true) {
				break;
			}
			if(pageIndex<paginationLink.size()) {
				
			WebElement nextPage=	paginationLink.get(pageIndex);
			nextPage.click();
			}
		}
		if(nameFound==false) {
			System.out.println("Element not found in the table");
		}
	}
}
