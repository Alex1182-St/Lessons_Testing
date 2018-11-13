package leanTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC3_SignInLink {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\Eclips_Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leantesting.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/a")).click();
		Thread.sleep(2000);

		Assert.assertEquals("https://auth.leantesting.com/sign-in", driver.getCurrentUrl());
		System.out.println("SignIn link is correct");
		
		driver.close();
	}
	}
		
		
	