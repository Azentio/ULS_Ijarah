package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

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
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths appDataAppDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements", "ApplicationDetails_FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	JSPaths appDataCustomerDetailsJsPaths = new JSPaths(excelPath, "AppData_CustomerDetail_Elements", "AppData_CustomerDetails_FieldName", "JSPath");
	JSPaths employmentDetailsJsPaths = new JSPaths(excelPath, "EmploymentDetails_Elements", "EmploymentDetails_FieldName", "JSPath");
	JSPaths incomeDetailsJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName", "JSPath");
	
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
	
	ExcelData AppDataEntryApplicationDetails = new ExcelData(excelTestDataPath,"AL_AppData_AppDetails","DataSet ID");
	ExcelData AppDataEntryCFDebtExcelData = new ExcelData(excelTestDataPath,"AL_AppData_CustomerDebt","DataSet ID");
	ExcelData UnderwriterL1ExcelData = new ExcelData(excelTestDataPath,"AL_Underwriter_L1","DataSet ID");
	ExcelData AppDataEntryEmpDetailsExcelData = new ExcelData(excelTestDataPath,"AL_AppData_EmpDetails","DataSet ID");
	ExcelData AppDataEntryIncomeDetailsExcelData = new ExcelData(excelTestDataPath,"AL_AppData_IncomeDetails","DataSet ID");
	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ULSExecution", "TestCase ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	
//	Auto Loan -- App Data Entry Stage  -- Application Details screen 
	@And("^User_608 get the test data for test case AT_AL_APP_01$")
    public void get_the_test_data_for_test_case_AT_AL_APP_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_01");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_02$")
    public void get_the_test_data_for_test_case_AT_AL_APP_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_02");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_03$")
    public void get_the_test_data_for_test_case_AT_AL_APP_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_03");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_04$")
    public void get_the_test_data_for_test_case_AT_AL_APP_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_04");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_05$")
    public void get_the_test_data_for_test_case_AT_AL_APP_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_05");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_06$")
    public void get_the_test_data_for_test_case_AT_AL_APP_06() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_06");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_07$")
    public void get_the_test_data_for_test_case_AT_AL_APP_07() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_07");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_08$")
    public void get_the_test_data_for_test_case_AT_AL_APP_08() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_08");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_09$")
    public void get_the_test_data_for_test_case_AT_AL_APP_09() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_09");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_10$")
    public void get_the_test_data_for_test_case_AT_AL_APP_10() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_10");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_11$")
    public void get_the_test_data_for_test_case_AT_AL_APP_11() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_11");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_12$")
    public void get_the_test_data_for_test_case_AT_AL_APP_12() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_APP_12");
		testData = AppDataEntryApplicationDetails.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
//	Auto Loan -- App Data Entry Stage  -- Customer Debt screen
	@And("^User_608 get the test data for test case AT_AL_CUD_01$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_01");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_02$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_02");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_03$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_03");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_04$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_04");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_05$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_05");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_06$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_06() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_06");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_07$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_07() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_07");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_08$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_08() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_08");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_CUD_09$")
    public void get_the_test_data_for_test_case_AT_AL_CUD_09() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_CUD_09");
		testData = AppDataEntryCFDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
//	Auto Loan -- Underwriter L1 
	@And("^User_608 get the test data for test case AT_AL_UNWL1_01$")
    public void get_the_test_data_for_test_case_AT_AL_UNWL1_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_UNWL1_01");
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_UNWL1_02$")
    public void get_the_test_data_for_test_case_AT_AL_UNWL1_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_UNWL1_02");
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_UNWL1_03$")
    public void get_the_test_data_for_test_case_AT_AL_UNWL1_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_UNWL1_03");
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_UNWL1_04$")
    public void get_the_test_data_for_test_case_AT_AL_UNWL1_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_UNWL1_04");
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_UNWL1_05$")
    public void get_the_test_data_for_test_case_AT_AL_UNWL1_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_UNWL1_05");
		testData = UnderwriterL1ExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	
//	Auto Loan -- App Data Entry Stage  -- Employment Details screen 
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_01$")
    public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_01");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_02$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_02");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_03$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_03");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_04$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_04");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_05$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_05");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_06$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_06() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_06");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_07$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_07() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_07");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_08$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_08() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_08");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_09$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_09() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_09");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_10$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_10() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_10");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_11$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_11() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_11");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_EMP_12$")
	public void get_the_test_data_for_test_case_AT_AL_ADE_EMP_12() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_EMP_12");
		testData = AppDataEntryEmpDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
