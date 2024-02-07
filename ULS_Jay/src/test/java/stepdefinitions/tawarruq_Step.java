package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class tawarruq_Step {
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	
	Map<String, String> loginTestData = new HashMap<>();
	
	SoftAssert softAssert = new SoftAssert();
	Actions actions = new Actions(driver);
	
	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths jsPaths3 = new JSPaths(excelPath, "Murabha_Module", "Murabha_LoginFieldName", "JSPath");
	JSPaths jsPaths4 = new JSPaths(excelPath, "Tawarruq_Module", "Murabha_LoginFieldName", "JSPath");
	JSPaths tawarruq_ADEntry_Income = new JSPaths(excelPath, "Tawarruq_ADEntry_Income", "DataCheckIncome_FieldName", "JSPath");
	JSPaths tawarruq_ADEntry_LivingExpense = new JSPaths(excelPath, "Tawarruq_ADEntry_LivingExpense", "Tawarruq_AppDataEntrylivingExpensefield", "JSPath");
	JSPaths tA_CommodityMaker_AdhocPayment = new JSPaths(excelPath, "TA_CommodityMaker_AdhocPayment", "Tawarruq_CommodityMaker_AdhocPayment", "JSPath");
	JSPaths tA_CommondityMaker_Configuration = new JSPaths(excelPath, "TA_CommondityMaker_Configuratio", "Tawarruq_CommodityMaker_Configuration", "JSPath");
	JSPaths ta_Offering_InterstRateStructure = new JSPaths(excelPath, "TA_Offering_InterstRateStructur", "Tawarruq_Offering_InterestRateStructure", "JSPath");
	JSPaths documentdetailsJsPaths = new JSPaths(excelPath, "Tawarrq_DocumentDetails_610", "DocumentDetails_FieldName","JSPath");
	JSPaths tA_employmentDetailsJsPaths = new JSPaths(excelPath, "TA_ADC_EmploymentDetails", "EmploymentDetails_FieldName", "JSPath");
	
	
	ExcelData AppDataIncomeExcelData  = new ExcelData(path,"Tawarruq_ADEntry_Income","DataSet ID");
	ExcelData ad_CustomerFolllowUpDetails_610 = new ExcelData(path, "AD_CustomerFolllowUpDetails_610", "DataSet ID");
	ExcelData Tawarruq_ADEntry_livingExpenses = new ExcelData(path, "Tawarruq_ADEntry_LivingExpenses", "DataSet ID");
	
	Map<String, String> testData;                                           
	
	
	@And("^User_610 get the test data for test case AT_MU_INC_07$")
    public void get_the_test_data_for_test_case_AT_MU_INC_07() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_07");
    }
	
	
	@And("^User_610 get the test data for test case AT_MU_INC_08$")
    public void get_the_test_data_for_test_case_AT_MU_INC_08() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_MU_INC_08");
    }
	
	//------appData Check Document Details 
	
	@And("^User_610 get the test data for test case DS_AT_TW_ADC_DOC_001$")
    public void get_the_test_data_for_test_case_DS_AT_TW_ADC_DOC_001() throws Throwable {
		testData = AppDataIncomeExcelData.getTestdata("DS_AT_TW_ADC_DOC_001");
    }
	
	
	
		
	
	
	
	//   ----------------------   Steps  ----------------------------------
	
	@And("User_610 verify the Employer name should be seen")
	public void user_610_verify_the_employer_name_should_be_seen() throws Throwable {
		Thread.sleep(3000);
		for (int i = 0; i < 200; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("TA_employerName_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
					
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the Status should be seen active")
	public void user_610_verify_the_status_should_be_seen_active() {
	    
		for (int i = 0; i < 200; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("TA_Status_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
					} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	//-----------------------------------  @AT_MU_INC_06
	
	@And("User_610 click the Customer Financials tab")
	public void user_610_click_the_customer_financials_tab() throws Throwable {
		Thread.sleep(1000);
		WebElement customerFinancialsTab = javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("customerFinancialsTab"));
		for (int i = 0; i <= 2000; i++) {
			try {
			//	javascriptHelper.backgroundColor(customerFinancialsTab);
				javascriptHelper.JSEClick(customerFinancialsTab);
//				customerFinancialsTab.click();
				break;
			} catch (Exception e) { 
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 click the pencil icon under Customer Financials tab")
	public void user_610_click_the_pencil_icon_under_customer_financials_tab() throws Throwable {
		Thread.sleep(100);
		WebElement customerFinancialsPencilEditBtn = javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("customerFinancialsPencilEditBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
			//	javascriptHelper.backgroundColor(customerFinancialsPencilEditBtn);
				javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("customerFinancialsPencilEditBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(100);
	}	
	
	@And("User_610 verify the Back button available in Income list view under Customer Financials tab")
	public void user_610_verify_the_back_button_available_in_income_list_view_under_customer_financials_tab() throws Throwable {
		WebElement backBtn = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("customerFinancialsTabBackBtn"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(backBtn);
		//		javascriptHelper.backgroundBorder(backBtn);
				backBtn.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify Add button available under Income section list view in Customer Financials tab")
	public void user_610_verify_add_button_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
			//				javascriptHelper.backgroundBorder(javascriptHelper
			//						.executeScriptWithWebElement(
			//								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]"));							
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
	
	@And("User_610 verify Nature of Employement field available under Income section list view in Customer Financials tab")
	public void user_610_verify_nature_of_employement_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement natureOfEmployment = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("listview_NatureOfEmployment"));
		for (int i = 0; i <= 1000; i++) {
			try {
		//		javascriptHelper.backgroundColor(natureOfEmployment);
				natureOfEmployment.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify Net Income field available under Income section list view in Customer Financials tab")
	public void user_610_verify_net_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement netIncome = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("listview_NetIncome"));
		for (int i = 0; i <= 1000; i++) {
			try {
		//		javascriptHelper.backgroundColor(netIncome);
				netIncome.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify Net Deduction field available under Income section list view in Customer Financials tab")
	public void user_610_verify_net_deduction_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement netDeduction = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("listview_NetDeduction"));
		for (int i = 0; i <= 1000; i++) {
			try {
		//		javascriptHelper.backgroundColor(netDeduction);
				netDeduction.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify Considered Income field available under Income section list view in Customer Financials tab")
	public void user_610_verify_considered_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement consideredIncome = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("listview_ConsideredIncome"));
		for (int i = 0; i <= 1000; i++) {
			try {
		//		javascriptHelper.backgroundColor(consideredIncome);
				consideredIncome.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify Currency field available under Income section list view in Customer Financials tab")
	public void user_610_verify_currency_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement currency = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("listview_Currency"));
		for (int i = 0; i <= 1000; i++) {
			try {
			//	javascriptHelper.backgroundColor(currency);
				currency.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify Status field available under Income section list view in Customer Financials tab")
	public void user_610_verify_status_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement status = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("listview_Status"));
		for (int i = 0; i <= 1000; i++) {
			try {
		//		javascriptHelper.backgroundColor(status);
				status.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_610 verify on clicks of list view record, details should be populated in the fields under Income screen")
	public void user_610_verify_on_clicks_of_list_view_record_details_should_be_populated_in_the_fields_under_income_screen() throws Throwable {
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
					//		javascriptHelper.backgroundColor(
					//				javascriptHelper.executeScriptWithWebElement(
					//						"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "].parentElement.parentElement.parentElement.nextElementSibling.querySelector(\'table tbody tr td button[icon=\"pi pi-eye\"]')"));
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
	
	@And("User_610 click the Back button under Income details screen")
	public void user_610_click_the_back_button_under_income_details_screen() throws Throwable {
		Thread.sleep(2000);
		WebElement incomeBackBtn = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("incomeBackBtn"));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(incomeBackBtn);
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 verify the functionality of Add button under Income section in Customer Financials tab")
	public void user_610_verify_the_functionality_of_add_button_under_income_section_in_customer_financials_tab() throws Throwable {
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
	
	@And("User_610 post clicking on Add button system should navigate to new Income details screen")
	public void user_610_post_clicking_on_add_button_system_should_navigate_to_new_income_details_screen() throws Throwable {
		WebElement incomeScreenTitle = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("incomeScreenTitle"));
		for (int i = 0; i <= 100000; i++) {
			try {
		//		javascriptHelper.backgroundBorder(incomeScreenTitle);
				incomeScreenTitle.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 100000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
            //-------------------------------------	@AT_MU_INC_07
	
	@And("User_610 click Search button in Income section under Customer Financials tab")
	public void user_610_click_search_button_in_income_section_under_customer_financials_tab() throws Throwable {
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

	@And("User_610 verify the functionality of Search box with matching data in Income section")
	public void user_610_verify_the_functionality_of_search_box_with_matching_data_in_income_section() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("incomeSectionSearchbox"))
				.sendKeys(testData.get("Currency"));
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_610 verify entering any matching value system should display all the possible matching records under Income section")
	public void user_610_verify_entering_any_matching_value_system_should_display_all_the_possible_matching_records_under_income_section() throws Throwable {
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
			//	javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)>0);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_610 verify the functionality of Search box with mismatch data in Income section")
	public void user_610_verify_the_functionality_of_search_box_with_mismatch_data_in_income_section() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("incomeSectionSearchbox")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("incomeSectionSearchbox"))
				.sendKeys(testData.get("Mismatched Currency"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_610 verify system should not display any records or system should display the message as No data found under Income section")
	public void user_610_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_income_section() throws Throwable {
		Thread.sleep(1000);
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
			//	javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				Assert.assertTrue(Integer.parseInt(text)==0);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
                //	--------------------------------------------   @AT_TW_AD_INC_08
	
	
	@And("User_610 verify the functionality of Export to PDF button")
	public void user_610_verify_the_functionality_of_export_to_pdf_button() throws Throwable {
		Thread.sleep(200);
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
			for (int k = 0; k <= 1000; k++) {
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
					if (k == 1000) {
						Assert.fail(e.getMessage());
					}
				}

			}
			if (isAddButtonClicked == true) {
				break;
			}
		}
	}
	
	@And("User_610 post clicking on Export to PDF button system should download the PDF file of that records")
	public void user_610_post_clicking_on_export_to_pdf_button_system_should_download_the_pdf_file_of_that_records() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("exportPDF")).click();
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
				softAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}
	
	@And("User_610 verify the functionality of Export to Excel button")
	public void user_610_verify_the_functionality_of_export_to_excel_button() throws Throwable {
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
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("exportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 post clicking on Export to Excel button system should download the Excel file of that records")
	public void user_610_post_clicking_on_export_to_excel_button_system_should_download_the_excel_file_of_that_records() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("IncomeFormDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("IncomeFormDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}
	
	
	@And("User_610 to verify the functionality of Back button under Customer Financials tab")
	public void user_610_to_verify_the_functionality_of_back_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("customerFinancialsTabBackBtn")));
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("customerFinancialsTabBackBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
      
				}
			}
		}	    
	}
	
	@And("User_610 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen")
	public void user_610_post_clicking_on_back_button_under_customer_inanacials_tab_system_should_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i <= 3000; i++) {
			try {
			//	javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("customerInfoTitle")));
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_Income.getElement("customerInfoTitle")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	
	//------------------------ @AT_TW_AD_LEA_001
	
	@And("User_610 click the field livingExpense")
	public void user_610_click_the_field_living_expense() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("livingExpense")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("livingExpense")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		   	}
		
	@And("User_610 click the field AddButton")
	public void user_610_click_the_field_add_button() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AddButton")));
	    for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
			}

	   
	@And("User_610 click the field AddbuttonunderExpenseInfo")
	public void user_610_click_the_field_addbuttonunder_expense_info() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AddbuttonunderExpenseInfo")));
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("AddbuttonunderExpenseInfo")).click();
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
			   	}
		
	@And("User_610 verify the field saveButton")
	public void user_610_verify_the_field_save_button() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("saveButton")));
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("saveButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
			
			
	@And("User_610 verify the field BackButton")
	public void user_610_verify_the_field_back_button() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("BackButton")));
		
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("BackButton")).isDisplayed());
				break;
				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
					}  
			          }
			         	}
	
	@And("User_610 verify the field DeleteButton")
	public void user_610_verify_the_field_delete_button() throws Throwable {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("DeleteButton")));
		for (int i = 0; i < 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("DeleteButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
			  	}
	
	
	@And("User_610 verify the field ExpenseType")
	public void user_610_verify_the_field_expense_type() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpenseType")));
		for (int i = 0; i < 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("ExpenseType")).isDisplayed());
				
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
				
	}
	
	@And("User_610 verify the ExpectedCostOfLiving field")
	public void user_610_verify_the_expected_cost_of_living_field() {
		for (int i = 0; i < 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("ExpectedCostOfLiving")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
			}
		
	
	@And("User_610 Verify the MinimumCostOfLiving Field")
	public void user_610_verify_the_minimum_cost_of_living_field() {
		for (int i = 0; i < 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("ExpectedCostOfLiving")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	   	}
		
	
	@And("User_610 verify the field Amount")
	public void user_610_verify_the_field_amount() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Amount")));
		for (int i = 0; i < 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("Amount")).isDisplayed());
				
				break;
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	   	}
	
	//-------------------------------------------------- @AT_TW_AD_LEA_002
	
	
	@And("User_610 click the CustomerName in input field")
	public void user_610_click_the_customer_name_in_input_field() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("CustomerName")));
		
		for (int i = 0; i <= 300; i++) {

			try {

				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("CustomerName")).click();
			break;
			} catch (Exception e) {
			if (i == 300) {
			Assert.fail(e.getMessage());
			}
			}
			}	
	}
	
	@And("User_610 select the CustomerName in under customerInput")
	public void user_610_select_the_customer_name_in_under_customer_input() throws IOException {
				 
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
			System.out.println("String "+dropdownString.trim());
			System.out.println("Map "+testData.get("ClientName").trim());  //--------
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ClientName")).trim())) {			 
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
			waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("ExpenseType")));
			javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("ExpenseType")).click();
	}
	
	@And("User_610 select the type in expeseType select box")
	public void user_610_select_the_type_in_expese_type_select_box() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpenseTypeInput")));
		for (int i = 0; i <= 300; i++) {

			try {

				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("ExpenseTypeInput")).click();
			break;
			} catch (Exception e) {
			if (i == 300) {
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
			System.out.println("String "+dropdownString.trim());
			
			System.out.println("Map "+"FOOD".trim());                        //---------------------
			if ((dropdownString.trim()).equalsIgnoreCase(("FOOD").trim())) {			 
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
	
	@And("User_610 Enter the Amount in Amount field")
	public void user_610_enter_the_amount_in_amount_field() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("AmountInput")));
		for (int i = 0; i < 200; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("AmountInput")).sendKeys(testData.get("Amount"));
				javascriptHelper.executeScriptWithWebElement(tawarruq_ADEntry_LivingExpense.getElement("AmountInput")).sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	    	}
	
	@And("User_610 save button and validate the success meassage")
	public void user_610_save_button_and_validate_the_success_meassage() {
	    
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("saveBtn_610")).click();
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
			
	
	for (int i = 0; i < 400; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==399) {
				Assert.fail(e.getMessage());
			}
	                           	}
	                     }
	
            }

	
	//-------------- Tawarruq Commodity Maker Adhoc Payment --   @AT_TW_CSM_09

	  
	
	
	@And("User_610 click the Adhoc Payment Screen")
	public void user_610_click_the_adhoc_payment_screen() {
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tA_CommodityMaker_AdhocPayment.getElement("AdhocPayment_610")).click();
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_610 verify the Transaction Type field")
	public void user_610_verify_the_transaction_type_field() throws Throwable {
		WebElement TA_transactionType = javascriptHelper.executeScriptWithWebElement(tA_CommodityMaker_AdhocPayment.getElement("TransactionType_610"));
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.backgroundColor(TA_transactionType);
				javascriptHelper.executeScriptWithWebElement(tA_CommodityMaker_AdhocPayment.getElement("TransactionType_610")).isDisplayed();
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
		                           	}
	//		  Thread.sleep(3000);
		                     }
	}

	@And("User_610 verify the Transaction Againts field")
	public void user_610_verify_the_transaction_againts_field() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommodityMaker_AdhocPayment.getElement("TransactionAgainst_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
		                           	}
		                     }
	}

	@And("User_610 verify the Reference Number field")
	public void user_610_verify_the_reference_number_field() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommodityMaker_AdhocPayment.getElement("ReferenceNumber_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
		                           	}
		                     }
	}

	@And("User_610 verify the Paid Amount field")
	public void user_610_verify_the_paid_amount_field() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommodityMaker_AdhocPayment.getElement("PaidAmount_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
		                           	}
		                     }
	}
	
	//------------------------------------  Tawarruq Commodity Configuration  @AT_TW_CSM_06   finance details 
	
	@And("User_610 click the Configuration Screen")
	public void user_610_click_the_configuration_screen() throws Throwable {
		Thread.sleep(2000);
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("Configuration_610")).click();
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 verify the Loan Tenure field in Financial Details")
	public void user_610_verify_the_loan_tenure_field_in_financial_details() throws Throwable {
		Thread.sleep(2000);
		//javascriptHelper.scrollIntoView(javascriptHelper
				//.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("FinanceDetailsScreenScroll_610")));
	
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("loanTenure_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
		                           	
	}

	@And("User_610 verify the Number Of Instalment field in Financial Details")
	public void user_610_verify_the_number_of_instalment_field_in_financial_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("NumberOfInstalments_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Repay Frequency field in Financial Details")
	public void user_610_verify_the_repay_frequency_field_in_financial_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("RepayFrequency_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Instalment Rate Of Return field in Financial Details")
	public void user_610_verify_the_instalment_rate_of_return_field_in_financial_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("InternalRateOfReturn_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Total Loan Amount Financed field in Financial Details")
	public void user_610_verify_the_total_loan_amount_financed_field_in_financial_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("TotalLoanAmountFinanced_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Average Account balance field in Financial Details")
	public void user_610_verify_the_average_account_balance_field_in_financial_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("AverageAccountBalance_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}
	
	//----------------   @AT_TW_CSM_06   facility details   
	
	
	@And("User_610 verify the Classification field in Facility Details")
	public void user_610_verify_the_classification_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("Classification_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Product field in Facility Details")
	public void user_610_verify_the_product_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("product_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Scheme field in Facility Details")
	public void user_610_verify_the_scheme_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("Scheme_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}
	
	@And("User_610 verify the Total Loan Amount Financed field in Facility Details")
	public void user_610_verify_the_Total_Loan_Amount_Financed_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("TotalLoanAmountFinanced_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}
	
	

	@And("User_610 verify the Loan Tenure field Total loan amount in Facility Details")
	public void user_610_verify_the_loan_tenure_field_total_loan_amount_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("FD_LoanTenure_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Currency ID field in Facility Details")
	public void user_610_verify_the_currency_id_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("CurrencyId_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Eligible Income field in Facility Details")
	public void user_610_verify_the_eligible_income_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("EligibleIncome_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Insurance Amount field in Facility Details")
	public void user_610_verify_the_insurance_amount_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("InsuranceAmount_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Pre Retirement Emi field in Facility Details")
	public void user_610_verify_the_pre_retirement_emi_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("PreRetirementEMI_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Post Retirement Emi field in Facility Details")
	public void user_610_verify_the_post_retirement_emi_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("PostRetirementEMI_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Previous Emi field in Facility Details")
	public void user_610_verify_the_previous_emi_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("PreviousEMI_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Previous Outstanding field in Facility Details")
	public void user_610_verify_the_previous_outstanding_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("PreviousOutstanding_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Previous Net Realizable field in Facility Details")
	public void user_610_verify_the_previous_net_realizable_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("PreviousNetRealizable_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Pre Retirement Tenure field in Facility Details")
	public void user_610_verify_the_pre_retirement_tenure_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("PreRetirementTenure_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Total Offer Amount field in Facility Details")
	public void user_610_verify_the_total_offer_amount_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("TotalOfferAmount_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Average Account Balance field in Facility Details")
	public void user_610_verify_the_average_account_balance_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("AverageAccountBalance_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify the Application Ltv1 field in Facility Details")
	public void user_610_verify_the_application_ltv1_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("ApplicableLTV1_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}
	
	@And("User_610 verify the Application Ltv2 field in Facility Details")
	public void user_610_verify_the_application_ltv2_field_in_facility_details() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(tA_CommondityMaker_Configuration.getElement("ApplicableLTV2_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}
	
	//---------------------------- tawarruq Offering - offering Stage - Interest Rate Structure  @AT_TW_OFO_13

	  
	@And("User_610 click Offering Screen")
	public void user_610_click_offering_screen() throws Throwable {
		Thread.sleep(2000);
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("OfferDetailsScreen_610")).click();
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 click edit button in Interest Rate Structure")
	public void user_610_click_edit_button_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("EditBtn_610")).click();
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 verify the Product field in Interest Rate Structure")
	public void user_610_verify_the_product_field_in_interest_rate_structure() throws Throwable {
		Thread.sleep(2000);
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("Product_610")));
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("Product_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Rate Definition field in Interest Rate Structure")
	public void user_610_verify_the_rate_definition_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("RateDefinition_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Interest Rate field in Interest Rate Structure")
	public void user_610_verify_the_interest_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("InterestRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Effective Rate field in Interest Rate Structure")
	public void user_610_verify_the_effective_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("EffectiveRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Base Rate field in Interest Rate Structure")
	public void user_610_verify_the_base_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("BaseRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Spread Rate field in Interest Rate Structure")
	public void user_610_verify_the_spread_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("SpreadRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Cap Rate field in Interest Rate Structure")
	public void user_610_verify_the_cap_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("CapRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Floor Rate field in Interest Rate Structure")
	public void user_610_verify_the_floor_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("FloorRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the RBP Adjuster field in Interest Rate Structure")
	public void user_610_verify_the_rbp_adjuster_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("RBPAdjuster_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Penalty Rate field in Interest Rate Structure")
	public void user_610_verify_the_penalty_rate_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("PenaltyRate_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}

	@And("User_610 verify the Penalty Fee field in Interest Rate Structure")
	public void user_610_verify_the_penalty_fee_field_in_interest_rate_structure() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("PenaltyFee_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	    
	}
	
	@And("User_610 verify the installment Period field in installments")
	public void user_610_verify_the_installment_period_field_in_installments() throws Throwable {
		Thread.sleep(2000);
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("InstallmentPeriod_610")));
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("InstallmentPeriod_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}

	@And("User_610 verify Installment Amount the field in installments")
	public void user_610_verify_installment_amount_the_field_in_installments() {
		for (int i = 0; i < 400; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(ta_Offering_InterstRateStructure.getElement("InstallmentAmount_610")).isDisplayed());
				Assert.assertTrue(true);
				break;
			} catch (Exception e) {
				if (i==399) {
					Assert.fail(e.getMessage());
				}  }  }
	}
	
	//-----------------  @AT_TW_ADC_DOC_001
	
	
	@And("Navigate to Document details section")
	public void navigate_to_document_details_section() {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("nextBtn")).click();
				break;
			} catch (Exception e) {
				
			}
		}
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentDetails_Button")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@And("click on Eye icon of exsting record in document details")
	public void click_on_eye_icon_of_exsting_record_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("EditIcon")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("Validate the Customer name field is displayed in document details")
	public void validate_the_customer_name_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("CustomerName")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("CustomerName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document name field is displayed in document details")
	public void validate_the_document_name_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentName")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentName")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Required at stage field is displayed in document details")
	public void validate_the_required_at_stage_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStage")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RequiredAtStage"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document status field is displayed in document details")
	public void validate_the_document_status_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatus")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentStatus"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Mandatory optional field is displayed in document details")
	public void validate_the_mandatory_optional_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("MandatoryOptional")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("MandatoryOptional"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document category field is displayed in document details")
	public void validate_the_document_category_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentCategory")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentCategory"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("Validate the Upload date field is displayed in document details")
	public void validate_the_upload_date_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("UploadDate")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("UploadDate")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Expected receipt date field is displayed in document details")
	public void validate_the_expected_receipt_date_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExpectedReceiptDate")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ExpectedReceiptDate"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Deferred stage field is displayed in document details")
	public void validate_the_deferred_stage_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DeferralStage")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DeferralStage")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Def approved by field is displayed in document details")
	public void validate_the_def_approved_by_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DefApprovedBy")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DefApprovedBy")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Change in nature approved by field is displayed in document details")
	public void validate_the_change_in_nature_approved_by_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ChangeInNatureApprovedBy")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ChangeInNatureApprovedBy"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document form field is displayed in document details")
	public void validate_the_document_form_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentForm")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentForm")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document quality field is displayed in document details")
	public void validate_the_document_quality_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				//		.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentQuality")));
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentQuality")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentQuality"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document reference number field is displayed in document details")
	public void validate_the_document_reference_number_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReferenceNumber")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReferenceNumber"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Document received by field is displayed in document details")
	public void validate_the_document_received_by_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReceivedBy")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DocumentReceivedBy"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Location field is displayed in document details")
	public void validate_the_location_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LocationWhereReceived")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LocationWhereReceived"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Rack No field is displayed in document details")
	public void validate_the_rack_no_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RackNo")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("RackNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Shelf No field is displayed in document details")
	public void validate_the_shelf_no_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ShelfNo")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ShelfNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Box No is displayed in document details")
	public void validate_the_box_no_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				WebElement boxNo = javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BoxNo"));
				javascriptHelper.scrollIntoView(boxNo);
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BoxNo")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Date of Expiry field is displayed in document details")
	public void validate_the_date_of_expiry_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("DateOfExpiry")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Lodgement amount field is displayed in document details")
	public void validate_the_lodgement_amount_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("LodgementAmount"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate the Remarks field is displayed in document details")
	public void validate_the_remarks_field_is_displayed_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("Remarks")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("Remarks")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Back button functionality in document details")
	public void validate_back_button_functionality_in_document_details() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BackButton")));
				// javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("BackButton")).click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	//-------------------- @AT_TW_ADC_DOC_002
	
	
	@And("Validate Document name field is present in Document details view list")
	public void validate_document_name_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_DocumentNameField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_DocumentNameField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Required at stage field is present in Document details view list")
	public void validate_required_at_stage_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_RequredAtStageField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_RequredAtStageField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Document Status field is present in Document details view list")
	public void validate_document_status_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_DocumentStatusField")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("ViewList_DocumentStatusField"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate MandatoryOptional field is present in Document details view list")
	public void validate_mandatory_optional_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_MandatoryOptionalField")));
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										documentdetailsJsPaths.getElement("ViewList_MandatoryOptionalField"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate Document Category field is present in Document details view list")
	public void validate_document_category_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
						documentdetailsJsPaths.getElement("ViewList_DocumentCategoryField")));
				Assert.assertTrue(
						javascriptHelper
								.executeScriptWithWebElement(
										documentdetailsJsPaths.getElement("ViewList_DocumentCategoryField"))
								.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("Validate DMS Upload status field is present in Document details view list")
	public void validate_dms_upload_status_field_is_present_in_document_details_view_list() {
		for (int i = 0; i <= 1000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("VierList_DMSUploadStatus")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(documentdetailsJsPaths.getElement("VierList_DMSUploadStatus"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	
	@And("Click on Search icon in Document details")
	public void click_on_search_icon_in_document_details() {
		System.out.println(documentdetailsJsPaths.getElement("SearchButton"));
		WebElement searchButton = javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchButton"));
		for (int i = 0; i <= 1000; i++) {
			try {
				searchButton.click();
				//javascriptHelper.JSEClick(searchButton);
				//javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SaveIcon")).click();
				break;
			} catch (Exception e) { 
				
			}
		}
		
	}
	
	
	@And("Search the murabha document details value with valid data")
	public void search_the_murabha_document_details_value_with_valid_data() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput")));
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 500; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys("no");

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + documentdetailsJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertFalse(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));

	}
		
	@And("Search the murabha document details value with Invalid data")
	public void search_the_murabha_document_details_value_with_invalid_data() {
		String documentDetailsSearchResult = "";
		for (int i = 0; i <= 1; i++) {
			try {
//				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("financialCommitmentSearchInput"))
//				.sendKeys("USD");
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.getElement("SearchInput"))
						.sendKeys("noo");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + documentdetailsJsPaths.getElement("listViewSearchResultValidation"))
						.toString();
				if(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"))
				{
				break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	}
	
	
	
	//----------------------------   @AT_MU_EDC_01    --------------------------------
	
	
	@And("User_610 click search button Customer Financials tab")
	public void user_610_click_search_button_customer_financials_tab() {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("User_610 verify Primary Employment field available under Employment details screen")
	public void user_610_verify_primary_employment_field_available_under_employment_details_screen() throws Throwable {
		Thread.sleep(500);
		WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("primaryEmploymentLabel"));
		WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Primary Employment label");
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		verify primary employment as "Yes"
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(toggleBtn.getAttribute("aria-checked").contains("true"), "Primary Employment selected 'YES'");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_610 verify Back button available under Employment details screen")
	public void user_610_verify_back_button_available_under_employment_details_screen() throws Throwable {
		WebElement backBtn = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("customerEmploymentBackBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				Assert.assertTrue(backBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
			@And("User_610 verify Employment Period field available under Employment details screen")
			public void user_610_verify_employment_period_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employmentPeriodLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employment Period label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	 		
			}
			
			
			@And("User_610 verify Nature of Employment field available under Employment details screen")
			public void user_610_verify_nature_of_employment_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("natureOfEmploymentLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Nature of Employment label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

			@And("User_610 verify Company Type field available under Employment details screen")
			public void user_610_verify_company_type_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("companyTypeLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("companyTypeDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Company Type label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Profession field available under Employment details screen")
			public void user_610_verify_profession_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("professionLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("professionDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Profession label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Profession Type field available under Employment details screen")
			public void user_610_verify_profession_type_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("professionTypeLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("professionTypeDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Profession Type label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Statutory Authority field available under Employment details screen")
			public void user_610_verify_statutory_authority_field_available_under_employment_details_screen() throws Throwable {
				
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("statutoryAuthorityLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("statutoryAuthorityDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Statutory Authority label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Employer Name field available under Employment details screen")
			public void user_610_verify_employer_name_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerNameLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerNameDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employer Name label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Employer Name if Others field available under Employment details screen")
			public void user_610_verify_employer_name_if_others_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerNameOthersLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerNameOthersInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employer Name if(Others) label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	
			}

			@And("User_610 verify Employee ID field available under Employment details screen")
			public void user_610_verify_employee_id_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employeeIDLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employeeIDInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employee ID label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			
			@And("User_610 verify Date of Joining field available under Employment details screen")
			public void user_610_verify_date_of_joining_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("dateOfJoiningLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerNameOthersLabel")));
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Date of Joining label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}		
			}

			@And("User_610 verify Employment End Date field available under Employment details screen")
			public void user_610_verify_employment_end_date_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employmentEndDateLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employment End Date label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Department field available under Employment details screen")
			public void user_610_verify_department_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("departmentLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("departmentDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Department label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Designation field available under Employment details screen")
			public void user_610_verify_designation_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("designationLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("designationDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Designation label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Employment Type field available under Employment details screen")
			public void user_610_verify_employment_type_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employmentTypeLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employment Type label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	
			}

			@And("User_610 verify Direct Manager Contact Number Extension field available under Employment details screen")
			public void user_610_verify_direct_manager_contact_number_extension_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("directManagerContactNbrLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Direct Manager Contact Number label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Direct Manager Telephone field available under Employment details screen")
			public void user_610_verify_direct_manager_telephone_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("directManagerTelephoneLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Direct Manager Telephoner label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Income Paymode field available under Employment details screen")
			public void user_610_verify_income_paymode_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("incomePaymodeLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("incomePaymodeDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Income Paymode label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Employer Phone Extension field available under Employment details screen")
			public void user_610_verify_employer_phone_extension_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerPhoneExLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerPhoneExInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employer Phone Extension label");
										break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Employer Phone Number field available under Employment details screen")
			public void user_610_verify_employer_phone_number_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerPhoneNbrLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employer Phone Number label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify State field available under Employment details screen")
			public void user_610_verify_state_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("stateLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("stateDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"State label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify City field available under Employment details screen")
			public void user_610_verify_city_field_available_under_employment_details_screen() throws Throwable {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("cityLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("cityDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"City label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}
			
			@And("User_610 verify Pincode field available under Employment details screen")
			public void user_610_verify_pincode_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("pincodeLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("pincodeInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Pincode label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Sector field available under Employment details screen")
			public void user_610_verify_sector_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("sectorLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("sectorDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Sector label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Industry Sub Sector field available under Employment details screen")
			public void user_610_verify_industry_sub_sector_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("subSectorLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("subSectorDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Industry Sub Sector label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify No Of Partners field available under Employment details screen")
			public void user_610_verify_no_of_partners_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("noOfPartnersLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("noOfPartnersInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"No Of Partners label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Nature of Business field available under Employment details screen")
			public void user_610_verify_nature_of_business_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("natureOfBusinessLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("natureOfBusinessDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.scrollIntoView(label);
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Nature of Business label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Registered Business Name field available under Employment details screen")
			public void user_610_verify_registered_business_name_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("regBusinessNameLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("regBusinessNameInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Registered Business Name label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Registered Business Number field available under Employment details screen")
			public void user_610_verify_registered_business_number_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("regBusinessNbrLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("regBusinessNbrInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Registered Business Number label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Business Registration Date field available under Employment details screen")
			public void user_610_verify_business_registration_date_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("businessRegisteredDateLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("businessRegisteredDateCalender"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Registered Business Date label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Office Premises Type field available under Employment details screen")
			public void user_610_verify_office_premises_type_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("officePremisesTypeLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("officePremisesTypeDropdown"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Office Premises Type label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

			@And("User_610 verify Share Holder Percentage field available under Employment details screen")
			public void user_610_verify_share_holder_percentage_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("shareHolderPercentLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("shareHolderPercentInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Share Holder Percentage label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

			@And("User_610 verify No of Employees field available under Employment details screen")
			public void user_610_verify_no_of_employees_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("numberOfEmployeesLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("numberOfEmployeesInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"No of Employees label");
					
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Experience At Current Employment field available under Employment details screen")
			public void user_610_verify_experience_at_current_employment_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Experience At Current Employment label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Direct Manager Name field available under Employment details screen")
			public void user_610_verify_direct_manager_name_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("directManagerNameLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("directManagerNameInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Direct Manager Name label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Employer City Code field available under Employment details screen")
			public void user_610_verify_employer_city_code_field_available_under_employment_details_screen() {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerCityCodeLabel")));
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerCityCodeLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("employerCityCodeInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Employer City Code label");
						
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}
			
			@And("User_610 verify Retirement Age field available under Employment details screen")
			public void user_610_verify_retirement_age_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("retirementAgeLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("retirementAgeInput"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Retirement Age label");
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			@And("User_610 verify Remarks field available under Employment details screen")
			public void user_610_verify_remarks_field_available_under_employment_details_screen() {
				WebElement label = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("remarksLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("remarksTextarea"));
				for (int i = 0; i <= 2000; i++) {
					try {
						javascriptHelper.backgroundColor(label);
						softAssert.assertTrue(label.isDisplayed(),"Remarks label");
						break;
					} catch (Exception e) {
						if (i == 2000) {
							Assert.fail(e.getMessage());
						}
					}
				}	    
			}

			
			@And("User_610 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage")
			public void user_610_invoke_soft_assert_in_employment_details_screen_under_customer_financials_tab_at_data_check_stage() throws Throwable {
			    softAssert.assertAll();
			}
	
	
			@And("User_610 click the Customer Financials tab Al")
			public void user_610_click_the_customer_financials_tab_al() {
				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("CustomerFinanceTab")).click();
						break;
						
					} catch (Exception e) {
						if (i==299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			    
			}

			@And("User_610 click and enter Business  in search button")
			public void user_610_click_and_enter_business_in_search_button() {								
				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("searchInputTA")).sendKeys("business");
						break;
						} catch (Exception e) {
						if (i==299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			    
			}
	
	
			@And("User_610 click view button Customer Financials tab Al")
			public void user_610_click_view_button_customer_financials_tab_al() {
				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("viewBtnTA")).click();
						break;
						
					} catch (Exception e) {
						if (i==299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			
			
//--------------------------------------------- @AT_TW_ADC_EDC_02
			
			@And("User_610 click and enter pensioner in search button")
			public void user_610_click_and_enter_pensioner_in_search_button() {
			    							
				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("searchInputTA")).sendKeys("pensioner");
						break;
						} catch (Exception e) {
						if (i==299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
				
			}
	
	
			
			//---------------------------------------------  @AT_TW_ADC_EDC_03
			
			@And("User_610 click and enter Company Firm  in search button")
			public void user_610_click_and_enter_Company_Firm_in_search_button() {
								
				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(tA_employmentDetailsJsPaths.getElement("searchInputTA")).sendKeys("Company");
						break;
						} catch (Exception e) {
						if (i==299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			    
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
