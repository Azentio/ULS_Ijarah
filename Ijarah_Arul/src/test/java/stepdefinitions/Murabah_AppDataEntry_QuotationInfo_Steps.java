package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabah_AppDataEntry_QuotationInfo_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths quotationinfoJsPaths = new JSPaths(excelPath, "Murabah_QuotationInfo", "Murabah_AppDataEntryQuotationInfo",
			"JSPath");
	// JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements",
	// "Underwriter_FieldName", "JSPath");

	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);

	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData quotationinfoExcelData = new ExcelData(excelTestDataPath, "Murabah_QuotationInfo", "Data Set ID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_MU_QIA_001$")
	public void get_the_test_data_for_test_case_AT_MU_QIA_001() throws Throwable {
		testData = quotationinfoExcelData.getTestdata("AT_MU_QIA_001_D1");
	}

	@And("^User get the test data for test case AT_MU_QIA_003$")
	public void get_the_test_data_for_test_case_AT_MU_QIA_003() throws Throwable {
		testData = quotationinfoExcelData.getTestdata("AT_MU_QIA_003_D1");
	}

	@And("^User get the test data for test case AT_MU_QIA_004$")
	public void get_the_test_data_for_test_case_AT_MU_QIA_004() throws Throwable {
		testData = quotationinfoExcelData.getTestdata("AT_MU_QIA_004_D1");
	}

	@Given("User search the Ref id under inbox for Quotation info")
	public void user_search_the_ref_id_under_inbox_for_quotation_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("inboxSearchInput"))
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

	@Given("Navigate to Quotation Info section")
	public void navigate_to_quotation_info_section() throws IOException {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("quotationInfoSection"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("click on add button in quotation info section at app data entry stage")
	public void click_on_add_button_in_quotation_info_section_at_app_data_entry_stage() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("Addbutton")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Enter the value in Deductible amount field in Quotation info")
	public void enter_the_value_in_deductible_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("deductibleAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("deductibleAmount"))
						.sendKeys(testData.get("DeductibleAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Given("Select the value in Insurance company Bp Id field in Quotation info")
	public void select_the_value_in_insurance_company_bp_id_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("insuranceCompanyBpId"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("InsuranceCompanyBpId").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("InsuranceCompanyBpId")).trim())) {
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

	@Given("Enter the value in Gross premium amount field in Quotation info")
	public void enter_the_value_in_gross_premium_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("GrossPremiumAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("GrossPremiumAmount"))
						.sendKeys(testData.get("GrossPremiumAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in VAT on Gross premium amount field in Quotation info")
	public void enter_the_value_in_vat_on_gross_premium_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnGrossPremiumAmount"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnGrossPremiumAmount"))
						.sendKeys(testData.get("VatOnGrossPremiumAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in Net Gross premium amount field in Quotation info")
	public void enter_the_value_in_net_gross_premium_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetGrossPremiumAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetGrossPremiumAmount"))
						.sendKeys(testData.get("NetGrossPremiumAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in Base premium amount field in Quotation info")
	public void enter_the_value_in_base_premium_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("BasePremiumAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("BasePremiumAmount"))
						.sendKeys(testData.get("BasePremiumAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in VAT on Base premium amount field in Quotation info")
	public void enter_the_value_in_vat_on_base_premium_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount"))
						.sendKeys(testData.get("VatOnBasePremiumAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in Net base premium amount field in Quotation info")
	public void enter_the_value_in_net_base_premium_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount"))
						.sendKeys(testData.get("NetBasePremiumAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in Total discount amount field in Quotation info")
	public void enter_the_value_in_total_discount_amount_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("TotalDiscountAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("TotalDiscountAmount"))
						.sendKeys(testData.get("TotalDiscountAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in Expiry date field in Quotation info")
	public void enter_the_value_in_expiry_date_field_in_quotation_info() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		System.out.println("Date " + format);
		for (int i = 0; i <= 50; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput")).click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExpiryDate")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput")).click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("expiryDateInput"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Enter the value in Quotation reference no field in Quotation info")
	public void enter_the_value_in_quotation_reference_no_field_in_quotation_info() {
		javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber"))
						.sendKeys(testData.get("QuotationReferenceNo"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Click on Save icon in Quotation info")
	public void click_on_save_icon_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SaveIcon")));
				// javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Click on Pencil icon of existing record in Quotation info")
	public void click_on_pencil_icon_of_existing_record_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("EditIcon")));
				// javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Update the value in Deductible amount field in Quotation info")
	public void update_the_value_in_deductible_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("deductibleAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("deductibleAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("deductibleAmount"))
						.sendKeys(testData.get("DeductibleAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in Insurance company Bp Id field in Quotation info")
	public void update_the_value_in_insurance_company_bp_id_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("insuranceCompanyBpId"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
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
			System.out.println("Map " + testData.get("InsuranceCompanyBpId").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("InsuranceCompanyBpId")).trim())) {
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

	@Given("Update the value in Gross premium amount field in Quotation info")
	public void update_the_value_in_gross_premium_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("GrossPremiumAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("GrossPremiumAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("GrossPremiumAmount"))
						.sendKeys(testData.get("GrossPremiumAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in VAT on Gross premium amount field in Quotation info")
	public void update_the_value_in_vat_on_gross_premium_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnGrossPremiumAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnGrossPremiumAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnGrossPremiumAmount"))
						.sendKeys(testData.get("VatOnGrossPremiumAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in Net Gross premium amount field in Quotation info")
	public void update_the_value_in_net_gross_premium_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetGrossPremiumAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetGrossPremiumAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetGrossPremiumAmount"))
						.sendKeys(testData.get("NetGrossPremiumAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in Base premium amount field in Quotation info")
	public void update_the_value_in_base_premium_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("BasePremiumAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("BasePremiumAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("BasePremiumAmount"))
						.sendKeys(testData.get("BasePremiumAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in VAT on Base premium amount field in Quotation info")
	public void update_the_value_in_vat_on_base_premium_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount"))
						.sendKeys(testData.get("VatOnBasePremiumAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in Net base premium amount field in Quotation info")
	public void update_the_value_in_net_base_premium_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount"))
						.sendKeys(testData.get("NetBasePremiumAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("Update the value in Total discount amount field in Quotation info")
	public void update_the_value_in_total_discount_amount_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("TotalDiscountAmount"))
						.click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("TotalDiscountAmount"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("TotalDiscountAmount"))
						.sendKeys(testData.get("TotalDiscountAmount"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Update the value in Expiry date field in Quotation info")
	public void update_the_value_in_expiry_date_field_in_quotation_info() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		for (int i = 0; i <= 50; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput")).click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExpiryDate")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput")).click();
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("expiryDateInput"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Update the value in Quotation reference no field in Quotation info")
	public void update_the_value_in_quotation_reference_no_field_in_quotation_info() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber"))
						.clear();
				javascriptHelper
						.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber"))
						.sendKeys(testData.get("QuotationReferenceNo"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("Validate Base premium amount field is present in Quotation info view list")
	public void validate_base_premium_amount_field_is_present_in_quotation_info_view_list() throws IOException {
		boolean status = false;
		for (int i = 0; i <= 50; i++) {
			try {
				status = javascriptHelper
						.executeScriptWithWebElement(quotationinfoJsPaths.getElement("BasePremiumAmount_ViewList"))
						.isDisplayed();
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);

	}

	@Given("Validate VAT on Base premium amount field is present in Quotation info view list")
	public void validate_vat_on_base_premium_amount_field_is_present_in_quotation_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("VatOnBasePremiumAmount_ViewList"))
				.isDisplayed());

	}

	@Given("Validate NET Base premium amount field is present in Quotation info view list")
	public void validate_net_base_premium_amount_field_is_present_in_quotation_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("NetBasePremiumAmount_ViewList"))
				.isDisplayed());

	}

	@Given("Validate Quotation reference no field is present in Quotation info view list")
	public void validate_quotation_reference_no_field_is_present_in_quotation_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("QuotationReferenceNumber_ViewList"))
				.isDisplayed());

	}

	@Given("Validate Status field is present in Quotation info view list")
	public void validate_status_field_is_present_in_quotation_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("Status_ViewList")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(quotationinfoJsPaths.getElement("Status_ViewList")).isDisplayed());

	}

	@Given("Search the quotation info record with valid data")
	public void search_the_quotation_info_record_with_valid_data() {

		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SearchButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("valid_search_text"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + quotationinfoJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertFalse(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));

	}

	@Given("Search the quotation info record with invalid data")
	public void search_the_quotation_info_record_with_invalid_data() {

		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {

				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + quotationinfoJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				if (documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	}

	@Given("Validate Export to PDF functionality in Quotation info")
	public void validate_export_to_pdf_functionality_in_quotation_info()throws Throwable{
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExportPDF")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Insurance Quotation Details")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application Insurance Quotation Details"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
        }
	}

	@Given("Validate Export to excel functionality in Quotation info")
	public void validate_export_to_excel_functionality_in_quotation_info() throws Throwable{
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationinfoJsPaths.getElement("ExportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Insurance Quotation Details_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application Insurance Quotation Details_export_"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
        }
		
		
		
	}

}
