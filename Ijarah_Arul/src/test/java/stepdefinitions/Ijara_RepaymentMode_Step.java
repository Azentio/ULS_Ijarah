package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

public class Ijara_RepaymentMode_Step {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths ijararepaymentmodeJsPaths = new JSPaths(excelPath, "Repayment_Mode", "RepaymentMode_FieldName", "JSPath");
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
	
	//ExcelData documentdetailsExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	//ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData ijararepaymentmodeExcelData  = new ExcelData(excelTestDataPath,"Ijara_RepaymentMode","DataSetID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_IRM_007$")
    public void get_the_test_data_for_test_case_AT_IRM_007() throws Throwable {
		testData = ijararepaymentmodeExcelData.getTestdata("AT_IRM_007_D1");
    }	

	@And("User search the Ref id under inbox for Ijara repayment mode")
	public void user_search_the_ref_id_under_inbox_for_ijara_repayment_mode() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}

	@And("Navigate to Repayment mode section")
	public void navigate_to_repayment_mode_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("repaymentModeSection")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   
	}

	@And("Validate Repayment mode field is present in repayment mode view list")
	public void validate_repayment_mode_field_is_present_in_repayment_mode_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_RepaymentModeField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_RepaymentModeField")).isDisplayed());
	   
	}

	@And("Validate Account holder name field is present in repayment mode view list")
	public void validate_account_holder_name_field_is_present_in_repayment_mode_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_AccountHolderNameField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_AccountHolderNameField")).isDisplayed());
	   
	}

	@And("Validate Account type field is present in repayment mode view list")
	public void validate_account_type_field_is_present_in_repayment_mode_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_AccountTypeField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_AccountTypeField")).isDisplayed());
	   
	}

	@And("Validate Account currency field is present in repayment mode view list")
	public void validate_account_currency_field_is_present_in_repayment_mode_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_AccountCurrencyField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_AccountCurrencyField")).isDisplayed());
	   
	}

	@And("Validate Bank name field is present in repayment mode view list")
	public void validate_bank_name_field_is_present_in_repayment_mode_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_BankNameField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_BankNameField")).isDisplayed());
	   
	}

	@And("Validate Status field is present in repayment mode view list")
	public void validate_status_field_is_present_in_repayment_mode_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_StatusField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ijararepaymentmodeJsPaths.getElement("ViewList_StatusField")).isDisplayed());
	   
	}
}
