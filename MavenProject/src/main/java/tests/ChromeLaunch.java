package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeLaunch {
	@Test
	  public void GoogleLaunch() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Hello! Welcome to Facebook login page");
	  }
}
