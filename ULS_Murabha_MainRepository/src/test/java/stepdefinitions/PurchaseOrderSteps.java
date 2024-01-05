package stepdefinitions;

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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class PurchaseOrderSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	String jsFilePath =configFileReader.getJSFilePath();
	String excelTestDataFilePath =configFileReader.getMurabhaTestDataFilePath();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths CommonJsElements = new JSPaths(jsFilePath, "Murabha_CommonElements", "Murabha_CommonFieldName", "JSPath");
	JSPaths purchaseOrderJSpaths = new JSPaths(jsFilePath, "PurchaseOrder_JSPaths", "PurchaseOrder_FieldName",
			"JSPaths");
	JSPaths jsPaths = new JSPaths(jsFilePath, "Murabha_loginElements", "Murabha_LoginFieldName", "JSPath");
	ExcelData purchaseOrderExcelTestData = new ExcelData(excelTestDataFilePath, "Murabaha_BeneficiaryTestData",
			"Dataset ID");
	ExcelData purchaseOrderExcelApprovalTestData = new ExcelData(excelTestDataFilePath,
			"MurabahaPurchaseOrder_TestData", "Dataset ID");
	ExcelData purchaseOrderExecutionSheet = new ExcelData(excelTestDataFilePath, "Muraba_beneficiaryExeSheet",
			"TestCase ID");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> purchaseOrderTestData = new HashMap<>();
	Map<String, String> purchaseOrderExecutionData = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();
	@And("user_076 search purchase order record reference number in mail box for approve test")
	public void user_076_search_purchase_order_record_reference_number_in_mail_box_for_approve_test() throws Throwable {

		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(purchaseOrderTestData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 select the purchase order record at mail box for aprove test murabaha product")
	public void user_076_select_the_purchase_order_record_at_mail_box_for_aprove_test_murabaha_product()
			throws Throwable {
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
					if (recordRefNumber
							.equals(purchaseOrderTestData.get("Ref No"))) {
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

	@And("user_076 search purchase order record reference number in mail box for murabaha")
	public void user_076_search_purchase_order_record_reference_number_in_mail_box_for_murabaha() throws Throwable {
		System.out.println(purchaseOrderTestData.get("Ref No"));
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text")).sendKeys(purchaseOrderTestData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the purchase order record at mail box for murabaha product")
	public void user_076_select_the_purchase_order_record_at_mail_box_for_murabaha_product() throws Throwable {
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
					if (recordRefNumber.equals(purchaseOrderTestData.get("Ref No"))) {
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

	@And("user_076 click in beneficiary tab at purchase order stage for murabaha")
	public void user_076_click_in_beneficiary_tab_at_purchase_order_stage_for_murabaha() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("Beneficiary_tab"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 get the test data for test case ID AT_M_PUR_08")
	public void user_076_get_the_test_data_for_test_case_id_AT_M_PUR_08() {
		purchaseOrderExecutionData = purchaseOrderExecutionSheet.getTestdata("AT_M_PUR_08");

		purchaseOrderTestData = purchaseOrderExcelTestData.getTestdata(purchaseOrderExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case ID AT_M_PUR_09")
	public void user_076_get_the_test_data_for_test_case_id_AT_M_PUR_09() {
		purchaseOrderExecutionData = purchaseOrderExecutionSheet.getTestdata("AT_M_PUR_09");

		purchaseOrderTestData = purchaseOrderExcelTestData.getTestdata(purchaseOrderExecutionData.get("dataSet_ID"));
	}

	@And("user_076 click on add button in beneficiary tab")
	public void user_076_click_on_add_button_in_beneficiary_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_details_add_button"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 can able to select the data in facility id dropdown")
	public void user_076_can_able_to_select_the_data_in_facility_id_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("facility_id_dropdown"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("Facility_application_id"));
	}

	@And("user_076 verify beneficiary name field should be mandatory editable text box")
	public void user_076_verify_beneficiary_name_field_should_be_mandatory_editable_text_box() throws Throwable {
		String fieldValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("beneficiary_name_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_name"))
						.getAttribute("type");

				if ((mandatoryValidation.length() > 0) || (fieldValidation.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_name"))
						.sendKeys(purchaseOrderTestData.get("beneficiary_name"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				" Beneficiary name field is not a mandatory hence failed");
		softAssert.assertTrue(fieldValidation.contains("text"),
				" Beneficiary name field is not a text type hence failed");

	}

	@And("user_076 verify beneficiary type field should be editable dropdown")
	public void user_076_verify_beneficiary_type_field_should_be_editable_dropdown() throws Throwable {

		String fieldValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("beneficiary_type_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");

				if ((mandatoryValidation.length() > 0) || (fieldValidation.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_type_dropdown"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("beneficiary_type"));
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				" beneficiary type field is not a mandatory hence failed");
		softAssert.assertTrue(fieldValidation.contains("Select"),
				" beneficiary type field is not a dropdown hence failed");

	}

	@And("user_076 verify beneficiary KYC field should be editable")
	public void user_076_verify_beneficiary_kyc_field_should_be_editable() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_kyc"))
						.sendKeys(purchaseOrderTestData.get("beneficiary_KYC"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify beneficiary address is editable text box")
	public void user_076_verify_beneficiary_address_is_editable_text_box() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_address"))
						.sendKeys(purchaseOrderTestData.get("beneficiary_address"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify account type field should be editable mandatory text box")
	public void user_076_verify_account_type_field_should_be_editable_mandatory_text_box() throws Throwable {
		String fieldValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("bank_account_type_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("bank_account_type"))
						.getAttribute("ng-reflect-placeholder");

				if ((mandatoryValidation.length() > 0) || (fieldValidation.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("bank_account_type"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("account_type"));
		softAssert.assertTrue(mandatoryValidation.contains("*"), " Account type field is not a mandatory hence failed");
		softAssert.assertTrue(fieldValidation.contains("Select"), " Account type field is not a dropdown hence failed");
	}

	@And("user_076 verify IBAN field should be editable mandatory text box")
	public void user_076_verify_iban_field_should_be_editable_mandatory_text_box() throws Throwable {
		String fieldValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript("return "
								+ purchaseOrderJSpaths.getElement("beneficiary_bank_account_no_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_bank_account_no"))
						.getAttribute("type");

				if ((mandatoryValidation.length() > 0) || (fieldValidation.length() > 0)) {
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
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_bank_account_no"))
						.sendKeys(purchaseOrderTestData.get("account_number"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryValidation.contains("*"),
				" Beneficiary account number field is not a mandatory hence failed");
		softAssert.assertTrue(fieldValidation.contains("number"),
				" Beneficiary account number field is not a text type hence failed");
	}

	@And("user_076 verify MICR type is editable dropdown")
	public void user_076_verify_micr_type_is_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("micr_type")).click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("MICR_type"));
	}

	@And("user_076 verify beneficiary MIICR code is editable dropdown")
	public void user_076_verify_beneficiary_miicr_code_is_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_micr_code"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("beneficiary_micr_code"));
	}

	@And("user_076 verify bank field should be mandatory editable lookup value")
	public void user_076_verify_bank_field_should_be_mandatory_editable_lookup_value() throws Throwable {
		String fieldValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript("return "
								+ purchaseOrderJSpaths.getElement("beneficiary_bank_code_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_bank_code"))
						.getAttribute("ng-reflect-placeholder");

				if ((mandatoryValidation.length() > 0) || (fieldValidation.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("beneficiary_bank_code"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("bank_code"));
		softAssert.assertTrue(mandatoryValidation.contains("*"), " bank code field is not a mandatory hence failed");
		softAssert.assertTrue(fieldValidation.contains("Select"), " bank code field is not a dropdown hence failed");
	}

	@And("user_076 verify branch name field should be mandatory editable lookup value")
	public void user_076_verify_branch_name_field_should_be_mandatory_editable_lookup_value() throws Throwable {
		String fieldValidation = "";
		String mandatoryValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("branch_name_mandatory_verification"))
						.toString();
				fieldValidation = javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("Branch_Name"))
						.getAttribute("ng-reflect-placeholder");

				if ((mandatoryValidation.length() > 0) || (fieldValidation.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("Branch_Name")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("branch_name"));
		softAssert.assertTrue(mandatoryValidation.contains("*"), " Branch name field is not a mandatory hence failed");
		softAssert.assertTrue(fieldValidation.contains("Select"), " Branch name field is not a dropdown hence failed");
	}

	@And("user_076 verify beneficiary repayment type is editable dropdown")
	public void user_076_verify_beneficiary_repayment_type_is_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("payment_type_dropdown"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("repayment_type"));
	}

	@And("user_076 verify beneficiary repayment mode is editable dropdown")
	public void user_076_verify_beneficiary_repayment_mode_is_editable_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("payment_mode_dropdown"))
						.click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(purchaseOrderTestData.get("repayment_mode"));
	}

	@And("user_076 click on save button in purchase maker screen")
	public void user_076_click_on_save_button_in_purchase_maker_screen() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify purchase maker screen should show the save validation while saving the record")
	public void user_076_verify_purchase_maker_screen_should_show_the_save_validation_while_saving_the_record() {
		String saveValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveValidation = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (saveValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveValidation);
		softAssert.assertTrue(saveValidation.contains("Success!"), " Record is not getting saved hence failed...!");
	}

	@And("user_076 click on search button in beneficiary details at purchase order stage")
	public void user_076_click_on_search_button_in_beneficiary_details_at_purchase_order_stage() {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 search the valid search text in beneficiary details search option at purchase order stage")
	public void user_076_search_the_valid_search_text_in_beneficiary_details_search_option_at_purchase_order_stage() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_text_box"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_text_box"))
						.sendKeys(purchaseOrderTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify beneficiary details search grid should show the matched result at purchase order stage")
	public void user_076_verify_beneficiary_details_search_grid_should_show_the_matched_result_at_purchase_order_stage() {
//Showing 0 to 0 of 0 entries
		String searchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("list_view_search_result"))
						.toString();
				if (!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries");

	}

	@And("user_076 search the invalid search text in beneficiary details search option at purchase order stage")
	public void user_076_search_the_invalid_search_text_in_beneficiary_details_search_option_at_purchase_order_stage() {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_text_box"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_text_box"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_text_box"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("list_view_search_text_box"))
						.sendKeys(purchaseOrderTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify beneficiary details search grid should not show the result at purchase order stage")
	public void user_076_verify_beneficiary_details_search_grid_should_not_show_the_result_at_purchase_order_stage() {
		String searchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("list_view_search_result"))
						.toString();
				if (searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries");
	}

	@And("user_076 click on asset details tab in purchase order stage")
	public void user_076_click_on_asset_details_tab_in_purchase_order_stage() throws Throwable {
		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println(
						"Query " + "return " + purchaseOrderJSpaths.getElement("asset_details_tab") + ".length");
				elements = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("asset_details_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							purchaseOrderJSpaths.getElement("asset_details_tab") + "[" + i + "]").click();
					break;

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}
					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}

	}

	@And("user_076 click on configuration tab in purchase order stage")
	public void user_076_click_on_configuration_tab_in_purchase_order_stage() throws Throwable {
		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				elements = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("configuration_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							purchaseOrderJSpaths.getElement("configuration_tab") + "[" + i + "]").click();
					break;

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}
					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}
	}

	@And("user_076 click on fees details tab in purchase order stage")
	public void user_076_click_on_fees_details_tab_in_purchase_order_stage() throws Throwable {
		String elements = "";
		Thread.sleep(500);
		for (int i = 0; i <= 150; i++) {
			try {

				elements = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("fees_details_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							purchaseOrderJSpaths.getElement("fees_details_tab") + "[" + i + "]").click();
					break;

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}
					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}

	}

	@And("user_076 click on downpayment summary tab in purchase order stage")
	public void user_076_click_on_downpayment_summary_tab_in_purchase_order_stage() throws Throwable {

		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				elements = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("downpayment_summary_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							purchaseOrderJSpaths.getElement("downpayment_summary_tab") + "[" + i + "]").click();
					break;

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}
					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}

	}

	@And("user_076 click on insurance info in purchase order stage")
	public void user_076_click_on_insurance_info_in_purchase_order_stage() throws Throwable {

		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				elements = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("insurance_info_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							purchaseOrderJSpaths.getElement("insurance_info_tab") + "[" + i + "]").click();
					break;

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}
					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}

	}

	@And("user_076 click on document details in purchase order stage")
	public void user_076_click_on_document_details_in_purchase_order_stage() throws Throwable {

		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				elements = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("document_details_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							purchaseOrderJSpaths.getElement("document_details_tab") + "[" + i + "]").click();
					break;

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}
					if (j > 21) {
						clicksAndActionsHelper.clickOnElement(javascriptHelper
								.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("segment_next_button")));
					}
					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}

	}

	@And("user_076 click on application details tab in purchase order stage")
	public void user_076_click_on_application_details_tab_in_purchase_order_stage() throws Throwable {

		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				elements = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("application_details_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					if (j < 20) {
						javascriptHelper
								.executeScriptWithWebElement(
										purchaseOrderJSpaths.getElement("application_details_tab") + "[" + i + "]")
								.click();
						break;
					}
					if (j > 21) {
						System.out.println(
								"Next Button JSpath document.querySelectorAll('button[class=\"btnNext ng-star-inserted\"]')[1]");
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[class=\"btnNext ng-star-inserted\"]')[1]"));

						javascriptHelper
								.executeScriptWithWebElement(
										purchaseOrderJSpaths.getElement("application_details_tab") + "[" + i + "]")
								.click();
						break;
					}

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}

					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}

	}

	@Then("user_076 verify asset details record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_asset_details_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {
		String viewButtonJSpath = "document.querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(viewButtonJSpath).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {

				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				System.out.println("I value whiel capture the field length " + i);
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					System.out.println("Field label " + fieldLabel);
					System.out.println("Is file read only mode " + isFieldReadonlyMode);
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");

		}

	}

	@Then("user_076 verify configuration record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_configuration_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {
//		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
//		String fieldNumber = "";
//		for (int i = 0; i <= 300; i++) {
//			try {
//				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
//				if ((i > 100) && (fieldNumber.length() > 0)) {
//					break;
//				}
//			} catch (Exception e) {
//				if (i == 300) {
//					e.printStackTrace();
//					Assert.fail(e.getMessage());
//				}
//
//			}
//		}
//		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
//		String fieldLabel = "";
//		String isFieldReadonlyMode = "";
//		for (int i = 0; i < preitiveFieldNumber; i++) {
//			for (int j = 0; j <= 50; j++) {
//				try {
//					fieldLabel = javascriptHelper.executeScript("return "
//							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
//							.toString();
//					isFieldReadonlyMode = javascriptHelper.executeScript(
//							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
//									+ "].getAttribute('ng-reflect-readonly')")
//							.toString();
//					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
//						break;
//					}
//				} catch (Exception e) {
//					if (i == 50) {
//						e.printStackTrace();
//						Assert.fail(e.getMessage());
//					}
//				}
//			}
//			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
//					fieldLabel + " is not readonly mode hence failed");
//		}

	}

	@Then("user_076 verify fees details record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_fees_details_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {
		String viewButtonJSpath = "document.querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(viewButtonJSpath).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");
		}

	}

	@Then("user_076 verify downpayment summary record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_downpayment_summary_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {

		String viewButtonJSpath = "document.querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(viewButtonJSpath).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");
		}

	}

	@Then("user_076 verify insurance info record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_insurance_info_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {
		String viewButtonJSpath = "document.querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(viewButtonJSpath).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");
		}

	}

	@Then("user_076 verify document details record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_document_details_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {
		String viewButtonJSpath = "document.querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(viewButtonJSpath).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {

				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;

				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");
		}
	}

	@Then("user_076 verify application details record should be readonly and data should match with app data entry stage record")
	public void user_076_verify_application_details_record_should_be_readonly_and_data_should_match_with_app_data_entry_stage_record()
			throws Throwable {
		String numberOfField = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String fieldNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {

				fieldNumber = javascriptHelper.executeScript("return " + numberOfField).toString();
				if ((i > 100) && (fieldNumber.length() > 0)) {
					break;

				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		int preitiveFieldNumber = Integer.parseInt(fieldNumber);
		String fieldLabel = "";
		String isFieldReadonlyMode = "";
		for (int i = 0; i < preitiveFieldNumber; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					fieldLabel = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();
					isFieldReadonlyMode = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					if ((fieldLabel.length() > 0) && (isFieldReadonlyMode.length() > 0)) {
						break;
					}
				} catch (Exception e) {
					if (i == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			softAssert.assertTrue(isFieldReadonlyMode.equals("true"),
					fieldLabel + " is not readonly mode hence failed");
		}

	}

	@And("user_076 click on application details in purchase order stage")
	public void user_076_click_on_application_details_in_purchase_order_stage() throws Throwable {
		String elements = "";
		for (int i = 0; i <= 150; i++) {
			try {
				elements = javascriptHelper
						.executeScript(
								"return " + purchaseOrderJSpaths.getElement("application_details_tab") + ".length")
						.toString();
				if (elements.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveElement = Integer.parseInt(elements);
		System.out.println("Premitive Element length " + premitiveElement);
		for (int i = 0; i < premitiveElement; i++) {
			for (int j = 0; j <= 50; j++) {
				try {
					if (j < 20) {
						javascriptHelper
								.executeScriptWithWebElement(
										purchaseOrderJSpaths.getElement("application_details_tab") + "[" + i + "]")
								.click();
						break;
					}
					if (j > 21) {
						System.out.println(purchaseOrderJSpaths.getElement("segment_next_button"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper
								.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("segment_next_button")));

						javascriptHelper
								.executeScriptWithWebElement(
										purchaseOrderJSpaths.getElement("application_details_tab") + "[" + i + "]")
								.click();
						break;
					}

				} catch (Exception e) {
					if (j > 20) {
						i = i + 1;
					}

					if (j == 50) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}
	}

	@And("user_076 click on view summary button in purchase order stage")
	public void user_076_click_on_view_summary_button_in_purchase_order_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("view_workflow_button"))
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

	@Then("user_076 verify view summary tab should get open at purchase order stage")
	public void user_076_verify_view_summary_tab_should_get_open_at_purchase_order_stage() throws Throwable {
		String viewSummaryText = "";
		for (int i = 0; i <= 150; i++) {
			try {

				viewSummaryText = javascriptHelper
						.executeScript("return " + purchaseOrderJSpaths.getElement("view_summary_verification"))
						.toString();
				if (viewSummaryText.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(viewSummaryText);
		softAssert.assertEquals("Transaction summary", viewSummaryText, "View Summary is not getting opened");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(purchaseOrderJSpaths.getElement("view_summary_colse_button"))
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

	@And("user_076 click on submit button at purchase order stage for murabaha")
	public void user_076_click_on_submit_button_at_purchase_order_stage_for_murabaha() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("submit_button")));
				clicksAndActionsHelper.clickOnElement(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("submit_button")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on return button at purchase order stage for murabaha")
	public void user_076_click_on_return_button_at_purchase_order_stage_for_murabaha() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("return_button")));
				clicksAndActionsHelper.clickOnElement(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("return_button")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 give alert remark and click the alert submit button in purchase order record at murabaha product")
	public void user_076_give_alert_remark_and_click_the_alert_submit_button_in_purchase_order_record_at_murabaha_product()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Return Query " + CommonJsElements.getElement("alert_text_box_return"));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.sendKeys("Return");
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
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_submit")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify purchase order record should get approved from purchase order stage and store the user ID")
	public void user_076_verify_purchase_order_record_should_get_approved_from_purchase_order_stage_and_store_the_user_id()
			throws Throwable {

		String approveText = "";
		for (int i = 0; i <= 150; i++) {
			try {
				approveText = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (approveText.length() > 0) {
					System.out.println("Approve Text Length " + approveText.length());
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Approve Text " + approveText);

		String finalUserID = approveText.substring(83).replace(".", "");

		System.out.println("Approval User ID " + finalUserID);
		purchaseOrderExcelApprovalTestData.updateTestData("DS01_AT_M_PUR_12", "user_Id", finalUserID);

	}

	@And("user_076 get the test data for test case ID AT_M_PUR_12_01")
	public void user_076_get_the_test_data_for_test_case_id_AT_M_PUR_12_01() throws Throwable {
		purchaseOrderExecutionData = purchaseOrderExecutionSheet.getTestdata("AT_M_PUR_12");
		purchaseOrderTestData = purchaseOrderExcelApprovalTestData
				.getTestdata(purchaseOrderExecutionData.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case ID AT_M_PUR_13")
	public void user_076_get_the_test_data_for_test_case_id_AT_M_PUR_13() throws Throwable {
		purchaseOrderExecutionData = purchaseOrderExecutionSheet.getTestdata("AT_M_PUR_13");
		purchaseOrderTestData = purchaseOrderExcelApprovalTestData
				.getTestdata(purchaseOrderExecutionData.get("dataSet_ID"));
	}

	@And("user_076 login with valid credentials at offering to submit the purchase maker stage for murabaha")
	public void user_076_login_with_valid_credentials_at_offering_to_submit_the_purchase_maker_stage_for_murabaha()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(purchaseOrderTestData.get("user_Id"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();

		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

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
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).sendKeys("Admin@1");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 login with valid credentials at purchase order checker to return the purchase maker stage for murabaha")
	public void user_076_login_with_valid_credentials_at_purchase_order_checker_to_return_the_purchase_maker_stage_for_murabaha()
			throws Throwable {

		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(purchaseOrderTestData.get("user_Id"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();

		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

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
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).sendKeys("Admin@1");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 choose the previous stage at purchase order checker stage for murabaha")
	public void user_076_choose_the_previous_stage_at_purchase_order_checker_stage_for_murabaha() throws Throwable {
		String lengthOfReturnStage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Dropdown Query " + "document.querySelector('ion-select[class^=\"wrkSelBox\"]')");
				clicksAndActionsHelper.clickUsingActionClass(
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-select[class^=\"wrkSelBox\"]')"),
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-select[class^=\"wrkSelBox\"]')"));
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
				lengthOfReturnStage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("return_dropdown_length")).toString();
				if (lengthOfReturnStage.length() > 0 || !(lengthOfReturnStage.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean isStageSelected = false;

		int premitiveDropdownLength = Integer.parseInt(lengthOfReturnStage);

		int stagePosition = 0;
		for (int i = 0; i < premitiveDropdownLength; i++) {
			for (int j = 0; j <= 3000; j++) {
				try {
					String dropdownText = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
							+ i + "].value").toString();

					System.out.println("Dropdown Text " + dropdownText);
					System.out.println(
							"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
									+ i + "].value");
					if (dropdownText.equalsIgnoreCase("PURMKR")) {
						stagePosition = i;
						isStageSelected = true;
						break;
					} else {
						break;
					}

				} catch (Exception e) {
					if (j == 3000) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isStageSelected == true) {
				break;
			} else if ((i == premitiveDropdownLength) && (isStageSelected == false)) {
				Assert.fail("Dropdown text is not visible hence failed");
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Stage position " + stagePosition);
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
								+ stagePosition + "]")
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

	@And("user_076 choose the previous stage at purchase order maker stage for murabaha")
	public void user_076_choose_the_previous_stage_at_purchase_order_maker_stage_for_murabaha() throws Throwable {
		String lengthOfReturnStage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Dropdown Query " + "document.querySelector('ion-select[class^=\"wrkSelBox\"]')");
				clicksAndActionsHelper.clickUsingActionClass(
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-select[class^=\"wrkSelBox\"]')"),
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-select[class^=\"wrkSelBox\"]')"));
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
				lengthOfReturnStage = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("return_dropdown_length")).toString();
				System.out.println("Length of the dropdown " + lengthOfReturnStage);
				if (lengthOfReturnStage.length() > 0 || !(lengthOfReturnStage.equalsIgnoreCase("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean isStageSelected = false;

		int premitiveDropdownLength = Integer.parseInt(lengthOfReturnStage);

		int stagePosition = 0;
		for (int i = 0; i < premitiveDropdownLength; i++) {
			for (int j = 0; j <= 3000; j++) {
				try {
					String dropdownText = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
							+ i + "].value").toString();

					System.out.println("Dropdown Text " + dropdownText);
					System.out.println(
							"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
									+ i + "].value");
					if (dropdownText.equalsIgnoreCase("OFFERING")) {
						stagePosition = i;
						isStageSelected = true;
						break;
					} else {
						break;
					}

				} catch (Exception e) {
					if (j == 3000) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isStageSelected == true) {
				break;
			} else if ((i == premitiveDropdownLength) && (isStageSelected == false)) {
				Assert.fail("Dropdown text is not visible hence failed");
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Stage position " + stagePosition);
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
								+ stagePosition + "]")
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

	@And("user_076 enter the return remark in purchase order checker stage for murabaha")
	public void user_076_enter_the_return_remark_in_purchase_order_checker_stage_for_murabaha() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Return Query " + CommonJsElements.getElement("alert_text_box_return"));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.sendKeys("Return");
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 enter the return remark in purchase order maker stage for murabaha")
	public void user_076_enter_the_return_remark_in_purchase_order_maker_stage_for_murabaha() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Return Query " + CommonJsElements.getElement("alert_text_box_return"));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.sendKeys("Return");
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 enter the alert return button in purchase order checker stage for murabaha")
	public void user_076_enter_the_alert_return_button_in_purchase_order_checker_stage_for_murabaha() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_return_button"))
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

	@And("user_076 enter the alert return button in purchase order maker stage for murabaha")
	public void user_076_enter_the_alert_return_button_in_purchase_order_maker_stage_for_murabaha() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_return_button"))
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

	@Then("user_076 verify murabaha record should get return to purchase order maker stage")
	public void user_076_verify_murabaha_record_should_get_return_to_purchase_order_maker_stage() throws Throwable {
		String approveText = "";
		for (int i = 0; i <= 150; i++) {
			try {
				approveText = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (approveText.length() > 0) {
					System.out.println("Approve Text Length " + approveText.length());
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Approve Text " + approveText);

		String finalUserID = approveText.substring(85).replace(".", "");
		System.out.println("Approval User ID " + finalUserID);
		Assert.assertTrue(approveText.contains("PURMKR"));
		purchaseOrderExcelApprovalTestData.updateTestData(purchaseOrderTestData.get("Dataset ID"), "user_Id",
				finalUserID);

	}

	@Then("user_076 verify murabaha record should get return to offering stage")
	public void user_076_verify_murabaha_record_should_get_return_to_offering_stage() throws Throwable {
		String approveText = "";
		for (int i = 0; i <= 150; i++) {
			try {
				approveText = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (approveText.length() > 0) {
					System.out.println("Approve Text Length " + approveText.length());
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Approve Text " + approveText);

		String finalUserID = approveText.substring(85).replace(".", "");
		System.out.println("Approval User ID " + finalUserID);
		Assert.assertTrue(approveText.contains("OFFERING"));
		purchaseOrderExcelApprovalTestData.updateTestData(purchaseOrderTestData.get("Dataset ID"), "user_Id",
				finalUserID);

	}

//	@Then("user_076 verify murabaha record should get return to offering stage")
//	public void user_076_verify_murabaha_record_should_get_return_to_offering_stage() throws Throwable {
//		String approveText = "";
//		for (int i = 0; i <= 150; i++) {
//			try {
//				approveText = javascriptHelper
//						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
//				if (approveText.length() > 0) {
//					System.out.println("Approve Text Length " + approveText.length());
//					break;
//				}
//			} catch (Exception e) {
//				if (i == 150) {
//					e.printStackTrace();
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		System.out.println("Approve Text " + approveText);
//
//		String finalUserID = approveText.substring(83).replace(".", "");
//
//		System.out.println("Approval User ID " + finalUserID);
//	}

	@And("user_076 click on application details in offering stage")
	public void user_076_click_on_application_details_in_offering_stage() throws Throwable {
		String segmentButtonLength = "document.querySelectorAll('ion-segment ion-segment-button').length";
		String segmentLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				segmentLength = javascriptHelper.executeScript("return " + segmentButtonLength).toString();
				if (segmentLength.length() > 0 || !(segmentLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveSegmentLength = Integer.parseInt(segmentLength);
		boolean isSegmentClicked = false;
		for (int i = 0; i < premitiveSegmentLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {

					String segmentName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-segment ion-segment-button')[" + i + "].innerText")
							.toString();
					if (segmentName.equals("Application Details")) {
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-segment ion-segment-button')[" + i + "]")
								.click();
						break;
					} else {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if ((i == premitiveSegmentLength) && (isSegmentClicked == false)) {
				Assert.fail("Segment not clicked");
			}

		}

	}

	@And("user_076 click on Approve button at offering stage for murabaha")
	public void user_076_click_on_Approve_button_at_offering_stage_for_murabaha() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("approve_button")));
				clicksAndActionsHelper.clickOnElement(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("approve_button")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 give alert remark and click the alert submit button in offering stage record at murabaha product")
	public void user_076_give_alert_remark_and_click_the_alert_submit_button_in_offering_stage_record_at_murabaha_product()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Return Query " + CommonJsElements.getElement("alert_text_box_return"));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_text_box_return"))
						.sendKeys("Approved");
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
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_approve_button"))
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

	@Then("user_076 verify murabaha offering stage record got submitted to purchase order maker stage")
	public void user_076_verify_murabaha_offering_stage_record_got_submitted_to_purchase_order_maker_stage()
			throws Throwable {
		String approveText = "";
		for (int i = 0; i <= 150; i++) {
			try {
				approveText = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (approveText.length() > 0) {
					System.out.println("Approve Text Length " + approveText.length());
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Approve Text " + approveText);

		String finalUserID = approveText.substring(83).replace(".", "");

		System.out.println("Approval User ID " + finalUserID);
	}

	@And("user_076 invoke soft assert in murabaha purchase order screen")
	public void user_invoke_soft_assert_in_murabaha_purchase_order_screen() throws Throwable {
		softAssert.assertAll();
	}
}
