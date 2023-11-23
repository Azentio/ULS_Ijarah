package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

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
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CustomerFinancials_Tawaruq {

	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\TawaruqJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\tawaruqTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Tawaruq_loginElements", "Tawaruq_LoginFieldName", "JSPath");
	//JSPaths applicationDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements",
		//	"Application_Details_FieldName", "JSPath");
	JSPaths customerFinancialJsPaths = new JSPaths(excelPath, "CustomerFinancial_Elements",
			"Customer_Financial_FieldName", "JSPath");
	JSPaths CustomerEmpListJsPaths = new JSPaths(excelPath, "CustomerEmpList_Elements",
			"Customer_Employement_List_FieldName", "JSPath");
	JSPaths financialCommitmentsJsPaths = new JSPaths(excelPath, "Financial_Commitments_Elements",
			"Financial_Commitments_FieldName", "JSPath");
	JSPaths IncomeJsPaths = new JSPaths(excelPath, "Income_Elements",
			"Income_FieldName", "JSPath");
	

	//ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "tawaruq_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	//ExcelData applicationDetailsExcelData = new ExcelData(excelTestDataPath, "ApplicationDetails_TestData","DataSet ID");
	ExcelData customerEmployementExcelData=new ExcelData(excelTestDataPath, "customer_Employement_TestData", "DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	Robot robot;
	SoftAssert softAssert=new SoftAssert();
	WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(2000));
	
	
//  TestData path	
	//@AT_SC_001 search Customer
	@And("^User get the test data for test case AT_EMP_01_01$")
	public void get_the_test_data_for_test_case_search_customer_AT_EMP_01_01() throws Throwable {
		testData = customerEmployementExcelData.getTestdata("DS_AT_EMP_01_01");
	}
	
	@And("^User get the test data for test case AT_EMP_01_02$")
	public void get_the_test_data_for_test_case_search_customer_AT_EMP_01_02() throws Throwable {
		testData = customerEmployementExcelData.getTestdata("DS_AT_EMP_01_02");
	}
	
	@And("^User click the module name dropdown in ULS application for Customer Financial at App Data Entry Stage$")
	public void User_click_the_module_name_dropdown_in_ULS_application_for_Customer_Financial_at_App_Data_Entry_Stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerFinancialJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("moduleNameDropdown"))
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
	
	@And("^User select the module name as LOS1 in ULS application for Customer Financial at App Data Entry Stage$")
	public void User_select_the_module_name_as_LOS1_in_ULS_application_for_Customer_Financial_at_App_Data_Entry_Stage() {
		
		try {

			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception

			Assert.fail(e.getMessage());
		}
	}
	
	
	@And("^User click the Mail box in ULS application for Customer Financial at App Data Entry Stage$")
	public void User_click_the_Mail_box_in_ULS_application_for_Customer_Financial_at_App_Data_Entry_Stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("mailBox")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("^User click the Search button under inbox for Customer Financial at App Data Entry Stage$")
	public void User_click_the_Search_button_under_inbox_for_Customer_Financial_at_App_Data_Entry_Stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(customerFinancialJsPaths.getElement("mailInboxSearchBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("mailInboxSearchBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("^User search the Ref id under inbox for Customer Financial at App Data Entry Stage$")
	public void User_search_the_Ref_id_under_inbox_for_Customer_Financial_at_App_Data_Entry_Stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("inboxSearchInput")));
		
		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("^User click the Entitle button under inbox for Customer Financial at App Data Entry Stage$")
	public void User_click_the_Entitle_button_under_inbox_for_Customer_Financial_at_App_Data_Entry_Stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(customerFinancialJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User click the Customer Financial Tab$")
	public void User_click_the_customer_financial_tab() throws IOException {
		
		
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		//executeScriptWithWebElement(customerFinancialJsPaths.getElement("customerFinancialsTab")));
			//boolean b=javascriptHelper.
			//		executeScriptWithWebElement(customerFinancialJsPaths.getElement("customerFinancialsTab")).isDisplayed();
			//		System.out.println("Visible  "+b);
			
		for(int i=0; i<=300; i++) {
			
			try {
				
				javascriptHelper.JSEClick(javascriptHelper.
				executeScriptWithWebElement(customerFinancialJsPaths.getElement("customerFinancialsTab")));
				
				//javascriptHelper.executeScriptWithWebElement(
				//	customerFinancialJsPaths.getElement("customerFinancialsTab")).click();
				break;
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
		
	}
	
	
	@And("^User click the add button under Customer Personal Information$")
	public void User_click_the_add_icon_under_Customer_Personal_Information() throws IOException {
		
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
			//	executeScriptWithWebElement(customerFinancialJsPaths.getElement("addBtn_CustomerPersonalInfo")));
		
		for(int i=0; i<=300; i++) {

			try {

				javascriptHelper.JSEClick(javascriptHelper.
						executeScriptWithWebElement(customerFinancialJsPaths.getElement("addBtn_CustomerPersonalInfo")));
				break;

			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@Then ("^User click the add button under Customer Employement List$")
	public void User_click_the_add_button_under_Customer_Employement_List() throws IOException {

		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
			//	executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("addBtn_CustomerPersonalInfo")));
			
		for(int i=0; i<=300; i++) {

			try {

				javascriptHelper.JSEClick(javascriptHelper.
						executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("addBtn_CustomerPersonalInfo")));
				break;

			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}

	}
	
	
	@And ("^Verify the Add and Back button present$")
	public void verify_the_add_and_back_button_present() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("back_Btn")));
		
		for(int i=0; i<=300; i++) {
			try {
				boolean verifyBackBtn=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("back_Btn")).isEnabled();
				System.out.println("verifyBackBtn "+verifyBackBtn);
				Assert.assertTrue(verifyBackBtn,"Back Button is present");
				System.out.println("verifyBackBtn "+verifyBackBtn);
				break;
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("save_Btn")));
		
		for(int i=0; i<=300; i++) {
			try {
				boolean verifySaveBtn=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("save_Btn")).isEnabled();
				System.out.println("verifySaveBtn "+verifySaveBtn);
				Assert.assertTrue(verifySaveBtn,"Save Button is present");
				System.out.println("verifySaveBtn "+verifySaveBtn);
				break;
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And ("^Verify the toggle button is present$")
	public void Verify_the_toggle_button_is_present() throws IOException
	{
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("primary_Employement_ToggleBtn")));
		
		for(int i=0; i<=300; i++) {
			try {
				boolean verifyToggleBtn=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("primary_Employement_ToggleBtn")).isEnabled();
				System.out.println("verifyToggleBtn "+verifyToggleBtn);
				Assert.assertTrue(verifyToggleBtn,"Toggle Button is present");
				System.out.println("verifyToggleBtn "+verifyToggleBtn);
				break;
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	@And ("^Verify the Fields on the Customer Employement page$")
	public void Verify_the_Fields_on_the_Customer_Employement_page() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employement_Period_Dropdwn")));
		
		for(int i=0; i<=300; i++) {
			try {
				boolean verifyEmployementPeriod=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employement_Period_Dropdwn")).isDisplayed();
				System.out.println("verifyEmployementPeriod "+verifyEmployementPeriod);
				Assert.assertTrue(verifyEmployementPeriod,"verifyEmployementPeriod is present");
				System.out.println("verifyEmployementPeriod "+verifyEmployementPeriod);
				
				boolean verifyNatureOfEmployement=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("nature_Of_Employement_Dropdwn")).isDisplayed();
				System.out.println("verifyNatureOfEmployement "+verifyNatureOfEmployement);
				Assert.assertTrue(verifyNatureOfEmployement,"verifyNatureOfEmployement is present");
				System.out.println("verifyNatureOfEmployement "+verifyNatureOfEmployement);
				
				boolean verifyCompanyType=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("company_Type_Dropdwn")).isDisplayed();
				System.out.println("verifyCompanyType "+verifyCompanyType);
				Assert.assertTrue(verifyCompanyType,"verifyCompanyType is present");
				System.out.println("verifyCompanyType "+verifyCompanyType);
				
				boolean verifyProfession=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("profession_Dropdwn")).isDisplayed();
				System.out.println("verifyProfession "+verifyProfession);
				Assert.assertTrue(verifyProfession,"verifyProfession is present");
				System.out.println("verifyProfession "+verifyProfession);
				
				boolean verifyProfessionType=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("profession_Type_Dropdwn")).isDisplayed();
				System.out.println("verifyProfessionType "+verifyProfessionType);
				Assert.assertTrue(verifyProfessionType,"verifyProfessionType is present");
				System.out.println("verifyProfessionType "+verifyProfessionType);
				
				boolean verifyStatutoryAuthority=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("statutory_Authority_Dropdwn")).isDisplayed();
				System.out.println("verifyStatutoryAuthority "+verifyStatutoryAuthority);
				Assert.assertTrue(verifyStatutoryAuthority,"verifyStatutoryAuthority is present");
				System.out.println("verifyStatutoryAuthority "+verifyStatutoryAuthority);
				
				boolean verifyEmployerName=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employer_Name_dropdwn")).isDisplayed();
				System.out.println("verifyEmployerName "+verifyEmployerName);
				Assert.assertTrue(verifyEmployerName,"verifyEmployerName is present");
				System.out.println("verifyEmployerName "+verifyEmployerName);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("profession_Type_Dropdwn")));
				System.out.println("Scroll page1");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employer_Name_If_Textbox")));
				
				boolean verifyEmployerNameIf=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employer_Name_If_Textbox")).isDisplayed();
				System.out.println("verifyEmployerNameIf "+verifyEmployerNameIf);
				Assert.assertTrue(verifyEmployerNameIf,"verifyEmployerNameIf is present");
				System.out.println("verifyEmployerNameIf "+verifyEmployerNameIf);
				
				boolean verifyEmployeeID=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employee_Id_Textbox")).isDisplayed();
				System.out.println("verifyEmployeeID "+verifyEmployeeID);
				Assert.assertTrue(verifyEmployeeID,"verifyEmployeeID is present");
				System.out.println("verifyEmployeeID "+verifyEmployeeID);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employee_Id_Textbox")));
				System.out.println("Scroll page2");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("date_Of_Joining_Calendar")));
				
				boolean verifyDateOfJoining=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("date_Of_Joining_Calendar")).isDisplayed();
				System.out.println("verifyDateOfJoining "+verifyDateOfJoining);
				Assert.assertTrue(verifyDateOfJoining,"verifyDateOfJoining is present");
				System.out.println("verifyDateOfJoining "+verifyDateOfJoining);
				
				boolean verifyEmployementEndDate=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employement_End_Date_Calendar")).isDisplayed();
				System.out.println("verifyEmployementEndDate "+verifyEmployementEndDate);
				Assert.assertTrue(verifyEmployementEndDate,"verifyEmployementEndDate is present");
				System.out.println("verifyEmployementEndDate "+verifyEmployementEndDate);
				
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employement_End_Date_Calendar")));
				System.out.println("Scroll page3");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("department_Dropdwn")));
				
				boolean verifyDepartment=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("department_Dropdwn")).isDisplayed();
				System.out.println("verifyDepartment "+verifyDepartment);
				Assert.assertTrue(verifyDepartment,"verifyDepartment is present");
				System.out.println("verifyDepartment "+verifyDepartment);
				
				boolean verifyDesignation=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("designation_Dropdwn")).isDisplayed();
				System.out.println("verifyDesignation "+verifyDesignation);
				Assert.assertTrue(verifyDesignation,"verifyDesignation is present");
				System.out.println("verifyDesignation "+verifyDesignation);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("designation_Dropdwn")));
				System.out.println("Scroll page4");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employement_Type_Dropdwn")));
				
				boolean verifyEmployementType=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employement_Type_Dropdwn")).isDisplayed();
				System.out.println("verifyEmployementType "+verifyEmployementType);
				Assert.assertTrue(verifyEmployementType,"verifyEmployementType is present");
				System.out.println("verifyEmployementType "+verifyEmployementType);
				
				boolean verifyManagerContactNoExtension=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("direct_Manager_Contact_Number_Extension_Textbox")).isDisplayed();
				System.out.println("verifyManagerContactNoExtension "+verifyManagerContactNoExtension);
				Assert.assertTrue(verifyManagerContactNoExtension,"verifyManagerContactNoExtension is present");
				System.out.println("verifyManagerContactNoExtension "+verifyManagerContactNoExtension);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("direct_Manager_Contact_Number_Extension_Textbox")));
				System.out.println("Scroll page5");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("direct_Manager_Telephone_Textbox")));
				
				boolean verifyManagerTelephone=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("direct_Manager_Telephone_Textbox")).isDisplayed();
				System.out.println("verifyManagerTelephone "+verifyManagerTelephone);
				Assert.assertTrue(verifyManagerTelephone,"verifyManagerTelephone is present");
				System.out.println("verifyManagerTelephone "+verifyManagerTelephone);
				
				boolean verifyIncomePayment=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("income_Payment_Dropdwn")).isDisplayed();
				System.out.println("verifyIncomePayment "+verifyIncomePayment);
				Assert.assertTrue(verifyIncomePayment,"verifyIncomePayment is present");
				System.out.println("verifyIncomePayment "+verifyIncomePayment);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("income_Payment_Dropdwn")));
				System.out.println("Scroll page6");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("pincode_Textbox")));
				
				boolean verifyPincode=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("pincode_Textbox")).isDisplayed();
				System.out.println("verifyPincode "+verifyPincode);
				Assert.assertTrue(verifyPincode,"verifyPincode is present");
				System.out.println("verifyPincode "+verifyPincode);
				
				boolean verifySector=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("sector_Dropdwn")).isDisplayed();
				System.out.println("verifySector "+verifySector);
				Assert.assertTrue(verifySector,"verifySector is present");
				System.out.println("verifySector "+verifySector);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("sector_Dropdwn")));
				System.out.println("Scroll page7");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("industry_Sub_sector_Dropdwn")));
				
				boolean verifyIndustrySubSector=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("industry_Sub_sector_Dropdwn")).isDisplayed();
				System.out.println("verifyIndustrySubSector "+verifyIndustrySubSector);
				Assert.assertTrue(verifyIndustrySubSector,"verifyIndustrySubSector is present");
				System.out.println("verifyIndustrySubSector "+verifyIndustrySubSector);
				
				boolean verifyNoOfPartner=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("no_Of_Partners_Textbox")).isDisplayed();
				System.out.println("verifyNoOfPartner "+verifyNoOfPartner);
				Assert.assertTrue(verifyNoOfPartner,"verifyNoOfPartner is present");
				System.out.println("verifyNoOfPartner "+verifyNoOfPartner);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("no_Of_Partners_Textbox")));
				System.out.println("Scroll page8");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("nature_Of_Business_Dropdwn")));
				
				boolean verifyNatureOfBusiness=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("nature_Of_Business_Dropdwn")).isDisplayed();
				System.out.println("verifyNatureOfBusiness "+verifyNatureOfBusiness);
				Assert.assertTrue(verifyNatureOfBusiness,"verifyNatureOfBusiness is present");
				System.out.println("verifyNatureOfBusiness "+verifyNatureOfBusiness);
				
				boolean verifyRegisteredBusinessName=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("registered_Business_Name_Textbox")).isDisplayed();
				System.out.println("verifyRegisteredBusinessName "+verifyRegisteredBusinessName);
				Assert.assertTrue(verifyRegisteredBusinessName,"verifyRegisteredBusinessName is present");
				System.out.println("verifyRegisteredBusinessName "+verifyRegisteredBusinessName);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("registered_Business_Name_Textbox")));
				System.out.println("Scroll page9");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("registered_Business_Number_Textbox")));
				
				boolean verifyRegisteredBusinessNumber=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("registered_Business_Number_Textbox")).isDisplayed();
				System.out.println("verifyRegisteredBusinessNumber "+verifyRegisteredBusinessNumber);
				Assert.assertTrue(verifyRegisteredBusinessNumber,"verifyRegisteredBusinessNumber is present");
				System.out.println("verifyRegisteredBusinessNumber "+verifyRegisteredBusinessNumber);
				
				boolean verifyBusinessRegistrationDate=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("business_Registration_Date_Calendar")).isDisplayed();
				System.out.println("verifyBusinessRegistrationDate "+verifyBusinessRegistrationDate);
				Assert.assertTrue(verifyBusinessRegistrationDate,"verifyBusinessRegistrationDate is present");
				System.out.println("verifyBusinessRegistrationDate "+verifyBusinessRegistrationDate);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("business_Registration_Date_Calendar")));
				System.out.println("Scroll page10");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("office_Premises_Type_Dropwn")));
				
				boolean verifyOfficePremisesType=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("office_Premises_Type_Dropwn")).isDisplayed();
				System.out.println("verifyOfficePremisesType "+verifyOfficePremisesType);
				Assert.assertTrue(verifyOfficePremisesType,"verifyOfficePremisesType is present");
				System.out.println("verifyOfficePremisesType "+verifyOfficePremisesType);
				
				boolean verifyShareHolderPercentage=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("share_Holder_Percentage_Textbox")).isDisplayed();
				System.out.println("verifyShareHolderPercentage "+verifyShareHolderPercentage);
				Assert.assertTrue(verifyShareHolderPercentage,"verifyShareHolderPercentage is present");
				System.out.println("verifyShareHolderPercentage "+verifyShareHolderPercentage);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("share_Holder_Percentage_Textbox")));
				System.out.println("Scroll page11");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("no_Of_Employees_Textbox")));
				
				boolean verifyNoOfEmployees=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("no_Of_Employees_Textbox")).isDisplayed();
				System.out.println("verifyOfficePremisesType "+verifyOfficePremisesType);
				Assert.assertTrue(verifyOfficePremisesType,"verifyOfficePremisesType is present");
				System.out.println("verifyOfficePremisesType "+verifyOfficePremisesType);
				
				boolean verifyTotalExperience=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("total_Experience_Textbox")).isDisplayed();
				System.out.println("verifyTotalExperience "+verifyTotalExperience);
				Assert.assertTrue(verifyTotalExperience,"verifyTotalExperience is present");
				System.out.println("verifyTotalExperience "+verifyTotalExperience);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("total_Experience_Textbox")));
				System.out.println("Scroll page12");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("experience_At_Current_Employement_Textbox")));
				
				boolean verifyExperienceAtCurrentEmployement=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("experience_At_Current_Employement_Textbox")).isDisplayed();
				System.out.println("verifyExperienceAtCurrentEmployement "+verifyExperienceAtCurrentEmployement);
				Assert.assertTrue(verifyExperienceAtCurrentEmployement,"verifyExperienceAtCurrentEmployement is present");
				System.out.println("verifyExperienceAtCurrentEmployement "+verifyExperienceAtCurrentEmployement);
				
				boolean verifyDirectManagerName=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("direct_Manager_Name_TextBox")).isDisplayed();
				System.out.println("verifyDirectManagerName "+verifyDirectManagerName);
				Assert.assertTrue(verifyDirectManagerName,"verifyDirectManagerName is present");
				System.out.println("verifyDirectManagerName "+verifyDirectManagerName);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("direct_Manager_Name_TextBox")));
				System.out.println("Scroll page13");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employer_City_Code_Textbox")));
				
				boolean verifyEmployerCityCode=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("employer_City_Code_Textbox")).isDisplayed();
				System.out.println("verifyEmployerCityCode "+verifyEmployerCityCode);
				Assert.assertTrue(verifyEmployerCityCode,"verifyEmployerCityCode is present");
				System.out.println("verifyEmployerCityCode "+verifyEmployerCityCode);
				
				boolean verifyRetirementAge=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("retirement_Age_Textbox")).isDisplayed();
				System.out.println("verifyRetirementAge "+verifyRetirementAge);
				Assert.assertTrue(verifyRetirementAge,"verifyRetirementAge is present");
				System.out.println("verifyRetirementAge "+verifyRetirementAge);
				
				javascriptHelper.scrollToElemet(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("retirement_Age_Textbox")));
				System.out.println("Scroll page14");
				clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("remarks_Textbox")));
				
				boolean verifyRemark=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("remarks_Textbox")).isDisplayed();
				System.out.println("verifyRemark "+verifyRemark);
				Assert.assertTrue(verifyRemark,"verifyRemark is present");
				System.out.println("verifyRemark "+verifyRemark);
				
				
				break;
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
	
	@And ("^User check the Primary Employement toggle button default status active$")
	public void User_check_the_Primary_Employement_toggle_button_default_status_active() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("primary_Employement_ToggleBtn")));
		
		for(int i=0; i<=300; i++) {
			try {
				boolean verifyToggleBtn=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("primary_Employement_ToggleBtn")).isEnabled();
				String status=javascriptHelper.executeScriptWithWebElement(CustomerEmpListJsPaths.getElement("primary_Employement_ToggleBtn")).getAttribute("aria-checked");
				System.out.println("status "+status);
				if(status.equalsIgnoreCase("true")) {
					System.out.println("The Primary Employement Toggle button is Active");
					System.out.println("verifyToggleBtn "+verifyToggleBtn);
					Assert.assertTrue(verifyToggleBtn,"Toggle Button is present");
					System.out.println("verifyToggleBtn "+verifyToggleBtn);
					break;
				}
				else {
					System.out.println("The Primary Employement Toggle button is Inactive");
					break;
				}
				
				
				
				
			}catch (Exception e) {
				// TODO: handle exception
				if(i==300)
					Assert.fail(e.getMessage());
			}
		}
	}
	
}
