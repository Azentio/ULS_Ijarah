package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_Offering_CustomerDetails_Step_074 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths customerdetailsJsPaths = new JSPaths(excelPath, "AutoLoan_CustomerDetails", "CustomerDetailsElements",
			"JSPath");
	Map<String, String> executionData = new HashMap<>();
	ExcelData autoLoanExecutionSheet = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");

	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ExcelData customerdetailsExcelData = new ExcelData(excelTestDataPath, "AutoLoan_CustomerDetails", "Dataset ID");
	Map<String, String> testData;

	@And("^User get the test data for test case AT_AL_OFF_CD_07$")
	public void get_the_test_data_for_test_case_AT_AL_OFF_CD_07() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_OFF_CD_07");
		testData = customerdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User get the test data for test case AT_AL_OFF_CD_08$")
	public void get_the_test_data_for_test_case_AT_AL_OFF_CD_08() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_OFF_CD_08");
		testData = customerdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User get the test data for test case AT_AL_OFF_CD_09$")
	public void get_the_test_data_for_test_case_AT_AL_OFF_CD_09() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_OFF_CD_09");
		testData = customerdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User get the test data for test case AT_AL_OFF_CD_10$")
	public void get_the_test_data_for_test_case_AT_AL_OFF_CD_10() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_OFF_CD_09");
		testData = customerdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("User navigate to Customer details section")
	public void user_navigate_to_customer_details_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("customerDetailsTab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on eye icon of existing record in AutoLoan_Offering_customer details")
	public void click_on_eye_icon_of_existing_record_in_auto_loan_offering_customer_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(customerdetailsJsPaths.getElement("EyeIconInViewlist")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that Relationship field is present in customer details")
	public void validate_that_relationship_field_is_present_in_customer_details() throws IOException {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("relationShip")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("relationShip")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("relationShip")).isDisplayed());

	}

	@And("Validate that Existing bank Relationship field is present in customer details")
	public void validate_that_existing_bank_relationship_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExistingBankRelationship")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExistingBankRelationship"))
				.isDisplayed());

	}

	@And("Validate that Blacklisted field is present in customer details")
	public void validate_that_blacklisted_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("blacklisted")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("blacklisted"))
				.isDisplayed());

	}

	@And("Validate that Politically Exposed field is present in customer details")
	public void validate_that_politically_exposed_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("politicallyExposed")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("politicallyExposed")).isDisplayed());

	}

	@And("Validate that Remarks field is present in customer details")
	public void validate_that_remarks_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("remarkData")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("remarkData"))
				.isDisplayed());

	}

	@And("Validate that Phone number field is present in customer details")
	public void validate_that_phone_number_field_is_present_in_customer_details() throws IOException {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PhoneNumber")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PhoneNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PhoneNumber"))
				.isDisplayed());

	}

	@And("Validate that Mobile number primary field is present in customer details")
	public void validate_that_mobile_number_primary_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("MobileNumberprimary")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("MobileNumberprimary")).isDisplayed());

	}

	@And("Validate that Mobile number secondary field is present in customer details")
	public void validate_that_mobile_number_secondary_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("MobileNumbersecondary")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("MobileNumbersecondary")).isDisplayed());

	}

	@And("Validate that Email field is present in customer details")
	public void validate_that_email_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("Email")));
		Assert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("Email")).isDisplayed());

	}

	@And("Validate that Prefered customer method field is present in customer details")
	public void validate_that_prefered_customer_method_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PreferedContactMethod")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PreferedContactMethod")).isDisplayed());

	}

	@And("Validate that Prefered time for customer field is present in customer details")
	public void validate_that_prefered_time_for_customer_field_is_present_in_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PreferedTimeForContact")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("PreferedTimeForContact"))
				.isDisplayed());

	}

	@And("Validate the CIF ID field is present in Customer details view list")
	public void validate_the_cif_id_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("CIFID_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("CIFID_ViewList")).isDisplayed());

	}

	@And("Validate the First name field is present in Customer details view list")
	public void validate_the_first_name_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("FirstNameViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("FirstNameViewList")).isDisplayed());

	}

	@And("Validate the Middle name field is present in Customer details view list")
	public void validate_the_middle_name_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("MiddleNameViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("MiddleNameViewList")).isDisplayed());

	}

	@And("Validate the Last name field is present in Customer details view list")
	public void validate_the_last_name_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("LastNameViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("LastNameViewList")).isDisplayed());

	}

	@And("Validate the Customer type field is present in Customer details view list")
	public void validate_the_customer_type_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("CustomerTypeViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("CustomerTypeViewList")).isDisplayed());

	}

	@And("Validate the Applicant type field is present in Customer details view list")
	public void validate_the_applicant_type_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ApplicantTypeViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ApplicantTypeViewList")).isDisplayed());

	}

	@And("Validate the Customer rating field is present in Customer details view list")
	public void validate_the_customer_rating_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("CustomerRatingViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("CustomerRatingViewList"))
				.isDisplayed());

	}

	@And("Validate the Status field is present in Customer details view list")
	public void validate_the_status_field_is_present_in_customer_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("StatusViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerdetailsJsPaths.getElement("StatusViewList")).isDisplayed());

	}

	@And("Search the customer details record with valid data")
	public void search_the_customer_details_record_with_valid_data() {
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("SearchButton")).click();
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
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + customerdetailsJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Search the customer details record with invalid data")
	public void search_the_customer_details_record_with_invalid_data() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + customerdetailsJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Validate the export to PDF functionality in Autoloan_Offering_Customer details")
	public void validate_the_export_to_pdf_functionality_in_autoloan_offering_customer_details() throws IOException {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExportPDF")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Insurance Quotation Details")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application Insurance Quotation Details"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
		}

	}

	@And("Validate the export to Excel functionality in Autoloan_Offering_Customer details")
	public void validate_the_export_to_excel_functionality_in_autoloan_offering_customer_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("ExportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Insurance Quotation Details_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(
						downloadsFile.getName().contains("Application Insurance Quotation Details_export_"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("User search the Ref id under inbox for Auto loan_Offering_Customer details")
	public void user_search_the_ref_id_under_inbox_for_auto_loan_offering_customer_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerdetailsJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
