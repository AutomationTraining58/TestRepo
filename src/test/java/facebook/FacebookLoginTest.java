package facebook;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.SerachUser;
import pageObjects.facebookHomePage;
import utils.Base;

public class FacebookLoginTest {
	

   public WebDriver driver;
   public String userName;
	
	@Test(priority=1)
	public void enterUserDetails() throws IOException, InterruptedException
	{
	
        Properties prop = new Properties();
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumJavaMiniProject\\src\\test\\java\\testdata.properties");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumJavaMiniProject\\src\\test\\java\\testdata.properties");
		
		prop.load(fis);
		
		 userName= prop.getProperty("username");
		String password= prop.getProperty("password");
		
	    Base bb = new Base();

	    
	    driver = bb.webDriverInitilize();
	    
	    facebookHomePage fbp=new facebookHomePage(driver);
	    
	    	    
	    fbp.getEmail().sendKeys("ramyuip@gmail.com");
	    

	    
	    fbp.password().sendKeys("poiuytrre");
	    

	    
	    fbp.loginButton().click();
	    Thread.sleep(4000);

	    
	}
	

	@Test(priority=2)
	public void forgotPassowrd() throws InterruptedException
	{
		
		SerachUser ss = new SerachUser(driver);
		ss.getForgotPassword().click();
		Thread.sleep(4000);

		
	}
	
	
	@Test(priority=3)
	public void searchUser()
	{   
		
		SerachUser st = new SerachUser(driver);
		st.getemailField().sendKeys("zxcvb@gmail.com");
		st.getSubmitButton().click();
		
		
	}
	

}
