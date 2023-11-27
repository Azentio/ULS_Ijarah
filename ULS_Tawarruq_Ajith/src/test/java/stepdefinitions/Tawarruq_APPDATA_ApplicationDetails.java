package stepdefinitions;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_0482;

public class Tawarruq_APPDATA_ApplicationDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	TawarruqLogin tawarruqLogin = new TawarruqLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
			"JSPath");
	JSPaths applicationDetailsElements = new JSPaths(excelFilePathForJS, "AppData_AppllicationDetailsJS",
			"Tawarruq_NewApp_fieldName", "JSPath");
	String applicationDetailsExcelDataPath = System.getProperty("user.dir") + "\\TestData\\TawarruqTestData.xlsx";
	BrowserHelper browserHelper= new BrowserHelper(driver);
	ExcelData excelDataForApplicationDetailsTestData = new ExcelData(applicationDetailsExcelDataPath,
			"ApplicationDetails_AppData", "Dataset ID");
	ExcelData excelDataForApplicationDetailsTawarruqExecutionData = new ExcelData(applicationDetailsExcelDataPath,
			"Appdata_ApplicationDetailsExe", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> appdataEntrtyTestData = new HashMap<>();
	Map<String, String> appdataEntrtyExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";
	
	
	@Given("navigate the Tawarruq URL")
	public void navigate_the_tawarruq_url() {
		driver.get(configFileReader.getTawarruqApplicationURL());
	    
	}
	
	@Given("user_0482 click on LOS option in module dropdown")
	public void user_0482_click_on_los_option_in_module_dropdown() {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank()) && !(moduleLength.equalsIgnoreCase("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);

//document.querySelectorAll('ion-radio-group ion-item')[0].textContent
		boolean isSelectedModuleClicked = false;
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 100; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					System.out.println("Module name " + moduleName);
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
						isSelectedModuleClicked = true;
						break;
					} else if (!(moduleName.equalsIgnoreCase("LOS"))) {
						System.out.println("Inside else if condition");
						isSelectedModuleClicked = false;
						break;
					}

				} catch (Exception e) {

				}
			}
			if (isSelectedModuleClicked == true) {
				break;
			}
		}
	}

	@Given("user_0482 click on mail box")
	public void user_0482_click_on_mail_box() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					System.out.println(commonJSPaths.getElement("mail_box"));
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_0482 click on search box upon click on the mail box")
	public void user_0482_click_on_search_box_upon_click_on_the_mail_box() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button"))
						.click();
				if(i>50)
				{
					javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_button")));
					break;
				}
				break;
				
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("user_0482 click on search text box upon click the search button")
	public void user_click_on_search_text_box_upon_click_the_search_button() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}



	@Given("login with valid credentials for app data entry stage")
	public void login_with_valid_credentials_for_app_data_entry_stage() {
		tawarruqLogin.loginWithTawarruqApplication("userType02");
	}

	@Given("click on module dropdown in Tawarruq")
	public void click_on_module_dropdown_in_tawarruq() {
		String moduleName = "";
		for (int i = 0; i <= 100; i++) {
			try {
				moduleName = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("module_dropdown") + ".textContent")
						.toString();
				System.out.println("Module Name "+moduleName);
				if ((!moduleName.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("module_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("user_0482 get the test data for test case id AT_TW_AD_01")
	public void user_get_the_test_data_for_test_case_id_at_app_01() {
	    
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("AT_TW_AD_01");
		appdataEntrtyTestData = excelDataForApplicationDetailsTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}

	@Given("user_0482 search the new app data entry stage record reference number")
	public void user_search_the_new_app_data_entry_stage_record_reference_number() {
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
	
	@Given("user_0482 Click save button and verify the confirmation message")
	public void user_0482_click_save_button_and_verify_the_confirmation_message() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <= 200; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript(commonJSPaths.getElement("toast_container_message")).toString();
				System.out.println(toastMessage);
				Assert.assertTrue(toastMessage.contains("Success"));
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i==200) {
					Assert.fail(e2.getMessage());
				}
				
			}
		}
		
	}

	@And("user_0482 select the new app data entry stage record from mail box")
	public void user_0482_select_the_new_app_data_entry_stage_record_from_mail_box() {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 300; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isBlank())) {
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
					System.out.println("Number of record in mail box " + recordRefNumber);
					System.out.println(appdataEntrtyTestData.get("record_reference_number"));
					if (recordRefNumber.equals(appdataEntrtyTestData.get("record_reference_number"))) {
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
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

	@Then("user_0482 verify product field should be mandatory editable dropdown")
	public void user_verify_product_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("product_Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("product_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("sub_product_dropdown"));
	    
	}
	@Then("user_0482 verify Classification field should be mandatory editable dropdown")
	public void user_0482_verify_classification_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("clasification_Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("clasification_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("product_dropdown"));
	}

	@Then("user_0482 verify total finance amount request field should be mantatory numeric")
	public void user_verify_total_finance_amount_request_field_should_be_mantatory_numeric() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("total_amount_requested_Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						applicationDetailsElements.getElement("total_amount_requested_input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("total_amount_requested_input"))
						.sendKeys(appdataEntrtyTestData.get("total_finance_amount_requested"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Then("user_0482 verify declared net monthly income field should be mandatory numeric")
	public void user_verify_declared_net_monthly_income_field_should_be_mandatory_numeric() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("declared_net_Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("declared_net_income_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						applicationDetailsElements.getElement("declared_net_income_input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("declared_net_income_input"))
						.sendKeys(appdataEntrtyTestData.get("declared_net_income_monthly"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Then("user_0482 verify declared currrent obligation field should be non mandatory editable numeric")
	public void user_verify_declared_currrent_obligation_field_should_be_non_mandatory_editable_numeric() {
		//System.out.println(applicationDetailsElements.getElement("declared_current_obligation_Field"));
		for (int j = 0; j <2000; j++) {
			try {
				String Field = javascriptHelper.executeScript("return document.querySelector('ion-label[ng-reflect-text=\"ApplicationDetails.DeclaredCur\"]').innerText").toString();
				System.out.println(Field);
				Assert.assertFalse(Field.contains("*"));
				break;
			} catch (Exception e) {
				if (j==1999) {
					System.out.println(e.getMessage());
					Assert.fail("Given field is mandatory");
				}
			}
			catch (AssertionError e) {
				if (j==1999) {
					System.out.println(e.getMessage());
					Assert.fail("Given field is not mandatory");
				}
			}
		}
		//			userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("declared_current_obligation_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("declared_current_obligation_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						applicationDetailsElements.getElement("declared_current_obligation_input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("declared_current_obligation_input"))
						.sendKeys(appdataEntrtyTestData.get("declared_current_obligation"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Then("user_0482 verify special promotional campaign field should be non mandatory editable dropdown")
	public void user_verify_special_promotional_campaign_field_should_be_non_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("special_promotion_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("special_promotion_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("special_promotion_campaign"));
	    
	}

	@Then("user_0482 verify sourcing channel field should be mandatory editable dropdown")
	public void user_verify_sourcing_channel_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("sourcing_channel_Field"));
		

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_channel_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("sourcing_channel"));
	    
	}

	@Then("user_0482 verify business center code field should be mandatory editable dropdown")
	public void user_verify_business_center_code_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("business_center_code_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("business_center_code_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("Business_center_code"));
		
	    
	}

	@Then("user_0482 verify service type field should be mandatory editable dropdown")
	public void user_verify_service_type_field_should_be_mandatory_editable_dropdown() {
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_code_input")));
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("servicing_type_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("servicing_type"));
		
	    
	}

	@Then("user_0482 verify region field should be mandatory editable dropdown")
	public void user_verify_region_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("region_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("region_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("region"));
		
	    
	}

	@Then("user_0482 verify servicing branch field should be mandatory editable dropdown")
	public void user_verify_servicing_branch_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("servicing_branch_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("servicing_branch_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("servicing_branch"));
	    
	}

	@Then("user_0482 verify spoke location field should be non mandatory editable dropdown")
	public void user_verify_spoke_location_field_should_be_non_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("spoke_location_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("spoke_location_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("spoke_location"));
	    
	}

	@Then("user_0482 verify closing staff or servicing staff or RM field should be mandatory editable dropdown")
	public void user_verify_closing_staff_or_servicing_staff_or_rm_field_should_be_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("closing_staff_of_servicing_staff_RM_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("closing_staff_servicing_staff_RM"));
	    
	}

	@Then("user_0482 verify Topup type should be non mandatory editable dropdown")
	public void user_verify_topup_type_should_be_non_mandatory_editable_dropdown() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("topup_type_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("topup_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("Topup_Type"));
	    
	}
	@Then("user_0482 verify Topup Application should be non mandatory editable textbox")
	public void user_0482_verify_topup_application_should_be_non_mandatory_editable_textbox() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("TopupApplication_Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("TopupApplication_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						applicationDetailsElements.getElement("TopupApplication_input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("TopupApplication_input"))
						.sendKeys(appdataEntrtyTestData.get("Topup_Application"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_0482 verify sourcing type field should be mandatory editable lookup")
	public void user_verify_sourcing_type_field_should_be_mandatory_editable_lookup() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("sourcing_type_Field"));
		

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("sourcing_type"));
	
	    
	}

	@Then("user_0482 verify sourcing office field should be mandatory editable lookup")
	public void user_verify_sourcing_office_field_should_be_mandatory_editable_lookup() {
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("sourcing_office_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_office_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("sourcing_office"));
	    
	}

	@Then("user_0482 verify sourcing entity field should be mandatory editable lookup")
	public void user_verify_sourcing_entity_field_should_be_mandatory_editable_lookup() {
	    
		userUtility.verifyGivenFieldIsMandatory(driver, applicationDetailsElements.getElement("sourcing_entity_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_entity_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("sourcing_entity"));
	}

	@Then("user_0482 verify sourcing staff field should be non mandatory editable lookup")
	public void user_verify_sourcing_staff_field_should_be_non_mandatory_editable_lookup() {
		JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
		for (int i = 0; i <2000; i++) {
			try {
				String Field = javascriptHelper.executeScript("return "+applicationDetailsElements.getElement("sourcing_staff_Field")).toString();
				System.out.println(Field);
				softAssert.assertFalse(Field.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					System.out.println(e.getMessage());
					softAssert.fail("Given field is mandatory");
				}
			}
			catch (AssertionError e) {
				if (i==1999) {
					System.out.println(e.getMessage());
					softAssert.fail("Given field is not mandatory");
				}
			}
		}
		
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("sourcing_staff_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("sourcing_staff"));
		
	
	    
	}

	@Then("user_0482 verify reference type field should be non mandatory editable lookup")
	public void user_verify_reference_type_field_should_be_non_mandatory_editable_lookup() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("reference_type_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("reference_type"));
	    
	}

	@Then("user_0482 verify reference entity field should be non mandatory editable lookup")
	public void user_verify_reference_entity_field_should_be_non_mandatory_editable_lookup() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("reference_entity_Field"));
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(applicationDetailsElements.getElement("reference_entity_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage()); 
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("reference_entity"));
	    
	}

	@Then("user_0482 verify reference code field should be non mandatory editable textbox")
	public void user_verify_reference_code_field_should_be_non_mandatory_editable_textbox() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, applicationDetailsElements.getElement("reference_code_Field"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						applicationDetailsElements.getElement("reference_code_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						applicationDetailsElements.getElement("reference_code_input"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								applicationDetailsElements.getElement("reference_code_input"))
						.sendKeys(appdataEntrtyTestData.get("reference_code"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Then("user_0482 click on save button in application details new app record")
	public void user_click_on_save_button_in_application_details_new_app_record() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonJSPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Then("user_0482 verify system should save the record of application details new app")
	public void user_verify_system_should_save_the_record_of_application_details_new_app() {
		String toastMessage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				toastMessage = javascriptHelper
						.executeScript("return " + commonJSPaths.getElement("toast_container_message")).toString();
				if (!(toastMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(toastMessage.contains(" Success! Record  updated for ID:"),
				"Record is not saved hence failed");
		toastMessageForReferenceNumber = toastMessage;
		System.out.println(toastMessage);
	    
	}
	@Given("user_0482 invoke soft assert for new application screen")
	public void user_invoke_soft_assert_for_new_application_screen() {
	    softAssert.assertAll();
	}
	

}
