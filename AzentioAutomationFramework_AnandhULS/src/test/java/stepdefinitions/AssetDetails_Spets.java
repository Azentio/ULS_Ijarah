package stepdefinitions;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AssetDetails_Spets extends BaseClass {
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getTestDataFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths assetDetailsJSPaths = new JSPaths(excelPath, "assetDetails_WebElements", "Ijarah_AssetDetailsFieldName",
			"JSPath");

	ExcelData excelDataForAssetDetailsTestData = new ExcelData(excelTestDataPath, "Ijarah_AssetDetailsTestData",
			"Dataset ID");
	ExcelData excelDataForAssetDetailsExecution = new ExcelData(excelTestDataPath, "Ijarah_AssetdetailsExecution",
			"TestCase ID");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	Map<String, String> assetDetailsTestData = new HashMap<>();
	Map<String, String> assetDetailsExecutionData = new HashMap<>();
	Robot robot;

	@And("get the test data for test case ID AT_IAD_002")
	public void get_the_test_data_for_test_case_id_AT_IAD_002() throws Throwable {
		assetDetailsExecutionData = excelDataForAssetDetailsExecution.getTestdata("AT_IAD_002");
		assetDetailsTestData = excelDataForAssetDetailsTestData
				.getTestdata(assetDetailsExecutionData.get("dataSet_ID"));

	}

	@And("get the test data for test case ID AT_IAD_001")
	public void get_the_test_data_for_test_case_id_AT_IAD_001() throws Throwable {

		assetDetailsExecutionData = excelDataForAssetDetailsExecution.getTestdata("AT_IAD_001");
		assetDetailsTestData = excelDataForAssetDetailsTestData
				.getTestdata(assetDetailsExecutionData.get("dataSet_ID"));

	}

	@And("search the record reference number in search text box for asset details screen")
	public void search_the_record_reference_number_in_search_text_box_for_asset_details_screen() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(assetDetailsTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("select the record form mail box for asset details screen")
	public void select_the_record_form_mail_box_for_asset_details_screen() throws Throwable {

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
					if (recordRefNumber.equals(assetDetailsTestData.get("record_reference_number"))) {
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

	@And("click on asset details segment button")
	public void click_on_asset_details_segment_button() throws Throwable {

		// document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length
//document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[0]
		String lengthOfTheSegmentButton = "";
		boolean isClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				lengthOfTheSegmentButton = javascriptHelper.executeScript(
						"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length")
						.toString();
				if ((!lengthOfTheSegmentButton.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveSegmentLength = Integer.parseInt(lengthOfTheSegmentButton);
		// document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[14].innerText
		String segmentLabelName = "";
		for (int i = 0; i < premitiveSegmentLength; i++) {
			try {
				for (int j = 0; j <= 200; j++) {
					segmentLabelName = javascriptHelper.executeScript(
							"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
									+ "].innerText")
							.toString();
					System.out.println("Segment Label Name " + segmentLabelName);
					if (segmentLabelName.equalsIgnoreCase("Asset Details")) {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
										+ "]")
								.click();
						isClicked = true;
						break;

					} else if (!(segmentLabelName.equalsIgnoreCase("Asset Details"))) {
						isClicked = false;
						break;
					}
				}

			} catch (Exception e) {
			}
			if (isClicked == true) {
				break;
			}
		}

	}

	@And("click on add button in asset details tab")
	public void click_on_add_button_in_asset_details_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("AssetDetails_AddButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on save button without enter any mandatory details")
	public void click_on_save_button_without_enter_any_mandatory_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify system should show the validation for mandatory field in aset details screen")
	public void verify_system_should_show_the_validation_for_mandatory_field_in_aset_details_screen() throws Throwable {
		String mandatoryToastvalidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryToastvalidation = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_message")).toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Please fill all the details", mandatoryToastvalidation);
	}

	@And("enter the special character in plate number arabic field")
	public void enter_the_special_character_in_plate_number_arabic_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plateNumber_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plateNumber_input"))
						.sendKeys(assetDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify plate number arabic field should show the validation for special character input")
	public void verify_plate_number_arabic_field_should_show_the_validation_for_special_character_input()
			throws Throwable {
		String plateNumberFieldValidation = "";

		for (int i = 0; i <= 300; i++) {
			try {
				plateNumberFieldValidation = javascriptHelper
						.executeScript("return " + assetDetailsJSPaths.getElement("plateNumber_fieldLevelValidation"))
						.toString();
				System.out.println("Plate Number " + plateNumberFieldValidation);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Invalid input", plateNumberFieldValidation);

	}

	@And("enter the negative input in agent mobile number field")
	public void enter_the_negative_input_in_agent_mobile_number_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_mobile_number_input")));
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_mobile_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_mobile_number_input"))
						.sendKeys(assetDetailsTestData.get("negative_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify agent mobile number field should show the validation for negative input")
	public void verify_agent_mobile_number_field_should_show_the_validation_for_negative_input() throws Throwable {
		String agentMobileNumberFieldValidation = "";

		for (int i = 0; i <= 300; i++) {
			try {
				agentMobileNumberFieldValidation = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("agent_mobile_number_fieldLevel_validation"))
						.toString();
				System.out.println(agentMobileNumberFieldValidation);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Invalid Mobile Number", agentMobileNumberFieldValidation);
	}

	@And("enter the character input in number of cylender input box")
	public void enter_the_character_input_in_number_of_cylender_input_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_cylender_input")));
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_cylender_input")));

				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_cylender_input"))
						.sendKeys(assetDetailsTestData.get("Character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify number of cylender input field wont accept the number of cylender input")
	public void verify_number_of_cylender_input_field_wont_accept_the_number_of_cylender_input() throws Throwable {
		String numberOfCylenderFieldQuery = assetDetailsJSPaths.getElement("number_of_cylender_input") + "innderText";
		boolean isNumberOfCylenderFieldHaveValue = true;
		for (int i = 0; i <= 300; i++) {
			try {
				String numberOfCylender = javascriptHelper.executeScript("return " + numberOfCylenderFieldQuery)
						.toString();
				if ((numberOfCylender.isEmpty())) {
					isNumberOfCylenderFieldHaveValue = false;
					break;
				}
			} catch (Exception e) {

			}
		}
		Assert.assertTrue(isNumberOfCylenderFieldHaveValue);
	}

	@Then("verify asset caregory field should be mandatory editable lookup")
	public void verify_asset_caregory_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_category_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_category").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_category")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_category_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_category_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				"Asset category field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"Asset category field is not a look up hence its failed");

	}

	@Then("verify asset manufacture field should be mandatory editable lookup")
	public void verify_asset_manufacture_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_manufacture_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_manufacture").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_manufacture")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_manufacture_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_manufacture_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				"Asset manufacture field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"Asset manufacture field is not a lookup hence failed");
	}

	@Then("verify asset model field should be mandatory editable lookup")
	public void verify_asset_model_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_model_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_model").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_model")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_model_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_model_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				"Asset model field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"Asset model field is not a lookup field hence failed");
	}

	@Then("verify asset model type field should be non mandatory editable textbox")
	public void verify_asset_model_type_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_model_type_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_model_type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_model_type")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_model_type_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_model_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				"asset model type field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"asset model type field is not a dropdown hence failed");
	}

	@Then("verify year of manufacture field should be mandatory editable numeric")
	public void verify_year_of_manufacture_field_should_be_mandatory_editable_numeric() throws Throwable {
		String mandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(assetDetailsJSPaths.getElement("year_of_manufacture_mandatory_verification"));
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ assetDetailsJSPaths.getElement("year_of_manufacture_mandatory_verification"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"Year of manufacture field is not a mandatiry field hence failed");
	}

	@Then("verify asset condition field should be mandatory and editable lookup")
	public void verify_asset_condition_field_should_be_mandatory_and_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_condition_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_condition").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_condition")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_condition_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_condition_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				"Asset condition field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"Asset condition field is not a dropdown hence failed");
	}

	@Then("verify asset color field should be non mandatory editable lookup")
	public void verify_asset_color_field_should_be_non_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_color_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_color").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_color")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_color_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_color_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(fieldMandatoryAttribute.contains("*")),
				"asset color field is a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"), "asset color field is not a dropdown hence failed");
	}

	@Then("verify drivetrain field should be non mandatory editable textbox")
	public void verify_drivetrain_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("drivetrain_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("drivetrain").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("drivetrain")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("drivetrain_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("drivetrain_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.fail("drivetrain field should be text box in application screen it a dropdown it seems");
		softAssert.assertTrue(!(fieldMandatoryAttribute.contains("*")), "drivetrain field is mandatory hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"));
	}

	@Then("verify number of cylinder field should benon mandatory editable numeric")
	public void verify_number_of_cylinder_field_should_benon_mandatory_editable_numeric() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_cylinder_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_cylinder_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_cylinder_input"))
						.sendKeys(assetDetailsTestData.get("number_of_cylinder"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("number_of_cylinder_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"Number of cylinder field is mandatory hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"Number of cylinder field tyep is not a numeric hence failed");

	}

	@Then("verify volume of engine field should be non mandatory editable numeric field")
	public void verify_volume_of_engine_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("volume_of_engine_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("volume_of_engine_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("volume_of_engine_input"))
						.sendKeys(assetDetailsTestData.get("volume_of_engine"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("volume_of_engine_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"Volume of engine field is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"Volume of engine field type is not a numeric hence failed");
	}

	@Then("verfy no of units field should be non mandatory editable numeric field")
	public void verfy_no_of_units_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_units_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_units_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("number_of_units_input"))
						.sendKeys(assetDetailsTestData.get("no_of_units"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("number_of_units_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"Number of units field is mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"Number of units field type is not a numeric hence failed");
	}

	@Then("verify chassis number field should be mandatory editable numeric field")
	public void verify_chassis_number_field_should_be_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("chasis_number_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("chasis_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("chasis_number_input"))
						.sendKeys(assetDetailsTestData.get("chasis_number"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("chasis_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Chassis number " + inputFieldMandatoryVerification);
		softAssert.assertTrue(inputFieldMandatoryVerification.contains("*"),
				"Chassis number field is not a mandatory field");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"chassis number field type is not a numeric");
	}

	@Then("verify plate number field should be mandatory editable numeric field")
	public void verify_plate_number_field_should_be_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plate_number_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plate_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plate_number_input"))
						.sendKeys(assetDetailsTestData.get("plate_number"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("plate_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Plate number field label " + inputFieldMandatoryVerification);
		softAssert.assertTrue(inputFieldMandatoryVerification.contains("*"),
				"plate number field is not a mandatory hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"plate number field type is not a numeric field");
	}

	@Then("verify plate number arabic field should ve mandatory editable numeric field")
	public void verify_plate_number_arabic_field_should_ve_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plate_number_arabic_input"));
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plate_number_arabic_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("plate_number_arabic_input"))
						.sendKeys(assetDetailsTestData.get("plate_number_arabic"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return "
								+ assetDetailsJSPaths.getElement("plate_number_arabic_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(inputFieldMandatoryVerification.contains("*"),
				"plate number arabic field is non manatory hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"plate number arabic field type is not a numeric hence failed");

	}

	@Then("verify asset dealer field should be mandatory editable lookup")
	public void verify_asset_dealer_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_dealer_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_dealer_dropdown").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("asset_dealer_dropdown")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_dealer_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_dealer_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("asset dealer mandatory " + fieldMandatoryAttribute);
		System.out.println(fieldMandatoryAttribute.contains("*"));
		boolean assetDealerField = fieldMandatoryAttribute.contains("*");
		System.out.println("Boolean asset dealer field " + assetDealerField);
		softAssert.assertEquals(assetDealerField, true, "Asset dealer field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"Asset dealer field is not a dropdown hence failed");
	}

	@Then("verify agent name field should be non mandatory editable lookup")
	public void verify_agent_name_field_should_be_non_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_name_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("agent_name").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("agent_name")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_name_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_name_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(fieldMandatoryAttribute.contains("*")),
				"Asset dealer field is not a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"Asset dealer field is not a dropdown hence failed");
	}

	@Then("verify agent email ID field should be non mandatory editable textbox")
	public void verify_agent_email_id_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_email_id_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_email_id_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_email_id_input"))
						.sendKeys(assetDetailsTestData.get("agent_email_id"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("agent_email_id_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"agent email ID is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("text"),
				"agent email ID type is not a text hence failed");
	}

	@Then("verify agent mobile number field should be non mandatory editable textbox")
	public void verify_agent_mobile_number_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_mobile_number_input"));
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_mobile_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("agent_mobile_number_input"))
						.sendKeys(assetDetailsTestData.get("agent_mobile_number"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return "
								+ assetDetailsJSPaths.getElement("agent_mobile_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"agent mobile number is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("text"),
				"agent mobile number type is not a text hence failed");
	}

	@Then("verify asset price field should be non mandatory editable numeric")
	public void verify_asset_price_field_should_be_non_mandatory_editable_numeric() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_price_input"));
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_price_input")));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_price_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_price_input"))
						.sendKeys(assetDetailsTestData.get("asset_price"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return " + assetDetailsJSPaths.getElement("asset_price_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"asset price is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"asset price is not a numeric hence failed");
	}

	@Then("verify downpayment field should be non mandatory editable numeric field'")
	public void verify_downpayment_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("down_payment_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("down_payment_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("down_payment_input"))
						.sendKeys(assetDetailsTestData.get("down_payment"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("down_payment_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"down payment is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"down payment is not a number hence failed");
	}

	@Then("verify down payment percentage field should be non mandatory editable numeric field")
	public void verify_down_payment_percentage_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("down_payment_percentage_input"));
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("down_payment_percentage_input"))
						.click();

				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return "
								+ assetDetailsJSPaths.getElement("down_payment_percentage_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"down payment percentage a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"down payment percentage is not a numeric hence failed");
	}

	@Then("verify green card issue date field should be non mandatory editable editable date field")
	public void verify_green_card_issue_date_field_should_be_non_mandatory_editable_editable_date_field()
			throws Throwable {
		String mandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(assetDetailsJSPaths.getElement("green_card_issue_date_mandatory_verification"));
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ assetDetailsJSPaths.getElement("green_card_issue_date_mandatory_verification"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"green card issue date field is mandatory field hence failed");
	}

	@Then("verify residual value field should be non mandatory editable numeric")
	public void verify_residual_value_field_should_be_non_mandatory_editable_numeric() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("residual_value_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("residual_value_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("residual_value_input"))
						.sendKeys(assetDetailsTestData.get("residual_value"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("residual_value_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"residual value is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"residual value is not a number hence failed");
	}

	@Then("verify green card no field should be non mandatory editable numeric field")
	public void verify_green_card_no_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("green_card_number_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("green_card_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("green_card_number_input"))
						.sendKeys(assetDetailsTestData.get("green_card_number"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("green_card_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"green card number is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"green card number is not a number hence failed");
	}

	@Then("verify weight field should be non mandatory editable numeric field")
	public void verify_weight_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("weight_in_tons_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("weight_in_tons_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("weight_in_tons_input"))
						.sendKeys(assetDetailsTestData.get("weight_in_tons"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsJSPaths.getElement("weight_in_tons_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"weight in tons is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"weight in tons is not a number hence failed");
	}

	@Then("verify mileage field should be non mandatory editable numeric field")
	public void verify_mileage_field_should_be_non_mandatory_editable_numeric_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("milage_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("milage_input")).click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("milage_input"))
						.sendKeys(assetDetailsTestData.get("mileage"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return " + assetDetailsJSPaths.getElement("mileage_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(inputFieldMandatoryVerification.contains("*")),
				"milage field is a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("number"),
				"milage field in tons is not a number hence failed");
	}

	@Then("verify country of manufacture field should be non mandatory editable lookup")
	public void verify_country_of_manufacture_field_should_be_non_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("country_of_manufacture_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("country_of_manufacture").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((assetDetailsTestData.get("country_of_manufacture")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("country_of_manufacture_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("country_of_manufacture_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Country of manufacture field " + fieldMandatoryAttribute);
		boolean countryOfManufactureFieldStatus = !(fieldMandatoryAttribute.contains("*"));
		System.out.println(countryOfManufactureFieldStatus);
		if (countryOfManufactureFieldStatus == false) {
			countryOfManufactureFieldStatus = true;
		}
		softAssert.assertTrue(countryOfManufactureFieldStatus,
				"country of manufacture field is a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"country of manufacture field is not a look up hence its failed");
	}

	@Then("verify asset agreed fulfilment location field should be mandatory editable lookup")
	public void verify_asset_agreed_fulfilment_location_field_should_be_mandatory_editable_lookup() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						assetDetailsJSPaths.getElement("asset_agreed_fulfilment_location_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_agreed_fulfilment_location").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((assetDetailsTestData.get("asset_agreed_fulfilment_location")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsJSPaths.getElement("asset_agreed_fulfilment_location_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsJSPaths.getElement("asset_agreed_fulfilment_location_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				"asset agreement fulfilment field is a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"asset agreement fulfilment field is not a look up hence its failed");
	}

	@Then("verify location of assigning the agreement field should be editable lookup field")
	public void verify_location_of_assigning_the_agreement_field_should_be_editable_lookup_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						assetDetailsJSPaths.getElement("location_of_signing_the_agreem_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("location_of_signing_the_agreement").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((assetDetailsTestData.get("location_of_signing_the_agreement")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsJSPaths.getElement("location_of_signing_the_agreem_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsJSPaths.getElement("location_of_signing_the_agreem_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Field label " + fieldMandatoryAttribute);
		softAssert.assertTrue(fieldMandatoryAttribute.contains("*"),
				" location of signing the agreement field is a non mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"location of signing the agreement field is not a look up hence its failed");
	}

	@Then("verify asset received location field should be non mandatory editable lookup field")
	public void verify_asset_received_location_field_should_be_non_mandatory_editable_lookup_field() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_received_location_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + assetDetailsTestData.get("asset_received_location").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((assetDetailsTestData.get("asset_received_location")).trim())) {

				for (int k = 0; k <= 300; k++) {
					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());

						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}

		}
		String fieldMandatoryAttribute = "";
		String dropDownAttribute = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldMandatoryAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_received_location_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("asset_received_location_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isEmpty()) || !(dropDownAttribute.isEmpty())) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(fieldMandatoryAttribute.contains("*")),
				" asset received location field is a mandatory field hence failed");
		softAssert.assertTrue(dropDownAttribute.contains("Select"),
				"asset received location field is not a look up hence its failed");
	}

	@Then("verify remarks field should be mandatory editable text field")
	public void verify_remarks_field_should_be_mandatory_editable_text_field() throws Throwable {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(assetDetailsJSPaths.getElement("remarks_input"));
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("remarks_input")).click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsJSPaths.getElement("remarks_input"))
						.sendKeys(assetDetailsTestData.get("remarks"));
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return " + assetDetailsJSPaths.getElement("remarks_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(inputFieldMandatoryVerification.contains("*"),
				"remarks field is not a mandatory field hence failed");
		softAssert.assertTrue(numberOfCylinder.getAttribute("type").equalsIgnoreCase("text"),
				"milage field in tons is not a text hence failed");
	}

	@And("click on save button in asset details record")
	public void click_on_save_button_in_asset_details_record() throws Throwable {
		robot = new Robot();
		robot.mouseWheel(-200);

		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify system should show the validation message successfully saved record of asset details")
	public void verify_system_should_show_the_validation_message_successfully_saved_record_of_asset_details()
			throws Throwable {
		String toastMessage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				System.out.println(toastMessage);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("toast_container_message_close_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("invoke softassert validation for asset details screen")
	public void invoke_softassert_validation_for_asset_details_screen() throws Throwable {
		softAssert.assertAll();
	}

}
