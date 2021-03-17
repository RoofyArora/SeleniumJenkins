package stepdef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepDef {
	
	LoginPage login;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		login = new LoginPage();
	    
	}

	@When("user enters {string}")
	public void user_enters(String string) throws InterruptedException {
		Thread.sleep(1000);
		login.checkSearchField(string);
	    
	}
	
	@When("clicks on submit btn")
	public void clicks_on_submit_btn() throws InterruptedException {
		Thread.sleep(1000);
		login.clickBtn();
		Thread.sleep(1000);
		
	    
	}
	
	@Then("user is on watch page")
	public void user_is_on_watch_page() {
	   // Assert.assertTrue(login.getTitle().contains(""));
	}



}
