package com.testing.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver openBrowser(String browserType)
	{
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	        return new ChromeDriver();
		}
		else 		{
			System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
	        return new FirefoxDriver();
		}
		
	}
}
