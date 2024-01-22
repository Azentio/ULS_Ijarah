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

public class Murabha_RepaymentMode_Steps extends BaseClass {
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
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths Murabha_Repayment_js = new JSPaths(excelPath, "Murabha_Repayment_js", "RepaymentElement", "JSPath");
	ExcelData Murabha_Repayment_TestData  = new ExcelData(excelTestDataPath,"Murabha_Repayment_TestData","Dataset ID");
	JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	ExcelData Murabha_identificationDetail_TestData  = new ExcelData(excelTestDataPath,"mura_identificationDetail","Dataset ID");
	
	String toastMessageForReferenceNumber = "";
	
	String finalRecordReferenceNumber="";
	String toastMessage = "";

	@And("User_6047 Get the test data for test case ID AT_MU_IRM_001")
	public void user_6047_get_the_test_data_for_test_case_id_at_fi() {
		testData =  Murabha_Repayment_TestData.getTestdata("DS01_AT_MU_IRM_001");
	}
	@And("User_6047 Get the test data for test case ID AT_MU_IRM_007")
	public void user_6047_get_the_test_data_for_test_case_id_at_fi_() {
		testData =  Murabha_Repayment_TestData.getTestdata("DS01_AT_MU_IRM_007");
	}


	@And("User_6047 click the module name dropdown in ULS application")
	public void user_6047_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("moduleNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_6047 select the module name as LOS in ULS application")
	public void user_6047_select_the_module_name_as_los_in_uls_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
        String moduleLength = "";
        for (int i = 0; i <= 300; i++) {
            try {
                moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
                System.out.println("Module Length " + moduleLength);
                if (!(moduleLength.isBlank())) {
                    break;
                }
            } catch (Exception e) {
                if (i == 300) {
                    Assert.fail(e.getMessage());
                }
            }
        }
        int premitiveIntegerLength = Integer.parseInt(moduleLength);
        
//		document.querySelectorAll('ion-radio-group ion-item')[0].textContent
        for (int i = 0; i < premitiveIntegerLength; i++) {
            for (int j = 0; j <= 300; j++) {
                try {
                    String moduleName = javascriptHelper.executeScript(
                            "return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
                            .toString();
                    System.out.println("Module name " + moduleName);
                 // if (moduleName.equalsIgnoreCase("LOS")) {
                    if (moduleName.equalsIgnoreCase(testData.get("Module Name"))) {
                        System.out
                                .println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
                        javascriptHelper
                                .executeScriptWithWebElement(
                                        "document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
                                .click();
                    }
                } catch (Exception e) { 

                }
            }
        }	
	}
	@And("User_6047 Search the Ref Id Under inbox")
	public void user_6047_search_the_ref_id_under_inbox_6047() throws Throwable {
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
	
	@And("User_6047 click repayment mode section")
	public void user_6047_click_repayment_mode_section() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentModeSection")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}
	@And("User_6047 click Add icon")
	public void user_6047_click_edit_icon() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}
	@Then("User_6047 verify the repayment mode field")
	public void User_6047_verify_the_repayment_mode_field() {
		for (int i = 0; i <2000; i++) {
			try {
				
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentModeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
	}

	@Then("User_6047 verify the account holder name field")
	public void User_verify_the_account_holder_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountHolderNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Then("User_6047 verify the account type field")
	public void User_6047_verify_the_account_type_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountTypeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the account number field")
	public void User_6047_verify_the_account_number_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountNumberField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the bank name field")
	public void User_6047_verify_the_bank_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("bankNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the bank branch name field")
	public void User_6047_verify_the_bank_branch_name_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("branchNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the ESC code field")
	public void User_6047_verify_the_ecs_code_field() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("escCode")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify save button")
	public void User_6047_verify_save_button() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("saveButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify help button")
	public void User_6047_verify_help_button() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("helpButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_6047 verify the repayment mode field is mandatory,editable and lookup value")
	public void user_6047_verify_the_repayment_mode_field_is_mandatory_editable_and_lookup_value() throws Throwable  {
		Thread.sleep(3000);
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")));
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")).getAttribute("aria-label");
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
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")).click();
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

	@Then("User_6047 validate the account holder name field is mandatory,editable and lookup value")
	public void user_6047_validate_the_account_holder_name_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountHolderName_in")).getAttribute("aria-label");
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
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountHolderName_in")).click();
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

	@Then("User_6047 verify the account type field is mandatory,editable and lookup value")
	public void user_6047_verify_the_account_type_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountTypeField_in")).getAttribute("aria-label");
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
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountTypeField_in")).click();
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

	@Then("User_6047 verify the account number field is mandatory,editable and numeric")
	public void user_6047_verify_the_account_number_field_is_mandatory_editable_and_numeric() {
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
		
	
	@Then("User_6047 click the account currency field is mandatory,editable and lookup value")
	public void user_6047_click_the_account_currency_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("AccountCurrency_in")).getAttribute("aria-label");
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
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("AccountCurrency_in")).click();
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

	@Then("User_6047 verify the bank name field is mandatory,editable and lookup value")
	public void user_6047_verify_the_bank_name_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("bankNameField_in")).getAttribute("aria-label");
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
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("bankNameField_in")).click();
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

	@Then("User_6047 verify the branch name field is mandatory,editable and lookup value")
	public void user_6047_verify_the_branch_name_field_is_mandatory_editable_and_lookup_value() {
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("branchNameField_in")).getAttribute("aria-label");
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
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("branchNameField_in")).click();
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

