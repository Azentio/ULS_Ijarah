package stepdefinitions;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_0482;

public class Tawarruq_APPDATA_InsuranceInfo {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	TawarruqLogin tawarruqLogin = new TawarruqLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = configFileReader.getJSFilePath();
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
			"JSPath");
	JSPaths insuranceInfoElements = new JSPaths(excelFilePathForJS, "InsuranceInfo", "Tawarruq_InsuranceInfo_fieldName",
			"JSPath");
	String TestDataExcelDataPath = configFileReader.getTawruqqTestDataFile();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ExcelData excelDataForInsuranceInfoTestData = new ExcelData(TestDataExcelDataPath, "InsuranceInfoTestData",
			"Dataset ID");
	ExcelData excelDataForApplicationDetailsTawarruqExecutionData = new ExcelData(TestDataExcelDataPath,
			"Tawruqq_ExecutionTracker", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> appdataEntrtyTestData = new HashMap<>();
	Map<String, String> appdataEntrtyExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";

	@Given("user_0482 click the insurance Info Screen")
	public void user_0482_click_the_insurance_info_screen() {
		for (int i = 0; i < 200; i++) {
			try {
				// javaScriptHelper.scrollIntoViewAndClick(jsPaths.getElement("insuranceInfo"));
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Insurance Info Tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 get the test data for test case id AT_TW_INS_001")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_ins_001() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("AT_TW_INS_001");
		appdataEntrtyTestData = excelDataForInsuranceInfoTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}

	@Given("user_0482 search the new app data entry stage record reference number in Insurance Info")
	public void user_search_the_new_app_data_entry_stage_record_reference_number_in_insurance_info() {
		System.out.println(appdataEntrtyTestData.get("record_reference_number"));
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(appdataEntrtyTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_0482 select the new app data entry stage record from mail box in Insurance Info")
	public void user_0482_select_the_new_app_data_entry_stage_record_from_mail_box_in_insurance_info() {
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
					System.out.println(appdataEntrtyTestData.get("record_reference_number"));
					if (recordRefNumber.equals(appdataEntrtyTestData.get("record_reference_number"))) {
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

	@Given("user_0482 click the Add button under insurance Info screen")
	public void user_0482_click_the_add_button_under_insurance_info_screen() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Add Button")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 Verify insuranceQuotationId field should be Mandatory Dropdown and Editable")
	public void user_0482_verify_insurance_quotation_id_field_should_be_mandatory_dropdown_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver,
				insuranceInfoElements.getElement("Insurance Quotation ID field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Insurance Quotation ID Select"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("insuranceQuotationId"));

	}

	@Given("user_0482 Verify insuranceYear field should be Mandatory Dropdown and Editable")
	public void user_0482_verify_insurance_year_field_should_be_mandatory_dropdown_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Insurance Year Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Insurance Year Select"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("insuranceYear"));

	}

	@Given("user_0482 Verify depriciation field Mandatory textbox and Editable")
	public void user_0482_verify_depriciation_field_mandatory_textbox_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver,
				insuranceInfoElements.getElement("Depreciation Percentage Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Depreciation Percentage input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Depreciation Percentage input"))
						.clear();
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Depreciation Percentage input"))
						.sendKeys(appdataEntrtyTestData.get("depriciation"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 Verify AssetPrice field Mandatory textbox and Editable")
	public void user_0482_verify_asset_price_field_mandatory_textbox_and_editable() {

		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Asset Price Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Asset Price Input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Asset Price Input"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Asset Price Input"))
						.sendKeys(appdataEntrtyTestData.get("AssetPrice"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_0482 Verify RatePerAsset field Mandatory textbox and Editable")
	public void user_0482_verify_rate_per_asset_field_mandatory_textbox_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Rate Per Asset Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Rate Per Asset Input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Rate Per Asset Input"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Rate Per Asset Input"))
						.sendKeys(appdataEntrtyTestData.get("RatePerAsset"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 Verify minimumInsurancePremium field Mandatory textbox and Editable")
	public void user_0482_verify_minimum_insurance_premium_field_mandatory_textbox_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver,
				insuranceInfoElements.getElement("Minimum Insurance Premium Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Minimum Insurance Premium Input")).click();
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Minimum Insurance Premium Input")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("Minimum Insurance Premium Input"))
						.sendKeys(appdataEntrtyTestData.get("minimumInsurancePremium"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 Verify BaseInsurancePremium field Mandatory textbox and Editable")
	public void user_0482_verify_base_insurance_premium_field_mandatory_textbox_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver,
				insuranceInfoElements.getElement("Base Insurance Premium Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Base Insurance Premium Input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Base Insurance Premium Input"))
						.clear();
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Base Insurance Premium Input"))
						.sendKeys(appdataEntrtyTestData.get("BaseInsurancePremium"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 Verify VATPremium field Mandatory textbox and Editable")
	public void user_0482_verify_vat_premium_field_mandatory_textbox_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("VAT Premium Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("VAT Premium Input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("VAT Premium Input"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("VAT Premium Input"))
						.sendKeys(appdataEntrtyTestData.get("VATPremium"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("user_0482 Verify NetPremium field Mandatory textbox and Editable")
	public void user_0482_verify_net_premium_field_mandatory_textbox_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Net Premium Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Net Premium Input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Net Premium Input"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Net Premium Input"))
						.sendKeys(appdataEntrtyTestData.get("NetPremium"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

}
