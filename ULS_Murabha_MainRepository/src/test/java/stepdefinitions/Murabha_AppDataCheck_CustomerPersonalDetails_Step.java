package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
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

public class Murabha_AppDataCheck_CustomerPersonalDetails_Step {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath =configFileReader.getJSFilePath();
	String excelTestDataPath =configFileReader.getMurabhaTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Murabha_CommonElements", "Murabha_CommonFieldName", "JSPath");
	JSPaths customerpersonaldetailsJsPaths = new JSPaths(excelPath, "Murabha_CustomerPersonalDetails", "Murabha_AppDataCheck_CustomerPersonalDetails", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	
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
	ExcelData customerpersonaldetailsExcelData  = new ExcelData(excelTestDataPath,"CustomerPersonalDetails","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("Navigate to Customer details section")
	public void navigate_to_customer_details_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("customer_details_tab")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	@And("^User get the test data for test case AT_M_CDC_01$")
    public void get_the_test_data_for_test_case_AT_M_CDC_01() throws Throwable {
		testData = customerpersonaldetailsExcelData.getTestdata("AT_M_CDC_01_D1");
    }
	@And("^User get the test data for test case AT_M_CDC_02$")
    public void get_the_test_data_for_test_case_AT_M_CDC_02() throws Throwable {
		testData = customerpersonaldetailsExcelData.getTestdata("AT_M_CDC_02_D1");
    }
	@And("^User get the test data for test case AT_M_CDC_03$")
    public void get_the_test_data_for_test_case_AT_M_CDC_03() throws Throwable {
		testData = customerpersonaldetailsExcelData.getTestdata("AT_M_CDC_03_D1");
    }
	@And("^User get the test data for test case AT_M_CDC_04$")
    public void get_the_test_data_for_test_case_AT_M_CDC_04() throws Throwable {
		testData = customerpersonaldetailsExcelData.getTestdata("AT_M_CDC_04_D1");
    }

	@And("Validate Application type field is displayed in customer personal details page")
	public void validate_application_type_field_is_displayed_in_customer_personal_details_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("application_type_dropdown")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("application_type_dropdown")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		
	    
	}

	@And("Validate customer type field is displayed in customer personal details page")
	public void validate_customer_type_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("customer_details_type_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("customer_details_type_dropdown")).isDisplayed());
	    
	}

	@And("Validate title field is displayed in customer personal details page")
	public void validate_title_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("title_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("title_dropdown")).isDisplayed());
	    
	}

	@And("Validate first name field is displayed in customer personal details page")
	public void validate_first_name_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("first_name_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("first_name_input")).isDisplayed());
	    
	}

	@And("Validate middle name field is displayed in customer personal details page")
	public void validate_middle_name_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("middle_name_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("middle_name_input")).isDisplayed());
	    
	}

	@And("Validate last name field is displayed in customer personal details page")
	public void validate_last_name_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("last_name_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("last_name_input")).isDisplayed());
	    
	}

	@And("Validate first name arabic field is displayed in customer personal details page")
	public void validate_first_name_arabic_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("first_name_arabic_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("first_name_arabic_input")).isDisplayed());
	    
	}

	@And("Validate middle name arabic field is displayed in customer personal details page")
	public void validate_middle_name_arabic_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("middle_name_arabic_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("middle_name_arabic_input")).isDisplayed());
	    
	}

	@And("Validate last name arabic field is displayed in customer personal details page")
	public void validate_last_name_arabic_field_is_displayed_in_customer_personal_details_page()  throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("last_name_arabic_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("last_name_arabic_input")).isDisplayed());
	    
	}

	@And("Validate date of birth field is displayed in customer personal details page")
	public void validate_date_of_birth_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("date_of_birth_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("date_of_birth_input")).isDisplayed());
	    
	}

	@And("Validate age field is displayed in customer personal details page")
	public void validate_age_field_is_displayed_in_customer_personal_details_page()  throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("age_get_value")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("age_get_value")).isDisplayed());
	    
	}

	@And("Validate gender field is displayed in customer personal details page")
	public void validate_gender_field_is_displayed_in_customer_personal_details_page() throws IOException {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("gender_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("gender_dropdown")).isDisplayed());
	    
	}

	@And("Validate education level field is displayed in customer personal details page")
	public void validate_education_level_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("education_level_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("education_level_dropdown")).isDisplayed());
	    
	}

	@And("Validate maritail status field is displayed in customer personal details page")
	public void validate_maritail_status_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("maritail_status_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("maritail_status_dropdown")).isDisplayed());
	    
	}

	@And("Validate nationality field is displayed in customer personal details page")
	public void validate_nationality_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("nationality_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("nationality_dropdown")).isDisplayed());
	    
	}

	@And("Validate residential status field is displayed in customer personal details page")
	public void validate_residential_status_field_is_displayed_in_customer_personal_details_page()  throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("customer_residential_status_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("customer_residential_status_dropdown")).isDisplayed());
	    
	}

	@And("Validate language field is displayed in customer personal details page")
	public void validate_language_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("languages_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("languages_dropdown")).isDisplayed());
	    
	}

	@And("Validate no of dependents field is displayed in customer personal details page")
	public void validate_no_of_dependents_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("no_of_dependents_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("no_of_dependents_input")).isDisplayed());
	    
	}

	@And("Validate client category field is displayed in customer personal details page")
	public void validate_client_category_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("client_category_dropdown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("client_category_dropdown")).isDisplayed());
	    
	}

	@And("Validate blacklisted field is displayed in customer personal details page")
	public void validate_blacklisted_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("blacklisted_toggle")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("blacklisted_toggle")).isDisplayed());
	    
	}

	@And("Validate remarks field is displayed in customer personal details page")
	public void validate_remarks_field_is_displayed_in_customer_personal_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("remarks_input")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("remarks_input")).isDisplayed());
	    
	}
	@And("Validate that existing records are present in customer personal details page")
	public void validate_that_existing_records_are_present_in_customer_personal_details_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("EyeIconInViewlist")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate First name field is displayed in customer personal details view list")
	public void validate_first_name_field_is_displayed_in_customer_personal_details_view_list() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("FirstName_ViewList")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
	    
	}

	@And("Validate Middle name field is displayed in customer personal details view list")
	public void validate_middle_name_field_is_displayed_in_customer_personal_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("MiddleName_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("MiddleName_ViewList")).isDisplayed());
	    
	}

	@And("Validate Last name field is displayed in customer personal details view list")
	public void validate_last_name_field_is_displayed_in_customer_personal_details_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("LastName_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("LastName_ViewList")).isDisplayed());
	    
	}

	@And("Validate Family name field is displayed in customer personal details view list")
	public void validate_family_name_field_is_displayed_in_customer_personal_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("FamilyName_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("FamilyName_ViewList")).isDisplayed());
	    
	}

	@And("Validate Customer type field is displayed in customer personal details view list")
	public void validate_customer_type_field_is_displayed_in_customer_personal_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("CustomerType_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("CustomerType_ViewList")).isDisplayed());
	    
	}

	@And("Validate Applicant type field is displayed in customer personal details view list")
	public void validate_applicant_type_field_is_displayed_in_customer_personal_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("ApplicantType_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("ApplicantType_ViewList")).isDisplayed());
	    
	}

	@And("Validate Status field is displayed in customer personal details view list")
	public void validate_status_field_is_displayed_in_customer_personal_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("Status_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("Status_ViewList")).isDisplayed());
	    
	}

	@And("Search the customer personal details record with valid details")
	public void search_the_customer_personal_details_record_with_valid_details() {
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("SearchButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("valid_search_text"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + customerpersonaldetailsJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertFalse(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	    
	}

	@And("Search the customer personal details record with invalid details")
	public void search_the_customer_personal_details_record_with_invalid_details() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {

				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + customerpersonaldetailsJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				if (documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	    
	}
	@And("User search the Ref id under inbox for Customer personal details")
	public void user_search_the_ref_id_under_inbox_for_customer_personal_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	@And("Click on eye icon of Existing record in customer personal details")
	public void click_on_eye_icon_of_existing_record_in_customer_personal_details() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(customerpersonaldetailsJsPaths.getElement("EyeIconInViewlist")).click();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}

}
