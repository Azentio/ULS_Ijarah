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

import dataProvider.ConfigFileReader;
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

public class Ijara_DocumentDetails_Step {
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getIjarahTestDataFilePath();
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
	IjaraLogin ijarahLogin = new IjaraLogin();

	// ExcelData documentdetailsExcelData = new
	// ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	// ExcelData underWriterExcelData = new
	// ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData documentdetailsExcelData = new ExcelData(excelTestDataPath, "Document_Details", "DataSetID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@Given("login with valid credentials for Ijara_Appdatacheck_Document details")
	public void login_with_valid_credentials_for_ijara_appdatacheck_document_details() {
		ijarahLogin.loginWithIjaraApplication("userTypeARL01");
	}

	@And("^User get the test data for test case AT_DOC_001$")
	public void get_the_test_data_for_test_case_AT_DOC_001() throws Throwable {
		testData = documentdetailsExcelData.getTestdata("AT_DOC_001_D1");
	}

	@And("^User get the test data for test case AT_DOC_002$")
	public void get_the_test_data_for_test_case_AT_DOC_002() throws Throwable {
		testData = documentdetailsExcelData.getTestdata("AT_DOC_002_D1");
	}

	@And("^User get the test data for test case AT_DOC_004$")
	public void get_the_test_data_for_test_case_AT_DOC_004() throws Throwable {
		testData = documentdetailsExcelData.getTestdata("AT_DOC_004_D1");
	}

	@And("^User get the test data for test case AT_DOC_006$")
	public void get_the_test_data_for_test_case_AT_DOC_006() throws Throwable {
		testData = documentdetailsExcelData.getTestdata("AT_DOC_006_D1");
	}

