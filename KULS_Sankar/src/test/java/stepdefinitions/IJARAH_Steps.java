package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
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
	JSPaths additionalCustInfoJsPaths = new JSPaths(excelPath, "AdditionalCustInfo_Elements", "AdditionalCustInfo_FieldName", "JSPath");
	JSPaths dataCheck_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName", "JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "DataCheckAppDetails_Elements", "DataCheckAppDetails_FieldName", "JSPath");
	
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions actions = new Actions(driver);
	SoftAssert softAssert = new SoftAssert();
	
	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	ExcelData additinalCustomerInfoExcelData  = new ExcelData(excelTestDataPath,"AdditionalCustomerInfo","DataSet ID");
	ExcelData dataCheck_IncomeExcelData  = new ExcelData(excelTestDataPath,"DataCheck_Income","DataSet ID");
	ExcelData dataCheck_ApplicationDetailsExcelData  = new ExcelData(excelTestDataPath,"DataCheck_AppDetails","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	String incomeSection="";
	
	
	
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
	
//	@AT_CUD_004
	@And("^User get the test data for test case AT_CUD_004$")
    public void get_the_test_data_for_test_case_AT_CUD_004() throws Throwable {
		testData = customerDebtExcelData.getTestdata("DS_AT_CUD_004");
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
	
	
//	Additional Customer Info	
	@And("^User get the test data for test case AT_IDA_03$")
    public void get_the_test_data_for_test_case_AT_IDA_03() throws Throwable {
		testData = additinalCustomerInfoExcelData.getTestdata("DS_AT_IDA_03");
    }
	
	
//	App Data Check -- Income
	@And("^User get the test data for test case AT_INCD_01$")
    public void get_the_test_data_for_test_case_AT_INCD_01() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_01");
    }
	
	@And("^User get the test data for test case AT_INCD_02$")
    public void get_the_test_data_for_test_case_AT_INCD_02() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_02");
    }
	
	@And("^User get the test data for test case AT_INCD_03$")
    public void get_the_test_data_for_test_case_AT_INCD_03() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_03");
    }
	
	@And("^User get the test data for test case AT_INCD_04$")
    public void get_the_test_data_for_test_case_AT_INCD_04() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_04");
    }
	
	@And("^User get the test data for test case AT_INCD_05$")
    public void get_the_test_data_for_test_case_AT_INCD_05() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_05");
    }
	
	@And("^User get the test data for test case AT_INCD_06$")
    public void get_the_test_data_for_test_case_AT_INCD_06() throws Throwable {
		testData = dataCheck_IncomeExcelData.getTestdata("DS_AT_INCD_06");
    }
	
	
//	App Data Check -- Application Details
	@And("^User get the test data for test case AT_ADC_01$")
    public void get_the_test_data_for_test_case_AT_ADC_01() throws Throwable {
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata("DS_AT_ADC_01");
    }
	
	@And("^User get the test data for test case AT_ADC_02$")
    public void get_the_test_data_for_test_case_AT_ADC_02() throws Throwable {
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata("DS_AT_ADC_02");
    }
	
	@And("^User get the test data for test case AT_ADC_03$")
    public void get_the_test_data_for_test_case_AT_ADC_03() throws Throwable {
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata("DS_AT_ADC_03");
    }
	
	@And("^User get the test data for test case AT_ADC_05$")
    public void get_the_test_data_for_test_case_AT_ADC_05() throws Throwable {
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata("DS_AT_ADC_05");
    }
	
	@And("^User get the test data for test case AT_ADC_06$")
    public void get_the_test_data_for_test_case_AT_ADC_06() throws Throwable {
		testData = dataCheck_ApplicationDetailsExcelData.getTestdata("DS_AT_ADC_06");
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
//							javascriptHelper
//							.executeScriptWithWebElement(
//									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")
//									.click();
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

	@And("User search the matched record in Financial Commitments under Customer Financials tab")
	public void user_search_the_matched_record_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(testData.get("Matched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	@And("User search the mismatched record in Financial Commitments under Customer Financials tab")
	public void user_search_the_mismatched_record_in_financial_commitments_under_customer_financials_tab() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")));
		javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentSearchInput"))
				.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	
	
	// CUD_04_06 & CUD_04_06
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
	
	
	@And("User click the PDF and verify under Export in Financial Commitments")
	public void user_click_the_pdf_and_verify_under_export_in_financial_commitments() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportPDF")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerDebtDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerDebtDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
        }
	}

	@And("User click the XLS and verify under Export in Financial Commitments")
	public void user_click_the_xls_and_verify_under_export_in_financial_commitments() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportXLS")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommitmentExportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerDebtDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerDebtDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
        }
	}
	
	
