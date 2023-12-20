package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class AutoLoanAppdataentryIncomedetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths ALoanAppdataentryIncomedetails = new JSPaths(excelPath, "ALoanAppdataentryIncomedetails", "FieldName", "JSPath");
	JSPaths TawaAppDataEntryIncomeDetails = new JSPaths(excelPath, "TawaAppDataEntryIncomeDetails", "FieldName", "JSPath");
	ExcelData AutoLoanAppDataEntryIncomeDetailsexelData = new ExcelData(excelTestDataPath, "ALoanAppdataentryIncomedetails", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	@And("^User_607 get the test data for test case AT_AL_INC_01$")
    public void get_the_test_data_for_test_case_AT_AL_INC_01() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_01");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_02$")
    public void get_the_test_data_for_test_case_AT_AL_INC_02() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_02");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_03$")
    public void get_the_test_data_for_test_case_AT_AL_INC_03() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_03");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_04$")
    public void get_the_test_data_for_test_case_AT_AL_INC_04() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_04");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_05$")
    public void get_the_test_data_for_test_case_AT_AL_INC_05() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_05");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_06$")
    public void get_the_test_data_for_test_case_AT_AL_INC_06() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_06");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_07$")
    public void get_the_test_data_for_test_case_AT_AL_INC_07() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_07");
    }
	
	@And("^User_607 get the test data for test case AT_AL_INC_08$")
    public void get_the_test_data_for_test_case_AT_AL_INC_08() throws Throwable {
		testData = AutoLoanAppDataEntryIncomeDetailsexelData.getTestdata("DS_AT_AL_INC_08");
    }
	
	@Given("User_607 Search in the search Field Auto Loan App Data Entry Income Details List")
	public void user_607_search_in_the_search_field_tawarah_app_data_entry_income_details_list() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TawaAppDataEntryIncomeDetails.getElement("searchInInbox")).sendKeys(testData.get("Search Record"),Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 click the Customer Financials tab in Auto Loan App Data Entry Income Details List")
	public void user_click_the_customer_financials_tab_in_auto_loan_app_data_entry_income_details_list() throws Throwable {
			Thread.sleep(1000);
			WebElement customerFinancialsTab = javascriptHelper.executeScriptWithWebElement(ALoanAppdataentryIncomedetails.getElement("customerFinancialsTab"));
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.backgroundColor(customerFinancialsTab);
					javascriptHelper.JSEClick(customerFinancialsTab);
					break;
				} catch (Exception e) { 
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	
	
	

}
