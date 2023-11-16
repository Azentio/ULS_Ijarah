package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijara_AppDataCheck_ApplicationDetails_Step {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	//JSPaths applicationdetailsJsPaths = new JSPaths(excelPath, "RepaymentMode_Elements", "RepaymentMode_FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	JSPaths applicationdetailsJsPaths = new JSPaths(excelPath, "AppDataCheck_ApplicationDetails", "ApplicationDetails_FieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ExcelData applicationdetailsExcelData  = new ExcelData(excelTestDataPath,"AppDataCheck_ApplicationDetails","DataSetID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_ADC_07$")
    public void get_the_test_data_for_test_case_AT_ADC_07() throws Throwable {
		testData = applicationdetailsExcelData.getTestdata("AT_ADC_07_D1");
    }	
	
	@And("Navigate to Application details section")
	public void navigate_to_application_details_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("RepaymentModeButton")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Validate that Spoke Location field is present in Application details")
	public void validate_that_spoke_location_field_is_present_in_application_details() throws IOException{
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpokeLocation")).isDisplayed());
				Assert.assertEquals(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpokeLocation")).getAttribute("ng-reflect-readonly"), "true");
				//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SpokeLocation")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
		
	    
	}

	@And("Validate that ClosingStaff ServicingStaff field is present in Application details")
	public void validate_that_closing_staff_servicing_staff_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ClosingStaffOrServicingStaff")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ClosingStaffOrServicingStaff")).isDisplayed());
	    
	}

	@And("Validate that Topup type field is present in Application details")
	public void validate_that_topup_type_field_is_present_in_application_details() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupType")).isDisplayed());
	    
	}

	@And("Validate that Topup application No field is present in Application details")
	public void validate_that_topup_application_no_field_is_present_in_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupApplicationNo")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("TopupApplicationNo")).isDisplayed());
	    
	}

	@And("Validate that Sourcing Type field is present in Application details")
	public void validate_that_sourcing_type_field_is_present_in_application_details() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingType")).isDisplayed());
	    
	}

	@And("Validate that Sourcing Office field is present in Application details")
	public void validate_that_sourcing_office_field_is_present_in_application_details() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingOffice")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingOffice")).isDisplayed());
	    
	}

	@And("Validate that Sourcing Entity field is present in Application details")
	public void validate_that_sourcing_entity_field_is_present_in_application_details() throws IOException{
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingEntity")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingEntity")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingEntity")).isDisplayed());
	    
	}

	@And("Validate that Sourcing Staff field is present in Application details")
	public void validate_that_sourcing_staff_field_is_present_in_application_details() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingStaff")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("SourcingStaff")).isDisplayed());
	    
	}

	@And("Validate that Reference Type field is present in Application details")
	public void validate_that_reference_type_field_is_present_in_application_details() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceType")).isDisplayed());
	    
	}

	@And("Validate that Reference Code field is present in Application details")
	public void validate_that_reference_code_field_is_present_in_application_details() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceCode")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("ReferenceCode")).isDisplayed());
	    
	}

	@And("Validate the back button functionality of Application details")
	public void validate_the_back_button_functionality_of_application_details() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("BackButton")));
				//javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) { 
				
			}
		}
	    
	}
	@And("User search the Ref id under inbox for Application details")
	public void user_search_the_ref_id_under_inbox_for_application_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(applicationdetailsJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
}
