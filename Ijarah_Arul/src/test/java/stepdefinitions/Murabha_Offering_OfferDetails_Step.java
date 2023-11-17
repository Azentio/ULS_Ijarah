package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
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

public class Murabha_Offering_OfferDetails_Step {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	JSPaths additionalCustInfoJsPaths = new JSPaths(excelPath, "AdditionalCustInfo_Elements", "AdditionalCustInfo_FieldName", "JSPath");
	JSPaths dataCheck_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName", "JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "DataCheckAppDetails_Elements", "DataCheckAppDetails_FieldName", "JSPath");
	JSPaths offering_OfferDetailsJsPaths = new JSPaths(excelPath, "Murabha_Offering_OfferDetails", "Offering_OfferDetails_FieldName", "JSPath");
	
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

	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData additinalCustomerInfoExcelData  = new ExcelData(excelTestDataPath,"AdditionalCustomerInfo","DataSet ID");
	ExcelData dataCheck_IncomeExcelData  = new ExcelData(excelTestDataPath,"DataCheck_Income","DataSet ID");
	ExcelData dataCheck_ApplicationDetailsExcelData  = new ExcelData(excelTestDataPath,"DataCheck_AppDetails","DataSet ID");
	ExcelData offering_OfferDetailsExcelData  = new ExcelData(excelTestDataPath,"Offering_OfferDetails","DataSet ID");
	ExcelData contractSign_ApplicationDetailsExcelData  = new ExcelData(excelTestDataPath,"ContractSign_AppDetails","DataSet ID");
	ExcelData murabha_offering_offerdetailsExcelData  = new ExcelData(excelTestDataPath,"Murabha_Offering_OfferDetails","DataSet ID");
	
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	@And("User_074 get the test data for test case AT_M_OFO_01")
	public void user_074_get_the_test_data_for_test_case_at_m_ofo_01() {
		testData = murabha_offering_offerdetailsExcelData.getTestdata("AT_M_OFO_01_D1");
	}
	
	@And("User_074 get the test data for test case AT_M_OFO_02")
	public void user_074_get_the_test_data_for_test_case_at_m_ofo_02() {
		testData = murabha_offering_offerdetailsExcelData.getTestdata("AT_M_OFO_02_D1");
	}
	
	@And("User_074 get the test data for test case AT_M_OFO_03")
	public void user_074_get_the_test_data_for_test_case_at_m_ofo_03() {
		testData = murabha_offering_offerdetailsExcelData.getTestdata("AT_M_OFO_03_D1");
	}
	
	@And("User_074 get the test data for test case AT_M_OFO_04")
	public void user_074_get_the_test_data_for_test_case_at_m_ofo_04() {
		testData = murabha_offering_offerdetailsExcelData.getTestdata("AT_M_OFO_04_D1");
	}
	
	@And("User_074 get the test data for test case AT_M_OFO_05")
	public void user_074_get_the_test_data_for_test_case_at_m_ofo_05() {
		testData = murabha_offering_offerdetailsExcelData.getTestdata("AT_M_OFO_05_D1");
	}
	@And("User_074 search the Ref id under inbox for Murabha_Offering_offer details")
	public void user_search_the_ref_id_under_inbox_for_murabha_offering_offer_details() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	
	
	
	@And("User_074 click the pencil icon button under Offer Details tab")
	public void user_click_the_pencil_icon_button_under_offer_details_tab() throws Throwable {
		Thread.sleep(2000);
		WebElement offerDetailsTabPencilIcon = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsTabPencilIcon"));	
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

	@And("User_074 verify the Offer Details section available under Offer Details tab")
	public void user_verify_the_offer_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement offerDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsSection"));
		waitHelper.waitForElementwithFluentwait(driver, offerDetailsSection);
		System.out.println("Section Name: "+offerDetailsSection.getText());
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

	@And("User_074 verify the Finance Details section available under Offer Details tab")
	public void user_verify_the_finance_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement financeDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetailsSection"));
		System.out.println("Section Name: "+financeDetailsSection.getText());
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

	@And("User_074 verify the Credit Risk Factor section available under Offer Details tab")
	public void user_verify_the_credit_risk_factor_section_available_under_offer_details_tab() throws Throwable {
		WebElement creditRiskFactor = javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-row[class=\"md hydrated\"]')[2]");
		WebElement creditRiskFactorSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditRiskFactorSection"));		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(creditRiskFactor);
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Section Name: "+creditRiskFactorSection.getText());
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

	@And("User_074 verify the Credit Score Details section available under Offer Details tab")
	public void user_verify_the_credit_score_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement creditScoreDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScoreDetailsSection"));
		System.out.println("Section Name: "+creditScoreDetailsSection.getText());
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

	@And("User_074 verify the Eligibility Details section available under Offer Details tab")
	public void user_verify_the_eligibility_details_section_available_under_offer_details_tab() throws Throwable {
		WebElement creditScoreDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScoreDetailsSection"));		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(creditScoreDetailsSection);
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement eligibilityDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetailsSection"));
		System.out.println("Section Name: "+eligibilityDetailsSection.getText());
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

	@And("User_074 verify the Interest Rate Structure section available under Offer Details tab")
	public void user_verify_the_interest_rate_structure_section_available_under_offer_details_tab() throws Throwable {
		WebElement interestRateStructureSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("interestRateStructureSection"));
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
		System.out.println("Section Name: "+interestRateStructureSection.getText());
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

	@And("User_074 verify the Installments section available under Offer Details tab")
	public void user_verify_the_installments_section_available_under_offer_details_tab() throws Throwable {
		WebElement installmentsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("installmentsSection"));
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
		System.out.println("Section Name: "+installmentsSection.getText());
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

	@And("User_074 verify the Appeal Request section available under Offer Details tab")
	public void user_verify_the_appeal_request_section_available_under_offer_details_tab() throws Throwable {
		WebElement appealRequestSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("appealRequestSection"));
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
		System.out.println("Section Name: "+appealRequestSection.getText());
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
	@And("User_074 verify Product field available under Offer Details section")
	public void user_verify_product_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsSection"));
		waitHelper.waitForElementwithFluentwait(driver, offerDetailsSection);
		WebElement offerDetails_productLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_productLabel"));
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
		WebElement offerDetails_productInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_productInput"));
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

	@And("User_074 verify Sub-Product field available under Offer Details section")
	public void user_verify_sub_product_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_subProductLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_subProductLabel"));
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
		WebElement offerDetails_subProductInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_subProductInput"));
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

	@And("User_074 verify Scheme field available under Offer Details section")
	public void user_verify_scheme_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_schemeLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_schemeLabel"));
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
		WebElement offerDetails_schemeInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_schemeInput"));
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

	@And("User_074 verify Pricing Indicator field available under Offer Details section")
	public void user_verify_pricing_indicator_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_pricingIndicatorLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_pricingIndicatorLabel"));
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
		WebElement offerDetails_pricingIndicatorInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_pricingIndicatorInput"));
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

	@And("User_074 verify Offered Amount field available under Offer Details section")
	public void user_verify_offered_amount_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_offeredAmountLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_offeredAmountLabel"));
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
		WebElement offerDetails_offeredAmountInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_offeredAmountInput"));
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

	@And("User_074 verify Tenure field available under Offer Details section")
	public void user_verify_tenure_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_tenureLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_tenureLabel"));
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
		WebElement offerDetails_tenureInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_tenureInput"));
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

	@And("User_074 verify Nature of Finance field available under Offer Details section")
	public void user_verify_nature_of_finance_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_natureOfFinanceLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_natureOfFinanceLabel"));
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
		WebElement offerDetails_natureOfFinanceInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_natureOfFinanceInput"));
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

	@And("User_074 verify Currency field available under Offer Details section")
	public void user_verify_currency_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_currencyLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_currencyLabel"));
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
		WebElement offerDetails_currencyInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_currencyInput"));
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

	@And("User_074 verify Eligible Income field available under Offer Details section")
	public void user_verify_eligible_income_field_available_under_offer_details_section() throws Throwable {
		WebElement offerDetails_eligibleIncomeLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_eligibleIncomeLabel"));
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
		WebElement offerDetails_eligibleIncomeInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetails_eligibleIncomeInput"));
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
	@And("User_074 verify Total Obligations field available under Finance Details section")
	public void user_verify_total_obligations_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetailsSection = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("offerDetailsSection"));
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
		WebElement financeDetails_totalObligationsLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalObligationsLabel"));
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
		WebElement financeDetails_totalObligationsInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalObligationsInput"));
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

	@And("User_074 verify Total Net Income field available under Finance Details section")
	public void user_verify_total_net_income_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalnetIncomeLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalnetIncomeLabel"));
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
		WebElement financeDetails_totalnetIncomeInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalnetIncomeInput"));
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

	@And("User_074 verify Total Income field available under Finance Details section")
	public void user_verify_total_income_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalIncomeLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalIncomeLabel"));
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
		WebElement financeDetails_totalIncomeInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalIncomeInput"));
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

	@And("User_074 verify Total Fees field available under Finance Details section")
	public void user_verify_total_fees_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalFeesLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalFeesLabel"));
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
		WebElement financeDetails_totalFeesInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalFeesInput"));
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

	@And("User_074 verify Total Down Payment Amount field available under Finance Details section")
	public void user_verify_total_down_payment_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalDownPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalDownPaymentAmtLabel"));
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
		WebElement financeDetails_totalDownPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalDownPaymentAmtInput"));
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

	@And("User_074 verify Total Contract Value field available under Finance Details section")
	public void user_verify_total_contract_value_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_totalContractValueLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalContractValueLabel"));
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
		WebElement financeDetails_totalContractValueInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_totalContractValueInput"));
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

	@And("User_074 verify Number of Installments field available under Finance Details section")
	public void user_verify_number_of_installments_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_noOfInstallmentsLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_noOfInstallmentsLabel"));
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
		WebElement financeDetails_noOfInstallmentsInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_noOfInstallmentsInput"));
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

	@And("User_074 verify Last Installment Amount field available under Finance Details section")
	public void user_verify_last_installment_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_lastInstallmentLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_lastInstallmentLabel"));
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
		WebElement financeDetails_lastInstallmentInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_lastInstallmentInput"));
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

	@And("User_074 verify IRR field available under Finance Details section")
	public void user_verify_irr_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_IRRLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_IRRLabel"));
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
		WebElement financeDetails_IRRInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_IRRInput"));
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

	@And("User_074 verify Installment Frequency field available under Finance Details section")
	public void user_verify_installment_frequency_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_InstallmentFrequencyLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_InstallmentFrequencyLabel"));
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
		WebElement financeDetails_InstallmentFrequencyInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_InstallmentFrequencyInput"));
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

	@And("User_074 verify APR field available under Finance Details section")
	public void user_verify_apr_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_APRLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_APRLabel"));
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
		WebElement financeDetails_APRInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_APRInput"));
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

	@And("User_074 verify Amount Requested field available under Finance Details section")
	public void user_verify_amount_requested_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_AmountRequestedLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_AmountRequestedLabel"));
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
		WebElement financeDetails_AmountRequestedInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_AmountRequestedInput"));
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

	@And("User_074 verify Additional Down Payment field available under Finance Details section")
	public void user_verify_additional_down_payment_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_AdditionalDownPaymentLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_AdditionalDownPaymentLabel"));
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
		WebElement financeDetails_AdditionalDownPaymentInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_AdditionalDownPaymentInput"));
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

	@And("User_074 verify Down Payment Percentage field available under Finance Details section")
	public void user_verify_down_payment_percentage_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_downPaymentPercentLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentPercentLabel"));
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
		WebElement financeDetails_downPaymentPercentInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentPercentInput"));
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

	@And("User_074 verify Tenure field available under Finance Details section")
	public void user_verify_tenure_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_tenureLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_tenureLabel"));
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
		WebElement financeDetails_tenureInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_tenureInput"));
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

	@And("User_074 verify Profit Amount field available under Finance Details section")
	public void user_verify_profit_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_profitAmtLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_profitAmtLabel"));
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
		WebElement financeDetails_profitAmtInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_profitAmtInput"));
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

	@And("User_074 verify Down Payment Amount field available under Finance Details section")
	public void user_verify_down_payment_amount_field_available_under_finance_details_section() throws Throwable {
		WebElement financeDetails_downPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentAmtLabel"));
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
		WebElement financeDetails_downPaymentAmtInput = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("financeDetails_downPaymentAmtInput"));
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
	@And("User_074 verify the Total Score field available under Credit Risk Factor section")
	public void user_verify_the_total_score_field_available_under_credit_risk_factor_section() throws Throwable {
		WebElement creditRisk_TotalScoreField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditRisk_TotalScoreField"));
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

	@And("User_074 verify the Risk Level field availble under Credit Risk Factor section")
	public void user_verify_the_risk_level_field_availble_under_credit_risk_factor_section() throws Throwable {
		WebElement creditRisk_RiskLevelField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditRisk_RiskLevelField"));
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

	@And("User_074 verify the Serial No field available under Credit Score details section")
	public void user_verify_the_serial_no_field_available_under_credit_score_details_section() throws Throwable {
		WebElement creditScore_SerialNoField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScore_SerialNoField"));
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

	@And("User_074 verify the Customer Name field available under Credit Score details section")
	public void user_verify_the_customer_name_field_available_under_credit_score_details_section() throws Throwable {
		WebElement creditScore_CustomerNameField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScore_CustomerNameField"));
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

	@And("User_074 verify the Credit Bureau Score field available under Credit Score details section")
	public void user_verify_the_credit_bureau_score_field_available_under_credit_score_details_section() throws Throwable {
		WebElement creditScore_CreditBureauScoreField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("creditScore_CreditBureauScoreField"));
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
	@And("User_074 verify the Eligibility Type field available under Eligibility Details section")
	public void user_verify_the_eligibility_type_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_EligibilityTypeField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetails_EligibilityTypeField"));
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

	@And("User_074 verify the Eligibility Amount field available under Eligibility Details section")
	public void user_verify_the_eligibility_amount_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_EligibilityAmtField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetails_EligibilityAmtField"));
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

	@And("User_074 verify the Eligibility Percentage field available under Eligibility Details section")
	public void user_verify_the_eligibility_percentage_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_EligibilityPercentField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetails_EligibilityPercentField"));
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

	@And("User_074 verify the Currency field available under Eligibility Details section")
	public void user_verify_the_currency_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_CurrencyField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetails_CurrencyField"));
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

	@And("User_074 verify the Actual Percentage field available under Eligibility Details section")
	public void user_verify_the_actual_percentage_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_ActualPercentField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetails_ActualPercentField"));
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

	@And("User_074 verify the Deviation level field available under Eligibility Details section")
	public void user_verify_the_deviation_level_field_available_under_eligibility_details_section() throws Throwable {
		WebElement eligibilityDetails_DeviationLevelField = javascriptHelper.executeScriptWithWebElement(offering_OfferDetailsJsPaths.getElement("eligibilityDetails_DeviationLevelField"));
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

}
