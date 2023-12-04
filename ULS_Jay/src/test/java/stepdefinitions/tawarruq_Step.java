package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
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
	
	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths jsPaths3 = new JSPaths(excelPath, "Murabha_Module", "Murabha_LoginFieldName", "JSPath");
	JSPaths jsPaths4 = new JSPaths(excelPath, "Tawarruq_Module", "Murabha_LoginFieldName", "JSPath");
	JSPaths tawarruq_ADEntry_Income = new JSPaths(excelPath, "Tawarruq_ADEntry_Income", "DataCheckIncome_FieldName", "JSPath");
	JSPaths tawarruq_ADEntry_LivingExpense = new JSPaths(excelPath, "Tawarruq_ADEntry_LivingExpense", "Tawarruq_AppDataEntrylivingExpensefield", "JSPath");
	JSPaths tA_CommodityMaker_AdhocPayment = new JSPaths(excelPath, "TA_CommodityMaker_AdhocPayment", "Tawarruq_CommodityMaker_AdhocPayment", "JSPath");
	JSPaths tA_CommondityMaker_Configuration = new JSPaths(excelPath, "TA_CommondityMaker_Configuratio", "Tawarruq_CommodityMaker_Configuration", "JSPath");
	JSPaths ta_Offering_InterstRateStructure = new JSPaths(excelPath, "TA_Offering_InterstRateStructur", "Tawarruq_Offering_InterestRateStructure", "JSPath");
	
	
	
	
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
	
	//----------Tawarrqu app data entery Living Expenses

	@And("User_610 get the test data set id for DS_AT_TW_AD_LEA_002")
	public void get_the_test_data_set_id_for_DS_AT_TW_AD_LEA_002() {
		testData = Tawarruq_ADEntry_livingExpenses.getTestdata("DS_AT_TW_AD_LEA_002");
		}
		
	@And("User_610 verify the Employer name should be seen")
	public void user_verify_the_employer_name_should_be_seen() throws Throwable {
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
	public void user_verify_the_status_should_be_seen_active() {
	    
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
	public void user_click_the_customer_financials_tab() throws Throwable {
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
	public void user_click_the_pencil_icon_under_customer_financials_tab() throws Throwable {
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
	public void user_verify_the_back_button_available_in_income_list_view_under_customer_financials_tab() throws Throwable {
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
	public void user_verify_add_button_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_nature_of_employement_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_net_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_net_deduction_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_considered_income_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_currency_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_status_field_available_under_income_section_list_view_in_customer_financials_tab() throws Throwable {
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
	public void user_verify_on_clicks_of_list_view_record_details_should_be_populated_in_the_fields_under_income_screen() throws Throwable {
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
	public void user_click_the_back_button_under_income_details_screen() throws Throwable {
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
	public void user_verify_the_functionality_of_add_button_under_income_section_in_customer_financials_tab() throws Throwable {
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
	public void user_post_clicking_on_add_button_system_should_navigate_to_new_income_details_screen() throws Throwable {
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
	public void user_click_search_button_in_income_section_under_customer_financials_tab() throws Throwable {
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
	public void user_verify_the_functionality_of_search_box_with_matching_data_in_income_section() throws Throwable {
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
	public void user_verify_entering_any_matching_value_system_should_display_all_the_possible_matching_records_under_income_section() throws Throwable {
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
	public void user_verify_the_functionality_of_search_box_with_mismatch_data_in_income_section() throws Throwable {
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
	public void user_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_income_section() throws Throwable {
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
	public void user_verify_the_functionality_of_export_to_pdf_button() throws Throwable {
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
	public void user_post_clicking_on_export_to_pdf_button_system_should_download_the_pdf_file_of_that_records() throws Throwable {
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
	public void user_verify_the_functionality_of_export_to_excel_button() throws Throwable {
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
	public void user_post_clicking_on_export_to_excel_button_system_should_download_the_excel_file_of_that_records() throws Throwable {
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
	public void user_to_verify_the_functionality_of_back_button_under_customer_financials_tab() throws Throwable {
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
	public void user_post_clicking_on_back_button_under_customer_inanacials_tab_system_should_navigate_to_the_previous_screen() throws Throwable {
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
	public void user_click_the_field_living_expense() throws Throwable {
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
	public void user_click_the_field_add_button() throws Throwable {
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
	public void user_click_the_field_addbuttonunder_expense_info() throws Throwable {
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
	public void user_verify_the_field_save_button() throws Throwable {
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
	public void user_verify_the_field_back_button() throws Throwable {
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
	public void user_verify_the_field_delete_button() throws Throwable {
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
	public void user_verify_the_field_expense_type() throws IOException {
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
	public void user_verify_the_expected_cost_of_living_field() {
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
	public void user_verify_the_minimum_cost_of_living_field() {
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
	public void user_verify_the_field_amount() throws IOException {
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
	public void user_click_the_customer_name_in_input_field() throws IOException {
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
	public void user_select_the_customer_name_in_under_customer_input() throws IOException {
				 
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
	public void user_select_the_type_in_expese_type_select_box() throws IOException {
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
	public void user_enter_the_amount_in_amount_field() throws IOException {
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
	public void user_save_button_and_validate_the_success_meassage() {
	    
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
	public void user_click_the_adhoc_payment_screen() {
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
	public void user_verify_the_transaction_type_field() throws Throwable {
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
	public void user_verify_the_transaction_againts_field() {
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
	public void user_verify_the_reference_number_field() {
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
	public void user_verify_the_paid_amount_field() {
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
	public void user_click_the_configuration_screen() throws Throwable {
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
	public void user_verify_the_loan_tenure_field_in_financial_details() throws Throwable {
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
	public void user_verify_the_number_of_instalment_field_in_financial_details() {
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
	public void user_verify_the_repay_frequency_field_in_financial_details() {
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
	public void user_verify_the_instalment_rate_of_return_field_in_financial_details() {
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
	public void user_verify_the_total_loan_amount_financed_field_in_financial_details() {
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
	public void user_verify_the_average_account_balance_field_in_financial_details() {
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
	public void user_verify_the_classification_field_in_facility_details() {
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
	public void user_verify_the_product_field_in_facility_details() {
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
	public void user_verify_the_scheme_field_in_facility_details() {
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
	public void user_verify_the_Total_Loan_Amount_Financed_field_in_facility_details() {
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
	public void user_verify_the_loan_tenure_field_total_loan_amount_in_facility_details() {
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
	public void user_verify_the_currency_id_field_in_facility_details() {
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
	public void user_verify_the_eligible_income_field_in_facility_details() {
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
	public void user_verify_the_insurance_amount_field_in_facility_details() {
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
	public void user_verify_the_pre_retirement_emi_field_in_facility_details() {
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
	public void user_verify_the_post_retirement_emi_field_in_facility_details() {
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
	public void user_verify_the_previous_emi_field_in_facility_details() {
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
	public void user_verify_the_previous_outstanding_field_in_facility_details() {
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
	public void user_verify_the_previous_net_realizable_field_in_facility_details() {
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
	public void user_verify_the_pre_retirement_tenure_field_in_facility_details() {
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
	public void user_verify_the_total_offer_amount_field_in_facility_details() {
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
	public void user_verify_the_average_account_balance_field_in_facility_details() {
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
	public void user_verify_the_application_ltv1_field_in_facility_details() {
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
	public void user_verify_the_application_ltv2_field_in_facility_details() {
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
	public void user_click_offering_screen() throws Throwable {
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
	public void user_click_edit_button_in_interest_rate_structure() {
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
	public void user_verify_the_product_field_in_interest_rate_structure() throws Throwable {
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
	public void user_verify_the_rate_definition_field_in_interest_rate_structure() {
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
	public void user_verify_the_interest_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_effective_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_base_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_spread_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_cap_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_floor_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_rbp_adjuster_field_in_interest_rate_structure() {
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
	public void user_verify_the_penalty_rate_field_in_interest_rate_structure() {
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
	public void user_verify_the_penalty_fee_field_in_interest_rate_structure() {
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
	public void user_verify_the_installment_period_field_in_installments() throws Throwable {
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
	public void user_verify_installment_amount_the_field_in_installments() {
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
}