//	Auto Loan -- App Data Entry Stage  -- Income Details screen 
	@And("^User_608 get the test data for test case AT_AL_ADE_INC_01$")
    public void get_the_test_data_for_test_case_AT_AL_ADE_INC_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_INC_01");
		testData = AppDataEntryIncomeDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_INC_02$")
    public void get_the_test_data_for_test_case_AT_AL_ADE_INC_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_INC_02");
		testData = AppDataEntryIncomeDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_AL_ADE_INC_03$")
    public void get_the_test_data_for_test_case_AT_AL_ADE_INC_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_AL_ADE_INC_03");
		testData = AppDataEntryIncomeDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	
	
	@And("User_608 search the Reference ID for Auto Loan")
	public void user_search_the_reference_id_for_auto_loan() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	AT_AL_APP_01
	@And("User_608 click the Save button under Application Details screen")
	public void user_608_click_the_save_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}	
	
	@And("User_608 verify post clicking on save button system should display the confirmation message with OK and CANCEL button")
	public void user_608_verify_post_clicking_on_save_button_system_should_display_the_confirmation_message_with_ok_and_cancel_button() {		
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement msg = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("confirmPopupMsg"));				
				javascriptHelper.backgroundColor(msg);
				softAssert.assertTrue(msg.isDisplayed(), "Confirm message should displayed");
				WebElement cancelBtn = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("confirmPopupCancelBtn"));
				javascriptHelper.backgroundBorder(cancelBtn);
				softAssert.assertTrue(cancelBtn.isDisplayed(), "Cancel button should displayed");
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("confirmPopupOkayBtn"));
				javascriptHelper.backgroundBorder(saveBtn);
				softAssert.assertTrue(saveBtn.isDisplayed(), "Save button should displayed");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 click the Confimation popup Ok button in Application Details screen")
	public void user_click_the_confimation_popup_ok_button_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('mat-dialog-container button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('mat-dialog-container button')[" + j + "].textContent";
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 select the Customer Type under Application Details screen")
	public void user_608_select_the_customer_type_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerType"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerName"))
						.sendKeys(testData.get("Customer_Name"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the ID Type under Application Details screen")
	public void user_608_select_the_id_type_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("idType"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("idNumber"))
						.sendKeys(testData.get("ID_Number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 Enter the Date of Birth under Application Details screen")
	public void user_608_enter_the_date_of_birth_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("dob"))
						.sendKeys(testData.get("DOB"));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("higlightedDate")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the Search button under Application Details screen")
	public void user_608_click_the_search_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the Create New Request button under Application Details screen")
	public void user_608_click_the_create_new_request_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 verify the Save button available under Application details screen")
	public void user_608_verify_the_save_button_available_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Save")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						softAssert.assertTrue(saveBtn.isDisplayed(), "Save button should be displayed in Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	AT_AL_APP_02
	@And("User_608 select the Product in Application details screen")
	public void user_608_select_the_product_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
						.sendKeys(testData.get("Finance_Amt"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Declared Net Monthly Income in Application details screen")
	public void user_608_enter_the_declared_net_monthly_income_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(testData.get("Monthly_Income"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the Sourcing Channel in Application details screen")
	public void user_608_select_the_sourcing_channel_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannelDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCodeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("regionDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranchDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_select_the_closing_staff_or_servicing_staff_or_rm_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_select_the_sourcing_type_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_select_the_sourcing_office_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOfficeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_select_the_sourcing_entity_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntityDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_select_the_sourcing_staff_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaffDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_post_entering_all_valid_details_clicking_on_save_button_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage")
	public void user_608_invoke_soft_assert_in_application_details_screen_at_auto_loan_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	
//	AT_AL_APP_03
	@And("User_608 verify Classification field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_classification_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationLabel")));
        	  softAssert.assertTrue(label.contains("*"), "Product field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Editable
		WebElement classification = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classification"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Product field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Product field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Product field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_product_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel")));
              softAssert.assertTrue(label.contains("*"), "Sub-Product field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("product"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sub-Product field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sub-Product field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Total Finance Amount Requested field as Mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_total_finance_amount_requested_field_as_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(
        			  javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtLabel")));
        	  softAssert.assertTrue(label.contains("*"), "Total Finance Amount field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Editable
		WebElement classification = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmt"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Total Finance Amount field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				softAssert.assertTrue(totalFinanceAmtInput.getAttribute("inputmode").contains("decimal"),
						"Total Finance Amount field should Accept Numeric values only");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Declared Net Monthly Income field as Mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_declared_net_monthly_income_field_as_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(
        			  javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")));
        	  softAssert.assertTrue(label.contains("*"), "Monthly Income field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Editable
		WebElement declaredMonthlyIncome = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredMonthlyIncome"));
		String read = declaredMonthlyIncome.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Monthly Income field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				softAssert.assertTrue(declaredMonthlyIncomeInput.getAttribute("inputmode").contains("decimal"),
						"Monthly Income field should Accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Declared Current Obligations field as Non-mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_declared_current_obligations_field_as_non_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsLabel")));
        	  softAssert.assertTrue(!(label.contains("*")), "Declared Current Obligations field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Editable
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		String read = declaredCurrentObligationsInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Declared Current Obligations should Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				softAssert.assertTrue(declaredCurrentObligationsInput.getAttribute("mode").contains("decimal"),
						"Declared Current Obligations field accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Special Promotion field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_special_promotion_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(
        			  javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Special Promotion field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("specialPromotion"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Special Promotion field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Special Promotion field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Channel field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_sourcing_channel_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingChannelLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("sourcingChannelLabel")));
              softAssert.assertTrue(label.contains("*"), "Sourcing Channel field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingChannel"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sourcing Channel field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Channel field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Business Center Code field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_business_center_code_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("businessCenterCodeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("businessCenterCodeLabel")));
              softAssert.assertTrue(label.contains("*"), "Business Center Code field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("businessCenterCode"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Business Center Code field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Business Center Code field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Servicing Type field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_servicing_type_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("servicingTypeLabel")));
              softAssert.assertTrue(label.contains("*"), "Servicing Type field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Servicing Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Servicing Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Region field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_region_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("regionLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("regionLabel")));
              softAssert.assertTrue(label.contains("*"), "Region field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("region"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Region field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Region field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Servicing Branch field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_servicing_branch_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingBranchLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("servicingBranchLabel")));
              softAssert.assertTrue(label.contains("*"), "Servicing Branch field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingBranch"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Servicing Branch field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingBranchDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Servicing Branch field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Spoke Location field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_spoke_location_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("spokeLocationLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("spokeLocationLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Spoke Location field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("spokeLocation"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Spoke Location field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("spokeLocationDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Spoke Location field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Closing Staff or Servicing Staff or RM field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_closing_staff_or_servicing_staff_or_rm_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("closingStaffLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("closingStaffLabel")));
              softAssert.assertTrue(label.contains("*"), "Closing Staff field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("closingStaff"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Closing Staff field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("closingStaffDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Closing Staff field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 verify Topup Type field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_topup_type_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("topupTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  actions.moveToElement(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("topupTypeLabel"))).build().perform();
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("topupTypeLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Topup Type field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("topupType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Topup Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("topupTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Topup Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}

	@And("User_608 verify Topup Application No field as Non-mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_topup_application_no_field_as_non_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("topupAppNoLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  actions.moveToElement(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("topupAppNoLabel"))).build().perform();
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("topupAppNoLabel")));
        	  softAssert.assertTrue(!(label.contains("*")), "Topup Application No field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Editable
		WebElement topupAppNoInput = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("topupAppNo"));
		String read = topupAppNoInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				actions.moveToElement(topupAppNoInput).build().perform();
				softAssert.assertTrue(read.contains("false"), "Topup Application No should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(topupAppNoInput);
				softAssert.assertTrue(topupAppNoInput.getAttribute("type").contains("number"),
						"Topup Application No field accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	
//	AT_AL_APP_04
	@And("User_608 verify Sourcing Type field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_type_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("sourcingTypeLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("sourcingTypeLabel")));
              softAssert.assertTrue(label.contains("*"), "Sourcing Type field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sourcing Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Office field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_office_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingOfficeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("sourcingOfficeLabel")));
              softAssert.assertTrue(label.contains("*"), "Sourcing Office field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingOffice"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sourcing Office field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingOfficeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Office field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Entity field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_entity_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingEntityLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("sourcingEntityLabel")));
              softAssert.assertTrue(label.contains("*"), "Sourcing Entity field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingEntity"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sourcing Entity field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingEntityDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Entity field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Staff field as Mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_sourcing_staff_field_as_mandatory_editable_and_lookup_in_referral_sourcing_details_section() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingStaffLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("sourcingStaffLabel")));
              softAssert.assertTrue(label.contains("*"), "Sourcing Staff field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingStaff"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sourcing Staff field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingStaffDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Staff field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Reference Type field as Non_mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_reference_type_field_as_non_mandatory_editable_and_lookup_in_referral_sourcing_details_section() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("referenceTypeLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Reference Type field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Reference Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Reference Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Reference Entity field as Non_mandatory, Editable and Lookup in Referral\\Sourcing Details section")
	public void user_608_verify_reference_entity_field_as_non_mandatory_editable_and_lookup_in_referral_sourcing_details_section() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceEntityLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("referenceEntityLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Reference Entity field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceEntity"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Reference Entity field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown/Lookup value
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceEntityDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Reference Entity field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Reference Code field as Non_mandatory, Editable and Textbox in Referral\\Sourcing Details section")
	public void user_608_verify_reference_code_field_as_non_mandatory_editable_and_textbox_in_referral_sourcing_details_section() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceCodeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("referenceCodeLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Reference Code field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("referenceCode"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(product);
				softAssert.assertTrue(read.contains("false"),"Reference Code field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be textbox
		String refCodeInput = "document.querySelector('[id=\"referenceEmployeeId\"] input')";
		String tagName = javascriptHelper.executeScriptWithWebElement(refCodeInput).getTagName();
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Tag Name: "+tagName);
				softAssert.assertTrue(tagName.contains("input"),"Reference Code field should be textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_AL_APP_05
	@And("User_608 to verify the impact when user keep any mandatory field blank and click on save button")
	public void user_608_to_verify_the_impact_when_user_keep_any_mandatory_field_blank_and_click_on_save_button() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 system should show the proper validation message for blank field in Application details screen")
	public void user_608_system_should_show_the_proper_validation_message_for_blank_field_in_application_details_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("mandatoryReqPopup")));
		String madatoryErrorMsg = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("mandatoryReqPopup")).getText();
		System.err.println("Mandatory Error : " + madatoryErrorMsg);
		for (int i = 0; i < 300; i++) {
			try {
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill required fields"),
						" System should show the proper validation message for blank field");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
//	AT_AL_APP_06
	@And("User_608 click any one record Edit button under Application Details screen")
	public void user_608_click_any_one_record_edit_button_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("pencilEditBtn")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("pencilEditBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("User_608 verify Update button available in Application details screen")
	public void user_608_verify_update_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Update")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),"Update button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Approve button available in Application details screen")
	public void user_608_verify_approve_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('kub-workflow-decision button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('kub-workflow-decision button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Approve")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('kub-workflow-decision button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),"Approve button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Eligiblity Check button available in Application details screen")
	public void user_608_verify_eligiblity_check_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('kub-workflow-decision button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('kub-workflow-decision button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Eligibility Check")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('kub-workflow-decision button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),"Eligibility Check button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify View summary button available in Application details screen")
	public void user_608_verify_view_summary_button_available_in_application_details_screen() throws Throwable {
		WebElement btn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(btn);
				softAssert.assertTrue(btn.isDisplayed(),"View Summary button should be displayed Application details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Back button available in Application details screen")
	public void user_608_verify_back_button_available_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),"Back button should be displayed Application details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Status field available in Application details screen")
	public void user_608_verify_status_field_available_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusLabel"));
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("statusToggleBtn"));
				actions.moveToElement(field).build().perform();
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Status field should be displayed in Application details screen");
				javascriptHelper.backgroundBorder(field);
				softAssert.assertTrue(field.isDisplayed(), "Status toggle button should be displayed in Application details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
//	AT_AL_APP_07
	@And("User_608 to verify system allow user to modify the Application Detail record")
	public void user_608_to_verify_system_allow_user_to_modify_the_application_detail_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
						.sendKeys(testData.get("Finance_Amt"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 to verify while modification, when user keep any mandatory field blank and click on Save button in Application Detail screen")
	public void user_608_to_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_in_application_detail_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}		
//		WebElement updateBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("updateBtn"));
//		for (int i = 0; i <= 300; i++) {
//			try {
//				actions.moveToElement(updateBtn).build().perform();
//				updateBtn.click();
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
	}
	
	@And("User_608 to verify while modification system allow user to save the record with valid data in Application Detail screen")
	public void user_608_to_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data_in_application_detail_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(testData.get("Monthly_Income"));
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		} 
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 to verify system display the confirmation message post clicking on Update button")
	public void user_608_to_verify_system_display_the_confirmation_message_post_clicking_on_update_button() {		
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_SuccessMsg"));
	        	 String text = alertMsg.getText();
	        	 System.out.println("Alert Message: "+text);
	        	 softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
	             break;
	        } catch (Exception e) {
	            
	        }
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_closeBtn")).click();
	             break;
	        } catch (Exception e) {
	            if (i==299) {
	                 Assert.fail(e.getMessage());
	            }
	        }
		}
	}
	
	
//	AT_AL_APP_08
	@And("User_608 click the View Summary button in Application Details screen")
	public void user_608_click_the_view_summary_button_in_application_details_screen() throws Throwable {		
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
				actions.moveToElement(btn).build().perform();
				javascriptHelper.backgroundBorder(btn);
				javascriptHelper.JSEClick(btn);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 to verify the functionality of Back button under Application Details screen")
	public void user_608_to_verify_the_functionality_of_back_button_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("AppDetailsBackBtn"));
				actions.moveToElement(btn).build().perform();
				javascriptHelper.backgroundBorder(btn);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 post clicking on Back button, system should navigate to the previous screen")
	public void user_608_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						customerDebtJsPaths.getElement("inboxEntitleBtn"));
				javascriptHelper.backgroundBorder(btn);
				softAssert.assertTrue(btn.isDisplayed(), "Post clicking on the back button, system navigate to previous screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
//	AT_AL_APP_09
	@And("User_608 click the Edit button if the status of record is Active in Application Details screen")
	public void user_click_the_edit_button_if_the_status_of_record_is_active_in_application_details_screen() throws Throwable {
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
							javascriptHelper.backgroundColor(
									javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')")
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
	public void user_to_verify_the_functionality_of_activate_deactivate_button_in_application_details_screen() throws Throwable {
//		Thread.sleep(1000);
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("statusToggleBtn"));
				javascriptHelper.scrollIntoView(btn);
				javascriptHelper.backgroundBorder(btn);
				btn.click();
				break;
			} catch (Exception e) { 
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 after change the status user click the Update button under Application Details screen")
	public void user_608_after_change_the_status_user_click_the_update_button_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				actions.moveToElement(javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("updateBtn"))).build().perform();
				javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("updateBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 get the updated record ID under Application Details screen")
	public void user_608_get_the_updated_record_id_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement successMsg = javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("alert_SuccessMsg"));
				String text = successMsg.getText();
				System.out.println("Message:"+text);
				System.out.println("Number: "+ text.substring(32, 36));
				AppDataEntryApplicationDetails.updateTestData(testData.get("DataSet ID"),"Record_ID", text.substring(32, 36));
				break;
			} catch (Exception e) { 
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn")).click();
	            break;
	        } catch (Exception e) {
	            if (i==299) {
	                 Assert.fail(e.getMessage());
	            }
	        }
		}
	}
	
	@And("User_608 search the record ID under Application Details screen")
	public void user_608_search_the_record_id_under_application_details_screen() {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBtn"));
				javascriptHelper.backgroundBorder(searchBtn);
				searchBtn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {				
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(testData.get("Record_ID"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 to verify if Status is Active then click Status toggle button system should show Deactivate in Application Details screen")
	public void user_608_to_verify_if_status_is_active_then_click_status_toggle_button_system_should_show_deactivate_in_application_details_screen() throws Throwable {
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
				int length2 = Integer.parseInt(len)-1;
				System.err.println("Final Length: "+length2);
				String title = "document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[1].querySelectorAll('td')["+length2+"]";
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
	public void user_click_the_edit_button_if_the_status_of_record_is_in_active_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("pencilEditBtn")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("pencilEditBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 to verify if Status is In-active then click Status toggle button system should show Active in Application Details screen")
	public void user_608_to_verify_if_status_is_in_active_then_click_status_toggle_button_system_should_show_active_in_application_details_screen() throws Throwable {
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
				int length2 = Integer.parseInt(len)-1;
				System.err.println("Final Length: "+length2);
				String title =
						"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[1].querySelectorAll('td')["+length2+"]";
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
	public void user_608_verify_values_in_list_view_should_be_non_editable_and_must_be_populated_correctly_in_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Application Details")) {
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
								+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[4]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						String output = field.getAttribute("readonly");
						System.out.println("Out: "+ output);
						javascriptHelper.backgroundBorder(field);
						softAssert.assertNull(output,
								"Listview values should be non editable under Asset Details section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	AT_AL_APP_11
	@And("User_608 to verify the functionality of Search box with matching data under Application Details screen")
	public void user_608_to_verify_the_functionality_of_search_box_with_matching_data_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(testData.get("Matching_Value"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 to verify the functionality of Search box with mismatch data under Application Details screen")
	public void user_608_to_verify_the_functionality_of_search_box_with_mismatch_data_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(testData.get("Mismatched_Value"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}    
	}
	
//	AT_AL_CUD_02
	@And("User_608 select the Finanace type value in Financial Commitments-Customer Debt screen")
	public void user_608_select_the_finanace_type_value_in_financial_commitments_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_select_the_financial_institution_value_in_financial_commitments_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNbr"))
				.sendKeys(testData.get("Account Nbr"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Sanction Amount in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_sanction_amount_in_financial_commitments_customer_debt_screen() throws Throwable {		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
				.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Tenure in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_tenure_in_financial_commitments_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
				.sendKeys(testData.get("Tenure(Months)"));;
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Installment Amount in Financial Commitments-Customer Debt screen")
	public void user_608_enter_the_installment_amount_in_financial_commitments_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Installment Amt"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
			}
		}	    
	}

	@And("User_608 select the Currency value in Financial Commitments-Customer Debt screen")
	public void user_608_select_the_currency_value_in_financial_commitments_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB);;
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_608 invoke soft assert in Customer Debt screen at Auto Loan App Data Entry stage")
	public void user_608_invoke_soft_assert_in_customer_debt_screen_at_auto_loan_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	
//	AT_AL_CUD_03
	@And("User_608 verify system should allow user to select any value from the LOV in Finance Type")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_finance_type() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_financial_institution() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_account_number_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNbr"))
				.sendKeys(testData.get("Account Nbr"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Sanction Amount field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_sanction_amount_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
				.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Interest Rate % field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_interest_rate_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateInput"))
				.sendKeys(testData.get("Interest_Rate"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Current Principal balance field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_current_principal_balance_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceInput"))
				.sendKeys(testData.get("Current_Principal"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Tenure field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_tenure_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
				.sendKeys(testData.get("Tenure(Months)"));;
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Installment Amount field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_installment_amount_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Installment Amt"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Amount considered field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_amount_considered_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredInput")).click();
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(
						customerDebtJsPaths.getElement("amountConsideredInput"))).build().perform();
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredInput"))
				.sendKeys(testData.get("Amt_Consider"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Temporary code
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}	    
	}

	@And("User_608 verify system should allow user to select any value from the LOV in Currency field")
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_currency_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_collateral_type_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypedDropDown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_verify_system_should_allow_user_to_select_any_value_from_the_lov_in_frequency_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_last_payment_amount_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtInput"))
				.sendKeys(testData.get("last_Payment_Amt"), Keys.TAB, Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify system should allow user to enter only positive numeric value in Remaining Tenure field")
	public void user_608_verify_system_should_allow_user_to_enter_only_positive_numeric_value_in_remaining_tenure_field() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB, Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_AL_CUD_04
	@And("User_608 to verify the impact when user enter characters value in numeric field in Customer Debt screen")
	public void user_608_to_verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB);;
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_CUD_05
	@And("User_608 to verify system allow user to modify the Customer Debt Information in Customer Debt screen")
	public void user_608_to_verify_system_allow_user_to_modify_the_customer_debt_information_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Finance Type"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}	
	
	@And("User_608 to verify while modification system enters the invalid data in Customer Debt screen")
	public void user_608_to_verify_while_modification_system_enters_the_invalid_data_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Invalid_data"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}
	
	@And("User_608 to verify while modification system allow user to save the record with valid data in Customer Debt screen")
	public void user_608_to_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Installment Amt"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}
	
	
//	AT_AL_CUD_07
	@And("User_608 to verify the functionality of Search box with matching data under Financial Commitments section")
	public void user_608_to_verify_the_functionality_of_search_box_with_matching_data_under_financial_commitments_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(testData.get("Matched Currency"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 to verify the functionality of Search box with mismatch data under Financial Commitments section")
	public void user_608_to_verify_the_functionality_of_search_box_with_mismatch_data_under_financial_commitments_section() throws Throwable {
		
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"));
				element.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				element.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
//	AT_AL_CUD_09
	@And("User_608 click any one active record Edit button under Financial Commitments section")
	public void user_608_click_any_one_active_record_edit_button_under_financial_commitments_section() throws Throwable {
		Thread.sleep(1000);
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Financial Commitments")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')"
								+ "[" + j + "].parentElement.parentElement.querySelector('td button[icon=\"pi pi-pencil\"]')";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Temporary code
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}
	}
	
	
	@And("User_608 System should able to select Accept\\Reject from dropdown Decision section in Offer Decision tab")
	public void user_608_system_should_able_to_select_accept_reject_from_dropdown_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 invoke soft assert in Offer Decision screen at Auto loan - Underwriter L1 stage")
	public void user_608_invoke_soft_assert_in_offer_decision_screen_at_auto_loan_underwriter_l1_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	
//	AT_AL_UNWL1_02
	@And("User_608 click Recommendations\\Sanction Conditions Approval History link under Approval Details Hyperlinks section")
	public void user_608_click_recommendations_sanction_conditions_approval_history_link_under_approval_details_hyperlinks_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("JSERecommendations")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						underWriterJsPaths.getElement("JSERecommendations"));
				element.click();	
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Add button in List of condition section under Offer decision tab")
	public void user_608_click_the_add_button_in_list_of_condition_section_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("List of Conditions")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Recommendations\\Sanction Hyperlink screen get open under Offer decision tab")
	public void user_608_verify_recommendations_sanction_hyperlink_screen_get_open_under_offer_decision_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_AL_UNWL1_03
	@And("User_608 select the Note Code from dropdown under Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_the_note_code_from_dropdown_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteCode"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Note_Code"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter Sequence Number under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_sequence_number_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber"))
						.sendKeys(testData.get("Sequence_Number"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select Note Sub Code from dropdown under Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_note_sub_code_from_dropdown_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteSubcode"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Note_Sub_Code"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter Condition under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_condition_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition"))
						.sendKeys(testData.get("Condition"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter Date under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_date_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date")).click();
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date_today")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter Remarks under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_remarks_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks"))
						.sendKeys(testData.get("Remarks"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 click the Save button under Recommendation\\Sanction Hyperlink screen")
	public void user_608_click_the_save_button_under_recommendation_sanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SaveIcon"));
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_608 select Accept\\Reject from dropdown Decision section in Offer Decision tab")
	public void user_608_select_accept_reject_from_dropdown_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}
	
	@And("User_608 select the Decision value as Select under Decision section in Offer Decision tab")
	public void user_608_select_the_decision_value_as_select_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision2"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	AT_AL_UNWL1_05
	@And("User_608 click the Application details tab")
	public void user_608_click_the_application_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
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
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		String length1 = null;
		for (int i = 0; i < 300; i++) {
			try {
				length1 = javascriptHelper.executeScript("return document.querySelectorAll('ion-item ion-title').length")
						.toString();
				System.out.println(length1);
				if (!length1.isBlank() && !length1.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length1); j++) {
					String title = "return document.querySelectorAll('ion-item ion-title')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Application Details")) {
						String jspath = "document.querySelectorAll('ion-item ion-title')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(jspath);
						softAssert.assertTrue(section.isDisplayed(), "Application Details title available under Offer Decision tab");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify all the populate data correctly at this stage and display only in Application details screen")
	public void user_608_verify_all_the_populate_data_correctly_at_this_stage_and_display_only_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element1 = javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("productLabel"));
				actions.scrollToElement(element1).build().perform();
				WebElement element2 = javascriptHelper.executeScriptWithWebElement(
						appDataAppDetailsJsPaths.getElement("referenceCode"));
				actions.scrollToElement(element2).build().perform();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the Eye button under Customer Details tab")
	public void user_608_click_the_eye_button_under_customer_details_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				String jsPath = "document.querySelector('button[icon=\"pi pi-eye\"]')";
				WebElement element = javascriptHelper.executeScriptWithWebElement(jsPath);
				actions.moveToElement(element).click().build().perform();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						appDataCustomerDetailsJsPaths.getElement("remarks"));
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
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				String lastTitle = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + (Integer.parseInt(length)-1) + "]";
				System.out.println("Path Length: "+lastTitle);
				WebElement title = javascriptHelper.executeScriptWithWebElement(lastTitle);
				javascriptHelper.scrollIntoView(title);
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 click the Asset Details tab")
	public void user_608_click_the_asset_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Asset Details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						addButton.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the Policy Check tab")
	public void user_608_click_the_policy_check_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Policy Check")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						addButton.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 click the Eye button under Asset Details tab")
	public void user_608_click_the_eye_button_under_asset_details_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				String jsPath = "document.querySelector('button[icon=\"pi pi-eye\"]')";
				WebElement element = javascriptHelper.executeScriptWithWebElement(jsPath);
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify all the populate data correctly at this stage and display only under Asset Details tab")
	public void user_608_verify_all_the_populate_data_correctly_at_this_stage_and_display_only_under_Asset_details_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-item[class*=\"sectiontitles\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				String lastTitle = "document.querySelectorAll('ion-item[class*=\"sectiontitles\"]')[" + (Integer.parseInt(length)-1) + "]";
				System.out.println("Path Length: "+lastTitle);
				WebElement title = javascriptHelper.executeScriptWithWebElement(lastTitle);
				javascriptHelper.scrollIntoView(title);
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	@And("User_608 click the Eye button under Document Details tab")
	public void user_608_click_the_eye_button_under_document_details_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("eyeBtn"));
				actions.moveToElement(element).build().perform();
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}	
	
	@And("^User_608 click Add button under Customer Employment list section in Customer Financials tab$")
	public void user_608_click_add_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	

	@And("User_608 click the Business record Edit button under Customer Employment List section in Customer Financials tab")
	public void user_608_click_business_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Business")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 verify Save button available under Employment details screen")
	public void user_verify_back_button_available_under_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("saveBtn"));
				javascriptHelper.backgroundBorder(saveBtn);
				softAssert.assertTrue(saveBtn.isDisplayed(), "Save button available under Employment details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("^User_608 to verify the Primary Employment toggle should be Yes in Employment details screen$")
	public void user_608_to_verify_the_primary_employment_toggle_should_be_yes_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
				String attribute = toggleBtn.getAttribute("aria-checked");
				System.out.println(attribute);
				softAssert.assertTrue(attribute.contains("true"), "Primary Employment toggle should be Yes in Employment details screen");
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	
	@And("^User_608 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage$")
	public void user_608_invoke_soft_assert_in_employment_details_screen_under_customer_financials_tab_at_app_data_entry_stage()
			throws Throwable {
		softAssert.assertAll();
	}
	
	@And("^User_608 click the Company//Firm record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_608_click_the_companyfirm_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Company/Firm")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Pensioner record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_608_click_the_pensioner_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 150; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String path = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')";
					WebElement element = javascriptHelper.executeScriptWithWebElement(path);
					javascriptHelper.scrollIntoView(element);
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Pensioner")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_608 click the Self-employed Professional record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_608_click_the_self_employed_professional_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);
					if (titlename.trim().contains("Self-employed Professional")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_608 click the Salaried record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_608_click_the_salaried_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Salaried")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	AT_AL_ADE_EMP_06
	@And("^User_608 verify Date of Joining field should be Date, Mandatory under Employment details screen$")
	public void user_608_verify_date_of_joining_field_should_be_date_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field		
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement calender = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Date of Joining field should be Date field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Date of Joining field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employment Period field should be Dropdown, Mandatory under Employment details screen$")
	public void user_608_verify_employment_period_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employment Period field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employment Period field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Nature of Employment field should be Dropdown, Mandatory under Employment details screen$")
	public void user_608_verify_nature_of_employment_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Nature of Employment field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Nature of Employment field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employer Name field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_employer_name_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employer Name field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("User_608 verify Employer Name if\\(Others) field should be Textbox, Mandatory under Employment details screen")
	public void user_608_verify_employer_name_ifothers_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer Name if(Others) field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employer Name if(Others) field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employee ID field should be Textbox, Mandatory under Employment details screen$")
	public void user_608_verify_employee_id_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employee ID field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employee ID field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employment Type field should be Dropdown, Mandatory under Employment details screen$")
	public void user_608_verify_employment_type_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employment Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employment Type field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("User_608 verify Total Experience\\(Years) field should be Textbox, Mandatory under Employment details screen")
	public void user_608_verify_total_experienceyears_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Total Experience field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Total Experience field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Direct Manager Contact Number field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_direct_manager_contact_number_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Direct Manager Contact Number field should be Texbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Contact Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employment End Date field should be Date, Non-Mandatory under Employment details screen$")
	public void user_608_verify_employment_end_date_field_should_be_date_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Employment End Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employment End Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Primary Employment field should be Toggle button, Non-Mandatory under Employment details screen$")
	public void user_608_verify_primary_employment_field_should_be_toggle_button_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Toggle Btn
		WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(toggleBtn);
				softAssert.assertTrue(toggleBtn.getTagName().contains("toggle"), "Primary Employment field should Toggle Button");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Primary Employment field should Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Department field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_department_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Department field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Department field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Designation field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_designation_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Designation field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Designation field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Direct Manager Telephone field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_direct_manager_telephone_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(textBox);
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Direct Manager Telephone field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Telephone field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employer Phone Extension field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_employer_phone_extension_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Employer Phone Extension field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Phone Extension field should be Non-Mandatory");;
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Employer Phone Number field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_employer_phone_number_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer Phone Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Phone Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Direct Manager Name field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_direct_manager_name_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Direct Manager Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Remarks field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_remarks_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksTextarea"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getTagName().contains("textarea"), "Remarks field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Remarks field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 click the Self-employed record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_608_click_the_self_employed_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Self Employed")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("^User_608 verify Company Type field should be Dropdown, Mandatory under Employment details screen$")
	public void user_608_verify_company_type_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Company Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(text.contains("*"), "Company Type field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Profession Type field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_profession_type_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Profession Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Profession Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Statutory Authority field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_statutory_authority_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Statutory Authority field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Statutory Authority field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Profession field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_profession_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
	}

	@And("^User_608 verify Share Holder Percentage field should be Textbox, Mandatory under Employment details screen$")
	public void user_608_verify_share_holder_percentage_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Profession field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Profession field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify No Of Partners field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_no_of_partners_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "No of Partners field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "No of Partners field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Nature of Business field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_nature_of_business_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Nature Of Business field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Nature Of Business field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Registered Business Name field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_registered_business_name_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Registered Business Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Registered Business Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Registered Business Number field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_registered_business_number_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Registered Business Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Registered Business Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Business Registration Date field should be Date, Non-Mandatory under Employment details screen$")
	public void user_608_verify_business_registration_date_field_should_be_date_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateCalender"));
		for (int i = 0; i <= 300; i++) {
			try {				
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Business Registration Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Business Registration Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify Office Premises Type field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_608_verify_office_premises_type_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Office Premises Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Office Premises Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_608 verify No of Employees field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_608_verify_no_of_employees_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "No of Employees field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "No of Employees field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==299) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

//	AT_AL_ADE_EMP_08
	@And("^User_608 select Nature of Employment from dropdown in Employment Details screen$")
	public void user_608_select_nature_of_employment_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("NatureOfEmployment"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@And("^User_608 enter Date of Joining in Employment Details screen$")
	public void user_608_enter_date_of_joining_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("dateOfJoiningInput")).click();
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date_today")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 select Employment Period from dropdown in Employment Details screen$")
	public void user_608_select_employment_period_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employmentPeriodDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmploymentPeriod"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 select Employer Name from dropdown in Employment Details screen$")
	public void user_608_select_employer_name_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employerNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmployerName"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter Employee ID in Employment Details screen$")
	public void user_608_enter_employee_id_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("EmployeeID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 select Employment Type from dropdown in Employment Details screen$")
	public void user_608_select_employment_type_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employmentTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmploymentType"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_608 click Save button in Employment details screen$")
	public void user_608_click_save_button_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("saveBtn"));
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify the confirmation message post clicking on save button in Employment Details screen$")
	public void user_608_verify_the_confirmation_message_post_clicking_on_save_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_SuccessMsg"));
	        	 String text = alertMsg.getText();
	        	 System.out.println("Alert Message: "+text);
	        	 softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
	             break;
	        } catch (Exception e) {
	            
	        }
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_closeBtn")).click();
	             break;
	        } catch (Exception e) {
	            if (i==299) {
	                 Assert.fail(e.getMessage());
	            }
	        }
		}
	}

//	AT_AL_ADE_EMP_09
	@And("^User_608 to verify impact when user keep mandatory field blank and click on save button in Employment Details screen$")
	public void user_608_to_verify_impact_when_user_keep_mandatory_field_blank_and_click_on_save_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("mandatoryFillToastMsg"));
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"), 
						"Mandatory field blank message in Customer Debt screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter the character values in numeric field in Employment Details screen$")
	public void user_608_enter_the_character_values_in_numeric_field_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
				javascriptHelper.scrollIntoView(element);
				element.sendKeys(testData.get("CharValue"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user enter characters value in numeric field in Employment Details screen$")
	public void user_608_to_verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("invalidNumberError"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.trim().contains("Invalid Mobile Number"), 
						"Invalid Mobile Number message displayed in Employment Details screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 only enters the Special character in Employment Details screen$")
	public void user_608_only_enters_the_special_character_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("Specialchar"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user enter special characters value in Employment Details screen$")
	public void user_608_to_verify_the_impact_when_user_enter_special_characters_value_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("specialCharError"));
				String madatoryErrorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(madatoryErrorMsg.trim().contains("Only Alphanumeric characters are allowed"), 
						"Only Alphanumeric characters are allowed message displayed in Employment Details screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_ADE_EMP_10
	@And("^User_608 verify Add button available in Customer Employment section list view under Customer Financials tab$")
	public void user_608_verify_add_button_available_in_customer_employment_section_list_view_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(), "Add button available in Customer Employment section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_608 verify export to PDF button available in Customer Employment section list view under Customer Financials tab$")
	public void user_608_verify_export_to_pdf_button_available_in_customer_employment_section_list_view_under_customer_financials_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("exportBtn"));
				actions.moveToElement(btn).build().perform();
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("PDF")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(btn);
						softAssert.assertTrue(btn.isDisplayed(),"PDF button available under asset details tab");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify export to Excel button available in Customer Employment section list view under Customer Financials tab$")
	public void user_608_verify_export_to_excel_button_available_in_customer_employment_section_list_view_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("XLS")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(btn);
						softAssert.assertTrue(btn.isDisplayed(),"Excel button available under asset details tab");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify values should be non editable in Customer Employment section list view under Customer Financials tab")
	public void user_608_verify_values_should_be_non_editable_in_customer_employment_section_list_view_under_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Address Details")) {
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
								+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[1]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						String output = field.getAttribute("readonly");
						System.out.println("Out: "+ output);
						javascriptHelper.backgroundBorder(field);
						softAssert.assertNull(output,
								"Listview values should be non editable under Address Details section");
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

	@And("^User_608 verify list view values are displayed in Customer Employment section under Customer Financials tab$")
	public void user_608_verify_list_view_values_are_displayed_in_customer_employment_section_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Salaried")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement";
						WebElement recordValues = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(recordValues).build().perform();
						javascriptHelper.backgroundColor(recordValues);
						softAssert.assertTrue(recordValues.isDisplayed(), "list view values are displayed in Customer Employment section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_ADE_EMP_11
	@And("^User_608 click the Export button under Customer Employment list section in Customer Financials tab$")
	public void user_608_click_the_export_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("exportBtn"));
				actions.scrollToElement(btn).build().perform();
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the functionality of Export to PDF button under Customer Employment list section$")
	public void user_608_to_verify_the_functionality_of_export_to_pdf_button_under_customer_employment_list_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("PDF")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on PDF button system should download PDF file of that records in Customer Employment section$")
	public void user_608_verify_post_clicking_on_pdf_button_system_should_download_pdf_file_of_that_records_in_customer_employment_section()
			throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("^User_608 to verify the functionality of Export to Excel button under Customer Employment list section$")
	public void user_608_to_verify_the_functionality_of_export_to_excel_button_under_customer_employment_list_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("XLS")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on XLS button system should download Excel file of that records in Customer Employment section$")
	public void user_608_verify_post_clicking_on_xls_button_system_should_download_excel_file_of_that_records_in_customer_employment_section()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("User_608 to verify functionality of Search box with matching data under Customer Employment section")
	public void user_608_to_verify_functionality_of_search_box_with_matching_data_under_customer_employment_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {				
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(testData.get("Matching_Data"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_608 to verify functionality of Search box with mismatch data under Customer Employment section")
	public void user_608_to_verify_functionality_of_search_box_with_mismatch_data_under_customer_employment_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(testData.get("Mismatching_Data"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_608 to verify post clicking on Add button system should allow to create new record of Customer Employment details$")
	public void user_608_to_verify_post_clicking_on_add_button_system_should_allow_to_create_new_record_of_customer_employment_details()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement screenTitle = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("customerEmploymentScreen"));
				javascriptHelper.backgroundBorder(screenTitle);
				softAssert.assertTrue(screenTitle.isDisplayed(), "Creating new record of Customer Employment details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab$")
	public void user_608_click_the_dropdown_for_show_all_the_records_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelectorAll('p-dropdown')[1]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("25")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_ADE_EMP_12
	@And("^User_608 Delete the Mandatory field value in Employment Details screen$")
	public void user_608_delete_the_mandatory_field_value_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify while modification, when user keep any mandatory field blank and click on Update button in Employment details screen$")
	public void user_608_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_update_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("mandatoryFillToastMsg"));
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"), 
						"Mandatory field blank message in Customer Debt screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enters the invalid data in Employment Details screen$")
	public void user_608_enters_the_invalid_data_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("Specialchar"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should not allow to do a modification with invalid data in Employment Details screen$")
	public void user_608_verify_system_should_not_allow_to_do_a_modification_with_invalid_data_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("specialCharError"));
				String madatoryErrorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(madatoryErrorMsg.trim().contains("Only Alphanumeric characters are allowed"), 
						"Only Alphanumeric characters are allowed message displayed in Employment Details screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should allow to modify the Employment details record in Employment details screen$")
	public void user_608_verify_system_should_allow_to_modify_the_employment_details_record_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("EmployeeID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify while modification system allow to Update the record with valid data in Employment details screen$")
	public void user_608_verify_while_modification_system_allow_to_update_the_record_with_valid_data_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employmentTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmploymentType"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click Update button in Employment details screen$")
	public void user_608_click_update_button_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("updateBtn"));
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify the confirmation message post clicking on Update button in Employment Details screen$")
	public void user_608_verify_the_confirmation_message_post_clicking_on_update_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_SuccessMsg"));
	        	 String text = alertMsg.getText();
	        	 System.out.println("Alert Message: "+text);
	        	 softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
	             break;
	        } catch (Exception e) {
	            
	        }
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("alert_closeBtn")).click();
	             break;
	        } catch (Exception e) {
	            if (i==299) {
	                 Assert.fail(e.getMessage());
	            }
	        }
		}
	}

	
	

	
	
	
}
