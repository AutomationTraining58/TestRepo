  package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SerachUser {
	
public WebDriver driver;	
	
 private  By forgotPassword=	By.linkText("Forgotten password?");
	
 private  By emailField=	By.id("identify_email");
	
	
 private  By submitButton=	By.xpath("//*[@id='did_submit']");
 
 
 public SerachUser(WebDriver driver) 
 {
	 this.driver =driver;
}


public WebElement getForgotPassword()
 {
	 
	return driver.findElement(forgotPassword);
 }
   
 
 public WebElement getemailField()
 {
	 
	return driver.findElement(emailField);
 }
 
 public WebElement getSubmitButton()
 {
	 
	return driver.findElement(submitButton);
 }
   
   
   
   
   

}
