package logintest.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrmtest {
	WebDriver driver;
	@Before
	public void lounchersetup() {
		WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
		
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
	}

	@When("The user enters the vaild username and password")
	public void the_user_enters_the_vaild_username_and_password()  {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	 
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	   driver.findElement(By.id("btnLogin")).click();
	   Thread.sleep(5000);
	}

	@Then("User go on dashbord page")
	public void user_go_on_dashbord_page() {
	   String title = driver.getTitle();
	    System.out.println(title); 
	}
	
	@After
	public void Closewindow() {
		driver.close();
	}
	
}
