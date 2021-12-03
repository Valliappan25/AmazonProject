package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Utilities.DriverFactory;

public class sample {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String[] agrs) throws InterruptedException
	{
		driver = DriverFactory.openBrowser("chrome");
		driver.get("https://www.amazon.in/AMERICAN-CREW-Charcoal-Melange-Stripes/dp/B07DPRMZT7/ref=sr_1_11?qid=1638505282&refinements=p_n_size_browse-vebin%3A1975397031%2Cp_n_is_cod_eligible%3A4931671031&rnid=4931670031&s=apparel&sr=1-11");
		
		WebElement chart = driver.findElement(By.linkText("Size Chart"));
		chart.click();
		chart.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"a-popover-2\"]/div/header/button")).click();
    	Thread.sleep(2000);
    	
    	
		
 	  
 		
 		
	}
}
