package stepdefinitions;

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
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarooq_CustomerDetails_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Tawarruq_NewApp_CustomerDetailsElements = new JSPaths(excelPath, "NewApp_CustomerDetailsElements",
			"New_App_CustomerDetailsElements", "JSPath");
	ExcelData Tawarruq_CustomerDetails_TestData = new ExcelData(excelTestDataPath, "CustomerDetails_TestData",
			"Dataset ID");
	JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");

	String listViewRecordStatus = "";

	String recordStatus = "";
	

	@And("User_6047 Get the test data for test case ID AT_TW_CD_03")
	public void user_get_the_test_data_for_test_case() {
		testData = Tawarruq_CustomerDetails_TestData.getTestdata("DS01_AT_TW_CD_03");

	}

	@And("User_6047 Get the test data for test case ID AT_TW_CD_05")
	public void user_get_the_test_data_for_test_case_id() {
		testData = Tawarruq_CustomerDetails_TestData.getTestdata("DS01_AT_TW_CD_05");

	
	}

	@And("User_6047 Get the test data for test case ID AT_TW_CD_06")
	public void user_get_the_test_data_for_test_case_id_() {
		testData = Tawarruq_CustomerDetails_TestData.getTestdata("DS01_AT_TW_CD_06");

	}

	@And("User_6047 Search the Ref id Under inbox")
	public void user_search_the_ref_id_under_inbox_() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_6047 Click Customer Details module")
	public void user_click_customer_details_module() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Tawarruq_NewApp_CustomerDetailsElements.getElement("customer_details_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("User_6047 verify the Date of Birth field")
	public void user_verify_the_date_of_birth_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(
								Tawarruq_NewApp_CustomerDetailsElements.getElement("date_of_birth_field"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Education Level field")
	public void user_verify_the_education_level_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										Tawarruq_NewApp_CustomerDetailsElements.getElement("education_level"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Customer Age field")
	public void user_verify_the_customer_age_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("age"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the No of Dependent field")
	public void user_verify_the_no_of_dependent_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										Tawarruq_NewApp_CustomerDetailsElements.getElement("noOfDepartment"))
						.isDisplayed());
				//javascriptHelper
				//.executeScriptWithWebElement(
						//"document.querySelector(\"#noOfDependents > ion-item\").shadowRoot.querySelector(\"div.item-native > div.item-inner > div.input-wrapper\")")
				//.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Gender field")
	public void user_verify_the_gender_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										Tawarruq_NewApp_CustomerDetailsElements.getElement("gender_dropdown"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Customer Type field")
	public void user_verify_the_customer_type_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(
								Tawarruq_NewApp_CustomerDetailsElements.getElement("customerType_verification"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Applicant Type field")
	public void user_verify_the_applicant_type_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										Tawarruq_NewApp_CustomerDetailsElements.getElement("applicantType"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Last Name or Family Name field")
	public void user_verify_the_last_name_or_family_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("lastName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the First Name field")
	public void user_verify_the_first_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("firstName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Middle Name field")
	public void user_verify_the_middle_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("middleName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Black Listed field")
	public void user_verify_the_black_listed_field() {
		for (int i = 0; i < 200; i++) {
			try {
				//Assert.assertTrue(
						//javascriptHelper
								//.executeScriptWithWebElement(
									//	Tawarruq_NewApp_CustomerDetailsElements.getElement("blacklisted"))
						//.isDisplayed());
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('#isBlacklisted > div')")
				.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Salutation or Title field")
	public void user_verify_the_salutation_or_title_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("title"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Language field")
	public void user_verify_the_language_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("language"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Category of Client field")
	public void user_verify_the_category_of_client_field() {
		for (int i = 0; i < 200; i++) {
			try {
				//Assert.assertTrue(
						//javascriptHelper
								//.executeScriptWithWebElement(
									//	Tawarruq_NewApp_CustomerDetailsElements.getElement("categoryOfClient"))
								//.isDisplayed());
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('digital-select-layout[ng-reflect-name=\"clientCategory\"]')")
				.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Marital Status field")
	public void user_verify_the_marital_status_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										Tawarruq_NewApp_CustomerDetailsElements.getElement("maritalStatus"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Resident Status field")
	public void user_verify_the_resident_status_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(
								Tawarruq_NewApp_CustomerDetailsElements.getElement("residentialStatus_verification"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Nationality field")
	public void user_verify_the_nationality_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("nationality"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Save button")
	public void user_verify_the_save_button() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(iJarah_CommonElements.getElement("save_button")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the back button")
	public void user_verify_the_back_button() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(iJarah_CommonElements.getElement("back_button")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Activate\\/Deactivate")
	public void user_verify_the_activate_deactivate() {
		for (int i = 0; i < 200; i++) {
			try {
//				Assert.assertTrue(javascriptHelper
//						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("Status"))
//						.isDisplayed());
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('digital-radio-button[ng-reflect-title=\"SCR.STATUS\"]')")
				.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 modify the nationality input")
	public void user_modify_the_nationality_input() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Tawarruq_NewApp_CustomerDetailsElements.getElement("nationality_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
			System.out.println("Map " + testData.get("nationality").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("nationality")).trim())) {
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
	}

	@Then("User_6047 click the Save button")
	public void user_click_the_save_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SaveButton")));

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the successfully saved message")
	public void user_verify_the_successfully_saved_message() {
		for (int i = 0; i < 2000; i++) {
			try {
				String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SucessPopUP"))
						.getText();
				System.out.println(text);
				Assert.assertTrue(text.contains("Success!"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Click the back Button in customer deyails")
	public void user_click_the_back_button_in_customer_deyails() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Tawarruq_NewApp_CustomerDetailsElements.getElement("Backbutton_customerdet")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 clear the last name")
	public void user_clear_the_last_name() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Tawarruq_NewApp_CustomerDetailsElements.getElement("last_name_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								Tawarruq_NewApp_CustomerDetailsElements.getElement("last_name_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}

			}
		}
		Thread.sleep(6000);
	}

	@Then("User_6047 verify customer details screen should show the validation for empty mandatory field")
	public void user_076_verify_customer_details_screen_should_show_the_validation_for_empty_mandatory_field() {
		for (int i = 0; i < 2000; i++) {
			try {
				String text = javascriptHelper
						.executeScriptWithWebElement(appDataEntry_js.getElement("PleaseFillDetails_Popup")).getText();
				System.out.println(text);
				Assert.assertTrue(text.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 enter the invalid data in last name")
	public void user_enter_the_invalid_data_in_last_name() {

		javascriptHelper

				.executeScriptWithWebElement(

						"document.querySelector('ion-label[ng-reflect-text=\"SCR.LASTNAME.TOOLTIP\"]+ion-input input')")

				.sendKeys("12345");
	}

	@Then("User_6047 verify the invalid msg in last name")
	public void user_verify_the_invalid_msg_in_last_name() {
		String fieldLevelvalidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelvalidation = javascriptHelper
						.executeScript(
								"return " + Tawarruq_NewApp_CustomerDetailsElements.getElement("LastName_ErrorMsg"))
						.toString();
				if (!(fieldLevelvalidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals("Only Alphabets are allowed", fieldLevelvalidation);

	}

	@And("User_6047 click search button")
	public void user_click_search_button() {

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_6047 search the record")
	public void user_search_the_record() {

		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
						.sendKeys(testData.get("Record_Firstname"));
				break;
			}

			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	@Then("User_6047 change the address details status to active to inactive or inactive to active")

	public void user_change_the_address_details_status_to_active_to_inactive_or_inactive_to_active() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("Status")));
				javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("Status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}


		for (int i = 0; i <= 100; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript(
								"return " + Tawarruq_NewApp_CustomerDetailsElements.getElement("facility_Status"))
						.toString();
			} catch (Exception e) {

			}
		}
	}

	@Then("User_6047 to click the back button in customer Identificatoin")
public void user_6047_to_click_the_back_button_in_customer_identificatoin( ) {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("BackButton")));

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
}

@Then("User_6047 verify the functionality of Back Button in customer Identificatoin")
public void user_6047_verify_the_functionality_of_back_button_in_customer_identificatoin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	@Then("User_6047 verify system should show the record status as active or inactive based on toggle")
	public void verify_system_should_show_the_record_status_as_active_or_inactive_based_on_toggle() throws Throwable {
		Thread.sleep(1000);
		// System.out.println("Index value in list view record validation " +
		// indexOfListView);
		for (int i = 0; i <= 3000; i++) {
			try {
				if (i > 2500) {
					System.out.println(
							"document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText");
					listViewRecordStatus = javascriptHelper.executeScript(
							"return document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
							.toString();

					System.out.println("List view Record status " + listViewRecordStatus);
					if (!(listViewRecordStatus.isEmpty())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (recordStatus.equals("false")) {
			softAssert.assertEquals(listViewRecordStatus, "In-active");
		} else if (recordStatus.equals("true")) {
			softAssert.assertEquals(listViewRecordStatus, "Active");
		}
	}

	@Then("User_6047 to verify the fields on list view of Customer Personal Information")
	public void user_to_verify_the_fields_on_list_view_of_customer_personal_information() {
		String listViewRecordLabels = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewRecordLabels = javascriptHelper.executeScript("return "
						+ Tawarruq_NewApp_CustomerDetailsElements.getElement("customer_details_list_view_record"))
						.toString();
				if (!(listViewRecordLabels.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(listViewRecordLabels.contains("Id"), "Id is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("First Name"), "First Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Middle Name"), "Middle Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Last Name"), "Last Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Family Name"), "Family Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Customer Type"),
				"Customer Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Applicant Type"),
				"Applicant Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Status"), "Status is not visible in list view");

		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("searchButton"))
						.isDisplayed());
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("addButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_6047 click the add button")
	public void user_click_the_add_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("addButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify clicking on Add button allow user to create new record of Customer Information details")
	public void user_verify_clicking_on_add_button_allow_user_to_create_new_record_of_customer_information_details() {
		String listViewRecordLabels = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewRecordLabels = javascriptHelper
						.executeScript("return "
								+ Tawarruq_NewApp_CustomerDetailsElements.getElement("addButton_verification"))
						.toString();
				if (!(listViewRecordLabels.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(listViewRecordLabels.contains("Customers Information"), "add button not work");

	}

	@Then("User_6047 click the back button in customer information")
	public void user_click_the_back_button_in_customer_information() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Tawarruq_NewApp_CustomerDetailsElements.getElement("Backbutton_customerdet")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 click the Search button under customer details tab and search the matching data in listview")
	public void user_click_the_search_button_under_customer_details_tab_and_search_the_matching_data_in_listview() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("searchButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
						.sendKeys(testData.get("matching data"));
				Thread.sleep(3000);
				break;
			}

			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 check the match result data in customer details list view")
	public void user_check_the_match_result_data_in_customer_details_list_view() {
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper.executeScript("return " + Tawarruq_NewApp_CustomerDetailsElements
						.getElement("customer_details_list_view_search_result")).toString();
				if (!(searchResult.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
			softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
					"system is not showing the matched result");
		}
	}

	@Then("User_6047 clear the search box in customer details")
	public void user_clear_the_search_box_in_customer_details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
						.clear();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 click the Search button under customer details tab and search the mismatching data in listview")
	public void user_click_the_search_button_under_customer_details_tab_and_search_the_mismatching_data_in_listview() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("searchButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
						.sendKeys(testData.get("mismatch data"));
				Thread.sleep(3000);
				break;
			}

			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 check the mismatch result in customer details list view")
	public void user_check_the_mismatch_result_in_customer_details_list_view() {
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper.executeScript("return " + Tawarruq_NewApp_CustomerDetailsElements
						.getElement("customer_details_list_view_search_result")).toString();
				if (!(searchResult.isEmpty()) && i > 250) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
				"system is  showing the un matched result");

	}

	@Then("User_6047 click the back button in customer details")
	public void user_click_the_back_button_in_customer_details() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						Tawarruq_NewApp_CustomerDetailsElements.getElement("backButton_prev")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the back button functionality")
	public void user_verify_the_back_button_functionality() {
		String inboxTitle = "";
		for (int i = 0; i <= 300; i++) {
			try {
				inboxTitle = javascriptHelper
						.executeScript("return " + Tawarruq_NewApp_CustomerDetailsElements.getElement("inbox_title"))
						.toString();
				if (!(inboxTitle.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(inboxTitle.contains("Inbox"), "back button not work");
		System.out.println(inboxTitle);
	}

	@Then("User_6047 to verify the Values in list view should be in read only mode in customer details")
	public void user_to_verify_the_values_in_list_view_should_be_in_read_only_mode_in_customer_details() {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
						.sendKeys("123456");
			} catch (Exception e) {
				if (i == 20) {
					status = true;
				}
			}
		}
		Assert.assertTrue(status);

	}

}