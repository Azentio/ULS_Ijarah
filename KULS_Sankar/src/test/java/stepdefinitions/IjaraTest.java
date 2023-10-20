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
	
//	Offering Stage --> UserType04
	@And("login with valid credentials-Offering")
	public void login_with_valid_credentials_offering()throws Throwable {
		ijaraLogin.loginWithIjaraApplicationOfferingStage();
	}
	
//	Contract Signing Stage -- UserType05
	@And("login with valid credentials-Contract Signing")
	public void login_with_valid_credentials_contract_signing()throws Throwable {
		ijaraLogin.loginWithIjaraApplicationContractSigning();
	}
		
	
//	Murabaha Product -- App Data Entry Stage ---> UserType06
	@And("login with valid credentials-Murabaha App Data Entry")
	public void login_with_valid_credentials_murabaha_app_data_entry()throws Throwable {
		ijaraLogin.loginWithMurabahaApplicationAppDataEntry();
	}
	
//	Murabaha Product -- App Data Check Stage ---> UserType07
	@And("login with valid credentials-Murabaha Data Check stage")
	public void login_with_valid_credentials_murabaha_data_check_stage()throws Throwable {
		ijaraLogin.loginWithMurabahaApplicationDataCheck();
	}
	
	
	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application()throws Throwable {		
		ijaraLogin.logoutFromIjara();
	}
	
}
