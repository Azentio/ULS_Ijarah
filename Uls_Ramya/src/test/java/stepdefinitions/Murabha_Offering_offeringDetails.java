package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_Offering_offeringDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Murabha_offerDetail = new JSPaths(excelPath, "tawa_offering_js", "OfferDetailsElement", "JSPath");
	ExcelData Murabha_offerDetail_TestData  = new ExcelData(excelTestDataPath,"mura_offering_offerDetail","Dataset ID");
	

	
	@And("User_6047 Login With valid credentials-Murabha-offering-offerDetail")
	public void Login_with_valid_credentials_murabha_offering_offerDetail() throws Throwable {
		ijaraLogin.loginWithIjaraApplication_murabha_offering_offerDetail();	
	}
	
	@And("User_6047 Get the test data for test case ID AT_MU_OFO_01")
	public void user_get_the_test_data_for_test_case_id_AT_MU_OFO_01() {	
		testData =  Murabha_offerDetail_TestData.getTestdata("DS01_AT_MU_OFO_01");	
	}
	
	@And("User_6047 search the Refere id under Inbox")
	public void user_search_the_refere_id_under_inbox_6047() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
		}
	@And("User_6047 verify the Offer Details section under offer details")
	public void user_verify_the_offer_details_section_under_offer_details() {
		boolean OfferDetail_Verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				OfferDetail_Verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("OfferDetail_Verify")).isDisplayed();
				if (OfferDetail_Verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(OfferDetail_Verify, "OfferDetail is not visisble hence failed");
	}

	@Then("User_6047 verify the Finance Details section under offer details")
	public void user_verify_the_finance_details_section_under_offer_details() {
		boolean FinancialDetails_Verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				FinancialDetails_Verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("FinancialDetails_Verify")).isDisplayed();
				if (FinancialDetails_Verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(FinancialDetails_Verify, "FinancialDetails is not visisble hence failed");
	}

	@Then("User_6047 verify the Credit Risk Factor \\(CONV) section under offer details")
	public void user_verify_the_credit_risk_factor_conv_section_under_offer_details() {
		boolean CreditRiskFactor_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				CreditRiskFactor_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("CreditRiskFactor_verify")).isDisplayed();
				if (CreditRiskFactor_verify == true) {
					break;
				}
			
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(CreditRiskFactor_verify, "CreditRiskFactor is not visisble hence failed");
	}

	@Then("User_6047 verify the Credit Score Details \\(CONV) section under offer details")
	public void user_verify_the_credit_score_details_conv_section_under_offer_details() {
		boolean CreditScoreDetail_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				CreditScoreDetail_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("CreditScoreDetail_verify")).isDisplayed();
				if (CreditScoreDetail_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(CreditScoreDetail_verify, "CreditScoreDetail is not visisble hence failed");
	}

	@Then("User_6047 verify the Eligibility Details section under offer details")
	public void user_verify_the_eligibility_details_section_under_offer_details() {
		boolean EligibilityDetail_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				EligibilityDetail_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("EligibilityDetail_verify")).isDisplayed();
				if (EligibilityDetail_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(EligibilityDetail_verify, "EligibilityDetail is not visisble hence failed");
	}

	@Then("User_6047 verify the Interest Rate Structure section under offer details")
	public void user_verify_the_interest_rate_structure_section_under_offer_details() {
		boolean InterestRateStructure_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				InterestRateStructure_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("InterestRateStructure_verify")).isDisplayed();
				if (InterestRateStructure_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(InterestRateStructure_verify, "InterestRateStructure is not visisble hence failed");
	}

	@Then("User_6047 verify the Installments section under offer details")
	public void user_verify_the_installments_section_under_offer_details() {
		boolean Installments_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				Installments_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("Installments_verify")).isDisplayed();
				if (Installments_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(Installments_verify, "Installments is not visisble hence failed");
	}
	

	@Then("User_6047 verify the Appeal Request section under offer details")
	public void user_verify_the_appeal_request_section_under_offer_details() {
		boolean AppealRequest_verify = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				AppealRequest_verify = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("AppealRequest_verify")).isDisplayed();
				if (AppealRequest_verify == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(AppealRequest_verify, "AppealRequest is not visisble hence failed");
	}
	@And("User_6047 To verify the product field is displayed")
	public void user_to_verify_the_product_field_is_displayed() {
		boolean product = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				product = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("product")).isDisplayed();
				if (product == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(product, "product is not visisble hence failed");
	}

	@Then("User_6047 To verify the Sub-Product field is displayed")
	public void user_to_verify_the_sub_product_field_is_displayed() {
		boolean sub_product = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				sub_product = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("sub_product")).isDisplayed();
				if (sub_product == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(sub_product, "subproduct is not visisble hence failed");
	}

	@Then("User_6047 To verify the Scheme field is displayed")
	public void user_to_verify_the_scheme_field_is_displayed() {
		boolean scheme = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				scheme = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("scheme")).isDisplayed();
				if (scheme == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(scheme, "scheme is not visisble hence failed");
	}

	@Then("User_6047 To verify the Nature of Finance field is displayed")
	public void user_to_verify_the_nature_of_finance_field_is_displayed() {
		boolean natureOfFinance = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				natureOfFinance = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("natureOfFinance")).isDisplayed();
				if (natureOfFinance == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(natureOfFinance, "Nature Of finance is not visisble hence failed");
	}

	@Then("User_6047 To verify the Currency field is displayed")
	public void user_to_verify_the_currency_field_is_displayed() {
		boolean currency = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				currency = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("currency")).isDisplayed();
				if (currency == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(currency, "currency is not visisble hence failed");
	}

	@Then("User_6047 To verify the Pricing Indicator field is displayed")
	public void user_to_verify_the_pricing_indicator_field_is_displayed() {
		boolean pricingIndicator = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				pricingIndicator = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("pricingIndicator")).isDisplayed();
				if (pricingIndicator == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(pricingIndicator, "pricing Indicator is not visisble hence failed");
	}

	@Then("User_6047 To verify the Tenure field is displayed")
	public void user_to_verify_the_tenure_field_is_displayed() {
		boolean facility_tenure = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				facility_tenure = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("facility_tenure")).isDisplayed();
				if (facility_tenure == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(facility_tenure, "tenure is not visisble hence failed");
	}

	@Then("User_6047 To verify the Eligible Income field is displayed")
	public void user_to_verify_the_eligible_income_field_is_displayed() {
		boolean eligibleIncome = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				eligibleIncome = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("eligibleIncome")).isDisplayed();
				if (eligibleIncome == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(eligibleIncome, "Eligible Income is not visisble hence failed");
	}

	@Then("User_6047 To verify the Offered Amount field is displayed")
	public void user_to_verify_the_offered_amount_field_is_displayed() {
		boolean offeredAmount = false;
		int i;
		for ( i = 0; i <= 300; i++) {
			try {
				offeredAmount = javascriptHelper
						.executeScriptWithWebElement(Murabha_offerDetail.getElement("offeredAmount")).isDisplayed();
				if (offeredAmount == true) {
					System.out.println("Offered Amount is displayed");
					break;
				}	
				
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(offeredAmount, "offered Amount is not visisble hence failed");
	}

@And("User_6047 To verify the product field is non-editable")
public void user_to_verify_the_product_field_is_non_editable() throws Throwable {
	Thread.sleep(3000);
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("product")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Sub-Product field is non-editable")
public void user_to_verify_the_sub_product_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("sub_product")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Scheme field is non-editable")
public void user_to_verify_the_scheme_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("scheme")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Nature of Finance field is non-editable")
public void user_to_verify_the_nature_of_finance_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("natureOfFinance")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Currency field is non-editable")
public void user_to_verify_the_currency_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("currency")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Pricing Indicator field is non-editable")
public void user_to_verify_the_pricing_indicator_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("pricingIndicator")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Tenure field is non-editable")
public void user_to_verify_the_tenure_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("facility_tenure")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Eligible Income field is non-editable")
public void user_to_verify_the_eligible_income_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("eligibleIncome")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Offered Amount field is non-editable")
public void user_to_verify_the_offered_amount_field_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("offeredAmount")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Amount Requested field in Finance Details section is non-editable")
public void user_to_verify_the_amount_requested_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("AmountRequest")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Down Payment Percentage field in Finance Details section is non-editable")
public void user_to_verify_the_down_payment_percentage_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("DownPaymentPercentage")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Down Payment Amount  field in Finance Details section is non-editable")
public void user_to_verify_the_down_payment_amount_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("DownPaymentAmount")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Additional Down payment field in Finance Details section is non-editable")
public void user_to_verify_the_additional_down_payment_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("AdditionalDownPayment")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Total Down Payment Amount field in Finance Details section is non-editable")
public void user_to_verify_the_total_down_payment_amount_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("TotalDownPaymentAmount")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Profit Amount field in Finance Details section is non-editable")
public void user_to_verify_the_profit_amount_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("profitAmount")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Total Fees field in Finance Details section is non-editable")
public void user_to_verify_the_total_fees_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("TotalFees")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Total Contract Value field in Finance Details section is non-editable")
public void user_to_verify_the_total_contract_value_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("TotalContractValue")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Tenure field in Finance Details section is non-editable")
public void user_to_verify_the_tenure_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("Tenure")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Total Income field in Finance Details section is non-editable")
public void user_to_verify_the_total_income_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("TotalIncome")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Total Obligations field in Finance Details section is non-editable")
public void user_to_verify_the_total_obligations_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("Totalobligation")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Total Net Income field in Finance Details section is non-editable")
public void user_to_verify_the_total_net_income_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("TotalNetIncome")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the No. of Installments field in Finance Details section is non-editable")
public void user_to_verify_the_no_of_installments_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("NoOfInstallment")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Installment Frequency field in Finance Details section is non-editable")
public void user_to_verify_the_installment_frequency_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("InstallmentFrequency")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the IRR field in Finance Details section is non-editable")
public void user_to_verify_the_irr_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("IRR")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the APR field in Finance Details section is non-editable")
public void user_to_verify_the_apr_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("APR")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Last Installment Amount field in Finance Details section is non-editable")
public void user_to_verify_the_last_installment_amount_field_in_finance_details_section_is_non_editable() {
	String value ="true";
	String text = javascriptHelper.executeScriptWithWebElement(Murabha_offerDetail.getElement("LastInstallmentamount")).getAttribute("ng-reflect-readonly");

	for (int i = 0; i <2000; i++) {

		try {
			Assert.assertTrue((text.equals(value)));
			break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Eligibility Type field in Eligibility Details is non-editable")
public void user_to_verify_the_eligibility_type_field_in_eligibility_details_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
					.sendKeys("123456");
		} catch (Exception e) {
			if (i == 20) {
				status = true;
			}
		}
	}
	Assert.assertTrue(status);

}

@Then("User_6047 To verify the Eligibility Amount field in Eligibility Details is non-editable")
public void user_to_verify_the_eligibility_amount_field_in_eligibility_details_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelectorAll('tbody td[ng-reflect-ng-switch=\"number\"] span')[4]")
							//"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
					.sendKeys("123456");
		} catch (Exception e) {
			if (i == 20) {
				status = true;
			}
		}
	}
	Assert.assertTrue(status);


}

