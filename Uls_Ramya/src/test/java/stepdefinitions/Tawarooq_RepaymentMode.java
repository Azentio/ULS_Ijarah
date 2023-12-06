package stepdefinitions;

import java.io.IOException;
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

public class Tawarooq_RepaymentMode extends BaseClass{
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
	JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Tawarooq_Repayment_js = new JSPaths(excelPath, "Tawarooq_Repayment", "RepaymentElement", "JSPath");
	ExcelData Tawarooq_Repayment_TestData  = new ExcelData(excelTestDataPath,"Tawarooq_Repayment","Dataset ID");

	@And("User_6047 Login with valid credentials - Tawarruq-AppDataEntry-Repayment")
	public void user_login_with_valid_credentials_tawarruq_app_data_entry_repayment() {
		ijaraLogin.loginWithIjaraApplication_Tawarruq_AppDataEntry_Repayment();	
	}

	
	
	@And("User_6047 Get the test data for test case ID AT_TW_AD_IRM_01")
	public void user_get_the_test_data_for_test_case_id_at_tw_ad_irm() {
		testData =  Tawarooq_Repayment_TestData.getTestdata("DS01_AT_TW_AD_IRM_01");
	}

	@And("User_6047 Get the test data for test case ID AT_TW_AD_IRM_04")
	public void user_get_the_test_data_for_test_case_id_at_tw_ad_irm_04() {
		testData =  Tawarooq_Repayment_TestData.getTestdata("DS01_AT_TW_AD_IRM_04");
	}

