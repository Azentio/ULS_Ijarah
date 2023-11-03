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

public class Murabaha_Steps {	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "DataCheckAppDetails_Elements", "DataCheckAppDetails_FieldName", "JSPath");
	JSPaths appData_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName", "JSPath");
	
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
	
	ExcelData AppDataCFDebtExcelData  = new ExcelData(excelTestDataPath,"MU_AppData_CFDebt","DataSet ID");
	ExcelData DataCheckAppDetailsExcelData  = new ExcelData(excelTestDataPath,"MU_DataCheck_AppDetails","DataSet ID");
	ExcelData AppDataIncomeExcelData  = new ExcelData(excelTestDataPath,"MU_AppData_Income","DataSet ID");
	
	
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	
//	Murabaha -- App Data Entry -- Customer Debt screen
	@And("^User_608 get the test data for test case AT_MCUD_01$")
    public void get_the_test_data_for_test_case_AT_MCUD_01() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_01");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_02$")
    public void get_the_test_data_for_test_case_AT_MCUD_02() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_02");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_03$")
    public void get_the_test_data_for_test_case_AT_MCUD_03() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_03");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_05$")
    public void get_the_test_data_for_test_case_AT_MCUD_05() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_05");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_06$")
    public void get_the_test_data_for_test_case_AT_MCUD_06() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_06");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_07$")
    public void get_the_test_data_for_test_case_AT_MCUD_07() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_07");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_08$")
    public void get_the_test_data_for_test_case_AT_MCUD_08() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_08");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_11$")
    public void get_the_test_data_for_test_case_AT_MCUD_11() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_11");
    }
	
	@And("^User_608 get the test data for test case AT_MCUD_12$")
    public void get_the_test_data_for_test_case_AT_MCUD_12() throws Throwable {
		testData = AppDataCFDebtExcelData.getTestdata("DS_AT_MCUD_12");
    }
	
//	Murabaha -- Data Check -- Application Details screen
	@And("^User_608 get the test data for test case AT_MU_AD_01$")
    public void get_the_test_data_for_test_case_AT_MU_AD_01() throws Throwable {
		testData = DataCheckAppDetailsExcelData.getTestdata("DS_AT_MU_AD_01");
    }
	
	@And("^User_608 get the test data for test case AT_MU_AD_02$")
    public void get_the_test_data_for_test_case_AT_MU_AD_02() throws Throwable {
		testData = DataCheckAppDetailsExcelData.getTestdata("DS_AT_MU_AD_02");
    }
	
	@And("^User_608 get the test data for test case AT_MU_AD_03$")
    public void get_the_test_data_for_test_case_AT_MU_AD_03() throws Throwable {
		testData = DataCheckAppDetailsExcelData.getTestdata("DS_AT_MU_AD_03");
    }
	
	@And("^User_608 get the test data for test case AT_MU_AD_04$")
    public void get_the_test_data_for_test_case_AT_MU_AD_04() throws Throwable {
		testData = DataCheckAppDetailsExcelData.getTestdata("DS_AT_MU_AD_04");
    }
	
	@And("^User_608 get the test data for test case AT_MU_AD_05$")
    public void get_the_test_data_for_test_case_AT_MU_AD_05() throws Throwable {
		testData = DataCheckAppDetailsExcelData.getTestdata("DS_AT_MU_AD_05");
    }
	
	
//	Murabaha -- App Data Entry -- Income Details screen
	@And("^User_608 get the test data for test case AT_MU_INC_01$")
    public void get_the_test_data_for_test_case_AT_MU_INC_01() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_01");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_02$")
    public void get_the_test_data_for_test_case_AT_MU_INC_02() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_02");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_03$")
    public void get_the_test_data_for_test_case_AT_MU_INC_03() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_03");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_04$")
    public void get_the_test_data_for_test_case_AT_MU_INC_04() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_04");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_05$")
    public void get_the_test_data_for_test_case_AT_MU_INC_05() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_05");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_06$")
    public void get_the_test_data_for_test_case_AT_MU_INC_06() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_06");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_07$")
    public void get_the_test_data_for_test_case_AT_MU_INC_07() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_07");
    }
	
	@And("^User_608 get the test data for test case AT_MU_INC_08$")
    public void get_the_test_data_for_test_case_AT_MU_INC_08() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_08");
    }
	
	
	
	
	
	@And("User_608 search the Ref id under inbox in ULS Application")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput")));
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
	
	
//	AT_MCUD_01
	@And("User_608 verify Finance Type field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_finance_type_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement financeTypeField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField"));
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
	}

	@And("User_608 verify Financial Institution field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_financial_institution_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement financialInstitutionlabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel"));
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
	}

	@And("User_608 verify Account Number field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_account_number_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement accountNumberLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel"));
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
	}

	@And("User_608 verify Sanction Date field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_sanction_date_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement sanctionDataLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel"));
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
	}

	@And("User_608 verify Sanction Amount field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_sanction_amount_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement sanctionAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel"));
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
	}

	@And("User_608 verify Interest Rate % field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_interest_rate_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement interestRateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel"));
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
	}

	@And("User_608 verify Current Principal balance field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_current_principal_balance_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement currentPrincipalBalanceLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel"));
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
	}

	@And("User_608 verify Tenure field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_tenure_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement tenureMonthLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel"));
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
	}

	@And("User_608 verify Maturity Date field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_maturity_date_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement maturityDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel"));
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
	}

	@And("User_608 verify Installment Amount field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_installment_amount_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement installmentAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel"));
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
	}

	@And("User_608 verify Amount considered field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_amount_considered_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel"));
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
	}

	@And("User_608 verify Currency field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_currency_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement currencyLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(currencyLabel);
				javascriptHelper.backgroundColor(currencyLabel);
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Remarks field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_remarks_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement remarksLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel"));
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
	}

	@And("User_608 verify Next Due Date field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_next_due_date_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement nextDueDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel"));
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
	}

	@And("User_608 verify Collateral Type is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_collateral_type_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement collateralTypeLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")));
				javascriptHelper.backgroundColor(collateralTypeLabel);
				Assert.assertTrue(collateralTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Close Date field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_close_date_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement closeDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel"));
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
	}

	@And("User_608 verify Frequency field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_frequency_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel"));
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
	}

	@And("User_608 verify Last payment amount field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_last_payment_amount_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement lastPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel"));
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
	}

	@And("User_608 verify Last payment date field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_last_payment_date_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement lastPaymentDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel"));
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
	}

	@And("User_608 verify Product Name field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_product_name_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement productNameLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel"));
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
	}

	@And("User_608 verify Last24 cycle field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_last24_cycle_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement last24CycleLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel"));
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
	}

	@And("User_608 verify Balance Transfer flag field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_balance_transfer_flag_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement balanceTransferFlagLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel"));
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
	}

	@And("User_608 verify Facility Status field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_facility_status_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement facilityStatusLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel"));
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
	}

	@And("User_608 verify Remaining Tenure field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_remaining_tenure_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement remainingTenureLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel"));
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
	}

	@And("User_608 verify Disbursement Date field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_disbursement_date_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement disbursementDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel"));
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
	}

	@And("User_608 verify Request for Balance Takeover field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_request_for_balance_takeover_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement reqForBalanceTakeoverLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel"));
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
	}

	@And("User_608 verify NPA Classification field is available under Customer Debt screen in Customer Financials tab")
	public void user_verify_npa_classification_field_is_available_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		WebElement NPAClassificationLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel"));
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
	}
	
