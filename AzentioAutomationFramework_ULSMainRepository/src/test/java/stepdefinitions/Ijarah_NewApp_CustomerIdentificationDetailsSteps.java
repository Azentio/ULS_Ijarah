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

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijarah_NewApp_CustomerIdentificationDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	String excelJSPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelCustomerIdentificationTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	JSPaths commonJSElements = new JSPaths(excelJSPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths customerIdentificationDetailsElements = new JSPaths(excelJSPath, "NewApp_IdentificationDetailsJS",
			"New_App_CustomerIdentificationDetailsElements", "JSPath");
	ExcelData excelCustomerIdentificationTestData = new ExcelData(excelCustomerIdentificationTestDataPath,
			"customer_I_Details_NewApp", "Dataset ID");
	ExcelData excelCustomerIdentificationMurabhaTestData = new ExcelData(excelCustomerIdentificationTestDataPath,
			"M_NewAppIDEDetails_TestData", "Dataset ID");
	ExcelData excelCustomerIdentificationExecutionData = new ExcelData(excelCustomerIdentificationTestDataPath,
			"newApp_identificationExetracker", "TestCase ID");
	ExcelData excelCustomerIdentificationMurabhaExecutionData = new ExcelData(excelCustomerIdentificationTestDataPath,
			"M_NewAppIDEDetails_ExeTrack", "TestCase ID");
	Map<String, String> customerIdentificationDetailsTestData = new HashMap<>();
	Map<String, String> customerIdentificationDetailsExecutionData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	int indexOfListView = 0;
	String listViewIDNumber = "";
	Robot robot;

	SoftAssert softAssert = new SoftAssert();

	@And("user_076 get the test data for test case id AT_IJ_NewApp_IDA_01")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_new_app_ida_01() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationExecutionData
				.getTestdata("AT_IJ_NewApp_IDA_01");
		customerIdentificationDetailsTestData = excelCustomerIdentificationTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_01")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_01() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_01");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_02")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_02() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_02");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_03")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_03() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_03");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_04")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_04() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_04");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_05")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_05() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_05");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_06")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_06() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_06");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_NewAPP_M_IDA_07")
	public void user_076_get_the_test_data_for_test_case_id_AT_NewAPP_M_IDA_07() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationMurabhaExecutionData
				.getTestdata("AT_NewAPP_M_IDA_07");
		customerIdentificationDetailsTestData = excelCustomerIdentificationMurabhaTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_IJ_NewApp_IDA_02")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_new_app_ida_02() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationExecutionData
				.getTestdata("AT_IJ_NewApp_IDA_02");
		customerIdentificationDetailsTestData = excelCustomerIdentificationTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_IJ_NewApp_IDA_03")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_new_app_ida_03() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationExecutionData
				.getTestdata("AT_IJ_NewApp_IDA_03");
		customerIdentificationDetailsTestData = excelCustomerIdentificationTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_IJ_NewApp_IDA_04")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_new_app_ida_04() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationExecutionData
				.getTestdata("AT_IJ_NewApp_IDA_04");
		customerIdentificationDetailsTestData = excelCustomerIdentificationTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_IJ_NewApp_IDA_05")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_new_app_ida_05() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationExecutionData
				.getTestdata("AT_IJ_NewApp_IDA_05");
		customerIdentificationDetailsTestData = excelCustomerIdentificationTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 get the test data for test case id AT_IJ_NewApp_IDA_06")
	public void user_076_get_the_test_data_for_test_case_id_at_ij_new_app_ida_06() throws Throwable {
		customerIdentificationDetailsExecutionData = excelCustomerIdentificationExecutionData
				.getTestdata("AT_IJ_NewApp_IDA_06");
		customerIdentificationDetailsTestData = excelCustomerIdentificationTestData
				.getTestdata(customerIdentificationDetailsExecutionData.get("dataSet_ID"));

	}

	@And("user_076 search the new application stage customer identification details record reference number")
	public void user_076_search_the_new_application_stage_customer_identification_details_record_reference_number()
			throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(customerIdentificationDetailsTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the new application stage customer identification details record from mail box")
	public void user_076_select_the_new_application_stage_customer_identification_details_record_from_mail_box()
			throws Throwable {
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
					if (recordRefNumber.equals(customerIdentificationDetailsTestData.get("record_reference_number"))) {
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

	@And("user_076 click on additional customer info tab in new application stage")
	public void user_076_click_on_additional_customer_info_tab_in_new_application_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("additional_customer_info_tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on edit button customer personal information screen at new app stage")
	public void user_076_click_on_edit_button_customer_personal_information_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("customer_personal_information_edit_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should change the identification record status active and in active at new app stage")
	public void user_076_verify_system_should_change_the_identification_record_status_active_and_in_active_at_new_app_stage()
			throws Throwable {
		String recordStatus = "";
		String listViewRecordStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerIdentificationDetailsElements
						.getElement("customer_identification_details_status_toggle_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		for (int i = 0; i <= 3000; i++) {
			try {
				if (i > 2500) {
					recordStatus = javascriptHelper.executeScript("return " + customerIdentificationDetailsElements
							.getElement("customer_identification_details_record_status")).toString();
					System.out.println("Record status " + recordStatus);
					if (!(recordStatus.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		robot = new Robot();

		for (int i = 0; i <= 300; i++) {
			try {
				robot.mouseWheel(-200);
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		for (int i = 0; i <= 3000; i++) {
			try {
				if (i > 2500) {
					listViewRecordStatus = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('p-tag span').innerText")
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

	@And("user_076 click on add button in customer identification screen")
	public void user_076_click_on_add_button_in_customer_identification_screen() throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		for (int i = 0; i <= 200; i++) {
			try {
				lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
				if (!(lengthOfTheLabel.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
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
					if (!(labelName.isBlank())
							&& (labelName.trim()).equalsIgnoreCase(("Customer Identification").trim())) {
						if (j > 250) {
							System.out.println("Inside final if condition");
							javascriptHelper.scrollDownVertically();
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[ng-reflect-icon=\"pi pi-plus\"]')"));
						}
						System.out.println("Inside final if condition");
						System.out.println("Label Name " + labelName);
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]").click();
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
		if (isAddButttonClicked == false) {
			Assert.fail("Add button is not clicked hence test case failed");
		}
	}

	@Then("user_076 verify customer identification screen should get open with save and back button in new app stage")
	public void user_076_verify_customer_identification_screen_should_get_open_with_save_and_back_button_in_new_app_stage()
			throws Throwable {
		boolean saveButtonStatus = false;
		boolean backButtonStatus = false;
		for (int i = 0; i <= 60; i++) {
			try {
				saveButtonStatus = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("save_button")).isDisplayed();
				if (saveButtonStatus == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 60; i++) {
			try {
				backButtonStatus = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("back_button")).isDisplayed();
				if (backButtonStatus == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

	@Then("user_076 verify id type field should be editable mandatory dropdown")
	public void user_076_verify_id_type_field_should_be_editable_mandatory_dropdown() throws Throwable {
		String idTypeMandatoryAttribute = "";
		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				idTypeMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_type_dropdown"))
						.getAttribute("aria-label");

				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(idTypeMandatoryAttribute.isBlank()) && !(fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldValidation.contains("Select"), "ID Type field is not a dropdown hence failed");
		softAssert.assertTrue(idTypeMandatoryAttribute.contains("*"),
				"ID tyep field is non mandatory field hence failed ");
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("id_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerIdentificationDetailsTestData.get("id_type"));

	}

	@Then("user_076 verify id number field should be editable mandatory numeric field")
	public void user_076_verify_id_number_field_should_be_editable_mandatory_numeric_field() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerIdentificationDetailsElements.getElement("id_nummber_mandatory_verification"))
						.toString();
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.getAttribute("type");
				if (!(mandatoryVerification.isBlank()) && !(fieldTypeVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"), " ID Number field is non mandatory hence failed");
		softAssert.assertTrue(fieldTypeVerification.contains("number"),
				" ID Number field is not a numeric field hence failed");

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(customerIdentificationDetailsTestData.get("id_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify id issue date field should be editable non mandatiry mandatory calendar field")
	public void user_076_verify_id_issue_date_field_should_be_editable_non_mandatiry_mandatory_calendar_field()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {

				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerIdentificationDetailsElements.getElement("issue_date_mandatory_verification"))
						.toString();
				fieldTypeVerification = javascriptHelper
						.executeScript("return "
								+ customerIdentificationDetailsElements.getElement("date_of_issue_field_validation"))
						.toString();

				if (!(mandatoryVerification.isBlank()) && !(fieldTypeVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" ID issue data field is mandatory field hence failed ");
		softAssert.assertTrue(fieldTypeVerification.contains("dd-M-yy"),
				" issue data field is not a calendar field hence failed ");
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("date_of_issue_input_box")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify id expairy date field should be editable non mandatiry mandatory calendar field")
	public void user_076_verify_id_expairy_date_field_should_be_editable_non_mandatiry_mandatory_calendar_field()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper.executeScript("return "
						+ customerIdentificationDetailsElements.getElement("date_of_expiry_mandatory_verification"))
						.toString();
				fieldTypeVerification = javascriptHelper
						.executeScript("return "
								+ customerIdentificationDetailsElements.getElement("date_of_expiry_field_validation"))
						.toString();
				if (!(mandatoryVerification.isBlank()) && !(fieldTypeVerification.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" date of expiry field is mandatory field hence failed ");
		softAssert.assertTrue(fieldTypeVerification.contains("dd-M-yy"),
				"  date of expiry field is not a calendar field hence failed ");
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("date_of_expiry_input_box")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify issuing authority field should be editable non mandatory dropdown")
	public void user_076_verify_issuing_authority_field_should_be_editable_non_mandatory_dropdown() throws Throwable {
		String idTypeMandatoryAttribute = "";
		String fieldType = "";
		for (int i = 0; i <= 300; i++) {
			try {
				idTypeMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("Issuing_Authority_dropdown"))
						.getAttribute("aria-label");
				fieldType = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("Issuing_Authority_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(idTypeMandatoryAttribute.isBlank()) && !(fieldType.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(idTypeMandatoryAttribute.contains("*")),
				"Issuing authority field is mandatory field hence failed ");
		softAssert.assertTrue(fieldType.contains("Select"), "Issue Authority field is not a dropdown hence failed");
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("Issuing_Authority_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerIdentificationDetailsTestData.get("issue_authority"));
	}

	@Then("user_076 verify country of issue field should be editable non mandatory dropdown")
	public void user_076_verify_country_of_issue_field_should_be_editable_non_mandatory_dropdown() throws Throwable {
		String idTypeMandatoryAttribute = "";
		String fieldType = "";

		for (int i = 0; i <= 300; i++) {
			try {
				idTypeMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("country_of_issue_dropdown"))
						.getAttribute("aria-label");
				fieldType = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("Issuing_Authority_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(idTypeMandatoryAttribute.isBlank()) && !(fieldType.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(idTypeMandatoryAttribute.contains("*")),
				"country of issue field is mandatory field hence failed ");
		softAssert.assertTrue(fieldType.contains("Select"), "country of issue field is not a dropdown hence failed");
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("country_of_issue_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerIdentificationDetailsTestData.get("country_of_issue"));
	}

	@Then("user_076 verify primary ID flag field should be toggle buttton")
	public void user_076_verify_primary_id_flag_field_should_be_toggle_buttton() throws Throwable {
		String toggleVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("primary_id_flag_toggle_button"))
						.getAttribute("role");

				if (!(toggleVerification.isBlank())) {
					System.out.println("Toggle verification is " + toggleVerification);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toggleVerification.contains("switch"), "Primary ID field is not a toggle hence failed");
	}

	@And("user_076 click on save button in customer identification details of new app stage")
	public void user_076_click_on_save_button_in_customer_identification_details_of_new_app_stage() throws Throwable {
		robot = new Robot();

		for (int i = 0; i <= 300; i++) {
			try {
				robot.mouseWheel(-200);
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 system should show the success pop up for identification details saved record in new app stage")
	public void user_076_system_should_show_the_success_pop_up_for_identification_details_saved_record_in_new_app_stage()
			throws Throwable {
		String saveVaidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				saveVaidation = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(saveVaidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300)

				{
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveVaidation);
		Assert.assertTrue(saveVaidation.contains("Success! Record created"));
	}

	@And("user_076 click on save button customer identification details screen without enter the mandatory details at new app stage")
	public void user_076_click_on_save_button_customer_identification_details_screen_without_enter_the_mandatory_details_at_new_app_stage()
			throws Throwable {
		robot = new Robot();
		for (int i = 0; i <= 200; i++) {
			try {
				robot.mouseWheel(-200);
				System.out.println(commonJSElements.getElement("save_button"));
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the validation to fill the mandatory details in customer identification screen at new app stage")
	public void user_076_verify_system_should_show_the_validation_to_fill_the_mandatory_details_in_customer_identification_screen_at_new_app_stage()
			throws Throwable {
		String mandatoryValidationPopup = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryValidationPopup = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_message")).toString();
				if (!(mandatoryValidationPopup.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(mandatoryValidationPopup);
		softAssert.assertEquals(mandatoryValidationPopup, "Please fill all the details",
				"System is not showing the validation pop up");

	}

	@And("user_076 enter the special character input in id number field")
	public void user_076_enter_the_special_character_input_in_id_number_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(customerIdentificationDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the validation for the id number field at new app stage")
	public void user_076_verify_system_should_show_the_validation_for_the_id_number_field_at_new_app_stage()
			throws Throwable {
		String idNumberFieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				idNumberFieldValidation = javascriptHelper
						.executeScript("return "
								+ customerIdentificationDetailsElements.getElement("id_number_field_level_validation"))
						.toString();
				if (!(idNumberFieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(idNumberFieldValidation);
		softAssert.assertEquals(idNumberFieldValidation, "Only Alphanumeric characters are allowed",
				" id number field not showing the validation hence failed ");
	}

	@And("user_076 enter the character input in ID number field")
	public void user_076_enter_the_character_input_in_id_number_field() throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(customerIdentificationDetailsTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system wont allow user to enter the character input in ID number field at new app stage")
	public void user_076_verify_system_wont_allow_user_to_enter_the_character_input_in_id_number_field_at_new_app_stage()
			throws Throwable {
		String idNumberFieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				idNumberFieldValidation = javascriptHelper
						.executeScript("return "
								+ customerIdentificationDetailsElements.getElement("id_number_get_field_value"))
						.toString();
				if (!(idNumberFieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(idNumberFieldValidation);
		softAssert.assertTrue((idNumberFieldValidation.length() == 0),
				"id number field accepting character inputs hence failed");
	}

	@And("user_076 click on edit button of customer identification details list view record")
	public void user_076_click_on_edit_button_of_customer_identification_details_list_view_record() throws Throwable {
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
					if (listViewName.contains("Customer Identification")) {

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
				System.out
						.println("document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')");
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')")
						.click();

				break;
			} catch (Exception e) {
				if (i > 550 && i < 600) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')"));
				}
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelectorAll('td span')[7].innerText

	}

	@And("user_076 click on edit button of the list view record of customer identification at new app stage")
	public void user_076_click_on_edit_button_of_the_list_view_record_of_customer_identification_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				System.out
						.println("document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')");
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')")
						.click();

				break;
			} catch (Exception e) {
				if (i > 550 && i < 600) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')"));
				}
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on view summary button in identification new app stage record")
	public void user_076_click_on_view_summary_button_in_identification_new_app_stage_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("identification_details_view_summary_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the record summary of identification at new app stage")
	public void user_076_verify_system_should_show_the_record_summary_of_identification_at_new_app_stage()
			throws Throwable {
		boolean statusOfViewSummaryButtton = false;
		for (int i = 0; i <= 300; i++) {
			try {
				statusOfViewSummaryButtton = javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("identification_details_view_summary_button"))
						.isDisplayed();
				if (statusOfViewSummaryButtton == true) {
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
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("view_summary_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 update the id number field in identification detais record at new app stage")
	public void user_076_update_the_id_number_field_in_identification_detais_record_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(customerIdentificationDetailsTestData.get("id_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify system should show the successful update pop up in identification details screen at new appp stage")
	public void user_076_verify_system_should_show_the_successful_update_pop_up_in_identification_details_screen_at_new_appp_stage()
			throws Throwable {
		String saveVaidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				saveVaidation = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(saveVaidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300)

				{
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveVaidation);
		Assert.assertTrue(saveVaidation.contains("Success! Record updated"));
	}

	@And("user_076 get the list view record of customer identification at new app stage")
	public void user_076_get_the_list_view_record_of_customer_identification_at_new_app_stage() throws Throwable {
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelectorAll('td span')[7].innerText
		listViewIDNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewIDNumber = javascriptHelper.executeScript(
						"return  document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelectorAll('td span')[7].innerText")
						.toString();
				if (!(listViewIDNumber.isBlank())) {
					System.out.println("ID number from list view is " + listViewIDNumber);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 remove the mandatory details value from customer identification details of updated record at new app stage")
	public void user_076_remove_the_mandatory_details_value_from_customer_identification_details_of_updated_record_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("id_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@Then("user_076 verify system should show the updated value in identification details at new app stage")
	public void user_076_verify_system_should_show_the_updated_value_in_identification_details_at_new_app_stage()
			throws Throwable {
		int lenthOfIDNumber = listViewIDNumber.length();
		System.out.println("ID Number Length " + lenthOfIDNumber);
		System.out.println("List View ID Number " + listViewIDNumber);

		System.out.println("List View Sub String " + listViewIDNumber.substring(8, lenthOfIDNumber));
		System.out.println("Map Data SubString " + customerIdentificationDetailsTestData.get("id_number").substring(8,
				customerIdentificationDetailsTestData.get("id_number").length()));
		Assert.assertEquals(listViewIDNumber.substring(8, lenthOfIDNumber), customerIdentificationDetailsTestData
				.get("id_number").substring(8, customerIdentificationDetailsTestData.get("id_number").length()));

	}

	@And("user_076 verify identification list view record should be read only not editable at new app stage")
	public void user_076_verify_identification_list_view_record_should_be_read_only_not_editable_at_new_app_stage()
			throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelector('button[icon="pi pi-pencil"')
		boolean statusOfListViewRecord = false;
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
					if (listViewName.contains("Customer Identification")) {

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
		if (isIndexFound == false) {
			Assert.fail("Customer Identification index is not visible henece failed");
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

				e.printStackTrace();
				if (i == 50) {
					statusOfListViewRecord = true;
				}
			}
		}
		System.out.println(statusOfListViewRecord);
		Assert.assertTrue(statusOfListViewRecord);
	}

	@And("user_076 click on search button in customer identification details list view at new app stage")
	public void user_076_click_on_search_button_in_customer_identification_details_list_view_at_new_app_stage()
			throws Throwable {
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
					if (listViewName.contains("Customer Identification")) {

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

	@And("user_076 search for valid search text in customer identification details list view at new app stage")
	public void user_076_search_for_valid_search_text_in_customer_identification_details_list_view_at_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerIdentificationDetailsElements.getElement("list_view_search_input_box")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerIdentificationDetailsElements.getElement("list_view_search_input_box"))
						.sendKeys(customerIdentificationDetailsTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 system should show the search result in customer identification details list view at new app stage")
	public void user_076_system_should_show_the_search_result_in_customer_identification_details_list_view_at_new_app_stage()
			throws Throwable {
//document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')[0].querySelector('span[class="p-paginator-current ng-star-inserted"]').innerText
//Showing 0 to 0 of 0 entries
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

	@And("user_076 search for in valid search text in customer identification details list view at new app stage")
	public void user_076_search_for_in_valid_search_text_in_customer_identification_details_list_view_at_new_app_stage()
			throws Throwable {
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
						.sendKeys(customerIdentificationDetailsTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 system should not show the search result in customer identification details list view at new app stage")
	public void user_076_system_should_not_show_the_search_result_in_customer_identification_details_list_view_at_new_app_stage()
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

	@And("user_076 click on export button in customer identification details list view")
	public void user_076_click_on_export_button_in_customer_identification_details_list_view() throws Throwable {
//document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md hydrated"]')[1].querySelector('div[aria-label="dropdown trigger"]')
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(
								"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
										+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
						.click();
				break;

			} catch (Exception e) {

				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("user_076 click on pdf export of customer identification details in new app stage")
	public void user_076_click_on_pdf_export_of_customer_identification_details_in_new_app_stage() throws Throwable {
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

	@Then("user_076 verify in new app stage system is downloading the customer identification pdf file")
	public void user_076_verify_in_new_app_stage_system_is_downloading_the_customer_identification_pdf_file()
			throws Throwable {
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
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerIdentificationDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xls export of customer identification details in new app stage")
	public void user_076_click_on_xls_export_of_customer_identification_details_in_new_app_stage() throws Throwable {
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

	@Then("user_076 verify in new app stage system is downloading the customer identification xls file")
	public void user_076_verify_in_new_app_stage_system_is_downloading_the_customer_identification_xls_file()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerIdentificationDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerIdentificationDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("user_076 click on back button in customer identification details in new app stage")
	public void user_076_click_on_back_button_in_customer_identification_details_in_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				clicksAndActionsHelper.moveToElement(
						javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")));
				clicksAndActionsHelper.clickUsingActionClass(
						javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")),
						javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify identififcation details screen got move backward to previos screen at new app stage")
	public void user_076_verify_identififcation_details_screen_got_move_backward_to_previos_screen_at_new_app_stage()
			throws Throwable {

		boolean flag = false;
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		for (int i = 0; i <= 200; i++) {
			try {
				lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
				if (!(lengthOfTheLabel.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
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
					if (!(labelName.isBlank())
							&& (labelName.trim()).equalsIgnoreCase(("Customer Identification").trim())) {
						if (i > 250) {
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[ng-reflect-icon=\"pi pi-plus\"]')")
									.sendKeys(Keys.PAGE_DOWN);
							flag = javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]")
									.isDisplayed();
						}
						System.out.println("Label Name " + labelName);
						flag = javascriptHelper
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
		softAssert.assertTrue(flag, " Back buton not working");
	}

	@And("user_076 get the location of identification details list view at new app stage")
	public void user_076_get_the_location_of_identification_details_list_view_at_new_app_stage() throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelector('button[icon="pi pi-pencil"')
		boolean statusOfListViewRecord = false;
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
					if (listViewName.contains("Customer Identification")) {

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
		if (isIndexFound == false) {
			Assert.fail("Customer Identification index is not visible henece failed");
		}
	}

	@And("user_076 click on export button in identification details list view at new app stage")
	public void user_076_click_on_export_button_in_identification_details_list_view_at_new_app_stage()
			throws Throwable {
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
											customerIdentificationDetailsElements.getElement("additional_customer_info_tab")).sendKeys(Keys.PAGE_DOWN);
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

	@And("user_076 click on pdf export in indetification list view at new app stage")
	public void user_076_click_on_pdf_export_in_indetification_list_view_at_new_app_stage() throws Throwable {
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

	@Then("user_076 verify system should download the pdf file of identification details record in new app stage")
	public void user_076_verify_system_should_download_the_pdf_file_of_identification_details_record_in_new_app_stage()
			throws Throwable {
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
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerIdentificationDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xlsx export in indetification list view at new app stage")
	public void user_076_click_on_xlsx_export_in_indetification_list_view_at_new_app_stage() throws Throwable {
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

	@And("user_076 verify system should download the xlsx file of identification details record in new app stage")
	public void user_076_verify_system_should_download_the_xlsx_file_of_identification_details_record_in_new_app_stage()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerIdentificationDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerIdentificationDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("user_076 invoke soft asset in customer identification details screen at new app stage")
	public void user_076_invoke_soft_asset_in_customer_identification_details_screen_at_new_app_stage()
			throws Throwable {
		softAssert.assertAll();
	}

}
