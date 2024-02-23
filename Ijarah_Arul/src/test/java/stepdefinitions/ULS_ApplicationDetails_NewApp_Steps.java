package stepdefinitions;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ULS_ApplicationDetails_NewApp_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String applicationDetailsExcelDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths CommonJsElements = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths customerSearchJSPaths = new JSPaths(excelFilePathForJS, "customer_search_JS",
			"Ijarah_customer_search_fieldName", "JSPath");
	JSPaths applicationDetailsElements = new JSPaths(excelFilePathForJS, "newApp_AppllicationDetailsJS",
			"Ijarah_NewApp_fieldName", "JSPath");
	Robot robot;
	BrowserHelper browserHelper = new BrowserHelper(driver);

	ExcelData personalLoanApplicationDetailsExecelData = new ExcelData(applicationDetailsExcelDataPath,
			"PL_AppDetails_NewAPP_TestData", "Dataset ID");

	ExcelData personalExecutionSheet = new ExcelData(applicationDetailsExcelDataPath, "PersonalLoanExecution",
			"TestCase ID");
	IjaraLogin ijaraLogin = new IjaraLogin();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> newApplicationTestData = new HashMap<>();
	Map<String, String> newApplicationExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String toastMessage = "";
	SoftAssert softAssert = new SoftAssert();
	SoftAssert updateSoftAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";
	String recordStatus = "";
	String listViewRecordStatus = "";
	
	
	@And("login with valid credentials for new application stage")
	public void login_with_valid_credentials_for_new_application_stage() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType08");
	}

	@And("^user_076 get the test data for test case id AT_PL_NewApp_01$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_01() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_01");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case id AT_PL_NewApp_02$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_02() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_02");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case id AT_PL_NewApp_03$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_03() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_03");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case id AT_PL_NewApp_04$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_04() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_04");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case id AT_PL_NewApp_05$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_05() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_05");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case id AT_PL_NewApp_06$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_06() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_05");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_07$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_07() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_07");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_08$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_08() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_08");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_09$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_09() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_09");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_10$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_10() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_10");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_11$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_11() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_11");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_12$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_12() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_12");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_13$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_13() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_12");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_14$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_14() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_12");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_15$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_15() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_12");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}
	@And("^user_076 get the test data for test case id AT_PL_NewApp_16$")
	public void user_076_get_the_test_data_for_test_case_id_at_pl_newapp_16() throws Throwable {
		newApplicationExecutionData = personalExecutionSheet.getTestdata("AT_PL_NewApp_12");
		System.out.println(newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = personalLoanApplicationDetailsExecelData
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("click on module dropdown in IJRARAH")
	public void click_on_module_dropdown_in_ijrarah() throws Throwable {
		String moduleName = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleName = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("module_dropdown") + ".textContent")
						.toString();
				System.out.println("Module Name " + moduleName);
				if ((!moduleName.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("module_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on LOS option in module dropdown")
	public void click_on_los_option_in_module_dropdown() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isEmpty()) && !(moduleLength.equalsIgnoreCase("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		boolean isSelectedModuleClicked = false;
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 100; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
						isSelectedModuleClicked = true;
						break;
					} else if (!(moduleName.equalsIgnoreCase("LOS"))) {
						System.out.println("Inside else if condition");
						isSelectedModuleClicked = false;
						break;
					}

				} catch (Exception e) {

				}
			}
			if (isSelectedModuleClicked == true) {
				break;
			}
		}

	}

	@And("click on mail box")
	public void click_on_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					System.out.println(commonJSPaths.getElement("mail_box"));
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search box upon click on the mail box")
	public void click_on_search_box_upon_click_on_the_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search text box upon click the search button")
	public void click_on_search_text_box_upon_click_the_search_button() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on menu bar in uls transaction screen")
	public void user_076ser_click_on_menu_bar_in_uls_transaction_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("menu_bar")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on transactions module")
	public void user_076ser_click_on_transactions_module() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("transaction_main_module"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on applicationn manager feature")
	public void user_076ser_click_on_applicationn_manager_feature() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("application_manager_module"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 search the new application stage record reference number for application details record")
	public void user_076_search_the_new_application_stage_record_reference_number_for_application_details_record() {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				System.out.println("Record reference number " + newApplicationTestData.get("record_reference_number"));
				searchTextBox.sendKeys(newApplicationTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 select the new application stage record from mail box for application details record")
	public void user_076_select_the_new_application_stage_record_from_mail_box_for_application_details_record() {

		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 80; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		System.out.println("Mail box Record " + premitiveNumberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 80; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					if (recordRefNumber.equals(newApplicationTestData.get("record_reference_number"))) {
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
						// document.querySelectorAll('button[icon="pi pi-user-edit"]')[0]

						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]")
								.click();
						break;
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("user_076 click on application details screen temp view")
	public void user_076ser_click_on_application_details_screen_temp_view() throws Throwable {
		String noOfModule = "";
		int labelLocation = 0;
		String moduleName = "";
		String applicationModuleLengthQuery = "document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item ion-list ion-item ion-label').length";
		for (int i = 0; i <= 300; i++) {
			try {
				noOfModule = javascriptHelper.executeScript("return " + applicationModuleLengthQuery).toString();
				if (!(noOfModule.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		System.out.println("Module Length " + noOfModule);
		int primitiveModuleLength = Integer.parseInt(noOfModule);

		for (int i = 0; i <= primitiveModuleLength; i++) {
			try {
				moduleName = javascriptHelper.executeScript("return "
						+ "document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item ion-list ion-item ion-label')["
						+ i + "].innerText").toString();
				if (moduleName.equalsIgnoreCase("Application Details")) {
					labelLocation = i;
					break;
				}

			} catch (Exception e) {
				if (i == primitiveModuleLength) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item ion-list ion-item ion-button')["
								+ labelLocation + "]")
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getLocalizedMessage());
				}
			}
		}

	}

	@And("user_076 search the new application stage record reference number")
	public void user_076_search_the_new_application_stage_record_reference_number() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(newApplicationTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on save button while open the application details record")
	public void user_076_click_on_save_button_while_open_the_application_details_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				if (i > 150) {
					javascriptHelper.JSEClick(
							javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")));
					break;
				}
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on add button of application details record")
	public void user_076_click_on_add_button_of_application_details_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_add_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen select the customer type")
	public void user_076_in_customer_search_screen_select_the_customer_type() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("customer_type"));
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("customer_type").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "customer_type")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

	}

	@And("user_076 in customer search screen enter customer name")
	public void user_076_in_customer_search_screen_enter_customer_name() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_name_input"))
						.sendKeys(newApplicationTestData.get("customer_name"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user_076 click on customer details tab in new app stage")
	public void user_076_click_on_customer_details_tab_in_new_app_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_details_tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user_076 click on add button in customer details screen")
	public void user_076_click_on_add_button_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.clickUsingActionClass(
						javascriptHelper.executeScriptWithWebElement(
								customerSearchJSPaths.getElement("customerDetails_AddButton")),
						javascriptHelper.executeScriptWithWebElement(
								customerSearchJSPaths.getElement("customerDetails_AddButton")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("user_076 click on save button in customer details screen")
	public void user_076_click_on_save_button_in_customer_details_screen() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {

				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("user_076 verify customer details record got saved")
	public void user_076_verify_customer_details_record_got_saved() throws Throwable {
		String saveSuccessMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveSuccessMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (!(saveSuccessMessage.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveSuccessMessage);
		Assert.assertTrue(saveSuccessMessage.contains("Success! Record created with ID"));
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						CommonJsElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in custommer search screen select ID type")
	public void user_076_in_custommer_search_screen_select_id_type() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("id_type"));
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " + newApplicationTestData.get("id_type").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "id_type")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */
	}

	@And("user_076 in customer search screen enter id number")
	public void user_076_in_customer_search_screen_enter_id_number() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_number_input"))
						.sendKeys(newApplicationTestData.get("id_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen enter date of birth of the customer")
	public void user_076_in_customer_search_screen_enter_date_of_birth_of_the_customer() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_of_birth_calendar_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_of_birth_calendar_input"))
						.sendKeys(newApplicationTestData.get("date_of_birth"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(customerSearchJSPaths.getElement("date_highlighted_button"));
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_highlighted_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen enter customer mobile number")
	public void user_076_in_customer_search_screen_enter_customer_mobile_number() throws Throwable {
		Random random = new Random();
		int mobileFirstDigit = 9;
		random.nextInt(100000000);
		String mobileNumberEnd = String.format("%09d", random.nextInt(100000000));
		String mobNumber = mobileFirstDigit + mobileNumberEnd;
		System.out.println("Mobile number " + mobNumber);
		System.out.println("Mobile number js path " + customerSearchJSPaths.getElement("customer_search_mobile_input"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_mobile_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_mobile_input"))
						.sendKeys(mobNumber);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on the search button in customer search screen")
	public void user_076_click_on_the_search_button_in_customer_search_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on create new request buttton")
	public void user_076_click_on_create_new_request_buttton() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				Actions action = new Actions(driver);
				action.scrollToElement(javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('button[class=\"p-element p-button-info p-button-sm w-90 m-2 pull-right p-button p-component\"]')[2]")).build().perform();;
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('button[class=\"p-element p-button-info p-button-sm w-90 m-2 pull-right p-button p-component\"]')[2]")
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify save button and back buttons are visible in new application screen")
	public void user_076_verify_save_button_and_back_buttons_are_visible_in_new_application_screen() throws Throwable {
		boolean saveButtonVerification = false;
		boolean backButtonVerification = false;
		for (int i = 0; i <= 50; i++) {
			try {
				saveButtonVerification = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("confirmation_save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {

			}
		}

		softAssert.assertTrue(saveButtonVerification, "Save button is not visisble hence failed");

	}

	@Then("user_076 verify product field should be mandatory editable dropdown")
	public void user_076_verify_product_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("product_dropdown").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "product_dropdown")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("product_dropdown"));
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"product field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"product field is not a dropdown field hence failed");

	}

	@Then("user_076 verify sub product field should be mandatory editable dropdown")
	public void user_076_verify_sub_product_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sub_product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("sub_product_dropdown").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "sub_product_dropdown")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sub_product_dropdown"));
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sub_product_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sub_product_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"product field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"product field is not a dropdown field hence failed");

	}

	@Then("user_076 verify clasification should be editable mandatory dropdown")
	public void user_verify_clasification_should_be_editable_mandatory_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("clasification_dropdown"));
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"clasification field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"clasification field is not a dropdown field hence failed");

	}

	@Then("user_076 verify product field should be editable mandatory drodown")
	public void user_verify_product_field_should_be_editable_mandatory_drodown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("product_dropdown"));
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"product field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"product field is not a dropdown field hence failed");
	}

	@Then("user_076 verify total finance amount request field should be mantatory numeric")
	public void user_076_verify_total_finance_amount_request_field_should_be_mantatory_numeric() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(newApplicationTestData.get("total_finance_amount_requested"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				// total_amount_requested_input
				mandatoryVerification = javascriptHelper.executeScript("return "
						+ applicationDetailsElements.getElement("total_amount_requested_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.getAttribute("inputmode");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"total finance amount requested is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("decimal"),
				"total finance amount requested field is not a numeric field hence failed");

	}

	@Then("user_076 verify declared net monthly income field should be mandatory numeric")
	public void user_076_verify_declared_net_monthly_income_field_should_be_mandatory_numeric() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("declared_net_income_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("declared_net_income_input"))
						.sendKeys(newApplicationTestData.get("declared_net_income_monthly"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				// total_amount_requested_input
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("declared_net_input_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("declared_net_income_input"))
						.getAttribute("inputmode");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"declared net income is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("decimal"),
				"declared net income field is not a numeric field hence failed");
	}

	@Then("user_076 verify declared currrent obligation field should be non mandatory editable numeric")
	public void user_076_verify_declared_currrent_obligation_field_should_be_non_mandatory_editable_numeric()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("declared_current_obligation_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("declared_current_obligation_input"))
						.sendKeys(newApplicationTestData.get("declared_current_obligation"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				// total_amount_requested_input
				mandatoryVerification = javascriptHelper.executeScript("return "
						+ applicationDetailsElements.getElement("declared_current_obligation_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("declared_current_obligation_input"))
						.getAttribute("inputmode");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"declared current obligation field is a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("decimal"),
				"declared current obligation field is not a numeric field hence failed");
	}

	@Then("user_076 verify special promotional campaign field should be non mandatory editable dropdown")
	public void user_076_verify_special_promotional_campaign_field_should_be_non_mandatory_editable_dropdown()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("special_promotion_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("special_promotion_campaign").trim()); if
		 * ((dropdownString.trim())
		 * .equalsIgnoreCase((newApplicationTestData.get("special_promotion_campaign")).
		 * trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("special_promotion_campaign"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("special_promotion_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("special_promotion_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"special promotion field is a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"special promotion field is not a dropdown field hence failed");
	}

	@Then("user_076 verify sourcing channel field should be mandatory editable dropdown")
	public void user_076_verify_sourcing_channel_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_channel_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("sourcing_channel").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "sourcing_channel")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_channel"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_channel_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_channel_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"sourcing channel field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"sourcing channel field is not a dropdown field hence failed");
	}

	@Then("user_076 verify business center code field should be mandatory editable dropdown")
	public void user_076_verify_business_center_code_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("business_center_code_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("Business_center_code").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "Business_center_code")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("Business_center_code"));
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("business_center_code_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("business_center_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"business center code field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"business center code field is not a dropdown field hence failed");
	}

	@Then("user_076 verify service type field should be mandatory editable dropdown")
	public void user_076_verify_service_type_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_type_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("servicing_type").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "servicing_type")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("servicing_type"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_type_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"service type field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"service type field is not a dropdown field hence failed");
	}

	@Then("user_076 verify region field should be mandatory editable dropdown")
	public void user_076_verify_region_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("region_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " + newApplicationTestData.get("region").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "region")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("region"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("region_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("region_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"region field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"region field is not a dropdown field hence failed");
	}

	@Then("user_076 verify servicing branch field should be mandatory editable dropdown")
	public void user_076_verify_servicing_branch_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("servicing_branch").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "servicing_branch")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("servicing_branch"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"servicing branch field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"servicing branch field is not a dropdown field hence failed");
	}

	@Then("user_076 verify spoke location field should be non mandatory editable dropdown")
	public void user_076_verify_spoke_location_field_should_be_non_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spoke_location_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("spoke_location").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "spoke_location")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("spoke_location"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spoke_location_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spoke_location_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spoke location field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"spoke location field is not a dropdown field hence failed");
	}

	@Then("user_076 verify closing staff or servicing staff or RM field should be mandatory editable dropdown")
	public void user_076_verify_closing_staff_or_servicing_staff_or_rm_field_should_be_mandatory_editable_dropdown()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("closing_staff_servicing_staff_RM").trim()); if
		 * ((dropdownString.trim()) .equalsIgnoreCase((newApplicationTestData.get(
		 * "closing_staff_servicing_staff_RM")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("closing_staff_servicing_staff_RM"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"closing staff servicing staff RM field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"closing staff servicing staff RM field is not a dropdown field hence failed");

	}

	@Then("user_076 verify toupup type field should be visible in murabha product")
	public void user_verify_toupup_type_field_should_be_visible_in_murabha_product() throws Throwable {
		boolean statusOfTheField = false;
		for (int i = 0; i <= 300; i++) {
			try {
				statusOfTheField = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_type_dropdown"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(statusOfTheField, "topup field is not visible hence failed");

	}

	@Then("user_076 verify topup type field should be non mandatory editable dropdown")
	public void user_076_verify_topup_type_field_should_be_non_mandatory_editable_dropdown() throws Exception {
		String mandatoryValidation = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_type_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if ((mandatoryValidation.length() > 0) && (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_type_dropdown"))
				.click();
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("topup_type"));
		softAssert.assertTrue(!(mandatoryValidation.contains("*")), "Topup type is mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"Topup type is not a dropdown field hence failed");

	}

	@Then("user_076 verify topup application number field should be non mandatory editable input")
	public void user_076_verify_topup_application_number_field_should_be_non_mandatory_editable_input() {
		String mandatoryValidation = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryValidation = javascriptHelper.executeScript("return "
						+ applicationDetailsElements.getElement("topup_application_number_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("topup_application_number_input"))
						.getAttribute("type");
				if ((mandatoryValidation.length() > 0) && (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		javascriptHelper
				.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_application_number_input"))
				.sendKeys(newApplicationTestData.get("topup_application_number"));
		softAssert.assertTrue(!(mandatoryValidation.contains("*")),
				"Topup application number is a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"Topup application number is not a input box hence failed");

	}

	@Then("user_076 verify topup application number field should be visible in murabha product")
	public void user_verify_topup_application_number_field_should_be_visible_in_murabha_product() throws Throwable {
		boolean statusOfTheField = false;
		for (int i = 0; i <= 300; i++) {
			try {
				statusOfTheField = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_type_dropdown"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(statusOfTheField, "topup application number is not visible hence failed");
	}

	@Then("user_076 verify sourcing type field should be mandatory editable lookup")
	public void user_076_verify_sourcing_type_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("sourcing_type_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("sourcing_type").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "sourcing_type")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_type"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_type_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"sourcing type field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"sourcing type field is not a dropdown field hence failed");
	}

	@Then("user_076 verify sourcing office field should be mandatory editable lookup")
	public void user_076_verify_sourcing_office_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_office_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("sourcing_office").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "sourcing_office")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_office"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_office_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_office_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"sourcing office field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"sourcing office field is not a dropdown field hence failed");
	}

	@Then("user_076 verify sourcing entity field should be mandatory editable lookup")
	public void user_076_verify_sourcing_entity_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("sourcing_entity_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_entity_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("sourcing_entity").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "sourcing_entity")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_entity"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_entity_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_entity_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"sourcing entity field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"sourcing entity field is not a dropdown field hence failed");
	}

	@Then("user_076 verify sourcing staff field should be non mandatory editable lookup")
	public void user_076_verify_sourcing_staff_field_should_be_non_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_staff_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("sourcing_staff").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "sourcing_staff")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_staff"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_staff_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_staff_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"sourcing staff field is not a dropdown field hence failed");
	}

	@Then("user_076 verify reference type field should be non mandatory editable lookup")
	public void user_076_verify_reference_type_field_should_be_non_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_type_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("reference_type").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "reference_type")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("reference_type"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_type_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"reference type field is a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"reference type field is not a dropdown field hence failed");
	}

	@Then("user_076 verify reference entity field should be non mandatory editable lookup")
	public void user_076_verify_reference_entity_field_should_be_non_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_entity_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		/*
		 * String jqueryForDropdownLength =
		 * "document.querySelectorAll('ion-radio-group ion-radio').length"; String
		 * dropdownLength = ""; boolean isDropdownValueSelected = false; String
		 * dropdownString = ""; for (int i = 0; i <= 300; i++) { try { dropdownLength =
		 * javascriptHelper.executeScript("return " +
		 * jqueryForDropdownLength).toString(); System.out.println("Dropdown length " +
		 * dropdownLength); if (!(dropdownLength.isEmpty()) &&
		 * !(dropdownLength.equals("0"))) { break; } } catch (Exception e) { if (i ==
		 * 10) { Assert.fail(e.getMessage()); } } } int premitiveDropdownLength =
		 * Integer.parseInt(dropdownLength); for (int j = 0; j <=
		 * premitiveDropdownLength; j++) {
		 * 
		 * for (int l = 0; l <= 300; l++) { try { System.out.println("L value is " + l);
		 * System.out.println("document.querySelectorAll('ion-radio-group ion-label')["
		 * + j + "].innerText"); dropdownString = javascriptHelper.executeScript(
		 * "return document.querySelectorAll('ion-radio-group ion-label')[" + j +
		 * "].innerText") .toString(); if (!(dropdownString.isEmpty())) {
		 * System.out.println(dropdownString); System.out.println("Loop count " + l +
		 * " got breaked"); break; } } catch (Exception e) { if (l == 10 &&
		 * !(dropdownString.isEmpty())) { Assert.fail(e.getMessage()); } } if
		 * (!(dropdownString.isEmpty())) { System.out.println(dropdownString);
		 * System.out.println("Loop count " + l + " got breaked"); break; } }
		 * System.out.println("String " + dropdownString.trim());
		 * System.out.println("Map " +
		 * newApplicationTestData.get("reference_entity").trim()); if
		 * ((dropdownString.trim()).equalsIgnoreCase((newApplicationTestData.get(
		 * "reference_entity")).trim())) {
		 * 
		 * for (int k = 0; k <= 300; k++) { try {
		 * 
		 * clicksAndActionsHelper.moveToElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * clicksAndActionsHelper.clickOnElement(javascriptHelper.
		 * executeScriptWithWebElement(
		 * "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
		 * isDropdownValueSelected = true; break; } catch (Exception e) { if (k == 10) {
		 * Assert.fail(e.getMessage());
		 * 
		 * } } } } if (isDropdownValueSelected == true) { break; }
		 * 
		 * }
		 */

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("reference_entity"));

		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_entity_dropdown"))
						.getAttribute("aria-label");
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_entity_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"reference entity field is a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"reference entity field is not a dropdown field hence failed");
	}

	@Then("user_076 verify reference code field should be non mandatory editable textbox")
	public void user_076_verify_reference_code_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.sendKeys(newApplicationTestData.get("reference_code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				// total_amount_requested_input
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("reference_code_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.getAttribute("type");
				if (!(mandatoryVerification.isEmpty()) && !(fieldTypeValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"reference code is not a mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"reference code field is not a numeric field hence failed");
	}

	@And("user_076 click on save button in application details new app record")
	public void user_076_click_on_save_button_in_application_details_new_app_record() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.sendKeys(Keys.PAGE_UP);

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("confirmation_save_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_confirmation_ok_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on save button without entering mandatory details in creation screen$")
	public void user_076_click_on_save_button_without_entering_mandatory_details_in_creation_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("confirmation_save_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should save the record of application details new app")
	public void user_076_verify_system_should_save_the_record_of_application_details_new_app() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + "document.querySelector('div[aria-label*=\"Success\"]').innerText")
						.toString();
				if (!(toastMessage.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toastMessage.contains("Success"), "Record is not saved hence failed");
		toastMessageForReferenceNumber = toastMessage;
		System.out.println(toastMessage);
	}

	@Then("user_076 verify system should show the message for updated record of application details at new app stage")
	public void user_076_verify_system_should_show_the_message_for_updated_record_of_application_details_at_new_app_stage()
			throws Throwable {
		String toastMessage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(toastMessage.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		System.out.println(toastMessage);
	}

	@And("user_076 invoke soft assert for new application screen")
	public void user_076_invoke_soft_assert_for_new_application_screen() throws Throwable {
		softAssert.assertAll();

	}

	@And("user_076 invoke soft assert for new application screen for updations scenario")
	public void user_076_invoke_soft_assert_for_new_application_screen_for_updation_scenario() throws Throwable {
		updateSoftAssert.assertAll();

	}

	@And("user_076 make any mandatory field blank in application details record in new app stage")
	public void user_076_make_any_mandatory_field_blank_in_application_details_record_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {

			}
		}
	}

	@And("user_076 click on save button without enter the mandatory field in application details screen")
	public void user_076_click_on_save_button_without_enter_the_mandatory_field_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the validation for fill the mandatory field in application details screen")
	public void user_076_verify_system_should_show_the_validation_for_fill_the_mandatory_field_in_application_details_screen()
			throws Throwable {
		String blankFieldVerification = "";
		for (int i = 0; i <= 20; i++) {
			try {
				blankFieldVerification = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(blankFieldVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Please fill all the details
		softAssert.assertEquals("Please fill required fields", blankFieldVerification);
		System.out.println(blankFieldVerification);

	}

	@Then("^user_076 verify system should show the validation for fill the mandatory field in application details screen in updation screen$")
	public void user_076_verify_system_should_show_the_validation_for_fill_the_mandatory_field_in_application_details_screen_in_updation_screen()
			throws Throwable {
		String blankFieldVerification = "";
		for (int i = 0; i <= 20; i++) {
			try {
				blankFieldVerification = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_message")).toString();
				if (!(blankFieldVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Please fill all the details
		softAssert.assertEquals("Please fill all the details", blankFieldVerification);
		System.out.println(blankFieldVerification);		
	}

	@And("user_076 enter the negative input in numeric field in application details screen")
	public void user_076_enter_the_negative_input_in_numeric_field_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(newApplicationTestData.get("negative_input"));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify system should not allow user to enter the negative input in numeric field in application details screen")
	public void user_076_verify_system_should_not_allow_user_to_enter_the_negative_input_in_numeric_field_in_application_details_screen()
			throws Throwable {
		String negativeValueInputValidation = "";
		for (int i = 0; i <= 20; i++) {
			try {
				negativeValueInputValidation = javascriptHelper.executeScript(
						"return " + applicationDetailsElements.getElement("total_amount_requested_input") + ".value")
						.toString();

				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(negativeValueInputValidation.contains("-")),
				"nemeric field contains negative value hence failed");
	}

	@And("user_076 enter the special character input field in application details screen")
	public void user_076_enter_the_special_character_input_field_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(Keys.DELETE);

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(newApplicationTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should not allow user to enter the special caharcter in input field in application details screen")
	public void user_076_verify_system_should_not_allow_user_to_enter_the_special_caharcter_in_input_field_in_application_details_screen()
			throws Throwable {
		String specialCharacterInput = "";
		for (int i = 0; i <= 20; i++) {
			try {
				specialCharacterInput = javascriptHelper.executeScript(
						"return " + applicationDetailsElements.getElement("total_amount_requested_input") + ".value")
						.toString();
				if (!(specialCharacterInput.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(specialCharacterInput);
		softAssert.assertTrue(specialCharacterInput.length() == 0, "field allow special character input hence failed");
	}

	@And("user_076 enter the character input in numerical input field of charcter in input field in application details screen")
	public void user_076_enter_the_character_input_in_numerical_input_field_of_charcter_in_input_field_in_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(Keys.DELETE);
				break;
			} catch (Exception e) {

			}
		}
		System.out.println("Character Input " + newApplicationTestData.get("character_input"));

		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(newApplicationTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system wont allow user to enter the character input in applicationn details screen")
	public void user_076_verify_system_wont_allow_user_to_enter_the_character_input_in_applicationn_details_screen()
			throws Throwable {
		String characterInputValidation = "";
		String query = "return " + applicationDetailsElements.getElement("total_amount_requested_input") + ".innerText";
		System.out.println(query);
		for (int i = 0; i <= 300; i++) {
			try {
				characterInputValidation = javascriptHelper.executeScript("return "
						+ applicationDetailsElements.getElement("total_amount_requested_input") + ".innerText")
						.toString();
				if (!(characterInputValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Character input from screen " + characterInputValidation);
		System.out.println(characterInputValidation.length());
		softAssert.assertTrue(characterInputValidation.length() == 0, "field accepts character input hence failed");
	}

	@And("user_076 click on edit button of new application list view record")
	public void user_076_click_on_edit_button_of_new_application_list_view_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_listview_edit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the list view record of application details record")
	public void user_076_update_the_list_view_record_of_application_details_record() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(newApplicationTestData.get("total_finance_amount_requested"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify user can able to update the application details record")
	public void user_076_verify_user_can_able_to_update_the_application_details_record() throws Throwable {
		String updateValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				updateValidation = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(updateValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(updateValidation);
		updateSoftAssert.assertTrue(updateValidation.contains("Success! Record updated for ID"));
	}

	@And("user_076 change the record active if its  and change  if active record")
	public void user_076_change_the_record_active_if_its__and_change__if_active_record()
			throws Throwable {
		boolean status = false;
		String recordStatus = "";
		String listViewRecordStatus = "";

		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_details_status_button")));
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_details_status_button")).click();
				Thread.sleep(500);
				recordStatus = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("new_application_details_record_status"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.sendKeys(Keys.PAGE_UP);
			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 50; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

		if (recordStatus.equalsIgnoreCase("true")) {
			for (int i = 0; i <= 50; i++) {
				try {
					listViewRecordStatus = javascriptHelper
							.executeScript("return "
									+ applicationDetailsElements.getElement("list_view_record_status_verification"))
							.toString();
					if (!(listViewRecordStatus.isEmpty())) {
						updateSoftAssert.assertEquals("Active", listViewRecordStatus);
						break;
					}
				} catch (Exception e) {

				}
			}

		} else if (recordStatus.equalsIgnoreCase("false"))
			for (int i = 0; i <= 50; i++) {
				try {
					listViewRecordStatus = javascriptHelper
							.executeScript("return "
									+ applicationDetailsElements.getElement("list_view_record_status_verification"))
							.toString();
					if (!(listViewRecordStatus.isEmpty())) {
						updateSoftAssert.assertEquals("In-active", listViewRecordStatus);
						break;
					}
				} catch (Exception e) {

				}
			}

		// One End

		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_listview_edit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(500);
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_details_status_button")));
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_details_status_button")).click();
				Thread.sleep(500);
				recordStatus = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("new_application_details_record_status"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input"))
						.sendKeys(Keys.PAGE_UP);
			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

		if (recordStatus.equalsIgnoreCase("true")) {
			for (int i = 0; i <= 50; i++) {
				try {
					listViewRecordStatus = javascriptHelper
							.executeScript("return "
									+ applicationDetailsElements.getElement("list_view_record_status_verification"))
							.toString();
					if (!(listViewRecordStatus.isEmpty())) {
						updateSoftAssert.assertEquals("Active", listViewRecordStatus);
						break;
					}
				} catch (Exception e) {

				}
			}

		} else if (recordStatus.equalsIgnoreCase("false"))
			for (int i = 0; i <= 50; i++) {
				try {
					listViewRecordStatus = javascriptHelper
							.executeScript("return "
									+ applicationDetailsElements.getElement("list_view_record_status_verification"))
							.toString();
					if (!(listViewRecordStatus.isEmpty())) {
						updateSoftAssert.assertEquals("In-active", listViewRecordStatus);
						break;
					}
				} catch (Exception e) {

				}
			}

	}

	@Then("user_076 verify application details screen have submit button")
	public void user_076_verify_application_details_screen_have_submit_button() throws Throwable {
		boolean statusOfSubmitButton = false;
		for (int i = 0; i <= 300; i++) {
			try {
				statusOfSubmitButton = javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_submit_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		updateSoftAssert.assertTrue(statusOfSubmitButton, "Submit button is not available hence failed");

	}

	@Then("user_076 verify application details screen have return button")
	public void user_076_verify_application_details_screen_have_return_button() throws Throwable {
		boolean statusOfReturnButton = false;
		for (int i = 0; i <= 300; i++) {
			try {
				statusOfReturnButton = javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("new_application_return_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		updateSoftAssert.assertTrue(statusOfReturnButton, "Return button is not available hence failed");
	}

	@Then("user_076 verify application details screen have view summary button")
	public void user_076_verify_application_details_screen_have_view_summary_button() throws Throwable {
		boolean statusOfViewSummaryButton = false;
		for (int i = 0; i <= 300; i++) {
			try {
				statusOfViewSummaryButton = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("new_aplication_view_summary_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		updateSoftAssert.assertTrue(statusOfViewSummaryButton, "View sumary button is not available hence failed");
	}

	@Then("user_076 click on view summary button in application details screen")
	public void user_076_click_on_view_summary_button_in_application_details_screen() throws Throwable {
		String viewSummaryQuery = "document.querySelectorAll('kub-workflow-decision button[icon=\"pi pi-info-circle\"]').length";
		int numberOfViewSummaryButton = 0;
		for (int i = 0; i <= 50; i++) {
			try {

				numberOfViewSummaryButton = Integer
						.parseInt(javascriptHelper.executeScript("return " + viewSummaryQuery).toString());
				if (numberOfViewSummaryButton != 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < numberOfViewSummaryButton; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('kub-workflow-decision button[icon=\"pi pi-info-circle\"]')[" + i
								+ "]")
						.click();
				break;
			} catch (ElementClickInterceptedException e) {

			}

		}

	}

	@Then("user_076 verify system should show the summary of the record")
	public void user_076_verify_system_should_show_the_summary_of_the_record() throws Throwable {
		boolean statusOfViewSummaryScreen = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(applicationDetailsElements.getElement("view_summary_verification"));
				statusOfViewSummaryScreen = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("view_summary_verification"))
						.isDisplayed();
				System.out.println(statusOfViewSummaryScreen);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (statusOfViewSummaryScreen == true) {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							applicationDetailsElements.getElement("view_summary_close_button")).click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

	@Then("user_076 click on back button in application details update screen")
	public void user_076_click_on_back_button_in_application_details_update_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on list view edit button in application details record at new app stage")
	public void user_click_on_list_view_edit_button_in_application_details_record_at_new_app_stage() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_list_view_record")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify application details record got updated at new app stage")
	public void user_verify_application_details_record_got_updated_at_new_app_stage() throws Throwable {
		String totalFinanceAmountRequested = "";
		for (int i = 0; i <= 200; i++) {
			try {
				totalFinanceAmountRequested = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("total_amount_requested_get_input"))
						.toString();
				if (!(totalFinanceAmountRequested.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String[] spliTotalFinanceAmount = totalFinanceAmountRequested.split("[.]");
		System.out.println(spliTotalFinanceAmount[0]);
		String finalTotalFinanceAmountRequested = spliTotalFinanceAmount[0].replace(",", "");
		Assert.assertEquals(finalTotalFinanceAmountRequested,
				newApplicationTestData.get("total_finance_amount_requested"));

	}

	@And("user_076 update the application details record with valid input at new app stage")
	public void user_update_the_application_details_record_with_valid_input_at_new_app_stage() {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(newApplicationTestData.get("total_finance_amount_requested"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify application details update screen should moved to previoues screen")
	public void user_076_verify_application_details_update_screen_should_moved_to_previoues_screen() throws Throwable {
		boolean addButtonStatus = false;
		for (int i = 0; i <= 300; i++) {
			try {
				addButtonStatus = javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_add_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		updateSoftAssert.assertTrue(addButtonStatus, "Screen not moved to previous stage");
	}

	@Then("user_076 click on view summary button in application details screen in new app stage")
	public void user_076_click_on_view_summary_button_in_application_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(applicationDetailsElements.getElement("application_details_view_summary_button"));
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("application_details_view_summary_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300)

				{
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the summary of the application details record at new app stage")
	public void user_076_verify_system_should_show_the_summary_of_the_application_details_record_at_new_app_stage()
			throws Throwable {
		boolean ststauOfViewSummary = false;
		for (int i = 0; i <= 300; i++) {
			try {
				ststauOfViewSummary = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("appllication_details_view_summary_verification"))
						.isDisplayed();
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(ststauOfViewSummary, " System didn't show the summary of the record");

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("application_details_view_summary_close_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on back button in list view record of application details record in new app stage")
	public void user_076_click_on_back_button_in_list_view_record_of_application_details_record_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify screen should get navigate to previous screen in new app stage of application details record")
	public void user_076_verify_screen_should_get_navigate_to_previous_screen_in_new_app_stage_of_application_details_record()
			throws Throwable {
		boolean statusOfBackButton = false;
		for (int i = 0; i <= 150; i++) {
			try {
				statusOfBackButton = javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_add_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(statusOfBackButton, " Back button is not working hence failed");
	}

	@And("user_076 verify application details list view record should be read only not editable at new app stage")
	public void user_076_verify_application_details_list_view_record_should_be_read_only_not_editable_at_new_app_stage()
			throws Throwable {
		boolean status = false;

		for (int i = 0; i <= 20; i++) {
			try {
				System.out.println(
						applicationDetailsElements.getElement("application_details_list_view_record_is_read_only"));
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_list_view_record_is_read_only"))
						.sendKeys("9829787");
			} catch (Exception e) {
				if (i == 20) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status);
	}

	@And("user_076 click on search button in application details list view at new app stage")
	public void user_076_click_on_search_button_in_application_details_list_view_at_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("application_details_list_view_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 search with valid search text in application details list view at new app stage")
	public void user_076_search_with_valid_search_text_in_application_details_list_view_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_list_view_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("application_details_list_view_input"))
						.sendKeys(newApplicationTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 got the search result in application details at new app stage")
	public void user_076_got_the_search_result_in_application_details_at_new_app_stage() throws Throwable {
		String listViewSearchResponse = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewSearchResponse = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("application_details_list_view_search_result"))
						.toString();
				System.out.println(listViewSearchResponse);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(!(listViewSearchResponse.equals("Showing 0 to 0 of 0 entries")));
	}

	@And("user_076 search with invalid search text in application details list view at new app stage")
	public void user_076_search_with_invalid_search_text_in_application_details_list_view_at_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_list_view_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("application_details_list_view_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_list_view_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("application_details_list_view_input"))
						.sendKeys(newApplicationTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 didnt got the search result in application details at new app stage")
	public void user_076_didnt_got_the_search_result_in_application_details_at_new_app_stage() throws Throwable {
		String listViewSearchResponse = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewSearchResponse = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("application_details_list_view_search_result"))
						.toString();
				System.out.println(listViewSearchResponse);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(listViewSearchResponse.equals("Showing 0 to 0 of 0 entries"));
	}

	@And("user_076 click on export button in application details list view")
	public void user_076__click_on_export_button_in_application_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("application_details_list_view_export")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on pdf option in application details list view")
	public void user_076__click_on_pdf_option_in_application_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Application Details
	}

	@Then("user_076 verify application details pdf file should be downloaded in system")
	public void user_076__verify_application_details_pdf_file_should_be_downloaded_in_system() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Details")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application Details"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xlsx option in application details list view")
	public void user_076__click_on_xlsx_option_in_application_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify application details xlsx file should be downloaded in system")
	public void user_076__verify_application_details_xlsx_file_should_be_downloaded_in_system() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Details_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application Details_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on submit button in application details record at new app stage")
	public void user_076_click_on_submit_button_in_application_details_record_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("submit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 enter the alert remark for application details record in new app stage")
	public void user_076_enter_the_alert_remark_for_application_details_record_in_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("alert_ok")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on alert submit button in application details at new app stage")
	public void user_076_click_on_alert_submit_button_in_application_details_at_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("alert_submit")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the product while open the new app record")
	public void user_update_the_product_while_open_the_new_app_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Dropdown clicked");
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sub_product_dropdown"));
	}

	@And("user_076 update the clossing staff or servicing staff RM while open the new app record")
	public void user_update_the_clossing_staff_or_servicing_staff_rm_while_open_the_new_app_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("closing_staff_servicing_staff_RM"));
	}

	@And("user_076 update the sourcing office while open the new app record")
	public void user_update_the_sourcing_office_while_open_the_new_app_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("sourcing_office_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_office_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_office"));
	}

	@And("user_076 update the sourcing entity while open the new app record")
	public void user_update_the_sourcing_entity_while_open_the_new_app_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("sourcing_entity_dropdown")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_entity_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_office"));

	}

	@Then("user_076 verify applicatio details record should get submitted from new app stage")
	public void user_076_verify_applicatio_details_record_should_get_submitted_from_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(toastMessage.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(toastMessage);
		String finalUserID = toastMessage.substring(86).replace(".", "");
		System.out.println("User ID " + finalUserID);
		Assert.assertTrue(toastMessage.contains("Record APPROVED Successfully"));
	}

	@And("user_076 store the murabaha record reference number to test new app screens")
	public void user_076_store_the_murabaha_record_reference_number_to_test_new_app_screens() throws Throwable {
		String extractedReferenceNumber = toastMessage.substring(37);
		System.out.println("Reference Number " + extractedReferenceNumber);
		configFileReader.storePersonalLoanNewAppReferenceNumber(extractedReferenceNumber);
	}

	@And("user_076 extract the application details record reference number in new app stage")
	public void user_076_extract_the_application_details_record_reference_number_in_new_app_stage() throws Throwable {
		String finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(36).trim();
		System.out.println("Final reference number " + finalRecordReferenceNumber);
		personalLoanApplicationDetailsExecelData.updateTestData(newApplicationTestData.get("Dataset ID"),
				"record_reference_number", finalRecordReferenceNumber);
	}

	@Then("logout from the ULS Application")
	public void logout_from_the_ULS_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}
	@And("Update the status to Inactive in Personal loan_New Application")
	public void update_the_status_to__inactive_in_personal_loan_new_application() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("ActiveInactie")));
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("ActiveInactie")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Click on Save icon in Personal loan_New Application")
	public void click_on_save_icon_in_personal_loan_new_application() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("SaveIcon")));
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Update the status to Active in Personal loan_New Application")
	public void update_the_status_to_active_in_personal_loan_new_application() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("ActiveInactie")));
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("ActiveInactie")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	@Given("navigate to uls url")
	public void navigate_to_uls_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	}

	@And("user_076 search the auto loan new app record in mail box")
	public void user_076_search_the_auto_loan_new_app_record_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getPersonalLoanNewAppReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the auto loan new app record from mail box")
	public void user_076_select_the_auto_loan_new_app_record_from_mail_box() throws Throwable {
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
					if (recordRefNumber.equals(configFileReader.getPersonalLoanNewAppReferenceNumber())) {
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

	

	@And("user_076 in customer search screen select the customer type at customer details")
	public void user_076_in_customer_search_screen_select_the_customer_type_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Data set ID "+newApplicationTestData.get("Dataset ID"));
		                                
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("customer_type"));

	}

	@And("user_076 in customer search screen enter customer name at customer details")
	public void user_076_in_customer_search_screen_enter_customer_name_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_name_input"))
						.sendKeys(newApplicationTestData.get("customer_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in custommer search screen select ID type at customer details")
	public void user_076_in_custommer_search_screen_select_id_type_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("id_type"));
	}

	@And("user_076 in customer search screen enter id number at customer details")
	public void user_076_in_customer_search_screen_enter_id_number_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_number_input"))
						.sendKeys(newApplicationTestData.get("id_number"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen enter date of birth of the customer at customer details")
	public void user_076_in_customer_search_screen_enter_date_of_birth_of_the_customer_at_customer_details()
			throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_of_birth_calendar_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_of_birth_calendar_input"))
						.sendKeys(newApplicationTestData.get("date_of_birth"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println(customerSearchJSPaths.getElement("date_highlighted_button"));
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_highlighted_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen enter customer mobile number at customer details")
	public void user_076_in_customer_search_screen_enter_customer_mobile_number_at_customer_details() throws Throwable {
		Random random = new Random();
		int mobileFirstDigit = 9;
		random.nextInt(1000000000);
		String mobileNumberEnd = String.format("%09d", random.nextInt(1000000000));
		String mobNumber = mobileFirstDigit + mobileNumberEnd;
		System.out.println("Mobile number " + mobNumber);
		System.out.println("Mobile number js path " + customerSearchJSPaths.getElement("customer_search_mobile_input"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_mobile_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_mobile_input"))
						.sendKeys(mobNumber);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on save button in customer details with blank fields")
	public void user_076_click_on_save_button_in_customer_details_with_blank_fields() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the validation for blank field in customer details screen at new app stage")
	public void user_076_verify_system_should_show_the_validation_for_blank_field_in_customer_details_screen_at_new_app_stage()
			throws Throwable {
		String validationMessage = "";
		for (int i = 0; i < 300; i++) {
			try {
				validationMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_message")).toString();
				if (validationMessage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Toast Message " + validationMessage);
		softAssert.assertEquals(validationMessage, "Please fill all the details",
				"System is not showing the validation message");
	}

	@And("user_076 enter special character in first name in customer details screen at new app")
	public void user_076_enter_special_character_in_first_name_in_customer_details_screen_at_new_app()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.sendKeys(newApplicationTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify first name field should show the validation for special character input in customer details screen at new app")
	public void user_076_verify_first_name_field_should_show_the_validation_for_special_character_input_in_customer_details_screen_at_new_app()
			throws Throwable {
		String specialCharacterValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				specialCharacterValidation = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("first_name_input_field_level_validation"))
						.toString();
				if (specialCharacterValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(" Validation Message " + specialCharacterValidation);
		softAssert.assertEquals(specialCharacterValidation, "Only Alphabets are allowed",
				"System not showing the special character validation message");

	}

	@And("user_076 enter numeric input in first name in customer details screen at new app")
	public void user_076_enter_numeric_input_in_first_name_in_customer_details_screen_at_new_app() throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.sendKeys(newApplicationTestData.get("numeric_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify first name field should show the validation for numeric input in customer details screen at new app")
	public void user_076_verify_first_name_field_should_show_the_validation_for_numeric_input_in_customer_details_screen_at_new_app()
			throws Throwable {
		String characterValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				characterValidation = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("first_name_input_field_level_validation"))
						.toString();
				if (characterValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(" Validation Message " + characterValidation);
		softAssert.assertEquals(characterValidation, "Only Alphabets are allowed",
				"System not showing the character validation message");
	}

	@And("user_076 enter character input in no of children in customer details screen at new app")
	public void user_076_enter_character_input_in_no_of_children_in_customer_details_screen_at_new_app()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("no_of_childer_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("no_of_childer_input"))
						.sendKeys(newApplicationTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify no of children field dont accept the character input in customer details screen at new app")
	public void user_076_verify_no_of_children_field_dont_accept_the_character_input_in_customer_details_screen_at_new_app()
			throws Throwable {
		String characterInputValidation = "";
		String query = "return " + applicationDetailsElements.getElement("no_of_childer_input") + ".innerText";
		System.out.println(query);
		for (int i = 0; i <= 100; i++) {
			try {
				characterInputValidation = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("no_of_childer_input") + ".innerText")
						.toString();
				if (!(characterInputValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Character input from screen " + characterInputValidation);
		System.out.println(characterInputValidation.length());
		softAssert.assertTrue(characterInputValidation.length() == 0, "field accepts character input hence failed");
	}

	@Then("user_076 verify customer details field should have save and back button")
	public void user_076_verify_customer_details_field_should_have_save_and_back_button() throws Throwable {
		boolean isSaveButtonDisplayed = false;
		boolean isBackButtonDisplayed = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isSaveButtonDisplayed = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				isBackButtonDisplayed = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("back_button")).isDisplayed();
				break;
			} catch (Exception e) {
			}
		}
		//softAssert.assertTrue(isSaveButtonDisplayed, "Save button is not visible hence failed");
		//softAssert.assertTrue(isBackButtonDisplayed, "back button is not visible hence failed");

	}

	@Then("user_076 verify customer type field should be mandatory editable dropdown at new app")
	public void user_076_verify_customer_type_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("customer_details_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("customer_details_type_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("customer_details_type_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("customer_type_dropdown"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " Customer type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" Customer type is not a mandatory field hence failed");
	}

	@Then("user_076 verify applicant type field should be mandatory editable dropdown at new app")
	public void user_076_verify_applicant_type_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("application_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("application_type_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("application_type_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("application_type"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" Application type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" Application type is not a mandatory field hence failed");
	}

	@Then("user_076 verify salutation field should be mandatory editable dropdown at new app")
	public void user_076_verify_salutation_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("salutation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("salutation_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("salutation_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("salutation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " salutation is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " salutation is not a mandatory field hence failed");
	}

	@Then("user_076 verify first name field should be mandatory editable textbox at new app")
	public void user_076_verify_first_name_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("first_Name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("first_name_input"))
						.sendKeys(newApplicationTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "first name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"first name field is not a mandatory field hence failed");

	}

	@Then("user_076 verify middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("middle_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("middle_name_input"))
						.sendKeys(newApplicationTestData.get("middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "middle name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"middle name field is a mandatory field hence failed");
	}

	@Then("user_076 verify last name field should be mandatory editable textbox at new app")
	public void user_076_verify_last_name_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("last_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("last_name_input"))
						.sendKeys(newApplicationTestData.get("last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "last name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"last name field is not a mandatory field hence failed");
	}

	@Then("user_076 verify father first name field should be mandatory editable textbox at new app")
	public void user_076_verify_father_first_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("father_first_name_Input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("father_first_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("father_first_name_Input"))
						.sendKeys(newApplicationTestData.get("father_first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father first name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"father first name field is not a mandatory field hence failed");
	}

	@Then("user_076 verify father middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_father_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("father_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("father_middle_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("father_middle_name_input"))
						.sendKeys(newApplicationTestData.get("father_middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father middle name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"father middle name field is a mandatory field hence failed");
	}

	@Then("user_076 verify father last name field should be mandatory editable textbox at new app")
	public void user_076_verify_father_last_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("father_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("father_last_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("father_last_name_input"))
						.sendKeys(newApplicationTestData.get("father_last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father last name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"father last name field is a non mandatory field hence failed");
	}

	@Then("user_076 verify spouse first name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_first_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("spouse_first_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_first_name_input"))
						.sendKeys(newApplicationTestData.get("spouse_first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse first name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse first name field is a mandatory field hence failed");
	}

	@Then("user_076 verify spouse middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("spouse_middle_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_middle_name_input"))
						.sendKeys(newApplicationTestData.get("spouse_middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse middle name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse middle name field is a mandatory field hence failed");
	}

	@Then("user_076 verify spouse last name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_last_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("spouse_last_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_last_name_input"))
						.sendKeys(newApplicationTestData.get("spouse_last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse last name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse last name field is a non mandatory field hence failed");
	}

	@Then("user_076 verify no of children field should be non mandatory editable textbox")
	public void user_076_verify_no_of_children_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("no_of_childer_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("no_of_children_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("no_of_childer_input"))
						.sendKeys(newApplicationTestData.get("no_of_children"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"no of children field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"no of children field is a mandatory field hence failed");
	}

	@Then("user_076 verify spouse status field should be non mandatory editable dropdown at new app")
	public void user_076_verify_spouse_status_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_status_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spouse_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("spouse_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " spouse status is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" spouse status is a mandatory field hence failed");
	}

	@Then("user_076 verify date of birth field should be mandatory editable calendar at new app")
	public void user_076_verify_date_of_birth_field_should_be_mandatory_editable_calendar_at_new_app()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("date_of_birth_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("today_date")).click();

				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("date_of_birth_mandatory_verification"))
						.toString();
				fieldVerification = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("date_of_birth_field_verification"))
						.toString();
				if (!(mandatoryVerification.isEmpty()) || !(fieldVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"date of birth field is not a mandatory hence failed");
		softAssert.assertTrue(fieldVerification.contains("dd-M-yy"),
				"date of birth is not a calender tyep hence failed");
	}

	@Then("user_076 verify gender field should be mandatory editable dropdown at new app")
	public void user_076_verify_gender_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("gender_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("gender_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("gender_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("gender"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " gender is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " gender is not a mandatory field hence failed");
	}

	@Then("user_076 verify education level field should be mandatory editable dropdown at new app")
	public void user_076_verify_education_level_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("education_level_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("education_level_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("education_level_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("education_level"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" educational level is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" educational level is not a mandatory field hence failed");
	}

	@Then("user_076 verify maritail status field should be mandatory editable dropdown at new app")
	public void user_076_verify_maritail_status_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {

		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("maritail_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("maritail_status_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("maritail_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("maritail_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" maritail status is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" maritail status is not a mandatory field hence failed");

	}

	@Then("user_076 verify nationality field should be mandatory editable dropdown at new app")
	public void user_076_verify_nationality_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("nationality_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("nationality_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("nationality_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("nationality"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " nationality is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" nationality is not a mandatory field hence failed");

	}

	@Then("user_076 verify category field should be mandatory editable dropdown at new app")
	public void user_076_verify_category_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("category_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("category_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("category_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("category"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " category is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " category is not a mandatory field hence failed");
	}

	@Then("user_076 verify religion field should be mandatory editable dropdown at new app")
	public void user_076_verify_religion_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("relegion_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("relegion_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("relegion_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("Religion"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " relegion is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " relegion is not a mandatory field hence failed");
	}

	@Then("user_076 verify residential status field should be mandatory editable dropdown at new app")
	public void user_076_verify_residential_status_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("customer_residential_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("customer_residential_status_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("customer_residential_status_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("customer_residential_status_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("residential_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" residential status is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" residential status is not a mandatory field hence failed");

	}

	@Then("user_076 verify language field should be mandatory editable dropdown at new app")
	public void user_076_verify_language_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("languages_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("languages_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("languages_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("language"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " language is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " language is not a mandatory field hence failed");
	}

	@Then("user_076 verify no of dependents field should be mandatory editable textbox at new app")
	public void user_076_verify_no_of_dependents_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("no_of_dependents_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("no_of_dependents_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("no_of_dependents_input"))
						.sendKeys(newApplicationTestData.get("no_of_dependents"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"no of dependents field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"no of dependents field is a mandatory field hence failed");
	}

	@Then("user_076 verify mothers maiden name field should be mandatory editable textbox at new app")
	public void user_076_verify_mothers_maiden_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("mothers_maiden_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("mothers_maiden_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("mothers_maiden_name_input")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("mothers_maiden_name_input"))
						.sendKeys(newApplicationTestData.get("mothers_maiden_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mothers maiden name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"mothers maiden name field is a non mandatory field hence failed");
	}

	@Then("user_076 verify residence field should be mandatory editable textbox at new app")
	public void user_076_verify_residence_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("type_of_residency_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("type_of_residency_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("type_of_residency_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("type_of_residency"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" type of residence is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" type of residence is not a mandatory field hence failed");
	}

	@Then("user_076 verify industry segmentation field should be mandatory editable textbox at new app")
	public void user_076_verify_industry_segmentation_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("industry_segmentation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("industry_segmentation_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("industry_segmentation_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("industry_segmentation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" industry segmentation is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" industry segmentation is not a mandatory field hence failed");
	}

	@Then("user_076 verify income considered field should be non mandatory editable dropdown at new app")
	public void user_076_verify_income_considered_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("is_income_considered_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("is_income_considered_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("is_income_considered_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("is_income_considered_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("is_income_considered"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" is income considered is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" is income considered is a mandatory field hence failed");

	}

	@Then("user_076 verify costomer profile field should be non mandatory editable dropdown at new app")
	public void user_076_verify_costomer_profile_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("customer_profile_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("customer_profile_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("customer_profile_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("customer_profile"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" customer profile is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" customer profile is a mandatory field hence failed");
	}

	@Then("user_076 verify relationship field should be mandatory editable dropdown at new app")
	public void user_076_verify_relationship_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("relationship_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("relationship_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("relationship_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("relationship"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " relationship is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" relationship is a non mandatory field hence failed");
	}

	@Then("user_076 verify existing bank relationship field should be non mandatory editable toggle at new app")
	public void user_076_verify_existing_bank_relationship_field_should_be_non_mandatory_editable_toggle_at_new_app()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("existing_customer_flag"))
						.getAttribute("role");
				if (!(toggleVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("existing_customer_flag_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toggleVerification.contains("switch"),
				" existing customer field is not a toggle hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"existing customer field is a mandatory field hence failed");
	}

	@Then("user_076 verify blacklisted field should be non mandatory editable toggle at new app")
	public void user_076_verify_blacklisted_field_should_be_non_mandatory_editable_toggle_at_new_app()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("blacklisted_toggle"))
						.getAttribute("role");
				if (!(toggleVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("blacklisted_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toggleVerification.contains("switch"), " blacklisted field is not a toggle hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"blacklisted field is a mandatory field hence failed");
	}

	@Then("user_076 verify politically exposed field should be non mandatory editable dropdown at new app")
	public void user_076_verify_politically_exposed_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("isPoliticallyExposed_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("isPoliticallyExposed_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("isPoliticallyExposed_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("isPoliticallyExposed_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("politically_exposed"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" politically exposed is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" politically exposed is a mandatory field hence failed");
	}

	@Then("user_076 verify remarks field should be mandatory editable textbox at new app")
	public void user_076_verify_remarks_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("remarks_field_input"))
						.getAttribute("class");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ applicationDetailsElements.getElement("remarks_field_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("remarks_field_input")));
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("remarks_field_input"))
						.sendKeys(newApplicationTestData.get("remarks"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("textarea"), "remarks field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"remarks field is a non mandatory field hence failed");
	}

	@Then("user_076 verify phone number field should be mandatory editable textbox at new app")
	public void user_076_verify_phone_number_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("phone_number_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("phone_number_input")));
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("phone_number_input"))
						.sendKeys(newApplicationTestData.get("phone_number"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"phone number field is not a text box hence failed");
	}

	@Then("user_076 verify phone number primary field should be mandatory editable textbox at new app")
	public void user_076_verify_phone_number_primary_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("mobile1_number_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("mobile1_number_input"))
						.sendKeys(newApplicationTestData.get("mobile_number_primary"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mobile number primary number field is not a text box hence failed");
	}

	@Then("user_076 verify phone number secondary field should be editable number at new app")
	public void user_076_verify_phone_number_secondary_field_should_be_editable_number_at_new_app() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("mobile_number_secondary_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("mobile_number_secondary_input"))
						.sendKeys(newApplicationTestData.get("mobile_number_secondary"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mobile number secondary number field is not a text box hence failed");
	}

	@Then("user_076 verify email id field should be editable number at new app")
	public void user_076_verify_email_id_field_should_be_editable_number_at_new_app() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("email_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("email_input")));
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("email_input"))
						.sendKeys(newApplicationTestData.get("email"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "email id field is not a text box hence failed");
	}

	@Then("user_076 verify prefered contact method field should be editable number at new app")
	public void user_076_verify_prefered_contact_method_field_should_be_editable_number_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("prefered_contact_method_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("prefered_contact_method_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("prefered_contact_method_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("prefered_contact_method"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" prefered contact method is not a dropdown hence failed");
	}

	@Then("user_076 verify prefered time for contact field should be editable HH MM format at new app")
	public void user_076_verify_prefered_time_for_contact_field_should_be_editable_hh_mm_format_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("prefered_time_for_contact_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("prefered_time_for_contact_input")));
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("prefered_time_for_contact_input"))
						.sendKeys(newApplicationTestData.get("prefered_time_for_contact"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"prefered time for contact field is not a text box hence failed");
	}

	@And("user_076 invoke softAssert in auto loan new app customer details screen")
	public void user_076_invoke_soft_assert_in_auto_loan_new_app_customer_details_screen() throws Throwable {
		softAssert.assertAll();
	}	
	@And("user_076 click on facility info tab in new app stage")
	public void user_076_click_on_facility_info_tab_in_new_app_stage() throws Throwable {

		String facilityInfoTabCount = "document.querySelectorAll('ion-segment-button[id=\"seg3\"]').length";
		String length = "";
		int premitiveLength = 0;
		boolean tabClicked = false;
		for (int i = 0; i <= 150; i++) {
			try {
				length = javascriptHelper.executeScript("return " + facilityInfoTabCount).toString();
				if (length.length() > 0 || !(length.equals("0"))) {
					premitiveLength = Integer.parseInt(length);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < premitiveLength; i++) {
			for (int j = 0; j <= 30; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-segment-button[id=\"seg3\"]')[" + i + "]").click();
					tabClicked = true;
					break;
				} catch (Exception e) {
					if (j == 20) {
						break;
					}

				}
				if (i == premitiveLength && tabClicked == false) {
					Assert.fail("Facility Tab is not clicked");
				}

			}
		}
	}

	@And("user_076 click on add button in facility info screen at new app stage")
	public void user_076_click_on_add_button_in_facility_info_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_info_add_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@And("user_076 click on add button in facility info screen at app data entry stage")
	public void user_076_click_on_add_button_in_facility_info_screen_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_info_add_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@And("user_076 click on facility details tab in app data entry stage")
	public void user_076_click_on_facility_details_tab_in_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_info_tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify facility info screen should have save and back button at new app stage")
	public void user_076_verify_facility_info_screen_should_have_save_and_back_button_at_new_app_stage()
			throws Throwable {
		boolean isSaveButtonVisible = false;
		boolean isBackButtonVisible = false;
		for (int i = 0; i <= 60; i++) {
			try {
				isSaveButtonVisible = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).isDisplayed();

				break;
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 60; i++) {
			try {

				isBackButtonVisible = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("back_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isBackButtonVisible, "Back button is not visible hence failed");
		softAssert.assertTrue(isSaveButtonVisible, "save button is not visible hence failed");

	}

	@Then("user_076 verify clasification field should be editable dropdown at in facility info screen")
	public void user_076_verify_clasification_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("Clsification"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "Clasification field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"Clasification field is not a mandatory field hence failed");

	}

	@Then("user_076 verify product field should be editable dropdown at in facility info screen")
	public void user_076_verify_product_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("Product"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "product field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"), "product field is not a mandatory field hence failed");
	}

	@Then("user_076 verify scheme field should be editable dropdown at in facility info screen")
	public void user_076_verify_scheme_field_should_be_editable_dropdown_at_in_facility_info_screen() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("scheme_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("scheme_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("scheme_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("scheme"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "scheme field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"), "scheme field is not a mandatory field hence failed");
	}

	@Then("user_076 verify program code field should be editable dropdown at in facility info screen")
	public void user_076_verify_program_code_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("program_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("program_code_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("program_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("program_code"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "program code field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"program code field is not a mandatory field hence failed");
	}

	@Then("user_076 verify facility type field should be editable dropdown at in facility info screen")
	public void user_076_verify_facility_type_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_type_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_type_code_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_type_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("facility_type"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "Facility type code field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"Facility type code field is not a mandatory field hence failed");
	}

	@Then("user_076 verify servicing branch field should be editable dropdown at in facility info screen")
	public void user_076_verify_servicing_branch_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {

		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		String fieldEditableCheckQuery = "document.querySelector('digital-select-layout[id=\"location\"]').getAttribute('ng-reflect-readonly')";
		String editableStatus = "";
		for (int i = 0; i <= 40; i++) {
			try {
				editableStatus = javascriptHelper.executeScript("return " + fieldEditableCheckQuery).toString();
				if (editableStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		if (editableStatus.equals("false")) {
			for (int i = 0; i <= 60; i++) {
				try {
					fieldTypeValidation = javascriptHelper
							.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
							.getAttribute("ng-reflect-placeholder");
					mandatoryValidation = javascriptHelper
							.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
							.getAttribute("aria-label");
					if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 60) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 10; i++) {
				try {
					javascriptHelper
							.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 10) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("servicing_branch"));
			softAssert.assertTrue(fieldTypeValidation.contains("Select"), "servicing branch field is not a dropdown");
			softAssert.assertTrue(mandatoryValidation.contains("*"),
					"servicing branch field is not a mandatory field hence failed");
		} else {
			softAssert.fail("Servicing branch field is not in editable status hence failed");
		}

	}

	@Then("user_076 verify pricing or interest indector field should be editable dropdown at in facility info screen")
	public void user_076_verify_pricing_or_interest_indector_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("pricing_indecator_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("pricing_indecator_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("pricing_indecator_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("pricing_or_interest_indecator"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "Pricing indecator field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"Pricing indecator field is not a mandatory field hence failed");
	}

	@Then("user_076 verify declared downpayment amount field should be editable dropdown at in facility info screen")
	public void user_076_verify_declared_downpayment_amount_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 40; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("downpayment_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("downpayment_amount_input"))
						.getAttribute("type");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("downpayment_amount_input"))
						.sendKeys(newApplicationTestData.get("declared_downpayment_amount"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"Downpayment amount field is not a mandatory hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"Downpayment amount field is not a textbox hence failed");
	}

	@Then("user_076 verify requested amount field should be editable dropdown at in facility info screen")
	public void user_076_verify_requested_amount_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 40; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("amount_requested_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.getAttribute("type");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.sendKeys(newApplicationTestData.get("requested_amount"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Requested amount field type " + fieldTypeValidation);
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"Amount Requested field is not a mandatory hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"Amount Requested field is not a textbox hence failed");
	}

	@Then("user_076 verify currency field should be editable dropdown at in facility info screen")
	public void user_076_verify_currency_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 60; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("curency_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("curency_code_dropdown"))
						.getAttribute("aria-label");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 60) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("curency_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("currency"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "Currency field is not a dropdown");
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				"Currency field is not a mandatory field hence failed");
	}

	@Then("user_076 verify loan tenure field should be editable dropdown at in facility info screen")
	public void user_076_verify_loan_tenure_field_should_be_editable_dropdown_at_in_facility_info_screen()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 40; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + applicationDetailsElements.getElement("loan_tenure_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.getAttribute("type");
				if ((mandatoryValidation.length() > 0) || (fieldTypeValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.sendKeys(newApplicationTestData.get("loan_tenure"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryValidation.contains("*"), "Loan tenure field is not a mandatory hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"Loan tenure field field is not a textbox hence failed");
	}

	@And("user_076 click on save button in facility info screen at new app")
	public void user_076_click_on_save_button_in_facility_info_screen_at_new_app() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {

				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the save success message for facility info screen")
	public void user_076_verify_system_should_show_the_save_success_message_for_facility_info_screen()
			throws Throwable {
		String saveSuccessMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveSuccessMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (!(saveSuccessMessage.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveSuccessMessage);
		Assert.assertTrue(saveSuccessMessage.contains("Success! Record created with ID"));
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						CommonJsElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on edit button in facility list view")
	public void user_076_click_on_edit_button_in_facility_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("list_view_edit_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the asset value in facility details screen")
	public void user_update_the_asset_value_in_facility_details_screen() throws Throwable {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("asset_price_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("asset_price_input"))
						.sendKeys(newApplicationTestData.get("asset_price"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the loan tenure field in facility details screen")
	public void user_076_update_the_loan_tenure_field_in_facility_details_screen() throws Throwable {
		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.sendKeys(newApplicationTestData.get("loan_tenure"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the amount requested field in facility details screen")
	public void user_076_update_the_amount_requested_field_in_facility_details_screen() throws Throwable {
		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.sendKeys(newApplicationTestData.get("requested_amount"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on update button in facility details screen")
	public void user_076_click_on_update_button_in_facility_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {

				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 should get update validation while update the facility details record")
	public void user_076_should_get_update_validation_while_update_the_facility_details_record() throws Throwable {
		String saveSuccessMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveSuccessMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (!(saveSuccessMessage.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveSuccessMessage);
		Assert.assertTrue(saveSuccessMessage.contains("Success! Record updated"));
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						CommonJsElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify facility tenure field should get updated at new app stage")
	public void user_076_verify_facility_tenure_field_should_get_updated_at_new_app_stage() throws Throwable {
		String updatedTenure = "";
		for (int i = 0; i <= 150; i++) {
			try {
				updatedTenure = javascriptHelper
						.executeScript("return " + applicationDetailsElements.getElement("list_view_tenure_amount"))
						.toString();
				if (updatedTenure.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(updatedTenure, newApplicationTestData.get("loan_tenure"),
				"Loan tenure not getting updated with new data hence failed");

	}

	@Then("user_076 verify facility requested amount field should get updated at new app stage")
	public void user_076_verify_facility_requested_amount_field_should_get_updated_at_new_app_stage() throws Throwable {
		String updatedRequestedAmt = "";
		for (int i = 0; i <= 150; i++) {
			try {
				updatedRequestedAmt = javascriptHelper
						.executeScript("return " + applicationDetailsElements.getElement("list_view_amount_requested"))
						.toString();
				if (updatedRequestedAmt.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(updatedRequestedAmt, newApplicationTestData.get("requested_amount"),
				"Requested Amount not getting updated with new data hence failed");
	}

	@And("user_076 click on save button without entering mandatory details at facility details screen")
	public void user_076_click_on_save_button_without_entering_mandatory_details_at_facility_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {

				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify facility details screen should show the blank field validation at new app stage")
	public void user_076_verify_facility_details_screen_should_show_the_blank_field_validation_at_new_app_stage()
			throws Throwable {

		String validationMessage = "";
		for (int i = 0; i < 300; i++) {
			try {
				validationMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_message")).toString();
				if (validationMessage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Toast Message " + validationMessage);
		softAssert.assertEquals(validationMessage, "Please fill all the details",
				"System is not showing the validation message");
	}

	@And("user_076 enter character input in tenure months input in facility details")
	public void user_076_enter_character_input_in_tenure_months_input_in_facility_details() throws Throwable {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.sendKeys(newApplicationTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify tenure months field should not accept the facility details")
	public void user_076_verify_tenure_months_field_should_not_accept_the_facility_details() throws Throwable {
		String getLoanTenure = "";
		for (int i = 0; i <= 10; i++) {
			try {
				getLoanTenure = javascriptHelper
						.executeScript("return " + applicationDetailsElements.getElement("get_loan_tenure_value")).toString();
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(getLoanTenure.length() <= 0, "Loan tenure accepts character input hence failed");
	}

	@And("user_076 enter special character input in amount requested in facility details")
	public void user_076_enter_special_character_input_in_amount_requested_in_facility_details() throws Throwable {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.sendKeys(newApplicationTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify amount requested field should not accept special character in facility details")
	public void user_076_verify_amount_requested_field_should_not_accept_special_character_in_facility_details()
			throws Throwable {
		String getRequestedAmt = "";
		for (int i = 0; i <= 10; i++) {
			try {
				getRequestedAmt = javascriptHelper
						.executeScript("return " + applicationDetailsElements.getElement("get_requested_amount_value"))
						.toString();
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(getRequestedAmt.length() <= 0, "amount requested accepts character input hence failed");
	}

	@And("user_076 click on back button in facility details screen at new app stage")
	public void user_076_click_on_back_button_in_facility_details_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("back_button")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify facility details screen should get move previous screen at new app stage")
	public void user_076_verify_facility_details_screen_should_get_move_previous_screen_at_new_app_stage() {
		boolean isAddButtonVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isAddButtonVisible = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_info_add_button"))
						.isDisplayed();
				if (isAddButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isAddButtonVisible, "Back button is not working hence failed");

	}

	@And("user_076 click on search button in facility list view in new app stage")
	public void user_076_click_on_search_button_in_facility_list_view_in_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("user_076 search the valid search text in facility details list view")
	public void user_076_search_the_valid_search_text_in_facility_details_list_view() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(newApplicationTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("user_076 verify facility list view search result should be visible")
	public void user_076_verify_facility_list_view_search_result_should_be_visible() throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("list_view_search_result")).toString();
				if (!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Search Result " + searchResult);
		// Showing 0 to 0 of 0 entries

		softAssert.assertTrue(!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")));
	}

	@And("user_076 search the invalid search text in facility details list view")
	public void user_076_search_the_invalid_search_text_in_facility_details_list_view() throws Throwable {
		for (int i = 0; i < 3; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(newApplicationTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("user_076 verify facility list view search result should not be visible")
	public void user_076_verify_facility_list_view_search_result_should_not_be_visible() throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("list_view_search_result")).toString();
				if (searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Search Result " + searchResult);
		softAssert.assertTrue(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	}

	@And("user_076 click on export button in faciliy details list view")
	public void user_076_click_on_export_button_in_faciliy_details_list_view() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_export_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on pdf option export the facility details content")
	public void user_076_click_on_pdf_option_export_the_facility_details_content() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify pdf file is downloaded for facility details")
	public void user_076_verify_pdf_file_is_downloaded_for_facility_details() throws Throwable {

		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("FacilityDetailsDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("FacilityDetailsDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xlsx option export the facility details content")
	public void user_076_click_on_xlsx_option_export_the_facility_details_content() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify xlsx file is downloaded for facility details")
	public void user_076_verify_xlsx_file_is_downloaded_for_facility_details() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("FacilityDetailsDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("FacilityDetailsDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();

			}
		}
	}

	@Then("user_076 verify facility info list view should be read only mode")
	public void user_076_verify_facility_info_list_view_should_be_read_only_mode() throws Throwable {
		boolean isEditable = true;
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("list_view_non_editable_field"))
						.sendKeys("ABCDEF");
			} catch (Exception e) {
				if (i == 300) {
					isEditable = true;
				}
			}
		}
		softAssert.assertTrue(isEditable, "List view field is editable henece failed");
	}

	@Then("user_076 facility info list view should have configured list view fields")
	public void user_076_facility_info_list_view_should_have_configured_list_view_fields() throws Throwable {
		String listViewFieldName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewFieldName = javascriptHelper
						.executeScript("return " + applicationDetailsElements.getElement("list_view_header_field_name"))
						.toString();
				if (listViewFieldName.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Field Name " + listViewFieldName);
	}

	@Then("user_076 verify facility info screen should have add button")
	public void user_076_verify_facility_info_screen_should_have_add_button() throws Throwable {
		boolean isAddButtonVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isAddButtonVisible = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("facility_info_add_button"))
						.isDisplayed();
				if (isAddButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isAddButtonVisible, "Add button not visible hence failed");
	}

	@Then("user_076 verify facility info screen should have export button")
	public void user_076_verify_facility_info_screen_should_have_export_button() throws Throwable {
		boolean isExportButtonVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isExportButtonVisible = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("list_view_export_button"))
						.isDisplayed();
				if (isExportButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isExportButtonVisible, "Export button not visible hence failed");
	}

	@Then("user_076 verify facility info screen should have edit button")
	public void user_076_verify_facility_info_screen_should_have_edit_button() throws Throwable {
		boolean isEditButtonVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isEditButtonVisible = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("list_view_edit_button"))
						.isDisplayed();
				if (isEditButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isEditButtonVisible, "Edit button not visible hence failed");
	}

	@When("user_076 click on edit button in facility info screen")
	public void user_076_click_on_edit_button_in_facility_info_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("list_view_edit_button"))
						.click();

				break;

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify facility info screen should get opened")
	public void user_076_verify_facility_info_screen_should_get_opened() throws Throwable {
		boolean isEditScreenWorking = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isEditScreenWorking = javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.isDisplayed();
				if (isEditScreenWorking == true) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isEditScreenWorking, "Edit screen is not working hence failed");
	}

	@And("user_076 invoke soft assert in facility info screen")
	public void user_076_invoke_soft_assert_in_facility_info_screen() throws Throwable {
		softAssert.assertAll();
	}
	@And("update the status to Inactive in Facility Info page")
	public void update_the_status_to_inactive_in_facility_info_page() {
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("status_toggle_button")));
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("status_toggle_button")).click();
				break;
			} catch (Exception e) { 
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   
	}

	@And("Validate that Classification field is present in Facility Info view list")
	public void validate_that_classification_field_is_present_in_facility_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("classification_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("classification_ViewList")).isDisplayed());
	   
	}

	@And("Validate that Product field is present in Facility Info view list")
	public void validate_that_product_field_is_present_in_facility_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("Product_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("Product_ViewList")).isDisplayed());
	   
	}

	@And("Validate that Tenure field is present in Facility Info view list")
	public void validate_that_tenure_field_is_present_in_facility_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("Tenure_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("Tenure_ViewList")).isDisplayed());
	   
	}

	@And("Validate that Requested Amount field is present in Facility Info view list")
	public void validate_that_requested_amount_field_is_present_in_facility_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("RequestedAmount_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("RequestedAmount_ViewList")).isDisplayed());
	   
	}

	@And("Validate that Status field is present in Facility Info view list")
	public void validate_that_status_field_is_present_in_facility_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("Status_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("Status_ViewList")).isDisplayed());
	   
	}
	@And("Remove the values in any required field in facility details screen")
	public void remove_the_values_in_any_required_field_in_facility_details_screen() {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input")).click();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input")).clear();
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Update character input in tenure months input in facility details")
	public void update_character_input_in_tenure_months_input_in_facility_details() {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input")).clear();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("loan_tenure_input"))
						.sendKeys(newApplicationTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Update special character input in amount requested in facility details")
	public void update_special_character_input_in_amount_requested_in_facility_details() {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input")).clear();
				javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("amount_requested_input"))
						.sendKeys(newApplicationTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

}
