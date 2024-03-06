package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataEntry_FinancialCommitments extends BaseClass{
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
    
	
	WebDriver driver = BaseClass.driver;
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Actions actions = new Actions(driver);

	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	ExcelData aDE_FinancialCommitments = new ExcelData(excelTestDataPath,"ADE_FinancialCommitments","DataSet ID");
	Map<String, String> testExecutionData;			
	Map<String, String> testData;
	int indexOfListView = 0;
	String recordStatus = "";
	String listViewRecordStatus = "";
	
	//JSPaths iJarah_CommonElements = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");
	JSPaths ADE_FinancialCommitmentJSPath = new JSPaths(excelPath, "ADE_FinancialCommitments", "Financialcommitments_Fields", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");

	
	 //---------- Consumer Durable AppData Entry Facility Details 
	
	@And("User_6047 get the test data set id for AT_CD_ADE_FC_01")
	public void user_6047_get_the_test_data_set_id_for_AT_CD_ADE_FC_01() {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_FC_01");
		testData = aDE_FinancialCommitments.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	
	@And("User_6047 get the test data set id for AT_CD_ADE_FC_02")
	public void user_6047_get_the_test_data_set_id_for_AT_CD_ADE_FC_02() {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_FC_02");
		testData = aDE_FinancialCommitments.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	@And("User_6047 get the test data set id for AT_CD_ADE_FC_03")
	public void user_6047_get_the_test_data_set_id_for_AT_CD_ADE_FC_03() {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_FC_03");
		testData = aDE_FinancialCommitments.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	@And("User_6047 get the test data set id for AT_CD_ADE_FC_07")
	public void user_6047_get_the_test_data_set_id_for_AT_CD_ADE_FC_07() {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_FC_07");
		testData = aDE_FinancialCommitments.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	@And("User_6047 get the test data set id for AT_CD_ADE_FC_10")
	public void user_6047_get_the_test_data_set_id_for_AT_CD_ADE_FC_10() {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_FC_10");
		testData = aDE_FinancialCommitments.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	//        *********************************      steps        ****************************
	
	
//	===============================================================================================================================
	@And("User_6047 click the module name dropdown in ULS application")
	public void user_6047_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						iJarah_CommonElements.getElement("module_dropdown"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_6047 select the module name as LOS in ULS application")
	public void user_6047_select_the_module_name_as_los_in_uls_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank()) && !moduleLength.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					if (moduleName.equalsIgnoreCase("LOS")) {
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

	@And("User_6047 click the Mail box in ULS application")
	public void user_6047_click_the_mail_box_in_uls_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						iJarah_CommonElements.getElement("mail_box"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_6047 click the Search button under inbox")
	public void user_6047_click_the_search_button_under_inbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						iJarah_CommonElements.getElement("mail_box_search_button"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	@And("User_6047 search the Reference ID for Consumer Durable")
	public void user_6047_search_the_reference_id_for_consumer_durable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No"));
				//.sendKeys("5511");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	@And("User_6047 click the Entitle button under inbox")
	public void user_6047_click_the_entitle_button_under_inbox() throws Throwable {		
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]').length")
						.toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				String jspath = "document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]')[" + (Integer.parseInt(length)-1) + "]";
				WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	//-----------------------   end  -----------------
	
	
	

	@And("User_6047 Click the customer Financial tab")
	public void user_6047_click_the_customer_financial_tab() throws Throwable {
	Thread.sleep(1500);
	String length =null;
	for (int i = 0; i <300; i++) {
		try {
		    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
		    System.out.println(length);
			if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
				break;
			}
		} catch (Exception e) {
			if (i==299) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <300; i++) {
	try {
		for (int j = 0; j <Integer.parseInt(length); j++) {
			String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Customer Financials")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//				System.out.println(jspath);
//				javascriptHelper.scrollIntoView(addButton);
				javascriptHelper.JSEClick(addButton);
		//		addButton.click();
				break;
			}
		}
		break;
	} catch (Exception e) {
		if (i==299) {
			Assert.fail(e.getMessage());
		}
	}
}
	}
	@And("User_6047 click edit icon")
	public void user_click_edit_icon_() {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Edit_button")).click();
					break;
				} catch (Exception e) { 
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	@And("User_6047 Click the add button of Financial commitments")
	public void user_6047_clict_the_add_button_of_financial_commitments() throws Throwable {
		Thread.sleep(700);
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
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
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
//	@Then("logout from the ijaraApplication")
//	public void logout_from_the_ijara_application() throws Throwable {
//		ijaraLogin.logoutFromIjara();
//	}	
	@Then("User_6047 verify the Save button in Financial commitments")
	public void user_6047_verify_the_save_button_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SaveButton"))).build().perform();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SaveButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Back button in Financial commitments")
	public void user_6047_verify_the_back_button_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("backButton"))).build().perform();
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("backButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Finance Type in Financial commitments")
	public void user_6047_verify_the_finance_type_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Financier Institution in Financial commitments")
	public void user_6047_verify_the_financier_institution_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialInstitution"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Account Number in Financial commitments")
	public void user_6047_verify_the_account_number_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AccountNumber"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Sanction Date in Financial commitments")
	public void user_6047_verify_the_sanction_date_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Sanction Amount in Financial commitments")
	public void user_6047_verify_the_sanction_amount_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionAmount"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Interest Rate % in Financial commitments")
	public void user_verify_the_interest_rate_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InterestRate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Tenure\\(months) in Financial commitments")
	public void user_verify_the_tenure_months_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Maturity Date in Financial commitments")
	public void user_6047_verify_the_maturity_date_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("MaturityDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Installment Amount in Financial commitments")
	public void user_6047_verify_the_installment_amount_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Current Principal Balance in Financial commitments")
	public void user_6047_verify_the_current_principal_balance_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CurrentPrincipalBalance"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Amount Considered in Financial commitments")
	public void user_6047_verify_the_amount_considered_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AmountConsidered"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Include in Eligibility Calculation in Financial commitments")
	public void user_6047_verify_the_include_in_eligibility_calculation_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("IncludeInEligibilityCalculation"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Currency in Financial commitments")
	public void user_6047_verify_the_currency_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Currency"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Remarks in Financial commitments")
	public void user_6047_verify_the_remarks_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Remarks"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Next Due date in Financial commitments")
	public void user_6047_verify_the_next_due_date_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("NextDueDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Collateral Type in Financial commitments")
	public void user_6047_verify_the_collateral_type_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CollateralType"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Closed Date in Financial commitments")
	public void user_6047_verify_the_closed_date_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ClosedDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Frequency in Financial commitments")
	public void user_6047_verify_the_frequency_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Frequency"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Last Payment Amount in Financial commitments")
	public void user_6047_verify_the_last_payment_amount_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("LastPaymentAmount"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Last Payment Date in Financial commitments")
	public void user_6047_verify_the_last_payment_date_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("LastPaymentDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Product Name in Financial commitments")
	public void user_6047_verify_the_product_name_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ProductName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Balance Transfer Flag in Financial commitments")
	public void user_6047_verify_the_balance_transfer_flag_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("BalanceTransferFlag"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Last 24 Cycle in Financial commitments")
	public void user_6047_verify_the_last_24_cycle_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Last24Cycle"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Loan Status in Financial commitments")
	public void user_6047_verify_the_loan_status_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FacilityStatus"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Remaining Tenure \\(months) in Financial commitments")
	public void user_6047_verify_the_remaining_tenure_months_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Disbursement Date in Financial commitments")
	public void user_6047_verify_the_disbursement_date_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Disbursementdate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the NPA CLASSIFICATION in Financial commitments")
	public void user_6047_verify_the_npa_classification_in_financial_commitments() {
		for (int i = 0; i < 100; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("NPAClassification"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 click the Save Button")
	public void user_6047_click_the_save_button() {
		for (int i = 0; i <200; i++) {
			try {
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("save_button"))).build().perform();
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("save_button")).click();
				break;
//				javascriptHelper.JSEClick(
//						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("save_button")));

				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the successfully saved message popup")
	public void user_6047_verify_the_successfully_saved_message_popup() {
		for (int i = 0; i <100; i++) {
	        try {
	        	String text = javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("SucessPopUP")).getText();
	        	System.out.println(text);
	            Assert.assertTrue(text.contains("Success!"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
		
	}
	@Then("User_6047 Select the value for finance type")
	public void user_6047_select_the_value_for_finance_type() {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).click();
				break;
			} catch (Exception e) {
				if (i == 200) {
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Finance type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance type")).trim())) {
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
	@Then("User_6047 Select the value for Financial Institution")
	public void user_6047_select_the_value_for_financial_institution() {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialInstitution")).click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Financial Institution").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Financial Institution")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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
	@Then("User_6047 Enter the value for sanction amount")
	public void user_6047_enter_the_value_for_sanction_amount() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionAmount_input"))
				//.sendKeys("Address2");
				.sendKeys(testData.get("Sanction amount"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Enter the value for tenure\\(months)")
	public void user_6047_enter_the_value_for_tenure_months() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_input"))
				//.sendKeys("Address2");
				.sendKeys(testData.get("Tenure(months)"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Enter the value for installment amount")
	public void user_6047_enter_the_value_for_installment_amount() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input"))
				//.sendKeys("Address2");
				.sendKeys(testData.get("Installment amount"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Enter the value for remaining tenure\\(months)")
	public void user_6047_enter_the_value_for_remaining_tenure_months() {
		for (int i = 0; i <= 150; i++) {
			try {
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input"))).build().perform();
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input"))
				//.sendKeys("Address2");
				.sendKeys(testData.get("Remaining tenure(months)"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_6047 modify and verify the system should allow user to modification with valid data")
	public void user_6047_verify_the_system_should_allow_user_to_modification_with_valid_data() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input"))
				//.sendKeys("Address2");
				.sendKeys(testData.get("modified data(Installment amount)"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Click the edit button of Financial commitments")
	public void user_6047_click_the_edit_button_of_financial_commitments() throws Throwable {
		Thread.sleep(2000);
		String length =null;
		for (int i = 0; i <=150; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
		for (int i = 0; i <=150; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Financial Commitments")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[ng-reflect-icon=\"pi pi-pencil\"]')";
					System.out.println(jspath);
					WebElement editButton = javascriptHelper.executeScriptWithWebElement(jspath);
					//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
					actions.scrollToElement(editButton).build().perform();
				//	javascriptHelper.JSEClick(editButton);
					editButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==150) {
				Assert.fail(e.getMessage());
			}
		}
		}
		
	}

	@Then("User_6047 verify The same record should get saved in a system")
	public void user_6047_verify_the_same_record_should_get_saved_in_a_system() {
	String AddressType= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input_Verify")).getAttribute("ng-reflect-model");
		
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(AddressType.contains(testData.get("modified data(Installment amount)")));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 to click the back button in financial commitment")
public void user_6047_to_click_the_back_button_in_financial_commitment( ) {
		for (int i = 0; i <= 100; i++) {
			try {
				actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("backButton"))).build().perform();
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("backButton")));

				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
}
	@Then("User_6047 verify the functionality of back button in financial commitment")
	public void user_6047_verify_the_functionality_of_back_button_in_financial_commitment() throws InterruptedException {
		Thread.sleep(700);
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
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.isDisplayed();
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
	@Then("User_6047 Verify the field Finance Type should be mandatory and allow select any value from LOV")
	public void user_verify_the_field_finance_type_should_be_mandatory_and_allow_select_any_value_from_lov() throws Throwable {
		Thread.sleep(2000);
		String FinanceType= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).getAttribute("aria-label");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(FinanceType.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Finance type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance type")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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

	@Then("User_6047 Verify the field Financial Institution should be Non-mandatory and allow select any value from LOV")
	public void user_verify_the_field_financial_institution_should_be_non_mandatory_and_allow_select_any_value_from_lov() {
		String FinancialInstitution= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialInstitution")).getAttribute("aria-label");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(FinancialInstitution.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialInstitution")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Financial Institution").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Financial Institution")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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

	@Then("User_6047 Verify the field Account Number should be Non-mandatory textbox and allow user to only positive numeric value")
	public void user_verify_the_field_account_number_should_be_non_mandatory_textbox_and_allow_user_to_only_positive_numeric_value() {
		String AccountNumber= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AccountNumber")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(AccountNumber.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String AccountNumber_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AccountNumber_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(AccountNumber_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AccountNumber_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AccountNumber_input"))
						.sendKeys(testData.get("Account number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Then("User_6047 Verify the field Sanction Date should be Non-mandatory and date")
	public void user_verify_the_field_sanction_date_should_be_non_mandatory_and_date() {
		String SanctionDate= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionDate")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(SanctionDate.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String SanctionDate_date= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionDate_dateVerify")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(SanctionDate_date.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Sanction Amount should be mandatory,textbox and allow user to enter only positive numeric value")
	public void user_verify_the_field_sanction_amount_should_be_mandatory_textbox_and_allow_user_to_enter_only_positive_numeric_value() {
		String SanctionAmount= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionAmount")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(SanctionAmount.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String SanctionAmount_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionAmount_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(SanctionAmount_text.contains("number"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionAmount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionAmount_input"))
						.sendKeys(testData.get("Sanction amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field interest Rate should be Non-mandatory,textbox and allow user to enter only positive numeric value")
	public void user_verify_the_field_interest_rate_should_be_non_mandatory_textbox_and_allow_user_to_enter_only_positive_numeric_value() {
		String interestRate= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InterestRate")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(interestRate.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String InterestRate_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InterestRate_Typeverify")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(InterestRate_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InterestRate_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InterestRate_input"))
						.sendKeys(testData.get("Interest Rate"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field Current Principal Balance should be Non-mandatory,textbox and allow user to enter only positive numeric value")
	public void user_verify_the_field_current_principal_balance_should_be_non_mandatory_textbox_and_allow_user_to_enter_only_positive_numeric_value() throws Throwable {
		Thread.sleep(2000);
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CurrentPrincipalBalance"))).build().perform();
		String CurrentPrincipalBalance= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CurrentPrincipalBalance")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(CurrentPrincipalBalance.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String CurrentPrincipalBalance_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CurrentPrincipalBalance_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(CurrentPrincipalBalance_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CurrentPrincipalBalance_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CurrentPrincipalBalance_input"))
						.sendKeys(testData.get("CurrentPrincipalBalance"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field Tenure\\(months) should be mandatory,textbox and allow user to enter only positive numeric value")
	public void user_verify_the_field_tenure_months_should_be_mandatory_textbox_and_allow_user_to_enter_only_positive_numeric_value() {
		String Tenure= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(Tenure.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String AccountNumber_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(AccountNumber_text.contains("number"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_input"))
						.sendKeys(testData.get("Tenure(months)"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field Maturity Date should be Non-mandatory,date")
	public void user_verify_the_field_maturity_date_should_be_non_mandatory_date() {
		String MaturityDate= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("MaturityDate")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(MaturityDate.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String MaturityDate_date= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("MaturityDate_dateverify")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(MaturityDate_date.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Installment Amount should be mandatory,textbox and allow user to enter only positive numeric value")
	public void user_verify_the_field_installment_amount_should_be_mandatory_textbox_and_allow_user_to_enter_only_positive_numeric_value() {
		String InstallmentAmount= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(InstallmentAmount.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String InstallmentAmount_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(InstallmentAmount_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input"))
						.sendKeys(testData.get("Installment amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field Amount Considered should be Non-mandatory,textbox and allow user to enter only positive numeric value")
	public void user_verify_the_field_amount_considered_should_be_non_mandatory_textbox_and_allow_user_to_enter_only_positive_numeric_value() {
		String AmountConsidered= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AmountConsidered")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(AmountConsidered.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String AmountConsidered_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AmountConsidered_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(AmountConsidered_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AmountConsidered_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AmountConsidered_input"))
						.sendKeys(testData.get("AmountConsidered"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field Currency should be Non-mandatory and allow select any value from LOV")
	public void user_verify_the_field_currency_should_be_non_mandatory_and_allow_select_any_value_from_lov() {
		String Currency= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Currency")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(Currency.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Currency")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Currency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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

	@Then("User_6047 Verify the field Remarks should be Non-mandatory,textbox")
	public void user_verify_the_field_remarks_should_be_non_mandatory_textbox() {
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Remarks"))).build().perform();
		String Remarks= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Remarks")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(Remarks.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Remarks_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("AmountConsidered_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(Remarks_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
	}

	@Then("User_6047 Verify the field Next Due date should be Non-mandatory and date")
	public void user_verify_the_field_next_due_date_should_be_non_mandatory_and_date() {
		String NextDueDate= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("NextDueDate")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(NextDueDate.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String SanctionDate_date= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("NextDueDate_calenderVerify")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(SanctionDate_date.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Collateral Type should be Non-mandatory and allow select any value from LOV")
	public void user_verify_the_field_collateral_type_should_be_non_mandatory_and_allow_select_any_value_from_lov() {
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CollateralType"))).build().perform();
		String CollateralType= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CollateralType")).getAttribute("aria-label");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(CollateralType.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("CollateralType")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("CollateralType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("CollateralType")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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

	@Then("User_6047 Verify the field Closed Date should be Non-mandatory and date")
	public void user_verify_the_field_closed_date_should_be_non_mandatory_and_date() {
		String ClosedDate= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ClosedDate")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(ClosedDate.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String ClosedDate_date= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ClosedDate_calenderVerify")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(ClosedDate_date.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Last Payment Amount should be Non-mandatory and textbox")
	public void user_verify_the_field_last_payment_amount_should_be_non_mandatory_and_textbox() {
		String LastPaymentAmount= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("LastPaymentAmount")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(LastPaymentAmount.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String LastPaymentAmount_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("LastPaymentAmount_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(LastPaymentAmount_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Product Name should be Non-mandatory and textbox")
	public void user_verify_the_field_product_name_should_be_non_mandatory_and_textbox() {
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ProductName"))).build().perform();
		String ProductName= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ProductName")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(ProductName.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String ProductName_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("ProductName_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(ProductName_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Last24 Cycle should be Non-mandatory and textbox")
	public void user_6047_verify_the_field_last24_cycle_should_be_non_mandatory_and_textbox() throws Throwable {
		Thread.sleep(2000);
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Last24Cycle"))).build().perform();
		String Last24Cycle= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Last24Cycle")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(Last24Cycle.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Last24Cycle_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Last24Cycle_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(Last24Cycle_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Balance Transfer Flag should be Non-mandatory and toggle button")
	public void user_6047_verify_the_field_balance_transfer_flag_should_be_non_mandatory_and_toggle_button() {
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("BalanceTransferFlag"))).build().perform();
		String Remarks= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("BalanceTransferFlag")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(Remarks.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String Remarks_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("BalanceTransferFlag_toggle")).getAttribute("role");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(Remarks_text.contains("switch"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Facility Status should be Non-mandatory and dropdown")
	public void user_6047_verify_the_field_facility_status_should_be_non_mandatory_and_dropdown() {
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FacilityStatus"))).build().perform();
		String FacilityStatus= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FacilityStatus")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(FacilityStatus.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FacilityStatus")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Fasility status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Fasility status")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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

	@Then("User_6047 Verify the field Remaining Tenure\\(months) should be mandatory and textbox and allow user to enter only positive numeric value")
	public void user_6047_verify_the_field_remaining_tenure_months_should_be_mandatory_and_textbox_and_allow_user_to_enter_only_positive_numeric_value() {
		String InstallmentAmount= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(InstallmentAmount.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String InstallmentAmount_text= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input")).getAttribute("type");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(InstallmentAmount_text.contains("text"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input"))
						.sendKeys(testData.get("Remaining tenure(months)"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Verify the field Disbursement Date should be Non-mandatory and date")
	public void user_6047_verify_the_field_disbursement_date_should_be_non_mandatory_and_date() {
		String SanctionDate= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionDate")).getText();
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(!(SanctionDate.contains("*")));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		String SanctionDate_date= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("SanctionDate_dateVerify")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(SanctionDate_date.contains("pi pi-calendar"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
	}

	@Then("User_6047 Verify the field Request for Balance Takeover should be Non-mandatory and dropdown")
	public void user_6047_verify_the_field_request_for_balance_takeover_should_be_non_mandatory_and_dropdown() {
		String FinanceType= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).getAttribute("aria-label");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(FinanceType.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Finance type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance type")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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

	@Then("User_6047 Verify the field NPA CLASSIFICATION should be Non-mandatory and dropdown")
	public void user_verify_6047_the_field_npa_classification_should_be_non_mandatory_and_dropdown() {
		String FinanceType= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).getAttribute("aria-label");
		for (int i = 0; i <100; i++) {
	        try {
	            Assert.assertTrue(FinanceType.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==99) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).click();
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 150; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 150; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 150 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("Finance type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance type")).trim())) {
				for (int k = 0; k <= 150; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 150) {
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
	@Then("User_6047 verify the popup of fill all field")
	public void user_verify_the_popup_of_fill_all_field() throws Throwable {
		
		for (int i = 0; i <200; i++) {
	        try {
	        	String text = javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("PleaseFillDetails_Popup")).getText();
	        	System.out.println(text);
	            Assert.assertTrue(text.contains("Please fill all the details"));
	            break;
	        } catch (Exception e) {
	            if (i==199) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}

@Then("User_6047 Enter the characters value in numeric field in Financial commitments\\(Tenure months)")
public void user_6047_enter_the_characters_value_in_numeric_field_in_financial_commitments_tenure_months() {
	for (int i = 0; i <= 300; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_input"))
					.sendKeys("fghgfh");
	//		testData.get("Character value")
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User-6047 Verify the impact of character value in numeric field Financial commitments")
public void user_6047_verify_the_impact_of_character_value_in_numeric_field_financial_commitments() {
	String CharacterValidation = "";
	
	for (int i = 0; i <200; i++) {
		try {
			CharacterValidation= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_inputValidation")).getAttribute("ng-reflect-model");
		//	Assert.assertTrue(CharacterValidation.isBlank()||CharacterValidation.isEmpty());
			if (CharacterValidation==null) {
				System.err.println("Field empty");
			}
			else {
				System.err.println("Field not empty");
			}
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	
}

@Then("User_6047 Enter the characters value in any field Financial commitments")
public void user_6047_enter_the_characters_value_in_any_field_financial_commitments() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User_6047 Verify the impact of characters value in any field Financial commitments")
public void user_6047_verify_the_impact_of_characters_value_in_any_field_financial_commitments() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User_6047 Modify the data in Financial commitments")
public void user_6047_modify_the_data_in_financial_commitments() {
	for (int i = 0; i <= 150; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input"))
			//.sendKeys("Address2");
			.sendKeys(testData.get("modified data(Installment amount)"));
			break;
		} catch (Exception e) {
			if (i == 150) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the System should allow user to modify the Customer Personal Information")
public void user_6047_verify_the_system_should_allow_user_to_modify_the_customer_personal_information() {
	for (int i = 0; i <100; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("SucessPopUP")).getText();
        	System.out.println(text);
            Assert.assertTrue(text.contains("Success!"));
            break;
        } catch (Exception e) {
            if (i==99) {
                Assert.fail(e.getMessage());
            }
        }
	}
}

@Then("User_6047 modify with valid data in Financial commitments field\\(Remaining tenure)")
public void user_6047_modify_with_valid_data_in_financial_commitments_field_Remaining_tenure() {
	for (int i = 0; i <= 150; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input"))).build().perform();
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_input"))
			//.sendKeys("Address2");
			.sendKeys(testData.get("modification with valid data(remaining month)"));
			break;
		} catch (Exception e) {
			if (i == 150) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the same record should get saved in the system")
public void user_6047_verify_the_same_record_should_get_saved_in_the_system() {
	String modifiedData = "";
	for (int i = 0; i <= 100; i++) {
		
		try {
			 modifiedData= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("RemainingTenure_Months_inputverify"))
					.getAttribute("ng-reflect-model");
		

			System.out.println(modifiedData);
			if (!(modifiedData.isBlank())) {
				
				break;
			}
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
	
	Assert.assertEquals(testData.get("modification with valid data(remaining month)"), modifiedData.trim());
}

@Then("User_6047 Delete the mandatory data in Financial commitments field")
public void user_6047_delete_the_mandatory_data_in_financial_commitments_field() {
	for (int i = 0; i <= 300; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
		
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the validation message for blank field")
public void user_6047_verify_the_validation_message_for_blank_field() {
	
	for (int i = 0; i <200; i++) {
        try {
        	String text = javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("PleaseFillDetails_Popup")).getText();
        	System.out.println(text);
            Assert.assertTrue(text.contains("Please fill all the details"));
            break;
        } catch (Exception e) {
            if (i==199) {
                Assert.fail(e.getMessage());
            }
        }
	}
}

@Then("User_6047 modify with invalid data in Financial commitments field")
public void user_6047_modify_with_invalid_data_in_financial_commitments_field() {
	for (int i = 0; i <= 300; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("InstallmentAmount_input"))
					.sendKeys(testData.get("Character value"));
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Verify the validation message for invalid data Financial commitments screen")
public void user_6047_verify_the_validation_message_for_invalid_data_financial_commitments_screen() {
String CharacterValidation = "";
	
	for (int i = 0; i <200; i++) {
		try {
			CharacterValidation= javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Tenure(months)_inputValidation")).getAttribute("ng-reflect-model");
		//	Assert.assertTrue(CharacterValidation.isBlank()||CharacterValidation.isEmpty());
			if (CharacterValidation==null) {
				System.err.println("Field empty");
			}
			else {
				System.err.println("Field not empty");
			}
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 to click the back button in modification of financial commitment record")
public void user_6047_to_click_the_back_button_in_modification_of_financial_commitment_record() {
	for (int i = 0; i <= 100; i++) {
		try {
			actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("backButton"))).build().perform();
			javascriptHelper.JSEClick(
					javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("backButton")));

			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the functionality of back button in modification of financial commitment record")
public void user_6047_verify_the_functionality_of_back_button_in_modification_of_financial_commitment_record() throws Throwable {
	Thread.sleep(700);
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
						javascriptHelper
						.scrollIntoView(
								javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
								.isDisplayed();
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
@Then("User_6047 verify the Export to PDF,XLS in financial commitments list view")
public void user_6047_verify_the_export_to_pdf_in_financial_commitments_list_view() {
	String sectionLength = "";
	boolean isClicked = false;
	for (int i = 0; i <= 200; i++) {
		try {
			sectionLength = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
					.toString();
			if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
				break;
			}
		} catch (Exception e) {

		}
	}
	int premitiveSectionLength = Integer.parseInt(sectionLength);
	for (int i = 1; i <= premitiveSectionLength; i++) {
		String sectionName = javascriptHelper.executeScript(
				"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText")
				.toString();
		System.out.println("Section Name " + sectionName + " i value " + i);
		int sectionIndex = i;
		if (sectionName.equals("Financial Commitments")) {

			for (int l = 0; l <= 100; l++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
									+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
							.click();
					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isClicked == true) {
				break;
			}
		}
		if (isClicked == true) {
			break;
		}
	}

	for (int i = 0; i <= 100; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("pdf_download")).isDisplayed();
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("xls_download")).isDisplayed();
			break;
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}

}
@Then("User_6047 verify the search botton in financial commitments list view")
public void user_6047_verify_the_search_botton_in_financial_commitments_list_view() {
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
					if ((addButtonScreenName.trim()).equalsIgnoreCase(("Address Details").trim())) {
						System.out.println("Inside nested loop");
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
						javascriptHelper
						.scrollIntoView(
								javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-search\"')[" + j + "]")
								.isDisplayed();
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
@And("User_6047 verify the add botton in financial commitments list view")
public void user_6047_verify_the_add_botton_in_financial_commitments_list_view() {
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
						javascriptHelper
						.scrollIntoView(
								javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
								.isDisplayed();
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

@Then("User_6047 verify the Edit botton in financial commitments list view")
public void user_6047_verify_the_edit_botton_in_financial_commitments_list_view() throws Throwable {
	Thread.sleep(700);
	String length =null;
	for (int i = 0; i <500; i++) {
		try {
		    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
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
			String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Financial Commitments")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('button[icon=\"pi pi-pencil\"')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				//javascriptHelper.JSEClick(addButton);
				addButton.isDisplayed();
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
@Then("User_6047 verify list view fields are shown in financial commitments list view")
public void user_6047_verify_list_view_fields_are_shown_in_financial_commitments_view() {
	String fieldName = "";
	String query = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[2].innerText";
	int screenLocation;
	String sectionLength = "";
	boolean isClicked = false;
	for (int i = 0; i <= 200; i++) {
		try {
			sectionLength = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
					.toString();
			if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
				break;
			}
		} catch (Exception e) {

		}
	}
	int premitiveSectionLength = Integer.parseInt(sectionLength);
	for (int i = 1; i <= premitiveSectionLength; i++) {
		String sectionName = "";
		for (int j = 0; j <= 200; i++) {
			try {
				sectionName = javascriptHelper.executeScript(
						"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
								+ i + "].innerText")
						.toString();
				System.out.println("Section Name " + sectionName + " i value " + i);
				if (!(sectionName.isEmpty())) {
					System.out.println("J loop got breaked");
					break;
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (sectionName.equals("Financial Commitments")) {
			// document.querySelectorAll('thead[class="p-datatable-thead"]')[3].innerText
			System.out.println(
					"document.querySelectorAll('thead[class=\"p-datatable-thead\"]')[" + (i + 1) + "].innerText");
			for (int l = 0; l <= 20; l++) {
				try {
					fieldName = javascriptHelper.executeScript(
							"return document.querySelectorAll('thead[class=\"p-datatable-thead\"]')[" + (i + 1)
									+ "].innerText")
							.toString();
					System.out.println(fieldName);
					if (!(fieldName.isBlank())) {

						System.out.println("l loop got breaked ");
						break;
					}
				} catch (Exception e) {
					if (l == 20) {
						Assert.fail(e.getMessage());
					}
				}
			}

			if (!(fieldName.isEmpty())) {
				System.out.println(fieldName);

				isClicked = true;
				break;
			}

		}
		if (isClicked == true)

		{
			break;
		}
	}
	System.out.println("Field Name " + fieldName);
	Assert.assertTrue(fieldName.contains("Action"));
	Assert.assertTrue(fieldName.contains("Financial Institution"));
	Assert.assertTrue(fieldName.contains("Loan Amount"));
	Assert.assertTrue(fieldName.contains("Installment Amount"));
	Assert.assertTrue(fieldName.contains("Tenure (months)"));
	Assert.assertTrue(fieldName.contains("Loan Amount"));
	Assert.assertTrue(fieldName.contains("Next Due date"));
	Assert.assertTrue(fieldName.contains("Current Principal Balance"));
	Assert.assertTrue(fieldName.contains("Currency"));

	Assert.assertTrue(fieldName.contains("Status"));
}
@Then("User_6047 To verify Values in List view should be non editable")

public void user_6047_to_verify_values_in_list_view_should_be_non_editable() {

	boolean statusOfListViewRecord = false;
	String listViewQuery = "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').length";
	String listViewName = "";
	String noOfListView = "";

	boolean isIndexFound = false;
	for (int i = 0; i <= 300; i++) {
		try {
			noOfListView = javascriptHelper.executeScript("return " + listViewQuery).toString();
			if (noOfListView.equals("0") && !(noOfListView.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	System.out.println("No Of List view " + noOfListView);
	int premitivListViews = Integer.parseInt(noOfListView);
	for (int i = 0; i < premitivListViews; i++) {
		for (int j = 0; j <= 100; j++) {
			try {
				listViewName = javascriptHelper.executeScript("return "
						+ "document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
						+ i + "].innerText").toString();
				if (listViewName.contains("Financial Commitments")) {

					//indexOfListView = i;

					isIndexFound = true;
					break;
				} else {

					isIndexFound = false;
					break;
				}
			} catch (Exception e) {
				if (j == 100) {
					Assert.fail(e.getMessage());
				}

			}
		}
		if (isIndexFound == true) {
			break;
		}

	}

	for (int i = 0; i <= 50; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(
					"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
							+ indexOfListView + "].querySelector('p-tag')")
					.click();
			if (i > 40) {
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["
								+ indexOfListView + "].querySelector('p-tag')")
						.sendKeys(Keys.PAGE_DOWN);
			}
		} catch (Exception e) {
			if (i == 50) {
				statusOfListViewRecord = true;
			}
		}
	}
	System.out.println(statusOfListViewRecord);
	Assert.assertTrue(statusOfListViewRecord);

}
@And("User_6047 To verify the Add button allow user to create new record of Financial commitments")
public void user_6047_to_verify_the_add_button_allow_user_to_create_new_record_of_Financial_commitments() throws Throwable {
	Thread.sleep(3000);
	for (int i = 0; i <= 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("FinancialType")).click();
			break;
		} catch (Exception e) {
			if (i == 200) {
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
						"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
		System.out.println("Map " + testData.get("Finance type").trim());
		if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance type")).trim())) {
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
@And("User_6047 click the Search button under Financial commitments and search the matching data in listview")
public void user_6047_click_the_search_button_under_financial_commitments_and_search_the_matching_data_in_listview() {
	String length =null;
	for (int i = 0; i <500; i++) {
		try {
		    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
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
			String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Financial Commitments")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('button[icon=\"pi pi-search\"]')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				javascriptHelper.JSEClick(addButton);
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('input')")
				.sendKeys(testData.get("matching_value"));
			//	addButton.click();
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
@And("User_6047 verify the match result data in Financial commitments list view")

public void user_6047_verify_the_match_result_data_in_financial_commitments_list_view() {
	String searchResult = "";
	String length =null;
	for (int i = 0; i <500; i++) {
		try {
		    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
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
			String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Address Details")) {
				System.out.println("condition true");
				searchResult = javascriptHelper.executeScript("return " + iJarah_CommonElements
						.getElement("list_view_search_result")).toString();
				System.out.println(searchResult);
			//	addButton.click();
				if (!(searchResult.isEmpty())) {
					break;
				}
			}
		}

		break;
	} catch (Exception e) {
		if (i==499) {
			Assert.fail(e.getMessage());
		}
	}
	}
	softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
			"system is not showing the matched result");
}
@And("User_6047 click the Search button under Financial commitments tab and search the mismatching data in listview")
public void user_6047_click_the_search_button_under_financial_commitments_tab_and_search_the_mismatching_data_in_listview() {
	String length =null;
	for (int i = 0; i <500; i++) {
		try {
		    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
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
			String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Address Details")) {
				System.out.println("condition true");
				String jspath ="document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('button[icon=\"pi pi-search\"]')";
				WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
				//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(jspath));
				javascriptHelper.JSEClick(addButton);
				javascriptHelper
				.executeScriptWithWebElement(
						"document.querySelectorAll('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]')["+j+"].querySelector('input')")
				.sendKeys(testData.get("mismatching_value"));
			//	addButton.click();
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

@And("User_6047 verify the mismatch result in Financial commitments list view")
public void user_6047_verify_the_mismatch_result_in_financial_commitments_list_view() {
	String searchResult = "";
	String length =null;
	for (int i = 0; i <300; i++) {
		try {
		    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
		    System.out.println(length);
			if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
				break;
			}
		} catch (Exception e) {
			if (i==299) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <300; i++) {
	try {
		for (int j = 0; j <Integer.parseInt(length); j++) {
			String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
			String titlename = javascriptHelper.executeScript(title).toString();
			System.out.println(titlename);
			if (titlename.trim().contains("Address Details")) {
				System.out.println("condition true");
				searchResult = javascriptHelper.executeScript("return " + iJarah_CommonElements
						.getElement("list_view_search_result")).toString();
				System.out.println(searchResult);
			//	addButton.click();
				if (!(searchResult.isEmpty())) {
					break;
				}
			}
		}

		break;
	} catch (Exception e) {
		if (i==299) {
			Assert.fail(e.getMessage());
		}
	}
	}
	softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
			"system is  showing the un matched result");
}


@Then("User_6047 click the Export button in Financial commitments")
public void user_6047_click_the_export_button_in_financial_commitments() {
	String sectionLength = "";
	boolean isClicked = false;
	for (int i = 0; i <= 200; i++) {
		try {
			sectionLength = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
					.toString();
			if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
				break;
			}
		} catch (Exception e) {

		}
	}
	int premitiveSectionLength = Integer.parseInt(sectionLength);
	for (int i = 1; i <= premitiveSectionLength; i++) {
		String sectionName = javascriptHelper.executeScript(
				"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText")
				.toString();
		System.out.println("Section Name " + sectionName + " i value " + i);
		int sectionIndex = i;
		if (sectionName.equals("Financial Commitments")) {

			for (int l = 0; l <= 100; l++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
									+ (i + 1) + "].querySelector('p-dropdown[placeholder=\"Export\"]')")
							.click();
					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isClicked == true) {
				break;
			}
		}
		if (isClicked == true) {
			break;
		}
	}

}

@Then("User_6047 click on export to excel button in Financial commitments")
public void user_6047_click_on_export_to_excel_button_in_financial_commitments() {
	String sectionLength = "";
	boolean isClicked = false;
	for (int i = 0; i <= 200; i++) {
		try {
			sectionLength = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
					.toString();
			if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
				break;
			}
		} catch (Exception e) {

		}
	}
	int premitiveSectionLength = Integer.parseInt(sectionLength);
	for (int i = 1; i <= premitiveSectionLength; i++) {
		String sectionName = javascriptHelper.executeScript(
				"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText")
				.toString();
		System.out.println("Section Name " + sectionName + " i value " + i);
		int sectionIndex = i;
		if (sectionName.equals("Financial Commitments")) {

			for (int l = 0; l <= 100; l++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
					
					"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
											+ (i + 1) + "].querySelector('p-dropdownitem[ng-reflect-label=\"PDF\"]')")
							.click();
					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isClicked == true) {
				break;
			}
		}
		if (isClicked == true) {
			break;
		}
	}

}

@Then("User_6047 verify the system  downloading the excel file in Financial commitments")
public void user_6047_verify_the_system_downloading_the_excel_file_in_financial_commitments() {
	String homePath = System.getProperty("user.home");
	String filePath = homePath + "/Downloads";
	File file = new File(filePath);
	File[] listFiles = file.listFiles();
	file.delete();
	for (File downloadsFile : listFiles) {
		System.out.println(downloadsFile.getName());
		if (downloadsFile.getName().contains("CustomerDebtDataFile_export_")) {
			System.out.println("If condition " + downloadsFile.getName());
			softAssert.assertTrue(downloadsFile.getName().contains("CustomerDebtDataFile_export_"),
					"File is not downloaded hence failed");
			downloadsFile.delete();
		}
	}
}

@Then("User_6047 verify the system downloading the pdf file")
public void user_6047_verify_the_system_downloading_the_pdf_file() {
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
					"File is not downloaded hence failed");
			downloadsFile.delete();
		}
	}
}
@Then("User_6047 click on export to pdf button in Financial commitments")
public void user_6047_click_on_export_to_pdf_button_in_financial_commitments() {
	String sectionLength = "";
	boolean isClicked = false;
	for (int i = 0; i <= 200; i++) {
		try {
			sectionLength = javascriptHelper.executeScript(
					"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length")
					.toString();
			if (!(sectionLength.isBlank()) && sectionLength.equals("0")) {
				break;
			}
		} catch (Exception e) {

		}
	}
	int premitiveSectionLength = Integer.parseInt(sectionLength);
	for (int i = 1; i <= premitiveSectionLength; i++) {
		String sectionName = javascriptHelper.executeScript(
				"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText")
				.toString();
		System.out.println("Section Name " + sectionName + " i value " + i);
		int sectionIndex = i;
		if (sectionName.equals("Financial Commitments")) {

			for (int l = 0; l <= 100; l++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
					
					"document.querySelectorAll('ion-card-content[class=\"k-pagescreen p-0 ios card-content-ios hydrated\"]')["
											+ (i + 1) + "].querySelector('p-dropdownitem[ng-reflect-label=\"XLS\"]')")
							.click();
					isClicked = true;
					break;
				} catch (Exception e) {
					if (l == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isClicked == true) {
				break;
			}
		}
		if (isClicked == true) {
			break;
		}
	}
}

@Then("User_6047 change the financial commitmet status to active to inactive or inactive to active")
public void user_6047_change_the_financial_commitmet_status_to_active_to_inactive_or_inactive_to_active() {
	for (int i = 0; i <= 300; i++) {
		try {
			javascriptHelper.scrollIntoView(javascriptHelper
					.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Status")));
			javascriptHelper
					.executeScriptWithWebElement(ADE_FinancialCommitmentJSPath.getElement("Status_toggle"))
					.click();
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}


	for (int i = 0; i <= 100; i++) {
		try {
			recordStatus = javascriptHelper
					.executeScript(
							"return " + ADE_FinancialCommitmentJSPath.getElement("Status_current"))
					.toString();
		} catch (Exception e) {

		}
	}
}
@Then("User_6047 verify system should show the record status as active or inactive based on toggle")
public void verify_6047_system_should_show_the_record_status_as_active_or_inactive_based_on_toggle() throws Throwable {
	Thread.sleep(1000);
	// System.out.println("Index value in list view record validation " +
	// indexOfListView);
	for (int i = 0; i <= 300; i++) {
		try {
			if (i > 250) {
				System.out.println(
						"document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText");
				listViewRecordStatus = javascriptHelper.executeScript(
						"return document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
						.toString();

				System.out.println("List view Record status " + listViewRecordStatus);
				if (!(listViewRecordStatus.isEmpty())) {
					break;
				}
			}
		} catch (Exception e) {
			if (i == 3000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	if (recordStatus.equals("false")) {
		softAssert.assertEquals(listViewRecordStatus, "In-active");
	} else if (recordStatus.equals("true")) {
		softAssert.assertEquals(listViewRecordStatus, "Active");
	}
	Thread.sleep(1500);
}



	}
