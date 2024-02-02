package UtilsTests;

import java.time.Duration;import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseTests.BaseTestClass;

public class TestUtil extends BaseTestClass
{
  public static long PAGE_LOAD_TIME =20;
  public static long IMPLICIT_WAIT =10;
  
  public static long EXPLICITWAIT =10;
  
  public void switchtoAlert()
  {
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	 wait.until(ExpectedConditions.alertIsPresent());
	  driver.switchTo().alert().accept();
  }

}
