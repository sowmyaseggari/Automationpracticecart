package com.qa.automationpractice.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.automationpractice.util.ElementUtil;

public class AccountsPage {
private WebDriver driver;
private ElementUtil  elementutil;
	
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtil(this.driver);
		
		
	}
	private By header=By.cssSelector("h1.page-heading");
	private By headerlist=By.xpath("//ul[@class='myaccount-link-list']//li");
	private By shopingcart=By.cssSelector("div.shopping_cart");
	private By enteryouremail=By.id("newsletter-input");
	private By footerlinks=By.xpath("//section[@class='footer-block col-xs-12 col-sm-4']//li");
	private By search=By.id("search_query_top");
	private By serachclick=By.xpath("//button[@name='submit_search']");
	private By emailclick=By.xpath("//button[@name='submitNewsletter']");
	private By emailtext=By.xpath("//p[@class='alert alert-danger']");
	private By searchresult=By.cssSelector("li.ajax_block_product div.product-container");
	private By imagetext=By.cssSelector("div.right-block a.product-name");
	
    
	public String getMyAccountheaderTitle() {
		return elementutil.doGetText(header);
		
	}
	
	public List<String> getHeaderList() {
		List<String>accheaderlist=new ArrayList<>();
		List<WebElement>headerList=elementutil.getElements(headerlist);
		for(WebElement e:headerList) {
			String text=e.getText();
			System.out.println(text);
			accheaderlist.add(text);
		}
		return accheaderlist;
	}
	
	public boolean getCartMethod() 
	{
		return elementutil.doIsDisplayed(shopingcart);	
		}
	
	public int getFooterLinks() {
		return elementutil.getElements(footerlinks).size();
	}
	
	public boolean doSearch() {
		return elementutil.doIsDisplayed(search);
	}
	
	public boolean getyourEmail(String username) {
		 elementutil.getElement(enteryouremail).sendKeys(username);
		 elementutil.doClick(emailclick);
		return elementutil.doIsDisplayed(emailtext);
	}
	
	public boolean searchFieldresult(String productName) {
		elementutil.doSendKeys(search, productName);
		elementutil.doClick(serachclick);
		if(elementutil.getElements(searchresult).size()>0) {
			return true;
		}
		return false;	
	}
	
	public void selectProductFromResult(String productName) {
		List<WebElement>list=elementutil.getElements(imagetext);
		System.out.println(list);
		for(WebElement e:list) {
			if(e.getText().equals(productName));
			e.click();
			break;
		}
		
	}
	
}


