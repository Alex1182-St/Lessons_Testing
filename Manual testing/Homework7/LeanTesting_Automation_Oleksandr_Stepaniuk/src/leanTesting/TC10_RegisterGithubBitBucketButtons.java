package leanTesting;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC10_RegisterGithubBitBucketButtons {
	
	WebDriver driver;
		
  @Test
  public void registerWithGitHub() throws Exception {
	  
	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
	 
	 if(driver.getPageSource().contains("Sign in to GitHub"))
	  {
		 System.out.println("registerWithGitHub button submits");
	  }
	 else
 	{
		 System.out.println("registerWithGitHub button is not working");
	 	 
	 Thread.sleep(5000);
	 }
  	}
  
  @Test
  public void registerWithBitBucket() throws Exception {
	  
	 driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
	 
	 if(driver.getPageSource().contains("Log in to continue to Bitbucket"))
	  {
		 System.out.println("registerWithBitBucket button submits");
	  }
	 else
 	{
		 System.out.println("registerWithBitBucket button is not working");
	 	 
	 Thread.sleep(5000);
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
	driver.findElement(By.xpath("//*[@id=\"menu-item-37\"]/a")).click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  	  
  }

}
