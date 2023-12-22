package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
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
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_OperationCheck_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths operationcheckJsPaths = new JSPaths(excelPath, "Murabha_OperationCheck", "OperationCheck_FieldName", "JSPath");
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
	ExcelData operationcheckExcelData  = new ExcelData(excelTestDataPath,"Murabha_OperationCheck","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("^User get the test data for test case AT_MU_OC_01$")
	public void get_the_test_data_for_test_case_AT_MU_OC_01() throws Throwable {
		testData = operationcheckExcelData.getTestdata("AT_MU_OC_01_D1");
	}
	@And("^User get the test data for test case AT_MU_OC_02$")
	public void get_the_test_data_for_test_case_AT_MU_OC_02() throws Throwable {
		testData = operationcheckExcelData.getTestdata("AT_MU_OC_02_D1");
	}
	@And("^User get the test data for test case AT_MU_OC_03$")
	public void get_the_test_data_for_test_case_AT_MU_OC_03() throws Throwable {
		testData = operationcheckExcelData.getTestdata("AT_MU_OC_03_D1");
	}
	@And("^User get the test data for test case AT_MU_OC_04$")
	public void get_the_test_data_for_test_case_AT_MU_OC_04() throws Throwable {
		testData = operationcheckExcelData.getTestdata("AT_MU_OC_04_D1");
	}
	@And("^User get the test data for test case AT_MU_OC_05$")
	public void get_the_test_data_for_test_case_AT_MU_OC_05() throws Throwable {
		testData = operationcheckExcelData.getTestdata("AT_MU_OC_05_D1");
	}
	
	
	@And("Navigate to Asset delivery section")
	public void navigate_to_asset_delivery_section() {
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
				if (titlename.trim().contains("Asset Delivery")) {
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

	@And("Validate Asset Manufacture field is present in Asset details view list")
	public void validate_asset_manufacture_field_is_present_in_asset_details_view_list() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(employmentdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetManufacture")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetManufacture")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
		
	    
	}

	@And("Validate Asset Model field is present in Asset details view list")
	public void validate_asset_model_field_is_present_in_asset_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetModel")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetModel")).isDisplayed());
	    
	}

	@And("Validate Asset Model type field is present in Asset details view list")
	public void validate_asset_model_type_field_is_present_in_asset_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetModelType")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetModelType")).isDisplayed());
	    
	}

	@And("Validate Year of Manufacture field is present in Asset details view list")
	public void validate_year_of_manufacture_field_is_present_in_asset_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_YearOfManufacture")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_YearOfManufacture")).isDisplayed());
	    
	}

	@And("Validate Asset price field is present in Asset details view list")
	public void validate_asset_price_field_is_present_in_asset_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetPrice")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_AssetPrice")).isDisplayed());
	    
	}

	@And("Validate Status field is present in Asset details view list")
	public void validate_status_field_is_present_in_asset_details_view_list() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_Status")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ViewList_Status")).isDisplayed());
	    
	}
	
	@And("Search the Asset details record with valid data")
	public void search_the_asset_details_record_with_valid_data() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SearchButton")));
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SearchButton")).click();
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
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + operationcheckJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Search the Asset details record with invalid data")
	public void search_the_asset_details_record_with_invalid_data() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SearchInput"))
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
						.executeScript("return " + operationcheckJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("User validate the export to PDF functionality in Asset details screen")
	public void user_validate_the_export_to_pdf_functionality_in_asset_details_screen() throws IOException {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ExportPDF")).click();
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

	@And("User validate the export to Excel functionality in Asset details screen")
	public void user_validate_the_export_to_excel_functionality_in_asset_details_screen() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("ExportXLS")).click();
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

	@And("Select the existing record in Asset details view list")
	public void select_the_existing_record_in_asset_details_view_list() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("EditIcon")));
				// javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Update the value in Asset delivered field in Asset details page")
	public void update_the_value_in_asset_delivered_field_in_asset_details_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("AssetDelivered"))
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
			System.out.println("Map " + testData.get("AssetDelivered").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AssetDelivered")).trim())) {
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

	@And("Update the value in Delivery date in Asset details page")
	public void update_the_value_in_delivery_date_in_asset_details_page() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		System.out.println("Date " + format);
		for (int i = 0; i <= 500; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput")).click();
//				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("DeliveryDate")).click();
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("DeliveryDate")).clear();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("DeliveryDate")).sendKeys(format);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Update the value in Remarks field in Asset details page")
	public void update_the_value_in_remarks_field_in_asset_details_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("Remarks"))
						.click();
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("Remarks"))
						.clear();
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("Remarks"))
						.sendKeys(testData.get("Remarks"));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Click on Save icon in Asset details page")
	public void click_on_save_icon_in_asset_details_page() {
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SaveIcon")));
				// javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Validate Asset ID field is displayed in Asset details page")
	public void validate_asset_id_field_is_displayed_in_asset_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("AssetId")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("AssetId")).isDisplayed());
	    
	}

	@And("Validate Asset delivered field is displayed in Asset details page")
	public void validate_asset_delivered_field_is_displayed_in_asset_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("AssetDelivered")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("AssetDelivered")).isDisplayed());
	    
	}

	@And("Validate Delivery date field is displayed in Asset details page")
	public void validate_delivery_date_field_is_displayed_in_asset_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("DeliveryDate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("DeliveryDate")).isDisplayed());
	    
	}

	@And("Validate Remarks field is displayed in Asset details page")
	public void validate_remarks_field_is_displayed_in_asset_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("Remarks")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("Remarks")).isDisplayed());
	    
	}

	@And("Validate Help button functionality in Asset details page")
	public void validate_help_button_functionality_in_asset_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("HelpButton")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("HelpButton")).isDisplayed());
	    
	}
	@And("User search the Ref id under inbox for Murabha_OperationCheck")
	public void user_search_the_ref_id_under_inbox_for_murabha_operation_check() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(operationcheckJsPaths.getElement("inboxSearchInput"))
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
