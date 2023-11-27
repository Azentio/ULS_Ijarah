package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
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
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijarah_NewAppAddressDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	String jsExcelPath = configFileReader.getJSFilePath();
	ExcelData excelTestDataForAddressDetails = new ExcelData(excelTestDataPath, "NewApp_AddressDetailsTestData",
			"Dataset ID");
	BrowserHelper browserHelper = new BrowserHelper(driver);

	ExcelData murabahExecutionSheet = new ExcelData(excelTestDataPath, "Murabaha_ExecutionTracker", "TestCase ID");

	ExcelData ijarahExecutionSheet = new ExcelData(excelTestDataPath, "Ijarah_ExecutionTracker", "TestCase ID");
	JSPaths commonJSElements = new JSPaths(jsExcelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths newAppAddressDetailsJSElements = new JSPaths(jsExcelPath, "NewApp_AddressDetailsJS",
			"addressDetails_JSElements", "JSPaths");
	JSPaths customerIdentificationDetailsElements = new JSPaths(jsExcelPath, "NewApp_IdentificationDetailsJS",
			"New_App_CustomerIdentificationDetailsElements", "JSPath");
	// Murabaha

	ExcelData excelTestDataForMurabahaAddressDetails = new ExcelData(excelTestDataPath,
			"M_NewApp_AddressDetailsTestData", "Dataset ID");

	// Tawruqq
	ExcelData excelTestDataForTawruqqAddressDetails = new ExcelData(excelTestDataPath, "TW_NewApp_AddDetails_TestData",
			"Dataset ID");
	ExcelData tawruqqExecutionSheet = new ExcelData(excelTestDataPath, "Tawruqq_ExecutionTracker", "TestCase ID");

	Map<String, String> addressDetailsTestData = new HashMap<>();
	Map<String, String> addressDetailsExecutionData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	String recordStatus = "";
	String listViewRecordStatus = "";
	int indexOfListView = 0;

	@And("get the test data for test case id AT_IJ_NewApp_AD_01")
	public void get_the_test_data_for_test_case_id_at_ij_new_app_ad_01() throws Throwable {
		addressDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_01");
		addressDetailsTestData = excelTestDataForAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_02")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_02() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_NewApp_M_AD_02");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_03")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_03() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_NewApp_M_AD_03");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_04")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_04() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_NewApp_M_AD_04");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_05")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_05() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_NewApp_M_AD_05");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_06")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_06() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_06");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_07")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_07() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_07");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_NewApp_M_AD_01")
	public void get_the_test_data_for_test_case_id_AT_NewApp_M_AD_01() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_NewApp_M_AD_01");
		addressDetailsTestData = excelTestDataForMurabahaAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	// AT_TW_NewApp_AD_01
	@And("get the test data for test case id AT_TW_NewApp_AddDetails_01")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_01() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_01");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_TW_NewApp_AddDetails_02")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_02() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_02");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_TW_NewApp_AddDetails_03")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_03() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_03");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_TW_NewApp_AddDetails_04")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_04() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_04");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_TW_NewApp_AddDetails_05")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_05() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_05");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_TW_NewApp_AddDetails_06")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_06() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_06");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_TW_NewApp_AddDetails_07")
	public void get_the_test_data_for_test_case_id_AT_TW_NewApp_AddDetails_07() throws Throwable {
		addressDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_AddDetails_07");
		addressDetailsTestData = excelTestDataForTawruqqAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_IJ_NewApp_AD_02")
	public void get_the_test_data_for_test_case_id_at_ij_new_app_ad_02() throws Throwable {
		addressDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_02");
		addressDetailsTestData = excelTestDataForAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_IJ_NewApp_AD_03")
	public void get_the_test_data_for_test_case_id_at_ij_new_app_ad_03() throws Throwable {
		addressDetailsExecutionData = murabahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_03");
		addressDetailsTestData = excelTestDataForAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_IJ_NewApp_AD_04")
	public void get_the_test_data_for_test_case_id_at_ij_new_app_ad_04() throws Throwable {
		addressDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_04");
		addressDetailsTestData = excelTestDataForAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_IJ_NewApp_AD_05")
	public void get_the_test_data_for_test_case_id_at_ij_new_app_ad_05() throws Throwable {
		addressDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_05");
		addressDetailsTestData = excelTestDataForAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("get the test data for test case id AT_IJ_NewApp_AD_06")
	public void get_the_test_data_for_test_case_id_at_ij_new_app_ad_06() throws Throwable {
		addressDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_NewApp_AD_06");
		addressDetailsTestData = excelTestDataForAddressDetails
				.getTestdata(addressDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 search the new application stage customer identification details record reference number for address details")
	public void user_search_the_new_application_stage_customer_identification_details_record_reference_number_for_address_details()
			throws Throwable {

		WebElement searchTextBox;
		for (int i = 0; i <= 80; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getIjarahRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 search the new application reference number in mail box for address details")
	public void user_076_search_the_new_application_reference_number_in_mail_box_for_address_details()
			throws Throwable {

		WebElement searchTextBox;
		for (int i = 0; i <= 80; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getIjarahRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 select the new application stage customer identification details record from mail box for address details")
	public void user_select_the_new_application_stage_customer_identification_details_record_from_mail_box_for_address_details()
			throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 80; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 80; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(configFileReader.getIjarahRecordReferenceNumber())) {
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

	@And("user_076 select the new application stage record from mail box for address details")
	public void user_076_select_the_new_application_stage_record_from_mail_box_for_address_details() throws Throwable {

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
					if (recordRefNumber.equals(configFileReader.getIjarahRecordReferenceNumber())) {
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

	@And("user_076 select the new application stage record from mail box")
	public void user_076_select_the_new_application_stage_record_from_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 80; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				if (!(numberOfRecordInMailBox.isBlank())) {
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
					if (recordRefNumber.equals(configFileReader.getIjarahRecordReferenceNumber())) {
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
						// document.querySelectorAll('button[icon="pi pi-user-edit"]')[0]

						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]")
								.click();
						break;
					}
				} catch (Exception e) {
					if (k == 80) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

	@And("user_076 click on add button in address details at new app stage")
	public void user_076_click_on_add_button_in_address_details_at_new_app_stage() throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		System.out.println("");
		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 80) {
					System.out.println("Query " + labelLength);
					lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
					if (!(lengthOfTheLabel.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
		System.out.println("Length of the label " + premitiveLabelLength);

		for (int i = 0; i < premitiveLabelLength; i++) {
			for (int j = 0; j <= 600; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Address Details").trim())) {

						System.out.println("Label Name " + labelName);
						if (i > 250) {
							clicksAndActionsHelper.returnKey().sendKeys(Keys.PAGE_DOWN).build().perform();
						}

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						isAddButttonClicked = true;

						break;
					} else {
						isAddButttonClicked = false;
						break;
					}
				} catch (Exception e) {
					if (j == 600) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (i == premitiveLabelLength && isAddButttonClicked == false) {
				Assert.fail("Add button is not clicked hence failed");
			}
			if (isAddButttonClicked == true) {
				break;
			}

		}
	}

	@Then("user_076 verify address details screen should have back button and save button in new app stage")
	public void user_verify_address_details_screen_should_have_back_button_and_save_button_in_new_app_stage()
			throws Throwable {
		boolean saveButonVerification = false;
		boolean backButtonVerification = false;
		for (int i = 0; i <= 80; i++) {
			try {
				saveButonVerification = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("save_button")).isDisplayed();
				if (saveButonVerification == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}

			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				backButtonVerification = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("back_button")).isDisplayed();
				if (backButtonVerification == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@Then("user_076 verify address type field should be editable mandatory dropdown at new app stage")
	public void user_verify_address_type_field_should_be_editable_mandatory_dropdown_at_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_type"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_type"))
						.getAttribute("aria-label").contains("*"),
				"address type is non mandatoru hence failed");
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_type"))
						.getAttribute("aria-label").contains("Select"),
				"Address type is not a dropdown hence failed");
		System.out.println("Address type " + addressDetailsTestData.get("address_type"));
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("address_type"));
	}

	@Then("user_076 verify address status field should be editablble mandatory dropdown at new app stage")
	public void user_verify_address_status_field_should_be_editablble_mandatory_dropdown_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_status"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										newAppAddressDetailsJSElements.getElement("address_status"))
								.getAttribute("aria-label").contains("*"),
						"Address status is not a mandatory field hence failed");
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										newAppAddressDetailsJSElements.getElement("address_status"))
								.getAttribute("aria-label").contains("Select"),
						"Address status is not a dropdown hence failed");
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("address_status"));

	}

	@Then("user_076 verify residential or occupancy status field should be editable mandatory dropdown at new app stage")
	public void user_verify_residential_or_occupancy_status_field_should_be_editable_mandatory_dropdown_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("residential_or_ocupency_status")).click();
				softAssert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("residential_or_ocupency_status"))
						.getAttribute("aria-label").contains("*"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("residential_or_ocupency_status"))
						.getAttribute("aria-label").contains("Select"),
				"Residential occupancy is not a dropdown hence failed");
		softAssert.assertTrue(
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("residential_or_ocupency_status"))
						.getAttribute("aria-label").contains("*"),
				"Residential occupancy is not a mandatory hence failed");
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("residential_or_occupansy_status"));

	}

	@Then("user_076 verify communication address field should be non mandatory editable calendar at new app stage")
	public void user_verify_communication_address_field_should_be_non_mandatory_editable_calendar_at_new_app_stage()
			throws Throwable {

	}

	@Then("user_076 verify location category field should be mandatory editable lookup at new app stage")
	public void user_verify_location_category_field_should_be_mandatory_editable_lookup_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("location_category"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										newAppAddressDetailsJSElements.getElement("location_category"))
								.getAttribute("aria-label").contains("*"),
						"location category is not a mandatory hence failed");
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										newAppAddressDetailsJSElements.getElement("location_category"))
								.getAttribute("aria-label").contains("Select"),
						"Location category is not a dropdown hence failed");
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("location_category"));

	}

	@Then("user_076 verify address line one field should be mandatory editable textbox at new app stage")
	public void user_verify_address_line_one_field_should_be_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.click();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("address_line_1"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("address_line1_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					softAssert.fail("address line 1 is a non mandatroy field hence failed");
				}

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "Address line one is not a text box hence failed");
	}

	@Then("user_076 verify address line two field should be mandatory editable textbox at new app stage")
	public void user_verify_address_line_two_field_should_be_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line2")));
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line2"))
						.click();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line2"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line2"))
						.sendKeys(addressDetailsTestData.get("address_line_2"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("address_line2_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					softAssert.fail("address line 2 is a non mandatroy field hence failed");
				}

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "Address line two is not a text box hence failed");
	}

	@Then("user_076 verify country field should be mandatory editable textbox at new app stage")
	public void user_verify_country_field_should_be_mandatory_editable_textbox_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("country"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("country"))
						.getAttribute("aria-label").contains("*"),
				"Country field is not a mandatory hence failed");
		softAssert.fail("country field is not a dropdown ");
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("country"));

	}

	@Then("user_076 verify provience id field should be mandatory editable textbox at new app stage")
	public void user_verify_provience_id_field_should_be_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("province_id"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("province_id"))
						.getAttribute("aria-label").contains("*"));

		softAssert.fail("Provience ID is not a dropdown hence failed");
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("provience_id"));
	}

	@Then("user_076 verify neighbourhood district name field should be mandatory editable textbox at new app stage")
	public void user_verify_neighbourhood_district_name_field_should_be_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("district_name")));
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("district_name"))
						.click();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("district_name"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("district_name"))
						.sendKeys(addressDetailsTestData.get("district_name"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("district_name_mandatory_verification"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					softAssert.fail("district name is a non mandatroy field hence failed");
				} else {
					break;
				}

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "district name is not a text box hence failed");
	}

	@Then("user_076 verify city field should be mandatory editable textbox at new app stage")
	public void user_verify_city_field_should_be_mandatory_editable_textbox_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("city")));
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("city")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}

			}
		}

		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("city"))
						.getAttribute("aria-label").contains("*"));
		softAssert.fail("city field is not a text box hence failed ");
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("city"));
	}

	@Then("user_076 verify zipcode field should be mandatory editable textbox at new app stage")
	public void user_verify_zipcode_field_should_be_mandatory_editable_textbox_at_new_app_stage() throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("zip_code")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("zip_code"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("zip_code"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("zip_code"))
						.sendKeys(addressDetailsTestData.get("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScript("return " + newAppAddressDetailsJSElements.getElement("zip_code"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					softAssert.fail("zip code is a non mandatroy field hence failed");
					break;
				} else {
					break;
				}

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "zipcode is not a text box hence failed");
	}

	@Then("user_076 verify po box number field should be non mandatory editable textbox at new app stage")
	public void user_verify_po_box_number_field_should_be_non_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("po_box_number")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("po_box_number"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("po_box_number"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("po_box_number"))
						.sendKeys(addressDetailsTestData.get("po_box_number"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("po_box_number_mandatory_verification"));
				if (i == 80) {
					if (poBoxNumberObject != null) {
						softAssert.fail("po box number field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertEquals(fieldValidation, "number", "po box number is not a number hence failed");

	}

	@Then("user_076 verify mobile number field should be non mandatory editable numeric at new app stage")
	public void user_verify_mobile_number_field_should_be_non_mandatory_editable_numeric_at_new_app_stage()
			throws Throwable {

		String fieldValidation = "";
		Double d = Double.valueOf(addressDetailsTestData.get("mobile_number"));
		String mobileNumber = String.format("%.0f", d);

		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("mobile_number_primary")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("mobile_number_primary"))
						.getAttribute("type");
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("mobile_number_primary"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("mobile_number_primary"))
						.sendKeys(mobileNumber);
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String poBoxNumberObject = "";

		for (int i = 0; i <= 80; i++) {
			try {
				poBoxNumberObject = javascriptHelper.executeScript("return "
						+ newAppAddressDetailsJSElements.getElement("mobile_number_primary_mandatory_verification"))
						.toString();
				if (!(poBoxNumberObject.isBlank())) {
					break;
				} else {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(poBoxNumberObject.contains("*")),
				"Mobile number field should be non mandatory but here its mandatory henece failed");

		softAssert.assertEquals(fieldValidation, "number", "mobile number is not a numeric hence failed");
	}

	@Then("user_076 verify duration of stay field should be non mandatory editable numeric field at new app stage")
	public void user_verify_duration_of_stay_field_should_be_non_mandatory_editable_numeric_field_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("duration_on_stay")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("duration_on_stay"))
						.getAttribute("type");
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("duration_on_stay"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("duration_on_stay"))
						.sendKeys(addressDetailsTestData.get("duration_on_stay"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return "
						+ newAppAddressDetailsJSElements.getElement("duration_on_stay_mandatory_verification"));
				if (i == 80) {
					if (poBoxNumberObject != null) {
						softAssert
								.fail("duration on stay field should be non mandatory but here it is mandatory field");
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertEquals(fieldValidation, "number", "duration of stay is not a text box hence failed");

	}

	@Then("user_076 verify latitude details of address field should be non mandatory editable textbox at new app stage")
	public void user_verify_latitude_details_of_address_field_should_be_non_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("latitude_details_of_the_address")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("latitude_details_of_the_address"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("latitude_details_of_the_address")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("latitude_details_of_the_address"))
						.sendKeys(addressDetailsTestData.get("latitude_details"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return " + newAppAddressDetailsJSElements
						.getElement("latitude_details_of_the_address_mandatory_verification"));
				if (i == 80) {
					if (poBoxNumberObject != null) {
						softAssert
								.fail("latitude details field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		System.out.println("latitude details of the address field type " + fieldValidation);
		softAssert.assertEquals(fieldValidation, "text", "latitude details of address is not a text box hence failed");
	}

	@Then("user_076 verify longitude details of address field should be non mandatory editable textbox at new app stage")
	public void user_verify_longitude_details_of_address_field_should_be_non_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("longitude_details_of_the_address")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("longitude_details_of_the_address"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("longitude_details_of_the_address")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("longitude_details_of_the_address"))
						.sendKeys(addressDetailsTestData.get("longitude_details"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object poBoxNumberObject = javascriptHelper.executeScript("return " + newAppAddressDetailsJSElements
						.getElement("longitude_details_of_the_address_mandatory_verification"));
				if (i == 80) {
					if (poBoxNumberObject != null) {
						softAssert
								.fail("longitude details field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "longitude details of address is not a text box hence failed");

	}

	@Then("user_076 verify landmark field should be non mandatory editable textbox at new app stage at new app stage")
	public void user_verify_landmark_field_should_be_non_mandatory_editable_textbox_at_new_app_stage_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landmark")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landmark"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landmark"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landmark"))
						.sendKeys(addressDetailsTestData.get("land_mark"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object landmark = javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("landmark_mandatory_verifcation"));
				if (i == 80) {
					if (landmark != null) {
						softAssert.fail("landmark field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "landmark is not a text box hence failed");
	}

	@Then("user_076 verify occupancy date field should be mandatory editable calendar at new app stage at new app stage")
	public void user_verify_occupancy_date_field_should_be_mandatory_editable_calendar_at_new_app_stage_at_new_app_stage()
			throws Throwable {
		System.out.println("today Date " + commonJSElements.getElement("today_date"));
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("occupency_date")));
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("occupency_date"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object occupancyDate = javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("occupency_date_mandatory_verification"));
				if (i == 80) {
					if (occupancyDate != null) {
						softAssert.fail("occupancyDate field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("user_076 verify landlord name field should be non mandatory editable text box at new app stage at new app stage")
	public void user_verify_landlord_name_field_should_be_non_mandatory_editable_text_box_at_new_app_stage_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landlord_name")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landlord_name"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landlord_name"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("landlord_name"))
						.sendKeys(addressDetailsTestData.get("land_lord_name"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object landlordName = javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("landlord_name_Mandatory_verification"));
				if (i == 80) {
					if (landlordName != null) {
						softAssert.fail("landlordName field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertEquals(fieldValidation, "text", "landlord name is not a text box hence failed");

	}

	@Then("user_076 verify landlord mobile number field should be non mandatory editable numeric field at new app stage")
	public void user_verify_landlord_mobile_number_field_should_be_non_mandatory_editable_numeric_field_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("landlord_mobile_number")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("landlord_mobile_number"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("landlord_mobile_number")).click();
				System.out.println(addressDetailsTestData.get("land_lord_mobile_number"));
				Double d = Double.valueOf(addressDetailsTestData.get("land_lord_mobile_number"));
				String mobileNumber = String.format("%.0f", d);
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("landlord_mobile_number"))
						.sendKeys(mobileNumber);
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object landlordMobileNumber = javascriptHelper.executeScript("return "
						+ newAppAddressDetailsJSElements.getElement("landlord_mobile_number_mandatory_verification"));
				if (i == 80) {
					if (landlordMobileNumber != null) {
						softAssert.fail(
								"landlordMobileNumber field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertEquals(fieldValidation, "number", "landlord mobile number is not a number field hence failed");

	}

	@Then("user_076 verify rent amount field should be non mandatory editable numeric field at new app stage")
	public void user_verify_rent_amount_field_should_be_non_mandatory_editable_numeric_field_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount")));
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.getAttribute("type");
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.sendKeys(addressDetailsTestData.get("rent_amount"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				Object rentAmount = javascriptHelper.executeScript(
						"return " + newAppAddressDetailsJSElements.getElement("rent_amount_mandatory_verification"));
				if (i == 80) {
					if (rentAmount != null) {
						softAssert.fail("rentAmount field should be non mandatory but here it is mandatory field");
						break;
					} else {
						break;
					}
				}

			} catch (Exception e) {

			}
		}
		System.out.println("Rent amount field validation " + fieldValidation);
		softAssert.assertEquals(fieldValidation, "number", "rent amount is not a number field hence failed");
	}

	@And("user_076 update the address line one in address  details list view record in new app stage")
	public void user_076_update_the_address_line_one_in_address_details_list_view_record_in_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("address_line_1"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on save button in address screen ta new app stage")
	public void user_click_on_save_button_in_address_screen_ta_new_app_stage() throws Throwable {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.sendKeys(Keys.PAGE_UP);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify address details record got saved in new app stage")
	public void user_verify_address_details_record_got_saved_in_new_app_stage() throws Throwable {
		String saveValidationPopup = "";

		for (int i = 0; i <= 80; i++) {
			try {
				saveValidationPopup = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(saveValidationPopup.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveValidationPopup);
		Assert.assertTrue(saveValidationPopup.contains("Success! Record created"));
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonJSElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify address details record got updated in new app stage")
	public void user_verify_address_details_record_got_updated_in_new_app_stage() throws Throwable {
		String saveValidationPopup = "";

		for (int i = 0; i <= 80; i++) {
			try {
				saveValidationPopup = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(saveValidationPopup.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveValidationPopup);
		// Assert.assertTrue(saveValidationPopup.contains("Success! Record created"));
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonJSElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify frequency rent field should be non mandatory editable dropdown at new app stage")
	public void user_verify_frequency_rent_field_should_be_non_mandatory_editable_dropdown_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("frequency_of_rent")));
				javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("frequency_of_rent"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(javascriptHelper
				.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("frequency_of_rent"))
				.getAttribute("aria-label").contains("*")));
		softAssert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("frequency_of_rent"))
				.getAttribute("ng-reflect-placeholder").contains("Select"));
		clicksAndActionsHelper.jsSelectUsingText(addressDetailsTestData.get("frequency_of_rent"));

	}

	@And("user_076 click on save button in customer address details in new app stage")
	public void user_click_on_save_button_in_customer_address_details_in_new_app_stage() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();

				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();

				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 make address line one fied as blank in address details list view record at new app stage")
	public void user_make_address_line_one_fied_as_blank_in_address_details_list_view_record_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@Then("user_076 verify system should show the validation for fill the mandatory details of customer address details in new app stage")
	public void user_verify_system_should_show_the_validation_for_fill_the_mandatory_details_of_customer_address_details_in_new_app_stage()
			throws Throwable {
		String mandatoryValidation = "";
		for (int i = 0; i <= 80; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_message")).toString();
				if (!(mandatoryValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(mandatoryValidation);

		softAssert.assertEquals(mandatoryValidation, "Please fill all the details");

	}

	@And("user_076 enter the special caharcter input in address line one input box at new app stage")
	public void user_enter_the_special_caharcter_input_in_address_line_one_input_box_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("address_line1"))
						.sendKeys(addressDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify address line one field should show the validation for special character input at new app stage")
	public void user_verify_address_line_one_field_should_show_the_validation_for_special_character_input_at_new_app_stage()
			throws Throwable {
		String speciaCharacterInput = "";
		for (int i = 0; i <= 80; i++) {
			try {
				speciaCharacterInput = javascriptHelper.executeScript("return "
						+ newAppAddressDetailsJSElements.getElement("address_line_1_special_character_validation"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(speciaCharacterInput);

		softAssert.assertEquals(speciaCharacterInput.trim(), "Special character not allowed".trim());

	}

	@And("user_076 enter the character input in rent amount field in new app stage")
	public void user_enter_the_character_input_in_rent_amount_field_in_new_app_stage() throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount")));
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.sendKeys(addressDetailsTestData.get("characterInput"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 make rent amount field as blank in rent amount field in new app stage of address details record")
	public void user_make_rent_amount_field_as_blank_in_rent_amount_field_in_new_app_stage_of_address_details_record()
			throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount")));
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@Then("user_076 verify rent amount field should not accept the character innput in new app stage")
	public void user_verify_rent_amount_field_should_not_accept_the_character_innput_in_new_app_stage()
			throws Throwable {
		String inputLength = "";

		for (int i = 0; i <= 10; i++) {
			try {
				inputLength = javascriptHelper
						.executeScript(
								"return " + newAppAddressDetailsJSElements.getElement("rent_amount") + ".InnerText")
						.toString();
			} catch (Exception e) {

			}
		}
		System.out.println("Input length is " + inputLength);

		softAssert.assertEquals(inputLength, "");
	}

	@And("user_076 click on back button in address details in new app stage")
	public void user_click_on_back_button_in_address_details_in_new_app_stage() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(newAppAddressDetailsJSElements.getElement("rent_amount"))
						.sendKeys(Keys.PAGE_UP);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify address details screen got move to the previous screen in address details at new app stage")
	public void user_verify_address_details_screen_got_move_to_the_previous_screen_in_address_details_at_new_app_stage()
			throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		System.out.println("");
		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 80) {
					System.out.println("Query " + labelLength);
					lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
					if (!(lengthOfTheLabel.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
		System.out.println("Length of the label " + premitiveLabelLength);

		for (int i = 0; i < premitiveLabelLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Address Details").trim())) {

						System.out.println("Label Name " + labelName);
						if (i > 250) {
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]")
								.isDisplayed();

						isAddButttonClicked = true;

						break;
					} else {
						isAddButttonClicked = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButttonClicked == true) {
				break;
			}
		}
	}

	@And("user_076 change the address details status to active to inactive or inactive to active in new app stage")
	public void user_change_the_address_details_status_to_active_to_inactive_or_inactive_to_active_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("addressdetails_status_toggle")));
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("addressdetails_status_toggle")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);

		for (int i = 0; i <= 100; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript("return " + newAppAddressDetailsJSElements.getElement("addressdetails_status"))
						.toString();
			} catch (Exception e) {

			}
		}
	}

	@And("user_076 click on edit button of customer address details list view record in new app stage")
	public void user_076_click_on_edit_button_of_customer_address_details_list_view_record_in_new_app_stage()
			throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]').length";
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
							+ "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + i + "].innerText")
							.toString();
					if (listViewName.contains("Address Details")) {
						System.out.println("List view name is " + listViewName);
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
		for (int i = 0; i <= 600; i++) {
			try {
				if (i > 200) {
					clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"));
				}
				javascriptHelper
						.executeScriptWithWebElement("document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')")
						.click();

				break;
			} catch (Exception e) {

				if (i == 600) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0076 click on edit button of customer address details after changing the status")
	public void user_click_on_edit_button_of_customer_address_details_after_changing_the_status() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				System.out.println("document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
						+ "].querySelector('button[icon=\"pi pi-pencil\"')");
				javascriptHelper
						.executeScriptWithWebElement("document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')")
						.click();

				break;
			} catch (Exception e) {
				if (i > 550 && i < 600) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"));
				}
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify record status of address details got changed as per the toggle button in new app stage")
	public void user_verify_record_status_of_address_details_got_changed_as_per_the_toggle_button_in_new_app_stage()
			throws Throwable {
		Thread.sleep(1000);
		System.out.println("Index value in list view record validation " + indexOfListView);
		for (int i = 0; i <= 3000; i++) {
			try {
				if (i > 2500) {
					System.out.println(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText");
					listViewRecordStatus = javascriptHelper
							.executeScript("return document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
									+ indexOfListView
									+ "].querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
							.toString();

					System.out.println("List view Record status " + listViewRecordStatus);
					if (!(listViewRecordStatus.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (recordStatus.equals("false")) {
			softAssert.assertEquals(listViewRecordStatus, "In-active");
		} else if (recordStatus.equals("true")) {
			softAssert.assertEquals(listViewRecordStatus, "Active");
		}
	}

	@And("user_76 verify address details list view record should be readonly ot editable at new app stage")
	public void user_76_verify_address_details_list_view_record_should_be_readonly_ot_editable_at_new_app_stage()
			throws Throwable {
		boolean statusOfListViewRecord = false;
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
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
					if (listViewName.contains("Address Details")) {

						indexOfListView = i;

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

		for (int i = 0; i <= 50; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('p-tag')")
						.click();
				if (i > 40) {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('p-tag')")
							.sendKeys(Keys.PAGE_DOWN);
				}
			} catch (Exception e) {
				if (i == 50) {
					statusOfListViewRecord = true;
				}
			}
		}
		System.out.println(statusOfListViewRecord);
		Assert.assertTrue(statusOfListViewRecord);

	}

	@And("user_076 click on search button in address details list view in new app stage")
	public void user_click_on_search_button_in_address_details_list_view_in_new_app_stage() throws Throwable {
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
					if (listViewName.contains("Address Details")) {

						indexOfListView = i;

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

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-search\"]')")
						.click();
				break;

			} catch (Exception e) {
				if (i > 250 && i < 300) {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('button[icon=\"pi pi-search\"]')")
							.sendKeys(Keys.PAGE_DOWN);
				}
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 search the matched text in address details list view in new app stage")
	public void user_search_the_matched_text_in_address_details_list_view_in_new_app_stage() throws Throwable {
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("list_view_search_input_box"))
						.sendKeys(addressDetailsTestData.get("match_search"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify system should show the valid matches in address details list view in new app stage")
	public void user_verify_system_should_show_the_valid_matches_in_address_details_list_view_in_new_app_stage()
			throws Throwable {
		String searchResult = "";

		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 80) {
					searchResult = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView
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

	@And("user_076 search the unmatched text in address details list view in new app stage")
	public void user_search_the_unmatched_text_in_address_details_list_view_in_new_app_stage() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("list_view_search_input_box"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 80; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						newAppAddressDetailsJSElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								newAppAddressDetailsJSElements.getElement("list_view_search_input_box"))
						.sendKeys(addressDetailsTestData.get("not_match_search"));
				break;
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
	}

	@Then("user_076 verify system should not show matches in address details list view in new app stage")
	public void user_verify_system_should_show_not_matches_in_address_details_list_view_in_new_app_stage()
			throws Throwable {

		String searchResult = "";

		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 80) {
					searchResult = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView
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

		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries");
	}

	@And("user_076 get the location for address details screen in new app stage")
	public void user_076_get_the_location_for_address_details_screen_in_new_app_stage() throws Throwable {

		boolean statusOfListViewRecord = false;
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
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
					if (listViewName.contains("Address Details")) {

						indexOfListView = i;

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

	@And("user_076 click on pdf export option in address details new app stage record")
	public void user_076_click_on_pdf_export_option_in_address_details_new_app_stage_record() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();

		for (File beforeDownloadsFile : listFiles) {
			System.out.println(beforeDownloadsFile.getName());
			if (beforeDownloadsFile.getName().contains("CustomerAddressDataFile")) {
				System.out.println("If condition " + beforeDownloadsFile.getName());
				softAssert.assertTrue(beforeDownloadsFile.getName().contains("CustomerAddressDataFile"),
						"File is not downloaded hence failed");
				beforeDownloadsFile.delete();
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("pdf_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@Then("user_076 verify address details pdf file is downloaded in the system at new app stage")
	public void user_076_verify_address_details_pdf_file_is_downloaded_in_the_system_at_new_app_stage()
			throws Throwable {

		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File afterDownloadsFile : listFiles) {
			System.out.println(afterDownloadsFile.getName());
			if (afterDownloadsFile.getName().contains("CustomerAddressDataFile")) {
				System.out.println("If condition " + afterDownloadsFile.getName());
				softAssert.assertTrue(afterDownloadsFile.getName().contains("CustomerAddressDataFile"),
						"File is not downloaded hence failed");

			}

		}
	}

	@And("user_076 click on export button address details at new app stage")
	public void user_076_click_on_export_button_address_details_at_new_app_stage() throws Throwable {
		System.out.println("List view Index " + indexOfListView);
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(
								"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
										+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
						.click();
				if (i > 250) {
					javascriptHelper.scrollDownVertically();

					javascriptHelper
							.executeScriptWithWebElement(
									customerIdentificationDetailsElements.getElement("additional_customer_info_tab"))
							.sendKeys(Keys.PAGE_DOWN);
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
							.click();
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

	@And("user_076 click on excel export option in address details new app stage record")
	public void user_076_click_on_excel_export_option_in_address_details_new_app_stage_record() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";

		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		for (File beforeDownloadFile : listFiles) {
			System.out.println(beforeDownloadFile.getName());
			if (beforeDownloadFile.getName().contains("CustomerAddressDataFile_export_")) {
				System.out.println("If condition " + beforeDownloadFile.getName());
				beforeDownloadFile.delete();
				break;
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("xls_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@Then("user_076 verify address details excel file is downloaded in the system at new app stage")
	public void user_076_verify_address_details_excel_file_is_downloaded_in_the_system_at_new_app_stage()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";

		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		for (File afterDownloadsFile : listFiles) {
			if (afterDownloadsFile.getName().contains("CustomerAddressDataFile_export_")) {
				System.out.println("If condition " + afterDownloadsFile.getName());
				softAssert.assertTrue(afterDownloadsFile.getName().contains("CustomerAddressDataFile_export_"),
						"File is not downloaded hence failed");
			}
		}

	}

	@And("user_076 invoke soft assert in address details screen at new appp stage")
	public void user_076_user_invoke_soft_assert_in_address_details_screen_at_new_appp_stage() throws Throwable {
		softAssert.assertAll();
	}
}
