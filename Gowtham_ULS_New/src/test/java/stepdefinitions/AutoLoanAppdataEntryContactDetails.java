package stepdefinitions;

import java.awt.Robot;
import java.io.File;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoanAppdataEntryContactDetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths ALoanAppdataEntryContactDetails = new JSPaths(excelPath, "ALoanAppdataEntryContactDetails", "FieldName", "JSPath");
	JSPaths IjADataEntryIdentifiDetails = new JSPaths(excelPath, "IjADataEntryIdentifiDetails", "FieldName", "JSPath");
	ExcelData ALoanAppdataEntryContactDetailsexelData = new ExcelData(excelTestDataPath, "ALoanAppdataEntryContactDetails", "Data Set ID");
	ExcelData AutoLoanExecutionExcel = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	Map<String, String> testData;
	JSPaths TawaAppDataEntryIncomeDetails = new JSPaths(excelPath, "TawaAppDataEntryIncomeDetails", "FieldName", "JSPath");
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	String listViewRecordStatus = "";
	String recordStatus = "";
	Robot robot;
	int indexOfListView;
	Map<String, String> AutoLoanExecution;

	@And("user_607 get the test data for the test case ID AT_AL_APD_CD_01")
	public void user_607_get_the_test_data_for_the_test_case_id_AT_AL_APD_CD_01() throws Throwable {
		AutoLoanExecution = AutoLoanExecutionExcel.getTestdata("AT_AL_APD_CD_01");
		testData = ALoanAppdataEntryContactDetailsexelData.getTestdata(AutoLoanExecution.get("dataSet_ID"));
	}
	
	@And("user_607 get the test data for the test case ID AT_AL_APD_CD_02")
	public void user_607_get_the_test_data_for_the_test_case_id_AT_AL_APD_CD_02() throws Throwable {
		AutoLoanExecution = AutoLoanExecutionExcel.getTestdata("AT_AL_APD_CD_02");
		testData = ALoanAppdataEntryContactDetailsexelData.getTestdata(AutoLoanExecution.get("dataSet_ID"));
	}
	
	@And("user_607 get the test data for the test case ID AT_AL_APD_CD_03")
	public void user_607_get_the_test_data_for_the_test_case_id_AT_AL_APD_CD_03() throws Throwable {
		AutoLoanExecution = AutoLoanExecutionExcel.getTestdata("AT_AL_APD_CD_03");
		testData = ALoanAppdataEntryContactDetailsexelData.getTestdata(AutoLoanExecution.get("dataSet_ID"));
	}
	
	@And("user_607 get the test data for the test case ID AT_AL_APD_CD_04")
	public void user_607_get_the_test_data_for_the_test_case_id_AT_AL_APD_CD_04() throws Throwable {
		AutoLoanExecution = AutoLoanExecutionExcel.getTestdata("AT_AL_APD_CD_04");
		testData = ALoanAppdataEntryContactDetailsexelData.getTestdata(AutoLoanExecution.get("dataSet_ID"));
	}
	
	@And("user_607 get the test data for the test case ID AT_AL_APD_CD_05")
	public void user_607_get_the_test_data_for_the_test_case_id_AT_AL_APD_CD_05() throws Throwable {
		AutoLoanExecution = AutoLoanExecutionExcel.getTestdata("AT_AL_APD_CD_05");
		testData = ALoanAppdataEntryContactDetailsexelData.getTestdata(AutoLoanExecution.get("dataSet_ID"));
	}
	
	@Given("User_607 Search the Ref Id under inbox Auto Loan Appdata Entry Contact Details")
	public void user_607_search_the_ref_id_under_inbox_auto_loan_appdata_entry_contact_details() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TawaAppDataEntryIncomeDetails.getElement("searchInInbox")).sendKeys(testData.get("record_reference_number"),Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
	}
	}



	@And("user_607 click on additional customer info tab in new application stage")
	public void user_607_click_on_additional_customer_info_tab_in_new_application_stage() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("additional_customer_info_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("user_607 click on additional customer info tab in Ijarah AppData Entry Identification Details")
	public void user_click_on_additional_customer_info_tab_in_ijarah_app_data_entry_identification_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IjADataEntryIdentifiDetails.getElement("Additional_CustomerInformation")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_607 click on edit button customer personal information screen at new app stage")
	public void user_607_click_on_edit_button_customer_personal_information_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("customer_personal_information_edit_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_607 select the new application stage record for contact details screen")
	public void user_607_select_the_new_application_stage_record_for_contact_details_screen() throws Throwable {

		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 300; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
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
					if (recordRefNumber.equals(testData.get("record_reference_number"))) {
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

	@And("user_607 verify contact details list view record should be read only not editable at new app stage")
	public void user_607_verify_contact_details_list_view_record_should_be_read_only_not_editable_at_new_app_stage()
			throws Throwable {

		boolean statusOfListViewRecord = false;
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		String listViewName = "";
		String noOfListView = "";
		boolean isIndexFound = false;
		for (int i = 0; i <= 300; i++) {
			try {
				noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
				if (noOfListView.equals("0") && !(noOfListView.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("No Of List view " + noOfListView);
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
							+ i + "].innerText").toString();
					if (listViewName.contains("Contact Details")) {

						indexOfListView = i;

						isIndexFound = true;
						break;
					} else {

						isIndexFound = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}

				}
			}
			if (isIndexFound == true) {
				break;
			}

		}

		for (int i = 0; i <= 50; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('p-tag')")
						.click();
				if (i > 40) {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('p-tag')")
							.sendKeys(Keys.PAGE_DOWN);
				}
			} catch (Exception e) {
				if (i == 50) {
					statusOfListViewRecord = true;
				}
			}
		}
		System.out.println(statusOfListViewRecord);
		Assert.assertTrue(statusOfListViewRecord);
	}

	@And("user_607 click on edit button in list view record of contact details in new app stage")
	public void user_607_click_on_edit_button_in_list_view_record_of_contact_details_in_new_app_stage()
			throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]').length";
		String listViewName = "";
		String noOfListView = "";
		boolean isIndexFound = false;
		for (int i = 0; i <= 300; i++) {
			try {
				noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
				if (noOfListView.equals("0") && !(noOfListView.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitivListViews = Integer.parseInt(noOfListView);
		for (int i = 0; i < premitivListViews; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					listViewName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + i + "].innerText")
							.toString();
					if (listViewName.contains("Contact Details")) {

						indexOfListView = i;

						isIndexFound = true;
						break;
					} else {

						isIndexFound = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}

				}
			}
			if (isIndexFound == true) {
				break;
			}

		}
		for (int i = 0; i <= 600; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement("document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')")
						.click();

				break;
			} catch (Exception e) {
				if (i > 550 && i < 600) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"));
				}
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_607 update the phone number in contact details list view record in new app stage")
	public void user_update_the_phone_number_in_contact_details_list_view_record_in_new_app_stage() throws Throwable {
		for (int i = 0; i < 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("phone number"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_607 click on save button after update the contact details in new app stage")
	public void user_click_on_save_button_after_update_the_contact_details_in_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_607 verify system should show the update successful popup while update the contact details record in new app stage")
	public void user_verify_system_should_show_the_update_successful_popup_while_update_the_contact_details_record_in_new_app_stage()
			throws Throwable {
		String savePopup = "";
		for (int i = 0; i <= 300; i++) {
			try {
				savePopup = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("toast_container_message")).toString();
				if (!(savePopup.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(savePopup);
		// Success! Record created
		Assert.assertTrue(savePopup.contains("Success! Record updated"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("toast_container_message_close_button")).click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_607 make phone number field as blank in contact details at new app stage")
	public void user_607_make_phone_number_field_as_blank_in_contact_details_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}
	}

	@And("user_607 click on add butto in contact details screen in new app stage")
	public void user_607_click_on_add_butto_in_contact_details_screen_in_new_app_stage() throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		System.out.println("");
		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 200) {
					System.out.println("Query " + labelLength);
					lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
					if (!(lengthOfTheLabel.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
		System.out.println("Length of the label " + premitiveLabelLength);

		for (int i = 0; i < premitiveLabelLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Contact Details").trim())) {

						System.out.println("Label Name " + labelName);
						if (i > 250) {
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						isAddButttonClicked = true;

						break;
					} else {
						isAddButttonClicked = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButttonClicked == true) {
				break;
			}
		}

	}

	@And("user_607 phone type field should be editable dropdown in contact details screen at new app stage")
	public void user_607_phone_type_field_should_be_editable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		System.out.println("Phone type dropdown " + ALoanAppdataEntryContactDetails.getElement("phone_type_dropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("phone type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));

	}

	@And("user_607 phone number field should be editable number field in contact details screen at new app stage")
	public void user_607_phone_number_field_should_be_editable_number_field_in_contact_details_screen_at_new_app_stage()
			throws Throwable {

		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());

				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number",
				"Mobile number field is text input hence failed");
		for (int i = 0; i < 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("phone number"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_607 consent for phone contact should be editable dropdown in contact details screen at new app stage")
	public void user_607_consent_for_phone_contact_should_be_editable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("consent_for_phone_contact_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("consent_for_phone_contact_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("consent for phone contact"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"),
				"consent for phone contact field is not a dropdown hence failed");

	}

	@And("user_607 prefered phone contact type field should be ditable dropdown in contact details screen at new app stage")
	public void user_607_prefered_phone_contact_type_field_should_be_ditable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("prefered_phone_contact_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("prefered_phone_contact_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("prefered phone contact type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"),
				"Prefered phone contact type is not a dropdown its failed");

	}

	@And("user_607 prefered time for contact field shoule be editable field type should be HH MM type in contact details screen at new app stage")
	public void user_607_prefered_time_for_contact_field_shoule_be_editable_field_type_should_be_hh_mm_type_in_contact_details_screen_at_new_app_stage()
			throws Throwable {

		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("prefered_time_for_contact_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("prefered_time_for_contact_input"))
						.sendKeys(testData.get("prefered time for contact"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("prefered_time_for_contact_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));
	}

	@And("user_607 email type field should be editable dropdown in contact details screen at new app stage")
	public void user_607_email_type_field_should_be_editable_dropdown_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("email type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"), "Emai Type is not a dropdown hence failed");

	}

	@And("user_607 email ID field should be editable emial iD field in contact details screen at new app stage")
	public void user_607_email_id_field_should_be_editable_emial_i_d_field_in_contact_details_screen_at_new_app_stage()
			throws Throwable {
		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.sendKeys(testData.get("email id"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));

	}

	@And("user_607 click on save button without enter the details in contact details screen in new app stage")
	public void user_607_click_on_save_button_without_enter_the_details_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		robot = new Robot();
		robot.mouseWheel(-500);
		for (int i = 0; i <= 300; i++) {
			try {
				robot.mouseWheel(-500);
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("save_button")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_607 verify contact details should show the mandatory field validation in new app stage")
	public void user_607_verify_contact_details_should_show_the_mandatory_field_validation_in_new_app_stage()
			throws Throwable {

		String mandatoryValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				mandatoryValidation = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("toast_message")).toString();
				if (!(mandatoryValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(mandatoryValidation);
		softAssert.assertEquals(mandatoryValidation, "Please fill all the details");

	}

	@And("user_607 enter the character input in phone numver field in contact details screen in new app stage")
	public void user_607_enter_the_character_input_in_phone_numver_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_607 verify phone number field should show the validation for character input in new app stage")
	public void user_607_verify_phone_number_field_should_show_the_validation_for_character_input_in_new_app_stage()
			throws Throwable {
		String fieldValidation = "";

		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number");
	}

	@And("user_607 enter the negative input in phone number field in contact details screen in new app stage")
	public void user_607_enter_the_negative_input_in_phone_number_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));
			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input")).sendKeys(testData.get("invalid mobile number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_607 verify phone number field should show the validation for negative input in new app stage")
	public void user_607_verify_phone_number_field_should_show_the_validation_for_negative_input_in_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("phone_number_field_validation2")).toString();
				if ((!fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Only Alphanumeric characters are allowed");
	}

	@And("user_607 enter the special character input in phone numver field in contact details screen in new app stage")
	public void user_607_enter_the_special_character_input_in_phone_numver_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("special character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_607 verify phone number field should show the validation for special character input in new app stage")
	public void user_607_verify_phone_number_field_should_show_the_validation_for_special_character_input_in_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("phone_number_field_validation"))
						.toString();
				if ((!fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Only Alphanumeric characters are allowed");
	}

	@And("user_607 clear the email id field in contact details at new app stage")
	public void user_clear_the_email_id_field_in_contact_details_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
	}

	@And("user_607 enter the invaid mail id input inemail id field in contact details screen in new app stage")
	public void user_607_enter_the_invaid_mail_id_input_inemail_id_field_in_contact_details_screen_in_new_app_stage()
			throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.sendKeys(testData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_607 verify email id field should show the validation for invalid mail id input in new app stage")
	public void user_607_verify_email_id_field_should_show_the_validation_for_invalid_mail_id_input_in_new_app_stage()
			throws Throwable {

		String fieldValidation = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldValidation = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("email_id_field_validation"))
						.toString();
				if ((!fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
					;
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Email");
	}

	@Then("user_607 verify contact details screen should get open with save buttton and back button")
	public void user_607_verify_contact_details_screen_should_get_open_with_save_buttton_and_back_button()
			throws Throwable {
		Thread.sleep(1000);
		boolean backButtonVerification = false;
		boolean saveButtonVerification = false;
		for (int i = 0; i <= 200; i++) {
		try {
			
				backButtonVerification = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("back_button")).isDisplayed();

				if (backButtonVerification == true) {
					break;
				}
		} catch (Exception e) {
			if (i == 200) {
				Assert.fail(e.getMessage());
			}
		}
			}
		
		softAssert.assertTrue(backButtonVerification, "Back button is not visible hence failed");
		for (int i = 0; i <= 200; i++) {
			saveButtonVerification = javascriptHelper
					.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("save_button")).isDisplayed();

			if (saveButtonVerification == true) {
				break;
			}
		}
		softAssert.assertTrue(saveButtonVerification, " Save button is not visible hence failed ");

	}

	@Then("user_607 verify phone type field should be editable numeric field at new app stage")
	public void user_607_verify_phone_type_field_should_be_editable_numeric_field_at_new_app_stage() throws Throwable {
		String fieldLevelVerification = "";
		System.out.println("Phone type dropdown " + ALoanAppdataEntryContactDetails.getElement("phone_type_dropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("phone type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));
		softAssert.fail("phone type is not a numeric field hence failed");
	}

	@Then("user_607 verify phone number field should be editable numeric field at new app stage")
	public void user_607_verify_phone_number_field_should_be_editable_numeric_field_at_new_app_stage()
			throws Throwable {
		String fieldValidation = "";
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("character input"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				fieldValidation = javascriptHelper.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("phone_number_field_validation")).toString();
				if ((!fieldValidation.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(fieldValidation);
		softAssert.assertEquals(fieldValidation, "Invalid Mobile Number",
				"Mobile number field is text input hence failed");
		for (int i = 0; i < 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.DELETE));

			} catch (Exception e) {
			}
		}

		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("phone_number_input"))
						.sendKeys(testData.get("phone number"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_607 verify Consent for Phone Contact should be editable numeric at new app stage")
	public void user_607_verify_consent_for_phone_contact_should_be_editable_numeric_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("consent_for_phone_contact_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("consent_for_phone_contact_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("consent for phone contact"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));
		softAssert.fail("consent for phone contact field is not a numeric field hence failed");
	}

	@Then("user_607 verify prefered phone contact type field should be editable email format at new app stage")
	public void user_607_verify_prefered_phone_contact_type_field_should_be_editable_email_format_at_new_app_stage()
			throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("prefered_phone_contact_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("prefered_phone_contact_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("prefered phone contact type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"));
		softAssert.fail("preferd phone contact type field is not a email type field hence failed");
	}

	@Then("user_607 verify prefered time for contact field should be editable number format at new app stage")
	public void user_607_verify_prefered_time_for_contact_field_should_be_editable_number_format_at_new_app_stage()
			throws Throwable {
		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("prefered_time_for_contact_input")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("prefered_time_for_contact_input"))
						.sendKeys(testData.get("prefered time for contact"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(
								ALoanAppdataEntryContactDetails.getElement("prefered_time_for_contact_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));

	}

	@Then("user_607 verify email type field should be editable dropdown at new app stage")
	public void user_607_verify_email_type_field_should_be_editable_dropdown_at_new_app_stage() throws Throwable {
		String fieldLevelVerification = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldLevelVerification = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(testData.get("email type"));
		softAssert.assertTrue(fieldLevelVerification.contains("Select"), "Emai Type is not a dropdown hence failed");

	}

	@Then("user_607 verify email ID field should be number editable at new app stage")
	public void user_607_verify_email_id_field_should_be_number_editable_at_new_app_stage() throws Throwable {
		String preferedTimeForContact = "";
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.sendKeys(testData.get("email id"));
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 200; i++) {
			try {
				preferedTimeForContact = javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("email_input_input"))
						.getAttribute("type");
				if (!(preferedTimeForContact.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(preferedTimeForContact.contains("text"));
	}

	@And("user_607 click on save button in contact details screen at new app stage")
	public void user_click_on_save_button_in_contact_details_screen_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_607 show the save successful pop up for contact details screen at new app stage")
	public void user_show_the_save_successful_pop_up_for_contact_details_screen_at_new_app_stage() throws Throwable {
		String savePopup = "";
		for (int i = 0; i <= 300; i++) {
			try {
				savePopup = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("toast_container_message")).toString();
				if (!(savePopup.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(savePopup);
		// Success! Record created
		Assert.assertTrue(savePopup.contains("Success! Record created"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALoanAppdataEntryContactDetails.getElement("toast_container_message_close_button")).click();

				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_607 click on toggle button and capture the status of cutact details record at new app stage")
	public void user_click_on_toggle_button_and_capture_the_status_of_cutact_details_record_at_new_app_stage()
			throws Throwable {
		String tempRecordStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				tempRecordStatus = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("contact_details_toggle_status"))
						.toString();
				System.out.println("Temp Record Status " + tempRecordStatus);
				if (!(tempRecordStatus.isBlank())) {
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
				javascriptHelper
						.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("contact_details_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 3000; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript("return " + ALoanAppdataEntryContactDetails.getElement("contact_details_toggle_status"))
						.toString();

				if (!(recordStatus.equals(tempRecordStatus))) {
					System.out.println("Main record status " + recordStatus);
					break;
				}
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_607 verify contact details record status in list view at new app stage")
	public void user_verify_contact_details_record_status_in_list_view_at_new_app_stage() throws Throwable {
		System.out.println("Index value in list view record validation " + indexOfListView);
		for (int i = 0; i <= 3000; i++) {
			try {
				if (i > 2500) {
					System.out.println(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText");
					listViewRecordStatus = javascriptHelper
							.executeScript("return document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
									+ indexOfListView
									+ "].querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
							.toString();

					System.out.println("List view Record status " + listViewRecordStatus);
					if (!(listViewRecordStatus.isBlank())) {
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

	@And("user_607 click on edit button in contact details list view at new app stage")
	public void user_click_on_edit_button_in_contact_details_list_view_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 600; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement("document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-pencil\"')")
						.click();

				break;
			} catch (Exception e) {
				if (i > 550 && i < 600) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"p-2 md hydrated\"]')[" + indexOfListView
									+ "].querySelector('button[icon=\"pi pi-pencil\"')"));
				}
				if (i == 600) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_607 click on export button in contact details list view at new app stage")
	public void user_607_click_on_export_button_in_contact_details_list_view_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				if (i < 250) {

					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
							.click();
					break;
				}
				if (i > 250) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')"));
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('div[aria-label=\"dropdown trigger\"]')")
							.click();
					break;
				}

			} catch (Exception e) {

				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("user_607 click on pdf options in contact details export option at new app stage")
	public void user_607_click_on_pdf_options_in_contact_details_export_option_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("pdf_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("user_607 verify contact details pdf file should download in new app stage")
	public void user_607_verify_contact_details_pdf_file_should_download_in_new_app_stage() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerIdentificationDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_607 click on xlsx options in contact details export option at new app stage")
	public void user_607_click_on_xlsx_options_in_contact_details_export_option_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("xls_download")).click();
				break;

			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("user_607 verify contact details xlsx file should download in new app stage")
	public void user_607_verify_contact_details_xlsx_file_should_download_in_new_app_stage() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerIdentificationDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("user_607 click on contact details list view search button at new app stage")
	public void user_607_click_on_contact_details_list_view_search_button_at_new_app_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('button[icon=\"pi pi-search\"]')")
						.click();
				break;

			} catch (Exception e) {
				if (i > 250 && i < 300) {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView + "].querySelector('button[icon=\"pi pi-search\"]')"));
				}
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	
	@Then("user_607 verify contact details list view should show the unmatched results at new app stage")
	public void user_607_verify_contact_details_list_view_should_show_the_unmatched_results_at_new_app_stage()
			throws Throwable {
		String searchResult = "";
		System.out.println("Index is " + indexOfListView);
		Thread.sleep(500);
		for (int i = 0; i <= 60000; i++) {
			try {
				if (i > 50000) {

					searchResult = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
									+ indexOfListView
									+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
							.toString();
					break;
				}

			} catch (Exception e) {

				if (i == 60000) {
					Assert.fail(e.getMessage());
				}

			}
		}
		System.out.println(searchResult);

		softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries");

	}

	@And("user_607 click on back button in contact details screen at new app stage")
	public void user_607_click_on_back_button_in_contact_details_screen_at_new_app_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ALoanAppdataEntryContactDetails.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_607 verify contact details screen should get moved to backward at new app stage")
	public void user_607_verify_contact_details_screen_should_get_moved_to_backward_at_new_app_stage()
			throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		boolean addButtonStatus = false;
		System.out.println("");
		for (int i = 0; i <= 300; i++) {
			try {
				if (i > 200) {
					System.out.println("Query " + labelLength);
					lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
					if (!(lengthOfTheLabel.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
		System.out.println("Length of the label " + premitiveLabelLength);

		for (int i = 0; i < premitiveLabelLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isBlank()) && (labelName.trim()).equalsIgnoreCase(("Contact Details").trim())) {

						System.out.println("Label Name " + labelName);
						if (i > 250) {
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}

						addButtonStatus = javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]")
								.isDisplayed();

						if (addButtonStatus == true) {

							isAddButttonClicked = true;

							break;
						}
					} else {
						isAddButttonClicked = false;
						break;
					}
				} catch (Exception e) {
					if (j == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButttonClicked == true) {
				break;
			}
		}
		softAssert.assertTrue(addButtonStatus,"Back Button is not working");
	}

	@And("user_607 invoke softAssert in contac details new new app stage")
	public void user_607_invoke_soft_assert_in_contac_details_new_new_app_stage() throws Throwable {
		softAssert.assertAll();
	}


}
