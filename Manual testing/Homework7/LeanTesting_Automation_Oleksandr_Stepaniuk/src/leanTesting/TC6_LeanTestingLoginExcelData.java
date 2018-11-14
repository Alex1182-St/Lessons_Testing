package leanTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class TC6_LeanTestingLoginExcelData

	{
	WebDriver driver;
	
	@Test(dataProvider="loginData")
	public void LeanTestingRegister(String yourusernameoremail, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\Eclips_Libs\\chromedriver_win32\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.leantesting.com/sign-in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys(yourusernameoremail);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/button")).click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals("https://dashboard.leantesting.com/", driver.getCurrentUrl());
		System.out.println("SignIn is completed");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();	
	}
	
	
		
	@DataProvider(name="loginData")
	public Object[][] passData()
	{
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\stepanyuk\\eclipse-workspace\\LeanTesting\\TestData\\InputTestDataLogin.xlsx");
		
		int rows=config.getRowCount(0);
		// 0-because it is the first sheet in Excel file
				
		Object[][] data=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
			
		{
			
		data[i][0]=config.getData(0, i, 1);
		// (0, i, 1) - 0-sheet of Excel, i-row of Excel, 1-column of Excel
		
		data[i][1]=config.getData(0, i, 2);
				
		}
				
		return data;
		
	}
	}
	
	
