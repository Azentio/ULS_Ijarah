package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawruqq_DataCheck_IncomeDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths incomeDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "IncomeDetails_JSPaths",
			"IncomeDetails_Elements", "JSPaths");
	JSPaths CommonJsElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	int incomeDetailsScreenLocation = 0;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();

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
		int premitiveTitleLength;
		String titleText = "";
		boolean isLoopNeedToBreak = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(" i Value " + i);
				lengthOfTitle = javascriptHelper.executeScript("return " + titleLength).toString();
				System.out.println("Length of the query " + lengthOfTitle);
				if ((lengthOfTitle.length() > 0) || lengthOfTitle.equals("5")) {
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
		premitiveTitleLength = Integer.parseInt(lengthOfTitle);
		System.out.println("Title length " + premitiveTitleLength);
		for (int i = 0; i <= premitiveTitleLength; i++) {
			for (int j = 0; j <= 300; j++) {
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
					if (i == 300) {
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

	@And("invoke softAssert in income details app data screen")
	public void invoke_soft_assert_in_income_details_app_data_screen() throws Throwable {
		softAssert.assertAll();
	}

}
