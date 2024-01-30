package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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

public class Tawarruq_AppDataCheck_RepaymentMode {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	// Ijarah_CommonFieldName
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	JSPaths  Tawar_Repayment_js= new JSPaths(excelPath, "Murabha_Repayment_js", "RepaymentElement", "JSPath");
	ExcelData Tawar_Repayment_TestData  = new ExcelData(excelTestDataPath,"Tawa_check_Repayment","Dataset ID");
	

	@And("User_6047 Get the test data for test case ID AT_TW_RM_01")
	public void user_6047_get_the_test_data_for_test_case_id_at_tw_ad_irm() {
		testData =  Tawar_Repayment_TestData.getTestdata("DS01_AT_TW_RM_01");
	}

	@And("User_6047 Search the Reference Id Under inbox")
	public void user_6047_search_the_reference_id_under_inbox_6047() throws Throwable {
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

	@And("User_6047 click Repaymentmode section")
	public void user_6047_click_repaymentmode_section() {
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
					if (segmentLabelName.equalsIgnoreCase("Repayment Mode")) {
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelector('ion-segment').querySelectorAll('ion-segment-button')[" + i
										+ "]")
								.click();
						isClicked = true;
						break;

					} else if (!(segmentLabelName.equalsIgnoreCase("Repayment Mode"))) {
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
	@Then("User_6047 verify the repayment mode field in Repaymentmode")
	public void user_6047_verify_the_repayment_mode_field_in_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("repaymentModeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String repaymentmodefield= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("repaymentMode_in")).getAttribute("ng-reflect-disabled");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(repaymentmodefield.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@Then("User_6047 verify the account holder name field Repaymentmode")
	public void user_6047_verify_the_account_holder_name_field_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("accountHolderNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String accountHolderNameField= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("accountHolderName_in")).getAttribute("ng-reflect-disabled");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountHolderNameField.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@Then("User_6047 verify the account type field Repaymentmode")
	public void user_6047_verify_the_account_type_field_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("accountTypeField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String accountTypeField= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("accountTypeField_in")).getAttribute("ng-reflect-disabled");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountTypeField.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@Then("User_6047 verify the account number field Repaymentmode")
	public void user_6047_verify_the_account_number_field_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("accountNumberField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String accountNumberField= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("accountNumberField_in")).getAttribute("ng-reflect-readonly");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(accountNumberField.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@Then("User_6047 verify the bank name field Repaymentmode")
	public void user_6047_verify_the_bank_name_field_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("bankNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String bankNameField= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("bankNameField_in")).getAttribute("ng-reflect-disabled");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(bankNameField.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@Then("User_6047 verify the bank branch name field Repaymentmode")
	public void user_6047_verify_the_bank_branch_name_field_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("branchNameField")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String branchNameField= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("branchNameField_in")).getAttribute("ng-reflect-disabled");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(branchNameField.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@Then("User_6047 verify the ESC code field Repaymentmode")
	public void user_6047_verify_the_esc_code_field_repayment_mode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("escCode")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String escCode= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("escCode_in")).getAttribute("ng-reflect-readonly");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(escCode.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}
	@Then("User_6047 verify help button Repaymentmode")
	public void user_6047_verify_help_button_repayment_mode() {
		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("helpButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the Status field Repaymentmode")
	public void user_6047_verify_the_status_field_repaymentmode() {
		int i=0;
		for ( i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("StatusCheck")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	

		String status= javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("Status")).getAttribute("ng-reflect-readonly");
		for ( i = 0; i <2000; i++) {
	        try {
	            Assert.assertTrue(status.contains("true"));
	            break;
	        } catch (Exception e) {
	            if (i==1999) {
	                Assert.fail(e.getMessage());
	            }
	        }
	        }
	}

	@And("User_6047 click help icon in Repaymentmode")
	public void user_click_help_icon_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Tawar_Repayment_js.getElement("helpButton")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify description of all the fields details in Repaymentmode")
	public void user_6047_verify_description_of_all_the_fields_details_in_repayment_mode() {
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
}
