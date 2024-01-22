package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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

public class Tawarraq_CustomerReference_Step {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath =configFileReader.getTawruqqTestDataFile();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerreferenceJsPaths = new JSPaths(excelPath, "CustomerReference", "CustomerReference_FieldName",
			"JSPath");
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
	int indexOfListView = 0;
	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData customerreferenceExcelData = new ExcelData(excelTestDataPath, "CustomerReference", "DataSetID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_TW_CR_01$")
	public void get_the_test_data_for_test_case_AT_TW_CR_01() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_TW_CR_01_D1");
	}

	@And("^User get the test data for test case AT_TW_CR_02$")
	public void get_the_test_data_for_test_case_AT_TW_CR_02() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_TW_CR_02_D1");
	}

	@And("^User get the test data for test case AT_TW_CR_03$")
	public void get_the_test_data_for_test_case_AT_TW_CR_03() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_TW_CR_03_D1");
	}

	@And("^User get the test data for test case AT_TW_CR_04$")
	public void get_the_test_data_for_test_case_AT_TW_CR_04() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_TW_CR_04_D1");
	}

	@And("^User get the test data for test case AT_TW_CR_05$")
	public void get_the_test_data_for_test_case_AT_TW_CR_05() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_TW_CR_05_D1");
	}

	@And("^User get the test data for test case AT_TW_CR_06$")
	public void get_the_test_data_for_test_case_AT_TW_CR_06() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_TW_CR_06_D1");
	}

	@And("Click on Add button in Reference List view section")
	public void click_on_add_button_in_reference_list_view_section() {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("References List View").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
											+ j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("Select the value in Relationship type field in Customer reference page")
	public void select_the_value_in_relationship_type_field_in_customer_reference_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("RelationshipType"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("RelationshipType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("RelationshipType")).trim())) {
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

	@And("Select the value in Salutation field in Customer reference page")
	public void select_the_value_in_salutation_field_in_customer_reference_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("Salutation")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("Salutation").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Salutation")).trim())) {
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

	@And("Enter the value in First name field in Customer reference page")
	public void enter_the_value_in_first_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName"))
						.sendKeys(testData.get("FirstName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Middle name field in Customer reference page")
	public void enter_the_value_in_middle_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("MiddleName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("MiddleName"))
						.sendKeys(testData.get("MiddleName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Last name field in Customer reference page")
	public void enter_the_value_in_last_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("LastName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("LastName"))
						.sendKeys(testData.get("LastName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Customer Full Name field in Customer reference page")
	public void enter_the_value_in_customer_full_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CustomerFullName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CustomerFullName"))
						.sendKeys(testData.get("CustomerFullName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Identification type field in Customer reference page")
	public void select_the_value_in_identification_type_field_in_customer_reference_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationType"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("IdentificationType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IdentificationType")).trim())) {
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

	@And("Enter the value in Identification number field in Customer reference page")
	public void enter_the_value_in_identification_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationNumber"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationNumber"))
						.sendKeys(testData.get("IdentificationNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Residence Address field in Customer reference page")
	public void enter_the_value_in_residence_address_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ResidenceAddress")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ResidenceAddress"))
						.sendKeys(testData.get("ResidenceAddress"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Office Address field in Customer reference page")
	public void enter_the_value_in_office_address_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficeAddress")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficeAddress"))
						.sendKeys(testData.get("OfficeAddress"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Contact Number field in Customer reference page")
	public void enter_the_value_in_contact_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ContactNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ContactNumber"))
						.sendKeys(testData.get("ContactNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Office phone number field in Customer reference page")
	public void enter_the_value_in_office_phone_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficePhoneNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficePhoneNumber"))
						.sendKeys(testData.get("OfficePhoneNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Primary mobile number field in Customer reference page")
	public void enter_the_value_in_primary_mobile_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PrimaryMobileNumber"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PrimaryMobileNumber"))
						.sendKeys(testData.get("PrimaryMobileNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Alternative mobile number field in Customer reference page")
	public void enter_the_value_in_alternative_mobile_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("AlternativeMobileNumber"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("AlternativeMobileNumber"))
						.sendKeys(testData.get("AlternativeMobileNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Email id field in Customer reference page")
	public void enter_the_value_in_email_id_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EmailID")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EmailID"))
						.sendKeys(testData.get("EmailId"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in No of Years known field in Customer reference page")
	public void enter_the_value_in_no_of_years_known_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("NoOfYearsKnown")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("NoOfYearsKnown"))
						.sendKeys(testData.get("NoOfYearsKnown"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in CIF Number field in Customer reference page")
	public void enter_the_value_in_cif_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CIFNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CIFNumber"))
						.sendKeys(testData.get("CIFNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Save button in Customer reference page")
	public void click_on_save_button_in_customer_reference_page() {
		for (int i = 0; i <= 100; i++) {
			try {
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SaveIcon")));
//				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SaveIcon")).click();
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SaveIcon")));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User search the Ref id under inbox for Tawarraq_Customer Reference")
	public void user_search_the_ref_id_under_inbox_for_tawarraq_customer_reference() throws IOException {
		System.out.println(customerreferenceJsPaths.getElement("inboxSearchInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("inboxSearchInput"))
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
	@And("user_074 select the tawruqq record in new app stage")
	public void user_074_select_the_tawruqq_record_in_new_app_stage() {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 150; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(testData.get("Ref No"))) {
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
						// document.querySelectorAll('button[icon="pi pi-user-edit"]')[0]
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]"));
						break;
					}
				} catch (Exception e) {

				}
			}
		}

	}


	@And("Validate Please fill all the details popup is displayed")
	public void validate_please_fill_all_the_details_popup_is_displayed() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PleaseFillAllTheDetailsPopup")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PleaseFillAllTheDetailsPopup"))
				.isDisplayed());

	}

	@And("Enter special characters in text field in Customer reference page")
	public void enter_special_characters_in_text_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName"))
						.sendKeys(testData.get("FirstName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Alphanumeric characters allowed popup is displayed customer reference page")
	public void validate_alphanumeric_characters_allowed_popup_is_displayed_customer_reference_page()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				customerreferenceJsPaths.getElement("AlphaNumericCharactersAllowedPopup")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerreferenceJsPaths.getElement("AlphaNumericCharactersAllowedPopup"))
				.isDisplayed());

	}

	@And("Update the value in Relationship type field in Customer reference page")
	public void update_the_value_in_relationship_type_field_in_customer_reference_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("RelationshipType"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("RelationshipType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("RelationshipType")).trim())) {
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

	@And("Update the value in Salutation field in Customer reference page")
	public void update_the_value_in_salutation_field_in_customer_reference_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("Salutation")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("Salutation").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Salutation")).trim())) {
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

	@And("Update the value in First name field in Customer reference page")
	public void update_the_value_in_first_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName"))
						.sendKeys(testData.get("FirstName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Middle name field in Customer reference page")
	public void update_the_value_in_middle_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("MiddleName")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("MiddleName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("MiddleName"))
						.sendKeys(testData.get("MiddleName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Last name field in Customer reference page")
	public void update_the_value_in_last_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("LastName")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("LastName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("LastName"))
						.sendKeys(testData.get("LastName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Customer Full Name field in Customer reference page")
	public void update_the_value_in_customer_full_name_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CustomerFullName")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CustomerFullName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CustomerFullName"))
						.sendKeys(testData.get("CustomerFullName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Identification type field in Customer reference page")
	public void update_the_value_in_identification_type_field_in_customer_reference_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationType"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("IdentificationType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("IdentificationType")).trim())) {
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

	@And("Update the value in Identification number field in Customer reference page")
	public void update_the_value_in_identification_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationNumber"))
				.click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationNumber"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("IdentificationNumber"))
						.sendKeys(testData.get("IdentificationNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Residence Address field in Customer reference page")
	public void update_the_value_in_residence_address_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ResidenceAddress")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ResidenceAddress")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ResidenceAddress"))
						.sendKeys(testData.get("ResidenceAddress"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Office Address field in Customer reference page")
	public void update_the_value_in_office_address_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficeAddress")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficeAddress")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficeAddress"))
						.sendKeys(testData.get("OfficeAddress"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Contact Number field in Customer reference page")
	public void update_the_value_in_contact_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ContactNumber")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ContactNumber")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ContactNumber"))
						.sendKeys(testData.get("ContactNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Office phone number field in Customer reference page")
	public void update_the_value_in_office_phone_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficePhoneNumber")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficePhoneNumber")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("OfficePhoneNumber"))
						.sendKeys(testData.get("OfficePhoneNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Primary mobile number field in Customer reference page")
	public void update_the_value_in_primary_mobile_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PrimaryMobileNumber"))
				.click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PrimaryMobileNumber"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("PrimaryMobileNumber"))
						.sendKeys(testData.get("PrimaryMobileNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Alternative mobile number field in Customer reference page")
	public void update_the_value_in_alternative_mobile_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("AlternativeMobileNumber"))
				.click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("AlternativeMobileNumber"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("AlternativeMobileNumber"))
						.sendKeys(testData.get("AlternativeMobileNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Email id field in Customer reference page")
	public void update_the_value_in_email_id_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EmailID")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EmailID")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EmailID"))
						.sendKeys(testData.get("EmailId"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in No of Years known field in Customer reference page")
	public void update_the_value_in_no_of_years_known_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("NoOfYearsKnown")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("NoOfYearsKnown")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("NoOfYearsKnown"))
						.sendKeys(testData.get("NoOfYearsKnown"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in CIF Number field in Customer reference page")
	public void update_the_value_in_cif_number_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CIFNumber")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CIFNumber")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("CIFNumber"))
						.sendKeys(testData.get("CIFNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("find the position of customer reference list view at new app stage for tawruqq")
	public void find_the_position_of_customer_reference_list_view_at_new_app_stage_for_tawruqq() {
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
					if (listViewName.contains("References List View")) {

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

	@And("Search the Tawarraq_Customer reference record with valid data")
	public void search_the_tawarraq_customer_reference_record_with_valid_data() {
		String searchButton = "document.querySelectorAll(' ion-row button[ng-reflect-icon=\"pi pi-search\"]')["
				+ indexOfListView + "]";
		System.out.println(searchButton);
		Actions actions = new Actions(driver);
		for (int i = 0; i <= 500; i++) {
			try {
				if (i > 400) {
					actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(searchButton)).build()
							.perform();
				}

				System.out
						.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + indexOfListView + "]");
				javascriptHelper.executeScriptWithWebElement(searchButton).click();
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
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("valid_search_text"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String extractSearchResult = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')["
				+ indexOfListView + "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText";
		for (int i = 0; i <= 300; i++) {
			try {
				documentDetailsSearchResult = javascriptHelper.executeScript("return " + extractSearchResult)
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

	@And("Search the Tawarraq_Customer reference record with invalid data")
	public void search_the_tawarraq_customer_reference_record_with_invalid_data() throws InterruptedException {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String extractSearchResult = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')["
				+ indexOfListView + "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText";
		for (int i = 0; i <= 300; i++) {
			try {

				documentDetailsSearchResult = javascriptHelper.executeScript("return " + extractSearchResult)
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
		Thread.sleep(1000);
		Assert.assertTrue(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));

	}

	@And("Clear the values in required field in Customer reference page")
	public void clear_the_values_in_required_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName"))
						.sendKeys(testData.get("FirstName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update special characters in text field in Customer reference page")
	public void update_special_characters_in_text_field_in_customer_reference_page() {
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
		javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName"))
						.sendKeys(testData.get("FirstName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Help button is present in Customer reference page")
	public void validate_the_help_button_is_present_in_customer_reference_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("HelpButton")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(customerreferenceJsPaths.getElement("HelpButton")).isDisplayed());

	}

}
