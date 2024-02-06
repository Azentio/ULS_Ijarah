package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class AutoLoan_Steps {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath =configFileReader.getJSFilePath();
	
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths appDataAppDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements",
			"ApplicationDetails_FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	JSPaths appDataCustomerDetailsJsPaths = new JSPaths(excelPath, "AppData_CustomerDetail_Elements",
			"AppData_CustomerDetails_FieldName", "JSPath");
	// ExcelData excelData = new ExcelData(excelTestDataPath,
	// "ijara_LoginCredentials", "UserType");
	ExcelData exelData = new ExcelData(excelTestDataPath, "LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions actions = new Actions(driver);
	SoftAssert softAssert = new SoftAssert();
	JSPaths dataCheck_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName",
			"JSPath");
	ExcelData AppDataEntryApplicationDetails = new ExcelData(excelTestDataPath, "AL_AppData_AppDetails", "DataSet ID");
	ExcelData AppDataEntryCFDebtExcelData = new ExcelData(excelTestDataPath, "AL_AppData_CustomerDebt", "DataSet ID");
	ExcelData UnderwriterL1ExcelData = new ExcelData(excelTestDataPath, "AL_Underwriter_L1", "DataSet ID");
	ExcelData autoLoanExecutionSheet = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	IjaraLogin ijaraLogin = new IjaraLogin();
	Map<String, String> testExecutionData;
	Map<String, String> testData;

//	Auto Loan -- App Data Entry Stage  -- Application Details screen 
	@And("login with valid credentials - Auto Loan - Underwriter L1")
	public void login_with_valid_credentials_auto_loan_underwriter_l1() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType11");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_01$")
	public void get_the_test_data_for_test_case_AT_AL_APP_01() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_01");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_02$")
	public void get_the_test_data_for_test_case_AT_AL_APP_02() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_02");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_03$")
	public void get_the_test_data_for_test_case_AT_AL_APP_03() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_03");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_04$")
	public void get_the_test_data_for_test_case_AT_AL_APP_04() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_04");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_05$")
	public void get_the_test_data_for_test_case_AT_AL_APP_05() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_05");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_06$")
	public void get_the_test_data_for_test_case_AT_AL_APP_06() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_06");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_07$")
	public void get_the_test_data_for_test_case_AT_AL_APP_07() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_07");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_08$")
	public void get_the_test_data_for_test_case_AT_AL_APP_08() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_08");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_09$")
	public void get_the_test_data_for_test_case_AT_AL_APP_09() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_09");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_10$")
	public void get_the_test_data_for_test_case_AT_AL_APP_10() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_10");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_11$")
	public void get_the_test_data_for_test_case_AT_AL_APP_11() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_11");
	}

	@And("^User_608 get the test data for test case AT_AL_APP_12$")
	public void get_the_test_data_for_test_case_AT_AL_APP_12() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_12");
	}

//	Auto Loan -- App Data Entry Stage  -- Customer Debt screen
	@And("^User_608 get the test data for test case AT_AL_CUD_01$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_01() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_01");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_02$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_02() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_02");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_03$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_03() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_03");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_04$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_04() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_04");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_05$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_05() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_05");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_06$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_06() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_06");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_07$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_07() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_07");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_08$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_08() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_08");
	}

	@And("^User_608 get the test data for test case AT_AL_CUD_09$")
	public void get_the_test_data_for_test_case_AT_AL_CUD_09() throws Throwable {
		testData = AppDataEntryCFDebtExcelData.getTestdata("DS_AT_AL_CUD_09");
	}

