package com.qa.automationpractice.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseTest;
import com.qa.automationpractice.pages.AccountsPage;
import com.qa.automationpractice.util.ConstantUtil;

public class LoginPageTest extends BaseTest {
	
	
	@Test(priority=1)
	public void loginPageTitleTest() 
	{
		String title=loginpage.getLoginpageTitle();
		System.out.println(title);
		Assert.assertEquals(title,ConstantUtil.LOGIN_PAGE_TITLE ); 
	}
	
  @Test(priority=2)
  public void forgotpasswordlinkTest() {
	  Assert.assertTrue(loginpage.isForgotPaswordLink());
  }
  @Test(priority=3)
  public void LoginTest() {
	  AccountsPage accountspage= loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
         String title= accountspage.getMyAccountheaderTitle();
         Assert.assertEquals(title, ConstantUtil.ACCOUNTS_PAGE_HEADER_TITLE);
  }
}
