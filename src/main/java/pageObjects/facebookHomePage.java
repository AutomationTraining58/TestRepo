package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookHomePage {
	
	public WebDriver driver;
	
	 private  By  emailId =   By.id("email");
	  
	 private  By password =  By.name("pass");
	  
	 private  By loginButton = By.xpath("//*[text()='Log In']");
	  
	  

	public facebookHomePage(WebDriver driver) 
	{
		    this.driver =driver;
	}


	public WebElement getEmail()
	  {
		   return driver.findElement(emailId);
	  }
	  
	  
	  public WebElement password()
	  {
		  return driver.findElement(password);
	  }
	    
	  
	  public WebElement loginButton()
	  {
		 return driver.findElement(loginButton);
	  }

}
