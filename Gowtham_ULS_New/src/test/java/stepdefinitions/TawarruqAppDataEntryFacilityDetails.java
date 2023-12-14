package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
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

public class TawarruqAppDataEntryFacilityDetails {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths TWAppDataEntryFacilityDetails = new JSPaths(excelPath, "TWAppDataEntryFacilityDetails", "FieldName",
			"JSPath");
	ExcelData IjaraAppDataCheckQuationInfoexelData = new ExcelData(excelTestDataPath, "IjaraAppDataCheckQuationInfo",
			"Data Set ID");
	ExcelData MurabhAppdataEntryInsuranceInfo = new ExcelData(excelTestDataPath, "MurabhAppdataEntryInsuranceInfo",
			"Data Set ID");

	ExcelData TWAppDataEntryFacilityDetailsexelData = new ExcelData(excelTestDataPath, "TWAppDataEntryFacilityDetails",
			"Data Set ID");
	Map<String, String> testData;

	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	@And ("User_607 Get the test data for test case ID AT_FI_005")
	public void user_607_get_the_test_data_for_test_case_id_at_fi_005() {
		testData =  TWAppDataEntryFacilityDetailsexelData.getTestdata("DS01_AT_FI_005");
	}


	@And("User_607 Click the Facility info tab")
	public void user_607_click_the_facility_info_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Facility_info_Tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	@And("User_607 Click Add button under the Facility info")
	public void user_607_click_add_button_under_the_facility_info() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						TWAppDataEntryFacilityDetails.getElement("AddButton_under_FacilityInfo")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 check the Save button under the Facility info")
	public void user_607_check_the_save_button_under_the_facility_info() {

		WebElement SaveButton = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("SaveButton"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(SaveButton.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Back button under the Facility info")
	public void user_607_check_the_back_button_under_the_facility_info() {
		WebElement BackButton = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("BackButton"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(BackButton.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Classification field under the Facility info")
	public void user_607_check_the_classification_field_under_the_facility_info() {
		WebElement Classification = javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Classification.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Product field under the Facility info")
	public void user_607_check_the_product_field_under_the_facility_info() {
		WebElement Product = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Product"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Product.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Scheme field under the Facility info")
	public void user_607_check_the_scheme_field_under_the_facility_info() {
		WebElement Scheme = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Scheme"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Scheme.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Program Code field under the Facility info")
	public void user_607_check_the_program_code_field_under_the_facility_info() {
		WebElement ProgramCode = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ProgrameCode"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ProgramCode.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Facility type field under the Facility info")
	public void user_607_check_the_facility_type_field_under_the_facility_info() {
		WebElement FacilityType = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("FacilityType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(FacilityType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Pricing Indicator field under the Facility info")
	public void user_607_check_the_pricing_indicator_field_under_the_facility_info() {
		WebElement PricingIndicator = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PricingIndicator"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(PricingIndicator.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Requested Amount field under the Facility info")
	public void user_607_check_the_requested_amount_field_under_the_facility_info() {
		WebElement RequestedAmount = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("RequestedAmount"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(RequestedAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Declared Property Value field under the Facility info")
	public void user_607_check_the_declared_property_value_field_under_the_facility_info() {
		WebElement DeclaredDownPaymentValue = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredPropertyValue "));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownPaymentValue.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Declared Down Payment Amount field under the Facility info")
	public void user_607_check_the_declared_down_payment_amount_field_under_the_facility_info() {
		WebElement DeclaredDownPaymentAmount = javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredDownPaymentAmount"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownPaymentAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Currency field under the Facility info")
	public void user_607_check_the_currency_field_under_the_facility_info() {
		WebElement Currency = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Currency"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Currency.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Loan Tenure field under the Facility info")
	public void user_607_check_the_loan_tenure_field_under_the_facility_info() {
		WebElement LoanTenure = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(LoanTenure.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 check the Servicing Branch field under the Facility info")
	public void user_607_check_the_servicing_branch_field_under_the_facility_info() {
		WebElement ServicingBranch = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ServicingBranch"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(ServicingBranch.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Verify the Classification field should be mandatory,editable,text lookup")
	public void user_607_verify_the_classification_field_should_be_mandatory_editable_text_lookup() {
		String Classification_Mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Classification_Mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Classification_edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((Classification_edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Classification_text = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"))
				.getAttribute("ng-reflect-placeholder");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Classification_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Verify the Product field should be mandatory,editable,text lookup")
	public void user_607_verify_the_product_field_should_be_mandatory_editable_text_lookup() {
		String Product_Mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Product"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Product_Mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Product_edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Product"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((Product_edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Product_text = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Product"))
				.getAttribute("ng-reflect-placeholder");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Product_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Verify the Scheme field should be mandatory,editable,text lookup")
	public void user_607_verify_the_scheme_field_should_be_mandatory_editable_numeric_lookup() {
		String Scheme_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Scheme"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Scheme"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Scheme"))
				.getAttribute("ng-reflect-placeholder");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 Verify the Program code field should be mandatory,editable,text lookup")
	public void user_607_verify_the_program_code_field_should_be_mandatory_editable_numeric_lookup() {
		String ProgramCode_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ProgrameCode"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(ProgramCode_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String ProgramCode_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ProgrameCode"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((ProgramCode_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String ProgramCode_Num = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ProgrameCode"))
				.getAttribute("ng-reflect-placeholder");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(ProgramCode_Num.contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 Verify the Servicing branch field should be mandatory,editable")
	public void user_607_verify_the_servicing_branch_field_should_be_mandatory_editable() {
		String ServicingBranch_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ServicingBranch"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(ServicingBranch_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String ServicingBranch_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ServicingBranch"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((ServicingBranch_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 Verify the Pricing indicator field should be mandatory,editable,text lookup")
	public void user_607_verify_the_pricing_indicator_field_should_be_mandatory_editable_text_lookup() {
		String PricingIndicator_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PricingIndicator"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(PricingIndicator_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String PricingIndicator_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PricingIndicator"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((PricingIndicator_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String PricingIndicator_text = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PricingIndicator"))
				.getAttribute("ng-reflect-placeholder");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(PricingIndicator_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 Verify the Requested amount field should be mandatory,editable,num")
	public void user_607_verify_the_requested_amount_field_should_be_mandatory_editable_num() {
		String RequestedAmount_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("RequestedAmount_mandy"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(RequestedAmount_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String RequestedAmount_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("RequestedAmount"))
				.getAttribute("ng-reflect-readonly");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((RequestedAmount_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String RequestedAmount_NUM = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("RequestedAmount_number"))
				.getAttribute("inputmode");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(RequestedAmount_NUM.contains("decimal"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 Verify the Declared downpayment amount field should be mandatory,editable,num")
	public void user_607_verify_the_declared_downpayment_amount_field_should_be_mandatory_editable_text() {
		String DeclaredDownpaymentAmount_mandy = javascriptHelper.executeScriptWithWebElement(
				TWAppDataEntryFacilityDetails.getElement("DeclaredDownPaymentAmount_mandy")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownpaymentAmount_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String DeclaredDownpaymentAmount_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredDownPaymentAmount"))
				.getAttribute("ng-reflect-readonly");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((DeclaredDownpaymentAmount_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String DeclaredDownpaymentAmount_num = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredDownPaymentAmount_num"))
				.getAttribute("inputmode");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(DeclaredDownpaymentAmount_num.contains("decimal"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 Verify the Currency field should be mandatory,editable,text lookup")
	public void user_607_verify_the_currency_field_should_be_mandatory_editable_text_lookup() {
		String Currency_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Currency"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Currency_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Currency_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Currency"))
				.getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((Currency_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Currency_text = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Currency"))
				.getAttribute("ng-reflect-placeholder");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(Currency_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 Verify the Loan tenure\\(months) field should be mandatory,editable,numeric lookup")
	public void user_607_verify_the_loan_tenure_months_field_should_be_mandatory_editable_numeric_lookup() {
		String LoanTenure_mandy = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure"))
				.getAttribute("ng-reflect-required");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(LoanTenure_mandy.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String LoanTenure_Edit = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure"))
				.getAttribute("ng-reflect-readonly");

		for (int i = 0; i < 2000; i++) {

			try {
				Assert.assertTrue((LoanTenure_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String LoanTenure_text = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure"))
				.getAttribute("ng-reflect-input-type");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(LoanTenure_text.contains("number"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 click the classification field and select the data for user to add new record")
	public void user_607_click_the_classification_field_and_select_the_data_for_user_to_add_new_record() {
		// to check the classification field is present
		WebElement Classification = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Classification.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// to click dropdown
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"))
						.click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Product").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Product")).trim())) {
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

	@Then("User_607 click the Back button and verify the functionality of back button")
	public void user_607_click_the_back_button_and_verify_the_functionality_of_back_button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("BackButton"))
						.click();
				Thread.sleep(4000);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement AddButton = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("AddButton_under_FacilityInfo"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(AddButton.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 click the Entitle button under facility list")
	public void user_607_click_the_entitle_button_under_facility_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Edit_button"))
						.click();
				Thread.sleep(4000);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 to verify the same record should get saved in the system")
	public void user_607_to_verify_the_same_record_should_get_saved_in_the_system() {
		String ClassificationField = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(ClassificationField.contains("Home Loan"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Product = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Product"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(
						Product.contains("Home Loan-Ready to move / Under construction Property from Builder/Society"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String scheme = javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Scheme"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(scheme.contains("Ready to move / Under construction Property from Builder/Society "));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String programcode = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ProgrameCode"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(programcode.contains("Income Based"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String FacilityType = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("FacilityType"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(FacilityType.contains("Auto Leasing Loan"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String PricingIndicator = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PricingIndicator"))
				.getAttribute("aria-label");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(PricingIndicator.contains("Ijara auto retail 3"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String RequestedAmount = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("RequestedAmount"))
				.getAttribute("ng-reflect-value-variable");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(RequestedAmount.contains("1000000"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 select the input for Classification field under the Facility info")
	public void user_607_select_the_input_for_classification_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification"))
						.click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Classification").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Classification")).trim())) {
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

	@Then("User_607 select the input for Product field under the Facility info")
	public void user_607_select_the_input_for_product_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Product")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Product").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Product")).trim())) {
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

	@Then("User_607 select the input for Scheme field under the Facility info")
	public void user_607_select_the_input_for_scheme_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Scheme")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Scheme").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Scheme")).trim())) {
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

	@Then("User_607 select the input for Program Code field under the Facility info")
	public void user_607_select_the_input_for_program_code_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("ProgrameCode")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("ProgrameCode").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProgrameCode")).trim())) {
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

	@Then("User_607 select the input for Facility type field under the Facility info")
	public void user_607_select_the_input_for_facility_type_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("FacilityType")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("FacilityType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("FacilityType")).trim())) {
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

	@Then("User_607 select the input for Pricing Indicator field under the Facility info")
	public void user_607_select_the_input_for_pricing_indicator_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PricingIndicator")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("PricingIndicator").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("PricingIndicator")).trim())) {
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

	@Then("User_607 give the input for Declared Property Value field under the Facility info")
	public void user_607_give_the_input_for_declared_property_value_field_under_the_facility_info() {
		javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredPropertyValue_Input")).click();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("DeclaredPropertyValue_Input"))
//			.sendKeys("10000");
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//		}
//		}
//	}
		javascriptHelper

				.executeScriptWithWebElement(

						"document.querySelector('#assetPrice > div > div > ion-item > div.PrimeInputBox > div > p-inputnumber > span > input')")
				.sendKeys("1000000");

	}

	@And("User_607 enter the characters to the declared downpayment amount")
	public void user_607_enter_the_characters_to_the_declared_downpayment_amount() throws Throwable {
		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
				.clear();
		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
				.sendKeys("d");

	}

	@And("User_607 enter the special characters to the declared downpayment amount")
	public void user_607_enter_the_special_characters_to_the_declared_downpayment_amount() throws Throwable {

		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
				.sendKeys("*");
		Thread.sleep(6000);
	}

	@And("User_607 enter the negative number to the declared downpayment amount")
	public void user_607_enter_the_negative_number_to_the_declared_downpayment_amount() throws Throwable {
		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
				.sendKeys("-10000");

	}

	@Given("User_607 check the negative data in the declared downpayment amount")
	public void user_607_check_the_negative_data_in_the_declared_downpayment_amount() {
		String value = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredDownPaymentAmount_num"))
				.getAttribute("aria-valuenow");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(value.contains("10000"));
				System.out.println("not allow the negative value" + value);
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 give the input for Declared Down Payment Amount field under the Facility info")
	public void user_607_give_the_input_for_declared_down_payment_amount_field_under_the_facility_info() {
		javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredPropertyValue_Input")).click();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("DeclaredPropertyValue_Input"))
//			.sendKeys("10000");
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
		javascriptHelper

				.executeScriptWithWebElement(

						"document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")

				.sendKeys("10000");

	}

	@Then("User_607 give the input for Request Amount field under the Facility info")
	public void user_607_give_the_input_for_request_amount_field_under_the_facility_info() {
		javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("RequestedAmount")).click();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("RequestedAmount"))
//			.sendKeys(testData.get("RequestedAmount"));
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
		javascriptHelper

				.executeScriptWithWebElement(

						"document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")

				.sendKeys("1000000");
	}

	@Then("User_607 select the input for Currency field under the Facility info")
	public void user_607_select_the_input_for_currency_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Currency")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Currency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
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

	@Then("User_607 give the input for Loan Tenure field under the Facility info")
	public void user_607_give_the_input_for_loan_tenure_field_under_the_facility_info() {
		javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure")).click();
		javascriptHelper

				.executeScriptWithWebElement(

						"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")

				.sendKeys("3");

	}

	@Then("User_607 click the save button under the facility info")
	public void user_607_click_the_save_button_under_the_facility_info() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("SaveButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the popup of fill all field")
	public void user_607_verify_the_popup_of_fill_all_field() throws Throwable {

		for (int i = 0; i < 2000; i++) {
			try {
				String text = javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("PleaseFillDetails_Popup")).getText();
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

	@Then("User_607 modify the classification field data")
	public void user_607_click_the_classification_field_and_modify_the_data() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Classification")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("ProcuctModification").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProcuctModification")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						Assert.assertTrue(dropdownString.contains("Non Housing Loan"));
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

	@Then("User_607 clear the Loan Tenure field under facility")
	public void user_607_clear_the_loan_tenure_field_under_facility() throws Throwable {
		javascriptHelper

				.executeScriptWithWebElement(

						"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")

				.clear();
		Thread.sleep(3000);
	}

	@Then("User_607 modify the Loan Tenure field under facility info")
	public void user_607_modify_the_loan_tenure_field_under_facility_info() throws Throwable {
		// javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure")).click();
		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('digital-text-box[id=\"loanTenure\"] input')");
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper

						.executeScriptWithWebElement(

								"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")
						.sendKeys("3");
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 to check same record saved inLoan Tenure field under facility info")
	public void user_607_to_check_same_record_saved_in_loan_tenure_field_under_facility_info() {
		for (int i = 0; i < 2000; i++) {
			try {
				String text = javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("LoanTenure_value"))
						.getAttribute("ng-reflect-model");
				System.out.println(text);
				Assert.assertTrue(text.contains("3"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the successfully saved message under the facility info")
	public void user_607_verify_the_successfully_saved_message_under_the_facility_info() {
		for (int i = 0; i < 2000; i++) {
			try {
				String text = javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("SucessPopUP"))
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

	@And("User_607 modify the declared downpayment amount")
	public void user_607_modify_the_declared_downpayment_amount() throws Throwable {
		javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')").clear();
		javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')").sendKeys("d");
		Thread.sleep(6000);
	}

	@And("User_607 check the invalid data in the declared downpayment amount")
	public void user_607_check_the_modified_data_in_the_declared_downpayment_amount() {

		String value = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("DeclaredDownPaymentAmount_num"))
				.getAttribute("aria-valuenow");
		System.out.println(value);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(value.contains("null"));
				System.out.println(value);
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_607 modify the correct data for declared downpayment amount")
	public void user_607_modify_the_correct_data_for_declared_downpayment_amount() throws Throwable {
		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
				.clear();
		javascriptHelper
				.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[id=\"downPaymentAmount\"] input')")
				.sendKeys("10000");

	}

	@And("User_607 Click the back button in facility list")
	public void user_607_click_the_back_button_in_facility_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("BackButton_prev")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_607 verify the the back button function using inbox label in facility list")
	public void user_607_verify_the_the_back_button_function_using_inbox_label_in_facility_list() {
		WebElement FacilityType = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("Inbox_title"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(FacilityType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click the status toggle button for deactivate")
	public void user_607_click_the_status_toggle_button_for_deactivate() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("status_ToggleButton")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click the status toggle button for activate")
	public void user_607_click_the_status_toggle_button_for_activate() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("status_ToggleButton")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 to check the status is deactive")
	public void user_607_to_check_the_status_is_deactive() {
		String value = javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("status_ToggleButton"))
				.getAttribute("aria-checked");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(value.contains("false"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 to check the status is active")
	public void user_607_to_check_the_status_is_active() {
		String value = javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("status_ToggleButton"))
				.getAttribute("aria-checked");
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(value.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click the back Button")
	public void user_607_click_the_back_Button() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("BackButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 to verify the functionality of back button with add button display")
	public void user_607_to_verify_the_functionality_of_back_button_with_add_button_display() {
		WebElement Scheme = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("AddButton_under_FacilityInfo"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(Scheme.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	
	

	@And("User_607 Click the Excel button under Export")
	public void user_607_click_the_excel_button_under_export() throws Throwable {

		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFacilityDetails.getElement("XLS")).click();
				Thread.sleep(6000);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

}
