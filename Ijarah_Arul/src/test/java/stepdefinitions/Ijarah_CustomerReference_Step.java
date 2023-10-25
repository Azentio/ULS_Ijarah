package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijarah_CustomerReference_Step {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerreferenceJsPaths = new JSPaths(excelPath, "CustomerReference", "CustomerReference_FieldName",
			"JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");

	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	int indexOfListView = 0;
	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData customerreferenceExcelData = new ExcelData(excelTestDataPath, "CustomerReference", "DataSetID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_IJ_NewApp_CR_04$")
	public void get_the_test_data_for_test_case_AT_IJ_NewApp_CR_04() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_IJ_NewApp_CR_04_D1");
	}

	@And("^User get the test data for test case AT_IJ_NewApp_CR_05$")
	public void get_the_test_data_for_test_case_AT_IJ_NewApp_CR_05() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_IJ_NewApp_CR_05_D1");
	}

	@And("^User get the test data for test case AT_IJ_NewApp_CR_06$")
	public void get_the_test_data_for_test_case_AT_IJ_NewApp_CR_06() throws Throwable {
		testData = customerreferenceExcelData.getTestdata("AT_IJ_NewApp_CR_06_D1");
	}

	@And("Click on Pencil icon in customer personal information")
	public void click_on_pencil_icon_in_customer_personal_information() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerreferenceJsPaths.getElement("additionalCustInfoTabPencilIconBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Pencil icon in Reference list view")
	public void click_on_pencil_icon_in_reference_list_view() {

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EditIcon")));
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("EditIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update status to Inactive in Customer reference page")
	public void update_status_to_inactive_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ActiveInactie"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Save icon in customer reference page")
	public void click_on_save_icon_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Update status to Active in Customer reference page")
	public void update_status_to_active_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ActiveInactie"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on back icon in Customer reference page")
	public void click_on_back_icon_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("BackButton")));
				// javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("BackButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Remove the value in required fields in Customer reference page")
	public void remove_the_value_in_required_fields_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).clear();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Save icon and validate field is required popup in customer reference page")
	public void click_on_save_icon_and_validate_field_is_required_popup_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerreferenceJsPaths.getElement("PleaseFillAllTheDetailsPopup"))
								.isDisplayed());
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Update special characters in text field in customer reference page")
	public void update_special_characters_in_text_field_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).click();
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName")).clear();
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("FirstName"))
						.sendKeys(testData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						customerreferenceJsPaths.getElement("AlphaNumericCharactersAllowedPopup")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(
								customerreferenceJsPaths.getElement("AlphaNumericCharactersAllowedPopup"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Save icon and validate warning popup in customer reference page")
	public void click_on_save_icon_and_validate_warning_popup_in_customer_reference_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						customerreferenceJsPaths.getElement("PleaseFillAllTheDetailsPopup")));
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										customerreferenceJsPaths.getElement("PleaseFillAllTheDetailsPopup"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Salutation field is present in Reference list view page")
	public void validate_salutation_field_is_present_in_reference_list_view_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_SalutationField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_SalutationField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Name field is present in Reference list view page")
	public void validate_name_field_is_present_in_reference_list_view_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_NameField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_NameField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Mobile number field is present in Reference list view page")
	public void validate_mobile_number_field_is_present_in_reference_list_view_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						customerreferenceJsPaths.getElement("ViewList_MobileNumberField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_MobileNumberField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Years known field is present in Reference list view page")
	public void validate_years_known_field_is_present_in_reference_list_view_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_YearsKnownField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_YearsKnownField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Status field is present in Reference list view page")
	public void validate_status_field_is_present_in_reference_list_view_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_StatusField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("ViewList_StatusField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("find the position of customer reference list view at new app stage")
	public void find_the_position_of_customer_reference_list_view_at_new_app_stage() throws Throwable {
		String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
		// document.querySelectorAll('ion-col[class="m-0 p-0 ng-star-inserted md
		// hydrated"]')[1].querySelector('button[icon="pi pi-pencil"')
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
					if (listViewName.contains("References List View")) {

						indexOfListView = i;
						System.out.println("List view index " + indexOfListView);

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

	}

	@And("Search the Customer reference record with valid data")
	public void search_the_customer_reference_record_with_valid_data() throws InterruptedException {

		String searchButton = "document.querySelectorAll(' ion-row button[ng-reflect-icon=\"pi pi-search\"]')["
				+ indexOfListView + "]";

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(searchButton).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(testData.get("valid_search_text"));
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("list_view_search_input_box")).click();
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("list_view_search_input_box")).sendKeys(testData.get("valid_search_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}

			}

		}

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

	@And("Search the Customer reference record with invalid data")
	public void search_the_customer_reference_record_with_invalid_data() throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("list_view_search_input_box"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("list_view_search_input_box"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("list_view_search_input_box"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(customerreferenceJsPaths.getElement("list_view_search_input_box"))
						.sendKeys(testData.get("invalid_search_input"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
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

	@And("User search the Ref id under inbox for customer reference")
	public void user_search_the_ref_id_under_inbox_for_customer_reference() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerreferenceJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

}
