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
		ijaraLogin.loginWithIjaraApplication("userType07");
	}
	@And("login with valid credentials to test the tawrraq new app screen")
	public void login_with_valid_credentials_to_test_the_tawrraq_new_app_screen() throws Throwable{
		ijaraLogin.loginWithIjaraApplication("userType01");
	}
	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application()throws Throwable {
		ijaraLogin.logoutFromIjara();
	}
	@And("login with valid credentials for test the Ijarah New App stage")
	public void login_with_valid_credentials_for_test_the_ijarah_new_app_stage() {
		ijaraLogin.loginWithIjaraApplication("userType08");
	}
	@And("login with valid credentials for test the Murabha Facility details")
	public void login_with_valid_credentials_for_test_the_murabha_facility_details() {
		ijaraLogin.loginWithIjaraApplication("userType07");
	}
	@Given("login with valid credentials for Ijara_Appdatacheck_Document details")
	public void login_with_valid_credentials_for_ijara_appdatacheck_document_details() {
		ijaraLogin.loginWithIjaraApplication("userType01");
	}
	@Given("login with valid credentials for Murabha offering document details")
	public void login_with_valid_credentials_for_murabha_offering_document_details() {
		ijaraLogin.loginWithIjaraApplication("userType14");
	}
	@Given("login with valid credentials for Murabha_Offering_OfferDetails")
	public void login_with_valid_credentials_for_murabha_offering_offer_details() {
		ijaraLogin.loginWithIjaraApplication("userType10");
	}
	@And("login with valid credentials for Murabha_App data entry_Employment details")
	public void login_with_valid_credentials_for_murabha_app_data_entry_employment_details() {
		ijaraLogin.loginWithIjaraApplication("userType11");
	}
	@And("login with valid credentials for Tawarraq_App data entry_Employment details")
	public void login_with_valid_credentials_for_tawarraq_app_data_entry_employment_details() {
		ijaraLogin.loginWithIjaraApplication("userType12");
	}
	@And("login with valid credentials for Tawarraq_CustomerReference")
	public void login_with_valid_credentials_for_tawarraq_customer_reference() {
		ijaraLogin.loginWithIjaraApplication("userType08");
	}
	@And("login with valid credentials for Murabha_customer personal details")
	public void login_with_valid_credentials_for_murabha_customer_personal_details() {
		ijaraLogin.loginWithIjaraApplication("userType13");
	}
	@And("login with valid credentials for Tawarraq_CommodityPurchaseMaker")
	public void login_with_valid_credentials_for_tawarraq_commodity_purchase_maker() {
		ijaraLogin.loginWithIjaraApplication("userType06");
	}
	@Given("login with valid credentials for Murabha_OperationCheck")
	public void login_with_valid_credentials_for_murabha_operation_check() {
		ijaraLogin.loginWithIjaraApplication("userType13");
	}
	@And("login with valid credentials for Autoloan_Identification")
	public void login_with_valid_credentials_for_autoloan_identification() {
		ijaraLogin.loginWithIjaraApplication("userType15");
	    
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
