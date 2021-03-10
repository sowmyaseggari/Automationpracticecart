package com.qa.automationpractice.util;

import java.util.ArrayList;
import java.util.List;

public class ConstantUtil {
	
	public static final String LOGIN_PAGE_TITLE="Login - My Store";
	public static final String ACCOUNTS_PAGE_HEADER_TITLE="MY ACCOUNT";
	public static final int ACCOUNTS_PAGE_FOOTER_LINKS=8;
	public static final String EMAIL_TEXT=" Newsletter : This email address is already registered.";
	
     public static List<String> accheaderlistTest() {
    	 List<String>headerlist=new ArrayList<>();
    	 headerlist.add("ORDER HISTORY AND DETAILS");
    	 headerlist.add("MY CREDIT SLIPS");
    	 headerlist.add("MY ADDRESSES");
    	 headerlist.add("MY PERSONAL INFORMATION");
    	 headerlist.add("MY WISHLISTS");
    	 return headerlist;
    	 
     }
    
}