//	Auto Loan -- Underwriter L1 
	@And("^User_608 get the test data for test case AT_AL_UNWL1_01$")
	public void get_the_test_data_for_test_case_AT_AL_UNWL1_01() throws Throwable {
		testExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_UNWL1_01");
		System.out.println(testExecutionData.get("dataSet_ID"));
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_AL_UNWL1_02$")
	public void get_the_test_data_for_test_case_AT_AL_UNWL1_02() throws Throwable {
		testExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_UNWL1_02");
		System.out.println(testExecutionData.get("dataSet_ID"));
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_AL_UNWL1_03$")
	public void get_the_test_data_for_test_case_AT_AL_UNWL1_03() throws Throwable {
		testExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_UNWL1_03");
		System.out.println(testExecutionData.get("dataSet_ID"));
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_AL_UNWL1_04$")
	public void get_the_test_data_for_test_case_AT_AL_UNWL1_04() throws Throwable {
		testExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_UNWL1_04");
		System.out.println(testExecutionData.get("dataSet_ID"));
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_AL_UNWL1_05$")
	public void get_the_test_data_for_test_case_AT_AL_UNWL1_05() throws Throwable {
		testExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_UNWL1_05");
		System.out.println(testExecutionData.get("dataSet_ID"));
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	 Return the record
	@And("login with valid credentials for return")
	public void login_with_valid_credentials_for_return() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("UserReturn");
	}

	@And("User_608 click the module name dropdown in ULS application")
	public void user_608_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("moduleNameDropdown"));
				javascriptHelper.JSEClick(element);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the module name as LOS in ULS application")
	public void user_608_select_the_module_name_as_los_in_uls_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank()) && !moduleLength.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("User_608 click the Mail box in ULS application")
	public void user_608_click_the_mail_box_in_uls_application() throws Throwable {
		for (int i = 0; i <= 50000; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailBox"));
				javascriptHelper.JSEClick(element);
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Search button under inbox")
	public void user_608_click_the_search_button_under_inbox() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailInboxSearchBtn"));
				javascriptHelper.JSEClick(element);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Ref id under inbox")
	public void user_608_search_the_ref_id_under_inbox() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"));
				element.sendKeys(testData.get("Ref No"), Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Entitle button under inbox")
	public void user_608_click_the_entitle_button_under_inbox() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]').length")
						.toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				String jspath = "document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]')["
						+ (Integer.parseInt(length) - 1) + "]";
//				System.out.println("Path: "+jspath);
				WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
				javascriptHelper.JSEClick(btn);
				;
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Reference ID for Auto Loan")
	public void user_search_the_reference_id_for_auto_loan() throws Throwable {
		for (int i = 0; i <= 5000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				;
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_APP_01
	@And("User_608 click the Save button under Application Details screen")
	public void user_608_click_the_save_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 500000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 500000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(saveBtn);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify post clicking on save button system should display the confirmation message with OK and CANCEL button")
	public void user_608_verify_post_clicking_on_save_button_system_should_display_the_confirmation_message_with_ok_and_cancel_button() {
		WebElement msg = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("confirmPopupMsg"));
		WebElement cancelBtn = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("confirmPopupCancelBtn"));
		WebElement saveBtn = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("confirmPopupOkayBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(msg);
				softAssert.assertTrue(msg.isDisplayed(), "Confirm message should displayed");
				javascriptHelper.backgroundBorder(cancelBtn);
				softAssert.assertTrue(cancelBtn.isDisplayed(), "Cancel button should displayed");
				javascriptHelper.backgroundBorder(saveBtn);
				softAssert.assertTrue(saveBtn.isDisplayed(), "Save button should displayed");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Confimation popup Ok button in Application Details screen")
	public void user_click_the_confimation_popup_ok_button_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('mat-dialog-container button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('mat-dialog-container button')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Okay")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('mat-dialog-container button')[" + j + "]";
						WebElement okayBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(okayBtn);
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
		for (int i = 0; i <= 500000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the Customer Type under Application Details screen")
	public void user_608_select_the_customer_type_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerType"))
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Customer_Type")).trim())) {
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

	@And("User_608 Enter the Customer Name under Application Details screen")
	public void user_608_enter_the_customer_name_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 5000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerName"))
						.sendKeys(testData.get("Customer_Name"));
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the ID Type under Application Details screen")
	public void user_608_select_the_id_type_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("idType")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ID_Type"))) {
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

	@And("User_608 Enter the ID Number under Application Details screen")
	public void user_608_enter_the_id_number_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("idNumber"))
						.sendKeys(testData.get("ID_Number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 Enter the Date of Birth under Application Details screen")
	public void user_608_enter_the_date_of_birth_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("dob"))
						.sendKeys(testData.get("DOB"));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("higlightedDate"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Search button under Application Details screen")
	public void user_608_click_the_search_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button').length").toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Search")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('button')[" + j + "]";
						WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(searchBtn);
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

	@And("User_608 click the Create New Request button under Application Details screen")
	public void user_608_click_the_create_new_request_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button').length").toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Create New Request")) {
						String jspath = "document.querySelectorAll('button')[" + j + "]";
						WebElement reqBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.scrollIntoView(reqBtn);
						javascriptHelper.JSEClick(reqBtn);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Save button available under Application details screen")
	public void user_608_verify_the_save_button_available_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						softAssert.assertTrue(saveBtn.isDisplayed(),
								"Save button should be displayed in Application details screen");
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

//	AT_AL_APP_02
	@And("User_608 select the Product in Application details screen")
	public void user_608_select_the_product_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 20000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Product"))) {
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

	@And("User_608 select the Sub-Product in Application details screen")
	public void user_608_select_the_sub_product_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sub_Product"))) {
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

	@And("User_608 enter the Total Finance Amount Requested in Application details screen")
	public void user_608_enter_the_total_finance_amount_requested_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
						.sendKeys(testData.get("Finance_Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Declared Net Monthly Income in Application details screen")
	public void user_608_enter_the_declared_net_monthly_income_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(testData.get("Monthly_Income"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the Sourcing Channel in Application details screen")
	public void user_608_select_the_sourcing_channel_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannelDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Channel"))) {
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

	@And("User_608 select the Business Center Code in Application details screen")
	public void user_608_select_the_business_center_code_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCodeDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Business_Code"))) {
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

	@And("User_608 select the Servicing Type in Application details screen")
	public void user_608_select_the_servicing_type_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingTypeDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Servicing_Type"))) {
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

	@And("User_608 select the Region in Application details screen")
	public void user_608_select_the_region_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("regionDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Region"))) {
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

	@And("User_608 select the Servicing Branch in Application details screen")
	public void user_608_select_the_servicing_branch_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranchDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Servicing_Branch"))) {
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

	@And("User_608 select the Closing Staff or Servicing Staff or RM in Application details screen")
	public void user_608_select_the_closing_staff_or_servicing_staff_or_rm_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown")));
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Closing_Staff"))) {
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

	@And("User_608 select the Sourcing Type under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_type_under_referral_sourcing_details_section_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Type"))) {
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

	@And("User_608 select the Sourcing Office under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_office_under_referral_sourcing_details_section_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOfficeDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Office"))) {
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

	@And("User_608 select the Sourcing Entity under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_entity_under_referral_sourcing_details_section_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntityDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Entity"))) {
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

	@And("User_608 select the Sourcing Staff under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_staff_under_referral_sourcing_details_section_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaffDropdown"))
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
		for (int i = 0; i <= 3000; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Staff"))) {
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

	@And("User_608 post entering all valid details, clicking on save button in Application Details screen")
	public void user_608_post_entering_all_valid_details_clicking_on_save_button_in_application_details_screen()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(saveBtn).build().perform();
						javascriptHelper.JSEClick(saveBtn);
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

	@And("User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage")
	public void user_608_invoke_soft_assert_in_application_details_screen_at_auto_loan_app_data_entry_stage()
			throws Throwable {
		softAssert.assertAll();
	}

//	AT_AL_APP_03
	@And("User_608 verify Classification field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_classification_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationLabel")).getText();
		for (int i = 0; i < 20000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationLabel")));
				softAssert.assertTrue(label.contains("*"), "Product field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 19999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement classification = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classification"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Product field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Product field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Product field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_product_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel")));
				softAssert.assertTrue(label.contains("*"), "Sub-Product field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("product"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Sub-Product field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sub-Product field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Finance Amount Requested field as Mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_total_finance_amount_requested_field_as_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtLabel")).getText();
		for (int i = 0; i < 20000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtLabel")));
				softAssert.assertTrue(label.contains("*"), "Total Finance Amount field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 19999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement classification = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmt"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Total Finance Amount field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Numeric
		WebElement totalFinanceAmtInput = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				softAssert.assertTrue(totalFinanceAmtInput.getAttribute("inputmode").contains("decimal"),
						"Total Finance Amount field should Accept Numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Declared Net Monthly Income field as Mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_declared_net_monthly_income_field_as_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")));
				softAssert.assertTrue(label.contains("*"), "Monthly Income field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement declaredMonthlyIncome = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncome"));
		String read = declaredMonthlyIncome.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Monthly Income field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Numeric
		WebElement declaredMonthlyIncomeInput = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				softAssert.assertTrue(declaredMonthlyIncomeInput.getAttribute("inputmode").contains("decimal"),
						"Monthly Income field should Accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Declared Current Obligations field as Non-mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_declared_current_obligations_field_as_non_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsLabel")));
				softAssert.assertTrue(!(label.contains("*")),
						"Declared Current Obligations field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement declaredCurrentObligationsInput = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		String read = declaredCurrentObligationsInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Declared Current Obligations should Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Numeric
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				softAssert.assertTrue(declaredCurrentObligationsInput.getAttribute("mode").contains("decimal"),
						"Declared Current Obligations field accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Special Promotion field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_special_promotion_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Special Promotion field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotion"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Special Promotion field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Special Promotion field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sourcing Channel field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_sourcing_channel_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannelLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannelLabel")));
				softAssert.assertTrue(label.contains("*"), "Sourcing Channel field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannel"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Sourcing Channel field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Channel field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Business Center Code field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_business_center_code_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCodeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCodeLabel")));
				softAssert.assertTrue(label.contains("*"), "Business Center Code field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCode"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Business Center Code field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Business Center Code field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Servicing Type field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_servicing_type_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingTypeLabel")));
				softAssert.assertTrue(label.contains("*"), "Servicing Type field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Servicing Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Servicing Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Region field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_region_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("regionLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("regionLabel")));
				softAssert.assertTrue(label.contains("*"), "Region field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("region"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Region field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Region field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Servicing Branch field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_servicing_branch_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranchLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranchLabel")));
				softAssert.assertTrue(label.contains("*"), "Servicing Branch field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranch"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Servicing Branch field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranchDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Servicing Branch field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Spoke Location field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_spoke_location_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("spokeLocationLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("spokeLocationLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Spoke Location field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("spokeLocation"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Spoke Location field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("spokeLocationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Spoke Location field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Closing Staff or Servicing Staff or RM field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_closing_staff_or_servicing_staff_or_rm_field_as_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffLabel")));
				softAssert.assertTrue(label.contains("*"), "Closing Staff field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaff"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Closing Staff field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Closing Staff field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Topup Type field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_topup_type_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				actions.moveToElement(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupTypeLabel"))).build()
						.perform();
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupTypeLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Topup Type field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Topup Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Topup Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Topup Application No field as Non-mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_topup_application_no_field_as_non_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupAppNoLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				actions.moveToElement(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupAppNoLabel"))).build()
						.perform();
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupAppNoLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Topup Application No field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement topupAppNoInput = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("topupAppNo"));
		String read = topupAppNoInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(topupAppNoInput).build().perform();
				softAssert.assertTrue(read.contains("false"), "Topup Application No should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Numeric
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(topupAppNoInput);
				softAssert.assertTrue(topupAppNoInput.getAttribute("type").contains("number"),
						"Topup Application No field accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_APP_04
	@And("User_608 verify Sourcing Type field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_type_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeLabel")));
				softAssert.assertTrue(label.contains("*"), "Sourcing Type field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Sourcing Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sourcing Office field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_office_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOfficeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOfficeLabel")));
				softAssert.assertTrue(label.contains("*"), "Sourcing Office field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOffice"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Sourcing Office field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOfficeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Office field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sourcing Entity field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_entity_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntityLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntityLabel")));
				softAssert.assertTrue(label.contains("*"), "Sourcing Entity field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntity"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Sourcing Entity field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntityDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Entity field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sourcing Staff field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_staff_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section()
			throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaffLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaffLabel")));
				softAssert.assertTrue(label.contains("*"), "Sourcing Staff field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaff"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Sourcing Staff field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaffDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Staff field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Reference Type field as Non_mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_reference_type_field_as_non_mandatory_editable_and_lookup_in_referral_sourcing_details_section()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceTypeLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Reference Type field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Reference Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Reference Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Reference Entity field as Non_mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_reference_entity_field_as_non_mandatory_editable_and_lookup_in_referral_sourcing_details_section()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceEntityLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceEntityLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Reference Entity field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceEntity"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Reference Entity field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceEntityDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Reference Entity field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Reference Code field as Non_mandatory, Editable and Textbox in Referral\\Sourcing Details section")
	public void user_608_verify_reference_code_field_as_non_mandatory_editable_and_textbox_in_referral_sourcing_details_section()
			throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceCodeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceCodeLabel")));
				softAssert.assertTrue(!(label.contains("*")), "Reference Code field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceCode"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(product);
				softAssert.assertTrue(read.contains("false"), "Reference Code field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be textbox
		String refCodeInput = "document.querySelector('[id=\"referenceEmployeeId\"] input')";
		String tagName = javascriptHelper.executeScriptWithWebElement(refCodeInput).getTagName();
		for (int i = 0; i <= 2000; i++) {
			try {
				System.out.println("Tag Name: " + tagName);
				softAssert.assertTrue(tagName.contains("input"), "Reference Code field should be textbox");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_APP_05
	@And("User_608 to verify the impact when user keep any mandatory field blank and click on save button")
	public void user_608_to_verify_the_impact_when_user_keep_any_mandatory_field_blank_and_click_on_save_button()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(saveBtn).build().perform();
						javascriptHelper.JSEClick(saveBtn);
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

	@And("User_608 system should show the proper validation message for blank field in Application details screen")
	public void user_608_system_should_show_the_proper_validation_message_for_blank_field_in_application_details_screen()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("mandatoryReqPopup")));
		String madatoryErrorMsg = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("mandatoryReqPopup")).getText();
		System.err.println("Mandatory Error : " + madatoryErrorMsg);
		for (int i = 0; i < 2000; i++) {
			try {
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill required fields"),
						" System should show the proper validation message for blank field");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_APP_06
	@And("User_608 click any one record Edit button under Application Details screen")
	public void user_608_click_any_one_record_edit_button_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("pencilEditBtn")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("pencilEditBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 verify Update button available in Application details screen")
	public void user_608_verify_update_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Update")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Update button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Approve button available in Application details screen")
	public void user_608_verify_approve_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('kub-workflow-decision button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('kub-workflow-decision button')[" + j
							+ "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Approve")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('kub-workflow-decision button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Approve button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Eligiblity Check button available in Application details screen")
	public void user_608_verify_eligiblity_check_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('kub-workflow-decision button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('kub-workflow-decision button')[" + j
							+ "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Eligibility Check")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('kub-workflow-decision button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Eligibility Check button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify View summary button available in Application details screen")
	public void user_608_verify_view_summary_button_available_in_application_details_screen() throws Throwable {
		WebElement btn = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundBorder(btn);
				softAssert.assertTrue(btn.isDisplayed(),
						"View Summary button should be displayed Application details screen");
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Back button available in Application details screen")
	public void user_608_verify_back_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Back button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Status field available in Application details screen")
	public void user_608_verify_status_field_available_in_application_details_screen() throws Throwable {
		WebElement label = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusLabel"));
		WebElement field = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusToggleBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				actions.moveToElement(field).build().perform();
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Status field should be displayed in Application details screen");
				javascriptHelper.backgroundBorder(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Status toggle button should be displayed in Application details screen");
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

//	AT_AL_APP_07
	@And("User_608 to verify system allow user to modify the Application Detail record")
	public void user_608_to_verify_system_allow_user_to_modify_the_application_detail_record() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
						.sendKeys(testData.get("Finance_Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify while modification, when user keep any mandatory field blank and click on Save button in Application Detail screen")
	public void user_608_to_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_in_application_detail_screen()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(saveBtn);
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
//		WebElement updateBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("updateBtn"));
//		for (int i = 0; i <= 150000; i++) {
//			try {
//				actions.moveToElement(updateBtn).build().perform();
//				updateBtn.click();
//				break;
//			} catch (Exception e) {
//				if (i == 150000) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
	}

	@And("User_608 to verify while modification system allow user to save the record with valid data in Application Detail screen")
	public void user_608_to_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data_in_application_detail_screen()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(testData.get("Monthly_Income"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(saveBtn);
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

	@And("User_608 to verify system display the confirmation message post clicking on Update button")
	public void user_608_to_verify_system_display_the_confirmation_message_post_clicking_on_update_button() {
		WebElement alertMsg = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_SuccessMsg"));
		for (int i = 0; i < 20000; i++) {
			try {
				String text = alertMsg.getText();
				System.out.println("Alert Message: " + text);
				softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_APP_08
	@And("User_608 click the View Summary button in Application Details screen")
	public void user_608_click_the_view_summary_button_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 150000; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
				actions.moveToElement(btn).build().perform();
				javascriptHelper.backgroundBorder(btn);
				javascriptHelper.JSEClick(btn);
				break;
			} catch (Exception e) {
				if (i == 150000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify the functionality of Back button under Application Details screen")
	public void user_608_to_verify_the_functionality_of_back_button_under_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150000; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("AppDetailsBackBtn"));
				actions.moveToElement(btn).build().perform();
				javascriptHelper.backgroundBorder(btn);
				javascriptHelper.JSEClick(btn);
				break;
			} catch (Exception e) {
				if (i == 150000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 post clicking on Back button, system should navigate to the previous screen")
	public void user_608_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i <= 150000; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxEntitleBtn"));
				javascriptHelper.backgroundBorder(btn);
				softAssert.assertTrue(btn.isDisplayed(),
						"Post clicking on the back button, system navigate to previous screen");
				break;
			} catch (Exception e) {
				if (i == 150000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

//	AT_AL_APP_09
	@And("User_608 click the Edit button if the status of record is Active in Application Details screen")
	public void user_click_the_edit_button_if_the_status_of_record_is_active_in_application_details_screen()
			throws Throwable {
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td').length";
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
			for (int k = 0; k <= 100; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Active").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "].parentElement.querySelector('button')"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "].parentElement.querySelector('button')")
									.click();
							isEyeBtnClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isEyeBtnClicked == true) {
				break;
			}
		}
	}

	@And("User_608 to verify the functionality of Activate\\/Deactivate button in Application Details screen")
	public void user_to_verify_the_functionality_of_activate_deactivate_button_in_application_details_screen()
			throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i <= 10000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusToggleBtn")));
				javascriptHelper.backgroundBorder(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusToggleBtn")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusToggleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 after change the status user click the Update button under Application Details screen")
	public void user_608_after_change_the_status_user_click_the_update_button_under_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 10000; i++) {
			try {
				actions.moveToElement(
						javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("updateBtn")))
						.build().perform();
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("updateBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 10000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 get the updated record ID under Application Details screen")
	public void user_608_get_the_updated_record_id_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement successMsg = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_SuccessMsg"));
		for (int i = 0; i <= 300; i++) {
			try {
				String text = successMsg.getText();
				System.out.println("Message:" + text);
				System.out.println("Number: " + text.substring(32, 36));
				AppDataEntryApplicationDetails.updateTestData(testData.get("DataSet ID"), "Record_ID",
						text.substring(32, 36));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the record ID under Application Details screen")
	public void user_608_search_the_record_id_under_application_details_screen() {
		WebElement searchBtn = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBtn"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(searchBtn);
				searchBtn.click();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
						.sendKeys(testData.get("Record_ID"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify if Status is Active then click Status toggle button system should show Deactivate in Application Details screen")
	public void user_608_to_verify_if_status_is_active_then_click_status_toggle_button_system_should_show_deactivate_in_application_details_screen()
			throws Throwable {
		String len = null;
		for (int i = 0; i < 100; i++) {
			try {
				len = javascriptHelper.executeScript(
						"return document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[1].querySelectorAll('td').length")
						.toString();
				System.out.println(len);
				if (!len.isBlank() && !len.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			try {
				int length2 = Integer.parseInt(len) - 1;
				System.err.println("Final Length: " + length2);
				String title = "document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[1].querySelectorAll('td')["
						+ length2 + "]";
				WebElement element = javascriptHelper.executeScriptWithWebElement(title);
				javascriptHelper.backgroundBorder(element);
//				System.out.println("Get Text: "+element.getText());
//				softAssert.assertTrue(element.getText().contains("In-active"), "Status should be In-active");
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_608 click the Edit button if the status of record is in-Active under Application Details screen")
	public void user_click_the_edit_button_if_the_status_of_record_is_in_active_under_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 500000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("pencilEditBtn")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("pencilEditBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify if Status is In-active then click Status toggle button system should show Active in Application Details screen")
	public void user_608_to_verify_if_status_is_in_active_then_click_status_toggle_button_system_should_show_active_in_application_details_screen()
			throws Throwable {
		String len = null;
		for (int i = 0; i < 100; i++) {
			try {
				len = javascriptHelper.executeScript(
						"return document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[1].querySelectorAll('td').length")
						.toString();
				System.out.println(len);
				if (!len.isBlank() && !len.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			try {
				int length2 = Integer.parseInt(len) - 1;
				System.err.println("Final Length: " + length2);
				String title = "document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[1].querySelectorAll('td')["
						+ length2 + "]";
				WebElement element = javascriptHelper.executeScriptWithWebElement(title);
				javascriptHelper.backgroundBorder(element);
//				System.out.println("Get Text: "+element.getText());
//				softAssert.assertTrue(element.getText().equalsIgnoreCase("Active"), "Status should be Active");
				break;
			} catch (Exception e) {

			}

		}
	}

	@And("User_608 verify values in List view should be non-editable and must be populated correctly in Application Details screen")
	public void user_608_verify_values_in_list_view_should_be_non_editable_and_must_be_populated_correctly_in_application_details_screen()
			throws Throwable {
		String listOfRecords = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfValues = "";
		String addButtonScreenName = "";
		for (int i = 0; i <= 30; i++) {
			try {
				listOfValues = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfValues);
				if (!(listOfValues.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int values = Integer.parseInt(listOfValues);
		for (int j = 0; j < values; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Application Details").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							WebElement nonEdit = javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td p-celleditor')[4]");
							javascriptHelper.backgroundBorder(nonEdit);
							System.out.println("Is Non Editable: "
									+ javascriptHelper.executeScript("return arguments[0].readOnly", nonEdit));
							System.out.println("Field Name: " + nonEdit.getText());
							break;
						}
					}
				} catch (Exception e) {
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

//	AT_AL_APP_11
	@And("User_608 to verify the functionality of Search box with matching data under Application Details screen")
	public void user_608_to_verify_the_functionality_of_search_box_with_matching_data_under_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
						.sendKeys(testData.get("Matching_Value"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify the functionality of Search box with mismatch data under Application Details screen")
	public void user_608_to_verify_the_functionality_of_search_box_with_mismatch_data_under_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
						.sendKeys(testData.get("Mismatched_Value"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_CUD_02
	@And("User_608 select the Finanace type value in Financial Commitments-Customer Debt screen")
	public void user_608_select_the_finanace_type_value_in_financial_commitments_customer_debt_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown"))
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance Type")).trim())) {
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

	@And("User_608 select the Financial Institution value in Financial Commitments-Customer Debt screen")
	public void user_608_select_the_financial_institution_value_in_financial_commitments_customer_debt_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionDropdown"))
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
			System.out.println("Map " + testData.get("Financial Institution").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Financial Institution")).trim())) {
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

	@And("User_608 enter the Account Number in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_account_number_in_financial_commitments_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNbr"))
						.sendKeys(testData.get("Account Nbr"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Sanction Amount in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_sanction_amount_in_financial_commitments_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
						.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Tenure in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_tenure_in_financial_commitments_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
						.sendKeys(testData.get("Tenure(Months)"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Installment Amount in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_installment_amount_in_financial_commitments_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Installment Amt"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

	@And("User_608 select the Currency value in Financial Commitments-Customer Debt screen")
	public void user_608_select_the_currency_value_in_financial_commitments_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyDropdown"))
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
			System.out.println("Map " + testData.get("Currency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
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

	@And("User_608 enter the Remaining Tenure in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_remaining_tenure_in_financial_commitments_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"), Keys.TAB);
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 invoke soft assert in Customer Debt screen at Auto Loan App Data Entry stage")
	public void user_608_invoke_soft_assert_in_customer_debt_screen_at_auto_loan_app_data_entry_stage()
			throws Throwable {
		softAssert.assertAll();
	}

//	AT_AL_CUD_03
	@And("User_608 verify system should allow user to select any value from the LOV in Finance Type")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_finance_type()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown"))
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance Type")).trim())) {
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

	@And("User_608 verify system should allow user to select any value from the LOV in Financial Institution")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_financial_institution()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionDropdown"))
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
			System.out.println("Map " + testData.get("Financial Institution").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Financial Institution")).trim())) {
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

	@And("User_608 verify system should allow user to enter only positive numeric value in Account Number field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_account_number_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNbr"))
						.sendKeys(testData.get("Account Nbr"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Sanction Amount field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_sanction_amount_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
						.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Interest Rate % field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_interest_rate_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateInput"))
						.sendKeys(testData.get("Interest_Rate"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Current Principal balance field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_current_principal_balance_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceInput"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceInput"))
						.sendKeys(testData.get("Current_Principal"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Tenure field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_tenure_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
						.sendKeys(testData.get("Tenure(Months)"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Installment Amount field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_installment_amount_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Installment Amt"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Amount considered field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_amount_considered_field()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredInput"))
						.click();
				actions.scrollToElement(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredInput"))).build()
						.perform();
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredInput"))
						.sendKeys(testData.get("Amt_Consider"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Temporary code
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_608 verify system should allow user to select any value from the LOV in Currency field")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_currency_field()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyDropdown"))
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
			System.out.println("Map " + testData.get("Currency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
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

	@And("User_608 verify system should allow user to select any value from the LOV in Collateral Type field")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_collateral_type_field()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypedDropDown"))
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
			System.out.println("Map " + testData.get("Collateral_Type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Collateral_Type")).trim())) {
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

	@And("User_608 verify system should allow user to select any value from the LOV in Frequency field")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_frequency_field()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyDropdown"))
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
			System.out.println("Map " + testData.get("Frequency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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

	@And("User_608 verify system should allow user to enter only positive numeric value in Last Payment Amount field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_last_payment_amount_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtInput"))
						.sendKeys(testData.get("last_Payment_Amt"), Keys.TAB, Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Remaining Tenure field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_remaining_tenure_field()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"), Keys.TAB, Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_CUD_04
	@And("User_608 to verify the impact when user enter characters value in numeric field in Customer Debt screen")
	public void user_608_to_verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_customer_debt_screen()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"), Keys.TAB);
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_CUD_05
	@And("User_608 to verify system allow user to modify the Customer Debt Information in Customer Debt screen")
	public void user_608_to_verify_system_allow_user_to_modify_the_customer_debt_information_in_customer_debt_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Finance Type"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify while modification system enters the invalid data in Customer Debt screen")
	public void user_608_to_verify_while_modification_system_enters_the_invalid_data_in_customer_debt_screen()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Invalid_data"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

	@And("User_608 to verify while modification system allow user to save the record with valid data in Customer Debt screen")
	public void user_608_to_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data_in_customer_debt_screen()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Installment Amt"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

//	AT_AL_CUD_07
	@And("User_608 to verify the functionality of Search box with matching data under Financial Commitments section")
	public void user_608_to_verify_the_functionality_of_search_box_with_matching_data_under_financial_commitments_section()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
						.sendKeys(testData.get("Matched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify the functionality of Search box with mismatch data under Financial Commitments section")
	public void user_608_to_verify_the_functionality_of_search_box_with_mismatch_data_under_financial_commitments_section()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
						.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_CUD_09
	@And("User_608 click any one active record Edit button under Financial Commitments section")
	public void user_608_click_any_one_active_record_edit_button_under_financial_commitments_section()
			throws Throwable {
		Thread.sleep(1000);
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Financial Commitments")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')" + "[" + j
								+ "].parentElement.parentElement.querySelector('td button[icon=\"pi pi-pencil\"]')";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
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
//		Temporary code
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("User_608 System should able to select Accept\\Reject from dropdown Decision section in Offer Decision tab")
	public void user_608_system_should_able_to_select_accept_reject_from_dropdown_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage")
	public void user_608_invoke_soft_assert_in_offer_decision_screen_at_auto_loan_underwriter_l1_stage()
			throws Throwable {
		softAssert.assertAll();
	}

//	AT_AL_UNWL1_02
	@And("User_608 click Recommendations\\Sanction Conditions Approval History link under Approval Details Hyperlinks section")
	public void user_608_click_recommendations_sanction_conditions_approval_history_link_under_approval_details_hyperlinks_section()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("JSERecommendations")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("JSERecommendations")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Add button in List of condition section under Offer decision tab")
	public void user_608_click_the_add_button_in_list_of_condition_section_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("AddButton")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Recommendations\\Sanction Hyperlink screen get open under Offer decision tab")
	public void user_608_verify_recommendations_sanction_hyperlink_screen_get_open_under_offer_decision_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().contains("Recommendation")) {
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						WebElement screen = javascriptHelper.executeScriptWithWebElement(jspath);
						softAssert.assertTrue(screen.isDisplayed(),
								"Recommendations\\Sanction Hyperlink screen get open under Offer decision tab");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_UNWL1_03
	@And("User_608 select the Note Code from dropdown under Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_the_note_code_from_dropdown_under_recommendation_sanction_hyperlink_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteCode")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Note_Code"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter Sequence Number under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_sequence_number_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber"))
						.sendKeys(testData.get("Sequence_Number"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select Note Sub Code from dropdown under Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_note_sub_code_from_dropdown_under_recommendation_sanction_hyperlink_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteSubcode")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Note_Sub_Code"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter Condition under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_condition_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition"))
						.sendKeys(testData.get("Condition"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter Date under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_date_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date")).click();
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date_today")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter Remarks under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_remarks_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks"))
						.sendKeys(testData.get("Remarks"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Save button under Recommendation\\Sanction Hyperlink screen")
	public void user_608_click_the_save_button_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("SaveIcon"));
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select Accept\\Reject from dropdown Decision section in Offer Decision tab")
	public void user_608_select_accept_reject_from_dropdown_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the Decision value as Select under Decision section in Offer Decision tab")
	public void user_608_select_the_decision_value_as_select_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision2"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_UNWL1_05
	@And("User_608 click the Application details tab")
	public void user_608_click_the_application_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Application Details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
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

		String length1 = null;
		for (int i = 0; i < 500; i++) {
			try {
				length1 = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item ion-title').length").toString();
				System.out.println(length1);
				if (!length1.isBlank() && !length1.equals("0")) {
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
				for (int j = 0; j < Integer.parseInt(length1); j++) {
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Application Details")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						softAssert.assertTrue(section.isDisplayed(),
								"Application Details title available under Offer Decision tab");
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

	@And("User_608 verify all the populate data correctly at this stage and display only in Application details screen")
	public void user_608_verify_all_the_populate_data_correctly_at_this_stage_and_display_only_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				WebElement element1 = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel"));
				actions.scrollToElement(element1).build().perform();
				WebElement element2 = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceCode"));
				actions.scrollToElement(element2).build().perform();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Eye button under Customer Details tab")
	public void user_608_click_the_eye_button_under_customer_details_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				String jsPath = "document.querySelector('button[icon=\"pi pi-eye\"]')";
				WebElement element = javascriptHelper.executeScriptWithWebElement(jsPath);
				actions.moveToElement(element).click().build().perform();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify all the populate data correctly at this stage and display only in Customer details screen")
	public void user_608_verify_all_the_populate_data_correctly_at_this_stage_and_display_only_in_customer_details_screen()
			throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarks"));
				javascriptHelper.scrollIntoView(element);
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify all the populate data correctly at this stage and display only under Customer Financials tab")
	public void user_608_verify_all_the_populate_data_correctly_at_this_stage_and_display_only_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
				String lastTitle = "document.querySelectorAll('ion-title[mode=\"md\"]')["
						+ (Integer.parseInt(length) - 1) + "]";
				System.out.println("Path Length: " + lastTitle);
				WebElement title = javascriptHelper.executeScriptWithWebElement(lastTitle);
				javascriptHelper.scrollIntoView(title);
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Asset Details tab")
	public void user_608_click_the_asset_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Asset Details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
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

	@And("User_608 click the Policy Check tab")
	public void user_608_click_the_policy_check_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Policy Check")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
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

	@And("User_608 click the Eye button under Asset Details tab")
	public void user_608_click_the_eye_button_under_asset_details_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				String jsPath = "document.querySelector('button[icon=\"pi pi-eye\"]')";
				WebElement element = javascriptHelper.executeScriptWithWebElement(jsPath);
				actions.moveToElement(element).click().build().perform();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify all the populate data correctly at this stage and display only under Asset Details tab")
	public void user_608_verify_all_the_populate_data_correctly_at_this_stage_and_display_only_under_Asset_details_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
				String lastTitle = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')["
						+ (Integer.parseInt(length) - 1) + "]";
				System.out.println("Path Length: " + lastTitle);
				WebElement title = javascriptHelper.executeScriptWithWebElement(lastTitle);
				javascriptHelper.scrollIntoView(title);
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Document Details tab")
	public void user_608_click_the_document_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Document Details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(addButton).build().perform();
						javascriptHelper.JSEClick(addButton);
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

	@And("User_608 click the Eye button under Document Details tab")
	public void user_608_click_the_eye_button_under_document_details_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("eyeBtn"));
				actions.moveToElement(element).build().perform();
				element.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	/* Under writer code */
	@And("User_608 click the Pencil icon under Offer Decision tab")
	public void user_608_click_the_pencil_icon_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionPencilEditBtn")));
				javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionPencilEditBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Decision section is displayed under Offer Decision tab")
	public void user_608_verify_decision_section_is_displayed_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Decision")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Decision section available under Offer Decision tab");
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

	@And("User_608 verify Facility Details section is displayed under Offer Decision tab")
	public void user_608_verify_facility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Facility Details")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Facility Details section available under Offer Decision tab");
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

	@And("User_608 verify Eligibility Details section is displayed under Offer Decision tab")
	public void user_608_verify_eligibility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Eligibility Details")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Eligibility Details section available under Offer Decision tab");
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

	@And("User_608 verify Finance Configuration section is displayed under Offer Decision tab")
	public void user_608_verify_finance_configuration_section_is_displayed_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Finance Configuration")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Finance Configuration section available under Offer Decision tab");
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

	@And("User_608 verify Pricing Details section is displayed under Offer Decision tab")
	public void user_608_verify_pricing_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Pricing Details section available under Offer Decision tab");
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

	@And("User_608 verify Instalment Details section is displayed under Offer Decision tab")
	public void user_608_verify_instalment_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Instalment Details")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Instalment Details section available under Offer Decision tab");
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

	@And("User_608 verify Approval Details Hyperlinks section is displayed under Offer Decision tab")
	public void user_608_verify_approval_details_hyperlinks_section_is_displayed_under_offer_decision_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Approval Details Hyperlinks")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Approval Details Hyperlinks section available under Offer Decision tab");
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

//	Unw_03
	@And("User_608 verify Approval level field under Decision section in Offer Decision tab")
	public void user_608_verify_approval_level_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_Decision")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				WebElement decision_ApprovalLevel = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_ApprovalLevel"));
				System.out.println("Field Name: " + decision_ApprovalLevel.getText());
				javascriptHelper.backgroundColor(decision_ApprovalLevel);
				softAssert.assertTrue(decision_ApprovalLevel.isDisplayed(),
						"Verify Approval level field available under Decision section in Offer Decision tab");
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Underwriter field under Decision section in Offer Decision tab")
	public void user_608_verify_underwriter_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Underwriter = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_Underwriter"));
		System.out.println("Field Name: " + decision_Underwriter.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_Underwriter);
				softAssert.assertTrue(decision_Underwriter.isDisplayed(),
						"Verify Underwriter field available under Decision section in Offer Decision tab");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Reviewer field under Decision section in Offer Decision tab")
	public void user_608_verify_reviewer_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Reviewer = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_Reviewer"));
		System.out.println("Field Name: " + decision_Reviewer.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_Reviewer);
				softAssert.assertTrue(decision_Reviewer.isDisplayed(),
						"Verify Reviewer field available under Decision section in Offer Decision tab");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Decision Date field under Decision section in Offer Decision tab")
	public void user_608_verify_decision_date_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDate = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_DecisionDate"));
		System.out.println("Field Name: " + decision_DecisionDate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_DecisionDate);
				softAssert.assertTrue(decision_DecisionDate.isDisplayed(),
						"Verify Decision Date field available under Decision section in Offer Decision tab");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Decision field under Decision section in Offer Decision tab")
	public void user_608_verify_decision_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDropdown = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_DecisionField"));
		System.out.println("Field Name: " + decision_DecisionDropdown.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_DecisionDropdown);
				softAssert.assertTrue(decision_DecisionDropdown.isDisplayed(),
						"Verify Decision field available under Decision section in Offer Decision tab");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_04
	@And("User_608 verify the Offer amount under Finance Configuration section in Offer Decision tab")
	public void user_608_verify_the_offer_amount_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		String approveValue = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_ApprovalLevelValue")).getText();
		System.out.println("Appove Level: " + approveValue);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerAmtInput = javascriptHelper.executeScriptWithWebElement(
				"document.querySelector('[ng-reflect-text=\"Offered Amount\"]').nextElementSibling");
		javascriptHelper.backgroundColor(offerAmtInput);
		String offerAmt = javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('[ng-reflect-text=\"Offered Amount\"]').nextElementSibling")
				.getAttribute("ng-reflect-model");
		System.out.println("Offer Amount: " + offerAmt);
		int targetValue = 1000000;
		if (Integer.parseInt(offerAmt) < targetValue) {
			softAssert.assertEquals("LEVEL1", approveValue);
		} else {
			System.out.println("Offer amount Greater than targer value");
		}
	}

	@And("User_608 invoke soft assert in Offer Decision screen at Ijarah Underwriter stage")
	public void user_608_invoke_soft_assert_in_offer_decision_screen_at_ijarah_underwriter_stage() throws Throwable {
		softAssert.assertAll();
	}

//	Unw_06
	@And("User_608 select the Decision dropdown as Accept\\Reject under Decision section in Offer Decision tab")
	public void user_608_select_the_decision_dropdown_as_accept_reject_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
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
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains(testData.get("Decision Dropdown"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
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

//	UNW_07
	@And("User_608 verify the Product field is displayed under Facility Details section")
	public void user_608_verify_the_product_field_is_displayed_under_facility_details_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 5000; i++) {
			try {
				WebElement facility_ProductLabel = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ProductLabel"));
				javascriptHelper.backgroundColor(facility_ProductLabel);
				softAssert.assertTrue(facility_ProductLabel.isDisplayed(),
						"Verify Product field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ProductInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ProductInput);
				softAssert.assertTrue(facility_ProductInput.isDisplayed(),
						"Verify Product field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sub-Product field is displayed under Facility Details section")
	public void user_608_verify_the_sub_product_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SubProductLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SubProductLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_SubProductLabel);
				softAssert.assertTrue(facility_SubProductLabel.isDisplayed(),
						"Verify Sub-Product field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_SubProductInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SubProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_SubProductInput);
				softAssert.assertTrue(facility_SubProductInput.isDisplayed(),
						"Verify Sub-Product field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Scheme field is displayed under Facility Details section")
	public void user_608_verify_the_scheme_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SchemeLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SchemeLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_SchemeLabel);
				softAssert.assertTrue(facility_SchemeLabel.isDisplayed(),
						"Verify Scheme field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_SchemeInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SchemeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_SchemeInput);
				softAssert.assertTrue(facility_SchemeInput.isDisplayed(),
						"Verify Scheme field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Pricing Indicator field is displayed under Facility Details section")
	public void user_608_verify_the_pricing_indicator_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_PricingIndicatorLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PricingIndicatorLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_PricingIndicatorLabel);
				softAssert.assertTrue(facility_PricingIndicatorLabel.isDisplayed(),
						"Verify Pricing Indicator field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_PricingIndicatorInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PricingIndicatorInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_PricingIndicatorInput);
				softAssert.assertTrue(facility_PricingIndicatorInput.isDisplayed(),
						"Verify Pricing Indicator field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 verify the Repayment Type field is displayed under Facility Details section")
	public void user_608_verify_the_repayment_type_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_RepaymentTypeLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_RepaymentTypeLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_RepaymentTypeLabel);
				softAssert.assertTrue(facility_RepaymentTypeLabel.isDisplayed(),
						"Verify Repayment Type field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_RepaymentTypeInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_RepaymentTypeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_RepaymentTypeInput);
				softAssert.assertTrue(facility_RepaymentTypeInput.isDisplayed(),
						"Verify Repayment Type field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Compute Instalment On field is displayed under Facility Details section")
	public void user_608_verify_the_compute_instalment_on_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_ComputeInstalmentLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ComputeInstalmentLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ComputeInstalmentLabel);
				softAssert.assertTrue(facility_ComputeInstalmentLabel.isDisplayed(),
						"Verify Compute Instalment On field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ComputeInstalmentInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ComputeInstalmentInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ComputeInstalmentInput);
				softAssert.assertTrue(facility_ComputeInstalmentInput.isDisplayed(),
						"Verify Compute Instalment On field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Principal Frequency field is displayed under Facility Details section")
	public void user_608_verify_the_principal_frequency_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_PrincipalFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PrincipalFrequencyLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_PrincipalFrequencyLabel);
				softAssert.assertTrue(facility_PrincipalFrequencyLabel.isDisplayed(),
						"Verify Principal Frequency field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_PrincipalFrequencyInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PrincipalFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_PrincipalFrequencyInput);
				softAssert.assertTrue(facility_PrincipalFrequencyInput.isDisplayed(),
						"Verify Principal Frequency field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Interest Frequency field is displayed under Facility Details section")
	public void user_608_verify_the_interest_frequency_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_InterestFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_InterestFrequencyLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_InterestFrequencyLabel);
				softAssert.assertTrue(facility_InterestFrequencyLabel.isDisplayed(),
						"Verify Interest Frequency field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_InterestFrequencyInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_InterestFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_InterestFrequencyInput);
				softAssert.assertTrue(facility_InterestFrequencyInput.isDisplayed(),
						"Verify Interest Frequency field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Eligible Income field is displayed under Facility Details section")
	public void user_608_verify_the_eligible_income_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_EligibleIncomeLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_EligibleIncomeLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_EligibleIncomeLabel);
				softAssert.assertTrue(facility_EligibleIncomeLabel.isDisplayed(),
						"Verify Eligible Income field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_EligibleIncomeInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_EligibleIncomeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_EligibleIncomeInput);
				softAssert.assertTrue(facility_EligibleIncomeInput.isDisplayed(),
						"Verify Eligible Income field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Average Account Balance field is displayed under Facility Details section")
	public void user_608_verify_the_average_account_balance_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_AverageAccBalanceLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_AverageAccBalanceLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_AverageAccBalanceLabel);
				softAssert.assertTrue(facility_AverageAccBalanceLabel.isDisplayed(),
						"Verify Average Account Balance field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_AverageAccBalanceInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_AverageAccBalanceInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_AverageAccBalanceInput);
				softAssert.assertTrue(facility_AverageAccBalanceInput.isDisplayed(),
						"Verify Average Account Balance field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Applicable LTV1 field is displayed under Facility Details section")
	public void user_608_verify_the_applicable_ltv1_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_ApplicableLTV1Label = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV1Label"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ApplicableLTV1Label);
				softAssert.assertTrue(facility_ApplicableLTV1Label.isDisplayed(),
						"Verify Applicable LTV1 field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ApplicableLTV1Input = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV1Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ApplicableLTV1Input);
				softAssert.assertTrue(facility_ApplicableLTV1Input.isDisplayed(),
						"Verify Applicable LTV1 field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Applicable LTV2 field is displayed under Facility Details section")
	public void user_608_verify_the_applicable_ltv2_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_ApplicableLTV2Label = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV2Label"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ApplicableLTV2Label);
				softAssert.assertTrue(facility_ApplicableLTV2Label.isDisplayed(),
						"Verify Applicable LTV2 field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ApplicableLTV2Input = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV2Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ApplicableLTV2Input);
				softAssert.assertTrue(facility_ApplicableLTV2Input.isDisplayed(),
						"Verify Applicable LTV2 field is available under Facility Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_08
	@And("User_608 verify Requested Amount field is displayed under Finance configuration section")
	public void user_608_verify_requested_amount_field_is_displayed_under_finance_configuration_section()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_EligibilityDetails")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Finance_RequestAmountLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestAmountLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_RequestAmountLabel);
				softAssert.assertTrue(Finance_RequestAmountLabel.isDisplayed(),
						"Verify Requested Amount field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_RequestAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_RequestAmountInput);
				softAssert.assertTrue(Finance_RequestAmountInput.isDisplayed(),
						"Verify Requested Amount field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Requested Tenure field is displayed under Finance configuration section")
	public void user_608_verify_requested_tenure_field_is_displayed_under_finance_configuration_section()
			throws Throwable {
		WebElement Finance_RequestTenureLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestTenureLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_RequestTenureLabel);
				softAssert.assertTrue(Finance_RequestTenureLabel.isDisplayed(),
						"Verify Requested Tenure field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_RequestTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_RequestTenureInput);
				softAssert.assertTrue(Finance_RequestTenureInput.isDisplayed(),
						"Verify Requested Tenure field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offered Amount field is displayed under Finance configuration section")
	public void user_608_verify_offered_amount_field_is_displayed_under_finance_configuration_section()
			throws Throwable {
		WebElement Finance_OfferedAmountLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedAmountLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_OfferedAmountLabel);
				softAssert.assertTrue(Finance_OfferedAmountLabel.isDisplayed(),
						"Verify Offered Amount field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_OfferedAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_OfferedAmountInput);
				softAssert.assertTrue(Finance_OfferedAmountInput.isDisplayed(),
						"Verify Offered Amount field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offered Tenure field is displayed under Finance configuration section")
	public void user_608_verify_offered_tenure_field_is_displayed_under_finance_configuration_section()
			throws Throwable {
		WebElement Finance_OfferedTenureLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedTenureLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_OfferedTenureLabel);
				softAssert.assertTrue(Finance_OfferedTenureLabel.isDisplayed(),
						"Verify Offered Tenure field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_OfferedTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_OfferedTenureInput);
				softAssert.assertTrue(Finance_OfferedTenureInput.isDisplayed(),
						"Verify Offered Tenure field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Deviation Amount field is displayed under Finance configuration section")
	public void user_608_verify_deviation_amount_field_is_displayed_under_finance_configuration_section()
			throws Throwable {
		WebElement Finance_DeviationAmountLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_DeviationAmountLabel);
				softAssert.assertTrue(Finance_DeviationAmountLabel.isDisplayed(),
						"Verify Deviation Amount field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_DeviationAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_DeviationAmountInput);
				softAssert.assertTrue(Finance_DeviationAmountInput.isDisplayed(),
						"Verify Deviation Amount field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Deviation Tenure field is displayed under Finance configuration section")
	public void user_608_verify_deviation_tenure_field_is_displayed_under_finance_configuration_section()
			throws Throwable {
		WebElement Finance_DeviationTenureLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_DeviationTenureLabel);
				softAssert.assertTrue(Finance_DeviationTenureLabel.isDisplayed(),
						"Verify Deviation Tenure field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_DeviationTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_DeviationTenureInput);
				softAssert.assertTrue(Finance_DeviationTenureInput.isDisplayed(),
						"Verify Deviation Tenure field is displayed under Finance configuration section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_09
	@And("User_608 verify Period field is displayed under Pricing Details section")
	public void user_608_verify_period_field_is_displayed_under_pricing_details_section() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j + "]"
								+ ".parentElement.nextElementSibling.querySelectorAll(\"table th span\")[0]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.scrollIntoView(field);
						actions.scrollToElement(field).build().perform();
						javascriptHelper.backgroundColor(field);
						softAssert.assertTrue(field.isDisplayed(),
								"Period field is available under Pricing Details section in Offer decision screen");
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

	@And("User_608 verify Interest Def field is displayed under Pricing Details section")
	public void user_608_verify_interest_def_field_is_displayed_under_pricing_details_section() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j + "]"
								+ ".parentElement.nextElementSibling.querySelectorAll(\"table th span\")[1]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(field);
						softAssert.assertTrue(field.isDisplayed(),
								"Interest Def field is available under Pricing Details section in Offer decision screen");
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

	@And("User_608 verify Rate Type field is displayed under Pricing Details section")
	public void user_608_verify_rate_type_field_is_displayed_under_pricing_details_section() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j + "]"
								+ ".parentElement.nextElementSibling.querySelectorAll(\"table th span\")[2]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(field);
						softAssert.assertTrue(field.isDisplayed(),
								"Rate Type field is available under Pricing Details section in Offer decision screen");
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

	@And("User_608 verify Index Rate field is displayed under Pricing Details section")
	public void user_608_verify_index_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j + "]"
								+ ".parentElement.nextElementSibling.querySelectorAll(\"table th span\")[3]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(field);
						softAssert.assertTrue(field.isDisplayed(),
								"Index Rate field is available under Pricing Details section in Offer decision screen");
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

	@And("User_608 verify Offer Rate field is displayed under Pricing Details section")
	public void user_608_verify_offer_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j + "]"
								+ ".parentElement.nextElementSibling.querySelectorAll(\"table th span\")[4]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(field);
						softAssert.assertTrue(field.isDisplayed(),
								"Offer Rate field is available under Pricing Details section in Offer decision screen");
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

	@And("User_608 verify Effective Rate field is displayed under Pricing Details section")
	public void user_608_verify_effective_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					String title = "return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Pricing Details")) {
						String jspath = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + j + "]"
								+ ".parentElement.nextElementSibling.querySelectorAll(\"table th span\")[5]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(field);
						softAssert.assertTrue(field.isDisplayed(),
								"Effective Rate field is available under Pricing Details section in Offer decision screen");
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

//	UNW_10
	@And("User_608 verify the Instalment Period field is displayed under Installment Details section")
	public void user_608_verify_the_instalment_period_field_is_displayed_under_installment_details_section()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement Instalment_InstalPeriod = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("Instalment_InstalPeriod"));
				javascriptHelper.backgroundColor(Instalment_InstalPeriod);
				softAssert.assertTrue(Instalment_InstalPeriod.isDisplayed(),
						"Verify Instalment Period field is available under Installment Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Instalment Amount field is displayed under Installment Details section")
	public void user_608_verify_the_instalment_amount_field_is_displayed_under_installment_details_section()
			throws Throwable {
		WebElement Instalment_InstalAmount = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Instalment_InstalAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Instalment_InstalAmount);
				softAssert.assertTrue(Instalment_InstalAmount.isDisplayed(),
						"Verify Instalment Amount field is available under Installment Details section in Offer decision screen");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_14
	@And("User_608 verify the Deviate button available under Offer Decision screen")
	public void user_608_verify_the_deviate_button_available_under_offer_decision_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement offer_DeviateBtn = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_DeviateBtn"));
				javascriptHelper.backgroundBorder(offer_DeviateBtn);
				actions.scrollToElement(offer_DeviateBtn).build().perform();
				Assert.assertTrue(offer_DeviateBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Recompute button available under Offer Decision screen")
	public void user_608_verify_the_recompute_button_available_under_offer_decision_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement offer_RecomputeBtn = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_RecomputeBtn"));
				javascriptHelper.backgroundBorder(offer_RecomputeBtn);
				Assert.assertTrue(offer_RecomputeBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Save button available under Offer Decision screen")
	public void user_608_verify_the_save_button_available_under_offer_decision_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement offer_SaveBtn = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SaveBtn"));
				javascriptHelper.backgroundBorder(offer_SaveBtn);
				Assert.assertTrue(offer_SaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Offer button available under Offer Decision screen")
	public void user_608_verify_the_offer_button_available_under_offer_decision_screen() throws Throwable {
		WebElement offer_OfferBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(offer_OfferBtn);
				Assert.assertTrue(offer_OfferBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_15
	@And("User_608 clicks on the Save button under the Offer Decision tab")
	public void user_608_clicks_on_the_save_button_under_the_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				WebElement alertPopup = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SuccessAlert"));
				softAssert.assertTrue(alertPopup.isDisplayed(), "System should able to save the decision");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("alertCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Offer button after selecting the Decision under Offer Decision tab")
	public void user_608_click_the_offer_button_after_selecting_the_decision_under_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the validation messgage after clicking Offer button under Offer Decision tab")
	public void user_608_verify_the_validation_messgage_after_clicking_offer_button_under_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement alertPopup = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offerBtnApprovedPopup"));
				String text = alertPopup.getText();
				System.out.println("Success Message: " + text);
				String last = text.substring(text.length() - 5);
				System.out.println("User: " + last.replace(".", ""));

				exelData.updateTestData("UserReturn", "UserName", (last.replace(".", "")));
				softAssert.assertTrue(alertPopup.isDisplayed(), "System should gives 'successfull' message.");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("alertCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the Decision dropdown as Select under Decision section in Offer Decision tab")
	public void user_608_select_the_decision_dropdown_as_select_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("decision_DecisionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision Dropdown1"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Offer button without selecting the Decision under Offer Decision tab")
	public void user_608_click_the_offer_button_without_selecting_the_decision_under_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 verify the validation messgage without selecting decision under Offer Decision tab")
	public void user_608_verify_the_validation_messgage_without_selecting_decision_under_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement alertPopup = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offerBtnErrorPopup"));
				System.out.println("Error Message: " + alertPopup.getText());
				softAssert.assertTrue(alertPopup.getText().trim().contains("No underwriter"),
						"System should gives validation message as 'No underwritter found for allocation'.");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("alertCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 click the Customer Details tab")
	public void user_608_click_the_customer_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
					if (titlename.trim().contains("Customer details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
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

	@And("User_608 click the Customer Financials tab")
	public void user_608_click_the_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
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
//					System.out.println(titlename);
					if (titlename.trim().contains("Customer Financials")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement tab = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(tab);
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

	@And("User_608 click the Eye button under Customer Financials tab")
	public void user_608_click_the_eye_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(
						dataCheck_IncomeJsPaths.getElement("customerFinancialsTabEyeBtn")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Return button under Application details tab")
	public void user_608_click_the_return_button_under_application_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('kub-workflow-decision button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('kub-workflow-decision button')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Return")) {
						String jspath = "document.querySelectorAll('kub-workflow-decision button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						btn.click();
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

	@And("User_608 select L1 Approval from dropdown in Return popup screen")
	public void user_608_select_l1_approval_from_dropdown_in_return_popup_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				WebElement lov = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("return_dropdown"));
				javascriptHelper.JSEClick(lov);
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase("L1 Approval")) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Remarks under Return popup screen")
	public void user_608_enter_the_remarks_under_return_popup_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-chip ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-chip ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("return")) {
						String jspath = "document.querySelectorAll('ion-chip ion-label')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
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

	@And("User_608 click the Return button under Return popup screen")
	public void user_608_click_the_return_button_under_return_popup_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("return_Btn"));
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
//				if (i == 100) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

}
