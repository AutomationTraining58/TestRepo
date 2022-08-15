package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	public  WebDriver driver;
	
	public WebDriver webDriverInitilize() throws IOException 
	{
		
		 Properties prop = new Properties();
			
		 FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumJavaMiniProject\\src\\test\\java\\testdata.properties");
		 prop.load(fis);
		 
		String url= prop.getProperty("url");
		
		String browser= prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		}
		
		
		
		
		return driver;
	
		
	}
	
	
	
	

}