	@And("Navigate to Document details section")
	public void navigate_to_document_details_section() {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentDetails_Button")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Add icon in Document details section")
	public void click_on_add_icon_in_document_details_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentDetails_AddIcon"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Customer name field")
	public void select_the_value_in_customer_name_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("CustomerName")).click();
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
			System.out.println("Map " + testData.get("CustomerName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CustomerName")).trim())) {
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

	@And("Select the value in Document name field")
	public void select_the_value_in_document_name_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentName")).click();
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
			System.out.println("Map " + testData.get("DocumentName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DocumentName")).trim())) {
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

	@And("Select the value in Required at stage field")
	public void select_the_value_in_required_at_stage_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStage"))
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
			System.out.println("Map " + testData.get("RequiredAtStage").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("RequiredAtStage")).trim())) {
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

	@And("Select the value in Document status field")
	public void select_the_value_in_document_status_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatus"))
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
			System.out.println("Map " + testData.get("DocumentStatus").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DocumentStatus")).trim())) {
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

	@And("Select the value in Mandatory optional field")
	public void select_the_value_in_mandatory_optional_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("MandatoryOptional"))
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
			System.out.println("Map " + testData.get("MandatoryOptional").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("MandatoryOptional")).trim())) {
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

	@And("Select the value in Document category field")
	public void select_the_value_in_document_category_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentCategory"))
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
			System.out.println("Map " + testData.get("DocumentCategory").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DocumentCategory")).trim())) {
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

	@And("Select the value in Upload date field")
	public void select_the_value_in_upload_date_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("UploadDate")).click();
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("TodayButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Expected receipt date field")
	public void select_the_value_in_expected_receipt_date_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExpectedReceiptDate"))
						.click();
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("TodayButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Deferred stage field")
	public void select_the_value_in_deferred_stage_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DeferralStage"))
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
			System.out.println("Map " + testData.get("DeferralStage").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DeferralStage")).trim())) {
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

	@And("Select the value in Def approved by field")
	public void select_the_value_in_def_approved_by_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DefApprovedBy"))
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
			System.out.println("Map " + testData.get("DefApprovedBy").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DefApprovedBy")).trim())) {
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

	@And("Select the value in Change in nature approved by field")
	public void select_the_value_in_change_in_nature_approved_by_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ChangeInNatureApprovedBy"))
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
			System.out.println("Map " + testData.get("ChangeInNatureApprovedBy").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ChangeInNatureApprovedBy")).trim())) {
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

	@And("Select the value in Document form field")
	public void select_the_value_in_document_form_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentForm")).click();
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
			System.out.println("Map " + testData.get("DocumentForm").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DocumentForm")).trim())) {
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

	@And("Select the value in Document quality field")
	public void select_the_value_in_document_quality_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentQuality"))
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
			System.out.println("Map " + testData.get("DocumentQuality").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DocumentQuality")).trim())) {
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

	@And("Select the value in Document reference number field")
	public void select_the_value_in_document_reference_number_field() {
		javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReferenceNumber"))
				.click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReferenceNumber"))
						.sendKeys(testData.get("DocumentReferenceNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Select the value in Document received by field")
	public void select_the_value_in_document_received_by_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReceivedBy")));
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReceivedBy"))
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
			System.out.println("Map " + testData.get("DocumentReceivedBy").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("DocumentReceivedBy")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
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

	@And("Select the value in Location where received field")
	public void select_the_value_in_location_where_received_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LocationWhereReceived"))
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
			System.out.println("Map " + testData.get("LocationWhereReceived").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("LocationWhereReceived")).trim())) {
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

	@And("Select the value in Rack No field")
	public void select_the_value_in_rack_no_field() {
		javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RackNo")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RackNo"))
						.sendKeys(testData.get("RackNo"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					// Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Select the value in Shelf No field")
	public void select_the_value_in_shelf_no_field() {
		javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ShelfNo")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ShelfNo"))
						.sendKeys(testData.get("ShelfNo"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					// Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Box No field")
	public void enter_the_value_in_box_no_field() {
		javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BoxNo")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BoxNo"))
						.sendKeys(testData.get("BoxNo"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Select the value in Date of Expiry field")
	public void select_the_value_in_date_of_expiry_field() {
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		String format = date.format(dtFormatter);
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput")).click();
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiryInput"))
						.sendKeys(format, Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Enter the value in Lodgement amount field")
	public void enter_the_value_in_lodgement_amount_field() {
		javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LodgementAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LodgementAmount"))
						.sendKeys(testData.get("LodgementAmount"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Enter the value in Remarks field")
	public void enter_the_value_in_remarks_field() {
		javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("Remarks")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("Remarks"))
						.sendKeys(testData.get("Remarks"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Click on Save icon to save document details record")
	public void click_on_save_icon_to_save_document_details_record() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User search the Ref id under inbox for document details")
	public void user_search_the_ref_id_under_inbox_for_document_details() throws IOException {
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

	@And("Validate that existing records are present in document details view list")
	public void validate_that_existing_records_are_present_in_document_details_view_list() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("EditIcon")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("EditIcon")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Help button is present in document details page")
	public void validate_the_help_button_is_present_in_document_details_page() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("HelpButton")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("HelpButton"))
				.isDisplayed());

	}

	@And("Click on Back Icon in document section section")
	public void click_on_back_icon_in_document_section_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BackButton")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Click on Pencil icon of existing record")
	public void click_on_pencil_icon_of_existing_record() {
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

	@And("Validate that upload button is displayed in document details")
	public void validate_that_upload_button_is_displayed_in_document_details() throws IOException {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("FileUploadButton")));
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("FileUploadButton")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("FileUploadButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate that View document button is present in document details")
	public void validate_that_view_document_button_is_present_in_document_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewDocumentButton")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewDocumentButton")).isDisplayed());

	}

	@And("Validate the fields are present in document details view list")
	public void validate_the_fields_are_present_in_document_details_view_list() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentNameField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentNameField"))
						.isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStageField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStageField"))
						.isDisplayed());
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatusField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatusField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Search the document details value with valid data")
	public void search_the_document_details_value_with_valid_data() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys(testData.get("ValidInput"));
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput")).clear();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Search the document details value with Invalid data")
	public void search_the_document_details_value_with_invalid_data() throws IOException {
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

	@And("Validate the export to excel functionality of document details")
	public void validate_the_export_to_excel_functionality_of_document_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExportXLS")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExportXLS")).click();
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
			if (downloadsFile.getName().contains("CustomerDebtDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerDebtDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
		}

	}

	@And("Validate the export to PDF functionality of document details")
	public void validate_the_export_to_pdf_functionality_of_document_details() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExportPDF")).click();
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
			if (downloadsFile.getName().contains("CustomerDebtDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerDebtDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
		}

	}

	@And("Click on Search icon in Document details")
	public void click_on_search_icon_in_document_details() {
		System.out.println(documentdetailsJsPaths.getElement("SearchButton"));
		WebElement searchButton = javascriptHelper
				.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchButton"));
		for (int i = 0; i <= 1000; i++) {
			try {
				searchButton.click();
				// javascriptHelper.JSEClick(searchButton);
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("Click on Export dropdown in document details")
	public void click_on_export_dropdown_in_document_details() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
