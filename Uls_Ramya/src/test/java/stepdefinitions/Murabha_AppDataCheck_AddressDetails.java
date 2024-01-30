package stepdefinitions;

import java.io.IOException;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
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

@And("User_6047 verify the Product field should be mandatory Display and field should text")
public void user_6047_verify_the_product_field_should_be_mandatory_display_and_field_should_text() throws Throwable {
    Thread.sleep(500);

	
			for (int j = 0; j < 200; j++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (j == 199) {
						Assert.fail(e.getMessage());
					}
	
				}
			}
		
			for (int i = 0; i < 2000; i++) {
				try {
					String productMandtory1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification"))
							.getAttribute("aria-label");
			
					
					System.err.println("productMandtory:"+productMandtory1);
									
					Assert.assertTrue(productMandtory1.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
								}

			
			String productSelectFormat = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification"))
					.getAttribute("ng-reflect-placeholder");
			
			System.err.println("productSelect:  " + productSelectFormat);

			String assertProductSelectFormat = "Select";
			
			Assert.assertEquals(assertProductSelectFormat, productSelectFormat);		
    
}
@And("User_6047 verify the subProduct field should be mandatory Display and field should text")
public void user_6047_verify_the_subproduct_field_should_be_mandatory_display_and_field_should_text() throws Throwable {

	
			for (int j = 0; j < 200; j++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (j == 199) {
						Assert.fail(e.getMessage());
					}
		
				}
			}

			for (int i = 0; i < 2000; i++) {
				try {
				
					String subproductMandtory1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification"))
							.getAttribute("aria-label");
			
					Assert.assertTrue(subproductMandtory1.contains("*"));		
					
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
								}
		// -----------------select format 
			
			String productSelectFormat = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product"))
					.getAttribute("ng-reflect-placeholder");
			
			System.err.println("productSelect:  " + productSelectFormat);

			String assertProductSelectFormat = "Select";
			
			Assert.assertEquals(assertProductSelectFormat, productSelectFormat);		
    
}
@And("User_6047 verify the Request Type field should be mandatory Display and field should text")
public void user_6047_verify_the_request_type_field_should_be_mandatory_display_and_field_should_text() {
    
	
	for (int j = 0; j < 200; j++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
		
		}
	}
	for (int i = 0; i < 2000; i++) {
		try {
		
			String requestType = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType"))
					.getAttribute("aria-label");
	
			Assert.assertTrue(requestType.contains("*"));		
			
			break;
		} catch (Exception e) {
			if (i == 1999) {
				Assert.fail(e.getMessage());
			}
		}



String facilityTypeSelectFormat = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType"))
		.getAttribute("ng-reflect-placeholder");

System.err.println("facilityTypeSelectFormat:  " + facilityTypeSelectFormat);

String assertfacilityTypeSelectFormat = "Select";

Assert.assertEquals(assertfacilityTypeSelectFormat, facilityTypeSelectFormat);		


}


}
@And("User_6047 verify the Scheme field should be mandatory Display and field should text")
public void user_6047_verify_the_scheme_field_should_be_mandatory_display_and_field_should_text() {
	
	for (int j = 0; j < 200; j++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
		
		}
	}

	for (int i = 0; i < 2000; i++) {
		try {
		
			String requestType = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme"))
					.getAttribute("aria-label");
	
			Assert.assertTrue(requestType.contains("*"));		
			
			break;
		} catch (Exception e) {
			if (i == 1999) {
				Assert.fail(e.getMessage());
			}
		}
						}
	
	
	String schemeSelectFormat = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme"))
			.getAttribute("ng-reflect-placeholder");
	
	System.err.println("schemeSelectFormat:  " + schemeSelectFormat);

	String assertschemeSelectFormat= "Select";
	
	Assert.assertEquals(assertschemeSelectFormat, schemeSelectFormat);
    
}

@And("User_6047 verify the Request Amount field should be Non mandatory Display and field should text")
public void user_6047_verify_the_request_amount_field_should_be_non_mandatory_display_and_field_should_text() {

	
	for (int j = 0; j < 200; j++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
	
		}
	}


	for (int i = 0; i < 2000; i++) {
		try {
			String requestAmountMandtory = "document.querySelector('ion-label[ng-reflect-text=\"SCR.MODULE.FACILITY_DETAILS.AM\"]').innerText";
			String requestAmountMandtoryName = (String) javascriptHelper.executeScript("return " + requestAmountMandtory);
			
			System.err.println("requestAmountMandtoryName:"+requestAmountMandtoryName);
							
			Assert.assertTrue(requestAmountMandtoryName.contains("*"));
			break;
		} catch (Exception e) {
			if (i == 1999) {
				Assert.fail(e.getMessage());
			}
		}
						}

	
	String requestAmtNumericFormat = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount_type"))
			.getAttribute("mode");
	
	System.err.println("requestAmtNumericFormat:  " + requestAmtNumericFormat);

	String assertrequestAmtNumericFormat = "decimal";
	
	Assert.assertEquals(assertrequestAmtNumericFormat, requestAmtNumericFormat);
	
    
}

@And("User_6047 verify the Tenure Months field should be mandatory Display and field should text")
public void user_6047_verify_the_tenure_months_field_should_be_mandatory_display_and_field_should_text() throws InterruptedException {
    Thread.sleep(500);
	
			for (int j = 0; j < 200; j++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					if (j == 199) {
						Assert.fail(e.getMessage());
					}
	
				}
			}
			
			
	

			for (int i = 0; i < 2000; i++) {
				try {
					String tenureMonthMandtory = "document.querySelector('ion-label[ng-reflect-text=\"SCR.MODULE.FACILITY_DETAILS.TE\"]').innerText";
					String tenureMonthMandtoryName = (String) javascriptHelper.executeScript("return " + tenureMonthMandtory);
					
					System.err.println("tenureMonthMandtoryName:"+tenureMonthMandtoryName);
									
					Assert.assertTrue(tenureMonthMandtoryName.contains("*"));
					break;
				} catch (Exception e) {
					if (i == 1999) {
						Assert.fail(e.getMessage());
					}
				}
								}
			
	
			
			String requestAmtNumericFormat = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure"))
					.getAttribute("ng-reflect-input-type");
			
			System.err.println("requestAmtNumericFormat:  " + requestAmtNumericFormat);

			String assertrequestAmtNumericFormat = "number";
			
			Assert.assertEquals(assertrequestAmtNumericFormat, requestAmtNumericFormat);
			
			
}

@And("User_6047 verify the pricing indicator field should be mandatory Display")
public void user_6047_verify_the_pricing_indicator_field_should_be_mandatory_display() throws InterruptedException {
    Thread.sleep(500);

	for (int j = 0; j < 200; j++) {
		try {
			if (javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("PricingIndicator")).isDisplayed()) {
				Assert.assertTrue(true);
				break;
			}
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}

		}
	}
	for (int i = 0; i < 2000; i++) {
		try {
		
			String subproductMandtory1 = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("PricingIndicator"))
					.getAttribute("aria-label");
	
			Assert.assertTrue(subproductMandtory1.contains("*"));		
			
			break;
		} catch (Exception e) {
			if (i == 1999) {
				Assert.fail(e.getMessage());
			}
		}	
}
}
}