package stepdefinitions;

import java.io.File;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ULS_CommonSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = configFileReader.getJSFilePath();
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths addressDetailsJSPaths = new JSPaths(excelPath, "addressdetails_WebElements",
			"Ijarah_AddressDetailsFieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	int sectionIndex;

	@Given("navigate the IJARA URL")
	public void navigate_the_ijara_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());

	}

	@And("login with valid credentials for new application stage")
	public void login_with_valid_credentials_for_new_application_stage() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType01");
	}

	@Given("user_076 login with valid credentials at purchase order stage")
	public void user_076_login_with_valid_credentials_at_purchase_order_stage() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType05");
	}

	@Given("login with valid credentials for auto loan app data entry stage")
	public void login_with_valid_credentials_for_auto_loan_app_data_entry_stage() {
		ijaraLogin.loginWithIjaraApplication("userType07");
	}

	@And("user_076 login with valid offering stage user credentials")
	public void user_076_login_with_valid_offering_stage_user_credentials() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType04");
	}

	@And("login with valid credentials for commodity maker stage")
	public void login_with_valid_credentials_for_commodity_maker_stage() {
		ijaraLogin.loginWithIjaraApplication("userType03");
	}

	@And("login with valid credentials")
	public void login_with_valid_credentials() throws Throwable {
		ijaraLogin.loginWithIjaraApplication("userType01");
	}

	@Then("logout from the ULS Application")
	public void logout_from_the_ULS_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}

	@And("click on module dropdown in IJRARAH")
	public void click_on_module_dropdown_in_ijrarah() throws Throwable {
		String moduleName = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleName = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("module_dropdown") + ".textContent")
						.toString();
				System.out.println("Module Name " + moduleName);
				if ((!moduleName.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("module_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on LOS option in module dropdown")
	public void click_on_los_option_in_module_dropdown() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isEmpty()) && !(moduleLength.equalsIgnoreCase("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		boolean isSelectedModuleClicked = false;
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 100; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
						isSelectedModuleClicked = true;
						break;
					} else if (!(moduleName.equalsIgnoreCase("LOS"))) {
						System.out.println("Inside else if condition");
						isSelectedModuleClicked = false;
						break;
					}

				} catch (Exception e) {

				}
			}
			if (isSelectedModuleClicked == true) {
				break;
			}
		}

	}

	@And("click on mail box")
	public void click_on_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					System.out.println(commonJSPaths.getElement("mail_box"));
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search box upon click on the mail box")
	public void click_on_search_box_upon_click_on_the_mail_box() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on search text box upon click the search button")
	public void click_on_search_text_box_upon_click_the_search_button() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on additional customer info tab")
	public void click_on_additional_customer_info_tab() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("additonal_customer_info"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click edit button of customer personal information record")
	public void click_edit_button_of_customer_personal_information_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("customer_personal_info_edit_icon")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("click on add button of address details")
	public void click_on_add_button_of_address_details() throws Throwable {
		// document.querySelectorAll('ion-title[class="pl-2 pr-2 ion-color
		// ion-color-dark md title-default hydrated"]').length
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 100; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}

			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isEmpty())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Address Details").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}

		}

	}

	@Then("verify save buttton and back button should visible in address details screen")
	public void verify_save_buttton_and_back_button_should_visible_in_address_details_screen() throws Throwable {
		boolean saveButtonStatus = false;
		boolean backButtonStatus = false;
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println("Save Button Query " + commonJSPaths.getElement("save_button"));
				saveButtonStatus = javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 100; i++) {
			try {
				backButtonStatus = javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(saveButtonStatus);
		Assert.assertTrue(backButtonStatus);

	}

	@And("click on save button in address details screen")
	public void click_on_save_button_in_address_details_screen() throws Throwable {

		for (int i = 0; i <= 100; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on save button without enter mandatory data")
	public void click_on_save_without_enter_mandatory_data() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("frequency_of_rent"))
						.sendKeys(Keys.PAGE_UP);

			} catch (Exception e) {

			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				// save_button
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the validation for mandatory field")
	public void verify_system_should_show_the_validation_for_mandatory_field() throws Throwable {
		String toastContent = "";
		for (int i = 0; i <= 100; i++) {
			try {
				toastContent = javascriptHelper.executeScript("return " + commonJSPaths.getElement("toast_message"))
						.toString();
				System.out.println(toastContent);
				if (!(toastContent.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Please fill all the details", toastContent);
	}

	@Then("verify system should show the validation for special character input")
	public void verify_system_should_show_the_validation_for_special_character_input() throws Throwable {
		String specialCharacterValidation = "";
		for (int i = 0; i <= 100; i++) {
			try {
				specialCharacterValidation = javascriptHelper
						.executeScript("return "
								+ addressDetailsJSPaths.getElement("address_line_1_special_character_validation"))
						.toString();
				System.out.println(specialCharacterValidation);
				if (!(specialCharacterValidation.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals("Special character not allowed".trim(), specialCharacterValidation.trim());
	}

	@Then("verify system should not accept the character input in numeric field")
	public void verify_system_should_not_accept_the_character_input_in_numeric_field() throws Throwable {
		String poBoxNumber = "";
		for (int i = 0; i <= 50; i++) {
			try {
				poBoxNumber = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("po_box_number") + ".textContent")
						.toString();

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Assert.assertEquals(poBoxNumber, "");
	}

	@Given("click on edit button on created record of address details")
	public void click_on_edit_button_on_created_record_of_address_details() throws Throwable {
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isEmpty()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + "].querySelector('tbody button[icon=\"pi pi-pencil\"]')");
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')[" + (i + 1)
								+ "].querySelector('tbody button[icon=\"pi pi-pencil\"]')")
						.click();
				isClicked = true;
				break;

			}
			if (isClicked == true)

			{
				break;
			}
		}

	}

	@And("make the mandatiry field blank in address details screen")
	public void make_the_mandatiry_field_blank_in_address_details_screen() {
		String addressDetailsLength = "";
		for (int i = 0; i <= 100; i++) {
			try {

				addressDetailsLength = javascriptHelper
						.executeScript("return " + addressDetailsJSPaths.getElement("address_line1") + ".value")
						.toString();
				System.out.println(addressDetailsLength);
				if (!(addressDetailsLength.isEmpty()) || addressDetailsLength.equals("0")) {

					break;
				}

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveAddressDetailsLength = addressDetailsLength.length();
		for (int i = 0; i <= premitiveAddressDetailsLength; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1")).click();
				javascriptHelper.executeScriptWithWebElement(addressDetailsJSPaths.getElement("address_line1"))
						.sendKeys(Keys.BACK_SPACE);

			} catch (Exception e) {

			}
		}
	}

	@Then("verify the functionality of the back button in updated record screen")
	public void verify_the_functionality_of_the_back_button_in_updated_record_screen() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("change the status active to inactive for address details record")
	public void change_the_status_active_to_inactive_for_address_details_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the record status as inactive")
	public void verify_system_should_show_the_record_status_as_inactive() throws Throwable {
		String status = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isEmpty()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + ".querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText");
				status = javascriptHelper.executeScript(
						"return document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
								+ (i + 1) + "].querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText")
						.toString();
				System.out.println(status);
				if (!(status.isEmpty())) {
					System.out.println(status);
					Assert.assertEquals("In-active", status);
					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		Assert.assertEquals(status, "In-active");
	}

	@And("change the status inactive to active for address details record")
	public void change_the_status_inactive_to_active_for_address_details_record() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle")));
				javascriptHelper
						.executeScriptWithWebElement(addressDetailsJSPaths.getElement("addressdetails_status_toggle"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should show the record status as active")
	public void verify_system_should_show_the_record_status_as_active() throws Throwable {
		String status = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isEmpty()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				System.out.println("document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
						+ (i + 1) + ".querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText");
				status = javascriptHelper.executeScript(
						"return document.querySelectorAll('table[class=\"p-datatable-table ng-star-inserted\"]')["
								+ (i + 1) + "].querySelector('tbody td[ng-reflect-ng-switch=\"badge\"]').innerText")
						.toString();
				System.out.println(status);
				if (!(status.isEmpty())) {
					System.out.println(status);
					Assert.assertEquals("Active", status);
					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		Assert.assertEquals(status, "Active");
	}

	@Then("verify list view fields are shown in address details list view")
	public void verify_list_view_fields_are_shown_in_address_details_list_view() throws Throwable {
		String fieldName = "";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isEmpty()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = "";
			for (int j = 0; j <= 200; i++) {
				try {
					sectionName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("Section Name " + sectionName + " i value " + i);
					if (!(sectionName.isEmpty())) {
						System.out.println("J loop got breaked");
						break;
					}
				} catch (Exception e) {
					if (i == 200) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (sectionName.equals("Address Details")) {
				// document.querySelectorAll('thead[class="p-datatable-thead"]')[3].innerText
				System.out.println(
						"document.querySelectorAll('thead[class=\"p-datatable-thead\"]')[" + (i + 1) + "].innerText");
				for (int l = 0; l <= 20; l++) {
					try {
						fieldName = javascriptHelper.executeScript(
								"return document.querySelectorAll('thead[class=\\\"p-datatable-thead\\\"]')[" + (i + 1)
										+ "].innerText")
								.toString();
						System.out.println(fieldName);
						if (!(fieldName.isEmpty())) {

							System.out.println("l loop got breaked ");
							break;
						}
					} catch (Exception e) {
						if (l == 20) {
							Assert.fail(e.getMessage());
						}
					}
				}

				if (!(fieldName.isEmpty())) {
					System.out.println(fieldName);

					isClicked = true;
					break;
				}

			}
			if (isClicked == true)

			{
				break;
			}
		}
		System.out.println("Field Name " + fieldName);
		Assert.assertTrue(fieldName.contains("Address Type"));
		Assert.assertTrue(fieldName.contains("Country"));
		Assert.assertTrue(fieldName.contains("Occupancy Status"));
		Assert.assertTrue(fieldName.contains("Occupance Since"));
		Assert.assertTrue(fieldName.contains("Contact Address"));
		Assert.assertTrue(fieldName.contains("Status"));

	}

	@Then("verify system should show the result for the matched text")
	public void verify_system_should_show_the_result_for_the_matched_text() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						addressDetailsJSPaths.getElement("address_details__record_search_input")).clear();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String searchResult = "";
		for (int i = 0; i <= 100; i++) {
			try {
				searchResult = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
								+ (sectionIndex + 1)
								+ "].querySelector('p-paginator span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
						.toString();
				if ((searchResult.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(!(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")));
		for (int i = 0; i <= 200; i++) {
			try {
				driver.findElement(By.xpath("//html")).click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("verify system should not show the reslut for the search")
	public void verify_system_should_not_show_the_reslut_for_the_search() throws Throwable {
		String searchResult = "";
		for (int i = 0; i <= 100; i++) {
			try {
				searchResult = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
								+ (sectionIndex + 1)
								+ "].querySelector('p-paginator span[class=\"p-paginator-current ng-star-inserted\"]').innerText")
						.toString();
				if ((searchResult.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(searchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));

	}

	@And("click on pdf file download in address details list view")
	public void click_on_pdf_file_download_in_address_details_list_view() throws Throwable {
		// document.querySelectorAll('ion-card-content[class="k-pagescreen p-0 ios
		// card-content-ios
		// hydrated"]')[3].querySelector('p-dropdown[placeholder="Export"]')
		String queryForSearchButton = "document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')[3].querySelector('button[icon=\"pi pi-search\"]')";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isEmpty()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			sectionIndex = i;
			if (sectionName.equals("Address Details")) {

				for (int l = 0; l <= 100; l++) {
					try {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
										+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
								.click();
						isClicked = true;
						break;
					} catch (Exception e) {
						if (l == 100) {
							Assert.fail(e.getMessage());
						}
					}
				}
				if (isClicked == true) {
					break;
				}
			}
			if (isClicked == true) {
				break;
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("verify system should download the pdf file of addressdetails record")
	public void verify_system_should_download_the_pdf_file_of_addressdetails_record() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerAddressDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerAddressDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("click on xls file download in address details list view")
	public void click_on_xls_file_download_in_address_details_list_view() throws Throwable {
		// document.querySelectorAll('ion-card-content[class="k-pagescreen p-0 ios
		// card-content-ios
		// hydrated"]')[3].querySelector('p-dropdown[placeholder="Export"]')
		String queryForSearchButton = "document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')[3].querySelector('button[icon=\"pi pi-search\"]')";
		String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
		int screenLocation;
		String sectionLength = "";
		boolean isClicked = false;
		for (int i = 0; i <= 200; i++) {
			try {
				sectionLength = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
						.toString();
				if (!(sectionLength.isEmpty()) && sectionLength.equals("0")) {
					break;
				}
			} catch (Exception e) {

			}
		}
		int premitiveSectionLength = Integer.parseInt(sectionLength);
		for (int i = 1; i <= premitiveSectionLength; i++) {
			System.out.println(
					"Query document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText");
			String sectionName = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\\\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\\\"]')["
							+ i + "].innerText")
					.toString();
			System.out.println("Section Name " + sectionName + " i value " + i);
			sectionIndex = i;
			if (sectionName.equals("Address Details")) {

				for (int l = 0; l <= 100; l++) {
					try {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
										+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
								.click();
						isClicked = true;
						break;
					} catch (Exception e) {
						if (l == 100) {
							Assert.fail(e.getMessage());
						}
					}
					if (isClicked == true) {
						break;
					}
				}
				if (isClicked == true) {
					break;
				}
			}
			if (isClicked == true) {
				break;
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 invoke soft assert in address details in app data entry stage")
	public void user_invoke_soft_assert_in_address_details_in_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
		;
	}

	@Then("verify system should download the xls file of addressdetails record")
	public void verify_system_should_download_the_xls_file_of_addressdetails_record() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerAddressDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerAddressDataFile_export_"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

}
