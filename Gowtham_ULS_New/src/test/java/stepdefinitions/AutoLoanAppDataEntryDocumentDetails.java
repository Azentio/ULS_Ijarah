package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ExcelData;
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

public class AutoLoanAppDataEntryDocumentDetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths ALAppDataEntryDocumentDetails = new JSPaths(excelPath, "ALAppDataEntryDocumentDetails", "FieldName", "JSPath");
	ExcelData ALAppDataEntryDocumentDetailsexelData = new ExcelData(excelTestDataPath, "ALAppDataEntryDocumentDetails", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	JSPaths TawaAppDataEntryIncomeDetails = new JSPaths(excelPath, "TawaAppDataEntryIncomeDetails", "FieldName", "JSPath");
	ExcelData ALAppdataEntryDocumentsDetailsexelData1 = new ExcelData(excelTestDataPath, "ALAppdataEntryDocumentsDetails", "Data Set ID");
	Map<String, String> ALAppdataEntryDocumentsDetails;
	ExcelData AutoLoanExecutionExcel = new ExcelData(excelTestDataPath, "AutoLoanExecution", "TestCase ID");
	Map<String, String> executionData;
	
	
	
	@Given("User_607 get the test data for test case AT_Al_DOC_09")
	public void user_get_the_test_data_for_test_case_at_al_doc() {
		executionData = AutoLoanExecutionExcel.getTestdata("AT_Al_DOC_09");
		ALAppdataEntryDocumentsDetails = ALAppdataEntryDocumentsDetailsexelData1.getTestdata(executionData.get("dataSet_ID"));
	}
	
	@Given("User_607 Search in the search Field Auto Loan App Data Entry Document Details")
	public void user_search_in_the_search_field_auto_loan_app_data_entry_document_details() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TawaAppDataEntryIncomeDetails.getElement("searchInInbox")).sendKeys(ALAppdataEntryDocumentsDetails.get("Search Record"));
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 click on document details info tab Auto Loan App Data Entry")
	public void user_607_click_on_document_details_info_tab_auto_loan_app_data_entry() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("DocumentDetails"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 Verify back button in document details Auto Loan App Data Entry")
	public void user_607_verify_back_button_in_document_details_auto_loan_app_data_entry() {
		for (int i = 0; i <= 500; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("BackButtonInListView")).isDisplayed()) {
					break;
				}
				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_607 Verify Add button in document details Auto Loan App Data Entry")
	public void user_607_verify_add_button_in_document_details_auto_loan_app_data_entry() {
		for (int i = 0; i <= 500; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("AddButton")).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_607 Verify Search box in document details Auto Loan App Data Entry")
	public void user_607_verify_search_box_in_document_details_auto_loan_app_data_entry() {
		for (int i = 0; i <= 500; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("SearchButton")).isDisplayed()) {
					break;
				}
					
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_607 Verify Export to PDF in document details Auto Loan App Data Entry")
	public void user_607_verify_export_to_pdf_in_document_details_auto_loan_app_data_entry() {
		for (int i = 0; i <= 500; i++) {
			try {
			javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("Export_DropDown")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
			javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("PDF_download")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_607 Verify Export to Excel in document details Auto Loan App Data Entry")
	public void user_607_verify_export_to_excel_in_document_details_auto_loan_app_data_entry() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("Export_DropDown")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
			javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("XLS_download")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 Verify Already filled data in document details Auto Loan App Data Entry")
	public void user_607_verify_already_filled_data_in_document_details_auto_loan_app_data_entry() {
		for (int i = 0; i <= 500; i++) {
			try {
				String attribute = javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("DOCUMENT_NAME")).getAttribute("ng-reflect-disabled");
				if (!attribute.equalsIgnoreCase("true")) {
					Assert.fail();
				}
				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@And("User_607 Click Edit button in list view screen")
	public void user_607_click_edit_button_in_list_view_screen() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("EditButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 Click view button in list view screen")
	public void user_607_click_view_button_in_list_view_screen() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("ViewButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 Verify Post clicking on Add button system should allow user to create new record")
	public void user_607_verify_post_clicking_on_add_button_system_should_allow_user_to_create_new_record() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("DOCUMENT_NAME")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
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

					System.out
							.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

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

			System.out.println("Map " + " AADHAAR ".trim());

			if ((dropdownString.trim())
					.equalsIgnoreCase(" AADHAAR ".trim())) {

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
	
	@And("User_607 Click back button in document details Auto Loan App Data Entry record")
	public void user_607_click_back_button_in_document_details_auto_loan_app_data_entry_record() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("BackButtonInRecord")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 Search matching value system should display all the possible matching records")
	public void user_607_search_matching_value_system_should_display_all_the_possible_matching_records() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("SearchButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("SearchFieldInListView")).sendKeys("Pan",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("EditButton")).isDisplayed()) {
					break;
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 Search missmatching value system should display not matching any records")
	public void user_607_search_missmatching_value_system_should_display_not_matching_any_records() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("SearchFieldInListView")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("SearchFieldInListView")).sendKeys("test",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		for (int i = 0; i <= 500; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("EditButton")).isDisplayed()) {
					Assert.fail();
				}
			} catch (Exception e) {
				if (i == 500) {
					Assert.assertTrue(true);
				}
			}
		}
	    
	}
	
	@Given("User_607 Verify the back button in List View screen")
	public void user_607_verify_the_back_button_in_list_view_screen() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						ALAppDataEntryDocumentDetails.getElement("BackButtonInListView")).click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	

}
