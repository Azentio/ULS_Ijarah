package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarraq_AppDataCheck_CustomerDebt_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	ExcelData excelDataForAddressDetailsTestData = new ExcelData(excelTestDataPath, "ijarah_AddressDetailsTestData",
			"Dataset ID");
	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"customerDebtExcelData","Dataset ID");
	Map<String, String> addressDetailsTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> AssetDetailsTestData = new HashMap<>();
	ExcelData excelDataForAssetDetailsTestData = new ExcelData(excelTestDataPath, "AssetDetai lsTestData",
			"Dataset ID");
	
	@And("^User get the test data for test case AT_TW_ADC_CD_001$")
	public void get_the_test_data_for_test_case_AT_TW_ADC_CD_001() throws Throwable {
		testData = customerDebtExcelData.getTestdata("AT_TW_ADC_CD_001_D1");
	}
	
	@Given("user_626 verify the account number field below the Customer debt details")
	public void user_626_verify_the_account_number_field_below_the_customber_debt_details() {
		WebElement accountNumberLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("accountNumberLabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(accountNumberLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_626 verify the  Closed Date field below the Customer debt details")
	public void user_626_verify_the_closed_date_field_below_the_customber_debt_details() {
		WebElement closeDateLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("closeDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(closeDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@Given("user_626 verify the Status field below the Customer debt details")
	public void user_626_verify_the_status_field_below_the_customber_debt_details() {
		WebElement DebtStatus = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("DebtStatus"));
	for (int i = 0; i <= 500; i++) {
		try {
			Assert.assertTrue(DebtStatus.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}	
	    
	}

	@Given("user_626 verify the Frequency field below the Customer debt details")
	public void user_626_verify_the_frequency_field_below_the_customber_debt_details() {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("frequencyLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(frequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
	}

	@Given("user_626 verify the Installment Amount field below the Customer debt details")
	public void user_626_verify_the_installment_amount_field_below_the_customber_debt_details() {
		WebElement installmentAmtLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("installmentAmtLabel"));
		for (int i = 0; i <= 11000; i++) {
			try {
				Assert.assertTrue(installmentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@Given("user_626 verify the Last Payment Date field below the Customer debt details")
	public void user_626_verify_the_last_payment_date_field_below_the_customber_debt_details() {
		WebElement lastPaymentDateLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("lastPaymentDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(lastPaymentDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_626 verify the Next Due Date field below the Customer debt details")
	public void user_626_verify_the_next_due_date_field_below_the_customber_debt_details() {
		WebElement nextDueDateLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("nextDueDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(nextDueDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_626 verify the Last Cycle field below the Customer debt details")
	public void user_626_verify_the_last_cycle_field_below_the_customber_debt_details() {
		WebElement last24CycleLabel = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("last24CycleLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(last24CycleLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_626 verify the Include in Eligibility field below the Customer debt details")
	public void user_626_verify_the_include_in_eligibility_field_below_the_customber_debt_details() {
		WebElement includeEligiblity = javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("includeEligiblity"));
	for (int i = 0; i <= 500; i++) {
		try {
			Assert.assertTrue(includeEligiblity.isDisplayed());
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	    
	}
	@Then("user_626 verify Closed Date field below the Customer debt should be display only")
	public void user_626_verify_closed_date_field_below_the_customber_debt_should_be_display_only() {
		String CloseDate_Display= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("CloseDate_Display")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(CloseDate_Display.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	}

	@Then("user_626 verify Status field below the Customer debt should be display only")
	public void user_626_verify_status_field_below_the_customber_debt_should_be_display_only() {
		String StatusDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("StatusDisplay")).getAttribute("ng-reflect-readonly");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(StatusDisplay.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	   
	}
	
	@Then("user_626 verify Frequency field below the Customer debt should be display only")
	public void user_626_verify_frequency_field_below_the_customber_debt_should_be_display_only() {
		String Frequency= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("frequencyDisplay")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(Frequency.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("user_626 verify Last Payment Date field below the Customer debt should be display only")
	public void user_626_verify_last_payment_date_field_below_the_customber_debt_should_be_display_only() {
		String lastPaymentDateDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("lastPaymentDateDisplay")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(lastPaymentDateDisplay.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

	@Then("user_626 verify Next Due Date field below the Customer debt should be display only")
	public void user_626_verify_next_due_date_field_below_the_customber_debt_should_be_display_only() {
		String nextDueDateDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("nextDueDateDisplay")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(nextDueDateDisplay.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
}
	@Then("user_626 verify Last Cycle field below the Customer debt should be display only")
	public void user_626_verify_last_cycle_field_below_the_customber_debt_should_be_display_only() {
		String last24CycleDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("last24CycleDisplay")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(last24CycleDisplay.contains("true"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
	}

	@Then("user_626 verify Include in Eligibility below the Customer debt should be display only")
	public void user_626_verify_include_in_eligibility_below_the_customber_debt_should_be_display_only() {
		String includeEligiblityDisplay= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("includeEligiblityDisplay")).getAttribute("ng-reflect-disabled");
	for (int i = 0; i <2000; i++) {
        try {
            Assert.assertTrue(includeEligiblityDisplay.contains("true"));
            break;
        } catch (Exception e) {
            if (i==1999) {
                Assert.fail(e.getMessage());
            }
        }
    }
	    
	}

	@Then("user_626 verify Installment Amount field below the Customer debt should be Same As AppDataCheck Stage")
	public void user_626_verify_installment_amount_field_below_the_customer_debt_should_be_same_as_app_data_check_stage() {
		String installmentAmtValidation= javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("installmentAmtValidation")).getAttribute("ng-reflect-model");
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(installmentAmtValidation.contains("4000"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }
		    
	}
	@And("user_626 click the Back button in Customer Debt screen navigate to the previous screen")
	public void user_626_click_the_back_button_in_customer_debt_screen_navigate_to_the_previous_screen() throws Throwable {
		WebElement pageTop = javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-layout=\"COMPACT\"]')");
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("customerDebtBackBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Given("user_626 click On the Action button below Customer Financials")
	public void user_626_click_on_the_action_button_below_customer_financials() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("Action_Button_CFT")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("user_626 click On the Action button below Financial Commitments")
	public void user_626_click_on_the_action_button_below_financial_commitments() {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Financial Commitments").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");
//							javascriptHelper
//							.executeScriptWithWebElement(
//									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")
//									.click();
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}
	@And("User search the Ref id under inbox for Tawarraq_App data check_Customer Debt")
	public void user_search_the_ref_id_under_inbox_for_tawarraq_app_data_check_customer_debt() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("inboxSearchInput")));
		System.out.println(testData.get("Ref No"));
		System.out.println(Ijarah_CustomerDebt.getElement("inboxSearchInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}

}




