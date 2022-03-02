package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	
@Given("^User is on landing page$")
public void user_is_on_landing_page() 
{
	System.out.println("Navigated to login url");
}

@When("^User logs into application with username and password$")
public void user_logs_into_application()
{
	System.out.println("Login is successfuly");
}

@Then("^Home page is populated$")
public void Home_page_is_populated() 
{
	System.out.println("Homepage populated");
}

@And("^Cards are displayed$")
public void cards_are_displayed() 
{
	System.out.println("Cards displayed");
}
}
