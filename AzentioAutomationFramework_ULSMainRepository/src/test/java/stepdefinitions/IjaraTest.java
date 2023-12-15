package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
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
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getIjarahTestDataFilePath();
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	ExcelData excelDataForAddressDetailsTestData = new ExcelData(excelTestDataPath, "ijarah_AddressDetailsTestData",
			"Dataset ID");
	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"Test Case ID","DataSet ID");
	Map<String, String> addressDetailsTestData = new HashMap<>();
	JSPaths addressDetailsJSPaths = new JSPaths(excelPath, "addressdetails_WebElements",
			"Ijarah_AddressDetailsFieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";
	JSPaths CustomerAddressDetails = new JSPaths(excelPath, "CustomerAddressDetails",
			"Ijarah_CustomerAddressDetailsFieldName", "JSPath");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> AssetDetailsTestData = new HashMap<>();
	ExcelData excelDataForAssetDetailsTestData = new ExcelData(excelTestDataPath, "AssetDetailsTestData",
			"Dataset ID");
	JSPaths AssetDetailElements = new JSPaths(excelPath, "AssetDetailElements",
			"Ijarah_AssetDetailsFieldName", "JSPath");
	JSPaths DocumentDetailsElements = new JSPaths(excelPath, "DocumentDetailsElements",
			"Ijarah_DocmentDetailsFieldName", "JSPath");
	JSPaths L1Approval = new JSPaths(excelPath, "L1Approval",
			"Ijarah_ApprovalFieldName", "JSPath");
	
	

	@Then("User_626 logout from the ijaraApplication")
	public void user_626_logout_from_the_ijara_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}

	@And("user_626 click on module dropdown in IJRARAH")
	public void user_626_click_on_module_dropdown_in_ijrarah() throws Throwable {
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

	@And("user_626 click on LOS option in module dropdown")
	public void user_626_click_on_los_option_in_module_dropdown() throws Throwable {
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

	@And("user_626 click on mail box")
	public void user_626_click_on_mail_box() throws Throwable {
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

	@And("user_626 click on search box upon click on the mail box")
	public void user_626_click_on_search_box_upon_click_on_the_mail_box() throws Throwable {
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

	@And("user_626 click on search text box upon click the search button")
	public void user_626_click_on_search_text_box_upon_click_the_search_button() throws Throwable {
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

	@And("user_626 search the record reference number in search text box")
	public void user_626_search_the_record_reference_number_in_search_text_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(AssetDetailsTestData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_626 select the record form mail box")
	public void user_626_select_the_record_form_mail_box() throws Throwable {
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

	@And("user_626 click on additional customer info tab")
	public void user_626_click_on_additional_customer_info_tab() throws Throwable {
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

	@And("user_626_click edit button of customer personal information record")
	public void user_626_click_edit_button_of_customer_personal_information_record() throws Throwable {
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

	@And("user_626_click on add button of address details")
	public void user_626_click_on_add_button_of_address_details() throws Throwable {
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

	@And("user_626 get the test data for test case ID AT_AD_001")
	public void get_the_test_data_for_test_case_id_at_AT_AD_001() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_001");

	}

	@And("user_626 get the test data for test case ID AT_AD_002")
	public void get_the_test_data_for_test_case_id_at_AT_AD_002() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_002");

	}

	@And("user_626 get the test data for test case ID AT_AD_003")
	public void user_626_get_the_test_data_for_test_case_id_at_AT_AD_003() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_003");

	}

	@And("user_626 get the test data for test case ID AT_AD_005")
	public void get_the_test_data_for_test_case_id_at_AT_AD_005() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_005");

	}

	@And("user_626 get the test data for test case ID AT_AD_006")
	public void get_the_test_data_for_test_case_id_at_AT_AD_007() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_AD_006");

	}

	@Then("user_626 verify save buttton and back button should visible in address details screen")
	public void user_626_verify_save_buttton_and_back_button_should_visible_in_address_details_screen() throws Throwable {
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

 
//	public void verify_address_type_field_should_be_mandatory_and_dropdown_and_editable() throws Throwable {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type")).click();
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		softAssert.assertTrue(
//				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type"))
//						.getAttribute("aria-label").contains("*"));
//		softAssert.assertTrue(
//				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_type"))
//						.getAttribute("aria-label").contains("Select"));
//
//		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
//		String dropdownLength = "";
//		boolean isDropdownValueSelected = false;
//		String dropdownString = "";
//		for (int i = 0; i <= 300; i++) {
//			try {
//				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
//				System.out.println("Dropdown length " + dropdownLength);
//				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
//					break;
//				}
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
//		for (int j = 0; j <= premitiveDropdownLength; j++) {
//
//			for (int l = 0; l <= 300; l++) {
//				try {
//					System.out.println("L value is " + l);
//					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
//					dropdownString = javascriptHelper.executeScript(
//							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
//							.toString();
//					if (!(dropdownString.isEmpty())) {
//						System.out.println(dropdownString);
//						System.out.println("Loop count " + l + " got breaked");
//						break;
//					}
//				} catch (Exception e) {
//					if (l == 300 && !(dropdownString.isBlank())) {
//						Assert.fail(e.getMessage());
//					}
//				}
//				if (!(dropdownString.isEmpty())) {
//					System.out.println(dropdownString);
//					System.out.println("Loop count " + l + " got breaked");
//					break;
//				}
//			}
//			System.out.println("String " + dropdownString.trim());
//			System.out.println("Map " + addressDetailsTestData.get("address_type").trim());
//			if ((dropdownString.trim()).equalsIgnoreCase((addressDetailsTestData.get("address_type")).trim())) {
//
//				for (int k = 0; k <= 300; k++) {
//					try {
//
//						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
//								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
//						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
//								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
//						isDropdownValueSelected = true;
//						break;
//					} catch (Exception e) {
//						if (k == 300) {
//							Assert.fail(e.getMessage());
//
//						}
//					}
//				}
//			}
//			if (isDropdownValueSelected == true) {
//				break;
//			}
//
//		}
//
//	}

	@Then("user_626_verify address status field should be mandatory and dropdown and editable")
	public void user_626_verify_address_status_field_should_be_mandatory_and_dropdown_and_editable() throws Throwable {
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

	@Then("user_626 verify residential or occupancy status field should should be dropdown and editable")
	public void user_626_verify_residential_or_occupancy_status_field_should_should_be_dropdown_and_editable() throws Throwable {
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

	@Then("user_626 verify communication address should be non mandatory and editable")
	public void user_626_verify_communication_address_should_be_non_mandatory_and_editable() throws Throwable {

	}

	@Then("user_626 verify location address should be mandatory and editable lookup")
	public void user_626_verify_location_address_should_be_mandatory_and_editable_lookup() throws Throwable {

	}

	@Then("user_626 verify location category should be mandatory and editable lookup")
	public void user_626_verify_location_category_should_be_mandatory_and_editable_lookup() throws Throwable {
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

	@Then("user_626 verify address line 1 should be mandatory editable text box")
	public void user_626_verify_address_line_1_should_be_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify address line 2 should be mandatory editable text box")
	public void user_626_verify_address_line_2_should_be_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify country should be editable mandatory text box")
	public void user_626_verify_country_should_be_editable_mandatory_text_box() throws Throwable {
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

	@Then("user_626 verify provience ID field should be mandatory editable text box")
	public void user_626_verify_provience_id_field_should_be_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626_verify Neighbourhood\\/District name field should be mandatory editable text box")
	public void user_626_verify_neighbourhood_district_name_field_should_be_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify city field should be editable mandatory text box")
	public void user_626_verify_city_field_should_be_editable_mandatory_text_box() throws Throwable {
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

	@Then("user_626 verify zipcode field should be editable mandatory textbox")
	public void user_626_verify_zipcode_field_should_be_editable_mandatory_textbox() throws Throwable {
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

	@Then("user_626_verify po box number field should be editable non mandatory text box")
	public void user_626_verify_po_box_number_field_should_be_editable_non_mandatory_text_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("po_box_number")));
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

	@Then("user_626_verify duration of stay should be non mandatory editable text numeric field")
	public void user_626_verify_duration_of_stay_should_be_non_mandatory_editable_text_numeric_field() throws Throwable {
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

	@Then("user_626 verify latitude details should be non mandatory editable text box")
	public void user_626_verify_latitude_details_should_be_non_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify longitude details should be non mandatory editable text box")
	public void user_626_verify_longitude_details_should_be_non_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify landmark details should be non mandatory editable text box")
	public void user_626_verify_landmark_details_should_be_non_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify Occupancy date should be non mandatory editable calendar")
	public void user_626_verify_occupancy_date_should_be_non_mandatory_editable_calendar() throws Throwable {
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

	@Then("user_626 verify land lord name should be non mandatory editable text box")
	public void user_626_verify_land_lord_name_should_be_non_mandatory_editable_text_box() throws Throwable {
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

	@Then("user_626 verify land lord mobile number should be non mandatory editable numeric")
	public void user_626_verify_land_lord_mobile_number_should_be_non_mandatory_editable_numeric() throws Throwable {
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

	@Then("user_626 verify rent amount should be non mandatory editable numeric")
	public void user_626_verify_rent_amount_should_be_non_mandatory_editable_numeric() throws Throwable {
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

	@Then("user_626 verify frequency rent should be non mandatory editable dropdown")
	public void user_626_verify_frequency_rent_should_be_non_mandatory_editable_dropdown() throws Throwable {
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

	@And("user_626 click on save button in address details screen")
	public void user_626_click_on_save_button_in_address_details_screen() throws Throwable {
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

	@And("user_626 click on save button without enter mandatory data")
	public void user_626_click_on_save_without_enter_mandatory_data() throws Throwable {

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

	@Then("user_626 verify system should show the validation for mandatory field")
	public void user_626_verify_system_should_show_the_validation_for_mandatory_field() throws Throwable {
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

	@And("user_626 enter the special character input in any of the field")
	public void user_626_enter_the_special_character_input_in_any_of_the_field() throws Throwable {
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

	@Then("user_626 verify system should show the validation for special character input")
	public void user_626_verify_system_should_show_the_validation_for_special_character_input() throws Throwable {
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

	@And("user_626 enter the character inputs in numeric field")
	public void user_626_enter_the_character_inputs_in_numeric_field() throws Throwable {
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

	@Then("user_626 verify system should not accept the character input in numeric field")
	public void user_626_verify_system_should_not_accept_the_character_input_in_numeric_field() throws Throwable {
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

	@Given("user_626 click on edit button on created record of address details")
	public void user_626_click_on_edit_button_on_created_record_of_address_details() throws Throwable {
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

	@And("user_626 update the any of the field in address details record")
	public void user_626_update_the_any_of_the_field_in_address_details_record() throws Throwable {
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

	@Then("user_626 verify record got approved with the updated record")
	public void user_626_verify_record_got_approved_with_the_updated_record() {
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

	@And("user_626 make the mandatiry field blank in address details screen")
	public void user_626_make_the_mandatiry_field_blank_in_address_details_screen() {
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

	@Then("user_626 verify the functionality of the back button in updated record screen")
	public void user_626_verify_the_functionality_of_the_back_button_in_updated_record_screen() {
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

	@And("user_626 change the status active to inactive for address details record")
	public void user_626_change_the_status_active_to_inactive_for_address_details_record() throws Throwable {
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

	@Then("user_626 verify system should show the record status as inactive")
	public void user_626_verify_system_should_show_the_record_status_as_inactive() throws Throwable {
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

	@And("user_626 change the status inactive to active for address details record")
	public void user_626_change_the_status_inactive_to_active_for_address_details_record() throws Throwable {
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

	@Then("user_626 verify system should show the record status as active")
	public void user_626_verify_system_should_show_the_record_status_as_active() throws Throwable {
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

	@Then("user_626 verify list view fields are shown in address details list view")
	public void user_626_verify_list_view_fields_are_shown_in_address_details_list_view() throws Throwable {
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
	@And("user_626 get the test data for test case ID AT_NADC_01")
	public void user_626_get_the_test_data_for_test_case_id_at_AT_NADC_01() throws Throwable {
		addressDetailsTestData = excelDataForAddressDetailsTestData.getTestdata("DS01_AT_NADC_001");
}

		@Given("user_626 click on action button below the Address details")
		public void user_626_click_on_action_button_below_the_address_details() {
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

		@Then("user_626 verify Address type should visible in address details screen")
		public void user_626_verify_address_type_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("Address_Type")).isDisplayed()) {
				SoftAssert.fail("Check Address Type Field");
			}
			
		}
		    
		    
		@Then("user_626 verify Address Status should visible in address details screen")
		public void user_626_verify_address_status_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_status")).isDisplayed()) {
				SoftAssert.fail("Check Address Status Field");
			}
		    
		}

		@Then("user_626 verify Residential or Occupancy Status should visible in address details screen")
		public void user_626_verify_residential_or_occupancy_status_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("residential_or_ocupency_status")).isDisplayed()) {
				SoftAssert.fail("Check residential or ocupency status Field");
			}
		    
		}

		@Then("user_626 verify Communication Address should visible in address details screen")
		public void user_626_verify_communication_address_should_visible_in_address_details_screen() {
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

		@Then("user_626 verify Address line1 should visible in address details screen")
		public void user_626_verify_address_line1_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line1")).isDisplayed()) {
				SoftAssert.fail("Check address_line1 Field");
			}
		    
		}

		@Then("user_626 verify Address line2 should visible in address details screen")
		public void user_626_verify_address_line2_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("address_line2")).isDisplayed()) {
				SoftAssert.fail("Check address_line2 Field");
			}
		    
		}

		@Then("user_626 verify Country should visible in address details screen")
		public void user_626_verify_country_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("country_AddressDetails")).isDisplayed()) {
				SoftAssert.fail("Check country AddressDetails Field");
			}
		    
		    
		}

		@Then("user_626 verify Province id  should visible in address details screen")
		public void user_626_verify_province_id_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("province_id")).isDisplayed()) {
				SoftAssert.fail("Check province id Field");
			}
		    
		}

		@Then("user_626 verify Neighbourhood should visible in address details screen")
		public void user_626_verify_neighbourhood_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("neighbourhood")).isDisplayed()) {
				SoftAssert.fail("Check neighbourhood Field");
			}		    
		}

		@Then("user_626 verify City should visible in address details screen")
		public void user_626_verify_city_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("city")).isDisplayed()) {
				SoftAssert.fail("Check city Field");
			}
		    
		}

		@Then("user_626 verify Zip Code should visible in address details screen")
		public void user_626_verify_zip_code_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("zip_code")).isDisplayed()) {
				SoftAssert.fail("Check zip code Field");
			}
		    
		}

		@Then("user_626 verify PO BOX Number should visible in address details screen")
		public void user_626_verify_po_box_number_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("po_box_number")).isDisplayed()) {
				SoftAssert.fail("Check po box number Field");
			}
		    
		}

		@Then("user_626 verify Mobile Number should visible in address details screen")
		public void user_626_verify_mobile_number_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("mobile_number_primary")).isDisplayed()) {
				SoftAssert.fail("Check mobile_number_primary Field");
			}
		    
		}

		@Then("user_626 verify Duration Of Stay should visible in address details screen")
		public void user_626_verify_duration_of_stay_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("duration_on_stay")).isDisplayed()) {
				SoftAssert.fail("Check duration_on_stay Field");
			}
		    
		}

		@Then("user_626 verify Latitude Details Of The Address  should visible in address details screen")
		public void user_626_verify_latitude_details_of_the_address_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("latitude_details_of_the_address")).isDisplayed()) {
				SoftAssert.fail("Check latitude_details_of_the_address Field");
			}
		    
		}

		@Then("user_626 verify Longitude Details Of The Address should visible in address details screen")
		public void user_626_verify_longitude_details_of_the_address_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("longitude_details_of_the_address")).isDisplayed()) {
				SoftAssert.fail("Check longitude_details_of_the_address Field");
			}
		    
		    
		}

		@Then("user_626 verify Land Mark should visible in address details screen")
		public void user_626_verify_land_mark_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landmark")).isDisplayed()) {
				SoftAssert.fail("Check landmark Field");
			}
		    
		}

		@Then("user_626 verify Occupancy Date should visible in address details screen")
		public void user_626_verify_occupancy_date_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("occupency_date")).isDisplayed()) {
				SoftAssert.fail("Check occupency_date Field");
			}		    
		}

		@Then("user_626 verify Landlord Name  should visible in address details screen")
		public void user_626_verify_landlord_name_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_name")).isDisplayed()) {
				SoftAssert.fail("Check landlord_name Field");
			} 
		    
		}

		@Then("user_626 verify Landlord Mobile Number should visible in address details screen")
		public void user_626_verify_landlord_mobile_number_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("landlord_mobile_number")).isDisplayed()) {
				SoftAssert.fail("Check landlord Mobile Number Field");
			} 		    
		}

		@Then("user_626 verify Rent Amount should visible in address details screen")
		public void user_626_verify_rent_amount_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("rent_amount")).isDisplayed()) {
				SoftAssert.fail("Check Rent Amount Field");
			}    
		}

		@Then("user_626 verify Frequency Of Rent should visible in address details screen")
		public void user_626_verify_frequency_of_rent_should_visible_in_address_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(CustomerAddressDetails.getElement("frequency_of_rent")).isDisplayed()) {
				SoftAssert.fail("Check Frequency Of Rent Field");
			}
		    
		}
		@Then("user_626 verify Address type should be mandatory")
		public void user_626_verify_address_type_should_be_mandatory() {
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


		@Then("user_626 verify Address type should be display only")
		public void user_626_verify_address_type_should_be_display_only() {
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

		@Then("user_626 verify Address type should be dropdown")
		public void user_626_verify_address_type_should_be_dropdown() {
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
		@Then("user_626 verify Address Status should be mandatory")
		public void user_626_verify_address_status_should_be_mandatory() {
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

		@Then("user_626 verify Address Status should be display only")
		public void user_626_verify_address_status_should_be_display_only() {
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

		@Then("user_626 verify Address Status should be dropdown")
		public void user_626_verify_address_status_should_be_dropdown() {
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

		@Then("user_626 verify Residential or occupancy status should be mandatory")
		public void user_626_verify_residential_or_occupancy_status_should_be_mandatory() {
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
		    
		

		@Then("user_626 verify Residential or occupancy status should be display only")
		public void user_626_verify_residential_or_occupancy_status_should_be_display_only() {
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

		@Then("user_626 verify Residential or occupancy status should be dropdown")
		public void user_626_verify_residential_or_occupancy_status_should_be_dropdown() {

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
		@Then("user_626 verify Communication address should be a toggle button")
		public void user_626_verify_communication_address_should_be_a_toggle_button() {
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

		@Then("user_626 verify Communication address should be display only")
		public void user_626_verify_communication_address_should_be_display_only() {
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
		@Then("user_626 verify Location Category should be display only")
		public void user_626_verify_location_category_should_be_display_only() {
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

		@Then("user_626 verify Location Category should be dropdown")
		public void user_626_verify_location_category_should_be_dropdown() {
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
		@Then("user_626 verify Address line1 should be mandatory")
		public void user_626_verify_address_line1_should_be_mandatory() {
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

		@Then("user_626 verify Address line1 should be display only")
		public void user_626_verify_address_line1_should_be_display_only() {
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

		@Then("user_626 verify Address line1 should be text box")
		public void user_626_verify_address_line1_should_be_text_box() {
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
		@Then("user_626 verify Address line2 should be mandatory")
		public void user_626_verify_address_line2_should_be_mandatory() {
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

		@Then("user_626 verify Address line2 should be display only")
		public void user_626_verify_address_line2_should_be_display_only() {
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

		@Then("user_626 verify Address line2 should be text box")
		public void user_626_verify_address_line2_should_be_text_box() {
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
		@Then("user_626 verify Country should be mandatory")
		public void user_626_verify_country_should_be_mandatory() {
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

		@Then("user_626 verify Country should be display only")
		public void user_626_verify_country_should_be_display_only() {
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

		@Then("user_626 verify Country should be text box")
		public void user_626_verify_country_should_be_text_box() {

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
		@Then("user_626 verify Province Id should be mandatory")
		public void user_626_verify_province_id_should_be_mandatory() {
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

		@Then("user_626 verify Province Id should be display only")
		public void user_626_verify_province_id_should_be_display_only() {
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

		@Then("user_626 verify Province Id should be text box")
		public void user_626_verify_province_id_should_be_text_box() {
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
		@Then("user_626 verify Neighbourhood District Name should be mandatory")
		public void user_626_verify_neighbourhood_district_name_should_be_mandatory() {
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

		@Then("user_626 verify Neighbourhood District Name should be display only")
		public void user_626_verify_neighbourhood_district_name_should_be_display_only() {
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

		@Then("user_626 verify Neighbourhood District Name should be text box")
		public void user_626_verify_neighbourhood_district_name_should_be_text_box() {
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
		@Then("user_626 verify City should be mandatory")
		public void user_626_verify_city_should_be_mandatory() {
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

		@Then("user_626 verify City should be display only")
		public void user_626_verify_city_should_be_display_only() {
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

		@Then("user_626 verify City should be text box")
		public void user_626_verify_city_should_be_text_box() {
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
		@Then("user_626 verify Zip code should be mandatory")
		public void user_626_verify_zip_code_should_be_mandatory() {
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

		@Then("user_626 verify Zip code should be display only")
		public void user_626_verify_zip_code_should_be_display_only() {
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

		@Then("user_626 verify Zip code should be text box")
		public void user_626_verify_zip_code_should_be_text_box() {
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
		@Then("user_626 verify PO Box Number should be display only")
		public void user_626_verify_po_box_number_should_be_display_only() {
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

		@Then("user_626 verify PO Box Number should be text box")
		public void user_626_verify_po_box_number_should_be_text_box() {
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
		@Then("user_626 verify Mobile number should be display only")
		public void user_626_verify_mobile_number_should_be_display_only() {
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

		@Then("user_626 verify Mobile number should be text box")
		public void user_626_verify_mobile_number_should_be_text_box() {
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
		@Then("user_626 verify  Duration Of Stay should be display only")
		public void user_626_verify_duration_of_stay_should_be_display_only() {
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

		@Then("user_626 verify  Duration Of Stay should be text box")
		public void user_626_verify_duration_of_stay_should_be_text_box() {
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
		@Then("user_626 verify Latitude Details Of The Address should be display only")
		public void user_626_erify_latitude_details_of_the_address_should_be_display_only() {
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

		@Then("user_626 verify Latitude Details Of The Address should be text box")
		public void user_626_erify_latitude_details_of_the_address_should_be_text_box() {
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

		@Then("user_626 verify Longitude Details Of The Address should be display only")
		public void user_626_verify_longitude_details_of_the_address_should_be_display_only() {
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

		@Then("user_626 verify Longitude Details Of The Address should be text box")
		public void user_626_verify_longitude_details_of_the_address_should_be_text_box() {
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

		@Then("user_626 verify Land Mark should be display only")
		public void user_626_verify_land_mark_should_be_display_only() {
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

		@Then("user_626 verify Land Mark should be text box")
		public void user_626_verify_land_mark_should_be_text_box() {
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
		@Then("user_626 verify Occupancy Date should be mandatory")
		public void user_626_verify_occupancy_date_should_be_mandatory() {
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

		@Then("user_626 verify Occupancy Date should be display only")
		public void user_626_verify_occupancy_date_should_be_display_only() {
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

		@Then("user_626 verify Occupancy Date should be Date")
		public void user_626_verify_occupancy_date_should_be_date() {
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
		@Then("user_626 verify Landlord Name should be display only")
		public void user_626_verify_landlord_name_should_be_display_only() {
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

		@Then("user_626 verify Landlord Name should be text box")
		public void user_626_verify_landlord_name_should_be_text_box() {
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
		@Then("user_626 verify Landlord Mobile Number should be display only")
		public void user_626_verify_landlord_mobile_number_should_be_display_only() {
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

		@Then("user_626 verify Landlord Mobile Number should be text box")
		public void user_626_verify_landlord_mobile_number_should_be_text_box() {
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
		@Given("user_626 Select record after search")
		public void user_626_select_record_after_search() {
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
		@Then("user_626 verify Rent Amount should be display only")
		public void user_626_verify_rent_amount_should_be_display_only() {
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

		@Then("user_626 verify Rent Amount should be text box")
		public void user_626_verify_rent_amount_should_be_text_box() {
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

		@Then("user_626 verify Frequency Of Rent should be display only")
		public void user_626_verify_frequency_of_rent_should_be_display_only() {
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

		@Then("user_626 verify Frequency Of Rent should be text box")
		public void user_626_verify_frequency_of_rent_should_be_text_box() {
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
		

		@Then("user_626 verify field Status should be display only")
		public void user_626_verify_field_status_should_be_display_only() {
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

		@Then("user_626 verify field Status should be toggle status")
		public void user_626_verify_field_status_should_be_toggle_status() {
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
		@Then("User_626 clicking on back button system should navigate to the previous screen")
		public void user_626_clicking_on_back_button_system_should_navigate_to_the_previous_screen() {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Back_button")).click();
			String Back_button_verify= javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("BackButtonVerify")).getAttribute("Style");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Back_button_verify.contains("flex"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
			}
		@And("^User_626 get the test data for test case AT_DC_CD_001")
	    public void user_626_get_the_test_data_for_test_case_AT_DC_CD_001() throws Throwable {
			testData =  customerDebtExcelData.getTestdata("AT_DC_CD_001");
	    }	
		 
		@And("User_626 click the module name dropdown in ULS application")
		public void user_626_click_the_module_name_dropdown_in_uls_application() throws Throwable {
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
		
		@And("User_626 select the module name as LOS in ULS application")
		public void user_626_select_the_module_name_as_los_in_uls_application() throws Throwable {
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
		@And("user_626 click the Mail box in ULS application")
		public void user_626_click_the_mail_box_in_uls_application() throws Throwable {
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
		
		@And("user_626 click the Search button under inbox")
		public void user_626_click_the_search_button_under_inbox() throws Throwable {
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
		@And("user_626 search the Ref id under inbox")
		public void user_626_user_search_the_ref_id_under_inbox() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
					.sendKeys(testData.get("Ref No"));;
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		    
		}
		@And("user_626 click the Entitle button under inbox")
		public void user_626_click_the_entitle_button_under_inbox() throws Throwable {
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
	
		@And("user_626 click the Customer Financials tab")
		public void user_626_click_the_customer_financials_tab() throws Throwable {
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
		@Given("user_626 click On the Action button below Customer Financials")
		public void user_626_click_on_the_action_button_below_customer_financials() {
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
		
		@Given("user_626 click On the Action button below Financial Commitments")
		public void user_626_click_on_the_action_button_below_financial_commitments() {
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
		@Given("user_626 verify the account number field below the Customer debt details")
		public void user_626_verify_the_account_number_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the  Closed Date field below the Customer debt details")
		public void user_626_verify_the_closed_date_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Status field below the Customer debt details")
		public void user_626_verify_the_status_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Frequency field below the Customer debt details")
		public void user_626_verify_the_frequency_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Installment Amount field below the Customer debt details")
		public void user_626_verify_the_installment_amount_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Last Payment Date field below the Customer debt details")
		public void user_626_verify_the_last_payment_date_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Next Due Date field below the Customer debt details")
		public void user_626_verify_the_next_due_date_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Last Cycle field below the Customer debt details")
		public void user_626_verify_the_last_cycle_field_below_the_customber_debt_details() {
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

		@Given("user_626 verify the Include in Eligibility field below the Customer debt details")
		public void user_626_verify_the_include_in_eligibility_field_below_the_customber_debt_details() {
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
		@And("user_626 click the Back button in Customer Debt screen navigate to the previous screen")
		public void user_626_click_the_back_button_in_customer_debt_screen_navigate_to_the_previous_screen() throws Throwable {
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

		@Then("user_626 verify Closed Date field below the Customer debt should be display only")
		public void user_626_verify_closed_date_field_below_the_customber_debt_should_be_display_only() {
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

		@Then("user_626 verify Status field below the Customer debt should be display only")
		public void user_626_verify_status_field_below_the_customber_debt_should_be_display_only() {
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
		
		@Then("user_626 verify Frequency field below the Customer debt should be display only")
		public void user_626_verify_frequency_field_below_the_customber_debt_should_be_display_only() {
			String Frequency= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("frequencyDisplay")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Frequency.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("user_626 verify Last Payment Date field below the Customer debt should be display only")
		public void user_626_verify_last_payment_date_field_below_the_customber_debt_should_be_display_only() {
			String lastPaymentDateDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("lastPaymentDateDisplay")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(lastPaymentDateDisplay.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

		@Then("user_626 verify Next Due Date field below the Customer debt should be display only")
		public void user_626_verify_next_due_date_field_below_the_customber_debt_should_be_display_only() {
			String nextDueDateDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("nextDueDateDisplay")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(nextDueDateDisplay.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}
		@Then("user_626 verify Last Cycle field below the Customer debt should be display only")
		public void user_626_verify_last_cycle_field_below_the_customber_debt_should_be_display_only() {
			String last24CycleDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("last24CycleDisplay")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(last24CycleDisplay.contains("true"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}

		@Then("user_626 verify Include in Eligibility below the Customer debt should be display only")
		public void user_626_verify_include_in_eligibility_below_the_customber_debt_should_be_display_only() {
			String includeEligiblityDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("includeEligiblityDisplay")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(includeEligiblityDisplay.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		    
		}

		@Then("user_626 verify Installment Amount field below the Customer debt should be Same As AppDataCheck Stage")
		public void user_626_verify_installment_amount_field_below_the_customer_debt_should_be_same_as_app_data_check_stage() {
			String installmentAmtValidation= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("installmentAmtValidation")).getAttribute("ng-reflect-model");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(installmentAmtValidation.contains("4000"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
			    
		}
		@Given("user_626 get the test data for test case ID AT_ASD_ADC_001")
		public void user_626_get_the_test_data_for_test_case_id_at_asd_adc() {
			AssetDetailsTestData = excelDataForAssetDetailsTestData.getTestdata("DS01_AT_ASD_ADC_001");
		}
		
		@Given("user_626_click on Asset Details tab")
		public void user_626_click_on_asset_details_tab() {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper
							.executeScriptWithWebElement(AssetDetailElements.getElement("AssetDetailsTab"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Given("user_626_click on the Action View button Below the Asset Details")
		public void user_626_click_on_the_action_view_button_below_the_asset_details() {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper
							.executeScriptWithWebElement(AssetDetailElements.getElement("ActionButton"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		@Then("user_626 verify Asset Details Section should visible in Asset details screen")
		public void user_626_verify_asset_details_section_should_visible_in_asset_details_screen() throws InterruptedException {
			Thread.sleep(5000);
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetDetailsVerification")).isDisplayed()) {
				SoftAssert.fail("Check Asset Details Field");
		}
		}

		@Then("user_626 verify Dealer Deatils Section should visible in Asset details screen")
		public void user_626_verify_dealer_deatils_section_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerDetailsVerification")).isDisplayed()) {
				SoftAssert.fail("Check Dealer Details Field");
		}
		}

		@Then("user_626 verify  Registration Details Section should visible in Asset details screen")
		public void user_626_verify_registration_details_section_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("RegistrationDetailsVerification")).isDisplayed()) {
				SoftAssert.fail("Check Registration Details Field");
		}
		}

		@Then("user_626 verify Asset Price and Down Payment Details should visible in Asset details screen")
		public void user_626_verify_asset_price_and_down_payment_details_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetPriceVerification")).isDisplayed()) {
				SoftAssert.fail("Check Asset Price Details Field");
			}
		}
		@Then("user_626 verify Asset Manufacture Field should visible in Asset details screen")
		public void user_626_verify_asset_manufacture_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetManufacture")).isDisplayed()) {
				SoftAssert.fail("Check Asset Manufacture Details Field");
			}
		}

		@Then("user_626 verify Asset Model Field should visible in Asset details screen")
		public void user_626_verify_asset_model_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetModel")).isDisplayed()) {
				SoftAssert.fail("Check Asset Model Details Field");
			}
		}

		@Then("user_626 verify Asset Model Type Field should visible in Asset details screen")
		public void user_626_verify_asset_model_type_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetModelType")).isDisplayed()) {
				SoftAssert.fail("Check Asset Model Type Details Field");
			}
		}

		@Then("user_626 verify Year of Manufacture Field should visible in Asset details screen")
		public void user_626_verify_year_of_manufacture_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("YearOfManufacture")).isDisplayed()) {
				SoftAssert.fail("Check Year Details Field");
			}
		}

		@Then("user_626 verify Asset Condition Field should visible in Asset details screen")
		public void user_626_verify_asset_condition_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetCondition")).isDisplayed()) {
				SoftAssert.fail("Check Asset Condition Details Field");
			}
		}
		@Then("user_626 verify Asset Color Field should visible in Asset details screen")
		public void user_626_verify_asset_color_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Assetcolor")).isDisplayed()) {
				SoftAssert.fail("Check Asset Color Details Field");
			}  
		}

		@Then("user_626 verify Driver Train Field should visible in Asset details screen")
		public void user_626_verify_driver_train_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DriveTrain")).isDisplayed()) {
				SoftAssert.fail("Check Driver Train Details Field");
			} 	    
		}

		@Then("user_626 verify No Of Cylinder Field should visible in Asset details screen")
		public void user_626_verify_no_of_cylinder_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("NoOfCylinder")).isDisplayed()) {
				SoftAssert.fail("Check No of Cylinder Details Field");
			}		    
		}

		@Then("user_626 verify Volume Of Engine Field should visible in Asset details screen")
		public void user_626_verify_volume_of_engine_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("VolOfEngine")).isDisplayed()) {
				SoftAssert.fail("Check Volume Of Engine Details Field");
			}		    
		}

		@Then("user_626 verify No of Units Field should visible in Asset details screen")
		public void user_626_verify_no_of_units_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("NoOfUnits")).isDisplayed()) {
				SoftAssert.fail("Check No Of Units Details Field");
			}		    
		}

		@Then("user_626 verify Chasis Number Field should visible in Asset details screen")
		public void user_626_verify_chasis_number_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ChasisNumber")).isDisplayed()) {
				SoftAssert.fail("Check Chasis Number Details Field");
			}		    
		}
		@Then("user_626 verify Plate NumberField should visible in Asset details screen")
		public void user_626_verify_plate_number_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("PlateNumber")).isDisplayed()) {
				SoftAssert.fail("Check Plate Number Details Field");
			}		    
		}

		@Then("user_626 verify Plate Number Arabic Field should visible in Asset details screen")
		public void user_626_verify_plate_number_arabic_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("PlateNumberArabic")).isDisplayed()) {
				SoftAssert.fail("Check Plate Number Arabic Details Field");
			}		    
		}

		@Then("user_626 verify Asset Dealer Field should visible in Asset details screen")
		public void user_626_verify_asset_dealer_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetDealer")).isDisplayed()) {
				SoftAssert.fail("Check Asset Dealer Details Field");
			}		    
		}

		@Then("user_626 verify Deposit Account No Field should visible in Asset details screen")
		public void user_626_verify_deposit_account_no_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DepositAccNo")).isDisplayed()) {
				SoftAssert.fail("Check DepositAccNo Details Field");
			}		    
		}

		@Then("user_626 verify Dealer Email Id Field should visible in Asset details screen")
		public void user_626_verify_dealer_email_id_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerEmailId")).isDisplayed()) {
				SoftAssert.fail("Check DealerEmailId Details Field");
			}				    
		}
		@Then("user_626 verify Dealer Contact Number Field should visible in Asset details screen")
		public void user_626_verify_dealer_contact_number_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerContactNo")).isDisplayed()) {
				SoftAssert.fail("Check DealerContactNo Details Field");
			}		    
		}

		@Then("user_626 verify Dealer Location Field should visible in Asset details screen")
		public void user_626_verify_dealer_location_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerLocation")).isDisplayed()) {
				SoftAssert.fail("Check DealerLocation Details Field");
			}		    
		}

		@Then("user_626_verify Sales Person Name Field should visible in Asset details screen")
		public void user_626_verify_sales_person_name_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("SalesPersonName")).isDisplayed()) {
				SoftAssert.fail("Check SalesPersonName Details Field");
			}			    
		}

		@Then("user_626 verify Agent Name Field should visible in Asset details screen")
		public void user_626_verify_agent_name_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AgentName")).isDisplayed()) {
				SoftAssert.fail("Check AgentName Details Field");
			}			    
		}

		@Then("user_626 verify Agent Email IdField should visible in Asset details screen")
		public void user_626_verify_agent_email_id_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AgentEmailId")).isDisplayed()) {
				SoftAssert.fail("Check AgentEmailId Details Field");
			}			    
		}

		@Then("user_626 verify Agent Mobile Number Field should visible in Asset details screen")
		public void user_626_verify_agent_mobile_number_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AgentMobileNumber")).isDisplayed()) {
				SoftAssert.fail("Check AgentMobileNumber Details Field");
			}			    
		}
		@Then("user_626 verify Asset Price Field should visible in Asset details screen")
		public void user_626_verify_asset_price_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetPrice")).isDisplayed()) {
				SoftAssert.fail("Check AssetPrice Details Field");
			}			    
		}

		@Then("user_626_verify Down Payment Field should visible in Asset details screen")
		public void user_626_verify_down_payment_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DownPayment")).isDisplayed()) {
				SoftAssert.fail("Check DownPayment Details Field");
			}			    
		}

		@Then("user_626 verify Down Payment Percentage Field should visible in Asset details screen")
		public void user_626_verify_down_payment_percentage_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DownPaymentPerCentage")).isDisplayed()) {
				SoftAssert.fail("Check DownPaymentPerCentage Details Field");
			}			    
		}

		@Then("user_626 verify Green Issue Date Field should visible in Asset details screen")
		public void user_626_verify_green_issue_date_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("GreenIssueDate")).isDisplayed()) {
				SoftAssert.fail("Check GreenIssueDate Details Field");
			}			    
		}

		@Then("user_626 verify Residual Value Field should visible in Asset details screen")
		public void user_626_verify_residual_value_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ResidualValue")).isDisplayed()) {
				SoftAssert.fail("Check ResidualValue Details Field");
			}			    
		}

		@Then("user_626 verify Green Card No Field should visible in Asset details screen")
		public void user_626_verify_green_card_no_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("GreenCardNo")).isDisplayed()) {
				SoftAssert.fail("Check GreenCardNo Details Field");
			}			    
		}

		@Then("user_626 verify Weight in Tons Field should visible in Asset details screen")
		public void user_626_verify_weight_in_tons_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("WeightInTons")).isDisplayed()) {
				SoftAssert.fail("Check WeightInTons Details Field");
			}			    
		}
		@Then("user_626 verify Asset FulFill Field should visible in Asset details screen")
		public void user_626_verify_asset_ful_fill_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetFulfil")).isDisplayed()) {
				SoftAssert.fail("Check AssetFulfil Details Field");
			}			    
		}

		@Then("user_626 verify Location of Sign in Field should visible in Asset details screen")
		public void user_626_erify_location_of_sign_in_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("LocationOfSignin")).isDisplayed()) {
				SoftAssert.fail("Check LocationOfSignin Details Field");
			}			    
		}

		@Then("user_626 verify Received Location Field should visible in Asset details screen")
		public void user_626_verify_received_location_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ReceivedLocation")).isDisplayed()) {
				SoftAssert.fail("Check ReceivedLocation Details Field");
			}			    
		}

		@Then("user_626 verify Remarks Field should visible in Asset details screen")
		public void user_626_verify_remarks_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ReMarks")).isDisplayed()) {
				SoftAssert.fail("Check ReMarks Details Field");
			}			    
		}

		@Then("user_626 verify Status Field should visible in Asset details screen")
		public void user_626_verify_status_field_should_visible_in_asset_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Status")).isDisplayed()) {
				SoftAssert.fail("Check Status Details Field");
			}			    
		}
		@Given("user_626 verify Asset Manufacture Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_manufacture_data_should_visible_as_data_entry_stage_screen() {
			String AssetmanufactureDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetmanufactureDC")).getAttribute("aria-label");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AssetmanufactureDC.contains("JAGUAR"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }		    
		}

		@Given("user_626 verify Asset model Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_model_data_should_visible_as_data_entry_stage_screen() {
			String AssetModelDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetModelDC")).getAttribute("aria-label");

			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(AssetModelDC.contains("Test"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }		    
		    
		}

		@Given("user_626 verify Asset type Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_type_data_should_visible_as_data_entry_stage_screen() {
			String AssetModelTypeDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetModelTypeDC")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(AssetModelTypeDC.contains("1.6"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }		    
		}

		@Given("user_626 verify Asset Condition Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_condition_data_should_visible_as_data_entry_stage_screen() {
			String AssetConditionDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetConditionDC")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetConditionDC.contains("New"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		       		    
		}

		@Given("user_626 verify Asset Color Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_color_data_should_visible_as_data_entry_stage_screen() {
			String AssetcolorDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetcolorDC")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetcolorDC.contains("Blue"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		       		    
		}
		@Given("user_626 verify Chasis number Data should visible As Data Entry stage screen")
		public void user_626_verify_chasis_number_data_should_visible_as_data_entry_stage_screen() {
			String ChasisNumberDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ChasisNumberDC")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ChasisNumberDC.contains("454545"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		       	  
		}

		@Given("user_626 verify Plate Number Data should visible As Data Entry stage screen")
		public void user_626_verify_plate_number_data_should_visible_as_data_entry_stage_screen() {
			String plateNumberDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("plateNumberDC")).getAttribute("ng-reflect-model");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(plateNumberDC.contains("45"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	  		    
		}

		@Given("user_626 verify Asset dealer Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_dealer_data_should_visible_as_data_entry_stage_screen() {
			String AssetDealerDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetDealerDC")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(AssetDealerDC.contains("TATA"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       		    		    
		}

		@Given("user_626 verify Asset Price Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_price_data_should_visible_as_data_entry_stage_screen() {
			javascriptHelper.scrollIntoView(javascriptHelper
					.executeScriptWithWebElement(AssetDetailElements.getElement("Status")));
			String AssetPriceDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetPriceDC")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetPriceDC.contains("5000000"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		       	  
		    }

		@Given("user_626 verify Asset Fulfil Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_fulfil_data_should_visible_as_data_entry_stage_screen() {
			String AssetFulfilDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetFulfilDC")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetFulfilDC.contains("Mumbai"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }	   	  	    
		}

		@Given("user_626 verify Location of signin Data should visible As Data Entry stage screen")
		public void user_626_verify_location_of_signin_data_should_visible_as_data_entry_stage_screen() {	    
			String LocationOfSigninDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("LocationOfSigninDC")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(LocationOfSigninDC.contains("Lucknow"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }	   	  	    
		}
		@Given("user_626 verify Asset Received Data should visible As Data Entry stage screen")
		public void user_626_verify_asset_received_data_should_visible_as_data_entry_stage_screen() {
			String ReceivedLocationDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ReceivedLocationDC")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ReceivedLocationDC.contains("JODHPUR"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }	   	  	    
		}

		@Given("user_626 verify remarks Data should visible As Data Entry stage screen")
		public void user_626_verify_remarks_data_should_visible_as_data_entry_stage_screen() {
			String ReMarksDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ReMarksDC")).getAttribute("ng-reflect-model");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ReMarksDC.contains("Test"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	  
		}
		@Then("User_626 verify Asset Manufacture Field should visible in Display Only")
		public void user_626_verify_asset_manufacture_field_should_visible_in_display_only() {
			String AssetManufactureDP = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetManufactureDP")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(AssetManufactureDP.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}
		@Then("User_626 verify Asset Model Field should visible in Display Only")
		public void user_626_verify_asset_model_field_should_visible_in_display_only() {
			String AssetModelDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetModelDC")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(AssetModelDC.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Asset Model Type Field should visible in Display Only")
		public void user_626_verify_asset_model_type_field_should_visible_in_display_only() {
			String AssetModelTypeDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetModelTypeDC")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(AssetModelTypeDC.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Year of Manufacture Field should visible in Display Only")
		public void user_626_verify_year_of_manufacture_field_should_visible_in_display_only() {
			String YearOfManufacture = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("YearOfManufacture")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(YearOfManufacture.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Asset Condition Field should visible in Display Only")
		public void user_626_verify_asset_condition_field_should_visible_in_display_only() {
			String AssetConditionDC = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetConditionDC")).getAttribute("aria-disabled");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetConditionDC.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}
		@Then("User_626 verify Asset Color Field should visible in Display Only")
		public void user_626_verify_asset_color_field_should_visible_in_display_only() {
			String Assetcolor = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Assetcolor")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Assetcolor.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Driver Train Field should visible in Display Only")
		public void user_verify_driver_train_field_should_visible_in_display_only() {
			String DriveTrain = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DriveTrain")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DriveTrain.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify No Of Cylinder Field should visible in Display Only")
		public void user_626_verify_no_of_cylinder_field_should_visible_in_display_only() {
			String NoOfCylinder = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("NoOfCylinder")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(NoOfCylinder.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Volume Of Engine Field should visible in Display Only")
		public void user_626_verify_volume_of_engine_field_should_visible_in_display_only() {
			String VolOfEngine = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("VolOfEngine")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(VolOfEngine.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify No of Units Field should visible in Display Only")
		public void user_626_verify_no_of_units_field_should_visible_in_display_only() {
			String NoOfUnits = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("NoOfUnits")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(NoOfUnits.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Chasis Number Field should visible in Display Only")
		public void user_626_verify_chasis_number_field_should_visible_in_display_only() {
			String ChasisNumber = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ChasisNumber")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ChasisNumber.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}
		@Then("User_626 verify Plate NumberField should visible in Display Only")
		public void user_626_verify_plate_number_field_should_visible_in_display_only() {
			String PlateNumber = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("PlateNumber")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(PlateNumber.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Then("User_626 verify Plate Number Arabic Field should visible in Display Only")
		public void user_626_verify_plate_number_arabic_field_should_visible_in_display_only() {
			String PlateNumberArabic = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("PlateNumberArabic")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(PlateNumberArabic.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Asset Dealer Field should visible in Display Only")
		public void user_626_verify_asset_dealer_field_should_visible_in_display_only() {
			String AssetDealer = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetDealer")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AssetDealer.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Then("User_626 verify Deposit Account No Field should visible in Display Only")
		public void user_626_verify_deposit_account_no_field_should_visible_in_display_only() {
			String DepositAccNo = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DepositAccNo")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DepositAccNo.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Dealer Email Id Field should visible in Display Only")
		public void user_626_verify_dealer_email_id_field_should_visible_in_display_only() {
			String DealerEmailId = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerEmailId")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DealerEmailId.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Then("User_626 verify Dealer Contact Number Field should visible in Display Only")
		public void user_626_verify_dealer_contact_number_field_should_visible_in_display_only() {
			String DealerContactNo = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerContactNo")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DealerContactNo.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}
		@Then("User_626 verify Dealer Location Field should visible in Display Only")
		public void user_626_verify_dealer_location_field_should_visible_in_display_only() {
			String DealerLocation = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DealerLocation")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DealerLocation.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}
		@Then("User_626 verify Sales Person Name Field should visible in Display Only")
		public void user_626_verify_sales_person_name_field_should_visible_in_display_only() {
			String SalesPersonName = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("SalesPersonName")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(SalesPersonName.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Then("User_626 verify Agent Name Field should visible in Display Only")
		public void user_626_verify_agent_name_field_should_visible_in_display_only() {
			String AgentName = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AgentName")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(AgentName.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Then("User_626 verify Agent Email IdField should visible in Display Only")
		public void user_626_verify_agent_email_id_field_should_visible_in_display_only() {
		String AgentEmailId = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AgentEmailId")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(AgentEmailId.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		      
		}
		@Then("User_626 verify Agent Mobile Number Field should visible in Display Only")
		public void user_verify_agent_mobile_number_field_should_visible_in_display_only() {
			String AgentMobileNumber = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AgentMobileNumber")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(AgentMobileNumber.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Then("User_626 verify Asset Price Field should visible in Display Only")
		public void user_626_verify_asset_price_field_should_visible_in_display_only() {
			String AssetPrice = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetPrice")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(AssetPrice.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		      
		}

		@Then("User_626 verify Down Payment Field should visible in Display Only")
		public void user_626_verify_down_payment_field_should_visible_in_display_only() {
			String DownPayment = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DownPayment")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DownPayment.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       
		}
		@Then("User_626 verify Down Payment Percentage Field should visible in Display Only")
		public void user_626_verify_down_payment_percentage_field_should_visible_in_display_only() {
			String DownPaymentPerCentage = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("DownPaymentPerCentage")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DownPaymentPerCentage.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       
		}

		@Then("User_626 verify Green Issue Date Field should visible in Display Only")
		public void user_626_verify_green_issue_date_field_should_visible_in_display_only() {
			String GreenIssueDate = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("GreenIssueDate")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(GreenIssueDate.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		      
		}

		@Then("User_626 verify Residual Value Field should visible in Display Only")
		public void user_626_verify_residual_value_field_should_visible_in_display_only() {
			String ResidualValue = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ResidualValue")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(ResidualValue.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		      
		}

		@Then("User_626 verify Green Card No Field should visible in Display Only")
		public void user_626_verify_green_card_no_field_should_visible_in_display_only() {
			String GreenCardNo = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("GreenCardNo")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(GreenCardNo.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		      
		}

		@Then("User_626 verify Weight in Tons Field should visible in Display Only")
		public void user_626_verify_weight_in_tons_field_should_visible_in_display_only() {
			String WeightInTons = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("WeightInTons")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(WeightInTons.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		      
		}

		@Then("User_626 verify Asset FulFill Field should visible in Display Only")
		public void user_626_verify_asset_ful_fill_field_should_visible_in_display_only() {
			String AssetFulfil = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("AssetFulfil")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(AssetFulfil.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		  
		}

		@Then("User_626 verify Location of Sign in Field should visible in Display Only")
		public void user_626_verify_location_of_sign_in_field_should_visible_in_display_only() {
			String LocationOfSignin = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("LocationOfSignin")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(LocationOfSignin.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		  
		}

		@Then("User_626 verify Received Location Field should visible in Display Only")
		public void user_626_verify_received_location_field_should_visible_in_display_only() {
			String ReceivedLocation = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ReceivedLocation")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(ReceivedLocation.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		  
		}

		@Then("User_626 verify Remarks Field should visible in Display Only")
		public void user_626_verify_remarks_field_should_visible_in_display_only() {
			String ReMarks = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("ReMarks")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
		        try {
		            Assert.assertTrue(ReMarks.contains("true"));
		            break;
		        } catch (Exception e) {
		            if (i==1999) {
		                Assert.fail(e.getMessage());
		            }
		        }
		    }		  
		}

		@Then("User_626 verify Status Field should visible in Display Only")
		public void user_626_verify_status_field_should_visible_in_display_only() {
			String Status = javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Status")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Status.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		  
		}	
		@Then("User_626 clicking on back button system should navigate to the previous screen From Asset Details")
		public void user_626_clicking_on_back_button_system_should_navigate_to_the_previous_screen_from_asset_details() throws InterruptedException {
//			javascriptHelper.scrollIntoView(javascriptHelper
//					.executeScriptWithWebElement(AssetDetailElements.getElement("Back_ButtonAD")));
			javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Back_ButtonAD")));
			String Back_button_verify= javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("BackButtonVerify")).getAttribute("ng-reflect-size");
			for (int i = 0; i <2000; i++) {
	            try {
	                Assert.assertTrue(Back_button_verify.contains("12"));
	                break;
	            } catch (Exception e) {
	                if (i==1999) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
		}
		@Given("user_626 get the test data for test case ID AT_DOC_01")
		public void user_626_get_the_test_data_for_test_case_id_at_doc() {
			AssetDetailsTestData = excelDataForAssetDetailsTestData.getTestdata("DS01_AT_DOC_001");
		}


		@Given("User_626 click on Next and Document Details tab")
		public void user_626_user_click_on_document_details_tab() {
			for (int i = 0; i <= 4; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("nextBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 4) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentDetails_Button")));
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		

		@Given("User_626 click on the Action View button Below the Document Details")
		public void user_click_on_the_action_view_button_below_the_asset_details() {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper
							.executeScriptWithWebElement(AssetDetailElements.getElement("ActionButton"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Given("User_626 verify Customer Name field should visible in Document details screen")
		public void user_626_verify_customer_name_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("CustomerName")).isDisplayed()) {
				SoftAssert.fail("Check CustomerName Field");
			}		
		}

		@Given("User_626 verify Document Namefield should visible in Document details screen")
		public void user_626_verify_document_namefield_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentName")).isDisplayed()) {
				SoftAssert.fail("Check DocumentName Field");
			}	
		}

		@Given("User_626 verify Required At Stage field should visible in Document details screen")
		public void user_626_verify_required_at_stage_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("RequiredAtStage")).isDisplayed()) {
				SoftAssert.fail("Check RequiredAtStage Field");
			}	
		}

		@Given("User_626 verify Document Status field should visible in Document details screen")
		public void user_626_verify_document_status_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentStatus")).isDisplayed()) {
				SoftAssert.fail("Check DocumentStatus Field");
			}	
		}

		@Given("User_626 verify ManDatory field should visible in Document details screen")
		public void user_626_verify_man_datory_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("MandatoryOptional")).isDisplayed()) {
				SoftAssert.fail("Check MandatoryOptional Field");
			}	
		}
		@Given("User_626 verify Document Category field should visible in Document details screen")
		public void user_626_verify_document_category_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentCategory")).isDisplayed()) {
				SoftAssert.fail("Check DocumentCategory Field");
			}			    
		}

		@Given("User_626 verify Upload Date field should visible in Document details screen")
		public void user_626_verify_upload_date_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("UploadDate")).isDisplayed()) {
				SoftAssert.fail("Check UploadDate Field");
			}			    
		}

		@Given("User_626 verify Expected Receipt Date field should visible in Document details screen")
		public void user_626_verify_expected_receipt_date_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ExpectedReceiptDate")).isDisplayed()) {
				SoftAssert.fail("Check ExpectedReceiptDate Field");
			}			    
		}

		@Given("User_626 verify Deferral Stage field should visible in Document details screen")
		public void user_verify_deferral_stage_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DeferralStage")).isDisplayed()) {
				SoftAssert.fail("Check DeferralStage Field");
			}			    
		}

		@Given("User_626 verify Def Approval byfield should visible in Document details screen")
		public void user_626_verify_def_approval_byfield_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DefApprovedBy")).isDisplayed()) {
				SoftAssert.fail("Check DefApprovedBy Field");
			}			    
		}

		@Given("User_626 verify Change In Nature field should visible in Document details screen")
		public void user_626_verify_change_in_nature_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ChangeInNatureApprovedBy")).isDisplayed()) {
				SoftAssert.fail("Check ChangeInNatureApprovedBy Field");
			}			    
		}

		@Given("User_626 verify Document Form field should visible in Document details screen")
		public void user_626_verify_document_form_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentForm")).isDisplayed()) {
				SoftAssert.fail("Check DocumentForm Field");
			}			    
		}

		@Given("User_626 verify Document Quality field should visible in Document details screen")
		public void user_626_verify_document_quality_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentQuality")).isDisplayed()) {
				SoftAssert.fail("Check DocumentQuality Field");
			}			    
		}

		@Given("User_626 verify Document ref No field should visible in Document details screen")
		public void user_626_verify_document_ref_no_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentReferenceNumber")).isDisplayed()) {
				SoftAssert.fail("Check DocumentReferenceNumber Field");
			}			    
		}
		@Given("User_626 verify Document Received By field should visible in Document details screen")
		public void user_626_verify_document_received_by_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentReceivedBy")).isDisplayed()) {
				SoftAssert.fail("Check DocumentReceivedBy Field");
			}
		}

		@Given("User_626 verify Location field should visible in Document details screen")
		public void user_626_verify_location_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("LocationWhereReceived")).isDisplayed()) {
				SoftAssert.fail("Check LocationWhereReceived Field");
			}
		}

		@Given("User_626 verify Rack No field should visible in Document details screen")
		public void user_626_verify_rack_no_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("RackNo")).isDisplayed()) {
				SoftAssert.fail("Check RackNo Field");
			}
		}

		@Given("User_626 verify Shelf No field should visible in Document details screen")
		public void user_626_verify_shelf_no_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ShelfNo")).isDisplayed()) {
				SoftAssert.fail("Check ShelfNo Field");
			}
		}

		@Given("User_626 verify Box No field should visible in Document details screen")
		public void user_626_verify_box_no_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("BoxNo")).isDisplayed()) {
				SoftAssert.fail("Check BoxNo Field");
			}
		}

		@Given("User_626 verify Date Of Expiry field should visible in Document details screen")
		public void user_626_verify_date_of_expiry_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DateOfExpiry")).isDisplayed()) {
				SoftAssert.fail("Check DateOfExpiry Field");
			}
		}

		@Given("User_626 verify Lodgement Amount field should visible in Document details screen")
		public void user_626_verify_lodgement_amount_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("LodgementAmount")).isDisplayed()) {
				SoftAssert.fail("Check LodgementAmount Field");
			}
		}

		@Given("User_626 verify Remarks field should visible in Document details screen")
		public void user_626_verify_remarks_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("Remarks")).isDisplayed()) {
				SoftAssert.fail("Check Remarks Field");
			} 
		}
		@Given("User_626 verify View field should visible in Document details screen")
		public void user_626_verify_view_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ViewDocumentButton")).isDisplayed()) {
				SoftAssert.fail("Check ViewDocumentButton Field");
		}
		}
		@Given("User_626 verify Generate Doc field should visible in Document details screen")
		public void user_626_verify_generate_doc_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("FileUploadButton")).isDisplayed()) {
				SoftAssert.fail("Check FileUploadButton Field");
		}
		}
		@Given("User_626 verify Status field should visible in Document details screen")
		public void user_626_verify_status_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Status")).isDisplayed()) {
				SoftAssert.fail("Check Status Field");
		}
		}
		@Given("User_626 verify Help field should visible in Document details screen")
		public void user_626_verify_help_field_should_visible_in_document_details_screen() {
			if (!javascriptHelper.executeScriptWithWebElement(AssetDetailElements.getElement("Remarks")).isDisplayed()) {
				SoftAssert.fail("Check Remarks Field");
			}
		}
		@Given("User_626 verify Customer Name Data should visible As Entry stage screen")
		public void user_626_verify_customer_name_data_should_visible_as_entry_stage_screen() {
			String CustomerName = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("CustomerName")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(CustomerName.contains("David "));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	  
		}

		@Given("User_626 verify Document Name Data should visible As Entry stage screen")
		public void user_626_verify_document_name_data_should_visible_as_entry_stage_screen() {
			String DocumentName = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentName")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentName.contains("AADHAAR "));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	  
		}

		@Given("User_626 verify Document status Data should visible As Entry stage screen")
		public void user_626_verify_document_status_data_should_visible_as_entry_stage_screen() {
			String DocumentStatus = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentStatus")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentStatus.contains("Received "));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	  
		}

		@Given("User_626 verify Mandatory optional Data should visible As Entry stage screen")
		public void user_626_verify_mandatory_optional_data_should_visible_as_entry_stage_screen() {
			String MandatoryOptional = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("MandatoryOptional")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(MandatoryOptional.contains("Optional "));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	 
		}
		@Given("User_626 verify Document Category Data should visible As Entry stage screen")
		public void user_626_verify_document_category_data_should_visible_as_entry_stage_screen() {
			String DocumentCategory = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentCategory")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentCategory.contains("Document "));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	
		}

		@Given("User_626 verify Deferred Stage Data should visible As Entry stage screen")
		public void user_626_verify_deferred_stage_data_should_visible_as_entry_stage_screen() {
			String DeferralStage = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DeferralStage")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DeferralStage.contains("New Application"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		       	
		}

		@Given("User_626 verify quality Data should visible As Entry stage screen")
		public void user_626_verify_quality_data_should_visible_as_entry_stage_screen() {
			String DocumentQuality = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentQuality")).getAttribute("aria-label");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentQuality.contains("Not Clear"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify remarks Data should visible As Entry stage screen")
		public void user_626_verify_remarks_data_should_visible_as_entry_stage_screen() {
			String Remarks_Verify = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("Remarks_Verify")).getAttribute("ng-reflect-model");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Remarks_Verify.contains("Test"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}
		@Given("User_626 verify Customer Name field should visible in DisPlay Only")
		public void user_626_verify_customer_name_field_should_visible_in_dis_play_only() {
			String CustomerName = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("CustomerName")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(CustomerName.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Document Namefield should visible in DisPlay Only")
		public void user_626_verify_document_namefield_should_visible_in_dis_play_only() {
			String DocumentName = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentName")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentName.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Required At Stage field should visible in DisPlay Only")
		public void user_626_verify_required_at_stage_field_should_visible_in_dis_play_only() {
			String RequiredAtStage = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("RequiredAtStage")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RequiredAtStage.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Document Status field should visible in DisPlay Only")
		public void user_626_verify_document_status_field_should_visible_in_dis_play_only() {
			String DocumentStatus = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentStatus")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentStatus.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify ManDatory field should visible in DisPlay Only")
		public void user_626_verify_man_datory_field_should_visible_in_dis_play_only() {
			String MandatoryOptional = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("MandatoryOptional")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(MandatoryOptional.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}
		@Given("User_626 verify Document Category field should visible in DisPlay Only")
		public void user_626_verify_document_category_field_should_visible_in_dis_play_only() {
			String DocumentCategory = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentCategory")).getAttribute("aria-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentCategory.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Upload Date field should visible in DisPlay Only")
		public void user_626_verify_upload_date_field_should_visible_in_dis_play_only() {
			String UploadDate_verify = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("UploadDate_verify")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(UploadDate_verify.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Expected Receipt Date field should visible in DisPlay Only")
		public void user_626_verify_expected_receipt_date_field_should_visible_in_dis_play_only() {
			String ExpectedReceiptDate_verify = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ExpectedReceiptDate_verify")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ExpectedReceiptDate_verify.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Given("User_626 verify Deferral Stage field should visible in DisPlay Only")
		public void user_626_verify_deferral_stage_field_should_visible_in_dis_play_only() {
			String DeferralStage = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DeferralStage")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DeferralStage.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Def Approval byfield should visible in DisPlay Only")
		public void user_626_verify_def_approval_byfield_should_visible_in_dis_play_only() {
			String DefApprovedBy = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DefApprovedBy")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DefApprovedBy.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}
		@Given("User_626 verify Change In Nature field should visible in DisPlay Only")
		public void user_626_verify_change_in_nature_field_should_visible_in_dis_play_only() {
			String ChangeInNatureApprovedBy = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ChangeInNatureApprovedBy")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ChangeInNatureApprovedBy.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}
		@Given("User_626 verify Document Form field should visible in DisPlay Only")
		public void user_626_verify_document_form_field_should_visible_in_dis_play_only() {
			String DocumentForm = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentForm")).getAttribute("ng-reflect-disabled");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(DocumentForm.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		      
		}

		@Given("User_626 verify Document Quality field should visible in DisPlay Only")
		public void user_626_verify_document_quality_field_should_visible_in_dis_play_only() {
			String DocumentQuality = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentQuality")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentQuality.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Document ref No field should visible in DisPlay Only")
		public void user_626_verify_document_ref_no_field_should_visible_in_dis_play_only() {
			String DocumentRefNoDisplay = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentRefNoDisplay")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentRefNoDisplay.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Document Received By field should visible in DisPlay Only")
		public void user_626_verify_document_received_by_field_should_visible_in_dis_play_only() {
			String DocumentReceivedBy = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DocumentReceivedBy")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DocumentReceivedBy.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Location field should visible in DisPlay Only")
		public void user_626_verify_location_field_should_visible_in_dis_play_only() {
			String LocationWhereReceived = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("LocationWhereReceived")).getAttribute("ng-reflect-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(LocationWhereReceived.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Rack No field should visible in DisPlay Only")
		public void user_626_verify_rack_no_field_should_visible_in_dis_play_only() {
			String RackNo_Display = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("RackNo_Display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(RackNo_Display.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}

		@Given("User_626 verify Shelf No field should visible in DisPlay Only")
		public void user_626_verify_shelf_no_field_should_visible_in_dis_play_only() {
			String shelfNo_Display = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("shelfNo_Display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(shelfNo_Display.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		      
		}
		@Given("User_626 verify Box No field should visible in DisPlay Only")
		public void user_626_verify_box_no_field_should_visible_in_dis_play_only() {
			String boxNo_Display = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("boxNo_Display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(boxNo_Display.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		  
		}

		@Given("User_626 verify Date Of Expiry field should visible in DisPlay Only")
		public void user_626_verify_date_of_expiry_field_should_visible_in_dis_play_only() {
			String DateOfExpiry_Display = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("DateOfExpiry_Display")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(DateOfExpiry_Display.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		  
		}
		@Given("User_626 verify Lodgement Amount field should visible in DisPlay Only")
		public void user_626_verify_lodgement_amount_field_should_visible_in_dis_play_only() {
			String lodgementAmount_display = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("lodgementAmount_display")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(lodgementAmount_display.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		  
		}
		@Given("User_626 verify Remarks field should visible in DisPlay Only")
		public void user_626_verify_remarks_field_should_visible_in_dis_play_only() {
			String Remarks_Display = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("Remarks_Display")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Remarks_Display.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }		  
		}
		@Given("User_626 verify View field should visible in DisPlay Only")
		public void user_626_verify_view_field_should_visible_in_dis_play_only() {
			String ViewDocumentButton = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("ViewDocumentButton")).getAttribute("ng-reflect-is-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(ViewDocumentButton.contains("false"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		  
		}

		@Given("User_626 verify Generate Doc field should visible in DisPlay Only")
		public void user_626_verify_generate_doc_field_should_visible_in_dis_play_only() {
			String FileUploadButton = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("FileUploadButton")).getAttribute("ng-reflect-is-disabled");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(FileUploadButton.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		  
		}

		@Given("User_626 verify Status field should visible in DisPlay Only")
		public void user_626_verify_status_field_should_visible_in_dis_play_only() {
			String Status = javascriptHelper.executeScriptWithWebElement(DocumentDetailsElements.getElement("Status")).getAttribute("ng-reflect-readonly");
			for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(Status.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }		  
		}
		@Given("User_626 click on search Box and enter Data For Matching Data Check")
		public void user_626_click_on_search_box_and_enter_data_for_matching_data_check() {

		}
		@Given("User_626 click on search Box and enter Data For Not Matching Data Check")
		public void user_626_click_on_search_box_and_enter_data_for_not_matching_data_check() {
		  
		}


		@Given("user_626 get the test data for test case ID AT_UNW_003")
		public void user_626_get_the_test_data_for_test_case_id_at_unw() {
			AssetDetailsTestData = excelDataForAssetDetailsTestData.getTestdata("DS01_AT_UNW_003");
		}
		@Given("user_626 Click On the edit button Below Faclity Info")
		public void user_626_click_on_the_edit_button_below_faclity_info() {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Edit_icon")).click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Given("user_626 lick On the Recommendation in Offer Decision")
		public void user_626_click_on_the_recommendation_in_offer_decision() {
			javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("JSERecommendations")));
		}

		@Given("user_626 Click On the Add button in List of Condition")
		public void user_626_click_on_the_add_button_in_list_of_condition() throws InterruptedException {
//			Thread.sleep(5000);
//			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("AddButton")).click();
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("AddButton")).click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Given("user_626 select not recommended in Note Code Dropdown Below the Conditions")
		public void user_626_select_not_recommended_in_note_code_dropdown_below_the_conditions() throws IOException {
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("NoteCode")));
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("NoteCode")).click();
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
//				System.out.println("String " + dropdownString.trim());
//				System.out.println("Map " + testData.get("CustomerName").trim());
				if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NoteCode")).trim())) {
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

		@Then("user_626 Enter Number in Sequence Number Field Below the Conditions")
		public void user_626_enter_number_in_sequence_number_field_below_the_conditions() {
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("SequenceNumber")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("SequenceNumber"))
					.sendKeys(testData.get("SequenceNumber"),Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("user_626 select not recommended in Note Sub Code Dropdown Below the Conditions")
		public void user_626_select_not_recommended_in_note_sub_code_dropdown_below_the_conditions() {
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("NoteSubcode")).click();
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
//				System.out.println("String " + dropdownString.trim());
//				System.out.println("Map " + testData.get("CustomerName").trim());
				if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NoteSubCode")).trim())) {
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


		@Then("user_626 Enter Data in Condition Field Below the Conditions")
		public void user_626_enter_data_in_condition_field_below_the_conditions() {
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Condition")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Condition"))
					.sendKeys(testData.get("Condition"),Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("user_626 Select the Date Below the Conditions")
		public void user_626_select_the_date_below_the_conditions() {
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Date")).click();
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Date_today")).click();
		}

		@Then("user_626 select Fulfiiled in fulfilled Dropdown Below the Conditions")
		public void user_626_select_fulfiiled_in_fulfilled_dropdown_below_the_conditions() {
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("fulfilled")).click();
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
				System.out.println("Map " + testData.get("CustomerName").trim());
				if ((dropdownString.trim()).equalsIgnoreCase((testData.get("fullfill")).trim())) {
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

		@Then("user_626 Turn on the Approval Status Below the Conditions")
		public void user_626_turn_on_the_approval_status_below_the_conditions() {
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("ApprovalStatus")).click();
		}

		@Then("user_626 Fill The Remarks Field Below the Conditions")
		public void user_626_fill_the_remarks_field_below_the_conditions() {
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Remarks")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Remarks"))
					.sendKeys(testData.get("Remarks"),Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		@Then("user_626 Click on the Save button To Save The Conditions Record")
		public void user_626_click_on_the_save_button_to_save_the_conditions_record() {
			javascriptHelper.executeScriptWithWebElement(L1Approval.getElement("Save")).click();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		