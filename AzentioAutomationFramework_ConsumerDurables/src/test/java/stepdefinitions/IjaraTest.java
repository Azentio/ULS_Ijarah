package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataprovider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;

public class IjaraTest {

	WebDriver driver=BaseClass.driver;
	ConfigFileReader configFileReader= new ConfigFileReader();
	IjaraLogin ijaraLogin= new IjaraLogin();
	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	 
	}
	
//	Consumer Durable Product -- App Data Entry Stage ---> userType02
	@And("login with valid credentials - Consumer Durable - App Data Entry")
	public void login_with_valid_credentials_consumer_durable_app_data_entry()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType02");
	}
	
	
	@Then("logout from the ULS Application")
	public void logout_from_the_uls_application()throws Throwable {		
		ijaraLogin.logoutFromIjara();
	}
}
