package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompregSignupPage {
	
	
WebDriver driver;

By compregfirstname=By.name("firstName");
By compreglastname=By.name("lastName");
By compregusername=By.name("username");
By compregemail=By.name("email");
By compregtelephone=By.name("phone");
By compregpassword=By.name("password");
By compregconfirmpassword=By.name("confirmPassword");
By compregnextbutton=By.xpath("//button[@type='submit']");


public CompregSignupPage(WebDriver driver)
{
	this.driver=driver;
}

public void setvaluessignup(String firstName,String lastName,String username,String email,String phone,String password,String confirmPassword)
{
	driver.findElement(compregfirstname).sendKeys(firstName);
	driver.findElement(compreglastname).sendKeys(lastName);
	driver.findElement(compregusername).sendKeys(username);
	driver.findElement(compregemail).sendKeys(email);
	driver.findElement(compregtelephone).sendKeys(phone);
	driver.findElement(compregpassword).sendKeys(password);
	driver.findElement(compregconfirmpassword).sendKeys(confirmPassword);

}



public void signup()
{
	driver.findElement(compregnextbutton).click();
}
}