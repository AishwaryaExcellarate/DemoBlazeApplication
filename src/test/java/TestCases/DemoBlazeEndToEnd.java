package TestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Testcase on Demoblaze website and print categories in console and select sonyvaio i7 from laptop category 
public class DemoBlazeEndToEnd 
{
	@Test
	public void democlass() throws InterruptedException
	{
		String productname="Sony vaio i7";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demoblaze.com/");
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,700)");
		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group-item"));
		int count = driver.findElements(By.cssSelector(".list-group-item")).size();
		System.out.println(count);
		WebElement	selectlaptop=driver.findElement(By.xpath("//a[contains(.,'Laptops')]"));
		for(int i=0;i<count;i++)
		{
			String	text=categories.get(i).getText();
			System.out.println(text);
			selectlaptop.click();
		}
		System.out.println(driver.findElement(By.xpath("//a[contains(.,'Sony vaio i7')]")).getText());
		
	    driver.findElement(By.xpath("//a[contains(.,'Sony vaio i7')]")).click();
	   WebElement element = driver.findElement(By.xpath("//a[@onclick='addToCart(9)']"));
	   element.click();
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.alertIsPresent());
	   String alertmsg = driver.switchTo().alert().getText();
	   System.out.println(alertmsg);
	   driver.switchTo().alert().accept();
	   
	   
	    
	    
		driver.quit();













		/*
		 * List<WebElement>
		 * lists=driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
		 * Iterator<WebElement> it=lists.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */



	}

}
