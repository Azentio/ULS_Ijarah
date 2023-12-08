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
import io.cucumber.java.en.When;
import pageobjects.JSPaths;
import resources.BaseClass;

public class NewApp_CustomerReferenceListViewSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String eexcelJSpath = configFileReader.getJSFilePath();
	String jrahaTestDataPath = configFileReader.getIjarahTestDataFilePath();
	String murabahaTestDataPath = configFileReader.getMurabahaTestDataFilePath();
	String tawruqqTestDataPath = configFileReader.getTawruqqTestDataFilePath();
	JSPaths customerReferenceJsPaths = new JSPaths(eexcelJSpath, "NewApp_ReferenceListViewJS",
			"ReferenceListViewElementsName", "JSPaths");
	ExcelData excelTestDataForCustomerReference = new ExcelData(murabahaTestDataPath, "M_NewApp_CustRef_TestData",
			"Dataset ID");
	ExcelData excelTestDataForIjarahCustomerReference = new ExcelData(jrahaTestDataPath, "IJ_NewApp_CustRef_TestData",
			"Dataset ID");
	ExcelData IjarahExecution = new ExcelData(jrahaTestDataPath, "Ijarah_ExecutionTracker",
			"TestCase ID");
	ExcelData MurabahaExecution = new ExcelData(murabahaTestDataPath, "Murabaha_ExecutionTracker",
			"TestCase ID");
	Map<String, String> customerReferenceTestData = new HashMap<>();
	Map<String, String> customerReferenceExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths CommonJSElements = new JSPaths(eexcelJSpath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	String customerReferenceRecordStatus = "";
	int indexOfListView;

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_01")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_01() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_01");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_01")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_01() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_01");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_02")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_02() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_02");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_03")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_03() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_01");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_04")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_04() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_04");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_05")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_05() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_05");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_06")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_06() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_06");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	@And("user_076 get the test data for test case id AT_IJ_NewApp_CR_07")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_IJ_NewApp_CR_07() throws Throwable {
		customerReferenceExecutionData = IjarahExecution.getTestdata("AT_IJ_NewApp_CR_07");
		customerReferenceTestData = excelTestDataForIjarahCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}
	

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_02")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_02() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_02");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_03")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_03() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_03");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_04")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_04() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_04");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_05")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_05() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_05");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_06")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_06() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_06");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_NewApp_M_CR_07")
	public void user_076_076_076_076_get_the_test_data_for_test_case_id_AT_NewApp_M_CR_07() throws Throwable {
		customerReferenceExecutionData = MurabahaExecution.getTestdata("AT_NewApp_M_CR_07");
		customerReferenceTestData = excelTestDataForCustomerReference
				.getTestdata(customerReferenceExecutionData.get("dataSet_ID"));
	}

	@And("user_076 search the new application stage customer reference record reference number")
	public void user_076_076_076_search_the_new_application_stage_customer_reference_record_reference_number()
			throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(customerReferenceTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the new application stage customer reference record from mail box")
	public void user_076_076_076_select_the_new_application_stage_customer_reference_record_from_mail_box()
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
					if (recordRefNumber.equals(customerReferenceTestData.get("record_reference_number"))) {
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

	@And("user_076 click on add button in customer reference list view in new app stage")
	public void user_076_076_076_click_on_add_button_in_customer_reference_list_view_in_new_app_stage()
			throws Throwable {
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
			for (int j = 0; j <= 1000; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isBlank())
							&& (labelName.trim()).equalsIgnoreCase(("References List View").trim())) {
						if (j > 250) {
							clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}
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
					if (j == 1000) {
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

	@Then("user_076 verify customer reference screen should get open with save and back button at new app stage")
	public void user_076_076_076_verify_customer_reference_screen_should_get_open_with_save_and_back_button_at_new_app_stage()
			throws Throwable {
		boolean statusOfSaveButton = false;
		boolean statusOfBackButton = false;
		for (int i = 0; i <= 150; i++) {
			try {
				statusOfSaveButton = javascriptHelper
						.executeScriptWithWebElement(CommonJSElements.getElement("save_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				statusOfBackButton = javascriptHelper
						.executeScriptWithWebElement(CommonJSElements.getElement("back_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(statusOfSaveButton, "Save Button is not visible hence failed");
		softAssert.assertTrue(statusOfBackButton, "Back Button is not visible hence failed");

	}

	@And("user_076 verify relation ship type field should be non mandatory editable dropdown at new app stage")
	public void user_076_076_076_verify_relation_ship_type_field_should_be_non_mandatory_editable_dropdown_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("relationship_type_dropdown"))
						.getAttribute("aria-label");
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("relationship_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isBlank()) && !(fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Field validation " + fieldValidation);
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"relationship field should be non mandatory but in application screen its mandatory");
		softAssert.assertTrue(fieldValidation.contains("Select"), "relationship field is not a dropdown hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("relationship_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerReferenceTestData.get("Relationship_type"));

	}

	@And("user_076 verify salutation field should be mandatory editable dropdown at new app stgae")
	public void user_076_076_076_verify_salutation_field_should_be_mandatory_editable_dropdown_at_new_app_stgae()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("salutation_dropdown"))
						.getAttribute("aria-label");
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("salutation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isBlank()) && !(fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"salutation field should be mandatory but in application screen its non mandatory");
		softAssert.assertTrue(fieldValidation.contains("Select"), "salutation field is not a dropdown hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("salutation_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerReferenceTestData.get("salutation"));

	}

	@And("user_076 verify first name field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_first_name_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("first_name_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Field validation first name : " + fieldValidation);
		System.out.println("Mandatory verification " + mandatoryVerification);
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"First name field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"First name field tyep should v=be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.sendKeys(customerReferenceTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify middle name field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_middle_name_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("middle_name_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("middle_name_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"middle name field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"middle name field tyep should v=be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("middle_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("middle_name_input"))
						.sendKeys(customerReferenceTestData.get("middle_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify last name field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_last_name_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("last_name_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("last_name_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"last name field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"last name field tyep should v=be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("last_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("last_name_input"))
						.sendKeys(customerReferenceTestData.get("last_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify customer full name field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_customer_full_name_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {

		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("customer_full_name_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("last_name_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"customer full name field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"customer full name field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("customer_full_name_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("customer_full_name_input"))
						.sendKeys(customerReferenceTestData.get("customer_full_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify identification type field should be editable dropdown at new app stage")
	public void user_076_076_076_verify_identification_type_field_should_be_editable_dropdown_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerReferenceJsPaths.getElement("identification_type_dropdown"))
						.getAttribute("aria-label");
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerReferenceJsPaths.getElement("identification_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(mandatoryVerification.isBlank()) && !(fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"identification type field should be non mandatory but in application screen its mandatory");
		softAssert.assertTrue(fieldValidation.contains("Select"),
				"identification type field is not a dropdown hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerReferenceJsPaths.getElement("identification_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerReferenceTestData.get("identification_type"));

	}

	@And("user_076 verify identification number field should be non mandatory editable textbox at new app stage")
	public void user_076_076_076_verify_identification_number_field_should_be_non_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("identification_number_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("identification_number_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"identification number field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"identification number field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("identification_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("identification_number_input"))
						.sendKeys(customerReferenceTestData.get("identifiaction_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify residential address field should be non mandatory editable textbox at new app stage")
	public void user_076_076_076_verify_residential_address_field_should_be_non_mandatory_editable_textbox_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("residential_address_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("residential_address_input"))
						.getAttribute("name");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"residential address field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("textarea"),
				"residential address field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("residential_address_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("residential_address_input"))
						.sendKeys(customerReferenceTestData.get("residence_address"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify office address field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_office_address_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("office_address_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("office_address_input"))
						.getAttribute("name");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"office address field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("textarea"),
				"office address field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("office_address_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("office_address_input"))
						.sendKeys(customerReferenceTestData.get("office_address"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify contact number field should be editable textbox at new app stage")
	public void user_076_076_076_verify_contact_number_field_should_be_editable_textbox_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("contact_number_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("contact_number_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"contact number field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"contact number field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("contact_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("contact_number_input"))
						.sendKeys(customerReferenceTestData.get("contact_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify office phone number field should be editable text box at new app stage")
	public void user_076_076_076_verify_office_phone_number_field_should_be_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("office_phone_number_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("office_phone_number_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"office phone number field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"office phones number field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("office_phone_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("office_phone_number_input"))
						.sendKeys(customerReferenceTestData.get("office_phone_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify primary mobile number field should be non mandatory text box at new app stage")
	public void user_076_076_076_verify_primary_mobile_number_field_should_be_non_mandatory_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("primary_mobile_number_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("primary_mobile_number_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"primary phone number field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"primary phones number field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("primary_mobile_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("primary_mobile_number_input"))
						.sendKeys(customerReferenceTestData.get("primary_mobile_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify alternative mobile number field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_alternative_mobile_number_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("alternate_mobile_number_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerReferenceJsPaths.getElement("altername_mobile_number_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"alternate phone number field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"alternate phones number field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerReferenceJsPaths.getElement("altername_mobile_number_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								customerReferenceJsPaths.getElement("altername_mobile_number_input"))
						.sendKeys(customerReferenceTestData.get("alternate_mobile_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify email id field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_email_id_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("email_id_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"email id field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"email id field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.sendKeys(customerReferenceTestData.get("email_id"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify no of years known field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_no_of_years_known_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("years_known_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"number of years known field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("number"),
				"number of years knows field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.sendKeys(customerReferenceTestData.get("no_of_years_known"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 verify CIF number field should be non mandatory editable text box at new app stage")
	public void user_076_076_076_verify_cif_number_field_should_be_non_mandatory_editable_text_box_at_new_app_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("CIF_number_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(customerReferenceJsPaths.getElement("cif_number_input"))
						.getAttribute("type");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"CIF number field should be non mandatory in application its mandatory");
		softAssert.assertTrue(fieldValidation.contains("text"),
				"CIF number field type should be text box but in application its not a text box");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("cif_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("cif_number_input"))
						.sendKeys(customerReferenceTestData.get("cif_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on save button in customer reference list view record")
	public void user_076_076_076_click_on_save_button_in_customer_reference_list_view_record() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the successfull validation for customer reference list view record")
	public void user_076_076_076_verify_system_should_show_the_successfull_validation_for_customer_reference_list_view_record()
			throws Throwable {

		String saveButtonValidationMessage = "";

		for (int i = 0; i <= 150; i++) {
			try {
				saveButtonValidationMessage = javascriptHelper
						.executeScript("return " + CommonJSElements.getElement("toast_container_message")).toString();
				if (!(saveButtonValidationMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveButtonValidationMessage);
		Assert.assertTrue(saveButtonValidationMessage.contains("Success! Record created with ID:"));
	}

	@And("user_076 invoke soft assert in customer reference list view record in new app stage")
	public void user_076_076_076_invoke_soft_assert_in_customer_reference_list_view_record_in_new_app_stage()
			throws Throwable {
		softAssert.assertAll();
	}

	// Negative Screnario
	@And("user_076 click on save button without entering mandatory field in customer reference record at new app stage")
	public void user_076_076_076_click_on_save_button_without_entering_mandatory_field_in_customer_reference_record_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 should get the validation pop up on customer reference screen to enter the mandatory details at new app stage")
	public void user_076_076_076_should_get_the_validation_pop_up_on_customer_reference_screen_to_enter_the_mandatory_details_at_new_app_stage()
			throws Throwable {

		String mandatoryValidationMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidationMessage = javascriptHelper
						.executeScript("return " + CommonJSElements.getElement("toast_message")).toString();
				if (!(mandatoryValidationMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Mandatory validation pop up " + mandatoryValidationMessage);
	}

	@And("user_076 enter the special character input in first name text box in customer reference at new app stage")
	public void user_076_076_076_enter_the_special_character_input_in_first_name_text_box_in_customer_reference_at_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.sendKeys(customerReferenceTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 should get the special character validation on first name fiels in customer reference screen")
	public void user_076_076_076_should_get_the_special_character_validation_on_first_name_fiels_in_customer_reference_screen()
			throws Throwable {
		String specialCharacterInputvalidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				specialCharacterInputvalidation = javascriptHelper
						.executeScript("return "
								+ customerReferenceJsPaths.getElement("first_name_special_character_input_validation"))
						.toString();
				if (!(specialCharacterInputvalidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150)

				{
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Special character input " + specialCharacterInputvalidation);
		softAssert.assertEquals("Only Alphanumeric characters are allowed", specialCharacterInputvalidation,
				"field not showing special character input validation");
	}

	@And("user_076 enter the invalid mail id in email id field in customer reference screen")
	public void user_076_076_076_enter_the_invalid_mail_id_in_email_id_field_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.sendKeys(customerReferenceTestData.get("invalid_mail_id"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 should get the validation for invalid mail id in customer reference screen")
	public void user_076_076_076_should_get_the_validation_for_invalid_mail_id_in_customer_reference_screen()
			throws Throwable {
		String invalidEmailIDvalidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				invalidEmailIDvalidation = javascriptHelper
						.executeScript("return " + customerReferenceJsPaths.getElement("invalid_email_id_validation"))
						.toString();
				if (!(invalidEmailIDvalidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150)

				{
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Invalid email ID " + invalidEmailIDvalidation);
		softAssert.assertEquals("Invalid Email", invalidEmailIDvalidation,
				"field not showing invalid email input validation");
	}

	@And("user_076 enter the character input in numeric firld in customer reference screen")
	public void user_076_076_076_enter_the_character_input_in_numeric_firld_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.sendKeys(customerReferenceTestData.get("alphabet_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 numeric field wont allowed to enter the special character input in numeric field")
	public void user_076_076_076_numeric_field_wont_allowed_to_enter_the_special_character_input_in_numeric_field()
			throws Throwable {
		String numericFieldValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numericFieldValidation = javascriptHelper
						.executeScript(
								"return " + customerReferenceJsPaths.getElement("get_no_of_years_known_field_value"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Numeric field validation " + numericFieldValidation);
		softAssert.assertEquals("", numericFieldValidation, "numeric field is accepting character input");
	}

	@And("user_076 click on back button in customer reference screen at new app stage")
	public void user_076_076_076_click_on_back_button_in_customer_reference_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJSElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("user_076 click on back button verify customer reference screen should get move backward at new app stage")
	public void user_076_076_076_click_on_back_button_verify_customer_reference_screen_should_get_move_backward_at_new_app_stage()
			throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButtonVisible = false;
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
			for (int j = 0; j <= 600; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isBlank())
							&& (labelName.trim()).equalsIgnoreCase(("References List View").trim())) {
						if (j > 250) {
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}
						System.out.println("Label Name " + labelName);
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]");
						isAddButtonVisible = true;
						break;
					} else {
						isAddButtonVisible = false;
						break;
					}
				} catch (Exception e) {
					if (j == 600) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonVisible == true) {
				break;
			}
		}
		if (isAddButtonVisible == false) {
			Assert.fail("Add button is not visible hence test case failed");
		}
	}

	@And("user_076 click on list view edit button in customer reference at new app stage")
	public void user_076_076_click_on_list_view_edit_button_in_customer_reference_at_new_app_stage() throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]').length";
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
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + i + "].innerText")
							.toString();
					if (listViewName.contains("References List View")) {

						indexOfListView = i;
						System.out.println("Index is " + i);

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
				if (i > 550 && i < 600) {
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

	@And("user_076 again click on edit button in customer reference list view at new app stage")
	public void user_076_again_click_on_edit_button_in_customer_reference_list_view_at_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {
				if (i > 550 && i < 600) {
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

	@And("user_076 update the first name in customer reference at new app stage")
	public void user_076_076_update_the_first_name_in_customer_reference_at_new_app_stage() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.sendKeys(customerReferenceTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the successful update pop up in customer reference at new app stage")
	public void user_076_076_verify_system_should_show_the_successful_update_pop_up_in_customer_reference_at_new_app_stage()
			throws Throwable {
		String updateSuccessMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				updateSuccessMessage = javascriptHelper
						.executeScript("return " + CommonJSElements.getElement("toast_container_message")).toString();
				if (!(updateSuccessMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
			System.out.println("Update success message " + updateSuccessMessage);
		}
	}

	@Then("user_076 verify list view record should show the updated first name in customer reference list view record")
	public void user_076_076_verify_list_view_record_should_show_the_updated_first_name_in_customer_reference_list_view_record()
			throws Throwable {
		System.out.println(indexOfListView);
		String queryForListViewRecord = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')["
				+ indexOfListView + "].querySelectorAll('td')[3].innerText";
		String updatedFirstNameFromScreen = "";
		for (int i = 0; i <= 150; i++) {
			try {
				updatedFirstNameFromScreen = javascriptHelper.executeScript("return " + queryForListViewRecord)
						.toString();
				if (!(updatedFirstNameFromScreen.isBlank())) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		}
		System.out.println("Updated first name " + updatedFirstNameFromScreen);
		softAssert.assertEquals(updatedFirstNameFromScreen, customerReferenceTestData.get("first_name"),
				"Customer reference record not getting updated hence test failed");

	}

	@And("user_076 make salutation first as blank option at customer reference screen")
	public void user_076_076_make_salutation_first_as_blank_option_at_customer_reference_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("salutation_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerReferenceTestData.get("default_select_option"));
	}

	@And("user_076 make first name fild as blank field in customer reference screen")
	public void user_076_076_make_first_name_fild_as_blank_field_in_customer_reference_screen() throws Throwable {
		for (int i = 0; i < 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 4) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 make email id field as blank field in customer reference screen")
	public void user_076_076_make_email_id_field_as_blank_field_in_customer_reference_screen() throws Throwable {
		for (int i = 0; i < 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("email_id_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 4) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 make no of years known field as blank in customer reference screen")
	public void user_076_076_make_no_of_years_known_field_as_blank_in_customer_reference_screen() throws Throwable {
		for (int i = 0; i < 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("years_known_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 4) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on status to change the record status of customer reference at new app stage")
	public void user_076_click_on_status_to_change_the_record_status_of_customer_reference_at_new_app_stage()
			throws Throwable {

		String tempRecordStatus = "";

		for (int i = 0; i <= 150; i++) {
			try {
				tempRecordStatus = javascriptHelper
						.executeScript("return " + customerReferenceJsPaths.getElement("opened_record_status"))
						.toString();
				if (!(tempRecordStatus.isBlank())) {
					System.out.println("Opened Record Status " + tempRecordStatus);
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
				javascriptHelper.executeScriptWithWebElement(customerReferenceJsPaths.getElement("status_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				customerReferenceRecordStatus = javascriptHelper
						.executeScript("return " + customerReferenceJsPaths.getElement("opened_record_status"))
						.toString();
				if (customerReferenceRecordStatus.equalsIgnoreCase(tempRecordStatus)) {
					System.out.println("Customer Reference opened record status " + customerReferenceRecordStatus);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 get the customer reference list view record status at new app stage and verify with the inside record status")
	public void user_076_get_the_customer_reference_list_view_record_status_at_new_app_stage_and_verify_with_the_inside_record_status()
			throws Throwable {

		System.out.println(indexOfListView);
		String queryForListViewRecord = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')["
				+ indexOfListView + "].querySelectorAll('td')[6].innerText";
		String listViewRecordStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewRecordStatus = javascriptHelper.executeScript("return " + queryForListViewRecord).toString();
				if (!(listViewRecordStatus.isBlank())) {
					System.out.println("List view Record status" + listViewRecordStatus);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		if (customerReferenceRecordStatus.equalsIgnoreCase("false")) {
			softAssert.assertEquals(listViewRecordStatus, "In-active");
		}
		if (customerReferenceRecordStatus.equalsIgnoreCase("true")) {
			softAssert.assertEquals(listViewRecordStatus, "Active");
		}

	}

	@And("user_076 get the location for the customer reference screen in new app stage")
	public void user_076_076_get_the_location_for_the_customer_reference_screen_in_new_app_stage() throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]').length";
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
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + i + "].innerText")
							.toString();
					if (listViewName.contains("References List View")) {

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
			Assert.fail("List view of customer reference is not found hence failed");
		}

	}

	@And("user_076 click on search button in customer reference list view at new app stage")
	public void user_076_click_on_search_button_in_customer_reference_list_view_at_new_app_stage() throws Throwable {

		String search_query = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')[" + indexOfListView
				+ "].querySelector('button[ng-reflect-text=\"Search\"]')";

		for (int i = 0; i <= 150; i++) {
			try {

				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(search_query));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(search_query).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 search the matched text in customer reference list view at new app stahe")
	public void user_076_search_the_matched_text_in_customer_reference_list_view_at_new_app_stahe() throws Throwable {
		String listViewSearch = "document.querySelector('input[mode=\"ios\"]')";
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(listViewSearch).click();
				javascriptHelper.executeScriptWithWebElement(listViewSearch)
						.sendKeys(customerReferenceTestData.get("matched_search_text"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verfy system should show the matched search result in customer reference list view")
	public void user_076_verfy_system_should_show_the_matched_search_result_in_customer_reference_list_view()
			throws Throwable {
		String extractSearchResult = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')["
				+ indexOfListView + "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText";
		String matchedSearchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				matchedSearchResult = javascriptHelper.executeScript("return " + extractSearchResult).toString();
				if (!(matchedSearchResult.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(matchedSearchResult);

	}

	@Then("user_076 search the unmatched text in customer reference list view at new app stahe")
	public void user_076_search_the_unmatched_text_in_customer_reference_list_view_at_new_app_stahe() throws Throwable {
		String listViewSearch = "document.querySelector('input[mode=\"ios\"]')";
		for (int i = 0; i < 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(listViewSearch).click();
				javascriptHelper.executeScriptWithWebElement(listViewSearch)
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(listViewSearch).click();
				javascriptHelper.executeScriptWithWebElement(listViewSearch)
						.sendKeys(customerReferenceTestData.get("unmatched_search_text"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verfy system should not show the matched search result in customer reference list view")
	public void user_076_verfy_system_should_not_show_the_matched_search_result_in_customer_reference_list_view()
			throws Throwable {
		String extractSearchResult = "document.querySelectorAll('ion-col[class=\\\"p-2 md hydrated\\\"]')["
				+ indexOfListView + "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText";
		String unmatchedSearchResult = "";

		for (int i = 0; i <= 150; i++) {
			try {
				if (i > 100) {
					unmatchedSearchResult = javascriptHelper.executeScript("return " + extractSearchResult).toString();
					if (!(unmatchedSearchResult.isBlank())
							|| unmatchedSearchResult.contains("Showing 0 to 0 of 0 entries")) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(unmatchedSearchResult);
	}
	// Export funtionality code

	@And("user_076 click on export button in customer reference screen at new app stage")
	public void user_076_click_on_export_button_in_customer_reference_screen_at_new_app_stage() {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')"));
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

	@And("user_076 click on pdf export option in customer reference at new app stage")
	public void user_076_click_on_pdf_export_option_in_customer_reference_at_new_app_stage() {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJSElements.getElement("pdf_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("user_076 verify system should download the pdf format file for customer reference screen at new app stage")
	public void user_076_verify_system_should_download_the_pdf_format_file_for_customer_reference_screen_at_new_app_stage() {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerReferenceDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerReferenceDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}

	}

	@Then("user_076 click on xls export option in customer reference at new app stage")
	public void user_076_click_on_xls_export_option_in_customer_reference_at_new_app_stage() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJSElements.getElement("xls_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("user_076 verify system should download the xls format file for customer reference screen at new app stage")
	public void user_076_verify_system_should_download_the_xls_format_file_for_customer_reference_screen_at_new_app_stage() {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerReferenceDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerReferenceDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

}
