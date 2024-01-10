package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarruq_AppDataCheck_QuotationInfo {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	SoftAssert softAssert = new SoftAssert();
	//ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	JSPaths Tawa_QuotationInfo_js = new JSPaths(excelPath, "Tawa_Check_QuotationInfo", "QuotationInfoElement", "JSPath");
	ExcelData Tawa_QuotationInfo_TestData  = new ExcelData(excelTestDataPath,"Tawa_Check_QuotationInfo","Dataset ID");
	


	@And("User_6047 Get the test data for test case ID AT_TW_QI_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_tw_qi_01() {
		testData = Tawa_QuotationInfo_TestData.getTestdata("DS01_AT_TW_QI_01");
	}
	@And("User_6047 search the Referen id under Inbox")
	public void user_6047_search_the_referen_id_under_inbox() throws Throwable {
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
	@And("User_6047 click Quotation Info tab")
	public void user_6047_click_quotation_info_tab()  {
		String lengthOfTheSegmentButton = "";
		boolean isClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				lengthOfTheSegmentButton = javascriptHelper.executeScript(
						"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button').length")
						.toString();
				if ((!lengthOfTheSegmentButton.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveSegmentLength = Integer.parseInt(lengthOfTheSegmentButton);
		// document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[14].innerText
		String segmentLabelName = "";
		for (int i = 0; i < premitiveSegmentLength; i++) {
			try {
				for (int j = 0; j <= 200; j++) {
					segmentLabelName = javascriptHelper.executeScript(
							"return document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
									+ "].innerText")
							.toString();
					System.out.println("Segment Label Name " + segmentLabelName);
					if (segmentLabelName.equalsIgnoreCase("Quotation Info")) {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
										+ "]")
								.click();
						isClicked = true;
						break;

					} else if (!(segmentLabelName.equalsIgnoreCase("Quotation Info"))) {
						isClicked = false;
						break;
					}
				}

			} catch (Exception e) {
			}
			if (isClicked == true) {
				break;
			}
		}    
	}
	@Then("User_6047 to verify the back button")
	public void user_6047_to_verify_the_back_button() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("back_button")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the field Insurance Company")
	public void user_6047_verify_the_field_insurance_company() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("InsuranceCompanyBpId")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the field Base Premium")
	public void user_6047_verify_the_field_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("BasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Then("User_6047 verify the field VAT on Base Premium")
	public void user_6047_verify_the_field_vat_on_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("VatOnBasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the field Net Base Premium")
	public void user_6047_verify_the_field_net_base_premium() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("NetBasePremiumAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the field Total Discount")
	public void user_6047_verify_the_field_total_discount() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("totalDiscountAmount")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the field Expiry Date")
	public void user_6047_verify_the_field_expiry_date() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("ExpiryDate")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the field Quatatio Reference Number")
	public void user_6047_verify_the_field_quatatio_reference_number() {
		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("QuoteReferenceNo")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the functionality of back button in Quotation Info")
	public void user_6047_verify_the_functionality_of_back_button_in_quotation_info() {
		String title = javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("backButton_fun_verify")).getText();
System.out.println(title);
		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((title.equals("Insurance Quotation Details")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}
	}

@Then("User_6047 verify the field Deductible Amount")
public void user_6047_verify_the_field_deductible_amount() {
	for (int j = 0; j < 200; j++) {
		try {
			javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("DeductibleAmount")).isDisplayed();
			Assert.assertTrue(true);
			break;
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Gross Premium Amount")
public void user_6047_verify_the_field_gross_premium_amount() {
	for (int j = 0; j < 200; j++) {
		try {
			javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("GrossPremiumAmount")).isDisplayed();
			Assert.assertTrue(true);
			break;
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field Vat On Gross Premium Amount")
public void user_6047_verify_the_field_vat_on_gross_premium_amount() {
	for (int j = 0; j < 200; j++) {
		try {
			javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("VatOnGrossPremiumAmount")).isDisplayed();
			Assert.assertTrue(true);
			break;
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 verify the field NetGross Premium Amount")
public void user_6047_verify_the_field_net_gross_premium_amount() {
	for (int j = 0; j < 200; j++) {
		try {
			javascriptHelper.executeScriptWithWebElement(Tawa_QuotationInfo_js.getElement("NetGrossPremiumAmount")).isDisplayed();
			Assert.assertTrue(true);
			break;
		} catch (Exception e) {
			if (j == 199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
}
