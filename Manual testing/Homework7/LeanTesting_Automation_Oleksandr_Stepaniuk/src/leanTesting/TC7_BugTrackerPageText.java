package leanTesting;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC7_BugTrackerPageText {
	
	WebDriver driver;
		
  @Test
  public void bugTrackerLink() throws Exception {
	 driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).click();
	 Assert.assertEquals("https://leantesting.com/free-bug-tracker/", driver.getCurrentUrl());
	 System.out.println("Page is correct");	
	 Thread.sleep(5000);
  }
  
  @Test
  public void bugTrackerPageText() throws Exception {
	
	 if(driver.getPageSource().contains("A better, simpler bug tracker"))
		  {
	    System.out.println("Text is correct");
	  }
	else
	  {
	    System.out.println("Text is incorrect");
	  } 
  }
        
  @AfterTest
  public void afterTest() {
	driver.close();
  }

  
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\Eclips_Libs\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://leantesting.com/");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  	  
  }

}
