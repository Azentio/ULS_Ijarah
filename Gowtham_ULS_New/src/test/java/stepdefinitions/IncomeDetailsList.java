package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IncomeDetailsList {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths IncomeDetailsListPaths = new JSPaths(excelPath, "IncomeDetailsList", "Ijara_FieldName", "JSPath");
	
	ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "IncomeDetailsList", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	@Given("User_607 Update testdata from AT_INC_01")
	public void user_update_testdata_from_at_inc() {
		testData = IncomeDetailsListexelData.getTestdata("DS_AT_INC_01");
	}

	@Given("User_607 Click module name in home screen")
	public void user_click_module_name_in_home_screen() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("moduleName")).click();
				break;
			} catch (Exception e) {
			}
			
		}
	}

	@Given("User_607 Select LOS in the module name")
	public void user_select_los_in_the_module_name() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("selectLOS")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@Given("User_607 Click inbox in the home page")
	public void user_click_inbox_in_the_home_page() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("inbox"))
						.click();
				break;
			} catch (Exception e) {
			}

		}
	}
	
	@Given("User_607 Click Search in inbox")
	public void user_Click_search_in_inbox() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("clickSearchInInbox")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 Search in the search box")
	public void user_search_in_the_search_box() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("searchInInbox")).sendKeys("Gowtham",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Select record after search")
	public void user_select_record_after_search() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("selectRecord")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Click Customer Finacials in the record")
	public void user_click_customer_finacials_in_the_record() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("CustomerFinacials")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Click edit button customer personal information")
	public void user_click_edit_button_customer_personal_information() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("edit")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Click Add button in income")
	public void user_click_add_button_in_income() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("AddButtonInIncome")).click();
				break;
			} catch (Exception e) {
				
				}
			}	
		}
	    
	@Given("User_607 Check Employment Type Field")
	public void user_check_employment_type_field() throws Throwable {
		Thread.sleep(7000);
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Employment Type")).isDisplayed()) {
			SoftAssert.fail("Check Employment Type Field");
		}
	}

	@Given("User_607 Check saveButton")
	public void user_check_save_button() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("saveButton")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Lumpsum Amount field")
	public void user_check_lumpsum_amount_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Lumpsum Amount")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}


	@Given("User_607 Check Financial Year")
	public void user_check_financial_year() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Financial Year")).isDisplayed()) {
			SoftAssert.fail();
		}
		
	}

	@Given("User_607 Check Filing Date")
	public void user_check_filing_date() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Filing Date")).isDisplayed()) {
			SoftAssert.fail();
		}
		
		
	}
	
	@Given("User_607 Check Income field")
	public void user_check_income_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Income")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Frequency field")
	public void user_check_frequency_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Frequency")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Amount field")
	public void user_check_amount_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Amount")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Defined field")
	public void user_check_defined_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Defined")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Adjusted field")
	public void user_check_adjusted_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Adjusted")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Amount Considered field")
	public void user_check_amount_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Amount Considered")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Action field")
	public void user_check_action_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Action")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Total Income field")
	public void user_check_total_income_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Total Income")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Total Income Considered field")
	public void user_check_total_income_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Total Income Considered")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Salary Credited To Bank field")
	public void user_check_salary_credited_to_bank_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Salary Credited To Bank")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction field")
	public void user_check_deduction_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Deduction")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Amt field")
	public void user_check_deduction_amt_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Deduction Amt")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Def field")
	public void user_check_deduction_def_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Deduction Def")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Adj field")
	public void user_check_deduction_adj_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Deduction Adj")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Deduction Considered field")
	public void user_check_deduction_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Deduction Considered")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Total Deduction field")
	public void user_check_total_deduction_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Total Deduction")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Total Deduction Considered field")
	public void user_check_total_deduction_considered_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Total Deduction Considered")).isDisplayed()) {
			SoftAssert.fail();
		}
	    
	}

	@Given("User_607 Check Currency field")
	public void user_check_currency_field() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Currency")).isDisplayed()) {
			SoftAssert.fail();
		}
		
	}

	@Given("User_607 Select days in Frequency")
	public void user_select_days_in_frequency() {
		
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("FrequencyInput")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
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
	public void user_enter_amount_in_amount_field() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("FrequencyInput")).click();
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("FrequencyInput")).sendKeys("10000");
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Click save button")
	public void user_click_save_button() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("saveButton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	    
	}

	@Given("User_607 Check record save successfully")
	public void user_check_record_save_successfully() {
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("SucessSavePopup")).isDisplayed()) {
			SoftAssert.fail();
		}
		SoftAssert.assertAll();
	}
	
	
	
	@Given("User_607 Click back button")
	public void user_click_back_button() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Backbutton")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Check go to previous page")
	public void user_check_go_to_previous_page() throws Throwable {
		Thread.sleep(5000);
		if (!javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("AddButtonInIncome")).isDisplayed()) {
			SoftAssert.fail();
		}
	}


	@Given("User_607 check value auto populated")
	public void user_check_value_auto_populated() {
		String text = javascriptHelper.executeScriptWithWebElement(IncomeDetailsListPaths.getElement("Employment Type")).getText();
		if (text.isEmpty()||text.isBlank()) {
			SoftAssert.fail();
		}
		
		
	}
	
	
	
	
	
	

}
