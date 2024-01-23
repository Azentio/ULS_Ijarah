package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjarahCustomerSearchStep extends BaseClass {

	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getIjarahTestDataFilePath();
	String jsFilePath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getIjarahTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths CustomerSearchPaths = new JSPaths(jsFilePath, "CustomerSearch", "FieldName", "Jspath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	ClicksAndActionsHelper clickAndActions = new ClicksAndActionsHelper(driver);

	@Then("user click the menu icon in after loginscreen")
	public void user_click_the_menu_icon_in_after_loginscreen() {
		for (int i = 0; i < 500; i++) {
			try {
				// System.out.println(CustomerSearchPaths.getElement("MenuButton"));
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("MenuButton")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user navigate to the Transactions flag")
	public void user_navigate_to_the_transactions_flag() {
		for (int i = 0; i < 500; i++) {
			try {
				System.out.println(CustomerSearchPaths.getElement("MenuButton"));
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("Transactions")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user navigate to the Application manager flag")
	public void user_navigate_to_the_application_manager_flag() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("ApplicationManager"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user click the Application details flag")
	public void user_click_the_application_details_flag() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("ApplicationDetails"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user click the add icon to add the customer details")
	public void user_click_the_add_icon_to_add_the_customer_details() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("AddIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("Check the Search field is available or not")
	public void check_the_search_field_is_available_or_not() throws Throwable {
		Thread.sleep(3000);
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("SearchIcon")).isDisplayed()) {
			SoftAssert.fail("SearchIcon");
		}

	}

	@Then("Check the Clear field is available or not")
	public void check_the_clear_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("ClearIcon")).isDisplayed()) {
			SoftAssert.fail("ClearIcon");
		}

	}

	@Then("Check the customer type field is available or not")
	public void check_the_customer_type_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CustomerType"))
				.isDisplayed()) {
			SoftAssert.fail("CustomerType");
		}
	}

	@Then("Check the Cif id field is available or not")
	public void check_the_cif_id_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CIFID")).isDisplayed()) {
			SoftAssert.fail("CIFID");
		}
	}

	@Then("Check the id type field is available or not")
	public void check_the_id_type_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("IDType")).isDisplayed()) {
			SoftAssert.fail("IDType");
		}
	}

	@Then("Check the id number field is available or not")
	public void check_the_id_number_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("IDNumber")).isDisplayed()) {
			SoftAssert.fail("IDNumber");
		}
		SoftAssert.assertAll();
	}

	@Then("Select the customer type as individual")
	public void select_the_customer_type_as_individual() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CustomerTypeIndividual"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
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

			System.out.println("Map " + " Individual Customer ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" Individual Customer ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clickAndActions.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clickAndActions.clickOnElement(javascriptHelper.executeScriptWithWebElement(

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

	@Given("Check the application numbers field is available or not")
	public void check_the_application_numbers_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("ApplicationNumber"))
				.isDisplayed()) {
			SoftAssert.fail("ApplicationNumber");
		}
		// SoftAssert.assertAll()
	}

	@Then("Check the Customer name field is available or not")
	public void check_the_customer_name_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CustomerName"))
				.isDisplayed()) {
			SoftAssert.fail("CustomerName");
		}
	}

	@Then("Check the Mobile number field is available or not")
	public void check_the_mobile_number_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("MobileNumber"))
				.isDisplayed()) {
			SoftAssert.fail("MobileNumber");
		}
	}

	@Then("Check the Date of birth field is available or not")
	public void check_the_date_of_birth_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("DateofBirth"))
				.isDisplayed()) {
			SoftAssert.fail("DateofBirth");
		}
	}

	@Then("Check the Email ID field is available or not")
	public void check_the_email_id_field_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("EmailID")).isDisplayed()) {
			SoftAssert.fail("EmailID");
		}
	}

	@Then("Enter the mandetory fields")
	public void enter_the_mandetory_fields() {
		javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CustomerName")).sendKeys("ram");
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("IDType")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
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

			System.out.println("Map " + " AADHAR CARD ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" AADHAR CARD ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clickAndActions.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clickAndActions.clickOnElement(javascriptHelper.executeScriptWithWebElement(

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
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("IDNumber"))
						.sendKeys("9095443283");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("DateofBirth")).click();
				break;
			} catch (Exception e) {
				if (i == 29) {
					Assert.fail(e.getMessage());

				}

			}

		}

		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("DateofBirth"))
						.sendKeys("01-Jan-2000");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("DateofBirthSelect"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());

				}
			}

		}
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("SearchIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());

				}
			}

		}

	}

	@Given("Check the Create new request fiels is available or not")
	public void check_the_create_new_request_fiels_is_available_or_not() {
		if (!javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CreateNewRequest"))
				.isDisplayed()) {
			SoftAssert.fail("CreateNewRequest");
		}
	}

	@Given("Check the clear field final is available or not")
	public void check_the_clear_field_final_is_available_or_not() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("ClearIcon")).click();
		Thread.sleep(2000);
		try {
			javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CustomerName")).isDisplayed();
			Assert.fail();
		} catch (Exception e) {
			Assert.assertTrue(true);
		}

	}

	@Then("Check Customer field type is mandatory or not")
	public void check_customer_field_type_is_mandatory_or_not() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = CustomerSearchPaths.getElement("CustomerType*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Check Customer field type is List of View")
	public void check_customer_field_type_is_list_of_view() throws Throwable {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CustomerTypeIndividual"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
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

			System.out.println("Map " + " Individual Customer ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" Individual Customer ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clickAndActions.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clickAndActions.clickOnElement(javascriptHelper.executeScriptWithWebElement(

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

	@Then("Check CIF ID field is editable")
	public void check_cif_id_field_is_editable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CIFID")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerSearchPaths.getElement("CIFID")).sendKeys("6565");
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}
}
