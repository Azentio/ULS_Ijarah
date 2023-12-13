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
	ExcelData newAppExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(), "NewAppExecution",
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
		newAppCustomerDetailsTestData = customerDetailsTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

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
						.sendKeys(newAppCustomerDetailsTestData.get("date_of_birth"));
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
	public void user_076_verify_customer_details_field_should_have_save_and_back_button()throws Throwable {
	    
	    
	}

	@Then("user_076 verify customer type field should be mandatory editable dropdown at new app")
	public void user_076_verify_customer_type_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify applicant type field should be mandatory editable dropdown at new app")
	public void user_076_verify_applicant_type_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify salutation field should be mandatory editable dropdown at new app")
	public void user_076_verify_salutation_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify first name field should be mandatory editable textbox at new app")
	public void user_076_verify_first_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify last name field should be mandatory editable textbox at new app")
	public void user_076_verify_last_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify father first name field should be mandatory editable textbox at new app")
	public void user_076_verify_father_first_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify father middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_father_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify father last name field should be mandatory editable textbox at new app")
	public void user_076_verify_father_last_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify spouse first name field should be mandatory editable textbox at new app")
	public void user_076_verify_spouse_first_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify spouse middle name field should be non mandatory editable textbox at new app")
	public void user_076_verify_spouse_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify spouse last name field should be mandatory editable textbox at new app")
	public void user_076_verify_spouse_last_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify no of children field should be non mandatory editable textbox")
	public void user_076_verify_no_of_children_field_should_be_non_mandatory_editable_textbox()throws Throwable {
	    
	    
	}

	@Then("user_076 verify spouse status field should be non mandatory editable dropdown at new app")
	public void user_076_verify_spouse_status_field_should_be_non_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify date of birth field should be mandatory editable calendar at new app")
	public void user_076_verify_date_of_birth_field_should_be_mandatory_editable_calendar_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify gender field should be mandatory editable dropdown at new app")
	public void user_076_verify_gender_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify education level field should be mandatory editable dropdown at new app")
	public void user_076_verify_education_level_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify maritail status field should be mandatory editable dropdown at new app")
	public void user_076_verify_maritail_status_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify nationality field should be mandatory editable dropdown at new app")
	public void user_076_verify_nationality_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify category field should be mandatory editable dropdown at new app")
	public void user_076_verify_category_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify religion field should be mandatory editable dropdown at new app")
	public void user_076_verify_religion_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify residential status field should be mandatory editable dropdown at new app")
	public void user_076_verify_residential_status_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify language field should be mandatory editable dropdown at new app")
	public void user_076_verify_language_field_should_be_mandatory_editable_dropdown_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify no of dependents field should be mandatory editable textbox at new app")
	public void user_076_verify_no_of_dependents_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify mothers maiden name field should be mandatory editable textbox at new app")
	public void user_076_verify_mothers_maiden_name_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify residence field should be mandatory editable textbox at new app")
	public void user_076_verify_residence_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify industry segmentation field should be mandatory editable textbox at new app")
	public void user_076_verify_industry_segmentation_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify income considered field should be mandatory editable textbox at new app")
	public void user_076_verify_income_considered_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify costomer profile field should be mandatory editable textbox at new app")
	public void user_076_verify_costomer_profile_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify relationship field should be mandatory editable textbox at new app")
	public void user_076_verify_relationship_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify existing bank relationship field should be mandatory editable textbox at new app")
	public void user_076_verify_existing_bank_relationship_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify blacklisted field should be mandatory editable textbox at new app")
	public void user_076_verify_blacklisted_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify politically exposed field should be mandatory editable textbox at new app")
	public void user_076_verify_politically_exposed_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify remarks field should be mandatory editable textbox at new app")
	public void user_076_verify_remarks_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify phone number field should be mandatory editable textbox at new app")
	public void user_076_verify_phone_number_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify phone number primary field should be mandatory editable textbox at new app")
	public void user_076_verify_phone_number_primary_field_should_be_mandatory_editable_textbox_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify phone number secondary field should be editable number at new app")
	public void user_076_verify_phone_number_secondary_field_should_be_editable_number_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify email id field should be editable number at new app")
	public void user_076_verify_email_id_field_should_be_editable_number_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify prefered contact method field should be editable number at new app")
	public void user_076_verify_prefered_contact_method_field_should_be_editable_number_at_new_app()throws Throwable {
	    
	    
	}

	@Then("user_076 verify prefered time for contact field should be editable HH MM format at new app")
	public void user_076_verify_prefered_time_for_contact_field_should_be_editable_hh_mm_format_at_new_app()throws Throwable {
	    
	    
	}
	@And("user_076 invoke softAssert in auto loan new app customer details screen")
	public void user_076_invoke_soft_assert_in_auto_loan_new_app_customer_details_screen() throws Throwable {
		softAssert.assertAll();
	}

}