	@Then("User_6047 verify the code field is mandatory,editable and numeric")
	public void user_6047_verify_the_code_field_is_mandatory_editable_and_numeric() {
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
	
	
	@Then("User_6047 click the save button under repayment mode screen")
	public void user_6047_click_the_save_button_under_the_repayment_mode_screen() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SaveButton")).click();
			
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_6047 verify the successfully saved message popup")
	public void user_6047_verify_the_successfully_saved_message_popup() {
		for (int i = 0; i <2000; i++) {
	        try {
	        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SucessPopUP")).getText();
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
	@Then("User_6047 to verify the same record should get saved in Repayment mode")
	public void user_6047_to_verify_the_same_record_should_get_saved_Repayment_mode() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")));
		Thread.sleep(3000);
		String repaymentMode= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")).getAttribute("aria-label");
		System.out.println(repaymentMode);
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentMode.contains("Cash Mode"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String accountHolderName= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountHolderName_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	        	Assert.assertTrue(accountHolderName.contains("aa"));
	           // Assert.assertTrue(accountHolderName.contains("TEST KI"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String accountType= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountTypeField_in")).getAttribute("aria-label");
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
		String accountNumber= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountNumberField_in")).getAttribute("ng-reflect-model");
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
		
		String  accountCurrency= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("AccountCurrency_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountCurrency.contains("INR"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String  bankName= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("bankNameField_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(bankName.contains("BankofBaroda"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
//		String  branchName= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("branchNameField_in")).getAttribute("aria-label");
//		for (int i = 0; i <2000; i++) {
//	        try {
//	            Assert.assertTrue(branchName.contains("chennai"));
//	            break;
//	        } catch (Exception e) {
//	            if (i==1999) {
//	                Assert.fail(e.getMessage());
//	          }
//	        }
//	    }
		String  code= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("escCode_in")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(code.contains("3214"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
	}
	
	@And("User_6047 click edit icon")
	public void user_click_edit_icon_() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("editIcon")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_6047 click help icon")
	public void user_6047_click_help_icon() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("helpButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify description of all the fields details")
	public void user_6047_verify_description_of_all_the_fields_details() {
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
	
	@Then("User_6047 give the input for repayment mode field")
	public void user_6047_give_the_input_for_repayment_mode_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")).click();
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

	@Then("User_6047 give the input for account holder name field")
	public void user_6047_give_the_input_for_account_holder_name_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountHolderName_in")).click();
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

	@Then("User_6047 give the input for account type field")
	public void user_6047_give_the_input_for_account_type_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountTypeField_in")).click();
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
 

	@Then("User_6047 give the input for account currency field")
	public void user_6047_give_the_input_for_account_currency_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("AccountCurrency_in")).click();
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

	@Then("User_6047 give the input for bank name field")
	public void user_6047_give_the_input_for_bank_name_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("bankNameField_in")).click();
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

	@Then("User_6047 give the input for branch name field")
	public void user_6047_give_the_input_for_branch_name_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("branchNameField_in")).click();
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

	@Then("User_6047 give the input for code field")
	public void user_6047_give_the_input_for_code_field() {

		for (int i = 0; i <= 1000; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"]+ion-input')").click();
//				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"]+ion-input')").sendKeys("3214");
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

	@And("User_6047 give the character input for account number field")
	public void user_6047_give_the_input_for_account_number_field() {
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
		
	@And("User_6047 enter the special character for account number field")
	public void user_6047_enter_the_special_character_for_account_number_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").clear();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("***");
				Thread.sleep(3000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 modify the ESC code field")
	public void user_6047_modify_the_ESC_code_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"ECS CODE.TOOLTIP\"]+ion-input')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-5-lbl\"]')").clear();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-5-lbl\"]')").sendKeys("89630");
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Then("User_6047 delete the account number")
	public void user_6047_delete_the_account_number() {
		for (int i = 0; i < 200; i++) {
			
			try {
				//javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"]+ion-input')").sendKeys(Keys.DELETE);
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
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

	@Then("User_6047 give the input for account number field")
	public void user_6047_give_the_input_for_account_number_field_() {
for (int i = 0; i < 200; i++) {
			
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-label[ng-reflect-text=\"Account Number.TOOLTIP\"]+ion-input')").click();
				javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("23658");
				
				//javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").sendKeys("23658");
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
	
	@Then("User_6047 click the submit button")
	public void user_6047_click_the_submit_button() {
		
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

	@And("User_6047 verify the submit successfully popup")
	public void user_6047_verify_the_submit_successfully_popup() {
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
	
	
	@And("User_6047 click the ok button in action conform field")
	public void user_6047_click_the_ok_button_in_active_conform_field() {
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

	@And("User_6047 click the submit in action conform field")
	public void user_6047_click_the_submit_in_active_conform_field() {
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
	@Then("User_6047 verify the successfully saved message under the repaymentmode")
	public void user_6047_verify_the_successfully_saved_message_under_the_facility_info() {
//		for (int i = 0; i <2000; i++) {
//	        try {
//	        	String text = javascriptHelper.executeScriptWithWebElement(appDataEntry_js.getElement("SucessPopUP")).getText();
//	        	System.out.println(text);
//	            Assert.assertTrue(text.contains("Success!"));
//	            break;
//	        } catch (Exception e) {
//	            if (i==1999) {
//	                Assert.fail(e.getMessage());
//	            }
//	        }
//		}

		for (int i = 0; i <= 300; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(toastMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toastMessage.contains("Success! Record created with ID"),
				"Record is not saved hence failed");
		toastMessageForReferenceNumber = toastMessage;

		System.out.println("toastMessageForReferenceNumber"+toastMessageForReferenceNumber);
	}
	@And("User_6047 Extract the application details record reference number in repaymentmode")
	public void user_6047_extract_the_application_details_record_reference_number_in_repaymentmode() throws Throwable {
//		finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(32).trim();
//		System.out.println("Final reference number " + finalRecordReferenceNumber);
//		excelDataForApplicationDetailsTestDataForMurabha.updateTestData(newApplicationTestData.get("Dataset ID"),
//				"record_reference_number", finalRecordReferenceNumber);

		
		  finalRecordReferenceNumber = toastMessageForReferenceNumber.substring(32).trim();
		System.out.println(finalRecordReferenceNumber);
		Murabha_Repayment_TestData.updateTestData(testData.get("Dataset ID"), "Id", finalRecordReferenceNumber);
		//testData = ApplicationDataEntry_testdata.getTestdata("STOR_P2_006_D1");
		
		
	}
	
	@And("User_6047 search the facility list under RepaymentMode")
	public void user_6047_search_the_ref_id_under_inbox() throws Throwable {
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
	
	@Then("User_6047 to verify the modified record should get saved in Repayment mode")
	public void user_6047_to_verify_the_modified_record_should_get_saved_Repayment_mode() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")));
		String repaymentMode= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("repaymentMode_in")).getAttribute("aria-label");
		System.out.println(repaymentMode);
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentMode.contains("Cash Mode"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String accountHolderName= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountHolderName_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	        	Assert.assertTrue(accountHolderName.contains("aa"));
	           // Assert.assertTrue(accountHolderName.contains("TEST KI"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String accountType= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountTypeField_in")).getAttribute("aria-label");
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
		String accountNumber= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("accountNumberField_in")).getAttribute("ng-reflect-model");
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
		
		String  accountCurrency= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("AccountCurrency_in")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountCurrency.contains("INR"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	          }
	        }
	    }
		
		String  bankName= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("bankNameField_in")).getAttribute("aria-label");
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
//		String  branchName= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("branchNameField_in")).getAttribute("aria-label");
//		for (int i = 0; i <2000; i++) {
//	        try {
//	            Assert.assertTrue(branchName.contains("chennai"));
//	            break;
//	        } catch (Exception e) {
//	            if (i==1999) {
//	                Assert.fail(e.getMessage());
//	          }
//	        }
//	    }
		String  code= javascriptHelper.executeScriptWithWebElement(Murabha_Repayment_js.getElement("escCode_in")).getAttribute("ng-reflect-model");
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
	
	
	
	}
	
	
	
	




