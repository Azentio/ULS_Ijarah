package stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_AddressDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	MurabhaLogin ijaraLogin = new MurabhaLogin();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getMurabhaTestDataFilePath();
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJSPaths = new JSPaths(excelPath, "Murabha_CommonElements", "Murabha_CommonFieldName", "JSPath");
	ExcelData excelDataForAddressDetailsTestData = new ExcelData(excelTestDataPath, "ijarah_AddressDetailsTestData",
			"Dataset ID");
	ExcelData excelDataForAddressDetailsExecutionData = new ExcelData(excelTestDataPath,
			"Ijarah_ExecutionTracker", "TestCase ID");

	Map<String, String> addressDetailsTestData = new HashMap<>();
	Map<String, String> addressDetailsExecutionData = new HashMap<>();
	JSPaths addressDetailsJSPaths = new JSPaths(excelPath, "addressdetails_WebElements",
			"Ijarah_AddressDetailsFieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	Robot robot;
	int sectionIndex;

	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());

	}
	@Given("navigate the MURABHA URL")
	public void navigate_the_murabha_url() {
		driver.get(configFileReader.getMurabhaApplicationURL());
	}

	@And("login with valid credentials for new application stage")
	public void login_with_valid_credentials_for_new_application_stage() throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType01");
	}
	@Given("login with valid credentials-Data Check")
	public void login_with_valid_credentials_data_check() {
		ijaraLogin.loginWithMurabhaApplication("userType06");
	}
	@And("user_626 login with valid credentials")
	public void user_626_login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType09");
	}
	@Given("login with valid credentials02")
	public void login_with_valid_credentials02() {
		ijaraLogin.loginWithMurabhaApplication("userType06");
	}
	@And("login with valid credentials07") // Ijara AppDataCheck InsuranceInfo
	public void login_with_valid_credentials07() throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType07");
	}
	@And("login with valid credentials")
	public void login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType09");
	}
	@Given("login with valid credentials for ijara offer details")
	public void login_with_valid_credentials_for_ijara_offer_details() {
		ijaraLogin.loginWithMurabhaApplication("userType13");
	}
	@And("login with valid credentials-Underwriter")
	public void login_with_valid_credentials_underwriter()throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType09");
	}
	@And("login with valid credentials for insurance info ijarah")
	public void login_with_valid_credentials_for_insurance_info_ijarah() {
		ijaraLogin.loginWithMurabhaApplication("userType05");
	}
	@And("login with valid credentials for living expense ijarah")
	public void login_with_valid_credentials_for_living_expense_ijarah() {
		ijaraLogin.loginWithMurabhaApplication("userType05");
	}
	@And("User_6047 login with valid credentials")
	public void User_6047_login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType10");
	}

	@And("login with valid credential1s")
	public void login_with_valid_credentials1() throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType10");
	}
	@And("login with valid credentials-Offering")
	public void login_with_valid_credentials_offering()throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType09");
	}
	@And("login with valid credentials2")
	public void login_with_valid_credentials2() {
		ijaraLogin.loginWithMurabhaApplication("userType14");
	}
	@And("login with valid credentials-Contract Signing")
	public void login_with_valid_credentials_contract_signing()throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType15");
	}
	
	@Then("logout from the ULS Application")
	public void logout_from_the_ULS_application() throws Throwable {
		ijaraLogin.logoutFromMurabha();
	}
	
