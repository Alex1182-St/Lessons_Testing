package leanTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_MainPageTextPresence {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\Eclips_Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leantesting.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		if(driver.getPageSource().contains("Simple testing tools for complex software projects"))
			
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }
				
		driver.close();
	}
	}
		
		
	