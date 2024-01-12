package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
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

public class AppDataEntry_AddressDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths assetDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "assetDetails_WebElements",
			"Ijarah_AssetDetailsFieldName", "JSPath");
	IjaraLogin login = new IjaraLogin();
	SoftAssert softAssert = new SoftAssert();
	ExcelData assetDetailsExcelData = new ExcelData(configFileReader.getTestDataFilePath(),
			"Murabaha_AddressDetails_DE_TD", "Dataset ID");
	ExcelData murabahaExecutionSheet = new ExcelData(configFileReader.getTestDataFilePath(),
			"Murabaha_ExecutionTracker", "TestCase ID");
	Map<String, String> assetDetailsTestData = new HashMap<>();
	Map<String, String> murabahExecutionData = new HashMap<>();

	@And("^user_076 login with valid app data entry user ID for murabaha$")
	public void user_076_login_with_valid_app_data_entry_user_ID_for_murabaha() throws Throwable {
		login.loginWithIjaraApplication("userType10");
	}

	@And("^user_076 search app data entry record reference number in mail box$")
	public void user_076_search_app_data_entry_record_reference_number_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getMurabahaDataEntryRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 select the app data entry record at mail box search grid for murabaha$")
	public void user_076_select_the_app_data_entry_record_at_mail_box_search_grid_for_murabaha() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
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
					if (recordRefNumber.equals(configFileReader.getMurabahaDataEntryRecordReferenceNumber())) {
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

	@And("^user_076 click on asset details section at app data entry stage$")
	public void user_076_click_on_asset_details_section_at_app_data_entry_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("asset_details_tab"))
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

	@And("^user_076 click on add button in asset details in asset details at app data entry stage$")
	public void user_076_click_on_add_button_in_asset_details_in_asset_details_at_app_data_entry_stage()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("AssetDetails_AddButton"))
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

	@And("^user_076 get test data for test case ID AT_MU_ADE_IAD_04$")
	public void user_076_get_test_data_for_test_case_ID_AT_MU_ADE_IAD_04() throws Throwable {
		murabahExecutionData = murabahaExecutionSheet.getTestdata("AT_MU_ADE_IAD_04");
		assetDetailsTestData = assetDetailsExcelData.getTestdata(murabahExecutionData.get("dataSet_ID"));
	}

	@Then("^user_076 verify delar details section should have asset details field at app data entry stage$")
	public void user_076_verify_delar_details_section_should_have_asset_details_field_at_app_data_entry_stage()
			throws Throwable {
		String labelName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				labelName = javascriptHelper
						.executeScript(
								"return " + assetDetailsElements.getElement("dealer_details_section_verification"))
						.toString();
				if (labelName.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("label Name " + labelName);
		boolean isFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isFieldIsVisible = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("asset_dealer_field_verification"))
						.isDisplayed();
				if (isFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		System.out.println("is Field visible " + isFieldIsVisible);
		softAssert.assertTrue(isFieldIsVisible, "Asset details field is not visible hence failed");
		softAssert.assertEquals(labelName, "Dealer Details", "Delaer details section is not visible");
	}

	@Then("^user_076 verify asset dealer field should be editable mandatory lookup value at app data entry stage$")
	public void user_076_verify_asset_dealer_field_should_be_editable_mandatory_lookup_value_at_app_data_entry_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeVerification = "";

		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("asset_dealer_dropdown"))
						.getAttribute("aria-label");
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("asset_dealer_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if ((mandatoryVerification.length() > 0) && (fieldTypeVerification.length() > 0)) {
					System.out.println("Field Type " + fieldTypeVerification);
					System.out.println("mandatory verification " + mandatoryVerification);
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("asset_dealer_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(assetDetailsTestData.get("asset_dealer"));
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" asset dealer field is non mandatory hence failed ");
		softAssert.assertTrue(fieldTypeVerification.contains("Select"),
				" asset dealer field is not a dropdown hence failed ");

	}

	@Then("^user_076 verify registration details section should have agent name email id and mobile number field at app data entry stage$")
	public void user_076_verify_registration_details_section_should_have_agent_name_email_id_and_mobile_number_field_at_app_data_entry_stage()
			throws Throwable {
		String labelName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				labelName = javascriptHelper
						.executeScript("return "
								+ assetDetailsElements.getElement("registration_details_section_verification"))
						.toString();
				if (labelName.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("label Name " + labelName);
		boolean isAgentnameVisible = false;
		boolean isAgentEmailIDVisible = false;
		boolean isAgentMobileNumberVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isAgentnameVisible = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("asset_dealer_field_verification"))
						.isDisplayed();
				if (isAgentnameVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				isAgentEmailIDVisible = javascriptHelper.executeScriptWithWebElement(
						assetDetailsElements.getElement("agent_email_id_field_verification")).isDisplayed();
				if (isAgentEmailIDVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				isAgentMobileNumberVisible = javascriptHelper
						.executeScriptWithWebElement(
								assetDetailsElements.getElement("agent_mobile_number_field_verification"))
						.isDisplayed();
				if (isAgentMobileNumberVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		System.out.println("is agent name field visible " + isAgentnameVisible);
		System.out.println("is agent email ID field visible " + isAgentEmailIDVisible);
		System.out.println("is agent mobile number field visible " + isAgentMobileNumberVisible);
		softAssert.assertTrue(isAgentnameVisible, "Agent name field is not visible hence failed");
		softAssert.assertTrue(isAgentEmailIDVisible, "Agent email ID field is not visible hence failed");
		softAssert.assertTrue(isAgentMobileNumberVisible, "Agent mobile number field is not visible hence failed");
		softAssert.assertEquals(labelName, "Registration Details", "Registration Details section is not visible");
	}

	@Then("^user_076 verify agent name field should be non mandatory editable lookup value at app data entry stage$")
	public void user_076_verify_agent_name_field_should_be_non_mandatory_editable_lookup_value_at_app_data_entry_stage()
			throws Throwable {

		String mandatoryVerification = "";
		String fieldTypeVerification = "";

		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("agent_name_dropdown"))
						.getAttribute("aria-label");
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("agent_name_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if ((mandatoryVerification.length() > 0) && (fieldTypeVerification.length() > 0)) {
					System.out.println("Field Type " + fieldTypeVerification);
					System.out.println("mandatory verification " + mandatoryVerification);
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("agent_name_dropdown")));
				javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("agent_name_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		clicksAndActionsHelper.jsSelectUsingText(assetDetailsTestData.get("agent_name"));
		softAssert.assertTrue(!(mandatoryVerification.contains("*")), " agent name field is non mandatory hence failed ");
		softAssert.assertTrue(fieldTypeVerification.contains("Select"),
				" agent name field is not a dropdown hence failed ");
	}

	@Then("^user_076 verify agent email id field should be non mandatory editable text box at app data entry stage$")
	public void user_076_verify_agent_email_id_field_should_be_non_mandatory_editable_text_box_at_app_data_entry_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeVerification = "";

		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + assetDetailsElements.getElement("agent_email_id_mandatory_verification"))
						.toString();
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("agent_email_id_input"))
						.getAttribute("type");
				if ((mandatoryVerification.length() > 0) && (fieldTypeVerification.length() > 0)) {
					System.out.println("Field Type " + fieldTypeVerification);
					System.out.println("mandatory verification " + mandatoryVerification);
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("agent_email_id_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(assetDetailsElements.getElement("agent_email_id_input"))
						.sendKeys(assetDetailsTestData.get("agent_email_id"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" agent email ID field is non mandatory hence failed ");
		softAssert.assertTrue(fieldTypeVerification.contains("text"),
				" agent email ID field is not a text input hence failed ");
	}

	@Then("^user_076 verify agent mobile number field should be non mandatory editable numeric at app data entry stage$")
	public void user_076_verify_agent_mobile_number_field_should_be_non_mandatory_editable_numeric_at_app_data_entry_stage()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeVerification = "";

		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ assetDetailsElements.getElement("agent_mobile_number_mandatory_verification"))
						.toString();
				fieldTypeVerification = javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("agent_mobile_number_input"))
						.getAttribute("type");
				if ((mandatoryVerification.length() > 0) && (fieldTypeVerification.length() > 0)) {
					System.out.println("Field Type " + fieldTypeVerification);
					System.out.println("mandatory verification " + mandatoryVerification);
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("agent_mobile_number_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(assetDetailsElements.getElement("agent_mobile_number_input"))
						.sendKeys(assetDetailsTestData.get("agent_mobile_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" agent mobile number field is non mandatory hence failed ");
		softAssert.assertTrue(fieldTypeVerification.contains("number"),
				" agent mobile number field is not a numeric input hence failed ");
	}

	@And("^invoke soft assert in asset details data entry stage for murabaha product$")
	public void invoke_soft_assert_in_asset_details_data_entry_stage_for_murabaha_product() throws Throwable {
		softAssert.assertAll();
	}
}
