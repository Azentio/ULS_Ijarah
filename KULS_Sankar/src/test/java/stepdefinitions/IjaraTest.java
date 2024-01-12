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
		ijaraLogin.loginWithIjaraApplication("userType13");
	}

//	App Data Stage --> UserType01
	@And("login with valid credentials-App Data Entry")
	public void login_with_valid_credentials_app_data_entry()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType01");
	}
	
//	 Return the record
	@And("login with valid credentials for return")
	public void login_with_valid_credentials_for_return()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("UserReturn");
	}
	
//	Underwriter Stage --> UserType02
	@And("login with valid credentials-Underwriter")
	public void login_with_valid_credentials_underwriter()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType02");
	}
	
//	Data Check Stage --> UserType03
	@And("login with valid credentials-Data Check")
	public void login_with_valid_credentials_data_check()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType03");
	}
	
//	Offering Stage --> UserType04
	@And("login with valid credentials-Offering")
	public void login_with_valid_credentials_offering()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType04");
	}
	
//	Contract Signing Stage -- UserType05
	@And("login with valid credentials-Contract Signing")
	public void login_with_valid_credentials_contract_signing()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType05");
	}
		
	
//	Murabaha Product -- App Data Entry Stage ---> UserType06
	@And("login with valid credentials-Murabaha App Data Entry")
	public void login_with_valid_credentials_murabaha_app_data_entry()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType06");
	}
	
//	Murabaha Product -- App Data Check Stage ---> UserType07
	@And("login with valid credentials-Murabaha Data Check stage")
	public void login_with_valid_credentials_murabaha_data_check_stage()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType07");
	}
	
//	************************** Tawarruq Product ***********************************
//	Tawarruq Product -- App Data Entry Stage ---> UserType08
	@And("login with valid credentials-Tawarruq App Data Entry")
	public void login_with_valid_credentials_tawarruq_app_data_entry()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType08");
	}
	
//	Tawarruq Product -- New Application Stage ---> UserType01
	@And("login with valid credentials-Tawarruq New App")
	public void login_with_valid_credentials_tawarruq_new_app()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType01");
	}
	
//	Tawarruq Product -- Offering Stage ---> userType09
	@And("login with valid credentials-Tawarruq Offering stage")
	public void login_with_valid_credentials_tawarruq_offering_stage()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType09");
	}
	
//	Tawarruq Product -- App Data Check Stage ---> UserType12
	@And("login with valid credentials-Tawarruq Data Check stage")
	public void login_with_valid_credentials_tawarruq_data_check_stage()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType12");
	}	
	
	
//	Auto Loan Product -- App Data Entry Stage ---> userType10
	@And("login with valid credentials - Auto Loan - App Data Entry")
	public void login_with_valid_credentials_auto_loan_app_data_entry()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType10");
	}
	
//	Auto Loan Product -- Underwriter L1 Stage ---> userType10
	@And("login with valid credentials - Auto Loan - Underwriter L1")
	public void login_with_valid_credentials_auto_loan_underwriter_l1()throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType11");
	}
	
	
	
	
	
	
	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application()throws Throwable {		
		ijaraLogin.logoutFromIjara();
	}
	
}
