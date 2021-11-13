package assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesmenttest {
	
	WebDriver driver;
	Actions act;
	@Before
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("User go to  the login page")
	public void user_go_to_the_login_page() throws InterruptedException {
	   driver.get("https://www.flipkart.com");
	   Thread.sleep(3000);
	}

	@When("User go to the home page")
	public void user_go_to_the_home_page() {
	    driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("malivs6395@gmail.com");
	    driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("vinay@321");
	}

	@Given("User go on homepage")
	public void user_go_on_homepage() {
	   driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	}

	@Given("The user go on home page")
	public void the_user_go_on_home_page() {
	    driver.findElement(By.name("q")).click();
	}

	@Then("user sees the search option on homepage")
	public void user_sees_the_search_option_on_homepage() throws InterruptedException {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 Thread.sleep(4000);
	}

	@Given("user go on homepage")
	public void user_go_on_homepage1() {
	    
	}

	@Then("product will displayed on homepage")
	public void product_will_displayed_on_homepage() {
	   driver.findElement(By.name("q")).sendKeys("Applemobile");
	}

	
	@Then("we will sees the products are various catagerise or not on home page")
	public void we_will_sees_the_products_are_various_catagerise_or_not_on_home_page() {
	    JavascriptExecutor j = ((JavascriptExecutor)driver);
	    j.executeScript("window.ScrollBy(0,500)");
	}
	
	
	@Then("user will sees the product is clikable")
	public void user_will_sees_the_product_is_clikable() {
		WebElement Ele = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']"));
	     new Actions(driver);
	    act.moveToElement(Ele).click().build().perform();
	    
	}

	
  @Then("user sees the profile section present or not on homepage")
	public void user_sees_the_profile_section_present_or_not_on_homepage() {
	    WebElement account = driver.findElement(By.xpath("//div[text()='My Account']"));
	    new Actions(driver);
	    act.moveToElement(account).build().perform();
	}
	 
	@After
	public void close() {
		driver.close();
	}
	
	
	
}
