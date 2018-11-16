package com.ActionDemo;

import org.testng.annotations.Test;

import bsh.ParseException;

import org.testng.annotations.BeforeTest;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;

public class FireFox {
	public static void main(String[] args) {
		System.out.println("hedllo");
	}
}

////public class FireFox {
//	
//	public static void main(String[] args) throws ParseException {
//	Date date = new Date();
//	System.out.println(date.toString());
//}
//
//public class FireFox {
//	WebDriver driver;
//  @Test
//  public void f() {
//	driver.get("https://www.google.com");
//	  
//  }
//  @BeforeTest
//  public void beforeTest() {
//	// FirefoxOptions Firefox=new FirefoxOptions();
//	//  Firefox
//	  FirefoxProfile profile= new FirefoxProfile();
//	  profile.setPreference("general.useragent.override", "iPhone");
//	  
//	 // ProfilesIni firefoxp=new ProfilesIni();
//	 // FirefoxProfile newfp=firefoxp.getProfile("Selenium3Plus");
//	 // driver=new FirefoxDriver(newfp);
//	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_d5.01.02\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
//	  driver=new FirefoxDriver();
//	  driver.manage().window().maximize();
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }
//
//}
