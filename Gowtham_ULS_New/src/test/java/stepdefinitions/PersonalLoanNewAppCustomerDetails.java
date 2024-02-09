package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class PersonalLoanNewAppCustomerDetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths PLNewAppCustomerDetailsJsPaths = new JSPaths(excelPath, "PLNewAppCustomerDetails", "FieldName", "JSPath");
	JSPaths TawaAppDataEntryIncomeDetails = new JSPaths(excelPath, "TawaAppDataEntryIncomeDetails", "FieldName", "JSPath");
	ExcelData AutoLoanAppDataEntryIncomeDetailsexelData = new ExcelData(excelTestDataPath, "ALoanAppdataentryIncomedetails", "Data Set ID");
	Map<String, String> testData;
	ExcelData PLNewAppCustomerDetailsexelData = new ExcelData(excelTestDataPath, "PLNewAppCustomerDetails", "Dataset ID");
	Map<String, String> IjADataEntryIdentifiDetailsexelDatatestData;
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	Map<String, String> CustomerDetailsTestData = new HashMap<>();
	ExcelData personalLoanExecutionExcel = new ExcelData(excelTestDataPath, "TestExecution", "TestCase ID");
	Map<String, String> executionData;
	
	@Given("User_607 Search in the search Field Personal Loan NewApp Customer Details")
	public void user_search_in_the_search_field_personal_loan_new_app_customer_details() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TawaAppDataEntryIncomeDetails.getElement("searchInInbox")).sendKeys("5224",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_607 get the test data for test case AT_PL_NEWAPP_CD_07$")
    public void get_the_test_data_for_test_case_AT_PL_NEWAPP_CD_07() throws Throwable {
		executionData = personalLoanExecutionExcel.getTestdata("AT_PL_NEWAPP_CD_07");
		CustomerDetailsTestData = PLNewAppCustomerDetailsexelData.getTestdata(executionData.get("dataSet_ID"));
    }
	
	@Given("user_607 click on Customer Details tab")
	public void user_607_user_click_on_repayment_mode_info_tab() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Customer details")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}

	
	@Then("user_607 verify customer type field should be mandatory editable dropdown at new app")
	public void user_607_verify_customer_type_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("customer_details_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("customer_details_type_dropdown"))
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
						PLNewAppCustomerDetailsJsPaths.getElement("customer_details_type_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("customer_type_dropdown"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " Customer type is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" Customer type is not a mandatory field hence failed");
	}

	@Then("user_607 verify applicant type field should be mandatory editable dropdown at new app")
	public void user_607_verify_applicant_type_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("application_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("application_type_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("application_type_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("application_type"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" Application type is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" Application type is not a mandatory field hence failed");
	}

	@Then("user_607 verify salutation field should be mandatory editable dropdown at new app")
	public void user_607_verify_salutation_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("salutation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("salutation_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("salutation_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("salutation"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " salutation is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"), " salutation is not a mandatory field hence failed");
	}

	@Then("user_607 verify first name field should be mandatory editable textbox at new app")
	public void user_607_verify_first_name_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + PLNewAppCustomerDetailsJsPaths.getElement("first_Name_mandatory_verification"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("first_name_input"))
						.sendKeys(CustomerDetailsTestData.get("first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"), "first name field is not a text box hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				"first name field is not a mandatory field hence failed");

	}

	@Then("user_607 verify middle name field should be non mandatory editable textbox at new app")
	public void user_607_verify_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + PLNewAppCustomerDetailsJsPaths.getElement("middle_name_mandatory_verification"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("middle_name_input"))
						.sendKeys(CustomerDetailsTestData.get("middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"), "middle name field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"middle name field is a mandatory field hence failed");
	}

	@Then("user_607 verify last name field should be mandatory editable textbox at new app")
	public void user_607_verify_last_name_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + PLNewAppCustomerDetailsJsPaths.getElement("last_name_mandatory_verification"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("last_name_input"))
						.sendKeys(CustomerDetailsTestData.get("last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"), "last name field is not a text box hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				"last name field is not a mandatory field hence failed");
	}

	@Then("user_607 verify father first name field should be mandatory editable textbox at new app")
	public void user_607_verify_father_first_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("father_first_name_Input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("father_first_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("father_first_name_Input"))
						.sendKeys(CustomerDetailsTestData.get("father_first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father first name field is not a text box hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				"father first name field is not a mandatory field hence failed");
	}

	@Then("user_607 verify father middle name field should be non mandatory editable textbox at new app")
	public void user_607_verify_father_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("father_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("father_middle_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("father_middle_name_input"))
						.sendKeys(CustomerDetailsTestData.get("father_middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father middle name field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"father middle name field is a mandatory field hence failed");
	}

	@Then("user_607 verify father last name field should be mandatory editable textbox at new app")
	public void user_607_verify_father_last_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("father_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("father_last_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("father_last_name_input"))
						.sendKeys(CustomerDetailsTestData.get("father_last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"father last name field is not a text box hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				"father last name field is a non mandatory field hence failed");
	}

	@Then("user_607 verify spouse first name field should be non mandatory editable textbox at new app")
	public void user_607_verify_spouse_first_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_first_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("spouse_first_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_first_name_input"))
						.sendKeys(CustomerDetailsTestData.get("spouse_first_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse first name field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse first name field is a mandatory field hence failed");
	}

	@Then("user_607 verify spouse middle name field should be non mandatory editable textbox at new app")
	public void user_607_verify_spouse_middle_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_middle_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("spouse_middle_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_middle_name_input"))
						.sendKeys(CustomerDetailsTestData.get("spouse_middle_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse middle name field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse middle name field is a mandatory field hence failed");
	}

	@Then("user_607 verify spouse last name field should be non mandatory editable textbox at new app")
	public void user_607_verify_spouse_last_name_field_should_be_non_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_last_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("spouse_last_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_last_name_input"))
						.sendKeys(CustomerDetailsTestData.get("spouse_last_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"spouse last name field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"spouse last name field is a non mandatory field hence failed");
	}

	@Then("user_607 verify no of children field should be non mandatory editable textbox")
	public void user_607_verify_no_of_children_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("no_of_childer_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("no_of_children_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("no_of_childer_input"))
						.sendKeys(CustomerDetailsTestData.get("no_of_children"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("number"),
				"no of children field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"no of children field is a mandatory field hence failed");
	}

	@Then("user_607 verify spouse status field should be non mandatory editable dropdown at new app")
	public void user_607_verify_spouse_status_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_status_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("spouse_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("spouse_status"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " spouse status is not a dropdown hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" spouse status is a mandatory field hence failed");
	}

	@Then("user_607 verify date of birth field should be mandatory editable calendar at new app")
	public void user_607_verify_date_of_birth_field_should_be_mandatory_editable_calendar_at_new_app()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldVerification = "";
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("date_of_birth_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("today_date")).click();

				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("date_of_birth_mandatory_verification"))
						.toString();
				fieldVerification = javascriptHelper
						.executeScript(
								"return " + PLNewAppCustomerDetailsJsPaths.getElement("date_of_birth_field_verification"))
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
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				"date of birth field is not a mandatory hence failed");
		SoftAssert.assertTrue(fieldVerification.contains("dd-M-yy"),
				"date of birth is not a calender tyep hence failed");
	}

	@Then("user_607 verify gender field should be mandatory editable dropdown at new app")
	public void user_607_verify_gender_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("gender_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("gender_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("gender_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("gender"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " gender is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"), " gender is not a mandatory field hence failed");
	}

	@Then("user_607 verify education level field should be mandatory editable dropdown at new app")
	public void user_607_verify_education_level_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("education_level_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("education_level_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("education_level_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("education_level"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" educational level is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" educational level is not a mandatory field hence failed");
	}

	@Then("user_607 verify maritail status field should be mandatory editable dropdown at new app")
	public void user_607_verify_maritail_status_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {

		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("maritail_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("maritail_status_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("maritail_status_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("maritail_status"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" maritail status is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" maritail status is not a mandatory field hence failed");

	}

	@Then("user_607 verify nationality field should be mandatory editable dropdown at new app")
	public void user_607_verify_nationality_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("nationality_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("nationality_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("nationality_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("nationality"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " nationality is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" nationality is not a mandatory field hence failed");

	}

	@Then("user_607 verify category field should be mandatory editable dropdown at new app")
	public void user_607_verify_category_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("category_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("category_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("category_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("category"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " category is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"), " category is not a mandatory field hence failed");
	}

	@Then("user_607 verify religion field should be mandatory editable dropdown at new app")
	public void user_607_verify_religion_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("relegion_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("relegion_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("relegion_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("Religion"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " relegion is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"), " relegion is not a mandatory field hence failed");
	}

	@Then("user_607 verify residential status field should be mandatory editable dropdown at new app")
	public void user_607_verify_residential_status_field_should_be_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("customer_residential_status_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("customer_residential_status_dropdown"))
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
						PLNewAppCustomerDetailsJsPaths.getElement("customer_residential_status_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("residential_status"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" residential status is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" residential status is not a mandatory field hence failed");

	}

	@Then("user_607 verify language field should be mandatory editable dropdown at new app")
	public void user_607_verify_language_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("languages_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("languages_dropdown"))
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
				javascriptHelper.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("languages_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("language"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " language is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"), " language is not a mandatory field hence failed");
	}

	@Then("user_607 verify no of dependents field should be mandatory editable textbox at new app")
	public void user_607_verify_no_of_dependents_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("no_of_dependents_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("no_of_dependents_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("no_of_dependents_input"))
						.sendKeys(CustomerDetailsTestData.get("no_of_dependents"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("number"),
				"no of dependents field is not a text box hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"no of dependents field is a mandatory field hence failed");
	}

	@Then("user_607 verify mothers maiden name field should be mandatory editable textbox at new app")
	public void user_607_verify_mothers_maiden_name_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("mothers_maiden_name_input"))
						.getAttribute("type");
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ PLNewAppCustomerDetailsJsPaths.getElement("mothers_maiden_name_mandatory_verification"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("mothers_maiden_name_input"))
						.sendKeys(CustomerDetailsTestData.get("mothers_maiden_name"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		SoftAssert.assertTrue(fieldTypeValidation.contains("text"),
				"mothers maiden name field is not a text box hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				"mothers maiden name field is a non mandatory field hence failed");
	}

	@Then("user_607 verify residence field should be mandatory editable textbox at new app")
	public void user_607_verify_residence_field_should_be_mandatory_editable_textbox_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("type_of_residency_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("type_of_residency_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("type_of_residency_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("type_of_residency"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" type of residence is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" type of residence is not a mandatory field hence failed");
	}

	@Then("user_607 verify industry segmentation field should be mandatory editable textbox at new app")
	public void user_607_verify_industry_segmentation_field_should_be_mandatory_editable_textbox_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("industry_segmentation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("industry_segmentation_dropdown"))
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
						PLNewAppCustomerDetailsJsPaths.getElement("industry_segmentation_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("industry_segmentation"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" industry segmentation is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" industry segmentation is not a mandatory field hence failed");
	}

	@Then("user_607 verify income considered field should be non mandatory editable dropdown at new app")
	public void user_607_verify_income_considered_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("is_income_considered_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("is_income_considered_dropdown"))
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
						PLNewAppCustomerDetailsJsPaths.getElement("is_income_considered_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("is_income_considered"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" is income considered is not a dropdown hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" is income considered is a mandatory field hence failed");

	}

	@Then("user_607 verify costomer profile field should be non mandatory editable dropdown at new app")
	public void user_607_verify_costomer_profile_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("customer_profile_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("customer_profile_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("customer_profile_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("customer_profile"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" customer profile is not a dropdown hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" customer profile is a mandatory field hence failed");
	}

	@Then("user_607 verify relationship field should be mandatory editable dropdown at new app")
	public void user_607_verify_relationship_field_should_be_mandatory_editable_dropdown_at_new_app() throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("relationship_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("relationship_dropdown"))
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
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("relationship_dropdown"))
						.click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("relationship"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"), " relationship is not a dropdown hence failed");
		SoftAssert.assertTrue(mandatoryVerification.contains("*"),
				" relationship is a non mandatory field hence failed");
	}

	@Then("user_607 verify existing bank relationship field should be non mandatory editable toggle at new app")
	public void user_607_verify_existing_bank_relationship_field_should_be_non_mandatory_editable_toggle_at_new_app()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("existing_customer_flag"))
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
								+ PLNewAppCustomerDetailsJsPaths.getElement("existing_customer_flag_mandatory_verification"))
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
		SoftAssert.assertTrue(toggleVerification.contains("switch"),
				" existing customer field is not a toggle hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"existing customer field is a mandatory field hence failed");
	}

	@Then("user_607 verify blacklisted field should be non mandatory editable toggle at new app")
	public void user_607_verify_blacklisted_field_should_be_non_mandatory_editable_toggle_at_new_app()
			throws Throwable {
		String toggleVerification = "";
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				toggleVerification = javascriptHelper
						.executeScriptWithWebElement(PLNewAppCustomerDetailsJsPaths.getElement("blacklisted_toggle"))
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
								"return " + PLNewAppCustomerDetailsJsPaths.getElement("blacklisted_mandatory_verification"))
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
		SoftAssert.assertTrue(toggleVerification.contains("switch"), " blacklisted field is not a toggle hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"blacklisted field is a mandatory field hence failed");
	}

	@Then("user_607 verify politically exposed field should be non mandatory editable dropdown at new app")
	public void user_607_verify_politically_exposed_field_should_be_non_mandatory_editable_dropdown_at_new_app()
			throws Throwable {
		String fieldTypeValidation = "";
		String mandatoryVerification = "";
		for (int i = 0; i < 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("isPoliticallyExposed_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								PLNewAppCustomerDetailsJsPaths.getElement("isPoliticallyExposed_dropdown"))
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
						PLNewAppCustomerDetailsJsPaths.getElement("isPoliticallyExposed_dropdown")));
				javascriptHelper.executeScriptWithWebElement(
						PLNewAppCustomerDetailsJsPaths.getElement("isPoliticallyExposed_dropdown")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		clicksAndActionsHelper.jsSelectUsingText(CustomerDetailsTestData.get("politically_exposed"));
		SoftAssert.assertTrue(fieldTypeValidation.contains("Select"),
				" politically exposed is not a dropdown hence failed");
		SoftAssert.assertTrue(!(mandatoryVerification.contains("*")),
				" politically exposed is a mandatory field hence failed");
	}
	
}
