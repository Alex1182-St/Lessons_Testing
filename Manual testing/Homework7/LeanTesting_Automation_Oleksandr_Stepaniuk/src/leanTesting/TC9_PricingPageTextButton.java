package leanTesting;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC9_PricingPageTextButton {
	
	WebDriver driver;
		
  @Test
  public void pricingPageLink() throws Exception {
	 driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a")).click();
	 Assert.assertEquals("https://leantesting.com/pricing/", driver.getCurrentUrl());
	 System.out.println("Page is correct");	
	 Thread.sleep(5000);
  }
  
  @Test
  public void pricingPageText() throws Exception {
	
	 if(driver.getPageSource().contains("Our mission is to provide a truly great free test management solution"))
		  {
	    System.out.println("Text is correct");
	  }
	else
	  {
	    System.out.println("Text is incorrect");
	  } 
  }
  
  @Test
  public void pricingPageGetStartedButton() throws Exception {
	 driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[2]/a")).click();
	 Assert.assertEquals("https://app.leantesting.com/en/sign-up", driver.getCurrentUrl());
	 System.out.println("Button submits");	
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
