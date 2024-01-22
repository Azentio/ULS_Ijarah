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

public class Tawarraq_IdentificationDetails_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths identificationdetailsJsPaths = new JSPaths(excelPath, "Tawarraq_IdentificationDetails",
			"IdentificationDetails_FieldName", "JSPath");
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
	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData identificationdetailsExcelData = new ExcelData(excelTestDataPath, "IdentificationDetails", "DataSetID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	int indexOfListView;

	@And("^User get the test data for test case AT_IDA_04$")
	public void get_the_test_data_for_test_case_AT_IDA_04() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_IDA_04_D1");
	}

	@And("^User get the test data for test case AT_IDA_05$")
	public void get_the_test_data_for_test_case_AT_IDA_05() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_IDA_05_D1");
	}

	@And("^User get the test data for test case AT_IDA_06$")
	public void get_the_test_data_for_test_case_AT_IDA_06() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_IDA_06_D1");
	}

	@And("^User get the test data for test case AT_IDA_07$")
	public void get_the_test_data_for_test_case_AT_IDA_07() throws Throwable {
		testData = identificationdetailsExcelData.getTestdata("AT_IDA_07_D1");
	}

	@And("Navigate to Additional customer info tab")
	public void navigate_to_additional_customer_info_tab() throws IOException {
		// waitHelper.waitForElementwithFluentwait(driver,
		// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("additionalCustomerInfoTab")));
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(
				// identificationdetailsJsPaths.getElement("additionalCustomerInfoTab")));
				// javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("additionalCustomerInfoTab")));
				javascriptHelper.executeScriptWithWebElement(
						identificationdetailsJsPaths.getElement("additionalCustomerInfoTab")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("click on Edit icon of existing record in Additional customer info")
	public void click_on_edit_icon_of_existing_record_in_additional_customer_info() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						identificationdetailsJsPaths.getElement("additionalCustInfoTabPencilIconBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("Click on Pencil icon in Customer identification section")
	public void click_on_pencil_icon_in_customer_identification_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("EditIcon")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("Update the value in ID type field in identification section")
	public void update_the_value_in_id_type_field_in_identification_section() {
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
			System.out.println("Map " + testData.get("UpdatedIDType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("UpdatedIDType")).trim())) {
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

	@And("Update the value in ID Number field in identification section")
	public void update_the_value_in_id_number_field_in_identification_section() {
		javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField")).click();
		javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("IDNumberField"))
						.sendKeys(testData.get("UpdatedIDNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					// Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Issuing Authority field in identification section")
	public void update_the_value_in_issuing_authority_field_in_identification_section() {
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
			System.out.println("Map " + testData.get("UpdatedIssuingAuthority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("UpdatedIssuingAuthority")).trim())) {
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

	@And("Update the value in Country of Issue field in identification section")
	public void update_the_value_in_country_of_issue_field_in_identification_section() {
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
			System.out.println("Map " + testData.get("UpdatedCountryOfIssue").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("UpdatedCountryOfIssue")).trim())) {
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

	@And("Click on Save icon in identification section")
	public void click_on_save_icon_in_identification_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the status to Inactive in Identification section")
	public void update_the_status_to_inactive_in_identification_section() {
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

	@And("Update the status to Active in Identification section")
	public void update_the_status_to_active_in_identification_section() {
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

	@And("Click on View icon in Customer identification section")
	public void click_on_view_icon_in_customer_identification_section() {

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewIcon")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Click on View summary button in identification section")
	public void click_on_view_summary_button_in_identification_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewSummaryIcon")));
				// javascriptHelper.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that user can navigate to View summary page")
	public void validate_that_user_can_navigate_to_view_summary_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						identificationdetailsJsPaths.getElement("TransactionSummaryPage")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("TransactionSummaryPage"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Id type field is displayed in Identification view list")
	public void validate_id_type_field_is_displayed_in_identification_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdType")));
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdType")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdType"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Id Number field is displayed in Identification view list")
	public void validate_id_number_field_is_displayed_in_identification_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdNumber")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_IdNumber"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Date of Issue field is displayed in Identification view list")
	public void validate_date_of_issue_field_is_displayed_in_identification_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfIssue")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfIssue"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Date of Expiry field is displayed in Identification view list")
	public void validate_date_of_expiry_field_is_displayed_in_identification_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfExpiry")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_DateOfExpiry"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Place of issue field is displayed in Identification view list")
	public void validate_place_of_issue_field_is_displayed_in_identification_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_PlaceOfIssue")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_PlaceOfIssue"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate status field is displayed in Identification view list")
	public void validate_status_field_is_displayed_in_identification_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_Status")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("ViewList_Status"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Search the record with valid data in Identification details")
	public void search_the_record_with_valid_data_in_identification_details() throws InterruptedException {
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
				System.out.println(testData.get("valid_search_input"));
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(identificationdetailsJsPaths.getElement("list_view_search_input"))
						.sendKeys(testData.get("valid_search_input"));
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

	@And("Search the record with invalid data in Identification details")
	public void search_the_record_with_invalid_data_in_identification_details() throws InterruptedException {
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
						.sendKeys(testData.get("invalid_search_input"));
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

	@And("User search the Ref id under inbox for identification details")
	public void user_search_the_ref_id_under_inbox_for_identification_details()
			throws IOException, InterruptedException {
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
		Thread.sleep(1000);
	}
}
