package QAPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseTests.BaseTestClass;

public class ProductPage extends BaseTestClass
{
	public WebDriver driver;
	public WebDriverWait wait;
	public ProductPage(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(.,'Sony vaio i7')]")
	WebElement clickitem;
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement addtocart;
	
	public void ClickOnitem()
	{
		clickitem.click();
	}
	
	public void AddtoCart()
	{
		addtocart.click();
	}
	

}
