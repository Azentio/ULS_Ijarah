package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ConsumerDurablesAppDataEntryEmpolyememtDetailes {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements", "ApplicationDetails_FieldName", "JSPath");
	JSPaths employmentDetailsJsPaths = new JSPaths(excelPath, "AppDataEntryEmployementDetailes", "EmploymentDetails_FieldName", "JSPath");
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Actions actions = new Actions(driver);
	SoftAssert softAssert = new SoftAssert();
	
	ExcelData AppDataEntryEmployementDetailes  = new ExcelData(excelTestDataPath,"AppDataEntryEmployementDetailes","DataSet ID");
	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	
	@Given("User_607 get the test data for test case AT_CD_APD_CFE_01")
	public void user_get_the_test_data_for_test_case_at_cd_apd_cfe_01() {
		testExecutionData = testExecution.getTestdata("AT_CD_APD_CFE_01");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@Given("User_607 get the test data for test case AT_CD_APD_CFE_08")
	public void user_get_the_test_data_for_test_case_at_cd_apd_cfe_08() {
		testExecutionData = testExecution.getTestdata("AT_CD_APD_CFE_08");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@Given("User_607 get the test data for test case AT_CD_APD_CFE_09")
	public void user_get_the_test_data_for_test_case_at_cd_apd_cfe_09() {
		testExecutionData = testExecution.getTestdata("AT_CD_APD_CFE_09");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@Given("User_607 get the test data for test case AT_CD_APD_CFE_10")
	public void user_get_the_test_data_for_test_case_at_cd_apd_cfe_10() {
		testExecutionData = testExecution.getTestdata("AT_CD_APD_CFE_10");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@Given("User_607 get the test data for test case AT_CD_APD_CFE_11")
	public void user_get_the_test_data_for_test_case_at_cd_apd_cfe_11() {
		testExecutionData = testExecution.getTestdata("AT_CD_APD_CFE_11");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	@Given("User_607 get the test data for test case AT_CD_APD_CFE_12")
	public void user_get_the_test_data_for_test_case_at_cd_apd_cfe_12() {
		testExecutionData = testExecution.getTestdata("AT_CD_APD_CFE_12");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("User_607 search the Reference ID for Consume rDurables AppData Entry Empolyememt Detailes")
	public void user_search_the_reference_id_for_auto_loan() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("inboxSearchInput")).sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 click the pencil icon under Customer Financials tab")
	public void user_607_click_the_pencil_icon_under_customer_financials_tab() throws Throwable {
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		boolean isEyeBtnClicked = false;
		for (int i = 0; i <=200; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Active").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(
									javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')")
									.click();
							isEyeBtnClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isEyeBtnClicked == true) {
				break;
			}
		}
	}
	
	@And("User_607 to verify the functionality of Back button under Customer Financials tab")
	public void user_607_to_verify_the_functionality_of_back_button_under_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement backBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("customerFinancialsTabBackBtn"));
				actions.scrollToElement(backBtn).build().perform();
				backBtn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 post clicking on Back button under Customer Finanacials tab, system should navigate to the previous screen")
	public void user_607_post_clicking_on_back_button_under_customer_inanacials_tab_system_should_navigate_to_the_previous_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerInfoTitle")));
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerInfoTitle")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	
	@And("^User_607 click Add button under Customer Employment list section in Customer Financials tab$")
	public void user_607_click_add_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	

	
	@And("User_607 click the Business record Edit button under Customer Employment List section in Customer Financials tab")
	public void user_607_click_business_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Business")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 verify Save button available under Employment details screen")
	public void user_verify_back_button_available_under_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("saveBtn"));
				javascriptHelper.backgroundBorder(saveBtn);
				softAssert.assertTrue(saveBtn.isDisplayed(), "Save button available under Employment details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("^User_607 to verify the Primary Employment toggle should be Yes in Employment details screen$")
	public void user_607_to_verify_the_primary_employment_toggle_should_be_yes_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
				String attribute = toggleBtn.getAttribute("aria-checked");
				System.out.println(attribute);
				softAssert.assertTrue(attribute.contains("true"), "Primary Employment toggle should be Yes in Employment details screen");
				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
	}
	
	@And("^User_607 click the Pensioner record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_607_click_the_pensioner_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 150; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String path = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')";
					WebElement element = javascriptHelper.executeScriptWithWebElement(path);
					javascriptHelper.scrollIntoView(element);
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Pensioner")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 click the Self-employed Professional record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_607_click_the_self_employed_professional_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);
					if (titlename.trim().contains("Self-employed Professional")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	
	@And("^User_607 click the dropdown for show all the records under Customer Employment List section in Customer Financials tab$")
	public void user_607_click_the_dropdown_for_show_all_the_records_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelectorAll('p-dropdown')[1]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("25")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_607 click the Salaried record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_607_click_the_salaried_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Salaried")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@Given("user_607 click on Customer Financials tab")
	public void user_607_user_click_on_repayment_mode_info_tab() {
		String length =null;
		for (int i = 0; i <200; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Customer Financials")) {
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
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}

	
//	Murabaha -- App Data Entry -- Customer Debt screen
	@And("^User_607 get the test data for test case AT_MCUD_01$")
    public void get_the_test_data_for_test_case_AT_MCUD_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_MCUD_01");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
    }
	
	@Given("User_607 get the test data for test case AT_RD_ADE_CD_01")
	public void user_607_get_the_test_data_for_test_case_at_rd_ade_cd_01() {
		testExecutionData = testExecution.getTestdata("AT_MCUD_01");
		testData = AppDataEntryEmployementDetailes.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	
	@And("User_607 verify Back button available under Employment details screen")
	public void user_607_verify_back_button_available_under_employment_details_screen() throws Throwable {		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement customerFinancialsTab = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerFinancialsTab"));
				WebElement backBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerEmploymentBackBtn"));
				actions.scrollToElement(customerFinancialsTab).build().perform();
				javascriptHelper.backgroundBorder(backBtn);
				softAssert.assertTrue(backBtn.isDisplayed(), "Back button available under Employment details screen");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Primary Employment field available under Employment details screen")
	public void user_607_verify_primary_employment_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel"));
		WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Primary Employment label");
				javascriptHelper.backgroundBorder(toggleBtn);
				softAssert.assertTrue(toggleBtn.isDisplayed(), "Primary Employment Toggle button");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	
//		verify primary employment as "Yes"
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(toggleBtn.getAttribute("aria-checked").contains("true"), "Primary Employment selected 'YES'");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify Employment Period field available under Employment details screen")
	public void user_607_verify_employment_period_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employment Period label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Employment Period Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	 		
	}

	@And("User_607 verify Nature of Employment field available under Employment details screen")
	public void user_607_verify_nature_of_employment_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Nature of Employment label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Nature of Employment Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify Company Type field available under Employment details screen")
	public void user_607_verify_company_type_field_available_under_employment_details_screen() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeLabel"));
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeDropdown"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Company Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Company Type Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Profession field available under Employment details screen")
	public void user_607_verify_profession_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Profession label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Profession Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Profession Type field available under Employment details screen")
	public void user_607_verify_profession_type_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Profession Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Profession tye Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Statutory Authority field available under Employment details screen")
	public void user_607_verify_statutory_authority_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Statutory Authority label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Statutory Authority Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Name field available under Employment details screen")
	public void user_607_verify_employer_name_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employer Name label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Employer Name Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Name if Others field available under Employment details screen")
	public void user_607_verify_employer_name_if_others_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employer Name if(Others) label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer Name if(Others) Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@And("User_607 verify Employee ID field available under Employment details screen")
	public void user_607_verify_employee_id_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employee ID label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employee ID Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_607 verify Date of Joining field available under Employment details screen")
	public void user_607_verify_date_of_joining_field_available_under_employment_details_screen() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Date of Joining label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Date of Joining Calender");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("User_607 verify Employment End Date field available under Employment details screen")
	public void user_607_verify_employment_end_date_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.scrollIntoView(label);
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employment End Date label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employment End Date Calender");
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Department field available under Employment details screen")
	public void user_607_verify_department_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentDropdown"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Department label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Department dropdown");
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Designation field available under Employment details screen")
	public void user_607_verify_designation_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationDropdown"));
		for (int i = 0; i <= 200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Designation label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Designation dropdown");
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employment Type field available under Employment details screen")
	public void user_607_verify_employment_type_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employment Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Employment Type dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	
	}

	@And("User_607 verify Direct Manager Contact Number Extension field available under Employment details screen")
	public void user_607_verify_direct_manager_contact_number_extension_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Direct Manager Contact Number label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Direct Manager Contact Number Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("^User_607 invoke soft assert in Employment details screen under Customer Financials tab at App Data Entry stage$")
	public void user_607_invoke_soft_assert_in_employment_details_screen_under_customer_financials_tab_at_app_data_entry_stage()
			throws Throwable {
		softAssert.assertAll();
	}

	@And("User_607 verify Direct Manager Telephone field available under Employment details screen")
	public void user_607_verify_direct_manager_telephone_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Direct Manager Telephoner label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Direct Manager Telephone Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Income Paymode field available under Employment details screen")
	public void user_607_verify_income_paymode_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Income Paymode label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Income Paymode Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Phone Extension field available under Employment details screen")
	public void user_607_verify_employer_phone_extension_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employer Phone Extension label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer Phone Extension Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Phone Number field available under Employment details screen")
	public void user_607_verify_employer_phone_number_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employer Phone Number label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer Phone Number Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify State field available under Employment details screen")
	public void user_607_verify_state_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("stateLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("stateDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.scrollIntoView(label);
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"State label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "State Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify City field available under Employment details screen")
	public void user_607_verify_city_field_available_under_employment_details_screen() throws Throwable {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("cityLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("cityDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"City label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "City Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify Pincode field available under Employment details screen")
	public void user_607_verify_pincode_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("pincodeLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("pincodeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Pincode label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Pincode Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Sector field available under Employment details screen")
	public void user_607_verify_sector_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("sectorLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("sectorDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Sector label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Sector Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Industry Sub Sector field available under Employment details screen")
	public void user_607_verify_industry_sub_sector_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("subSectorLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("subSectorDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Industry Sub Sector label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Industry Sub Sector Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify No Of Partners field available under Employment details screen")
	public void user_607_verify_no_of_partners_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"No Of Partners label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "No Of Partners Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Nature of Business field available under Employment details screen")
	public void user_607_verify_nature_of_business_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.scrollIntoView(label);
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Nature of Business label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Nature of Business Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Registered Business Name field available under Employment details screen")
	public void user_607_verify_registered_business_name_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Registered Business Name label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Registered Business Name Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Registered Business Number field available under Employment details screen")
	public void user_607_verify_registered_business_number_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Registered Business Number label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Registered Business Number Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Business Registration Date field available under Employment details screen")
	public void user_607_verify_business_registration_date_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateCalender"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Registered Business Date label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Registered Business Date Calender");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Office Premises Type field available under Employment details screen")
	public void user_607_verify_office_premises_type_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeLabel"));
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Office Premises Type label");
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Office Premises Type Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify Share Holder Percentage field available under Employment details screen")
	public void user_607_verify_share_holder_percentage_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Share Holder Percentage label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Share Holder Percentage Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify No of Employees field available under Employment details screen")
	public void user_607_verify_no_of_employees_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"No of Employees label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "No of Employees Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Experience At Current Employment field available under Employment details screen")
	public void user_607_verify_experience_at_current_employment_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Experience At Current Employment label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Experience At Current Employment Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Direct Manager Name field available under Employment details screen")
	public void user_607_verify_direct_manager_name_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Direct Manager Name label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Direct Manager Name Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer City Code field available under Employment details screen")
	public void user_607_verify_employer_city_code_field_available_under_employment_details_screen() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel")));
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Employer City Code label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Employer City Code Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Retirement Age field available under Employment details screen")
	public void user_607_verify_retirement_age_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("retirementAgeLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("retirementAgeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Retirement Age label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Retirement Age Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Remarks field available under Employment details screen")
	public void user_607_verify_remarks_field_available_under_employment_details_screen() {
		WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel"));
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksTextarea"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),"Remarks label");
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Remarks Input");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify Employment Period value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_employment_period_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("aria-label").contains(testData.get("Employment_Period")), 
						"Employment Period value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Nature of Employment value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_nature_of_employment_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("aria-label").contains(testData.get("Nature_Of_Employment")),
						"Nature of Employment value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Name if Others value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_employer_name_if_others_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(input.getAttribute("ng-reflect-model").contains(testData.get("Employer_Name_Others")),
						"Employer Name if(Others) value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employee ID value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_employee_id_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(input.getAttribute("ng-reflect-model").contains(testData.get("Employee_ID")),
						"Employee ID value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Date of Joining value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_date_of_joining_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
		for (int i = 0; i <=200; i++) {
			try {
//				System.out.println("Date: "+input.getAttribute("ng-reflect-model"));
				softAssert.assertTrue(input.getAttribute("ng-reflect-model").contains(testData.get("Date_of_Joining")), 
						"Date of Joining value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employment Type value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_employment_type_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("aria-label").contains(testData.get("Employment_Type")), 
						"Employment Type value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Share Holder Percentage value should populate correctly same as App data entry stage under Employment details screen")
	public void user_607_verify_share_holder_percentage_value_should_populate_correctly_same_as_app_data_entry_stage_under_employment_details_screen() throws Throwable {
		WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(input.getAttribute("ng-reflect-model").contains(testData.get("Share_Holder_Percent")), 
						"Share Holder Percentage value should populate correctly");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	@AT_MU_EDC_02
	@And("^User_607 click the Company//Firm record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_607_click_the_companyfirm_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Company/Firm")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
//	@AT_MU_EDC_03
	
	
//	@AT_MU_EDC_04
//	@And("User_607 click the pagination next button under Employment details section")
//	public void user_607_click_the_pagination_next_button_under_employment_details_section() {
//		for (int i = 0; i <= 300; i++) {
//			try {
//				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(appData_IncomeJsPaths.getElement("customerFinancialsTabBackBtn")));
//				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("EmpDetailsSectionNextPageBtn")).click();
//				break;
//			} catch (Exception e) {
//				if (i == 300) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//	}
	
	@And("User_607 click the Self-Employed Professional record Eye button under Employment List section in Customer Financials tab")
	public void user_607_click_the_self_employed_professional_record_eye_button_under_employment_list_section_in_customer_financials_tab() {
//		javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("selfEmployedProfessional_eyeBtn")).click();
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		boolean isEyeBtnClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Self-employed Professional").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(
									javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].previousElementSibling.previousElementSibling.querySelector('button')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].previousElementSibling.previousElementSibling.querySelector('button')")
									.click();
							isEyeBtnClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isEyeBtnClicked == true) {
				break;
			}
		}
	}
	
	
//	@AT_MU_EDC_05
	
	
	@And("User_607 verify Total Experience\\(Years) field available under Employment details screen")
	public void user_607_verify_total_experience_years_field_available_under_employment_details_screen() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				WebElement label = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel"));
				WebElement input = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceInput"));
				javascriptHelper.backgroundColor(label);
				Assert.assertTrue(label.isDisplayed());
				javascriptHelper.backgroundBorder(input);
				Assert.assertTrue(input.isDisplayed());
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	@AT_MU_EDC_06
	@And("User_607 verify Primary Employment field should be Toggle button, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_primary_employment_field_should_be_toggle_btn_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Toggle Btn
		for (int i = 0; i <=200; i++) {
			try {
				WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
				javascriptHelper.backgroundBorder(toggleBtn);
				softAssert.assertTrue(toggleBtn.getTagName().contains("toggle"), "Primary Employment field should Toggle Button");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Primary Employment field should Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmployment"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Primary Employment field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employment Period field should be Dropdown, Mandatory and Read only under Employment details screen")
	public void user_607_verify_employment_period_field_should_be_dropdown_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employment Period field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employment Period field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriod"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employment Period field should be Display only");
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Nature of Employment field should be Dropdown, Mandatory and Read only under Employment details screen")
	public void user_607_verify_nature_of_employment_field_should_be_dropdown_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		for (int i = 0; i <=200; i++) {
			try {
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Nature of Employment field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Nature of Employment field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmployment"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Nature of Employment field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Name field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_employer_name_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		for (int i = 0; i <=200; i++) {
			try {
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employer Name field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerName"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Name field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Name if\\(Others) field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_607_verify_employer_name_if_others_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer Name if(Others) field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employer Name if(Others) field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthers"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Name if(Others) field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employee ID field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_607_verify_employee_id_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		for (int i = 0; i <=200; i++) {
			try {
				WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employee ID field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employee ID field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeID"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employee ID field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}	
	
	@And("User_607 verify Date of Joining field should be Date, Mandatory and Read only under Employment details screen")
	public void user_607_verify_date_of_joining_field_should_be_date_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Date Field
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Date of Joining field should be Date field");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Date of Joining field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoining"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Date of Joining field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employment End Date field should be Date, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_employment_end_date_field_should_be_date_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Date Field
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Employment End Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employment End Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDate"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employment End Date field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Department field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_department_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Department field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Department field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("department"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Department field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Designation field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_designation_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Designation field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Designation field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designation"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Designation field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employment Type field should be Dropdown, Mandatory and Read only under Employment details screen")
	public void user_607_verify_employment_type_field_should_be_dropdown_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employment Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employment Type field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentType"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employment Type field should be Display only");
				Assert.assertTrue(read.contains("true"));
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_607 verify Direct Manager Contact Number field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_direct_manager_contact_number_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		
		for (int i = 0; i <=200; i++) {
			try {
				WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Direct Manager Contact Number field should be Texbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Contact Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbr"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Direct Manager Contact Number field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify Direct Manager Telephone field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_direct_manager_telephone_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.scrollIntoView(textBox);
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Direct Manager Telephone field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Telephone field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephone"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Direct Manager Telephone field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Income Paymode field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_income_paymode_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Income Paymode field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymodeLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Income Paymode field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("incomePaymode"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Income Paymode field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Phone Extension field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_employer_phone_extension_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Employer Phone Extension field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Phone Extension field should be Non-Mandatory");;
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExtension"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Phone Extension field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Phone Number field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_employer_phone_number_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer Phone Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Phone Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbr"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer Phone Number field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Total Experience\\(Years) field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_607_verify_total_experience_years_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Total Experience field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Total Experience field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperience"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Total Experience field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Experience At Current Employment field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_experience_at_current_employment_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Experience At Current Employment field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmploymentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Experience At Current Employment field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("experienceAtCurrentEmployment"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Experience At Current Employment field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Direct Manager Name field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_direct_manager_name_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Direct Manager Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerName"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Direct Manager Name field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer City Code field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_employer_city_code_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeInput"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer City Code field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCodeLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer City Code field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerCityCode"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Employer City Code field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Remarks field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_remarks_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksTextarea"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getTagName().contains("textarea"), "Remarks field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Remarks field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarks"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Remarks field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 invoke soft assert in Employment details screen under Customer Financials tab at Data Check stage")
	public void user_607_invoke_soft_assert_in_employment_details_screen_under_customer_financials_tab_at_data_check_stage() throws Throwable {
	    softAssert.assertAll();
	}
	
	
//	@AT_MU_EDC_07
	
	@And("User_607 verify Company Type field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_company_type_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Company Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Company Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyType"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Company Type field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Profession field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_profession_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Profession field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Profession field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("profession"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Profession field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Profession Type field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_profession_type_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Profession Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Profession Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionType"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Department field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify Statutory Authority field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_statutory_authority_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Statutory Authority field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Statutory Authority field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthority"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Statutory Authority field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	@And("User_607 verify No Of Partners field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_no_of_partners_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "No of Partners field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "No of Partners field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartners"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "No of Partners field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Nature of Business field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_nature_of_business_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Nature Of Business field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Nature Of Business field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusiness"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Nature Of Business field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Registered Business Name field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_registered_business_name_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Registered Business Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Registered Business Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessName"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Registered Business Name field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Registered Business Number field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_registered_business_number_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Registered Business Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Registered Business Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbr"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Registered Business Number field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Business Registration Date field should be Date, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_business_registration_date_field_should_be_date_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateCalender"));
		for (int i = 0; i <=200; i++) {
			try {				
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Business Registration Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Business Registration Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDate"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Business Registration Date field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_607 verify Office Premises Type field should be Dropdown, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_office_premises_type_field_should_be_dropdown_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeDropdown"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Office Premises Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Office Premises Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesType"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Office Premises Type field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Share Holder Percentage field should be Textbox, Mandatory and Read only under Employment details screen")
	public void user_607_verify_share_holder_percentage_field_should_be_textbox_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Share Holder Percentage field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercentLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(text.contains("*"), "Share Holder Percentage field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("shareHolderPercent"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "Share Holder Percentage field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify No of Employees field should be Textbox, Non-Mandatory and Read only under Employment details screen")
	public void user_607_verify_no_of_employees_field_should_be_textbox_non_mandatory_and_read_only_under_employment_details_screen() throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesInput"));
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "No of Employees field should be Textbox");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesLabel")).getText();
		for (int i = 0; i <200; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "No of Employees field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	 
		
//		Verify field as Display only
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployees"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <=200; i++) {
			try {
				softAssert.assertTrue(read.contains("true"), "No of Employees field should be Display only");
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify the functionality of Back button under Employment details screen")
	public void user_607_verify_the_functionality_of_back_button_under_employment_details_screen() throws Throwable {
		WebElement pageTop = javascriptHelper.executeScriptWithWebElement("document.querySelector('ion-card[class*=\"k-pagescreen\"]')");
		WebElement backBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerEmploymentBackBtn"));
		for (int i = 0; i <=200; i++) {
			try {
				javascriptHelper.scrollIntoView(pageTop);
				javascriptHelper.backgroundBorder(backBtn);
				javascriptHelper.JSEClick(backBtn);
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
		String listOfEyeBtn = "";
		String recordName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
				System.out.println("List of add button " + listOfEyeBtn);
				if (!(listOfEyeBtn.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		int premitiveListOfEyeButton = Integer.parseInt(listOfEyeBtn);
		for (int j = 0; j < premitiveListOfEyeButton; j++) {
			for (int k = 0; k <= 100; k++) {
				try {
					recordName = javascriptHelper.executeScript(
							"return document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')["
									+ j + "].textContent")
							.toString();
					System.out.println("Screen Name " + recordName);
					if (!(recordName.isBlank())) {
						System.out.println("Screen Name" + recordName + " is Not null");
						if ((recordName.trim()).equalsIgnoreCase(("Self Employed").trim())) {
							System.out.println("Inside nested loop");
							javascriptHelper.backgroundColor(
									javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].previousElementSibling.previousElementSibling.querySelector('button')"));
							javascriptHelper
									.executeScriptWithWebElement(
											"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].previousElementSibling.previousElementSibling.querySelector('button')")
									.isDisplayed();							
							break;
						}
					}
				} catch (Exception e) {
					if (k == 100) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

	
//	AT_MU_EDC_08
	@And("User_607 verify Back button available in Customer Employment section list view under Customer Financials tab")
	public void user_607_verify_back_button_available_in_customer_employment_section_list_view_under_customer_financials_tab() throws Throwable {	
		for (int i = 0; i <= 300; i++) {
			try {				
				WebElement backBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerFinancialsTabBackBtn"));
//				javascriptHelper.scrollIntoView(backBtn);
				actions.scrollToElement(backBtn).build().perform();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		} 
		for (int i = 0; i <= 300; i++) {
			try {				
				WebElement backBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerFinancialsTabBackBtn"));
				actions.scrollToElement(backBtn).build().perform();
				javascriptHelper.backgroundBorder(backBtn);
				softAssert.assertTrue(backBtn.isDisplayed(), "Customer Employment Back button");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify Search button available under Customer Employment section list view in Customer Financials tab")
	public void user_607_verify_search_button_available_under_customer_employment_section_list_view_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("listview_SearchBtn"));
				javascriptHelper.backgroundBorder(searchBtn);
				softAssert.assertTrue(searchBtn.isDisplayed(), "Customer Employment Search button");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_607 verify Nature of Employment field available under Customer Employment section list view in Customer Financials tab")
	public void user_607_verify_nature_of_employment_field_available_under_customer_employment_section_list_view_in_customer_financials_tab() throws Throwable {
		actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("listview_NatureOfEmployment"))).build().perform();
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("listview_NatureOfEmployment"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(), "Customer Employment - Nature of Employment field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employer Name field available under Customer Employment section list view in Customer Financials tab")
	public void user_607_verify_employer_name_field_available_under_customer_employment_section_list_view_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("listview_EmployerName"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(), "Customer Employment - Employer Name field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify Employment Status field available under Customer Employment section list view in Customer Financials tab")
	public void user_607_verify_employment_status_field_available_under_customer_employment_section_list_view_in_customer_financials_tab() throws Throwable {
		WebElement field = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("listview_EmploymentStatus"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(), "Customer Employment - Employment Status");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_607 verify system should display the records on the list view under Customer Employment section in Customer Financials tab")
	public void user_607_verify_system_should_display_the_records_on_the_list_view_under_customer_employment_section_in_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Salaried")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement";
						WebElement recordValues = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(recordValues).build().perform();
						javascriptHelper.backgroundColor(recordValues);
						softAssert.assertTrue(recordValues.isDisplayed(), "list view values are displayed in Customer Employment section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	@AT_MU_EDC_09
	@And("User_607 click the Search button under Customer Employment section in Customer Financials tab")
	public void user_607_click_the_search_button_under_customer_employment_section_in_customer_financials_tab() throws Throwable {
		for (int i = 0; i <= 3000; i++) {
			try {				
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("customerFinancialsTabBackBtn")));
				break;
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("listview_SearchBtn"));
		for (int i = 0; i <= 3000; i++) {
			try {
				searchBtn.click();
				break;
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify the functionality of Search box with matching data under Customer Employment section")
	public void user_607_verify_the_functionality_of_search_box_with_matching_data_under_customer_employment_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {				
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(testData.get("Matching_Data"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify system should display all the possible matching records under Customer Employment section")
	public void user_607_verify_system_should_display_all_the_possible_matching_records_under_customer_employment_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchResult = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchResult"));
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				softAssert.assertTrue(Integer.parseInt(text)>0, "Matching Data Result should be greater than 0");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify the functionality of Search box with mismatch data under Customer Employment section")
	public void user_607_verify_the_functionality_of_search_box_with_mismatch_data_under_customer_employment_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(testData.get("Mismatching_Data"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_607 verify system should not display any records or system should display the message as No data found under Customer Employment section")
	public void user_607_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_customer_employment_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchResult = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchResult"));
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				softAssert.assertTrue(Integer.parseInt(text)==0, "Mismatch data should be display as 0");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
	
	@And("^User_607 verify Date of Joining field should be Date, Mandatory under Employment details screen$")
	public void user_607_verify_date_of_joining_field_should_be_date_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field		
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement calender = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("dateOfJoiningCalender"));
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Date of Joining field should be Date field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("dateOfJoiningLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Date of Joining field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employment Period field should be Dropdown, Mandatory under Employment details screen$")
	public void user_607_verify_employment_period_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employment Period field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentPeriodLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employment Period field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Nature of Employment field should be Dropdown, Mandatory under Employment details screen$")
	public void user_607_verify_nature_of_employment_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Nature of Employment field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfEmploymentLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Nature of Employment field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employer Name field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_employer_name_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employer Name field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("User_607 verify Employer Name if\\(Others) field should be Textbox, Mandatory under Employment details screen")
	public void user_607_verify_employer_name_ifothers_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer Name if(Others) field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerNameOthersLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employer Name if(Others) field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employee ID field should be Textbox, Mandatory under Employment details screen$")
	public void user_607_verify_employee_id_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employee ID field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employee ID field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employment Type field should be Dropdown, Mandatory under Employment details screen$")
	public void user_607_verify_employment_type_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Employment Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentTypeLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Employment Type field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("User_607 verify Total Experience\\(Years) field should be Textbox, Mandatory under Employment details screen")
	public void user_607_verify_total_experienceyears_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Total Experience field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("totalExperienceLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Total Experience field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Direct Manager Contact Number field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_direct_manager_contact_number_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Direct Manager Contact Number field should be Texbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerContactNbrLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Contact Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employment End Date field should be Date, Non-Mandatory under Employment details screen$")
	public void user_607_verify_employment_end_date_field_should_be_date_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateCalender"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Employment End Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employmentEndDateLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employment End Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Primary Employment field should be Toggle button, Non-Mandatory under Employment details screen$")
	public void user_607_verify_primary_employment_field_should_be_toggle_button_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Toggle Btn
		WebElement toggleBtn = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentToggleBtn"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(toggleBtn);
				softAssert.assertTrue(toggleBtn.getTagName().contains("toggle"), "Primary Employment field should Toggle Button");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("primaryEmploymentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Primary Employment field should Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Department field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_department_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Department field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("departmentLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Department field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Designation field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_designation_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Designation field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("designationLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Designation field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Direct Manager Telephone field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_direct_manager_telephone_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(textBox);
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Direct Manager Telephone field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerTelephoneLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Telephone field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employer Phone Extension field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_employer_phone_extension_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "Employer Phone Extension field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneExLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Phone Extension field should be Non-Mandatory");;
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Employer Phone Number field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_employer_phone_number_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Employer Phone Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employerPhoneNbrLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Employer Phone Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Direct Manager Name field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_direct_manager_name_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Direct Manager Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("directManagerNameLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Direct Manager Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Remarks field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_remarks_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksTextarea"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.backgroundBorder(textBox);
				softAssert.assertTrue(textBox.getTagName().contains("textarea"), "Remarks field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("remarksLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Remarks field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 click the Self-employed record Edit button under Customer Employment List section in Customer Financials tab$")
	public void user_607_click_the_self_employed_record_edit_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Self Employed")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("^User_607 verify Company Type field should be Dropdown, Mandatory under Employment details screen$")
	public void user_607_verify_company_type_field_should_be_dropdown_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Company Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("companyTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(text.contains("*"), "Company Type field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Profession Type field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_profession_type_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Profession Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Profession Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Statutory Authority field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_statutory_authority_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Statutory Authority field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("statutoryAuthorityLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Statutory Authority field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Profession field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_profession_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
	}

	@And("^User_607 verify Share Holder Percentage field should be Textbox, Mandatory under Employment details screen$")
	public void user_607_verify_share_holder_percentage_field_should_be_textbox_mandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Profession field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("professionLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Profession field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify No Of Partners field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_no_of_partners_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "No of Partners field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("noOfPartnersLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "No of Partners field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Nature of Business field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_nature_of_business_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Nature Of Business field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("natureOfBusinessLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Nature Of Business field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Registered Business Name field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_registered_business_name_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Registered Business Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNameLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Registered Business Name field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Registered Business Number field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_registered_business_number_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("text"), "Registered Business Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("regBusinessNbrLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Registered Business Number field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Business Registration Date field should be Date, Non-Mandatory under Employment details screen$")
	public void user_607_verify_business_registration_date_field_should_be_date_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Date Field
		WebElement calender = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateCalender"));
		for (int i = 0; i <= 300; i++) {
			try {				
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Business Registration Date field should be Date Field");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("businessRegisteredDateLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Business Registration Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify Office Premises Type field should be Dropdown, Non-Mandatory under Employment details screen$")
	public void user_607_verify_office_premises_type_field_should_be_dropdown_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeDropdown"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Office Premises Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("officePremisesTypeLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "Office Premises Type field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

	@And("^User_607 verify No of Employees field should be Textbox, Non-Mandatory under Employment details screen$")
	public void user_607_verify_no_of_employees_field_should_be_textbox_nonmandatory_under_employment_details_screen()
			throws Throwable {
//		Verify field as Textbox
		WebElement textBox = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesInput"));
		for (int i = 0; i <= 300; i++) {
			try {
				softAssert.assertTrue(textBox.getAttribute("type").contains("number"), "No of Employees field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("numberOfEmployeesLabel")).getText();
		for (int i = 0; i <300; i++) {
          try {
        	  softAssert.assertTrue(!(text.contains("*")), "No of Employees field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==199) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
	}

//	AT_AL_ADE_EMP_08
	@And("^User_607 select Nature of Employment from dropdown in Employment Details screen$")
	public void user_607_select_nature_of_employment_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("natureOfEmploymentDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("NatureOfEmployment"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 select Company Type from dropdown in Employment Details screen$")
	public void user_607_select_company_type_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("companyTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("CompanyType"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 enter Date of Joining in Employment Details screen$")
	public void user_607_enter_date_of_joining_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("dateOfJoiningInput")).click();
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("Date_today")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 select Employment Period from dropdown in Employment Details screen$")
	public void user_607_select_employment_period_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employmentPeriodDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmploymentPeriod"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 select Employer Name from dropdown in Employment Details screen$")
	public void user_607_select_employer_name_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employerNameDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmployerName"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 enter Employee ID in Employment Details screen$")
	public void user_607_enter_employee_id_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("EmployeeID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 select Employment Type from dropdown in Employment Details screen$")
	public void user_607_select_employment_type_from_dropdown_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employmentTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmploymentType"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 enter Total Experience in Employment Details screen$")
	public void user_607_enter_total_experience_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("totalExperienceInput")).sendKeys(testData.get("TotalExperience"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 enter Share Holder Percentage in Employment Details screen$")
	public void user_607_enter_share_holder_percentage_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("shareHolderPercentInput")).sendKeys(testData.get("ShareHolder%"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_607 click Save button in Employment details screen$")
	public void user_607_click_save_button_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("saveBtn"));
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify the confirmation message post clicking on save button in Employment Details screen$")
	public void user_607_verify_the_confirmation_message_post_clicking_on_save_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement alertMsg = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("alert_SuccessMsg"));
	        	 String text = alertMsg.getText();
	        	 System.out.println("Alert Message: "+text);
	        	 softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
	             break;
	        } catch (Exception e) {
	            
	        }
		}
		
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("alert_closeBtn")).click();
	             break;
	        } catch (Exception e) {
	            if (i==199) {
	                 Assert.fail(e.getMessage());
	            }
	        }
		}
	}

//	AT_AL_ADE_EMP_09
	@And("^User_607 to verify impact when user keep mandatory field blank and click on save button in Employment Details screen$")
	public void user_607_to_verify_impact_when_user_keep_mandatory_field_blank_and_click_on_save_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("mandatoryFillToastMsg"));
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"), 
						"Mandatory field blank message in Customer Debt screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 enter the character values in numeric field in Employment Details screen$")
	public void user_607_enter_the_character_values_in_numeric_field_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("directManagerTelephoneInput"));
				javascriptHelper.scrollIntoView(element);
				element.sendKeys(testData.get("CharValue"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 to verify the impact when user enter characters value in numeric field in Employment Details screen$")
	public void user_607_to_verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("invalidNumberError"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.trim().contains("Invalid Mobile Number"), 
						"Invalid Mobile Number message displayed in Employment Details screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 only enters the Special character in Employment Details screen$")
	public void user_607_only_enters_the_special_character_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("Specialchar"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 to verify the impact when user enter special characters value in Employment Details screen$")
	public void user_607_to_verify_the_impact_when_user_enter_special_characters_value_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("specialCharError"));
				String madatoryErrorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(madatoryErrorMsg.trim().contains("Only Alphanumeric characters are allowed"), 
						"Only Alphanumeric characters are allowed message displayed in Employment Details screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_ADE_EMP_10
	@And("^User_607 verify Add button available in Customer Employment section list view under Customer Financials tab$")
	public void user_607_verify_add_button_available_in_customer_employment_section_list_view_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Customer Employment List")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j 
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(), "Add button available in Customer Employment section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_607 verify export to PDF button available in Customer Employment section list view under Customer Financials tab$")
	public void user_607_verify_export_to_pdf_button_available_in_customer_employment_section_list_view_under_customer_financials_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("exportBtn"));
				actions.moveToElement(btn).build().perform();
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("PDF")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(btn);
						softAssert.assertTrue(btn.isDisplayed(),"PDF button available under asset details tab");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify export to Excel button available in Customer Employment section list view under Customer Financials tab$")
	public void user_607_verify_export_to_excel_button_available_in_customer_employment_section_list_view_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("XLS")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundColor(btn);
						softAssert.assertTrue(btn.isDisplayed(),"Excel button available under asset details tab");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 verify values should be non editable in Customer Employment section list view under Customer Financials tab")
	public void user_607_verify_values_should_be_non_editable_in_customer_employment_section_list_view_under_customer_financials_tab() throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Address Details")) {
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
								+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[1]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						String output = field.getAttribute("readonly");
						System.out.println("Out: "+ output);
						javascriptHelper.backgroundBorder(field);
						softAssert.assertNull(output,
								"Listview values should be non editable under Address Details section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}

	@And("^User_607 verify list view values are displayed in Customer Employment section under Customer Financials tab$")
	public void user_607_verify_list_view_values_are_displayed_in_customer_employment_section_under_customer_financials_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
						+ ".parentElement.parentElement.parentElement.querySelectorAll('td').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().contains("Salaried")) {
						String jspath = "document.querySelector('th[ng-reflect-field=\"employmentTypeDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement";
						WebElement recordValues = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(recordValues).build().perform();
						javascriptHelper.backgroundColor(recordValues);
						softAssert.assertTrue(recordValues.isDisplayed(), "list view values are displayed in Customer Employment section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_AL_ADE_EMP_11
	@And("^User_607 click the Export button under Customer Employment list section in Customer Financials tab$")
	public void user_607_click_the_export_button_under_customer_employment_list_section_in_customer_financials_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement btn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("exportBtn"));
				actions.scrollToElement(btn).build().perform();
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 to verify the functionality of Export to PDF button under Customer Employment list section$")
	public void user_607_to_verify_the_functionality_of_export_to_pdf_button_under_customer_employment_list_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("PDF")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify post clicking on PDF button system should download PDF file of that records in Customer Employment section$")
	public void user_607_verify_post_clicking_on_pdf_button_system_should_download_pdf_file_of_that_records_in_customer_employment_section()
			throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("^User_607 to verify the functionality of Export to Excel button under Customer Employment list section$")
	public void user_607_to_verify_the_functionality_of_export_to_excel_button_under_customer_employment_list_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('p-dropdownitem').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('p-dropdownitem li')[" + j + "].textContent";
					System.out.println("Name: "+title);
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("XLS")) {
						String jspath = "document.querySelectorAll('p-dropdownitem li')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify post clicking on XLS button system should download Excel file of that records in Customer Employment section$")
	public void user_607_verify_post_clicking_on_xls_button_system_should_download_excel_file_of_that_records_in_customer_employment_section()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("User_607 to verify functionality of Search box with matching data under Customer Employment section")
	public void user_607_to_verify_functionality_of_search_box_with_matching_data_under_customer_employment_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {				
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(testData.get("Matching_Data"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_607 to verify functionality of Search box with mismatch data under Customer Employment section")
	public void user_607_to_verify_functionality_of_search_box_with_mismatch_data_under_customer_employment_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("searchbox_Input"))
				.sendKeys(testData.get("Mismatching_Data"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_607 to verify post clicking on Add button system should allow to create new record of Customer Employment details$")
	public void user_607_to_verify_post_clicking_on_add_button_system_should_allow_to_create_new_record_of_customer_employment_details()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement screenTitle = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("customerEmploymentScreen"));
				javascriptHelper.backgroundBorder(screenTitle);
				softAssert.assertTrue(screenTitle.isDisplayed(), "Creating new record of Customer Employment details screen");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
//	AT_AL_ADE_EMP_12
	@And("^User_607 Delete the Mandatory field value in Employment Details screen$")
	public void user_607_delete_the_mandatory_field_value_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify while modification, when user keep any mandatory field blank and click on Update button in Employment details screen$")
	public void user_607_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_update_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("mandatoryFillToastMsg"));
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"), 
						"Mandatory field blank message in Customer Debt screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 enters the invalid data in Employment Details screen$")
	public void user_607_enters_the_invalid_data_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("Specialchar"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify system should not allow to do a modification with invalid data in Employment Details screen$")
	public void user_607_verify_system_should_not_allow_to_do_a_modification_with_invalid_data_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("specialCharError"));
				String madatoryErrorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(madatoryErrorMsg.trim().contains("Only Alphanumeric characters are allowed"), 
						"Only Alphanumeric characters are allowed message displayed in Employment Details screen");
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify system should allow to modify the Employment details record in Employment details screen$")
	public void user_607_verify_system_should_allow_to_modify_the_employment_details_record_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("employeeIDInput"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employeeIDInput")).sendKeys(testData.get("EmployeeID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify while modification system allow to Update the record with valid data in Employment details screen$")
	public void user_607_verify_while_modification_system_allow_to_update_the_record_with_valid_data_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("employmentTypeDropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i <200; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <200; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: "+titlename);				
					if (titlename.trim().equalsIgnoreCase(testData.get("EmploymentType"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 click Update button in Employment details screen$")
	public void user_607_click_update_button_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJsPaths.getElement("updateBtn"));
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_607 verify the confirmation message post clicking on Update button in Employment Details screen$")
	public void user_607_verify_the_confirmation_message_post_clicking_on_update_button_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				WebElement alertMsg = javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("alert_SuccessMsg"));
	        	 String text = alertMsg.getText();
	        	 System.out.println("Alert Message: "+text);
	        	 softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
	             break;
	        } catch (Exception e) {
	            
	        }
		}
		
		for (int i = 0; i <200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJsPaths.getElement("alert_closeBtn")).click();
	             break;
	        } catch (Exception e) {
	            if (i==199) {
	                 Assert.fail(e.getMessage());
	            }
	        }
		}
	}

	
	
	

}
