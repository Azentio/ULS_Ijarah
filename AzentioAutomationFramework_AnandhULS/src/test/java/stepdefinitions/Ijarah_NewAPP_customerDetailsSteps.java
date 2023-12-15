package stepdefinitions;

import java.awt.Robot;
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

public class Ijarah_NewAPP_customerDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	String jsPathExcelfile = configFileReader.getJSFilePath();
	String excelTestData = configFileReader.getTestDataFilePath();
	JSPaths customerDetailsJSPaths = new JSPaths(jsPathExcelfile, "NewApp_CustomerDetailsElements",
			"New_App_CustomerDetailsElements", "JSPath");
	JSPaths CommonJsElements = new JSPaths(jsPathExcelfile, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	Robot robot;
	ExcelData excelDataForcustomerDetails = new ExcelData(excelTestData, "customerdetails_NewApp", "Dataset ID");
	ExcelData IjarahExecutionSheet = new ExcelData(excelTestData, "Ijarah_ExecutionTracker", "TestCase ID");
	ExcelData murabahaExecutionSheet = new ExcelData(excelTestData, "Murabaha_ExecutionTracker", "TestCase ID");
	ExcelData tawruqqExecutionSheet = new ExcelData(excelTestData, "Tawruqq_ExecutionTracker", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ExcelData excelDataForMurabhaCustomerDetailsTestData = new ExcelData(excelTestData, "newApp_M_CustDetailsTestData",
			"Dataset ID");
	ExcelData excelDataForTawruqqCustomerDetailsTestData = new ExcelData(excelTestData,
			"TW_NewApp_CustDetails_TestData", "Dataset ID");
	Map<String, String> customerDetailsTestData = new HashMap<>();
	Map<String, String> customerDetailsExecutionData = new HashMap<>();
	Map<String, String> customerDetailsMurabhaExecutionData = new HashMap<>();
	Map<String, String> tawruqqExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String recordStatus = "";
	String listViewRecordStatus = "";
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);

	@And("user_076 get the test data for test case id AT_IJ_NEWAPP_01")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_newapp() throws Throwable {
		customerDetailsExecutionData = IjarahExecutionSheet.getTestdata("AT_IJ_NEWAPP_01");
		customerDetailsTestData = excelDataForcustomerDetails
				.getTestdata(customerDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id NewApp_M_CustDetails_01")
	public void user_076_user_get_the_test_data_for_the_test_case_id_NewApp_M_CustDetails_01() throws Throwable {
		customerDetailsMurabhaExecutionData = murabahaExecutionSheet.getTestdata("NewApp_M_CustDetails_01");
		System.out.println(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForMurabhaCustomerDetailsTestData
				.getTestdata(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id AT_TW_NewApp_CustDetails_01")
	public void user_076_user_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CustDetails_01() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CustDetails_01");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForTawruqqCustomerDetailsTestData
				.getTestdata(tawruqqExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id AT_TW_NewApp_CustDetails_02")
	public void user_076_user_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CustDetails_02() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CustDetails_02");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForTawruqqCustomerDetailsTestData
				.getTestdata(tawruqqExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id AT_TW_NewApp_CustDetails_03")
	public void user_076_user_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CustDetails_03() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CustDetails_03");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForTawruqqCustomerDetailsTestData
				.getTestdata(tawruqqExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id AT_TW_NewApp_CustDetails_04")
	public void user_076_user_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CustDetails_04() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CustDetails_04");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForTawruqqCustomerDetailsTestData
				.getTestdata(tawruqqExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id AT_TW_NewApp_CustDetails_05")
	public void user_076_user_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CustDetails_05() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CustDetails_05");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForTawruqqCustomerDetailsTestData
				.getTestdata(tawruqqExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id AT_TW_NewApp_CustDetails_06")
	public void user_076_user_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CustDetails_06() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CustDetails_06");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForTawruqqCustomerDetailsTestData
				.getTestdata(tawruqqExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id NewApp_M_CustDetails_02")
	public void user_076_user_get_the_test_data_for_the_test_case_id_NewApp_M_CustDetails_02() throws Throwable {
		customerDetailsMurabhaExecutionData = murabahaExecutionSheet.getTestdata("NewApp_M_CustDetails_02");
		System.out.println(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForMurabhaCustomerDetailsTestData
				.getTestdata(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id NewApp_M_CustDetails_03")
	public void user_076_user_get_the_test_data_for_the_test_case_id_NewApp_M_CustDetails_03() throws Throwable {
		customerDetailsMurabhaExecutionData = murabahaExecutionSheet.getTestdata("NewApp_M_CustDetails_03");
		System.out.println(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForMurabhaCustomerDetailsTestData
				.getTestdata(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id NewApp_M_CustDetails_04")
	public void user_076_user_get_the_test_data_for_the_test_case_id_NewApp_M_CustDetails_04() throws Throwable {
		customerDetailsMurabhaExecutionData = murabahaExecutionSheet.getTestdata("NewApp_M_CustDetails_04");
		System.out.println(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForMurabhaCustomerDetailsTestData
				.getTestdata(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id NewApp_M_CustDetails_05")
	public void user_076_user_get_the_test_data_for_the_test_case_id_NewApp_M_CustDetails_05() throws Throwable {
		customerDetailsMurabhaExecutionData = murabahaExecutionSheet.getTestdata("NewApp_M_CustDetails_05");
		System.out.println(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForMurabhaCustomerDetailsTestData
				.getTestdata(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case id NewApp_M_CustDetails_06")
	public void user_076_user_get_the_test_data_for_the_test_case_id_NewApp_M_CustDetails_06() throws Throwable {
		customerDetailsMurabhaExecutionData = murabahaExecutionSheet.getTestdata("NewApp_M_CustDetails_06");
		System.out.println(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
		customerDetailsTestData = excelDataForMurabhaCustomerDetailsTestData
				.getTestdata(customerDetailsMurabhaExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_IJ_NEWAPP_02")
	public void user_076_get_the_test_data_for_test_case_id_AT_IJ_NEWAPP_02() throws Throwable {
		customerDetailsExecutionData = IjarahExecutionSheet.getTestdata("AT_IJ_NEWAPP_02");
		customerDetailsTestData = excelDataForcustomerDetails
				.getTestdata(customerDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_IJ_NEWAPP_03")
	public void user_076_get_the_test_data_for_test_case_id_AT_IJ_NEWAPP_03() throws Throwable {
		customerDetailsExecutionData = IjarahExecutionSheet.getTestdata("AT_IJ_NEWAPP_03");
		customerDetailsTestData = excelDataForcustomerDetails
				.getTestdata(customerDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_IJ_NEWAPP_05")
	public void user_076_get_the_test_data_for_test_case_id_AT_IJ_NEWAPP_05() throws Throwable {
		customerDetailsExecutionData = IjarahExecutionSheet.getTestdata("AT_IJ_NEWAPP_05");
		customerDetailsTestData = excelDataForcustomerDetails
				.getTestdata(customerDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_IJ_NEWAPP_06")
	public void user_076_get_the_test_data_for_test_case_id_AT_IJ_NEWAPP_06() throws Throwable {
		customerDetailsExecutionData = IjarahExecutionSheet.getTestdata("AT_IJ_NEWAPP_06");
		customerDetailsTestData = excelDataForcustomerDetails
				.getTestdata(customerDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 search the Ijarah new app record reference number")
	public void user_search_the_ijarah_new_app_record_reference_number() throws Throwable {

		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				System.out.println("Record reference Number " + configFileReader.getIjarahRecordReferenceNumber());
				searchTextBox.sendKeys(configFileReader.getIjarahRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the Ijarah new app record at mail box")
	public void user_select_the_ijarah_new_app_record_at_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
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

	@And("user_076 search the new application stage customer details record reference number")
	public void user_076_search_the_new_application_stage_customer_details_record_reference_number() throws Throwable {

		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getIjarahRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 search for murabaha record reference number in new app stage")
	public void user_076_search_for_murabaha_record_reference_number_in_new_app_stage() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getMurabahaRecordRefereneNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 search for tawruqq record reference number in new app stage")
	public void user_076_search_for_tawruqq_record_reference_number_in_new_app_stage() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getTawruqqRecordRefereneNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the murabaha record in new app stage")
	public void user_076_select_the_murabaha_record_in_new_app_stage() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
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
					if (recordRefNumber.equals(configFileReader.getMurabahaRecordRefereneNumber())) {
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

	@And("user_076 select the tawruqq record in new app stage")
	public void user_076_select_the_tawruqq_record_in_new_app_stage() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
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
					if (recordRefNumber.equals(configFileReader.getTawruqqRecordRefereneNumber())) {
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

	@And("user_076 select the new application stage customer details record from mail box")
	public void user_076_select_the_new_application_stage_customer_details_record_from_mail_box() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
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

	@And("user_076 click on customer details tab in new app stage")
	public void user_076_click_on_customer_details_tab_in_new_app_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("customer_details_tab"))
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
								customerDetailsJSPaths.getElement("customerDetails_AddButton")),
						javascriptHelper.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customerDetails_AddButton")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on list view edit button of customer details record")
	public void user_076_click_on_list_view_edit_button_of_customer_details_record() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_list_view_edit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 change the customer details list view record status active or inactive")
	public void user_076_change_the_customer_details_list_view_record_status_active_or_inactive() throws Throwable {
		String tempRecordStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {

				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("status_toggle_button")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {
				tempRecordStatus = javascriptHelper
						.executeScript("return " + customerDetailsJSPaths.getElement("get_record_status")).toString();
				if (!(recordStatus.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Temp Record Status " + tempRecordStatus);
		for (int i = 0; i <= 150; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("status_toggle_button"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 80; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript("return " + customerDetailsJSPaths.getElement("get_record_status")).toString();
				if (!(recordStatus.equals(tempRecordStatus))) {
					break;
				}

			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Actual Record Status " + recordStatus);

	}

	@Then("user_076 verify customer details record status should get changes as per the status doggle")
	public void user_076_verify_customer_details_record_status_should_get_changes_as_per_the_status_doggle()
			throws Throwable {

		for (int i = 0; i <= 80; i++) {
			try {
				listViewRecordStatus = javascriptHelper
						.executeScript("return " + customerDetailsJSPaths.getElement("list_view_record_status"))
						.toString();
				if (!(listViewRecordStatus.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 80) {
					Assert.fail(e.getMessage());
				}
			}
		}

		System.out.println("List View Record Status " + listViewRecordStatus);

		if (recordStatus.equalsIgnoreCase("true")) {

			softAssert.assertTrue(listViewRecordStatus.equalsIgnoreCase("Active"),
					" Record status is not changing as expected");
		} else if (recordStatus.equalsIgnoreCase("false")) {
			softAssert.assertTrue(listViewRecordStatus.equalsIgnoreCase("In-active"),
					" Record status is not changing as expected");
		}

	}

	@And("user_076 update the customer details record with valid data")
	public void user_076_update_the_customer_details_record_with_valid_data() throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@Then("user_076 verify customer type field should be mandatory editable dropdown")
	public void user_076_verify_customer_type_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("customer_type"));
		softAssert.assertTrue(
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_details_type_dropdown"))
						.getAttribute("aria-label").contains("*"),
				"customer type field is not a mandatory field hence failed");
		softAssert.assertTrue(
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_details_type_dropdown"))
						.getAttribute("ng-reflect-placeholder").contains("Select"),
				"customer type field is not a dropdown field hence failed");

	}

	@Then("user_076 verify application type field should be editable mandatory dropdown")
	public void user_076_verify_application_type_field_should_be_editable_mandatory_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("application_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("application_type"));
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("application_type_dropdown"))
								.getAttribute("aria-label").contains("*"),
						"application type field is not a mandatory field hence failed");
		System.out.println("Application type " + javascriptHelper
				.executeScriptWithWebElement(customerDetailsJSPaths.getElement("application_type_dropdown"))
				.getAttribute("aria-label"));
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("application_type_dropdown"))
								.getAttribute("ng-reflect-placeholder").contains("Select"),
						"application type field is not a dropdown field hence failed");
	}

	@Then("user_076 verify title field should be editable mandatory dropdown")
	public void user_076_verify_title_field_should_be_editable_mandatory_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("title_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("title"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("title_dropdown"))
						.getAttribute("aria-label").contains("*"),
				"application type field is not a mandatory field hence failed");
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("title_dropdown"))
						.getAttribute("ng-reflect-placeholder").contains("Select"),
				"application type field is not a dropdown field hence failed");
	}

	@Then("user_076 verify first name field should be editable mandatory text box")
	public void user_076_verify_first_name_field_should_be_editable_mandatory_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("first_Name_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"First name field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"First name field is not a text field hence failed");

	}

	@Then("user_076 verify middle name field should be non mandatory text box")
	public void user_076_verify_middle_name_field_should_be_non_mandatory_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("middle_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("middle_name_input"))
						.sendKeys(customerDetailsTestData.get("middle_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("middle_name_arabic_mandatory_verification"))
						.toString();
				System.out.println(mandatoryVerification);

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("middle_name_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Middle Name mandatory verification " + mandatoryVerification);
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"middle name field is a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"middle name field is not a text field hence failed");
	}

	@Then("user_076 verify last name field should be mandatory editable text box")
	public void user_076_verify_last_name_field_should_be_mandatory_editable_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("last_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("last_name_input"))
						.sendKeys(customerDetailsTestData.get("last_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("first_Name_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"last name field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"last name field is not a text field hence failed");
	}

	@Then("user_076 verify first name arabic field should be mandatory editable text box")
	public void user_076_verify_first_name_arabic_field_should_be_mandatory_editable_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_arabic_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_arabic_input"))
						.sendKeys(customerDetailsTestData.get("first_name_arabic"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("first_Name_mandatory_verification"))
						.toString();
				System.out.println(mandatoryVerification);

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"first name arabic field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"first name arabic field is not a text field hence failed");
	}

	@Then("user_076 verify middle name arabic field should be editable non mandatory text box")
	public void user_076_verify_middle_name_arabic_field_should_be_editable_non_mandatory_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("middle_name_arabic_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("middle_name_arabic_input"))
						.sendKeys(customerDetailsTestData.get("middle_name_arabic"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("middle_name_arabic_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("middle_name_arabic_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Middle name Mandatory verification" + mandatoryVerification);
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"middle name arabic field is a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"middle name arabic field is not a text field hence failed");
	}

	@Then("user_076 verify last name arabic field should be mandatory editable text box")
	public void user_076_verify_last_name_arabic_field_should_be_mandatory_editable_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("last_name_arabic_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("last_name_arabic_input"))
						.sendKeys(customerDetailsTestData.get("last_name_arabic"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("first_Name_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"last name arabic field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"last name arabic field is not a text field hence failed");
	}

	@Then("user_076 verify family name arabic field should be non mandatory editable textbox")
	public void user_076verify_family_name_arabic_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("family_name_arabic_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("family_name_arabic_input"))
						.sendKeys(customerDetailsTestData.get("family_name_arabic"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("family_name_arabic_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("family_name_arabic_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Family name arabic field mandatory status " + mandatoryVerification);
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"family name arabic field is a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"family name arabic field is not a text field hence failed");

	}

	@Then("user_076 verify family name field should be non mandatory editable textbox")
	public void user_076verify_family_name_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("family_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("family_name_input"))
						.sendKeys(customerDetailsTestData.get("family_name"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("family_name_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("family_name_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Family name mandatory verification " + mandatoryVerification);
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"family name field is a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"family name field is not a text field hence failed");
	}

	@Then("user_076 verify date of birth field should be mandatory editable calendar field")
	public void user_076_verify_date_of_birth_field_should_be_mandatory_editable_calendar_field() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		robot = new Robot();
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("date_of_birth_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("date_of_birth_input"))
						.sendKeys(customerDetailsTestData.get("date_of_birth"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
//		for (int i = 0; i <= 3; i++) {
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input")));
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.click();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("date_of_birth_input"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println(customerDetailsJSPaths.getElement("date_highlighted_button"));
				String query = customerDetailsJSPaths.getElement("date_highlighted_button");
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("date_highlighted_button"))
						.click();
				break;
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
								"return " + customerDetailsJSPaths.getElement("date_of_birth_mandatory_verification"))
						.toString();
				fieldVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("date_of_birth_field_verification"))
						.toString();
				if (!(mandatoryVerification.isBlank()) || !(fieldVerification.isBlank())) {
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

	@And("user_076 verify age field shold be editable mandatory autopulate field")
	public void user_076_verify_age_field_shold_be_editable_mandatory_autopulate_field() throws Throwable {
		String ageAutoPopulateCheck = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 200; i++) {
			try {
				ageAutoPopulateCheck = javascriptHelper
						.executeScript("return " + customerDetailsJSPaths.getElement("age_get_value")).toString();
				if (!(ageAutoPopulateCheck.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail("Age field is not getting filled automatically hence failed");
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return " + customerDetailsJSPaths.getElement("age_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"), "Age field is not a mandatory hence failed");
	}

	@Then("user_076 verify age field should be mandatory editable calendar")
	public void user_076_verify_age_field_should_be_mandatory_editable_calendar() throws Throwable {

	}

	@Then("user_076 verify gender field should be manadtory editable dropdown")
	public void user_076_verify_gender_field_should_be_manadtory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("gender_dropdown")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("gender_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("gender"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("gender_dropdown"))
						.getAttribute("aria-label").contains("*"),
				"gender field is not a mandatory field hence failed");
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("gender_dropdown"))
						.getAttribute("ng-reflect-placeholder").contains("Select"),
				"gender field is not a dropdown field hence failed");
	}

	@Then("user_076 verify education level field should be mandatory editable dropdown")
	public void user_076_verify_education_level_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("education_level_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("educational_level"));
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("education_level_dropdown"))
								.getAttribute("aria-label").contains("*"),
						"education level field is not a mandatory field hence failed");
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("education_level_dropdown"))
								.getAttribute("ng-reflect-placeholder").contains("Select"),
						"education level status field is not a dropdown field hence failed");
	}

	@Then("user_076 verify maritail status field should be mandatory editable dropdown")
	public void user_076_verify_maritail_status_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("maritail_status_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("maritail_status"));
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("maritail_status_dropdown"))
								.getAttribute("aria-label").contains("*"),
						"maritail status field is not a mandatory field hence failed");
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("maritail_status_dropdown"))
								.getAttribute("ng-reflect-placeholder").contains("Select"),
						"maritail status field is not a dropdown field hence failed");
	}

	@Then("user_076 verify nationality field should be mandatory editable dropdown")
	public void user_076_verify_nationality_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("nationality_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("nationality"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("nationality_dropdown"))
						.getAttribute("aria-label").contains("*"),
				"nationality field is not a mandatory field hence failed");
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("nationality_dropdown"))
						.getAttribute("ng-reflect-placeholder").contains("Select"),
				"nationality field is not a dropdown field hence failed");
	}

	@Then("user_076 verify residential status field should be mandatory editable dropdown")
	public void user_076_verify_residential_status_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_residential_status_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("residential_status"));
		softAssert.assertTrue(
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_residential_status_dropdown"))
						.getAttribute("aria-label").contains("*"),
				"customer residential field is not a mandatory field hence failed");
		softAssert.assertTrue(
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_residential_status_dropdown"))
						.getAttribute("ng-reflect-placeholder").contains("Select"),
				"customer residential field is not a dropdown field hence failed");
	}

	@Then("user_076 verify language field should be mandatory editable dropdown")
	public void user_076_verify_language_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("languages_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("language"));
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("languages_dropdown"))
						.getAttribute("aria-label").contains("*"),
				"language field is not a mandatory field hence failed");
		softAssert.assertTrue(
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("languages_dropdown"))
						.getAttribute("ng-reflect-placeholder").contains("Select"),
				"language field is not a dropdown field hence failed");
	}

	@Then("user_076 verify no of dependents field should be mandatory editable dropdown")
	public void user_076_verify_no_of_dependents_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.sendKeys(customerDetailsTestData.get("no_of_dependents"));
				break;
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
								+ customerDetailsJSPaths.getElement("no_of_dependents_mandatory_verification"))
						.toString();
				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.getAttribute("type");
				if (!(mandatoryVerification.isBlank()) || !(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"no of dependents field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"no of dependents field is not a text field hence failed");
	}

	@Then("user_076 verify client category field should be mandatory editable dropdown")
	public void user_076_verify_client_category_field_should_be_mandatory_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("client_category_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("client_category"));
		softAssert
				.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerDetailsJSPaths.getElement("client_category_dropdown"))
								.getAttribute("aria-label").contains("*"),
						"client category field is not a mandatory field hence failed");
		String tagName = javascriptHelper
				.executeScriptWithWebElement(customerDetailsJSPaths.getElement("client_category_dropdown"))
				.getTagName();
		System.out.println("Dropdown tag name " + tagName);
		softAssert.assertTrue(tagName.contains("ion-select"),
				"client category field is not a dropdown field hence failed");
	}

	@Then("user_076 verify blacklisted field should be non mandatory editable toggle button")
	public void user_076_verify_blacklisted_field_should_be_non_mandatory_editable_toggle_button() throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("blacklisted_toggle"))
						.getAttribute("role");
				if (!(toggleVerification.isBlank())) {
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
								"return " + customerDetailsJSPaths.getElement("blacklisted_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isBlank())) {
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

	@Then("user_076 verify client category field should be editablee dropdown")
	public void user_076_verify_client_category_field_should_be_editablee_dropdown() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("client_category_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("client_category"));
	}

	@Then("user_076 verify remarks field should be mandatory editable textbox")
	public void user_076_verify_remarks_field_should_be_mandatory_editable_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("remarks_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("remarks_input"))
						.sendKeys(customerDetailsTestData.get("remarks"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}

		for (int i = 0; i <= 5; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return " + customerDetailsJSPaths.getElement("remarks_mandatory_verification"))
						.toString();

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 5; i++) {
			try {

				fieldVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("remarks_input"))
						.getAttribute("type");
				if (!(fieldVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"remarks field is not a mandatory field hence failed");
		softAssert.assertTrue(fieldVerification.equalsIgnoreCase("text"),
				"remarks field is not a text field hence failed");
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

	@Then("user_076 verify system should show the pop up for updation of the cutomer details record")
	public void user_076_verify_system_should_show_the_pop_up_for_updation_of_the_cutomer_details_record()
			throws Throwable {
		String updateSuccessMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				updateSuccessMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (!(updateSuccessMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(updateSuccessMessage);
		Assert.assertTrue(updateSuccessMessage.contains("Success! Record updated for ID"));
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

	@Then("user_076 verify customer details record got saved")
	public void user_076_verify_customer_details_record_got_saved() throws Throwable {
		String saveSuccessMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveSuccessMessage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (!(saveSuccessMessage.isBlank())) {
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

	@And("user_076 invoke soft assert for customer details screen")
	public void user_076_invoke_soft_assert_for_customer_details_screen() throws Throwable {
		softAssert.assertAll();

	}

	@And("user_076 make any one mandatory field blank in customer details screen")
	public void user_076_make_any_one_mandatory_field_blank_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_arabic_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_arabic_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("user_076 click on save button without enter the mandatory details")
	public void user_076_click_on_save_button_without_enter_the_mandatory_details() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify customer details screen should show the validation for empty mandatory field")
	public void user_076_verify_customer_details_screen_should_show_the_validation_for_empty_mandatory_field()
			throws Throwable {
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_message")).toString();
				if (!(mandatoryValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(mandatoryValidation);
	}

	@And("user_076 enter the numeric input in text input of customer details screen")
	public void user_076_enter_the_numeric_input_in_text_input_of_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("numeric_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify system should show the validation for numeric input of customer details screen")
	public void user_076_verify_system_should_show_the_validation_for_numeric_input_of_customer_details_screen()
			throws Throwable {
		String fieldLevelvalidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldLevelvalidation = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("first_name_input_field_level_validation"))
						.toString();
				if (!(fieldLevelvalidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals("Only Alphabets are allowed", fieldLevelvalidation);
	}

	@And("user_076 enter the special caharcter input in text box in customer details screen")
	public void user_076_enter_the_special_caharcter_input_in_text_box_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSPaths.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the validation for special character in customer details screen")
	public void user_076_verify_system_should_show_the_validation_for_special_character_in_customer_details_screen()
			throws Throwable {
		String fieldLevelvalidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldLevelvalidation = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("first_name_input_field_level_validation"))
						.toString();
				if (!(fieldLevelvalidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals("Only Alphabets are allowed", fieldLevelvalidation);
	}

	@And("user_076 enter the alphabets in numeric field of customer address screen")
	public void user_076_enter_the_alphabets_in_numeric_field_of_customer_address_screen() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input")));
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input")));
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSPaths.getElement("no_of_dependents_input"))
						.sendKeys(customerDetailsTestData.get("alphabet_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should not accept the alphabets in numeric field of customer address screen")
	public void user_076_verify_system_should_not_accept_the_alphabets_in_numeric_field_of_customer_address_screen()
			throws Throwable {

		String numericFieldData = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numericFieldData = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("no_of_dependents_input") + ".value")
						.toString();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(numericFieldData.length() <= 0, "no of dependent field is numeric but accept alphabets");

	}

	@Then("user_076 verify list view customer details record got updated with the new data")
	public void user_076_verify_list_view_customer_details_record_got_updated_with_the_new_data() throws Throwable {
		String listViewFirstName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewFirstName = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("customer_details_list_view_first_name"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(listViewFirstName, customerDetailsTestData.get("first_name"));
	}

	@And("user_076 click on back button of customer details record")
	public void user_076_click_on_back_button_of_customer_details_record() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify customer details list view record should be read only not editable")
	public void user_076_verify_customer_details_list_view_record_should_be_read_only_not_editable() throws Throwable {
		boolean status = false;

		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_list_view_record")).click();
			} catch (Exception e) {
				if (i == 20) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status);

	}

	@Then("user_076 verify system should navigate to previos screen of customer details")
	public void user_076_verify_system_should_navigate_to_previos_screen_of_customer_details() throws Throwable {
		String backButtonString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				backButtonString = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("customer_details_back_button_verification"))
						.toString();
				System.out.println(backButtonString);
				if (!(backButtonString.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(backButtonString, "Customer Personal Information", "Back button is not working");
	}

//	@And("user_076 click on back button of customer details record")
//	public void user_076_click_on_back_button_of_customer_details_record() throws Throwable {
//	   
//	    
//	}

	@And("user_076 search with matched text in customer details list view search")
	public void user_076_search_with_matched_text_in_customer_details_list_view_search() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_list_view_search_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_list_view_search_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_details_list_view_search_input"))
						.sendKeys(customerDetailsTestData.get("matched_search_text"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the matched result in customer details list view")
	public void user_076_verify_system_should_show_the_matched_result_in_customer_details_list_view() throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("customer_details_list_view_search_result"))
						.toString();
				if (!(searchResult.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
			softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
					"system is not showing the matched result");

			// Showing 0 to 0 of 0 entries
		}
	}

	@And("user_076 search with un matched text in customer details search grid")
	public void user_076_search_with_un_matched_text_in_customer_details_search_grid() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_list_view_search_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_details_list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_list_view_search_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSPaths.getElement("customer_details_list_view_search_input"))
						.sendKeys(customerDetailsTestData.get("unmatched_search_text"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should not show the search result of customer details list view")
	public void user_076_verify_system_should_not_show_the_search_result_of_customer_details_list_view()
			throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSPaths.getElement("customer_details_list_view_search_result"))
						.toString();
				if (!(searchResult.isBlank()) && i > 250) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
				"system is  showing the un matched result");

	}

	@And("user_076 click on export button in customer details list view")
	public void user_076_click_on_export_button_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_export_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on pdf export button in customer details list view")
	public void user_076_click_on_pdf_export_button_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_pdf_export_option")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should download the customer details record in PDF format")
	public void user_076_verify_system_should_download_the_customer_details_record_in_pdf_format() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xls export button in customer details list view")
	public void user_076_click_on_xls_export_button_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSPaths.getElement("customer_details_excel_export_option")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify list view of murabha customer details should be readonly field")
	public void user_076_verify_list_view_of_murabha_customer_details_should_be_readonly_field() throws Throwable {
		String listViewRecordLabels = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewRecordLabels = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("customer_details_list_view_record"))
						.toString();
				if (!(listViewRecordLabels.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(listViewRecordLabels.contains("First Name"), "First Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Middle Name"), "Middle Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Last Name"), "Last Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Family Name"), "Family Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Customer Type"),
				"Customer Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Applicant Type"),
				"Applicant Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Status"), "Status is not visible in list view");

	}

	@Then("user_076 verify list view of Tawruqq customer details should be readonly field")
	public void user_076_verify_list_view_of_Tawruqq_customer_details_should_be_readonly_field() throws Throwable {
		String listViewRecordLabels = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewRecordLabels = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSPaths.getElement("customer_details_list_view_record"))
						.toString();
				if (!(listViewRecordLabels.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(listViewRecordLabels.contains("First Name"), "First Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Middle Name"), "Middle Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Last Name"), "Last Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Family Name"), "Family Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Customer Type"),
				"Customer Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Applicant Type"),
				"Applicant Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Status"), "Status is not visible in list view");

	}

	@Then("user_076 verify system should download the customer details record in xls format")
	public void user_076_verify_system_should_download_the_customer_details_record_in_xls_format() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

}
