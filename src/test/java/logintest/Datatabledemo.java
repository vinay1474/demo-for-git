package logintest;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatabledemo {
	
	
	@Given("User is on Home page")
	public void user_is_on_Home_page() {
	   
	}

	@When("User navigate to Login Page")
	public void user_navigate_to_Login_Page() {
	    
	}

	@And("User enters Credentials")
	public void user_enters_Credentials(DataTable dataTable) {
	  List<List<String>> table = dataTable.asLists();
	     System.out.println(table.get(2).get(1));
	}

	@Then("massage Displayed login Successfully")
	public void massage_Displayed_login_Successfully() {
	   
	}
	
	

}
