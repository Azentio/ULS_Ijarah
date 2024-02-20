package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
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
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	//String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	//String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	Map<String, String> executionData;
	Actions actions = new Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	IjaraLogin ijarahLogin = new IjaraLogin();
	
	JSPaths AssetDetails_js = new JSPaths(excelPath, "AssetDetails_JSPaths", "Ijarah_AssetDetailsFieldName", "JSPath");
	ExcelData AssetDetails_TestData  = new ExcelData(excelTestDataPath,"AppDataEn_AL_AssetD","Dataset ID");
	ExcelData AutoLoanExecutionExcel = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");

	@Then("User_6047 Login with valid credentials-AppDataEntry-AutoLoan-AssetDetails")
	public void user_6047_login_with_valid_credentials_app_data_entry_auto_loan_asset_details() {
		ijarahLogin.loginWithIjaraApplication("userType18");
	}
	@And("User_6047 Get the test data for test case ID AT_AL_ASD_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_asd_01() {
		executionData = AutoLoanExecutionExcel.getTestdata("AT_AL_ASD_01");
		testData =  AssetDetails_TestData.getTestdata(executionData.get("dataSet_ID"));
		//testData =  AssetDetails_TestData.getTestdata("DS01_AT_AL_ASD_01");
	}
	
	@And("User_6047 Search the Referen Id under inbox")
	public void user_6047_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"))
				.sendKeys("5231");
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
	public void user_6047_click_on_asset_details_segment_button() throws Throwable {
//		String lengthOfTheSegmentButton = "";
//		boolean isClicked = false;
//		for (int i = 0; i <= 300; i++) {
//			try {
//				lengthOfTheSegmentButton = javascriptHelper.executeScript(
//						"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length")
//						.toString();
//				if ((!lengthOfTheSegmentButton.isEmpty())) {
//					break;
//				}
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		int premitiveSegmentLength = Integer.parseInt(lengthOfTheSegmentButton);
//		// document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[14].innerText
//		String segmentLabelName = "";
//		for (int i = 0; i < premitiveSegmentLength; i++) {
//			try {
//				for (int j = 0; j <= 200; j++) {
//					segmentLabelName = javascriptHelper.executeScript(
//							"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
//									+ "].innerText")
//							.toString();
//					System.out.println("Segment Label Name " + segmentLabelName);
//					if (segmentLabelName.equalsIgnoreCase("Asset Details")) {
//						javascriptHelper.executeScriptWithWebElement(
//								"document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
//										+ "]")
//								.click();
//						isClicked = true;
//						break;
//
//					} else if (!(segmentLabelName.equalsIgnoreCase("Asset Details"))) {
//						isClicked = false;
//						break;
//					}
//				}
//
//			} catch (Exception e) {
//			}
//			if (isClicked == true) {
//				break;
//			}
//		}
		Thread.sleep(1500);
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Asset Details")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
			//		addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}

	}

	@Then("User_6047 verify the add button in asset details segment")
	public void user_6047_verify_the_add_button_in_asset_details_segment() {
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
	public void user_6047_to_verify_asset_manufacture_should_be_mandatory_editable_lookup_value() {
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
	@Then("User_6047 verify year of manufacture field should be mandatory editable numeric")
	public void user_6047_verify_year_of_manufacture_field_should_be_mandatory_editable_numeric() {
		WebElement yearOfmanufacture = null;
		for (int i = 0; i <= 150; i++) {
			try {

				yearOfmanufacture = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_verification"));
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_verification"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("year_of_manufacture_calendar_input_Today"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String inputFieldMandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				inputFieldMandatoryVerification = javascriptHelper
						.executeScript("return "
								+ AssetDetails_js.getElement("year_of_manufacture_mandatory_verification"))
						.toString();
			
				if ((inputFieldMandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
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
		softAssert.assertTrue(agentmobilenumber.getAttribute("type").equalsIgnoreCase("text"),
				"agent mobile number type is not a text hence failed");
	}
	@Then("User_6047 verify Asset Price field in asset detail")
	public void user_6047_verify_asset_price_field_in_asset_detail() {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price")));
		

			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Down Payment field in asset detail")
	public void user_6047_verify_down_payment_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Down Payment Percentage field in asset detail")
	public void user_6047_verify_down_payment_percentage_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_percentage"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Green Card Issue Date field in asset detail")
	public void user_6047_verify_green_card_issue_date_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_issue_date"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Residual Value field in asset detail")
	public void user_6047_verify_residual_value_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("residual_value"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Green Card No field in asset detail")
	public void user_6047_verify_green_card_no_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_number"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Weight field in asset detail")
	public void user_6047_verify_weight_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("weight_in_tons"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Mileage field in asset detail")
	public void user_6047_verify_mileage_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("mileage"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Country of Manufacturing field in asset detail")
	public void user_6047_verify_country_of_manufacturing_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("country_of_manufacture"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Asset Agreed Fulfilment Location field in asset detail")
	public void user_6047_verify_asset_agreed_fulfilment_location_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_agreed_fulfilment_location"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Location of Signing the Agreement field in asset detail")
	public void user_6047_verify_location_of_signing_the_agreement_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("location_of_signing"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Asset Received Location field in asset detail")
	public void user_6047_verify_asset_received_location_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_received_location"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify Remark field in asset detail")
	public void user_6047_verify_remark_field_in_asset_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("remarks"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify Asset Price should be Mandatory,editable,numeric")
	public void user_6047_verify_asset_price_should_be_mandatory_editable_numeric() {
		WebElement AssetPrice = null;
		for (int i = 0; i <= 300; i++) {
			try {

				AssetPrice = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input"));
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input")));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input"))
						.sendKeys(testData.get("asset_price"));
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
						.executeScript("return " + AssetDetails_js.getElement("asset_price_mandatory_verification"))
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
		softAssert.assertTrue((inputFieldMandatoryVerification.contains("*")),
				"asset price is a mandatory field hence failed");
		softAssert.assertTrue(AssetPrice.getAttribute("type").equalsIgnoreCase("number"),
				"asset price is not a numeric hence failed");
	}

	@Then("User_6047 verify Down Payment should be non-Mandatory,editable,numeric")
	public void user_6047_verify_down_payment_should_be_non_mandatory_editable_numeric() {
		WebElement DownPayment = null;
		for (int i = 0; i <= 300; i++) {
			try {

				DownPayment = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_input"))
						.sendKeys(testData.get("down_payment"));
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
								"return " + AssetDetails_js.getElement("down_payment_mandatory_verification"))
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
		softAssert.assertTrue(DownPayment.getAttribute("type").equalsIgnoreCase("number"),
				"down payment is not a number hence failed");
	}

	@Then("User_6047 verify Down Payment Percentage should be non-Mandatory,editable,numeric")
	public void user_6047_verify_down_payment_percentage_should_be_non_mandatory_editable_numeric() {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_percentage_input"));
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_percentage_input"))
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
								+ AssetDetails_js.getElement("down_payment_percentage_mandatory_verification"))
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

	@Then("User_6047 verify Green Card Issue Date should be non-Mandatory,editable,date")
	public void user_6047_verify_green_card_issue_date_should_be_non_mandatory_editable_numeric() {
		String mandatoryVerification = "";
		WebElement GreenCardIssueDate= null;
		for (int i = 0; i <= 300; i++) {
			try {

				GreenCardIssueDate = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_issue_date_calendar"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_issue_date_calendar"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(AssetDetails_js.getElement("green_card_issue_date_mandatory_verification"));
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ AssetDetails_js.getElement("green_card_issue_date_mandatory_verification"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(GreenCardIssueDate.getAttribute("ng-reflect-icon").equalsIgnoreCase("pi pi-calendar"),
				"Green Card Issue Date is not a numeric hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"green card issue date field is mandatory field hence failed");
	}

	@Then("User_6047 verify Residual Value should be non-Mandatory,editable,numeric")
	public void user_6047_verify_residual_value_should_be_non_mandatory_editable_numeric() {
		WebElement numberOfCylinder = null;
		for (int i = 0; i <= 300; i++) {
			try {

				numberOfCylinder = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("residual_value_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("residual_value_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("residual_value_input"))
						.sendKeys(testData.get("residual_value"));
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
								"return " + AssetDetails_js.getElement("residual_value_mandatory_verification"))
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

	@Then("User_6047 verify Green Card No should be non-Mandatory,editable,numeric")
	public void user_6047_verify_green_card_no_should_be_non_mandatory_editable_numeric() {
		WebElement GreenCardNo = null;
		for (int i = 0; i <= 300; i++) {
			try {

				GreenCardNo = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_number_input"));
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_number_input")));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("green_card_number_input"))
						.sendKeys(testData.get("green_card_number"));
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
								"return " + AssetDetails_js.getElement("green_card_number_mandatory_verification"))
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
		softAssert.assertTrue(GreenCardNo.getAttribute("type").equalsIgnoreCase("text"),
				"green card number is not a number hence failed");
	}

	@Then("User_6047 verify Weight should be non-Mandatory,editable,numeric")
	public void user_6047_verify_weight_should_be_non_mandatory_editable_numeric() {
		WebElement Weight = null;
		for (int i = 0; i <= 300; i++) {
			try {

				Weight = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("weight_in_tons_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("weight_in_tons_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("weight_in_tons_input"))
						.sendKeys(testData.get("weight_in_tons"));
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
								"return " + AssetDetails_js.getElement("weight_in_tons_mandatory_verification"))
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
		softAssert.assertTrue(Weight.getAttribute("type").equalsIgnoreCase("number"),
				"weight in tons is not a number hence failed");
	}

	@Then("User_6047 verify Mileage should be non-Mandatory,editable,numeric")
	public void user_6047_verify_mileage_should_be_non_mandatory_editable_numeric() {
		WebElement Mileage = null;
		for (int i = 0; i <= 300; i++) {
			try {

				Mileage = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("milage_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("milage_input")).click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("milage_input"))
						.sendKeys(testData.get("mileage"));
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
						.executeScript("return " + AssetDetails_js.getElement("mileage_mandatory_verification"))
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
		softAssert.assertTrue(Mileage.getAttribute("type").equalsIgnoreCase("number"),
				"milage field in tons is not a number hence failed");
	}

	@Then("User_6047 verify Country of Manufacturing should be non-Mandatory,editable,lookup value")
	public void user_6047_verify_country_of_manufacturing_should_be_non_mandatory_editable_lookup_value() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("country_of_manufacture_dropdown"))
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
			System.out.println("Map " + testData.get("country_of_manufacture").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("country_of_manufacture")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("country_of_manufacture_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("country_of_manufacture_dropdown"))
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

	@Then("User_6047 verify Asset Agreed Fulfilment Location should be Mandatory,editable,lookup value")
	public void user_6047_verify_asset_agreed_fulfilment_location_should_be_mandatory_editable_lookup_value() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_agreed_fulfilment_location_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						AssetDetails_js.getElement("asset_agreed_fulfilment_location_dropdown")).click();
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
			System.out.println("Map " + testData.get("asset_agreed_fulfilment_location").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((testData.get("asset_agreed_fulfilment_location")).trim())) {

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
								AssetDetails_js.getElement("asset_agreed_fulfilment_location_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(
								AssetDetails_js.getElement("asset_agreed_fulfilment_location_dropdown"))
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

	@Then("User_6047 verify Location of Signing the Agreement should be Mandatory,editable,lookup value")
	public void user_6047_verify_location_of_signing_the_agreement_should_be_mandatory_editable_lookup_value() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						AssetDetails_js.getElement("location_of_signing_the_agreem_dropdown")).click();
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
			System.out.println("Map " + testData.get("location_of_signing_the_agreement").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((testData.get("location_of_signing_the_agreement")).trim())) {

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
								AssetDetails_js.getElement("location_of_signing_the_agreem_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(
								AssetDetails_js.getElement("location_of_signing_the_agreem_dropdown"))
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

	@Then("User_6047 verify Asset Received Location should be Mandatory,editable,lookup value")
	public void user_6047_verify_asset_received_location_should_be_mandatory_editable_lookup_value() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_received_location_dropdown"))
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
			System.out.println("Map " + testData.get("asset_received_location").trim());
			if ((dropdownString.trim())
					.equalsIgnoreCase((testData.get("asset_received_location")).trim())) {

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
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_received_location_dropdown"))
						.getAttribute("aria-label");
				dropDownAttribute = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_received_location_dropdown"))
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

	@Then("User_6047 verify Remark should be Mandatory,editable,textbox")
	public void user_6047_verify_remark_should_be_mandatory_editable_textbox() {
		WebElement Remark = null;
		for (int i = 0; i <= 300; i++) {
			try {

				Remark = javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("remarks_input"));
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("remarks_input")).click();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("remarks_input"))
						.sendKeys(testData.get("remarks"));
				Thread.sleep(7000);
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
						.executeScript("return " + AssetDetails_js.getElement("remarks_mandatory_verification"))
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
		softAssert.assertTrue(Remark.getAttribute("type").equalsIgnoreCase("text"),
				"remarks field not a text hence failed");
	}
	@Then("User_6047 Enter the character input in number of cylender input box")
	public void user_6047_enter_the_character_input_in_number_of_cylender_input_box() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_cylender_input")));
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_cylender_input")));

				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("number_of_cylender_input"))
						.sendKeys(testData.get("Character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify number of cylender input field not accept the number of cylender input")
	public void user_6047_verify_number_of_cylender_input_field_not_accept_the_number_of_cylender_input() {
		String numberOfCylenderFieldQuery = AssetDetails_js.getElement("number_of_cylender_input") + "innerText";
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

	@Then("User_6047 Enter the negative input in Down Payment input box")
	public void user_6047_enter_the_negative_input_in_down_payment_input_box() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_input")));
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("down_payment_input"))
						.sendKeys(testData.get("negative_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify agent Down Payment field should show the validation for negative input")
	public void user_6047_verify_agent_down_payment_field_should_show_the_validation_for_negative_input() {
		String DownPaymentFieldValidation = "";

		for (int i = 0; i <= 300; i++) {
			try {
				DownPaymentFieldValidation = javascriptHelper
						.executeScript(
								"return " + AssetDetails_js.getElement("downpayment_fieldError_validation"))
						.toString();
				System.out.println(DownPaymentFieldValidation);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Please enter a value that is no less than 0", DownPaymentFieldValidation);
	}

	@Then("User_6047 Enter the special character input in asset price input box")
	public void user_6047_enter_the_special_character_input_in_asset_price_input_box() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input")));
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input")));

				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("asset_price_input"))
						.sendKeys(testData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify asset price input field not accept the special character input")
	public void user_6047_verify_asset_price_input_field_not_accept_the_special_character_input() {
		String assetprice = AssetDetails_js.getElement("asset_price_input") + "innerText";
		boolean isassetpriceFieldHaveValue = true;
		for (int i = 0; i <= 300; i++) {
			try {
				String numberOfCylender = javascriptHelper.executeScript("return " + assetprice)
						.toString();
				if ((numberOfCylender.isEmpty())) {
					isassetpriceFieldHaveValue = false;
					break;
				}
			} catch (Exception e) {

			}
		}
		Assert.assertTrue(isassetpriceFieldHaveValue);
	}
	@Then("User_6047 click the Save button")
	public void user_6047_click_the_save_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("SaveButton"))).build().perform();
				javascriptHelper.executeScriptWithWebElement(AssetDetails_js.getElement("SaveButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	}
