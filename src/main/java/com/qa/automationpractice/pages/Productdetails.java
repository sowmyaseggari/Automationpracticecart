package com.qa.automationpractice.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.automationpractice.util.ElementUtil;
import com.qa.automationpractice.util.JavaScriptUtil;

public class Productdetails {
	private WebDriver driver;
	 private ElementUtil  elementutil;
	 private JavaScriptUtil javaScriptUtil;
	 
	 
	 private By productImage=By.id("bigpic");
	 private By productImagesCount=By.xpath("//div[@id='thumbs_list']//ul/li");
	 private By procductnameheader=By.xpath("//h1[text()='Printed Summer Dress']");
	 //private By socialoptions=By.cssSelector("p.socialsharing_product");
	 private By socialoptions=By.xpath("//button[@type='button']");
	 private By productdetails=By.cssSelector("div.pb-right-column div.box-info-product");
	 private By datasheet=By.cssSelector("section.page-product-box table.table-data-sheet");
	// private By reviewbox=By.cssSelector("div.no-print a.open-comment-form");
	 private By addtocart=By.id("add_to_cart");
	
	 public Productdetails(WebDriver driver) {
		   this.driver=driver;
		   elementutil=new ElementUtil(this.driver); 
	   }
	 
	 public boolean productImageisDisplay() {
		return elementutil.doIsDisplayed(productImage);
	 }
	 
	 public int getImagesCount() {
		List<WebElement>listcount= elementutil.getElements(productImagesCount);
		int count=listcount.size();
		System.out.println("Dresses count: " + count);
		return count;
		
	 }
	 public boolean getProductNameheader() {
		 return elementutil.doIsDisplayed(procductnameheader);
	 }
	 public int getSocialElementsCount() {
		 
		 List<WebElement>listcount=elementutil.getElements(socialoptions);
		 int count=listcount.size();
			System.out.println("social Websites: " + count);
			return count;
	 }
	 
	 public boolean getProductDetasheet() {
		 return elementutil.doIsDisplayed(datasheet);
	 }
	 public void GetProductDetails() {
		 elementutil.doIsDisplayed(productdetails);
		 elementutil.doClick(addtocart);
		  
	 }
	 
	 
	 
	//*[@id="center_column"]/div/div/div[3]/p[7]/button[1]
	 

}
