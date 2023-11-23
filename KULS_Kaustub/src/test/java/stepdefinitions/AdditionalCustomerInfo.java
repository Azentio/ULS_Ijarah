package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

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
import pageobjects.JSPaths;
import resources.BaseClass;

public class AdditionalCustomerInfo {

	String excelJSPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths customerAdditionalInfoJsPaths = new JSPaths(excelJSPath, "CustomerAdditionalInfo_Elements", "CustomerAdditionalInfo_FieldName", "JSPath");
	//JSPaths applicationDetailsJsPaths = new JSPaths(excelJSPath, "ApplicationDetails_Elements",
		//	"Application_Details_FieldName", "JSPath");
	/*JSPaths customerFinancialJsPaths = new JSPaths(excelJSPath, "CustomerFinancial_Elements",
			"Customer_Financial_FieldName", "JSPath");
	JSPaths CustomerEmpListJsPaths = new JSPaths(excelJSPath, "CustomerEmpList_Elements",
			"Customer_Employement_List_FieldName", "JSPath");
	JSPaths financialCommitmentsJsPaths = new JSPaths(excelJSPath, "Financial_Commitments_Elements",
			"Financial_Commitments_FieldName", "JSPath");
	JSPaths IncomeJsPaths = new JSPaths(excelJSPath, "Income_Elements",
			"Income_FieldName", "JSPath");*/
	

	//ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData loginCredentialsExelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	//ExcelData applicationDetailsExcelData = new ExcelData(excelTestDataPath, "ApplicationDetails_TestData","DataSet ID");
	ExcelData customerAdditionalInfoExcelData=new ExcelData(excelTestDataPath, "CustomerAdditionalInfo_TestData", "DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	Robot robot;
	SoftAssert softAssert=new SoftAssert();
	WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(2000));
	
	
	@And("^User get the test data for test case AT_CAI_01$")
	public void get_the_test_data_for_test_case_search_customer_AT_CAI_01() throws Throwable {
		testData = customerAdditionalInfoExcelData.getTestdata("DS_At_IDA_015");
	}
	
	@And("User click the module name dropdown in ULS application for Additional Customer Info at New Application Stage")
	public void user_click_the_module_name_dropdown_in_uls_application_for_additional_customer_info_at_new_application_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("moduleNameDropdown"))
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
	
	@And("User select the module name as LOS1 in ULS application for Additional Customer Info at New Application Stage")
	public void user_select_the_module_name_as_los1_in_uls_application_for_additional_customer_info_at_new_application_stage() throws Throwable {
		try {
			
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception
			
			Assert.fail(e.getMessage());
		}
		// clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	}
	
	@And("User click the Mail box in ULS application for Additional Customer Info at New Application Stage")
	public void user_click_the_mail_box_in_uls_application_for_additional_customer_info_at_new_application_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the Search button under inbox for Additional Customer Info at New Application Stage")
	public void user_click_the_search_button_under_inbox_for_additional_customer_info_at_new_application_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("mailInboxSearchBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User search the Ref id under inbox for Additional Customer Info at New Application Stage")
	public void user_search_the_ref_id_under_inbox_for_additional_customer_info_at_new_application_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("inboxSearchInput")));
		
		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	@And("User click the Entitle button under inbox for Additional Customer Info at New Application Stage")
	public void user_click_the_entitle_button_under_inbox_for_additional_customer_info_at_new_application_stage() throws Throwable {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click the Additional Customer Info Tab")
	public void user_click_the_additional_customer_info_tab() throws IOException {
		
	//	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		//		.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("additionalCustomerInfoTab")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("additionalCustomerInfoTab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click on the Add button of Customer Personal Information")
	public void user_click_on_the_add_button_of_customer_personal_information() throws IOException {
		
	//	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
			//	.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("addBtn_CustomerPersonalInfoText")));
		
		
		
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("addBtn_CustomerPersonalInfo"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User click on the Add button of Customer Identification")
	public void user_click_on_the_add_button_of_customer_identification() throws IOException {
		
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		//		.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("addBtn_CustomerIdentification")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("addBtn_CustomerIdentification"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And ("User keep any mandatory field blank and click on save btn")
	public void user_keep_any_mandatory_field_blank_and_click_on_save_btn() {
		
		for(int i=0; i<=300; i++) {
			try {
				
				WebElement saveBtn=javascriptHelper.executeScriptWithWebElement(customerAdditionalInfoJsPaths.getElement("saveBtn"));
				javascriptHelper.JSEClick(saveBtn);
				
				//javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("saveBtn")).click();
				break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
				Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And("user verify the popup post clicking save btn")
	public void user_verify_the_popup_post_clicking_save_btn() {
		String popUp=null;
		for (int i = 0; i <= 1000; i++) {
			try {
				popUp =javascriptHelper.executeScript("return "+customerAdditionalInfoJsPaths.getElement("postClickSavePopup")).toString();
				if (!popUp.isBlank()||!popUp.isEmpty()) {
					break;
				}
			} catch (Exception e) {
               if(i==1000)
            	   Assert.fail(e.getMessage());
			}

		}
		System.out.println(popUp);
}
}
