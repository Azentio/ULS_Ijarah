package stepdefinitions;

import java.io.IOException;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_AppDataCheck_AddressDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	// Ijarah_CommonFieldName
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	
	JSPaths FacilityDetails_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	ExcelData FacilityDetails_TestData  = new ExcelData(excelTestDataPath,"Mura_check_productDetail","Dataset ID");
	


	@And("User_6047 get the test data for test case ID AT_DC_PD_002")
	public void user_6047_get_the_test_data_for_test_case_id_at_dc_pd_002() {
		testData =  FacilityDetails_TestData.getTestdata("DS01_AT_DC_PD_002");
	}
	@And("User_6047 Search the Referen Id Under inbox")
	public void user_6047_search_the_reference_id_under_inbox_6047() throws Throwable {
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
		}	}
	@Then("User_6047 verify the Product field")
	public void user_6047_verify_the_product_field() {

		for ( int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the Sub Product field")
	public void user_6047_verify_the_sub_product_field() {

		for ( int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the Scheme field")
	public void user_6047_verify_the_scheme_field() {
		for ( int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Request Amount field")
	public void user_6047_verify_the_request_amount_field() {
		for ( int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Tenure \\(Months) field")
	public void user_6047_verify_the_tenure_months_field() {
		for ( int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
				
				
			}
		}
	}


@And("User_6047 verify the Data under product field")
public void user_6047_verify_the_data_under_product_field() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification")));
	String product1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification"))
			.getAttribute("aria-label");
	System.err.println(product1);
	String product2 =product1.substring(0,21);
	String product =" Murabaha Auto Retail";

	System.out.println(product2);
	Assert.assertEquals(product, product2);
    
}
@And("User_6047 verify the Data under subproduct field")
public void user_6047_verify_the_data_under_subproduct_field() {
	String subproduct1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product"))
			.getAttribute("aria-label");
	System.err.println(subproduct1);
	String subproduct2 =subproduct1.substring(0,29);
	String subproduct =" Murabaha Auto -Murabaha Auto";
	Assert.assertEquals(subproduct2, subproduct);
}
@And("User_6047 verify the Data under Scheme field")

public void user_6047_verify_the_data_under_scheme_field() throws Throwable {
	Thread.sleep(500);
	String scheme1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme")).getAttribute("aria-label");
	System.err.println(scheme1);
	String scheme2 =scheme1.substring(0,20);
	System.err.println(scheme2);
	String scheme = " Murabaha Scheme ABC";
	Assert.assertEquals(scheme, scheme2);
    
}

@And("User_6047 verify the Data under Request Amount field")
public void user_6047_verify_the_data_under_request_amount_field() {
	String RequestAmt1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount"))
			.getAttribute("ng-reflect-value-variable");
	System.err.println(RequestAmt1);
	String RequestAmt = "1500000";
	Assert.assertEquals(RequestAmt, RequestAmt1);
    
}

@And("User_6047 verify the Data under Loan Tenure field")
public void user_6047_verify_the_data_under_loan_tenure_field() {
    
	String LoanTenure1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure_value"))
			.getAttribute("ng-reflect-model");
	System.err.println(LoanTenure1);
	String LoanTenure = "5";
	Assert.assertEquals(LoanTenure, LoanTenure1);
}

@And("User_6047 verify the Data under currency field")
public void user_6047_verify_the_data_under_lcurrency_field() {
    
	String currency1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Currency"))
			.getAttribute("aria-label");
	System.err.println(currency1);
	String currency2 =currency1.substring(0,4);
	System.err.println(currency2);
	String currency = " INR";
	Assert.assertEquals(currency, currency2);
}


	
}
