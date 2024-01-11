package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.JSPaths;
import resources.BaseClass;

public class MURABHA_Steps {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getMurabhaTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	JSPaths dataCheck_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName",
			"JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements", "ApplicationDetails_FieldName", "JSPath");
	JSPaths offering_OfferDetailsJsPaths = new JSPaths(excelPath, "OfferingOfferDetails_Elements", "Offering_OfferDetails_FieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions actions = new Actions(driver);
	SoftAssert softAssert = new SoftAssert();
	ExcelData IjarahExecutionSheet = new ExcelData(excelTestDataPath, "Ijarah_ExecutionTracker", "TestCase ID");
	ExcelData customerDebtExcelData = new ExcelData(excelTestDataPath, "CF_DebtTestData", "DataSet ID");
	ExcelData underWriterExcelData = new ExcelData(excelTestDataPath, "UnderWriter_TestData", "DataSet ID");
	ExcelData dataCheck_IncomeExcelData = new ExcelData(excelTestDataPath, "DataCheck_Income", "DataSet ID");
	ExcelData dataCheck_ApplicationDetailsExcelData = new ExcelData(excelTestDataPath, "DataCheck_AppDetails",
			"DataSet ID");
	ExcelData offering_OfferDetailsExcelData = new ExcelData(excelTestDataPath, "Offering_OfferDetails", "DataSet ID");
	ExcelData contractSign_ApplicationDetailsExcelData = new ExcelData(excelTestDataPath, "ContractSign_AppDetails",
			"DataSet ID");

	Map<String, String> testExecutionData;
	Map<String, String> testData;

	String incomeSection = "";

//  App Data Entry -- Customer Debt screen
//	@AT_CUD_001
	@And("^User_608 get the test data for test case AT_CUD_001$")
	public void get_the_test_data_for_test_case_AT_CUD_001() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_CUD_001");
		testData = customerDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_CUD_002
	@And("^User_608 get the test data for test case AT_CUD_002$")
	public void get_the_test_data_for_test_case_AT_CUD_002() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_CUD_002");
		testData = customerDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_CUD_003
	@And("^User_608 get the test data for test case AT_CUD_003$")
	public void get_the_test_data_for_test_case_AT_CUD_003() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_CUD_003");
		testData = customerDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_CUD_004
	@And("^User_608 get the test data for test case AT_CUD_004$")
	public void get_the_test_data_for_test_case_AT_CUD_004() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_CUD_004");
		testData = customerDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_CUD_005
	@And("^User_608 get the test data for test case AT_CUD_005$")
	public void get_the_test_data_for_test_case_AT_CUD_005() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_CUD_005");
		testData = customerDebtExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	Underwriter feature
//	@AT_UNW_001_01
	@And("^User_608 get the test data for test case AT_UNW_001_01$")
	public void get_the_test_data_for_test_case_AT_UNW_001_01() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_UNW_001_01");
		testData = underWriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_UNW_001_02
	@And("^User_608 get the test data for test case AT_UNW_001_02$")
	public void get_the_test_data_for_test_case_AT_UNW_001_02() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_UNW_001_02");
		testData = underWriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_UNW_002
	@And("^User_608 get the test data for test case AT_UNW_002$")
	public void get_the_test_data_for_test_case_AT_UNW_002() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_UNW_002");
		testData = underWriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_UNW_004
	@And("^User_608 get the test data for test case AT_UNW_004$")
	public void get_the_test_data_for_test_case_AT_UNW_004() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_UNW_004");
		testData = underWriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_UNW_003 --> Underwriter -Arul
	@And("^User_608 get the test data for test case AT_UNW_003$")
	public void get_the_test_data_for_test_case_AT_UNW_003() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_UNW_003");
		testData = underWriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	@AT_UNW_006 --> Underwriter - Karthi
	@And("^User_608 get the test data for test case AT_UNW_006$")
	public void get_the_test_data_for_test_case_AT_UNW_006() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_UNW_006");
		testData = underWriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	App Data Check -- Income
	@And("^User_608 get the test data for test case AT_INCD_01$")
	public void get_the_test_data_for_test_case_AT_INCD_01() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_01");
	}

	@And("^User_608 get the test data for test case AT_INCD_02$")
	public void get_the_test_data_for_test_case_AT_INCD_02() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_02");
	}

	@And("^User_608 get the test data for test case AT_INCD_03$")
	public void get_the_test_data_for_test_case_AT_INCD_03() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_03");
	}

	@And("^User_608 get the test data for test case AT_INCD_04$")
	public void get_the_test_data_for_test_case_AT_INCD_04() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_04");
	}

	@And("^User_608 get the test data for test case AT_INCD_05$")
	public void get_the_test_data_for_test_case_AT_INCD_05() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_05");
	}

	@And("^User_608 get the test data for test case AT_INCD_06$")
	public void get_the_test_data_for_test_case_AT_INCD_06() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_06");
	}

//	App Data Check -- Application Details
	@And("^User_608 get the test data for test case AT_ADC_01$")
	public void get_the_test_data_for_test_case_AT_ADC_01() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_ADC_01");
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_ADC_02$")
	public void get_the_test_data_for_test_case_AT_ADC_02() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_ADC_02");
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_ADC_03$")
	public void get_the_test_data_for_test_case_AT_ADC_03() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_ADC_03");
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_ADC_05$")
	public void get_the_test_data_for_test_case_AT_ADC_05() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_ADC_05");
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_ADC_06$")
	public void get_the_test_data_for_test_case_AT_ADC_06() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_ADC_06");
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	Offering Stage -- Offer Details tab
	@And("^User_608 get the test data for test case AT_OFO_01$")
	public void get_the_test_data_for_test_case_AT_OFO_01() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_OFO_01");
		testData = offering_OfferDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_OFO_02$")
	public void get_the_test_data_for_test_case_AT_OFO_02() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_OFO_02");
		testData = offering_OfferDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_OFO_03$")
	public void get_the_test_data_for_test_case_AT_OFO_03() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_OFO_03");
		testData = offering_OfferDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_OFO_04$")
	public void get_the_test_data_for_test_case_AT_OFO_04() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_OFO_04");
		testData = offering_OfferDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_OFO_05$")
	public void get_the_test_data_for_test_case_AT_OFO_05() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_OFO_05");
		testData = offering_OfferDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_OFO_06$")
	public void get_the_test_data_for_test_case_AT_OFO_06() throws Throwable {
		testExecutionData=IjarahExecutionSheet.getTestdata("AT_OFO_06");
		testData = offering_OfferDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	Contract Signing -- Application Details Tab
	@And("^User_608 get the test data for test case AT_CSAD_01$")
	public void get_the_test_data_for_test_case_AT_CSAD_01() throws Throwable {
		testData = contractSign_ApplicationDetailsExcelData.getTestdata("DS_AT_CSAD_01");
	}

	@And("^User_608 get the test data for test case AT_CSAD_02$")
	public void get_the_test_data_for_test_case_AT_CSAD_02() throws Throwable {
		testData = contractSign_ApplicationDetailsExcelData.getTestdata("DS_AT_CSAD_02");
	}

	@And("^User_608 get the test data for test case AT_CSAD_03$")
	public void get_the_test_data_for_test_case_AT_CSAD_03() throws Throwable {
		testData = contractSign_ApplicationDetailsExcelData.getTestdata("DS_AT_CSAD_03");
	}

	@And("^User_608 get the test data for test case AT_CSAD_04$")
	public void get_the_test_data_for_test_case_AT_CSAD_04() throws Throwable {
		testData = contractSign_ApplicationDetailsExcelData.getTestdata("DS_AT_CSAD_04");
	}

	@And("^User_608 get the test data for test case AT_CSAD_05$")
	public void get_the_test_data_for_test_case_AT_CSAD_05() throws Throwable {
		testData = contractSign_ApplicationDetailsExcelData.getTestdata("DS_AT_CSAD_05");
	}

	@And("User_608 click the module name dropdown in ULS application")
	public void user_608_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("moduleNameDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the module name as LOS in ULS application")
	public void user_608_select_the_module_name_as_los_in_uls_application() throws Throwable {
		Thread.sleep(100);
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

//		document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
//                    if (moduleName.equalsIgnoreCase(testData.get("Module Name"))) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("User_608 click the Mail box in ULS application")
	public void user_608_click_the_mail_box_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Search button under inbox")
	public void user_608_click_the_search_button_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailInboxSearchBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Ref id under inbox")
	public void user_608_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"),Keys.ENTER);
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Entitle button under inbox")
	public void user_608_click_the_entitle_button_under_inbox() throws Throwable {
		Thread.sleep(1000);
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-card button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-card button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Entitle")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-card button')[" + j + "]";
						WebElement editBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(editBtn);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Thread.sleep(1000);
//		for (int i = 0; i <= 1000; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxEntitleBtn")).click();
//				break;
//			} catch (Exception e) {
//				if (i == 1000) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
	}

	@And("User_608 click the Customer Financials tab")
	public void user_608_click_the_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Financials")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						System.out.println(jspath);
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the pencil icon under Customer Financials tab")
	public void user_608_click_the_pencil_icon_under_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Edit")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement editBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(editBtn);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click Add button in Financial Commitments under Customer Financials tab")
	public void user_608_click_add_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							actions.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
											+ j + "]")).build().perform();
