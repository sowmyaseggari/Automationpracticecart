package com.qa.automationpractice.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.automationpractice.factory.DriverFactory;
import com.qa.automationpractice.pages.AccountsPage;
import com.qa.automationpractice.pages.Loginpage;

public class BaseTest {
	WebDriver driver;
	DriverFactory df;
	public Properties prop;
	public Loginpage loginpage;
	public AccountsPage accountspage;
	
	
  @BeforeTest
  public void setUp()
  {
	  df=new DriverFactory();
	  prop=df.init_prop();
	 String browserName= prop.getProperty("browser");
	 driver= df.init_driver(browserName);
	 driver.get(prop.getProperty("url"));
	 loginpage=new Loginpage(driver);
	  
  }
  
  
  @AfterTest
  public void tearDown() 
  {
	  driver.quit();
	  
  }
}
