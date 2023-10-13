package stepdefinitions;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjaraTest extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	ExcelData excelDataForAddressDetailsTestData = new ExcelData(excelTestDataPath, "ijarah_AddressDetailsTestData",
			"Dataset ID");
	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"Test Case ID","DataSet ID");
	ExcelData EmpDetailsTestData  = new ExcelData(excelTestDataPath,"EmpDetailsTestData"," Dataset ID");
	
	JSPaths EmpDetailElements = new JSPaths(excelPath, "EmpDetailElements", "EmploymentDetailsElements", "JSPath");
	ExcelData EmpDetailsCom_firmTestData  = new ExcelData(excelTestDataPath,"EmpDetailsCom_firmTestData","Dataset ID");
	ExcelData ApplicationDataEntry_testdata  = new ExcelData(excelTestDataPath,"ApplicationDataEntry_testdata","Dataset ID");
	Map<String, String> addressDetailsTestData = new HashMap<>();
	JSPaths addressDetailsJSPaths = new JSPaths(excelPath, "addressdetails_WebElements",
			"Ijarah_AddressDetailsFieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";
	JSPaths CustomerAddressDetails = new JSPaths(excelPath, "CustomerAddressDetails",
			"Ijarah_CustomerAddressDetailsFieldName", "JSPath");
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	Map<String, String> testData1;
	WaitHelper waitHelper = new WaitHelper(driver);
	//JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	@And("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());

	}

	@And("User_6047 login with valid credentials")
	public void login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithIjaraApplication();
	}

	@Then("logout from the ijaraApplication")
	public void logout_from_the_ijara_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}

	@And("click on module dropdown in IJRARAH")
	public void click_on_module_dropdown_in_ijrarah() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("module_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on LOS option in module dropdown")
	public void click_on_los_option_in_module_dropdown() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank())) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
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

					}
				} catch (Exception e) {

				}
			}
		}

	}

	@And("click on mail box")
	public void click_on_mail_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					System.out.println(commonJSPaths.getElement("mail_box"));
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search box upon click on the mail box")
	public void click_on_search_box_upon_click_on_the_mail_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search text box upon click the search button")
	public void click_on_search_text_box_upon_click_the_search_button() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("search the record reference number in search text box")
	public void search_the_record_reference_number_in_search_text_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(addressDetailsTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("select the record form mail box")
	public void select_the_record_form_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 300; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 300; k++) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("additonal_customer_info"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click edit button of customer personal information record")
	public void click_edit_button_of_customer_personal_information_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("customer_personal_info_edit_icon")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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

	@And("get the test data for test case ID AT_AD_001")
	public void get_the_test_data_for_test_case_id_at_AT_AD_001() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_001");

	}

	@And("get the test data for test case ID AT_AD_002")
	public void get_the_test_data_for_test_case_id_at_AT_AD_002() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_002");

	}

	@And("get the test data for test case ID AT_AD_003")
	public void get_the_test_data_for_test_case_id_at_AT_AD_003() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_003");

	}

	@And("get the test data for test case ID AT_AD_005")
	public void get_the_test_data_for_test_case_id_at_AT_AD_005() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_005");

	}

	@And("get the test data for test case ID AT_AD_006")
	public void get_the_test_data_for_test_case_id_at_AT_AD_007() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_006");

	}

	@Then("verify save buttton and back button should visible in address details screen")
	public void verify_save_buttton_and_back_button_should_visible_in_address_details_screen() throws Throwable {
		boolean saveButtonStatus = false;
		boolean backButtonStatus = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Save Button Query " + commonJSPaths.getElement("save_button"));
				saveButtonStatus = javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				backButtonStatus = javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(saveButtonStatus);
		Assert.assertTrue(backButtonStatus);

	}

 
	public void verify_address_type_field_should_be_mandatory_and_dropdown_and_editable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("address_type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("address_type")).trim())) {

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

	@Then("verify address status field should be mandatory and dropdown and editable")
	public void verify_address_status_field_should_be_mandatory_and_dropdown_and_editable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_status"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("address_status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("address_status")).trim())) {

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

	@Then("verify residential or occupancy status field should should be dropdown and editable")
	public void verify_residential_or_occupancy_status_field_should_should_be_dropdown_and_editable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("residential_or_ocupency_status"))
						.click();
				softAssert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("residential_or_ocupency_status"))
						.getAttribute("aria-label").contains("*"));
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("residential_or_occupansy_status").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((addressDetailsTestData.get("residential_or_occupansy_status")).trim())) {

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

	@Then("verify communication address should be non mandatory and editable")
	public void verify_communication_address_should_be_non_mandatory_and_editable() throws Throwable {

	}

	@Then("verify location address should be mandatory and editable lookup")
	public void verify_location_address_should_be_mandatory_and_editable_lookup() throws Throwable {

	}

	@Then("verify location category should be mandatory and editable lookup")
	public void verify_location_category_should_be_mandatory_and_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("location_category"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("location_category").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("location_category")).trim())) {

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

	@Then("verify address line 1 should be mandatory editable text box")
	public void verify_address_line_1_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("address_line_1"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("address_line1_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					softAssert.fail("address line 1 is a non mandatroy field hence failed");
				}

			}
		}

	}

	@Then("verify address line 2 should be mandatory editable text box")
	public void verify_address_line_2_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line2")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line2")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line2"))
						.sendKeys(addressDetailsTestData.get("address_line_2"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScript("return " + addressDetailsJSPaths.getElement("address_line2"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					softAssert.fail("address line 2 is a non mandatroy field hence failed");
				}

			}
		}
	}

	@Then("verify country should be editable mandatory text box")
	public void verify_country_should_be_editable_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("country")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("country").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("country")).trim())) {

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

	@Then("verify provience ID field should be mandatory editable text box")
	public void verify_provience_id_field_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("province_id")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("provience_id").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("provience_id")).trim())) {

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

	@Then("verify Neighbourhood\\/District name field should be mandatory editable text box")
	public void verify_neighbourhood_district_name_field_should_be_mandatory_editable_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("district_name")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("district_name")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("district_name"))
						.sendKeys(addressDetailsTestData.get("district_name"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("district_name_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					softAssert.fail("district name is a non mandatroy field hence failed");
				}

			}
		}

	}

	@Then("verify city field should be editable mandatory text box")
	public void verify_city_field_should_be_editable_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("city")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("city")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("city").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("city")).trim())) {

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

	@Then("verify zipcode field should be editable mandatory textbox")
	public void verify_zipcode_field_should_be_editable_mandatory_textbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("zip_code")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("zip_code")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("zip_code"))
						.sendKeys(addressDetailsTestData.get("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScript("return " + addressDetailsJSPaths.getElement("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					softAssert.fail("zip code is a non mandatroy field hence failed");
				}

			}
		}
	}

	@Then("verify po box number field should be editable non mandatory text box")
	public void verify_po_box_number_field_should_be_editable_non_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number"))
						.sendKeys(addressDetailsTestData.get("po_box_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("po_box_number_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("duration_on_stay")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("duration_on_stay"))
						.click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("duration_on_stay"))
						.sendKeys(addressDetailsTestData.get("duration_on_stay"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("duration_on_stay_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
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
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return "
						+ addressDetailsJSPaths.getElement("latitude_details_of_the_address_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
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
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return "
						+ addressDetailsJSPaths.getElement("longitude_details_of_the_address_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landmark")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landmark")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landmark"))
						.sendKeys(addressDetailsTestData.get("land_mark"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object landmark = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("landmark_mandatory_verifcation"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("occupency_date")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("occupency_date"))
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

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object occupancyDate = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("occupency_date_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_name")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_name")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("landlord_name"))
						.sendKeys(addressDetailsTestData.get("land_lord_name"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object landlordName = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("landlord_name_Mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
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
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object landlordMobileNumber = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("landlord_mobile_number_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("rent_amount")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("rent_amount")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("rent_amount"))
						.sendKeys(addressDetailsTestData.get("rent_amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				Object rentAmount = javascriptHelper.executeScript(
						"return " + addressDetailsJSPaths.getElement("rent_amount_mandatory_verification"));
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
			System.out.println("Map " + addressDetailsTestData.get("frequency_of_rent").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("frequency_of_rent")).trim())) {

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

	@And("click on save button in address details screen")
	public void click_on_save_button_in_address_details_screen() throws Throwable {
		Robot robot = new Robot();
		robot.mouseWheel(-200);

//		for (int i = 0; i <= 300; i++) {
//			try {
//
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
//						"document.querySelector('ion-label[ng-reflect-text=\"Customer Address\"]')"));
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}

		for (int i = 0; i <= 300; i++) {
			try {
				// save_button
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on save button without enter mandatory data")
	public void click_on_save_without_enter_mandatory_data() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				// save_button
				javascriptHelper.scrollUpVertically();

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				// save_button
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the validation for mandatory field")
	public void verify_system_should_show_the_validation_for_mandatory_field() throws Throwable {
		String toastContent = "";
		for (int i = 0; i <= 300; i++) {
			try {
				toastContent = javascriptHelper.executeScript("return " + commonJSPaths.getElement("toast_message"))
						.toString();
				System.out.println(toastContent);
				if (!(toastContent.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Please fill all the details", toastContent);
	}

	@And("enter the special character input in any of the field")
	public void enter_the_special_character_input_in_any_of_the_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the validation for special character input")
	public void verify_system_should_show_the_validation_for_special_character_input() throws Throwable {
		String specialCharacterValidation = "";
		for (int i = 0; i <= 300; i++) {
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
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Special character not allowed".trim(), specialCharacterValidation.trim());
	}

	@And("enter the character inputs in numeric field")
	public void enter_the_character_inputs_in_numeric_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")));
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number"))
						.sendKeys(addressDetailsTestData.get("characterInput"));
				break;
			} catch (Exception e) {
				if (i == 300) {
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

	@And("click on edit button on created record of address details")
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
		for (int i = 0; i <= 300; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isBlank()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 300) {
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
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify record got approved with the updated record")
	public void verify_record_got_approved_with_the_updated_record() {
		String addressDetailsLength = "";
		for (int i = 0; i <= 300; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isBlank()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(addressDetailsLength, addressDetailsTestData.get("address_line_1"));
	}

	@And("make the mandatiry field blank in address details screen")
	public void make_the_mandatiry_field_blank_in_address_details_screen() {
		String addressDetailsLength = "";
		for (int i = 0; i <= 300; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isBlank()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 300) {
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

	@And("change the status active to inactive for address details record")
	public void change_the_status_active_to_inactive_for_address_details_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
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
						fieldName = javascriptHelper
								.executeScript("return document.querySelectorAll('thead[class=\\\"p-datatable-thead\\\"]')["
										+ (i + 1) + "].innerText")
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
	@And("get the test data for test case ID AT_NADC_01")
	public void get_the_test_data_for_test_case_id_at_AT_NADC_01() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_NADC_001");
}

		@And("click on action button below the Address details")
		public void click_on_action_button_below_the_address_details() {
			for (int i = 0; i < 700; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("clickSearchInInbox")).click();
					break;
				} catch (Exception e) {
					if (i==699) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}

		@Then("verify Address type should visible in address details screen")
		public void verify_address_type_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("Address_Type")).isDisplayed()) {
				SoftAssert.fail("Check Address Type Field");
			}
			
		}
		    
		    
		@Then("verify Address Status should visible in address details screen")
		public void verify_address_status_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_status")).isDisplayed()) {
				SoftAssert.fail("Check Address Status Field");
			}
		    
		}

		@Then("verify Residential or Occupancy Status should visible in address details screen")
		public void verify_residential_or_occupancy_status_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("residential_or_ocupency_status")).isDisplayed()) {
				SoftAssert.fail("Check residential or ocupency status Field");
			}
		    
		}

		@Then("verify Communication Address should visible in address details screen")
		public void verify_communication_address_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("communication_address_toggle")).isDisplayed()) {
				SoftAssert.fail("Check communication address toggle Field");
			}
		    
		}

		@Then("verify Location Category should visible in address details screen")
		public void verify_location_category_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("location_category")).isDisplayed()) {
				SoftAssert.fail("Check location category Field");
			}
		    
		}

		@Then("verify Address line1 should visible in address details screen")
		public void verify_address_line1_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line1")).isDisplayed()) {
				SoftAssert.fail("Check address_line1 Field");
			}
		    
		}

		@Then("verify Address line2 should visible in address details screen")
		public void verify_address_line2_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line2")).isDisplayed()) {
				SoftAssert.fail("Check address_line2 Field");
			}
		    
		}

		@Then("verify Country should visible in address details screen")
		public void verify_country_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("country_AddressDetails")).isDisplayed()) {
				SoftAssert.fail("Check country AddressDetails Field");
			}
		    
		    
		}

		@Then("verify Province id  should visible in address details screen")
		public void verify_province_id_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("province_id")).isDisplayed()) {
				SoftAssert.fail("Check province id Field");
			}
		    
		}

		@Then("verify Neighbourhood should visible in address details screen")
		public void verify_neighbourhood_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("neighbourhood")).isDisplayed()) {
				SoftAssert.fail("Check neighbourhood Field");
			}		    
		}

		@Then("verify City should visible in address details screen")
		public void verify_city_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("city")).isDisplayed()) {
				SoftAssert.fail("Check city Field");
			}
		    
		}

		@Then("verify Zip Code should visible in address details screen")
		public void verify_zip_code_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("zip_code")).isDisplayed()) {
				SoftAssert.fail("Check zip code Field");
			}
		    
		}

		@Then("verify PO BOX Number should visible in address details screen")
		public void verify_po_box_number_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("po_box_number")).isDisplayed()) {
				SoftAssert.fail("Check po box number Field");
			}
		    
		}

		@Then("verify Mobile Number should visible in address details screen")
		public void verify_mobile_number_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("mobile_number_primary")).isDisplayed()) {
				SoftAssert.fail("Check mobile_number_primary Field");
			}
		    
		}

		@Then("verify Duration Of Stay should visible in address details screen")
		public void verify_duration_of_stay_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("duration_on_stay")).isDisplayed()) {
				SoftAssert.fail("Check duration_on_stay Field");
			}
		    
		}

		@Then("verify Latitude Details Of The Address  should visible in address details screen")
		public void verify_latitude_details_of_the_address_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("latitude_details_of_the_address")).isDisplayed()) {
				SoftAssert.fail("Check latitude_details_of_the_address Field");
			}
		    
		}

		@Then("verify Longitude Details Of The Address should visible in address details screen")
		public void verify_longitude_details_of_the_address_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("longitude_details_of_the_address")).isDisplayed()) {
				SoftAssert.fail("Check longitude_details_of_the_address Field");
			}
		    
		    
		}

		@Then("verify Land Mark should visible in address details screen")
		public void verify_land_mark_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landmark")).isDisplayed()) {
				SoftAssert.fail("Check landmark Field");
			}
		    
		}

		@Then("verify Occupancy Date should visible in address details screen")
		public void verify_occupancy_date_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("occupency_date")).isDisplayed()) {
				SoftAssert.fail("Check occupency_date Field");
			}		    
		}

		@Then("verify Landlord Name  should visible in address details screen")
		public void verify_landlord_name_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_name")).isDisplayed()) {
				SoftAssert.fail("Check landlord_name Field");
			} 
		    
		}

		@Then("verify Landlord Mobile Number should visible in address details screen")
		public void verify_landlord_mobile_number_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_mobile_number")).isDisplayed()) {
				SoftAssert.fail("Check landlord Mobile Number Field");
			} 		    
		}

		@Then("verify Rent Amount should visible in address details screen")
		public void verify_rent_amount_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("rent_amount")).isDisplayed()) {
				SoftAssert.fail("Check Rent Amount Field");
			}    
		}

		@Then("verify Frequency Of Rent should visible in address details screen")
		public void verify_frequency_of_rent_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("frequency_of_rent")).isDisplayed()) {
				SoftAssert.fail("Check Frequency Of Rent Field");
			}
		    
		}
		@Then("verify Address type should be mandatory")
		public void verify_address_type_should_be_mandatory() {
			String AddressTypeText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_type_mandatory_verification")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AddressTypeText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
			}


		@Then("verify Address type should be display only")
		public void verify_address_type_should_be_display_only() {
			String AddressTypedisplay = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_type_mandatory_verification")).getAttribute("aria-hidden");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AddressTypedisplay.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
				
		}

		@Then("verify Address type should be dropdown")
		public void verify_address_type_should_be_dropdown() {
			String AddressTypedropdown = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("Address_Type")).getAttribute("ng-reflect-placeholder");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AddressTypedropdown.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
			}
		@Then("verify Address Status should be mandatory")
		public void verify_address_status_should_be_mandatory() {
			String AddressStatusText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_status")).getText();

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AddressStatusText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Address Status should be display only")
		public void verify_address_status_should_be_display_only() {
			String AddressStatusdisplay = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_status")).getAttribute("aria-hidden");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AddressStatusdisplay.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Address Status should be dropdown")
		public void verify_address_status_should_be_dropdown() {
			String AddressStatusdropdown = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_status")).getAttribute("ng-reflect-placeholder");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AddressStatusdropdown.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Residential or occupancy status should be mandatory")
		public void verify_residential_or_occupancy_status_should_be_mandatory() {
			String ResidentalText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("residential_or_ocupency_status")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(ResidentalText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}
		    
		

		@Then("verify Residential or occupancy status should be display only")
		public void verify_residential_or_occupancy_status_should_be_display_only() {
			String Residentialdisplay = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("residential_or_ocupency_status")).getAttribute("aria-hidden");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Residentialdisplay.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Residential or occupancy status should be dropdown")
		public void verify_residential_or_occupancy_status_should_be_dropdown() {

			String Residentialdropdown = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("residential_or_ocupency_status_drop")).getAttribute("ng-reflect-placeholder");

		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Residentialdropdown.contains("select"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		    
		}
		@Then("verify Communication address should be a toggle button")
		public void verify_communication_address_should_be_a_toggle_button() {
			String Communicationdropdown = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("communication_address_toggle_verify")).getAttribute("role");

		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(Communicationdropdown.contains("switch"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          }
      }
		    
		    
		}

		@Then("verify Communication address should be display only")
		public void verify_communication_address_should_be_display_only() {
			String Communicationdisplay = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("communication_address_toggle")).getAttribute("aria-hidden");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Communicationdisplay.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}
		@Then("verify Location Category should be display only")
		public void verify_location_category_should_be_display_only() {
			String Locationdisplay = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("location_category_display")).getAttribute("aria-hidden");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Locationdisplay.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		    
		}

		@Then("verify Location Category should be dropdown")
		public void verify_location_category_should_be_dropdown() {
			String Location = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("location_category")).getAttribute("ng-reflect-placeholder");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Location.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		   
		}
		@Then("verify Address line1 should be mandatory")
		public void verify_address_line1_should_be_mandatory() {
			String Addressline1Text = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line1_mandatory")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Addressline1Text.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Address line1 should be display only")
		public void verify_address_line1_should_be_display_only() {
			String Addressline1= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line1_display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Addressline1.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Address line1 should be text box")
		public void verify_address_line1_should_be_text_box() {
			String Addressline1text= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line1")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Addressline1text.contains("text"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		    
		}
		@Then("verify Address line2 should be mandatory")
		public void verify_address_line2_should_be_mandatory() {
			String Addressline2Text = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line2_mandatory_verification")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Addressline2Text.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Address line2 should be display only")
		public void verify_address_line2_should_be_display_only() {
			String Addressline2= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line2_display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Addressline2.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Address line2 should be text box")
		public void verify_address_line2_should_be_text_box() {
			String Addressline2text= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line2_display")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Addressline2text.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify Country should be mandatory")
		public void verify_country_should_be_mandatory() {
			String CountryText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("country_AddressDetails")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(CountryText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Country should be display only")
		public void verify_country_should_be_display_only() {
			String CountryText= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("country_text")).getAttribute("aria_disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(CountryText.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Country should be text box")
		public void verify_country_should_be_text_box() {

			String country_text = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("country_text")).getAttribute("ng-reflect-placeholder");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(country_text.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify Province Id should be mandatory")
		public void verify_province_id_should_be_mandatory() {
			String ProvinceText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("province_id_mandatory")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(ProvinceText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Province Id should be display only")
		public void verify_province_id_should_be_display_only() {
			String ProvinceText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("province_id_mandatory")).getAttribute("aria-hidden");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(ProvinceText.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Province Id should be text box")
		public void verify_province_id_should_be_text_box() {
			String Provincetext = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("province_id_text")).getAttribute("ng-reflect-placeholder");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Provincetext.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify Neighbourhood District Name should be mandatory")
		public void verify_neighbourhood_district_name_should_be_mandatory() {
			String neighbourhoodText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("neighbourhood")).getText();
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(neighbourhoodText.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
			
		}

		@Then("verify Neighbourhood District Name should be display only")
		public void verify_neighbourhood_district_name_should_be_display_only() {
			String neighbourhood_display= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("neighbourhood_display")).getAttribute("aria_disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(neighbourhood_display.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		}

		@Then("verify Neighbourhood District Name should be text box")
		public void verify_neighbourhood_district_name_should_be_text_box() {
			String Neighbourhood = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("neighbourhood_display")).getAttribute("ng-reflect-placeholder");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Neighbourhood.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify City should be mandatory")
		public void verify_city_should_be_mandatory() {
			String CityText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("city")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(CityText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify City should be display only")
		public void verify_city_should_be_display_only() {
			String City1= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("city_display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(City1.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify City should be text box")
		public void verify_city_should_be_text_box() {
			String City1= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("city_display")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(City1.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify Zip code should be mandatory")
		public void verify_zip_code_should_be_mandatory() {
			String ZipText = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("zip_code_mandatory_verification")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(ZipText.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Zip code should be display only")
		public void verify_zip_code_should_be_display_only() {
			String Zip= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("zip_code_display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Zip.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Zip code should be text box")
		public void verify_zip_code_should_be_text_box() {
			String Zip= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("zip_code_display")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Zip.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify PO Box Number should be display only")
		public void verify_po_box_number_should_be_display_only() {
			String PO= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("po_box_number")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(PO.contains("false"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify PO Box Number should be text box")
		public void verify_po_box_number_should_be_text_box() {
			String PO= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("po_box_number")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(PO.contains("number"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify Mobile number should be display only")
		public void verify_mobile_number_should_be_display_only() {
			String Mobile= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("mobile_number_primary")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Mobile.contains("false"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Mobile number should be text box")
		public void verify_mobile_number_should_be_text_box() {
			String Mobile= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("mobile_number_primary")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Mobile.contains("number"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify  Duration Of Stay should be display only")
		public void verify_duration_of_stay_should_be_display_only() {
			String Duration= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("duration_on_stay")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Duration.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify  Duration Of Stay should be text box")
		public void verify_duration_of_stay_should_be_text_box() {
			String Duration= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("duration_on_stay")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Duration.contains("number"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		   }
		@Then("verify Latitude Details Of The Address should be display only")
		public void verify_latitude_details_of_the_address_should_be_display_only() {
			String Latitude= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("latitude_details_of_the_address")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Latitude.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		 }

		@Then("verify Latitude Details Of The Address should be text box")
		public void verify_latitude_details_of_the_address_should_be_text_box() {
			String Latitude= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("latitude_details_of_the_address")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Latitude.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		    
		}

		@Then("verify Longitude Details Of The Address should be display only")
		public void verify_longitude_details_of_the_address_should_be_display_only() {
			String Longitude= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("longitude_details_of_the_address")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Longitude.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Longitude Details Of The Address should be text box")
		public void verify_longitude_details_of_the_address_should_be_text_box() {
			String Longitude= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("longitude_details_of_the_address")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Longitude.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Land Mark should be display only")
		public void verify_land_mark_should_be_display_only() {
			String landmark= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landmark")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(landmark.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		    
		}

		@Then("verify Land Mark should be text box")
		public void verify_land_mark_should_be_text_box() {
			String landmark= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landmark")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(landmark.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        } 
		}
		@Then("verify Occupancy Date should be mandatory")
		public void verify_occupancy_date_should_be_mandatory() {
			String Occupancy = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("occupency_date_mandatory_verification")).getText();
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Occupancy.contains("*"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Occupancy Date should be display only")
		public void verify_occupancy_date_should_be_display_only() {
			String Occupancy = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("occupency_date_mandatory_verification")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Occupancy.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Occupancy Date should be Date")
		public void verify_occupancy_date_should_be_date() {
			String occupency_AS_date = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("occupency_AS_date")).getAttribute("ng-reflect-view");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(occupency_AS_date.contains("date"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		    
		}
		@Then("verify Landlord Name should be display only")
		public void verify_landlord_name_should_be_display_only() {
			String Landlord = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_name")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Landlord.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		}

		@Then("verify Landlord Name should be text box")
		public void verify_landlord_name_should_be_text_box() {
			String Landlord = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_name")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Landlord.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Then("verify Landlord Mobile Number should be display only")
		public void verify_landlord_mobile_number_should_be_display_only() {
			String LandlordMobile= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_mobile_number")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(LandlordMobile.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify Landlord Mobile Number should be text box")
		public void verify_landlord_mobile_number_should_be_text_box() {
			String LandlordMobile = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_mobile_number")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(LandlordMobile.contains("text"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@And("Select record after search")
		public void select_record_after_search() {
			for (int i = 0; i < 700; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("selectRecord1")).click();
					break;
				} catch (Exception e) {
					if (i==699) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		@Then("verify Rent Amount should be display only")
		public void verify_rent_amount_should_be_display_only() {
			String rent_amount= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("rent_amount")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(rent_amount.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Rent Amount should be text box")
		public void verify_rent_amount_should_be_text_box() {
			String rent_amount = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("rent_amount")).getAttribute("type");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(rent_amount.contains("number"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		@Then("verify Frequency Of Rent should be display only")
		public void verify_frequency_of_rent_should_be_display_only() {
			String frequency_of_rent_display= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("frequency_of_rent_display")).getAttribute("aria-hidden");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(frequency_of_rent_display.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		   
		    
		}

		@Then("verify Frequency Of Rent should be text box")
		public void verify_frequency_of_rent_should_be_text_box() {
			String rent_amount = javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("frequency_of_rent_text")).getAttribute("ng-reflect-placeholder");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(rent_amount.contains("select"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}
		

		@Then("verify field Status should be display only")
		public void verify_field_status_should_be_display_only() {
			String field_status= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("field_status")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(field_status.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("verify field Status should be toggle status")
		public void verify_field_status_should_be_toggle_status() {
			String field_status_toggle= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("field_status_toggle")).getAttribute("aria-checked");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(field_status_toggle.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
    
		}
		@Then("clicking on back button system should navigate to the previous screen")
		public void clicking_on_back_button_system_should_navigate_to_the_previous_screen() {
			javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("Back_button")).click();
			String Back_button_verify= javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("Back_button_verify")).getAttribute("aria-checked");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Back_button_verify.contains("Customer "));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }

		}
		@And("^User get the test data for test case AT_EDC_04")
	    public void get_the_test_data_for_test_case_AT_DC_CD_001() throws Throwable {
			testData =  customerDebtExcelData.getTestdata("AT_EDC_04");
	    }	
		
		@And("User click the module name dropdown in ULS application")
		public void user_click_the_module_name_dropdown_in_uls_application() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("moduleNameDropdown")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("moduleNameDropdown")).click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User select the module name as LOS in ULS application")
		public void user_select_the_module_name_as_los_in_uls_application() throws Throwable {
			String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
	        String moduleLength = "";
	        for (int i = 0; i <= 300; i++) {
	            try {
	                moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
	                System.out.println("Module Length " + moduleLength);
	                if (!(moduleLength.isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                if (i == 300) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	        int premitiveIntegerLength = Integer.parseInt(moduleLength);
	        
//			document.querySelectorAll('ion-radio-group ion-item')[0].textContent
	        for (int i = 0; i < premitiveIntegerLength; i++) {
	            for (int j = 0; j <= 300; j++) {
	                try {
	                    String moduleName = javascriptHelper.executeScript(
	                            "return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
	                            .toString();
	                    System.out.println("Module name " + moduleName);
//	                    if (moduleName.equalsIgnoreCase("LOS")) {
	                    if (moduleName.equalsIgnoreCase(testData.get("Module Name"))) {
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
		@And("User_6047 click the Mail box in ULS application")
		public void user_click_the_mail_box_in_uls_application() throws Throwable {
				for (int i = 0; i <= 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box"))
								.click();
						break;
					} catch (Exception e) {
						if (i == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
		}
		
		@And("User_6047 click the Search button under inbox")
		public void user_click_the_search_button_under_inbox() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")).click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}	
		@And("User search the Ref id under inbox")
		public void user_search_the_ref_id_under_inbox() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
					.sendKeys(testData.get("Ref No"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		    
		}
		@And("User_6047 search the Ref id under inbox")
		public void user_search_the_ref_id_under_inbox_6047() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
					.sendKeys(testData.get("Ref No"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			} 
			}
		@And("User_6047 click the Entitle button under inbox")
		public void user_click_the_entitle_button_under_inbox() throws Throwable {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("inboxEntitleBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}
	
		@And("User_6047 click the Customer Financials tab")
		public void user_6047_click_the_customer_financials_tab() throws Throwable {
//			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsTab")));
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("customerFinancialsTab")).click();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		@And("User click On the Action button below Customer Financials")
		public void user_click_on_the_action_button_below_customer_financials() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("Action_Button_CFT")).click();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User click On the Action button below Financial Commitments")
		public void user_click_on_the_action_button_below_financial_commitments() {
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
//			for (int i = 0; i <= 300; i++) {
//				try {
//					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));
//					break;
//				} catch (Exception e) {
//					if (i == 300) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
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
							if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
								System.out.println("Inside nested loop");
								System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");
//								javascriptHelper
//								.executeScriptWithWebElement(
//										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")
//										.click();
								javascriptHelper
										.executeScriptWithWebElement(
												"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]")
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
		@And("user verify the account number field below the Customber debt details")
		public void user_verify_the_account_number_field_below_the_customber_debt_details() {
			WebElement accountNumberLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("accountNumberLabel"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(accountNumberLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the  Closed Date field below the Customber debt details")
		public void user_verify_the_closed_date_field_below_the_customber_debt_details() {
			WebElement closeDateLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("closeDateLabel"));
			for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(closeDateLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	
		}

		@And("user verify the Status field below the Customber debt details")
		public void user_verify_the_status_field_below_the_customber_debt_details() {
			WebElement DebtStatus = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("DebtStatus"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(DebtStatus.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		    
		}

		@And("user verify the Frequency field below the Customber debt details")
		public void user_verify_the_frequency_field_below_the_customber_debt_details() {
			WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("frequencyLabel"));
			for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(frequencyLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	
			
		}

		@And("user verify the Installment Amount field below the Customber debt details")
		public void user_verify_the_installment_amount_field_below_the_customber_debt_details() {
			WebElement installmentAmtLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("installmentAmtLabel"));
			for (int i = 0; i <= 11000; i++) {
				try {
					Assert.assertTrue(installmentAmtLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}	
		}

		@And("user verify the Last Payment Date field below the Customber debt details")
		public void user_verify_the_last_payment_date_field_below_the_customber_debt_details() {
			WebElement lastPaymentDateLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("lastPaymentDateLabel"));
			for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(lastPaymentDateLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Next Due Date field below the Customber debt details")
		public void user_verify_the_next_due_date_field_below_the_customber_debt_details() {
			WebElement nextDueDateLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("nextDueDateLabel"));
			for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(nextDueDateLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Last Cycle field below the Customber debt details")
		public void user_verify_the_last_cycle_field_below_the_customber_debt_details() {
			WebElement last24CycleLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("last24CycleLabel"));
			for (int i = 0; i <= 500; i++) {
				try {
					Assert.assertTrue(last24CycleLabel.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Include in Eligibility field below the Customber debt details")
		public void user_verify_the_include_in_eligibility_field_below_the_customber_debt_details() {
			WebElement includeEligiblity = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("includeEligiblity"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(includeEligiblity.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		    
		}
		@And("User click the Back button in Customer Debt screen navigate to the previous screen")
		public void user_click_the_back_button_in_customer_debt_screen_navigate_to_the_previous_screen() throws Throwable {
			WebElement pageTop = javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.scrollIntoView(pageTop);
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("customerDebtBackBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("verify Closed Date field below the Customber debt should be display only")
		public void verify_closed_date_field_below_the_customber_debt_should_be_display_only() {
			String CloseDate_Display= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("CloseDate_Display")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(CloseDate_Display.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		}

		@And("verify Status field below the Customber debt should be display only")
		public void verify_status_field_below_the_customber_debt_should_be_display_only() {
			String StatusDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("StatusDisplay")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(StatusDisplay.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		   
		}

		@Given("User_6047 get the test data for test case ID AT_EDC_01")
		public void get_the_test_data_for_test_case_id_at_edc_01() {
			testData =  EmpDetailsTestData.getTestdata("DS01_AT_EDC_01");
		}

		
		@And("User_6047 click On the Action button below Customer Employment List")
		public void user_6047_click_on_the_action_button_below_customer_employment_list() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBotton")).click();
					Thread.sleep(5000);
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		    
		}
		
		@And("user click the Action button for the business")
		public void user_click_the_action_button_for_the_business() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBottonUnderCusFin")).click();
				
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
		}

		

		
		@And("user verify the Primary Employment below the Employment Details")
		public void user_verify_the_primary_employment_below_the_employment_details() throws InterruptedException {
			Thread.sleep(5000);
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment")).isDisplayed()) {
				SoftAssert.fail("Check Primary Employment Field");
			}
		    
		}
//			WebElement PrimaryEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment"));
//			for (int i = 0; i <= 2000; i++) {
//				try {
//					Assert.assertTrue(PrimaryEmployment.isDisplayed());
//					break;
//				} catch (Exception e) {
//					if (i == 2000) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
	

		@And("user verify the Employment Period below the Employment Details")
		public void user_verify_the_employment_period_below_the_employment_details() {
			WebElement EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmploymentPeriod.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("user verify the Nature of Employment below the Employment Details")
		public void user_verify_the_nature_of_employment_below_the_employment_details() {
			WebElement NatureOfEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(NatureOfEmployment.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Company Type below the Employment Details")
		public void user_verify_the_company_type_below_the_employment_details() {
			WebElement CompanyType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(CompanyType.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Profession below the Employment Details")
		public void user_verify_the_profession_below_the_employment_details() {
			WebElement Profession = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(Profession.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Profession Type below the Employment Details")
		public void user_verify_the_profession_type_below_the_employment_details() {
			WebElement ProfessionType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(ProfessionType.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Statutory Authority below the Employment Details")
		public void user_verify_the_statutory_authority_below_the_employment_details() {
			WebElement StatutoryAuthority = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(StatutoryAuthority.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employer Name  below the Employment Details")
		public void user_verify_the_employer_name_below_the_employment_details() {
			WebElement EmployerName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmployerName.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employer Name If \\(Others) below the Employment Details")
		public void user_verify_the_employer_name_if_others_below_the_employment_details() {
			WebElement EmployerNameIf = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmployerNameIf.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employee Id below the Employment Details")
		public void user_verify_the_employee_id_below_the_employment_details() {
			WebElement EmployeeId = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmployeeId.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Date Of Joining below the Employment Details")
		public void user_verify_the_date_of_joining_below_the_employment_details() {
			WebElement DateOfJoining = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(DateOfJoining.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employment End Date below the Employment Details")
		public void user_verify_the_employment_end_date_below_the_employment_details() {
			WebElement EmploymentEndDate = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmploymentEndDate.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Department below the Employment Details")
		public void user_verify_the_department_below_the_employment_details() {
			WebElement Department = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(Department.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Designation below the Employment Details")
		public void user_verify_the_designation_below_the_employment_details() {
			WebElement Designation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(Designation.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employment Type below the Employment Details")
		public void user_verify_the_employment_type_below_the_employment_details() {
			WebElement EmploymentType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmploymentType.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Direct Manager Contact Number Extension below the Employment Details")
		public void user_verify_the_direct_manager_contact_number_below_the_employment_details() {
			WebElement DirectManagerContactNumberExtension = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(DirectManagerContactNumberExtension.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Direct Manager Phone Number below the Employment Details")
		public void user_verify_the_extension_below_the_employment_details() {
			WebElement DirectManagerPhoneNumber = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(DirectManagerPhoneNumber.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Income Paymode below the Employment Details")
		public void user_verify_the_direct_manager_phone_number_below_the_employment_details() {
			WebElement IncomePaymode = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(IncomePaymode.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify Employer Phone Extension below the Employment Details")
		public void user_verify_employer_phone_extension_below_the_employment_details() {
			WebElement EmployerPhoneExtension = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmployerPhoneExtension.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employer Phone Number below the Employment Details")
		public void user_verify_the_employer_phone_number_below_the_employment_details() {
			WebElement EmployerPhoneNumber = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmployerPhoneNumber.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		@And("user verify the State below the Employment Details")
		public void user_verify_the__below_the_employment_details() {
			WebElement State = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("State"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(State.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the City below the Employment Details")
		public void user_verify_the_city_below_the_employment_details() {
			WebElement City = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("City"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(City.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		

		@And("user verify the Pin code below the Employment Details")
		public void user_verify_the_pin_code_below_the_employment_details() {
			WebElement PinCode = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PinCode"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(PinCode.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Sector below the Employment Details")
		public void user_verify_the_sector_below_the_employment_details() {
			WebElement Sector = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Sector"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(Sector.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Industry Sub Sector below the Employment Details")
		public void user_verify_the_industry_sub_sector_below_the_employment_details() {
			WebElement IndustrySubSector = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IndustrySubSector"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(IndustrySubSector.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the No Of Partners  below the Employment Details")
		public void user_verify_the_no_of_partners_below_the_employment_details() {
			WebElement NumberOfPartners = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(NumberOfPartners.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Nature OF Business below the Employment Details")
		public void user_verify_the_nature_of_business_below_the_employment_details() {
			WebElement NatureOfBusiness = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(NatureOfBusiness.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Registered Business Name below the Employment Details")
		public void user_verify_the_registered_business_name_below_the_employment_details() {
			WebElement RegisteredBusinessName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(RegisteredBusinessName.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Registered Business Numbe below the Employment Details")
		public void user_verify_the_registered_business_numbe_below_the_employment_details() {
			WebElement RegisteredBusinessNumber = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(RegisteredBusinessNumber.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Business Registration Date below the Employment Details")
		public void user_verify_the_business_registration_date_below_the_employment_details() {
			WebElement BusinessRegisterationDate = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(BusinessRegisterationDate.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Office Premises Type below the Employment Details")
		public void user_verify_the_office_premises_type_below_the_employment_details() {
			WebElement OficessPremisesType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(OficessPremisesType.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Share Holder Percentage below the Employment Details")
		public void user_verify_the_share_holder_percentage_below_the_employment_details() {
			WebElement ShareHolderPercentage = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHolderPercentage"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(ShareHolderPercentage.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the No Of Employees below the Employment Details")
		public void user_verify_the_no_of_employees_below_the_employment_details() {
			WebElement NoOfEmployees = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(NoOfEmployees.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Total Experience below the Employment Details")
		public void user_verify_the_total_experience_years_below_the_employment_details() {
			WebElement TotalExperience = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(TotalExperience.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Experience At Current Employment below the Employment Details")
		public void user_verify_the_experience_at_current_employment_below_the_employment_details() {
			WebElement ExperienceAtCurrentEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ExperienceAtCurrentEmployment"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(ExperienceAtCurrentEmployment.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Direct Manager below the Employment Details")
		public void user_verify_the_direct_manager_below_the_employment_details() {
			WebElement DirectManager = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(DirectManager.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Employer City Code below the Employment Details")
		public void user_verify_the_employer_city_code_below_the_employment_details() {
			WebElement EmployerCityCode = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerCityCode"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(EmployerCityCode.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Retirement Age below the Employment Details")
		public void user_verify_the_retirement_age_years_below_the_employment_details() {
			WebElement RetirementAge = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAge"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(RetirementAge.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("user verify the Remarks below the Employment Details")
		public void user_verify_the_remarks_below_the_employment_details() {
			WebElement Remarks = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks"));
			for (int i = 0; i <= 2000; i++) {
				try {
					Assert.assertTrue(Remarks.isDisplayed());
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("user validate the Employment Period Validation below  the Employment Details")
		public void user_validate_the_employment_period_validation_the_employment_details() {
			String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriodValidation")).getAttribute("aria-label");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmploymentPeriod.contains("Current"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Nature Of Employment Validation below  the Employment Details")
		public void user_validate_the_nature_of_employment_validation_the_employment_details() {
			String NatureOfEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-label");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(NatureOfEmployment.contains("Business"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Employer Name If Validation below  the Employment Details")
		public void user_validate_the_employer_name_if_validation_the_employment_details() {
			String EmployerName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIfValidation")).getAttribute("ng-reflect-model");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmployerName.contains("Test"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Employee Id Validation below the Employment Details")
		public void user_validate_the_employee_id_validation_the_employment_details() {
			String EmployeeId = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeIdValidation")).getAttribute("ng-reflect-model");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmployeeId.contains("0288"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Date Of Joining Validation below the Employment Details")
		public void user_validate_the_date_of_joining_validation_the_employment_details() {
			String DateOfJoiningValidation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoiningValidation")).getAttribute("ng-reflect-model");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(DateOfJoiningValidation.contains("31"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Employment Type Validation below  the Employment Details")
		public void user_validate_the_employment_type_validation_the_employment_details() {
			String EmploymentTypeValidation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentTypeValidation")).getAttribute("aria-label");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmploymentTypeValidation.contains("PERMANENT"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }}

		@And("user validate the Share HOlder Percentage Validation below  the Employment Details")
		public void user_validate_the_share_h_older_percentage_validation_the_employment_details() {
			String ShareHOlderPercentage = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentageValidation")).getAttribute("ng-reflect-model");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(ShareHOlderPercentage.contains("5"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Total Experience Validation below the Employment Details")
		public void user_validate_the_total_experience_validation_the_employment_details() {
			String TotalExperienceValidation = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperienceValidation")).getAttribute("ng-reflect-model");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(TotalExperienceValidation.contains("2"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@And("user validate the Retirement Age Validation below the Employment Details")
		public void user_validate_the_retirement_age_validation_the_employment_details() {
			String RetirementAge = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAgeValidation")).getAttribute("ng-reflect-model");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(RetirementAge.contains("60"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		
		@And("user verify the back button below the Employment Details")
		public void user_verify_the_back_button_below_the_employment_details() {
			
        WebElement pageTop = javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");

						for (int i = 0; i <= 1000; i++) {

							try {

								javascriptHelper.scrollIntoView(pageTop);

								break;

							} catch (Exception e) {

								if (i == 1000) {

									Assert.fail(e.getMessage());

								}

							}

						}


						for (int i = 0; i <= 1000; i++) {

							try {

								javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BackButton")).click();

								break;

							} catch (Exception e) {

								if (i == 1000) {

									Assert.fail(e.getMessage());

								}

							}

						}

					}
		
		@And("user verify the primary Employment Default Vale As Yes below the Employment Details")
		public void user_verify_the_primary_employment_default_vale_as_yes_below_the_employment_details() {
			String PrimaryEmploymentDefaultValueCheck = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmploymentDefaultValueCheck")).getAttribute("value");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(PrimaryEmploymentDefaultValueCheck.contains("on"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		    
		}

		

		@And("user click the Action button for the Company\\/Firm")
		public void user_click_the_action_button_for_the_company_firm() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtNCusFin_for_Company/firm")).click();
				
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_6047 get the test data for test case ID AT_EDC_04")
		public void get_the_test_data_for_test_case_id_at_edc_04() {
			testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_04");

		}
		
		@And("user verify the Nature of Employment below the Employment Details in CF")
		public void user_verify_the_nature_of_employment_below_the_employment_details_in_cf() {
	       if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
					SoftAssert.fail("Check Nature of Employment Field");
				}
			  
		}

		@And("user verify the Company Type below the Employment Details in CF")
		public void user_verify_the_company_type_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType")).isDisplayed()) {
				SoftAssert.fail("Check Company Type Field");
			}
		  
		}

		@And("user verify the Profession below the Employment Details in CF")
		public void user_verify_the_profession_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession")).isDisplayed()) {
				SoftAssert.fail("Check the Profession Field");
			}
		  
		}

		@And("user verify the Profession Type below the Employment Details in CF")
		public void user_verify_the_profession_type_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType")).isDisplayed()) {
				SoftAssert.fail("Check the Profession Type Field");
			}
		}

		@And("user verify the Statutory Authority below the Employment Details in CF")
		public void user_verify_the_statutory_authority_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority")).isDisplayed()) {
				SoftAssert.fail("Check the Statutory Authority Field");
			}
		}

		@And("user verify the Employment End Date below the Employment Details in CF")
		public void user_verify_the_employment_end_date_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
				SoftAssert.fail("Check the Employment End Date Field");
			}
		}

		@And("user verify Employer Phone Extension below the Employment Details in CF")
		public void user_verify_employer_phone_extension_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Employer Phone Extension Field");
			}
		}

		@And("user verify the No Of Partners  below the Employment Details in CF")
		public void user_verify_the_no_of_partners_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners")).isDisplayed()) {
				SoftAssert.fail("Check the No Of Partners Field");
			}
		}

		@And("user verify the Nature OF Business below the Employment Details in CF")
		public void user_verify_the_nature_of_business_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness")).isDisplayed()) {
				SoftAssert.fail("Check the Nature OF Business Field");
			}
		}

		@And("user verify the Registered Business Name below the Employment Details in CF")
		public void user_verify_the_registered_business_name_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName")).isDisplayed()) {
				SoftAssert.fail("Check the Registered Business Name Field");
			}
		}

		@And("user verify the Registered Business Numbe below the Employment Details in CF")
		public void user_verify_the_registered_business_numbe_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber")).isDisplayed()) {
				SoftAssert.fail("Check the Registered Business Numbe Field");
			}
		}

		@And("user verify the Business Registration Date below the Employment Details in CF")
		public void user_verify_the_business_registration_date_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).isDisplayed()) {
				SoftAssert.fail("Check the Business Registration Date Field");
			}
		}

		@And("user verify the Office Premises Type below the Employment Details in CF")
		public void user_verify_the_office_premises_type_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType")).isDisplayed()) {
				SoftAssert.fail("Check the Office Premises Type Field");
			}
		}

		@And("user verify the Share Holder Percentage below the Employment Details in CF")
		public void user_verify_the_share_holder_percentage_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHolderPercentage")).isDisplayed()) {
				SoftAssert.fail("Check the Share Holder Percentage Field");
			}
		}

		@And("user verify the No Of Employees below the Employment Details in CF")
		public void user_verify_the_no_of_employees_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).isDisplayed()) {
				SoftAssert.fail("Check the No Of Employees Field");
			}
		}

		@And("user verify the Remarks below the Employment Details in CF")
		public void user_verify_the_remarks_below_the_employment_details_in_cf() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
				SoftAssert.fail("Check the Remarks Field");
			}
		}

		

		@Given("User_6047 Get the test data for test case ID AT_EDC_05")
		public void Get_the_test_data_for_test_case_id_at_edc_05() {
		  testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_05");
		}

		@And("user click the Action button for the Pensioner")
		public void user_click_the_action_button_for_the_pensioner() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Pensioner")).click();
				
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		}
		@And("user verify the Employment Period in Pensioner below the Employment Details")
		public void user_verify_the_employment_period_in_pensioner_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod")).isDisplayed()) {
				SoftAssert.fail("Check the Employment Period Field");
			}
		}

		@And("user verify the Nature of Employment in Pensioner below the Employment Details")
		public void user_verify_the_nature_of_employment_in_pensioner_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
				SoftAssert.fail("Check Nature of Employment Field");
			}
		}

		@And("user verify the Employer Name in Pensioner below the Emp Details")
		public void user_verify_the_employment_name_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName")).isDisplayed()) {
				SoftAssert.fail("Check Employer Name Field");
			}
		}

		@And("user verify the Employer Name If in Pensioner below the Emp Details")
		public void user_verify_the_employment_name_if_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf")).isDisplayed()) {
				SoftAssert.fail("Check Employer Name If Field");
			}
		}

		@And("user verify the Employee Id in Pensioner below the Emp Details")
		public void user_verify_the_employee_id_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId")).isDisplayed()) {
				SoftAssert.fail("Check Employee Id Field");
			}
		
		}

		@And("user verify the Date Of Joining in Pensioner below the Emp Details")
		public void user_verify_the_date_of_joining_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining")).isDisplayed()) {
				SoftAssert.fail("Check Date Of Joining Field");
			}
		
		}

		@And("user verify the Employment End Date in Pensioner below the Emp Details")
		public void user_verify_the_employment_end_date_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
				SoftAssert.fail("Check Employment End Date Field");
			}
		}

		@And("user verify the Department in Pensioner below the Emp Details")
		public void user_verify_the_department_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).isDisplayed()) {
				SoftAssert.fail("Check Department Field");
			}
		}

		@And("user verify the Designation in Pensioner below the Emp Details")
		public void user_verify_the_designation_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation")).isDisplayed()) {
				SoftAssert.fail("Check Designation Field");
			}
		}

		@And("user verify the Employment Type in Pensioner below the Emp Details")
		public void user_verify_the_employment_type_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType")).isDisplayed()) {
				SoftAssert.fail("Check The Employment Type Field");
			}
		}

		@And("user verify the Direct Manager Contact Number Extension in Pensioner below the Emp Details")
		public void user_verify_the_direct_manager_contact_number_extension_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Direct Manager Contact Number Extension Field");
			}
		}

		@And("user verify the Direct Manager Phone Number in Pensioner below the Emp Details")
		public void user_verify_the_direct_manager_phone_number_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber")).isDisplayed()) {
				SoftAssert.fail("Check the Direct Manager Phone Number Field");
			}
		}

		@And("user verify the Income Paymode in Pensioner below the Emp Details")
		public void user_verify_the_income_paymode_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).isDisplayed()) {
				SoftAssert.fail("Check Income Paymode Field");
			}
		}

		@And("user verify Employer Phone Extension in Pensioner below the Emp Details")
		public void user_verify_employer_phone_extension_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Employer Phone Extension Field");
			}
		}

		@And("user verify the Employer Phone Number in Pensioner below the Emp Details")
		public void user_verify_the_employer_phone_number_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber")).isDisplayed()) {
				SoftAssert.fail("Check the Employer Phone Number Field");
			}
		}

		@And("user verify the State in Pensioner below the Emp Details")
		public void user_verify_the_state_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("State")).isDisplayed()) {
				SoftAssert.fail("Check the State Field");
			}
		}

		@And("user verify the Pin code in Pensioner below the Emp Details")
		public void user_verify_the_pin_code_in_pensioner_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PinCode")).isDisplayed()) {
				SoftAssert.fail("Check Pin code Field");
			}
		}

		@And("user verify the Total Experience in Pensioner below the Emp Details")
		public void user_verify_the_total_experience_in_pensioner_below_the_emp_details() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience")).isDisplayed()) {
				SoftAssert.fail("Check the Total Experience Field");
			}
		}

		@And("user verify the Experience At Current Employment in Pensioner below the Emp Details")
		public void user_verify_the_experience_at_current_employment_in_pensioner_below_the_emp_details() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ExperienceAtCurrentEmployment")).isDisplayed()) {
				SoftAssert.fail("Check the Experience At Current Employment Field");
			}
		}

		@And("user verify the Direct Manager in Pensioner below the Emp Details")
		public void user_verify_the_direct_manager_in_pensioner_below_the_emp_details() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager")).isDisplayed()) {
				SoftAssert.fail("Check the Direct Manager Field");
			}
		}

		@And("user verify the Employer City Code in Pensioner below the Emp Details")
		public void user_verify_the_employer_city_code_in_pensioner_below_the_emp_details() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerCityCode")).isDisplayed()) {
				SoftAssert.fail("Check the Employer City Code Field");
			}
		}

		@And("user verify the Retirement Age in Pensioner below the Emp Details")
		public void user_verify_the_retirement_age_in_pensioner_below_the_emp_details() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAge")).isDisplayed()) {
				SoftAssert.fail("Check the Retirement Age Field");
			}
		}

		@And("user verify the Remarks in Pensioner below the Emp Details")
		public void user_verify_the_remarks_in_pensioner_below_the_emp_details() {
			if (!javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
				SoftAssert.fail("Check the Remarks Field");
			}
		}
        
		
		@Then("User_6047 Get the test data for test case ID AT_EDC_09")
		public void get_the_test_data_for_test_case_id_at_edc_09() {
			  testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_09");
		}


     	@Given("user click the Action button for the Self-employed")
		public void user_click_the_action_button_for_the_self_employed() {
     		for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Self-employed")).click();
				
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		}

		@Then("user verify the Nature of Employment in Self-employed below the Employment Details")
		public void user_verify_the_nature_of_employment_in_self_employed_below_the_employment_details() {
			 
			 if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
					SoftAssert.fail("Check Nature of Employment Field");
				}
		}

		@Then("user verify the Company Type in Self-employed below the Employment Details")
		public void user_verify_the_company_type_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType")).isDisplayed()) {
				SoftAssert.fail("Check Company Type Field");
			}
		}

		@Then("user verify the Profession in Self-employedbelow the Employment Details")
		public void user_verify_the_profession_in_self_employedbelow_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession")).isDisplayed()) {
				SoftAssert.fail("Check the Profession Field");
			}
		}

		@Then("user verify the Profession Type in Self-employed below the Employment Details")
		public void user_verify_the_profession_type_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType")).isDisplayed()) {
				SoftAssert.fail("Check the Profession Type Field");
			}
		}

		@Then("user verify the Statutory Authority in Self-employed below the Employment Details")
		public void user_verify_the_statutory_authority_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority")).isDisplayed()) {
				SoftAssert.fail("Check the Statutory Authority Field");
			}
		}

		@Then("user verify the Employment End Date in Self-employed below the Employment Details")
		public void user_verify_the_employment_end_date_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
				SoftAssert.fail("Check the Employment End Date Field");
			}
		}

		@Then("user verify the Income Paymode in Self-employed below the Employment Details")
		public void user_verify_the_income_paymode_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).isDisplayed()) {
				SoftAssert.fail("Check Income Paymode Field");
			}
		}

		@Then("user verify Employer Phone Extension in Self-employed below the Employment Details")
		public void user_verify_employer_phone_extension_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Employer Phone Extension Field");
			}
		}

		@Then("user verify the No Of Partners in Self-employed  below the Employment Details")
		public void user_verify_the_no_of_partners_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners")).isDisplayed()) {
				SoftAssert.fail("Check the No Of Partners Field");
			}
		}

		@Then("user verify the Nature OF Business in Self-employed below the Employment Details")
		public void user_verify_the_nature_of_business_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness")).isDisplayed()) {
				SoftAssert.fail("Check the Nature OF Business Field");
			}
		}

		@Then("user verify the Registered Business Name in Self-employed Name below the Employment Details")
		public void user_verify_the_registered_business_in_self_employed_name_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName")).isDisplayed()) {
				SoftAssert.fail("Check the Registered Business Name Field");
			}
		}

		@Then("user verify the Registered Business Number in Self-employed below the Employment Details")
		public void user_verify_the_registered_business_number_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber")).isDisplayed()) {
				SoftAssert.fail("Check the Registered Business Numbe Field");
			}
		}

		@Then("user verify the Business Registration Date in Self-employed below the Employment Details")
		public void user_verify_the_business_registration_date_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).isDisplayed()) {
				SoftAssert.fail("Check the Business Registration Date Field");
			}
		}

		@Then("user verify the Office Premises Type in Self-employed below the Employment Details")
		public void user_verify_the_office_premises_type_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType")).isDisplayed()) {
				SoftAssert.fail("Check the Office Premises Type Field");
			}
		}

		@Then("user verify the Share Holder Percentage in Self-employed below the Employment Details")
		public void user_verify_the_share_holder_percentage_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHolderPercentage")).isDisplayed()) {
				SoftAssert.fail("Check the Share Holder Percentage Field");
			}
		}

		@Then("user verify the No Of Employees in Self-employed below the Employment Details")
		public void user_verify_the_no_of_employees_in_self_employed_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).isDisplayed()) {
				SoftAssert.fail("Check the No Of Employees Field");
			}
		}

		
		@Then("user verify the Remarks in Self-employed below the Emp Details")
		public void user_verify_the_remarks_in_self_employed_below_the_emp_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
				SoftAssert.fail("Check the Remarks Field");
			}
		}

		@Then("User_6047 Get the test data for test case ID AT_EDC_07")
		public void user_get_the_test_data_for_test_case_id_at_edc() {
			 testData =  EmpDetailsCom_firmTestData.getTestdata("DS01_AT_EDC_07");
		}

		@And("User_6047 click the Action button for the Salaried")
		public void user_6047_click_the_action_button_for_the_salaried() {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ActionBtn_for_Salaried")).click();
				
					break;
					
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("User_6047 verify the Nature of Employment in Salaried below the Employment Details")
		public void user_6047_verify_the_nature_of_employment_in_self_employed_below_the_employment_details() {
			  if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).isDisplayed()) {
					SoftAssert.fail("Check Nature of Employment Field");
				}
			  
		}

		@Then("User_6047 verify the Employer Name in Salaried below the Employment Details")
		public void user_6047_verify_the_employer_name_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName")).isDisplayed()) {
				SoftAssert.fail("Check Employer Name Field");
			}
		}

		@Then("User_6047 verify the Employer Name If \\(Others) in Salaried below the Employment Details")
		public void user_6047_verify_the_employer_name_if_others_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf")).isDisplayed()) {
				SoftAssert.fail("Check Employer Name If Field");
			}
		}

		@Then("User_6047 verify the Employee Id in Salaried below the Employment Details")
		public void user_6047_verify_the_employee_id_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId")).isDisplayed()) {
				SoftAssert.fail("Check Employee Id Field");
			}
		}

		@Then("User_6047 verify the Date Of Joining in Salaried below the Employment Details")
		public void user_6047_verify_the_date_of_joining_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining")).isDisplayed()) {
				SoftAssert.fail("Check Date Of Joining Field");
			}
		}
		@Then("User_6047 verify the Employment End Date in Salaried below the Employment Details")
		public void user_6047_verify_the_employment_end_date_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).isDisplayed()) {
				SoftAssert.fail("Check Employment End Date Field");
			}
		}

		@Then("User_6047 verify the Department in Salaried below the Employment Details")
		public void user_6047_verify_the_department_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).isDisplayed()) {
				SoftAssert.fail("Check Department Field");
			}
		}

		@Then("User_6047 verify the Designation in Salaried below the Employment Details")
		public void user_6047_verify_the_designation_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation")).isDisplayed()) {
				SoftAssert.fail("Check Designation Field");
			}
		}

		@Then("User_6047 verify the Employment Type in Salaried below the Employment Details")
		public void user_6047_verify_the_employment_type_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType")).isDisplayed()) {
				SoftAssert.fail("Check The Employment Type Field");
			}
		}

		@Then("User_6047 verify the Direct Manager Contact Number Extension in Salaried below the Employment Details")
		public void user_6047_verify_the_direct_manager_contact_number_extension_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Direct Manager Contact Number Extension Field");
			}
		}

		@Then("User_6047 verify the Direct Manager Phone Number in Salaried below the Employment Details")
		public void user_6047_verify_the_direct_manager_phone_number_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber")).isDisplayed()) {
				SoftAssert.fail("Check the Direct Manager Phone Number Field");
			}
		}

		@Then("User_6047 verify the Income Paymode in Salaried below the Employment Details")
		public void user_6047_verify_the_income_paymode_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).isDisplayed()) {
				SoftAssert.fail("Check Income Paymode Field");
			}
		}

		@Then("User_6047 verify Employer Phone Extension in Salaried below the Employment Details")
		public void user_6047_verify_employer_phone_extension_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Employer Phone Extension Field");
			}
		}

		@Then("User_6047 verify the Employer Phone Number in Salaried below the Employment Details")
		public void user_6047_verify_the_employer_phone_number_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNumber")).isDisplayed()) {
				SoftAssert.fail("Check the Employer Phone Number Field");
			}
		}

		@Then("User_6047 verify the State in Salaried below the Employment Details")
		public void user_6047_verify_the_state_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("State")).isDisplayed()) {
				SoftAssert.fail("Check the State Field");
			}
		}

		@Then("User_6047 verify the Pin code in Salaried below the Employment Details")
		public void user_6047_verify_the_pin_code_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PinCode")).isDisplayed()) {
				SoftAssert.fail("Check Pin code Field");
			}
		}

		@Then("User_6047 verify the Total Experience in Salaried below the Employment Details")
		public void user_6047_verify_the_total_experience_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience")).isDisplayed()) {
				SoftAssert.fail("Check the Total Experience Field");
			}
		}

		@Then("User_6047 verify the Experience At Current Employment in Salaried below the Employment Details")
		public void user_6047_verify_the_experience_at_current_employment_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ExperienceAtCurrentEmployment")).isDisplayed()) {
				SoftAssert.fail("Check the Experience At Current Employment Field");
			}
		}

		@Then("User_6047 verify the Direct Manager in Salaried below the Employment Details")
		public void user_6047_verify_the_direct_manager_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).isDisplayed()) {
				SoftAssert.fail("Check the Direct Manager Contact Number Extension Field");
			}
		}

		@Then("User_6047 verify the Employer City Code in Salaried below the Employment Details")
		public void user_6047_verify_the_employer_city_code_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerCityCode")).isDisplayed()) {
				SoftAssert.fail("Check the Employer City Code Field");
			}
		}

		@Then("User_6047 verify the Retirement Age in Salaried below the Employment Details")
		public void user_6047_verify_the_retirement_age_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RetirementAge")).isDisplayed()) {
				SoftAssert.fail("Check the Retirement Age Field");
			}
		}

		@Then("User_6047 verify the Remarks in Salaried below the Employment Details")
		public void user_6047_verify_the_remarks_below_the_employment_details() {
			if (javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).isDisplayed()) {
				SoftAssert.fail("Check the Remarks Field");
			}
		}

		@Then("User_6047 To check the Primary Employment field should be Toggle")
		public void user_to_check_the_primary_employment_field_should_be_toggle() {
			String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("role");

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmploymentPeriod.contains("switch")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		@Then("User_6047 To check the Primary Employment field should be Non-Mandatory")
		public void user_to_check_the_primary_employment_field_should_be_non_mandatory() {
			String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment")).getText();

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue(!(EmploymentPeriod.contains("*")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		@Then("User_6047 To check the Primary Employment field should be display only")
		public void user_to_check_the_primary_employment_field_should_be_display_only() {
			String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("ng-reflect-is-disabled");

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmploymentPeriod.contains("true")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		

	
		@Then("User_6047 To check the Employment Period field should be Drop Down")
		public void user_to_check_the_employment_period_field_should_be_drop_down() {
			String EmploymentPeriod= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriodValidation")).getAttribute("aria-haspopup");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmploymentPeriod.contains("listbox"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		

		@Then("User_6047 To check the Employment Period field should be Mandatory")
		public void user_to_check_the_employment_period_field_should_be_mandatory() {
			String EmploymentPeriod = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriod")).getText();

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmploymentPeriod.contains("*")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}
        
		@Then("User_6047 To check the Employment Period field should be display only")
		public void user_to_check_the_employment_period_field_should_be_display_only() {
			String EmploymentPeriod= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentPeriodValidation")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmploymentPeriod.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
  
		@Then("User_6047 To check the Nature of employment field should be Drop Down")
		public void user_to_check_the_nature_of_employment_field_should_be_drop_down() {
			String NatureOfEmployment= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-haspopup");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(NatureOfEmployment.contains("listbox"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("User_6047 To check the Nature of employment field should be Mandatory")
		public void user_to_check_the_nature_of_employment_field_should_be_mandatory() {
			String NatureOfEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).getText();

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((NatureOfEmployment.contains("*")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		@Then("User_6047 To check the Nature of employment field should be display only")
		public void user_to_check_the_nature_of_employment_field_should_be_display_only() {
			String NatureOfEmployment= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(NatureOfEmployment.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("User_6047 To check the Employer Name field should be Drop Down")
		public void user_to_check_the_employer_name_field_should_be_drop_down() {
			String EmployerName= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName_Check")).getAttribute("aria-haspopup");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmployerName.contains("listbox"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
//tdw
		@Then("User_6047 To check the Employer Name field should be Non-Mandatory")
		public void user_to_check_the_employer_name_field_should_be_non_mandatory() {
			String EmployerName = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName")).getText();

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue(!(EmployerName.contains("*")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		@Then("User_6047 To check the Employer Name field should be display only")
		public void user_to_check_the_employer_name_field_should_be_display_only() {
			String EmployerName= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerName_Check")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmployerName.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("User_6047 To check the Employer Name if field should be textbox")
		public void user_to_check_the_employer_name_if_field_should_be_textbox() {
			String EmployerNameIf_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIfValidation")).getAttribute("ng-reflect-type");

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmployerNameIf_textBox.contains("text")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}
//tdw
		@Then("User_6047 To check the Employer Name if field should be Mandatory")
		public void user_to_check_the_employer_name_if_field_should_be_mandatory() {
			String EmployerNameIf = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIf")).getText();

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmployerNameIf.contains("*")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		@Then("User_6047 To check the Employer Name if field should be display only")
		public void user_to_check_the_employer_name_if_field_should_be_display_only() {
			String EmployerNameIf= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerNameIfValidation")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmployerNameIf.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		

		@Then("User_6047 To check the Employee ID field should be textbox")
		public void user_to_check_the_employee_id_field_should_be_textbox() {
			String EmployeeId_text = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeIdValidation")).getAttribute("ng-reflect-type");

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmployeeId_text.contains("text")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}
 
		@Then("User_6047 To check the Employee ID field should be Mandatory")
		public void user_to_check_the_employee_id_field_should_be_mandatory() {
			String EmployeeID = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeId")).getText();

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((EmployeeID.contains("*")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
		}

		@Then("User_6047 To check the Employee ID field should be display only")
		public void user_to_check_the_employee_id_field_should_be_display_only() {
				String EmployeeID= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployeeIdValidation")).getAttribute("ng-reflect-readonly");
				for (int i = 0; i <2000; i++) {
		            try {
		                Assert.assertTrue(EmployeeID.contains("true"));
		                break;
		            } catch (Exception e) {
		                if (i==1999) {
		                    Assert.fail(e.getMessage());
		                }
		            }
		        }
		}
 
		@Then("User_6047 To check the Date of Joining field should be date")
		public void user_to_check_the_date_of_joining_field_should_be_date() {
			String DateOfJoining_As_Date = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoiningValidation")).getAttribute("ng-reflect-model");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(DateOfJoining_As_Date.contains("Tue Jan 31 2023 05:30:00 GMT+0"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("User_6047 To check the Date of Joining should be Mandatory")
		public void user_to_check_the_date_of_joining_should_be_mandatory() {
		    String DateofJoining_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoining")).getAttribute("ng-reflect-required");

			for (int i = 0; i <2000; i++) {

	          try {
                  Assert.assertTrue((DateofJoining_As_Mandy.contains("true")));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          }
	      }
			}

		@Then("User_6047 To check the Date of Joining should be display only")
		public void user_to_check_the_date_of_joining_should_be_display_only() {
			String DateofJoining_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DateOfJoiningValidation")).getAttribute("ng-reflect-is-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(DateofJoining_As_displayOnly.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		
		@Then("User_6047 To check the Employment End date field should be date")
		public void user_to_check_the_employment_end_date_field_should_be_date() {
			String EmploymentEndDate_As_Date = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Check")).getAttribute("ng-reflect-date-format");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmploymentEndDate_As_Date.contains("dd-M-yy"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("User_6047 To check the Employment End date should be Non-Mandatory")
		public void user_to_check_the_employment_end_date_should_be_non_mandatory() {
			 String EmploymentEndDate_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).getText();

				for (int i = 0; i <2000; i++) {

		          try {
	                  Assert.assertTrue(!(EmploymentEndDate_As_Mandy.contains("*")));
		              break;
		          } catch (Exception e) {
		              if (i==1999) {
		                  Assert.fail(e.getMessage());
		              }
		          }
		      }
		}

		@Then("User_6047 To check the Employment End date should be display only")
		public void user_to_check_the_employment_end_date_should_be_display_only() {
			String EmploymentEndDate_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Check")).getAttribute("ng-reflect-is-disabled");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(EmploymentEndDate_As_displayOnly.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

@Then("User_6047 To check the Department field should be Drop Down")
public void user_to_check_the_department_field_should_be_drop_down() {
	String Department_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department_Check")).getAttribute("aria-haspopup");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Department_DropDown.contains("listbox"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Department field should be Non-Mandatory")
public void user_to_check_the_department_field_should_be_non_mandatory() {
	String Department_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(Department_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Department field should be display only")
public void user_to_check_the_department_field_should_be_display_only() {
	String Department_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department_Check")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Department_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Designation field should be Drop Down")
public void user_to_check_the_designation_field_should_be_drop_down() {
	String Designation_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation_Check")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Designation_DropDown.contains("Select"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Designation field should be Non-Mandatory")
public void user_to_check_the_designation_field_should_be_non_mandatory() {
	String Designation_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(Designation_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Designation field should be display only")
public void user_to_check_the_designation_field_should_be_display_only() {
	String Designation_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Designation_Check")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Designation_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employment Type field should be Drop Down")
public void user_to_check_the_employment_type_field_should_be_drop_down() {
	String EmploymentType_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentTypeValidation")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmploymentType_DropDown.contains("Select"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employment Type field should be Mandatory")
public void user_to_check_the_employment_type_field_should_be_mandatory() {
	String EmploymentType_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmploymentType_As_Mandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employment Type field should be display only")
public void user_to_check_the_employment_type_field_should_be_display_only() {
	String EmploymentType_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentTypeValidation")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmploymentType_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Direct Manager Contact No field should be textbox")
public void user_to_check_the_direct_manager_contact_no_field_should_be_textbox() {
	String DirectManagerContactNo = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumExten_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((DirectManagerContactNo.contains("num")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Direct Manager Contact No field should be Non-Mandatory")
public void user_to_check_the_direct_manager_contact_no_field_should_be_non_mandatory() {
	String DirectManagerContactNo = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumberExtension")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(DirectManagerContactNo.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Direct Manager Contact No field should be display only")
public void user_to_check_the_direct_manager_contact_no_field_should_be_display_only() {
	String DirectManagerContactNo= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerContactNumExten_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DirectManagerContactNo.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Direct Manager Phone No field should be textbox")
public void user_to_check_the_direct_manager_phone_no_field_should_be_textbox() {
	String DirectManagerPhoneNo_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNum_check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((DirectManagerPhoneNo_textBox.contains("text")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Direct Manager Phone No field should be Non-Mandatory")
public void user_to_check_the_direct_manager_phone_no_field_should_be_non_mandatory() {
	String DirectManagerPhoneNo_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNumber")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(DirectManagerPhoneNo_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Direct Manager Phone No field should be display only")
public void user_to_check_the_direct_manager_phone_no_field_should_be_display_only() {
	String DirectManagerPhoneNo_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManagerPhoneNum_check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DirectManagerPhoneNo_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Direct Manager field should be textbox")
public void user_to_check_the_direct_manager_field_should_be_textbox() {
	String DirectManager_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((DirectManager_textBox.contains("text")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Direct Manager field should be Non-Mandatory")
public void user_to_check_the_direct_manager_field_should_be_non_mandatory() {
	String DirectManager_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(DirectManager_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Direct Manager field should be display only")
public void user_to_check_the_direct_manager_field_should_be_display_only() {
    String DirectManager_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("DirectManager_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DirectManager_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employer Phone Number field should be textbox")
public void user_to_check_the_employer_phone_number_field_should_be_textbox() {
	String EmployerPhNum_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNum_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhNum_textBox.contains("text")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employer Phone Number field should be Non-Mandatory")
public void user_to_check_the_employer_phone_number_field_should_be_non_mandatory() {
	String EmployerPhNum_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Department")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(EmployerPhNum_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employer Phone Number field should be display only")
public void user_to_check_the_employer_phone_number_field_should_be_display_only() {
	String EmployerPhNum_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneNum_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmployerPhNum_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employer City Code field should be textbox")
public void user_to_check_the_employer_city_code_field_should_be_textbox() {
	String EmployerCityCode_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhCityCode_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerCityCode_textBox.contains("text")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employer City Code field should be Non-Mandatory")
public void user_to_check_the_employer_city_code_field_should_be_non_mandatory() {
	String EmployerCityCode_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhCityCode")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(EmployerCityCode_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employer City Code field should be display only")
public void user_to_check_the_employer_city_code_field_should_be_display_only() {
	String EmployerCityCode_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhCityCode_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmployerCityCode_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employer Phone Extension field should be textbox")
public void user_to_check_the_employer_phone_extension_field_should_be_textbox() {
	String EmployerPhExt_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhExt_textBox.contains("number")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employer Phone Extension field should be Non-Mandatory")
public void user_to_check_the_employer_phone_extension_field_should_be_non_mandatory() {
	String EmployerPhExt_NonMandy  = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).getAttribute("ng-reflect-required");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhExt_NonMandy.contains("false")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Employer Phone Extension field should be display only")
public void user_to_check_the_employer_phone_extension_field_should_be_display_only() {
	String EmployerPhExt_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmployerPhExt_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Total Experience field should be Field should be dropdown")
public void user_to_check_the_total_experience_field_should_be_field_should_be_dropdown() {
	String TotalExpe_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperienceValidation")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((TotalExpe_textBox.contains("num")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Total Experience field should be Non-Mandatory")
public void user_to_check_the_total_experience_field_should_be_non_mandatory() {
	String TotalExpe_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperience")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(TotalExpe_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Total Experience field should be display only")
public void user_to_check_the_total_experience_field_should_be_display_only() {
	String TotalExpe_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("TotalExperienceValidation")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(TotalExpe_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Income Paymode field should be Field should be dropdown")
public void user_to_check_the_income_paymode_field_should_be_field_should_be_dropdown() {
	String IncomePaymode_DropDown= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode_Check")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(IncomePaymode_DropDown.contains("Select"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Income Paymode field should be Non-Mandatory")
public void user_to_check_the_income_paymode_field_should_be_non_mandatory() {
	String IncomePaymode_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(IncomePaymode_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
}

@Then("User_6047 To check the Income Paymode field should be display only")
public void user_to_check_the_income_paymode_field_should_be_display_only() {
	String IncomePaymode_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("IncomePaymode_Check")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(IncomePaymode_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Remarks field should be Field should be Text box,Non-Mandatory and display only")
public void user_to_check_the_remarks_field_should_be_field_should_be_text_box_non_mandatory_and_display_only() {
	String Remark_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getAttribute("ng-reflect-show-text-area-box");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((Remark_textBox.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
   
	String Remark_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(Remark_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String Remark_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remark_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Remark_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
	
	
}
		

@Then("User_6047 To check the Primary Employment field should be Toggle,Non-Mandatory,display only")
public void user_to_check_the_primary_employment_field_should_be_toggle_non_mandatory_display_only() {
	String PrimaryEmployment = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("role");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((PrimaryEmployment.contains("switch")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String PrimaryEmp = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment_Toggle")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((PrimaryEmp.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String PrimaryEmp_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("PrimaryEmployment")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(PrimaryEmp_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the company type field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_company_type_field_should_be_text_box_non_mandatory_display_only() {
	String companyType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType_Input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((companyType.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String companyType_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(companyType_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String companyType_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("CompanyType_Input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((companyType_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the profession type field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_profession_type_field_should_be_text_box_non_mandatory_display_only() {
	String professionType = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType_Input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((professionType.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String professionType_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(professionType_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String professionType_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ProfessionType_Input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((professionType_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the Nature of Employment field should be Drop Down,Mandatory,display only")
public void user_to_check_the_nature_of_employment_field_should_be_drop_down_mandatory_display_only() {
	String NatureOfEmp_As_DD= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-haspopup");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfEmp_As_DD.contains("listbox"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
	String NatureOfEmp_mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmployment")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((NatureOfEmp_mandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String NatureOfEmp_dispOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfEmploymentValidation")).getAttribute("aria-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfEmp_dispOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}

@Then("User_6047 To check the Profession field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_profession_field_should_be_text_box_non_mandatory_display_only() {
	String profession = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession_input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((profession.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String profession_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(profession_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	
	String profession_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Profession_input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((profession_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
}

@Then("User_6047 To check the Statutory authority field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_statutory_authority_field_should_be_text_box_non_mandatory_display_only() {
	String StatutoryAuthority_As_TextBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority_input")).getAttribute("ng-reflect-placeholder");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((StatutoryAuthority_As_TextBox.contains("Select")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	
	String StatutoryAuthority_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(StatutoryAuthority_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      
}}
	String StatutoryAuthority_As_disp_Only = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("StatutoryAuthority_input")).getAttribute("ng-reflect-is-disabled");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((StatutoryAuthority_As_disp_Only.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	}

@Then("User_6047 To check the Employment end date field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_employment_end_date_field_should_be_text_box_non_mandatory_display_only() {
	String EmploymentEndDate_As_Date = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmploymentEndDate_As_Date.contains("text"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String EmploymentEndDate_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(EmploymentEndDate_As_Mandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String EmploymentEndDate_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmploymentEndDate_Check")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmploymentEndDate_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Employer Phone extension field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_employer_phone_extension_field_should_be_text_box_non_mandatory_display_only() {
	String EmployerPhExt_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-type");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhExt_textBox.contains("number")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String EmployerPhExt_NonMandy  = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("EmployerPhoneExtension")).getAttribute("ng-reflect-required");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((EmployerPhExt_NonMandy.contains("false")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String EmployerPhExt_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Employer_Ph_Exten_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(EmployerPhExt_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the no of partners field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_no_of_partners_field_should_be_text_box_non_mandatory_display_only() {
	String noOfPartners_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(noOfPartners_As_textBox.contains("num"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String noOfPartners_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(noOfPartners_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String noOfPartners_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NumberOfPartners_Input")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(noOfPartners_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Nature of business field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_nature_of_business_field_should_be_text_box_non_mandatory_display_only() {
	String NatureOfBusiness_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness_Input")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfBusiness_As_textBox.contains("Sel"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String NatureOfBusiness_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(NatureOfBusiness_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String NatureOfBusiness_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NatureOfBusiness_Input")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NatureOfBusiness_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Registered business name field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_registered_business_name_field_should_be_text_box_non_mandatory_display_only() {

		String RegisteredBusinessName_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName_Input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RegisteredBusinessName_As_textBox.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String RegisteredBusinessName_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName")).getText();

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue(!(RegisteredBusinessName_As_NonMandy.contains("*")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }
	  }
		String RegisteredBusinessName_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessName_Input")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RegisteredBusinessName_As_displayOnly.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
}

@Then("User_6047 To check the Registered business number field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_registered_business_number_field_should_be_text_box_non_mandatory_display_only() {
	String RegisteredBusinessNumber_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(RegisteredBusinessNumber_As_textBox.contains("text"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String RegisteredBusinessNumber_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(RegisteredBusinessNumber_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String RegisteredBusinessNumber_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("RegisteredBusinessNumber_Input")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(RegisteredBusinessNumber_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}

@Then("User_6047 To check the Business registration date field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_business_registration_date_field_should_be_text_box_non_mandatory_display_only() {
	String BusinessRegDate_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate_Input")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(BusinessRegDate_As_textBox.contains("text"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String BusinessRegDate_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(BusinessRegDate_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String BusinessRegDate_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BusinessRegisterationDate")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(BusinessRegDate_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }

}

@Then("User_6047 To check the Office premises type field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_office_premises_type_field_should_be_text_box_non_mandatory_display_only() {
	String OfficepremisesType_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OfficessPremisesType_Input")).getAttribute("ng-reflect-placeholder");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(OfficepremisesType_As_textBox.contains("Select"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String OfficepremisesType_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OficessPremisesType")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(OfficepremisesType_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String OfficepremisesType_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("OfficessPremisesType_Input")).getAttribute("ng-reflect-is-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(OfficepremisesType_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Shareholder percentage field should be TextBox,Mandatory,display only")
public void user_to_check_the_shareholder_percentage_field_should_be_text_box_mandatory_display_only() {
	String ShareholderPercentage_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentageValidation")).getAttribute("type");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ShareholderPercentage_As_textBox.contains("num"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String ShareholderPercentage_As_Mandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentage")).getAttribute("ng-reflect-required");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((ShareholderPercentage_As_Mandy.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String ShareholderPercentage_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("ShareHOlderPercentageValidation")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ShareholderPercentage_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the No of Employes field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_no_of_employes_field_should_be_text_box_non_mandatory_display_only() {
	String NoOfEmployes_As_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).getAttribute("ng-reflect-show-text-box");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NoOfEmployes_As_textBox.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	String NoOfEmployes_As_NonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(NoOfEmployes_As_NonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String NoOfEmployes_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("NoOfEmployees_Input")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(NoOfEmployes_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

@Then("User_6047 To check the Remarks field should be TextBox,Non-Mandatory,display only")
public void user_to_check_the_remarks_field_should_be_text_box_non_mandatory_display_only() {
	String Remark_textBox = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getAttribute("ng-reflect-show-text-area-box");

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue((Remark_textBox.contains("true")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
   
	String Remark_nonMandy = javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remarks")).getText();

	for (int i = 0; i <2000; i++) {

      try {
          Assert.assertTrue(!(Remark_nonMandy.contains("*")));
          break;
      } catch (Exception e) {
          if (i==1999) {
              Assert.fail(e.getMessage());
          }
      }
  }
	String Remark_As_displayOnly= javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("Remark_Check")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Remark_As_displayOnly.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	
}

 int view = 0;

 @Then("User_6047 click the Search button under customer employment and check the matching data in listview")
public void user_click_the_search_button_under_customer_employment_and_check_the_matching_data_in_listview() throws Throwable {

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

//				for (int i = 0; i <= 300; i++) {

//					try {

//						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));

//						break;

//					} catch (Exception e) {

//						if (i == 300) {

//							Assert.fail(e.getMessage());

//						}

//					}

//				}

				for ( view = 0; view < premitiveListOfAddButton; view++) {

					for (int k = 0; k <= 300; k++) {

						try {

							addButtonScreenName = javascriptHelper.executeScript(

									"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

											+ view + "].textContent")

									.toString();

							System.out.println("Screen Name " + addButtonScreenName);

							if (!(addButtonScreenName.isBlank())) {

								System.out.println("Screen Name" + addButtonScreenName + " is Not null");

								if ((addButtonScreenName.trim()).contains(("Customer Employment List").trim())) {

									System.out.println("Inside nested loop");

									//System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");

//									javascriptHelper

//									.executeScriptWithWebElement(

//											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")

//											.click();

									javascriptHelper.JSEClick(javascriptHelper

											.executeScriptWithWebElement(

											"document.querySelectorAll('button[ng-reflect-icon=\"pi pi-search\"]')[" + view + "]"));

											
								javascriptHelper                    

									.executeScriptWithWebElement(

									"document.querySelector('span[class=\"p-input-icon-left ng-star-inserted\"] input')")

									.sendKeys("business");

									isAddButtonClicked = true;

									System.out.println("clicked ");
									break;

								}

							}

						} catch (Exception e) {

							if (k == 300) {

								//Assert.fail(e.getMessage());

							}

						}

	 

					}

					if (isAddButtonClicked == true) {

						break;

					}

				}

			}

		
		
		
		
@Then("User_6047 check the result data")
public void user_check_the_result_data() throws Throwable{
	
		
	//document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')[0].querySelector('span[class="p-paginator-current ng-star-inserted"]').innerText

	//Showing 0 to 0 of 0 entries

			String searchResult = "";

	 

			for (int i = 0; i <= 300; i++) {

				try {

					if (i > 200) {

						searchResult = javascriptHelper.executeScript(

								"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["

										+ view

										+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")

								.toString();

						break;

					}

	 

				} catch (Exception e) {

	 

					if (i == 300) {

						Assert.fail(e.getMessage());

					}

	 

				}

			}

			System.out.println(searchResult);

	 

			softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");

		}

@Then("User_6047 click the Search button under customer employment and check the mismatch data in listview")
public void user_click_the_search_button_under_customer_employment_and_check_the_mismatch_data_in_listview() {
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

//	for (int i = 0; i <= 300; i++) {

//		try {

//			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));

//			break;

//		} catch (Exception e) {

//			if (i == 300) {

//				Assert.fail(e.getMessage());

//			}

//		}

//	}

	for ( view = 0; view < premitiveListOfAddButton; view++) {

		for (int k = 0; k <= 300; k++) {

			try {

				addButtonScreenName = javascriptHelper.executeScript(

						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["

								+ view + "].textContent")

						.toString();

				System.out.println("Screen Name " + addButtonScreenName);

				if (!(addButtonScreenName.isBlank())) {

					System.out.println("Screen Name" + addButtonScreenName + " is Not null");

					if ((addButtonScreenName.trim()).contains(("Customer Employment List").trim())) {

						System.out.println("Inside nested loop");

						//System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");

//						javascriptHelper

//						.executeScriptWithWebElement(

//								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")

//								.click();

						javascriptHelper.JSEClick(javascriptHelper

								.executeScriptWithWebElement(

								"document.querySelectorAll('button[ng-reflect-icon=\"pi pi-search\"]')[" + view + "]"));

								
					javascriptHelper                    

						.executeScriptWithWebElement(

						"document.querySelector('span[class=\"p-input-icon-left ng-star-inserted\"] input')")

						.sendKeys("dataa");
					
					Thread.sleep(3000);

						isAddButtonClicked = true;

						System.out.println("clicked ");
						break;

					}

				}

			} catch (Exception e) {

				if (k == 300) {

					//Assert.fail(e.getMessage());

				}

			}



		}

		if (isAddButtonClicked == true) {

			break;

		}

	}

}

@Then("User_6047 check the result")
public void user_check_the_result() {
	
	String searchResult = "";

	 

	for (int i = 0; i <= 300; i++) {

		try {

			if (i > 200) {

				searchResult = javascriptHelper.executeScript(

						"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["

								+ view

								+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")

						.toString();

				break;

			}



		} catch (Exception e) {



			if (i == 300) {

				Assert.fail(e.getMessage());

			}



		}

	}

	System.out.println(searchResult);



	softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");

}


@And("User_6047 click the back button")
public void user_click_the_back_button() {
	for (int i = 0; i <= 300; i++) {
		try {
			//javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(EmpDetailElements.getElement("BackButton")));

			javascriptHelper.JSEClick(javascriptHelper

					.executeScriptWithWebElement(

					"document.querySelector('button[icon=\"pi pi-arrow-left\"]')"));
		
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
}





}

