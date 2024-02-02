package QAPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTests.BaseTestClass;

public class HomePage extends BaseTestClass
{
	
    ////a[@class='navbar-brand']
	@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement verifytitle;
	
	@FindBy(css = ".list-group-item")
	List<WebElement> categories;
	
	@FindBy(xpath = "//a[contains(.,'Laptops')]")
	WebElement selectlaptop;
	
	@FindBy(xpath = "//a[contains(.,'Sony vaio i7')]")
	WebElement printtext;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle()
	{
		return verifytitle.getText();
	}
	
	public void choosecategories()
	{
		int count = categories.size();
		System.out.println(count);
	}
	public void SelectLaptop()
	{
		int count=0;
		for(int i=0;i<count;i++)
		{
			String text=categories.get(i).getText();
			System.out.println(text);
			selectlaptop.click();
		}
		
		
	}
	 public void GetText()
	  {
		String textmsg = printtext.getText();
		System.out.println(textmsg);
		
	  }
	 
	 
	
	

}
