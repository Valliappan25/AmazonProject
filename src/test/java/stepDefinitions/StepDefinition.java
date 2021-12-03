package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testing.Utilities.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {

	public static WebDriver driver;
	public static WebDriverWait wait;
			
    @Given("^Visit amazon.in$")
    public void visit_amazonin() throws Throwable {
    	driver = DriverFactory.openBrowser("chrome");
		System.out.println("Opening Browser");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.in/");    	
    }

    @When("^Click ALL categories in the left side$")
    public void click_all_categories_in_the_left_side() throws Throwable {
        driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();
        Thread.sleep(2000);
    }

    @And("^Click Men's fashion category and click TShirts and Polos$")
    public void click_mens_fashion_category_and_click_tshirts_and_polos() throws Throwable {
    	
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[17]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[10]/li[4]/a")).click();
        Thread.sleep(3000);
    }

    @And("^In the left side option, choose \"([^\"]*)\" size$")
    public void in_the_left_side_option_choose_something_size(String strArg1) throws Throwable {
    	
    	Thread.sleep(1500);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/ul/li[10]/span/a/span/span/button")).click();
    	
    }

    @And("^In the left side option, mark eligible for Pay on delivery$")
    public void in_the_left_side_option_mark_eligible_for_pay_on_delivery() throws Throwable {
      
    	driver.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label/i")).click();
    	Thread.sleep(3000);
    }

    @And("^From the results, scroll down and select AMERICAN CREW product and navigate to Product page$")
    public void from_the_results_scroll_down_and_select_american_crew_product_and_navigate_to_product_page() throws Throwable {
        
    	driver.findElement(By.linkText("Printed Men Round Neck Full Sleeve T-Shirt"));
    	WebElement selectBrand = driver.findElement(By.linkText("Men's Regular Fit T-Shirt"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", selectBrand);
    	Thread.sleep(2500);
    	driver.findElement(By.linkText("Men's Regular Fit Polos")).click();
    	Thread.sleep(2000);
    	
    	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    	 driver.switchTo().window(tabs.get(1));
      	
    }

    @And("^Select Royal Blue & Navy Melange color$")
    public void select_royal_blue_navy_melange_color() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"a-autoid-12-announce\"]")).click();       
    	Thread.sleep(2000); 
       
    }

    @And("^Open and see size chart link present in product page then close it$")
    public void open_and_see_size_chart_link_present_in_product_page_then_close_it() throws Throwable {
        
    	WebElement chart = driver.findElement(By.linkText("Size Chart"));
		chart.click();
		Thread.sleep(1000);
		chart.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"a-popover-3\"]/div/header/button")).click();
    	Thread.sleep(2000);
    	}

    @And("^After that, select any size from size dropdown in product page$")
    public void after_that_select_any_size_from_size_dropdown_in_product_page() throws Throwable {
    	
    	Select option = new Select(driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]")));
 		option.selectByVisibleText("2XL");
 		Thread.sleep(2000);
    }
    
    @And("^Add that product to cart and verify whether it is reflected in cart or not with correct details$")
    public void add_that_product_to_cart_and_verify_whether_it_is_reflected_in_cart_or_not_with_correct_details() throws Throwable {
       
    	driver.findElement(By.id("add-to-cart-button")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
 		Thread.sleep(1000);
    }
    
    @Then("^Print the verification message in console for cart validation is success or not$")
    public void print_the_verification_message_in_console_for_cart_validation_is_success_or_not() throws Throwable {
    	String text = driver.findElement(By.className("a-truncate-cut")).getText();
	    Assert.assertTrue(text.contains("AMERICAN CREW Men's Polo T-Shirt"));
	    System.out.println(text);
	    
	    Thread.sleep(3000);
	    driver.quit();
    	
    }
    
    
  
}
