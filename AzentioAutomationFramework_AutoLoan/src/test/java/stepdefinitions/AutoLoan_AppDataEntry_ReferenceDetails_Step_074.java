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

public class AutoLoan_AppDataEntry_ReferenceDetails_Step_074 {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths employmentdetailsJsPaths = new JSPaths(excelPath, "AutoLoan_EmploymentDetails",
			"ALEmploymentDetails_FieldName", "JSPath");
	Map<String, String> executionData = new HashMap<>();
	ExcelData autoLoanExecutionSheet = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	int indexOfListView;
	ExcelData referencedetailsExcelData = new ExcelData(excelTestDataPath, "AutoLoan_ReferenceDetails", "DataSet ID");
	Map<String, String> testData;

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_03$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_03() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_03");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_04$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_04() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_04");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_05$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_05() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_05");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_06$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_06() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_06");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_07$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_07() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_07");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_08$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_08() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_08");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_09$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_09() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_09");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("^User_074 get the test data for test case AT_AL_APPDATAENTRY_REFDETAILS_10$")
	public void get_the_test_data_for_test_case_AT_AL_APPDATAENTRY_REFDETAILS_10() throws Throwable {
		executionData=autoLoanExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_09");
		testData = referencedetailsExcelData.getTestdata(executionData.get("dataSet_ID"));
	}

	@And("User navigate to Customer Financials tab in Autoloan_Employment details")
	public void user_navigate_to_customer_financials_tab_in_autoloan_employment_details() {
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
					if (titlename.trim().contains("Customer Financials")) {
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

	@And("Click on pencil icon of first record in Customer Personal Information")
	public void click_on_pencil_icon_of_first_record_in_customer_personal_information() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Edit_icon")));
				// javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Add icon in Customer Employment list section")
	public void click_on_add_icon_in_customer_employment_list_section() {
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
					if (titlename.trim().contains("Customer Employment List")) {
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

	@And("Select the value in Nature of Employment dropdown in Autoloan_Employment details.")
	public void select_the_value_in_nature_of_employment_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Nature of Employment Dropdown")).click();
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
			System.out.println("Map " + testData.get("NatureOfEmployment").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NatureOfEmployment")).trim())) {
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

	@And("Select the value in Company type dropdown in Autoloan_Employment details")
	public void select_the_value_in_company_type_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Company Type Dropdown"))
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
			System.out.println("Map " + testData.get("CompanyType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CompanyType")).trim())) {
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

	@And("Select the value in Profession dropdown in Autoloan_Employment details")
	public void select_the_value_in_profession_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Profession Dropdown"))
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
			System.out.println("Map " + testData.get("Profession").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Profession")).trim())) {
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

	@And("Select the value in Profession type dropdown in Autoloan_Employment details")
	public void select_the_value_in_profession_type_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Profession Type Dropdown"))
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
			System.out.println("Map " + testData.get("ProfessionType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProfessionType")).trim())) {
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

	@And("Select the value in Statutory Authority dropdown in Autoloan_Employment details")
	public void select_the_value_in_statutory_authority_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Statutory Authority Dropdown")).click();
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
			System.out.println("Map " + testData.get("StatutoryAuthority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("StatutoryAuthority")).trim())) {
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

	@And("Select the value in Employment End date field in Autoloan_Employment details")
	public void select_the_value_in_employment_end_date_field_in_autoloan_employment_details() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		System.out.println("Date " + format);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("EmploymentEndDate"))
						.click();
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("EmploymentEndDate"))
						.sendKeys(format);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Employer phone extension field in Autoloan_Employment details")
	public void enter_the_value_in_employer_phone_extension_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("employerPhoneExInput"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("employerPhoneExInput"))
						.sendKeys(testData.get("EmployerPhoneExtension"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in No of partners field in Autoloan_Employment details")
	public void enter_the_value_in_no_of_partners_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Partners Dropdown"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Partners Dropdown"))
						.sendKeys(testData.get("NoOfPartners"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Nature of Business field in Autoloan_Employment details")
	public void select_the_value_in_nature_of_business_field_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Nature of Business Dropdown"))
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
			System.out.println("Map " + testData.get("NatureOfBusiness").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NatureOfBusiness")).trim())) {
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

	@And("Enter the value in Registered business name field in Autoloan_Employment details")
	public void enter_the_value_in_registered_business_name_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
						.sendKeys(testData.get("RegisteredBusinessName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Registered business number field in Autoloan_Employment details")
	public void enter_the_value_in_registered_business_number_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Number texbox"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Registered Business Number texbox"))
						.sendKeys(testData.get("RegisteredBusinessNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Business Registration date field in Autoloan_Employment details")
	public void enter_the_value_in_business_registration_date_field_in_autoloan_employment_details() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		System.out.println("Date " + format);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Business Registration Date textbox")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Business Registration Date textbox"))
						.sendKeys(format);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Office premises type field in Autoloan_Employment details")
	public void select_the_value_in_office_premises_type_field_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Office Premises Type Dropdown")).click();
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
			System.out.println("Map " + testData.get("OfficePremisesType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("OfficePremisesType")).trim())) {
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

	@And("Enter the value in Share holder percentage field in Autoloan_Employment details")
	public void enter_the_value_in_share_holder_percentage_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown"))
						.sendKeys(testData.get("ShareHolderPercentage"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in No of Employees field in Autoloan_Employment details")
	public void enter_the_value_in_no_of_employees_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Employees Dropdown"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Employees Dropdown"))
						.sendKeys(testData.get("NoOfEmployees"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Reamrks field in Autoloan_Employment details")
	public void enter_the_value_in_reamrks_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("remarksTextarea")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("remarksTextarea"))
						.sendKeys(testData.get("Remarks"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Save icon in Autoloan_Employment details")
	public void click_on_save_icon_in_autoloan_employment_details() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Field is required popup is displayed in Autoloan_Employment details")
	public void validate_field_is_required_popup_is_displayed_in_autoloan_employment_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("requiredFieldError")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("requiredFieldError")).isDisplayed());

	}

	@And("Enter special characters in required field in Autoloan_Employment details")
	public void enter_special_characters_in_required_field_in_autoloan_employment_details() {
		System.err.println(testData.get("EmployeeId"));
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("EmployeeId")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("EmployeeId"))
						.sendKeys(testData.get("EmployeeId"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate alpha numeric characters allowed popup is displayed in Autoloan_Employment details")
	public void validate_alpha_numeric_characters_allowed_popup_is_displayed_in_autoloan_employment_details()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("specialCharError")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("specialCharError")).isDisplayed());
	}

	@And("Validate Nature of employment field is present in Autoloan_Employment details view list")
	public void validate_nature_of_employment_field_is_present_in_autoloan_employment_details_view_list()
			throws IOException {
		for (int i = 0; i <= 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("listview_NatureOfEmployment")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("listview_NatureOfEmployment"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Employer name field is present in Autoloan_Employment details view list")
	public void validate_employer_name_field_is_present_in_autoloan_employment_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("listview_EmployerName")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("listview_EmployerName"))
				.isDisplayed());

	}

	@And("Validate Employment status field is present in Autoloan_Employment details view list")
	public void validate_employment_status_field_is_present_in_autoloan_employment_details_view_list()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("listview_EmploymentStatus")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("listview_EmploymentStatus"))
				.isDisplayed());

	}

	@And("Validate Status is present in Autoloan_Employment details view list")
	public void validate_status_is_present_in_autoloan_employment_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ViewList_Status")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ViewList_Status")).isDisplayed());

	}

	@And("Click on Back icon in Customer Employment list section")
	public void click_on_back_icon_in_customer_employment_list_section() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("BackButton")));
				// javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the export to PDF functionality in Autoloan_Employment details")
	public void validate_the_export_to_pdf_functionality_in_autoloan_employment_details() throws IOException {
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

					if (titlename.trim().contains("Customer Employment List")) {

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

//for (int i = 0; i <= 2000; i++) {
//	try {
//		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ExportIcon"))
//				.click();
//		break;
//	} catch (Exception e) {
//		if (i == 2000) {
//			Assert.fail(e.getMessage());
//		}
//	}
//}

		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ExportPDF")).click();
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

	@And("Validate the export to Excel functionality in Autoloan_Employment details")
	public void validate_the_export_to_excel_functionality_in_autoloan_employment_details() {
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

					if (titlename.trim().contains("Customer Employment List")) {

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
//				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ExportIcon"))
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
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("ExportXLS")).click();
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

	@And("Search the Autoloan_Employment details record with valid data")
	public void search_the_autoloan_employment_details_record_with_valid_data() throws InterruptedException {
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
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("list_view_search_input"))
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

	@And("Search the Autoloan_Employment details record with invalid data")
	public void search_the_autoloan_employment_details_record_with_invalid_data() throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("list_view_search_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("list_view_search_input"))
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

	@And("Click on Edit icon of first record in Autoloan_Employment details")
	public void click_on_edit_icon_of_first_record_in_autoloan_employment_details() {
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
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title')[" + j
								+ "].parentElement.nextElementSibling.querySelectorAll('button[icon=\"pi pi-pencil\"]')[0]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
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

	@And("Update the value in Nature of Employment dropdown in Autoloan_Employment details.")
	public void update_the_value_in_nature_of_employment_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Nature of Employment Dropdown")).click();
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
			System.out.println("Map " + testData.get("NatureOfEmployment").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NatureOfEmployment")).trim())) {
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

	@And("Update the value in Company type dropdown in Autoloan_Employment details")
	public void update_the_value_in_company_type_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Company Type Dropdown"))
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
			System.out.println("Map " + testData.get("CompanyType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CompanyType")).trim())) {
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

	@And("Update the value in Profession dropdown in Autoloan_Employment details")
	public void update_the_value_in_profession_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Profession Dropdown"))
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
			System.out.println("Map " + testData.get("Profession").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Profession")).trim())) {
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

	@And("Update the value in Profession type dropdown in Autoloan_Employment details")
	public void update_the_value_in_profession_type_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Profession Type Dropdown"))
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
			System.out.println("Map " + testData.get("ProfessionType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProfessionType")).trim())) {
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

	@And("Update the value in Statutory Authority dropdown in Autoloan_Employment details")
	public void update_the_value_in_statutory_authority_dropdown_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Statutory Authority Dropdown")).click();
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
			System.out.println("Map " + testData.get("StatutoryAuthority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("StatutoryAuthority")).trim())) {
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

	@And("Update the value in Employer phone extension field in Autoloan_Employment details")
	public void update_the_value_in_employer_phone_extension_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("employerPhoneExInput"))
				.click();
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("employerPhoneExInput"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("employerPhoneExInput"))
						.sendKeys(testData.get("EmployerPhoneExtension"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in No of partners field in Autoloan_Employment details")
	public void update_the_value_in_no_of_partners_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Partners Dropdown"))
				.click();
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Partners Dropdown"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Partners Dropdown"))
						.sendKeys(testData.get("NoOfPartners"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Nature of Business field in Autoloan_Employment details")
	public void update_the_value_in_nature_of_business_field_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Nature of Business Dropdown"))
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
			System.out.println("Map " + testData.get("NatureOfBusiness").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NatureOfBusiness")).trim())) {
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

	@And("Update the value in Registered business name field in Autoloan_Employment details")
	public void update_the_value_in_registered_business_name_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
				.click();
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
						.sendKeys(testData.get("RegisteredBusinessName"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Registered business number field in Autoloan_Employment details")
	public void update_the_value_in_registered_business_number_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Number texbox"))
				.click();
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Number texbox"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Registered Business Number texbox"))
						.sendKeys(testData.get("RegisteredBusinessNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Office premises type field in Autoloan_Employment details")
	public void update_the_value_in_office_premises_type_field_in_autoloan_employment_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Office Premises Type Dropdown")).click();
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
			System.out.println("Map " + testData.get("OfficePremisesType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("OfficePremisesType")).trim())) {
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

	@And("Update the value in Share holder percentage field in Autoloan_Employment details")
	public void update_the_value_in_share_holder_percentage_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown"))
				.click();
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown"))
						.sendKeys(testData.get("ShareHolderPercentage"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in No of Employees field in Autoloan_Employment details")
	public void update_the_value_in_no_of_employees_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Employees Dropdown"))
				.click();
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Employees Dropdown"))
				.clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("No of Employees Dropdown"))
						.sendKeys(testData.get("NoOfEmployees"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update the value in Reamrks field in Autoloan_Employment details")
	public void update_the_value_in_reamrks_field_in_autoloan_employment_details() {
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("remarksTextarea")).click();
		javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("remarksTextarea")).clear();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("remarksTextarea"))
						.sendKeys(testData.get("Remarks"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Remove the values in required field in Autoloan_Employment details")
	public void remove_the_values_in_required_field_in_autoloan_employment_details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Share Holder Percentage Dropdown"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update special characters in required field in Autoloan_Employment details")
	public void update_special_characters_in_required_field_in_autoloan_employment_details() {
		javascriptHelper
				.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								employmentdetailsJsPaths.getElement("Registered Business Name textbox"))
						.sendKeys(testData.get("RegisteredBusinessName"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_074 search the Ref id under inbox for Autoloan_Reference details")
	public void user_074_search_the_ref_id_under_inbox_for_autoloan_reference_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("inboxSearchInput"))
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

	@And("Find the position of Employment details view list at AutoLoan")
	public void find_the_position_of_employment_details_view_list_at_auto_loan() {
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
					if (listViewName.contains("Customer Employment List")) {

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
