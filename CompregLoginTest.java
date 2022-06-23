package test;


	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import pages.CompregLoginPage;
	

	public class CompregLoginTest {

		
		WebDriver driver;
		String baseurl="http://compreg.deepnetsoft.com/";
		
		@BeforeTest
		public void setup()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
 	        driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			
			
		}
		@BeforeMethod
		public void url()
		{
			driver.get(baseurl);
			
		}
		
		
		
		@Test
		public void testlogin()
		{
			
			CompregLoginPage ob=new CompregLoginPage(driver);
			ob.titleverification();
			ob.setvalueslogin("divya@gmail.com", "password");
			ob.login();
			//driver.navigate().back();
			
		}

		
		@AfterMethod
		public void closeb()
		{
		//	driver.close();
			System.out.println("Finished Test On Chrome Browser");
		}
		@AfterClass
		public void quitd()
		{
	//driver.quit();
		}
	}

