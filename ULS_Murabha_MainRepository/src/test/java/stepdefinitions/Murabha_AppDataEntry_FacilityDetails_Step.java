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

public class Murabha_AppDataEntry_FacilityDetails_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\ulsJsPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\MurabhaTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths facilitydetailsJsPaths = new JSPaths(excelPath, "Murabha_FacilityDetails", "Murabah_AppDataEntryFacilityDetails", "JSPath");
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
	
	//ExcelData facilitydetailsExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	//ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData facilitydetailsExcelData  = new ExcelData(excelTestDataPath,"Murabah_FacilityDetails","Data Set ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_M_FD_01$")
    public void get_the_test_data_for_test_case_AT_M_FD_01() throws Throwable {
		testData = facilitydetailsExcelData.getTestdata("AT_M_FD_01_D1");
    }
	@And("^User get the test data for test case AT_M_FD_02$")
    public void get_the_test_data_for_test_case_AT_M_FD_02() throws Throwable {
		testData = facilitydetailsExcelData.getTestdata("AT_M_FD_03_D1");
    }
	@And("^User get the test data for test case AT_M_FD_03$")
    public void get_the_test_data_for_test_case_AT_M_FD_03() throws Throwable {
		testData = facilitydetailsExcelData.getTestdata("AT_M_FD_03_D1");
    }
	@And("User search the Ref id under inbox for Murabha_Facility details")
	public void user_search_the_ref_id_under_inbox_for_murabha_facility_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	   
	}

	@And("Navigate to Facility Info tab")
	public void navigate_to_facility_info_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						facilitydetailsJsPaths.getElement("FacilityInfo")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}

		}
	   
	}

	@And("Click on Add button in Facility Info tab")
	public void click_on_add_button_in_facility_info_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Addbutton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   
	}

	@And("Validate Classification field is present in Facility details page")
	public void validate_classification_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Classification")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Classification")).isDisplayed());
	   
	}

	@And("Validate Product field is present in Facility details page")
	public void validate_product_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Product")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Product")).isDisplayed());
	   
	}

	@And("Validate Scheme field is present in Facility details page")
	public void validate_scheme_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Scheme")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Scheme")).isDisplayed());
	   
	}

	@And("Validate Program Code field is present in Facility details page")
	public void validate_program_code_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ProgramCode")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ProgramCode")).isDisplayed());
	   
	}

	@And("Validate Facility type field is present in Facility details page")
	public void validate_facility_type_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("FacilityType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("FacilityType")).isDisplayed());
	   
	}

	@And("Validate Servicing branch field is present in Facility details page")
	public void validate_servicing_branch_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ServicingBranch")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ServicingBranch")).isDisplayed());
	   
	}

	@And("Validate Pricing interest indicator field is present in Facility details page")
	public void validate_pricing_interest_indicator_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("PricingInterestIndicator")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("PricingInterestIndicator")).isDisplayed());
	   
	}

	@And("Validate Declared property asset value field is present in Facility details page")
	public void validate_declared_property_asset_value_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredPropertyAssetValue")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredPropertyAssetValue")).isDisplayed());
	   
	}

	@And("Validate Declared down payment amount field is present in Facility details page")
	public void validate_declared_down_payment_amount_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredDownPaymentAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredDownPaymentAmount")).isDisplayed());
	   
	}

	@And("Validate Requested Amount field is present in Facility details page")
	public void validate_requested_amount_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("RequestedAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("RequestedAmount")).isDisplayed());
	   
	}

	@And("Validate Currency field is present in Facility details page")
	public void validate_currency_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Currency")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Currency")).isDisplayed());
	   
	}

	@And("Validate Loan tenure field is present in Facility details page")
	public void validate_loan_tenure_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("LoanTenure")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("LoanTenure")).isDisplayed());
	   
	}

	@And("Validate Moratorium Period field is present in Facility details page")
	public void validate_moratorium_period_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("MoratoriumPeriod")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("MoratoriumPeriod")).isDisplayed());
	   
	}

	@And("Validate Future Rental flag field is present in Facility details page")
	public void validate_future_rental_flag_field_is_present_in_facility_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("FutureRentalFlag")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("FutureRentalFlag")).isDisplayed());
	   
	}
	@And("Select the value in Classification field in facility details")
	public void select_the_value_in_classification_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Classification")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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

	@And("Select the value in Product field in facility details")
	public void select_the_value_in_product_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Product")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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

	@And("Select the value in Scheme field in facility details")
	public void select_the_value_in_scheme_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Scheme")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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

	@And("Select the value in Program code field in facility details")
	public void select_the_value_in_program_code_field_in_facility_details() {
	    
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ProgramCode")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("ProgramCode").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProgramCode")).trim())) {
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

	@And("Select the value in Facility type field in facility details")
	public void select_the_value_in_facility_type_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("FacilityType")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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

	@And("Select the value in Servicing Branch field in facility details")
	public void select_the_value_in_servicing_branch_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ServicingBranch")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("ServicingBranch").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ServicingBranch")).trim())) {
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

	@And("Select the value in Pricing interest indicator field in facility details")
	public void select_the_value_in_pricing_interest_indicator_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("PricingInterestIndicator")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("PricingInterestIndicator").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("PricingInterestIndicator")).trim())) {
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

	@And("Enter the value in Declared property asset value field in facility details")
	public void enter_the_value_in_declared_property_asset_value_field_in_facility_details() throws InterruptedException {
		javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredPropertyAssetValue")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredPropertyAssetValue"))
						.sendKeys(testData.get("DeclaredPropertyAssetValue"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	  
	}

	@And("Enter the value in Declared down payment amount field in facility details")
	public void enter_the_value_in_declared_down_payment_amount_field_in_facility_details() {
		javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredDownPaymentAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("DeclaredDownPaymentAmount"))
						.sendKeys(testData.get("DeclaredDownPaymentAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	  
	}

	@And("Enter the value in Requested amount field in facility details")
	public void enter_the_value_in_requested_amount_field_in_facility_details() {
	    
		javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("RequestedAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("RequestedAmount"))
						.sendKeys(testData.get("RequestedAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Select the value in Currency field in facility details")
	public void select_the_value_in_currency_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Currency")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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

	@And("Enter the value in Loan tenure field in facility details")
	public void enter_the_value_in_loan_tenure_field_in_facility_details() {
		javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("LoanTenure")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("LoanTenure"))
						.sendKeys(testData.get("LoanTenure"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   
	}

	@And("Enter the value in Moratorium peroid field in facility details")
	public void enter_the_value_in_moratorium_peroid_field_in_facility_details() {
		javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("MoratoriumPeriod")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("MoratoriumPeriod"))
						.sendKeys(testData.get("MoratoriumPeriod"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Select the value in Future rental flag field in facility details")
	public void select_the_value_in_future_rental_flag_field_in_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("FutureRentalFlag")).click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("FutureRentalFlag").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("FutureRentalFlag")).trim())) {
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

	@And("Click on Save icon in facility details")
	public void click_on_save_icon_in_facility_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   
	}
	@And("Click on Submit button for Facility details")
	public void click_on_submit_button_for_facility_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SubmitButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("Click on Ok button in submit confirmation popup for Facility details")
	public void click_on_ok_button_in_submit_confirmation_popup_for_facility_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Ok_SubmitConfirmation")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Click on Submit button in submit confirmation popup for Facility details")
	public void click_on_submit_button_in_submit_confirmation_popup_for_facility_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SubmitButton_SubmitConfirmation")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
