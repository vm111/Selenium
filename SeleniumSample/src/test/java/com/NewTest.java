package com;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  @Parameters({"url","site"})
  public void f(String url,String site) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "H:\\Tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  /*WebDriver driver=new FirefoxDriver();*/
	  driver.get(url);
	  System.out.println(site);
	  driver.manage().window().maximize();
	  //Thread.sleep(5000);
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //driver.findElement(By.xpath(".//*[@id='closeImage']")).click();
	  WebDriverWait wait=new WebDriverWait(driver, 5000);
	  //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("http-push")));
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("http-push"));
	  driver.switchTo().frame("http-push");
	  driver.findElement(By.xpath("//*[@id='closeImage']")).click();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
	  String parentWindow=driver.getWindowHandle();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> iter = windows.iterator();
	  System.out.println(windows.size());
	  while (iter.hasNext()){
		String childWindow=iter.next();
		if(!parentWindow.equalsIgnoreCase(childWindow)){
			driver.switchTo().window(childWindow);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  //WebDriverWait wait=new WebDriverWait(driver, 10);
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
	 /* Alert newAlert=driver.switchTo().alert();
	  System.out.println(newAlert.getText());
	  */
/*	  Thread.sleep(5000);
	  driver.findElement(By.name("firstname")).sendKeys("Vishnu");
	  driver.findElement(By.name("lastname")).sendKeys("M");
	  driver.findElement(By.id("sex-0")).click();
	  Select continents=new Select(driver.findElement(By.id("continents")));
	  continents.selectByVisibleText("Europe");
	  Thread.sleep(5000);*/
	  //driver.quit();
	  //Test
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
