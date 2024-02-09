package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class AutoLoan_AppDataEntry_IdentificationDetails_Step074 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths identificationdetailsJsPaths = new JSPaths(excelPath, "AutoLoan_Identification",
			"Autoloan_Identification_FieldName", "JSPath");
	ExcelData autoLoanExecutionSheet = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	Map<String, String> executionData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	int indexOfListView;

	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData identificationdetailsExcelData = new ExcelData(excelTestDataPath, "AutoLoan_IdentificationDetails",
			"DataSet ID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User_074 get the test data for test case AT_AL_IDA_01$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_01() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_01");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_IDA_02$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_02() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_02");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_IDA_03$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_03() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_03");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_IDA_04$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_04() throws Throwable {

		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_04");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_IDA_05$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_05() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_05");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_IDA_06$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_06() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_06");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_IDA_07$")
	public void get_the_test_data_for_test_case_AT_AL_IDA_07() throws Throwable {
		executionData = autoLoanExecutionSheet.getTestdata("AT_AL_IDA_07");
		testData = identificationdetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("User_074 search the Ref id under inbox for Autoloan_Identification details")
	public void user_074search_the_ref_id_under_inbox_for_autoloan_identification_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("inboxSearchInput"))
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

	@And("Navigate to Additional customer info tab in Tawarraq_Commodity maker")
	public void navigate_to_additional_customer_info_tab_in_tawarraq_commodity_maker() {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equalsIgnoreCase("0") && length.equalsIgnoreCase("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Additional Customer Info")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
						addButton.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_074 Click on pencil icon of existing record in Customer personal Information section")
	public void user_074_click_on_pencil_icon_of_existing_record_in_customer_personal_information_section() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(
						identificationdetailsJsPaths.getElement("PencilIconinCustomerPersonalInformation")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Click on Add button in Autoloan_Identification details")
	public void user_074_click_on_add_button_in_autoloan_identification_details() {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Identification")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title')[" + j
								+ "].parentElement.nextElementSibling.querySelector('button')";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						// addButton.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Select the value in ID Type field in Autoloan_Identification details")
	public void user_074_select_the_value_in_id_type_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDTypeField"))
						.click();
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
			System.out.println("Map " + testData.get("IDType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IDType")).trim())) {
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

	@And("Enter the value in ID Number field in Autoloan_Identification details")
	public void enter_the_value_in_id_number_field_in_autoloan_identification_details() {
		javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.sendKeys(testData.get("IDNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Issue Date field in Autoloan_Identification details")
	public void enter_the_value_in_issue_date_field_in_autoloan_identification_details() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		System.out.println("Date " + format);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IssueDate"))
						.click();
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IssueDate"))
						.sendKeys(format);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Enter the value in Expiry Date field in Autoloan_Identification details")
	public void enter_the_value_in_expiry_date_field_in_autoloan_identification_details() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		System.out.println("Date " + format);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExpiryDate"))
						.click();
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExpiryDate"))
						.sendKeys(format);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Select the value in Issuing Authority field in Autoloan_Identification details")
	public void user_074_select_the_value_in_issuing_authority_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IssuingAuthorityField"))
						.click();
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
			System.out.println("Map " + testData.get("IssuingAuthority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IssuingAuthority")).trim())) {
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

	@And("User_074 Select the value in Country of Issue field in Autoloan_Identification details")
	public void user_074_select_the_value_in_country_of_issue_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("CountryOfIssueField"))
						.click();
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
			System.out.println("Map " + testData.get("CountryOfIssue").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CountryOfIssue")).trim())) {
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

	@And("User_074 Click on Save icon in Autoloan_Identification details")
	public void user_074_click_on_save_icon_in_autoloan_identification_details() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Validate field is required popup is displayed in Autoloan_Identification details")
	public void user_074_validate_field_is_required_popup_is_displayed_in_autoloan_identification_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("requiredFieldError")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("requiredFieldError"))
				.isDisplayed());

	}

	@And("Enter special characters in required field in Autoloan_Identification details")
	public void enter_special_characters_in_required_field_in_autoloan_identification_details() {
		javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.sendKeys(testData.get("IDNumber"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Validate alphanumeric characters allowed popup is displayed in Autoloan_Identification details")
	public void user_074_validate_alphanumeric_characters_allowed_popup_is_displayed_in_autoloan_identification_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("specialCharError")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("specialCharError"))
				.isDisplayed());

	}

	@And("User_074 Click on Edit icon of existing record in Autoloan_Identification details")
	public void user_074_click_on_edit_icon_of_existing_record_in_autoloan_identification_details() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("EditIcon")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Update the value in ID Type field in Autoloan_Identification details")
	public void user_074_update_the_value_in_id_type_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDTypeField"))
						.click();
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
			System.out.println("Map " + testData.get("IDType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IDType")).trim())) {
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

	@And("User_074 Update the value in ID Number field in Autoloan_Identification details")
	public void user_074_update_the_value_in_id_number_field_in_autoloan_identification_details() {
		javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField")).click();

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.sendKeys(testData.get("IDNumber"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Update the value in Issuing Authority field in Autoloan_Identification details")
	public void user_074_update_the_value_in_issuing_authority_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IssuingAuthorityField"))
						.click();
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
			System.out.println("Map " + testData.get("IssuingAuthority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IssuingAuthority")).trim())) {
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

	@And("User_074 Update the value in Country of Issue field in Autoloan_Identification details")
	public void user_074_update_the_value_in_country_of_issue_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("CountryOfIssueField"))
						.click();
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
			System.out.println("Map " + testData.get("IssuingAuthority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IssuingAuthority")).trim())) {
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

	@And("User_074 Remove the value in required field in Autoloan_Identification details")
	public void remove_the_value_in_required_field_in_autoloan_identification_details() {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.click();
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}

	}

	@And("User_074 Update special characters in required field in Autoloan_Identification details")
	public void user_074_update_special_characters_in_required_field_in_autoloan_identification_details() {
		javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.sendKeys(testData.get("IDNumber"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Update status to Inactive in Autoloan_Identification details")
	public void user_074_update_status_to_inactive_in_autoloan_identification_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ActiveInactie")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Update status to Active in Autoloan_Identification details")
	public void user_074_update_status_to_active_in_autoloan_identification_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ActiveInactie")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Validate Help icon is displayed in Autoloan_Identification details")
	public void user_074_validate_help_icon_is_displayed_in_autoloan_identification_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("HelpButton")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("HelpButton")).isDisplayed());

	}

	@And("User_074 Validate back button functionality in Autoloan_Identification details")
	public void user_074_validate_back_button_functionality_in_autoloan_identification_details() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("BackButton")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Validate ID type field is displayed in Autoloan_Identification details")
	public void user_074_validate_id_type_field_is_displayed_in_autoloan_identification_details() throws IOException {
		for (int i = 0; i <= 50; i++) {
			try {
				Actions action = new Actions(driver);
				WebElement idType = javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdType"));
				action.scrollToElement(idType);
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdType"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_074 Validate ID number field is displayed in Autoloan_Identification details")
	public void user_074_validate_id_number_field_is_displayed_in_autoloan_identification_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdNumber")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdNumber"))
				.isDisplayed());

	}

	@And("User_074 Validate Date of Issue field is displayed in Autoloan_Identification details")
	public void user_074_validate_date_of_issue_field_is_displayed_in_autoloan_identification_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfIssue")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfIssue"))
				.isDisplayed());

	}

	@And("User_074 Validate Place of Issue field is displayed in Autoloan_Identification details")
	public void user_074_validate_place_of_issue_field_is_displayed_in_autoloan_identification_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_PlaceOfIssue")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_PlaceOfIssue"))
				.isDisplayed());

	}

	@And("User_074 Validate Date of Expiry field is displayed in Autoloan_Identification details")
	public void user_074_validate_date_of_expiry_field_is_displayed_in_autoloan_identification_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfExpiry")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfExpiry"))
				.isDisplayed());

	}

	@And("User_074 Validate Primary ID flag field is displayed in Autoloan_Identification details")
	public void user_074_validate_primary_id_flag_field_is_displayed_in_autoloan_identification_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_PrimaryIDFlag")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_PrimaryIDFlag"))
				.isDisplayed());

	}

	@And("User_074 Validate status field is displayed in Autoloan_Identification details")
	public void user_074_validate_status_field_is_displayed_in_autoloan_identification_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_Status")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_Status")).isDisplayed());

	}

	@And("User_074 Search the Autoloan identification details record with valid data")
	public void user_074_search_the_autoloan_identification_details_record_with_valid_data()
			throws InterruptedException {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelector('button[icon="pi pi-pencil"')
		String listViewName = "";
		String noOfListView = "";
		boolean isIndexFound = false;
		for (int i = 0; i <= 300; i++) {
			try {
				noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
				if (noOfListView.equals("0") && !(noOfListView.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("No Of List view " + noOfListView);
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
							+ i + "].innerText").toString();
					if (listViewName.contains("Customer Identification")) {

						indexOfListView = i;
						System.out.println("List view index " + indexOfListView);

						isIndexFound = true;
						break;
					} else {

						isIndexFound = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}

				}
			}
			if (isIndexFound == true) {
				break;
			}

		}

		String searchButton = "document.querySelectorAll(' ion-row button[ng-reflect-icon=\"pi pi-search\"]')["
				+ indexOfListView + "]";

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(searchButton).click();

				if (i > 250) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(searchButton));
					javascriptHelper.executeScriptWithWebElement(searchButton).click();
					break;
				}
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(testData.get("valid_search_text"));
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.sendKeys(testData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}

		}

		String searchResult = "";
		System.out.println("Index is " + indexOfListView);
		Thread.sleep(500);
		for (int i = 0; i <= 60000; i++) {
			try {
				if (i > 50000) {
					searchResult = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView
									+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
							.toString();
					break;
				}
			} catch (Exception e) {
				if (i == 60000) {
					Assert.fail(e.getMessage());
				}
			}

		}

		System.out.println(searchResult);

		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries");

	}

	@And("User_074 Search the Autoloan identification details record with invalid data")
	public void user_074_search_the_autoloan_identification_details_record_with_invalid_data()
			throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.sendKeys(testData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String searchResult = "";
		System.out.println("Index is " + indexOfListView);
		Thread.sleep(500);
		for (int i = 0; i <= 60000; i++) {
			try {
				if (i > 50000) {
					searchResult = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView
									+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
							.toString();
					break;
				}
			} catch (Exception e) {
				if (i == 60000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(searchResult);
		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries");

	}

	@And("User_074 Validate Export to PDF Functionality in Autoloan identification details")
	public void user_074_validate_export_to_pdf_functionality_in_autoloan_identification_details() throws IOException {
		String length = null;

		for (int i = 0; i < 500; i++) {

			try {

				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length")
						.toString();

				System.out.println(length);

				if (!length.isBlank()) {

					break;

				}

			} catch (Exception e) {

				if (i == 499) {

					Assert.fail(e.getMessage());

				}

			}

		}

		for (int i = 0; i < 500; i++) {

			try {

				for (int j = 0; j < Integer.parseInt(length); j++) {

					String title = "return document.querySelectorAll('ion-title')[" + j + "].innerText";

					String titlename = javascriptHelper.executeScript(title).toString();

					System.out.println(titlename);

					if (titlename.trim().contains("Customer Identification")) {

						System.out.println("condition true");

						String jspath = "document.querySelectorAll('ion-title')[" + j
								+ "].parentElement.nextElementSibling.querySelector('p-dropdown')";

						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);

//							System.out.println(jspath);

//							javascriptHelper.scrollIntoView(addButton);

						addButton.click();

						break;

					}

				}

				break;

			} catch (Exception e) {

				if (i == 499) {

					Assert.fail(e.getMessage());

				}

			}

		}

//		for (int i = 0; i <= 2000; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExportIcon"))
//						.click();
//				break;
//			} catch (Exception e) {
//				if (i == 2000) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}

		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExportPDF"))
						.click();
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

	@And("User_074 Validate Export to Excel Functionality in Autoloan identification details")
	public void user_074_validate_export_to_excel_functionality_in_autoloan_identification_details() {
		String length = null;

		for (int i = 0; i < 500; i++) {

			try {

				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length")
						.toString();

				System.out.println(length);

				if (!length.isBlank()) {

					break;

				}

			} catch (Exception e) {

				if (i == 499) {

					Assert.fail(e.getMessage());

				}

			}

		}

		for (int i = 0; i < 500; i++) {

			try {

				for (int j = 0; j < Integer.parseInt(length); j++) {

					String title = "return document.querySelectorAll('ion-title')[" + j + "].innerText";

					String titlename = javascriptHelper.executeScript(title).toString();

					System.out.println(titlename);

					if (titlename.trim().contains("Customer Identification")) {

						System.out.println("condition true");

						String jspath = "document.querySelectorAll('ion-title')[" + j
								+ "].parentElement.nextElementSibling.querySelector('p-dropdown')";

						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);

//					System.out.println(jspath);

//					javascriptHelper.scrollIntoView(addButton);

						addButton.click();

						break;

					}

				}

				break;

			} catch (Exception e) {

				if (i == 499) {

					Assert.fail(e.getMessage());

				}

			}

		}
//		for (int i = 0; i <= 2000; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExportIcon"))
//						.click();
//				break;
//			} catch (Exception e) {
//				if (i == 2000) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ExportXLS"))
						.click();
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

	@And("Find the position of Identification details view list at AutoLoan")
	public void find_the_position_of_identification_details_view_list_at_auto_loan() {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelector('button[icon="pi pi-pencil"')
		String listViewName = "";
		String noOfListView = "";
		boolean isIndexFound = false;
		for (int i = 0; i <= 300; i++) {
			try {
				noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
				if (noOfListView.equals("0") && !(noOfListView.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("No Of List view " + noOfListView);
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
							+ i + "].innerText").toString();
					if (listViewName.contains("Customer Identification")) {

						indexOfListView = i;
						System.out.println("List view index " + indexOfListView);

						isIndexFound = true;
						break;
					} else {

						isIndexFound = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}

				}
			}
			if (isIndexFound == true) {
				break;
			}

		}
	}

}
