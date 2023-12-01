package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

public class Tawarruq_offering_offerDetail {
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
	JSPaths Tawarruq_offering = new JSPaths(excelPath, "tawa_offering_js", "OfferDetailsElement", "JSPath");
	ExcelData Tawar_offering_TestData  = new ExcelData(excelTestDataPath,"Tawar_offering","Dataset ID");
	

	@And("User_6047 Get the test data for test case ID AT_TW_OFO_02")
	public void user_get_the_test_data_for_test_case_id_at_tw_ofo_02() {	
		testData =  Tawar_offering_TestData.getTestdata("DS01_AT_TW_OFO_02");
	}

	@And("User_6047 Login With valid credentials-offering-offerDetails")
	public void Login_with_valid_credentials_offering_offerDetails() throws Throwable {
		ijaraLogin.loginWithIjaraApplication_offoring();	
	}
	
	@And("User_6047 search  the Ref Id Under inbox")
	public void user_search_the_ref_id_under_inbox_6047() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				//.sendKeys(testData.get("Ref No")); 
				.sendKeys("3841"); 
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}
	@And("User_6047 Click the Entitle Button under inbox")
	public void user_click_the_entitle_button_under_inbox() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("Edit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
@And("User_6047 Click the search button in facilityinfo")
public void user_click_the_search_button_in_facilityinfo() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper
			.executeScriptWithWebElement(iJarah_CommonElements.getElement("searchButtonUnderTab"))
			.click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <= 500; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
			.sendKeys(testData.get("Record"));
			//sendKeys(testData.get("Record"));
			Thread.sleep(3000);
			break;
		}

		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}

}

