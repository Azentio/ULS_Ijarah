package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

public class Ijara_AppDataCheck_RepaymentMode_Step {
	ConfigFileReader confileReader = new ConfigFileReader();
	String excelPath = confileReader.getJSFilePath();
	String excelTestDataPath = confileReader.getIjarahTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths repaymentModeJsPaths = new JSPaths(excelPath, "RepaymentMode_Elements", "RepaymentMode_FieldName",
			"JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	ExcelData IjarahExecutionSheet = new ExcelData(excelTestDataPath, "Ijarah_ExecutionTracker", "TestCase ID");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ExcelData repaymentmodeExcelData = new ExcelData(excelTestDataPath, "AppDataCheck_RepaymentMode", "DataSetID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_RDC_001$")
	public void get_the_test_data_for_test_case_AT_RDC_001() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_RDC_001");
		testData = repaymentmodeExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User get the test data for test case AT_RDC_002$")
	public void get_the_test_data_for_test_case_AT_RDC_002() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_RDC_002");
		testData = repaymentmodeExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User get the test data for test case AT_RDC_004$")
	public void get_the_test_data_for_test_case_AT_RDC_004() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_RDC_004");
		testData = repaymentmodeExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("User navigate to Repayment mode module")
	public void user_navigate_to_repayment_mode_module() {
		for (int i = 0; i <=300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("RepaymentMode")).click();
				// javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("RepaymentMode")));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on view icon of existing record in repayment mode")
	public void click_on_view_icon_of_existing_record_in_repayment_mode() {
		for (int i = 0; i <=300; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(repaymentModeJsPaths.getElement("EyeIconInViewlist")));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that Repayment mode field is displayed in repayment mode page")
	public void validate_that_repayment_mode_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <=300; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("RepaymentMode")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(repaymentModeJsPaths.getElement("RepaymentMode")).isDisplayed());
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Validate that Account Holder Name field is displayed in repayment mode page")
	public void validate_that_account_holder_name_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountHolderName")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountHolderName")).isDisplayed());

	}

	@And("Validate that Account Type field is displayed in repayment mode page")
	public void validate_that_account_type_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountType"))
				.isDisplayed());

	}

	@And("Validate that Account Number field is displayed in repayment mode page")
	public void validate_that_account_number_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountNumber")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountNumber"))
				.isDisplayed());

	}

	@And("Validate that Account Currency field is displayed in repayment mode page")
	public void validate_that_account_currency_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountCurrency")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountCurrency")).isDisplayed());

	}

	@And("Validate that Bank Name field is displayed in repayment mode page")
	public void validate_that_bank_name_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("BankName")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("BankName"))
				.isDisplayed());

	}

	@And("Validate that Bank Branch field is displayed in repayment mode page")
	public void validate_that_bank_branch_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("BankBranch")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("BankBranch"))
				.isDisplayed());
	}

	@And("Validate that ECS Code field is displayed in repayment mode page")
	public void validate_that_ecs_code_field_is_displayed_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("ECSCODE")));
		Assert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("ECSCODE")).isDisplayed());

	}

	@And("Validate that existing records are present in repayment mode page")
	public void validate_that_existing_records_are_present_in_repayment_mode_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("EyeIconInViewlist")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("EyeIconInViewlist")).isDisplayed());

	}

	@And("Validate that Repayment mode field is displayed in repayment mode module view list")
	public void validate_that_repayment_mode_field_is_displayed_in_repayment_mode_module_view_list()
			throws IOException {
		for (int i = 0; i <=300; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(repaymentModeJsPaths.getElement("RepaymentModeField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(repaymentModeJsPaths.getElement("RepaymentModeField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate that Account holder name field is displayed in repayment mode module view list")
	public void validate_that_account_holder_name_field_is_displayed_in_repayment_mode_module_view_list()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountHolderNameField")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountHolderNameField")).isDisplayed());
	}

	@And("Validate that Account type field is displayed in repayment mode module view list")
	public void validate_that_account_type_field_is_displayed_in_repayment_mode_module_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountTypeField")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountTypeField")).isDisplayed());

	}

	@And("Validate that Account Currency field is displayed in repayment mode module view list")
	public void validate_that_account_currency_field_is_displayed_in_repayment_mode_module_view_list()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountCurrencyField")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(repaymentModeJsPaths.getElement("AccountCurrencyField")).isDisplayed());

	}

	@And("Validate that Bank Name field is displayed in repayment mode module view list")
	public void validate_that_bank_name_field_is_displayed_in_repayment_mode_module_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("BankNameField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("BankNameField"))
				.isDisplayed());

	}

	@And("Validate that Currency field is displayed in repayment mode module view list")
	public void validate_that_currency_field_is_displayed_in_repayment_mode_module_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("Status")));
		Assert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("Status")).isDisplayed());

	}

	@And("User search the Ref id under inbox for App data check_Repayment mode")
	public void user_search_the_ref_id_under_inbox_for_app_data_check_repayment_mode() throws IOException {
		System.out.println(testData.get("Ref No"));
		System.out.println(repaymentModeJsPaths.getElement("inboxSearchInput"));
		// waitHelper.waitForElementwithFluentwait(driver,
		// javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <=300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(repaymentModeJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				;
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
