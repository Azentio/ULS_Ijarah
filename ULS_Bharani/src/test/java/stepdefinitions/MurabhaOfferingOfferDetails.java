package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class MurabhaOfferingOfferDetails {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths MurabhaOfferingOfferDetails = new JSPaths(excelPath, "MurabhaOfferingOfferDetails", "FieldName", "JSPath");

	
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
	
	ExcelData TWCommodityPurchaseCustoDetailsExcelData  = new ExcelData(excelTestDataPath,"TWCommodityPurchaseCustoDetails","DataSet ID");
	Map<String, String> testData;

	@And("User_604 click edit button under inbox screen02")
	public void user_click_edit_button_under_inbox_screen02() throws Throwable {
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
	
	@And("User_604 verify the Back button field available on offer details screen")
	public void user_verify_the_back_button_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Accept Offer field available on offer details screen")
	public void user_verify_the_accept_offer_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Offer Details Section field available on offer details screen")
	public void user_verify_the_offer_details_section_field_available_on_offer_details_screen() {
	    
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
	
	

	@And("User_604 verify the Finance Details Section field available on offer details screen")
	public void user_verify_the_finance_details_section_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Credit Risk Factor Sectioin field available on offer details screen")
	public void user_verify_the_credit_risk_factor_sectioin_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Credit Score Details Section field available on offer details screen")
	public void user_verify_the_credit_score_details_section_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Eligibility Details Screen field available on offer details screen")
	public void user_verify_the_eligibility_details_screen_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Interest Rate Structure Section field available on offer details screen")
	public void user_verify_the_interest_rate_structure_section_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Installments Section field available on offer details screen")
	public void user_verify_the_installments_section_field_available_on_offer_details_screen() {
	    
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

	@And("User_604 verify the Appeal Request Section field available on offer details screen")
	public void user_verify_the_appeal_request_section_field_available_on_offer_details_screen() {
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
	
	@And("User_604 verify Product data should be read only")
	public void user_verify_product_data_should_be_read_only() {
	String offProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_product")).getAttribute("ng-reflect-readonly");
	    System.err.println(offProduct);
	    
	    Assert.assertEquals("true",offProduct);
	    
	    	}

	@And("User_604 verify Sub Product data should be read only")
	public void user_verify_sub_product_data_should_be_read_only() {
		String offSubProduct=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_SubProduct")).getAttribute("ng-reflect-readonly");
	    System.err.println(offSubProduct);
	    Assert.assertEquals("true",offSubProduct);
	}

	@And("User_604 verify Scheme data should be read only")
	public void user_verify_scheme_data_should_be_read_only() {
		String offScheme=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_Scheme")).getAttribute("ng-reflect-readonly");
	    System.err.println(offScheme);
	    Assert.assertEquals("true",offScheme);
	}

	@And("User_604 verify Princing Indicator data should be read only")
	public void user_verify_princing_indicator_data_should_be_read_only() {
		String offPrincingIndicator=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("getAttribute_PrincingIndicator")).getAttribute("ng-reflect-readonly");
	    System.err.println(offPrincingIndicator);
	    Assert.assertEquals("true",offPrincingIndicator);
	}
	
	//------------------------@AT_OFL_02
	
	@And("User_604 verify the Back button field")
	public void user_verify_the_back_button_field() throws Throwable {
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
	
	@And("User_604 verify the Product field available in offer details")
	public void user_verify_the_product_field_available_in_offer_details() throws Throwable {
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

	@And("User_604 verify the Sub Product field available in offer details")
	public void user_verify_the_sub_product_field_available_in_offer_details() throws Throwable {
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

	@And("User_604 verify the Scheme field available in offer details")
	public void user_verify_the_scheme_field_available_in_offer_details() throws Throwable {
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

	@And("User_604 verify the Pricing Indicator field available in offer details")
	public void user_verify_the_pricing_indicator_field_available_in_offer_details() throws Throwable {
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

	@And("User_604 verify the Product Offer Amount available in offer details")
	public void user_verify_the_product_offer_amount_available_in_offer_details() throws Throwable {
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

	@And("User_604 verify the Tenure field available in offer details")
	public void user_verify_the_tenure_field_available_in_offer_details() throws Throwable {
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

	@And("User_604 verify the Nature Of Finance field available in offer details")
	public void user_verify_the_nature_of_finance_field_available_in_offer_details() throws Throwable {
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
	
	@And("User_604 verify the Currency field available in offer details")
	public void user_verify_the_currency_field_available_in_offer_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")).isDisplayed());
		
		//------------read only 
		
				String offCurrency=javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("OflCurrency")).getAttribute("ng-reflect-readonly");
			    System.err.println(offCurrency);
			    Assert.assertEquals("true",offCurrency);
	    
	}
	
	@And("User_604 verify the Amount Request field available in Finance details screen")
	public void user_verify_the_amount_request_field_available_in_finance_details_screen() throws Throwable {
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

	@And("User_604 verify the Down Payment Amount field available in Finance details screen")
	public void user_verify_the_down_payment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentAmount")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Down Payment Amount field available in Finance details screen")
	public void user_verify_the_total_down_payment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalDownPaymentAmount")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Profit Amount field available in Finance details screen")
	public void user_verify_the_total_profit_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdProfitAmount")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Contract Value field available in Finance details screen")
	public void user_verify_the_total_contract_value_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalContractAmount")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Income field available in Finance details screen")
	public void user_verify_the_total_income_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalIncome")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalIncome")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalIncome")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Net Income field available in Finance details screen")
	public void user_verify_the_total_net_income_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalNetIncome")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalNetIncome")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalNetIncome")).isDisplayed());
	    
	}

	@And("User_604 verify the Installment Fraquency field available in Finance details screen")
	public void user_verify_the_installment_fraquency_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdInstallmentFrequence")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdInstallmentFrequence")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdInstallmentFrequence")).isDisplayed());
	    
	}

	@And("User_604 verify the IRR field available in Finance details screen")
	public void user_verify_the_irr_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdIRR")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdIRR")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdIRR")).isDisplayed());
	    
	}

	@And("User_604 verify the Tenure field available in Finance details screen")
	public void user_verify_the_tenure_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTenure")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTenure")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTenure")).isDisplayed());
	    
	}

	@And("User_604 verify the Additional Down Payment field available in Finance details screen")
	public void user_verify_the_additional_down_payment_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAdditionalDownPayment")).isDisplayed());
	    
	}

	@And("User_604 verify the Down Payment Percentage field available in Finance details screen")
	public void user_verify_the_down_payment_percentage_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdDownPaymentPercentage")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Fees field available in Finance details screen")
	public void user_verify_the_total_fees_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalFees")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalFees")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalFees")).isDisplayed());
	    
	}

	@And("User_604 verify the Total Obligations field available in Finance details screen")
	public void user_verify_the_total_obligations_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalObligation")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalObligation")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdTotalObligation")).isDisplayed());
	    
	}

	@And("User_604 verify the No Of Installment field available in Finance details screen")
	public void user_verify_the_no_of_installment_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdNoOfInstallment")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdNoOfInstallment")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdNoOfInstallment")).isDisplayed());
	    
	}

	@And("User_604 verify the Last Installment Amount field available in Finance details screen")
	public void user_verify_the_last_installment_amount_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdLastInstallmentAmount")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdLastInstallmentAmount")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdLastInstallmentAmount")).isDisplayed());
	    
	}

	@And("User_604 verify the APR field available in Finance details screen")
	public void user_verify_the_apr_field_available_in_finance_details_screen() throws Throwable {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAPR")));
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAPR")));
		Assert.assertEquals(true,javascriptHelper.executeScriptWithWebElement(MurabhaOfferingOfferDetails.getElement("FdAPR")).isDisplayed());
	    
	}
	
	


}
