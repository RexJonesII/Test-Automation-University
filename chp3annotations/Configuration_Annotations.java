package com.testautomationu.chp3annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Configuration_Annotations {
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Chrome - Set Up System Property");
  } 
      
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Open Chrome");
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Open Test Application");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Sign In");
  }
  
	@Test
  public void searchCustomer()
  {
	  System.out.println("Search For Customer");
  }
  
  @Test
  public void searchProduct()
  {
	  System.out.println("Search For Product");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Sign Out");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("Close Test Application");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Close Chrome");
  }
  
  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Chrome - Clean Up All Cookies");
  }
}



 





























