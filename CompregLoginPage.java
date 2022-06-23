package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompregLoginPage {
	
	
WebDriver driver;

By compregusername=By.name("username");
By compregpassword=By.name("password");
By compreglogin=By.xpath("//*[@class='jss4']/button");

public CompregLoginPage(WebDriver driver)
{
	this.driver=driver;
}

public void setvalueslogin(String username,String password)
{
	driver.findElement(compregusername).sendKeys(username);
	driver.findElement(compregpassword).sendKeys(password);

}

public void titleverification()
{
	String actualtitle = driver.getTitle();
    if(actualtitle.equals("COMPREG"))
		{
			System.out.println("titleverification- pass");
		}
		else
		{
			System.out.println("titleverification-fail");

		}
}

public void login()
{
	driver.findElement(compreglogin).click();
	
}
}









