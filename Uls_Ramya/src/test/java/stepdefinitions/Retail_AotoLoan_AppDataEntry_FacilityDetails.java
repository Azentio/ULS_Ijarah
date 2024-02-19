package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Retail_AotoLoan_AppDataEntry_FacilityDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// Ijarah_CommonFieldName	
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	
	JSPaths FacilityDetails_js = new JSPaths(excelPath, "AppDataEn_FacilityDetails", "AppDataEntryElements", "JSPath");
	//ExcelData FacilityDetails_testdata  = new ExcelData(excelTestDataPath,"Tawar_Entry_FacilityInfo","Dataset ID");
	Map<String, String> executionData;
	ExcelData FacilityDetails_TestData  = new ExcelData(excelTestDataPath,"Retail_AutoLoan_FacilityDetails","Dataset ID");
	ExcelData AutoLoanExecutionExcel = new ExcelData(excelTestDataPath, "Retail_AutoLoanExecution", "TestCase ID");
	

	String toastMessageForReferenceNumber = "";
	
	String finalRecordReferenceNumber="";
	String toastMessage = "";
	
	@And("User_6047 Get the test data for test case ID AT_ADE_FD_01_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_ade_fd_01_01() {
		executionData = AutoLoanExecutionExcel.getTestdata("AT_ADE_FD_01_01");
		testData =  FacilityDetails_TestData.getTestdata(executionData.get("dataSet_ID"));
	}
	@And("User_6047 Click the Facility info screen tab")
	public void user_6047_click_the_facility_info_screen_tab() {
		//Thread.sleep(1500);
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Facility Info")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
			//		addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}

	@Then("User_6047 Search the Refere Id under inbox")
public void user_6047_search_the_refere_id_under_inbox() {
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

@Then("User_6047 To verify the Classification field under the Facility info")
public void user_6047_to_verify_the_classification_field_under_the_facility_info() {
	WebElement Classification = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(Classification.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Product field under the Facility info")
public void user_6047_to_verify_the_product_field_under_the_facility_info() {
	WebElement Product = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(Product.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Scheme field under the Facility info")
public void user_6047_to_verify_the_scheme_field_under_the_facility_info() {
	WebElement Scheme = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(Scheme.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Program Code field under the Facility info")
public void user_6047_to_verify_the_program_code_field_under_the_facility_info() {
	WebElement ProgramCode = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("ProgrameCode"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(ProgramCode.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Facility type field under the Facility info")
public void user_6047_to_verify_the_facility_type_field_under_the_facility_info() {
	WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(LoanTenure.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Pricing Indicator field under the Facility info")
public void user_6047_to_verify_the_pricing_indicator_field_under_the_facility_info() {
	WebElement PricingIndicator = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("PricingIndicator"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(PricingIndicator.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the serving branch field under the Facility info")
public void user_6047_to_verify_the_serving_branch_field_under_the_facility_info() {
	WebElement ServicingBranch = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("ServicingBranch"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(ServicingBranch.isDisplayed());
	
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Request Amount under the Facility info")
public void user_6047_to_verify_the_request_amount_under_the_facility_info() {
	WebElement RequestedAmount = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(RequestedAmount.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Currency field under the Facility info")
public void user_6047_to_verify_the_currency_field_under_the_facility_info() {
	WebElement Currency = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Currency"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(Currency.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Loan Tenure under the Facility info")
public void user_6047_to_verify_the_loan_tenure_under_the_facility_info() {
	WebElement LoanTenure = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(LoanTenure.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the Declared Down payment amount under the Facility info")
public void user_6047_to_verify_the_declared_down_payment_amount_under_the_facility_info() {
	WebElement DeclaredDownPaymentAmount = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("DeclaredDownPaymentAmount"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(DeclaredDownPaymentAmount.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the status under the Facility info")
public void user_6047_to_verify_the_status_under_the_facility_info() {
	WebElement status = javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("status_ToggleButton"));
	for (int i = 0; i <= 2000; i++) {
		try {
			Assert.assertTrue(status.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 2000) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 give the input for Declared Down payment amount under the Facility info")
public void user_give_the_input_for_declared_down_payment_amount_under_the_facility_info() {
	javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("declaredDownpayment_input")).click();
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("declaredDownpayment_input"))
			.sendKeys(testData.get("DeclaredDownPaymentAmount"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
@Then("User_6047 Extract the facility details record reference number in facilityinfo stage")
public void user_6047_extract_the_facility_details_record_reference_number_in_facilityinfo_stage() {
	  finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(32).trim();
			System.out.println(finalRecordReferenceNumber);
			FacilityDetails_TestData.updateTestData(testData.get("Dataset ID"), "Id", finalRecordReferenceNumber);
}

@Then("User_6047 to verify the same record should get saved in facilityInfo screen")
public void user_6047_to_verify_the_same_record_should_get_saved_in_facility_info_screen() {
	String ClassificationField= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification")).getAttribute("aria-label");
	System.out.println("print "+ClassificationField);
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(ClassificationField.contains(testData.get("Classification")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	String Product= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(Product.contains(testData.get("Product")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
	String scheme= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme")).getAttribute("aria-label");
	System.out.println(scheme);
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(scheme.contains(testData.get("Scheme")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	String programcode= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("ProgrameCode")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(programcode.contains(testData.get("ProgrameCode")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
	String FacilityType= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(FacilityType.contains(testData.get("FacilityType")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	
	String PricingIndicator= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("PricingIndicator")).getAttribute("aria-label");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(PricingIndicator.contains(testData.get("PricingIndicator")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
//	String RequestedAmount= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).getAttribute("ng-reflect-value-variable");
//	System.out.println(RequestedAmount);
//	for (int i = 0; i <2000; i++) {
//        try {
//            Assert.assertTrue(RequestedAmount.contains(testData.get("RequestedAmount")));
//            break;
//        } catch (Exception e) {
//            if (i==1999) {
//                Assert.fail(e.getMessage());
//          }
//        }
//    }
	String currencyField= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Currency")).getAttribute("aria-label");
	System.out.println("print "+currencyField);
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(currencyField.contains(testData.get("Currency")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
	String LoanTenureField= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure_data")).getAttribute("ng-reflect-model");

	for (int i = 0; i <2000; i++) {
        try {
        
            Assert.assertTrue(LoanTenureField.contains(testData.get("LoanTenure")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
}
@Then("User_6047 search the facility list record under facility info screen")
public void user_6047_search_the_facility_list_record_under_facility_info_screen() {
	//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
			
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text")).
				sendKeys(testData.get("Id"));
				//sendKeys(finalRecordReferenceNumber);
				System.out.println("finalRecordReferenceNumber"+finalRecordReferenceNumber);
		
				System.out.println("toastMessageForReferenceNumber"+toastMessageForReferenceNumber);
		
				break;	
			}
			
			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}		
		}
}

}
