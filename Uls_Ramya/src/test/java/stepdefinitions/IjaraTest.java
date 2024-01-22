package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;

public class IjaraTest extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	@And("Navigate the IJARA URL")
	public void Navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	}
	@And("User_6047 login with valid credentials")
	public void login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithIjaraApplication();
	}
	@And("login with valid credentials")
	public void login_with_valid_credentials1() throws Throwable {
		ijaraLogin.loginWithIjaraApplication();
	}
	@And("User_6047 Login With valid credentials-Tawarruq-offering-offerDetails")
	public void Login_with_valid_credentials_Tawarruq_offering_offerDetails() throws Throwable {
		ijaraLogin.loginWithIjaraApplication_offoring();	
	}
	@And("User_6047 Login with valid credentials- NewApp-CustometDetails")
	public void Login_with_valid_credentials_NewApp_CustometDetails() throws Throwable {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_NewApp_CustomerDetails();	
	}
	@And("User_6047 Login with valid credentials - AppDataEntry-DocumentDetails")
	public void user_login_with_valid_credentials_AppDataEntry_DocumentDetails() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataEntry_DocumentDetails();
	}
	@And("User_6047 Login with valid credentials - Tawarruq-AppDataEntry-Repayment")
	public void user_login_with_valid_credentials_tawarruq_app_data_entry_repayment() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataEntry_Repayment();	
	}
	@And("User_6047 Login with valid credentials-Tawarruq-AppDataEntry-customerDetails")
	public void user_login_with_valid_credentials_tawarruq_app_data_entry_customer_details() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataEntry_customerDetails();
	}
	@And("User_6047 Login With valid credentials - commodity-insuranceIfo,documentDetails")
	public void Login_with_valid_credentials_commodity_insuranceIfo_documentDetails()throws Throwable {
		ijaraLogin.loginWithIjaraApplication_commodity_insuranceIfo_documentDetails();	
	}
	@And("User_6047 Login with valid credentials-Murabha-AppDataEntry-RepaymentMode")
	public void user6047_login_with_valid_credentials_murabha_app_data_entry_repayment_mode() {
		ijaraLogin.loginWithIjaraApplication_murabha_AppDataEntry_RepaymentMode();
	}
	@And("User_6047 Login With valid credentials-Murabha-offering-offerDetails")
	public void Login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithIjaraApplication();	
	}
	@And("User_6047 Login with valid credentials - murabha-DocumentDetails")
	public void Login_with_valid_credentials_murabha_DocumentDetails()throws Throwable {
		ijaraLogin.loginWithIjaraApplication_Murabha_offering_Document_Details();	
	}
	@And("User_6047 login with valid credentials-ijara-DataCheck-Employment detail")
	public void user_login_with_valid_credentials_ijara_data_check_employment_detail() {
		ijaraLogin.loginWithIjaraApplication_ijara_data_check_employment_detail();
	
	}
	@Then("User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails")
	public void user_6047_login_with_valid_credentials_app_data_entry_auto_loan_asset_details() {
		ijaraLogin.loginWithIjaraApplication_AppDataEntry_AutoLoan_AssetDetails();	
	}
	@And("User_6047 Login With valid credentials-AutoLoan_AppDataEntry_AddresDetails")
	public void Login_with_valid_credentials_autoloan_appdataentry_addressdetails() throws Throwable {
		ijaraLogin.loginWithIjaraApplication_AutoLoan_AppDataEntry_AddresDetails();	
	}
	@And("User_6047 Login with valid credentials-ijara-AppDataEntry_FacilityInfo")
	public void user_login_with_valid_credentials_ijara_app_data_entry_facility_info() {
		ijaraLogin.loginWithIjaraApplication_ijara_AppDataEntry_FacilityInfo();
	}
	@And("User_6047 Login With valid credentials -Tawarruq - AppDataCheck - InsuranceIfo")
	public void user_6047_login_with_valid_credentials_tawarruq_app_data_check_insurance_ifo() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataCheck_InsuranceInfo();
	}
	@And("User_6047 Login With valid credentials -Tawarruq - AppDataCheck - Quotation Info")
	public void user_6047_login_with_valid_credentials_tawarruq_app_data_check_quotation_info() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataCheck_QuotationInfo();
	}
	@Given("User_6047 Login with valid credentials-Tawarruq-AppDataCheck-RepaymentMode")
	public void user_6047_login_with_valid_credentials_tawarruq_app_data_check_repayment_mode() {
		ijaraLogin.loginWithTawarruqApplication_Tawarruq_AppDataCheck_RepaymentMode();
	}
	@And("User_6047 Login with valid credentials-Tawarruq-AppDataEntry_FacilityInfo")
	public void user_6047_login_with_valid_credentials_tawarruq_app_data_entry_facility_info() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataEntry_FacilityDetails();
	}
	@Given("User_6047 login with valid credentials-Murabha_Data Check-Identifications Details")
	public void user_6047_login_with_valid_credentials_murabha_data_check_identifications_details() {
		ijaraLogin.loginWithIjaraApplication_Murabha_AppDataEntry_IdentificationDetails();
	}
	@Given("User_6047 Login With valid credentials-Murabha_AppDataEntry_AddresDetails")
	public void user_6047_login_with_valid_credentials_murabha_app_data_entry_addres_details() {
		ijaraLogin.loginWithIjaraApplication_Murabha_AppDataEntry_AdressDetails();
	}
	@And("User_6047 Login With valid credentials-Murabha-offering-offerDetail")
	public void userLogin_with_valid_credentials_murabha_offering_offerDetail() {
		ijaraLogin.loginWithIjaraApplication_murabha_offering_offerDetail();	
	}
	@And("User_6047 login with valid credentials-Murabha-DataCheck-ProductDetails")
	public void user_login_with_valid_credentials_murabha_data_check_product_details() {
		ijaraLogin.loginWithIjaraApplication_Murabha_AppDataCheck_ProductDetails();
	}
	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}

	






}

