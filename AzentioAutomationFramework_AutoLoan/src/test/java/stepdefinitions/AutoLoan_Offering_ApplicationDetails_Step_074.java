package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

public class AutoLoan_Offering_ApplicationDetails_Step_074 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	ExcelData autoLoanExecutionSheet = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	Map<String, String> executionData = new HashMap<>();
	WebDriver driver = BaseClass.driver;
	JSPaths applicationdetailsJsPaths = new JSPaths(excelPath, "AppDataCheck_ApplicationDetails",
			"ApplicationDetails_FieldName", "JSPath");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ExcelData applicationdetailsExcelData = new ExcelData(excelTestDataPath, "AppDataCheck_ApplicationDetails",
			"DataSetID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_AL_AD_01$")
	public void get_the_test_data_for_test_case_AT_AL_AD_01() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_AD_01");
		testData = applicationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("User search the Ref id under inbox for Auto loan_Offering_Application details")
	public void user_search_the_ref_id_under_inbox_for_auto_loan_offering_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("inboxSearchInput"))
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

	@And("Validate that Product field is present in Application details")
	public void validate_that_product_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("Product")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("Product"))
				.isDisplayed());

	}

	@And("Validate that Sub product field is present in Application details")
	public void validate_that_sub_product_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SubProduct")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SubProduct")).isDisplayed());

	}

	@And("Validate that Total Finance amount requested field is present in Application details")
	public void validate_that_total_finance_amount_requested_field_is_present_in_application_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TotalFinanceAmountRequested")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TotalFinanceAmountRequested"))
				.isDisplayed());

	}

	@And("Validate that Declared net monthly income field is present in Application details")
	public void validate_that_declared_net_monthly_income_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("DeclaredNetMonthlyIncome")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("DeclaredNetMonthlyIncome"))
				.isDisplayed());

	}

	@And("Validate that Declared current obligations field is present in Application details")
	public void validate_that_declared_current_obligations_field_is_present_in_application_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("DeclaredCurrentObligations")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("DeclaredCurrentObligations"))
				.isDisplayed());

	}

	@And("Validate that Special promotion campaign field is present in Application details")
	public void validate_that_special_promotion_campaign_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpecialPromotionCampaign")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpecialPromotionCampaign"))
				.isDisplayed());

	}

	@And("Validate that Sourcing channel field is present in Application details")
	public void validate_that_sourcing_channel_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingChannel")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingChannel")).isDisplayed());

	}

	@And("Validate that Business center code field is present in Application details")
	public void validate_that_business_center_code_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("BusinessCenterCode")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("BusinessCenterCode")).isDisplayed());

	}

	@And("Validate that Servicing type field is present in Application details")
	public void validate_that_servicing_type_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ServicingType")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ServicingType")).isDisplayed());

	}

	@And("Validate that Region field is present in Application details")
	public void validate_that_region_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("Region")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("Region"))
				.isDisplayed());

	}

	@And("Validate that Servicing branch field is present in Application details")
	public void validate_that_servicing_branch_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ServicingBranch")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ServicingBranch")).isDisplayed());

	}

	@And("Navigate to Application details section for Auto loan_Offering_Application details")
	public void navigate_to_application_details_section_for_auto_loan_offering_application_details()
			throws IOException {

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("applicationDetailsTab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate that Spoke Location field is present in Application details")
	public void validate_that_spoke_location_field_is_present_in_application_details() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpokeLocation"))
						.isDisplayed());
				Assert.assertEquals(javascriptHelper
						.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpokeLocation"))
						.getAttribute("ng-reflect-readonly"), "true");
				// Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpokeLocation")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that ClosingStaff ServicingStaff field is present in Application details")
	public void validate_that_closing_staff_servicing_staff_field_is_present_in_application_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ClosingStaffOrServicingStaff")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ClosingStaffOrServicingStaff"))
				.isDisplayed());

	}

	@And("Validate that Topup type field is present in Application details")
	public void validate_that_topup_type_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupType")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupType")).isDisplayed());

	}

	@And("Validate that Topup application No field is present in Application details")
	public void validate_that_topup_application_no_field_is_present_in_application_details() throws IOException {
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupApplicationNo")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupApplicationNo")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupApplicationNo")).isDisplayed());

	}

	@And("Validate that Sourcing Type field is present in Application details")
	public void validate_that_sourcing_type_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingType")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingType")).isDisplayed());

	}

	@And("Validate that Sourcing Office field is present in Application details")
	public void validate_that_sourcing_office_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingOffice")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingOffice")).isDisplayed());

	}

	@And("Validate that Sourcing Entity field is present in Application details")
	public void validate_that_sourcing_entity_field_is_present_in_application_details() throws IOException {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingEntity")));
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingEntity")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingEntity")).isDisplayed());

	}

	@And("Validate that Sourcing Staff field is present in Application details")
	public void validate_that_sourcing_staff_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingStaff")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingStaff")).isDisplayed());

	}

	@And("Validate that Reference Type field is present in Application details")
	public void validate_that_reference_type_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceType")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceType")).isDisplayed());

	}

	@And("Validate that Reference Code field is present in Application details")
	public void validate_that_reference_code_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceCode")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceCode")).isDisplayed());

	}

	@And("Validate the back button functionality of Application details")
	public void validate_the_back_button_functionality_of_application_details() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("BackButton")).click();
				break;
			} catch (Exception e) {

			}
		}

	}

}












