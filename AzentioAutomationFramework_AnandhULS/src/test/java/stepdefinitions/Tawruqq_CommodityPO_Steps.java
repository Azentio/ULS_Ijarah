package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.testng.Assert;
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

public class Tawruqq_CommodityPO_Steps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();

	String jsPathExcelFile = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	JSPaths commodityPoJspaths = new JSPaths(jsPathExcelFile, "CPUMKR_CommodityPOJSPtah", "ComoddityPOElementName",
			"JSPaths");
	JSPaths commonJSElements = new JSPaths(jsPathExcelFile, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	ExcelData commodityPOMakerTestData = new ExcelData(excelTestDataPath, "TW_CommodityPO_TestData", "Dataset ID");
	ExcelData tawruqqExecutioSheet = new ExcelData(excelTestDataPath, "Tawruqq_ExecutionTracker", "TestCase ID");
	BrowserHelper browserHelper = new BrowserHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> commodityPOTestData = new HashMap<>();
	Map<String, String> commodityExecution = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();

	@And("user_076 get the test data for test case id AT_TW_CSM_02")
	public void user_076_get_the_test_data_for_test_case_id_AT_TW_CSM_02() throws Throwable {
		commodityExecution = tawruqqExecutioSheet.getTestdata("AT_TW_CSM_02");
		commodityPOTestData = commodityPOMakerTestData.getTestdata(commodityExecution.get("dataSet_ID"));// Dataset ID
		System.out.println("data Set ID " + commodityExecution.get("Dataset ID"));
	}

	@And("user_076 get the test data for test case id AT_TW_CSM_01")
	public void user_076_get_the_test_data_for_test_case_id_AT_TW_CSM_01() throws Throwable {
		commodityExecution = tawruqqExecutioSheet.getTestdata("AT_TW_CSM_01");
		commodityPOTestData = commodityPOMakerTestData.getTestdata(commodityExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for test case id AT_TW_CSM_03")
	public void user_076_get_the_test_data_for_test_case_id_AT_TW_CSM_03() throws Throwable {
		// AT_TW_CSM_03
		commodityExecution = tawruqqExecutioSheet.getTestdata("AT_TW_CSM_03");
		commodityPOTestData = commodityPOMakerTestData.getTestdata(commodityExecution.get("dataSet_ID"));// Dataset ID
		System.out.println("data Set ID " + commodityPOTestData.get("Dataset ID"));
	}

	@And("user_076 click on commodity po tab in commodity maker stage")
	public void user_076_click_on_commodity_po_tab_in_commodity_maker_stage() throws Throwable {
		System.out.println(commodityPoJspaths.getElement("commodity_po_tab"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 click on add button in commodity po screen")
	public void user_076_click_on_add_button_in_commodity_po_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_addButton"))
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

	@And("user_076 click on save button without entering the mandatory details")
	public void user_076_click_on_save_button_without_entering_the_mandatory_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify commodity po screen should show the empty field validation")
	public void user_076_verify_commodity_po_screen_should_show_the_empty_field_validation() throws Throwable {
		String mandatoryValidationMsg = "";

		for (int i = 0; i <= 300; i++) {

			try {
				mandatoryValidationMsg = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_message")).toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(mandatoryValidationMsg);
		softAssert.assertEquals(mandatoryValidationMsg, "Please fill all the details");

	}

	@And("user_076 enter the character value in numeric field in commodity po screen")
	public void user_076_enter_the_character_value_in_numeric_field_in_commodity_po_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_amount_text_box"))
						.click();

				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_amount_text_box"))
						.sendKeys(commodityPOTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 verify system wont allow user to enter character input in numeric field of commodity po screen")
	public void user_076_verify_system_wont_allow_user_to_enter_character_input_in_numeric_field_of_commodity_po_screen()
			throws Throwable {
		String commodityAmount = "";
		for (int i = 0; i < 300; i++) {
			try {
				commodityAmount = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("get_commodity_amount")).toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(commodityAmount, "");
		System.out.println("Commodity Amount : " + commodityAmount);
	}

	@And("user_076 click on back button in commodity po screen")
	public void user_076_click_on_back_button_in_commodity_po_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify commodity po screen should get move backward")
	public void user_076_verify_commodity_po_screen_should_get_move_backward() throws Throwable {
		boolean isBackButtonWorking = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isBackButtonWorking = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_addButton"))
						.isDisplayed();
				if (isBackButtonWorking == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isBackButtonWorking);

	}
//Creation steps

	@And("user_076 verify business partner field should be mandatory editable dropdown at commodity maker stage")
	public void user_076_verify_business_partner_field_should_be_mandatory_editable_dropdown_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("BusinessPartner_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldTypeVerification.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + commodityPoJspaths.getElement("businessPartner_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertEquals(fieldTypeVerification, "Select",
				" Business partner field is not a dropdown hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" Business partner field not a mandatory field hence failed");
		javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("BusinessPartner_dropdown")).click();
		System.out.println("Test data " + commodityPOTestData.get("business_partner"));
		clicksAndActionsHelper.jsSelectUsingText(commodityPOTestData.get("business_partner"));

	}

	@And("user_076 verify commodity type field should be mandatory editable dropdown at commodity maker stage")
	public void user_076_verify_commodity_type_field_should_be_mandatory_editable_dropdown_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("Commodity_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldTypeVerification.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + commodityPoJspaths.getElement("commodity_type_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(fieldTypeVerification, "Select",
				" commodity type field is not a dropdown hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" commodity type field not a mandatory field hence failed");
		javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("Commodity_type_dropdown")).click();
		clicksAndActionsHelper.jsSelectUsingText(commodityPOTestData.get("commodity_type"));

	}

	@And("user_076 verify commodity name field should be mandatory editable dropdown at commodity maker stage")
	public void user_076_verify_commodity_name_field_should_be_mandatory_editable_dropdown_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_name_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldTypeVerification.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + commodityPoJspaths.getElement("commodity_name_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(fieldTypeVerification, "Select",
				" commodity name field is not a dropdown hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" commodity name field not a mandatory field hence failed");
		javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_name_dropdown")).click();
		clicksAndActionsHelper.jsSelectUsingText(commodityPOTestData.get("commodity_name"));
	}

	@And("user_076 verify poposed amount field should be read only mandatory at commodity maker stage")
	public void user_076_verify_poposed_amount_field_should_be_read_only_mandatory_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("proposed_amount_textbox"))
						.getAttribute("type");
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(
								commodityPoJspaths.getElement("proposed_amount_readonly_verification"))
						.getAttribute("ng-reflect-readonly");
				if (!(fieldTypeVerification.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + commodityPoJspaths.getElement("amountproposed_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertEquals(fieldTypeVerification, "number",
				" proposed amount field is not a text box hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" proposed amount field not a mandatory field hence failed");
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "Proposed amount field is non editable hence failed");
	}

	@And("user_076 verify commodity amount field should be mandatory editable text box at commodity maker stage")
	public void user_076_verify_commodity_amount_field_should_be_mandatory_editable_text_box_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_amount_text_box"))
						.getAttribute("type");
				if (!(fieldTypeVerification.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + commodityPoJspaths.getElement("commodity_amount_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(fieldTypeVerification, "number",
				" commodity amount field is not a text box hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" commodity amount field not a mandatory field hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_amount_text_box"))
						.sendKeys(commodityPOTestData.get("commodity_amount"));
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on save button in commodity po screen")
	public void user_076_click_on_save_button_in_commodity_po_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify system should show the successful vlidation while save the commodity po record")
	public void user_076_verify_system_should_show_the_successful_vlidation_while_save_the_commodity_po_record()
			throws Throwable {
		// toast_container_message
		String saveValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				saveValidation = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (!(saveValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(saveValidation);
		softAssert.assertTrue(saveValidation.contains("Success! Record created"), "Record is not getting saved");

	}

	@And("user_076 verify unit sales price field should be mandatory editable text box at commodity maker stage")
	public void user_076_verify_unit_sales_price_field_should_be_mandatory_editable_text_box_at_commodity_maker_stage()
			throws Throwable {

		softAssert.fail("Unit sales price field is not available hence failed");
	}

	@And("user_076 verify unit purchase price field should be mandatory non editable text box at commodity maker stage")
	public void user_076_verify_unit_purchase_price_field_should_be_mandatory_non_editable_text_box_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("unit_price_input"))
						.getAttribute("type");
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(
								commodityPoJspaths.getElement("unit_purchase_readonly_verification"))
						.getAttribute("ng-reflect-readonly");
				System.out.println("unit price field readonly value " + isFieldReadOnly);
				if (!(fieldTypeVerification.isEmpty()) || isFieldReadOnly.length() > 0) {
					System.out.println("Field length " + isFieldReadOnly.length());
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("unit_price_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertEquals(fieldTypeVerification, "text",
				" unit purchase price field is not a text box hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" unit purchase price field not a mandatory field hence failed");
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "unit purchase price field is non editable hence failed");

	}

	@And("user_076 verify Unit Type field should be mandatory non editable text box at commodity maker stage")
	public void user_076_verify_unit_type_field_should_be_mandatory_non_editable_text_box_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		String isReadOnlyMode = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("unit_type_textbox"))
						.getAttribute("type");
				// ng-reflect-readonly
				isReadOnlyMode = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("unit_type_readonly_verification"))
						.getAttribute("ng-reflect-readonly");

				if (!(fieldTypeVerification.isEmpty()) || !(isReadOnlyMode.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("unit_type_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertEquals(fieldTypeVerification, "text", " unit type field is not a text box hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" unit type field not a mandatory field hence failed");
		softAssert.assertTrue(isReadOnlyMode.equals("true"), "unit type field is non editable hence failed");

	}

	@And("user_076 verify Quantity field should be mandatory non editable text box at commodity maker stage")
	public void user_076_verify_quantity_field_should_be_mandatory_non_editable_text_box_at_commodity_maker_stage()
			throws Throwable {
		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		String isReadOnlyMode = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("quantity_input"))
						.getAttribute("type");
				isReadOnlyMode = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("quantity_readonly_verification"))
						.getAttribute("ng-reflect-readonly");
				if (!(fieldTypeVerification.isEmpty()) || !(isReadOnlyMode.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("quantity_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertEquals(fieldTypeVerification, "text", " quantity field is not a text box hence failed");
		softAssert.assertTrue(fieldMandatoryVerification.contains("*"),
				" quantity field not a mandatory field hence failed");
		softAssert.assertTrue(isReadOnlyMode.equals("true"), "quantity field is non editable hence failed");

	}

	@And("user_076 verify remarks field should be non mandatory editable textbox at commodity maker stage")
	public void user_076_verify_remarks_field_should_be_non_mandatory_editable_textbox_at_commodity_maker_stage()
			throws Throwable {

		String fieldTypeVerification = "";
		String fieldMandatoryVerification = "";
		boolean isFieldEditable = false;
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("remarks_textbox"))
						.getAttribute("type");
				if (!(fieldTypeVerification.isEmpty())) {
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
				fieldMandatoryVerification = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("remarks_mandatory_verification"))
						.toString();

				if (!(fieldMandatoryVerification.isEmpty())) {
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
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("remarks_textbox"))
						.sendKeys(commodityPOTestData.get("remarks"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(fieldTypeVerification, "text", " remarks field is not a text box hence failed");
		softAssert.assertTrue(!(fieldMandatoryVerification.contains("*")),
				" remarks field is mandatory field hence failed");

	}

	// List view validation
	@Then("user_076 verify commodity po screen fields are showing as per the configuration")
	public void user_076_verify_commodity_po_screen_fields_are_showing_as_per_the_configuration() throws Throwable {
		String commodityPoListViewRecord = "";
		for (int i = 0; i <= 300; i++) {
			try {
				commodityPoListViewRecord = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("commodity_po_list_view_fields"))
						.toString();
				if (commodityPoListViewRecord.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(commodityPoListViewRecord.contains("Vendor"),
				"Vendor is not available in list view hence failed");
		softAssert.assertTrue(commodityPoListViewRecord.contains("Commodity Name"),
				"Commodity Name is not available in list view hence failed");
		softAssert.assertTrue(commodityPoListViewRecord.contains("Unit Type"),
				"Unit Type is not available in list view hence failed");
		softAssert.assertTrue(commodityPoListViewRecord.contains("Unit Purchase Price"),
				"Unit Purchase Price is not available in list view hence failed");
		softAssert.assertTrue(commodityPoListViewRecord.contains("Quantity"),
				"Quantity is not available in list view hence failed");
		softAssert.assertTrue(commodityPoListViewRecord.contains("Commodity Amount"),
				"Commodity Amount is not available in list view hence failed");

	}

	@Then("user_076 verify commodity po screen should have add button")
	public void user_076_verify_commodity_po_screen_should_have_add_button() throws Throwable {

		boolean isAddButtonAvaiable = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isAddButtonAvaiable = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_addButton"))
						.isDisplayed();
				if (isAddButtonAvaiable == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isAddButtonAvaiable, "add button not visible hence failed");
	}

	@Then("user_076 verify commodity po screen should have export button")
	public void user_076_verify_commodity_po_screen_should_have_export_button() throws Throwable {
		boolean isExportButtonVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isExportButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_export_button"))
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
		softAssert.assertTrue(isExportButtonVisible, "export button not visible hence failed");
	}

	@And("user_076 click on search button in commodity po screen")
	public void user_076_click_on_search_button_in_commodity_po_screen() throws Throwable {
		boolean isSearchButtonVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isSearchButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_search_button"))
						.isDisplayed();
				if (isSearchButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isSearchButtonVisible, "Search button not visible hence failed");
		javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_search_button"))
				.click();
	}

	@And("user_076 search the invalid search text in commodity po screen")
	public void user_076_search_the_invalid_search_text_in_commodity_po_screen() throws Throwable {
		System.out.println("Invalid search Text " + commodityPOTestData.get("invalid_search_text"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_search_input"))
						.sendKeys(commodityPOTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system wont show the search of invalid search text in commodity po screen")
	public void user_076_verify_system_wont_show_the_search_of_invalid_search_text_in_commodity_po_screen()
			throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("commodity_po_search_result"))
						.toString();
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
		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
				"System is showing search result for invalid search text");

	}

	@And("user_076 search the valid search text in commodity po screen")
	public void user_076_search_the_valid_search_text_in_commodity_po_screen() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_search_input"))
						.sendKeys(commodityPOTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the search of valid search text in commodity po screen")
	public void user_076_verify_system_should_show_the_search_of_valid_search_text_in_commodity_po_screen()
			throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + commodityPoJspaths.getElement("commodity_po_search_result"))
						.toString();
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
		softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
				"System is not showing search result for invalid search text");
	}

	@And("user_076 click on export button in commodity po screen")
	public void user_076_click_on_export_button_in_commodity_po_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(commodityPoJspaths.getElement("commodity_po_export_button"))
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

	@Then("user_076 click on pdf option in commodity po export dropdown")
	public void user_076_click_on_pdf_option_in_commodity_po_export_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("pdf_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify commodity po record should download as pdf format")
	public void user_076_verify_commodity_po_record_should_download_as_pdf_format() throws Throwable {
//File Name : CommodityPurchaseMaker
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CommodityPurchaseMaker")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CommodityPurchaseMaker"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@Then("user_076 click on xlsx option in commodity po export dropdown")
	public void user_076_click_on_xlsx_option_in_commodity_po_export_dropdown() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("xls_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify commodity po record should download as xlsx format")
	public void user_076_verify_commodity_po_record_should_download_as_xlsx_format() throws Throwable {
//File Name: CommodityPurchaseMaker_export
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CommodityPurchaseMaker_export")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CommodityPurchaseMaker_export"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 invoke soft assert in commodity po screen")
	public void user_076_invoke_soft_assert_in_commodity_po_screen() throws Throwable {
		softAssert.assertAll();
	}

}
