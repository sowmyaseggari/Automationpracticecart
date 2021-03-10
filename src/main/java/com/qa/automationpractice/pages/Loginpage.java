package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automationpractice.util.ConstantUtil;
import com.qa.automationpractice.util.ElementUtil;
import com.qa.automationpractice.util.JavaScriptUtil;


public class Loginpage {

	 private WebDriver driver;
	 private ElementUtil  elementutil;
	 private JavaScriptUtil javaScriptUtil;
	 
	 
   private By emailid = By.id("email");
   private By password= By.id("passwd");
   private By forgotpassword=By.linkText("Forgot your password?");
   private By signin=By.id("SubmitLogin");
   
  
   public Loginpage(WebDriver driver) {
	   this.driver=driver;
	   elementutil=new ElementUtil(this.driver); 
   }
	 
	public String getLoginpageTitle() {
		return elementutil.waitForPageTitle(ConstantUtil.LOGIN_PAGE_TITLE, 30);	
	}
	
	public boolean isForgotPaswordLink() {
		return elementutil.doIsDisplayed(forgotpassword);
	}
	public AccountsPage doLogin(String un,String pwd) {
		elementutil.doSendKeys(emailid, un);
		elementutil.doSendKeys(password, pwd);
		elementutil.doClick(signin);
		return new AccountsPage(driver);
	}

}
