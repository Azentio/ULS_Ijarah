package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class Tawarraq_AppDataEntry_EmploymentDetails_Step {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "DataCheckAppDetails_Elements",
			"DataCheckAppDetails_FieldName", "JSPath");
	JSPaths appData_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName",
			"JSPath");
	JSPaths employmentDetailsJsPaths = new JSPaths(excelPath, "Tawarraq_EmploymentDetails",
			"EmploymentDetails_FieldName", "JSPath");

	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions actions = new Actions(driver);
	SoftAssert softAssert = new SoftAssert();

	ExcelData AppDataCFDebtExcelData = new ExcelData(excelTestDataPath, "MU_AppData_CFDebt", "DataSet ID");
	ExcelData DataCheckAppDetailsExcelData = new ExcelData(excelTestDataPath, "MU_DataCheck_AppDetails", "DataSet ID");
	ExcelData AppDataIncomeExcelData = new ExcelData(excelTestDataPath, "MU_AppData_Income", "DataSet ID");
	ExcelData DataCheckEmpDetailsExcelData = new ExcelData(excelTestDataPath, "Tawarraq_EmploymentDetails",
			"DataSet ID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User_608 get the test data for test case AT_TW_AD_EMPD_04$")
	public void get_the_test_data_for_test_case_AT_TW_AD_EMPD_04() throws Throwable {
		testData = DataCheckEmpDetailsExcelData.getTestdata("AT_TW_AD_EMPD_04_D1");
	}

	@And("^User_608 get the test data for test case AT_TW_AD_EMPD_05$")
	public void get_the_test_data_for_test_case_AT_TW_AD_EMPD_05() throws Throwable {
		testData = DataCheckEmpDetailsExcelData.getTestdata("AT_TW_AD_EMPD_05_D1");
	}

	@And("^User_608 get the test data for test case AT_TW_AD_EMPD_06$")
	public void get_the_test_data_for_test_case_AT_TW_AD_EMPD_06() throws Throwable {
		testData = DataCheckEmpDetailsExcelData.getTestdata("AT_TW_AD_EMPD_06_D1");
	}

	@And("User_608 clickt the pagination next button under Employment details section")
	public void user_clickt_the_pagination_next_button_under_employment_details_section() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerFinancialsTabBackBtn")));
				break;
			} catch (Exception e) {

				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click on edit button of customer financial record at data entry stage")
	public void User_608_click_on_edit_button_of_customer_financial_record_at_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("Edit_icon")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Self-Employed Professional record Eye button under Employment List section in Customer Financials tab")
	public void user_click_the_self_employed_professional_record_eye_button_under_employment_list_section_in_customer_financials_tab() {
//		javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("selfEmployedProfessional_eyeBtn")).click();
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		boolean isEyeBtnClicked = false;
		Actions actions = new Actions(driver);
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Self-employed Professional").trim())) {

							actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j
											+ "].previousElementSibling.previousElementSibling.querySelector('button')"))
									.build().perform();
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j
											+ "].previousElementSibling.previousElementSibling.querySelector('button')"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j
											+ "].previousElementSibling.previousElementSibling.querySelector('button')")
									.click();
							isEyeBtnClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isEyeBtnClicked == true) {
				break;
			}

		}
		if (isEyeBtnClicked == false) {
			Assert.fail("Eye button is not clicked");
		}
	}

	@And("User_608 verify Nature of Employment field available under Employment details screen")
	public void user_verify_nature_of_employment_field_available_under_employment_details_screen() throws Throwable {

		WebElement label = null;
		WebElement dropdown = null;
		Thread.sleep(1000);
		for (int i = 0; i <= 300; i++) {
			try {
				label = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel"));
				dropdown = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
				if ((dropdown != null) || (dropdown != null)) {
					System.out.println("Loop got breaked");
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 2000; i++) {
			try {

				softAssert.assertTrue(label.isDisplayed(), "Nature of Employment label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Nature of Employment Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Company Type field available under Employment details screen")
	public void user_verify_company_type_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Company Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Company Type Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Profession field available under Employment details screen")
	public void user_verify_profession_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Profession label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Profession Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Profession Type field available under Employment details screen")
	public void user_verify_profession_type_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Profession Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Profession tye Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Statutory Authority field available under Employment details screen")
	public void user_verify_statutory_authority_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Statutory Authority label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Statutory Authority Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Name field available under Employment details screen")
	public void user_verify_employer_name_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employer Name label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Employer Name Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Name if Others field available under Employment details screen")
	public void user_verify_employer_name_if_others_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employer Name if(Others) label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer Name if(Others) Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employee ID field available under Employment details screen")
	public void user_verify_employee_id_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employee ID label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employee ID Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Date of Joining field available under Employment details screen")
	public void user_verify_date_of_joining_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Date of Joining label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Date of Joining Calender");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employment End Date field available under Employment details screen")
	public void user_verify_employment_end_date_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employment End Date label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employment End Date Calender");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Department field available under Employment details screen")
	public void user_verify_department_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Department label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Department dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Designation field available under Employment details screen")
	public void user_verify_designation_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Designation label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Designation dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employment Type field available under Employment details screen")
	public void user_verify_employment_type_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employment Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Employment Type dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Direct Manager Contact Number Extension field available under Employment details screen")
	public void user_verify_direct_manager_contact_number_extension_field_available_under_employment_details_screen()
			throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Direct Manager Contact Number label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Direct Manager Contact Number Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Direct Manager Telephone field available under Employment details screen")
	public void user_verify_direct_manager_telephone_field_available_under_employment_details_screen()
			throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Direct Manager Telephoner label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Direct Manager Telephone Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Income Paymode field available under Employment details screen")
	public void user_verify_income_paymode_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Income Paymode label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Income Paymode Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Phone Extension field available under Employment details screen")
	public void user_verify_employer_phone_extension_field_available_under_employment_details_screen()
			throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employer Phone Extension label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer Phone Extension Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Phone Number field available under Employment details screen")
	public void user_verify_employer_phone_number_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employer Phone Number label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer Phone Number Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify State field available under Employment details screen")
	public void user_verify_state_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("stateLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("stateDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "State label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "State Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify City field available under Employment details screen")
	public void user_verify_city_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("cityLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("cityDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "City label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "City Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Pincode field available under Employment details screen")
	public void user_verify_pincode_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("pincodeLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("pincodeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Pincode label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Pincode Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sector field available under Employment details screen")
	public void user_verify_sector_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("sectorLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("sectorDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Sector label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Sector Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Industry Sub Sector field available under Employment details screen")
	public void user_verify_industry_sub_sector_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("subSectorLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("subSectorDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Industry Sub Sector label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Industry Sub Sector Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify No Of Partners field available under Employment details screen")
	public void user_verify_no_of_partners_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "No Of Partners label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "No Of Partners Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Nature of Business field available under Employment details screen")
	public void user_verify_nature_of_business_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(label);
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Nature of Business label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Nature of Business Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Registered Business Name field available under Employment details screen")
	public void user_verify_registered_business_name_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Registered Business Name label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Registered Business Name Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Registered Business Number field available under Employment details screen")
	public void user_verify_registered_business_number_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Registered Business Number label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Registered Business Number Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Business Registration Date field available under Employment details screen")
	public void user_verify_business_registration_date_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Registered Business Date label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Registered Business Date Calender");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Office Premises Type field available under Employment details screen")
	public void user_verify_office_premises_type_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeLabel"));
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Office Premises Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Office Premises Type Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Share Holder Percentage field available under Employment details screen")
	public void user_verify_share_holder_percentage_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Share Holder Percentage label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Share Holder Percentage Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify No of Employees field available under Employment details screen")
	public void user_verify_no_of_employees_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "No of Employees label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "No of Employees Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Experience At Current Employment field available under Employment details screen")
	public void user_verify_experience_at_current_employment_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Experience At Current Employment label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Experience At Current Employment Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Direct Manager Name field available under Employment details screen")
	public void user_verify_direct_manager_name_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Direct Manager Name label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Direct Manager Name Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer City Code field available under Employment details screen")
	public void user_verify_employer_city_code_field_available_under_employment_details_screen() {
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel")));
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Employer City Code label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer City Code Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Retirement Age field available under Employment details screen")
	public void user_verify_retirement_age_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("retirementAgeLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("retirementAgeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Retirement Age label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Retirement Age Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Remarks field available under Employment details screen")
	public void user_verify_remarks_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksTextarea"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Remarks label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Remarks Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Experience\\(Years) field available under Employment details screen")
	public void user_verify_total_experience_years_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel"));
		WebElement input = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				Assert.assertTrue(label.isDisplayed());
				javascriptHelper.backgroundBorder(input);
				Assert.assertTrue(input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Primary Employment field should be Toggle button, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_primary_employment_field_should_be_toggle_btn_non_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Toggle Btn
		WebElement toggleBtn = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundBorder(toggleBtn);
				softAssert.assertTrue(toggleBtn.getTagName().contains("toggle"),
						"Primary Employment field should Toggle Button");
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Primary Employment field should Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmployment"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Primary Employment field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employment Period field should be Dropdown, Mandatory and Read only under Employment details screen")
	public void user_verify_employment_period_field_should_be_dropdown_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Employment Period field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")));
				softAssert.assertTrue(text.contains("*"), "Employment Period field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriod"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employment Period field should be Display only");
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Nature of Employment field should be Dropdown, Mandatory and Read only under Employment details screen")
	public void user_verify_nature_of_employment_field_should_be_dropdown_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Nature of Employment field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")));
				softAssert.assertTrue(text.contains("*"), "Nature of Employment field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmployment"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Nature of Employment field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Name field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_employer_name_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Employer Name field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Employer Name field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerName"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Name field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Name if\\(Others) field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_verify_employer_name_if_others_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"),
						"Employer Name if(Others) field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")));
				softAssert.assertTrue(text.contains("*"), "Employer Name if(Others) field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthers"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Name if(Others) field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employee ID field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_verify_employee_id_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"),
						"Employee ID field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")));
				softAssert.assertTrue(text.contains("*"), "Employee ID field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeID"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employee ID field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Date of Joining field should be Date, Mandatory and Read only under Employment details screen")
	public void user_verify_date_of_joining_field_should_be_date_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"),
						"Date of Joining field should be Date field");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")));
				softAssert.assertTrue(text.contains("*"), "Date of Joining field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoining"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Date of Joining field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employment End Date field should be Date, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_employment_end_date_field_should_be_date_non_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"),
						"Employment End Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Employment End Date field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDate"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employment End Date field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Department field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_department_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Department field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Department field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("department"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Department field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Designation field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_designation_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Designation field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Designation field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designation"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Designation field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employment Type field should be Dropdown, Mandatory and Read only under Employment details screen")
	public void user_verify_employment_type_field_should_be_dropdown_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Employment Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")));
				softAssert.assertTrue(text.contains("*"), "Employment Type field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentType"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employment Type field should be Display only");
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 verify Direct Manager Contact Number field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_direct_manager_contact_number_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"),
						"Direct Manager Contact Number field should be Texbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")));
				softAssert.assertTrue(!(text.contains("*")),
						"Direct Manager Contact Number field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbr"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"),
						"Direct Manager Contact Number field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Direct Manager Telephone field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_direct_manager_telephone_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(textBox);
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"),
						"Direct Manager Telephone field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Direct Manager Telephone field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephone"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Direct Manager Telephone field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Income Paymode field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_income_paymode_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Income Paymode field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Income Paymode field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymode"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Income Paymode field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Phone Extension field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_employer_phone_extension_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"),
						"Employer Phone Extension field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Employer Phone Extension field should be Non-Mandatory");
				;
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExtension"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Phone Extension field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer Phone Number field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_employer_phone_number_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"),
						"Employer Phone Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Employer Phone Number field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbr"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Phone Number field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Experience\\(Years) field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_verify_total_experience_years_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"),
						"Total Experience field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")));
				softAssert.assertTrue(text.contains("*"), "Total Experience field should be Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperience"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Total Experience field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Experience At Current Employment field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_experience_at_current_employment_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"),
						"Experience At Current Employment field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel")));
				softAssert.assertTrue(!(text.contains("*")),
						"Experience At Current Employment field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmployment"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"),
						"Experience At Current Employment field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Direct Manager Name field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_direct_manager_name_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"),
						"Direct Manager Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Direct Manager Name field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerName"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Direct Manager Name field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Employer City Code field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_employer_city_code_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"),
						"Employer City Code field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Employer City Code field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCode"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer City Code field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Remarks field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_verify_remarks_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksTextarea"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getTagName().contains("textarea"), "Remarks field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")));
				softAssert.assertTrue(!(text.contains("*")), "Remarks field should be Non-Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarks"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Remarks field should be Display only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage")
	public void user_invoke_soft_assert_in_employment_details_screen_under_customer_financials_tab_at_data_check_stage()
			throws Throwable {
		softAssert.assertAll();
	}

	@And("User_608 click the Eye button under Customer Financials tab")
	public void user_click_the_eye_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("customerFinancialsTabEyeBtn")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Eye button under Income section in Customer Financials Tab")
	public void user_click_the_eye_button_under_income_section_in_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
		WebElement title = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomeSectionTitle"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(title);
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		WebElement eyeBtn = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomeSectionEyeBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eyeBtn);
				eyeBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Salaried Customer record Eye button under Employment List section in Customer Financials tab")
	public void user_click_the_salaried_customer_record_eye_button_under_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerFinancialsTabBackBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		boolean isEyeBtnClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Salaried").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j
											+ "].previousElementSibling.previousElementSibling.querySelector('button')"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j
											+ "].previousElementSibling.previousElementSibling.querySelector('button')")
									.click();
							isEyeBtnClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isEyeBtnClicked == true) {
				break;
			}
		}
	}

	@And("User_608 verify Back button available under Employment details screen")
	public void user_verify_back_button_available_under_employment_details_screen() throws Throwable {
		WebElement customerFinancialsTab = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsTab"));
		WebElement backBtn = javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerEmploymentBackBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.scrollIntoView(customerFinancialsTab);
				javascriptHelper.backgroundBorder(backBtn);
				Assert.assertTrue(backBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User search the Ref id under inbox for Tawarraq_App data entry_Employment details")
	public void user_search_the_ref_id_under_inbox_for_tawarraq_app_data_entry_employment_details() throws IOException {
		// waitHelper.waitForElementwithFluentwait(driver,
		// javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Record Reference number " + testData.get("Ref No"));
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				;
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
