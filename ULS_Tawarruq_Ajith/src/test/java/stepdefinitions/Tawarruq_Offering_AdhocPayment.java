package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
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

public class Tawarruq_Offering_AdhocPayment {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	TawarruqLogin tawarruqLogin = new TawarruqLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
			"JSPath");
	JSPaths adhocPaymentElements = new JSPaths(excelFilePathForJS, "AdhocPayment",
			"Tawarruq_AdocPayment_fieldName", "JSPath");
	String TestDataExcelDataPath = System.getProperty("user.dir") + "\\TestData\\TawarruqTestData.xlsx";
	BrowserHelper browserHelper= new BrowserHelper(driver);
	ExcelData excelDataForadhocPaymentTestData = new ExcelData(TestDataExcelDataPath,
			"AdhocPaymentTestData", "Dataset ID");
	ExcelData excelDataForApplicationDetailsTawarruqExecutionData = new ExcelData(TestDataExcelDataPath,
			"Appdata_ApplicationDetailsExe", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> appdataEntrtyTestData = new HashMap<>();
	Map<String, String> appdataEntrtyExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	
	@And("user_0482 get the test data for test case id AT_TW_APD_01")
	public void user_get_the_test_data_for_test_case_id_at_tw_apd_01() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("TW_APD_01");
		appdataEntrtyTestData = excelDataForadhocPaymentTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	    
	}
	@And("user_0482 get the test data for test case id AT_TW_APD_02")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_apd() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("TW_APD_02");
		appdataEntrtyTestData = excelDataForadhocPaymentTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}
	@And("user_0482 get the test data for test case id AT_TW_APD_03")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_apd_03() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("TW_APD_03");
		appdataEntrtyTestData = excelDataForadhocPaymentTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}
	@And("user_0482 get the test data for test case id AT_TW_APD_04")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_apd_04() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("TW_APD_04");
		appdataEntrtyTestData = excelDataForadhocPaymentTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}
	@And("user_0482 get the test data for test case id AT_TW_APD_05")
	public void user_0482_get_the_test_data_for_test_case_id_at_tw_apd_05() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("TW_APD_05");
		appdataEntrtyTestData = excelDataForadhocPaymentTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}
	@And("user_0482 get the test data for test case id AT_TW_APD_06")
	public void user_get_the_test_data_for_test_case_id_at_tw_apd() {
		appdataEntrtyExecutionData = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("TW_APD_06");
		appdataEntrtyTestData = excelDataForadhocPaymentTestData
				.getTestdata(appdataEntrtyExecutionData.get("dataSet_ID"));
	}
	
	@And("user_0482 search the offering stage record reference number in Tawarruq")
	public void user_0482_search_the_offering_stage_record_reference_number_in_tawarruq() {
		System.out.println(appdataEntrtyTestData.get("record_reference_number"));
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

	@And("user_0482 select the offering stage record from mail box in Tawarruq")
	public void user_select_the_offering_stage_record_from_mail_box_in_tawarruq() {
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

	@And("user_0482 click adhoc payment tab in offering stage Tawarruq")
	public void user_0482_click_adhoc_payment_tab_in_offering_stage_tawarruq() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()) {
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
				if (titlename.trim().contains("Adhoc Payment")) {
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

	@And("user_0482 click add button in adhoc payment offering stage Tawarruq")
	public void user_0482_click_add_button_in_adhoc_payment_offering_stage_tawarruq() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
			    System.out.println(length);
				if (!length.isBlank()) {
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
				if (titlename.trim().contains("Ad Hoc Payment Details")) {
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

	@And("user_0482 Verify Transaction type field should be present")
	public void user_0482_verify_transaction_type_field_should_be_present() {
		System.out.println(adhocPaymentElements.getElement("TransactionType Field"));
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("TransactionType Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 Verify Transaction type field should be Non Mandatory and editable")
	public void user_0482_verify_transaction_type_field_should_be_non_mandatory_and_editable() {
		userUtility.verifyGivenFieldIsNotMandatory(driver,adhocPaymentElements.getElement("TransactionType Mandatory Check"));
	    for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(adhocPaymentElements.getElement("TransactionType dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("Transaction Type"));
	    
	}

	@And("user_0482 Verify Transaction Against field should be present")
	public void user_0482_verify_transaction_against_field_should_be_present() {
	   
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("Transaction Against Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 Verify Transaction Against field should be Non Mandatory and editable")
	public void user_0482_verify_transaction_against_field_should_be_non_mandatory_and_editable() {
	   
		userUtility.verifyGivenFieldIsNotMandatory(driver,adhocPaymentElements.getElement("Transaction Against Mandatory Check"));
	    for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(adhocPaymentElements.getElement("Transaction Against dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("Transaction Against"));
	}

	@And("user_0482 Verify Reference number field should be present")
	public void user_0482_verify_refernce_number_field_should_be_present() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("Reference number Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 Verify Reference number field should be Non Mandatory and editable")
	public void user_0482_verify_refernce_number_field_should_be_non_mandatory_and_editable() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, adhocPaymentElements.getElement("Reference number Mandatory Check"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Reference number textbox"))
						.sendKeys(appdataEntrtyTestData.get("Reference number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 Verify Paid amount field should be present")
	public void user_0482_verify_paid_amount_field_should_be_present() {
		for (int i = 0; i < 200; i++) {
			try {
				WebElement primaryEmployment = javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("Paid amount Field"));
				Assert.assertTrue(primaryEmployment.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 Verify Paid amount field should be Non Mandatory and editable")
	public void user_0482_verify_paid_amount_field_should_be_non_mandatory_and_editable() {
		userUtility.verifyGivenFieldIsNotMandatory(driver, adhocPaymentElements.getElement("Paid amount Mandatory Check"));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Paid amount textbox"))
						.sendKeys(appdataEntrtyTestData.get("Paid Amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 click save button in Adhoc payment offering stage")
	public void user_0482_click_save_button_in_adhoc_payment_offering_stage() {
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
		
	}

	@And("user_0482 Verify Ok and Close button after click save button")
	public void user_0482_verify_ok_and_close_button_after_click_save_button() {
		System.out.println(commonJSPaths.getElement("toast_container_message"));
		for (int i = 0; i <= 300; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+commonJSPaths.getElement("toast_container_message")).toString();
				System.out.println(toastMessage);
				Assert.assertTrue(toastMessage.contains("Success"));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i==300) {
					Assert.fail(e2.getMessage());
				}
				
			}
		}
	    
	}

	@And("user_0482 Verify the functionalities of back button in Adhoc payment offering stage")
	public void user_0482_verify_the_functionalities_of_back_button_in_adhoc_payment_offering_stage() {
	   
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSPaths.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	
	}
	@Given("user_0482 enter invalid character in Reference number and validate")
	public void user_0482_enter_invalid_character_in_reference_number_and_validate() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Reference number textbox"))
						.sendKeys(appdataEntrtyTestData.get("Reference number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+adhocPaymentElements.getElement("Reference number textbox Attribute")).toString();
				System.out.println(toastMessage);
				softAssert.assertNotEquals(toastMessage, appdataEntrtyTestData.get("Reference number"));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
	}
	@Given("user_0482 enter invalid character in paid amount and validate")
	public void user_0482_enter_invalid_character_in_paid_amount_and_validate() {
	    
		for (int i = 0; i <= 300; i++) {
			
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Paid amount textbox"))
						.sendKeys(appdataEntrtyTestData.get("Paid Amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+adhocPaymentElements.getElement("Paid amount textbox Attribute")).toString();
				System.out.println(toastMessage);
				softAssert.assertNotEquals(toastMessage, appdataEntrtyTestData.get("Paid Amount"));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		softAssert.assertAll();

	}
	

	@And("user_0482 Verify Transaction type field should be able to Modify")
	public void user_0482_verify_transaction_type_field_should_be_able_to_modify() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(adhocPaymentElements.getElement("TransactionType dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("Transaction Type"));
	    
	}

	@And("user_0482 Verify Transaction Against field should be able to Modify")
	public void user_0482_verify_transaction_against_field_should_be_able_to_modify() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(adhocPaymentElements.getElement("Transaction Against dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(appdataEntrtyTestData.get("Transaction Against"));
	    
	}

	@And("user_0482 Verify Reference number field should be able to Modify")
	public void user_0482_verify_reference_number_field_should_be_able_to_modify() {
	    
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Reference number textbox"))
						.sendKeys(appdataEntrtyTestData.get("Reference number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify Paid amount field should be able to Modify")
	public void user_0482_verify_paid_amount_field_should_be_able_to_modify() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Paid amount textbox"))
						.sendKeys(appdataEntrtyTestData.get("Paid Amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("user_0482 click upadte button in Adhoc payment offering stage")
	public void user_0482_click_upadte_button_in_adhoc_payment_offering_stage() {
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
	    
	}
	@And("user_0482 click first record in adhoc payment tab under offering details Tawarruq Application")
	public void user_0482_click_first_record_in_adhoc_payment_tab_under_offering_details_tawarruq_application() {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("AdhocPayment First Edit Icon")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	}
	@And("user_0482 enter invalid character in Reference number upadte screen and validate")
	public void user_0482_enter_invalid_character_in_reference_number_upadte_screen_and_validate() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Reference number textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Reference number textbox"))
						.sendKeys(appdataEntrtyTestData.get("Reference number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+adhocPaymentElements.getElement("Reference number textbox Attribute")).toString();
				System.out.println(toastMessage);
				softAssert.assertNotEquals(toastMessage, appdataEntrtyTestData.get("Reference number"));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
	}

	@And("user_0482 enter invalid character in paid amount update screen and validate")
	public void user_0482_enter_invalid_character_in_paid_amount_update_screen_and_validate() {
for (int i = 0; i <= 300; i++) {
			
			try {
				javascriptHelper.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						adhocPaymentElements.getElement("Paid amount textbox"))
				.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								adhocPaymentElements.getElement("Paid amount textbox"))
						.sendKeys(appdataEntrtyTestData.get("Paid Amount"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+adhocPaymentElements.getElement("Paid amount textbox Attribute")).toString();
				System.out.println(toastMessage);
				softAssert.assertNotEquals(toastMessage, appdataEntrtyTestData.get("Paid Amount"));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		softAssert.assertAll();
	}
	
	@And("user_0482 click deactivate button and verify status deactivated")
	public void user_0482_click_deactivate_button_and_verify_status_deactivated() {
	    softAssert.fail("Deactive button not visible");
	}

	@And("user_0482 click activate button and verify status activated")
	public void user_0482_click_activate_button_and_verify_status_activated() {
		softAssert.fail("Deactive button not visible");
		softAssert.assertAll();
	}
	
	@And("user_0482 click search button in list view adhoc payment in Offering stageTawarruq")
	public void user_0482_click_search_button_in_list_view_adhoc_payment_in_offering_stage_tawarruq() {
	    
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("SearchButton")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 search and validate matched data in list view adhoc payment in Offering stageTawarruq")
	public void user_0482_search_and_validate_matched_data_in_list_view_adhoc_payment_in_offering_stage_tawarruq() {
	    
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("SearchInput"))
				.sendKeys(appdataEntrtyTestData.get("ValidInput"));
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("SearchInput")).clear();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+adhocPaymentElements.getElement("ValidaMatchData")).toString();
				System.out.println(toastMessage);
				System.out.println(appdataEntrtyTestData.get("ValidInput"));
				Assert.assertEquals(toastMessage, appdataEntrtyTestData.get("ValidInput"));
				break;
			} catch (Exception e) {
				if (i ==300) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		
	}

	@And("user_0482 search and validate unmatched data in list view adhoc payment in Offering stageTawarruq")
	public void user_0482_search_and_validate_unmatched_data_in_list_view_adhoc_payment_in_offering_stage_tawarruq() {
		String documentDetailsSearchResult = "";
		/*
		 * for (int i = 0; i <= 1; i++) { try { //
		 * javascriptHelper.executeScriptWithWebElement(documentdetailsJsPaths.
		 * getElement("financialCommitmentSearchInput")) // .sendKeys("USD");
		 * javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement(
		 * "SearchInput")) .sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
		 * 
		 * } catch (Exception e) {
		 * 
		 * } } for (int i = 0; i <= 500; i++) { try {
		 * javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement(
		 * "SearchInput")) .sendKeys(appdataEntrtyTestData.get("InvalidInput")); break;
		 * } catch (Exception e) { if (i == 500) { Assert.fail(e.getMessage()); } } }
		 */
		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("SearchInput"))
				.sendKeys(appdataEntrtyTestData.get("InValidInput"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				
				documentDetailsSearchResult = javascriptHelper
						.executeScript("return " + adhocPaymentElements.getElement("InvalidData"))
						.toString();
				System.out.println(documentDetailsSearchResult);
				if(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"))
				{
				break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(documentDetailsSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	    
	}

	@And("user_0482 click export to pdf button in list view adhoc payment in Offering stageTawarruq and validate the downloaded file")
	public void user_0482_click_export_to_pdf_button_in_list_view_adhoc_payment_in_offering_stage_tawarruq_and_validate_the_downloaded_file() {
	    
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("ExportXLS")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			//System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerDebtDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				Assert.assertTrue(downloadsFile.getName().contains("AD HOC Payment Details"));
				downloadsFile.delete();
			}
        }
	}

	@And("user_0482 click export to excel button in list view adhoc payment in Offering stageTawarruq and validate the downloaded file")
	public void user_0482_click_export_to_excel_button_in_list_view_adhoc_payment_in_offering_stage_tawarruq_and_validate_the_downloaded_file() {
		System.out.println(adhocPaymentElements.getElement("ExportPDF"));
		for (int i = 0; i <= 300; i++) {
			try {
				
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("ExportPDF")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			//System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerDebtDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerDebtDataFile"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
        }
	  
	}
	
	@Given("user_0482 click Export drop down in list view adhoc payment in Offering stageTawarruq")
	public void user_0482_click_export_drop_down_in_list_view_adhoc_payment_in_offering_stage_tawarruqr() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(adhocPaymentElements.getElement("ExportIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	
}
