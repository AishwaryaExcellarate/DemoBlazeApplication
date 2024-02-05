package com.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseTests.BaseTestClass;
import QAPages.HomePage;
import QAPages.ProductPage;
import UtilsTests.TestUtil;
     
   
public class DemoBlazeTest extends BaseTestClass
  {
	
	
    HomePage hp; 
    ProductPage pp;
    TestUtil testutil;
     
     public DemoBlazeTest()
     {
    	 super();
     }
     
     @BeforeMethod
     public void setup()
     {
        initialiation();
        testutil=new TestUtil();
         hp=new HomePage(driver);
         pp=new ProductPage(driver);
        
    }
     
     @Test
     public void demoblazetest()
     {
    	 
     
      
      String title= hp.VerifyTitle();
      Assert.assertEquals(title, "PRODUCT STORE");
      
      hp.choosecategories();
      hp.SelectLaptop();
      hp.GetText();
      pp.ClickOnitem();
 	  pp.AddtoCart();
 	  testutil.switchtoAlert();
      
      }
     
    
     
      @AfterMethod
     public void tearDown()
     {
    	 driver.quit();
     }
}
