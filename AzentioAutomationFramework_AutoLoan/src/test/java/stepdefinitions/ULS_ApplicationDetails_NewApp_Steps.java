package stepdefinitions;

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
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ULS_ApplicationDetails_NewApp_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	String excelFilePathForJS = configFileReader.getJSFilePath();
	String applicationDetailsExcelDataPath = configFileReader.getTestDataFilePath();
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths customerSearchJSPaths = new JSPaths(excelFilePathForJS, "customer_search_JS",
			"Ijarah_customer_search_fieldName", "JSPath");
	JSPaths applicationDetailsElements = new JSPaths(excelFilePathForJS, "newApp_AppllicationDetailsJS",
			"Ijarah_NewApp_fieldName", "JSPath");

	BrowserHelper browserHelper = new BrowserHelper(driver);

	

	
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData excelDataForApplicationDetailsTestDataForAutoLoan = new ExcelData(
			configFileReader.getAutoLoanTestDataFilePath(), "ApplicationDetails_NewApp", "Dataset ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> newApplicationTestData = new HashMap<>();
	Map<String, String> newApplicationExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSElements = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	String toastMessage = "";
	SoftAssert softAssert = new SoftAssert();
	SoftAssert updateSoftAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";

	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());

	}



	// Auto Loan
	@And("user_076 get the test data for test case id AT_AL_APPDETAILS_01")
	public void user_076_get_the_test_data_for_test_case_id_AT_AL_APPDETAILS_01() throws Throwable {
		newApplicationExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_APPDETAILS_01");
		System.out.println("Data Set ID " + newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = excelDataForApplicationDetailsTestDataForAutoLoan
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_AL_APPDETAILS_02")
	public void user_076_get_the_test_data_for_test_case_id_AT_AL_APPDETAILS_02() throws Throwable {
		newApplicationExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_APPDETAILS_02");
		System.out.println("Data Set ID " + newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = excelDataForApplicationDetailsTestDataForAutoLoan
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_AL_APPDETAILS_03")
	public void user_076_get_the_test_data_for_test_case_id_AT_AL_APPDETAILS_03() throws Throwable {
		newApplicationExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_APPDETAILS_03");
		System.out.println("Data Set ID " + newApplicationExecutionData.get("dataSet_ID"));
		newApplicationTestData = excelDataForApplicationDetailsTestDataForAutoLoan
				.getTestdata(newApplicationExecutionData.get("dataSet_ID"));
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

	@And("user_076 search the auto loan new app record in mail box")
	public void user_076_search_the_auto_loan_new_app_record_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getAutoLoanReferenceNumber());
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
					if (recordRefNumber.equals(configFileReader.getAutoLoanReferenceNumber())) {
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

	@Then("user_076 verify system should save the record of application details new app")
	public void user_076_verify_system_should_save_the_record_of_application_details_new_app() throws Throwable {

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
		softAssert.assertTrue(toastMessage.contains("Success"), "Record is not saved hence failed");
		toastMessageForReferenceNumber = toastMessage;
		System.out.println(toastMessage);
	}

	@And("user_076 store the record reference number in Ijarah new app screens")
	public void user_076_store_the_record_reference_number_in_ijarah_new_app_screens() throws Throwable {
		String extractedReferenceNumber = toastMessage.substring(37);
		System.out.println("Reference Number " + extractedReferenceNumber);
		configFileReader.setJarahRecordReferenceNumber(extractedReferenceNumber);

	}

	@And("user_076 store the murabaha record reference number to test new app screens")
	public void user_076_store_the_murabaha_record_reference_number_to_test_new_app_screens() throws Throwable {
		String extractedReferenceNumber = toastMessage.substring(37);
		System.out.println("Reference Number " + extractedReferenceNumber);
		configFileReader.setMurabahaRecordReferenceNumber(extractedReferenceNumber);
	}

	@And("user_076 store the auto loan record reference number to test new app screens")
	public void user_076_store_the_auto_loan_record_reference_number_to_test_new_app_screens() throws Throwable {
		String extractedReferenceNumber = toastMessage.substring(37);
		System.out.println("Reference Number " + extractedReferenceNumber);
		configFileReader.SetAutoLoanReferenceNumber(extractedReferenceNumber);
	}

	@And("user_076 store the tawruqq record reference number to test new app screens")
	public void user_076_store_the_tawruqq_record_reference_number_to_test_new_app_screens() throws Throwable {
		String extractedReferenceNumber = toastMessage.substring(37);
		System.out.println("Reference Number " + extractedReferenceNumber);
		configFileReader.setTawruqqRecordReferenceNumber(extractedReferenceNumber);
	}



	@And("user_076 extract the application details record reference number in new app stage for auto loan")
	public void user_076_extract_the_application_details_record_reference_number_in_new_app_stage_for_auto_loan()
			throws Throwable {
		String finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(36).trim();
		System.out.println("Final reference number " + finalRecordReferenceNumber);
		excelDataForApplicationDetailsTestDataForAutoLoan.updateTestData(newApplicationTestData.get("Dataset ID"),
				"record_reference_number", finalRecordReferenceNumber);
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
		for (int i = 0; i <= 300; i++) {
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

	@And("user_076 change the record active if its inactive and change inactive if active record")
	public void user_076_change_the_record_active_if_its_inactive_and_change_inactive_if_active_record()
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

	@And("user_076 update the sourcing staff while open the new app record")
	public void user_update_the_sourcing_staff_while_open_the_new_app_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_staff_dropdown")));
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
		clicksAndActionsHelper.jsSelectUsingText(newApplicationTestData.get("sourcing_staff"));
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

}
