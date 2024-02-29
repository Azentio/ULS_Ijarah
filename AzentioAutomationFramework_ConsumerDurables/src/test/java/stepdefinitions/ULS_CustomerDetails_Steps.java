package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ULS_CustomerDetails_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths commonElements = new JSPaths(configFileReader.getJSPathFilePath(), "CommonElements", "CommonFieldName",
			"JSPath");
	JSPaths customerDetailsElements = new JSPaths(configFileReader.getJSPathFilePath(), "CustomerDetailsElements",
			"CustomerDetailsElements", "JSPath");
	JSPaths customerSearchElements = new JSPaths(configFileReader.getJSPathFilePath(), "customer_search_JS",
			"customer_search_fieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData consumerDurablesExecutionSheet = new ExcelData(configFileReader.getTestDataFilePath(),
			"ConumerDurablesExeSheet", "TestCase ID");
	ExcelData customerDetailsDataEntryExcelData = new ExcelData(configFileReader.getTestDataFilePath(),
			"DataEntry_CustDetailsTestData", "Dataset ID");
	Map<String, String> consumerDurablesExecutionData = new HashMap<>();
	Map<String, String> customerDetailsTestData = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	String recordStatus = "";
	String listViewFieldName = "";

	@And("^user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_01$")
	public void user_076_get_the_test_data_for_test_case_id_at_cd_dataentry_custdetails_01() throws Throwable {
		consumerDurablesExecutionData = consumerDurablesExecutionSheet.getTestdata("AT_CD_DATAENTRY_CUSTDETAILS_01");
		System.out.println("Data Set ID " + consumerDurablesExecutionData.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsDataEntryExcelData
				.getTestdata(consumerDurablesExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_02$")
	public void user_076_get_the_test_data_for_test_case_id_at_cd_dataentry_custdetails_02() throws Throwable {
		consumerDurablesExecutionData = consumerDurablesExecutionSheet.getTestdata("AT_CD_DATAENTRY_CUSTDETAILS_02");
		System.out.println("Data Set ID " + consumerDurablesExecutionData.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsDataEntryExcelData
				.getTestdata(consumerDurablesExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_03$")
	public void user_076_get_the_test_data_for_test_case_id_at_cd_dataentry_custdetails_03() throws Throwable {
		consumerDurablesExecutionData = consumerDurablesExecutionSheet.getTestdata("AT_CD_DATAENTRY_CUSTDETAILS_03");
		System.out.println("Data Set ID " + consumerDurablesExecutionData.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsDataEntryExcelData
				.getTestdata(consumerDurablesExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_04$")
	public void user_076_get_the_test_data_for_test_case_id_at_cd_dataentry_custdetails_04() throws Throwable {
		consumerDurablesExecutionData = consumerDurablesExecutionSheet.getTestdata("AT_CD_DATAENTRY_CUSTDETAILS_04");
		System.out.println("Data Set ID " + consumerDurablesExecutionData.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsDataEntryExcelData
				.getTestdata(consumerDurablesExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_CD_DATAENTRY_CUSTDETAILS_07$")
	public void user_076_get_the_test_data_for_test_case_id_at_cd_dataentry_custdetails_07() throws Throwable {
		consumerDurablesExecutionData = consumerDurablesExecutionSheet.getTestdata("AT_CD_DATAENTRY_CUSTDETAILS_07");
		System.out.println("Data Set ID " + consumerDurablesExecutionData.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsDataEntryExcelData
				.getTestdata(consumerDurablesExecutionData.get("dataSet_ID"));
		System.out.println("Data set ID from test data sheet " + customerDetailsTestData.get("Dataset ID"));
		System.out.println("valid search input " + customerDetailsTestData.get("valid_search_input"));

	}

	@And("^user_076 click on customer details screen at app data entry stage$")
	public void user_076_click_on_customer_details_screen_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("customer_details_tab"))
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

	@And("^user_076 click on add button in customer details screen at app data entry stage$")
	public void user_076_click_on_add_button_in_customer_details_screen_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("customerDetails_AddButton"))
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

	@And("user_076 in customer search screen select the customer type at customer details")
	public void user_076_in_customer_search_screen_select_the_customer_type_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("customer_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("customer_type"));

	}

	@And("user_076 in customer search screen enter customer name at customer details")
	public void user_076_in_customer_search_screen_enter_customer_name_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchElements.getElement("customer_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchElements.getElement("customer_name_input"))
						.sendKeys(customerDetailsTestData.get("customer_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in custommer search screen select ID type at customer details")
	public void user_076_in_custommer_search_screen_select_id_type_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchElements.getElement("id_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("id_type"));
	}

	@And("user_076 in customer search screen enter id number at customer details")
	public void user_076_in_customer_search_screen_enter_id_number_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchElements.getElement("id_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchElements.getElement("id_number_input"))
						.sendKeys(customerDetailsTestData.get("id_number"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen enter date of birth of the customer at customer details")
	public void user_076_in_customer_search_screen_enter_date_of_birth_of_the_customer_at_customer_details()
			throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("date_of_birth_calendar_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("date_of_birth_calendar_input"))
						.sendKeys(customerDetailsTestData.get("search_date_of_birth"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println(customerSearchElements.getElement("date_highlighted_button"));
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("date_highlighted_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 in customer search screen enter customer mobile number at customer details")
	public void user_076_in_customer_search_screen_enter_customer_mobile_number_at_customer_details() throws Throwable {
		Random random = new Random();
		int mobileFirstDigit = 9;
		random.nextInt(1000000000);
		String mobileNumberEnd = String.format("%09d", random.nextInt(1000000000));
		String mobNumber = mobileFirstDigit + mobileNumberEnd;
		System.out.println("Mobile number " + mobNumber);
		System.out
				.println("Mobile number js path " + customerSearchElements.getElement("customer_search_mobile_input"));
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("customer_search_mobile_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("customer_search_mobile_input"))
						.sendKeys(mobNumber);
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on save button in customer details with blank fields")
	public void user_076_click_on_save_button_in_customer_details_with_blank_fields() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the validation for blank field in customer details screen stage")
	public void user_076_verify_system_should_show_the_validation_for_blank_field_in_customer_details_screen_stage()
			throws Throwable {
		String validationMessage = "";
		for (int i = 0; i < 150; i++) {
			try {
				validationMessage = javascriptHelper
						.executeScript("return " + commonElements.getElement("toast_message")).toString();
				if (validationMessage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Toast Message " + validationMessage);
		softAssert.assertEquals(validationMessage, "Please fill all the details",
				"System is not showing the validation message");
	}

	@And("user_076 enter special character in first name in customer details screen")
	public void user_076_enter_special_character_in_first_name_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Special character input " + customerDetailsTestData.get("special_character_input"));
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify first name field should show the validation for special character input in customer details screen")
	public void user_076_verify_first_name_field_should_show_the_validation_for_special_character_input_in_customer_details_screen()
			throws Throwable {
		String specialCharacterValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				specialCharacterValidation = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("first_name_input_field_level_validation"))
						.toString();
				if (specialCharacterValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(" Validation Message " + specialCharacterValidation);
		softAssert.assertEquals(specialCharacterValidation, "Only Alphabets are allowed",
				"System not showing the special character validation message");

	}

	@And("^user_076 clear the customer first name field value at customer details updation screen$")
	public void user_076_clear_the_customer_first_name_field_value_at_customer_details_updation_screen()
			throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@And("^user_076 clear the customer no of children field value at customer details updation screen$")
	public void user_076_clear_the_customer_no_of_children_field_value_at_customer_details_updation_screen()
			throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_childer_input"))
						.click();

				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_childer_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@And("user_076 enter numeric input in first name in customer details screen")
	public void user_076_enter_numeric_input_in_first_name_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("numeric_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify first name field should show the validation for numeric input in customer details screen")
	public void user_076_verify_first_name_field_should_show_the_validation_for_numeric_input_in_customer_details_screen()
			throws Throwable {
		String characterValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				characterValidation = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("first_name_input_field_level_validation"))
						.toString();
				if (characterValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(" Validation Message " + characterValidation);
		softAssert.assertEquals(characterValidation, "Only Alphabets are allowed",
				"System not showing the character validation message");
	}

	@And("user_076 enter character input in no of children in customer details screen")
	public void user_076_enter_character_input_in_no_of_children_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_childer_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_childer_input"))
						.sendKeys(customerDetailsTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify no of children field dont accept the character input in customer details screen")
	public void user_076_verify_no_of_children_field_dont_accept_the_character_input_in_customer_details_screen()
			throws Throwable {
		String characterInputValidation = "";
		String query = "return " + customerDetailsElements.getElement("no_of_childer_input") + ".innerText";
		System.out.println(query);
		for (int i = 0; i <= 100; i++) {
			try {
				characterInputValidation = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("no_of_childer_input") + ".innerText")
						.toString();
				if (!(characterInputValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Character input from screen " + characterInputValidation);
		System.out.println(characterInputValidation.length());
		softAssert.assertTrue(characterInputValidation.length() == 0, "field accepts character input hence failed");
	}

	@And("user_076 click on the search button in customer search screen")
	public void user_076_click_on_the_search_button_in_customer_search_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchElements.getElement("customer_search_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on create new request buttton")
	public void user_076_click_on_create_new_request_buttton() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('button[class=\"p-element p-button-info p-button-sm w-90 m-2 pull-right p-button p-component\"]')[2]")
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify customer details field should have save button")
	public void user_076_verify_customer_details_field_should_have_save_button() throws Throwable {
		boolean isSaveButtonDisplayed = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isSaveButtonDisplayed = javascriptHelper
						.executeScriptWithWebElement(commonElements.getElement("save_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(isSaveButtonDisplayed, "Save button is not visible hence failed");

	}

	@Then("user_076 verify customer type field should be mandatory editable dropdown")
	public void user_076_verify_customer_type_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("customer_details_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("customer_details_type_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("customer_details_type_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("customer_type_dropdown"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " Customer type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" Customer type is not a mandatory field hence failed");
	}

	@Then("user_076 verify applicant type field should be mandatory editable dropdown")
	public void user_076_verify_applicant_type_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("application_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("application_type_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("application_type_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("application_type"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" Application type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" Application type is not a mandatory field hence failed");
	}

	@Then("user_076 verify salutation field should be mandatory editable dropdown")
	public void user_076_verify_salutation_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("salutation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("salutation_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("salutation_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("salutation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " salutation is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " salutation is not a mandatory field hence failed");
	}

	@Then("user_076 verify first name field should be mandatory editable textbox")
	public void user_076_verify_first_name_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("first_Name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "first name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"first name field is not a mandatory field hence failed");

	}

	@Then("user_076 verify middle name field should be non mandatory editable textbox")
	public void user_076_verify_middle_name_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("middle_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("middle_name_input"))
						.sendKeys(customerDetailsTestData.get("middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "middle name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"middle name field is a mandatory field hence failed");
	}

	@Then("user_076 verify last name field should be mandatory editable textbox")
	public void user_076_verify_last_name_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("last_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("last_name_input"))
						.sendKeys(customerDetailsTestData.get("last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "last name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"last name field is not a mandatory field hence failed");
	}

	@Then("user_076 verify father first name field should be mandatory editable textbox")
	public void user_076_verify_father_first_name_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("father_first_name_Input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("father_first_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("father_first_name_Input"))
						.sendKeys(customerDetailsTestData.get("father_first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father first name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"father first name field is not a mandatory field hence failed");
	}

	@Then("user_076 verify father middle name field should be non mandatory editable textbox")
	public void user_076_verify_father_middle_name_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("father_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("father_middle_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("father_middle_name_input"))
						.sendKeys(customerDetailsTestData.get("father_middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father middle name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"father middle name field is a mandatory field hence failed");
	}

	@Then("user_076 verify father last name field should be mandatory editable textbox")
	public void user_076_verify_father_last_name_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("father_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("father_last_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("father_last_name_input"))
						.sendKeys(customerDetailsTestData.get("father_last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father last name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"father last name field is a non mandatory field hence failed");
	}

	@Then("user_076 verify spouse first name field should be non mandatory editable textbox")
	public void user_076_verify_spouse_first_name_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("spouse_first_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_first_name_input"))
						.sendKeys(customerDetailsTestData.get("spouse_first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse first name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse first name field is a mandatory field hence failed");
	}

	@Then("user_076 verify spouse middle name field should be non mandatory editable textbox")
	public void user_076_verify_spouse_middle_name_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("spouse_middle_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_middle_name_input"))
						.sendKeys(customerDetailsTestData.get("spouse_middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse middle name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse middle name field is a mandatory field hence failed");
	}

	@Then("user_076 verify spouse last name field should be non mandatory editable textbox")
	public void user_076_verify_spouse_last_name_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("spouse_last_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_last_name_input"))
						.sendKeys(customerDetailsTestData.get("spouse_last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse last name field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse last name field is a non mandatory field hence failed");
	}

	@Then("user_076 verify no of children field should be non mandatory editable textbox")
	public void user_076_verify_no_of_children_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_childer_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("no_of_children_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_childer_input"))
						.sendKeys(customerDetailsTestData.get("no_of_children"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"no of children field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"no of children field is a mandatory field hence failed");
	}

	@Then("user_076 verify spouse status field should be non mandatory editable dropdown")
	public void user_076_verify_spouse_status_field_should_be_non_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_status_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("spouse_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("spouse_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " spouse status is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" spouse status is a mandatory field hence failed");
	}

	@Then("user_076 verify date of birth field should be mandatory editable calendar")
	public void user_076_verify_date_of_birth_field_should_be_mandatory_editable_calendar() throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("date_of_birth_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("today_date")).click();

				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("date_of_birth_mandatory_verification"))
						.toString();
				fieldVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("date_of_birth_field_verification"))
						.toString();
				if (!(mandatoryVerification.isEmpty()) || !(fieldVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"date of birth field is not a mandatory hence failed");
		softAssert.assertTrue(fieldVerification.contains("dd-M-yy"),
				"date of birth is not a calender tyep hence failed");
	}

	@Then("user_076 verify gender field should be mandatory editable dropdown")
	public void user_076_verify_gender_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("gender_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("gender_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("gender_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("gender"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " gender is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " gender is not a mandatory field hence failed");
	}

	@Then("user_076 verify education level field should be mandatory editable dropdown")
	public void user_076_verify_education_level_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("education_level_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("education_level_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("education_level_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("education_level"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" educational level is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" educational level is not a mandatory field hence failed");
	}

	@Then("user_076 verify maritail status field should be mandatory editable dropdown")
	public void user_076_verify_maritail_status_field_should_be_mandatory_editable_dropdown() throws Throwable {

		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("maritail_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("maritail_status_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("maritail_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("maritail_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" maritail status is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" maritail status is not a mandatory field hence failed");

	}

	@Then("user_076 verify nationality field should be mandatory editable dropdown")
	public void user_076_verify_nationality_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("nationality_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("nationality_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("nationality_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("nationality"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " nationality is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" nationality is not a mandatory field hence failed");

	}

	@Then("user_076 verify category field should be mandatory editable dropdown")
	public void user_076_verify_category_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("category_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("category_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("category_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("category"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " category is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " category is not a mandatory field hence failed");
	}

	@Then("user_076 verify religion field should be mandatory editable dropdown")
	public void user_076_verify_religion_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("relegion_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("relegion_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("relegion_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("Religion"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " relegion is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " relegion is not a mandatory field hence failed");
	}

	@Then("user_076 verify residential status field should be mandatory editable dropdown")
	public void user_076_verify_residential_status_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("customer_residential_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("customer_residential_status_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("customer_residential_status_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("residential_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" residential status is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" residential status is not a mandatory field hence failed");

	}

	@Then("user_076 verify language field should be mandatory editable dropdown")
	public void user_076_verify_language_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("languages_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("languages_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("languages_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("language"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " language is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " language is not a mandatory field hence failed");
	}

	@Then("user_076 verify no of dependents field should be mandatory editable textbox")
	public void user_076_verify_no_of_dependents_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_dependents_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("no_of_dependents_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("no_of_dependents_input"))
						.sendKeys(customerDetailsTestData.get("no_of_dependents"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"no of dependents field is not a text box hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"no of dependents field is a mandatory field hence failed");
	}

	@Then("user_076 verify mothers maiden name field should be mandatory editable textbox")
	public void user_076_verify_mothers_maiden_name_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("mothers_maiden_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("mothers_maiden_name_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("mothers_maiden_name_input"))
						.sendKeys(customerDetailsTestData.get("mothers_maiden_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mothers maiden name field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"mothers maiden name field is a non mandatory field hence failed");
	}

	@Then("user_076 verify residence field should be mandatory editable textbox")
	public void user_076_verify_residence_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("type_of_residency_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("type_of_residency_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("type_of_residency_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("type_of_residency"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" type of residence is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" type of residence is not a mandatory field hence failed");
	}

	@Then("user_076 verify industry segmentation field should be mandatory editable textbox")
	public void user_076_verify_industry_segmentation_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("industry_segmentation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("industry_segmentation_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("industry_segmentation_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("industry_segmentation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" industry segmentation is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" industry segmentation is not a mandatory field hence failed");
	}

	@Then("user_076 verify income considered field should be non mandatory editable dropdown")
	public void user_076_verify_income_considered_field_should_be_non_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("is_income_considered_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("is_income_considered_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("is_income_considered_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("is_income_considered"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" is income considered is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" is income considered is a mandatory field hence failed");

	}

	@Then("user_076 verify costomer profile field should be non mandatory editable dropdown")
	public void user_076_verify_costomer_profile_field_should_be_non_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("customer_profile_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("customer_profile_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("customer_profile_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("customer_profile"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" customer profile is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" customer profile is a mandatory field hence failed");
	}

	@Then("user_076 verify relationship field should be mandatory editable dropdown")
	public void user_076_verify_relationship_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("relationship_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("relationship_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
						.executeScriptWithWebElement(customerDetailsElements.getElement("relationship_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("relationship"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " relationship is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" relationship is a non mandatory field hence failed");
	}

	@Then("user_076 verify existing bank relationship field should be non mandatory editable toggle")
	public void user_076_verify_existing_bank_relationship_field_should_be_non_mandatory_editable_toggle()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("existing_customer_flag"))
						.getAttribute("role");
				if (!(toggleVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("existing_customer_flag_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toggleVerification.contains("switch"),
				" existing customer field is not a toggle hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"existing customer field is a mandatory field hence failed");
	}

	@Then("user_076 verify blacklisted field should be non mandatory editable toggle")
	public void user_076_verify_blacklisted_field_should_be_non_mandatory_editable_toggle() throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("blacklisted_toggle"))
						.getAttribute("role");
				if (!(toggleVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("blacklisted_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toggleVerification.contains("switch"), " blacklisted field is not a toggle hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"blacklisted field is a mandatory field hence failed");
	}

	@Then("user_076 verify politically exposed field should be non mandatory editable dropdown")
	public void user_076_verify_politically_exposed_field_should_be_non_mandatory_editable_dropdown() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("isPoliticallyExposed_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("isPoliticallyExposed_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("isPoliticallyExposed_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("isPoliticallyExposed_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("politically_exposed"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" politically exposed is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" politically exposed is a mandatory field hence failed");
	}

	@Then("user_076 verify remarks field should be mandatory editable textbox")
	public void user_076_verify_remarks_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("remarks_field_input"))
						.getAttribute("class");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("remarks_field_mandatory_verification"))
						.toString();
				if ((fieldTypeValidation.length() > 0) && (mandatoryVerification.length() > 0)) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("remarks_field_input")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("remarks_field_input"))
						.sendKeys(customerDetailsTestData.get("remarks"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("textarea"), "remarks field is not a text box hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"remarks field is a non mandatory field hence failed");
	}

	@Then("user_076 verify phone number field should be mandatory editable textbox")
	public void user_076_verify_phone_number_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("phone_number_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("phone_number_input")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("phone_number_input"))
						.sendKeys(customerDetailsTestData.get("phone_number"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"phone number field is not a text box hence failed");
	}

	@Then("user_076 verify phone number primary field should be mandatory editable textbox")
	public void user_076_verify_phone_number_primary_field_should_be_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("mobile1_number_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("mobile1_number_input"))
						.sendKeys(customerDetailsTestData.get("mobile_number_primary"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mobile number primary number field is not a text box hence failed");
	}

	@Then("user_076 verify phone number secondary field should be editable number")
	public void user_076_verify_phone_number_secondary_field_should_be_editable_number() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("mobile_number_secondary_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("mobile_number_secondary_input"))
						.sendKeys(customerDetailsTestData.get("mobile_number_secondary"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mobile number secondary number field is not a text box hence failed");
	}

	@Then("user_076 verify email id field should be editable number")
	public void user_076_verify_email_id_field_should_be_editable_number() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("email_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("email_input")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("email_input"))
						.sendKeys(customerDetailsTestData.get("email"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"), "email id field is not a text box hence failed");
	}

	@Then("user_076 verify prefered contact method field should be editable number")
	public void user_076_verify_prefered_contact_method_field_should_be_editable_number() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("prefered_contact_method_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("prefered_contact_method_dropdown"))
						.getAttribute("aria-label");
				if ((fieldTypeValidation.length() > 0) || (mandatoryVerification.length() > 0)) {
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
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("prefered_contact_method_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(customerDetailsTestData.get("prefered_contact_method"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" prefered contact method is not a dropdown hence failed");
	}

	@Then("user_076 verify prefered time for contact field should be editable HH MM format")
	public void user_076_verify_prefered_time_for_contact_field_should_be_editable_hh_mm_format() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("prefered_time_for_contact_input"))
						.getAttribute("type");

				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("prefered_time_for_contact_input")));
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsElements.getElement("prefered_time_for_contact_input"))
						.sendKeys(customerDetailsTestData.get("prefered_time_for_contact"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"prefered time for contact field is not a text box hence failed");
	}

	@And("^user_076 click on save button in customer details screen$")
	public void user_076_click_on_save_button_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify customer details record got saved$")
	public void user_076_verify_customer_details_record_got_saved() throws Throwable {
		String toastMessage = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonElements.getElement("toast_container_message")).toString();
				if (toastMessage.length() > 0) {
					break;
				}
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
				javascriptHelper
						.executeScriptWithWebElement(commonElements.getElement("toast_container_message_close_button"))
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

	@And("^user_076 click on list view edit button in customer details screen$")
	public void user_076_click_on_list_view_edit_button_in_customer_details_screen() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("customer_details_list_view_edit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_076 update the first name in customer details screen$")
	public void user_076_update_the_first_name_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("first_name_input"))
						.sendKeys(customerDetailsTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 update the middle name in customer details screen$")
	public void user_076_update_the_middle_name_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("middle_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("middle_name_input"))
						.sendKeys(customerDetailsTestData.get("middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 update the last name in customer details screen$")
	public void user_076_update_the_last_name_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("last_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("last_name_input"))
						.sendKeys(customerDetailsTestData.get("last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on update button in customer details screen$")
	public void user_076_click_on_update_button_in_customer_details_screen() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify application should show the successfull update popup in customer details screen$")
	public void user_076_verify_application_should_show_the_successfull_update_popup_in_customer_details_screen()
			throws Throwable {
		String updateString = "";
		for (int i = 0; i <= 100; i++) {
			try {
				updateString = javascriptHelper
						.executeScript("return " + commonElements.getElement("toast_container_message")).toString();
				if (updateString.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify customer details list view first name should be matched with updated data$")
	public void user_076_verify_customer_details_list_view_first_name_should_be_matched_with_updated_data()
			throws Throwable {
		String listViewFirstName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewFirstName = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("customer_details_list_view_get_first_name"))
						.toString();
				if (listViewFirstName.length() > 0) {
					System.out.println("First name " + listViewFirstName);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(listViewFirstName, customerDetailsTestData.get("first_name"),
				" Updated first name not mathed with list view data hence failed");
	}

	@Then("^user_076 verify customer details list view last name should be matched with updated data$")
	public void user_076_verify_customer_details_list_view_last_name_should_be_matched_with_updated_data()
			throws Throwable {
		String listViewLastName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewLastName = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("customer_details_list_view_get_last_name"))
						.toString();
				if (listViewLastName.length() > 0) {
					System.out.println("Last name " + listViewLastName);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(listViewLastName, customerDetailsTestData.get("last_name"),
				" Updated last name not mathed with list view data hence failed");
	}

	@Then("^user_076 verify customer details list view middle name should be matched with updated data$")
	public void user_076_verify_customer_details_list_view_middle_name_should_be_matched_with_updated_data()
			throws Throwable {
		String listViewMiddleName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewMiddleName = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("customer_details_list_view_get_middle_name"))
						.toString();
				if (listViewMiddleName.length() > 0) {
					System.out.println("Middle name " + listViewMiddleName);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(listViewMiddleName, customerDetailsTestData.get("middle_name"),
				" Updated middle name not mathed with list view data hence failed");
	}

	@And("^user_076 verify status button should be visible in customer details screen$")
	public void user_076_verify_status_button_should_be_visible_in_customer_details_screen() throws Throwable {
		boolean isToggleButtonStatus = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isToggleButtonStatus = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("status_toggle_button"))
						.isDisplayed();
				if (isToggleButtonStatus == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isToggleButtonStatus, "Status button not visible ehence failed");
	}

	@And("^user_076 change record status by clicking on toggle button in customer details screen$")
	public void user_076_change_record_status_by_clicking_on_toggle_button_in_customer_details_screen()
			throws Throwable {
		String temprecordStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				temprecordStatus = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_record_status")).toString();
				if (temprecordStatus.length() > 0) {
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("status_toggle_button"))
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
				recordStatus = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_record_status")).toString();
				if (!(recordStatus.equals(temprecordStatus))) {
					System.out.println("Record status " + recordStatus);
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

	@Then("^user_076 verify customer details list view record status should be changed as per the user change$")
	public void user_076_verify_customer_details_list_view_record_status_should_be_changed_as_per_the_user_change()
			throws Throwable {
		String listViewRecordStatus = "";

		for (int i = 0; i <= 150; i++) {
			try {
				listViewRecordStatus = javascriptHelper
						.executeScript("return "
								+ customerDetailsElements.getElement("customer_details_list_view_record_status"))
						.toString();
				if (listViewRecordStatus.length() > 0) {
					System.out.println("List view record status " + listViewRecordStatus);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		if (recordStatus.equals("false")) {
			softAssert.assertTrue(listViewRecordStatus.contains("In-active"), "As per toggle record status is "
					+ recordStatus + " but in application list view record status is " + listViewRecordStatus);
		}
		if (recordStatus.equals("true")) {
			softAssert.assertTrue(listViewRecordStatus.contains("Active"), "As per toggle record status is "
					+ recordStatus + " but in application list view record status is " + listViewRecordStatus);
		}
	}

	@And("^user_076 extract the customer details field$")
	public void user_076_extract_the_customer_details_field() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				listViewFieldName = javascriptHelper
						.executeScript(
								"return " + customerDetailsElements.getElement("customer_details_list_view_field_name"))
						.toString();
				if (listViewFieldName.length() > 0) {
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

	@Then("^user_076 verify customer details list view should have CIF ID field$")
	public void user_076_verify_customer_details_list_view_should_have_cif_id_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("CIF ID"), "CID ID field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have first name field$")
	public void user_076_verify_customer_details_list_view_should_have_first_name_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("First Name"), "First Name field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have middle name field$")
	public void user_076_verify_customer_details_list_view_should_have_middle_name_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("Middle Name"), "Middle Name field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have last name field$")
	public void user_076_verify_customer_details_list_view_should_have_last_name_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("Last Name"), "Last Name field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have customer type field$")
	public void user_076_verify_customer_details_list_view_should_have_customer_type_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("Customer Type"),
				"Customer Type field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have application type field$")
	public void user_076_verify_customer_details_list_view_should_have_application_type_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("Applicant Type"),
				"Applicant Type field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have customer rating field$")
	public void user_076_verify_customer_details_list_view_should_have_customer_rating_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("Customer Rating"),
				"Customer Rating field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have status field$")
	public void user_076_verify_customer_details_list_view_should_have_status_field() throws Throwable {
		softAssert.assertTrue(listViewFieldName.contains("Status"), "Status field not visible hence failed");
	}

	@Then("^user_076 verify customer details list view should have export button$")
	public void user_076_verify_customer_details_list_view_should_have_export_button() throws Throwable {
		boolean isExportButtonVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isExportButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonElements.getElement("export_button")).isDisplayed();
				if (isExportButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					softAssert.assertTrue(isExportButtonVisible, "Export button not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify customer details list view should have search button$")
	public void user_076_verify_customer_details_list_view_should_have_search_button() throws Throwable {
		boolean isSearchButtonVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isSearchButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonElements.getElement("list_view_search_button"))
						.isDisplayed();
				if (isSearchButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					softAssert.assertTrue(isSearchButtonVisible, "search button not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify customer details list view should have add button$")
	public void user_076_verify_customer_details_list_view_should_have_add_button() throws Throwable {
		boolean isAddButtonVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isAddButtonVisible = javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements.getElement("customerDetails_AddButton"))
						.isDisplayed();
				if (isAddButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					softAssert.assertTrue(isAddButtonVisible, "Add button not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify customer details list view record should be readonly mode$")
	public void user_076_verify_customer_details_list_view_record_should_be_readonly_mode() throws Throwable {
		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_CIF_ID_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("CIF ID field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "CIF ID field is editable hence failed");
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_first_name_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("First name field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "First name field is editable hence failed");
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_middle_name_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("Middle name field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "Middle name field is editable hence failed");
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_last_name_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("Last name field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "Last name field is editable hence failed");
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_customer_type_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("Customer type field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "Customer type field is editable hence failed");
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_application_type_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("Application type field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "Application type field is editable hence failed");
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsElements
								.getElement("customer_details_list_view_status_editable_verification"))
						.sendKeys("abcd");
				if (i == 3) {
					softAssert.fail("Status type field is editable hence failed");
				}

			} catch (Exception e) {
				if (i == 3) {
					softAssert.assertTrue(true, "Status type field is editable hence failed");
				}
			}
		}

	}

	@And("^user_076 click on search button in customer details list view$")
	public void user_076_click_on_search_button_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("list_view_search_button"))
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

	@And("^user_076 search with valid search text in customer details list view$")
	public void user_076_search_with_valid_search_text_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("list_view_search_input"))
						.sendKeys(customerDetailsTestData.get("valid_search_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify system should show the valid search result in customer details list view$")
	public void user_076_verify_system_should_show_the_valid_search_result_in_customer_details_list_view()
			throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + commonElements.getElement("list_view_search_result")).toString();
				if (searchResult.length() > 0) {
					System.out.println("Search result " + searchResult);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(searchResult.contains("Showing 0 to 0 of 0 entries")),
				"Contact details list view not showing result for matched text");
	}

	@And("^user_076 search with invalid search text in customer details list view$")
	public void user_076_search_with_invalid_search_text_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 5; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("list_view_search_input"))
						.sendKeys(customerDetailsTestData.get("invalid_search_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify system should not show the search result in customer details list view$")
	public void user_076_verify_system_should_not_show_the_search_result_in_customer_details_list_view()
			throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				searchResult = javascriptHelper
						.executeScript("return " + commonElements.getElement("list_view_search_result")).toString();
				if ((searchResult.length() > 0) && (searchResult.contains("Showing 0 to 0 of 0 entries"))) {
					System.out.println("Search result " + searchResult);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(searchResult.contains("Showing 0 to 0 of 0 entries"),
				"Contact details list view  showing result for non matched text");
	}

	@And("^user_076 click on export button in customer details list view$")
	public void user_076_click_on_export_button_in_customer_details_list_view() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("export_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on pdf option in customer details export option$")
	public void user_076_click_on_pdf_option_in_customer_details_export_option() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on xlsx option in customer details export button$")
	public void user_076_click_on_xlsx_option_in_customer_details_export_button() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElements.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify customer details export functionality allow user to download the pdf file$")
	public void user_076_verify_customer_details_export_functionality_allow_user_to_download_the_pdf_file()
			throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@Then("^user_076 verify customer details export functionality allow user to download the xlsx file$")
	public void user_076_verify_customer_details_export_functionality_allow_user_to_download_the_xlsx_file()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("user_076 invoke softAssert in customer details screen")
	public void user_076_invoke_soft_assert_in_customer_details_screen() throws Throwable {
		softAssert.assertAll();
	}

}