//	AT_CUD_006
	@And("User click the first row pencil icon under Financial Commitments in Customer Financials tab")
	public void user_click_the_first_row_pencil_icon_under_financial_commitments_in_customer_financials_tab() throws Throwable {
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
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span button[icon=\"pi pi-pencil\"]')[0]")
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
	
	
	@And("User click the Stats Radio button under Customer Debt screen")
	public void user_click_the_stats_radio_button_under_customer_debt_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtStatusRatioBtn")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("customerDebtStatusRatioBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	
	
	@And("User verify the first row status as In-Active under Financial Commitments in Customer Financials tab")
	public void user_verify_the_first_row_status_under_financial_commitments_in_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
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
							WebElement status = javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span[class*=\"p-tag p-component\"]')[0]");
							System.out.println("Record status1:"+status.getText());
							Assert.assertTrue(status.getText().equalsIgnoreCase("In-Active"));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
	}
	
	@And("User verify the first row status as Active under Financial Commitments in Customer Financials tab")
	public void user_verify_the_first_row_status_as_active_under_financial_commitments_in_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
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
							WebElement status = javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td span[class*=\"p-tag p-component\"]')[0]");
							System.out.println("Record status2:"+status.getText());
							Assert.assertTrue(status.getText().equalsIgnoreCase("Active"));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
	}
	
	
	// CUD_04_01
	@And("User verify the Financial Institution field is displayed in list view under Financial Commitments")
	public void user_verify_the_financial_institution_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement financialInstitution = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_FinancialInstitution"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(financialInstitution);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(financialInstitution.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Loan Amount field is displayed in list view under Financial Commitments")
	public void user_verify_the_loan_amount_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement loanAmount = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_LoanAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(loanAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Installment Amount field is displayed in list view under Financial Commitments")
	public void user_verify_the_installment_amount_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement installmentAmount = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_InstallmentAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(installmentAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Tenure field is displayed in list view under Financial Commitments")
	public void user_verify_the_tenure_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement tenure = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_Tenure"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(tenure.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Next Due Date field is displayed in list view under Financial Commitments")
	public void user_verify_the_next_due_date_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement nextDueDate = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_NextDueDate"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(nextDueDate.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Principal Balance field is displayed in list view under Financial Commitments")
	public void user_verify_the_principal_balance_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement principalAmount = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_PrincipalAmount"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(principalAmount.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Currency field is displayed in list view under Financial Commitments")
	public void user_verify_the_currency_field_is_displayed_in_list_view_under_financial_commitments() throws Throwable {
		WebElement currency = javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("financialCommit_Currency"));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(currency.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	
//	CUD_04_02
	@And("User verify list view values should be not editable under FInancial Commitments")
	public void user_verify_list_view_values_should_be_not_editable_under_f_inancial_commitments() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
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
							WebElement nonEdit = javascriptHelper
							.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelectorAll('table tbody tr td p-celleditor')[1]");
							System.out.println("Is Non Editable: "+javascriptHelper.executeScript("return arguments[0].readOnly",nonEdit));
							System.out.println("Field Name: "+nonEdit.getText());
//							Assert.assertTrue(javascriptHelper.executeScript("return arguments[0].readOnly",nonEdit));
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	Additional Customer Info Tab
	@And("User click the Additional Customer Info tab")
	public void user_click_the_additional_customer_info_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("additionalCustomerInfoTab")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User click the Add button in Customer Personal Info section under Additional Customer Info tab")
	public void user_click_the_add_button_in_customer_personal_info_section_under_additional_customer_info_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Customer Personal Information").trim())) {
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

	@And("User click the Add button in Customer Identification under Additional Customer Info tab")
	public void user_click_the_add_button_in_customer_identification_under_additional_customer_info_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("customerIdentificationAddBtn")).click();
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User select the ID Type in Customer Identification screen")
	public void user_select_the_id_type_in_customer_identification_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IDType")).click();
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
			System.out.println("Map " + testData.get("ID Type").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ID Type")).trim())) {
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

	@And("User enter the invalid ID number in Customer Identification screen")
	public void user_enter_the_invalid_id_number_in_customer_identification_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IDNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IDNumber"))
				.sendKeys(testData.get("ID Number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User select the Issuing Authority in Customer Identification screen")
	public void user_select_the_issuing_authority_in_customer_identification_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IssueAuthority")).click();
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
			System.out.println("Map " + testData.get("Issuing Authority").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Issuing Authority")).trim())) {
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

	
	@And("User verify the invalid data validation in Customer Identification screen")
	public void user_verify_the_invalid_data_validation_in_customer_identification_screen() throws Throwable {
		WebElement invalidData = javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("invalidDataError"));
		System.err.println("Mandatory Error : "+invalidData.getText());
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(invalidData.isDisplayed());
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}	    
	}
	
	@And("User enter the special characters in ID number under Customer Identification screen")
	public void user_enter_the_special_characters_in_id_number_under_customer_identification_screen() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IDNumber")).click();
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IDNumber"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("cust_Identification_IDNumber"))
				.sendKeys(testData.get("ID Number_SpecialChar"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User verify the Special character validation in Customer Identification screen")
	public void user_verify_the_special_character_validation_in_customer_identification_screen() throws Throwable {
		String specialChar = javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("specialCharError")).getText().trim();
		System.err.println("Speacial Char : "+specialChar);
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(specialChar.equalsIgnoreCase("Alphanumeric characters allowed"));
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          }
		}  
	}

	@And("User click the save button with mandatory field blank in Customer Identification screen")
	public void user_click_the_save_button_with_mandatory_field_blank_in_customer_identification_screen() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("customerIdentificationSaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Validation error msg in Customer Identification screen")
	public void user_verify_the_validation_error_msg_in_customer_identification_screen() throws Throwable {
		String madatoryErrorMsg = javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("mandatoryFillToastMsg")).getText();
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
		
		WebElement reqFieldError = javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("requiredFieldError"));
		System.err.println("Mandatory Error : "+reqFieldError.getText());
		for (int i = 0; i<2000; i++) {
          try {
              Assert.assertTrue(reqFieldError.isDisplayed());
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}		
	}
	
	
	
