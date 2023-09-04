package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IJARAH_Steps {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
//  TestData path
//	@AT_CUD_001
	@And("^User get the test data for test case AT_CUD_001$")
    public void get_the_test_data_for_test_case_AT_CUD_001() throws Throwable {
		testData = customerDebtExcelData.getTestdata("DS_AT_CUD_001");
    }	
	
//	@AT_CUD_002
	@And("^User get the test data for test case AT_CUD_002$")
    public void get_the_test_data_for_test_case_AT_CUD_002() throws Throwable {
		testData = customerDebtExcelData.getTestdata("DS_AT_CUD_002");
    }
	
//	@AT_CUD_003
	@And("^User get the test data for test case AT_CUD_003$")
    public void get_the_test_data_for_test_case_AT_CUD_003() throws Throwable {
		testData = customerDebtExcelData.getTestdata("DS_AT_CUD_003");
    }
	
//	@AT_CUD_005
	@And("^User get the test data for test case AT_CUD_005$")
    public void get_the_test_data_for_test_case_AT_CUD_005() throws Throwable {
		testData = customerDebtExcelData.getTestdata("DS_AT_CUD_005");
    }
	
	
//	Underwriter feature
//	@AT_UNW_001
	@And("^User get the test data for test case AT_UNW_001$")
    public void get_the_test_data_for_test_case_AT_UNW_001() throws Throwable {
		testData = underWriterExcelData.getTestdata("DS_AT_UNW_001");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@And("User click the module name dropdown in ULS application")
	public void user_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("moduleNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User select the module name as LOS in ULS application")
	public void user_select_the_module_name_as_los_in_uls_application() throws Throwable {
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
//                    if (moduleName.equalsIgnoreCase("LOS")) {
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
	
	@And("User click the Mail box in ULS application")
	public void user_click_the_mail_box_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the Search button under inbox")
	public void user_click_the_search_button_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mailInboxSearchBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User enter the Ref id under inbox searchbox")
	public void user_enter_the_ref_id_under_inbox_searchbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	    
	}

	@And("User click the Entitle button under inbox")
	public void user_click_the_entitle_button_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxEntitleBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User click the Customer Financials tab")
	public void user_click_the_customer_financials_tab() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsTab")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsTab")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the pencil icon under Customer Financials tab")
	public void user_click_the_pencil_icon_under_customer_financials_tab() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsPencilEditBtn")));
		for (int i = 0; i <= 2000; i++) {
			try {
				if(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsPencilEditBtn")).isDisplayed()) {
					javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerFinancialsPencilEditBtn")).click();
				}
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	@And("User click Add button in Financial Commitments under Customer Financials tab")
	public void user_click_add_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
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

	@And("User validate the Customer Debt screen is available in Financial Commitments")
	public void user_validate_the_customer_debt_screen_is_available_in_financial_commitments() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtDetailsScreen")));
		WebElement customerDebtDetailsScreen = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtDetailsScreen"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(customerDebtDetailsScreen.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	@And("User validate the Save button available in Customer Debt screen")
	public void user_validate_the_save_button_available_in_customer_debt_screen() throws Throwable {
		WebElement customerDebtSaveBtn = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtSaveBtn"));
//		waitHelper.waitForElementwithFluentwait(driver, customerDebtSaveBtn);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(customerDebtSaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User validate the Back button available in Customer Debt screen")
	public void user_validate_the_back_button_available_in_customer_debt_screen() throws Throwable {
		WebElement customerDebtBackBtn = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtBackBtn"));
		waitHelper.waitForElementwithFluentwait(driver, customerDebtBackBtn);
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(customerDebtBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}		    
	}
	
	@And("User click the Back button in Customer Debt screen navigate to the previous screen")
	public void user_click_the_back_button_in_customer_debt_screen_navigate_to_the_previous_screen() throws Throwable {
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
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtBackBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the Finance type field available in Customer Debt screen")
	public void user_validate_the_finance_type_field_available_in_customer_debt_screen() throws Throwable {
		WebElement financeTypeField = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField"));
		waitHelper.waitForElementwithFluentwait(driver, financeTypeField);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(financeTypeField.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
		
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeField")).getText();
//        System.err.println(financeTypeText);
		for (int i = 0; i <2000; i++) {
            try {
                Assert.assertTrue(financeTypeText.contains("*"));
                break;
            } catch (Exception e) {
                if (i==1999) {
                    Assert.fail(e.getMessage());
                }
            }
        }

	}

	@And("User select the Finanacy type in Customer Debt screen")
	public void user_select_the_finanacy_type_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financeTypeDropdown")).click();
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
			System.out.println("Map " + testData.get("Finance Type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Finance Type")).trim())) {
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
	    
	
	@And("User validate the Financial Institution field is available in Customer Debt screen")
	public void user_validate_the_financial_institution_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement financialInstitutionlabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(financialInstitutionlabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialInstitutionlabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          }
      }
	}

	@And("User validate the Account Number field is available in Customer Debt screen")
	public void user_validate_the_account_number_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement accountNumberLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel"));
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
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("accountNumberLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          }
      }
	    
	}

	@And("User validate the Sanction Date field is available in Customer Debt screen")
	public void user_validate_the_sanction_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement sanctionDataLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(sanctionDataLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionDataLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          }
		}
	}

	@And("User validate the Sanction Amount field is available in Customer Debt screen")
	public void user_validate_the_sanction_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement sanctionAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(sanctionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(financeTypeText.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Interest Rate % field is available in Customer Debt screen")
	public void user_validate_the_interest_rate_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement interestRateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(interestRateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("interestRateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Current Principal balance field is available in Customer Debt screen")
	public void user_validate_the_current_principal_balance_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement currentPrincipalBalanceLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(currentPrincipalBalanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currentPrincipalBalanceLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Tenure field is available in Customer Debt screen")
	public void user_validate_the_tenure_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement tenureMonthLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(tenureMonthLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(financeTypeText.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Maturity Date field is available in Customer Debt screen")
	public void user_validate_the_maturity_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement maturityDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(maturityDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("maturityDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Installment Amount field is available in Customer Debt screen")
	public void user_validate_the_installment_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement installmentAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel"));
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
//		Validate Mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(financeTypeText.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Amount considered field is available in Customer Debt screen")
	public void user_validate_the_amount_considered_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(amountConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("amountConsideredLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Currency field is available in Customer Debt screen")
	public void user_validate_the_currency_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement currencyLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("currencyLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Remarks field is available in Customer Debt screen")
	public void user_validate_the_remarks_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement remarksLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(remarksLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Next Due Date field is available in Customer Debt screen")
	public void user_validate_the_next_due_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement nextDueDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel"));
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
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("nextDueDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}		
	}

	@And("User validate the Collateral Type is available in Customer Debt screen")
	public void user_validate_the_collateral_type_is_available_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement collateralTypeLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(collateralTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("collateralTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Close Date field is available in Customer Debt screen")
	public void user_validate_the_close_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement closeDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel"));
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
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("closeDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Frequency field is available in Customer Debt screen")
	public void user_validate_the_frequency_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel"));
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
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("frequencyLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Last payment amount field is available in Customer Debt screen")
	public void user_validate_the_last_payment_amount_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement lastPaymentAmtLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(lastPaymentAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentAmtLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Last payment date field is available in Customer Debt screen")
	public void user_validate_the_last_payment_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement lastPaymentDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel"));
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
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("lastPaymentDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Product Name field is available in Customer Debt screen")
	public void user_validate_the_product_name_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement productNameLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(productNameLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("productNameLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Last24 cycle field is available in Customer Debt screen")
	public void user_validate_the_last24_cycle_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement last24CycleLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel"));
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
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("last24CycleLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Balance Transfer flag field is available in Customer Debt screen")
	public void user_validate_the_balance_transfer_flag_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement balanceTransferFlagLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(balanceTransferFlagLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("balanceTransferFlagLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Facility Status field is available in Customer Debt screen")
	public void user_validate_the_facility_status_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement facilityStatusLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facilityStatusLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("facilityStatusLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Remaining Tenure field is available in Customer Debt screen")
	public void user_validate_the_remaining_tenure_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement remainingTenureLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(remainingTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		Validate Mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(financeTypeText.contains("*"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Disbursement Date field is available in Customer Debt screen")
	public void user_validate_the_disbursement_date_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement disbursementDateLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(disbursementDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("disbursementDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the Request for Balance Takeover field is available in Customer Debt screen")
	public void user_validate_the_request_for_balance_takeover_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement reqForBalanceTakeoverLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(reqForBalanceTakeoverLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	  
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("reqForBalanceTakeoverLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User validate the NPA Classification field is available in Customer Debt screen")
	public void user_validate_the_npa_classification_field_is_available_in_customer_debt_screen() throws Throwable {
		WebElement NPAClassificationLabel = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(NPAClassificationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Validate Non_mandatory
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("NPAClassificationLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(!(financeTypeText.contains("*")));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	@And("User enter the Sanction Amount in Customer Debt screen")
	public void user_enter_the_sanction_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
				.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User enter the Tenure in Customer Debt screen")
	public void user_enter_the_tenure_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("tenureMonthInput"))
				.sendKeys(testData.get("Tenure(Months)"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User enter the Installment Amount in Customer Debt screen")
	public void user_enter_the_installment_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Installment Amt"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User enter the Remaining Tenure in Customer Debt screen")
	public void user_enter_the_remaining_tenure_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB);;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	@When("User click the Save button in Customer Debt screen")
	public void user_click_the_save_button_in_customer_debt_screen() throws Throwable {
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
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtSaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@Then("User validate the confirm message in Customer Debt screen")
	public void user_validate_the_confirm_message_in_customer_debt_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("successMsg")));
		String financeTypeText = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("successMsg")).getText();
		for (int i = 0; i <2000; i++) {
          try {
              Assert.assertTrue(financeTypeText.contains("Success!"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}	    
	}
	
	
	@And("User validate the mandatory field blank message in Customer Debt screen")
	public void user_validate_the_mandatory_field_blank_message_in_customer_debt_screen() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")));
		String madatoryErrorMsg = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : "+madatoryErrorMsg);
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
	}

	@And("User enter the Text value in numeric field and validate the error message in Customer Debt screen")
	public void user_enter_the_text_value_in_numeric_field_and_validate_the_error_message_in_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureLabel")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("remainingTenureInput"))
				.sendKeys(testData.get("Remaining Tenure"),Keys.TAB);;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// Validate the numeric error
		String numericError = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("textInNumericFieldError")).getText();
		System.err.println("Numeric Error: "+numericError);
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(numericError.contains("Positive Integer Allowed"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}	    
	}

	@And("User validate the message for invalid data in Customer Debt screen")
	public void user_validate_the_message_for_invalid_data_in_customer_debt_screen() throws Throwable {
		String madatoryErrorMsg = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("mandatoryFillToastMsg")).getText();
		System.err.println("Mandatory Error : "+madatoryErrorMsg);
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}	    
	}
	

	@And("User click the pencil button under Financial Commitments in Customer Financials tab")
	public void user_click_the_pencil_button_under_financial_commitments_in_customer_financials_tab() throws Throwable {
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentsRefreshBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
									.click();
// document.querySelectorAll('button[icon="pi pi-plus"]')[3].parentElement.parentElement.parentElement.nextElementSibling.querySelector("table tbody tr td button")
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
	
	
//	AT_CUD_003
	@And("User modify the Sanction amount in Customer Debt screen")
	public void user_modify_the_sanction_amount_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("sanctionAmtInput"))
				.sendKeys(testData.get("Sanction Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User enter the invalid data and verify in Installment field under Customer Debt screen")
	public void user_enter_the_invalid_data_and_verify_in_installment_field_under_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput"))
				.sendKeys(testData.get("Invalid Data"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("toastMsgCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// Validate the numeric error
		String numericError = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("textInNumericFieldError")).getText();
		System.err.println("Numeric Error: " + numericError);
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(numericError.contains("Positive Integer Allowed"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User clear the mandatory field value in Customer Debt screen")
	public void user_clear_the_mandatory_field_value_in_customer_debt_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).click();
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("installmentAmtInput")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));	    
	}

	@And("User Update the record with mandatory field blank in Customer Debt screen")
	public void user_update_the_record_with_mandatory_field_blank_in_customer_debt_screen() throws Throwable {
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
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtUpdateBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@When("User click the Update button in Customer Debt screen")
	public void user_click_the_update_button_in_customer_debt_screen() throws Throwable {
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
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtUpdateBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	**************************************** Underwriter Feature ******************************************
	@And("User verify the Offer Decision tab is displayed in Underwriter")
	public void user_verify_the_offer_decision_tab_is_displayed_in_underwriter() throws Throwable {
//		javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement(""))
	    
	}

	@And("User verify the Application Details tab is displayed in Underwriter")
	public void user_verify_the_application_details_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Customer details tab is displayed in Underwriter")
	public void user_verify_the_customer_details_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Additional Customer info tab is displayed in Underwriter")
	public void user_verify_the_additional_customer_info_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Customer Financials tab is displayed in Underwriter")
	public void user_verify_the_customer_financials_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Living Expenses tab is displayed in Underwriter")
	public void user_verify_the_living_expenses_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Facility Info tab is displayed in Underwriter")
	public void user_verify_the_facility_info_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Asset Details tab is displayed in Underwriter")
	public void user_verify_the_asset_details_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Quotation Info tab is displayed in Underwriter")
	public void user_verify_the_quotation_info_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Insurance Info tab is displayed in Underwriter")
	public void user_verify_the_insurance_info_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Policy Check tab is displayed in Underwriter")
	public void user_verify_the_policy_check_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}

	@And("User verify the Document Details tab is displayed in Underwriter")
	public void user_verify_the_document_details_tab_is_displayed_in_underwriter() throws Throwable {
	    
	    
	}
	
	
	
	
	
	
}
