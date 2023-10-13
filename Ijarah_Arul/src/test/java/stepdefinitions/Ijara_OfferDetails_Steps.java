package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijara_OfferDetails_Steps {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	//JSPaths offerdetailsJsPaths = new JSPaths(excelPath, "DocumentDetails_Elements", "DocumentDetails_FieldName", "JSPath");
	//JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	JSPaths offerdetailsJsPaths = new JSPaths(excelPath, "OfferDetails_Elements", "OfferDetails_FieldName", "JSPath");
	
	
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	//ExcelData documentdetailsExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	//ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData offerdetailsExcelData  = new ExcelData(excelTestDataPath,"Offer_Details","DataSetID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_OFL_08$")
    public void get_the_test_data_for_test_case_AT_OFL_08() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_08_D1");
    }
	@And("^User get the test data for test case AT_OFL_09$")
    public void get_the_test_data_for_test_case_AT_OFL_09() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_09_D1");
    }
	@And("^User get the test data for test case AT_OFL_10$")
    public void get_the_test_data_for_test_case_AT_OFL_10() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_10_D1");
    }
	@And("^User get the test data for test case AT_OFL_11$")
    public void get_the_test_data_for_test_case_AT_OFL_11() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_11_D1");
    }
	@And("^User get the test data for test case AT_OFL_12$")
    public void get_the_test_data_for_test_case_AT_OFL_12() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_12_D1");
    }
	@And("^User get the test data for test case AT_OFL_13$")
    public void get_the_test_data_for_test_case_AT_OFL_13() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_13_D1");
    }
	@And("^User get the test data for test case AT_OFL_15$")
    public void get_the_test_data_for_test_case_AT_OFL_15() throws Throwable {
		testData = offerdetailsExcelData.getTestdata("AT_OFL_15_D1");
    }
	
	@And("Validate the Eligibility type field is displayed in Eligibility details section")
	public void validate_the_eligibility_type_field_is_displayed_in_eligibility_details_section() throws IOException{
		
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityTypeField")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityTypeField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityTypeField")).isDisplayed());
		
	}

	@And("Validate the Eligibility amount field is displayed in Eligibility details section")
	public void validate_the_eligibility_amount_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityAmountField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityAmountField")).isDisplayed());
	   
	}

	@And("Validate the Eligibility percentage field is displayed in Eligibility details section")
	public void validate_the_eligibility_percentage_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityPercentField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("EligibilityPercentField")).isDisplayed());
	   
	}

	@And("Validate the Currency field is displayed in Eligibility details section")
	public void validate_the_currency_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("CurrencyField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("CurrencyField")).isDisplayed());
	   
	}

	@And("Validate the Actual Percentage field is displayed in Eligibility details section")
	public void validate_the_actual_percentage_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("ActualPercentageField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("ActualPercentageField")).isDisplayed());
	   
	}

	@And("Validate the Deviation level field is displayed in Eligibility details section")
	public void validate_the_deviation_level_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("DeviationLevelField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("DeviationLevelField")).isDisplayed());
	   
	}
	@And("Validate the Period field is displayed in Interest rate structure section")
	public void validate_the_period_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		
	   
	}

	@And("Validate the Rate definition field is displayed in Interest rate structure section")
	public void validate_the_rate_definition_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_RateDefinition")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_RateDefinition")).isDisplayed());
	   
	}

	@And("Validate the Effective Rate field is displayed in Interest rate structure section")
	public void validate_the_effective_rate_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_EffectiveRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_EffectiveRate")).isDisplayed());
	   
	}

	@And("Validate the Base Rate is displayed in Interest rate structure section")
	public void validate_the_base_rate_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_BaseRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_BaseRate")).isDisplayed());
	   
	}

	@And("Validate the Spread rate field is displayed in Interest rate structure section")
	public void validate_the_spread_rate_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_SpreadRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_SpreadRate")).isDisplayed());
	   
	}

	@And("Validate the Cap rate is displayed in Interest rate structure section")
	public void validate_the_cap_rate_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_CapRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_CapRate")).isDisplayed());
	   
	}

	@And("Validate the Floor rate field is displayed in Interest rate structure section")
	public void validate_the_floor_rate_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_FloorRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_FloorRate")).isDisplayed());
	   
	}

	@And("Validate the RBP Adjuster field is displayed in Interest rate structure section")
	public void validate_the_rbp_adjuster_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_RBPAdjuster")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_RBPAdjuster")).isDisplayed());
	   
	}

	@And("Validate the Penalty rate is displayed in Interest rate structure section")
	public void validate_the_penalty_rate_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_PenaltyRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_PenaltyRate")).isDisplayed());
	   
	}

	@And("Validate the Penalty Fee field is displayed in Interest rate structure section")
	public void validate_the_penalty_fee_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_PenaltyFee")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_PenaltyFee")).isDisplayed());
	   
	}
	@And("Validate the Instalment Period field is displayed in Interest rate structure section")
	public void validate_the_instalment_period_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("Installments_InstallmentPeriod")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("Installments_InstallmentPeriod")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("Installments_InstallmentPeriod")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("Installments_InstallmentPeriod")).isDisplayed());
	   
	}

	@And("Validate the Installment Amount field is displayed in Interest rate structure section")
	public void validate_the_installment_amount_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("Installments_InstallmentAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("Installments_InstallmentAmount")).isDisplayed());
	   
	}

	@And("Validate the Accept offer button is present in Offering page")
	public void validate_the_accept_offer_button_is_present_in_offering_page() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("AcceptOfferButton")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("AcceptOfferButton")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("AcceptOfferButton")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("AcceptOfferButton")).isDisplayed());
	   
	}
	@And("Click on Accept offer button in offering page")
	public void click_on_accept_offer_button_in_offering_page() {
	    
	    
	}

	@And("Validate the Original requested amount field is displayed in Appeal request section")
	public void validate_the_original_requested_amount_field_is_displayed_in_appeal_request_section() throws IOException {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedAmount")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedAmount")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedAmount")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedAmount")).isDisplayed());
	    
	}

	@And("Validate the Original requested tenure field is displayed in Appeal request section")
	public void validate_the_original_requested_tenure_field_is_displayed_in_appeal_request_section() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedTenure")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedTenure")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedTenure")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("OriginalRequestedTenure")).isDisplayed());
	    
	}

	@And("Validate the New requested amount field in Appeal request section")
	public void validate_the_new_requested_amount_field_in_appeal_request_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedAmount")).isDisplayed());
	    
	}

	@And("Validate the New requested tenure field in Appeal request section")
	public void validate_the_new_requested_tenure_field_in_appeal_request_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedTenure")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedTenure")).isDisplayed());
	    
	}

	@And("Enter the value in New requested amount field in Appeal request section")
	public void enter_the_value_in_new_requested_amount_field_in_appeal_request_section() {
		javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedAmount"))
				.sendKeys(testData.get("NewRequestedAmount"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}
	    
	}

	@And("Enter the value in New requested tenure field in Appeal request section")
	public void enter_the_value_in_new_requested_tenure_field_in_appeal_request_section() {
		javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedTenure")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("NewRequestedTenure"))
				.sendKeys(testData.get("NewRequestedTenure"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}
	    
	}

	@And("Click on Save button in Appeal request section")
	public void click_on_save_button_in_appeal_request_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("SaveButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Click on Appeal button in Appeal request section")
	public void click_on_appeal_button_in_appeal_request_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("AppealButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	@And("Validate the Recommendations sanction Conditions link is displayed in Appeal request section")
	public void validate_the_recommendations_sanction_conditions_link_is_displayed_in_appeal_request_section() throws IOException {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("RecommendationsSanctionConditionsLink")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("RecommendationsSanctionConditionsLink")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("RecommendationsSanctionConditionsLink")));
//		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("RecommendationsSanctionConditionsLink")).isDisplayed());
	    
	}

	@And("Validate the Approval History link is displayed in Appeal request section")
	public void validate_the_approval_history_link_is_displayed_in_appeal_request_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("ApprovalHistoryLink")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("ApprovalHistoryLink")).isDisplayed());
	    
	}
	@And("User search the Ref id under inbox for offer details")
	public void user_search_the_ref_id_under_inbox_for_offer_details() throws IOException {
		System.out.println(testData.get("Ref No"));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	@And("Click on Pencil icon of existing record in offer details")
	public void click_on_pencil_icon_of_existing_record_in_offer_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(offerdetailsJsPaths.getElement("PencilIcon")));
				//javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
