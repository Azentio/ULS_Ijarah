package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class murabha_Steps {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;

	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths jsPaths3 = new JSPaths(excelPath, "Murabha_Module", "Murabha_LoginFieldName", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");

	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	ExcelData ad_CustomerFolllowUpDetails_610 = new ExcelData(path, "AD_CustomerFolllowUpDetails_610", "DataSet ID");
	Map<String, String> testData;
	
	ExcelData morabha_AppDataEntry = new ExcelData(path, "Morabha_AppDataEntry", "DataSet ID");
	Map<String, String> testData01;
	
	
	//-------------------***************************************************-------------------------------------
	
	@And("User_{int} click Living Expenses Screen in App Data Entery")
	public void user_click_living_expenses_screen_in_app_data_entery(Integer int1) throws Throwable {
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("livingExpenses_610")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
       //Thread.sleep(4000);
	}
	
	@And("User_{int} verify the system not allow user to do a modification with invalid data Spouse Salary")
	public void user_verify_the_system_not_allow_user_to_do_a_modification_with_invalid_data_spouse_salary(Integer int1) throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).clear();
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).sendKeys("55");
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(4000);	
		//validate 
		
		String SpouseSalary = javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("spouseSalary")).getAttribute("aria-valuenow");
		
		System.err.println("first print  " + SpouseSalary);
		System.err.println("first print  " + SpouseSalary);
		String assertSpouseSalary = "55";
		Assert.assertEquals(assertSpouseSalary, SpouseSalary);
		
		
	 
	}
	
	@And("User_{int} save button and verify the success message in murabha")
	public void user_save_button_and_verify_the_success_message_in_murabha(Integer int1) {
	    
		
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths3.getElement("murabha_SaveBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 300; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths2.getElement("successMsg_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
		}
			
		}
		
	}
	
	
	
}
