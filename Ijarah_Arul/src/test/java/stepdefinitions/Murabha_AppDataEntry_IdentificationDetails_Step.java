package stepdefinitions;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

public class Murabha_AppDataEntry_IdentificationDetails_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths identificationdetailsJsPaths = new JSPaths(excelPath, "AutoLoan_Identification",
			"Autoloan_Identification_FieldName", "JSPath");
	// JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements",
	// "Underwriter_FieldName", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
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

	@And("^User_074 get the test data for test case AT_MU_AR_IDA_01$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_01() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_01_D1");
	}
	@And("^User_074 get the test data for test case AT_MU_AR_IDA_02$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_02() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_02_D1");
	}
	@And("^User_074 get the test data for test case AT_MU_AR_IDA_03$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_03() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_03_D1");
	}
	@And("^User_074 get the test data for test case AT_MU_AR_IDA_04$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_04() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_04_D1");
	}
	@And("^User_074 get the test data for test case AT_MU_AR_IDA_05$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_05() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_05_D1");
	}
	@And("^User_074 get the test data for test case AT_MU_AR_IDA_06$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_06() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_06_D1");
	}
	@And("^User_074 get the test data for test case AT_MU_AR_IDA_07$")
	public void user_074_get_the_test_data_for_test_case_AT_MU_AR_IDA_07() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_MU_AR_IDA_07_D1");
	}
	
	
	@And("User_074 search the Ref id under inbox for Murabha_AppDataEntry_Identification details")
	public void user_074_search_the_ref_id_under_inbox_for_murabha_app_data_entry_identification_details() throws IOException {
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

	@And("User_074 Select the value in ID Type field in Murabha App data entry Identification details")
	public void user_074_select_the_value_in_id_type_field_in_murabha_app_data_entry_identification_details() {
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

	@And("Enter the value in ID Number field in Murabha App data entry Identification details")
	public void enter_the_value_in_id_number_field_in_murabha_app_data_entry_identification_details() {
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

	@And("Enter the value in Issue Date field in Murabha App data entry Identification details")
	public void enter_the_value_in_issue_date_field_in_murabha_app_data_entry_identification_details() {
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

	@And("Enter the value in Expiry Date field in Murabha App data entry Identification details")
	public void enter_the_value_in_expiry_date_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Select the value in Issuing Authority field in Murabha App data entry Identification details")
	public void user_074_select_the_value_in_issuing_authority_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Select the value in Country of Issue field in Murabha App data entry Identification details")
	public void user_074_select_the_value_in_country_of_issue_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Update the value in ID Type field in Murabha App data entry Identification details")
	public void user_update_the_value_in_id_type_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Update the value in ID Number field in Murabha App data entry Identification details")
	public void user_074_update_the_value_in_id_number_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Update the value in Issuing Authority field in Murabha App data entry Identification details")
	public void user_074_update_the_value_in_issuing_authority_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Update the value in Country of Issue field in Murabha App data entry Identification details")
	public void user_074_update_the_value_in_country_of_issue_field_in_murabha_app_data_entry_identification_details() {
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

	@And("Enter special characters in required field in Murabha App data entry Identification details")
	public void enter_special_characters_in_required_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Update special characters in required field in Murabha App data entry Identification details")
	public void user_074_update_special_characters_in_required_field_in_murabha_app_data_entry_identification_details() {
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

	@And("User_074 Search the Murabha App data entry identification details record with valid data")
	public void user_074_search_the_murabha_app_data_entry_identification_details_record_with_valid_data() throws InterruptedException {
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

	@And("User_074 Search the Murabha App data entry identification details record with invalid data")
	public void user_074_search_the_murabha_app_data_entry_identification_details_record_with_invalid_data() throws InterruptedException {
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

}
