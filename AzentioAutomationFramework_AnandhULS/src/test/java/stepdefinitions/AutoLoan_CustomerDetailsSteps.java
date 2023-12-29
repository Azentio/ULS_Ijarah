package stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_CustomerDetailsSteps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelFilePathForJS = configFileReader.getJSFilePath();
	JSPaths customerSearchJSPaths = new JSPaths(excelFilePathForJS, "customer_search_JS",
			"Ijarah_customer_search_fieldName", "JSPath");
	JSPaths commonJSElements = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths customerDetailsJSElements = new JSPaths(excelFilePathForJS, "NewApp_CustomerDetailsElements",
			"New_App_CustomerDetailsElements", "JSPath");
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ExcelData newAppExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(), "AutoLoanExecution",
			"TestCase ID");
	ExcelData customerDetailsTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"NewApp_CustomerDetailsTestData", "Dataset ID");
	Map<String, String> autoLoanExecutionData = new HashMap<>();
	Map<String, String> newAppCustomerDetailsTestData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	@Given("navigate to uls url")
	public void navigate_to_uls_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	}

	@And("user_076 search the auto loan new app record in mail box")
	public void user_076_search_the_auto_loan_new_app_record_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getAutoLoanReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the auto loan new app record from mail box")
	public void user_076_select_the_auto_loan_new_app_record_from_mail_box() throws Throwable {
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
					if (recordRefNumber.equals(configFileReader.getAutoLoanReferenceNumber())) {
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

	@And("user_076 get the test data for test case ID AT_AL_CUSDETAILS_02")
	public void user_get_the_test_data_for_test_case_id_AT_AL_CUSDETAILS_02() throws Throwable {
		autoLoanExecutionData = newAppExecutionSheet.getTestdata("AT_AL_CUSDETAILS_02");
		newAppCustomerDetailsTestData = customerDetailsTestData.getTestdata("DS01_AT_AT_AL_CUSDETAILS_02");
		System.out.println("Data Set ID : "+newAppCustomerDetailsTestData.get("Dataset ID"));
		System.out.println("Customer type : "+newAppCustomerDetailsTestData.get("customer_type"));
	}

	@And("user_076 get the test data for test case ID AT_AL_CUSDETAILS_01")
	public void user_get_the_test_data_for_test_case_id_AT_AL_CUSDETAILS_01() throws Throwable {
		autoLoanExecutionData = newAppExecutionSheet.getTestdata("AT_AL_CUSDETAILS_01");
		newAppCustomerDetailsTestData = customerDetailsTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("user_076 in customer search screen select the customer type at customer details")
	public void user_076_in_customer_search_screen_select_the_customer_type_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("customer_type"));

	}

	@And("user_076 in customer search screen enter customer name at customer details")
	public void user_076_in_customer_search_screen_enter_customer_name_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("customer_name"));
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
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("id_type"));
	}

	@And("user_076 in customer search screen enter id number at customer details")
	public void user_076_in_customer_search_screen_enter_id_number_at_customer_details() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerSearchJSPaths.getElement("id_number_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("id_number"));
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
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_of_birth_calendar_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_of_birth_calendar_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("search_date_of_birth"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println(customerSearchJSPaths.getElement("date_highlighted_button"));
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("date_highlighted_button"))
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
		System.out.println("Mobile number js path " + customerSearchJSPaths.getElement("customer_search_mobile_input"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_mobile_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerSearchJSPaths.getElement("customer_search_mobile_input"))
						.sendKeys(mobNumber);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on save button in customer details with blank fields")
	public void user_076_click_on_save_button_in_customer_details_with_blank_fields() throws Throwable {

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

	@Then("user_076 verify system should show the validation for blank field in customer details screen at new app stage")
	public void user_076_verify_system_should_show_the_validation_for_blank_field_in_customer_details_screen_at_new_app_stage()
			throws Throwable {
		String validationMessage = "";
		for (int i = 0; i < 300; i++) {
			try {
				validationMessage = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_message")).toString();
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

	@And("user_076 enter special character in first name in customer details screen at new app")
	public void user_076_enter_special_character_in_first_name_in_customer_details_screen_at_new_app()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify first name field should show the validation for special character input in customer details screen at new app")
	public void user_076_verify_first_name_field_should_show_the_validation_for_special_character_input_in_customer_details_screen_at_new_app()
			throws Throwable {
		String specialCharacterValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				specialCharacterValidation = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("first_name_input_field_level_validation"))
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

	@And("user_076 enter numeric input in first name in customer details screen at new app")
	public void user_076_enter_numeric_input_in_first_name_in_customer_details_screen_at_new_app() throws Throwable {
		for (int i = 0; i <= 2; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("numeric_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify first name field should show the validation for numeric input in customer details screen at new app")
	public void user_076_verify_first_name_field_should_show_the_validation_for_numeric_input_in_customer_details_screen_at_new_app()
			throws Throwable {
		String characterValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				characterValidation = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("first_name_input_field_level_validation"))
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

	@And("user_076 enter character input in no of children in customer details screen at new app")
	public void user_076_enter_character_input_in_no_of_children_in_customer_details_screen_at_new_app()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("no_of_childer_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("no_of_childer_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify no of children field dont accept the character input in customer details screen at new app")
	public void user_076_verify_no_of_children_field_dont_accept_the_character_input_in_customer_details_screen_at_new_app()
			throws Throwable {
		String characterInputValidation = "";
		String query = "return " + customerDetailsJSElements.getElement("no_of_childer_input") + ".innerText";
		System.out.println(query);
		for (int i = 0; i <= 100; i++) {
			try {
				characterInputValidation = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSElements.getElement("no_of_childer_input") + ".innerText")
						.toString();
				if (!(characterInputValidation.isBlank())) {
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

	@Then("user_076 verify customer details field should have save and back button")
	public void user_076_verify_customer_details_field_should_have_save_and_back_button() throws Throwable {
		boolean isSaveButtonDisplayed = false;
		boolean isBackButtonDisplayed = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isSaveButtonDisplayed = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("save_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				isBackButtonDisplayed = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("back_button")).isDisplayed();
				break;
			} catch (Exception e) {
			}
		}
		softAssert.assertTrue(isSaveButtonDisplayed, "Save button is not visible hence failed");
		softAssert.assertTrue(isBackButtonDisplayed, "back button is not visible hence failed");

	}

	@Then("user_076 verify customer type field should be mandatory editable dropdown at new app")
	public void user_076_verify_customer_type_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("customer_details_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("customer_details_type_dropdown"))
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
						customerDetailsJSElements.getElement("customer_details_type_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("customer_type_dropdown"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " Customer type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" Customer type is not a mandatory field hence failed");
	}

	@Then("user_076 verify applicant type field should be mandatory editable dropdown at new app")
	public void user_076_verify_applicant_type_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("application_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("application_type_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("application_type_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("application_type"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" Application type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" Application type is not a mandatory field hence failed");
	}

	@Then("user_076 verify salutation field should be mandatory editable dropdown at new app")
	public void user_076_verify_salutation_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("salutation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("salutation_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("salutation_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("salutation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " salutation is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " salutation is not a mandatory field hence failed");
	}

	@Then("user_076 verify first name field should be mandatory editable textbox at new app")
	public void user_076_verify_first_name_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSElements.getElement("first_Name_mandatory_verification"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("first_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("first_name"));
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

	@Then("user_076 verify middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSElements.getElement("middle_name_mandatory_verification"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("middle_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("middle_name"));
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

	@Then("user_076 verify last name field should be mandatory editable textbox at new app")
	public void user_076_verify_last_name_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSElements.getElement("last_name_mandatory_verification"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("last_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("last_name"));
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

	@Then("user_076 verify father first name field should be mandatory editable textbox at new app")
	public void user_076_verify_father_first_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("father_first_name_Input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("father_first_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("father_first_name_Input"))
						.sendKeys(newAppCustomerDetailsTestData.get("father_first_name"));
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

	@Then("user_076 verify father middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_father_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("father_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("father_middle_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("father_middle_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("father_middle_name"));
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

	@Then("user_076 verify father last name field should be mandatory editable textbox at new app")
	public void user_076_verify_father_last_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("father_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("father_last_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("father_last_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("father_last_name"));
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

	@Then("user_076 verify spouse first name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_first_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("spouse_first_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_first_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("spouse_first_name"));
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

	@Then("user_076 verify spouse middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("spouse_middle_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_middle_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("spouse_middle_name"));
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

	@Then("user_076 verify spouse last name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_last_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("spouse_last_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_last_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("spouse_last_name"));
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("no_of_childer_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("no_of_children_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("no_of_childer_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("no_of_children"));
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

	@Then("user_076 verify spouse status field should be non mandatory editable dropdown at new app")
	public void user_076_verify_spouse_status_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_status_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("spouse_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("spouse_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " spouse status is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" spouse status is a mandatory field hence failed");
	}

	@Then("user_076 verify date of birth field should be mandatory editable calendar at new app")
	public void user_076_verify_date_of_birth_field_should_be_mandatory_editable_calendar_at_new_app()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("date_of_birth_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("today_date")).click();

				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("date_of_birth_mandatory_verification"))
						.toString();
				fieldVerification = javascriptHelper
						.executeScript(
								"return " + customerDetailsJSElements.getElement("date_of_birth_field_verification"))
						.toString();
				if (!(mandatoryVerification.isBlank()) || !(fieldVerification.isBlank())) {
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

	@Then("user_076 verify gender field should be mandatory editable dropdown at new app")
	public void user_076_verify_gender_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("gender_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("gender_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("gender_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("gender"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " gender is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " gender is not a mandatory field hence failed");
	}

	@Then("user_076 verify education level field should be mandatory editable dropdown at new app")
	public void user_076_verify_education_level_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("education_level_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("education_level_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("education_level_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("education_level"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" educational level is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" educational level is not a mandatory field hence failed");
	}

	@Then("user_076 verify maritail status field should be mandatory editable dropdown at new app")
	public void user_076_verify_maritail_status_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {

		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("maritail_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("maritail_status_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("maritail_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("maritail_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" maritail status is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" maritail status is not a mandatory field hence failed");

	}

	@Then("user_076 verify nationality field should be mandatory editable dropdown at new app")
	public void user_076_verify_nationality_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("nationality_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("nationality_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("nationality_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("nationality"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " nationality is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" nationality is not a mandatory field hence failed");

	}

	@Then("user_076 verify category field should be mandatory editable dropdown at new app")
	public void user_076_verify_category_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("category_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("category_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("category_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("category"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " category is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " category is not a mandatory field hence failed");
	}

	@Then("user_076 verify religion field should be mandatory editable dropdown at new app")
	public void user_076_verify_religion_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("relegion_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("relegion_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("relegion_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("Religion"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " relegion is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " relegion is not a mandatory field hence failed");
	}

	@Then("user_076 verify residential status field should be mandatory editable dropdown at new app")
	public void user_076_verify_residential_status_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("customer_residential_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("customer_residential_status_dropdown"))
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
						customerDetailsJSElements.getElement("customer_residential_status_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("residential_status"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" residential status is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" residential status is not a mandatory field hence failed");

	}

	@Then("user_076 verify language field should be mandatory editable dropdown at new app")
	public void user_076_verify_language_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("languages_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("languages_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("languages_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("language"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " language is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), " language is not a mandatory field hence failed");
	}

	@Then("user_076 verify no of dependents field should be mandatory editable textbox at new app")
	public void user_076_verify_no_of_dependents_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("no_of_dependents_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("no_of_dependents_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("no_of_dependents_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("no_of_dependents"));
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

	@Then("user_076 verify mothers maiden name field should be mandatory editable textbox at new app")
	public void user_076_verify_mothers_maiden_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("mothers_maiden_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("mothers_maiden_name_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("mothers_maiden_name_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("mothers_maiden_name"));
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

	@Then("user_076 verify residence field should be mandatory editable textbox at new app")
	public void user_076_verify_residence_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("type_of_residency_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("type_of_residency_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("type_of_residency_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("type_of_residency"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" type of residence is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" type of residence is not a mandatory field hence failed");
	}

	@Then("user_076 verify industry segmentation field should be mandatory editable textbox at new app")
	public void user_076_verify_industry_segmentation_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("industry_segmentation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("industry_segmentation_dropdown"))
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
						customerDetailsJSElements.getElement("industry_segmentation_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("industry_segmentation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" industry segmentation is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" industry segmentation is not a mandatory field hence failed");
	}

	@Then("user_076 verify income considered field should be non mandatory editable dropdown at new app")
	public void user_076_verify_income_considered_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("is_income_considered_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("is_income_considered_dropdown"))
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
						customerDetailsJSElements.getElement("is_income_considered_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("is_income_considered"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" is income considered is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" is income considered is a mandatory field hence failed");

	}

	@Then("user_076 verify costomer profile field should be non mandatory editable dropdown at new app")
	public void user_076_verify_costomer_profile_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("customer_profile_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("customer_profile_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("customer_profile_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("customer_profile"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" customer profile is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" customer profile is a mandatory field hence failed");
	}

	@Then("user_076 verify relationship field should be mandatory editable dropdown at new app")
	public void user_076_verify_relationship_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("relationship_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("relationship_dropdown"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("relationship_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("relationship"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), " relationship is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				" relationship is a non mandatory field hence failed");
	}

	@Then("user_076 verify existing bank relationship field should be non mandatory editable toggle at new app")
	public void user_076_verify_existing_bank_relationship_field_should_be_non_mandatory_editable_toggle_at_new_app()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("existing_customer_flag"))
						.getAttribute("role");
				if (!(toggleVerification.isBlank())) {
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
								+ customerDetailsJSElements.getElement("existing_customer_flag_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isBlank())) {
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

	@Then("user_076 verify blacklisted field should be non mandatory editable toggle at new app")
	public void user_076_verify_blacklisted_field_should_be_non_mandatory_editable_toggle_at_new_app()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("blacklisted_toggle"))
						.getAttribute("role");
				if (!(toggleVerification.isBlank())) {
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
								"return " + customerDetailsJSElements.getElement("blacklisted_mandatory_verification"))
						.toString();
				if (!(mandatoryVerification.isBlank())) {
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

	@Then("user_076 verify politically exposed field should be non mandatory editable dropdown at new app")
	public void user_076_verify_politically_exposed_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("isPoliticallyExposed_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("isPoliticallyExposed_dropdown"))
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
						customerDetailsJSElements.getElement("isPoliticallyExposed_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsJSElements.getElement("isPoliticallyExposed_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("politically_exposed"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" politically exposed is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" politically exposed is a mandatory field hence failed");
	}

	@Then("user_076 verify remarks field should be mandatory editable textbox at new app")
	public void user_076_verify_remarks_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("remarks_field_input"))
						.getAttribute("class");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ customerDetailsJSElements.getElement("remarks_field_mandatory_verification"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("remarks_field_input")));
				javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("remarks_field_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("remarks"));
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

	@Then("user_076 verify phone number field should be mandatory editable textbox at new app")
	public void user_076_verify_phone_number_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("phone_number_input"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("phone_number_input")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("phone_number_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("phone_number"));
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

	@Then("user_076 verify phone number primary field should be mandatory editable textbox at new app")
	public void user_076_verify_phone_number_primary_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("mobile1_number_input"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("mobile1_number_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("mobile_number_primary"));
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

	@Then("user_076 verify phone number secondary field should be editable number at new app")
	public void user_076_verify_phone_number_secondary_field_should_be_editable_number_at_new_app() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("mobile_number_secondary_input"))
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
								customerDetailsJSElements.getElement("mobile_number_secondary_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("mobile_number_secondary"));
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

	@Then("user_076 verify email id field should be editable number at new app")
	public void user_076_verify_email_id_field_should_be_editable_number_at_new_app() throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("email_input"))
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
						.executeScriptWithWebElement(customerDetailsJSElements.getElement("email_input")));
				javascriptHelper.executeScriptWithWebElement(customerDetailsJSElements.getElement("email_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("email"));
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

	@Then("user_076 verify prefered contact method field should be editable number at new app")
	public void user_076_verify_prefered_contact_method_field_should_be_editable_number_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("prefered_contact_method_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("prefered_contact_method_dropdown"))
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
						customerDetailsJSElements.getElement("prefered_contact_method_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(newAppCustomerDetailsTestData.get("prefered_contact_method"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" prefered contact method is not a dropdown hence failed");
	}

	@Then("user_076 verify prefered time for contact field should be editable HH MM format at new app")
	public void user_076_verify_prefered_time_for_contact_field_should_be_editable_hh_mm_format_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";

		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("prefered_time_for_contact_input"))
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
						customerDetailsJSElements.getElement("prefered_time_for_contact_input")));
				javascriptHelper
						.executeScriptWithWebElement(
								customerDetailsJSElements.getElement("prefered_time_for_contact_input"))
						.sendKeys(newAppCustomerDetailsTestData.get("prefered_time_for_contact"));
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

	@And("user_076 invoke softAssert in auto loan new app customer details screen")
	public void user_076_invoke_soft_assert_in_auto_loan_new_app_customer_details_screen() throws Throwable {
		softAssert.assertAll();
	}

}
