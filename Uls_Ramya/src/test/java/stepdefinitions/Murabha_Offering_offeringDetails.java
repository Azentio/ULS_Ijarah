package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_Offering_offeringDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Murabha_offerDetail = new JSPaths(excelPath, "tawa_offering_js", "OfferDetailsElement", "JSPath");
	ExcelData Murabha_offerDetail_TestData  = new ExcelData(excelTestDataPath,"mura_offering_offerDetail","Dataset ID");
	@And("User_6047 Login With valid credentials-Murabha-offering-offerDetails")
	public void Login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithIjaraApplication();	
	}
	
	@And("User_6047 Login With valid credentials-Murabha-offering-offerDetail")
	public void Login_with_valid_credentials_murabha_offering_offerDetail() throws Throwable {
		ijaraLogin.loginWithIjaraApplication_murabha_offering_offerDetail();	
	}
	
	@And("User_6047 Get the test data for test case ID AT_MU_OFO_01")
	public void user_get_the_test_data_for_test_case_id_AT_MU_OFO_01() {	
		testData =  Murabha_offerDetail_TestData.getTestdata("DS01_AT_MU_OFO_01");
	}
	@And("User_6047 verify the Offer Details section under offer details")
	public void user_verify_the_offer_details_section_under_offer_details() {
		boolean OfferDetail_Verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				OfferDetail_Verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("OfferDetail_Verify")).isDisplayed();
				if (OfferDetail_Verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(OfferDetail_Verify, "OfferDetail is not visisble hence failed");
	}

	@Then("User_6047 verify the Finance Details section under offer details")
	public void user_verify_the_finance_details_section_under_offer_details() {
		boolean FinancialDetails_Verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				FinancialDetails_Verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("FinancialDetails_Verify")).isDisplayed();
				if (FinancialDetails_Verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(FinancialDetails_Verify, "FinancialDetails is not visisble hence failed");
	}

	@Then("User_6047 verify the Credit Risk Factor \\(CONV) section under offer details")
	public void user_verify_the_credit_risk_factor_conv_section_under_offer_details() {
		boolean CreditRiskFactor_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				CreditRiskFactor_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("CreditRiskFactor_verify")).isDisplayed();
				if (CreditRiskFactor_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(CreditRiskFactor_verify, "CreditRiskFactor is not visisble hence failed");
	}

	@Then("User_6047 verify the Credit Score Details \\(CONV) section under offer details")
	public void user_verify_the_credit_score_details_conv_section_under_offer_details() {
		boolean CreditScoreDetail_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				CreditScoreDetail_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("CreditScoreDetail_verify")).isDisplayed();
				if (CreditScoreDetail_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(CreditScoreDetail_verify, "CreditScoreDetail is not visisble hence failed");
	}

	@Then("User_6047 verify the Eligibility Details section under offer details")
	public void user_verify_the_eligibility_details_section_under_offer_details() {
		boolean EligibilityDetail_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				EligibilityDetail_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("EligibilityDetail_verify")).isDisplayed();
				if (EligibilityDetail_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(EligibilityDetail_verify, "EligibilityDetail is not visisble hence failed");
	}

	@Then("User_6047 verify the Interest Rate Structure section under offer details")
	public void user_verify_the_interest_rate_structure_section_under_offer_details() {
		boolean InterestRateStructure_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				InterestRateStructure_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("InterestRateStructure_verify")).isDisplayed();
				if (InterestRateStructure_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(InterestRateStructure_verify, "InterestRateStructure is not visisble hence failed");
	}

	@Then("User_6047 verify the Installments section under offer details")
	public void user_verify_the_installments_section_under_offer_details() {
		boolean Installments_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				Installments_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("Installments_verify")).isDisplayed();
				if (Installments_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(Installments_verify, "Installments is not visisble hence failed");
	}
	

	@Then("User_6047 verify the Appeal Request section under offer details")
	public void user_verify_the_appeal_request_section_under_offer_details() {
		boolean AppealRequest_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				AppealRequest_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("AppealRequest_verify")).isDisplayed();
				if (AppealRequest_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(AppealRequest_verify, "AppealRequest is not visisble hence failed");
	}
	
}