@Then("User_6047 To verify the Eligibility Percentage field in Eligibility Details is non-editable")
public void user_to_verify_the_eligibility_percentage_field_in_eligibility_details_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelectorAll('tbody td[ng-reflect-ng-switch=\"number\"] span')[5]")
							//"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
					.sendKeys("123456");
		} catch (Exception e) {
			if (i == 20) {
				status = true;
			}
		}
	}
	Assert.assertTrue(status);

}

@Then("User_6047 To verify the Currency field in Eligibility Details is non-editable")
public void user_to_verify_the_currency_field_in_eligibility_details_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelectorAll('tbody td[ng-reflect-ng-switch=\"number\"] span')[6]")
							//"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
					.sendKeys("123456");
		} catch (Exception e) {
			if (i == 20) {
				status = true;
			}
		}
	}
	Assert.assertTrue(status);

}

@Then("User_6047 To verify the Actual Percentage field in Eligibility Details is non-editable")
public void user_to_verify_the_actual_percentage_field_in_eligibility_details_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelectorAll('tbody td[ng-reflect-ng-switch=\"number\"] span')[7]")
							//"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
					.sendKeys("123456");
		} catch (Exception e) {
			if (i == 20) {
				status = true;
			}
		}
	}
	Assert.assertTrue(status);

}

@Then("User_6047 To verify the Deviation Level field in Eligibility Details is non-editable")
public void user_to_verify_the_deviation_level_field_in_eligibility_details_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelectorAll('tbody td[ng-reflect-ng-switch=\"number\"] span')[8]")
							//"document.querySelector('tbody td[ng-reflect-ng-switch=\"string\"]')")
					.sendKeys("123456");
		} catch (Exception e) {
			if (i == 20) {
				status = true;
			}
		}
	}
	Assert.assertTrue(status);
}
}


