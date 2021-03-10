package com.qa.automationpractice.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.automationpractice.base.BaseTest;
import com.qa.automationpractice.util.ConstantUtil;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public void accountsPageSetUp()
	{
		accountspage=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void accheaderTitleTest() {
		String title=accountspage.getMyAccountheaderTitle();
		Assert.assertEquals(title, ConstantUtil.ACCOUNTS_PAGE_HEADER_TITLE);
	}
	@Test(priority=2)
	public void accheaderListTest() {
		List<String>list=accountspage.getHeaderList();
		System.out.println(list);
		Assert.assertEquals(list, ConstantUtil.accheaderlistTest());
		
	}
	@Test(priority=4)
	public void acccaddtocartTest() {
		boolean cart=accountspage.getCartMethod();
		Assert.assertTrue(cart);
	}
	@Test(priority=3)
	public void accFooterLinksTest() {
		Assert.assertTrue(accountspage.getFooterLinks()==ConstantUtil.ACCOUNTS_PAGE_FOOTER_LINKS);
		
	}
	@Test(enabled = false)
	public void accsearchaTest() {
		boolean search=accountspage.doSearch();
		Assert.assertTrue(search);
	}
	@Test(priority=5)
	public void accEmailTest() {
		//accountspage.getyourEmail(prop.getProperty("username"));
		//Assert.equals(accountspage.getyourEmail(prop.getProperty("username"), ConstantUtil.EMAIL_TEXT));
		//Assert.assertTrue(ConstantUtil.EMAIL_TEXT);
		Assert.assertTrue(accountspage.getyourEmail(prop.getProperty("username")), ConstantUtil.EMAIL_TEXT);
	}
	
	@DataProvider
	public Object[][] searchData() {
		   return new  Object[][] {{"DRESSES"},{"T-SHIRTS"}};
	 }
	@Test(priority = 6)
	public void searchfieldTest() {
		Assert.assertTrue(accountspage.searchFieldresult("DRESSES"));
	}
	
	@Test(priority = 8)
	public void verifyProductResultTest() {
		accountspage.selectProductFromResult("DRESSES");
		Assert.assertTrue(true);
}
	@Test(priority = 7)
	public void searchfieldTest_tshirts() {
		Assert.assertTrue(accountspage.searchFieldresult("T-SHIRTS"));
	}
}










