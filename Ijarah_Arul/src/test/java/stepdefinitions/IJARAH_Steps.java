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
	ExcelData offerdetailsExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	
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
//	@AT_UNW_001_01
	@And("^User get the test data for test case AT_UNW_001_01$")
    public void get_the_test_data_for_test_case_AT_UNW_001_01() throws Throwable {
		testData = underWriterExcelData.getTestdata("DS_AT_UNW_001_01");
    }
	
//	@AT_UNW_001_02
	@And("^User get the test data for test case AT_UNW_001_02$")
    public void get_the_test_data_for_test_case_AT_UNW_001_02() throws Throwable {
		testData = underWriterExcelData.getTestdata("DS_AT_UNW_001_02");
    }
	
//	@AT_UNW_002
	@And("^User get the test data for test case AT_UNW_002$")
    public void get_the_test_data_for_test_case_AT_UNW_002() throws Throwable {
		testData = underWriterExcelData.getTestdata("DS_AT_UNW_002");
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

	@And("User search the Ref id under inbox")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
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
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxEntitleBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
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
		WebElement offerDecisionTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionTab"));
		for (int i = 0; i <= 5000; i++) {
			try {
				Assert.assertTrue(offerDecisionTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Application Details tab is displayed in Underwriter")
	public void user_verify_the_application_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement applicationDetailsTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("applicationDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(applicationDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Customer details tab is displayed in Underwriter")
	public void user_verify_the_customer_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement customerDetailsTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("customerDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(customerDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Additional Customer info tab is displayed in Underwriter")
	public void user_verify_the_additional_customer_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement additionalCustomerInfoTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("additionalCustomerInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(additionalCustomerInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Customer Financials tab is displayed in Underwriter")
	public void user_verify_the_customer_financials_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement customerFinancialsTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("customerFinancialsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(customerFinancialsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Living Expenses tab is displayed in Underwriter")
	public void user_verify_the_living_expenses_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement livingExpensesTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("livingExpensesTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(livingExpensesTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Facility Info tab is displayed in Underwriter")
	public void user_verify_the_facility_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement facilityInfoTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facilityInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(facilityInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Asset Details tab is displayed in Underwriter")
	public void user_verify_the_asset_details_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement assetDetailsTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("assetDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(assetDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Quotation Info tab is displayed in Underwriter")
	public void user_verify_the_quotation_info_tab_is_displayed_in_underwriter() throws Throwable {
		WebElement quotationInfoTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("quotationInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(quotationInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@And("User verify the Insurance Info tab is displayed in Underwriter")
	public void user_verify_the_insurance_info_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement InsuranceInfoTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("InsuranceInfoTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(InsuranceInfoTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Policy Check tab is displayed in Underwriter")
	public void user_verify_the_policy_check_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement policyCheckTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("policyCheckTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(policyCheckTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Document Details tab is displayed in Underwriter")
	public void user_verify_the_document_details_tab_is_displayed_in_underwriter() throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 4) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement documentDetailsTab = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("documentDetailsTab"));
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(documentDetailsTab.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User click the Pencil icon under Offer Decision tab")
	public void user_click_the_pencil_icon_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offerDecisionPencilEditBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Decision section is displayed under Offer Decision tab")
	public void user_verify_decision_section_is_displayed_under_offer_decision_tab() throws Throwable {
		WebElement offer_Decision = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_Decision"));
		System.out.println("Field Name: "+offer_Decision.getText());
		waitHelper.waitForElementwithFluentwait(driver, offer_Decision);
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_Decision.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Facility Details section is displayed under Offer Decision tab")
	public void user_verify_facility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_FacilityDetails = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails"));
		System.out.println("Field Name: "+offer_FacilityDetails.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_FacilityDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Eligibility Details section is displayed under Offer Decision tab")
	public void user_verify_eligibility_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_EligibilityDetails")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_EligibilityDetails = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_EligibilityDetails"));
		System.out.println("Field Name: "+offer_EligibilityDetails.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_EligibilityDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Finance Configuration section is displayed under Offer Decision tab")
	public void user_verify_finance_configuration_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_FinanceConfiguration = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration"));
		System.out.println("Field Name: "+offer_FinanceConfiguration.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(offer_FinanceConfiguration.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Pricing Details section is displayed under Offer Decision tab")
	public void user_verify_pricing_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_PricingDetails")));				
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_PricingDetails = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_PricingDetails"));
		System.out.println("Field Name: "+offer_PricingDetails.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_PricingDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Instlment Details section is displayed under Offer Decision tab")
	public void user_verify_instlment_details_section_is_displayed_under_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_InstalmentDetails")));				
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement offer_InstalmentDetails = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_InstalmentDetails"));
		System.out.println("Field Name: "+offer_InstalmentDetails.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_InstalmentDetails.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Approval Details Hyperlinks section is displayed under Offer Decision tab")
	public void user_verify_approval_details_hyperlinks_section_is_displayed_under_offer_decision_tab() throws Throwable {
		WebElement offer_ApprovalDetailsHyperlinks = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_ApprovalDetailsHyperlinks"));
		System.out.println("Field Name: "+offer_ApprovalDetailsHyperlinks.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_ApprovalDetailsHyperlinks.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

//	Unw_03
	@And("User verify Approval level field under Decision section in Offer Decision tab")
	public void user_verify_approval_level_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_Decision")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement decision_ApprovalLevel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_ApprovalLevel"));	
		waitHelper.waitForElementwithFluentwait(driver, decision_ApprovalLevel);
		System.out.println("Field Name: "+decision_ApprovalLevel.getText());
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(decision_ApprovalLevel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Underwriter field under Decision section in Offer Decision tab")
	public void user_verify_underwriter_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Underwriter = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_Underwriter"));
		System.out.println("Field Name: "+decision_Underwriter.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_Underwriter.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Reviewer field under Decision section in Offer Decision tab")
	public void user_verify_reviewer_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_Reviewer = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_Reviewer"));
		System.out.println("Field Name: "+decision_Reviewer.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_Reviewer.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Decision Date field under Decision section in Offer Decision tab")
	public void user_verify_decision_date_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDate = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_DecisionDate"));
		System.out.println("Field Name: "+decision_DecisionDate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_DecisionDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Decison field under Decision section in Offer Decision tab")
	public void user_verify_decison_field_under_decision_section_in_offer_decision_tab() throws Throwable {
		WebElement decision_DecisionDropdown = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_DecisionField"));
		System.out.println("Field Name: "+decision_DecisionDropdown.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(decision_DecisionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
//	Unw_04
	@And("User verify the Offer amount under Finance Configuration section in Offer Decision tab")
	public void user_verify_the_offer_amount_under_finance_configuration_section_in_offer_decision_tab() throws Throwable {		
		String approveValue = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("decision_ApprovalLevelValue")).getText();
		System.out.println("Appove Level: "+approveValue);	
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String offerAmt = javascriptHelper.executeScriptWithWebElement("document.querySelector('[ng-reflect-text=\"Offered Amount\"]').nextElementSibling").getAttribute("ng-reflect-model");
		System.out.println("Offer Amount: "+offerAmt);
		int targetValue = 1000000;
		if(Integer.parseInt(offerAmt)<targetValue) {
			Assert.assertEquals("LEVEL1", approveValue);	
		}else {
			System.out.println("Offer amount Greater than targer value");
		}
	}

//	Unw_06
	@And("User select the Decision dropdown as Accept\\Reject under Decision section in Offer Decision tab")
	public void user_select_the_decision_dropdown_as_accept_reject_under_decision_section_in_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement("document.querySelector('[aria-label*=\"Accept\"]')").click();
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("decision_DecisionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-item').length";
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
			System.out.println("Map " + testData.get("Decision Dropdown").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Decision Dropdown")).trim())) {
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
	
	
//	UNW_07
	@And("User verify the Product field is displayed under Facility Details section")
	public void user_verify_the_product_field_is_displayed_under_facility_details_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FacilityDetails")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement facility_ProductLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ProductLabel"));
		System.out.println("Field Name: "+facility_ProductLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_ProductInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Sub-Product field is displayed under Facility Details section")
	public void user_verify_the_sub_product_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SubProductLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SubProductLabel"));
		System.out.println("Field Name: "+facility_SubProductLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SubProductLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_SubProductInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SubProductInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SubProductInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Scheme field is displayed under Facility Details section")
	public void user_verify_the_scheme_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_SchemeLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SchemeLabel"));
		System.out.println("Field Name: "+facility_SchemeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SchemeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_SchemeInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_SchemeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_SchemeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Pricing Indicator field is displayed under Facility Details section")
	public void user_verify_the_pricing_indicator_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_PricingIndicatorLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PricingIndicatorLabel"));
		System.out.println("Field Name: "+facility_PricingIndicatorLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PricingIndicatorLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_PricingIndicatorInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PricingIndicatorInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PricingIndicatorInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User verify the Repayment Type field is displayed under Facility Details section")
	public void user_verify_the_repayment_type_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_RepaymentTypeLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_RepaymentTypeLabel"));
		System.out.println("Field Name: "+facility_RepaymentTypeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_RepaymentTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_RepaymentTypeInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_RepaymentTypeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_RepaymentTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Compute Instalment On field is displayed under Facility Details section")
	public void user_verify_the_compute_instalment_on_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ComputeInstalmentLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ComputeInstalmentLabel"));
		System.out.println("Field Name: "+facility_ComputeInstalmentLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ComputeInstalmentLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_ComputeInstalmentInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ComputeInstalmentInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ComputeInstalmentInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Principal Frequency field is displayed under Facility Details section")
	public void user_verify_the_principal_frequency_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_PrincipalFrequencyLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PrincipalFrequencyLabel"));
		System.out.println("Field Name: "+facility_PrincipalFrequencyLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PrincipalFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_PrincipalFrequencyInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_PrincipalFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_PrincipalFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Interest Frequency field is displayed under Facility Details section")
	public void user_verify_the_interest_frequency_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_InterestFrequencyLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_InterestFrequencyLabel"));
		System.out.println("Field Name: "+facility_InterestFrequencyLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_InterestFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_InterestFrequencyInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_InterestFrequencyInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_InterestFrequencyInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Eligible Income field is displayed under Facility Details section")
	public void user_verify_the_eligible_income_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_EligibleIncomeLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_EligibleIncomeLabel"));
		System.out.println("Field Name: "+facility_EligibleIncomeLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_EligibleIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_EligibleIncomeInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_EligibleIncomeInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_EligibleIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Average Account Balance field is displayed under Facility Details section")
	public void user_verify_the_average_account_balance_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_AverageAccBalanceLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_AverageAccBalanceLabel"));
		System.out.println("Field Name: "+facility_AverageAccBalanceLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_AverageAccBalanceLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_AverageAccBalanceInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_AverageAccBalanceInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_AverageAccBalanceInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Applicable LTV1 field is displayed under Facility Details section")
	public void user_verify_the_applicable_ltv1_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ApplicableLTV1Label = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV1Label"));
		System.out.println("Field Name: "+facility_ApplicableLTV1Label.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV1Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_ApplicableLTV1Input = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV1Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV1Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Applicable LTV2 field is displayed under Facility Details section")
	public void user_verify_the_applicable_ltv2_field_is_displayed_under_facility_details_section() throws Throwable {
		WebElement facility_ApplicableLTV2Label = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV2Label"));
		System.out.println("Field Name: "+facility_ApplicableLTV2Label.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV2Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement facility_ApplicableLTV2Input = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("facility_ApplicableLTV2Input"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(facility_ApplicableLTV2Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	UNW_08
	@And("User verify Requested Amount field is displayed under Finance configuration section")
	public void user_verify_requested_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_FinanceConfiguration")));				
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Finance_RequestAmountLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestAmountLabel"));
		System.out.println("Field Name: "+Finance_RequestAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement Finance_RequestAmountInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Requested Tenure field is displayed under Finance configuration section")
	public void user_verify_requested_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_RequestTenureLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestTenureLabel"));
		System.out.println("Field Name: "+Finance_RequestTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement Finance_RequestTenureInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_RequestTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_RequestTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Offered Amount field is displayed under Finance configuration section")
	public void user_verify_offered_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_OfferedAmountLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedAmountLabel"));
		System.out.println("Field Name: "+Finance_OfferedAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement Finance_OfferedAmountInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Offered Tenure field is displayed under Finance configuration section")
	public void user_verify_offered_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_OfferedTenureLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedTenureLabel"));
		System.out.println("Field Name: "+Finance_OfferedTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement Finance_OfferedTenureInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_OfferedTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_OfferedTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Deviation Amount field is displayed under Finance configuration section")
	public void user_verify_deviation_amount_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_DeviationAmountLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountLabel"));
		System.out.println("Field Name: "+Finance_DeviationAmountLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationAmountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement Finance_DeviationAmountInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationAmountInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationAmountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Deviation Tenure field is displayed under Finance configuration section")
	public void user_verify_deviation_tenure_field_is_displayed_under_finance_configuration_section() throws Throwable {
		WebElement Finance_DeviationTenureLabel = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureLabel"));
		System.out.println("Field Name: "+Finance_DeviationTenureLabel.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationTenureLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement Finance_DeviationTenureInput = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Finance_DeviationTenureInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Finance_DeviationTenureInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	UNW_09
	@And("User verify Period field is displayed under Pricing Details section")
	public void user_verify_period_field_is_displayed_under_pricing_details_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_PricingDetails")));				
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Pricing_Period = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_Period"));
		System.out.println("Field Name: "+Pricing_Period.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_Period.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Interest Def field is displayed under Pricing Details section")
	public void user_verify_interest_def_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_InterestDef = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_InterestDef"));
		System.out.println("Field Name: "+Pricing_InterestDef.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_InterestDef.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Rate Type field is displayed under Pricing Details section")
	public void user_verify_rate_type_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_RateType = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_RateType"));
		System.out.println("Field Name: "+Pricing_RateType.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_RateType.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Index Rate field is displayed under Pricing Details section")
	public void user_verify_index_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_IndexRate = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_IndexRate"));
		System.out.println("Field Name: "+Pricing_IndexRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_IndexRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Offer Rate field is displayed under Pricing Details section")
	public void user_verify_offer_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_OfferRate = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_OfferRate"));
		System.out.println("Field Name: "+Pricing_OfferRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_OfferRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify Effective Rate field is displayed under Pricing Details section")
	public void user_verify_effective_rate_field_is_displayed_under_pricing_details_section() throws Throwable {
		WebElement Pricing_EffectiveRate = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Pricing_EffectiveRate"));
		System.out.println("Field Name: "+Pricing_EffectiveRate.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Pricing_EffectiveRate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	UNW_10
	@And("User verify the Instalment Period field is displayed under Installment Details section")
	public void user_verify_the_instalment_period_field_is_displayed_under_installment_details_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_InstalmentDetails")));				
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement Instalment_InstalPeriod = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Instalment_InstalPeriod"));
		System.out.println("Field Name: "+Instalment_InstalPeriod.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Instalment_InstalPeriod.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Instalment Amount field is displayed under Installment Details section")
	public void user_verify_the_instalment_amount_field_is_displayed_under_installment_details_section() throws Throwable {
		WebElement Instalment_InstalAmount = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("Instalment_InstalAmount"));
		System.out.println("Field Name: "+Instalment_InstalAmount.getText());
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(Instalment_InstalAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	UNW_14
	@And("User verify the Deviate button under Offer Decision screen")
	public void user_verify_the_deviate_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_DeviateBtn = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_DeviateBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_DeviateBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Recompute button under Offer Decision screen")
	public void user_verify_the_recompute_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_RecomputeBtn = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_RecomputeBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_RecomputeBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Save button under Offer Decision screen")
	public void user_verify_the_save_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_SaveBtn = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SaveBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_SaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Offer button under Offer Decision screen")
	public void user_verify_the_offer_button_under_offer_decision_screen() throws Throwable {
		WebElement offer_OfferBtn = javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_OfferBtn"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(offer_OfferBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	Unw_15
	@And("User clicks on the Save button under the Offer Decision tab")
	public void user_clicks_on_the_save_button_under_the_offer_decision_tab() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(underWriterJsPaths.getElement("offer_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User click the Offer button after selecting the Decision under Offer Decision tab")
	public void user_click_the_offer_button_after_selecting_the_decision_under_offer_decision_tab() throws Throwable {
	    
	    
	}

	@And("User verify the validation messgage after clicking Offer button under Offer Decision tab")
	public void user_verify_the_validation_messgage_after_clicking_offer_button_under_offer_decision_tab() throws Throwable {
	    
	    
	}

	@And("User click the Offer button without selecting the Decision under Offer Decision tab")
	public void user_click_the_offer_button_without_selecting_the_decision_under_offer_decision_tab() throws Throwable {
	    
	    
	}
	
	
//	AT_CUD_004
	@And("User click Search button in Financial Commitments under Customer Financials tab")
	public void user_click_search_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]")
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

	@And("User search the record in Financial Commitments under Customer Financials tab")
	public void user_search_the_record_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys("usd");
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys(testData.get("Currency Value"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the available record status in Financial Commitments under Customer Financials tab")
	public void user_validate_the_available_record_status_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
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
//							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('p-paginator[ng-reflect-style-class=\"p-paginator-bottom\"]')[" + j + "].querySelector('button[ng-reflect-text=\"Refresh\"]")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
//document.querySelectorAll('p-paginator[ng-reflect-style-class="p-paginator-bottom"]')[4].querySelector('button[ng-reflect-text="Refresh"]')				
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
	
	//
	@And("User click the Export button in Financial Commitments under Customer Financials tab")
	public void user_click_the_export_button_in_financial_commitments_under_customer_financials_tab() throws Throwable {
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
		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
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
//							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('p-dropdown[ng-reflect-placeholder=\"Export\"]')[" + j + "]")
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
	
	
	
	
	
	
}
