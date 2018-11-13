package leanTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC2_SignUpForFreeButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\Eclips_Libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leantesting.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div/main/div[1]/div/div[1]/a")).click();
		Thread.sleep(5000);

		Assert.assertTrue(driver.getTitle().contains("Register a CrowdTesting account"));
		System.out.println("SignUpForFree button submit successfully");
		
		driver.close();
		
	}

}
