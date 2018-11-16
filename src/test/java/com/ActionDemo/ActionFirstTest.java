package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionFirstTest {
	WebDriver driver;
  @Test(enabled=false)
  public void login() {
	  driver.get("https://www.homeshop18.com"); //launch the website
	  driver.manage().window().maximize(); //maximize the window
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//delays the time by 10 seconds
	  
	  Actions act=new Actions(driver);
	  WebElement close=driver.findElement(By.xpath("//a[@title='Close']"));
	  
	  act.moveToElement(close).click().perform();
	  //act.perform();
	  WebElement laterbutton = driver.findElement(By.xpath("//a[text()='Later']"));
	  act.moveToElement(laterbutton).click().perform();
	  WebElement digital=driver.findElement(By.xpath("//a[text()='Digital']"));
	  act.moveToElement(digital).perform();
  }
  @Test(enabled=false)
  public void login1() {
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize(); //maximize the window
	  Actions act=new Actions(driver);
	  WebElement guj=driver.findElement(By.xpath(""));
	  act.keyDown(Keys.CONTROL).click(guj).build().perform();
  }
  @Test(enabled=false)
  public void RightClick() {
	  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	  driver.manage().window().maximize(); //maximize the window
	  Actions act=new Actions(driver);
	  WebElement rtclickbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
	  act.contextClick(rtclickbutton).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  
	 
  }
  @Test(enabled=true)
  public void DragDrop() {
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  driver.manage().window().maximize(); //maximize the window
	  Actions act=new Actions(driver);
	  WebElement draggable=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	  WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
	  act.dragAndDrop(draggable, droppable).perform();
  }
  @Test(enabled=false)
  public void closebutton() {
	  driver.get("http://jqueryui.com/dialog/");
	  driver.manage().window().maximize(); //maximize the window
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //First Approach
	  //driver.switchTo().frame(0);
	  //driver.findElement(By.xpath("//button[@title='Close']")).click();
	  //driver.switchTo().defaultContent();
	  //Correct approach
	  WebElement frameElement=driver.findElement(By.xpath("//*[iframe @class='demo-frame'"));
	  driver.switchTo().frame(frameElement);
	  driver.findElement(By.xpath("//button[@title='Close']")).click();
	  driver.switchTo().defaultContent();
	    }
  @Test(enabled=false)
  public void Scroll() {
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize(); //maximize the window
	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.name("q")).sendKeys("selenium hq");
	  WebElement element = driver.findElement(By.name("btnk"));
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();",element);
	  executor.executeScript("window.scrollBy(0,400, arg1);");
	    }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver\\chromedriver.exe");//adding the Chrome extesion which helps in launching the chrome driver
	  driver=new ChromeDriver();
	  
	  
	 
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
