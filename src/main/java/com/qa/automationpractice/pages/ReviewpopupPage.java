package com.qa.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.automationpractice.util.ElementUtil;
import com.qa.automationpractice.util.JavaScriptUtil;

public class ReviewpopupPage {
	private WebDriver driver;
	 private ElementUtil  elementutil;
	 private JavaScriptUtil javaScriptUtil;
	 
	 
	 private By reviewpopup=By.cssSelector("div.fancybox-skin div.fancybox-outer");
	 private By reviewtitlebox=By.id("comment_title");
	 private By reviewcomment=By.id("content");
	 private By reviewsend=By.id("submitNewMessage");
	 private By reviewsendpopup=By.cssSelector("div.fancybox-skin");
	 private By reviewsendbutton=By.xpath("//button[@value='true']");
	 
	 
	 
	 
	 
	 public ReviewpopupPage(WebDriver driver) {
		   this.driver=driver;
		   elementutil=new ElementUtil(this.driver); 
	   }
}
