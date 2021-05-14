package tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();		                  
		driver.get("http://google.com");
        driver.close();
	}
}
