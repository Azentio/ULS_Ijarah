package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ConsumerDurableAppDataEntryCFIncomeDetails {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths CDAppDataEntryCFIncomeDetailsJSPath = new JSPaths(excelPath, "CDAppDataEntryCFIncomeDetails", "FieldName", "JSPath");
	Map<String, String> executionData;
	Map<String, String> testData;
	Actions actions = new Actions(driver);
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ExcelData CDAppDataEntryCFIncomeDetailsTestData = new ExcelData(excelTestDataPath, "CDAppDataEntryCFIncomeDetails", "Data Set ID");
	
	ExcelData ConumerDurablesExeSheet = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	Map<String, String> testExecutionData;
	
	@And("^User_607 get the test data for test case AT_CD_APD_CFI_01$")
    public void get_the_test_data_for_test_case_AT_CD_APD_CFI_01() throws Throwable {
		testExecutionData = ConumerDurablesExeSheet.getTestdata("AT_CD_APD_CFI_01");
		testData = CDAppDataEntryCFIncomeDetailsTestData.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@And("^User_607 search the Reference ID for Consumer Durables AppData Entry CFincome Detailes$")
	public void user_607_search_the_reference_id_for_consumer_durables_appdata_entry_cfincome_detailes()throws Throwable{
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys(testData.get("Search Record"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_607 click the Customer Financials tab")
	public void user_607_click_the_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
		WebElement customerFinancialsTab = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("customerFinancialsTab"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(customerFinancialsTab);
				javascriptHelper.JSEClick(customerFinancialsTab);
//				customerFinancialsTab.click();
				break;
			} catch (Exception e) { 
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 validate Save button available under Income details screen")
	public void user_607_validate_save_button_available_under_income_details_screen() throws Throwable {
		Thread.sleep(100);
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSaveBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeSaveBtn);
				Assert.assertTrue(incomeSaveBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Back button available under Income details screen")
	public void user_607_validate_back_button_available_under_income_details_screen() throws Throwable {
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeBackBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeBackBtn);
				Assert.assertTrue(incomeBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Employment Type field available under Income details screen")
	public void user_607_validate_employment_type_field_available_under_income_details_screen() throws Throwable {
		WebElement employementTypeLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("employementTypeLabel"));
		System.out.println("Field Name: "+employementTypeLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(employementTypeLabel);
				Assert.assertTrue(employementTypeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement employementTypeInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("employementTypeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(employementTypeInput);
				Assert.assertTrue(employementTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Lumpsum Amount field available under Income details screen")
	public void user_607_validate_lumpsum_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement lumpsumAmtLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("lumpsumAmtLabel"));
		System.out.println("Field Name: "+lumpsumAmtLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(lumpsumAmtLabel);
				Assert.assertTrue(lumpsumAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement lumpsumAmtInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("lumpsumAmtInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(lumpsumAmtInput);
				Assert.assertTrue(lumpsumAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}


	@And("User_607 validate Income field available under Income details screen")
	public void user_607_validate_income_field_available_under_income_details_screen() throws Throwable {
		WebElement incomeLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeLabel"));
		System.out.println("Field Name: "+incomeLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(incomeLabel);
				Assert.assertTrue(incomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement incomeDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeDropdown);
				Assert.assertTrue(incomeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	

	@And("User_607 validate Frequency field available under Income details screen")
	public void user_607_validate_frequency_field_available_under_income_details_screen() throws Throwable {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyLabel"));
		System.out.println("Field Name: "+frequencyLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(frequencyLabel);
				Assert.assertTrue(frequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement frequencyDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(frequencyDropdown);
				Assert.assertTrue(frequencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Amount field available under Income details screen")
	public void user_607_validate_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement amountLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountLabel"));
		System.out.println("Field Name: "+amountLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(amountLabel);
				Assert.assertTrue(amountLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement amountInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(amountInput);
				Assert.assertTrue(amountInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Defined % field available under Income details screen")
	public void user_607_validate_defined_field_available_under_income_details_screen() throws Throwable {
		WebElement defined_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("defined%_Label"));
		System.out.println("Field Name: "+defined_Label.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(defined_Label);
				Assert.assertTrue(defined_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement defined_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("defined%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(defined_Input);
				Assert.assertTrue(defined_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Adjusted % field available under Income details screen")
	public void user_607_validate_adjusted_field_available_under_income_details_screen() throws Throwable {
		WebElement adjusted_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Label"));
		System.out.println("Field Name: "+adjusted_Label.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(adjusted_Label);
				Assert.assertTrue(adjusted_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement adjusted_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(adjusted_Input);
				Assert.assertTrue(adjusted_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Amount Considered field available under Income details screen")
	public void user_607_validate_amount_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement amountConsideredLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountConsideredLabel"));
		System.out.println("Field Name: "+amountConsideredLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(amountConsideredLabel);
				Assert.assertTrue(amountConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountConsideredInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertTrue(amountConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Action button available under Income details screen")
	public void user_607_validate_action_button_available_under_income_details_screen() throws Throwable {
		WebElement actionLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("actionLabel"));
		System.out.println("Field Name: "+actionLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(actionLabel);
				Assert.assertTrue(actionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement actionAddBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("actionAddBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(actionAddBtn);
				Assert.assertTrue(actionAddBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Total Income field available under Income details screen")
	public void user_607_validate_total_income_field_available_under_income_details_screen() throws Throwable {
		WebElement totalIncomeLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalIncomeLabel"));
		System.out.println("Field Name: "+totalIncomeLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(totalIncomeLabel);
				Assert.assertTrue(totalIncomeLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalIncomeInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalIncomeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeInput);
				Assert.assertTrue(totalIncomeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Total Income considered field available under Income details screen")
	public void user_607_validate_total_income_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement totalIncomeConsideredLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalIncomeConsideredLabel"));
		System.out.println("Field Name: "+totalIncomeConsideredLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(totalIncomeConsideredLabel);
				Assert.assertTrue(totalIncomeConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalIncomeConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalIncomeConsideredInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeConsideredInput);
				Assert.assertTrue(totalIncomeConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Salary credited to Bank field available under Income details screen")
	public void user_607_validate_salary_credited_to_bank_field_available_under_income_details_screen() throws Throwable {
		WebElement salaryCreditedToBankLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("salaryCreditedToBankLabel"));
		System.out.println("Field Name: "+salaryCreditedToBankLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(salaryCreditedToBankLabel);
				Assert.assertTrue(salaryCreditedToBankLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement salaryCreditedToBankDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("salaryCreditedToBankDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(salaryCreditedToBankDropdown);
				Assert.assertTrue(salaryCreditedToBankDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction field available under Income details screen")
	public void user_607_validate_deduction_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionLabel"));
		System.out.println("Field Name: "+deductionLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionLabel);
				Assert.assertTrue(deductionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionDropdown);
				Assert.assertTrue(deductionDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction Frequency field available under Income details screen")
	public void user_607_validate_deduction_frequency_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionFrequencyLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionFrequencyLabel"));
		System.out.println("Field Name: "+deductionFrequencyLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionFrequencyLabel);
				Assert.assertTrue(deductionFrequencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionFrequencyDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionFrequencyDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionFrequencyDropdown);
				Assert.assertTrue(deductionFrequencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction Amount field available under Income details screen")
	public void user_607_validate_deduction_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionAmtLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtLabel"));
		System.out.println("Field Name: "+deductionAmtLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionAmtLabel);
				Assert.assertTrue(deductionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionAmtInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionAmtInput);
				Assert.assertTrue(deductionAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction Def % field available under Income details screen")
	public void user_607_validate_deduction_def_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionDef_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDef%_Label"));
		System.out.println("Field Name: "+deductionDef_Label.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionDef_Label);
				Assert.assertTrue(deductionDef_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionDef_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDef%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionDef_Input);
				Assert.assertTrue(deductionDef_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction Adj % field available under Income details screen")
	public void user_607_validate_deduction_adj_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionAdj_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Label"));
		System.out.println("Field Name: "+deductionAdj_Label.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionAdj_Label);
				Assert.assertTrue(deductionAdj_Label.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionAdj_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionAdj_Input);
				Assert.assertTrue(deductionAdj_Input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction Considered field available under Income details screen")
	public void user_607_validate_deduction_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionConsideredLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionConsideredLabel"));
		System.out.println("Field Name: "+deductionConsideredLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionConsideredLabel);
				Assert.assertTrue(deductionConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionConsideredInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionConsideredInput);
				Assert.assertTrue(deductionConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Deduction Action button field available under Income details screen")
	public void user_607_validate_deduction_action_button_field_available_under_income_details_screen() throws Throwable {
		WebElement deductionActionLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionActionLabel"));
		System.out.println("Field Name: "+deductionActionLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionActionLabel);
				Assert.assertTrue(deductionActionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement deductionActionAddBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionActionAddBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(deductionActionAddBtn);
				Assert.assertTrue(deductionActionAddBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Total Deduction field available under Income details screen")
	public void user_607_validate_total_deduction_field_available_under_income_details_screen() throws Throwable {
		WebElement totalDeductionLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalDeductionLabel"));
		System.out.println("Field Name: "+totalDeductionLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(totalDeductionLabel);
				Assert.assertTrue(totalDeductionLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalDeductionInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalDeductionInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeductionInput);
				Assert.assertTrue(totalDeductionInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Total Deduction Considered field available under Income details screen")
	public void user_607_validate_total_deduction_considered_field_available_under_income_details_screen() throws Throwable {
		WebElement totalDeductionConsideredLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalDeductionConsideredLabel"));
		System.out.println("Field Name: "+totalDeductionConsideredLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(totalDeductionConsideredLabel);
				Assert.assertTrue(totalDeductionConsideredLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement totalDeductionConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalDeductionConsideredInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeductionConsideredInput);
				Assert.assertTrue(totalDeductionConsideredInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 validate Currency field available under Income details screen")
	public void user_607_validate_currency_field_available_under_income_details_screen() throws Throwable {
		WebElement currencyLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("currencyLabel"));
		System.out.println("Field Name: "+currencyLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(currencyLabel);
				Assert.assertTrue(currencyLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement currencyDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("currencyDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(currencyDropdown);
				Assert.assertTrue(currencyDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 click the Save button under Income details screen")
	public void user_607_click_the_save_button_under_income_details_screen() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 200; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 validate the confirmation message under Income details screen")
	public void user_607_validate_the_confirmation_message_under_income_details_screen() throws Throwable {
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastMsg"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(successToastMsg.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement successToastCloseBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastCloseBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				successToastCloseBtn.click();
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click the Back button under Income details screen")
	public void user_607_click_the_back_button_under_income_details_screen() throws Throwable {
		Thread.sleep(200);
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeBackBtn"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.JSEClick(incomeBackBtn);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
	@Given("User_607 Click module name in home screen")
	public void user_607_click_module_name_in_home_screen() {
		for (int i = 0; i < 199; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("moduleName")).click();
				break;
			} catch (Exception e) {
			}
			
		}
	}

	@Given("User_607 Select LOS in the module name")
	public void user_607_select_los_in_the_module_name() {
		for (int i = 0; i <=199; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("selectLOS")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Click inbox in the home page")
	public void user_607_click_inbox_in_the_home_page() {
		for (int i = 0; i <=199; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("inbox"))
						.click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 Click Search in inbox")
	public void user_607_Click_search_in_inbox() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("clickSearchInInbox")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 Search in the search box")
	public void user_607_search_in_the_search_box() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("Gowtham",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
	@Given("User_607 Search in the search Field Tawarah App Data Entry Income Details List")
	public void user_607_search_in_the_search_field_tawarah_app_data_entry_income_details_list() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("3357",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@Given("User_607 Search in the search Field Ijara App Data Entry Income Details List")
	public void user_607_search_in_the_search_field_Ijara_app_data_entry_income_details_list() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("2193",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	
	@And("User_607 Search the Ref Id under inbox Tawarruq AppData Entry Facility Details")
	public void user_607_search_in_the_search_field_tawarah_app_data_entry_Facility_details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("3357",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("User_607 Search the Ref Id under inbox Tawarruq AppData Entry FollowUp Details")
	public void user_607_search_in_the_search_field_tawarah_app_data_entry_FollowUp_Details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("3357",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
	@Given("User_607 Search the Ref Id under inbox Tawaraq AppData Check Address Details")
	public void user_search_the_ref_id_under_inbox_tawaraq_app_data_check_address_details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("4650",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	}
	}
	
	@And("User_607 Search the Ref Id under inbox Tawaraq Offering Document Details")
	public void user_607_search_in_the_search_field_Tawaraq_Offering_Document_Details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("3841",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 Search the Ref Id under inbox Murabha Offering Offer Details")
	public void user_607_search_the_ref_id_under_inbox_murabha_offering_offer_details() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys("4049",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	
	@Given("User_607 Search in the search Field")
	public void user_607_search_in_the_search_Field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchInInbox")).sendKeys(testData.get("Search Record"),Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	

	@Given("User_607 Select record after search")
	public void user_607_select_record_after_search() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("selectRecord")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Click Customer Finacials in the record")
	public void user_607_click_customer_finacials_in_the_record() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("CustomerFinacials")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Click edit button customer personal information")
	public void user_607_click_edit_button_customer_personal_information() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("edit")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Click Add button in income")
	public void user_607_click_add_button_in_income() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("AddButtonInIncome")).click();
				break;
			} catch (Exception e) {
				
				}
			}	
		}
	    
	@Given("User_607 Check Employment Type Field")
	public void user_607_check_employment_type_field() throws Throwable {
		Thread.sleep(7000);
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Employment Type")).isDisplayed()) {
			SoftAssert.fail("Check Employment Type Field");
		}
	}

	@Given("User_607 Check saveButton")
	public void user_607_check_save_button() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("saveButton")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Lumpsum Amount field")
	public void user_607_check_lumpsum_amount_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Lumpsum Amount")).isDisplayed()) {
			Assert.fail();
		}
	    
	}


	@Given("User_607 Check Financial Year")
	public void user_607_check_financial_year() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Financial Year")).isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Check Filing Date")
	public void user_607_check_filing_date() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Filing Date")).isDisplayed()) {
			Assert.fail();
		}
		
		
	}
	
	@Given("User_607 Check Income field")
	public void user_607_check_income_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Income")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Frequency field")
	public void user_607_check_frequency_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Frequency")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Amount field")
	public void user_607_check_amount_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Amount")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Defined field")
	public void user_607_check_defined_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Defined")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Adjusted field")
	public void user_607_check_adjusted_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Adjusted")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Amount Considered field")
	public void user_607_check_amount_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Amount Considered")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Action field")
	public void user_607_check_action_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Action")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Total Income field")
	public void user_607_check_total_income_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Total Income")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Total Income Considered field")
	public void user_607_check_total_income_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Total Income Considered")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Salary Credited To Bank field")
	public void user_607_check_salary_credited_to_bank_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Salary Credited To Bank")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction field")
	public void user_607_check_deduction_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Deduction")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Amt field")
	public void user_607_check_deduction_amt_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Deduction Amt")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Def field")
	public void user_607_check_deduction_def_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Deduction Def")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Adj field")
	public void user_607_check_deduction_adj_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Deduction Adj")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Considered field")
	public void user_607_check_deduction_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Deduction Considered")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Total Deduction field")
	public void user_607_check_total_deduction_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Total Deduction")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Total Deduction Considered field")
	public void user_607_check_total_deduction_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Total Deduction Considered")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Currency field")
	public void user_607_check_currency_field() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Currency")).isDisplayed()) {
			Assert.fail();
		}
		
	}

	@Given("User_607 Select days in Frequency")
	public void user_607_select_days_in_frequency() {
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("FrequencyInput")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
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

						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

						dropdownString = javascriptHelper.executeScript(

								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

								.toString();

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

				System.out.println("Map " + testData.get("FrequencyInput").trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("FrequencyInput")).trim())) {

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

	@Given("User_607 Enter Amount in Amount field")
	public void user_607_enter_amount_in_amount_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("FrequencyInput")).click();
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("FrequencyInput")).sendKeys("10000");
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Click save button")
	public void user_607_click_save_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("saveButton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Check record save successfully")
	public void user_607_check_record_save_successfully() {
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("SucessSavePopup")).isDisplayed()) {
			Assert.fail();
		}
		SoftAssert.assertAll();
	}
	
	
	
	@Given("User_607 Click back button")
	public void user_607_click_back_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Backbutton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Check go to previous page")
	public void user_607_check_go_to_previous_page() throws Throwable {
		Thread.sleep(5000);
		if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("AddButtonInIncome")).isDisplayed()) {
			Assert.fail();
		}
	}


	@Given("User_607 check value auto populated")
	public void user_607_check_value_auto_populated() {
		String text = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("Employment Type")).getText();
		if (text.isEmpty()||text.isBlank()) {
			Assert.fail();
		}
		
	}
	
	@Given("User_607 Check clicking on back button system should navigate to the previous screen")
	public void user_607_check_clicking_on_back_button_system_should_navigate_to_the_previous_screen() {
	    if (!javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("selectRecord")).isDisplayed()) {
	    	Assert.fail();
		}
	}

	
	@And("User_607 click Add button under Income section in Customer Financials tab")
	public void user_607_click_add_button_under_income_section_in_customer_financials_tab() {
		String length = null;
						for (int i = 0; i < 300; i++) {
							try {
								length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
										.toString();
								System.out.println(length);
								if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
									break;
								}
							} catch (Exception e) {
								if (i == 299) {
									Assert.fail(e.getMessage());
								}
							}
						}
						for (int i = 0; i < 300; i++) {
							try {
								for (int j = 0; j < Integer.parseInt(length); j++) {
									String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
									String titlename = javascriptHelper.executeScript(title).toString();
									System.out.println(titlename.trim());
									if (titlename.contains(" Income ")) {
										System.out.println("Condition true");
										System.out.println(titlename);
										String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
										WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
										actions.scrollToElement(eyeBtn).build().perform();
										eyeBtn.click();
										break;
									}
								}
								break;
							} catch (Exception e) {
								if (i == 299) {
									Assert.fail(e.getMessage());
								}
							}
						}
	}
	
	
	@And("User_607 validate Pension Amount field available under Income details screen")
	public void user_607_validate_pension_amount_field_available_under_income_details_screen() throws Throwable {
		WebElement pensionAmtLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("pensionAmtLabel"));
		System.out.println("Field Name: "+pensionAmtLabel.getText());
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(pensionAmtLabel);
				Assert.assertTrue(pensionAmtLabel.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		WebElement pensionAmtInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("pensionAmtInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(pensionAmtInput);
				Assert.assertTrue(pensionAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	

	
	@And("User_607 select the Salary credited to Bank value under Income details screen")
	public void user_607_select_the_salary_credited_to_bank_value_under_income_details_screen() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("salaryCreditedToBankDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Salary Credited To Bank")).trim())) {
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

	@And("User_607 validate Bank Name field available under Income details screen")
	public void user_607_validate_bank_name_field_available_under_income_details_screen() throws Throwable {
		WebElement bankNameLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("bankNameLabel"));
		WebElement bankNameDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("bankNameDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(bankNameLabel);
				Assert.assertTrue(bankNameLabel.isDisplayed());
				javascriptHelper.backgroundBorder(bankNameDropdown);
				Assert.assertTrue(bankNameDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 validate Branch Name field available under Income details screen")
	public void user_607_validate_branch_name_field_available_under_income_details_screen() throws Throwable {
		WebElement branchNameLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("branchNameLabel"));
		WebElement branchNameDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("branchNameDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(branchNameLabel);
				Assert.assertTrue(branchNameLabel.isDisplayed());
				javascriptHelper.backgroundBorder(branchNameDropdown);
				Assert.assertTrue(branchNameDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_607 verify system should navigate to the previous screen in Customer Financials tab")
	public void user_607_verify_system_should_navigate_to_the_previous_screen_in_customer_financials_tab() {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							javascriptHelper
							.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]")
									.isDisplayed();
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

	
	
//	AT_MU_INC_02
	@And("User_607 enter the Lumpsum Amount under Income screen in Customer Financials tab")
	public void user_607_enter_the_lumpsum_amount_under_income_screen_in_customer_financials_tab()throws Throwable {
		Thread.sleep(1500);
	    for (int i = 0; i < 200; i++) {
	    	try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("lumpsumAmtInput"))
				.sendKeys(testData.get("Lumpsum Amount"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 enter the Pension Amount under Income screen in Customer Financials tab")
	public void user_607_enter_the_pension_amount_under_income_screen_in_customer_financials_tab()throws Throwable {
	    for (int i = 0; i < 200; i++) {
	    	try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("pensionAmtInput"))
				.sendKeys(testData.get("Pension Amount"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}			
		}	    
	}

	@And("User_607 select the Income option under Income screen in Customer Financials tab")
	public void user_607_select_the_income_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Income")).trim())) {
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

	@And("User_607 select the Frequency option under Income screen in Customer Financials tab")
	public void user_607_select_the_frequency_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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

	@And("User_607 enter the Income Amount under Income screen in Customer Financials tab")
	public void user_607_enter_the_income_amount_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(testData.get("Amount"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 enter the Adjusted% under Income screen in Customer Financials tab")
	public void user_607_enter_the_adjusted_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Input"))
				.sendKeys(testData.get("Adjusted %"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 select the Bank Name under Income screen in Customer Financials tab")
	public void user_607_select_the_bank_name_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("bankNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Bank Name")).trim())) {
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

	@And("User_607 select the Branch Name under Income screen in Customer Financials tab")
	public void user_607_select_the_branch_name_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("branchNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Branch Name")).trim())) {
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

	@And("User_607 select the Deduction option under Income screen in Customer Financials tab")
	public void user_607_select_the_deduction_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Deduction")).trim())) {
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

	@And("User_607 select the Deduction Frequency option under Income screen in Customer Financials tab")
	public void user_607_select_the_deduction_frequency_option_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionFrequencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Deduction_Frequency")).trim())) {
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

	@And("User_607 enter the Deduction Amount under Income screen in Customer Financials tab")
	public void user_607_enter_the_deduction_amount_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput")).click();
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput"))
				.sendKeys(testData.get("Deduction_Amt"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 enter the Deduction Adjusted% under Income screen in Customer Financials tab")
	public void user_607_enter_the_deduction_adjusted_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input")).click();
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input"))
				.sendKeys(testData.get("Deduction_Adj%"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 select the Currency under Income screen in Customer Financials tab")
	public void user_607_select_the_currency_under_income_screen_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("currencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
	
	@And("User_607 validate the confirmation message as success under Income details screen")
	public void user_607_validate_the_confirmation_message_as_success_under_income_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastMsg"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Saved successfully"));				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 validate the confirmation message as success")
	public void user_607_validate_the_confirmation_message_as_success() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastMsg"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Saved successfully"));				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	@AT_MU_INC_03
	@And("User_607 click the pencil button under Income section in Customer Financials tab")
	public void user_607_click_the_pencil_button_under_income_section_in_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
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
	
	
	@And("User_607 verify Employment Type auto populated from Employment details screen")
	public void user_607_verify_employment_type_auto_populated_from_employment_details_screen() throws Throwable {
		Thread.sleep(500);
		WebElement employementTypeInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("employementTypeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(employementTypeInput);
				Assert.assertTrue(employementTypeInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Lumpsum Amount auto populated from Employment details screen")
	public void user_607_verify_lumpsum_amount_auto_populated_from_employment_details_screen() throws Throwable {
		WebElement lumpsumAmtInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("lumpsumAmtInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(lumpsumAmtInput);
				Assert.assertTrue(lumpsumAmtInput.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Income field should be Mandatory, LOV and Allow to user select any value from LOV")
	public void user_607_verify_income_field_should_be_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement incomeLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeLabel"));
		WebElement incomeDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(incomeLabel);
				Assert.assertTrue(incomeLabel.getText().contains("*"));
				javascriptHelper.backgroundBorder(incomeDropdown);
				Assert.assertTrue(incomeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Income")).trim())) {
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

	@And("User_607 verify Frequency field should be Mandatory, LOV and Allow to user select any value from LOV")
	public void user_607_verify_frequency_field_should_be_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement frequencyLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyLabel"));
		WebElement frequencyDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(frequencyLabel);
				Assert.assertTrue(frequencyLabel.getText().contains("*"));
				javascriptHelper.backgroundBorder(frequencyDropdown);
				Assert.assertTrue(frequencyDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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

	@And("User_607 verify income Amount field should be Mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_607_verify_income_amount_field_should_be_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement amountLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountLabel"));
		WebElement amountInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(amountLabel);
				Assert.assertTrue(amountLabel.getText().contains("*"));
				javascriptHelper.backgroundBorder(amountInput);
				Assert.assertTrue(amountInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(testData.get("Amount"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		amountLabel.click();
	}

	@And("User_607 verify Defined% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_607_verify_defined_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement defined_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("defined%_Label"));
		WebElement defined_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("defined%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(defined_Label);
				Assert.assertTrue(!(defined_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(defined_Input);
				Assert.assertTrue(defined_Input.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Adjusted% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_607_verify_adjusted_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement adjusted_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Label"));
		WebElement adjusted_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(adjusted_Label);
				Assert.assertTrue(!(adjusted_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(adjusted_Input);
				Assert.assertTrue(adjusted_Input.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Input"))
				.sendKeys(testData.get("Adjusted %"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Amount Considered field should be auto populated in post entering Adjusted% value")
	public void user_607_verify_amount_considered_field_should_be_auto_populated_in_post_entering_adjusted_value() throws Throwable {
		String incomeValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput")).getAttribute("ng-reflect-model");
		String definedValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("defined%_Input")).getAttribute("ng-reflect-model");
		String adjustedValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("adjusted%_Input")).getAttribute("ng-reflect-model");
		String amountConsideredValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountConsideredInput")).getAttribute("ng-reflect-model");
		
		int ac = (Integer.parseInt(incomeValue)*Integer.parseInt(definedValue))/Integer.parseInt(adjustedValue);
		System.out.println("AC: "+ ac);
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountConsideredInput"));		
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertEquals(amountConsideredValue, Integer.toString(ac));				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	
	@And("User_607 verify Total income value should get auto populated post entering the Amount")
	public void user_607_verify_total_income_value_should_get_auto_populated_post_entering_the_amount() throws Throwable {
		String incomeValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput")).getAttribute("ng-reflect-model");
//		int a = (Integer.parseInt(incomeValue)/12);
//		String substring = Integer.toString(a).split("\\.")[0];
//		System.out.println("A: "+substring);
		WebElement totalIncomeInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalIncomeInput"));
		String value = totalIncomeInput.getAttribute("ng-reflect-model");
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeInput);
				Assert.assertEquals(value, incomeValue);				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify Total income considered value should get auto populate post entering the value in Adjusted% field")
	public void user_607_verify_total_income_considered_value_should_get_auto_populate_post_entering_the_value_in_adjusted_field() throws Throwable {
		String amountConsideredValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountConsideredInput")).getAttribute("ng-reflect-model");
//		int a = (Integer.parseInt(amountConsideredValue)/12);
//		String sp = Integer.toString(a).split("\\.")[0];
//		System.out.println("B: "+sp);
		WebElement totalIncomeConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalIncomeConsideredInput"));
		String value = totalIncomeConsideredInput.getAttribute("ng-reflect-model");
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalIncomeConsideredInput);
				Assert.assertEquals(value, amountConsideredValue);				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify Salary credited to Bank field should be Non-mandatory and Dropdown")
	public void user_607_verify_salary_credited_to_bank_field_should_be_non_mandatory_and_dropdown() throws Throwable {
		WebElement salaryCreditedToBankLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("salaryCreditedToBankLabel"));
		WebElement salaryCreditedToBankDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("salaryCreditedToBankDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(salaryCreditedToBankLabel);
				Assert.assertTrue(!(salaryCreditedToBankLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(salaryCreditedToBankDropdown);
				Assert.assertTrue(salaryCreditedToBankDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Deduction field should be Non-mandatory, LOV and Allow to user select any value from LOV")
	public void user_607_verify_deduction_field_should_be_non_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement deductionLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionLabel"));
		WebElement deductionDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionLabel);
				Assert.assertTrue(!(deductionLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(deductionDropdown);
				Assert.assertTrue(deductionDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Deduction")).trim())) {
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

	@And("User_607 verify Deduction Amount field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_607_verify_deduction_amount_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement deductionAmtLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtLabel"));
		WebElement deductionAmtInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(deductionAmtLabel);
				Assert.assertTrue(!(deductionAmtLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(deductionAmtInput);
				Assert.assertTrue(deductionAmtInput.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		System.out.println("Deduction Amount "+testData.get("Deduction_Amt"));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput")).click();
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput"))
				.sendKeys(testData.get("Deduction_Amt"));
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Deduction Defined% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_607_verify_deduction_defined_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement defined_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDef%_Label"));
		WebElement defined_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDef%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(defined_Label);
				Assert.assertTrue(!(defined_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(defined_Input);
				Assert.assertTrue(defined_Input.getAttribute("type").contains("text"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Deduction Adjusted% field should be Non-mandatory, Textbox and Allow to user enter numeric value manualy")
	public void user_607_verify_deduction_adjusted_field_should_be_non_mandatory_textbox_and_allow_to_user_enter_numeric_value_manualy() throws Throwable {
		WebElement adjusted_Label = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Label"));
		WebElement adjusted_Input = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(adjusted_Label);
				Assert.assertTrue(!(adjusted_Label.getText().contains("*")));
				javascriptHelper.backgroundBorder(adjusted_Input);
				Assert.assertTrue(adjusted_Input.getAttribute("type").contains("number"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//	    Allow to user enter the numeric value
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input"))
				.sendKeys(testData.get("Adjusted %"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Deduction Considered field should be auto populated in post entering Deduction Adj% value")
	public void user_607_verify_deduction_considered_field_should_be_auto_populated_in_post_entering_deduction_adj_value() throws Throwable {
		String deductionAmt = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput")).getAttribute("ng-reflect-model");
		String definedValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionDef%_Input")).getAttribute("ng-reflect-model");
		String adjustedValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAdj%_Input")).getAttribute("ng-reflect-model");
		String amountConsideredValue = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionConsideredInput")).getAttribute("ng-reflect-model");
		
		int ac = (Integer.parseInt(deductionAmt)*Integer.parseInt(definedValue))/Integer.parseInt(adjustedValue);
		System.out.println("AC: "+ ac);
		WebElement amountConsideredInput = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountConsideredInput"));		
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(amountConsideredInput);
				Assert.assertEquals(amountConsideredValue, Integer.toString(ac));				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify Total Deduction value should get auto populated post entering the Deduction Amount")
	public void user_607_verify_total_deduction_value_should_get_auto_populated_post_entering_the_deduction_amount() throws Throwable {
		Thread.sleep(1000);
		String deductionAmt = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionAmtInput")).getAttribute("ng-reflect-model");
//		int a = Integer.parseInt(deductionAmt)/12;
//		String st = Integer.toString(a).split("\\.")[0];
		WebElement totalDeduction = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalDeductionInput"));
		String value = totalDeduction.getAttribute("ng-reflect-model");
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeduction);
				Assert.assertEquals(deductionAmt, value);				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Deduction considered value should get auto populate post entering the value in Deduction Adj% field")
	public void user_607_verify_deduction_considered_value_should_get_auto_populate_post_entering_the_value_in_deduction_adj_field() throws Throwable {
		String deductionConsidered = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("deductionConsideredInput")).getAttribute("ng-reflect-model");
//		int a = Integer.parseInt(deductionConsidered)/12;
//		String sp = Integer.toString(a).split("\\.")[0];
		WebElement totalDeductionConsidered = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("totalDeductionConsideredInput"));
		String value = totalDeductionConsidered.getAttribute("ng-reflect-model");
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(totalDeductionConsidered);
				Assert.assertEquals(value, deductionConsidered);				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Bank Name field should be Non-mandatory, LOV and Allow to user select any value from LOV")
	public void user_607_verify_bank_name_field_should_be_non_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement bankNameLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("bankNameLabel"));
		WebElement bankNameDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("bankNameDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(bankNameLabel);
				Assert.assertTrue(!(bankNameLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(bankNameDropdown);
				Assert.assertTrue(bankNameDropdown.getAttribute("aria-haspopup").contains("listbox"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("bankNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Bank Name")).trim())) {
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

	@And("User_607 verify Branch Name field should be Non-mandatory, LOV and Allow to user select any value from LOV")
	public void user_607_verify_branch_name_field_should_be_non_mandatory_lov_and_allow_to_user_select_any_value_from_lov() throws Throwable {
		WebElement branchNameLabel = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("branchNameLabel"));
		WebElement branchNameDropdown = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("branchNameDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(branchNameLabel);
				Assert.assertTrue(!(branchNameLabel.getText().contains("*")));
				javascriptHelper.backgroundBorder(branchNameDropdown);
				Assert.assertTrue(branchNameDropdown.getAttribute("ng-reflect-placeholder").contains("Select"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Select the LOV Value
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("branchNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Branch Name")).trim())) {
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

	@And("User_607 click Add Row button system should add a row under Income screen")
	public void user_607_click_add_row_button_system_should_add_a_row_under_income_screen() throws Throwable {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("actionAddBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 click Delete Row button system should delete a row under Income screen")
	public void user_607_click_delete_row_button_system_should_delete_a_row_under_income_screen() throws Throwable {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("actionDeleteBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
//	AT_MU_INC_04
	@And("User_607 click the Save button with mandatory field blank under Income details screen")
	public void user_607_click_the_save_button_with_mandatory_field_blank_under_income_details_screen() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 200; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify validation message for mandatory field as blank under Income details screen")
	public void user_607_verify_validation_message_for_mandatory_field_as_blank_under_income_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastMsg"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Fill Mandatory fields"));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastCloseBtn")).click();				
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
//	AT_MU_INC_05
	@And("User_607 verify system allow user to modify Lumpsum Amount under Income details screen")
	public void user_607_verify_system_allow_user_to_modify_lumpsum_amount_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("lumpsumAmtInput"))
	    		.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("lumpsumAmtInput"))
				.sendKeys(testData.get("Lumpsum Amount"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify system allow user to modify Pension Amount under Income details screen")
	public void user_607_verify_system_allow_user_to_modify_pension_amount_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("pensionAmtInput"))
	    		.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("pensionAmtInput"))
				.sendKeys(testData.get("Pension Amount"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}			
		}	    
	}
	
	@And("User_607 verify system allow user to modify Income under Income details screen")
	public void user_607_verify_system_allow_user_to_modify_income_under_income_details_screen() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Income")).trim())) {
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
	
	@And("User_607 verify system allow user to modify Frequency under Income details screen")
	public void user_607_verify_system_allow_user_to_modify_frequency_under_income_details_screen() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("frequencyDropdown")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Frequency")).trim())) {
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
	
	@And("User_607 verify system allow user to modify Income Amount under Income details screen")
	public void user_607_verify_system_allow_user_to_modify_income_amount_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
	    	try {
	    		javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
	    		.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(testData.get("Amount"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify while modification system allow user to save the record with valid data")
	public void user_607_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data() throws Throwable {
		WebElement incomeSaveBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSaveBtn"));
		for (int i = 0; i <= 200; i++) {
			try {
				incomeSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 post clicking on save button system should display the confirmation message as Success")
	public void user_607_post_clicking_on_save_button_system_should_display_the_confirmation_message_as_success() throws Throwable {
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastMsg"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Saved successfully"));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_607 again click the pencil button under Income section in Customer Financials tab")
	public void user_607_again_click_the_pencil_button_under_income_section_in_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\"table tbody tr td button\")")
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
	
	
	@And("User_607 verify while modification, when user keep any mandatory field blank and click on save button")
	public void user_607_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify while modification enters the invalid data in Income details screen")
	public void user_607_verify_while_modification_enters_the_invalid_data_in_income_details_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("amountInput"))
				.sendKeys(testData.get("Invalid Data"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 system should not allow user to do a modification with invalid data under Income details screen")
	public void user_607_system_should_not_allow_user_to_do_a_modification_with_invalid_data_under_income_details_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		WebElement successToastMsg = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastMsg"));
		for (int i = 0; i <= 200; i++) {
			try {
				Assert.assertTrue(successToastMsg.getText().contains("Fill Mandatory fields"));	
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("successToastCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 Post clicking on back button system should navigate to the previous screen")
	public void user_607_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen() throws Throwable {
		Thread.sleep(2000);
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeBackBtn"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.JSEClick(incomeBackBtn);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_MU_INC_06
	@And("User_607 verify the Back button available in Income list view under Customer Financials tab")
	public void user_607_verify_the_back_button_available_in_income_list_view_under_customer_financials_tab() throws Throwable {
		Thread.sleep(1500);
		WebElement backBtn = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("customerFinancialsTabBackBtn"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.scrollIntoView(backBtn);
				javascriptHelper.backgroundBorder(backBtn);
				backBtn.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Add button available under Income section list view in Customer Financials tab")
	public void user_607_verify_add_button_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Income").trim())) {
							System.out.println("Inside nested loop");
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper.backgroundBorder(javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]")
									.isDisplayed();
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

	@And("User_607 verify Nature of Employement field available under Income section list view in Customer Financials tab")
	public void user_607_verify_nature_of_employement_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement natureOfEmployment = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("listview_NatureOfEmployment"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(natureOfEmployment);
				natureOfEmployment.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Net Income field available under Income section list view in Customer Financials tab")
	public void user_607_verify_net_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement netIncome = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("listview_NetIncome"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(netIncome);
				netIncome.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Net Deduction field available under Income section list view in Customer Financials tab")
	public void user_607_verify_net_deduction_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement netDeduction = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("listview_NetDeduction"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(netDeduction);
				netDeduction.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Considered Income field available under Income section list view in Customer Financials tab")
	public void user_607_verify_considered_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement consideredIncome = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("listview_ConsideredIncome"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(consideredIncome);
				consideredIncome.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Currency field available under Income section list view in Customer Financials tab")
	public void user_607_verify_currency_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement currency = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("listview_Currency"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(currency);
				currency.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Status field available under Income section list view in Customer Financials tab")
	public void user_607_verify_status_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement status = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("listview_Status"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(status);
				status.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify on clicks of list view record, details should be populated in the fields under Income screen")
	public void user_607_verify_on_clicks_of_list_view_record_details_should_be_populated_in_the_fields_under_income_screen() throws Throwable {
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
							javascriptHelper.backgroundColor(
									javascriptHelper.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\'table tbody tr td button[icon=\"pi pi-eye\"]')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector('table tbody tr td button[icon=\"pi pi-eye\"]')")
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

	@And("User_607 verify the functionality of Add button under Income section in Customer Financials tab")
	public void user_607_verify_the_functionality_of_add_button_under_income_section_in_customer_financials_tab() throws Throwable {
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
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

	@And("User_607 post clicking on Add button system should navigate to new Income details screen")
	public void user_607_post_clicking_on_add_button_system_should_navigate_to_new_income_details_screen() throws Throwable {
		WebElement incomeScreenTitle = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeScreenTitle"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundBorder(incomeScreenTitle);
				incomeScreenTitle.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	
//	AT_MU_INC_07
	@And("User_607 click Search button in Income section under Customer Financials tab")
	public void user_607_click_search_button_in_income_section_under_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
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
							System.out.println("document.querySelectorAll('button[icon=\"pi pi-search\"]')[" + j + "]");
							javascriptHelper
							.scrollIntoView(
									javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
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

	@And("User_607 verify the functionality of Search box with matching data in Income section")
	public void user_607_verify_the_functionality_of_search_box_with_matching_data_in_income_section() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSectionSearchbox"))
				.sendKeys(testData.get("Currency"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify entering any matching value system should display all the possible matching records under Income section")
	public void user_607_verify_entering_any_matching_value_system_should_display_all_the_possible_matching_records_under_income_section() throws Throwable {
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchResult"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)>0);
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify the functionality of Search box with mismatch data in Income section")
	public void user_607_verify_the_functionality_of_search_box_with_mismatch_data_in_income_section() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSectionSearchbox")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("incomeSectionSearchbox"))
				.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify system should not display any records or system should display the message as No data found under Income section")
	public void user_607_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_income_section() throws Throwable {
		Thread.sleep(1000);
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("searchResult"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)==0);
				break;
			} catch (Exception e) {
				if (i ==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_MU_INC_08
	@And("User_607 verify the functionality of Export to PDF button")
	public void user_607_verify_the_functionality_of_export_to_pdf_button() throws Throwable {
		Thread.sleep(1000);
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
			for (int k = 0; k <= 200; k++) {
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
							actions.scrollToElement(javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]")).build().perform();
					//		javascriptHelper.scrollIntoView(
					//				javascriptHelper.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('p-dropdown[placeholder=\"Export\"]')[" + j + "]").click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 199) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}

	@And("User_607 post clicking on Export to PDF button system should download the PDF file of that records")
	public void user_607_post_clicking_on_export_to_pdf_button_system_should_download_the_pdf_file_of_that_records() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("exportPDF")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		IncomeFormDataFile
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("IncomeFormDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				SoftAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}

	@And("User_607 verify the functionality of Export to Excel button")
	public void user_607_verify_the_functionality_of_export_to_excel_button() throws Throwable {
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
							javascriptHelper.scrollIntoView(
									javascriptHelper
										.executeScriptWithWebElement("document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')[" + j + "]"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelectorAll('p-dropdown[placeholder=\"Export\"]')[" + j + "]").click();
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
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("exportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 post clicking on Export to Excel button system should download the Excel file of that records")
	public void user_607_post_clicking_on_export_to_excel_button_system_should_download_the_excel_file_of_that_records() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("IncomeFormDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				SoftAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}
	
	@And("User_607 to verify the functionality of Back button under Customer Financials tab income")
	public void user_607_to_verify_the_functionality_of_back_button_under_customer_financials_tab_income() throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement backBtn = javascriptHelper.executeScriptWithWebElement(
						CDAppDataEntryCFIncomeDetailsJSPath.getElement("customerFinancialsTabBackBtn"));
				actions.scrollToElement(backBtn).build().perform();
				backBtn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}


	@And("User_607 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen")
	public void user_607_post_clicking_on_back_button_under_customer_inanacials_tab_system_should_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("customerInfoTitle")));
				javascriptHelper.executeScriptWithWebElement(CDAppDataEntryCFIncomeDetailsJSPath.getElement("customerInfoTitle")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
	
	
	
	
	

}
