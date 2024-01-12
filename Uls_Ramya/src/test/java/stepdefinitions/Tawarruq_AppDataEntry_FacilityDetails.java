package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
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

public class Tawarruq_AppDataEntry_FacilityDetails {
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
	
	JSPaths FacilityDetails_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	ExcelData FacilityDetails_testdata  = new ExcelData(excelTestDataPath,"Tawar_Entry_FacilityInfo","Dataset ID");

	String toastMessageForReferenceNumber = "";
	
	String finalRecordReferenceNumber="";
	String toastMessage = "";
	String listViewRecordStatus = "";

	String recordStatus = "";
	

	@And("User_6047 Get the test data for test case ID AT_FAC_DET_04")
	public void user_6047_get_the_test_data_for_test_case_id_at_fac_det_04() {
		testData =  FacilityDetails_testdata.getTestdata("DS01_AT_FAC_DET_04");
	}
	@And("User_6047 Search the Reff Id under inbox")
	public void user_search_the_reff_id_under_inbox_6047() throws Throwable {
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
	@Then("User_6047 give the input for Classification field under the Facility info")
	public void user_give_the_input_for_classification_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Classification")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("Classification").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Classification")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}}
	@Then("User_6047 give the input for Product field under the Facility info")
	public void user_give_the_input_for_product_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Product")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("Product").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Product")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
	}
	@Then("User_6047 give the input for Scheme field under the Facility info")
	public void user_6047_give_the_input_for_scheme_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Scheme")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("Scheme").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Scheme")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}}

	@Then("User_6047 give the input for Program Code field under the Facility info")
	public void user_6047_give_the_input_for_program_code_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("ProgrameCode")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("ProgrameCode").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ProgrameCode")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
	}

	@Then("User_6047 give the input for Facility type field under the Facility info")
	public void user_6047_give_the_input_for_facility_type_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("FacilityType")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("FacilityType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("FacilityType")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
	}

	@Then("User_6047 give the input for Pricing Indicator field under the Facility info")
	public void user_6047_give_the_input_for_pricing_indicator_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("PricingIndicator")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("PricingIndicator").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("PricingIndicator")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
	}

	@Then("User_6047 to verify the same record should get saved in facilityInfo")
	public void user_6047_to_verify_the_same_record_should_get_saved_in_facility_info() {
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
//		String RequestedAmount= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).getAttribute("ng-reflect-value-variable");
//		System.out.println(RequestedAmount);
//		for (int i = 0; i <2000; i++) {
//	        try {
//	            Assert.assertTrue(RequestedAmount.contains(testData.get("RequestedAmount")));
//	            break;
//	        } catch (Exception e) {
//	            if (i==1999) {
//	                Assert.fail(e.getMessage());
//	          }
//	        }
//	    }
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
	@Then("User_6047 give the input for Request Amount under the Facility info")
	public void user_give_the_input_for_request_amount_under_the_facility_info() {
		javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).click();
//		for (int i = 0; i <= 500; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("RequestedAmount"))
//				.sendKeys(testData.get("RequestedAmount"));
//				break;
//			} catch (Exception e) {
//				if (i == 500) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")
		.sendKeys(testData.get("RequestedAmount"));
		

}
	@Then("User_6047 give the input for Currency field under the Facility info")
	public void user_6047__the_input_for_currency_field_under_the_facility_info() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("Currency")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {
				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
				System.out.println("Dropdown length " + dropdownLength);
				if (!(dropdownLength.isEmpty()) && !(dropdownLength.equals("0"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveDropdownLength = Integer.parseInt(dropdownLength);
		for (int j = 0; j <= premitiveDropdownLength; j++) {
			for (int l = 0; l <= 300; l++) {
				try {
					System.out.println("L value is " + l);
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				} catch (Exception e) {
					if (l == 300 && !(dropdownString.isEmpty())) {
						Assert.fail(e.getMessage());
					}
				}
				if (!(dropdownString.isEmpty())) {
					System.out.println(dropdownString);
					System.out.println("Loop count " + l + " got breaked");
					break;
				}
			}
			System.out.println("String " + dropdownString.trim());
			System.out.println("Map " + testData.get("Currency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Currency")).trim())) {
				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;
					} catch (Exception e) {
						if (k == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
	}


	@Then("User_6047 give the input for Loan Tenure under the Facility info")
	public void user_give_the_input_for_loan_tenure_under_the_facility_info() {
		javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure")).click();
		javascriptHelper                    

		.executeScriptWithWebElement(

				
		"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")

		
	.sendKeys(testData.get("LoanTenure"));
		
		
	}
	@And("User_6047 Extract the application details record reference number in facilityinfo stage")
	public void user_6047_extract_the_application_details_record_reference_number_in_facilityinfo_stage() throws Throwable {
		  finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(32).trim();
		System.out.println(finalRecordReferenceNumber);
		FacilityDetails_testdata.updateTestData(testData.get("Dataset ID"), "Id", finalRecordReferenceNumber);
		
	}

@Then("User_6047 To verify the validation message for blank field")
public void user_6047_to_verify_the_validation_message_for_blank_field() throws Throwable {
	String toastContent = "";
	for (int i = 0; i <= 100; i++) {
		try {
			toastContent = javascriptHelper.executeScript("return " + iJarah_CommonElements.getElement("toast_message"))
					.toString();
			System.out.println(toastContent);
			if (!(toastContent.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Assert.assertEquals("Please fill all the details", toastContent);
}

@Then("User_6047 enter the negative numeric value to requested amount field")
public void user_6047_enter_the_negative_numeric_value_to_requested_amount_field() {
	javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).click();

	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")
	.sendKeys(testData.get("negativeValue"));
}

@Then("User_6047 to verify negative numeric value in request amout field")
public void user_6047_to_verify_negative_numeric_value_in_request_amout_field() {
	String RequestedAmount= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).getAttribute("ng-reflect-value-variable");
	System.out.println(RequestedAmount);
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(!RequestedAmount.contains(testData.get("negativeValue")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
}

@Then("User_6047 enter the character value to requested amount field")
public void user_6047_enter_the_character_value_to_requested_amount_field() throws Throwable {

	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')").sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")
	.sendKeys(testData.get("characterValue"));
}

@Then("User_6047 to verify character value value in request amout field")
public void user_6047_to_verify_character_value_value_in_request_amout_field() {
	String RequestedAmount= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).getAttribute("aria-valuenow");
	System.out.println(RequestedAmount);
	String toastContent = "";
	for (int i = 0; i <= 100; i++) {
		try {
			toastContent = javascriptHelper.executeScript("return " + iJarah_CommonElements.getElement("toast_message"))
					.toString();
			System.out.println(toastContent);
			if (!(toastContent.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Assert.assertEquals("Please fill all the details", toastContent);

}

@Then("User_6047 enter the special character value to requested amount field")
public void user_6047_enter_the_special_character_value_to_requested_amount_field() {
	//javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).click();
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')").clear();
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")
	.sendKeys(testData.get("specialCharacter"));
}

@Then("User_6047 to verify special character value in request amout field")
public void user_6047_to_verify_special_character_value_in_request_amout_field() {
	String RequestedAmount= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).getAttribute("aria-valuenow");
	System.out.println(RequestedAmount);
	String toastContent = "";
	for (int i = 0; i <= 100; i++) {
		try {
			toastContent = javascriptHelper.executeScript("return " + iJarah_CommonElements.getElement("toast_message"))
					.toString();
			System.out.println(toastContent);
			if (!(toastContent.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 100) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Assert.assertEquals("Please fill all the details", toastContent);
}
@And("User_6047 search the facility list record under facility info")
public void user_search_the_facility_list_record_under_facility_info() {
	//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_button_for_employment_det")).click();
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text")).
			sendKeys(testData.get("Id"));
			//sendKeys(finalRecordReferenceNumber);
			System.out.println("finalRecordReferenceNumber"+finalRecordReferenceNumber);
			System.out.println(finalRecordReferenceNumber);
			
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
@Then("User_6047 To modify the Loan Tenure field under facility info")
public void user_6047_to_modify_the_loan_tenure_field_under_facility_info() {
	javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure")).click();
	javascriptHelper                    

	.executeScriptWithWebElement(

			
	"document.querySelector('digital-text-box[id=\"loanTenure\"] input')")

	
.sendKeys(testData.get("modification_loan"));
}

@Then("User_6047 check same record saved inLoan Tenure field under facility info")
public void user_6047_check_same_record_saved_in_loan_tenure_field_under_facility_info() {
	String LoanTenureFieldmodification= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("LoanTenure_data")).getAttribute("ng-reflect-model");
	
	for (int i = 0; i <2000; i++) {
        try {
        
            Assert.assertTrue(LoanTenureFieldmodification.contains(testData.get("modification_loan")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
}

@Then("User_6047 enter the invalid data to required amount field")
public void user_6047_enter_the_invalid_data_to_required_amount_field() {
	javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).click();

	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")
	.sendKeys(testData.get("negativeValue"));
}

@Then("User_6047 verify the invalid data in required amount field")
public void user_6047_verify_the_invalid_data_in_required_amount_field() {

	String RequestedAmount= javascriptHelper.executeScriptWithWebElement(FacilityDetails_js.getElement("RequestedAmount")).getAttribute("ng-reflect-value-variable");
	System.out.println(RequestedAmount);
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(!RequestedAmount.contains(testData.get("negativeValue")));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
          }
        }
    }
}
@Then("User_6047 give the valid input for Request Amount under the Facility info")
public void user_give_the_valid_input_for_request_amount_under_the_facility_info() {
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')").clear();
//	for (int i = 0; i <= 500; i++) {
//		try {
//			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("RequestedAmount"))
//			.sendKeys(testData.get("RequestedAmount"));
//			break;
//		} catch (Exception e) {
//			if (i == 500) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
	javascriptHelper.executeScriptWithWebElement("document.querySelector('kub-prime-ccy[ng-reflect-name=\"amountRequested\"] input')")
	.sendKeys(testData.get("RequestedAmount"));
	

}
@Then("User_6047 change the  status to active to inactive or inactive to active")

public void user_change_the_address_details_status_to_active_to_inactive_or_inactive_to_active() throws Throwable {
	for (int i = 0; i <= 300; i++) {
		try {
			javascriptHelper.scrollIntoView(javascriptHelper
					.executeScriptWithWebElement(FacilityDetails_js.getElement("Status_toggle")));
			javascriptHelper
					.executeScriptWithWebElement(FacilityDetails_js.getElement("Status_toggle"))
					.click();
			break;
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Thread.sleep(1000);

	for (int i = 0; i <= 100; i++) {
		try {
			recordStatus = javascriptHelper
					.executeScript(
							"return " + FacilityDetails_js.getElement("facility_Status"))
					.toString();
		} catch (Exception e) {

		}
	}
}
@Then("User_6047 verify system should show the record status as active or inactive based on the toggle")
public void verify_system_should_show_the_record_status_as_active_or_inactive_based_on_the_toggle() throws Throwable {


	for (int i = 0; i <= 3000; i++) {
		try {
			if (i > 2500) {
				System.out.println(
						"document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText");
				listViewRecordStatus = javascriptHelper.executeScript(
						"return document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
						.toString();

				System.out.println("List view Record status " + listViewRecordStatus);
				if (!(listViewRecordStatus.isEmpty())) {
					break;
				}
			}
		} catch (Exception e) {
			if (i == 3000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	if (recordStatus.equals("false")) {
		softAssert.assertEquals(listViewRecordStatus, "In-active");
	} else if (recordStatus.equals("true")) {
		softAssert.assertEquals(listViewRecordStatus, "Active");
	}
}
 
}
