package stepdefinitions;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_0482;

public class Tawarruq_APPDATA_CustomerEmploymentDetails extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	TawarruqLogin tawarruqLogin = new TawarruqLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = configFileReader.getJSFilePath();
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
			"JSPath");
	JSPaths customerEmploymentDetailsElements = new JSPaths(excelFilePathForJS, "AppData_EmploymentDetails",
			"Tawarruq_Appdata_fieldName", "JSPath");
	String employmentDeatilsExcelDataPath = configFileReader.getTawruqqTestDataFile();
	BrowserHelper browserHelper= new BrowserHelper(driver);
	ExcelData excelDataForemploymetDetailsTestData = new ExcelData(employmentDeatilsExcelDataPath,
			"EmploymentDetailsTestData", "Dataset ID");
	ExcelData excelDataForDetailsTawarruqExecutionData = new ExcelData(employmentDeatilsExcelDataPath,
			"Tawruqq_ExecutionTracker", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> appdataEntrtyTestData = new HashMap<>();
	Map<String, String> appdataEntrtyExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";
	
	@Given("login with valid credentials for app data entry stage for Tawarruq")
	public void login_with_valid_credentials_for_app_data_entry_stage_for_tawarruq() {
		tawarruqLogin.loginWithTawarruqApplication("userType08");
	}
	@And("user_0482 get the test data for test case id AT_TW_AD_EMPD_01")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_empd() {
		appdataEntrtyExecutionData = excelDataForDetailsTawarruqExecutionData.getTestdata("AT_TW_AD_EMPD_01");
		appdataEntrtyTestData = excelDataForemploymetDetailsTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}

	@And("user_0482 search the new app data entry stage record reference number in Tawarruq")
	public void user_0482_search_the_new_app_data_entry_stage_record_reference_number_in_tawarruq() {
		WebElement searchTextBox;
		for (int i = 0; i <= 300; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(appdataEntrtyTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 select the new app data entry stage record from mail box in Tawarruq")
	public void user_0482_select_the_new_app_data_entry_stage_record_from_mail_box_in_tawarruq() {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 300; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				//System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 300; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
				//	System.out.println("Number of record in mail box " + recordRefNumber);
				//	System.out.println(appdataEntrtyTestData.get("record_reference_number"));
					if (recordRefNumber.equals(appdataEntrtyTestData.get("record_reference_number"))) {
						//System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
						// document.querySelectorAll('button[icon="pi pi-user-edit"]')[0]
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]"));
						break;
					}
				} catch (Exception e) {

				}
			}
		}
	}
	
	@And("User_0482 Clicks the customer financial tab in Kuls application in Tawarruq app data entry")
	public void user_0482_clicks_the_customer_financial_tab_in_kuls_application_in_tawarruq_app_data_entry() throws InterruptedException {
		System.out.println(customerEmploymentDetailsElements.getElement("Customer Financial Tab"));
		for (int i = 0; i < 200; i++) {
			try {
				//javaScriptHelper.scrollIntoViewAndClick(jsPaths.getElement("insuranceInfo"));
				//System.out.println(customerEmploymentDetailsElements.getElement("Customer Financial Tab"));
				javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Customer Financial Tab")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	    
	}

	@Given("User_0482 Clicks the edit button in customer financial tab under Kuls application in Employment details Tawarruq app data entry")
	public void user_0482_clicks_the_edit_button_in_customer_financial_tab_under_kuls_application_in_employment_details_tawarruq_app_data_entry() throws InterruptedException {
	   
		for (int i = 0; i < 200; i++) {
			try {
				//javaScriptHelper.scrollIntoViewAndClick(jsPaths.getElement("insuranceInfo"));
				javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Customer Personal Information Edit button")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}

	@Given("User_0482 Clicks the add button in customer financial tab under Kuls application in Employment details Tawarruq app data entry")
	public void user_0482_clicks_the_add_button_in_customer_financial_tab_under_kuls_application_in_employment_details_tawarruq_app_data_entry() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
			    System.out.println(length);
				if (!length.isEmpty()) {
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
				if (titlename.trim().equalsIgnoreCase("Customer Employment List")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button')";
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

	@Given("User_0482 Verify Primary Employment field should be toggle button and Non Mandatory in Employment details Tawarruq app data entry")
	public void user_0482_verify_primary_employment_field_should_be_toggle_button_and_non_mandatory_in_employment_details_tawarruq_app_data_entry() {
	   
		userUtility.verifyGivenFieldIsNotMandatory(driver,customerEmploymentDetailsElements.getElement("Primary Employment Mandatory Check"));
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Primary Employment Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_0482 Verify Primary Employment field should be Open with default yes in Employment details Tawarruq app data entry")
	public void user_0482_verify_primary_employment_field_should_be_open_with_default_yes_in_employment_details_tawarruq_app_data_entry() {
	   
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Primary Employment Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_0482 Verify Employment period field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employment_period_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employment Period Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Nature of Employment field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_nature_of_employment_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Nature of Employment Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Employer Name field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employer_name_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
	   
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employment Period Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_0482 Verify Employer Name if others field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employer_name_if_others_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer Name If Others Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Employee ID field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employee_id_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employee ID Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Date of joining field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_date_of_joining_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Date of joining Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Employement End Date field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employement_end_date_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employment End Date Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Department field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_department_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Department Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	    
	}

	@Given("User_0482 Verify Designation field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_designation_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Designation Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Employment type field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employment_type_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("EmploymentType Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Direct Manager Contact Number Extension field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_direct_manager_contact_number_extension_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Direct Manager Contact number exetension Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Direct Manager Telephone field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_direct_manager_telephone_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Direct Manager Telephone Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Income Paymode field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_income_paymode_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Income Payment Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Employer phone Extension field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employer_phone_extension_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer Phone Extension Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer Phone Extension Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Employer phone Number field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employer_phone_number_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer Phone Number Field")));
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer Phone Number Field")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify State field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_state_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("State Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("State Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify City field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_city_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("City Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("City Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Pincode field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_pincode_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
	   
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Pincode Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Pincode Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_0482 Verify Sector field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_sector_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Sector Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Sector Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Industry sub sector field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_industry_sub_sector_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Industry Sub Sector Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Industry Sub Sector Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify No of Partners field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_no_of_partners_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("No of Partners Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("No of Partners Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Nature of Business field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_nature_of_business_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Nature of Business Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Nature of Business Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Registered Business Name field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_registered_business_name_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Registered Business Name Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Registered Business Name Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Registered Business Number field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_registered_business_number_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Registered Business Number Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Registered Business Number Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Business Registration Date field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_business_registration_date_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Business Registration Date Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Business Registration Date Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Office permises field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_office_permises_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Office Premises Type Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Office Premises Type Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Share Holder Percentage field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_share_holder_percentage_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Share Holder Percentage Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Share Holder Percentage Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify No of Employees field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_no_of_employees_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("No of Employees Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("No of Employees Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Total year experience field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_total_year_experience_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Total Experience Years Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Total Experience Years Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Experience at current employment field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_experience_at_current_employment_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Total Experience Years Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Total Experience Years Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	    
	}

	@Given("User_0482 Verify Direct Manager Name field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_direct_manager_name_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Direct Manager Name Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Direct Manager Name Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	    
	}

	@Given("User_0482 Verify Employer City code field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_employer_city_code_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer City code Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Employer City code Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_0482 Verify Retirement Age years field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_retirement_age_years_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
	   
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Retirement Age Years Field")));
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Retirement Age Years Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_0482 Verify Remarks field should be present in Employment details Tawarruq app data entry")
	public void user_0482_verify_remarks_field_should_be_present_in_employment_details_tawarruq_app_data_entry() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(customerEmploymentDetailsElements.getElement("Remarks Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}
}
