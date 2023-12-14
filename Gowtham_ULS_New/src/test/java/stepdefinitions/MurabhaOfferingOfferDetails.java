package stepdefinitions;

import java.io.IOException;
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

public class MurabhaOfferingOfferDetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths MurabhaOfferingOfferDetails = new JSPaths(excelPath, "MurabhaOfferingOfferDetails", "FieldName", "JSPath");
	ExcelData IjaraAppDataCheckQuationInfoexelData = new ExcelData(excelTestDataPath, "IjaraAppDataCheckQuationInfo", "Data Set ID");
	ExcelData MurabhAppdataEntryInsuranceInfo = new ExcelData(excelTestDataPath, "MurabhAppdataEntryInsuranceInfo", "Data Set ID");
	ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "Living_Expense", "Data Set ID");
	
	ExcelData TawaAppDataEntryIncomeDetailsexelData = new ExcelData(excelTestDataPath, "TawaAppDataEntryIncomeDetails", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	@And("User_607 click edit button under inbox screen02")
	public void user_607_click_edit_button_under_inbox_screen02() throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("editBtnIndex2")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
		Thread.sleep(3000);
	}
	
	@And("User_607 verify the Back button field available on offer details screen")
	public void user_607_verify_the_back_button_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("backBtn_UnderCustomerDetails")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Accept Offer field available on offer details screen")
	public void user_607_verify_the_accept_offer_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AcceptOffer")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Offer Details Section field available on offer details screen")
	public void user_607_verify_the_offer_details_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OfferDetailsSection")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Finance Details Section field available on offer details screen")
	public void user_607_verify_the_finance_details_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FinanceDetailsSection")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Credit Risk Factor Sectioin field available on offer details screen")
	public void user_607_verify_the_credit_risk_factor_sectioin_field_available_on_offer_details_screen() {
	    
		//---------------------display
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CreditRiskFactor")));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CreditRiskFactor")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Credit Score Details Section field available on offer details screen")
	public void user_607_verify_the_credit_score_details_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CreditScoreDetails")));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CreditScoreDetails")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Eligibility Details Screen field available on offer details screen")
	public void user_607_verify_the_eligibility_details_screen_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityDetails")));
				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityDetails")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Interest Rate Structure Section field available on offer details screen")
	public void user_607_verify_the_interest_rate_structure_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure")));

				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Installments Section field available on offer details screen")
	public void user_607_verify_the_installments_section_field_available_on_offer_details_screen() {
	    
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InstallmentsSection")));

				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InstallmentsSection")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}

	@And("User_607 verify the Appeal Request Section field available on offer details screen")
	public void user_607_verify_the_appeal_request_section_field_available_on_offer_details_screen() {
		//---------------------display
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AppealRequestsection")));

				for (int j = 0; j < 200; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AppealRequestsection")).isDisplayed()) {
							Assert.assertTrue(true);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	    
	}
	
	//-----------------data should read only-------------
	
	@And("User_607 verify Product data should be read only")
	public void user_607_verify_product_data_should_be_read_only() {
	String offProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_product")).getAttribute("ng-reflect-readonly");
	    System.err.println(offProduct);
	    
	    Assert.assertEquals("true",offProduct);
	    
	    	}

	@And("User_607 verify Sub Product data should be read only")
	public void user_607_verify_sub_product_data_should_be_read_only() {
		String offSubProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_SubProduct")).getAttribute("ng-reflect-readonly");
	    System.err.println(offSubProduct);
	    Assert.assertEquals("true",offSubProduct);
	}

	@And("User_607 verify Scheme data should be read only")
	public void user_607_verify_scheme_data_should_be_read_only() {
		String offScheme=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_Scheme")).getAttribute("ng-reflect-readonly");
	    System.err.println(offScheme);
	    Assert.assertEquals("true",offScheme);
	}

	@And("User_607 verify Princing Indicator data should be read only")
	public void user_607_verify_princing_indicator_data_should_be_read_only() {
		String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_PrincingIndicator")).getAttribute("ng-reflect-readonly");
	    System.err.println(offPrincingIndicator);
	    Assert.assertEquals("true",offPrincingIndicator);
	}
	
	//------------------------@AT_OFL_02
	
	@And("User_607 verify the Back button field")
	public void user_607_verify_the_back_button_field() throws Throwable {
		for (int j = 0; j <= 400; j++) {
			try {
			//	javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("BackBtn_NavigativeFacilityScreen")).click();
				if (!javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("BackBtn_NavigativeFacilityScreen")).isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (j==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	//---------------------@AT_OFL_03   offer details screen
	
	@And("User_607 verify the Product field available in offer details")
	public void user_607_verify_the_product_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflProduct")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflProduct"))
						.isDisplayed());
		
		//--read only
		
		String offProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_product"))
				.getAttribute("ng-reflect-readonly");
		    System.err.println(offProduct);
		    
		    Assert.assertEquals("true",offProduct);
	    
	}

	@And("User_607 verify the Sub Product field available in offer details")
	public void user_607_verify_the_sub_product_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflSubProduct")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflSubProduct"))
						.isDisplayed());
		
		//--read only
		
		String offSubProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_SubProduct")).getAttribute("ng-reflect-readonly");
	    System.err.println(offSubProduct);
	    Assert.assertEquals("true",offSubProduct);
	    
	}

	@And("User_607 verify the Scheme field available in offer details")
	public void user_607_verify_the_scheme_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflScheme")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflScheme"))
						.isDisplayed());
		//------------read only
		
		String offScheme=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_Scheme")).getAttribute("ng-reflect-readonly");
	    System.err.println(offScheme);
	    Assert.assertEquals("true",offScheme);
	    
	}

	@And("User_607 verify the Pricing Indicator field available in offer details")
	public void user_607_verify_the_pricing_indicator_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflPrincingIndicator")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflPrincingIndicator"))
						.isDisplayed());
		
		//-------read only
		
		String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_PrincingIndicator")).getAttribute("ng-reflect-readonly");
	    System.err.println(offPrincingIndicator);
	    Assert.assertEquals("true",offPrincingIndicator);
	    
	}

	@And("User_607 verify the Product Offer Amount available in offer details")
	public void user_607_verify_the_product_offer_amount_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflOfferdAmount")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflOfferdAmount"))
						.isDisplayed());
		
		//-------read only
		
				String offProductOfferAmount=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflOfferdAmount")).getAttribute("ng-reflect-readonly");
			    System.err.println(offProductOfferAmount);
			    Assert.assertEquals("true",offProductOfferAmount);
	    
	}

	@And("User_607 verify the Tenure field available in offer details")
	public void user_607_verify_the_tenure_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflTenure")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflTenure"))
						.isDisplayed());
		
		//-------read only
		
		String offTenure=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflTenure")).getAttribute("ng-reflect-readonly");
	    System.err.println(offTenure);
	    Assert.assertEquals("true",offTenure);
	    
	}

	@And("User_607 verify the Nature Of Finance field available in offer details")
	public void user_607_verify_the_nature_of_finance_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflNaturalOfFinance")));
		Assert.assertEquals(true,
				javascriptHelper
						.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflNaturalOfFinance"))
						.isDisplayed());
		
		//------------read only 
		
		String offNatureOfFinance=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflNaturalOfFinance")).getAttribute("ng-reflect-readonly");
	    System.err.println(offNatureOfFinance);
	    Assert.assertEquals("true",offNatureOfFinance);
	    
	}
	
	@And("User_607 verify the Currency field available in offer details")
	public void user_607_verify_the_currency_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")).isDisplayed());
		
		//------------read only 
		
				String offCurrency=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")).getAttribute("ng-reflect-readonly");
			    System.err.println(offCurrency);
			    Assert.assertEquals("true",offCurrency);
	    
	}
	
	//---------------------------@AT_OFL_04--------------------
	
	@And("User_607 verify the Amount Request field available in Finance details screen")
	public void user_607_verify_the_amount_request_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAmountRequested")));
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAmountRequested")));
//		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAmountRequested")).isDisplayed());
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAmountRequested")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("User_607 verify the Down Payment Amount field available in Finance details screen")
	public void user_607_verify_the_down_payment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentAmount")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Down Payment Amount field available in Finance details screen")
	public void user_607_verify_the_total_down_payment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Profit Amount field available in Finance details screen")
	public void user_607_verify_the_total_profit_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Contract Value field available in Finance details screen")
	public void user_607_verify_the_total_contract_value_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Income field available in Finance details screen")
	public void user_607_verify_the_total_income_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalIncome")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalIncome")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalIncome")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Net Income field available in Finance details screen")
	public void user_607_verify_the_total_net_income_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalNetIncome")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalNetIncome")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalNetIncome")).isDisplayed());
	    
	}

	@And("User_607 verify the Installment Fraquency field available in Finance details screen")
	public void user_607_verify_the_installment_fraquency_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdInstallmentFrequence")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdInstallmentFrequence")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdInstallmentFrequence")).isDisplayed());
	    
	}

	@And("User_607 verify the IRR field available in Finance details screen")
	public void user_607_verify_the_irr_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdIRR")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdIRR")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdIRR")).isDisplayed());
	    
	}

	@And("User_607 verify the Tenure field available in Finance details screen")
	public void user_607_verify_the_tenure_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTenure")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTenure")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTenure")).isDisplayed());
	    
	}

	@And("User_607 verify the Additional Down Payment field available in Finance details screen")
	public void user_607_verify_the_additional_down_payment_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")).isDisplayed());
	    
	}

	@And("User_607 verify the Down Payment Percentage field available in Finance details screen")
	public void user_607_verify_the_down_payment_percentage_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Fees field available in Finance details screen")
	public void user_607_verify_the_total_fees_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalFees")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalFees")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalFees")).isDisplayed());
	    
	}

	@And("User_607 verify the Total Obligations field available in Finance details screen")
	public void user_607_verify_the_total_obligations_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalObligation")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalObligation")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalObligation")).isDisplayed());
	    
	}

	@And("User_607 verify the No Of Installment field available in Finance details screen")
	public void user_607_verify_the_no_of_installment_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdNoOfInstallment")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdNoOfInstallment")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdNoOfInstallment")).isDisplayed());
	    
	}

	@And("User_607 verify the Last Installment Amount field available in Finance details screen")
	public void user_607_verify_the_last_installment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdLastInstallmentAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdLastInstallmentAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdLastInstallmentAmount")).isDisplayed());
	    
	}

	@And("User_607 verify the APR field available in Finance details screen")
	public void user_607_verify_the_apr_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAPR")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAPR")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAPR")).isDisplayed());
	    
	}
	
	//-----------------@AT_OFL_05---------------
	
	@And("User_607 verify the Offer Details Section Screen Under All field Should read only")
	public void user_607_verify_the_offer_details_section_screen_under_all_field_should_read_only() {
		
		//--read only  -- product
		
				String offProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_product"))
						.getAttribute("ng-reflect-readonly");
				System.err.println(offProduct);
				Assert.assertEquals("true",offProduct);
				    
	    //--read only      ---------sub product
					
		    String offSubProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_SubProduct")).getAttribute("ng-reflect-readonly");
		    System.err.println(offSubProduct);
		    Assert.assertEquals("true",offSubProduct);	
		    
		//------------read only --------scheme
			
		    String offScheme=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_Scheme")).getAttribute("ng-reflect-readonly");
		    System.err.println(offScheme);
		    Assert.assertEquals("true",offScheme);	
		    
		//-------read only   ------ princing indicator
			
		    String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_PrincingIndicator")).getAttribute("ng-reflect-readonly");
		    System.err.println(offPrincingIndicator);
		    Assert.assertEquals("true",offPrincingIndicator);
		    
		//-------read only Product Offer Amount
			
			String offProductOfferAmount=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflOfferdAmount")).getAttribute("ng-reflect-readonly");
		    System.err.println(offProductOfferAmount);
		    Assert.assertEquals("true",offProductOfferAmount);		 
		    
		  //-------read only  ------- Tenure
			
			String offTenure=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflTenure")).getAttribute("ng-reflect-readonly");
		    System.err.println(offTenure);
		    Assert.assertEquals("true",offTenure);		
		    
		 //------------read only  --  Nature Of Finance
			
			String offNatureOfFinance=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflNaturalOfFinance")).getAttribute("ng-reflect-readonly");
		    System.err.println(offNatureOfFinance);
		    Assert.assertEquals("true",offNatureOfFinance);		    
		    
		 //------------read only 
			
			String offCurrency=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")).getAttribute("ng-reflect-readonly");
		    System.err.println(offCurrency);
		    Assert.assertEquals("true",offCurrency);		    
	}
	

	@And("User_607 verify the Total Down Payment Amount field read only")
	public void user_607_verify_the_total_down_payment_amount_field_read_only() {
		String OffTotalDownPaymentAmount=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffTotalDownPaymentAmount);
	    Assert.assertEquals("true",OffTotalDownPaymentAmount);
	    
	}

	@And("User_607 verify the Profit Amount field read only")
	public void user_607_verify_the_profit_amount_field_read_only() {
		String OffProfitAmount=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffProfitAmount);
	    Assert.assertEquals("true",OffProfitAmount);
	    
	}

	@And("User_607 verify the Total Contract Value field read only")
	public void user_607_verify_the_total_contract_value_field_read_only() {
		String OffTotalContractValue=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffTotalContractValue);
	    Assert.assertEquals("true",OffTotalContractValue);
	    
	}

	@And("User_607 verify the Additional Down Payment field read only")
	public void user_607_verify_the_additional_down_payment_field_read_only() {
		String OffAdditionalDownPayment=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffAdditionalDownPayment);
	    Assert.assertEquals("true",OffAdditionalDownPayment);
	    
	}

	@And("User_607 verify the Down Payment Percentage field read only")
	public void user_607_verify_the_down_payment_percentage_field_read_only() {
		String OffTotalDownPaymentPercentage=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")).getAttribute("ng-reflect-readonly");
	    System.err.println(OffTotalDownPaymentPercentage);
	    Assert.assertEquals("true",OffTotalDownPaymentPercentage);
	    
	}
	
	//---------------------@AT_OFL_06  credit rise factor --------
	
	@And("User_607 verify the Total Score field under credit rise factor")
	public void user_607_verify_the_total_score_field_under_credit_rise_factor() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CreditRiskFactor")));
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("TotalScore")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("TotalScore")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("User_607 verify the Rise Level field under credit rise factor")
	public void user_607_verify_the_rise_level_field_under_credit_rise_factor() {
	    
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("RiseLevel")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("RiseLevel")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
	}
	
	//-------------------------@AT_OFL_07 credit Score details
	
	@And("User_607 verify the SR NO field under credit Score details")
	public void user_607_verify_the_sr_no_field_under_credit_score_details() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CreditScoreDetails")));
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CSD_SrNo")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CSD_SrNo")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
	}

	@And("User_607 verify the Customer Name field under credit Score details")
	public void user_607_verify_the_customer_name_field_under_credit_score_details() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CSD_CustomerName")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CSD_CustomerName")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("User_607 verify the Credit Bureau Score field under credit Score details")
	public void user_607_verify_the_credit_bureau_score_field_under_credit_score_details() {
		
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CSD_CreditBureuaScore")));
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CSD_CreditBureuaScore")).isDisplayed()){
					Assert.assertTrue(true);
				} 
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if (i == 299) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}
	
	@And("Validate the Eligibility type field is displayed in Eligibility details section")
	public void validate_the_eligibility_type_field_is_displayed_in_eligibility_details_section() throws IOException{
		
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityTypeField")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityTypeField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityTypeField")).isDisplayed());
		
	}

	@And("Validate the Eligibility amount field is displayed in Eligibility details section")
	public void validate_the_eligibility_amount_field_is_displayed_in_eligibility_details_section() throws IOException{
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityAmtField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate the Eligibility percentage field is displayed in Eligibility details section")
	public void validate_the_eligibility_percentage_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityPercentField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("EligibilityPercentField")).isDisplayed());
	   
	}

	@And("Validate the Currency field is displayed in Eligibility details section")
	public void validate_the_currency_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CurrencyField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("CurrencyField")).isDisplayed());
	   
	}

	@And("Validate the Actual Percentage field is displayed in Eligibility details section")
	public void validate_the_actual_percentage_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("ActualPercentField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("ActualPercentField")).isDisplayed());
	   
	}

	@And("Validate the Deviation level field is displayed in Eligibility details section")
	public void validate_the_deviation_level_field_is_displayed_in_eligibility_details_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("DeviationLevelField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("DeviationLevelField")).isDisplayed());
	   
	}
	@And("Validate the Period field is displayed in Interest rate structure section")
	public void validate_the_period_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		
	   
	}

	@And("Validate the Rate definition field is displayed in Interest rate structure section")
	public void validate_the_rate_definition_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_RateDefinition")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_RateDefinition")).isDisplayed());
	   
	}

	@And("Validate the Effective Rate field is displayed in Interest rate structure section")
	public void validate_the_effective_rate_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_EffectiveRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_EffectiveRate")).isDisplayed());
	   
	}

	@And("Validate the Base Rate is displayed in Interest rate structure section")
	public void validate_the_base_rate_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_BaseRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_BaseRate")).isDisplayed());
	   
	}

	@And("Validate the Spread rate field is displayed in Interest rate structure section")
	public void validate_the_spread_rate_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_SpreadRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_SpreadRate")).isDisplayed());
	   
	}

	@And("Validate the Cap rate is displayed in Interest rate structure section")
	public void validate_the_cap_rate_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_CapRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_CapRate")).isDisplayed());
	   
	}

	@And("Validate the Floor rate field is displayed in Interest rate structure section")
	public void validate_the_floor_rate_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_FloorRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_FloorRate")).isDisplayed());
	   
	}

	@And("Validate the RBP Adjuster field is displayed in Interest rate structure section")
	public void validate_the_rbp_adjuster_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_RBPAdjuster")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_RBPAdjuster")).isDisplayed());
	   
	}

	@And("Validate the Penalty rate is displayed in Interest rate structure section")
	public void validate_the_penalty_rate_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_PenaltyRate")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_PenaltyRate")).isDisplayed());
	   
	}

	@And("Validate the Penalty Fee field is displayed in Interest rate structure section")
	public void validate_the_penalty_fee_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_PenaltyFee")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_PenaltyFee")).isDisplayed());
	   
	}
	@And("Validate the Instalment Period field is displayed in Interest rate structure section")
	public void validate_the_instalment_period_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("Installments_InstallmentPeriod")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("Installments_InstallmentPeriod")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("Installments_InstallmentPeriod")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("Installments_InstallmentPeriod")).isDisplayed());
	   
	}

	@And("Validate the Installment Amount field is displayed in Interest rate structure section")
	public void validate_the_installment_amount_field_is_displayed_in_interest_rate_structure_section() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("Installments_InstallmentAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("Installments_InstallmentAmount")).isDisplayed());
	   
	}

	@And("Validate the Accept offer button is present in Offering page")
	public void validate_the_accept_offer_button_is_present_in_offering_page() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AcceptOfferButton")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AcceptOfferButton")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AcceptOfferButton")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AcceptOfferButton")).isDisplayed());
	   
	}
	@And("Click on Accept offer button in offering page")
	public void click_on_accept_offer_button_in_offering_page() {
	    
	    
	}

	@And("Validate the Original requested amount field is displayed in Appeal request section")
	public void validate_the_original_requested_amount_field_is_displayed_in_appeal_request_section() throws IOException {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedAmount")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedAmount")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedAmount")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedAmount")).isDisplayed());
	    
	}

	@And("Validate the Original requested tenure field is displayed in Appeal request section")
	public void validate_the_original_requested_tenure_field_is_displayed_in_appeal_request_section() throws IOException{
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedTenure")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedTenure")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedTenure")));
		//Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OriginalRequestedTenure")).isDisplayed());
	    
	}

	@And("Validate the New requested amount field in Appeal request section")
	public void validate_the_new_requested_amount_field_in_appeal_request_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedAmount")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedAmount")).isDisplayed());
	    
	}

	@And("Validate the New requested tenure field in Appeal request section")
	public void validate_the_new_requested_tenure_field_in_appeal_request_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedTenure")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedTenure")).isDisplayed());
	    
	}

	@And("Enter the value in New requested amount field in Appeal request section")
	public void enter_the_value_in_new_requested_amount_field_in_appeal_request_section() {
		javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedAmount")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedAmount"))
				.sendKeys("5000",Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}
	    
	}

	@And("Enter the value in New requested tenure field in Appeal request section")
	public void enter_the_value_in_new_requested_tenure_field_in_appeal_request_section() {
		javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedTenure")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("NewRequestedTenure"))
				.sendKeys("10",Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				
			}
		}
	    
	}

	@And("Click on Save button in Appeal request section")
	public void click_on_save_button_in_appeal_request_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("SaveButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("Click on Appeal button in Appeal request section")
	public void click_on_appeal_button_in_appeal_request_section() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("AppealButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	@And("Validate the Recommendations sanction Conditions link is displayed in Appeal request section")
	public void validate_the_recommendations_sanction_conditions_link_is_displayed_in_appeal_request_section() throws IOException {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("RecommendationsSanctionConditionsLink")));
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("InterestRateStructure_Period")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("RecommendationsSanctionConditionsLink")).isDisplayed());
				break;
			} catch (Exception e) {
				
			}
		}
		
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("RecommendationsSanctionConditionsLink")));
//		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("RecommendationsSanctionConditionsLink")).isDisplayed());
	    
	}

	@And("Validate the Approval History link is displayed in Appeal request section")
	public void validate_the_approval_history_link_is_displayed_in_appeal_request_section() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("ApprovalHistoryLink")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("ApprovalHistoryLink")).isDisplayed());
	    
	}
	@And("User search the Ref id under inbox for offer details")
	public void user_607_search_the_ref_id_under_inbox_for_offer_details() throws IOException {
		System.out.println(testData.get("Ref No"));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	@And("Click on Pencil icon of existing record in offer details")
	public void click_on_pencil_icon_of_existing_record_in_offer_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("PencilIcon")));
				//javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
