package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_615;

public class Ijara_Quotation_Info_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths repaymentModeJpaths = new JSPaths(excelPath, "Ijara_Repayment_Mode", "Ijara_LoginFieldName", "JSPath");
	JSPaths quotationTabJPaths = new JSPaths(excelPath, "Quotation_Info", "Ijara_LoginFieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	ExcelData excelData = new ExcelData(excelTestDataPath, "Ijara_Repayment_Mode", "Data Set ID");
	ExcelData excel = new ExcelData(excelTestDataPath, "Ijara_Quotation_Info", "Data Set ID");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	Map<String, String> testData;
	UserUtility_615 userUtility = new UserUtility_615();
	SoftAssert softAsset = new SoftAssert();
	@And("user_615 update test data set id for AT_QIA_001")
	public void user_update_test_data_set_id_for_at_qia001() {
		testData = excel.getTestdata("AT_QIA_001_D1");
	}

	@Then("user_615 click quotation info tab")
	public void user_click_quotation_info_tab() {
	   for (int i = 0; i < 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationInfoSection")).click();
			break;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}

	@Then("user_615 verify the insurance company field")
	public void user_verify_the_insurance_company_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("insuranceCompany")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the base premium field")
	public void user_verify_the_base_premium_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("basePremium")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the VAT on Base Premium field")
	public void user_verify_the_vat_on_base_premium_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremium")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the Net Base Premium field")
	public void user_verify_the_net_base_premium_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("netBasePremium")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the Total Discount field")
	public void user_verify_the_total_discount_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("totalDiscountAmount")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the Expiry Date field")
	public void user_verify_the_expiry_date_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("expiryDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_615 verify the Quotation Reference Number field")
	public void user_verify_the_quotation_reference_number_field() throws InterruptedException {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(3000);
	}

	@Then("user_615 click back button")
	public void user_click_back_button() {
	    for (int i = 0; i < 200; i++) {
	    	try {
			   javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("backButton")).click();
			   break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	    
	}
	@Then("user_615 update test data set id for AT_QIA_002")
    public void user_615_update_test_data_set_id_for_at_qia002() {
		testData = excel.getTestdata("AT_QIA_002_D2");
    }
	
	@Then("user_615 update test data set id for AT_QIA_003")
    public void user_615_update_test_data_set_id_for_at_qia003() {
		testData = excel.getTestdata("AT_QIA_003_D3");
    }
	
	@Then("user_615 update test data set id for AT_QIA_004")
    public void user_615_update_test_data_set_id_for_at_qia004() {
		testData = excel.getTestdata("AT_QIA_004_D4");
    }
	
	@Then("user_615 update test data set id for AT_QIA_005")
    public void user_615_update_test_data_set_id_for_at_qia005() {
		testData = excel.getTestdata("AT_QIA_005_D5");
    }

    @Then("user_615 verify insurance company field is mandatory")
    public void user_615_verify_insurance_company_field_is_mandatory() {
    	userUtility.verifyGivenFieldIsMandatory(driver,quotationTabJPaths.getElement("mandatoryInsuranceCompany"));
    }

    @Then("user_615 verify insurance company field is editable")
    public void user_615_verify_insurance_company_field_is_editable() {
    	for (int i = 0; i < 200; i++) {
    		try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("insuranceCompanyInput")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    	//System.out.println(testData.get("InsuranceCompanyInput"));
    	userUtility.selectRadioButton(driver,testData.get("InsuranceCompanyInput"));
    	
    }

    @Then("user_615 verify the base premium field is mandatory")
    public void user_615_verify_the_base_premium_field_is_mandatory() {
    	userUtility.verifyGivenFieldIsMandatory(driver, quotationTabJPaths.getElement("mandatorybasePremium"));
    }

    @Then("user_615 verify the base premium field is editable")
    public void user_615_verify_the_base_premium_field_is_editable() {
        for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("basePremiumInputField")).click();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("basePremiumInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("basePremiumInputField")).sendKeys(testData.get("Base_Premium_Input"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
					
				}
			}
			
		}
    }

    @Then("user_615 verify the base premium field only accept the numeric values")
    public void user_615_verify_the_base_premium_field_only_accept_the_numeric_values() {
    	String basePremiumNumericField = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("numericFieldValidation")).getAttribute("ng-reflect-type");
        System.err.println("first print  " + basePremiumNumericField);
        String assertbasePremiumNumericField = "number";
        Assert.assertEquals(assertbasePremiumNumericField, basePremiumNumericField);
    }

    @Then("user_615 verify the VAT on Base Premium field is mandatory")
    public void user_615_verify_the_vat_on_base_premium_field_is_mandatory() {
    	userUtility.verifyGivenFieldIsMandatory(driver, quotationTabJPaths.getElement("mandatoryvatOnBasePremium"));
    }

    @Then("user_615 verify the VAT on Base Premium is editable")
    public void user_615_verify_the_vat_on_base_premium_is_editable() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumInputField")).click();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumInputField")).sendKeys(testData.get("Vat_On_Base_Premium"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
					
				}
			}
			
		}
    }

    @Then("user_615 verify the VAT on Base Premium field only accept the numeric values")
    public void user_615_verify_the_vat_on_base_premium_field_only_accept_the_numeric_values() {
    	String vatNumericField = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumNumericValidation")).getAttribute("ng-reflect-type");
        System.err.println("first print  " + vatNumericField);
        String assertvatNumericField = "number";
        Assert.assertEquals(assertvatNumericField, vatNumericField);
    }

    @Then("user_615 verify the Net Base Premium field is mandatory")
    public void user_615_verify_the_net_base_premium_field_is_mandatory() {
    	userUtility.verifyGivenFieldIsMandatory(driver, quotationTabJPaths.getElement("mandatorynetBasePremium"));
    }

    @Then("user_615 verify the Net Base Premium field is editable")
    public void user_615_verify_the_net_base_premium_field_is_editable() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("netBasePremiumInputField")).click();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("netBasePremiumInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("netBasePremiumInputField")).sendKeys(testData.get("Net_Base_Premium"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
					
				}
			}
			
		}
    }

    @Then("user_615 verify the Net Base Premium field only accept the numeric values")
    public void user_615_verify_the_net_base_premium_field_only_accept_the_numeric_values() {
    	String netBasePremiumNumericField = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("netBasePremiumNumericValidation")).getAttribute("ng-reflect-type");
        System.err.println("first print  " + netBasePremiumNumericField);
        String assertnetNumericField = "number";
        Assert.assertEquals(assertnetNumericField, netBasePremiumNumericField);
    }

    @Then("user_615 verify the Total Discount field is mandatory")
    public void user_615_verify_the_total_discount_field_is_mandatory() {
    	userUtility.verifyGivenFieldIsMandatory(driver, quotationTabJPaths.getElement("mandatorytotalDiscountAmount"));
    }

    @Then("user_615 verify the Total Discount field is editable")
    public void user_615_verify_the_total_discount_field_is_editable() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("totalDiscountAmountInputField")).click();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("totalDiscountAmountInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("totalDiscountAmountInputField")).sendKeys(testData.get("Total_Discount"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
					
				}
			}
			
		}
    }

    @Then("user_615 verify Total Discount field is only accept the numeric values")
    public void user_615_verify_total_discount_field_is_only_accept_the_numeric_values() {
    	String totalDiscountNumericField = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("totalDiscountNumericValidation")).getAttribute("ng-reflect-type");
        System.err.println("first print  " + totalDiscountNumericField);
        String asserttotalDiscountNumericField = "number";
        Assert.assertEquals(asserttotalDiscountNumericField, totalDiscountNumericField);
    }

    @Then("user_615 verify the Expiry Date field is mandatory")
    public void user_615_verify_the_expiry_date_field_is_mandatory() {
    	userUtility.verifyGivenFieldIsMandatory(driver, quotationTabJPaths.getElement("mandatoryexpiryDate"));
    }

    @Then("user_615 verify the Expiry Date field is editable")
    public void user_615_verify_the_expiry_date_field_is_editable() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("expiryDateValidation")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
					
				}
			}
			
        	for (int j = 0; j < 200; j++) {
        		try {
					javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("expiryDateInput")).click();
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
				
			}
		}
    }

    @Then("user_615 verify the Expiry Date field should be in date format")
    public void user_615_verify_the_expiry_date_field_should_be_in_date_format() {
    	String expiryDateFormat = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("expiryDateValidation")).getAttribute("ng-reflect-icon");
    	System.err.println("first print  " + expiryDateFormat);
    	String assertexpiryDateFormat = "pi pi-calendar";
    	Assert.assertEquals(assertexpiryDateFormat, expiryDateFormat);
    }

    @Then("user_615 verify the Quotation Reference Number field is mandatory")
    public void user_615_verify_the_quotation_reference_number_field_is_mandatory() {
//    	userUtility.verifyGivenFieldIsMandatory(driver, quotationTabJPaths.getElement("mandatoryquotationRefNo"));
//    	softAsset.fail();
    	if (!javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("mandatoryquotationRefNo")).isDisplayed()) {
    		softAsset.fail();
    	}
        softAsset.assertAll();
    }

    @Then("user_615 verify the Quotation Reference Number field is editable")
    public void user_615_verify_the_quotation_reference_number_field_is_editable() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).click();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).sendKeys(testData.get("Quotation_Ref_No"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
					
				}
			}
			
		}
    }

    @Then("user_615 verify Quotation Reference Number field is only accept the numeric values")
    public void user_615_verify_quotation_reference_number_field_is_only_accept_the_numeric_values() {
    	String quotationRefNo = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoNumericValidation")).getAttribute("ng-reflect-type");
    	System.err.println("first print  " + quotationRefNo);
    	String assertquotationRefNo = "number";
    	Assert.assertEquals(assertquotationRefNo, quotationRefNo);
    }

    @Then("user_615 verify Quotation Reference Number field should be in textbox")
    public void user_615_verify_quotation_reference_number_field_should_be_in_textbox() {
    	String quotationRefNoTextbox = javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoNumericValidation")).getAttribute("ng-reflect-type");
    	System.err.println("first print  " + quotationRefNoTextbox);
    	String assertquotationRefNoTextbox = "text";
    	Assert.assertEquals(assertquotationRefNoTextbox, quotationRefNoTextbox);
    }
	
    @Then("user_615 click base premium amount field")
    public void user_615_click_base_premium_amount_field() {
        for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("basePremiumInputField")).click();
				break;
			} catch (Exception e) {
				
			}
			
		}
       for (int i = 0; i < 2000; i++) {
    	   try {
    		   javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("basePremiumInputField")).clear();
    		   break;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
    }

    @Then("user_615 verify the please fill the details popup")
    public void user_615_verify_the_please_fill_the_details_popup() throws IOException {
//    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("invalidDataPopup")));
    	for (int i = 0; i < 2000; i++) {
    	   try {
    		   Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("invalidDataPopup")).isDisplayed());
    		   break;
		} catch (Exception e) {
			if (i==1999) {
				Assert.fail(e.getMessage());
			}
		}
		
	}
    }

    @Then("user_615 click VAt on base premium amount field")
    public void user_615_click_v_at_on_base_premium_amount_field() {
        for (int i = 0; i < 200; i++) {
        	try {
        		javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumInputField")).click();
    			break;
			} catch (Exception e) {
			
			}
        	
		}
    }

    @Then("user_615 enter the negative value in VAt on base premium amount field")
    public void user_615_enter_the_negative_value_in_v_at_on_base_premium_amount_field() {
        for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("vatOnBasePremiumInputField")).sendKeys(testData.get("Vat_On_Base_Premium"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
    }

    @Then("user_615 verify the invalid data entry popup")
    public void user_615_verify_the_invalid_data_entry_popup() throws IOException {
   
    }

    @Then("user_615 click quotation reference no field")
    public void user_615_click_quotation_reference_no_field() {
        for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).click();
				break;
			} catch (Exception e) {
				
			}
			
		}
    }

    @Then("user_615 enter the character values in quotation reference field")
    public void user_615_enter_the_character_values_in_quotation_reference_field() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).sendKeys(testData.get("Quotation_Ref_No"));
				break;
			} catch (Exception e) {
				
			}
			
		}
    }

    @Then("user_615 validate the invalid data entry popup")
    public void user_615_validate_the_invalid_data_entry_popup() {
       
    }

    @Then("user_615 enter the special character value in quotation reference field")
    public void user_615_enter_the_special_character_value_in_quotation_reference_field() {
    	for (int i = 0; i < 200; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).clear();
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).sendKeys(testData.get("Quotation_Ref_No1"));
				break;
			} catch (Exception e) {
				
			}
			
		}
    }

    @Then("user_615 validate the popup for invalid data")
    public void user_615_validate_the_popup_for_invalid_data() {
        
    }
	
    @Then("user_615 verify the save button under quotation info tab")
    public void user_615_verify_the_save_button_under_quotation_info_tab() {
        for (int i = 0; i < 2000; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("saveButton")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    }

    @Then("user_615 verify the back button under quotation info tab")
    public void user_615_verify_the_back_button_under_quotation_info_tab() {
        for (int i = 0; i < 2000; i++) {
        	try {
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("backButton")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail();
				}
			}
			
		}
    }
    
    @And("user_615 enter the value in quotation reference no field")
    public void user_enter_the_value_in_quotation_reference_no_field() {
        for (int i = 0; i < 200; i++) {
        	try {
        		javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).sendKeys(Keys.CLEAR);
				javascriptHelper.executeScriptWithWebElement(quotationTabJPaths.getElement("quotationRefNoInputField")).sendKeys(testData.get(""));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
    }

    @And("user_615 click to enable the status button")
    public void user_click_to_enable_the_status_button() {
       
    }

    @Then("user_615 verify the status active")
    public void user_verify_the_status_active() {
        
    }

    @Then("user_615 click to disable the status button")
    public void user_click_to_disable_the_status_button() {
       
    }

    @Then("user_615 verify the status in-active")
    public void user_verify_the_status_in_active() {
        
    }

    @Then("user_615 verify the status is in-active when activate the button")
    public void user_verify_the_status_is_in_active_when_activate_the_button() {
      
    }

    @Then("user_615 verify the status is active when deactivate the button")
    public void user_verify_the_status_is_active_when_deactivate_the_button() {
      
    }
	
	
	
	
	
	
	
	
	
}
