package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class UnderWriter_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";

	ExcelData excelDataForUnderWriter = new ExcelData(excelTestDataPath, "UnderWriter", "DataSetID");
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths jsPaths = new JSPaths(excelPath, "UnderWriter", "Ijara_UnderWriter", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData;

	
	@And("user Enter the clientname under searchButton for underwriter")
	public void user_enter_the_clientname_under_search_button_for_underwriter() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")));
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).click();
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).sendKeys(testData.get("ClientName"));
		   
	    
	}
	
	@And("^user update test data set id for AT_UNW_006$")
	public void user_update_test_data_set_id_for_at_unw_006() throws Throwable {
		testData = excelDataForUnderWriter.getTestdata("AT_UNW_006_D1");
	}
	
	@And("user click and verify the Application Details")
	public void user_click_and_verify_the_application_details() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ApplicationDetails")).click();

	}

	@And("user verify the submit button under Application Details")
	public void user_verify_the_submit_button_under_application_details() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("submitButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}
	@And("user verify the return button under Application Details")
	public void user_verify_the_return_button_under_application_details() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ReturnButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("user verify the View summary button under Application Details")
	public void user_verify_the_view_summary_button_under_application_details() {

		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ViewSummary")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("user verify and click the Customer Details tab")
	public void user_verify_and_click_the_customer_details_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Customer Details")).click();

	}

	@And("user verify and click the Customer Financial tab")
	public void user_verify_and_click_the_customer_financial_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Customer Financial")).click();

	}

	@And("user verify and click the Additional customer Info tab")
	public void user_verify_and_click_the_additional_customer_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Additional customer Info")).click();

	}

	@And("user verify and click the Living Expense tab")
	public void user_verify_and_click_the_living_expense_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Living Expense")).click();

	}

	@And("user verify and click the Facility Details tab")
	public void user_verify_and_click_the_facility_details_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Facility Details")).click();

	}

	@And("user verify and click the Asset Details tab")
	public void user_verify_and_click_the_asset_details_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Asset Details")).click();

	}

	@And("user verify and click the Policy Check tab")
	public void user_verify_and_click_the_policy_check_tab() {
		javaScriptHelper
				.scrollIntoView(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Policy Check")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Policy Check")).click();
	}

	@And("user verify and click the Documents tab")
	public void user_verify_and_click_the_documents_tab() {
		javaScriptHelper
		.scrollIntoView(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Documents")));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Documents")).click();

	}

	@And("user verify and click the Quatation Info tab")
	public void user_verify_and_click_the_quatation_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Quatation Info")).click();

	}

	@And("user verify and click the Insurance Info tab")
	public void user_verify_and_click_the_insurance_info_tab() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Insurance Info")).click();

	}
	@And("user scroll down to view the tabs")
	public void user_scroll_down_to_view_the_tabs() {
		for (int i = 0; i < 200; i++) {
			try {
				 javaScriptHelper.scrollIntoView(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ColorPalette")));
				   Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ColorPalette")).isDisplayed()); 
				   break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	  
	}

}
