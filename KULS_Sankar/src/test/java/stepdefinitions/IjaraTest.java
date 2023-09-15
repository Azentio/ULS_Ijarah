package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;

public class IjaraTest extends BaseClass{
	WebDriver driver=BaseClass.driver;
	ConfigFileReader configFileReader= new ConfigFileReader();
	IjaraLogin ijaraLogin= new IjaraLogin();
	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	 
	}
	@And("login with valid credentials")
	public void login_with_valid_credentials()throws Throwable {
		ijaraLogin.loginWithIjaraApplication();
	}

	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application()throws Throwable {
		
		ijaraLogin.logoutFromIjara();
	}
	
	
	// This login used to another link don't use , I used only take JS path purpose
	@Given("navigate the IJARA URL1")
	public void navigate_the_ijara_url1() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL1());	 
	}
	
	@And("login with valid credentials1")
	public void login_with_valid_credentials1()throws Throwable {
		ijaraLogin.loginWithIjaraApplication1();
	}
	
	
}
