package com.qa.automationpractice.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseTest;
import com.qa.automationpractice.util.ConstantUtil;

public class ProductdetailsTest extends BaseTest{
	
	
	@BeforeClass
	public void accountsPageSetUp()
	{
		accountspage=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	// public void goToProductInfoPage(String productName) 
	 //{
		//   accountspage.searchFieldresult(productName);
		  // productdetails= accountspage.selectProductFromResult(productName); 
	  //}
	 @Test(priority = 1)
	 public void productImageisDisplayTest() {
		 accountspage.searchFieldresult("Dresses");
			productdetails= accountspage.selectProductFromResult("Dresses");
			Assert.assertTrue(productdetails.productImageisDisplay());
	 }
	 
	@Test(priority = 2)
	public void  productImagecountTest() {
		 
		//accountspage.searchFieldresult("Dresses");
		//productdetails= accountspage.selectProductFromResult("Dresses");
		Assert.assertTrue(productdetails.getImagesCount()==ConstantUtil.PRODUCT_DETAILS_IMAGE_COUNT);
	
	}
	@Test(priority = 3)
	public void productNameHeaderTest() {
		Assert.assertTrue(productdetails.getProductNameheader());
	}
	@Test(priority = 4)
	public void productsocialelementcountTest() {
		//productdetails.getSocialElementsCount();
		Assert.assertTrue(productdetails.getSocialElementsCount()==ConstantUtil.PRODUCT_DETAILS_SOCIAL_LINKS);
	}
	@Test(priority = 5)
	public void productDataSheetTest() {
		Assert.assertTrue(productdetails.getProductDetasheet());
	}
	@Test(priority = 6)
	public void productdetailsTest() {
		productdetails.GetProductDetails();
	}
}