//	AT_MCUD_02
	@And("User_608 select the Finanacy type under Customer Debt screen in Customer Financials tab")
	public void user_select_the_finanacy_type_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown")).click();
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
	
	@And("User_608 select the Financial Institution value under Customer Debt screen in Customer Financials tab")
	public void user_select_the_financial_institution_value_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionDropdown")).click();
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
			System.out.println("Map " + testData.get("Financial Institution").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Financial Institution")).trim())) {
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

	@And("User_608 enter the Account Number under Customer Debt screen in Customer Financials tab")
	public void user_enter_the_account_number_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNbr"))
				.sendKeys(testData.get("Account Nbr"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 enter the Sanction Amount under Customer Debt screen in Customer Financials tab")
	public void user_enter_the_sanction_amount_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
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

	@And("User_608 enter the Tenure under Customer Debt screen in Customer Financials tab")
	public void user_enter_the_tenure_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
				.sendKeys(testData.get("Tenure(Months)"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Installment Amount under Customer Debt screen in Customer Financials tab")
	public void user_enter_the_installment_amount_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Installment Amt"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
			}
		}	    
	}
	
	@And("User_608 select the Currency value under Customer Debt screen in Customer Financials tab")
	public void user_select_the_currency_value_under_customer_debt_screen_in_customer_financials_tab() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")));
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyDropdown")).click();
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
			System.out.println("Map " + testData.get("Currency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
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
	
	@And("User_608 enter the Remaining Tenure under Customer Debt screen in Customer Financials tab")
	public void user_enter_the_remaining_tenure_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
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
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB);;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 click the Back button Under Customer Debt screen to navigate the previous screen")
	public void user_click_the_back_button_under_customer_debt_screen_to_navigate_the_previous_screen() throws Throwable {
		WebElement pageTop = javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
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
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtBackBtn")).click();						
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
//	AT_MCUD_03
	@And("User_608 verify Finance Type as Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_finance_type_as_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
//		Mandatory field
		WebElement financeTypeField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField"));
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField")).getText();
		for (int i = 0; i <2000; i++) {
            try {
            	javascriptHelper.backgroundColor(financeTypeField);
                Assert.assertTrue(financeTypeText.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	    
//		Verify LOV or Dropdown
		WebElement financeTypeDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(financeTypeDropdown);
				Assert.assertTrue(financeTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Financial Institution as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_financial_institution_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
//		Validate Non_mandatory
		WebElement financialInstitutionlabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel"));
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(financialInstitutionlabel);
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	    
//		Verify LOV or Dropdown
		WebElement financialInstitutionDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(financialInstitutionDropdown);
				Assert.assertTrue(financialInstitutionDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Account Number as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_account_number_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
//		Validate Non_mandatory
		WebElement accountNumberLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel"));
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				javascriptHelper.backgroundColor(accountNumberLabel);
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
          	} catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify Textbox field
		WebElement accountNumberInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(accountNumberInput);
				Assert.assertTrue(accountNumberInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sanction Date as Non-Mandatory and Date under Customer Debt screen in Customer Financials tab")
	public void user_verify_sanction_date_as_non_mandatory_and_date_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement sanctionDataLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel"));
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel")).getText();
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.backgroundColor(sanctionDataLabel);
				Assert.assertTrue(!(financeTypeText.contains("*")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify date field
		WebElement sanctionDateField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDateField"));
		System.out.println("Tag name: "+sanctionDateField.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sanctionDateField);
				Assert.assertTrue(sanctionDateField.getTagName().equalsIgnoreCase("p-calendar"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sanction Amount as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_sanction_amount_as_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
//		Validate Mandatory
		WebElement sanctionAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel"));
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(sanctionAmtLabel);
              Assert.assertTrue(text.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify Textbox field
		WebElement sanctionAmtInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"));		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sanctionAmtInput);
				Assert.assertTrue(sanctionAmtInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Interest Rate % as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_interest_rate_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement interestRateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel"));
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(interestRateLabel);
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement interestRateInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(interestRateInput);
				Assert.assertTrue(interestRateInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Current Principal balance as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_current_principal_balance_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement currentPrincipalBalanceLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(currentPrincipalBalanceLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement currentPrincipalBalanceInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(currentPrincipalBalanceInput);
				Assert.assertTrue(currentPrincipalBalanceInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Tenure as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_tenure_as_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement tenureMonthLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel"));
//		Validate Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(tenureMonthLabel);
              Assert.assertTrue(text.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify Textbox field
		WebElement tenureMonthInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(tenureMonthInput);
				Assert.assertTrue(tenureMonthInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Maturity Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab")
	public void user_verify_maturity_date_as_non_mandatory_and_date_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement maturityDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(maturityDateLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify date field
		WebElement maturityDateField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateField"));
		System.out.println("Tag name: "+maturityDateField.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(maturityDateField);
				Assert.assertTrue(maturityDateField.getTagName().equalsIgnoreCase("p-calendar"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@And("User_608 verify Installment Amount as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_installment_amount_as_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement installmentAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel"));
//		Validate Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(installmentAmtLabel);
              Assert.assertTrue(text.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement installmentAmtInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(installmentAmtInput);
				Assert.assertTrue(installmentAmtInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Amount considered as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_amount_considered_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement amountConsideredLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(amountConsideredLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
               }
          	}
		}
//		Verify Textbox field
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertTrue(amountConsideredInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Currency as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_currency_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement currencyLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(currencyLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
               }
          	}
		}
//		Verify LOV or Dropdown
		WebElement currencyDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(currencyDropdown);
				Assert.assertTrue(currencyDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Remarks as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_remarks_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement remarksLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(remarksLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement remarksInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksInput"));
		System.out.println("Tag name: "+remarksInput.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(remarksInput);
				Assert.assertTrue(remarksInput.getTagName().equalsIgnoreCase("textarea"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Next Due Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab")
	public void user_verify_next_due_date_as_non_mandatory_and_date_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement nextDueDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(nextDueDateLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
               }
          	}
		}
//		Verify date field
		WebElement nextDueDateField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateField"));
		System.out.println("Tag name: "+nextDueDateField.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(nextDueDateField);
				Assert.assertTrue(nextDueDateField.getTagName().equalsIgnoreCase("p-calendar"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Collateral Type as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_collateral_type_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement collateralTypeLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(collateralTypeLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify LOV or Dropdown
		WebElement collateralTypedDropDown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypedDropDown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(collateralTypedDropDown);
				Assert.assertTrue(collateralTypedDropDown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Close Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab")
	public void user_verify_close_date_as_non_mandatory_and_date_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement closeDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(closeDateLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify date field
		WebElement closeDateField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateField"));
		System.out.println("Tag name: "+closeDateField.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(closeDateField);
				Assert.assertTrue(closeDateField.getTagName().equalsIgnoreCase("p-calendar"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Frequency as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_frequency_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(frequencyLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify LOV or Dropdown
		WebElement frequencyDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(frequencyDropdown);
				Assert.assertTrue(frequencyDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Last payment amount as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_last_payment_amount_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {	    
		WebElement lastPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(lastPaymentAmtLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement lastPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(lastPaymentAmtInput);
				Assert.assertTrue(lastPaymentAmtInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Last payment date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab")
	public void user_verify_last_payment_date_as_non_mandatory_and_date_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement lastPaymentDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(lastPaymentDateLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify date field
		WebElement lastPaymentDateField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateField"));
		System.out.println("Tag name: "+lastPaymentDateField.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(lastPaymentDateField);
				Assert.assertTrue(lastPaymentDateField.getTagName().equalsIgnoreCase("p-calendar"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	

	@And("User_608 verify Product Name as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_product_name_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement productNameLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(productNameLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement productNameInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(productNameInput);
				Assert.assertTrue(productNameInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Last24 cycle as Non-Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_last24_cycle_as_non_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement last24CycleLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(last24CycleLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify Textbox field
		WebElement last24CycleInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(last24CycleInput);
				Assert.assertTrue(last24CycleInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Balance Transfer flag as Non-Mandatory and toggle button under Customer Debt screen in Customer Financials tab")
	public void user_verify_balance_transfer_flag_as_non_mandatory_and_toggle_button_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement balanceTransferFlagLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(balanceTransferFlagLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify toggle button
		WebElement balanceTransferFlag = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlag"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(balanceTransferFlag);
				Assert.assertTrue(balanceTransferFlag.getTagName().equalsIgnoreCase("ion-toggle"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Facility Status as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_facility_status_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement facilityStatusLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(facilityStatusLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify LOV or Dropdown
		WebElement facilityStatusDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(facilityStatusDropdown);
				Assert.assertTrue(facilityStatusDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Remaining Tenure as Mandatory and Textbox field under Customer Debt screen in Customer Financials tab")
	public void user_verify_remaining_tenure_as_mandatory_and_textbox_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement remainingTenureLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel"));
//		Validate Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(remainingTenureLabel);
              Assert.assertTrue(text.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
               }
          	}
		}
//		Verify Textbox field
		WebElement remainingTenureInput = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(remainingTenureInput);
				Assert.assertTrue(remainingTenureInput.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify Disbursement Date as Non-Mandatory and Date field under Customer Debt screen in Customer Financials tab")
	public void user_verify_disbursement_date_as_non_mandatory_and_date_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement disbursementDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(disbursementDateLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify date field
		WebElement disbursementDateField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateField"));
		System.out.println("Tag name: "+disbursementDateField.getTagName());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(disbursementDateField);
				Assert.assertTrue(disbursementDateField.getTagName().equalsIgnoreCase("p-calendar"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Request for Balance Takeover as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_request_for_balance_takeover_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement reqForBalanceTakeoverLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(reqForBalanceTakeoverLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
               }
          	}
		}
		
//		Verify LOV or Dropdown
		WebElement reqForBalanceTakeoverDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(reqForBalanceTakeoverDropdown);
				Assert.assertTrue(reqForBalanceTakeoverDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_608 verify NPA Classification as Non-Mandatory and LOV field under Customer Debt screen in Customer Financials tab")
	public void user_verify_npa_classification_as_non_mandatory_and_lov_field_under_customer_debt_screen_in_customer_financials_tab() {
		WebElement NPAClassificationLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel"));
//		Validate Non_mandatory
		String text = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(NPAClassificationLabel);
              Assert.assertTrue(!(text.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
//		Verify LOV or Dropdown
		WebElement NPAClassificationDropdown = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(NPAClassificationDropdown);
				Assert.assertTrue(NPAClassificationDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	AT_MCUD_05
	@And("User_608 enter the Text value in Remaining Tenure field and validate the error message in Customer Debt screen")
	public void user_enter_the_text_value_in_remaining_tenure_field_and_validate_the_error_message_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
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
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB);;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();			
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
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
	
	
//	AT_MCUD_06
	@And("User_608 modify the Sanction Amount under Customer Debt screen in Customer Financials tab")
	public void user_modify_the_sanction_amount_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
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
	
	@And("User_608 enter the invalid data in any one field under Customer Debt screen in Customer Financials tab")
	public void user_enter_the_invalid_data_in_any_one_field_under_customer_debt_screen_in_customer_financials_tab() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Installment Amt"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}
	}
	
	@And("User_608 validate the Error message in Customer Debt screen")
	public void user_validate_the_error_message_in_customer_debt_screen() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")));
		String madatoryErrorMsg = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : "+madatoryErrorMsg);
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(madatoryErrorMsg.contains("SQL error"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

//	AT_MCUD_08
	@And("User_608 search matching value system should display all the possible matching records under Financial Commitments section")
	public void user_search_matching_value_system_should_display_all_the_possible_matching_records_under_financial_commitments_section() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(testData.get("Matched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 verify the all the possible matching records are displayed under Financial Commitments section")
	public void user_verify_the_all_the_possible_matching_records_are_displayed_under_financial_commitments_section() throws Throwable {
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)>0);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@And("User_608 search mismatch value system should not display any records under Financial Commitments section")
	public void user_search_mismatch_value_system_should_not_display_any_records_under_financial_commitments_section() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 verify the system is should not displayed any records under Financial Commitments section")
	public void user_verify_the_system_is_should_not_displayed_any_records_under_financial_commitments_section() throws Throwable {
		Thread.sleep(1000);
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)==0);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	AT_MU_AD_03
	@And("User_608 verify Classification field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_classification_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
//		Verify field as Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationLabel")));
              Assert.assertTrue(sourcingType.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Dropdown
		WebElement classificationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(classificationDropdown);
				Assert.assertTrue(classificationDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Verify field as Non-editable
		WebElement classification = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classification"));
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

	@And("User_608 verify Product field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_product_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productLabel")));
              Assert.assertTrue(sourcingType.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Dropdown
		WebElement productDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(productDropdown);
				Assert.assertTrue(productDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("product"));
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

	@And("User_608 verify Total Finance Amount Requested field as Mandatory, Non-editable and Numeric under Application details screen")
	public void user_verify_total_finance_amount_requested_field_as_mandatory_non_editable_and_numeric_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtLabel")));
              Assert.assertTrue(sourcingType.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Numeric
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				Assert.assertTrue(totalFinanceAmtInput.getAttribute("mode").contains("decimal"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
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

	@And("User_608 verify Declared Net Monthly Income field as Mandatory, Non-editable and Numeric under Application details screen")
	public void user_verify_declared_net_monthly_income_field_as_mandatory_non_editable_and_numeric_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")));
              Assert.assertTrue(sourcingType.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
//		Verify field as Numeric
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				Assert.assertTrue(declaredMonthlyIncomeInput.getAttribute("mode").contains("decimal"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
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

	@And("User_608 verify Declared Current Obligations field as Non-mandatory, Non-editable and Numeric under Application details screen")
	public void user_verify_declared_current_obligations_field_as_non_mandatory_non_editable_and_numeric_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsLabel")));
              Assert.assertTrue(!(sourcingType.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Numeric
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				Assert.assertTrue(declaredCurrentObligationsInput.getAttribute("mode").contains("decimal"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
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

	@And("User_608 verify Special Promotion field as Non-mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_special_promotion_field_as_non_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionLabel")));
              Assert.assertTrue(!(sourcingType.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(specialPromotionDropdown);
				Assert.assertTrue(specialPromotionDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
		WebElement specialPromotion = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotion"));
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
	
	
	
//	AT_MU_AD_04
	@And("User_608 verify Sourcing Channel field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_sourcing_channel_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
//		Verify field as Mandatory
		String sourcingChannelLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelLabel")));
              Assert.assertTrue(sourcingChannelLabel.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement sourcingChannelDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingChannelDropdown);
				Assert.assertTrue(sourcingChannelDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
		WebElement sourcingChannel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannel"));
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

	@And("User_608 verify Business Center Code field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_business_center_code_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String businessCenterCode = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeLabel")));
              Assert.assertTrue(businessCenterCode.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(businessCenterCodeDropdown);
				Assert.assertTrue(businessCenterCodeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Verify field as Non-editable
		WebElement businessCenterCodes = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCode"));
		String read = businessCenterCodes.getAttribute("ng-reflect-readonly");
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

	@And("User_608 verify Servicing Type field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_servicing_type_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String servicingTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeLabel")));
              Assert.assertTrue(servicingTypeLabel.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement servicingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingTypeDropdown);
				Assert.assertTrue(servicingTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Verify field as Non-editable
		WebElement servicingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingType"));
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

	@And("User_608 verify Region field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_region_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String regionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionLabel")));
              Assert.assertTrue(regionLabel.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement regionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(regionDropdown);
				Assert.assertTrue(regionDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
		WebElement region = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("region"));
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

	@And("User_608 verify Servicing Branch field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_servicing_branch_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String servicingBrachLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachLabel")));
              Assert.assertTrue(servicingBrachLabel.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement servicingBrachDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(servicingBrachDropdown);
				Assert.assertTrue(servicingBrachDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Verify field as Non-editable
		WebElement servicingBranch = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBranch"));
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

	@And("User_608 verify Spoke Location field as Non-mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_spoke_location_field_as_non_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String spokeLocationLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationLabel")));
              Assert.assertTrue(!(spokeLocationLabel.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement spokeLocationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(spokeLocationDropdown);
				Assert.assertTrue(spokeLocationDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Verify field as Non-editable
		WebElement spokeLocation = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocation"));
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

	@And("User_608 verify Closing Staff or Servicing Staff or RM field as Mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_closing_staff_or_servicing_staff_or_rm_field_as_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String closingStaffLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffLabel")));
              Assert.assertTrue(closingStaffLabel.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement closingStaffDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(closingStaffDropdown);
				Assert.assertTrue(closingStaffDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
		WebElement closingStaff = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaff"));
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

	@And("User_608 verify Topup Type field as Non_mandatory, Non-editable and Dropdown under Application details screen")
	public void user_verify_topup_type_field_as_non_mandatory_non_editable_and_dropdown_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String topupTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeLabel")));
              Assert.assertTrue(!(topupTypeLabel.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement topupTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(topupTypeDropdown);
				Assert.assertTrue(topupTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Verify field as Non-editable
		WebElement topupType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupType"));
		String read = topupType.getAttribute("ng-reflect-readonly");
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

	@And("User_608 verify Topup Application No field as Non_mandatory, Non-editable and Numeric under Application details screen")
	public void user_verify_topup_application_no_field_as_non_mandatory_non_editable_and_numeric_under_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String topupAppNoLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoLabel")));
              Assert.assertTrue(!(topupAppNoLabel.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Dropdown
		WebElement topupAppNoInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(topupAppNoInput);
				Assert.assertTrue(topupAppNoInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-editable
		String read = topupAppNoInput.getAttribute("readonly");
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
	
	
//	AT_MU_AD_05
	@And("User_608 verify Sourcing Type field as Mandatory, Non-editable and Dropdown under Referral\\Sourcing Details section")
	public void user_verify_sourcing_type_field_as_mandatory_non_editable_and_dropdown_under_referral_sourcing_details_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Mandatory
		String sourcingType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
              Assert.assertTrue(sourcingType.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}	
		
//		Verify field as non-editable
		WebElement sourcingTypeField = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingType"));
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
		WebElement sourcingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingTypeDropdown);
				Assert.assertTrue(sourcingTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Office field as Mandatory, Non-editable and Dropdown under Referral\\Sourcing Details section")
	public void user_verify_sourcing_office_field_as_mandatory_non_editable_and_dropdown_under_referral_sourcing_details_section() throws Throwable {
//		Validate Mandatory
		String sourcingOffice = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel")));
              Assert.assertTrue(sourcingOffice.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
				
//		Verify field as non-editable
		WebElement sourcingOfficeField = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOffice"));
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
		WebElement sourcingOfficeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingOfficeDropdown);
				Assert.assertTrue(sourcingOfficeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Entity field as Mandatory, Non-editable and Dropdown under Referral\\Sourcing Details section")
	public void user_verify_sourcing_entity_field_as_mandatory_non_editable_and_dropdown_under_referral_sourcing_details_section() throws Throwable {
//		Validate Mandatory
		String sourcingEntity = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel")));
              Assert.assertTrue(sourcingEntity.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as non-editable
		WebElement sourcingEntityField = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntity"));
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
		WebElement sourcingEntityDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingEntityDropdown);
				Assert.assertTrue(sourcingEntityDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Staff field as Mandatory, Non-editable and Dropdown under Referral\\Sourcing Details section")
	public void user_verify_sourcing_staff_field_as_mandatory_non_editable_and_dropdown_under_referral_sourcing_details_section() throws Throwable {
//		Validate Mandatory
		String sourcingStaff = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel")));
              Assert.assertTrue(sourcingStaff.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}	

//		Verify field as non-editable
		WebElement sourcingStaffField = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaff"));
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
		WebElement sourcingStaffDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(sourcingStaffDropdown);
				Assert.assertTrue(sourcingStaffDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 verify Reference Type field as Non_mandatory, Non-editable and Dropdown under Referral\\Sourcing Details section")
	public void user_verify_reference_type_field_as_non_mandatory_non_editable_and_dropdown_under_referral_sourcing_details_section() throws Throwable {
//		Validate Non-Mandatory
		String referenceType = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel")));
              Assert.assertTrue(!(referenceType.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}

//		Verify field as non-editable
		WebElement referenceTypeField = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceType"));
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
		WebElement referenceTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(referenceTypeDropdown);
				Assert.assertTrue(referenceTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 verify Reference Code field as Non_mandatory, Non-editable and Textbox under Referral\\Sourcing Details section")
	public void user_verify_reference_code_field_as_non_mandatory_non_editable_and_textbox_under_referral_sourcing_details_section() throws Throwable {
//		Validate Non-Mandatory
		String referenceCode = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel")));
              Assert.assertTrue(!(referenceCode.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as non-editable
		WebElement referenceCodeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(referenceCodeInput);
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
				System.out.println("Tag Name: "+tagName);
				Assert.assertTrue(tagName.contains("input"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	@AT_MU_INC_01
	@And("User_608 click Add button under Income section in Customer Financials tab")
	public void user_click_add_button_under_income_section_in_customer_financials_tab() {
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
	
	@And("User_608 validate Pension Amount field available under Income details screen")
	public void user_validate_pension_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement pensionAmtLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("pensionAmtLabel"));
		System.out.println("Field Name: "+pensionAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(pensionAmtLabel);
				Assert.assertTrue(pensionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement pensionAmtInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("pensionAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(pensionAmtInput);
				Assert.assertTrue(pensionAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
	@And("User_608 select the Salary credited to Bank value under Income details screen")
	public void user_select_the_salary_credited_to_bank_value_under_income_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("salaryCreditedToBankDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Salary Credited To Bank")).trim())) {
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

	@And("User_608 validate Bank Name field available under Income details screen")
	public void user_validate_bank_name_field_available_under_income_details_screen() throws Throwable {
		WebElement bankNameLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("bankNameLabel"));
		WebElement bankNameDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("bankNameDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(bankNameLabel);
				Assert.assertTrue(bankNameLabel.isDisplayed());
				javascriptHelper.backgroundBorder(bankNameDropdown);
				Assert.assertTrue(bankNameDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 validate Branch Name field available under Income details screen")
	public void user_validate_branch_name_field_available_under_income_details_screen() throws Throwable {
		WebElement branchNameLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("branchNameLabel"));
		WebElement branchNameDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("branchNameDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(branchNameLabel);
				Assert.assertTrue(branchNameLabel.isDisplayed());
				javascriptHelper.backgroundBorder(branchNameDropdown);
				Assert.assertTrue(branchNameDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_608 verify system should navigate to the previous screen in Customer Financials tab")
	public void user_verify_system_should_navigate_to_the_previous_screen_in_customer_financials_tab() {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							javascriptHelper
							.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]")
									.isDisplayed();
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

	
	
//	AT_MU_INC_02
	@And("User_608 enter the Lumpsum Amount under Income screen in Customer Financials tab")
	public void user_enter_the_lumpsum_amount_under_income_screen_in_customer_financials_tab()throws Throwable {
	    for (int i = 0; i < 1000; i++) {
	    	try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("lumpsumAmtInput"))
				.sendKeys(testData.get("Lumpsum Amount"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Pension Amount under Income screen in Customer Financials tab")
	public void user_enter_the_pension_amount_under_income_screen_in_customer_financials_tab()throws Throwable {
	    for (int i = 0; i < 1000; i++) {
	    	try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("pensionAmtInput"))
				.sendKeys(testData.get("Pension Amount"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}			
		}	    
	}

	@And("User_608 select the Income option under Income screen in Customer Financials tab")
	public void user_select_the_income_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Income")).trim())) {
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

	@And("User_608 select the Frequency option under Income screen in Customer Financials tab")
	public void user_select_the_frequency_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("frequencyDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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

	@And("User_608 enter the Income Amount under Income screen in Customer Financials tab")
	public void user_enter_the_income_amount_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(testData.get("Amount"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Adjusted% under Income screen in Customer Financials tab")
	public void user_enter_the_adjusted_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("adjusted%_Input"))
				.sendKeys(testData.get("Adjusted %"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the Bank Name under Income screen in Customer Financials tab")
	public void user_select_the_bank_name_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("bankNameDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Bank Name")).trim())) {
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

	@And("User_608 select the Branch Name under Income screen in Customer Financials tab")
	public void user_select_the_branch_name_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("branchNameDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Branch Name")).trim())) {
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

	@And("User_608 select the Deduction option under Income screen in Customer Financials tab")
	public void user_select_the_deduction_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Deduction")).trim())) {
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

	@And("User_608 select the Deduction Frequency option under Income screen in Customer Financials tab")
	public void user_select_the_deduction_frequency_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionFrequencyDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Deduction_Frequency")).trim())) {
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

	@And("User_608 enter the Deduction Amount under Income screen in Customer Financials tab")
	public void user_enter_the_deduction_amount_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput")).click();
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput"))
				.sendKeys(testData.get("Deduction_Amt"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Deduction Adjusted% under Income screen in Customer Financials tab")
	public void user_enter_the_deduction_adjusted_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Input")).click();
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Input"))
				.sendKeys(testData.get("Deduction_Adj%"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 select the Currency under Income screen in Customer Financials tab")
	public void user_select_the_currency_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("currencyDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
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
	
	@And("User_608 validate the confirmation message as success under Income details screen")
	public void user_validate_the_confirmation_message_as_success_under_income_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastMsg"));
		for (int i = 0; i <= 50000; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Saved successfully"));				
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	@AT_MU_INC_03
	@And("User_608 click the pencil button under Income section in Customer Financials tab")
	public void user_click_the_pencil_button_under_income_section_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
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
	
	
	@And("User_608 verify Employment Type auto populated from Employment details screen")
	public void user_verify_employment_type_auto_populated_from_employment_details_screen() throws Throwable {
		Thread.sleep(500);
		WebElement employementTypeInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("employementTypeInput"));
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

	@And("User_608 verify Lumpsum Amount auto populated from Employment details screen")
	public void user_verify_lumpsum_amount_auto_populated_from_employment_details_screen() throws Throwable {
		WebElement lumpsumAmtInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("lumpsumAmtInput"));
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

	@And("User_608 verify Income field should be Mandatory, LOV and Allow to user select any value from LOV")
	public void user_verify_income_field_should_be_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement incomeLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeLabel"));
		WebElement incomeDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(incomeLabel);
				Assert.assertTrue(incomeLabel.getText().contains("*"));
				javascriptHelper.backgroundBorder(incomeDropdown);
				Assert.assertTrue(incomeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Income")).trim())) {
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

	@And("User_608 verify Frequency field should be Mandatory, LOV and Allow to user select any value from LOV")
	public void user_verify_frequency_field_should_be_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("frequencyLabel"));
		WebElement frequencyDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("frequencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(frequencyLabel);
				Assert.assertTrue(frequencyLabel.getText().contains("*"));
				javascriptHelper.backgroundBorder(frequencyDropdown);
				Assert.assertTrue(frequencyDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("frequencyDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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

	@And("User_608 verify income Amount field should be Mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_verify_income_amount_field_should_be_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement amountLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountLabel"));
		WebElement amountInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(amountLabel);
				Assert.assertTrue(amountLabel.getText().contains("*"));
				javascriptHelper.backgroundBorder(amountInput);
				Assert.assertTrue(amountInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(testData.get("Amount"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		amountLabel.click();
	}

	@And("User_608 verify Defined% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_verify_defined_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement defined_Label = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("defined%_Label"));
		WebElement defined_Input = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("defined%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(defined_Label);
				Assert.assertTrue(!(defined_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(defined_Input);
				Assert.assertTrue(defined_Input.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Adjusted% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_verify_adjusted_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement adjusted_Label = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("adjusted%_Label"));
		WebElement adjusted_Input = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("adjusted%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(adjusted_Label);
				Assert.assertTrue(!(adjusted_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(adjusted_Input);
				Assert.assertTrue(adjusted_Input.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("adjusted_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("adjusted_Input"))
				.sendKeys(testData.get("Adjusted %"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Amount Considered field should be auto populated in post entering Adjusted% value")
	public void user_verify_amount_considered_field_should_be_auto_populated_in_post_entering_adjusted_value() throws Throwable {
		String incomeValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput")).getAttribute("ng-reflect-model");
		String definedValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("defined%_Input")).getAttribute("ng-reflect-model");
		String adjustedValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("adjusted%_Input")).getAttribute("ng-reflect-model");
		String amountConsideredValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountConsideredInput")).getAttribute("ng-reflect-model");
		
		int ac = (Integer.parseInt(incomeValue)*Integer.parseInt(definedValue))/Integer.parseInt(adjustedValue);
		System.out.println("AC: "+ ac);
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountConsideredInput"));		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertEquals(amountConsideredValue, Integer.toString(ac));				
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	
	@And("User_608 verify Total income value should get auto populated post entering the Amount")
	public void user_verify_total_income_value_should_get_auto_populated_post_entering_the_amount() throws Throwable {
		String incomeValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput")).getAttribute("ng-reflect-model");
		int a = (Integer.parseInt(incomeValue)/12);
		String substring = Integer.toString(a).split("\\.")[0];
		System.out.println("A: "+substring);
		WebElement totalIncomeInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("totalIncomeInput"));
		String value = totalIncomeInput.getAttribute("ng-reflect-model").split("\\.")[0];
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeInput);
				Assert.assertEquals(value, substring);				
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Total income considered value should get auto populate post entering the value in Adjusted% field")
	public void user_verify_total_income_considered_value_should_get_auto_populate_post_entering_the_value_in_adjusted_field() throws Throwable {
		String amountConsideredValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountConsideredInput")).getAttribute("ng-reflect-model");
		int a = (Integer.parseInt(amountConsideredValue)/12);
		String sp = Integer.toString(a).split("\\.")[0];
		System.out.println("B: "+sp);
		WebElement totalIncomeConsideredInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("totalIncomeConsideredInput"));
		String value = totalIncomeConsideredInput.getAttribute("ng-reflect-model").split("\\.")[0];
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeConsideredInput);
				Assert.assertEquals(value, sp);				
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Salary credited to Bank field should be Non-mandatory and Dropdown")
	public void user_verify_salary_credited_to_bank_field_should_be_non_mandatory_and_dropdown() throws Throwable {
		WebElement salaryCreditedToBankLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("salaryCreditedToBankLabel"));
		WebElement salaryCreditedToBankDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("salaryCreditedToBankDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(salaryCreditedToBankLabel);
				Assert.assertTrue(!(salaryCreditedToBankLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(salaryCreditedToBankDropdown);
				Assert.assertTrue(salaryCreditedToBankDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Deduction field should be Non-mandatory, LOV and Allow to user select any value from LOV")
	public void user_verify_deduction_field_should_be_non_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement deductionLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionLabel"));
		WebElement deductionDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionLabel);
				Assert.assertTrue(!(deductionLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(deductionDropdown);
				Assert.assertTrue(deductionDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Deduction")).trim())) {
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

	@And("User_608 verify Deduction Amount field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_verify_deduction_amount_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement deductionAmtLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtLabel"));
		WebElement deductionAmtInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(deductionAmtLabel);
				Assert.assertTrue(!(deductionAmtLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(deductionAmtInput);
				Assert.assertTrue(deductionAmtInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		System.out.println("Deduction Amount "+testData.get("Deduction_Amt"));
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput")).click();
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput"))
				.sendKeys(testData.get("Deduction_Amt"));
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Deduction Defined% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_verify_deduction_defined_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement defined_Label = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionDef%_Label"));
		WebElement defined_Input = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionDef%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(defined_Label);
				Assert.assertTrue(!(defined_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(defined_Input);
				Assert.assertTrue(defined_Input.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Deduction Adjusted% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_verify_deduction_adjusted_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement adjusted_Label = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Label"));
		WebElement adjusted_Input = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(adjusted_Label);
				Assert.assertTrue(!(adjusted_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(adjusted_Input);
				Assert.assertTrue(adjusted_Input.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Input"))
				.sendKeys(testData.get("Adjusted %"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Deduction Considered field should be auto populated in post entering Deduction Adj% value")
	public void user_verify_deduction_considered_field_should_be_auto_populated_in_post_entering_deduction_adj_value() throws Throwable {
		String deductionAmt = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput")).getAttribute("ng-reflect-model");
		String definedValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionDef%_Input")).getAttribute("ng-reflect-model");
		String adjustedValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAdj%_Input")).getAttribute("ng-reflect-model");
		String amountConsideredValue = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionConsideredInput")).getAttribute("ng-reflect-model");
		
		int ac = (Integer.parseInt(deductionAmt)*Integer.parseInt(definedValue))/Integer.parseInt(adjustedValue);
		System.out.println("AC: "+ ac);
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountConsideredInput"));		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertEquals(amountConsideredValue, Integer.toString(ac));				
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 verify Total Deduction value should get auto populated post entering the Deduction Amount")
	public void user_verify_total_deduction_value_should_get_auto_populated_post_entering_the_deduction_amount() throws Throwable {
		String deductionAmt = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionAmtInput")).getAttribute("ng-reflect-model");
		int a = Integer.parseInt(deductionAmt)/12;
		String st = Integer.toString(a).split("\\.")[0];
		WebElement totalDeduction = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("totalDeductionInput"));
		String value = totalDeduction.getAttribute("ng-reflect-model").split("\\.")[0];
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeduction);
				Assert.assertEquals(value, st);				
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Deduction considered value should get auto populate post entering the value in Deduction Adj% field")
	public void user_verify_deduction_considered_value_should_get_auto_populate_post_entering_the_value_in_deduction_adj_field() throws Throwable {
		String deductionConsidered = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("deductionConsideredInput")).getAttribute("ng-reflect-model");
		int a = Integer.parseInt(deductionConsidered)/12;
		String sp = Integer.toString(a).split("\\.")[0];
		WebElement totalDeductionConsidered = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("totalDeductionConsideredInput"));
		String value = totalDeductionConsidered.getAttribute("ng-reflect-model").split("\\.")[0];
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeductionConsidered);
				Assert.assertEquals(value, sp);				
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Bank Name field should be Non-mandatory, LOV and Allow to user select any value from LOV")
	public void user_verify_bank_name_field_should_be_non_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement bankNameLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("bankNameLabel"));
		WebElement bankNameDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("bankNameDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(bankNameLabel);
				Assert.assertTrue(!(bankNameLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(bankNameDropdown);
				Assert.assertTrue(bankNameDropdown.getAttribute("aria-haspopup").contains("listbox"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("bankNameDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Bank Name")).trim())) {
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

	@And("User_608 verify Branch Name field should be Non-mandatory, LOV and Allow to user select any value from LOV")
	public void user_verify_branch_name_field_should_be_non_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement branchNameLabel = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("branchNameLabel"));
		WebElement branchNameDropdown = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("branchNameDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(branchNameLabel);
				Assert.assertTrue(!(branchNameLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(branchNameDropdown);
				Assert.assertTrue(branchNameDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("branchNameDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Branch Name")).trim())) {
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

	@And("User_608 click Add Row button system should add a row under Income screen")
	public void user_click_add_row_button_system_should_add_a_row_under_income_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("actionAddBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click Delete Row button system should delete a row under Income screen")
	public void user_click_delete_row_button_system_should_delete_a_row_under_income_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("actionDeleteBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
//	AT_MU_INC_04
	@And("User_608 click the Save button with mandatory field blank under Income details screen")
	public void user_click_the_save_button_with_mandatory_field_blank_under_income_details_screen() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 5000; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify validation message for mandatory field as blank under Income details screen")
	public void user_verify_validation_message_for_mandatory_field_as_blank_under_income_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastMsg"));
		for (int i = 0; i <= 50000; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Fill Mandatory fields"));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
//	AT_MU_INC_05
	@And("User_608 verify system allow user to modify Lumpsum Amount under Income details screen")
	public void user_verify_system_allow_user_to_modify_lumpsum_amount_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 1000; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("lumpsumAmtInput"))
	    		.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("lumpsumAmtInput"))
				.sendKeys(testData.get("Lumpsum Amount"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 verify system allow user to modify Pension Amount under Income details screen")
	public void user_verify_system_allow_user_to_modify_pension_amount_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 1000; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("pensionAmtInput"))
	    		.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("pensionAmtInput"))
				.sendKeys(testData.get("Pension Amount"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}			
		}	    
	}
	
	@And("User_608 verify system allow user to modify Income under Income details screen")
	public void user_verify_system_allow_user_to_modify_income_under_income_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Income")).trim())) {
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
	
	@And("User_608 verify system allow user to modify Frequency under Income details screen")
	public void user_verify_system_allow_user_to_modify_frequency_under_income_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("frequencyDropdown")).click();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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
	
	@And("User_608 verify system allow user to modify Income Amount under Income details screen")
	public void user_verify_system_allow_user_to_modify_income_amount_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 1000; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
	    		.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(testData.get("Amount"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify while modification system allow user to save the record with valid data")
	public void user_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 5000; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 post clicking on save button system should display the confirmation message as Success")
	public void user_post_clicking_on_save_button_system_should_display_the_confirmation_message_as_success() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastMsg"));
		for (int i = 0; i <= 50000; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Saved successfully"));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_608 again click the pencil button under Income section in Customer Financials tab")
	public void user_again_click_the_pencil_button_under_income_section_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
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
	
	
	@And("User_608 verify while modification, when user keep any mandatory field blank and click on save button")
	public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify while modification enters the invalid data in Income details screen")
	public void user_verify_while_modification_enters_the_invalid_data_in_income_details_screen() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("amountInput"))
				.sendKeys(testData.get("Invalid Data"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 system should not allow user to do a modification with invalid data under Income details screen")
	public void user_system_should_not_allow_user_to_do_a_modification_with_invalid_data_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastMsg"));
		for (int i = 0; i <= 50000; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Fill Mandatory fields"));	
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("successToastCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 50000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 Post clicking on back button system should navigate to the previous screen")
	public void user_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen() throws Throwable {
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeBackBtn"));
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
	
	
//	AT_MU_INC_06
	@And("User_608 verify the Back button available in Income list view under Customer Financials tab")
	public void user_verify_the_back_button_available_in_income_list_view_under_customer_financials_tab() throws Throwable {
		WebElement backBtn = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerFinancialsTabBackBtn"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(backBtn);
				javascriptHelper.backgroundBorder(backBtn);
				backBtn.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Add button available under Income section list view in Customer Financials tab")
	public void user_verify_add_button_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper.backgroundBorder(javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.isDisplayed();
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

	@And("User_608 verify Nature of Employement field available under Income section list view in Customer Financials tab")
	public void user_verify_nature_of_employement_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement natureOfEmployment = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("listview_NatureOfEmployment"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(natureOfEmployment);
				natureOfEmployment.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Net Income field available under Income section list view in Customer Financials tab")
	public void user_verify_net_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement netIncome = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("listview_NetIncome"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(netIncome);
				netIncome.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Net Deduction field available under Income section list view in Customer Financials tab")
	public void user_verify_net_deduction_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement netDeduction = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("listview_NetDeduction"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(netDeduction);
				netDeduction.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Considered Income field available under Income section list view in Customer Financials tab")
	public void user_verify_considered_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement consideredIncome = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("listview_ConsideredIncome"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(consideredIncome);
				consideredIncome.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Currency field available under Income section list view in Customer Financials tab")
	public void user_verify_currency_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement currency = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("listview_Currency"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(currency);
				currency.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Status field available under Income section list view in Customer Financials tab")
	public void user_verify_status_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement status = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("listview_Status"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.backgroundColor(status);
				status.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 verify on clicks of list view record, details should be populated in the fields under Income screen")
	public void user_verify_on_clicks_of_list_view_record_details_should_be_populated_in_the_fields_under_income_screen() throws Throwable {
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\'table tbody tr td button[icon=\"pi pi-eye\"]')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector('table tbody tr td button[icon=\"pi pi-eye\"]')")
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

	@And("User_608 verify the functionality of Add button under Income section in Customer Financials tab")
	public void user_verify_the_functionality_of_add_button_under_income_section_in_customer_financials_tab() throws Throwable {
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

	@And("User_608 post clicking on Add button system should navigate to new Income details screen")
	public void user_post_clicking_on_add_button_system_should_navigate_to_new_income_details_screen() throws Throwable {
		WebElement incomeScreenTitle = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeScreenTitle"));
		for (int i = 0; i <= 100000; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeScreenTitle);
				incomeScreenTitle.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	
//	AT_MU_INC_07
	@And("User_608 click Search button in Income section under Customer Financials tab")
	public void user_click_search_button_in_income_section_under_customer_financials_tab() throws Throwable {
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
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

	@And("User_608 verify the functionality of Search box with matching data in Income section")
	public void user_verify_the_functionality_of_search_box_with_matching_data_in_income_section() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSectionSearchbox"))
				.sendKeys(testData.get("Currency"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify entering any matching value system should display all the possible matching records under Income section")
	public void user_verify_entering_any_matching_value_system_should_display_all_the_possible_matching_records_under_income_section() throws Throwable {
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)>0);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify the functionality of Search box with mismatch data in Income section")
	public void user_verify_the_functionality_of_search_box_with_mismatch_data_in_income_section() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSectionSearchbox")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("incomeSectionSearchbox"))
				.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify system should not display any records or system should display the message as No data found under Income section")
	public void user_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_income_section() throws Throwable {
		Thread.sleep(1000);
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)==0);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_MU_INC_08
	@And("User_608 verify the functionality of Export to PDF button")
	public void user_verify_the_functionality_of_export_to_pdf_button() throws Throwable {
		Thread.sleep(200);
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
			for (int k = 0; k <= 1000; k++) {
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
							javascriptHelper.scrollIntoView(
									javascriptHelper
										.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('p-dropdown[placeholder=\"Export\"]')[" + j + "]").click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 1000) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_608 post clicking on Export to PDF button system should download the PDF file of that records")
	public void user_post_clicking_on_export_to_pdf_button_system_should_download_the_pdf_file_of_that_records() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("exportPDF")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		IncomeFormDataFile
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("IncomeFormDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}

	@And("User_608 verify the functionality of Export to Excel button")
	public void user_verify_the_functionality_of_export_to_excel_button() throws Throwable {
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
							javascriptHelper.scrollIntoView(
									javascriptHelper
										.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('p-dropdown[placeholder=\"Export\"]')[" + j + "]").click();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("exportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 post clicking on Export to Excel button system should download the Excel file of that records")
	public void user_post_clicking_on_export_to_excel_button_system_should_download_the_excel_file_of_that_records() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("IncomeFormDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}

	@And("User_608 to verify the functionality of Back button under Customer Financials tab")
	public void user_to_verify_the_functionality_of_back_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerFinancialsTabBackBtn")));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerFinancialsTabBackBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen")
	public void user_post_clicking_on_back_button_under_customer_inanacials_tab_system_should_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i <= 3000; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerInfoTitle")));
				javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerInfoTitle")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
	
	
	
}