	@And("User_6047 Get the test data for test case ID AT_TW_AD_IRM_06")
	public void user_get_the_test_data_for_test_case_id_at_tw_ad_irm_06() {
		testData =  Tawarooq_Repayment_TestData.getTestdata("DS01_AT_TW_AD_IRM_06");
	}
	@Then("logout from the ULS Application")
	public void logout_from_the_ULS_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}
	
	@And("User_6047 search the Ref Id Under inbox")
	public void user_search_the_ref_id_under_inbox_6047() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
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
	@And("User_6047 Click repayment mode section")
	public void user_click_repayment_mode_section() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("repaymentModeSection")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@And("User_6047 Click Add icon")
	public void user_click_add_icon() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@Then("User_6047 verify the repayment mode field in Repayment mode")
	public void user_verify_the_repayment_mode_field_in_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("repaymentModeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Then("User_6047 verify the account holder name field Repayment mode")
	public void user_verify_the_account_holder_name_field_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountHolderNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the account type field Repayment mode")
	public void user_verify_the_account_type_field_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountTypeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the account number field Repayment mode")
	public void user_verify_the_account_number_field_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountNumberField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the bank name field Repayment mode")
	public void user_verify_the_bank_name_field_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("bankNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the bank branch name field Repayment mode")
	public void user_verify_the_bank_branch_name_field_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("branchNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the ESC code field Repayment mode")
	public void user_verify_the_esc_code_field_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("escCode")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify save button Repayment mode")
	public void user_verify_save_button_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("saveButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify help button Repayment mode")
	public void user_verify_help_button_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("helpButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the Repayment mode field is mandatory,editable and lookup value")
	public void user_verify_the_repayment_mode_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("repaymentMode_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("repaymentMode_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("repaymentModeField").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("repaymentModeField")).trim())) {
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

	@Then("User_6047 validate the Account holder name field is mandatory,editable and lookup value")
	public void user_validate_the_account_holder_name_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountHolderName_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountHolderName_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("AccountHolderName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AccountHolderName")).trim())) {
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

	@Then("User_6047 verify the Account type field is mandatory,editable and lookup value")
	public void user_verify_the_account_type_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountTypeField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountTypeField_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("AccountType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AccountType")).trim())) {
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

	@Then("User_6047 verify the Account number field is mandatory,editable and numeric")
	public void user_verify_the_account_number_field_is_mandatory_editable_and_numeric() {
		for (int i = 0; i <2000; i++) {
			try {
				String repayment ="document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"').innerText";
				String accountnumber = (String) javascriptHelper.executeScript("return "+repayment);
				System.out.println(accountnumber);
				Assert.assertTrue(accountnumber.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 200; i++) {
		
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"]+ion-input')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("123456");
				//javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountNumberField_in")).sendKeys(testData.get("AccountNumber"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
	}

	@Then("User_6047 click the Account currency field is mandatory,editable and lookup value")
	public void user_click_the_account_currency_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("AccountCurrency_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("AccountCurrency_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("AccountCurrency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AccountCurrency")).trim())) {
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

	@Then("User_6047 verify the Bank name field is mandatory,editable and lookup value")
	public void user_verify_the_bank_name_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("bankNameField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("bankNameField_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("BankName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("BankName")).trim())) {
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

	@Then("User_6047 verify the Branch name field is mandatory,editable and lookup value")
	public void user_verify_the_branch_name_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("branchNameField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("*"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	    }
		
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("branchNameField_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("BankBranch").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("BankBranch")).trim())) {
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

	@Then("User_6047 verify the Code field is mandatory,editable and numeric")
	public void user_verify_the_code_field_is_mandatory_editable_and_numeric() {
		for (int i = 0; i <2000; i++) {
			try {
				String repayment ="document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"').innerText";
				String codefield = (String) javascriptHelper.executeScript("return "+repayment);
				System.out.println(codefield);
				Assert.assertTrue(codefield.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"]+ion-input')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-5-lbl\"]')").sendKeys("3214");
				
	}

	@Then("User_6047 click the Save button under repayment mode screen")
	public void user_click_the_save_button_under_repayment_mode_screen() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("SaveButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the successfully saved message popup in Repayment Mode")
	public void user_verify_the_successfully_saved_message_popup_in_repayment_mode() {
		for (int i = 0; i <2000; i++) {
	        try {
	        	String text = javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("SucessPopUP")).getText();
	        	System.out.println(text);
	            Assert.assertTrue(text.contains("Success!"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}

	@Then("User_6047 click edit icon in Repayment Mode")
	public void user_click_edit_icon_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("editIcon")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the same record should get saved in Repayment Mode")
	public void user_to_verify_the_same_record_should_get_saved_in_repayment_mode() {
		String repaymentMode= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("repaymentMode_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentMode.contains("Debit Card"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String accountHolderName= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountHolderName_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountHolderName.contains("test"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String accountType= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountTypeField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountType.contains("Savings Account"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		String accountNumber= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountNumberField_in")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountNumber.contains("123456"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String  accountCurrency= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("AccountCurrency_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountCurrency.contains("CAD"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String  bankName= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("bankNameField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(bankName.contains("BankofBaroda "));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		String  branchName= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("branchNameField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(branchName.contains("BOAVA Branch"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		String  code= javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("escCode_in")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(code.contains("89630"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
	}

	@And("User_6047 click help icon in Repayment Mode")
	public void user_click_help_icon_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("helpButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify description of all the fields details in Repayment Mode")
	public void user_verify_description_of_all_the_fields_details_in_repayment_mode() {
		for (int i = 0; i <2000; i++) {
			try {
				String repayment ="document.querySelector('pre[class=\"ng-star-inserted\"]').innerText";
				String description = (String) javascriptHelper.executeScript("return "+repayment);
				System.out.println(description);
			
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_6047 Click the Search button")
	public void user_click_the_search_button() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_button")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 search the Repayment list under Repayment mode")
	public void user_search_the_repayment_list_under_repayment_mode() {
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

	@Then("User_6047 click the Entitle button under Repayment mode")
	public void user_click_the_entitle_button_under_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("Edit_button")).click();
				Thread.sleep(4000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@Then("User_6047 Give the input for repayment mode field in Repayment Mode")
	public void user_give_the_input_for_repayment_mode_field_in_repayment_mode() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("repaymentMode_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("repaymentModeField").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("repaymentModeField")).trim())) {
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

	@Then("User_6047 Give the input for account holder name field in Repayment Mode")
	public void user_give_the_input_for_account_holder_name_field_in_repayment_mode() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountHolderName_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("AccountHolderName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AccountHolderName")).trim())) {
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

	@Then("User_6047 Give the input for account type field in Repayment Mode")
	public void user_give_the_input_for_account_type_field_in_repayment_mode() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("accountTypeField_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("AccountType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AccountType")).trim())) {
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

	@Then("User_6047 Give the input for account currency field in Repayment Mode")
	public void user_give_the_input_for_account_currency_field_in_repayment_mode() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("AccountCurrency_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("AccountCurrency").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("AccountCurrency")).trim())) {
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

	@Then("User_6047 Give the input for bank name field in Repayment Mode")
	public void user_give_the_input_for_bank_name_field_in_repayment_mode() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("bankNameField_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("BankName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("BankName")).trim())) {
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

	@Then("User_6047 Give the input for branch name field in Repayment Mode")
	public void user_give_the_input_for_branch_name_field_in_repayment_mode() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawarooq_Repayment_js.getElement("branchNameField_in")).click();
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
				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
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
					if (l == 300 && !(dropdownString.isBlank())) {
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
			System.out.println("Map " + testData.get("BankBranch").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("BankBranch")).trim())) {
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

	@Then("User_6047 Give the input for code field in Repayment Mode")
	public void user_give_the_input_for_code_field_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"]+ion-input')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-5-lbl\"]')").sendKeys("3214");
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@Then("User_6047 Verify the popup of fill all field in Repayment Mode")
	public void user_verify_the_popup_of_fill_all_field_in_repayment_mode() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PleaseFillDetails_Popup")));
		Thread.sleep(2000);
		for (int i = 0; i <2000; i++) {
	        try {
	        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("PleaseFillDetails_Popup")).getText();
	        	System.out.println(text);
	            Assert.assertTrue(text.contains("Please fill all the details"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}
	@Then("User_6047 Give the negative number input for account number field in Repayment Mode")
	public void user_give_the_negative_number_input_for_account_number_field_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("-123");
				Thread.sleep(3000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Give the character input for account number field in Repayment Mode")
	public void user_give_the_character_input_for_account_number_field_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("account number");
				Thread.sleep(3000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Enter the special character for account number field in Repayment Mode")
	public void user_enter_the_special_character_for_account_number_field_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("**$");
				Thread.sleep(3000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_6047 Delete the account number Repayment mode screen")
	public void user_delete_the_account_number_repayment_mode_screen() {
for (int i = 0; i < 200; i++) {
			
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"]+ion-input')").click();
				javascriptHelper
				.executeScriptWithWebElement(
						("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')"))
				.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				
				//javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").clear();
				//javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountNumberField_in")).sendKeys(testData.get("AccountNumber"));
			
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
	}

	@Then("User_6047 give the input for account number field in Repayment mode screen")
	public void user_give_the_input_for_account_number_field_in_repayment_mode_screen() {
for (int i = 0; i < 200; i++) {
			
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"]+ion-input')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("23658");
				//javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountNumberField_in")).sendKeys(testData.get("AccountNumber"));
				Thread.sleep(3000);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
	}

	@Then("User_6047 click the submit button in Repayment mode")
	public void user_click_the_submit_button_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('button[label=\"Submit\"]')").click();
				Thread.sleep(3000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 click the ok button in action conform field in Repayment mode")
	public void user_click_the_ok_button_in_action_conform_field_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("ok_ActCon")));
				//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("ok_ActCon")).click();
				Thread.sleep(6000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 click the submit in action conform field in  Repayment mode")
	public void user_click_the_submit_in_action_conform_field_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("submit_ActCon")));
				//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("submit_ActCon")).click();
			
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the submit successfully popup in  Repayment mode")
	public void user_verify_the_submit_successfully_popup_in_repayment_mode() {
		for (int i = 0; i <2000; i++) {
	        try {
	        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SucessPopUP")).getText();
	        	System.out.println(text);
	            Assert.assertTrue(text.contains("Submit"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
	}

	@Then("User_6047 verify the successfully saved message popup and get the reference number")
	public void user_verify_the_successfully_saved_message_popup_and_get_the_reference_number() {
		String SavetoastMessage = "";
		String toastMessageForReferenceNumber = "";
		for (int i = 0; i <= 300; i++) {
			try {
				SavetoastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(SavetoastMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(SavetoastMessage.contains("Success! Record created with ID"),
				"Record is not saved hence failed");
		toastMessageForReferenceNumber = SavetoastMessage;
		System.out.println(SavetoastMessage);
		
		
		//String finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(36).trim();
		String finalsavedata = toastMessageForReferenceNumber.substring(toastMessageForReferenceNumber.lastIndexOf(" ")+1).trim();
		System.out.println("Final reference number " + finalsavedata);
		Tawarooq_Repayment_TestData.updateTestData("DS01_AT_TW_AD_IRM_06", "save_record_reference_number", finalsavedata);

	}

	@Then("User_6047 Click the submit button")
	public void user_click_the_submit_button() {
		
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('button[ng-reflect-label=\"Submit\"]')").click();
				Thread.sleep(3000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Click the ok button in action conform field")
	public void user_click_the_ok_button_in_action_conform_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("ok_ActCon")));
				//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("ok_ActCon")).click();
				Thread.sleep(6000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Click the submit in action conform field")
	public void user_click_the_submit_in_action_conform_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("submit_ActCon")));
				//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("submit_ActCon")).click();
			
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the submit successfully popup and get reference number")
	public void user_verify_the_submit_successfully_popup_and_get_reference_number() {
		String submitRecord ="";
		for (int i = 0; i <2000; i++) {
	        try {
	         submitRecord = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SucessPopUP")).getText();
	        	System.out.println(submitRecord);
	            Assert.assertTrue(submitRecord.contains("APPROVED Successfully"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
		}
		String finalRecordReferenceNumber = submitRecord.substring(87,92).trim();
		System.out.println("split"+finalRecordReferenceNumber);
		//String finalRecordReferenceNumber = submitRecord.substring(submitRecord.lastIndexOf(" ")+1).trim();
		System.out.println("Final reference number " + finalRecordReferenceNumber);
		Tawarooq_Repayment_TestData.updateTestData("DS01_AT_TW_AD_IRM_06", "record_reference_number", finalRecordReferenceNumber);

		
	}
	@Then("User_6047 to verify system should show the list view")
	public void user_to_verify_system_should_show_the_list_view() {
		String NumberOFlistViewRecord = "";
		
		for (int i = 0; i <= 300; i++) {

			try {

				if (i > 200) {

					NumberOFlistViewRecord = javascriptHelper.executeScript(

							"return document.querySelector('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")

							.toString();

					break;

				}
 } 
			catch (Exception e) {
				if (i == 300) {
                 	Assert.fail(e.getMessage());

				}

			}

		}

		System.out.println(NumberOFlistViewRecord);
	}


}