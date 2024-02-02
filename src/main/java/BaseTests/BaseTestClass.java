package BaseTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilsTests.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass
{
	public static WebDriver driver;
	public static Properties prop;
	public BaseTestClass()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\aishwaryaa\\eclipse-workspace\\DemoBlazeProject\\src\\main\\java\\config\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();// TODO: handle exception
		}
		catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		}
	
	
	   public static void initialiation()
	    {
		  String browserName = prop.getProperty("browser");
		  if(browserName.equals("chrome"))
		  {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		  
		  else if (browserName.equals("firefox"))
		  {
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			
		  }
		    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME,TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(prop.getProperty("url"));
		
	     }
	   
	   
	
	
	}



