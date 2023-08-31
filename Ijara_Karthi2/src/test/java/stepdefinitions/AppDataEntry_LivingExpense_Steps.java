package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataEntry_LivingExpense_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";

	ExcelData excelDataForLivingExpense = new ExcelData(excelTestDataPath, "Living_Expense", "DataSetID");
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Living_Expense", "Ijara_AppDataEntrylivingExpensefield", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData;
	
	
	
	
	
	@And("user click the module in select field")
	public void user_click_the_module_in_select_field() throws Throwable {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ModuleName")).click();
		Thread.sleep(2000);
	}
		@And("^user update test data set id for AT_LEA_001$")
		public void user_update_test_data_set_id_for_at_lea_001() throws Throwable {
			testData = excelDataForLivingExpense.getTestdata("AT_LEA_001_D1");
		}

	@And("user click the LOS in select field")
	public void user_click_the_los_in_select_field() throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("LOS")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	   Thread.sleep(3000);
	}
	@And("user click the messagebox under LOS field")
	public void user_click_the_messagebox_under_los_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("MessageBox")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
		
			}
		}
		}
	    
	}

	@And("user click the search button under messagebox")
	public void user_click_the_search_button_under_messagebox() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchbox")).click();
	    
	}

	@And("user Enter the clientname under searchButton")
	public void user_enter_the_clientname_under_search_button() {
		//javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).click();
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("searchinput")).sendKeys(testData.get("ClientName"));
		   
	    
	}

	@And("user click the ExpenseType on Action")
	public void user_click_the_expense_type_on_action() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Entitle")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		
	    
	}


	@And("user click the field livingExpense")
	public void user_click_the_field_living_expense() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("livingExpense")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	   
	}

	@And("user click the field AddButton")
	public void user_click_the_field_add_button() {
	    for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AddButton")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("user verify the field saveButton")
	public void user_verify_the_field_save_button() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("saveButton")).isDisplayed());
				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
		
	   
	}

	@And("user verify the field BackButton")
	public void user_verify_the_field_back_button() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("BackButton")).isDisplayed());
	   
	}

	@And("user click the field AddbuttonunderExpenseInfo")
	public void user_click_the_field_addbuttonunder_expense_info() {
		for (int i = 0; i < 200; i++) {
			try {
				javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AddbuttonunderExpenseInfo")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	   
	}

	@And("user verify the field DeleteButton")
	public void user_verify_the_field_delete_button() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("DeleteButton")).isDisplayed());
	   
	}

	@And("user verify the field ExpenseType")
	public void user_verify_the_field_expense_type() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpenseType")).isDisplayed());
		
	}

	@And("user verify the field Amount")
	public void user_verify_the_field_amount() {
		Assert.assertTrue(javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Amount")).isDisplayed());
	   
	}
	@And("user click the CustomerName in input field")
	public void user_click_the_customer_name_in_input_field() {
		
		
		for (int i = 0; i <= 300; i++) {

			try {

			javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("CustomerName")).click();
			break;
			} catch (Exception e) {
			if (i == 300) {
			Assert.fail(e.getMessage());
			}
			}
			}	
	}

	@And("user select the CustomerName in under customerInput")
	public void user_select_the_customer_name_in_under_customer_input() {
				 
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";
			for (int i = 0; i <= 300; i++) {
			try {
			dropdownLength = javaScriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
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
			dropdownString = javaScriptHelper.executeScript(
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
			System.out.println("Map "+testData.get("ClientName").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ClientName")).trim())) {			 
			for (int k = 0; k <= 300; k++) {
			try {			 
			clicksAndActionsHelper.moveToElement(javaScriptHelper.executeScriptWithWebElement(
			"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
			clicksAndActionsHelper.clickOnElement(javaScriptHelper.executeScriptWithWebElement(
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
			javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpenseType")).click();
	}

	@And("user click the select check box")
	public void user_click_the_select_check_box() {
	    
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("Select")).click();
	}

	@And("user click the expenseType select box")
	public void user_click_the_expense_type_select_box() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpenseTypeInput")).click();
	    
	}

	@And("user select the type in expeseType select box")
	public void user_select_the_type_in_expese_type_select_box() {
		for (int i = 0; i <= 300; i++) {

			try {

			javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("ExpenseTypeInput")).click();
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
			dropdownLength = javaScriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
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
			dropdownString = javaScriptHelper.executeScript(
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
			System.out.println("Map "+testData.get("ExpenseType").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("ExpenseType")).trim())) {			 
			for (int k = 0; k <= 300; k++) {
			try {			 
			clicksAndActionsHelper.moveToElement(javaScriptHelper.executeScriptWithWebElement(
			"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
			clicksAndActionsHelper.clickOnElement(javaScriptHelper.executeScriptWithWebElement(
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

	@And("user Enter the Amount in Amount field")
	public void user_enter_the_amount_in_amount_field() {
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AmountInput")).sendKeys(testData.get("Amount"));
		javaScriptHelper.executeScriptWithWebElement(jsPaths.getElement("AmountInput")).sendKeys(Keys.TAB);
		
	    
	}




}
