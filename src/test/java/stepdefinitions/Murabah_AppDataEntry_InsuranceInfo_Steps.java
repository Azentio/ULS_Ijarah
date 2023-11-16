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

public class Murabah_AppDataEntry_InsuranceInfo_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths insuranceInfoJSPath = new JSPaths(excelPath, "Murabah_InsuranceInfo", "Murabah_AppDataEntryInsuranceInfo",
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

	// ExcelData insuranceInfoExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData insuranceInfoExcelData = new ExcelData(excelTestDataPath, "Murabah_InsuranceInfo", "DataSetID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_INS_MU_01$")
	public void get_the_test_data_for_test_case_AT_INS_MU_01() throws Throwable {
		testData = insuranceInfoExcelData.getTestdata("AT_INS_MU_01_D1");
	}

	@And("^User get the test data for test case AT_INS_MU_02$")
	public void get_the_test_data_for_test_case_AT_INS_MU_02() throws Throwable {
		testData = insuranceInfoExcelData.getTestdata("AT_INS_MU_02_D1");
	}

	@And("^User get the test data for test case AT_INS_MU_04$")
	public void get_the_test_data_for_test_case_AT_INS_MU_04() throws Throwable {
		testData = insuranceInfoExcelData.getTestdata("AT_INS_MU_04_D1");
	}

	@And("User search the Ref id under inbox for Insurance info")
	public void user_search_the_ref_id_under_inbox_for_insurance_info() {

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Navigate to Insurance Info section")
	public void navigate_to_insurance_info_section() throws IOException {
		for (int i = 0; i <= 500; i++) {
			try {
				System.out.println(insuranceInfoJSPath.getElement("insuranceInfo"));
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceInfo")).click();

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Add icon in Insurance info section")
	public void click_on_add_icon_in_insurance_info_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("Addbutton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that Insurance quatation id field is displayed in Insurance info")
	public void validate_that_insurance_quatation_id_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceQuotationId")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceQuotationId")).isDisplayed());

	}

	@And("Validate that Insurance Year field is displayed in Insurance info")
	public void validate_that_insurance_year_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceYear")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceYear"))
				.isDisplayed());

	}

	@And("Validate that Depreciation field is displayed in Insurance info")
	public void validate_that_depreciation_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("depriciation")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("depriciation"))
				.isDisplayed());

	}

	@And("Validate that Asset price field is displayed in Insurance info")
	public void validate_that_asset_price_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("AssetPrice")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("AssetPrice"))
				.isDisplayed());

	}

	@And("Validate that Rate per Asset field is displayed in Insurance info")
	public void validate_that_rate_per_asset_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("RatePerAsset")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("RatePerAsset"))
				.isDisplayed());

	}

	@And("Validate that Minimum Insurance premium field is displayed in Insurance info")
	public void validate_that_minimum_insurance_premium_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("minimumInsurancePremium")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("minimumInsurancePremium")).isDisplayed());

	}

	@And("Validate that Base Insurance premium field is displayed in Insurance info")
	public void validate_that_base_insurance_premium_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("BaseInsurancePremium")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("BaseInsurancePremium")).isDisplayed());

	}

	@And("Validate that VAT Premium field is displayed in Insurance info")
	public void validate_that_vat_premium_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("VATPremium")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("VATPremium"))
				.isDisplayed());

	}

	@And("Validate that Net Premium field is displayed in Insurance info")
	public void validate_that_net_premium_field_is_displayed_in_insurance_info() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("NetPremium")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("NetPremium"))
				.isDisplayed());

	}

	@And("Select the value in Insurance quatation id field in Insurance info")
	public void select_the_value_in_insurance_quatation_id_field_in_insurance_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceQuotationId"))
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
			System.out.println("Map " + testData.get("insuranceQuotationId").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("insuranceQuotationId")).trim())) {
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

	@And("Select the value in Insurance Year field in Insurance info")
	public void select_the_value_in_insurance_year_field_in_insurance_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("insuranceYear")).click();
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
			System.out.println("Map " + testData.get("insuranceYear").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("insuranceYear")).trim())) {
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

	@And("Enter the value in Depreciation field in Insurance info")
	public void enter_the_value_in_depreciation_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("depriciation")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("depriciation"))
						.sendKeys(testData.get("depriciation"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	

	}

	@And("Enter the value in Asset price field in Insurance info")
	public void enter_the_value_in_asset_price_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("AssetPrice")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("AssetPrice"))
						.sendKeys(testData.get("AssetPrice"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	

	}

	@And("Enter the value in Rate per Asset field in Insurance info")
	public void enter_the_value_in_rate_per_asset_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("RatePerAsset")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("RatePerAsset"))
						.sendKeys(testData.get("RatePerAsset"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	}

	@And("Enter the value in Minimum Insurance premium field in Insurance info")
	public void enter_the_value_in_minimum_insurance_premium_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("minimumInsurancePremium")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("minimumInsurancePremium"))
						.sendKeys(testData.get("minimumInsurancePremium"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	}

	@And("Enter the value in Base Insurance premium field in Insurance info")
	public void enter_the_value_in_base_insurance_premium_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("BaseInsurancePremium")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("BaseInsurancePremium"))
						.sendKeys(testData.get("BaseInsurancePremium"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}

	@And("Enter the value in VAT Premium field in Insurance info")
	public void enter_the_value_in_vat_premium_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("VATPremium")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("VATPremium"))
						.sendKeys(testData.get("VATPremium"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("Enter the value in Net Premium field in Insurance info")
	public void enter_the_value_in_net_premium_field_in_insurance_info() {
		javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("NetPremium")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("NetPremium"))
						.sendKeys(testData.get("NetPremium"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("Click on Save icon in Insurance info")
	public void click_on_save_icon_in_insurance_info() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("saveButton")).click();
				// javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that Insurance year field is displayed in Insurance info view list")
	public void validate_that_insurance_year_field_is_displayed_in_insurance_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_InsuranceYear")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_InsuranceYear")).isDisplayed());

	}

	@And("Validate that Depreciation field is displayed in Insurance info view list")
	public void validate_that_depreciation_field_is_displayed_in_insurance_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_Depreciation")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_Depreciation")).isDisplayed());

	}

	@And("Validate that Asset price field is displayed in Insurance info view list")
	public void validate_that_asset_price_field_is_displayed_in_insurance_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_AssetPrice")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_AssetPrice")).isDisplayed());

	}

	@And("Validate that Base Insurance premium field is displayed in Insurance info view list")
	public void validate_that_base_insurance_premium_field_is_displayed_in_insurance_info_view_list()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_BaseInsurancePremium")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_BaseInsurancePremium"))
				.isDisplayed());

	}

	@And("Validate that VAT Premium field is displayed in Insurance info view list")
	public void validate_that_vat_premium_field_is_displayed_in_insurance_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_VATPremium")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_VATPremium")).isDisplayed());

	}

	@And("Validate that Net Premium field is displayed in Insurance info view list")
	public void validate_that_net_premium_field_is_displayed_in_insurance_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_NetPremium")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_NetPremium")).isDisplayed());

	}

	@And("Validate that Status field is displayed in Insurance info view list")
	public void validate_that_status_field_is_displayed_in_insurance_info_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_Status")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(insuranceInfoJSPath.getElement("ViewList_Status")).isDisplayed());

	}

}
