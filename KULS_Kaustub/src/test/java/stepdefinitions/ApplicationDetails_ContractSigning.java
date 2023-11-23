package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ApplicationDetails_ContractSigning {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths applicationDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements",
			"Application_Details_FieldName", "JSPath");
	JSPaths appDetails_ContractSigningJsPaths = new JSPaths(excelPath, "AppDetails_Contract_Elements",
			"Application_Details_FieldName", "JSPath");
	

	//ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	//ExcelData applicationDetailsExcelData = new ExcelData(excelTestDataPath, "ApplicationDetails_TestData","DataSet ID");
	ExcelData appDetails_ContractSigning_TestData=new ExcelData(excelTestDataPath, "AppDetail_ContractStage_TestDat", "DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	Robot robot;
	SoftAssert softAssert=new SoftAssert();
	WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(2000));
	String[] seprate;
	String firstWord="";
	
	//Testdata	
	//@AT_ADC_01 application deatils COntract Signing stage
	@And("^User get the test data for test case AT_ADC_01$")
	public void get_the_test_data_for_test_case_search_customer_AT_ADC_01() throws Throwable {
		testData = appDetails_ContractSigning_TestData.getTestdata("DS_ADC_01_01");
	}
	
	@And("^User get the test data for test case AT_ADC_02$")
	public void get_the_test_data_for_test_case_search_customer_AT_ADC_02() throws Throwable {
		testData = appDetails_ContractSigning_TestData.getTestdata("DS_ADC_01_02");
	}

	
	
	@And("User click the module name dropdown in ULS application for Application Details at Contract Signing Stage")
	public void user_click_the_module_name_dropdown_in_uls_application_for_application_details_contract_signing_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("moduleNameDropdown"))
						.click();
				System.out.println(testData.get("Module Name"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User select the module name as LOS1 in ULS application for Application Details at Contract Signing Stage")
	public void user_select_the_module_name_as_los1_in_uls_application_for_application_details_contract_signing_stage() throws Throwable {
		try {
			
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception
			
			Assert.fail(e.getMessage());
		}
		// clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	}
	
	
	@And("User click the Mail box in ULS application for Application Details at Contract Signing Stage")
	public void user_click_the_mail_box_in_uls_application_for_application_details_contract_signing_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the Search button under inbox for Application Details at Contract Signing Stage")
	public void user_click_the_search_button_under_inbox_for_application_details_contract_signing_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("mailInboxSearchBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User search the Ref id under inbox for Application Details at Contract Signing Stage")
	public void user_search_the_ref_id_under_inbox_for_application_details_contract_signing_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("inboxSearchInput")));
		
		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	
	@And("User click the Entitle button under inbox for Application Details at Contract Signing Stage")
	public void user_click_the_entitle_button_under_inbox_for_application_details_contract_signing_stage() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And ("User verify the buttons present on the Application Details page")
	public void user_verify_the_buttons_present_on_the_application_details_page() throws IOException {
	
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				        //      executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("back_Btn")));
		
		
		for(int i=0; i<=300; i++) {
			
			try {
				System.out.println("1 "+javascriptHelper.
				              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("back_Btn")).isDisplayed());
				Assert.assertEquals(true, javascriptHelper.
				              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("back_Btn")).isDisplayed());
				
				System.out.println("2 "+javascriptHelper.
			              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("submit_Btn")).isDisplayed());
				Assert.assertEquals(true, javascriptHelper.
			              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("submit_Btn")).isDisplayed());
				
				System.out.println("3 "+javascriptHelper.
			              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("return_Btn")).isDisplayed());
				Assert.assertEquals(true, javascriptHelper.
			              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("return_Btn")).isDisplayed());
				
				System.out.println("4 "+javascriptHelper.
			              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("viewSummary_Btn")).isDisplayed());
				Assert.assertEquals(true, javascriptHelper.
			              executeScriptWithWebElement(appDetails_ContractSigningJsPaths.getElement("viewSummary_Btn")).isDisplayed());
				
				break;
				
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And ("User Verify the App Data Entry Stage details with Contract Signing Stage")
	public void user_verify_the_app_data_entry_stage_details_with_contract_signing_stage() throws IOException {
		
		
	//waitHelper.waitForElementwithFluentwait(driver, driver.
		//	       findElement(By.xpath("//ion-select[@aria-label=' Ijara Auto Retail Loan ,  Classification *']")));
	
	for(int i =0; i<=300; i++) {
		
		
		try {
			
			String attribute=driver.findElement(By.xpath
					("//ion-select[@aria-label=' Ijara Auto Retail Loan ,  Classification *']")).getAttribute("aria-label");
			
			seprate=attribute.split(",");
			
			if(seprate.length>1) {
				
				firstWord=seprate[0].trim();
				System.out.println(testData.get("Classification").trim());
				if (firstWord.equalsIgnoreCase(testData.get("Classification").trim())) {

					System.out.println("same");
					break;

				} else {
					System.out.println("not same");
					break;
				}
				
			}
			else {
				System.out.println("No comma found in the input string.");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			if(i==300)
				Assert.fail(e.getMessage());
		}
		
		/*
		 * for(int j=0; j<=300; j++) {
		 * 
		 * try {
		 * 
		 * javascriptHelper.scrollIntoViewAndClick(javascriptHelper.
		 * executeScriptWithWebElement(applicationDetailsJsPaths.getElement(
		 * "businessCenterCodeDropdwn")));
		 * 
		 * break;
		 * 
		 * }catch (Exception e) { // TODO: handle exception if(j==300)
		 * Assert.fail(e.getMessage()); } }
		 */
		
		for(int j =0; j<=300; j++) {
			
			
			try {
				
				String attribute=driver.findElement(By.xpath
						("//ion-select[@aria-label=' Business Center-Retail Banking ,  Business Center Code *']")).getAttribute("aria-label");
				
				seprate=attribute.split(",");
				
				if(seprate.length>1) {
					
					firstWord=seprate[0].trim();
					System.out.println(testData.get("Bussiness Center Code").trim());
					if (firstWord.equalsIgnoreCase(testData.get("Bussiness Center Code").trim())) {

						System.out.println("same");
						break;

					} else {
						System.out.println("not same");
						break;
					}
					
				}
				else {
					System.out.println("No comma found in the input string.");
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				if(j==300)
					Assert.fail(e.getMessage());
			}

	}
	
	}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

