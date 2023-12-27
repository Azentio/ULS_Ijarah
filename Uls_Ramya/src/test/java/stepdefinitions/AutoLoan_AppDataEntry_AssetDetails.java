package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_AppDataEntry_AssetDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	//Map<String, String> testData = new HashMap<>();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	JSPaths AssetDetails_js = new JSPaths(excelPath, "assetDetails_WebElements", "Ijarah_AssetDetailsFieldName", "JSPath");
	ExcelData AssetDetails_TestData  = new ExcelData(excelTestDataPath,"AppDataEn_AL_AssetD","Dataset ID");
	

	
	@And("User_6047 Get the test data for test case ID AT_AL_ASD_01")
	public void user_get_the_test_data_for_test_case_id_at_al_asd_01() {
		testData =  AssetDetails_TestData.getTestdata("DS01_AT_AL_ASD_01");
	}
	@And("User_6047 Search the Referen Id under inbox")
	public void user_6047_search_the_ref_id_under_inbox_6047() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"))
				.sendKeys("4138");
				//.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 click on asset details segment button")
	public void user_click_on_asset_details_segment_button() {
		String lengthOfTheSegmentButton = "";
		boolean isClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				lengthOfTheSegmentButton = javascriptHelper.executeScript(
						"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length")
						.toString();
				if ((!lengthOfTheSegmentButton.isBlank())) {
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

	@Then("User_6047 verify the add button in asset details segment")
	public void user_verify_the_add_button_in_asset_details_segment() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("AssetDetails_AddButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 click on add button in asset details tab")
	public void user_6047_click_on_add_button_in_asset_details_tab() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("AssetDetails_AddButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify asset manufacture field in asset detail")
	public void user_6047_verify_asset_manufacture_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_manufacture_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify asset model field in asset detail")
	public void user_6047_verify_asset_model_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify asset model type field in asset detail")
	public void user_6047_verify_asset_model_type_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_type_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify year of manufacture field in asset detail")
	public void user_6047_verify_year_of_manufacture_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_input"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify asset condition field in asset detail")
	public void user_6047_verify_asset_condition_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_condition_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify asset color field in asset detail")
	public void user_6047_verify_asset_color_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_color_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify drivetrain field in asset detail")
	public void user_6047_verify_drivetrain_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("drivetrain_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify number of cylinder in asset detail")
	public void user_6047_verify_number_of_cylinder_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_cylinder"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify volume of engine field in asset detail")
	public void user_6047_verify_volume_of_engine_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("volume_of_engine"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verfy no of units field in asset detail")
	public void user_6047_verfy_no_of_units_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_units"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify chassis number field in asset detail")
	public void user_6047_verify_chassis_number_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("chasis_number"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify plate number field in asset detail")
	public void user_6047_verify_plate_number_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("plate_number"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify asset dealer field in asset detail")
	public void user_6047_verify_asset_dealer_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_dealer_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify agent name field in asset detail")
	public void user_6047_verify_agent_name_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_name_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify agent email ID field in asset detail")
	public void user_6047_verify_agent_email_id_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_email_id"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify agent mobile number field in asset detail")
	public void user_6047_verify_agent_mobile_number_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 To verify Asset Manufacture should be Mandatory,editable,Lookup value")
	public void user_to_verify_asset_manufacture_should_be_mandatory_editable_lookup_value() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_manufacture_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("asset_manufacture").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("asset_manufacture")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_manufacture_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_manufacture_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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


	@Then("User_6047 verify asset model field should be mandatory editable lookup")
	public void user_6047_verify_asset_model_field_should_be_mandatory_editable_lookup() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("asset_model").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("asset_model")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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

	@Then("User_6047 verify asset model type field should be non mandatory editable textbox")
	public void user_6047_verify_asset_model_type_field_should_be_non_mandatory_editable_textbox() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_type_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("asset_model_type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("asset_model_type")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_type_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_model_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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
	@Then("User_6047 verify year of manufacture field should be mandatory editable numeric")
	public void user_6047_verify_year_of_manufacture_field_should_be_mandatory_editable_numeric() {
		WebElement yearOfmanufacture = null;
		for (int i = 0; i <= 300; i++) {
			try {

				yearOfmanufacture = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_input"));
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_input"))
						.sendKeys(testData.get("year of manufacture"));
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
								+ AssetDetails_js.getElement("year_of_manufacture_mandatory_verification"))
						.toString();
				if ((inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(yearOfmanufacture.getAttribute("type").equalsIgnoreCase("text"),
				"agent mobile number type is not a text hence failed");
	}

	@Then("User_6047 To verify asset condition field should be mandatory and editable lookup")
	public void user_6047_to_verify_asset_condition_field_should_be_mandatory_and_editable_lookup() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_condition_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("asset_condition").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("asset_condition")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_condition_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_condition_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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

	@Then("User_6047 To verify asset color field should be non mandatory editable lookup")
	public void user_6047_to_verify_asset_color_field_should_be_non_mandatory_editable_lookup() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_color_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("asset_color").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("asset_color")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_color_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_color_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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

	@Then("User_6047 To verify drivetrain field should be non mandatory editable textbox")
	public void user_6047_to_verify_drivetrain_field_should_be_non_mandatory_editable_textbox() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("drivetrain_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " +testData.get("drivetrain").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("drivetrain")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("drivetrain_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("drivetrain_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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

	@Then("User_6047 To verify number of cylinder field should be non mandatory editable numeric")
	public void user_6047_to_verify_number_of_cylinder_field_should_be_non_mandatory_editable_numeric() {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number_input"));
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number_input"))
						.sendKeys(testData.get("agent_mobile_number"));
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
								+ AssetDetails_js.getElement("agent_mobile_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
	
	@Then("User_6047 To verify volume of engine field should be non mandatory editable numeric field")
	public void user_6047_to_verify_volume_of_engine_field_should_be_non_mandatory_editable_numeric_field() {
		WebElement volumeOfEngine = null;
		for (int i = 0; i <= 300; i++) {
			try {

				volumeOfEngine = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("volume_of_engine_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("volume_of_engine_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("volume_of_engine_input"))
						.sendKeys(testData.get("volume_of_engine"));
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
								"return " + AssetDetails_js.getElement("volume_of_engine_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(volumeOfEngine.getAttribute("type").equalsIgnoreCase("number"),
				"Volume of engine field type is not a numeric hence failed");
	}

	@Then("User_6047 To verfy no of units field should be non mandatory editable numeric field")
	public void user_6047_to_verfy_no_of_units_field_should_be_non_mandatory_editable_numeric_field() {
		WebElement numberOfunits = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfunits = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_units_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_units_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_units_input"))
						.sendKeys(testData.get("no_of_units"));
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
								"return " + AssetDetails_js.getElement("number_of_units_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(numberOfunits.getAttribute("type").equalsIgnoreCase("number"),
				"Number of units field type is not a numeric hence failed");
	}

	@Then("User_6047 To verify chassis number field should be mandatory editable numeric field")
	public void user_6047_to_verify_chassis_number_field_should_be_mandatory_editable_numeric_field() {
		WebElement chassisnumber = null;
		for (int i = 0; i <= 300; i++) {
			try {

				chassisnumber = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("chasis_number_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("chasis_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("chasis_number_input"))
						.sendKeys(testData.get("chasis_number"));
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
								"return " + AssetDetails_js.getElement("chasis_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(chassisnumber.getAttribute("type").equalsIgnoreCase("number"),
				"chassis number field type is not a numeric");
	}

	@Then("User_6047 To verify plate number field should be mandatory editable numeric field")
	public void user_6047_to_verify_plate_number_field_should_be_mandatory_editable_numeric_field() {
		WebElement platenumber = null;
		for (int i = 0; i <= 300; i++) {
			try {

				platenumber = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("plate_number_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("plate_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("plate_number_input"))
						.sendKeys(testData.get("plate_number"));
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
								"return " + AssetDetails_js.getElement("plate_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(platenumber.getAttribute("type").equalsIgnoreCase("number"),
				"plate number field type is not a numeric field");
	}

	@Then("User_6047 To verify Asset Dealer in Dealer Details section")
	public void user_6047_to_verify_asset_dealer_in_dealer_details_section() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_dealer"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify asset dealer field should be mandatory editable lookup")
	public void user_6047_to_verify_asset_dealer_field_should_be_mandatory_editable_lookup() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_dealer_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("asset_dealer_dropdown").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("asset_dealer_dropdown")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_dealer_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_dealer_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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

	@Then("User_6047 verify agent name in Registration Agent Detail section")
	public void user_6047_verify_agent_name_in_registration_agent_detail_section() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_name"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify agent email ID in Registration Agent Detail section")
	public void user_6047_verify_agent_email_id_in_registration_agent_detail_section() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_email_id"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify agent mobile number in Registration Agent Detail section")
	public void user_6047_verify_agent_mobile_number_in_registration_agent_detail_section() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify agent name field should be non mandatory editable lookup")
	public void user_6047_to_verify_agent_name_field_should_be_non_mandatory_editable_lookup() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("agent_name_dropdown"))
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("agent_name").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("agent_name")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_name_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_name_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if (!(fieldMandatoryAttribute.isBlank()) || !(dropDownAttribute.isBlank())) {
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

	@Then("User_6047 To verify agent email ID field should be non mandatory editable textbox")
	public void user_6047_to_verify_agent_email_id_field_should_be_non_mandatory_editable_textbox() {
		WebElement agentemailID = null;
		for (int i = 0; i <= 300; i++) {
			try {

				agentemailID = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_email_id_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("agent_email_id_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("agent_email_id_input"))
						.sendKeys(testData.get("agent_email_id"));
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
								"return " + AssetDetails_js.getElement("agent_email_id_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(agentemailID.getAttribute("type").equalsIgnoreCase("text"),
				"agent email ID type is not a text hence failed");
	}

	@Then("User_6047 To verify agent mobile number field should be non mandatory editable numeric")
	public void user_6047_to_verify_agent_mobile_number_field_should_be_non_mandatory_editable_numeric() {
		WebElement agentmobilenumber = null;
		for (int i = 0; i <= 300; i++) {
			try {

				agentmobilenumber = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number_input"));
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("agent_mobile_number_input"))
						.sendKeys(testData.get("agent_mobile_number"));
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
								+ AssetDetails_js.getElement("agent_mobile_number_mandatory_verification"))
						.toString();
				if (!(inputFieldMandatoryVerification.isBlank())) {
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
		softAssert.assertTrue(agentmobilenumber.getAttribute("type").equalsIgnoreCase("text"),
				"agent mobile number type is not a text hence failed");
	}
	}
