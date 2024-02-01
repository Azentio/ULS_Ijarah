package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class MurabhaAppDataCheckRepaymentMode {
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths MuADCheckLivingExpenses = new JSPaths(excelPath, "MuADCheckLivingExpenses", "LivingExpense_Elements","JSPaths");
	JSPaths MuADCheckRepaymentMode = new JSPaths(excelPath, "MuADCheckRepaymentMode", "RepaymentMode_FieldName", "JSPath");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	Map<String, String> testData;
	ExcelData MuADCheckLivingExpensesexelData = new ExcelData(excelTestDataPath, "MuADCheckLivingExpenses", "Data Set ID");
	
	@Given("user_607 click on Repayment Mode info tab")
	public void user_607_user_click_on_repayment_mode_info_tab() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Repayment Mode")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}
	
	
	@And("user_607 navigate to Repayment mode module")
	public void user_607_navigate_to_repayment_mode_module() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("RepaymentMode")).click();
				//javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("RepaymentMode")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_607 Click on view icon of existing record in repayment mode")
	public void user_607_click_on_view_icon_of_existing_record_in_repayment_mode() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("EyeIconInViewlist")));
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_607 Validate that Repayment mode field is displayed in repayment mode page")
	public void user_607_validate_that_repayment_mode_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("RepaymentMode")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
	    
	}

	@And("user_607 Validate that Account Holder Name field is displayed in repayment mode page")
	public void user_607_validate_that_account_holder_name_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountHolderName")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
	    
	}

	@And("user_607 Validate that Account Type field is displayed in repayment mode page")
	public void user_607_validate_that_account_type_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountType")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
		
	    
	}

	@And("user_607 Validate that Account Number field is displayed in repayment mode page")
	public void user_607_validate_that_account_number_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountNumber")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("user_607 Validate that Account Currency field is displayed in repayment mode page")
	public void user_607_validate_that_account_currency_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountCurrency")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("user_607 Validate that Bank Name field is displayed in repayment mode page")
	public void user_607_validate_that_bank_name_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("BankName")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("user_607 Validate that Bank Branch field is displayed in repayment mode page")
	public void user_607_validate_that_bank_branch_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("BankBranch")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("user_607 Validate that ECS Code field is displayed in repayment mode page")
	public void user_607_validate_that_ecs_code_field_is_displayed_in_repayment_mode_page() throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("ECSCODE")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}
	@And("user_607 Validate that existing records are present in repayment mode page")
	public void user_607_validate_that_existing_records_are_present_in_repayment_mode_page()  throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("EyeIconInViewlist")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("user_607 Validate that Repayment mode field is displayed in repayment mode module view list")
	public void user_607_validate_that_repayment_mode_field_is_displayed_in_repayment_mode_module_view_list() throws IOException  {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("RepaymentModeField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_607 Validate that Account holder name field is displayed in repayment mode module view list")
	public void user_607_validate_that_account_holder_name_field_is_displayed_in_repayment_mode_module_view_list()  throws IOException {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountHolderNameField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

	@And("user_607 Validate that Account type field is displayed in repayment mode module view list")
	public void user_607_validate_that_account_type_field_is_displayed_in_repayment_mode_module_view_list() throws IOException  {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountTypeField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("user_607 Validate that Account Currency field is displayed in repayment mode module view list")
	public void user_607_validate_that_account_currency_field_is_displayed_in_repayment_mode_module_view_list() throws IOException  {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("AccountCurrencyField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("user_607 Validate that Bank Name field is displayed in repayment mode module view list")
	public void user_607_validate_that_bank_name_field_is_displayed_in_repayment_mode_module_view_list() throws IOException  {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("BankNameField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}

	@And("user_607 Validate that Currency field is displayed in repayment mode module view list")
	public void user_607_validate_that_currency_field_is_displayed_in_repayment_mode_module_view_list() throws IOException  {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("Status")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	    
	}
	@And("user_607 User search the Ref id under inbox for App data check_Repayment mode")
	public void user_607_user_search_the_ref_id_under_inbox_for_app_data_check_repayment_mode() throws IOException {
		System.out.println(testData.get("Ref No"));
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	
	@And("^user_607 click on view button of Repayment mode screen at app data check stage$")
	public void user_607_click_on_view_button_of_Repayment_mode_screen_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MuADCheckLivingExpenses.getElement("living_expense_listView_view_button")).click();
				break;
			} catch (Exception e) {
				if (i == 700) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("User_607 Search the maching record in the repayment mode list view")
	public void user_search_the_maching_record_in_the_repayment_mode_list_view() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("List of Repayment Mode")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button[ng-reflect-icon=\"pi pi-search\"]')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					javascriptHelper.JSEClick(addButton);
		//			addButton.click();
					break;
				}
			}
			break;
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MuADCheckRepaymentMode.getElement("SearchFieldInListView")).sendKeys("icic",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("living_expense_listView_view_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@Given("User_607 Search the missmatching record in the repayment mode list view")
	public void user_search_the_missmatching_record_in_the_repayment_mode_list_view() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MuADCheckRepaymentMode.getElement("SearchFieldInListView")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(
						MuADCheckRepaymentMode.getElement("SearchFieldInListView")).sendKeys("test",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
		for (int i = 0; i <= 200; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(
						MuADCheckRepaymentMode.getElement("living_expense_listView_view_button")).isDisplayed()) {
					Assert.fail();
				}
			} catch (Exception e) {
				if (i == 200) {
					Assert.assertTrue(true);
				}
			}
		}
	}
	
	@Given("user_607 Validate that Status field is displayed in repayment mode page")
	public void user_validate_that_status_field_is_displayed_in_repayment_mode_page() {
		for (int i = 0; i <= 1000; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MuADCheckRepaymentMode.getElement("StatusField")).isDisplayed());
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
			}
		}
		}
	}

}
