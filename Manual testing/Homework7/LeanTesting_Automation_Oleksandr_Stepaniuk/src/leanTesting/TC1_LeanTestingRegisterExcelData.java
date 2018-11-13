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

public class TC1_LeanTestingRegisterExcelData

	{
	WebDriver driver;
	
	@Test(dataProvider="registerData")
	public void LeanTestingRegister(String youremail, String yourusername, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\Eclips_Libs\\chromedriver_win32\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.leantesting.com/sign-up");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(youremail);
		driver.findElement(By.id("username")).sendKeys(yourusername);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"user-signup-form\"]/div[4]/button")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().contains("Your CrowdTesting account has been created"));
				
		System.out.println("Register has been completed successfully");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();	
	}
	
	
		
	@DataProvider(name="registerData")
	public Object[][] passData()
	{
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\stepanyuk\\eclipse-workspace\\LeanTesting\\TestData\\InputTestData.xlsx");
		
		int rows=config.getRowCount(0);
		// 0-because it is the first sheet in Excel file
				
		Object[][] data=new Object[rows][3];
		
		for(int i=0;i<rows;i++)
			
		{
			
		data[i][0]=config.getData(0, i, 1);
		// (0, i, 1) - 0-sheet of Excel, i-row of Excel, 1-column of Excel
		
		data[i][1]=config.getData(0, i, 2);
		data[i][2]=config.getData(0, i, 3);
		
		}
				
		return data;
		
	}
	}
	
	
