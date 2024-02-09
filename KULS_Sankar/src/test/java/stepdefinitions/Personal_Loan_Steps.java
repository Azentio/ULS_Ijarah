package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Personal_Loan_Steps {	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	
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

	ExcelData underwriterExcelData  = new ExcelData(excelTestDataPath,"PL_Underwriter","DataSet ID");
	
	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ULSExecution", "TestCase ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

//	Personal loan -- Underwriter
	@And("^User_608 get the test data for test case AT_PL_UNW_01$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_01");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_PL_UNW_02$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_02");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_PL_UNW_03$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_03");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_PL_UNW_04$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_04");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_PL_UNW_05$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_05");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_608 get the test data for test case AT_PL_UNW_06$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_06() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_06");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_PL_UNW_07$")
    public void get_the_test_data_for_test_case_AT_PL_UNW_07() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_PL_UNW_07");
		testData = underwriterExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	
	
	
	
	
	@And("User_608 search the Reference ID in ULS Application for Personal loan")
	public void user_608_search_the_reference_id_in_uls_application_for_personal_loan() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
//	AT_PL_UNW_02
	@And("User_608 system should able to select accept\\reject from dropdown under Decision section")
	public void user_608_system_should_able_to_select_accept_reject_from_dropdown_under_decision_section()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains(testData.get("Decision1"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
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
	
	@And("User_608 invoke soft assert in Personal loan Underwriter stage Offer Decision tab")
	public void user_608_invoke_soft_assert_in_personal_loan_underwriter_stage_offer_decision_tab() throws Throwable {
		softAssert.assertAll();
	}
	
//	AT_PL_UNW_04
	@And("User_608 select Note Code value from dropdown in Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_note_code_value_from_dropdown_in_recommendationsanction_hyperlink_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteCode"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Note_Code"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
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

	@And("User_608 enter Sequence Number value in input field under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_sequence_number_value_in_input_field_under_recommendationsanction_hyperlink_screen()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("SequenceNumber"))
						.sendKeys(testData.get("Sequence_Nbr"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select Note Sub Code value from dropdown in Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_note_sub_code_value_from_dropdown_in_recommendationsanction_hyperlink_screen()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("NoteSubcode"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Note_Sub_Code"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
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

	@And("User_608 enter Condition value in input field under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_condition_value_in_input_field_under_recommendationsanction_hyperlink_screen()
			throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Condition"))
						.sendKeys(testData.get("Condition"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select Date under Recommendation\\Sanction Hyperlink screen")
	public void user_608_select_date_under_recommendationsanction_hyperlink_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date")).click();
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Date_today")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter Remarks in input field under Recommendation\\Sanction Hyperlink screen")
	public void user_608_enter_remarks_in_input_field_under_recommendationsanction_hyperlink_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Remarks"))
						.sendKeys(testData.get("Remarks"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	AT_PL_UNW_05
	@And("User_608 select the Decision value as accept\\reject from dropdown under Decision section")
	public void user_608_select_the_decision_value_as_acceptreject_from_dropdown_under_decision_section()
			throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains(testData.get("Decision1"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
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

	@And("^User_608 select the Decision value as Select from dropdown under Decision section in Offer Decision tab$")
	public void user_608_select_the_decision_value_as_select_from_dropdown_under_decision_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-select[ng-reflect-interface=\"popover\"]')[3]").click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("Decision2"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
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

	
//	AT_PL_UNW_06
	@And("^User_608 enter invalid Deviation Amount under Finance configuration section in Offer Decision tab$")
	public void user_608_enter_invalid_deviation_amount_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement Finance_DeviationAmountInput = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountInput"));
				actions.scrollToElement(Finance_DeviationAmountInput).build().perform();
				javascriptHelper.backgroundBorder(Finance_DeviationAmountInput);
				Finance_DeviationAmountInput.sendKeys(testData.get("Invalid_Deviation_Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter Deviation Amount value under Finance configuration section in Offer Decision tab$")
	public void user_608_enter_deviation_amount_value_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement Finance_DeviationAmountInput = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountInput"));
				actions.scrollToElement(Finance_DeviationAmountInput).build().perform();
				javascriptHelper.backgroundBorder(Finance_DeviationAmountInput);
				Finance_DeviationAmountInput.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				Finance_DeviationAmountInput.sendKeys(testData.get("Deviation_Amount"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter Deviation Tenure value under Finance configuration section in Offer Decision tab$")
	public void user_608_enter_deviation_tenure_value_under_finance_configuration_section_in_offer_decision_tab()
			throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				WebElement finance_DeviationTenureInput = javascriptHelper
						.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureInput"));
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

	
}