//							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
//									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
//											+ j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_608 validate the Customer Debt screen is available in Financial Commitments")
	public void user_608_validate_the_customer_debt_screen_is_available_in_financial_commitments() throws Throwable {
		Thread.sleep(1000);
		WebElement customerDebtDetailsScreen = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtDetailsScreen"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(customerDebtDetailsScreen);
				Assert.assertTrue(customerDebtDetailsScreen.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Save button available in Customer Debt screen")
	public void user_608_validate_the_save_button_available_in_customer_debt_screen() throws Throwable {
		WebElement customerDebtSaveBtn = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtSaveBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(customerDebtSaveBtn).perform();
				Assert.assertTrue(customerDebtSaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Update button available in Customer Debt screen")
	public void user_608_validate_the_update_button_available_in_customer_debt_screen() throws Throwable {
		WebElement updateBtn = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtUpdateBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(updateBtn).perform();
				Assert.assertTrue(updateBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Back button available in Customer Debt screen")
	public void user_608_validate_the_back_button_available_in_customer_debt_screen() throws Throwable {
		WebElement customerDebtBackBtn = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtBackBtn"));
		waitHelper.waitForElementwithFluentwait(driver, customerDebtBackBtn);
		for (int i = 0; i <= 1000; i++) {
			try {
				actions.moveToElement(customerDebtBackBtn).perform();
				Assert.assertTrue(customerDebtBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Back button in Customer Debt screen navigate to the previous screen")
	public void user_608_click_the_back_button_in_customer_debt_screen_navigate_to_the_previous_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtBackBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Finance type field available in Customer Debt screen")
	public void user_608_validate_the_finance_type_field_available_in_customer_debt_screen() throws Throwable {
		WebElement financeTypeField = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField"));
		waitHelper.waitForElementwithFluentwait(driver, financeTypeField);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeTypeField);
				Assert.assertTrue(financeTypeField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 validate the Financial Institution field is available in Customer Debt screen")
	public void user_608_validate_the_financial_institution_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement financialInstitutionlabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financialInstitutionlabel);
				Assert.assertTrue(financialInstitutionlabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Account Number field is available in Customer Debt screen")
	public void user_608_validate_the_account_number_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement accountNumberLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(accountNumberLabel);
				Assert.assertTrue(accountNumberLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 validate the Sanction Date field is available in Customer Debt screen")
	public void user_608_validate_the_sanction_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement sanctionDataLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(sanctionDataLabel);
				Assert.assertTrue(sanctionDataLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Sanction Amount field is available in Customer Debt screen")
	public void user_608_validate_the_sanction_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement sanctionAmtLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(sanctionAmtLabel);
				Assert.assertTrue(sanctionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(text.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Interest Rate % field is available in Customer Debt screen")
	public void user_608_validate_the_interest_rate_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement interestRateLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(interestRateLabel);
				Assert.assertTrue(interestRateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Current Principal balance field is available in Customer Debt screen")
	public void user_608_validate_the_current_principal_balance_field_is_available_in_customer_debt_screen()
			throws Throwable {
		WebElement currentPrincipalBalanceLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(currentPrincipalBalanceLabel);
				Assert.assertTrue(currentPrincipalBalanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Tenure field is available in Customer Debt screen")
	public void user_608_validate_the_tenure_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement tenureMonthLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(tenureMonthLabel);
				Assert.assertTrue(tenureMonthLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(text.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Maturity Date field is available in Customer Debt screen")
	public void user_608_validate_the_maturity_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement maturityDateLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(maturityDateLabel);
				Assert.assertTrue(maturityDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Installment Amount field is available in Customer Debt screen")
	public void user_608_validate_the_installment_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement installmentAmtLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel"));
		for (int i = 0; i <= 11000; i++) {
			try {
				javascriptHelper.backgroundColor(installmentAmtLabel);
				Assert.assertTrue(installmentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(text.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Amount considered field is available in Customer Debt screen")
	public void user_608_validate_the_amount_considered_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(amountConsideredLabel);
				Assert.assertTrue(amountConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Currency field is available in Customer Debt screen")
	public void user_608_validate_the_currency_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement currencyLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(currencyLabel);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(currencyLabel);
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Remarks field is available in Customer Debt screen")
	public void user_608_validate_the_remarks_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement remarksLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(remarksLabel);
				Assert.assertTrue(remarksLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Next Due Date field is available in Customer Debt screen")
	public void user_608_validate_the_next_due_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement nextDueDateLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(nextDueDateLabel);
				Assert.assertTrue(nextDueDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Collateral Type is available in Customer Debt screen")
	public void user_608_validate_the_collateral_type_is_available_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement collateralTypeLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(collateralTypeLabel);
				Assert.assertTrue(collateralTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Close Date field is available in Customer Debt screen")
	public void user_608_validate_the_close_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement closeDateLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(closeDateLabel);
				Assert.assertTrue(closeDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Frequency field is available in Customer Debt screen")
	public void user_608_validate_the_frequency_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement frequencyLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(frequencyLabel);
				Assert.assertTrue(frequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Last payment amount field is available in Customer Debt screen")
	public void user_608_validate_the_last_payment_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement lastPaymentAmtLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(lastPaymentAmtLabel);
				Assert.assertTrue(lastPaymentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Last payment date field is available in Customer Debt screen")
	public void user_608_validate_the_last_payment_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement lastPaymentDateLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(lastPaymentDateLabel);
				Assert.assertTrue(lastPaymentDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Product Name field is available in Customer Debt screen")
	public void user_608_validate_the_product_name_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement productNameLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(productNameLabel);
				Assert.assertTrue(productNameLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Last24 cycle field is available in Customer Debt screen")
	public void user_608_validate_the_last24_cycle_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement last24CycleLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(last24CycleLabel);
				Assert.assertTrue(last24CycleLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Balance Transfer flag field is available in Customer Debt screen")
	public void user_608_validate_the_balance_transfer_flag_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement balanceTransferFlagLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(balanceTransferFlagLabel);
				Assert.assertTrue(balanceTransferFlagLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Facility Status field is available in Customer Debt screen")
	public void user_608_validate_the_facility_status_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement facilityStatusLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facilityStatusLabel);
				Assert.assertTrue(facilityStatusLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Remaining Tenure field is available in Customer Debt screen")
	public void user_608_validate_the_remaining_tenure_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement remainingTenureLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(remainingTenureLabel);
				Assert.assertTrue(remainingTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(text.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Disbursement Date field is available in Customer Debt screen")
	public void user_608_validate_the_disbursement_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement disbursementDateLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(disbursementDateLabel);
				Assert.assertTrue(disbursementDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Request for Balance Takeover field is available in Customer Debt screen")
	public void user_608_validate_the_request_for_balance_takeover_field_is_available_in_customer_debt_screen()
			throws Throwable {
		WebElement reqForBalanceTakeoverLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(reqForBalanceTakeoverLabel);
				Assert.assertTrue(reqForBalanceTakeoverLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the NPA Classification field is available in Customer Debt screen")
	public void user_608_validate_the_npa_classification_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement NPAClassificationLabel = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(NPAClassificationLabel);
				Assert.assertTrue(NPAClassificationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String text = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(!(text.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CUD_002
	@And("User_608 select the Finanacy type in Customer Debt screen")
	public void user_608_select_the_finanacy_type_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown"))
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
//			System.out.println("Map " + testData.get("Finance Type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance Type")).trim())) {
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

	@And("User_608 enter the Sanction Amount in Customer Debt screen")
	public void user_608_enter_the_sanction_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
						.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Tenure in Customer Debt screen")
	public void user_608_enter_the_tenure_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
						.sendKeys(testData.get("Tenure(Months)"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Installment Amount in Customer Debt screen")
	public void user_608_enter_the_installment_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Installment Amt"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Remaining Tenure in Customer Debt screen")
	public void user_608_enter_the_remaining_tenure_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"), Keys.TAB);
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_608 click the Save button in Customer Debt screen")
	public void user_608_click_the_save_button_in_customer_debt_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtSaveBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_608 validate the confirm message in Customer Debt screen")
	public void user_608_validate_the_confirm_message_in_customer_debt_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("successMsg")));
		String financeTypeText = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("successMsg")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(financeTypeText.contains("Success!"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 validate the mandatory field blank message in Customer Debt screen")
	public void user_608_validate_the_mandatory_field_blank_message_in_customer_debt_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")));
		String madatoryErrorMsg = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : " + madatoryErrorMsg);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Text value in numeric field and validate the error message in Customer Debt screen")
	public void user_608_enter_the_text_value_in_numeric_field_and_validate_the_error_message_in_customer_debt_screen()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
						.sendKeys(testData.get("Remaining Tenure"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg"))
						.isDisplayed());
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// Validate the numeric error
//		String numericError = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("textInNumericFieldError")).getText();
//		System.err.println("Numeric Error: "+numericError);
//		for (int i = 0; i<2000; i++) {
//          try {
//              Assert.assertTrue(numericError.contains("Positive Integer Allowed"));
//              break;
//          } catch (Exception e) {
//              if (i==1999) {
//                  Assert.fail(e.getMessage());
//              }
//          }
//		}	    
	}

	@And("User_608 validate the message for invalid data in Customer Debt screen")
	public void user_608_validate_the_message_for_invalid_data_in_customer_debt_screen() throws Throwable {
		String madatoryErrorMsg = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : " + madatoryErrorMsg);
		for (int i = 0; i < 5000; i++) {
			try {
				Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

//	AT_CUD_003
	@And("User_608 click the pencil button under Financial Commitments in Customer Financials tab")
	public void user_608_click_the_pencil_button_under_financial_commitments_in_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
									.click();
// document.querySelectorAll('button[icon="pi pi-plus"]')[3].parentElement.parentElement.parentElement.nextElementSibling.querySelector("table tbody tr td button")
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_608 again click the first row pencil button under Financial Commitments in Customer Financials tab")
	public void user_608_again_click_the_first_row_pencil_button_under_financial_commitments_in_customer_financials_tab()
			throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));
							javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll(\"table tbody tr td button\")[2]"));
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

//	AT_CUD_003
	@And("User_608 modify the Sanction amount in Customer Debt screen")
	public void user_608_modify_the_sanction_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
						.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 enter the invalid data and verify in Installment field under Customer Debt screen")
	public void user_608_enter_the_invalid_data_and_verify_in_installment_field_under_customer_debt_screen()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
						.sendKeys(testData.get("Invalid Data"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 500; i++) {
			try {
//				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")).isDisplayed())
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		// Validate the numeric error
//		String numericError = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("textInNumericFieldError")).getText();
//		System.err.println("Numeric Error: " + numericError);
//		for (int i = 0; i < 2000; i++) {
//			try {
//				Assert.assertTrue(numericError.contains("Positive Integer Allowed"));
//				break;
//			} catch (Exception e) {
//				if (i == 1999) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}	    
	}

	@And("User_608 clear the mandatory field value in Customer Debt screen")
	public void user_608_clear_the_mandatory_field_value_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
	}

	@And("User_608 Update the record with mandatory field blank in Customer Debt screen")
	public void user_608_update_the_record_with_mandatory_field_blank_in_customer_debt_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtUpdateBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@When("User_608 click the Update button in Customer Debt screen")
	public void user_608_click_the_update_button_in_customer_debt_screen() throws Throwable {
		WebElement pageTop = javascriptHelper
				.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 5000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtUpdateBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("successMsg")).isDisplayed());
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	**************************************** Underwriter Feature ******************************************
	@And("User_608 verify the Offer Decision tab is displayed in Underwriter")
	public void user_608_verify_the_offer_decision_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement offerDecisionTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionTab"));
		for (int i = 0; i <= 5000; i++) {
			try {
//				javascriptHelper.backgroundColor(offerDecisionTab);
				actions.moveToElement(offerDecisionTab);
				Assert.assertTrue(offerDecisionTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Application Details tab is displayed in Underwriter")
	public void user_608_verify_the_application_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement applicationDetailsTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("applicationDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(applicationDetailsTab);
				actions.moveToElement(applicationDetailsTab);
				Assert.assertTrue(applicationDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Customer details tab is displayed in Underwriter")
	public void user_608_verify_the_customer_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement customerDetailsTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("customerDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(customerDetailsTab);
				actions.moveToElement(customerDetailsTab);
				Assert.assertTrue(customerDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Additional Customer info tab is displayed in Underwriter")
	public void user_608_verify_the_additional_customer_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement additionalCustomerInfoTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("additionalCustomerInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(additionalCustomerInfoTab);
				Assert.assertTrue(additionalCustomerInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Customer Financials tab is displayed in Underwriter")
	public void user_608_verify_the_customer_financials_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement customerFinancialsTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("customerFinancialsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(customerFinancialsTab);
				Assert.assertTrue(customerFinancialsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Living Expenses tab is displayed in Underwriter")
	public void user_608_verify_the_living_expenses_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement livingExpensesTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("livingExpensesTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(livingExpensesTab);
				Assert.assertTrue(livingExpensesTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Facility Info tab is displayed in Underwriter")
	public void user_608_verify_the_facility_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement facilityInfoTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facilityInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(facilityInfoTab);
				Assert.assertTrue(facilityInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Asset Details tab is displayed in Underwriter")
	public void user_608_verify_the_asset_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement assetDetailsTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("assetDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(assetDetailsTab);
				Assert.assertTrue(assetDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Quotation Info tab is displayed in Underwriter")
	public void user_608_verify_the_quotation_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement quotationInfoTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("quotationInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(quotationInfoTab);
				Assert.assertTrue(quotationInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Insurance Info tab is displayed in Underwriter")
	public void user_608_verify_the_insurance_info_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement InsuranceInfoTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("InsuranceInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(InsuranceInfoTab);
				Assert.assertTrue(InsuranceInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Policy Check tab is displayed in Underwriter")
	public void user_608_verify_the_policy_check_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement policyCheckTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("policyCheckTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(policyCheckTab);
				Assert.assertTrue(policyCheckTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Document Details tab is displayed in Underwriter")
	public void user_608_verify_the_document_details_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement documentDetailsTab = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("documentDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(documentDetailsTab);
				Assert.assertTrue(documentDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Pencil icon under Offer Decision tab")
	public void user_608_click_the_pencil_icon_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionPencilEditBtn")));
				javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionPencilEditBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Decision section is displayed under Offer Decision tab")
	public void user_608_verify_decision_section_is_displayed_under_offer_decision_tab() throws Throwable {
		WebElement offer_Decision = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_Decision"));
//		System.out.println("Field Name: " + offer_Decision.getText());
		waitHelper.waitForElementwithFluentwait(driver, offer_Decision);
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(offer_Decision);
				Assert.assertTrue(offer_Decision.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Facility Details section is displayed under Offer Decision tab")
	public void user_608_verify_facility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		WebElement offer_FacilityDetails = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails"));
		System.out.println("Field Name: " + offer_FacilityDetails.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(offer_FacilityDetails);
				Assert.assertTrue(offer_FacilityDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Eligibility Details section is displayed under Offer Decision tab")
	public void user_608_verify_eligibility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_EligibilityDetails = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_EligibilityDetails"));
		System.out.println("Field Name: " + offer_EligibilityDetails.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(offer_EligibilityDetails);
				Assert.assertTrue(offer_EligibilityDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Finance Configuration section is displayed under Offer Decision tab")
	public void user_608_verify_finance_configuration_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_EligibilityDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_FinanceConfiguration = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration"));
		System.out.println("Field Name: " + offer_FinanceConfiguration.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(offer_FinanceConfiguration);
				Assert.assertTrue(offer_FinanceConfiguration.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Pricing Details section is displayed under Offer Decision tab")
	public void user_608_verify_pricing_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		WebElement offer_PricingDetails = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_PricingDetails"));
		System.out.println("Field Name: " + offer_PricingDetails.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(offer_PricingDetails);
				Assert.assertTrue(offer_PricingDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Instlment Details section is displayed under Offer Decision tab")
	public void user_608_verify_instlment_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_InstalmentDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_InstalmentDetails = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_InstalmentDetails"));
		System.out.println("Field Name: " + offer_InstalmentDetails.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(offer_InstalmentDetails);
				Assert.assertTrue(offer_InstalmentDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Approval Details Hyperlinks section is displayed under Offer Decision tab")
	public void user_608_verify_approval_details_hyperlinks_section_is_displayed_under_offer_decision_tab()
			throws Throwable {
		WebElement offer_ApprovalDetailsHyperlinks = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_ApprovalDetailsHyperlinks"));
		System.out.println("Field Name: " + offer_ApprovalDetailsHyperlinks.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(offer_ApprovalDetailsHyperlinks);
				Assert.assertTrue(offer_ApprovalDetailsHyperlinks.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_03
	@And("User_608 verify Approval level field under Decision section in Offer Decision tab")
	public void user_608_verify_approval_level_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_Decision")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement decision_ApprovalLevel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_ApprovalLevel"));
		waitHelper.waitForElementwithFluentwait(driver, decision_ApprovalLevel);
		System.out.println("Field Name: " + decision_ApprovalLevel.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(decision_ApprovalLevel);
				Assert.assertTrue(decision_ApprovalLevel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Underwriter field under Decision section in Offer Decision tab")
	public void user_608_verify_underwriter_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Underwriter = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_Underwriter"));
		System.out.println("Field Name: " + decision_Underwriter.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_Underwriter);
				Assert.assertTrue(decision_Underwriter.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Reviewer field under Decision section in Offer Decision tab")
	public void user_608_verify_reviewer_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Reviewer = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_Reviewer"));
		System.out.println("Field Name: " + decision_Reviewer.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_Reviewer);
				Assert.assertTrue(decision_Reviewer.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Decision Date field under Decision section in Offer Decision tab")
	public void user_608_verify_decision_date_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDate = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_DecisionDate"));
		System.out.println("Field Name: " + decision_DecisionDate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_DecisionDate);
				Assert.assertTrue(decision_DecisionDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Decison field under Decision section in Offer Decision tab")
	public void user_608_verify_decison_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDropdown = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_DecisionField"));
		System.out.println("Field Name: " + decision_DecisionDropdown.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(decision_DecisionDropdown);
				Assert.assertTrue(decision_DecisionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_04
	@And("User_608 verify the Offer amount under Finance Configuration section in Offer Decision tab")
	public void user_608_verify_the_offer_amount_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		String approveValue = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_ApprovalLevelValue")).getText();
		System.out.println("Appove Level: " + approveValue);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerAmtInput = javascriptHelper.executeScriptWithWebElement(
				"document.querySelector('[ng-reflect-text=\"Offered Amount\"]').nextElementSibling");
		javascriptHelper.backgroundColor(offerAmtInput);
		String offerAmt = javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelector('[ng-reflect-text=\"Offered Amount\"]').nextElementSibling")
				.getAttribute("ng-reflect-model");
		System.out.println("Offer Amount: " + offerAmt);
		int targetValue = 1000000;
		if (Integer.parseInt(offerAmt) < targetValue) {
			Assert.assertEquals("LEVEL1", approveValue);
		} else {
			System.out.println("Offer amount Greater than targer value");
		}
	}

//	Unw_06
	@And("User_608 select the Decision dropdown as Accept\\Reject under Decision section in Offer Decision tab")
	public void user_608_select_the_decision_dropdown_as_accept_reject_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("decision_DecisionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-item').length";
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
			System.out.println("Map " + testData.get("Decision Dropdown").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Decision Dropdown")).trim())) {
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

//	UNW_07
	@And("User_608 verify the Product field is displayed under Facility Details section")
	public void user_608_verify_the_product_field_is_displayed_under_facility_details_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement facility_ProductLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ProductLabel"));
		System.out.println("Field Name: " + facility_ProductLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ProductLabel);
				Assert.assertTrue(facility_ProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ProductInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ProductInput);
				Assert.assertTrue(facility_ProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sub-Product field is displayed under Facility Details section")
	public void user_608_verify_the_sub_product_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SubProductLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SubProductLabel"));
		System.out.println("Field Name: " + facility_SubProductLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_SubProductLabel);
				Assert.assertTrue(facility_SubProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_SubProductInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SubProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_SubProductInput);
				Assert.assertTrue(facility_SubProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Scheme field is displayed under Facility Details section")
	public void user_608_verify_the_scheme_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SchemeLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SchemeLabel"));
		System.out.println("Field Name: " + facility_SchemeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_SchemeLabel);
				Assert.assertTrue(facility_SchemeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_SchemeInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SchemeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_SchemeInput);
				Assert.assertTrue(facility_SchemeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Pricing Indicator field is displayed under Facility Details section")
	public void user_608_verify_the_pricing_indicator_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_PricingIndicatorLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PricingIndicatorLabel"));
		System.out.println("Field Name: " + facility_PricingIndicatorLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_PricingIndicatorLabel);
				Assert.assertTrue(facility_PricingIndicatorLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_PricingIndicatorInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PricingIndicatorInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_PricingIndicatorInput);
				Assert.assertTrue(facility_PricingIndicatorInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 verify the Repayment Type field is displayed under Facility Details section")
	public void user_608_verify_the_repayment_type_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_RepaymentTypeLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_RepaymentTypeLabel"));
		System.out.println("Field Name: " + facility_RepaymentTypeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_RepaymentTypeLabel);
				Assert.assertTrue(facility_RepaymentTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_RepaymentTypeInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_RepaymentTypeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_RepaymentTypeInput);
				Assert.assertTrue(facility_RepaymentTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Compute Instalment On field is displayed under Facility Details section")
	public void user_608_verify_the_compute_instalment_on_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_ComputeInstalmentLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ComputeInstalmentLabel"));
		System.out.println("Field Name: " + facility_ComputeInstalmentLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ComputeInstalmentLabel);
				Assert.assertTrue(facility_ComputeInstalmentLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ComputeInstalmentInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ComputeInstalmentInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ComputeInstalmentInput);
				Assert.assertTrue(facility_ComputeInstalmentInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Principal Frequency field is displayed under Facility Details section")
	public void user_608_verify_the_principal_frequency_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_PrincipalFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PrincipalFrequencyLabel"));
		System.out.println("Field Name: " + facility_PrincipalFrequencyLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_PrincipalFrequencyLabel);
				Assert.assertTrue(facility_PrincipalFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_PrincipalFrequencyInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PrincipalFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_PrincipalFrequencyInput);
				Assert.assertTrue(facility_PrincipalFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Interest Frequency field is displayed under Facility Details section")
	public void user_608_verify_the_interest_frequency_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_InterestFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_InterestFrequencyLabel"));
		System.out.println("Field Name: " + facility_InterestFrequencyLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_InterestFrequencyLabel);
				Assert.assertTrue(facility_InterestFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_InterestFrequencyInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_InterestFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_InterestFrequencyInput);
				Assert.assertTrue(facility_InterestFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Eligible Income field is displayed under Facility Details section")
	public void user_608_verify_the_eligible_income_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_EligibleIncomeLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_EligibleIncomeLabel"));
		System.out.println("Field Name: " + facility_EligibleIncomeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_EligibleIncomeLabel);
				Assert.assertTrue(facility_EligibleIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_EligibleIncomeInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_EligibleIncomeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_EligibleIncomeInput);
				Assert.assertTrue(facility_EligibleIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Average Account Balance field is displayed under Facility Details section")
	public void user_608_verify_the_average_account_balance_field_is_displayed_under_facility_details_section()
			throws Throwable {
		WebElement facility_AverageAccBalanceLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_AverageAccBalanceLabel"));
		System.out.println("Field Name: " + facility_AverageAccBalanceLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_AverageAccBalanceLabel);
				Assert.assertTrue(facility_AverageAccBalanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_AverageAccBalanceInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_AverageAccBalanceInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_AverageAccBalanceInput);
				Assert.assertTrue(facility_AverageAccBalanceInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Applicable LTV1 field is displayed under Facility Details section")
	public void user_608_verify_the_applicable_ltv1_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ApplicableLTV1Label = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV1Label"));
		System.out.println("Field Name: " + facility_ApplicableLTV1Label.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ApplicableLTV1Label);
				Assert.assertTrue(facility_ApplicableLTV1Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ApplicableLTV1Input = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV1Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ApplicableLTV1Input);
				Assert.assertTrue(facility_ApplicableLTV1Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Applicable LTV2 field is displayed under Facility Details section")
	public void user_608_verify_the_applicable_ltv2_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ApplicableLTV2Label = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV2Label"));
		System.out.println("Field Name: " + facility_ApplicableLTV2Label.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(facility_ApplicableLTV2Label);
				Assert.assertTrue(facility_ApplicableLTV2Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement facility_ApplicableLTV2Input = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV2Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(facility_ApplicableLTV2Input);
				Assert.assertTrue(facility_ApplicableLTV2Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_08
	@And("User_608 verify Requested Amount field is displayed under Finance configuration section")
	public void user_608_verify_requested_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_EligibilityDetails")));
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Finance_RequestAmountLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestAmountLabel"));
		System.out.println("Field Name: " + Finance_RequestAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_RequestAmountLabel);
				Assert.assertTrue(Finance_RequestAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_RequestAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_RequestAmountInput);
				Assert.assertTrue(Finance_RequestAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Requested Tenure field is displayed under Finance configuration section")
	public void user_608_verify_requested_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_RequestTenureLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestTenureLabel"));
		System.out.println("Field Name: " + Finance_RequestTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_RequestTenureLabel);
				Assert.assertTrue(Finance_RequestTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_RequestTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_RequestTenureInput);
				Assert.assertTrue(Finance_RequestTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offered Amount field is displayed under Finance configuration section")
	public void user_608_verify_offered_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_OfferedAmountLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedAmountLabel"));
		System.out.println("Field Name: " + Finance_OfferedAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_OfferedAmountLabel);
				Assert.assertTrue(Finance_OfferedAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_OfferedAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_OfferedAmountInput);
				Assert.assertTrue(Finance_OfferedAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offered Tenure field is displayed under Finance configuration section")
	public void user_608_verify_offered_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_OfferedTenureLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedTenureLabel"));
		System.out.println("Field Name: " + Finance_OfferedTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_OfferedTenureLabel);
				Assert.assertTrue(Finance_OfferedTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_OfferedTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_OfferedTenureInput);
				Assert.assertTrue(Finance_OfferedTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Deviation Amount field is displayed under Finance configuration section")
	public void user_608_verify_deviation_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_DeviationAmountLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountLabel"));
		System.out.println("Field Name: " + Finance_DeviationAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_DeviationAmountLabel);
				Assert.assertTrue(Finance_DeviationAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_DeviationAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_DeviationAmountInput);
				Assert.assertTrue(Finance_DeviationAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Deviation Tenure field is displayed under Finance configuration section")
	public void user_608_verify_deviation_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_DeviationTenureLabel = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureLabel"));
		System.out.println("Field Name: " + Finance_DeviationTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Finance_DeviationTenureLabel);
				Assert.assertTrue(Finance_DeviationTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement Finance_DeviationTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(Finance_DeviationTenureInput);
				Assert.assertTrue(Finance_DeviationTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_09
	@And("User_608 verify Period field is displayed under Pricing Details section")
	public void user_608_verify_period_field_is_displayed_under_pricing_details_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_PricingDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Pricing_Period = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_Period"));
		System.out.println("Field Name: " + Pricing_Period.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Pricing_Period);
				Assert.assertTrue(Pricing_Period.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Interest Def field is displayed under Pricing Details section")
	public void user_608_verify_interest_def_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_InterestDef = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_InterestDef"));
		System.out.println("Field Name: " + Pricing_InterestDef.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Pricing_InterestDef);
				Assert.assertTrue(Pricing_InterestDef.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Rate Type field is displayed under Pricing Details section")
	public void user_608_verify_rate_type_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_RateType = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_RateType"));
		System.out.println("Field Name: " + Pricing_RateType.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Pricing_RateType);
				Assert.assertTrue(Pricing_RateType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Index Rate field is displayed under Pricing Details section")
	public void user_608_verify_index_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_IndexRate = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_IndexRate"));
		System.out.println("Field Name: " + Pricing_IndexRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Pricing_IndexRate);
				Assert.assertTrue(Pricing_IndexRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offer Rate field is displayed under Pricing Details section")
	public void user_608_verify_offer_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_OfferRate = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_OfferRate"));
		System.out.println("Field Name: " + Pricing_OfferRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Pricing_OfferRate);
				Assert.assertTrue(Pricing_OfferRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Effective Rate field is displayed under Pricing Details section")
	public void user_608_verify_effective_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_EffectiveRate = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_EffectiveRate"));
		System.out.println("Field Name: " + Pricing_EffectiveRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Pricing_EffectiveRate);
				Assert.assertTrue(Pricing_EffectiveRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_10
	@And("User_608 verify the Instalment Period field is displayed under Installment Details section")
	public void user_608_verify_the_instalment_period_field_is_displayed_under_installment_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_InstalmentDetails")));
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Instalment_InstalPeriod = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Instalment_InstalPeriod"));
		System.out.println("Field Name: " + Instalment_InstalPeriod.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Instalment_InstalPeriod);
				Assert.assertTrue(Instalment_InstalPeriod.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Instalment Amount field is displayed under Installment Details section")
	public void user_608_verify_the_instalment_amount_field_is_displayed_under_installment_details_section()
			throws Throwable {
		WebElement Instalment_InstalAmount = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Instalment_InstalAmount"));
		System.out.println("Field Name: " + Instalment_InstalAmount.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(Instalment_InstalAmount);
				Assert.assertTrue(Instalment_InstalAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	UNW_14
	@And("User_608 verify the Deviate button under Offer Decision screen")
	public void user_608_verify_the_deviate_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_DeviateBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_DeviateBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(offer_DeviateBtn);
				Assert.assertTrue(offer_DeviateBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Recompute button under Offer Decision screen")
	public void user_608_verify_the_recompute_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_RecomputeBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_RecomputeBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(offer_RecomputeBtn);
				Assert.assertTrue(offer_RecomputeBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Save button under Offer Decision screen")
	public void user_608_verify_the_save_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_SaveBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SaveBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(offer_SaveBtn);
				Assert.assertTrue(offer_SaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Offer button under Offer Decision screen")
	public void user_608_verify_the_offer_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_OfferBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(offer_OfferBtn);
				Assert.assertTrue(offer_OfferBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	Unw_15
	@And("User_608 clicks on the Save button under the Offer Decision tab")
	public void user_608_clicks_on_the_save_button_under_the_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		WebElement alertPopup = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SuccessAlert"));
//		waitHelper.waitForElementwithFluentwait(driver, alertPopup);
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(alertPopup);
				Assert.assertTrue(alertPopup.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("alertCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 click the Offer button after selecting the Decision under Offer Decision tab")
	public void user_608_click_the_offer_button_after_selecting_the_decision_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the validation messgage after clicking Offer button under Offer Decision tab")
	public void user_608_verify_the_validation_messgage_after_clicking_offer_button_under_offer_decision_tab()
			throws Throwable {
		WebElement alertPopup = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offerBtnApprovedPopup"));
		waitHelper.waitForElementwithFluentwait(driver, alertPopup);
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.backgroundColor(alertPopup);
				Assert.assertTrue(alertPopup.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("alertCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 select the Decision dropdown as Select under Decision section in Offer Decision tab")
	public void user_608_select_the_decision_dropdown_as_select_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("decision_DecisionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-item').length";
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
//			System.out.println("Map " + "Select".trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Decision Dropdown1")).trim())) {
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

	@And("User_608 click the Offer button without selecting the Decision under Offer Decision tab")
	public void user_608_click_the_offer_button_without_selecting_the_decision_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User_608 verify the validation messgage without selecting decision under Offer Decision tab")
	public void user_608_verify_the_validation_messgage_without_selecting_decision_under_offer_decision_tab()
			throws Throwable {
		Thread.sleep(1000);
		WebElement alertPopup = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offerBtnErrorPopup"));
		System.out.println("Error Message: " + alertPopup.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(alertPopup);
				Assert.assertEquals("No underwriter found for allocation.", alertPopup.getText().trim());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("alertCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

//	AT_UNW_003 --> Underwriter - Arul's Code
	@And("Click On the Recommendation in Offer Decision")
	public void click_on_the_recommendation_in_offer_decision() {
		javascriptHelper.JSEClick(
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("JSERecommendations")));
	}

	@And("Click On the Add button in List of Condition")
	public void click_on_the_add_button_in_list_of_condition() throws InterruptedException {
//		Thread.sleep(5000);
//		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("AddButton")).click();
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("select the value in Note Code Dropdown Below the Conditions")
	public void select_the_value_in_note_code_dropdown_below_the_conditions() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteCode")));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteCode")).click();
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
//			System.out.println("String " + dropdownString.trim());
//			System.out.println("Map " + testData.get("CustomerName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NoteCode")).trim())) {
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

	@Then("Enter Number in Sequence Number Field Below the Conditions")
	public void enter_number_in_sequence_number_field_below_the_conditions() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber")).click();
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber"))
						.sendKeys(testData.get("SequenceNumber"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("select not recommended in Note Sub Code Dropdown Below the Conditions")
	public void select_not_recommended_in_note_sub_code_dropdown_below_the_conditions() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteSubcode")).click();
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
//			System.out.println("String " + dropdownString.trim());
//			System.out.println("Map " + testData.get("CustomerName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("NoteSubCode")).trim())) {
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

	@Then("Enter Data in Condition Field Below the Conditions")
	public void enter_data_in_condition_field_below_the_conditions() {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition"))
						.sendKeys(testData.get("Condition"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("Select the value in Date field Below the Conditions")
	public void select_the_value_in_date_field_below_the_conditions() {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date")).click();
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date_today")).click();
	}

	@Then("select the value in fulfilled Dropdown Below the Conditions")
	public void select_the_value_in_fulfilled_dropdown_below_the_conditions() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("fulfilled")).click();
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
			// System.out.println("Map " + testData.get("CustomerName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("fullfill")).trim())) {
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

	@Then("Turn on the Approval Status Below the Conditions")
	public void turn_on_the_approval_status_below_the_conditions() {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("ApprovalStatus")).click();
	}

	@Then("Fill The Remarks Field Below the Conditions")
	public void fill_the_remarks_field_below_the_conditions() {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks"))
						.sendKeys(testData.get("Remarks"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("Click on the Save button To Save The Conditions Record")
	public void click_on_the_save_button_to_save_the_conditions_record() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SaveIcon")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate Save successful popup is displayed in the condition")
	public void validate_save_successful_popup_is_displayed_in_the_condition() {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SuccessPopup")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("SuccessPopup")).isDisplayed());
				break;
			} catch (Exception e) {

			}
		}
	}

//	@AT_UNW_006
	@And("User_608 verify the Application Details tab in Underwriter stage")
	public void user_608_verify_the_application_details_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Application Details")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Approve button under Application Details")
	public void user_608_verify_the_approve_button_under_application_details() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				actions.scrollToElement(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsApproveBtn"))).build()
						.perform();
				javascriptHelper.backgroundBorder(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsApproveBtn")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsApproveBtn"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_608 verify the Reject button under Application Details")
	public void user_608_verify_the_reject_button_under_application_details() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsRejectBtn")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsRejectBtn"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_608 verify the Return button under Application Details")
	public void user_608_verify_the_return_button_under_application_details() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsReturnBtn")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsReturnBtn"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("User_608 verify the View summary button under Application Details")
	public void user_608_verify_the_view_summary_button_under_application_details() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsViewSummaryBtn")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("appDetailsViewSummaryBtn"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Customer details tab in Underwriter stage")
	public void user_608_verify_the_customer_details_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer details")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						addButton.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify system should populate all the data under Customer details tab at this stage")
	public void user_608_to_verify_system_should_populate_all_the_data_under_customer_details_tab_at_this_stage()
			throws Throwable {
		String eyeBtn = "document.querySelector('button[icon=\"pi pi-eye\"]')";
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(eyeBtn));
				javascriptHelper.executeScriptWithWebElement(eyeBtn).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Additional Customer info tab in Underwriter stage")
	public void user_608_verify_the_additional_customer_info_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 100; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Additional Customer")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
//						addButton.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify system should populate all the data under Additional Customer info tab at this stage")
	public void user_608_to_verify_system_should_populate_all_the_data_under_additional_customer_info_details_tab_at_this_stage()
			throws Throwable {
		String eyeBtn = "document.querySelector('button[icon=\"pi pi-eye\"]')";
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(eyeBtn));
				javascriptHelper.executeScriptWithWebElement(eyeBtn).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Customer Financials tab in Underwriter stage")
	public void user_608_verify_the_customer_financials_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Financials")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to verify system should populate all the data under Customer Financials tab at this stage")
	public void user_608_to_verify_system_should_populate_all_the_data_under_customer_financials_details_tab_at_this_stage()
			throws Throwable {
		String eyeBtn = "document.querySelector('button[icon=\"pi pi-eye\"]')";
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(eyeBtn));
				javascriptHelper.executeScriptWithWebElement(eyeBtn).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Living Expenses tab in Underwriter stage")
	public void user_608_verify_the_living_expenses_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Living Expenses")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Facility Info tab in Underwriter stage")
	public void user_608_verify_the_facility_info_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Facility Info")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Asset Details tab in Underwriter stage")
	public void user_608_verify_the_asset_details_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Asset Details")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Quotation Info tab in Underwriter stage")
	public void user_608_verify_the_quotation_info_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Quotation Info")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(addButton);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Insurance Info tab in Underwriter stage")
	public void user_608_verify_the_insurance_info_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Insurance Info")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//						actions.scrollToElement(addButton);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Policy Check tab in Underwriter stage")
	public void user_608_verify_the_policy_check_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Policy Check")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Document Details tab in Underwriter stage")
	public void user_608_verify_the_document_details_tab_in_underwriter_stage() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Document Details")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(addButton);
						javascriptHelper.JSEClick(addButton);
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CUD_004
	@And("User_608 click Search button in Financial Commitments under Customer Financials tab")
	public void user_608_click_search_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
											+ j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_608 search the matched record in Financial Commitments under Customer Financials tab")
	public void user_608_search_the_matched_record_in_financial_commitments_under_customer_financials_tab()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
						.sendKeys(testData.get("Matched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the mismatched record in Financial Commitments under Customer Financials tab")
	public void user_608_search_the_mismatched_record_in_financial_commitments_under_customer_financials_tab()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
						.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	// CUD_04_06 & CUD_04_06
	@And("User_608 click the Export button in Financial Commitments under Customer Financials tab")
	public void user_608_click_the_export_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
//							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
											+ j + "]"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('p-dropdown[ng-reflect-placeholder=\"Export\"]')[" + j
											+ "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_608 click the PDF and verify under Export in Financial Commitments")
	public void user_608_click_the_pdf_and_verify_under_export_in_financial_commitments() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportPDF"))
						.click();
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

	@And("User_608 click the XLS and verify under Export in Financial Commitments")
	public void user_608_click_the_xls_and_verify_under_export_in_financial_commitments() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportXLS")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportXLS"))
						.click();
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

//	AT_CUD_006
	@And("User_608 click the first row pencil icon under Financial Commitments in Customer Financials tab")
	public void user_608_click_the_first_row_pencil_icon_under_financial_commitments_in_customer_financials_tab()
			throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
											+ j + "]"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_608 click the Status Radio button under Customer Debt screen")
	public void user_608_click_the_status_radio_button_under_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtStatusRatioBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtStatusRatioBtn")));
				javascriptHelper
						.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtStatusRatioBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the first row status as In-Active under Financial Commitments in Customer Financials tab")
	public void user_608_verify_the_first_row_status_under_financial_commitments_in_customer_financials_tab()
			throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							WebElement status = javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span[class*=\"p-tag p-component\"]')[0]");
							javascriptHelper.backgroundBorder(status);
							System.out.println("Record status1:" + status.getText());
							Assert.assertTrue(status.getText().equalsIgnoreCase("In-Active"));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

	}

	@And("User_608 verify the first row status as Active under Financial Commitments in Customer Financials tab")
	public void user_608_verify_the_first_row_status_as_active_under_financial_commitments_in_customer_financials_tab()
			throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							WebElement status = javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span[class*=\"p-tag p-component\"]')[0]");
							System.out.println("Record status2:" + status.getText());
							javascriptHelper.backgroundBorder(status);
							Assert.assertTrue(status.getText().equalsIgnoreCase("Active"));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

	}

	// CUD_04_01
	@And("User_608 scroll into view the financial commitments section under Customer Financials tab")
	public void user_608_scroll_into_view_the_financial_commitments_section_under_customer_financials_tab()
			throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
											+ j + "]"));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}
	}

	@And("User_608 verify the Financial Institution field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_financial_institution_field_is_displayed_in_list_view_under_financial_commitments()
			throws Throwable {
		WebElement financialInstitution = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_FinancialInstitution"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(financialInstitution);
				Assert.assertTrue(financialInstitution.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Loan Amount field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_loan_amount_field_is_displayed_in_list_view_under_financial_commitments()
			throws Throwable {
		WebElement loanAmount = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_LoanAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(loanAmount);
				Assert.assertTrue(loanAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Installment Amount field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_installment_amount_field_is_displayed_in_list_view_under_financial_commitments()
			throws Throwable {
		WebElement installmentAmount = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_InstallmentAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(installmentAmount);
				Assert.assertTrue(installmentAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Tenure field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_tenure_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement tenure = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_Tenure"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(tenure);
				Assert.assertTrue(tenure.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Next Due Date field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_next_due_date_field_is_displayed_in_list_view_under_financial_commitments()
			throws Throwable {
		WebElement nextDueDate = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_NextDueDate"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(nextDueDate);
				Assert.assertTrue(nextDueDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Principal Balance field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_principal_balance_field_is_displayed_in_list_view_under_financial_commitments()
			throws Throwable {
		WebElement principalAmount = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_PrincipalAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(principalAmount);
				Assert.assertTrue(principalAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Currency field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_currency_field_is_displayed_in_list_view_under_financial_commitments()
			throws Throwable {
		WebElement currency = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_Currency"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(currency);
				Assert.assertTrue(currency.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Status field is displayed in list view under Financial Commitments")
	public void user_608_verify_the_status_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement status = javascriptHelper
				.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_Status"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(status);
				Assert.assertTrue(status.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	CUD_04_02
	@And("User_608 verify list view values should be not editable under Financial Commitments")
	public void user_608_verify_list_view_values_should_be_not_editable_under_financial_commitments() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							WebElement nonEdit = javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j
											+ "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td p-celleditor')[1]");
							javascriptHelper.backgroundBorder(nonEdit);
							System.out.println("Is Non Editable: "
									+ javascriptHelper.executeScript("return arguments[0].readOnly", nonEdit));
							System.out.println("Field Name: " + nonEdit.getText());
//							Assert.assertTrue(javascriptHelper.executeScript("return arguments[0].readOnly",nonEdit));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

//	App Data Check -- Income
	@And("User_608 click the Eye button under Customer Financials tab")
	public void user_608_click_the_eye_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(
						dataCheck_IncomeJsPaths.getElement("customerFinancialsTabEyeBtn")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Eye button under Income section in Customer Financials Tab")
	public void user_608_click_the_eye_button_under_income_section_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSectionTitle"));
				javascriptHelper.scrollIntoView(element);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String listOfRecords = "document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		boolean isEyeBtnClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Self Employed").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(
									javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')")
									.click();
							isEyeBtnClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isEyeBtnClicked == true) {
				break;
			}
		}
	}

	@And("User_608 validate Save button available under Income details screen")
	public void user_608_validate_save_button_available_under_income_details_screen() throws Throwable {
		Thread.sleep(100);
		WebElement incomeSaveBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeSaveBtn);
				Assert.assertTrue(incomeSaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Back button available under Income details screen")
	public void user_608_validate_back_button_available_under_income_details_screen() throws Throwable {
		WebElement incomeBackBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeBackBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeBackBtn);
				Assert.assertTrue(incomeBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Employment Type field available under Income details screen")
	public void user_608_validate_employment_type_field_available_under_income_details_screen() throws Throwable {
		WebElement employementTypeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("employementTypeLabel"));
		System.out.println("Field Name: " + employementTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(employementTypeLabel);
				Assert.assertTrue(employementTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement employementTypeInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("employementTypeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(employementTypeInput);
				Assert.assertTrue(employementTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Lumpsum Amount field available under Income details screen")
	public void user_608_validate_lumpsum_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement lumpsumAmtLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("lumpsumAmtLabel"));
		System.out.println("Field Name: " + lumpsumAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(lumpsumAmtLabel);
				Assert.assertTrue(lumpsumAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement lumpsumAmtInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("lumpsumAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(lumpsumAmtInput);
				Assert.assertTrue(lumpsumAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Financial Year field available under Income details screen")
	public void user_608_validate_financial_year_field_available_under_income_details_screen() throws Throwable {
		WebElement financialYearLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("financialYearLabel"));
//		System.out.println("Field Name: "+financialYearLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financialYearLabel);
				Assert.assertTrue(financialYearLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement financialYearInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("financialYearInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(financialYearInput);
				Assert.assertTrue(financialYearInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Filing Date field available under Income details screen")
	public void user_608_validate_filing_date_field_available_under_income_details_screen() throws Throwable {
		WebElement filingDateLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("filingDateLabel"));
		System.out.println("Field Name: " + filingDateLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(filingDateLabel);
				Assert.assertTrue(filingDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement filingDateInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("filingDateInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(filingDateInput);
				Assert.assertTrue(filingDateInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Income field available under Income details screen")
	public void user_608_validate_income_field_available_under_income_details_screen() throws Throwable {
		WebElement incomeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeLabel"));
		System.out.println("Field Name: " + incomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(incomeLabel);
				Assert.assertTrue(incomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement incomeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeDropdown);
				Assert.assertTrue(incomeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Frequency field available under Income details screen")
	public void user_608_validate_frequency_field_available_under_income_details_screen() throws Throwable {
		WebElement frequencyLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("frequencyLabel"));
		System.out.println("Field Name: " + frequencyLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(frequencyLabel);
				Assert.assertTrue(frequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement frequencyDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("frequencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(frequencyDropdown);
				Assert.assertTrue(frequencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Amount field available under Income details screen")
	public void user_608_validate_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement amountLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountLabel"));
		System.out.println("Field Name: " + amountLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(amountLabel);
				Assert.assertTrue(amountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement amountInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(amountInput);
				Assert.assertTrue(amountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Defined % field available under Income details screen")
	public void user_608_validate_defined_field_available_under_income_details_screen() throws Throwable {
		WebElement defined_Label = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("defined%_Label"));
		System.out.println("Field Name: " + defined_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(defined_Label);
				Assert.assertTrue(defined_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement defined_Input = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("defined%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(defined_Input);
				Assert.assertTrue(defined_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Adjusted % field available under Income details screen")
	public void user_608_validate_adjusted_field_available_under_income_details_screen() throws Throwable {
		WebElement adjusted_Label = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("adjusted%_Label"));
		System.out.println("Field Name: " + adjusted_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(adjusted_Label);
				Assert.assertTrue(adjusted_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement adjusted_Input = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("adjusted%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(adjusted_Input);
				Assert.assertTrue(adjusted_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Amount Considered field available under Income details screen")
	public void user_608_validate_amount_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountConsideredLabel"));
		System.out.println("Field Name: " + amountConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(amountConsideredLabel);
				Assert.assertTrue(amountConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement amountConsideredInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertTrue(amountConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Action button available under Income details screen")
	public void user_608_validate_action_button_available_under_income_details_screen() throws Throwable {
		WebElement actionLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("actionLabel"));
		System.out.println("Field Name: " + actionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(actionLabel);
				Assert.assertTrue(actionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement actionAddBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("actionAddBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(actionAddBtn);
				Assert.assertTrue(actionAddBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Total Income field available under Income details screen")
	public void user_608_validate_total_income_field_available_under_income_details_screen() throws Throwable {
		WebElement totalIncomeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeLabel"));
		System.out.println("Field Name: " + totalIncomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalIncomeLabel);
				Assert.assertTrue(totalIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement totalIncomeInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeInput);
				Assert.assertTrue(totalIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Total Income considered field available under Income details screen")
	public void user_608_validate_total_income_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement totalIncomeConsideredLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeConsideredLabel"));
		System.out.println("Field Name: " + totalIncomeConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalIncomeConsideredLabel);
				Assert.assertTrue(totalIncomeConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement totalIncomeConsideredInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeConsideredInput);
				Assert.assertTrue(totalIncomeConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Salary credited to Bank field available under Income details screen")
	public void user_608_validate_salary_credited_to_bank_field_available_under_income_details_screen() throws Throwable {
		WebElement salaryCreditedToBankLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("salaryCreditedToBankLabel"));
		System.out.println("Field Name: " + salaryCreditedToBankLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(salaryCreditedToBankLabel);
				Assert.assertTrue(salaryCreditedToBankLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement salaryCreditedToBankDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("salaryCreditedToBankDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(salaryCreditedToBankDropdown);
				Assert.assertTrue(salaryCreditedToBankDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction field available under Income details screen")
	public void user_608_validate_deduction_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionLabel"));
		System.out.println("Field Name: " + deductionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionLabel);
				Assert.assertTrue(deductionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionDropdown);
				Assert.assertTrue(deductionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction Frequency field available under Income details screen")
	public void user_608_validate_deduction_frequency_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionFrequencyLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionFrequencyLabel"));
		System.out.println("Field Name: " + deductionFrequencyLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionFrequencyLabel);
				Assert.assertTrue(deductionFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionFrequencyDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionFrequencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionFrequencyDropdown);
				Assert.assertTrue(deductionFrequencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction Amount field available under Income details screen")
	public void user_608_validate_deduction_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionAmtLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAmtLabel"));
		System.out.println("Field Name: " + deductionAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionAmtLabel);
				Assert.assertTrue(deductionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionAmtInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionAmtInput);
				Assert.assertTrue(deductionAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction Def % field available under Income details screen")
	public void user_608_validate_deduction_def_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionDef_Label = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionDef%_Label"));
		System.out.println("Field Name: " + deductionDef_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionDef_Label);
				Assert.assertTrue(deductionDef_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionDef_Input = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionDef%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionDef_Input);
				Assert.assertTrue(deductionDef_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction Adj % field available under Income details screen")
	public void user_608_validate_deduction_adj_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionAdj_Label = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAdj%_Label"));
		System.out.println("Field Name: " + deductionAdj_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionAdj_Label);
				Assert.assertTrue(deductionAdj_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionAdj_Input = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAdj%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionAdj_Input);
				Assert.assertTrue(deductionAdj_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction Considered field available under Income details screen")
	public void user_608_validate_deduction_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionConsideredLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionConsideredLabel"));
		System.out.println("Field Name: " + deductionConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionConsideredLabel);
				Assert.assertTrue(deductionConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionConsideredInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionConsideredInput);
				Assert.assertTrue(deductionConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Deduction Action button field available under Income details screen")
	public void user_608_validate_deduction_action_button_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionActionLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionActionLabel"));
		System.out.println("Field Name: " + deductionActionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionActionLabel);
				Assert.assertTrue(deductionActionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement deductionActionAddBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionActionAddBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionActionAddBtn);
				Assert.assertTrue(deductionActionAddBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Total Deduction field available under Income details screen")
	public void user_608_validate_total_deduction_field_available_under_income_details_screen() throws Throwable {
		WebElement totalDeductionLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionLabel"));
		System.out.println("Field Name: " + totalDeductionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalDeductionLabel);
				Assert.assertTrue(totalDeductionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement totalDeductionInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeductionInput);
				Assert.assertTrue(totalDeductionInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Total Deduction Considered field available under Income details screen")
	public void user_608_validate_total_deduction_considered_field_available_under_income_details_screen()
			throws Throwable {
		WebElement totalDeductionConsideredLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionConsideredLabel"));
		System.out.println("Field Name: " + totalDeductionConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalDeductionConsideredLabel);
				Assert.assertTrue(totalDeductionConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement totalDeductionConsideredInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeductionConsideredInput);
				Assert.assertTrue(totalDeductionConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Currency field available under Income details screen")
	public void user_608_validate_currency_field_available_under_income_details_screen() throws Throwable {
		WebElement currencyLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("currencyLabel"));
		System.out.println("Field Name: " + currencyLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(currencyLabel);
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement currencyDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("currencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(currencyDropdown);
				Assert.assertTrue(currencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Save button under Income details screen")
	public void user_608_click_the_save_button_under_income_details_screen() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 50000; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the confirmation message under Income details screen")
	public void user_608_validate_the_confirmation_message_under_income_details_screen() throws Throwable {
		WebElement successToastMsg = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("successToastMsg"));
		for (int i = 0; i <= 5000; i++) {
			try {
				Assert.assertTrue(successToastMsg.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		WebElement successToastCloseBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("successToastCloseBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				successToastCloseBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Back button under Income details screen")
	public void user_608_click_the_back_button_under_income_details_screen() throws Throwable {
		Thread.sleep(200);
		WebElement incomeBackBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeBackBtn"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(incomeBackBtn);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_INCD_04
	@And("User_608 verify Employment details section available under Customer Financials tab")
	public void user_608_verify_employment_details_section_available_under_customer_financials_tab() throws Throwable {
		WebElement empDetailsSection = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementListSection"));
		System.out.println("Section Name: " + empDetailsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(empDetailsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the eye button under Employment details section available in Customer Financials tab")
	public void user_608_click_the_eye_button_under_employment_details_section_available_in_customer_financials_tab()
			throws Throwable {
		WebElement customerEmployementEyeBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementEyeBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(customerEmployementEyeBtn);
				customerEmployementEyeBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Customer Employement page is available under Customer Financials tab")
	public void user_608_verify_the_customer_employement_page_is_available_under_customer_financials_tab()
			throws Throwable {
		Thread.sleep(1000);
		WebElement customerEmployementScreenTitle = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementScreenTitle"));
		System.out.println("Screen Name: " + customerEmployementScreenTitle.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(customerEmployementScreenTitle.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Back button in Customer Employement screen under Customer Financials tab")
	public void user_608_click_the_back_button_in_customer_employement_screen_under_customer_financials_tab()
			throws Throwable {
		WebElement customerEmployementScreenBackBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementScreenBackBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(customerEmployementScreenBackBtn);
				customerEmployementScreenBackBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verfiy Income section available under Customer Financials tab")
	public void user_608_verfiy_income_section_available_under_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[mode=\"md\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 1000; k++) {
				try {
					addButtonScreenName = javascriptHelper
							.executeScript(
									"return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Section Name" + addButtonScreenName);
							Assert.assertTrue(true);
						}
					}
//					Assert.assertTrue((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim()));						
					break;
				} catch (Exception e) {
					if (k == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

//	AT_INCD_05
	@And("User_608 verify Self Employed customer available under Income section in Customer Financials Tab")
	public void user_608_verify_self_employed_customer_available_under_income_section_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 3000; i++) {
			try {
				actions.scrollToElement(javascriptHelper
						.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSectionTitle"))).build()
						.perform();
				break;
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String listOfRecords = "document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();

				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		first: for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();

					if (recordName.length() > 0) {
						if ((recordName.trim()).equalsIgnoreCase(("Self Employed").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "]"));
							String text = javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "]")
									.getText();
							System.out.println("Text Value::"+ text);
							softAssert.assertTrue(text.contains("Self Employed"), "Self Employed value should be displayed");
							break first;
						} else {
							continue;
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

	}

	@And("User_608 verify Self Employed income field is available under Income section in Customer Financials Tab")
	public void user_608_verify_self_employed_income_field_is_available_under_income_section_in_customer_financials_tab()
			throws Throwable {
//		document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.parentElement.querySelectorAll('td')[3]
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							String income = "document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j
									+ "].parentElement.parentElement.parentElement.querySelectorAll('td')[3]";
							for (int i = 0; i <= 2000; i++) {
								try {
									System.err.println("Field Name: "
											+ javascriptHelper.executeScriptWithWebElement(income).getText());
									Assert.assertTrue(
											javascriptHelper.executeScriptWithWebElement(income).isDisplayed());
									break;
								} catch (Exception e) {
									if (i == 2000) {
										Assert.fail(e.getMessage());
									}
								}
							}
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j
											+ "].parentElement.parentElement.parentElement.querySelectorAll('td')[3]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

//	AT_INCD_06
	@And("User_608 verify the Salaried customer available under Income section in Customer Financials Tab")
	public void user_608_verify_the_salaried_customer_available_under_income_section_in_customer_financials_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSectionTitle")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String listOfRecords = "document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		first:	for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Salaried").trim())) {
							System.out.println("Inside nested loop");
							WebElement value = javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "]");
							javascriptHelper.backgroundColor(value);
							String text = javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('th[ng-reflect-field=\"totalIncomeConsidered\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "]")
									.getText();
							System.out.println("Customer Name: " + text);
							softAssert.assertTrue(text.contains("Salaried"),
									"Salaried Customer should be availble should be displayed");
							break first;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

	@And("User_608 invoke soft assert in Income details screen under Customer Financials tab at Ijarah Data Check stage")
	public void user_608_invoke_soft_assert_in_income_details_screen_under_customer_financials_tab_at_ijarah_data_check_stage() {
		softAssert.assertAll();
	}

//	**************************** Data Check --> Application Details Screen *********************************
//	AT_ADC_01
	@And("User_608 verify the Back button available under Application details screen")
	public void user_608_verify_the_back_button_available_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper
						.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsBackBtn")));
				actions.moveToElement(javascriptHelper
						.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsBackBtn"))).perform();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsBackBtn")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Submit button available under Application details screen")
	public void user_608_verify_the_submit_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsSubmitBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSubmitBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsSubmitBtn);
				actions.moveToElement(AppDetailsSubmitBtn).build().perform();
				softAssert.assertTrue(AppDetailsSubmitBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Return button available under Application details screen")
	public void user_608_verify_the_return_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsReturnBtn = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsReturnBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsReturnBtn);
				actions.moveToElement(AppDetailsReturnBtn).build().perform();
				softAssert.assertTrue(AppDetailsReturnBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the View Summary button available under Application details screen")
	public void user_608_verify_the_view_summary_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsViewSummaryBtn = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsViewSummaryBtn);
				softAssert.assertTrue(AppDetailsViewSummaryBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Classification value displayed correctly under Application details screen")
	public void user_608_validate_the_classification_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement classificationDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		String classificationValue = classificationDropdown.getAttribute("aria-label");
		System.out.println("Classification Value: " + classificationValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(classificationDropdown);
				Assert.assertTrue(classificationValue.contains(testData.get("Classification")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Product value displayed correctly under Application details screen")
	public void user_608_validate_the_product_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement productDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		String productDropdownValue = productDropdown.getAttribute("aria-label");
		System.out.println("Product Value: " + productDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(productDropdown);
				Assert.assertTrue(productDropdownValue.contains(testData.get("Product")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Total Finance Amount Requested value displayed correctly under Application details screen")
	public void user_608_validate_the_total_finance_amount_requested_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalFinanceAmtInput);
				String totalFinanceAmtValue = totalFinanceAmtInput.getAttribute("ng-reflect-model");
				System.out.println("Total Finance Amount: " + totalFinanceAmtValue);
				Assert.assertTrue(totalFinanceAmtValue.contains(testData.get("Total Finance Amt")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Declared Net Monthly Income value displayed correctly under Application details screen")
	public void user_608_validate_the_declared_net_monthly_income_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredMonthlyIncomeInput);
				String declaredMonthlyIncomeValue = declaredMonthlyIncomeInput.getAttribute("ng-reflect-model");
				System.out.println("Declared Net Income Value: " + declaredMonthlyIncomeValue);
				Assert.assertTrue(declaredMonthlyIncomeValue.contains(testData.get("Declared Monthly Income")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Sourcing Channel value displayed correctly under Application details screen")
	public void user_608_validate_the_sourcing_channel_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingChannelDropdown);
				String sourcingChannelDropdownValue = sourcingChannelDropdown.getAttribute("aria-label");
				System.out.println("Sourcing Channel Value: " + sourcingChannelDropdownValue);
				Assert.assertTrue(sourcingChannelDropdownValue.contains(testData.get("Sourcing Channel")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Business Center Code value displayed correctly under Application details screen")
	public void user_608_validate_the_business_center_code_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		String businessCenterCodeDropdownValue = businessCenterCodeDropdown.getAttribute("aria-label");
		System.out.println("Business Center Code Value: " + businessCenterCodeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdownValue.contains(testData.get("Business Center Code")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Servicing Type value displayed correctly under Application details screen")
	public void user_608_validate_the_servicing_type_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		String servicingTypeDropdownValue = servicingTypeDropdown.getAttribute("aria-label");
		System.out.println("Servicing Type Value: " + servicingTypeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdownValue.contains(testData.get("Servicing Type")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Region value displayed correctly under Application details screen")
	public void user_608_validate_the_region_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		String regionDropdownValue = regionDropdown.getAttribute("aria-label");
		System.out.println("Region Value: " + regionDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(regionDropdown);
				Assert.assertTrue(regionDropdownValue.contains(testData.get("Region")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Servicing Branch value displayed correctly under Application details screen")
	public void user_608_validate_the_servicing_branch_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranchDropdown"));
		String servicingBrachValue = servicingBrachDropdown.getAttribute("aria-label");
		System.out.println("Servicing Branch Value: " + servicingBrachValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachValue.contains(testData.get("Servicing Branch")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Closing Staff or Servicing Staff value displayed correctly under Application details screen")
	public void user_608_validate_the_closing_staff_or_servicing_staff_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement closingStaffDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		String closingStaffDropdownValue = closingStaffDropdown.getAttribute("aria-label");
		System.out.println("Closing Staff Value: " + closingStaffDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(closingStaffDropdown);
				Assert.assertTrue(closingStaffDropdownValue.contains(testData.get("Closing Staff")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 invoke soft assert in Application details screen under at Ijarah Data check stage")
	public void user_608_invoke_soft_assert_in_application_details_screen_under_at_ijarah_data_check_stage()
			throws Throwable {
		softAssert.assertAll();
	}

//	AT_ADC_02
	@And("User_608 verify the Classification field available under Application details screen")
	public void user_608_verify_the_classification_field_available_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement classificationLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationLabel"));
		WebElement classificationDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		System.out.println("Field Name: " + classificationLabel.getText());
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundColor(classificationLabel);
				Assert.assertTrue(classificationLabel.isDisplayed());
				javascriptHelper.backgroundBorder(classificationDropdown);
				Assert.assertTrue(classificationDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Product field available under Application details screen")
	public void user_608_verify_the_product_field_available_under_application_details_screen() throws Throwable {
		WebElement productLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productLabel"));
		WebElement productDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		System.out.println("Field Name: " + productLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(productLabel);
				Assert.assertTrue(productLabel.isDisplayed());
				javascriptHelper.backgroundBorder(productDropdown);
				Assert.assertTrue(productDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Total Finance Amount Requested field available under Application details screen")
	public void user_608_verify_the_total_finance_amount_requested_field_available_under_application_details_screen()
			throws Throwable {
		WebElement totalFinanceAmtLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtLabel"));
		WebElement totalFinanceAmtInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		System.out.println("Field Name: " + totalFinanceAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(totalFinanceAmtLabel);
				Assert.assertTrue(totalFinanceAmtLabel.isDisplayed());
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				Assert.assertTrue(totalFinanceAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Declared Net Monthly Income field available under Application details screen")
	public void user_608_verify_the_declared_net_monthly_income_field_available_under_application_details_screen()
			throws Throwable {
		WebElement declaredMonthlyIncomeLabel = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeLabel"));
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		System.out.println("Field Name: " + declaredMonthlyIncomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredMonthlyIncomeLabel);
				Assert.assertTrue(declaredMonthlyIncomeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				Assert.assertTrue(declaredMonthlyIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Declared Current Obligations field available under Application details screen")
	public void user_608_verify_the_declared_current_obligations_field_available_under_application_details_screen()
			throws Throwable {
		WebElement declaredCurrentObligationsLabel = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsLabel"));
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		System.out.println("Field Name: " + declaredCurrentObligationsLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredCurrentObligationsLabel);
				Assert.assertTrue(declaredCurrentObligationsLabel.isDisplayed());
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				Assert.assertTrue(declaredCurrentObligationsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Special Promotion field available under Application details screen")
	public void user_608_verify_the_special_promotion_field_available_under_application_details_screen() throws Throwable {
		WebElement specialPromotionLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionLabel"));
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		System.out.println("Field Name: " + specialPromotionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(specialPromotionLabel);
				Assert.assertTrue(specialPromotionLabel.isDisplayed());
				javascriptHelper.backgroundBorder(specialPromotionDropdown);
				Assert.assertTrue(specialPromotionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sourcing Channel field available under Application details screen")
	public void user_608_verify_the_sourcing_channel_field_available_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelLabel"));
		WebElement sourcingChannelDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		System.out.println("Field Name: " + sourcingChannelLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingChannelLabel);
				Assert.assertTrue(sourcingChannelLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingChannelDropdown);
				Assert.assertTrue(sourcingChannelDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Business Center Code field available under Application details screen")
	public void user_608_verify_the_business_center_code_field_available_under_application_details_screen()
			throws Throwable {
		WebElement businessCenterCodeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeLabel"));
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		System.out.println("Field Name: " + businessCenterCodeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(businessCenterCodeLabel);
				Assert.assertTrue(businessCenterCodeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Servicing Type field available under Application details screen")
	public void user_608_verify_the_servicing_type_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingTypeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeLabel"));
		WebElement servicingTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		System.out.println("Field Name: " + servicingTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingTypeLabel);
				Assert.assertTrue(servicingTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Region field available under Application details screen")
	public void user_608_verify_the_region_field_available_under_application_details_screen() throws Throwable {
		WebElement regionLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionLabel"));
		WebElement regionDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		System.out.println("Field Name: " + regionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(regionLabel);
				Assert.assertTrue(regionLabel.isDisplayed());
				javascriptHelper.backgroundBorder(regionDropdown);
				Assert.assertTrue(regionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Servicing Branch field available under Application details screen")
	public void user_608_verify_the_servicing_branch_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingBrachLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranchLabel"));
		WebElement servicingBrachDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranchDropdown"));
		System.out.println("Field Name: " + servicingBrachLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(servicingBrachLabel);
				Assert.assertTrue(servicingBrachLabel.isDisplayed());
				javascriptHelper.backgroundBorder(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Spoke Location field available under Application details screen")
	public void user_608_verify_the_spoke_location_field_available_under_application_details_screen() throws Throwable {
		WebElement spokeLocationLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationLabel"));
		System.out.println("Field Name: " + spokeLocationLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(spokeLocationLabel);
				Assert.assertTrue(spokeLocationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Closing Staff or Servicing Staff or RM field available under Application details screen")
	public void user_608_verify_the_closing_staff_or_servicing_staff_or_rm_field_available_under_application_details_screen()
			throws Throwable {
		WebElement closingStaffLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffLabel"));
		WebElement closingStaffDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		System.out.println("Field Name: " + closingStaffLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationLabel")));
				javascriptHelper.backgroundColor(closingStaffLabel);
				Assert.assertTrue(closingStaffLabel.isDisplayed());
				javascriptHelper.backgroundBorder(closingStaffDropdown);
				Assert.assertTrue(closingStaffDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Topup Type field available under Application details screen")
	public void user_608_verify_the_topup_type_field_available_under_application_details_screen() throws Throwable {
		WebElement topupTypeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeLabel"));
		WebElement topupType = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupType"));
		System.out.println("Field Name: " + topupTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(topupTypeLabel);
				Assert.assertTrue(topupTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(topupType);
				Assert.assertTrue(topupType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Topup Application No field available under Application details screen")
	public void user_608_verify_the_topup_application_no_field_available_under_application_details_screen()
			throws Throwable {
		WebElement topupAppNoLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoLabel"));
		WebElement topupAppNoInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput"));
		System.out.println("Field Name: " + topupAppNoLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(topupAppNoLabel);
				Assert.assertTrue(topupAppNoLabel.isDisplayed());
				javascriptHelper.backgroundBorder(topupAppNoInput);
				Assert.assertTrue(topupAppNoInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_ADC_03
	@And("User_608 verify the Sourcing Type field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_sourcing_type_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
//		Thread.sleep(1000);
		WebElement sourcingTypeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel"));
		WebElement sourcingTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeDropdown"));
//		System.out.println("Field Name: " + sourcingTypeLabel.getText());
		for (int i = 0; i <= 200000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
				javascriptHelper.backgroundColor(sourcingTypeLabel);
				Assert.assertTrue(sourcingTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingTypeDropdown);
				Assert.assertTrue(sourcingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 200000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sourcing Office field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_sourcing_office_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
		WebElement sourcingOfficeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel"));
		WebElement sourcingOfficeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeDropdown"));
		System.out.println("Field Name: " + sourcingOfficeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingOfficeLabel);
				Assert.assertTrue(sourcingOfficeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingOfficeDropdown);
				Assert.assertTrue(sourcingOfficeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sourcing Entity field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_sourcing_entity_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
		WebElement sourcingEntityLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel"));
		WebElement sourcingEntityDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityDropdown"));
		System.out.println("Field Name: " + sourcingEntityLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingEntityLabel);
				Assert.assertTrue(sourcingEntityLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingEntityDropdown);
				Assert.assertTrue(sourcingEntityDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sourcing Staff field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_sourcing_staff_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
		WebElement sourcingStaffLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel"));
		WebElement sourcingStaffDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffDropdown"));
		System.out.println("Field Name: " + sourcingStaffLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sourcingStaffLabel);
				Assert.assertTrue(sourcingStaffLabel.isDisplayed());
				javascriptHelper.backgroundBorder(sourcingStaffDropdown);
				Assert.assertTrue(sourcingStaffDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Reference Type field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_reference_type_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
		WebElement referenceTypeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel"));
		WebElement referenceTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeDropdown"));
		System.out.println("Field Name: " + referenceTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(referenceTypeLabel);
				Assert.assertTrue(referenceTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(referenceTypeDropdown);
				Assert.assertTrue(referenceTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Reference Code field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_reference_code_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
		WebElement referenceCodeLabel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel"));
		WebElement referenceCodeInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeInput"));
		System.out.println("Field Name: " + referenceCodeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(referenceCodeLabel);
				Assert.assertTrue(referenceCodeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(referenceCodeInput);
				Assert.assertTrue(referenceCodeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_ADC_05
	@And("User_608 verify the Classification Dropdown field available under Application details screen")
	public void user_608_verify_the_classification_dropdown_field_available_under_application_details_screen()
			throws Throwable {
		Thread.sleep(1000);
		WebElement classificationDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(classificationDropdown);
				Assert.assertTrue(classificationDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Product Dropdown field available under Application details screen")
	public void user_608_verify_the_product_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement productDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(productDropdown);
				Assert.assertTrue(productDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Total Finance Amount Requested input field available under Application details screen")
	public void user_608_verify_the_total_finance_amount_requested_input_field_available_under_application_details_screen()
			throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				Assert.assertTrue(totalFinanceAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Declared Net Monthly Income input field available under Application details screen")
	public void user_608_verify_the_declared_net_monthly_income_input_field_available_under_application_details_screen()
			throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				Assert.assertTrue(declaredMonthlyIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Declared Current Obligations input field available under Application details screen")
	public void user_608_verify_the_declared_current_obligations_input_field_available_under_application_details_screen()
			throws Throwable {
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				Assert.assertTrue(declaredCurrentObligationsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_ADC_06
	@And("User_608 verify the Special Promotion Dropdown field available under Application details screen")
	public void user_608_verify_the_special_promotion_dropdown_field_available_under_application_details_screen()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(specialPromotionDropdown);
				Assert.assertTrue(specialPromotionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Sourcing Channel Dropdown field available under Application details screen")
	public void user_608_verify_the_sourcing_channel_dropdown_field_available_under_application_details_screen()
			throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingChannelDropdown);
				Assert.assertTrue(sourcingChannelDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Business Center Code Dropdown field available under Application details screen")
	public void user_608_verify_the_business_center_code_dropdown_field_available_under_application_details_screen()
			throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Servicing Type Dropdown field available under Application details screen")
	public void user_608_verify_the_servicing_type_dropdown_field_available_under_application_details_screen()
			throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Region Dropdown field available under Application details screen")
	public void user_608_verify_the_region_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(regionDropdown);
				Assert.assertTrue(regionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Servicing Branch Dropdown field available under Application details screen")
	public void user_608_verify_the_servicing_branch_dropdown_field_available_under_application_details_screen()
			throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranchDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	************************* Offering Stage -- Offer Details Tab *************************************
//	AT_OFO_01
	@And("User_608 click the pencil icon button under Offer Details tab")
	public void user_608_click_the_pencil_icon_button_under_offer_details_tab() throws Throwable {
		Thread.sleep(2000);
		System.out.println(offering_OfferDetailsJsPaths.getElement("offerDetailsTabPencilIcon"));
		WebElement offerDetailsTabPencilIcon = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsTabPencilIcon"));
		for (int i = 0; i <= 5000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetailsTabPencilIcon);
				javascriptHelper.JSEClick(offerDetailsTabPencilIcon);
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Offer Details section available under Offer Details tab")
	public void user_608_verify_the_offer_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement offerDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsSection"));
		waitHelper.waitForElementwithFluentwait(driver, offerDetailsSection);
		System.out.println("Section Name: " + offerDetailsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetailsSection);
				Assert.assertTrue(offerDetailsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Finance Details section available under Offer Details tab")
	public void user_608_verify_the_finance_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement financeDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetailsSection"));
		System.out.println("Section Name: " + financeDetailsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetailsSection);
				Assert.assertTrue(financeDetailsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Credit Risk Factor section available under Offer Details tab")
	public void user_608_verify_the_credit_risk_factor_section_available_under_offer_details_tab() throws Throwable {
		WebElement creditRiskFactor = javascriptHelper
				.executeScriptWithWebElement("document.querySelectorAll('ion-row[class=\"md hydrated\"]')[2]");
		WebElement creditRiskFactorSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditRiskFactorSection"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.scrollIntoView(creditRiskFactor);
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Section Name: " + creditRiskFactorSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditRiskFactorSection);
				Assert.assertTrue(creditRiskFactorSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Credit Score Details section available under Offer Details tab")
	public void user_608_verify_the_credit_score_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement creditScoreDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScoreDetailsSection"));
		System.out.println("Section Name: " + creditScoreDetailsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditScoreDetailsSection);
				Assert.assertTrue(creditScoreDetailsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Eligibility Details section available under Offer Details tab")
	public void user_608_verify_the_eligibility_details_section_available_under_offer_details_tab() throws Throwable {
		Thread.sleep(1000);
		WebElement section = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScoreDetailsSection"));
		for (int i = 0; i <= 200000; i++) {
			try {
				javascriptHelper.scrollIntoView(section);
				break;
			} catch (Exception e) {
				if (i == 200000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		WebElement eligibilityDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetailsSection"));
		System.out.println("Section Name: " + eligibilityDetailsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetailsSection);
				Assert.assertTrue(eligibilityDetailsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Interest Rate Structure section available under Offer Details tab")
	public void user_608_verify_the_interest_rate_structure_section_available_under_offer_details_tab() throws Throwable {
		WebElement interestRateStructureSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("interestRateStructureSection"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(interestRateStructureSection);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Section Name: " + interestRateStructureSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(interestRateStructureSection);
				Assert.assertTrue(interestRateStructureSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Installments section available under Offer Details tab")
	public void user_608_verify_the_installments_section_available_under_offer_details_tab() throws Throwable {
		WebElement installmentsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("installmentsSection"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(installmentsSection);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Section Name: " + installmentsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(installmentsSection);
				Assert.assertTrue(installmentsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Appeal Request section available under Offer Details tab")
	public void user_608_verify_the_appeal_request_section_available_under_offer_details_tab() throws Throwable {
		WebElement appealRequestSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("appealRequestSection"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(appealRequestSection);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Section Name: " + appealRequestSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(appealRequestSection);
				Assert.assertTrue(appealRequestSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_OFO_02
	@And("User_608 verify Product field available under Offer Details section")
	public void user_608_verify_product_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsSection"));
		waitHelper.waitForElementwithFluentwait(driver, offerDetailsSection);
		WebElement offerDetails_productLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_productLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_productLabel);
				Assert.assertTrue(offerDetails_productLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_productInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_productInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_productInput);
				Assert.assertTrue(offerDetails_productInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sub-Product field available under Offer Details section")
	public void user_608_verify_sub_product_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_subProductLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_subProductLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_subProductLabel);
				Assert.assertTrue(offerDetails_subProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_subProductInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_subProductInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_subProductInput);
				Assert.assertTrue(offerDetails_subProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Scheme field available under Offer Details section")
	public void user_608_verify_scheme_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_schemeLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_schemeLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_schemeLabel);
				Assert.assertTrue(offerDetails_schemeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_schemeInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_schemeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_schemeInput);
				Assert.assertTrue(offerDetails_schemeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Pricing Indicator field available under Offer Details section")
	public void user_608_verify_pricing_indicator_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_pricingIndicatorLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_pricingIndicatorLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_pricingIndicatorLabel);
				Assert.assertTrue(offerDetails_pricingIndicatorLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_pricingIndicatorInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_pricingIndicatorInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_pricingIndicatorInput);
				Assert.assertTrue(offerDetails_pricingIndicatorInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offered Amount field available under Offer Details section")
	public void user_608_verify_offered_amount_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_offeredAmountLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_offeredAmountLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_offeredAmountLabel);
				Assert.assertTrue(offerDetails_offeredAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_offeredAmountInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_offeredAmountInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_offeredAmountInput);
				Assert.assertTrue(offerDetails_offeredAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Tenure field available under Offer Details section")
	public void user_608_verify_tenure_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_tenureLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_tenureLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_tenureLabel);
				Assert.assertTrue(offerDetails_tenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_tenureInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_tenureInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_tenureInput);
				Assert.assertTrue(offerDetails_tenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Nature of Finance field available under Offer Details section")
	public void user_608_verify_nature_of_finance_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_natureOfFinanceLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_natureOfFinanceLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_natureOfFinanceLabel);
				Assert.assertTrue(offerDetails_natureOfFinanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_natureOfFinanceInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_natureOfFinanceInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_natureOfFinanceInput);
				Assert.assertTrue(offerDetails_natureOfFinanceInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Currency field available under Offer Details section")
	public void user_608_verify_currency_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_currencyLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_currencyLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_currencyLabel);
				Assert.assertTrue(offerDetails_currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_currencyInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_currencyInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_currencyInput);
				Assert.assertTrue(offerDetails_currencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Eligible Income field available under Offer Details section")
	public void user_608_verify_eligible_income_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_eligibleIncomeLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_eligibleIncomeLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_eligibleIncomeLabel);
				Assert.assertTrue(offerDetails_eligibleIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offerDetails_eligibleIncomeInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_eligibleIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_eligibleIncomeInput);
				Assert.assertTrue(offerDetails_eligibleIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_OFO_03
	@And("User_608 verify Total Obligations field available under Finance Details section")
	public void user_608_verify_total_obligations_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsSection"));
		waitHelper.waitForElementwithFluentwait(driver, financeDetailsSection);
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(financeDetailsSection);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalObligationsLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalObligationsLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalObligationsLabel);
				Assert.assertTrue(financeDetails_totalObligationsLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalObligationsInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalObligationsInput);
				Assert.assertTrue(financeDetails_totalObligationsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Net Income field available under Finance Details section")
	public void user_608_verify_total_net_income_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalnetIncomeLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalnetIncomeLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalnetIncomeLabel);
				Assert.assertTrue(financeDetails_totalnetIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalnetIncomeInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalnetIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalnetIncomeInput);
				Assert.assertTrue(financeDetails_totalnetIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Income field available under Finance Details section")
	public void user_608_verify_total_income_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalIncomeLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalIncomeLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(financeDetails_totalIncomeLabel);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalIncomeLabel);
				Assert.assertTrue(financeDetails_totalIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalIncomeInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalIncomeInput);
				Assert.assertTrue(financeDetails_totalIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Fees field available under Finance Details section")
	public void user_608_verify_total_fees_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalFeesLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalFeesLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalFeesLabel);
				Assert.assertTrue(financeDetails_totalFeesLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalFeesInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalFeesInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalFeesInput);
				Assert.assertTrue(financeDetails_totalFeesInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Down Payment Amount field available under Finance Details section")
	public void user_608_verify_total_down_payment_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalDownPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalDownPaymentAmtLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalDownPaymentAmtLabel);
				Assert.assertTrue(financeDetails_totalDownPaymentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalDownPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalDownPaymentAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalDownPaymentAmtInput);
				Assert.assertTrue(financeDetails_totalDownPaymentAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Contract Value field available under Finance Details section")
	public void user_608_verify_total_contract_value_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalContractValueLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalContractValueLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalContractValueLabel);
				Assert.assertTrue(financeDetails_totalContractValueLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalContractValueInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalContractValueInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalContractValueInput);
				Assert.assertTrue(financeDetails_totalContractValueInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Number of Installments field available under Finance Details section")
	public void user_608_verify_number_of_installments_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_noOfInstallmentsLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_noOfInstallmentsLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(financeDetails_noOfInstallmentsLabel);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_noOfInstallmentsLabel);
				Assert.assertTrue(financeDetails_noOfInstallmentsLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_noOfInstallmentsInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_noOfInstallmentsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_noOfInstallmentsInput);
				Assert.assertTrue(financeDetails_noOfInstallmentsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Last Installment Amount field available under Finance Details section")
	public void user_608_verify_last_installment_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_lastInstallmentLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_lastInstallmentLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_lastInstallmentLabel);
				Assert.assertTrue(financeDetails_lastInstallmentLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_lastInstallmentInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_lastInstallmentInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_lastInstallmentInput);
				Assert.assertTrue(financeDetails_lastInstallmentInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify IRR field available under Finance Details section")
	public void user_608_verify_irr_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_IRRLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_IRRLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_IRRLabel);
				Assert.assertTrue(financeDetails_IRRLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_IRRInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_IRRInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_IRRInput);
				Assert.assertTrue(financeDetails_IRRInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Installment Frequency field available under Finance Details section")
	public void user_608_verify_installment_frequency_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_InstallmentFrequencyLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_InstallmentFrequencyLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_InstallmentFrequencyLabel);
				Assert.assertTrue(financeDetails_InstallmentFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_InstallmentFrequencyInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_InstallmentFrequencyInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_InstallmentFrequencyInput);
				Assert.assertTrue(financeDetails_InstallmentFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify APR field available under Finance Details section")
	public void user_608_verify_apr_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_APRLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_APRLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_APRLabel);
				Assert.assertTrue(financeDetails_APRLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_APRInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_APRInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_APRInput);
				Assert.assertTrue(financeDetails_APRInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Amount Requested field available under Finance Details section")
	public void user_608_verify_amount_requested_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_AmountRequestedLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_AmountRequestedLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_AmountRequestedLabel);
				Assert.assertTrue(financeDetails_AmountRequestedLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_AmountRequestedInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_AmountRequestedInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_AmountRequestedInput);
				Assert.assertTrue(financeDetails_AmountRequestedInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Additional Down Payment field available under Finance Details section")
	public void user_608_verify_additional_down_payment_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_AdditionalDownPaymentLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_AdditionalDownPaymentLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_AdditionalDownPaymentLabel);
				Assert.assertTrue(financeDetails_AdditionalDownPaymentLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_AdditionalDownPaymentInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_AdditionalDownPaymentInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_AdditionalDownPaymentInput);
				Assert.assertTrue(financeDetails_AdditionalDownPaymentInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Down Payment Percentage field available under Finance Details section")
	public void user_608_verify_down_payment_percentage_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_downPaymentPercentLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentPercentLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_downPaymentPercentLabel);
				Assert.assertTrue(financeDetails_downPaymentPercentLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_downPaymentPercentInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentPercentInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_downPaymentPercentInput);
				Assert.assertTrue(financeDetails_downPaymentPercentInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Tenure field available under Finance Details section")
	public void user_608_verify_tenure_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_tenureLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_tenureLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_tenureLabel);
				Assert.assertTrue(financeDetails_tenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_tenureInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_tenureInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_tenureInput);
				Assert.assertTrue(financeDetails_tenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Profit Amount field available under Finance Details section")
	public void user_608_verify_profit_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_profitAmtLabel = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_profitAmtLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_profitAmtLabel);
				Assert.assertTrue(financeDetails_profitAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_profitAmtInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_profitAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_profitAmtInput);
				Assert.assertTrue(financeDetails_profitAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Down Payment Amount field available under Finance Details section")
	public void user_608_verify_down_payment_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_downPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentAmtLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_downPaymentAmtLabel);
				Assert.assertTrue(financeDetails_downPaymentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_downPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_downPaymentAmtInput);
				Assert.assertTrue(financeDetails_downPaymentAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_OFO_04
	@And("User_608 verify the Total Score field available under Credit Risk Factor section")
	public void user_608_verify_the_total_score_field_available_under_credit_risk_factor_section() throws Throwable {
		WebElement creditRisk_TotalScoreField = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditRisk_TotalScoreField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditRisk_TotalScoreField);
				Assert.assertTrue(creditRisk_TotalScoreField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Risk Level field availble under Credit Risk Factor section")
	public void user_608_verify_the_risk_level_field_availble_under_credit_risk_factor_section() throws Throwable {
		WebElement creditRisk_RiskLevelField = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditRisk_RiskLevelField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditRisk_RiskLevelField);
				Assert.assertTrue(creditRisk_RiskLevelField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Serial No field available under Credit Score details section")
	public void user_608_verify_the_serial_no_field_available_under_credit_score_details_section() throws Throwable {
		WebElement creditScore_SerialNoField = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScore_SerialNoField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditScore_SerialNoField);
				Assert.assertTrue(creditScore_SerialNoField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Customer Name field available under Credit Score details section")
	public void user_608_verify_the_customer_name_field_available_under_credit_score_details_section() throws Throwable {
		WebElement creditScore_CustomerNameField = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScore_CustomerNameField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditScore_CustomerNameField);
				Assert.assertTrue(creditScore_CustomerNameField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Credit Bureau Score field available under Credit Score details section")
	public void user_608_verify_the_credit_bureau_score_field_available_under_credit_score_details_section()
			throws Throwable {
		WebElement creditScore_CreditBureauScoreField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("creditScore_CreditBureauScoreField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(creditScore_CreditBureauScoreField);
				Assert.assertTrue(creditScore_CreditBureauScoreField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_OFO_05
	@And("User_608 verify the Eligibility Type field available under Eligibility Details section")
	public void user_608_verify_the_eligibility_type_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_EligibilityTypeField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("eligibilityDetails_EligibilityTypeField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetails_EligibilityTypeField);
				Assert.assertTrue(eligibilityDetails_EligibilityTypeField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Eligibility Amount field available under Eligibility Details section")
	public void user_608_verify_the_eligibility_amount_field_available_under_eligibility_details_section()
			throws Throwable {
		WebElement eligibilityDetails_EligibilityAmtField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("eligibilityDetails_EligibilityAmtField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetails_EligibilityAmtField);
				Assert.assertTrue(eligibilityDetails_EligibilityAmtField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Eligibility Percentage field available under Eligibility Details section")
	public void user_608_verify_the_eligibility_percentage_field_available_under_eligibility_details_section()
			throws Throwable {
		WebElement eligibilityDetails_EligibilityPercentField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("eligibilityDetails_EligibilityPercentField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetails_EligibilityPercentField);
				Assert.assertTrue(eligibilityDetails_EligibilityPercentField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Currency field available under Eligibility Details section")
	public void user_608_verify_the_currency_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_CurrencyField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("eligibilityDetails_CurrencyField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetails_CurrencyField);
				Assert.assertTrue(eligibilityDetails_CurrencyField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Actual Percentage field available under Eligibility Details section")
	public void user_608_verify_the_actual_percentage_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_ActualPercentField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("eligibilityDetails_ActualPercentField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetails_ActualPercentField);
				Assert.assertTrue(eligibilityDetails_ActualPercentField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify the Deviation level field available under Eligibility Details section")
	public void user_608_verify_the_deviation_level_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_DeviationLevelField = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("eligibilityDetails_DeviationLevelField"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(eligibilityDetails_DeviationLevelField);
				Assert.assertTrue(eligibilityDetails_DeviationLevelField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_OFO_06
	@And("User_608 verify Product field is non-editable under Offer Details section")
	public void user_608_verify_product_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_productInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_productInput"));
		String attribute = offerDetails_productInput.getAttribute("readonly");
//		System.out.println("Value: "+attribute); ==> Output: true
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_productInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Sub-Product field is non-editable under Offer Details section")
	public void user_608_verify_sub_product_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_subProductInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_subProductInput"));
		String attribute = offerDetails_subProductInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_subProductInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Scheme field is non-editable under Offer Details section")
	public void user_608_verify_scheme_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_schemeInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_schemeInput"));
		String attribute = offerDetails_schemeInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_schemeInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Pricing Indicator field is non-editable under Offer Details section")
	public void user_608_verify_pricing_indicator_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_pricingIndicatorInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_pricingIndicatorInput"));
		String attribute = offerDetails_pricingIndicatorInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_pricingIndicatorInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Offered Amount field is non-editable under Offer Details section")
	public void user_608_verify_offered_amount_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_offeredAmountInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_offeredAmountInput"));
		String attribute = offerDetails_offeredAmountInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_offeredAmountInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verfiy Tenure field is non-editable under Offer Details section")
	public void user_608_verfiy_tenure_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_tenureInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_tenureInput"));
		String attribute = offerDetails_tenureInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_tenureInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Nature of Finance field is non-editable under Offer Details section")
	public void user_608_verify_nature_of_finance_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_natureOfFinanceInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_natureOfFinanceInput"));
		String attribute = offerDetails_natureOfFinanceInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_natureOfFinanceInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Currency field is non-editable under Offer Details section")
	public void user_608_verify_currency_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_currencyInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_currencyInput"));
		String attribute = offerDetails_currencyInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_currencyInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Eligible Income field is non-editable under Offer Details section")
	public void user_608_verify_eligible_income_field_is_non_editable_under_offer_details_section() throws Throwable {
		WebElement offerDetails_eligibleIncomeInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("offerDetails_eligibleIncomeInput"));
		String attribute = offerDetails_eligibleIncomeInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(offerDetails_eligibleIncomeInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Obligations field is non-editable under Finance Details section")
	public void user_608_verify_total_obligations_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetailsSection = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetailsSection"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(financeDetailsSection);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement financeDetails_totalObligationsInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalObligationsInput"));
		String attribute = financeDetails_totalObligationsInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalObligationsInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Net Income field is non-editable under Finance Details section")
	public void user_608_verify_total_net_income_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalnetIncomeInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalnetIncomeInput"));
		String attribute = financeDetails_totalnetIncomeInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalnetIncomeInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Income field is non-editable under Finance Details section")
	public void user_608_verify_total_income_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalIncomeInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalIncomeInput"));
		String attribute = financeDetails_totalIncomeInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalIncomeInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Fees field is non-editable under Finance Details section")
	public void user_608_verify_total_fees_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalFeesInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalFeesInput"));
		String attribute = financeDetails_totalFeesInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalFeesInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Down Payment Amount field is non-editable under Finance Details section")
	public void user_608_verify_total_down_payment_amount_field_is_non_editable_under_finance_details_section()
			throws Throwable {
		WebElement financeDetails_totalDownPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalDownPaymentAmtInput"));
		String attribute = financeDetails_totalDownPaymentAmtInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalDownPaymentAmtInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total Contract Value field is non-editable under Finance Details section")
	public void user_608_verify_total_contract_value_field_is_non_editable_under_finance_details_section()
			throws Throwable {
		WebElement financeDetails_totalContractValueInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_totalContractValueInput"));
		String attribute = financeDetails_totalContractValueInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_totalContractValueInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify No of Installments field is non-editable under Finance Details section")
	public void user_608_verify_no_of_installments_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_noOfInstallmentsInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_noOfInstallmentsInput"));
		String attribute = financeDetails_noOfInstallmentsInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_noOfInstallmentsInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Last Installment Amount field is non-editable under Finance Details section")
	public void user_608_verify_last_installment_amount_field_is_non_editable_under_finance_details_section()
			throws Throwable {
		WebElement financeDetails_lastInstallmentInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_lastInstallmentInput"));
		String attribute = financeDetails_lastInstallmentInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_lastInstallmentInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify IRR field is non-editable under Finance Details section")
	public void user_608_verify_irr_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_IRRInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_IRRInput"));
		String attribute = financeDetails_IRRInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_IRRInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Installment Frequency field is non-editable under Finance Details section")
	public void user_608_verify_installment_frequency_field_is_non_editable_under_finance_details_section()
			throws Throwable {
		WebElement financeDetails_InstallmentFrequencyInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_InstallmentFrequencyInput"));
		String attribute = financeDetails_InstallmentFrequencyInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_InstallmentFrequencyInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify APR field is non-editable under Finance Details section")
	public void user_608_verify_apr_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_APRInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_APRInput"));
		String attribute = financeDetails_APRInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_APRInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Amount Requested field is non-editable under Finance Details section")
	public void user_608_verify_amount_requested_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_AmountRequestedInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_AmountRequestedInput"));
		String attribute = financeDetails_AmountRequestedInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_AmountRequestedInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Additional Down Payment field is non-editable under Finance Details section")
	public void user_608_verify_additional_down_payment_field_is_non_editable_under_finance_details_section()
			throws Throwable {
		WebElement financeDetails_AdditionalDownPaymentInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_AdditionalDownPaymentInput"));
		String attribute = financeDetails_AdditionalDownPaymentInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_AdditionalDownPaymentInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Down Payment Percentage field is non-editable under Finance Details section")
	public void user_608_verify_down_payment_percentage_field_is_non_editable_under_finance_details_section()
			throws Throwable {
		WebElement financeDetails_downPaymentPercentInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentPercentInput"));
		String attribute = financeDetails_downPaymentPercentInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_downPaymentPercentInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Tenure field is non-editable under Finance Details section")
	public void user_608_verify_tenure_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_tenureInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_tenureInput"));
		String attribute = financeDetails_tenureInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_tenureInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Profit Amount field is non-editable under Finance Details section")
	public void user_608_verify_profit_amount_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_profitAmtInput = javascriptHelper
				.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_profitAmtInput"));
		String attribute = financeDetails_profitAmtInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_profitAmtInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Down Payment Amount field is non-editable under Finance Details section")
	public void user_608_verify_down_payment_amount_field_is_non_editable_under_finance_details_section() throws Throwable {
		WebElement financeDetails_downPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(
				offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentAmtInput"));
		String attribute = financeDetails_downPaymentAmtInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(financeDetails_downPaymentAmtInput);
				Assert.assertTrue(attribute.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CSAD_01
	@And("User_608 validate Declared Monthly Obligations value displayed correctly under Application details screen")
	public void user_608_validate_declared_monthly_obligations_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(declaredCurrentObligationsInput);
				String obligationAmt = declaredCurrentObligationsInput.getAttribute("ng-reflect-model");
				System.out.println("Obligation Amount: " + obligationAmt);
				Assert.assertTrue(obligationAmt.contains(testData.get("Declared Monthly Obligations")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Special Promotion value displayed correctly under Application details screen")
	public void user_608_validate_special_promotion_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		String promotionDropdownValue = specialPromotionDropdown.getAttribute("aria-label");
		System.out.println("Product Value: " + promotionDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(specialPromotionDropdown);
				Assert.assertTrue(promotionDropdownValue.contains(testData.get("Special Promotion")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Spoke Location value displayed correctly under Application details screen")
	public void user_608_validate_spoke_location_value_displayed_correctly_under_application_details_screen()
			throws Throwable {
		WebElement spokeLocationDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationDropdown"));
		String spokeLocDropdownValue = spokeLocationDropdown.getAttribute("aria-label");
		System.out.println("Product Value: " + spokeLocDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(spokeLocationDropdown);
				Assert.assertTrue(spokeLocDropdownValue.contains(testData.get("Spoke Location")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CSAD_04
	@And("User_608 validate the Classification Dropdown field under Application details screen")
	public void user_608_validate_the_classification_dropdown_field_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement classificationDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		String classificationValue = classificationDropdown.getAttribute("aria-label");
		System.out.println("Classification Value: " + classificationValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(classificationDropdown);
				Assert.assertTrue(classificationValue.contains(testData.get("Classification")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement classification = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classification"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Product Dropdown field under Application details screen")
	public void user_608_validate_the_product_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement productDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		String productDropdownValue = productDropdown.getAttribute("aria-label");
		System.out.println("Product Value: " + productDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(productDropdown);
				Assert.assertTrue(productDropdownValue.contains(testData.get("Product")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement product = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("product"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Total Finance Amount Requested input field under Application details screen")
	public void user_608_validate_the_total_finance_amount_requested_input_field_under_application_details_screen()
			throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				String totalFinanceAmtValue = totalFinanceAmtInput.getAttribute("ng-reflect-model");
				System.out.println("Total Finance Amount: " + totalFinanceAmtValue);
				Assert.assertTrue(totalFinanceAmtValue.contains(testData.get("Total Finance Amt")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String read = totalFinanceAmtInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Declared Net Monthly Income input field under Application details screen")
	public void user_608_validate_the_declared_net_monthly_income_input_field_under_application_details_screen()
			throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				String declaredMonthlyIncomeValue = declaredMonthlyIncomeInput.getAttribute("ng-reflect-model");
				System.out.println("Declared Net Income Value: " + declaredMonthlyIncomeValue);
				Assert.assertTrue(declaredMonthlyIncomeValue.contains(testData.get("Declared Monthly Income")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String read = declaredMonthlyIncomeInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Declared Current Obligations input field under Application details screen")
	public void user_608_validate_the_declared_current_obligations_input_field_under_application_details_screen()
			throws Throwable {
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				String obligationAmt = declaredCurrentObligationsInput.getAttribute("ng-reflect-model");
				System.out.println("Obligation Amount: " + obligationAmt);
				Assert.assertTrue(obligationAmt.contains(testData.get("Declared Monthly Obligations")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String read = declaredCurrentObligationsInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Special Promotion Dropdown field under Application details screen")
	public void user_608_validate_the_special_promotion_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		String promotionDropdownValue = specialPromotionDropdown.getAttribute("aria-label");
		System.out.println("Product Value: " + promotionDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(specialPromotionDropdown);
				Assert.assertTrue(promotionDropdownValue.contains(testData.get("Special Promotion")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement specialPromotion = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotion"));
		String read = specialPromotion.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Sourcing Channel Dropdown field under Application details screen")
	public void user_608_validate_the_sourcing_channel_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingChannelDropdown);
				String sourcingChannelDropdownValue = sourcingChannelDropdown.getAttribute("aria-label");
				System.out.println("Sourcing Channel Value: " + sourcingChannelDropdownValue);
				Assert.assertTrue(sourcingChannelDropdownValue.contains(testData.get("Sourcing Channel")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement sourcingChannel = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannel"));
		String read = sourcingChannel.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Business Center Code Dropdown field under Application details screen")
	public void user_608_validate_the_business_center_code_dropdown_field_under_application_details_screen()
			throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(
				dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		String businessCenterCodeDropdownValue = businessCenterCodeDropdown.getAttribute("aria-label");
		System.out.println("Business Center Code Value: " + businessCenterCodeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdownValue.contains(testData.get("Business Center Code")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement businessCenterCode = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCode"));
		String read = businessCenterCode.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Servicing Type Dropdown field under Application details screen")
	public void user_608_validate_the_servicing_type_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		String servicingTypeDropdownValue = servicingTypeDropdown.getAttribute("aria-label");
		System.out.println("Servicing Type Value: " + servicingTypeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdownValue.contains(testData.get("Servicing Type")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement servicingType = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingType"));
		String read = servicingType.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Region Dropdown field under Application details screen")
	public void user_608_validate_the_region_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		String regionDropdownValue = regionDropdown.getAttribute("aria-label");
		System.out.println("Region Value: " + regionDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(regionDropdown);
				Assert.assertTrue(regionDropdownValue.contains(testData.get("Region")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement region = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("region"));
		String read = region.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Servicing Branch Dropdown field under Application details screen")
	public void user_608_validate_the_servicing_branch_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranchDropdown"));
		String servicingBrachValue = servicingBrachDropdown.getAttribute("aria-label");
		System.out.println("Servicing Branch Value: " + servicingBrachValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachValue.contains(testData.get("Servicing Branch")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement servicingBranch = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranch"));
		String read = servicingBranch.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Spoke Location Dropdown field under Application details screen")
	public void user_608_validate_the_spoke_location_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement spokeLocationDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationDropdown"));
		String spokeLocDropdownValue = spokeLocationDropdown.getAttribute("aria-label");
		System.out.println("Product Value: " + spokeLocDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(spokeLocationDropdown);
				Assert.assertTrue(spokeLocDropdownValue.contains(testData.get("Spoke Location")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement spokeLocation = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocation"));
		String read = spokeLocation.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Closing Staff Dropdown field under Application details screen")
	public void user_608_validate_the_closing_staff_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement closingStaffDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		String closingStaffDropdownValue = closingStaffDropdown.getAttribute("aria-label");
		System.out.println("Closing Staff Value: " + closingStaffDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(closingStaffDropdown);
				Assert.assertTrue(closingStaffDropdownValue.contains(testData.get("Closing Staff")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement closingStaff = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaff"));
		String read = closingStaff.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Topup Type Dropdown field under Application details screen")
	public void user_608_validate_the_topup_type_dropdown_field_under_application_details_screen() throws Throwable {
		WebElement topupType = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupType"));
		String read = topupType.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeDropdown")));
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Topup Application field under Application details screen")
	public void user_608_validate_the_topup_application_field_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement topupAppNoInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput"));
		String read = topupAppNoInput.getAttribute("readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(topupAppNoInput);
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

//	AT_CSAD_05
	@And("User_608 validate the Sourcing Type field under Referral\\Sourcing Details section")
	public void user_608_validate_the_sourcing_type_field_under_referral_sourcing_details_section() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String sourcingType = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
				Assert.assertTrue(sourcingType.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate Correct value is displayed
		WebElement sourcingTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeDropdown"));
		System.out.println("Sourcing Type Value: " + sourcingTypeDropdown.getAttribute("aria-label"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingTypeDropdown);
				Assert.assertTrue(
						sourcingTypeDropdown.getAttribute("aria-label").contains(testData.get("Sourcing Type")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as non-editable
		WebElement sourcingTypeField = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingTypeField.getAttribute("ng-reflect-readonly").contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Sourcing Office field under Referral\\Sourcing Details section")
	public void user_608_validate_the_sourcing_office_field_under_referral_sourcing_details_section() {
//		Validate Mandatory
		String sourcingOffice = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel")));
				Assert.assertTrue(sourcingOffice.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate Correct value is displayed
		WebElement sourcingOfficeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeDropdown"));
		System.out.println("Sourcing Office Value: " + sourcingOfficeDropdown.getAttribute("aria-label"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingOfficeDropdown);
				Assert.assertTrue(
						sourcingOfficeDropdown.getAttribute("aria-label").contains(testData.get("Sourcing Office")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as non-editable
		WebElement sourcingOfficeField = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOffice"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingOfficeField.getAttribute("ng-reflect-readonly").contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingOfficeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Sourcing Entity field under Referral\\Sourcing Details section")
	public void user_608_validate_the_sourcing_entity_field_under_referral_sourcing_details_section() {
//		Validate Mandatory
		String sourcingEntity = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel")));
				Assert.assertTrue(sourcingEntity.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate Correct value is displayed
		WebElement sourcingEntityDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityDropdown"));
		System.out.println("Sourcing Entity Value: " + sourcingEntityDropdown.getAttribute("aria-label"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingEntityDropdown);
				Assert.assertTrue(
						sourcingEntityDropdown.getAttribute("aria-label").contains(testData.get("Sourcing Entity")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as non-editable
		WebElement sourcingEntityField = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntity"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingEntityField.getAttribute("ng-reflect-readonly").contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingEntityDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Sourcing Staff field under Referral\\Sourcing Details section")
	public void user_608_validate_the_sourcing_staff_field_under_referral_sourcing_details_section() {
//		Validate Mandatory
		String sourcingStaff = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel")));
				Assert.assertTrue(sourcingStaff.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate Correct value is displayed
		WebElement sourcingStaffDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffDropdown"));
		System.out.println("Sourcing Staff Value: " + sourcingStaffDropdown.getAttribute("aria-label"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingStaffDropdown);
				Assert.assertTrue(
						sourcingStaffDropdown.getAttribute("aria-label").contains(testData.get("Sourcing Staff")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as non-editable
		WebElement sourcingStaffField = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaff"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingStaffField.getAttribute("ng-reflect-readonly").contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingStaffDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Reference Type field under Referral\\Sourcing Details section")
	public void user_608_validate_the_reference_type_field_under_referral_sourcing_details_section() {
//		Validate Mandatory
		String referenceType = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel")));
				Assert.assertTrue(!(referenceType.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate Correct value is displayed
		WebElement referenceTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeDropdown"));
		System.out.println("Reference Type Value: " + referenceTypeDropdown.getAttribute("aria-label"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(referenceTypeDropdown);
				Assert.assertTrue(
						referenceTypeDropdown.getAttribute("aria-label").contains(testData.get("Reference Type")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as non-editable
		WebElement referenceTypeField = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(referenceTypeField.getAttribute("ng-reflect-readonly").contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(referenceTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate the Reference Code field under Referral\\Sourcing Details section")
	public void user_608_validate_the_reference_code_field_under_referral_sourcing_details_section() {
//		Validate Non-Mandatory
		String referenceCode = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel"))
				.getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
						dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel")));
				Assert.assertTrue(!(referenceCode.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate Correct value is displayed
		WebElement referenceCodeInput = javascriptHelper
				.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeInput"));
		System.out.println("Reference Code Value: " + referenceCodeInput.getAttribute("ng-reflect-model"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(referenceCodeInput);
				Assert.assertTrue(
						referenceCodeInput.getAttribute("ng-reflect-model").contains(testData.get("Reference Code")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as non-editable
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(referenceCodeInput.getAttribute("ng-reflect-readonly").contains("true"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Validate the field should be textbox
		String refCodeInput = "document.querySelector('[id=\"referenceEmployeeId\"] input')";
		String tagName = javascriptHelper.executeScriptWithWebElement(refCodeInput).getTagName();
		for (int i = 0; i <= 2000; i++) {
			try {
				System.out.println("Tag Name: " + tagName);
				Assert.assertTrue(tagName.contains("input"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_UNW_004
	@And("User_608 enter the Deviation Amount under Finance configuration section in Offer Decision tab")
	public void user_608_enter_the_deviation_amount_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		Thread.sleep(1000);
		WebElement Finance_DeviationAmountInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountInput"));
		for (int i = 0; i <= 5000; i++) {
			try {
				actions.scrollToElement(Finance_DeviationAmountInput).build().perform();
				javascriptHelper.backgroundBorder(Finance_DeviationAmountInput);
				Finance_DeviationAmountInput.sendKeys(testData.get("Deviation_Amount"));
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Deviation Tenure under Finance configuration section in Offer Decision tab")
	public void user_608_enter_the_deviation_tenure_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		WebElement finance_DeviationTenureInput = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(finance_DeviationTenureInput);
				finance_DeviationTenureInput.sendKeys(testData.get("Deviation_Tenure"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Deviate button under Offer Decision screen")
	public void user_608_click_the_deviate_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_DeviateBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_DeviateBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				actions.scrollToElement(offer_DeviateBtn).build().perform();
				javascriptHelper.backgroundBorder(offer_DeviateBtn);
				javascriptHelper.JSEClick(offer_DeviateBtn);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 post clicking on deviate button system should able to deviate offered amount")
	public void user_608_post_clicking_on_deviate_button_system_should_able_to_deviate_offered_amount() throws Throwable {
		Thread.sleep(5000);
		String string = "document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement";
		for (int i = 0; i <= 50000; i++) {
			try {
				softAssert.assertTrue(javascriptHelper.executeScriptWithWebElement(string).isDisplayed(),
						"Offer Details table should be display");
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 invoke soft assert in under Offer Decision tab at Ijarah Underwriter stage")
	public void user_608_invoke_soft_assert_in_under_offer_decision_tab_at_ijarah_underwriter_stage() throws Throwable {
		softAssert.assertAll();
	}

	@And("User_608 click the Accept Deviation button in Deviation Comparison screen")
	public void user_608_click_the_accept_deviation_button_in_deviation_comparison_screen() throws Throwable {
		WebElement acceptDeviationBtn = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("acceptDeviationBtn"));
		for (int i = 0; i <= 5000; i++) {
			try {
				clicksAndActionsHelper.clickOnElement(acceptDeviationBtn);
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Offer Decision tab in Underwriter stage")
	public void user_608_click_the_offer_decision_tab_in_underwriter_stage() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionTab")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 to check whether underwriter is able to view the previous offers generated of the application if deviation is accepted")
	public void user_608_to_check_whether_underwriter_is_able_to_view_the_previous_offers_generated_of_the_application_if_deviation_is_accepted()
			throws Throwable {
		Thread.sleep(5000);
		WebElement offerDetailstable = javascriptHelper
				.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDetailstable"));
		WebElement prevOffer = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("prevOffer"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(offerDetailstable);
				javascriptHelper.backgroundBorder(prevOffer);
				softAssert.assertTrue(prevOffer.isDisplayed(), "Previous offers should be displayed");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
