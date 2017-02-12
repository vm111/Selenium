package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest2 {
  @Test
  @Parameters("url")
  public void f(String url) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "H:\\Tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
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
