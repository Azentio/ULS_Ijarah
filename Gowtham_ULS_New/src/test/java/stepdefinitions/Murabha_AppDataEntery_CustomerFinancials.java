package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_AppDataEntery_CustomerFinancials {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths MubAppDaEnCustomerFinancials = new JSPaths(excelPath, "MubAppDaEnCustomerFinancials", "FieldName", "JSPath");
	
	ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "Living_Expense", "Data Set ID");
	Map<String, String> testData;
	
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	
	
	@Given("User_607 Click Customer Financials tab")
	public void user_607_click_customer_financials_tab() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("CustomerFinancials")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Click edit button in Customer Financials tab")
	public void user_607_click_edit_button_in_customer_financials_tab() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("EditButton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
		}
			}
		
		@Given("User_607 Click edit button in QuationInnfo tab")
		public void user_607_click_edit_button_in_QuationInnfo_tab() {
			for (int i = 0; i < 700; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("EditButton")).click();
					break;
				} catch (Exception e) {
					if (i==699) {
						Assert.fail(e.getMessage());
					}
					}
				}
	}

	@Given("User_607 Click add button in Customer Financials tab")
	public void user_607_click_add_button_in_customer_financials_tab() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}
	
	@Given("User_607 Check Primary Employment Field")
	public void user_607_check_primary_employment_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Primary Employment")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Company Type Field")
	public void user_607_check_company_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Company Type")).isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check ProffesionType Field")
	public void user_607_check_proffesion_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("ProffesionType")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Nature of employment Field")
	public void user_607_check_nature_of_employment_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Nature of employment")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Proffesion Field")
	public void user_607_check_proffesion_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Proffesion")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Statutory authority Field")
	public void user_607_check_statutory_authority_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Statutory authority")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Employment End date Field")
	public void user_607_check_employment_end_date_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Employment End date")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Employer Phone Extension Field")
	public void user_607_check_employer_phone_extension_field() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Remarks")));
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Employer Phone Extension")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check No.Of partners Field")
	public void user_607_check_no_of_partners_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("No.Of partners")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Nature of buisness Field")
	public void user_607_check_nature_of_buisness_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Nature of buisness")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Registerd buisness name Field")
	public void user_607_check_registerd_buisness_name_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Registerd buisness name")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Registerd buisness number Field")
	public void user_607_check_registerd_buisness_number_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Registerd buisness number")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Buisness registration date Field")
	public void user_607_check_buisness_registration_date_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Buisness registration date")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Office premises type Field")
	public void user_607_check_office_premises_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Office premises type")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check Shareholder percentage Field")
	public void user_607_check_shareholder_percentage_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Shareholder percentage")).isDisplayed()) {
			Assert.fail();
		} 
	    
	}

	@Given("User_607 Check No of employes Field")
	public void user_607_check_no_of_employes_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("No of employes")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	@Given("User_607 Check Remarks Field")
	public void user_607_check_remarks_field() {
		if (!javascriptHelper.executeScriptWithWebElement(MubAppDaEnCustomerFinancials.getElement("Remarks")).isDisplayed()) {
			Assert.fail();
		}
	    
	}

	
	
	
	
	
	
	
	
	
	
	
}
