package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import pageobjects.ApplicationDetailsPageObj;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Insurance_Info {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	//JSPaths applicationDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements",
		//	"Application_Details_FieldName", "JSPath");
	JSPaths insuranceJsPaths = new JSPaths(excelPath, "Insurance_Info_Elements",
			"Insurance_Info_FieldName", "JSPath");
	

	//ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	//ExcelData applicationDetailsExcelData = new ExcelData(excelTestDataPath, "ApplicationDetails_TestData","DataSet ID");
	ExcelData insuranceExcelData=new ExcelData(excelTestDataPath, "Insurance_Info_TestData", "DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	Robot robot;
	SoftAssert softAssert=new SoftAssert();
	WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(2000));
	
	
//  TestData path	
	//@AT_SC_001 search Customer
	@And("^User get the test data for test case AT_INS_01$")
	public void get_the_test_data_for_test_case_search_customer_AT_INS_001() throws Throwable {
		testData = insuranceExcelData.getTestdata("DS_AT_INS_01_01");
	}
	
	@And("^User get the test data for test case AT_INS_03$")
	public void get_the_test_data_for_test_case_search_customer_AT_INS_003() throws Throwable {
		testData = insuranceExcelData.getTestdata("DS_AT_INS_01_03");
	}

	@And("User click the module name dropdown in ULS application for Insurance Info")
	public void user_click_the_module_name_dropdown_in_uls_application_for_insurance_info() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(insuranceJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("moduleNameDropdown"))
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
	
	@And("User select the module name as LOS1 in ULS application for Insurance Info")
	public void user_select_the_module_name_as_los1_in_uls_application_for_insurance_info() throws Throwable {
		try {
			
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception
			
			Assert.fail(e.getMessage());
		}
		// clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	}
	
	@And("User click the Mail box in ULS application for insurance info")
	public void user_click_the_mail_box_in_uls_application_for_insurance_info() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the Search button under inbox for insurance info")
	public void user_click_the_search_button_under_inbox_for_insurance_info() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(insuranceJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("mailInboxSearchBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User search the Ref id under inbox for insurance info")
	public void user_search_the_ref_id_under_inbox_for_insurance_info() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("inboxSearchInput")));
		
		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	@And("User click the Entitle button under inbox for insurance info")
	public void user_click_the_entitle_button_under_inbox_for_insurance_info() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And ("^user click the Next button to click on Insurance info tab$")
	public void user_click_the_next_button_to_click_on_insurance_info_tab() throws IOException {
		
		// waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
			//	   executeScriptWithWebElement(insuranceJsPaths.getElement("nextBtn")));
		for(int i=0; i<=500; i++) {
			  
			try {
				
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("nextBtn")).click();
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("nextBtn")).click();
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("nextBtn")).click();
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("nextBtn")).click();
				//javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("insurance_Info_Tab")).click();
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==500)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And ("user click on the Insurance Tab")
	public void user_click_on_the_insurance_tab() throws IOException {
		
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		//		executeScriptWithWebElement(insuranceJsPaths.getElement("insurance_Info_Tab")));
		
		for(int i=0; i<=300; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("insurance_Info_Tab1")).click();
				break;
				
			
				
			}catch (Exception e) {
				// TODO: handle exception
				    if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
	}
	
	/*@And ("user click on the Insurance Tab")
	public void user_click_on_the_insurance_tab() throws IOException{
		for(int i=0; i<=300; i++) {
			
			try {
				
				for(int j=0; j<16; j++) {
					
					String tab=driver.findElement(By.xpath("(//ion-segment-button/ion-label)["+j+"]")).getText().trim();
					if(tab.equalsIgnoreCase("Insurance Info")) {
						driver.findElement(By.xpath("(//ion-segment-button/ion-label)["+j+"]")).click();
						break;
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}*/

	
	
	@And ("user click on the Add button")
	public void user_click_on_the_add_button() throws IOException {
		
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		 * executeScriptWithWebElement(insuranceJsPaths.getElement(
		 * "addBtn_InsuranceInfo")));
		 */
		
		for(int i=0;i<=500; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("addBtn_InsuranceInfo")).click();
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==500)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And("verify the fields in ULS application")
	public void verify_the_fields_in_uls_application() throws IOException {
		System.out.println("0 ");
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(insuranceJsPaths.getElement("insurance_Year_Dropdwn")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("insurance_Year_Dropdwn")).isDisplayed());
			System.out.println("1 ");
		
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				insuranceJsPaths.getElement("depreciation_Textfield")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("depreciation_Textfield")).isDisplayed());
		
		System.out.println("2 ");
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				insuranceJsPaths.getElement("asset_Price_Textfield")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("rate_Per_Asset_TextField")).isDisplayed());
		
		System.out.println("3");
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				insuranceJsPaths.getElement("minimum_Insurance_Premium_Textfield")));
		
		Assert.assertTrue( javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("minimum_Insurance_Premium_Textfield")).isDisplayed());
		
		System.out.println("4 ");
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				insuranceJsPaths.getElement("base_Insurance_Premium_Textfield")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("base_Insurance_Premium_Textfield")).isDisplayed());
		
		System.out.println("5");
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				insuranceJsPaths.getElement("vat_Premium_Textfield")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("vat_Premium_Textfield")).isDisplayed());
		
		System.out.println("6 ");
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(
				insuranceJsPaths.getElement("net_Premium_Textfield")));
		
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("net_Premium_Textfield")).isDisplayed());
		
		System.out.println("7 ");

	}

	
	@And ("user click on the back button")
	public void user_click_on_the_back_button() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(insuranceJsPaths.getElement("backBtn")));
		
		for(int i=0;i<=500; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("backBtn")).click();
				break;
			}catch (Exception e) {
				// TODO: handle exception
				if(i==500)
					Assert.fail(e.getMessage());
			}
		}
	}
	
 
	@And ("verify the previous page")
	public void verify_the_previous_page() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(insuranceJsPaths.getElement("addBtn_InsuranceInfo")));
		
		
				
				javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("addBtn_InsuranceInfo")).isDisplayed();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(insuranceJsPaths.getElement("addBtn_InsuranceInfo")).isDisplayed(),"Back Button functionality working");
			
		
	}

	
	
	
}
