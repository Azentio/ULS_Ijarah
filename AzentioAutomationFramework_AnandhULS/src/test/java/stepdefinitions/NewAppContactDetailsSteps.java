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

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class NewAppContactDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String jsExcelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	JSPaths contactDetailsJSElements = new JSPaths(jsExcelPath, "NewApp_contactDetailsJS", "ContactDetails_JSElements",
			"JSPaths");
	JSPaths customerIdentificationDetailsElements = new JSPaths(jsExcelPath, "NewApp_IdentificationDetailsJS",
			"New_App_CustomerIdentificationDetailsElements", "JSPath");
	BrowserHelper browserHelper = new BrowserHelper(driver);
	// contactDetailsJSElements
	JSPaths commonJSElements = new JSPaths(jsExcelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ExcelData excelDataForContactDetails = new ExcelData(excelTestDataPath, "newApp_ContactDetailsTestData",
			"Dataset ID");
	ExcelData ijarahExecutionSheet = new ExcelData(excelTestDataPath, "Ijarah_ExecutionTracker", "TestCase ID");
	ExcelData murabahaExecutionSheet = new ExcelData(excelTestDataPath, "Murabaha_ExecutionTracker", "TestCase ID");
	ExcelData tawruqqExecutionSheet = new ExcelData(excelTestDataPath, "Tawruqq_ExecutionTracker", "TestCase ID");
	ExcelData excelDataForMurabahaContactDetails = new ExcelData(excelTestDataPath, "M_NewApp_CD_TestData",
			"Dataset ID");
	ExcelData excelDataForTawruqqContactDetails = new ExcelData(excelTestDataPath, "TW_ContDetails_TestData",
			"Dataset ID");
	Map<String, String> contactDetailsTestData = new HashMap<>();
	Map<String, String> contactDetailsExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	String listViewRecordStatus = "";
	String recordStatus = "";
	Robot robot;
	int indexOfListView;

	@And("user_076 get the test data for the test case ID AT_IJ_CD_NewApp_01")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_IJ_CD_NewApp_01() throws Throwable {
		contactDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_CD_NewApp_01");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForContactDetails.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_IJ_CD_NewApp_02")
	public void user_076_get_the_test_data_for_the_test_case_id_at_ij_cd_new_app_02() throws Throwable {

		contactDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_CD_NewApp_02");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForContactDetails.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_IJ_CD_NewApp_03")
	public void user_076_get_the_test_data_for_the_test_case_id_at_ij_cd_new_app_03() throws Throwable {

		contactDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_CD_NewApp_03");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForContactDetails.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_IJ_CD_NewApp_04")
	public void user_076_get_the_test_data_for_the_test_case_id_at_ij_cd_new_app_04() throws Throwable {

		contactDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_CD_NewApp_04");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForContactDetails.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_IJ_CD_NewApp_05")
	public void user_076_get_the_test_data_for_the_test_case_id_at_ij_cd_new_app_05() throws Throwable {

		contactDetailsExecutionData = ijarahExecutionSheet.getTestdata("AT_IJ_CD_NewApp_05");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForContactDetails.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_01")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_01() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_01");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	// AT_TW_NewApp_CD_01
	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_01")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_01() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_01");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_02")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_02() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_02");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_03")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_03() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_03");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_04")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_04() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_04");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_05")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_05() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_05");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_06")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_06() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_06");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_TW_NewApp_CD_07")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_TW_NewApp_CD_07() throws Throwable {
		contactDetailsExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_NewApp_CD_07");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForTawruqqContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_02")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_02() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_02");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_04")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_04() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_04");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_05")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_05() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_05");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_06")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_06() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_06");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_07")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_07() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_07");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_NewApp_M_CD_03")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_NewApp_M_CD_03() throws Throwable {
		contactDetailsExecutionData = murabahaExecutionSheet.getTestdata("AT_NewApp_M_CD_03");
		System.out.println(contactDetailsExecutionData.get("dataSet_ID"));
		contactDetailsTestData = excelDataForMurabahaContactDetails
				.getTestdata(contactDetailsExecutionData.get("dataSet_ID"));
	}

	@And("user_076 search the new application stage record for contact details screen")
	public void user_076_search_the_new_application_stage_record_for_contact_details_screen() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				System.out.println(configFileReader.getIjarahRecordReferenceNumber());
				searchTextBox.sendKeys(configFileReader.getIjarahRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 select the new application stage record for contact details screen")
	public void user_076_select_the_new_application_stage_record_for_contact_details_screen() throws Throwable {

		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 300; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
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
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]"));
						break;
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("user_076 verify contact details list view record should be read only not editable at new app stage")
	public void user_076_verify_contact_details_list_view_record_should_be_read_only_not_editable_at_new_app_stage()
			throws Throwable {

		boolean statusOfListViewRecord = false;
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		String listViewName = "";
		String noOfListView = "";
		boolean isIndexFound = false;
		for (int i = 0; i <= 300; i++) {
			try {
				noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
				if (noOfListView.equals("0") && !(noOfListView.isEmpty())) {
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
					if (listViewName.contains("Contact Details")) {

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

	@And("user_076 click on edit button in list view record of contact details in new app stage")
	public void user_076_click_on_edit_button_in_list_view_record_of_contact_details_in_new_app_stage()
			throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]').length";
		String listViewName = "";
		String noOfListView = "";
		boolean isIndexFound = false;
		for (int i = 0; i <= 300; i++) {
			try {
				noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
				if (noOfListView.equals("0") && !(noOfListView.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + i + "].innerText")
							.toString();
					if (listViewName.contains("Contact Details")) {

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
		for (int i = 0; i <= 600; i++) {
			try {
				if (i < 500) {
					clicksAndActionsHelper.clickUsingActionClass(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"), javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"));
					
				}
				if (i > 550 && i < 600) {
					clicksAndActionsHelper.clickUsingActionClass(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"), javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"));
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')")
							.click();

				}
				break;
			} catch (Exception e) {

				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the phone number in contact details list view record in new app stage")
	public void user_update_the_phone_number_in_contact_details_list_view_record_in_new_app_stage() throws Throwable {
		for (int i = 0; i < 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("phone number"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on save button after update the contact details in new app stage")
	public void user_click_on_save_button_after_update_the_contact_details_in_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the update successful popup while update the contact details record in new app stage")
	public void user_verify_system_should_show_the_update_successful_popup_while_update_the_contact_details_record_in_new_app_stage()
			throws Throwable {
		String savePopup = "";
		for (int i = 0; i <= 300; i++) {
			try {
				savePopup = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(savePopup.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(savePopup);
		// Success! Record created
		Assert.assertTrue(savePopup.contains("Success! Record updated"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonJSElements.getElement("toast_container_message_close_button")).click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 make phone number field as blank in contact details at new app stage")
	public void user_076_make_phone_number_field_as_blank_in_contact_details_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}
	}

	@And("user_076 click on add butto in contact details screen in new app stage")
	public void user_076_click_on_add_butto_in_contact_details_screen_in_new_app_stage() throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		System.out.println("");
		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 200) {
					System.out.println("Query " + labelLength);
					lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
					if (!(lengthOfTheLabel.isEmpty())) {
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
					if (!(labelName.isEmpty()) && (labelName.trim()).equalsIgnoreCase(("Contact Details").trim())) {

						System.out.println("Label Name " + labelName);
						if (i > 250) {
							clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
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

	@And("user_076 click on save button without enter the details in contact details screen in new app stage")
	public void user_076_click_on_save_button_without_enter_the_details_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		robot = new Robot();
		robot.mouseWheel(-500);
		for (int i = 0; i <= 300; i++) {
			try {
				robot.mouseWheel(-500);
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify contact details should show the mandatory field validation in new app stage")
	public void user_076_verify_contact_details_should_show_the_mandatory_field_validation_in_new_app_stage()
			throws Throwable {

		String mandatoryValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_message")).toString();
				if (!(mandatoryValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(mandatoryValidation);
		softAssert.assertEquals(mandatoryValidation, "Please fill all the details");

	}

	@And("user_076 enter the character input in phone numver field in contact details screen in new app stage")
	public void user_076_enter_the_character_input_in_phone_numver_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify phone number field should show the validation for character input in new app stage")
	public void user_076_verify_phone_number_field_should_show_the_validation_for_character_input_in_new_app_stage()
			throws Throwable {
		String fieldValidation = "";

		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number");
	}

	@And("user_076 enter the negative input in phone numver field in contact details screen in new app stage")
	public void user_076_enter_the_negative_input_in_phone_numver_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("invalid mobile number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify phone number field should show the validation for negative input in new app stage")
	public void user_076_verify_phone_number_field_should_show_the_validation_for_negative_input_in_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number");
	}

	@And("user_076 enter the special character input in phone numver field in contact details screen in new app stage")
	public void user_076_enter_the_special_character_input_in_phone_numver_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("special character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify phone number field should show the validation for special character input in new app stage")
	public void user_076_verify_phone_number_field_should_show_the_validation_for_special_character_input_in_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number");
	}

	@And("user_076 clear the email id field in contact details at new app stage")
	public void user_clear_the_email_id_field_in_contact_details_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@And("user_076 enter the invaid mail id input inemail id field in contact details screen in new app stage")
	public void user_076_enter_the_invaid_mail_id_input_inemail_id_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.sendKeys(contactDetailsTestData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify email id field should show the validation for invalid mail id input in new app stage")
	public void user_076_verify_email_id_field_should_show_the_validation_for_invalid_mail_id_input_in_new_app_stage()
			throws Throwable {

		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("email_id_field_validation"))
						.toString();
				if ((!fieldValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Email");
	}

	@Then("user_076 verify contact details screen should get open with save buttton and back button")
	public void user_076_verify_contact_details_screen_should_get_open_with_save_buttton_and_back_button()
			throws Throwable {
		boolean backButtonVerification = false;
		boolean saveButtonVerification = false;
		for (int i = 0; i <= 200; i++) {
			backButtonVerification = javascriptHelper
					.executeScriptWithWebElement(commonJSElements.getElement("back_button")).isDisplayed();

			if (backButtonVerification == true) {
				break;
			}
		}
		softAssert.assertTrue(backButtonVerification, "Back button is not visible hence failed");
		for (int i = 0; i <= 200; i++) {
			saveButtonVerification = javascriptHelper
					.executeScriptWithWebElement(commonJSElements.getElement("save_button")).isDisplayed();

			if (saveButtonVerification == true) {
				break;
			}
		}
		softAssert.assertTrue(saveButtonVerification, " Save button is not visible hence failed ");

	}

	@Then("user_076 verify phone type field should be editable numeric field at new app stage")
	public void user_076_verify_phone_type_field_should_be_editable_numeric_field_at_new_app_stage() throws Throwable {
		String fieldLevelVerification = "";
		System.out.println("Phone type dropdown " + contactDetailsJSElements.getElement("phone_type_dropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("phone type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));
		softAssert.fail("phone type is not a numeric field hence failed");

	}

	@Then("user_076 verify phone number field should be editable numeric field at new app stage")
	public void user_076_verify_phone_number_field_should_be_editable_numeric_field_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());

				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number",
				"Mobile number field is text input hence failed");
		for (int i = 0; i < 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("phone number"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify Consent for Phone Contact should be editable numeric at new app stage")
	public void user_076_verify_consent_for_phone_contact_should_be_editable_numeric_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("consent_for_phone_contact_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						contactDetailsJSElements.getElement("consent_for_phone_contact_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("consent for phone contact"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));
		softAssert.fail("consent for phone contact field is not a numeric field hence failed");
	}

	@Then("user_076 verify prefered phone contact type field should be editable email format at new app stage")
	public void user_076_verify_prefered_phone_contact_type_field_should_be_editable_email_format_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("prefered_phone_contact_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						contactDetailsJSElements.getElement("prefered_phone_contact_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("prefered phone contact type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));
		softAssert.fail("preferd phone contact type field is not a email type field hence failed");
	}

	@Then("user_076 verify prefered time for contact field should be editable number format at new app stage")
	public void user_076_verify_prefered_time_for_contact_field_should_be_editable_number_format_at_new_app_stage()
			throws Throwable {
		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						contactDetailsJSElements.getElement("prefered_time_for_contact_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("prefered_time_for_contact_input"))
						.sendKeys(contactDetailsTestData.get("prefered time for contact"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("prefered_time_for_contact_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));

	}

	@Then("user_076 verify email type field should be editable dropdown at new app stage")
	public void user_076_verify_email_type_field_should_be_editable_dropdown_at_new_app_stage() throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("email type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"), "Emai Type is not a dropdown hence failed");

	}

	@Then("user_076 verify email ID field should be number editable at new app stage")
	public void user_076_verify_email_id_field_should_be_number_editable_at_new_app_stage() throws Throwable {
		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.sendKeys(contactDetailsTestData.get("email id"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));
	}

	@And("user_076 click on save button in contact details screen at new app stage")
	public void user_click_on_save_button_in_contact_details_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 show the save successful pop up for contact details screen at new app stage")
	public void user_show_the_save_successful_pop_up_for_contact_details_screen_at_new_app_stage() throws Throwable {
		String savePopup = "";
		for (int i = 0; i <= 300; i++) {
			try {
				savePopup = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(savePopup.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(savePopup);
		// Success! Record created
		Assert.assertTrue(savePopup.contains("Success! Record created"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonJSElements.getElement("toast_container_message_close_button")).click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on toggle button and capture the status of cutact details record at new app stage")
	public void user_click_on_toggle_button_and_capture_the_status_of_cutact_details_record_at_new_app_stage()
			throws Throwable {
		String tempRecordStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				tempRecordStatus = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("contact_details_toggle_status"))
						.toString();
				if (!(tempRecordStatus.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("contact_details_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 3000; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("contact_details_toggle_status"))
						.toString();
				if (!(recordStatus.equals(tempRecordStatus))) {
					System.out.println("Temp Record Status " + tempRecordStatus);
					System.out.println("Record Status " + recordStatus);
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify contact details record status in list view at new app stage")
	public void user_verify_contact_details_record_status_in_list_view_at_new_app_stage() throws Throwable {

		System.out.println("Index value in list view record validation " + indexOfListView);

		for (int i = 0; i <= 500000; i++) {
			try {

				listViewRecordStatus = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
								+ indexOfListView
								+ "].querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
						.toString();
				System.out.println("List view Record status " + listViewRecordStatus);
				if (recordStatus.equals("true")) {
					System.out.println("Inside first condition " + recordStatus);
					if (listViewRecordStatus.equals("Active")) {
						System.out.println("Record status " + recordStatus);
						System.out.println("List view Record status " + listViewRecordStatus);
						break;
					}

				}
				if (recordStatus.equals("false")) {
					System.out.println("Inside first condition " + recordStatus);
					if (listViewRecordStatus.equals("In-active")) {
						System.out.println("Record status " + recordStatus);
						System.out.println("List view Record status " + listViewRecordStatus);
						break;
					}

				}

			} catch (Exception e) {
				if (i == 500000) {
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

	@And("user_076 click on edit button in contact details list view at new app stage")
	public void user_click_on_edit_button_in_contact_details_list_view_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {

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
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	////ion-col/*[starts-with(@class,'ng-untouched')]

	@And("user_076 phone type field should be editable dropdown in contact details screen at new app stage")
	public void user_076_phone_type_field_should_be_editable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		System.out.println("Phone type dropdown " + contactDetailsJSElements.getElement("phone_type_dropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("phone type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));

	}

	@And("user_076 phone number field should be editable number field in contact details screen at new app stage")
	public void user_076_phone_number_field_should_be_editable_number_field_in_contact_details_screen_at_new_app_stage()
			throws Throwable {

		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + contactDetailsJSElements.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());

				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number",
				"Mobile number field is text input hence failed");
		for (int i = 0; i < 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("phone number"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 consent for phone contact should be editable dropdown in contact details screen at new app stage")
	public void user_076_consent_for_phone_contact_should_be_editable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("consent_for_phone_contact_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						contactDetailsJSElements.getElement("consent_for_phone_contact_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("consent for phone contact"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"),
				"consent for phone contact field is not a dropdown hence failed");

	}

	@And("user_076 prefered phone contact type field should be ditable dropdown in contact details screen at new app stage")
	public void user_076_prefered_phone_contact_type_field_should_be_ditable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("prefered_phone_contact_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						contactDetailsJSElements.getElement("prefered_phone_contact_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("prefered phone contact type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"),
				"Prefered phone contact type is not a dropdown its failed");

	}

	@And("user_076 prefered time for contact field shoule be editable field type should be HH MM type in contact details screen at new app stage")
	public void user_076_prefered_time_for_contact_field_shoule_be_editable_field_type_should_be_hh_mm_type_in_contact_details_screen_at_new_app_stage()
			throws Throwable {

		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						contactDetailsJSElements.getElement("prefered_time_for_contact_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("prefered_time_for_contact_input"))
						.sendKeys(contactDetailsTestData.get("prefered time for contact"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(
								contactDetailsJSElements.getElement("prefered_time_for_contact_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));
	}

	@And("user_076 email type field should be editable dropdown in contact details screen at new app stage")
	public void user_076_email_type_field_should_be_editable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(contactDetailsTestData.get("email type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"), "Emai Type is not a dropdown hence failed");

	}

	@And("user_076 email ID field should be editable emial iD field in contact details screen at new app stage")
	public void user_076_email_id_field_should_be_editable_emial_i_d_field_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.sendKeys(contactDetailsTestData.get("email id"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJSElements.getElement("email_input_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));

	}

	@And("user_076 enter the negative input in phone number field in contact details screen in new app stage")
	public void user_076_enter_the_negative_input_in_phone_number_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(contactDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(contactDetailsTestData.get("invalid mobile number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on export button in contact details list view at new app stage")
	public void user_076_click_on_export_button_in_contact_details_list_view_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				if (i < 250) {

					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
							.click();
					break;
				}
				if (i > 250) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')"));
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
							.click();
					break;
				}

			} catch (Exception e) {

				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("user_076 click on pdf options in contact details export option at new app stage")
	public void user_076_click_on_pdf_options_in_contact_details_export_option_at_new_app_stage() throws Throwable {
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

	@Then("user_076 verify contact details pdf file should download in new app stage")
	public void user_076_verify_contact_details_pdf_file_should_download_in_new_app_stage() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerIdentificationDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xlsx options in contact details export option at new app stage")
	public void user_076_click_on_xlsx_options_in_contact_details_export_option_at_new_app_stage() throws Throwable {
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

	@Then("user_076 verify contact details xlsx file should download in new app stage")
	public void user_076_verify_contact_details_xlsx_file_should_download_in_new_app_stage() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerIdentificationDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("user_076 click on contact details list view search button at new app stage")
	public void user_076_click_on_contact_details_list_view_search_button_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-search\"]')")
						.click();
				break;

			} catch (Exception e) {
				if (i > 250 && i < 300) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('button[icon=\"pi pi-search\"]')"));
				}
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 search the matched test in contact details list view at new app stage")
	public void user_076_search_the_matched_test_in_contact_details_list_view_at_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("list_view_search_input_box"))
						.sendKeys(contactDetailsTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify contact details list view should show the matched results at new app stage")
	public void user_076_verify_contact_details_list_view_should_show_the_matched_results_at_new_app_stage()
			throws Throwable {
		String searchResult = "";

		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 200) {
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

	@And("user_076 search the unmatched test in contact details list view at new app stage")
	public void user_076_search_the_unmatched_test_in_contact_details_list_view_at_new_app_stage() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("list_view_search_input_box"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("list_view_search_input_box"))
						.sendKeys(contactDetailsTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify contact details list view should show the unmatched results at new app stage")
	public void user_076_verify_contact_details_list_view_should_show_the_unmatched_results_at_new_app_stage()
			throws Throwable {
		String searchResult = "";
		System.out.println("Index is " + indexOfListView);
		Thread.sleep(500);
		for (int i = 0; i <= 60000; i++) {
			try {
				if (i > 50000) {

					searchResult = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView
									+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
							.toString();
					break;
				}

			} catch (Exception e) {

				if (i == 60000) {
					Assert.fail(e.getMessage());
				}

			}
		}
		System.out.println(searchResult);

		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries");

	}

	@And("user_076 click on back button in contact details screen at new app stage")
	public void user_076_click_on_back_button_in_contact_details_screen_at_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify contact details screen should get moved to backward at new app stage")
	public void user_076_verify_contact_details_screen_should_get_moved_to_backward_at_new_app_stage()
			throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		boolean addButtonStatus = false;
		System.out.println("");
		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 200) {
					System.out.println("Query " + labelLength);
					lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
					if (!(lengthOfTheLabel.isEmpty())) {
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
					if (!(labelName.isEmpty()) && (labelName.trim()).equalsIgnoreCase(("Contact Details").trim())) {

						System.out.println("Label Name " + labelName);
						if (i > 250) {
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}

						addButtonStatus = javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]")
								.isDisplayed();

						if (addButtonStatus == true) {

							isAddButttonClicked = true;

							break;
						}
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
		softAssert.assertTrue(addButtonStatus, "Back Button is not working");
	}

	@And("user_076 invoke softAssert in contac details new new app stage")
	public void user_076_invoke_soft_assert_in_contac_details_new_new_app_stage() throws Throwable {
		softAssert.assertAll();
	}

}
