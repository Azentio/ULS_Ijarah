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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_0482;

public class Tawarruq_APPDATA_InsuranceInfo {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	TawarruqLogin tawarruqLogin = new TawarruqLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
			"JSPath");
	JSPaths insuranceInfoElements = new JSPaths(excelFilePathForJS, "InsuranceInfo",
			"Tawarruq_InsuranceInfo_fieldName", "JSPath");
	String TestDataExcelDataPath = System.getProperty("user.dir") + "\\TestData\\TawarruqTestData.xlsx";
	BrowserHelper browserHelper= new BrowserHelper(driver);
	ExcelData excelDataForInsuranceInfoTestData = new ExcelData(TestDataExcelDataPath,
			"InsuranceInfoTestData", "Dataset ID");
	ExcelData excelDataForApplicationDetailsTawarruqExecutionData = new ExcelData(TestDataExcelDataPath,
			"Appdata_ApplicationDetailsExe", "TestCase ID");
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
				//javaScriptHelper.scrollIntoViewAndClick(jsPaths.getElement("insuranceInfo"));
				javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Insurance Info Tab")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@And("user_0482 get the test data for test case id AT_TW_INS_001")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_ins_001() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("AT_TW_INS_001");
		appdataEntrtyTestData = excelDataForInsuranceInfoTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}
	@And("user_0482 get the test data for test case id AT_TW_INS_002")
	public void user_get_the_test_data_for_test_case_id_at_tw_ins() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("AT_TW_INS_002");
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
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	    
		
	}

	@Given("user_0482 Verify insuranceQuotationId field should be Mandatory Dropdown and Editable")
	public void user_0482_verify_insurance_quotation_id_field_should_be_mandatory_dropdown_and_editable() {
	    userUtility.verifyGivenFieldIsMandatory(driver,insuranceInfoElements.getElement("Insurance Quotation ID field"));
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
		userUtility.verifyGivenFieldIsMandatory(driver,insuranceInfoElements.getElement("Insurance Year Field"));
	    for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(insuranceInfoElements.getElement("Insurance Year Select"))
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
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Depreciation Percentage Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Depreciation Percentage input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Depreciation Percentage input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("Depreciation Percentage input"))
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
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Asset Price Input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Asset Price Input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("Asset Price Input"))
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
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Rate Per Asset Input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Rate Per Asset Input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("Rate Per Asset Input"))
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
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Minimum Insurance Premium Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Minimum Insurance Premium Input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Minimum Insurance Premium Input"))
				.clear();
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
		userUtility.verifyGivenFieldIsMandatory(driver, insuranceInfoElements.getElement("Base Insurance Premium Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Base Insurance Premium Input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Base Insurance Premium Input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("Base Insurance Premium Input"))
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
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("VAT Premium Input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("VAT Premium Input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("VAT Premium Input"))
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
				javascriptHelper.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Net Premium Input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						insuranceInfoElements.getElement("Net Premium Input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								insuranceInfoElements.getElement("Net Premium Input"))
						.sendKeys(appdataEntrtyTestData.get("NetPremium"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	@And("user_0482 Verify Insurance year in List view")
	public void user_0482_verify_insurance_year_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement insuranceYear = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Insurance Year Field in List view"));
				Assert.assertTrue(insuranceYear.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Insurance year value in List view")
	public void user_0482_verify_insurance_year_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String insuranceYear = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("Insurance Year Field Value in List view")).toString();
				System.out.println(insuranceYear);
				Assert.assertFalse(insuranceYear.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify the Depreciation percentage in list view")
	public void user_0482_verify_the_depreciation_percentage_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement depreciationPercentage = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Depreciation Percentage Field in List View"));
				Assert.assertTrue(depreciationPercentage.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify the Depreciation percentage value in list view")
	public void user_0482_verify_the_depreciation_percentage_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String depreciationPercentage = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("Depreciation Percentage Value in List view")).toString();
				Assert.assertFalse(depreciationPercentage.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Asset Price in list view")
	public void user_0482_verify_asset_price_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement assetPrice = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Asset Price Field in list view"));
				Assert.assertTrue(assetPrice.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Asset Price Value in list view")
	public void user_0482_verify_asset_price_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String assetPrice = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("Asset Price Value in List View")).toString();
				System.out.println(assetPrice);
				Assert.assertFalse(assetPrice.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify the Base Insurance premium in list view")
	public void user_0482_verify_the_base_insurance_premium_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement baseInsurancePremium = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Base Premium Field in List View"));
				Assert.assertTrue(baseInsurancePremium.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify the Base Insurance premium value in list view")
	public void user_0482_verify_the_base_insurance_premium_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String baseInsurancePremium = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("Base Premium Field Value in List View")).toString();
				Assert.assertFalse(baseInsurancePremium.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify VAT premium in list view")
	public void user_0428_verify_vat_premium_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement vatPremium = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("VAT Premium Field in List View"));
				Assert.assertTrue(vatPremium.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify VAT premium value in list view")
	public void user_0482_verify_vat_premium_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String vatPremium = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("VAT Premium Value in List view")).toString();
				Assert.assertFalse(vatPremium.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Net premium in list view")
	public void user_0482_verify_net_premium_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement netPremium = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Net Premium Field in List View"));
				Assert.assertTrue(netPremium.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Net premium value in list view")
	public void user_0482_verify_net_premium_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String netPremium = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("Net Premium value in List view")).toString();
				Assert.assertFalse(netPremium.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Status in list view")
	public void user_0482_verify_status_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement status = javascriptHelper.executeScriptWithWebElement(insuranceInfoElements.getElement("Status Field in List View"));
				Assert.assertTrue(status.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Status value in list view")
	public void user_0482_verify_status_value_in_list_view() {
		for (int i = 0; i < 200; i++) {
			try {
				String status = javascriptHelper.executeScript("return "+insuranceInfoElements.getElement("Status Field Vlaue in List View")).toString();
				Assert.assertFalse(status.isBlank());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	

	
	

}
