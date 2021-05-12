package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
	  @Test
	  public void openMyBlog() {
		driver.get("https://www.facebook.com");
		System.out.println("Hello! Welcome to Facebook login page");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	 
}
