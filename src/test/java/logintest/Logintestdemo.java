package logintest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintestdemo {
	
	@Given("The user go on Login page")
	public void the_user_go_on_Login_page() {
	   
	}

	@When("^the user enters \"(.*)\" and \"(.*)\"$")
	public void the_user_enters_and(String username, String password) {
	   System.out.println("we are entring" + username + ":" + password);
	}

	@And("the user click on login button")
	public void the_user_click_on_login_button() {
	    
	}

	@Then("user go on the home page")
	public void user_go_on_the_home_page() {
	   
	}

	@Given("user go on logout option")
	public void user_go_on_logout_option() {
	    
	}

	@Then("Massage display Successfully")
	public void massage_display_Successfully() {
	    
	}


}
