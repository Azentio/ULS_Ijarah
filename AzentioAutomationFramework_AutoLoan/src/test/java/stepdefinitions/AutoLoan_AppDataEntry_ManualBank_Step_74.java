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

public class AutoLoan_AppDataEntry_ManualBank_Step_74 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	ExcelData autoLoanExecutionSheet = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	JSPaths manualbankJsPaths = new JSPaths(excelPath, "AutoLoan_ManualBank", "ALManualBank_FieldName", "JSPath");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	int indexOfListView;
	ExcelData manualbankExcelData = new ExcelData(excelTestDataPath, "AutoLoan_ManualBank", "DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	Map<String, String> executionData = new HashMap<>();

	@And("^User_074 get the test data for test case AT_AL_MB_01$")
	public void get_the_test_data_for_test_case_AT_AL_MB_01() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_01");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_MB_02$")
	public void get_the_test_data_for_test_case_AT_AL_MB_02() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_02");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_MB_03$")
	public void get_the_test_data_for_test_case_AT_AL_MB_03() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_03");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_MB_04$")
	public void get_the_test_data_for_test_case_AT_AL_MB_04() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_04");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_MB_05$")
	public void get_the_test_data_for_test_case_AT_AL_MB_05() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_05");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_MB_06$")
	public void get_the_test_data_for_test_case_AT_AL_MB_06() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_06");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_MB_07$")
	public void get_the_test_data_for_test_case_AT_AL_MB_07() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_MB_07");
		testData = manualbankExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("User_074 search the Ref id under inbox for Autoloan_Manual bank")
	public void user_074_search_the_ref_id_under_inbox_for_autoloan_manual_bank() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("inboxSearchInput"))
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

	@And("Navigate to Manual bank tab in Autoloan_Manual bank")
	public void navigate_to_manual_bank_tab_in_autoloan_manual_bank() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ManualBankTab")).click();
				break;
			} catch (Exception e) {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("nextBtn")).click();
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that Customer name field is displayed in Autoloan_Manual bank view list")
	public void validate_that_customer_name_field_is_displayed_in_autoloan_manual_bank_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("CustomerName_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(manualbankJsPaths.getElement("CustomerName_ViewList")).isDisplayed());

	}

	@And("Validate that Account number field is displayed in Autoloan_Manual bank view list")
	public void validate_that_account_number_field_is_displayed_in_autoloan_manual_bank_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountNumber_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountNumber_ViewList")).isDisplayed());

	}

	@And("Validate that Bank code field is displayed in Autoloan_Manual bank view list")
	public void validate_that_bank_code_field_is_displayed_in_autoloan_manual_bank_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode_ViewList")).isDisplayed());

	}

	@And("Validate that Branch code field is displayed in Autoloan_Manual bank view list")
	public void validate_that_branch_code_field_is_displayed_in_autoloan_manual_bank_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BranchCode_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(manualbankJsPaths.getElement("BranchCode_ViewList")).isDisplayed());

	}

	@And("Search the Auto loan manual bank record with valid data")
	public void search_the_auto_loan_manual_bank_record_with_valid_data() {
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("SearchButton")).click();
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
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + manualbankJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Search the Auto loan manual bank record with invalid data")
	public void search_the_auto_loan_manual_bank_record_with_invalid_data() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + manualbankJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Validate the export to PDF functionality in Auto loan manual bank")
	public void validate_the_export_to_pdf_functionality_in_auto_loan_manual_bank() throws IOException {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ExportPDF")).click();
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

	@And("Validate the export to Excel functionality in Auto loan manual bank")
	public void validate_the_export_to_excel_functionality_in_auto_loan_manual_bank() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ExportXLS")).click();
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

	@And("Click on Add icon in Autoloan_Manual bank page")
	public void click_on_add_icon_in_autoloan_manual_bank_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("Addbutton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Account holder name field in Autoloan_Manual bank")
	public void enter_the_value_in_account_holder_name_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName"))
						.sendKeys(testData.get("AccountHolderName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Bank code field in Autoloan_Manual bank")
	public void enter_the_value_in_bank_code_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode"))
						.sendKeys(testData.get("BankCode"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Account branch field in Autoloan_Manual bank")
	public void enter_the_value_in_account_branch_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountBranch")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountBranch"))
						.sendKeys(testData.get("AccountBranch"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Bank Account type field in Autoloan_Manual bank")
	public void select_the_value_in_bank_account_type_field_in_autoloan_manual_bank() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountType")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isBlank())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("BankAccountType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("BankAccountType")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}

	}

	@And("Enter the value in Bank Account number field in Autoloan_Manual bank")
	public void enter_the_value_in_bank_account_number_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountNumber"))
						.sendKeys(testData.get("BankAccountNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Currency code field in Autoloan_Manual bank")
	public void select_the_value_in_currency_code_field_in_autoloan_manual_bank() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("CurrencyCode")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isBlank())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("CurrencyCode").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CurrencyCode")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}

	}

	@And("Click on Save icon in Autoloan_Manual bank")
	public void click_on_save_icon_in_autoloan_manual_bank() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Field is required popup is displayed in Autoloan_Manual bank")
	public void validate_field_is_required_popup_is_displayed_in_autoloan_manual_bank() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("requiredFieldError")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(manualbankJsPaths.getElement("requiredFieldError")).isDisplayed());

	}

	@And("Enter special characters in text field in Autoloan_Manual bank")
	public void enter_special_characters_in_text_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName"))
						.sendKeys(testData.get("AccountHolderName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate alphanumeric characters allowed popup is displayed in Autoloan_Manual bank")
	public void validate_alphanumeric_characters_allowed_popup_is_displayed_in_autoloan_manual_bank()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("specialCharError")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("specialCharError"))
				.isDisplayed());

	}

	@And("Click on pencil icon of existing record in Autoloan_Manual bank")
	public void click_on_pencil_icon_of_existing_record_in_autoloan_manual_bank() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("Edit_icon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Account holder name field in Autoloan_Manual bank")
	public void update_the_value_in_account_holder_name_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).click();
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName"))
						.sendKeys(testData.get("AccountHolderName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Bank code field in Autoloan_Manual bank")
	public void update_the_value_in_bank_code_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode")).click();
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankCode"))
						.sendKeys(testData.get("BankCode"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Account branch field in Autoloan_Manual bank")
	public void update_the_value_in_account_branch_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountBranch")).click();
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountBranch")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountBranch"))
						.sendKeys(testData.get("AccountBranch"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Bank Account type field in Autoloan_Manual bank")
	public void update_the_value_in_bank_account_type_field_in_autoloan_manual_bank() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountType")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isBlank())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("BankAccountType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("BankAccountType")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}

	}

	@And("Update the value in Bank Account number field in Autoloan_Manual bank")
	public void update_the_value_in_bank_account_number_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountNumber")).click();
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountNumber")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("BankAccountNumber"))
						.sendKeys(testData.get("BankAccountNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Currency code field in Autoloan_Manual bank")
	public void update_the_value_in_currency_code_field_in_autoloan_manual_bank() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("CurrencyCode")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isBlank())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("CurrencyCode").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CurrencyCode")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}

	}

	@And("Remove the value in required field in Autoloan_Manual bank")
	public void remove_the_value_in_required_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).click();
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).clear();

	}

	@And("Update special characters in text field in Autoloan_Manual bank")
	public void update_special_characters_in_text_field_in_autoloan_manual_bank() {
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).click();
		javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("AccountHolderName"))
						.sendKeys(testData.get("BoxNo"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the status to Inactive in Autoloan_Manual bank")
	public void update_the_status_to_inactive_in_autoloan_manual_bank() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("Status")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the status to Active in Autoloan_Manual bank")
	public void update_the_status_to_active_in_autoloan_manual_bank() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("Status")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate View summary functionality in Autoloan_Manual bank")
	public void validate_view_summary_functionality_in_autoloan_manual_bank() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("ViewSummaryIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(manualbankJsPaths.getElement("TransactionSummaryPage")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(manualbankJsPaths.getElement("TransactionSummaryPage")).isDisplayed());

	}

}
