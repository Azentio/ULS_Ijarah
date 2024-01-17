package stepdefinitions;

import java.io.File;
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

public class Murabha_AppDataCheck_FacilityDetails_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths facilitydetailsJsPaths = new JSPaths(excelPath, "Murabha_FacilityDetails", "Murabah_AppDataEntryFacilityDetails", "JSPath");
	//JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	
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
	ExcelData facilitydetailsExcelData  = new ExcelData(excelTestDataPath,"Murabah_FacilityDetails","Data Set ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_M_ADC_FD_01$")
    public void get_the_test_data_for_test_case_AT_M_ADC_FD_01() throws Throwable {
		testData = facilitydetailsExcelData.getTestdata("AT_M_ADC_FD_01_D1");
    }													 	
	@And("^User get the test data for test case AT_M_ADC_FD_02$")
    public void get_the_test_data_for_test_case_AT_M_ADC_FD_02() throws Throwable {
		testData = facilitydetailsExcelData.getTestdata("AT_M_ADC_FD_02_D1");
    }
	@And("^User get the test data for test case AT_M_ADC_FD_03$")
    public void get_the_test_data_for_test_case_AT_M_ADC_FD_03() throws Throwable {
		testData = facilitydetailsExcelData.getTestdata("AT_M_ADC_FD_03_D1");
    }
	
	@And("Click on view icon of existing record in Murabha_Facility list")
	public void click_on_view_icon_of_existing_record_in_murabha_facility_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("EyeIconInViewlist")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Validate Classification field is present in Murabha_Facility details view list")
	public void validate_classification_field_is_present_in_murabha_facility_details_view_list() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ClassificationField_ViewList")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ClassificationField_ViewList")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    
	}

	@And("Validate Product field is present in Murabha_Facility details view list")
	public void validate_product_field_is_present_in_murabha_facility_details_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ProductField_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ProductField_ViewList")).isDisplayed());
	    
	}

	@And("Validate Tenure field is present in Murabha_Facility details view list")
	public void validate_tenure_field_is_present_in_murabha_facility_details_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("TenureField_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("TenureField_ViewList")).isDisplayed());
	    
	}

	@And("Validate Requested amount field is present in Murabha_Facility details view list")
	public void validate_requested_amount_field_is_present_in_murabha_facility_details_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("RequestedAmount_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("RequestedAmount_ViewList")).isDisplayed());
	    
	}

	@And("Validate Status field is present in Murabha_Facility details view list")
	public void validate_status_field_is_present_in_murabha_facility_details_view_list() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Status_ViewList")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("Status_ViewList")).isDisplayed());
	    
	}

	@And("Search the Murabha_Facility details record with valid data")
	public void search_the_murabha_facility_details_record_with_valid_data() throws IOException {
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SearchButton")).click();
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
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + facilitydetailsJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Search the Murabha_Facility details record with invalid data")
	public void search_the_murabha_facility_details_record_with_invalid_data() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + facilitydetailsJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Validate the export to PDF functionality in Murabha_Facility details")
	public void validate_the_export_to_pdf_functionality_in_murabha_facility_details() throws IOException {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ExportPDF")).click();
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

	@And("Validate the export to Excel functionality in Murabha_Facility details")
	public void validate_the_export_to_excel_functionality_in_murabha_facility_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilitydetailsJsPaths.getElement("ExportXLS")).click();
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
	@And("User search the Ref id under inbox for Murabha_AppdataCheck_FacilityDetails")
	public void user_search_the_ref_id_under_inbox_for_murabha_appdata_check_facility_details() throws IOException {
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

}
