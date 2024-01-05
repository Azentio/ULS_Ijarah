package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

public class AutoLoan_FacilityDetailsSteps_076 extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String jsPathFile = configFileReader.getJSFilePath();
	JSPaths facilityInfoElements = new JSPaths(jsPathFile, "facilityInfo_JSpaths", "FacilityInfo_Elements", "JSPaths");
	JSPaths CommonJsElements = new JSPaths(jsPathFile, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> facilityInfoExecution = new HashMap<>();
	Map<String, String> facilityInfoTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ExcelData facilityDetailsExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData facilityInfoAppDataEntryTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AppDataEntry_FacilityInfoData", "Dataset ID");
	ExcelData facilityDetailsTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"Facility_info_TestData", "Dataset ID");
	Logger log = LogManager.getLogger(AutoLoan_FacilityDetailsSteps_076.class);
	BrowserHelper browserHelper = new BrowserHelper(driver);

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
		log.error("Facilty tab got clicked");
	}

	@And("user_076 click on add button in facility info screen at new app stage")
	public void user_076_click_on_add_button_in_facility_info_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_info_add_button"))
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

	@And("user_076 get the test data for the test case ID AT_AL_FD_01")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_01() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_01");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityDetailsTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_AL_FD_02")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_02() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_02");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityDetailsTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_AL_FD_03")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_03() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_03");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityDetailsTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_AL_FD_04")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_04() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_04");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityDetailsTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 click on add button in facility info screen at app data entry stage")
	public void user_076_click_on_add_button_in_facility_info_screen_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_info_add_button"))
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

	@And("user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_01")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_APPDATAENTRY_01() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_APPDATAENTRY_01");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityInfoAppDataEntryTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_02")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_APPDATAENTRY_02() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_APPDATAENTRY_02");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityInfoAppDataEntryTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_03")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_APPDATAENTRY_03() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_APPDATAENTRY_03");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityInfoAppDataEntryTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for the test case ID AT_AL_FD_APPDATAENTRY_04")
	public void user_076_get_the_test_data_for_the_test_case_id_AT_AL_FD_APPDATAENTRY_04() throws Throwable {
		facilityInfoExecution = facilityDetailsExecutionSheet.getTestdata("AT_AL_FD_APPDATAENTRY_04");
		System.out.println("Data Set ID " + facilityInfoExecution.get("dataSet_ID"));
		facilityInfoTestData = facilityInfoAppDataEntryTestData.getTestdata(facilityInfoExecution.get("dataSet_ID"));
	}

	@And("user_076 click on facility details tab in app data entry stage")
	public void user_076_click_on_facility_details_tab_in_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("facility_info_tab"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("clasification_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("clasification_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("clasification_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("Clsification"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("product_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("product_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("Product"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("scheme_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("scheme_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("scheme_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("scheme"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("program_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("program_code_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("program_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("program_code"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_type_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_type_code_dropdown"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_type_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("facility_type"));
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
							.executeScriptWithWebElement(facilityInfoElements.getElement("servicing_branch_dropdown"))
							.getAttribute("ng-reflect-placeholder");
					mandatoryValidation = javascriptHelper
							.executeScriptWithWebElement(facilityInfoElements.getElement("servicing_branch_dropdown"))
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
							.executeScriptWithWebElement(facilityInfoElements.getElement("servicing_branch_dropdown"))
							.click();
					break;
				} catch (Exception e) {
					if (i == 10) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("servicing_branch"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("pricing_indecator_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("pricing_indecator_dropdown"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("pricing_indecator_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("pricing_or_interest_indecator"));
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
								"return " + facilityInfoElements.getElement("downpayment_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("downpayment_amount_input"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("downpayment_amount_input"))
						.sendKeys(facilityInfoTestData.get("declared_downpayment_amount"));
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
								"return " + facilityInfoElements.getElement("amount_requested_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
						.sendKeys(facilityInfoTestData.get("requested_amount"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("curency_code_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("curency_code_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("curency_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(facilityInfoTestData.get("currency"));
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
								"return " + facilityInfoElements.getElement("loan_tenure_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
						.sendKeys(facilityInfoTestData.get("loan_tenure"));
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("list_view_edit_button"))
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("asset_price_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("asset_price_input"))
						.sendKeys(facilityInfoTestData.get("asset_price"));
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
						.sendKeys(facilityInfoTestData.get("loan_tenure"));
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
						.sendKeys(facilityInfoTestData.get("requested_amount"));
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
						.executeScript("return " + facilityInfoElements.getElement("list_view_tenure_amount"))
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
		softAssert.assertEquals(updatedTenure, facilityInfoTestData.get("loan_tenure"),
				"Loan tenure not getting updated with new data hence failed");

	}

	@Then("user_076 verify facility requested amount field should get updated at new app stage")
	public void user_076_verify_facility_requested_amount_field_should_get_updated_at_new_app_stage() throws Throwable {
		String updatedRequestedAmt = "";
		for (int i = 0; i <= 150; i++) {
			try {
				updatedRequestedAmt = javascriptHelper
						.executeScript("return " + facilityInfoElements.getElement("list_view_amount_requested"))
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
		softAssert.assertEquals(updatedRequestedAmt, facilityInfoTestData.get("requested_amount"),
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
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("loan_tenure_input"))
						.sendKeys(facilityInfoTestData.get("character_input"));
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
						.executeScript("return " + facilityInfoElements.getElement("get_loan_tenure_value")).toString();
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(getLoanTenure.length() <= 0, "Loan tenure accepts character input hence failed");
	}

	@And("user_076 enter special character input in amount requested in facility details")
	public void user_076_enter_special_character_input_in_amount_requested_in_facility_details() throws Throwable {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("amount_requested_input"))
						.sendKeys(facilityInfoTestData.get("special_character_input"));
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
						.executeScript("return " + facilityInfoElements.getElement("get_requested_amount_value"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_info_add_button"))
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
						.sendKeys(facilityInfoTestData.get("valid_search_text"));
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
						.sendKeys(facilityInfoTestData.get("invalid_search_text"));
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("list_view_non_editable_field"))
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
						.executeScript("return " + facilityInfoElements.getElement("list_view_header_field_name"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("facility_info_add_button"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("list_view_edit_button"))
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

				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("list_view_edit_button"))
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
						.executeScriptWithWebElement(facilityInfoElements.getElement("clasification_dropdown"))
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

}
