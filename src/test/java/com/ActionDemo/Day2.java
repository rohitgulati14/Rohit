package com.ActionDemo;

import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Day2 {
	WebDriver driver;
  @Test
  public void f() {
	 // ChromeOptions chrome = new ChromeOptions();
	  //chrome.addExtensions(new File("C:\\Users\\training_d5.01.02\\Downloads\\ExtensionsFile\\ExtensionsFile\\KatalonChrome.crx"));
	 // chrome.addExtensions(new File("C:\\Users\\training_d5.01.02\\Downloads\\ExtensionsFile\\ExtensionsFile\\katalonChrome.crx"));
	  
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize(); //maximize the window
	  Actions act=new Actions(driver);
	  WebElement guj=driver.findElement(By.xpath(""));
	  act.keyDown(Keys.CONTROL).click(guj).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
