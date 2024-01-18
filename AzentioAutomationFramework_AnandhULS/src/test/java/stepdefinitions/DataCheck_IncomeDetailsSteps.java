package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class DataCheck_IncomeDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths incomeDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "IncomeDetails_JSPaths",
			"IncomeDetails_Elements", "JSPaths");
	JSPaths CommonJsElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	ExcelData incomeDetailsExcelTestData = new ExcelData(configFileReader.getTestDataFilePath(),
			"TawruqqIncomeDetailsDC_TestData", "Dataset ID");
	ExcelData tawruqqExecutionSheet = new ExcelData(configFileReader.getTestDataFilePath(), "Tawruqq_ExecutionTracker",
			"TestCase ID");
	int incomeDetailsScreenLocation = 0;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	Map<String, String> tawruqqExecutionData = new HashMap<>();
	Map<String, String> incomeDetailsTestData = new HashMap<>();
	BrowserHelper browserHelper = new BrowserHelper(driver);

	@And("user_076 get the test data for test case id AT_TW_ADC_INCOME_03")
	public void user_076_get_the_test_data_for_test_case_id_AT_TW_ADC_INCOME_03() throws Throwable {
		tawruqqExecutionData = tawruqqExecutionSheet.getTestdata("AT_TW_ADC_INCOME_03");
		System.out.println(tawruqqExecutionData.get("dataSet_ID"));
		incomeDetailsTestData = incomeDetailsExcelTestData.getTestdata(tawruqqExecutionData.get("dataSet_ID"));

	}

	@And("user_076 search the app data check tawruqq record in mail box")
	public void user_076_search_the_app_data_check_tawruqq_record_in_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getTawruqqAppDataCheckReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the app data check tawruqq record from mail box")
	public void user_076_select_the_app_data_check_tawruqq_record_from_mail_box() throws Throwable {
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
					if (recordRefNumber.equals(configFileReader.getTawruqqAppDataCheckReferenceNumber())) {
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

	@And("user_076 select the customer financials tab at app data check stage")
	public void user_076_select_the_customer_financials_tab_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(incomeDetailsElements.getElement("customer_financials_tab"))
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

	@And("user_076 select the customer personal information record at app data check stage")
	public void user_076_select_the_customer_personal_information_record_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("customer_personal_information_list_view_record"))
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

	@And("user_076 find the income details screen location at app data check stage")
	public void user_076_find_the_income_details_screen_location_at_app_data_check_stage() throws Throwable {
		String titleLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTitle = "";
		int premitiveTitleLength = 0;
		String titleText = "";
		boolean isLoopNeedToBreak = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(" i Value " + i);
				lengthOfTitle = javascriptHelper.executeScript("return " + titleLength).toString();
				premitiveTitleLength = Integer.parseInt(lengthOfTitle);
				System.out.println("Length of the query " + premitiveTitleLength);
				if (premitiveTitleLength >= 5) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= premitiveTitleLength; i++) {
			for (int j = 0; j <= 600; j++) {
				try {
					System.out.println("Premitive Title length " + premitiveTitleLength);
					titleText = javascriptHelper
							.executeScript("return document.querySelectorAll('ion-col ion-title')[" + i + "].innerText")
							.toString();
					System.out.println("Title text " + titleText);
					System.out.println(
							"Query " + "return document.querySelectorAll('ion-col ion-title')[" + i + "].innerText");
					if (titleText.equals("Income")) {
						incomeDetailsScreenLocation = i;
						isLoopNeedToBreak = true;
						break;
					} else {
						break;
					}
				} catch (Exception e) {
					if (i == 600) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isLoopNeedToBreak == true) {
				break;
			}

		}
		if (isLoopNeedToBreak == false) {
			throw new Throwable("Unable to find the income details location index");
		}

	}

	@And("user_076 select the income details record at app data check stage")
	public void user_076_select_the_income_details_record_at_app_data_check_stage() throws Throwable {
		String incomeDetailsEyeQuery = "document.querySelectorAll('table')[" + (incomeDetailsScreenLocation + 1)
				+ "].querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery));
				javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify employment type field should be read only mode")
	public void user_076_verify_employment_type_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("employment_type_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "employment type field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify income field should be read only mode")
	public void user_076_verify_income_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("income_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "Income field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify frequency field should be read only mode")
	public void user_076_verify_frequency_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("frequency_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "Frequency field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify amount field should be read only mode")
	public void user_076_verify_amount_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("amount_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "amount field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify defined percentage field should be read only mode")
	public void user_076_verify_defined_percentage_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("define_percentage_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "defined percentage field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify adjusted percentage field should be read only mode")
	public void user_076_verify_adjusted_percentage_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("income_adjusted_percentage_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "Adjusted percentage field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify amount considered field should be read only mode")
	public void user_076_verify_amount_considered_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("amount_considered_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "amount considered field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify total income field should be read only mode")
	public void user_076_verify_total_income_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("total_income_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "total income considered field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify total income considered field should be read only mode")
	public void user_076_verify_total_income_considered_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("total_income_considered_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "total income considered field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify salary credited to bank field should be read only mode")
	public void user_076_verify_salary_credited_to_bank_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("salary_credited_to_bank_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "salary credited to bank field is editable hence failed");

		System.out.println("Is Field Enable " + isFieldEnable);
	}

	@Then("user_076 verify deduction field should be read only mode")
	public void user_076_verify_deduction_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("deduction_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "deduction field is editable hence failed");
	}

	@Then("user_076 verify deduction frequency field should be read only mode")
	public void user_076_verify_deduction_frequency_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("frequency_dropdown_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "deduction frequency field is editable hence failed");
	}

	@Then("user_076 verify deduction amount field should be read only mode")
	public void user_076_verify_deduction_amount_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("deduction_amt_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "deduction amount field is editable hence failed");
	}

	@Then("user_076 verify deduction def percentage field should be read only mode")
	public void user_076_verify_deduction_def_percentage_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("deduction_def_Percentage_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "deduction defenition percentage field is editable hence failed");
	}

	@Then("user_076 verify deduction adjusted percentage field should be read only mode")
	public void user_076_verify_deduction_adjusted_percentage_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(incomeDetailsElements
								.getElement("deduction_adjusted_percentage_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "deduction adjusted percentage field is editable hence failed");
	}

	@Then("user_076 verify deduction considered field should be read only mode")
	public void user_076_verify_deduction_considered_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(incomeDetailsElements
								.getElement("deduction_amount_considered_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "deduction amount considered field is editable hence failed");
	}

	@Then("user_076 verify total deduction field should be read only mode")
	public void user_076_verify_total_deduction_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("total_deduction_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "total deduction field is editable hence failed");
	}

	@Then("user_076 verify total deduction considered field should be read only mode")
	public void user_076_verify_total_deduction_considered_field_should_be_read_only_mode() throws Throwable {
		boolean isFieldEnable = false;
		String isAttributeAvailable = "";
		for (int i = 0; i <= 3; i++) {
			try {
				isAttributeAvailable = javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("total_deduction_considred_field_status_verification"))
						.getAttribute("readonly");
				System.out.println("Is field editable from loop " + isAttributeAvailable);
				if ((isAttributeAvailable.trim()).equals("true")) {
					System.out.println("Inside if condition");
					isFieldEnable = true;
					break;
				}

			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(isFieldEnable, "total deduction considered field is editable hence failed");
	}

	@Then("user_076 verify income details list view should be non editable")
	public void user_076_verify_income_details_list_view_should_be_non_editable() throws Throwable {
		String query = "document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
				+ incomeDetailsScreenLocation + "].querySelectorAll('th').length";
		int lengthOfListViewField = 0;
		for (int i = 0; i <= 300; i++) {
			try {
				String lengthOfListViewFIeld = javascriptHelper.executeScript("return " + query).toString();
				lengthOfListViewField = Integer.parseInt(lengthOfListViewFIeld);
				if (lengthOfListViewField >= 8) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean isFieldEditable = true;
		for (int i = 0; i < lengthOfListViewField; i++) {
			try {
				String listViewFieldQuery = "document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
						+ incomeDetailsScreenLocation + "].querySelectorAll('th')[" + i + "]";
				System.out.println("List View field query " + listViewFieldQuery);
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
								+ incomeDetailsScreenLocation + "].querySelectorAll('th')[" + i + "]")
						.sendKeys("1234");

			} catch (Exception e) {
				isFieldEditable = false;
			}
			softAssert.assertFalse(isFieldEditable, "Field Editable hence failed");

		}

	}

	@And("user_076 click on search button in income details list view search button in app data check stage")
	public void user_076_click_on_search_button_in_income_details_list_view_search_button_in_app_data_check_stage()
			throws Throwable {

		String searchButtonQuery = "document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
				+ incomeDetailsScreenLocation + "].querySelector('button[ng-reflect-text=\"Search\"]')";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(searchButtonQuery));
				javascriptHelper.executeScriptWithWebElement(searchButtonQuery).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 search the valid search text in income details in app data check stage")
	public void user_076_search_the_valid_search_text_in_income_details_in_app_data_check_stage() throws Throwable {
		System.out.println("Valid search text " + incomeDetailsTestData.get("valid_search_text"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(incomeDetailsTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should show the search result for valid search text in income details app data check stage")
	public void user_076_verify_system_should_show_the_search_result_for_valid_search_text_in_income_details_app_data_check_stage()
			throws Throwable {
		String searchResultQuery = "document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
				+ incomeDetailsScreenLocation
				+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText";
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper.executeScript("return " + searchResultQuery).toString();
				if (searchResult.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Search Result " + searchResult);
		softAssert.assertTrue(!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")),
				"Search functionality not working as expected hence failed");
	}

	@And("user_076 search the invalid search text in income details in app data check stage")
	public void user_076_search_the_invalid_search_text_in_income_details_in_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(incomeDetailsTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify system should not show the search result for invalid search text in income details app data check stage")
	public void user_076_verify_system_should_not_show_the_search_result_for_invalid_search_text_in_income_details_app_data_check_stage()
			throws Throwable {
		String searchResultQuery = "document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
				+ incomeDetailsScreenLocation
				+ "].querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText";
		System.out.println("Search result Jquery " + searchResultQuery);
		String searchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				searchResult = javascriptHelper.executeScript("return " + searchResultQuery).toString();
				if ((searchResult.length() > 0) && searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Search Result " + searchResult);
		softAssert.assertTrue(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"),
				"Search functionality not working as expected hence failed");

	}

	@And("user_076 click on export button in income details list view at app data check stage")
	public void user_076_click_on_export_button_in_income_details_list_view_at_app_data_check_stage() throws Throwable {
		String incomeDetailsExportButton = "document.querySelectorAll('p-table[class=\"p-element k-datatable-grid ng-star-inserted\"]')["
				+ incomeDetailsScreenLocation + "].querySelector('p-dropdown[ng-reflect-placeholder=\"Export\"]')";

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(incomeDetailsExportButton).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on pdf export button in income details list view export option")
	public void user_076_click_on_pdf_export_button_in_income_details_list_view_export_option() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify income details list view file should be downloaded as pdf format at app data check stage")
	public void user_076_verify_income_details_list_view_file_should_be_downloaded_as_pdf_format_at_app_data_check_stage()
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
			if (downloadsFile.getName().contains("IncomeFormDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 click on xlsx export button in income details list view export option")
	public void user_076_click_on_xlsx_export_button_in_income_details_list_view_export_option() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify income details list view file should be downloaded as xlsx format at app data check stage")
	public void user_076_verify_income_details_list_view_file_should_be_downloaded_as_xlsx_format_at_app_data_check_stage()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("IncomeFormDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("user_076 click on back button in income details screen at app data check stage")
	public void user_076_click_on_back_button_in_income_details_screen_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify income details screen should get navigate to backward at app data check stage")
	public void user_076_verify_income_details_screen_should_get_navigate_to_backward_at_app_data_check_stage()
			throws Throwable {
		String incomeDetailsEyeQuery = "document.querySelectorAll('table')[" + (incomeDetailsScreenLocation + 1)
				+ "].querySelector('button[ng-reflect-text=\"View\"]')";
		boolean isEyeButtonVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery));
				isEyeButtonVisible = javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isEyeButtonVisible, "Eye button not visible hence failed");

	}

	

	@And("invoke softAssert in income details app data screen")
	public void invoke_soft_assert_in_income_details_app_data_screen() throws Throwable {
		softAssert.assertAll();
	}

}
