package com.qa.automationpractice.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	WebDriver driver;
	Properties prop;
	public static ThreadLocal<WebDriver>tldriver=new ThreadLocal<>();
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
			tldriver.set(new ChromeDriver());
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//driver=new FirefoxDriver();
			tldriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please pass the correct browsernmae: " + browserName);
		}
		
		getDriver().manage().window().fullscreen();
		getDriver().manage().deleteAllCookies();
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}
	
	
	
	public Properties init_prop() {
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("./src/test/resources/config/config.properties1");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
		
	}
	

}
 















