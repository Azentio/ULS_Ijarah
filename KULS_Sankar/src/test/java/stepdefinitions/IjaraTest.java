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

//	App Data Stage --> UserType01
	@And("login with valid credentials-App Data Entry")
	public void login_with_valid_credentials_app_data_entry()throws Throwable {
		ijaraLogin.loginWithIjaraApplicationAppData();
	}
	
	
//	Underwriter Stage --> UserType02
	@And("login with valid credentials-Underwriter")
	public void login_with_valid_credentials_underwriter()throws Throwable {
		ijaraLogin.loginWithIjaraApplicationUnderwriter();
	}
	
//	Data Check Stage --> UserType03
	@And("login with valid credentials-Data Check")
	public void login_with_valid_credentials_data_check()throws Throwable {
		ijaraLogin.loginWithIjaraApplicationDataCheck();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application()throws Throwable {		
		ijaraLogin.logoutFromIjara();
	}
	
}