//	Murabaha Product -- App Data Entry Stage ---> UserType06
	@And("login with valid credentials-Murabaha App Data Entry")
	public void login_with_valid_credentials_murabaha_app_data_entry()throws Throwable {
		ijaraLogin.loginWithMurabhaApplication("userType16");
	}
	@Given("login with valid credentials-Murabaha Data Check stage")
	public void login_with_valid_credentials_murabaha_data_check_stage() {
		ijaraLogin.loginWithMurabhaApplication("userType18");

	}
	@And("login with valid credentials17")
	public void login_with_valid_credentials17() {
		ijaraLogin.loginWithMurabhaApplication("userType17");
	}

	@And("click on module dropdown in Murabha")
	public void click_on_module_dropdown_in_Murabha() throws Throwable {
		String moduleName = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleName = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("module_dropdown") + ".textContent")
						.toString();
				System.out.println("Module Name " + moduleName);
				if ((!moduleName.isBlank())) {
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
				if (!(moduleLength.isBlank()) && !(moduleLength.equalsIgnoreCase("0"))) {

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
				if (i > 50) {
					javascriptHelper.JSEClick(javascriptHelper
							.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button")));
					break;
				}
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

	@And("search the record reference number in search text box")
	public void search_the_record_reference_number_in_search_text_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 100; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(addressDetailsTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("select the record form mail box")
	public void select_the_record_form_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 100; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(addressDetailsTestData.get("record_reference_number"))) {
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

	@And("click on additional customer info tab")
	public void click_on_additional_customer_info_tab() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("additonal_customer_info"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click edit button of customer personal information record")
	public void click_edit_button_of_customer_personal_information_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("customer_personal_info_edit_icon")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on add button of address details")
	public void click_on_add_button_of_address_details() throws Throwable {
		// document.querySelectorAll('ion-title[class="pl-2 pr-2 ion-color
		// ion-color-dark md title-default hydrated"]').length
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 100; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}

			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Address Details").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}

		}

	}

	@And("get the test data for test case ID AT_AD_001")
	public void get_the_test_data_for_test_case_id_at_AT_AD_001() throws Throwable {

		addressDetailsExecutionData = excelDataForAddressDetailsExecutionData.getTestdata("AT_AD_001");
		addressDetailsTestData = excelDataForAddressDetailsTestData
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));

	}

	@And("get the test data for test case ID AT_AD_002")
	public void get_the_test_data_for_test_case_id_at_AT_AD_002() throws Throwable {
		addressDetailsExecutionData = excelDataForAddressDetailsExecutionData.getTestdata("AT_AD_002");
		addressDetailsTestData = excelDataForAddressDetailsTestData
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));

	}

	@And("get the test data for test case ID AT_AD_003")
	public void get_the_test_data_for_test_case_id_at_AT_AD_003() throws Throwable {
		addressDetailsExecutionData = excelDataForAddressDetailsExecutionData.getTestdata("AT_AD_003");
		addressDetailsTestData = excelDataForAddressDetailsTestData
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));

	}

	@And("get the test data for test case ID AT_AD_005")
	public void get_the_test_data_for_test_case_id_at_AT_AD_005() throws Throwable {
		addressDetailsExecutionData = excelDataForAddressDetailsExecutionData.getTestdata("AT_AD_005");
		addressDetailsTestData = excelDataForAddressDetailsTestData
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));

	}

	@And("get the test data for test case ID AT_AD_006")
	public void get_the_test_data_for_test_case_id_at_AT_AD_007() throws Throwable {
		addressDetailsExecutionData = excelDataForAddressDetailsExecutionData.getTestdata("AT_AD_006");
		addressDetailsTestData = excelDataForAddressDetailsTestData
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));

	}

	@Then("verify save buttton and back button should visible in address details screen")
	public void verify_save_buttton_and_back_button_should_visible_in_address_details_screen() throws Throwable {
		boolean saveButtonStatus = false;
		boolean backButtonStatus = false;
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println("Save Button Query " + commonJSPaths.getElement("save_button"));
				saveButtonStatus = javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				backButtonStatus = javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(saveButtonStatus);
		Assert.assertTrue(backButtonStatus);

	}

	@Then("verify address type field should be mandatory and dropdown and editable")
	public void verify_address_type_field_should_be_mandatory_and_dropdown_and_editable() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type"))
						.getAttribute("aria-label").contains("*"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type"))
						.getAttribute("aria-label").contains("Select"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("address_type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("address_type")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@Then("verify address status field should be mandatory and dropdown and editable")
	public void verify_address_status_field_should_be_mandatory_and_dropdown_and_editable() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_status"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_status"))
						.getAttribute("aria-label").contains("*"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_status"))
						.getAttribute("aria-label").contains("Select"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("address_status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("address_status")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@Then("verify residential or occupancy status field should should be dropdown and editable")
	public void verify_residential_or_occupancy_status_field_should_should_be_dropdown_and_editable() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("residential_or_ocupency_status"))
						.click();
				softAssert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("residential_or_ocupency_status"))
						.getAttribute("aria-label").contains("*"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(addressDetailsJSPaths.getElement("residential_or_ocupency_status"))
				.getAttribute("aria-label").contains("Select"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("residential_or_occupansy_status").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((addressDetailsTestData.get("residential_or_occupansy_status")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@Then("verify communication address should be non mandatory and editable")
	public void verify_communication_address_should_be_non_mandatory_and_editable() throws Throwable {

	}

	@Then("verify location address should be mandatory and editable lookup")
	public void verify_location_address_should_be_mandatory_and_editable_lookup() throws Throwable {

	}

	@Then("verify location category should be mandatory and editable lookup")
	public void verify_location_category_should_be_mandatory_and_editable_lookup() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("location_category"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("location_category"))
						.getAttribute("aria-label").contains("*"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("location_category"))
						.getAttribute("aria-label").contains("Select"));
		// addressDetailsTestData.get("location_category")

		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("location_category"));
		System.out.println("Location category dropdown got entered");
	}

	@Then("verify address line 1 should be mandatory editable text box")
	public void verify_address_line_1_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println("Debug address line one field");
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("address_line_1"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("address_line1_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					softAssert.fail("address line 1 is a non mandatroy field hence failed");
				}

			}
		}

	}

	@Then("verify address line 2 should be mandatory editable text box")
	public void verify_address_line_2_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line2")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line2")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line2"))
						.sendKeys(addressDetailsTestData.get("address_line_2"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScript("return " + addressDetailsJSPaths.getElement("address_line2"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					softAssert.fail("address line 2 is a non mandatroy field hence failed");
				}

			}
		}
	}

	@Then("verify country should be editable mandatory text box")
	public void verify_country_should_be_editable_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("country")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("country"))
				.getAttribute("aria-label").contains("*"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("country").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("country")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@Then("verify provience ID field should be mandatory editable text box")
	public void verify_provience_id_field_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("province_id")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("province_id"))
						.getAttribute("aria-label").contains("*"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("provience_id").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("provience_id")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@Then("verify Neighbourhood\\/District name field should be mandatory editable text box")
	public void verify_neighbourhood_district_name_field_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("district_name")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("district_name")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("district_name"))
						.sendKeys(addressDetailsTestData.get("district_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("district_name_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					softAssert.fail("district name is a non mandatroy field hence failed");
				}

			}
		}

	}

	@Then("verify city field should be editable mandatory text box")
	public void verify_city_field_should_be_editable_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("city")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("city")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("city"))
				.getAttribute("aria-label").contains("*"));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("city").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("city")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@Then("verify zipcode field should be editable mandatory textbox")
	public void verify_zipcode_field_should_be_editable_mandatory_textbox() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("zip_code")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("zip_code")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("zip_code"))
						.sendKeys(addressDetailsTestData.get("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScript("return " + addressDetailsJSPaths.getElement("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					softAssert.fail("zip code is a non mandatroy field hence failed");
				}

			}
		}
	}

	@Then("verify po box number field should be editable non mandatory text box")
	public void verify_po_box_number_field_should_be_editable_non_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number"))
						.sendKeys(addressDetailsTestData.get("po_box_number"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("po_box_number_mandatory_verification"));
				if (i == 100) {
					if (poBoxNumberObject != null) {
						softAssert.fail("po box number field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}

	}

	@Then("verify duration of stay should be non mandatory editable text numeric field")
	public void verify_duration_of_stay_should_be_non_mandatory_editable_text_numeric_field() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("duration_on_stay")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("duration_on_stay"))
						.click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("duration_on_stay"))
						.sendKeys(addressDetailsTestData.get("duration_on_stay"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("duration_on_stay_mandatory_verification"));
				if (i == 100) {
					if (poBoxNumberObject != null) {
						softAssert
								.fail("duration on stay field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify latitude details should be non mandatory editable text box")
	public void verify_latitude_details_should_be_non_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("latitude_details_of_the_address")));
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("latitude_details_of_the_address")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								addressDetailsJSPaths.getElement("latitude_details_of_the_address"))
						.sendKeys(addressDetailsTestData.get("latitude_details"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return "
						+ addressDetailsJSPaths.getElement("latitude_details_of_the_address_mandatory_verification"));
				if (i == 100) {
					if (poBoxNumberObject != null) {
						softAssert
								.fail("latitude details field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify longitude details should be non mandatory editable text box")
	public void verify_longitude_details_should_be_non_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("longitude_details_of_the_address")));
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("longitude_details_of_the_address")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								addressDetailsJSPaths.getElement("longitude_details_of_the_address"))
						.sendKeys(addressDetailsTestData.get("longitude_details"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return "
						+ addressDetailsJSPaths.getElement("longitude_details_of_the_address_mandatory_verification"));
				if (i == 100) {
					if (poBoxNumberObject != null) {
						softAssert
								.fail("longitude details field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify landmark details should be non mandatory editable text box")
	public void verify_landmark_details_should_be_non_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landmark")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landmark")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landmark"))
						.sendKeys(addressDetailsTestData.get("land_mark"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object landmark = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("landmark_mandatory_verifcation"));
				if (i == 100) {
					if (landmark != null) {
						softAssert.fail("landmark field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify Occupancy date should be non mandatory editable calendar")
	public void verify_occupancy_date_should_be_non_mandatory_editable_calendar() throws Throwable {
		System.out.println("today Date " + commonJSPaths.getElement("today_date"));
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("occupency_date")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("occupency_date"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object occupancyDate = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("occupency_date_mandatory_verification"));
				if (i == 100) {
					if (occupancyDate != null) {
						softAssert.fail("occupancyDate field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify land lord name should be non mandatory editable text box")
	public void verify_land_lord_name_should_be_non_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_name")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_name")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_name"))
						.sendKeys(addressDetailsTestData.get("land_lord_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object landlordName = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("landlord_name_Mandatory_verification"));
				if (i == 100) {
					if (landlordName != null) {
						softAssert.fail("landlordName field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify land lord mobile number should be non mandatory editable numeric")
	public void verify_land_lord_mobile_number_should_be_non_mandatory_editable_numeric() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_mobile_number")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_mobile_number"))
						.click();
				System.out.println(addressDetailsTestData.get("land_lord_mobile_number"));
				Double d = Double.valueOf(addressDetailsTestData.get("land_lord_mobile_number"));
				String mobileNumber = String.format("%.0f", d);
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_mobile_number"))
						.sendKeys(mobileNumber);
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object landlordMobileNumber = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("landlord_mobile_number_mandatory_verification"));
				if (i == 100) {
					if (landlordMobileNumber != null) {
						softAssert.fail(
								"landlordMobileNumber field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("verify rent amount should be non mandatory editable numeric")
	public void verify_rent_amount_should_be_non_mandatory_editable_numeric() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("rent_amount")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("rent_amount")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("rent_amount"))
						.sendKeys(addressDetailsTestData.get("rent_amount"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				Object rentAmount = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("rent_amount_mandatory_verification"));
				if (i == 100) {
					if (rentAmount != null) {
						softAssert.fail("rentAmount field should be non mandatory but here it is mandatory field");
					}
				}

			} catch (Exception e) {

			}
		}

	}

	@Then("verify frequency rent should be non mandatory editable dropdown")
	public void verify_frequency_rent_should_be_non_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(
				!(javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent"))
						.getAttribute("aria-label").contains("*")));

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 100; l++) {
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
					if (l == 100 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + addressDetailsTestData.get("frequency_of_rent").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("frequency_of_rent")).trim())) {

				for (int k = 0; k <= 100; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 100) {
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

	@And("click on save button in address details screen")
	public void click_on_save_button_in_address_details_screen() throws Throwable {

		for (int i = 0; i <= 100; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	@And("click on save button in application details screen")
	public void click_on_save_button_in_application_details_screen() throws Throwable {

		for (int i = 0; i <= 100; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on save button without enter mandatory data")
	public void click_on_save_without_enter_mandatory_data() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent"))
						.sendKeys(Keys.PAGE_UP);

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				// save_button
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the validation for mandatory field")
	public void verify_system_should_show_the_validation_for_mandatory_field() throws Throwable {
		String toastContent = "";
		for (int i = 0; i <= 100; i++) {
			try {
				toastContent = javascriptHelper.executeScript("return " + commonJSPaths.getElement("toast_message"))
						.toString();
				System.out.println(toastContent);
				if (!(toastContent.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Please fill all the details", toastContent);
	}

	@And("enter the special character input in any of the field")
	public void enter_the_special_character_input_in_any_of_the_field() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the validation for special character input")
	public void verify_system_should_show_the_validation_for_special_character_input() throws Throwable {
		String specialCharacterValidation = "";
		for (int i = 0; i <= 100; i++) {
			try {
				specialCharacterValidation = javascriptHelper
						.executeScript("return "
								+ addressDetailsJSPaths.getElement("address_line_1_special_character_validation"))
						.toString();
				System.out.println(specialCharacterValidation);
				if (!(specialCharacterValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Special character not allowed".trim(), specialCharacterValidation.trim());
	}

	@And("enter the character inputs in numeric field")
	public void enter_the_character_inputs_in_numeric_field() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number"))
						.sendKeys(addressDetailsTestData.get("characterInput"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should not accept the character input in numeric field")
	public void verify_system_should_not_accept_the_character_input_in_numeric_field() throws Throwable {
		String poBoxNumber = "";
		for (int i = 0; i <= 50; i++) {
			try {
				poBoxNumber = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("po_box_number") + ".textContent")
						.toString();

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Assert.assertEquals(poBoxNumber, "");
	}

	@Given("click on edit button on created record of address details")
	public void click_on_edit_button_on_created_record_of_address_details() throws Throwable {
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + "].querySelector('tbody button[icon=\"pi pi-pencil\"]')");
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
								+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')")
						.click();
				isClicked = true;
				break;

			}
			if (isClicked == true)

			{
				break;
			}
		}

	}

	@And("update the any of the field in address details record")
	public void update_the_any_of_the_field_in_address_details_record() throws Throwable {
		String addressDetailsLength = "";
		for (int i = 0; i <= 100; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isBlank()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveAddressDetailsLength = addressDetailsLength.length();
		for (int i = 0; i <= premitiveAddressDetailsLength; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(Keys.BACK_SPACE);

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= premitiveAddressDetailsLength; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("address_line_1"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify record got approved with the updated record")
	public void verify_record_got_approved_with_the_updated_record() {
		String addressDetailsLength = "";
		for (int i = 0; i <= 100; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isBlank()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(addressDetailsLength, addressDetailsTestData.get("address_line_1"));
	}

	@And("make the mandatiry field blank in address details screen")
	public void make_the_mandatiry_field_blank_in_address_details_screen() {
		String addressDetailsLength = "";
		for (int i = 0; i <= 100; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isBlank()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveAddressDetailsLength = addressDetailsLength.length();
		for (int i = 0; i <= premitiveAddressDetailsLength; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(Keys.BACK_SPACE);

			} catch (Exception e) {

			}
		}
	}

	@Then("verify the functionality of the back button in updated record screen")
	public void verify_the_functionality_of_the_back_button_in_updated_record_screen() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("change the status active to inactive for address details record")
	public void change_the_status_active_to_inactive_for_address_details_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the record status as inactive")
	public void verify_system_should_show_the_record_status_as_inactive() throws Throwable {
		String status = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + ".querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText");
				status = javascriptHelper.executeScript(
						"return document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
								+ (i + 1) + "].querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText")
						.toString();
				System.out.println(status);
				if (!(status.isEmpty())) {
					System.out.println(status);
					Assert.assertEquals("In-active", status);
					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		Assert.assertEquals(status, "In-active");
	}

	@And("change the status inactive to active for address details record")
	public void change_the_status_inactive_to_active_for_address_details_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the record status as active")
	public void verify_system_should_show_the_record_status_as_active() throws Throwable {
		String status = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + ".querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText");
				status = javascriptHelper.executeScript(
						"return document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
								+ (i + 1) + "].querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText")
						.toString();
				System.out.println(status);
				if (!(status.isEmpty())) {
					System.out.println(status);
					Assert.assertEquals("Active", status);
					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		Assert.assertEquals(status, "Active");
	}

	@Then("verify list view fields are shown in address details list view")
	public void verify_list_view_fields_are_shown_in_address_details_list_view() throws Throwable {
		String fieldName = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				// document.querySelectorAll('thead[class="p-datatable-thead"]')[3].innerText
				System.out.println(
						"document.querySelectorAll('thead[class=\"p-datatable-thead\"]')[" + (i + 1) + "].innerText");
				for (int l = 0; l <= 20; l++) {
					try {
						fieldName = javascriptHelper.executeScript(
								"return document.querySelectorAll('thead[class=\\\"p-datatable-thead\\\"]')[" + (i + 1)
										+ "].innerText")
								.toString();
						System.out.println(fieldName);
						if (!(fieldName.isBlank())) {

							System.out.println("l loop got breaked ");
							break;
						}
					} catch (Exception e) {
						if (l == 20) {
							Assert.fail(e.getMessage());
						}
					}
				}

				if (!(fieldName.isEmpty())) {
					System.out.println(fieldName);

					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		System.out.println("Field Name " + fieldName);
		Assert.assertTrue(fieldName.contains("Address Type"));
		Assert.assertTrue(fieldName.contains("Country"));
		Assert.assertTrue(fieldName.contains("Occupancy Status"));
		Assert.assertTrue(fieldName.contains("Occupance Since"));
		Assert.assertTrue(fieldName.contains("Contact Address"));
		Assert.assertTrue(fieldName.contains("Status"));

	}

	@And("search for the matched text in address details list view")
	public void search_for_the_matched_text_in_address_details_list_view() throws Throwable {
		robot = new Robot();

		String queryForSearchButton = "document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')[3].querySelector('button[icon=\"pi pi-search\"]')";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			sectionIndex = i;
			System.out.println("Section Name " + sectionName + " i value " + i);
			sectionIndex = i;
			if (sectionName.equals("Address Details")) {

				for (int l = 0; l <= 100; l++) {
					try {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
										+ (i + 1) + "].querySelector('button[icon=\"pi pi-search\"]')")
								.click();

						isClicked = true;
						break;
					} catch (Exception e) {
						if (l == 100) {
							Assert.fail(e.getMessage());
						}
					}

				}
				if (isClicked == true) {
					break;
				}

			}
			if (isClicked == true) {
				System.out.println(i + " Got breaked");
				break;
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println("address details search text "
						+ addressDetailsJSPaths.getElement("address_details__record_search_input"));

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								addressDetailsJSPaths.getElement("address_details__record_search_input"))
						.sendKeys(addressDetailsTestData.get("match_search"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	@Then("verify system should show the result for the matched text")
	public void verify_system_should_show_the_result_for_the_matched_text() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("address_details__record_search_input")).clear();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String searchResult = "";
		for (int i = 0; i <= 100; i++) {
			try {
				searchResult = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
								+ (sectionIndex + 1)
								+ "].querySelector('p-paginator span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
						.toString();
				if ((searchResult.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")));
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//html")).click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("search for the un matched text in address details list view")
	public void search_for_the_un_matched_text_in_address_details_list_view() throws Throwable {
		robot = new Robot();

		String queryForSearchButton = "document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')[3].querySelector('button[icon=\"pi pi-search\"]')";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			sectionIndex = i;
			System.out.println("Section Name " + sectionName + " i value " + i);
			sectionIndex = i;
			if (sectionName.equals("Address Details")) {

				for (int l = 0; l <= 100; l++) {
					try {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
										+ (i + 1) + "].querySelector('button[icon=\"pi pi-search\"]')")
								.click();

						isClicked = true;
						break;
					} catch (Exception e) {
						if (l == 100) {
							Assert.fail(e.getMessage());
						}
					}

				}
				if (isClicked == true) {
					break;
				}

			}
			if (isClicked == true) {
				System.out.println(i + " Got breaked");
				break;
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println("address details search text "
						+ addressDetailsJSPaths.getElement("address_details__record_search_input"));

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								addressDetailsJSPaths.getElement("address_details__record_search_input"))
						.sendKeys(addressDetailsTestData.get("not_match_search"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	@Then("verify system should not show the reslut for the search")
	public void verify_system_should_not_show_the_reslut_for_the_search() throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 100; i++) {
			try {
				searchResult = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
								+ (sectionIndex + 1)
								+ "].querySelector('p-paginator span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
						.toString();
				if ((searchResult.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));

	}

	@And("click on pdf file download in address details list view")
	public void click_on_pdf_file_download_in_address_details_list_view() throws Throwable {
		// document.querySelectorAll('ion-card-content[class="k-pagescreen p-0 ios
		// card-content-ios
		// hydrated"]')[3].querySelector('p-dropdown[placeholder="Export"]')
		String queryForSearchButton = "document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')[3].querySelector('button[icon=\"pi pi-search\"]')";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			sectionIndex = i;
			if (sectionName.equals("Address Details")) {

				for (int l = 0; l <= 100; l++) {
					try {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
										+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
								.click();
						isClicked = true;
						break;
					} catch (Exception e) {
						if (l == 100) {
							Assert.fail(e.getMessage());
						}
					}
				}
				if (isClicked == true) {
					break;
				}
			}
			if (isClicked == true) {
				break;
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should download the pdf file of addressdetails record")
	public void verify_system_should_download_the_pdf_file_of_addressdetails_record() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerAddressDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerAddressDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("click on xls file download in address details list view")
	public void click_on_xls_file_download_in_address_details_list_view() throws Throwable {
		// document.querySelectorAll('ion-card-content[class="k-pagescreen p-0 ios
		// card-content-ios
		// hydrated"]')[3].querySelector('p-dropdown[placeholder="Export"]')
		String queryForSearchButton = "document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')[3].querySelector('button[icon=\"pi pi-search\"]')";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			System.out.println(
					"Query document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText");
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			sectionIndex = i;
			if (sectionName.equals("Address Details")) {

				for (int l = 0; l <= 100; l++) {
					try {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
										+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
								.click();
						isClicked = true;
						break;
					} catch (Exception e) {
						if (l == 100) {
							Assert.fail(e.getMessage());
						}
					}
					if (isClicked == true) {
						break;
					}
				}
				if (isClicked == true) {
					break;
				}
			}
			if (isClicked == true) {
				break;
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 invoke soft assert in address details in app data entry stage")
	public void user_invoke_soft_assert_in_address_details_in_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
		;
	}

	@Then("verify system should download the xls file of addressdetails record")
	public void verify_system_should_download_the_xls_file_of_addressdetails_record() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerAddressDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerAddressDataFile_export_"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

}