//	App Data Check -- Income
	@And("User click the Eye button under Customer Financials tab")
	public void user_click_the_eye_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerFinancialsTabEyeBtn")));				
//				if(javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerFinancialsTabEyeBtn")).isDisplayed()) {
//					javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerFinancialsTabEyeBtn")).click();
//				}
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the Eye button under Income section in Customer Financials Tab")
	public void user_click_the_eye_button_under_income_section_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");
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
	
	
	@And("User validate Save button available under Income details screen")
	public void user_validate_save_button_available_under_income_details_screen() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(incomeSaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Back button available under Income details screen")
	public void user_validate_back_button_available_under_income_details_screen() throws Throwable {
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeBackBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(incomeBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Employment Type field available under Income details screen")
	public void user_validate_employment_type_field_available_under_income_details_screen() throws Throwable {
		WebElement employementTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("employementTypeLabel"));
		System.out.println("Field Name: "+employementTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(employementTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement employementTypeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("employementTypeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(employementTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Lumpsum Amount field available under Income details screen")
	public void user_validate_lumpsum_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement lumpsumAmtLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("lumpsumAmtLabel"));
		System.out.println("Field Name: "+lumpsumAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(lumpsumAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement lumpsumAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("lumpsumAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(lumpsumAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Financial Year field available under Income details screen")
	public void user_validate_financial_year_field_available_under_income_details_screen() throws Throwable {
		WebElement financialYearLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("financialYearLabel"));
//		System.out.println("Field Name: "+financialYearLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(financialYearLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement financialYearInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("financialYearInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(financialYearInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Filing Date field available under Income details screen")
	public void user_validate_filing_date_field_available_under_income_details_screen() throws Throwable {
		WebElement filingDateLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("filingDateLabel"));
		System.out.println("Field Name: "+filingDateLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(filingDateLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement filingDateInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("filingDateInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(filingDateInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Income field available under Income details screen")
	public void user_validate_income_field_available_under_income_details_screen() throws Throwable {
		WebElement incomeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeLabel"));
		System.out.println("Field Name: "+incomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(incomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement incomeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(incomeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Frequency field available under Income details screen")
	public void user_validate_frequency_field_available_under_income_details_screen() throws Throwable {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("frequencyLabel"));
		System.out.println("Field Name: "+frequencyLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(frequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement frequencyDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("frequencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(frequencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Amount field available under Income details screen")
	public void user_validate_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement amountLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountLabel"));
		System.out.println("Field Name: "+amountLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(amountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement amountInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(amountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Defined % field available under Income details screen")
	public void user_validate_defined_field_available_under_income_details_screen() throws Throwable {
		WebElement defined_Label = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("defined%_Label"));
		System.out.println("Field Name: "+defined_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(defined_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement defined_Input = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("defined%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(defined_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Adjusted % field available under Income details screen")
	public void user_validate_adjusted_field_available_under_income_details_screen() throws Throwable {
		WebElement adjusted_Label = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("adjusted%_Label"));
		System.out.println("Field Name: "+adjusted_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(adjusted_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement adjusted_Input = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("adjusted%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(adjusted_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Amount Considered field available under Income details screen")
	public void user_validate_amount_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountConsideredLabel"));
		System.out.println("Field Name: "+amountConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(amountConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("amountConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(amountConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Action button available under Income details screen")
	public void user_validate_action_button_available_under_income_details_screen() throws Throwable {
		WebElement actionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("actionLabel"));
		System.out.println("Field Name: "+actionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(actionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement actionAddBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("actionAddBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(actionAddBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Total Income field available under Income details screen")
	public void user_validate_total_income_field_available_under_income_details_screen() throws Throwable {
		WebElement totalIncomeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeLabel"));
		System.out.println("Field Name: "+totalIncomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Total Income considered field available under Income details screen")
	public void user_validate_total_income_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement totalIncomeConsideredLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeConsideredLabel"));
		System.out.println("Field Name: "+totalIncomeConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalIncomeConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalIncomeConsideredInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalIncomeConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalIncomeConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Salary credited to Bank field available under Income details screen")
	public void user_validate_salary_credited_to_bank_field_available_under_income_details_screen() throws Throwable {
		WebElement salaryCreditedToBankLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("salaryCreditedToBankLabel"));
		System.out.println("Field Name: "+salaryCreditedToBankLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(salaryCreditedToBankLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement salaryCreditedToBankDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("salaryCreditedToBankDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(salaryCreditedToBankDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction field available under Income details screen")
	public void user_validate_deduction_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionLabel"));
		System.out.println("Field Name: "+deductionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction Frequency field available under Income details screen")
	public void user_validate_deduction_frequency_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionFrequencyLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionFrequencyLabel"));
		System.out.println("Field Name: "+deductionFrequencyLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionFrequencyDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionFrequencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionFrequencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction Amount field available under Income details screen")
	public void user_validate_deduction_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionAmtLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAmtLabel"));
		System.out.println("Field Name: "+deductionAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction Def % field available under Income details screen")
	public void user_validate_deduction_def_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionDef_Label = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionDef%_Label"));
		System.out.println("Field Name: "+deductionDef_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionDef_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionDef_Input = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionDef%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionDef_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction Adj % field available under Income details screen")
	public void user_validate_deduction_adj_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionAdj_Label = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAdj%_Label"));
		System.out.println("Field Name: "+deductionAdj_Label.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionAdj_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionAdj_Input = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionAdj%_Input"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionAdj_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction Considered field available under Income details screen")
	public void user_validate_deduction_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionConsideredLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionConsideredLabel"));
		System.out.println("Field Name: "+deductionConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionConsideredInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Deduction Action button field available under Income details screen")
	public void user_validate_deduction_action_button_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionActionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionActionLabel"));
		System.out.println("Field Name: "+deductionActionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionActionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionActionAddBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("deductionActionAddBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(deductionActionAddBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Total Deduction field available under Income details screen")
	public void user_validate_total_deduction_field_available_under_income_details_screen() throws Throwable {
		WebElement totalDeductionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionLabel"));
		System.out.println("Field Name: "+totalDeductionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalDeductionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalDeductionInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalDeductionInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Total Deduction Considered field available under Income details screen")
	public void user_validate_total_deduction_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement totalDeductionConsideredLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionConsideredLabel"));
		System.out.println("Field Name: "+totalDeductionConsideredLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalDeductionConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalDeductionConsideredInput = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("totalDeductionConsideredInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalDeductionConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate Currency field available under Income details screen")
	public void user_validate_currency_field_available_under_income_details_screen() throws Throwable {
		WebElement currencyLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("currencyLabel"));
		System.out.println("Field Name: "+currencyLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement currencyDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("currencyDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(currencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User click the Save button under Income details screen")
	public void user_click_the_save_button_under_income_details_screen() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 5000; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User validate the confirmation message under Income details screen")
	public void user_validate_the_confirmation_message_under_income_details_screen() throws Throwable {
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("successToastMsg"));
		for (int i = 0; i <= 5000; i++) {
			try {
				Assert.assertTrue(successToastMsg.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement successToastCloseBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("successToastCloseBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				successToastCloseBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the Back button under Income details screen")
	public void user_click_the_back_button_under_income_details_screen() throws Throwable {
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("incomeBackBtn"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(incomeBackBtn);
				break;
			} catch (Exception e) {
//				if (i == 1000) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}
	

//	AT_INCD_04
	@And("User verify Employment details section available under Customer Financials tab")
	public void user_verify_employment_details_section_available_under_customer_financials_tab() throws Throwable {
		WebElement empDetailsSection = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementListSection"));
		System.out.println("Section Name: "+empDetailsSection.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(empDetailsSection.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the eye button under Employment details section available in Customer Financials tab")
	public void user_click_the_eye_button_under_employment_details_section_available_in_customer_financials_tab() throws Throwable {
		WebElement customerEmployementEyeBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementEyeBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				customerEmployementEyeBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Customer Employement page is available under Customer Financials tab")
	public void user_verify_the_customer_employement_page_is_available_under_customer_financials_tab() throws Throwable {
		WebElement customerEmployementScreenTitle = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementScreenTitle"));
		System.out.println("Screen Name: "+customerEmployementScreenTitle.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(customerEmployementScreenTitle.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the Back button in Customer Employement screen under Customer Financials tab")
	public void user_click_the_back_button_in_customer_employement_screen_under_customer_financials_tab() throws Throwable {
		WebElement customerEmployementScreenBackBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_IncomeJsPaths.getElement("customerEmployementScreenBackBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				customerEmployementScreenBackBtn.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verfiy Income section available under Customer Financials tab")
	public void user_verfiy_income_section_available_under_customer_financials_tab() throws Throwable {
		String listOfAddButtonQuery = "document.querySelectorAll('ion-title[mode=\"md\"]').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
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
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 1000; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[mode=\"md\"]')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);	
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Section Name"+addButtonScreenName);
							Assert.assertTrue(true);
						}
					}
//					Assert.assertTrue((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim()));						
					break;
				} catch (Exception e) {
					if (k == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}			
		}
	}
		
	
//	AT_INCD_05
	@And("User verify Self Employed customer available under Income section in Customer Financials Tab")
	public void user_verify_self_employed_customer_available_under_income_section_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");
							
							String value = "document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.nextElementSibling.nextElementSibling";							
							for (int i = 0; i <= 2000; i++) {
								try {
									System.err.println("Field Name: "+javascriptHelper.executeScriptWithWebElement(value).getText());
									Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(value).isDisplayed());
									break;
								} catch (Exception e) {
									if (i == 2000) {
										Assert.fail(e.getMessage());
									}
								}
							}														
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.nextElementSibling.nextElementSibling")
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
	
	@And("User verify Self Employed income field is available under Income section in Customer Financials Tab")
	public void user_verify_self_employed_income_field_is_available_under_income_section_in_customer_financials_tab() throws Throwable {
//		document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.parentElement.querySelectorAll('td')[3]
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
//							System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");
							
							String income = "document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.parentElement.querySelectorAll('td')[3]";							
							for (int i = 0; i <= 2000; i++) {
								try {
									System.err.println("Field Name: "+javascriptHelper.executeScriptWithWebElement(income).getText());
									Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(income).isDisplayed());
									break;
								} catch (Exception e) {
									if (i == 2000) {
										Assert.fail(e.getMessage());
									}
								}
							}														
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.parentElement.querySelectorAll('td')[3]")
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
	
	@And("User verify the Salaried customer available under Income section in Customer Financials Tab")
	public void user_verify_the_salaried_customer_available_under_income_section_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "]");							
							String value = "document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[2].querySelectorAll('td')[2]";							
							for (int i = 0; i <= 2000; i++) {
								try {
									System.err.println("Field Name: "+javascriptHelper.executeScriptWithWebElement(value).getText());
									Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(value).isDisplayed());
									break;
								} catch (Exception e) {
									if (i == 2000) {
										Assert.fail(e.getMessage());
									}
								}
							}														
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-eye\"]')[" + j + "].parentElement.parentElement.parentElement.parentElement.querySelectorAll('tr')[2].querySelectorAll('td')[2]")
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
	
	
//	**************************** Data Check --> Application Details Screen *********************************
//	AT_ADC_01
	@And("User verify the Back button available under Application details screen")
	public void user_verify_the_back_button_available_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement AppDetailsBackBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsBackBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				actions.moveToElement(AppDetailsBackBtn).perform();
				Assert.assertTrue(AppDetailsBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Submit button available under Application details screen")
	public void user_verify_the_submit_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsSubmitBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSubmitBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(AppDetailsSubmitBtn).build().perform();
				Assert.assertTrue(AppDetailsSubmitBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Return button available under Application details screen")
	public void user_verify_the_return_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsReturnBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsReturnBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(AppDetailsReturnBtn).build().perform();
				Assert.assertTrue(AppDetailsReturnBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the View Summary button available under Application details screen")
	public void user_verify_the_view_summary_button_available_under_application_details_screen() throws Throwable {
		WebElement AppDetailsViewSummaryBtn = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsViewSummaryBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(AppDetailsViewSummaryBtn).build().perform();
				Assert.assertTrue(AppDetailsViewSummaryBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User validate the Classification value displayed correctly under Application details screen")
	public void user_validate_the_classification_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement classificationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		String classificationValue = classificationDropdown.getAttribute("aria-label");
		System.out.println("Classification Value: "+classificationValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(classificationValue.contains(testData.get("Classification")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}
	
	@And("User validate the Product value displayed correctly under Application details screen")
	public void user_validate_the_product_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement productDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		String productDropdownValue = productDropdown.getAttribute("aria-label");
		System.out.println("Product Value: "+productDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(productDropdownValue.contains(testData.get("Product")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Total Finance Amount Requested value displayed correctly under Application details screen")
	public void user_validate_the_total_finance_amount_requested_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				actions.moveToElement(totalFinanceAmtInput).build().perform();
				String totalFinanceAmtValue = totalFinanceAmtInput.getAttribute("ng-reflect-model");
				System.out.println("Total Finance Amount: "+totalFinanceAmtValue);
				Assert.assertTrue(totalFinanceAmtValue.contains(testData.get("Total Finance Amt")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Declared Net Monthly Income value displayed correctly under Application details screen")
	public void user_validate_the_declared_net_monthly_income_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				String declaredMonthlyIncomeValue = declaredMonthlyIncomeInput.getAttribute("ng-reflect-model");
				System.out.println("Declared Net Income Value: "+declaredMonthlyIncomeValue);
				Assert.assertTrue(declaredMonthlyIncomeValue.contains(testData.get("Declared Monthly Income")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User validate the Sourcing Channel value displayed correctly under Application details screen")
	public void user_validate_the_sourcing_channel_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				String sourcingChannelDropdownValue = sourcingChannelDropdown.getAttribute("aria-label");
				System.out.println("Sourcing Channel Value: "+sourcingChannelDropdownValue);
				Assert.assertTrue(sourcingChannelDropdownValue.contains(testData.get("Sourcing Channel")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Business Center Code value displayed correctly under Application details screen")
	public void user_validate_the_business_center_code_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		String businessCenterCodeDropdownValue = businessCenterCodeDropdown.getAttribute("aria-label");
		System.out.println("Business Center Code Value: "+businessCenterCodeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(businessCenterCodeDropdownValue.contains(testData.get("Business Center Code")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Servicing Type value displayed correctly under Application details screen")
	public void user_validate_the_servicing_type_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		String servicingTypeDropdownValue = servicingTypeDropdown.getAttribute("aria-label");
		System.out.println("Servicing Type Value: "+servicingTypeDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(servicingTypeDropdownValue.contains(testData.get("Servicing Type")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Region value displayed correctly under Application details screen")
	public void user_validate_the_region_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		String regionDropdownValue = regionDropdown.getAttribute("aria-label");
		System.out.println("Region Value: "+regionDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(regionDropdownValue.contains(testData.get("Region")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Servicing Branch value displayed correctly under Application details screen")
	public void user_validate_the_servicing_branch_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachDropdown"));
		String servicingBrachValue = servicingBrachDropdown.getAttribute("aria-label");
		System.out.println("Servicing Branch Value: "+servicingBrachValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(servicingBrachValue.contains(testData.get("Servicing Branch")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User validate the Closing Staff or Servicing Staff value displayed correctly under Application details screen")
	public void user_validate_the_closing_staff_or_servicing_staff_value_displayed_correctly_under_application_details_screen() throws Throwable {
		WebElement closingStaffDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffDropdown"));
		String closingStaffDropdownValue = closingStaffDropdown.getAttribute("aria-label");
		System.out.println("Closing Staff Value: "+closingStaffDropdownValue);
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(closingStaffDropdownValue.contains(testData.get("Closing Staff")));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	
	
	
	
	
//	AT_ADC_02
	@And("User verify the Classification field available under Application details screen")
	public void user_verify_the_classification_field_available_under_application_details_screen() throws Throwable {
		WebElement classificationLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationLabel"));
		System.out.println("Field Name: "+classificationLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(classificationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Product field available under Application details screen")
	public void user_verify_the_product_field_available_under_application_details_screen() throws Throwable {
		WebElement productLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productLabel"));
		System.out.println("Field Name: "+productLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(productLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Total Finance Amount Requested field available under Application details screen")
	public void user_verify_the_total_finance_amount_requested_field_available_under_application_details_screen() throws Throwable {
		WebElement totalFinanceAmtLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtLabel"));
		System.out.println("Field Name: "+totalFinanceAmtLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalFinanceAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Declared Net Monthly Income field available under Application details screen")
	public void user_verify_the_declared_net_monthly_income_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredMonthlyIncomeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeLabel"));
		System.out.println("Field Name: "+declaredMonthlyIncomeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(declaredMonthlyIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Declared Current Obligations field available under Application details screen")
	public void user_verify_the_declared_current_obligations_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredCurrentObligationsLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsLabel"));
		System.out.println("Field Name: "+declaredCurrentObligationsLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(declaredCurrentObligationsLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Special Promotion field available under Application details screen")
	public void user_verify_the_special_promotion_field_available_under_application_details_screen() throws Throwable {
		WebElement specialPromotionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationLabel"));
		System.out.println("Field Name: "+specialPromotionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(specialPromotionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Sourcing Channel field available under Application details screen")
	public void user_verify_the_sourcing_channel_field_available_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelLabel"));
		System.out.println("Field Name: "+sourcingChannelLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingChannelLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Business Center Code field available under Application details screen")
	public void user_verify_the_business_center_code_field_available_under_application_details_screen() throws Throwable {
		WebElement businessCenterCodeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeLabel"));
		System.out.println("Field Name: "+businessCenterCodeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(businessCenterCodeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Servicing Type field available under Application details screen")
	public void user_verify_the_servicing_type_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeLabel"));
		System.out.println("Field Name: "+servicingTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(servicingTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Region field available under Application details screen")
	public void user_verify_the_region_field_available_under_application_details_screen() throws Throwable {
		WebElement regionLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionLabel"));
		System.out.println("Field Name: "+regionLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(regionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Servicing Branch field available under Application details screen")
	public void user_verify_the_servicing_branch_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingBrachLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachLabel"));
		System.out.println("Field Name: "+servicingBrachLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(servicingBrachLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Spoke Location field available under Application details screen")
	public void user_verify_the_spoke_location_field_available_under_application_details_screen() throws Throwable {
		WebElement spokeLocationLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("spokeLocationLabel"));
		System.out.println("Field Name: "+spokeLocationLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(spokeLocationLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Closing Staff or Servicing Staff or RM field available under Application details screen")
	public void user_verify_the_closing_staff_or_servicing_staff_or_rm_field_available_under_application_details_screen() throws Throwable {
		WebElement closingStaffLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("closingStaffLabel"));
		System.out.println("Field Name: "+closingStaffLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(closingStaffLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Topup Type field available under Application details screen")
	public void user_verify_the_topup_type_field_available_under_application_details_screen() throws Throwable {
		WebElement topupTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupTypeLabel"));
		System.out.println("Field Name: "+topupTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(topupTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Topup Application No field available under Application details screen")
	public void user_verify_the_topup_application_no_field_available_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoInput")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement topupAppNoLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("topupAppNoLabel"));
		System.out.println("Field Name: "+topupAppNoLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(topupAppNoLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_ADC_03
	@And("User verify the Sourcing Type field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_type_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel")));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement sourcingTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingTypeLabel"));
		System.out.println("Field Name: "+sourcingTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Sourcing Office field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_office_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingOfficeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingOfficeLabel"));
		System.out.println("Field Name: "+sourcingOfficeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingOfficeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Sourcing Entity field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_entity_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingEntityLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingEntityLabel"));
		System.out.println("Field Name: "+sourcingEntityLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingEntityLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Sourcing Staff field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_sourcing_staff_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement sourcingStaffLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingStaffLabel"));
		System.out.println("Field Name: "+sourcingStaffLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingStaffLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Reference Type field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_reference_type_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement referenceTypeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceTypeLabel"));
		System.out.println("Field Name: "+referenceTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(referenceTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Reference Code field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_verify_the_reference_code_field_available_in_referral_sourcing_details_section_under_application_details_tab() throws Throwable {
		WebElement referenceCodeLabel = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("referenceCodeLabel"));
		System.out.println("Field Name: "+referenceCodeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(referenceCodeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
		
	
//	AT_ADC_05
	@And("User verify the Classification Dropdown field available under Application details screen")
	public void user_verify_the_classification_dropdown_field_available_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement classificationDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(classificationDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User verify the Product Dropdown field available under Application details screen")
	public void user_verify_the_product_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement productDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(productDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Total Finance Amount Requested input field available under Application details screen")
	public void user_verify_the_total_finance_amount_requested_input_field_available_under_application_details_screen() throws Throwable {
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(totalFinanceAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Declared Net Monthly Income input field available under Application details screen")
	public void user_verify_the_declared_net_monthly_income_input_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(declaredMonthlyIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Declared Current Obligations input field available under Application details screen")
	public void user_verify_the_declared_current_obligations_input_field_available_under_application_details_screen() throws Throwable {
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(declaredCurrentObligationsInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_ADC_06
	@And("User verify the Special Promotion Dropdown field available under Application details screen")
	public void user_verify_the_special_promotion_dropdown_field_available_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("AppDetailsSectionLabel")));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement specialPromotionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(specialPromotionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Sourcing Channel Dropdown field available under Application details screen")
	public void user_verify_the_sourcing_channel_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement sourcingChannelDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(sourcingChannelDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Business Center Code Dropdown field available under Application details screen")
	public void user_verify_the_business_center_code_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement businessCenterCodeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(businessCenterCodeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Servicing Type Dropdown field available under Application details screen")
	public void user_verify_the_servicing_type_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingTypeDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(servicingTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Region Dropdown field available under Application details screen")
	public void user_verify_the_region_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement regionDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(regionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User verify the Servicing Branch Dropdown field available under Application details screen")
	public void user_verify_the_servicing_branch_dropdown_field_available_under_application_details_screen() throws Throwable {
		WebElement servicingBrachDropdown = javascriptHelper.executeScriptWithWebElement(dataCheck_ApplicationDetailsJsPaths.getElement("servicingBrachDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				Assert.assertTrue(servicingBrachDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	
}
