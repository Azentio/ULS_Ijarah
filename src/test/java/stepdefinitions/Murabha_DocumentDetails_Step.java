package stepdefinitions;

import java.io.IOException;
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

public class Murabha_DocumentDetails_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths documentdetailsJsPaths = new JSPaths(excelPath, "DocumentDetails_Elements", "DocumentDetails_FieldName",
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

	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData documentdetailsExcelData = new ExcelData(excelTestDataPath, "Document_Details", "DataSetID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^User get the test data for test case AT_M_DOC_01$")
	public void get_the_test_data_for_test_case_AT_M_DOC_01() throws Throwable {
		testData = documentdetailsExcelData.getTestdata("AT_M_DOC_01_D1");
	}

	@And("^User get the test data for test case AT_M_DOC_02$")
	public void get_the_test_data_for_test_case_AT_M_DOC_02() throws Throwable {
		testData = documentdetailsExcelData.getTestdata("AT_M_DOC_02_D1");
	}

	@And("Validate the Customer name field is displayed in document details")
	public void validate_the_customer_name_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("CustomerName")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("CustomerName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document name field is displayed in document details")
	public void validate_the_document_name_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentName")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Required at stage field is displayed in document details")
	public void validate_the_required_at_stage_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStage")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStage"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document status field is displayed in document details")
	public void validate_the_document_status_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatus")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatus"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Mandatory optional field is displayed in document details")
	public void validate_the_mandatory_optional_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("MandatoryOptional")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("MandatoryOptional"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document category field is displayed in document details")
	public void validate_the_document_category_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentCategory")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentCategory"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate the Upload date field is displayed in document details")
	public void validate_the_upload_date_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("UploadDate")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("UploadDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Expected receipt date field is displayed in document details")
	public void validate_the_expected_receipt_date_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExpectedReceiptDate")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExpectedReceiptDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Deferred stage field is displayed in document details")
	public void validate_the_deferred_stage_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DeferralStage")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DeferralStage")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Def approved by field is displayed in document details")
	public void validate_the_def_approved_by_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DefApprovedBy")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DefApprovedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Change in nature approved by field is displayed in document details")
	public void validate_the_change_in_nature_approved_by_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ChangeInNatureApprovedBy")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ChangeInNatureApprovedBy"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document form field is displayed in document details")
	public void validate_the_document_form_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentForm")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentForm")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document quality field is displayed in document details")
	public void validate_the_document_quality_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentQuality")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentQuality"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document reference number field is displayed in document details")
	public void validate_the_document_reference_number_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReferenceNumber")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReferenceNumber"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document received by field is displayed in document details")
	public void validate_the_document_received_by_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReceivedBy")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReceivedBy"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Location field is displayed in document details")
	public void validate_the_location_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LocationWhereReceived")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LocationWhereReceived"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Rack No field is displayed in document details")
	public void validate_the_rack_no_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RackNo")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RackNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Shelf No field is displayed in document details")
	public void validate_the_shelf_no_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ShelfNo")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ShelfNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Box No is displayed in document details")
	public void validate_the_box_no_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				WebElement boxNo = javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BoxNo"));
				javascriptHelper.scrollIntoView(boxNo);
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BoxNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Date of Expiry field is displayed in document details")
	public void validate_the_date_of_expiry_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiry")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Lodgement amount field is displayed in document details")
	public void validate_the_lodgement_amount_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LodgementAmount"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Remarks field is displayed in document details")
	public void validate_the_remarks_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("Remarks")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("Remarks")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Back button functionality in document details")
	public void validate_back_button_functionality_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BackButton")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BackButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Document name field is present in Document details view list")
	public void validate_document_name_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_DocumentNameField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_DocumentNameField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Required at stage field is present in Document details view list")
	public void validate_required_at_stage_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_RequredAtStageField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_RequredAtStageField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Document Status field is present in Document details view list")
	public void validate_document_status_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_DocumentStatusField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_DocumentStatusField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate MandatoryOptional field is present in Document details view list")
	public void validate_mandatory_optional_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_MandatoryOptionalField")));
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										documentdetailsJsPaths.getElement("ViewList_MandatoryOptionalField"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Document Category field is present in Document details view list")
	public void validate_document_category_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_DocumentCategoryField")));
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										documentdetailsJsPaths.getElement("ViewList_DocumentCategoryField"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate DMS Upload status field is present in Document details view list")
	public void validate_dms_upload_status_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("VierList_DMSUploadStatus")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("VierList_DMSUploadStatus"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User search the Ref id under inbox for Murabha document details")
	public void user_search_the_ref_id_under_inbox_for_murabha_document_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("inboxSearchInput"))
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

	@And("click on Eye icon of exsting record in document details")
	public void click_on_eye_icon_of_exsting_record_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("EditIcon")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Search the murabha document details value with valid data")
	public void search_the_murabha_document_details_value_with_valid_data() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput")));
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("ValidInput"));

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
						.executeScript("return " + documentdetailsJsPaths.getElement("listViewSearchResultValidation"))
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

	@And("Search the murabha document details value with Invalid data")
	public void search_the_murabha_document_details_value_with_invalid_data() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("InvalidInput"));
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
						.executeScript("return " + documentdetailsJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				if(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"))
				{
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

}