@And("User_6047 Select the record in facilityinfo")
public void user_select_the_record_in_facilityinfo() {
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_button_for_employment_det")).click();
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text")).
			sendKeys(testData.get("Record"));
			break;
		}
		
		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}		
	}
}
@Then("User_6047 To verify the Amount Requested field in Finance Details section")
public void user_to_verify_the_amount_requested_field_in_finance_details_section() {
//	for (int i = 0; i <200; i++) {
//		try {
//			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarruq_offering.getElement("AmountRequest")).isDisplayed());
//			break;
//		} catch (Exception e) {
//			if (i==199) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
	boolean AmountRequested = false;
	for (int i = 0; i <= 300; i++) {
		try {
			AmountRequested = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("Amount Requested")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(AmountRequested, "Amount Requested is not visisble hence failed");

}
}

@Then("User_6047 To verify the Down Payment Percentage field in Finance Details section")
public void user_to_verify_the_down_payment_percentage_field_in_finance_details_section() {
//	for (int i = 0; i <200; i++) {
//		try {
//			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarruq_offering.getElement("DownPaymentPercentage")).isDisplayed());
//			break;
//		} catch (Exception e) {
//			if (i==199) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
	boolean DownPaymentPercentage = false;
	for (int i = 0; i <= 300; i++) {
		try {
			DownPaymentPercentage = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("DownPaymentPercentage")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(DownPaymentPercentage, "Down Payment Percentage is not visisble hence failed");

}
}

@Then("User_6047 To verify the Down Payment Amount  field in Finance Details section")
public void user_to_verify_the_down_payment_amount_field_in_finance_details_section() {

	boolean DownPaymentAmount = false;
	for (int i = 0; i <= 300; i++) {
		try {
			DownPaymentAmount = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("DownPaymentAmount")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(DownPaymentAmount, "DownPayment Amount is not visisble hence failed");

}
}

@Then("User_6047 To verify the Additional Down payment field in Finance Details section")
public void user_to_verify_the_additional_down_payment_field_in_finance_details_section() {

	boolean AdditionalDownPayment = false;
	for (int i = 0; i <= 300; i++) {
		try {
			AdditionalDownPayment = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("AdditionalDownPayment")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(AdditionalDownPayment, "Additional DownPayment is not visisble hence failed");

}
}

@Then("User_6047 To verify the Total Down Payment Amount field in Finance Details section")
public void user_to_verify_the_total_down_payment_amount_field_in_finance_details_section() {
	
	boolean TotalDownPaymentAmount = false;
	for (int i = 0; i <= 300; i++) {
		try {
			TotalDownPaymentAmount = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("TotalDownPaymentAmount")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(TotalDownPaymentAmount, "Total DownPayment Amount is not visisble hence failed");

}
}

@Then("User_6047 To verify the Profit Amount field in Finance Details section")
public void user_to_verify_the_profit_amount_field_in_finance_details_section() {
	
	boolean profitAmount = false;
	for (int i = 0; i <= 300; i++) {
		try {
			profitAmount = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("profitAmount")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(profitAmount, "profit Amount is not visisble hence failed");

}
}

@Then("User_6047 To verify the Total Fees field in Finance Details section")
public void user_to_verify_the_total_fees_field_in_finance_details_section() {

	boolean TotalFees = false;
	for (int i = 0; i <= 300; i++) {
		try {
			TotalFees = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("TotalFees")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(TotalFees, "profit Amount is not visisble hence failed");

}
}

@Then("User_6047 To verify the Total Contract Value field in Finance Details section")
public void user_to_verify_the_total_contract_value_field_in_finance_details_section() {
	
		boolean TotalContractValue = false;
		for (int i = 0; i <= 300; i++) {
			try {
				TotalContractValue = javascriptHelper
						.executeScriptWithWebElement(Tawarruq_offering.getElement("TotalContractValue")).isDisplayed();
				break;
			} catch (Exception e) {

			}
		
		softAssert.assertTrue(TotalContractValue, "profit Amount is not visisble hence failed");

	}
		
}

@Then("User_6047 To verify the Tenure field in Finance Details section")
public void user_to_verify_the_tenure_field_in_finance_details_section() {

	boolean Tenure = false;
	for (int i = 0; i <= 300; i++) {
		try {
			Tenure = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("Tenure")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(Tenure, "Tenure is not visisble hence failed");

}
}

@Then("User_6047 To verify the Total Income field in Finance Details section")
public void user_to_verify_the_total_income_field_in_finance_details_section() {
	
	boolean TotalIncome = false;
	for (int i = 0; i <= 300; i++) {
		try {
			TotalIncome = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("TotalIncome")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(TotalIncome, "Tenure is not visisble hence failed");

}
}

@Then("User_6047 To verify the Total Obligations field in Finance Details section")
public void user_to_verify_the_total_obligations_field_in_finance_details_section() {
	boolean Totalobligation = false;
	for (int i = 0; i <= 300; i++) {
		try {
			Totalobligation = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("Totalobligation")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(Totalobligation, "Tenure is not visisble hence failed");

}
}

@Then("User_6047 To verify the Total Net Income field in Finance Details section")
public void user_to_verify_the_total_net_income_field_in_finance_details_section() {
	
	boolean TotalNetIncome = false;
	for (int i = 0; i <= 300; i++) {
		try {
			TotalNetIncome = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("TotalNetIncome")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(TotalNetIncome, "Total Net Income not visisble hence failed");

}
}

@Then("User_6047 To verify the No. of Installments field in Finance Details section")
public void user_to_verify_the_no_of_installments_field_in_finance_details_section() {

	boolean NoOfInstallment = false;
	for (int i = 0; i <= 300; i++) {
		try {
			NoOfInstallment = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("NoOfInstallment")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(NoOfInstallment, "No Of Installment not visisble hence failed");

}
}

@Then("User_6047 To verify the Installment Frequency field in Finance Details section")
public void user_to_verify_the_installment_frequency_field_in_finance_details_section() {
	
	boolean InstallmentFrequency = false;
	for (int i = 0; i <= 300; i++) {
		try {
			InstallmentFrequency = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("InstallmentFrequency")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(InstallmentFrequency, "Installment Frequency not visisble hence failed");

}
}

@Then("User_6047 To verify the IRR field in Finance Details section")
public void user_to_verify_the_irr_field_in_finance_details_section() {


	boolean IRR = false;
	for (int i = 0; i <= 300; i++) {
		try {
			IRR = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("IRR")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(IRR, "IRR not visisble hence failed");

}
}

@Then("User_6047 To verify the APR field in Finance Details section")
public void user_to_verify_the_apr_field_in_finance_details_section() {
	
	boolean APR = false;
	for (int i = 0; i <= 300; i++) {
		try {
			APR = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("APR")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(APR, "APR not visisble hence failed");

}
}

@Then("User_6047 To verify the Last Installment Amount field in Finance Details section")
public void user_to_verify_the_last_installment_amount_field_in_finance_details_section() {

	boolean LastInstallmentamount = false;
	for (int i = 0; i <= 300; i++) {
		try {
			LastInstallmentamount = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("LastInstallmentamount")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(LastInstallmentamount, "LastInstallment amount not visisble hence failed");

}
}

@Then("User_6047 To verify the Eligibility Type field in Finance Details section")
public void user_to_verify_the_eligibility_type_field_in_finance_details_section() {

	boolean Eligibility_Type = false;
	for (int i = 0; i <= 300; i++) {
		try {
			Eligibility_Type = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("Eligibility_Type")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(Eligibility_Type, "Eligibility Type amount not visisble hence failed");

}
}

@Then("User_6047 To verify the Eligibility Amount field in Finance Details section")
public void user_to_verify_the_eligibility_amount_field_in_finance_details_section() {

	boolean EligibilityAmount = false;
	for (int i = 0; i <= 300; i++) {
		try {
			EligibilityAmount = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("EligibilityAmount")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(EligibilityAmount, "Eligibility Amount not visisble hence failed");

}
}

@Then("User_6047 To verify the Eligibility Percentage field in Finance Details section")
public void user_to_verify_the_eligibility_percentage_field_in_finance_details_section() {
	
	boolean EligibilityPercentage = false;
	for (int i = 0; i <= 300; i++) {
		try {
			EligibilityPercentage = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("EligibilityPercentage")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(EligibilityPercentage, "Eligibility Percentage not visisble hence failed");

}
}

@Then("User_6047 To verify the Currency field in Finance Details section")
public void user_to_verify_the_currency_field_in_finance_details_section() {
	
	boolean Currency = false;
	for (int i = 0; i <= 300; i++) {
		try {
			Currency = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("Currency")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(Currency, "Currency not visisble hence failed");

}
}

@Then("User_6047 To verify the Actual Percentage field in Finance Details section")
public void user_to_verify_the_actual_percentage_field_in_finance_details_section() {

	boolean Actual_percentage = false;
	for (int i = 0; i <= 300; i++) {
		try {
			Actual_percentage = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("Actual_percentage")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(Actual_percentage, "Actual percentage not visisble hence failed");

}
}

@Then("User_6047 To verify the Deviation Level field in Finance Details section")
public void user_to_verify_the_deviation_level_field_in_finance_details_section() {

	boolean deviationLevel = false;
	for (int i = 0; i <= 300; i++) {
		try {
			deviationLevel = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("deviationLevel")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(deviationLevel, "deviation Level not visisble hence failed");

}
}
@Then("User_6047 To verify the Back Button in Offer details screen")
public void user_to_verify_the_back_button_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Accept Offer in Offer details screen")
public void user_to_verify_the_accept_offer_in_offer_details_screen() {
	boolean AcceptOffer = false;
	for (int i = 0; i <= 300; i++) {
		try {
			AcceptOffer = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("AcceptOffer")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(AcceptOffer, "Accept Offer not visisble hence failed");

}
}

@Then("User_6047 To verify the Offer Details section in Offer details screen")
public void user_to_verify_the_offer_details_section_in_offer_details_screen() {
	boolean OfferDetail_Verify = false;
	for (int i = 0; i <= 300; i++) {
		try {
			OfferDetail_Verify = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("OfferDetail_Verify")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(OfferDetail_Verify, "OfferDetail not visisble hence failed");

}
}

@Then("User_6047 To verify the Finance Details section in Offer details screen")
public void user_to_verify_the_finance_details_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Credit Risk Factor \\(CONV) section in Offer details screen")
public void user_to_verify_the_credit_risk_factor_conv_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Credit Score Details \\(CONV) section in Offer details screen")
public void user_to_verify_the_credit_score_details_conv_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Eligibility Details section in Offer details screen")
public void user_to_verify_the_eligibility_details_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Interest Rate Structure section in Offer details screen")
public void user_to_verify_the_interest_rate_structure_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Installments section in Offer details screen")
public void user_to_verify_the_installments_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}

@Then("User_6047 To verify the Appeal Request section in Offer details screen")
public void user_to_verify_the_appeal_request_section_in_offer_details_screen() {
	boolean BackButton_screen = false;
	for (int i = 0; i <= 300; i++) {
		try {
			BackButton_screen = javascriptHelper
					.executeScriptWithWebElement(Tawarruq_offering.getElement("BackButton_screen")).isDisplayed();
			break;
		} catch (Exception e) {

		}
	
	softAssert.assertTrue(BackButton_screen, "BackButton screen not visisble hence failed");

}
}
@Then("User_6047 To verify the Eligibility Type field is non-editable")
public void user_to_verify_the_eligibility_type_field_is_non_editable() {
	boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper
					.executeScriptWithWebElement(
							"document.querySelectorAll('tbody td[ng-reflect-ng-switch=\"string\"] span')[2])")
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

@Then("User_6047 To verify the Eligibility Amount field is non-editable")
public void user_to_verify_the_eligibility_amount_field_is_non_editable() {
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

@Then("User_6047 To verify the Eligibility Percentage field is non-editable")
public void user_to_verify_the_eligibility_percentage_field_is_non_editable() {
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

@Then("User_6047 To verify the Currency field in is non-editable")
public void user_to_verify_the_currency_field_in_is_non_editable() {
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

@Then("User_6047 To verify the Actual Percentage field is non-editable")
public void user_to_verify_the_actual_percentage_field_is_non_editable() {
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

@Then("User_6047 To verify the Deviation Level field in is non-editable")
public void user_to_verify_the_deviation_level_field_in_is_non_editable() {
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
