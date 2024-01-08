package stepdefinitions;

import java.awt.Robot;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
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
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_0482;

public class Murabha_ContractSigning {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	MurabhaLogin murabhaLogin = new MurabhaLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\MurabhaJSPaths.xlsx";
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Murabha_CommonElements", "Murabha_CommonFieldName",
			"JSPath");
	JSPaths contractSigningElements = new JSPaths(excelFilePathForJS, "MurabhaContractSigningJS",
			"Murabha_contractsigning_fieldName", "JSPath");
	String contactSigningExcelDataPath = System.getProperty("user.dir") + "\\TestData\\MurabhaTestData.xlsx";
	BrowserHelper browserHelper= new BrowserHelper(driver);
	ExcelData excelDataForContractSigningTestData = new ExcelData(contactSigningExcelDataPath,
			"MurabhaContractSigningTestData", "Dataset ID");
	ExcelData excelDataForContractSigningMurabhaExecutionData = new ExcelData(contactSigningExcelDataPath,
			"Appdata_EmployementDetailsExe", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> contractSigningTestData = new HashMap<>();
	Map<String, String> contractSigningExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";
	
	@And("user_0482 get the test data for test case id AT_MU_CS_03")
	public void user_get_the_test_data_for_test_case_id_at_mu_cs_03() {
		contractSigningTestData = excelDataForContractSigningTestData.getTestdata("AT_MU_CS_03_D1");
	}
	@And("user_0482 get the test data for test case id AT_MU_CS_01")
	public void user_0482_0482_get_the_test_data_for_test_case_id_at_mu_cs_01() {
		contractSigningTestData = excelDataForContractSigningTestData.getTestdata("AT_MU_CS_01_D1");
	}
	@And("user_0482 get the test data for test case id AT_MU_CS_02")
	public void user_0482_get_the_test_data_for_test_case_id_at_mu_cs_02() {
		contractSigningTestData = excelDataForContractSigningTestData.getTestdata("AT_MU_CS_02_D1");
	}
	@And("user_0482 search the contract signing stage record reference number in Murabha")
	public void user_0482_0482_search_the_contract_signing_stage_record_reference_number_in_murabha() {
		
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(commonJSPaths.getElement("mail_box_search_text")).sendKeys(contractSigningTestData.get("record_reference_number"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 select the contract signing stage record from mail box in Murabha")
	public void user_0482_0482_select_the_contract_signing_stage_record_from_mail_box_in_murabha() {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 300; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				//System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
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
				//	System.out.println("Number of record in mail box " + recordRefNumber);
				//	System.out.println(contractSigningTestData.get("record_reference_number"));
					if (recordRefNumber.equals(contractSigningTestData.get("record_reference_number"))) {
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
	
	@And("user_0482 Verify the promissory tab is visible and click")
	public void user_0482_verify_the_promissory_tab_is_visible_and_click() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		first: for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelectorAll('ion-segment-button')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().contains("Promissory Note")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-segment-button')["+j+"]";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					addButton.click();
					break first;
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

	@And("user_0482 Verify the contract signing tab is visible and click")
	public void user_0482_0482_verify_the_contract_signing_tab_is_visible_and_click() {
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
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
				if (titlename.trim().contains("Contract Signing")) {
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

	@And("user_0482 Verify the contract signing Authority field should be dropdwon mandatory and editable")
	public void user_0482_0482_verify_the_contract_signing_authority_field_should_be_dropdwon_mandatory_and_editable() {
	   userUtility.verifyGivenFieldIsMandatory(driver, contractSigningElements.getElement("ContractSigningAuthorityMandatoryCheck"));
	   for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("ContractSigningAuthorityDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	   for (int i = 0; i <100; i++) {
		try {
			String dropDownValue = javascriptHelper
			.executeScript("return " + contractSigningElements.getElement("ContractSigningAuthorityText")).toString();
			System.out.println(dropDownValue);
			if (dropDownValue.trim().equals(contractSigningTestData.get("ContractSigningAuthority1"))) {
				clicksAndActionsHelper.jsSelectUsingText(contractSigningTestData.get("ContractSigningAuthority2"));
				break;
			}
			else {
				clicksAndActionsHelper.jsSelectUsingText(contractSigningTestData.get("ContractSigningAuthority1"));
				break;
			}
		} catch (Exception e) {
			if (i==99) {
				Assert.fail(e.getMessage());
			}
		}
	}
		
	}

	@And("user_0482 Verify the offered amount field should be number mandatory and editable")
	public void user_0482_0482_verify_the_offered_amount_field_should_be_number_mandatory_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver, contractSigningElements.getElement("OfferedAmountMandatoryCheck"));
		
	}

	@And("user_0482 Verify the contract signing date field should be date mandatory and editable")
	public void user_0482_0482_verify_the_contract_signing_date_field_should_be_date_mandatory_and_editable() {
		System.out.println(contractSigningElements.getElement("ContractSigningdateMandatoryCheck"));
		userUtility.verifyGivenFieldIsMandatory(driver,contractSigningElements.getElement("ContractSigningdateMandatoryCheck"));
		LocalDate now = LocalDate.now().minusMonths(1);
		System.out.println(now);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String ContractSigningdate=now.format(ofPattern);
		System.out.println(now.format(ofPattern));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("ContractSigningdateInput"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <=10; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(contractSigningElements.getElement("ContractSigningdateInput"))
				.sendKeys(Keys.BACK_SPACE);
			} catch (Exception e) {
				if (i ==10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(contractSigningElements.getElement("ContractSigningdateInput"))
				.sendKeys(ContractSigningdate);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("user_0482 Verify the contract Validity date field should be date mandatory and editable")
	public void user_0482_0482_verify_the_contract_validity_date_field_should_be_date_mandatory_and_editable() {
		userUtility.verifyGivenFieldIsMandatory(driver, contractSigningElements.getElement("ContractValidityMandatoryCheck"));
		LocalDate now = LocalDate.now().minusMonths(1).plusDays(10);
		System.out.println(now);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String ContractValidityDate=now.format(ofPattern);
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("ContractValidityInput"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i <=10; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(contractSigningElements.getElement("ContractValidityInput"))
				.sendKeys(Keys.BACK_SPACE);
			} catch (Exception e) {
				if (i ==10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(contractSigningElements.getElement("ContractValidityInput"))
				.sendKeys(ContractValidityDate);
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("user_0482 Verify functionality of Save button in contract signing screen")
	public void user_0482_0482_verify_functionality_of_save_button_in_contract_signing_screen() {
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
		System.out.println(commonJSPaths.getElement("toast_container_message"));
		for (int i = 0; i <= 200; i++) {
			try {
				
				String toastMessage = javascriptHelper.executeScript("return "+commonJSPaths.getElement("toast_container_message")).toString();
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
	@And("user_0482 click save button in promissory notes screen")
	public void user_0482_click_save_button_in_promissory_notes_screen() {
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
	
	@And("user_0482 click add button in promissory notes screen")
	public void user_0482_click_add_button_in_promissory_notes_screen() {
		String length =null;
		String title;
		String titlename;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		first: for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				title ="return document.querySelectorAll('ion-title')["+j+"].innerText";
				titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				if (titlename.trim().equals("Application Details")) {
					continue first;
				}
				else if (titlename.trim().contains("Promissory Details")) {
					System.out.println("condition true");
					String jspath ="document.querySelectorAll('ion-title')["+j+"].parentElement.nextElementSibling.querySelector('button')";
					WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
//					System.out.println(jspath);
//					javascriptHelper.scrollIntoView(addButton);
					addButton.click();
					break first;
				}
			}
		} catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}

	@And("user_0482 Verify the functionality of back button in promissory notes screen")
	public void user_0482_verify_the_functionality_of_back_button_in_promissory_notes_screen() {

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

	@And("user_0482 Verify the promissory note frequency field")
	public void user_0482_verify_the_promissory_note_frequency_field() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("PromissoryNoteFrequencydropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length =null;
		for (int i = 0; i <500; i++) {
			try {
			    length = javascriptHelper.executeScript("return document.querySelector('ion-label[ng-reflect-text=\"Promissory Note Frequency.TOOL\"]').nextElementSibling.querySelectorAll('ion-select-option').length").toString();
			    System.out.println(length);
				if (!length.isBlank()&&!length.equalsIgnoreCase("0")) {
					break;
				}
			} catch (Exception e) {
				if (i==499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		List<String> values = new LinkedList<String>();
		for (int i = 0; i <500; i++) {
		try {
			for (int j = 0; j <Integer.parseInt(length); j++) {
				String title ="return document.querySelector('ion-label[ng-reflect-text=\"Promissory Note Frequency.TOOL\"]').nextElementSibling.querySelectorAll('ion-select-option')["+j+"].innerText";
				String titlename = javascriptHelper.executeScript(title).toString();
				System.out.println(titlename);
				values.add(titlename.trim());
				
		}
			break;
		}catch (Exception e) {
			if (i==499) {
				Assert.fail(e.getMessage());
			}
		}
		
	}
		for (String string : values) {
			System.out.println(string);
		}
	Assert.assertTrue(values.contains("Single"));
	Assert.assertTrue(values.contains("Multiple"));
	clicksAndActionsHelper.jsSelectUsingText(contractSigningTestData.get("PromissoryNoteFrequency"));
	
	}

	@And("user_0482 Verify the Number of promissory note field")
	public void user_0482_verify_the_number_of_promissory_note_field() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
						.sendKeys(contractSigningTestData.get("NoOfPromissoryNote"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
						.getAttribute("type").equals("number");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	}
	@And("user_0482 Verify blank filed validation in promissory notes screen")
	public void user_0482_verify_blank_filed_validation_in_promissory_notes_screen() {
		System.out.println(commonJSPaths.getElement("toast_message"));
		for (int i = 0; i <= 200; i++) {
			try {
				String toastMessage = javascriptHelper.executeScript("return "+commonJSPaths.getElement("toast_message")).toString();
				System.out.println(toastMessage);
				Assert.assertTrue(toastMessage.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i ==200) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i==200) {
					System.out.println(e2.getMessage());
					Assert.fail(e2.getMessage());
				}
				
			}
		}
	}

	@And("user_0482 Verify the number of promissory note does not allow character value")
	public void user_0482_verify_the_number_of_promissory_note_does_not_allow_character_value() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
				.click();
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
						.sendKeys(contractSigningTestData.get("CharacterInvalidData"));			
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote_InvalidData"))
						.getAttribute("ng-reflect-model").equals("2");	
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user_0482 Verify the number of promissory note does not allow special character")
	public void user_verify_the_number_of_promissory_note_does_not_allow_special_character() {
		for (int i = 0; i <=10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
						.sendKeys(Keys.BACK_SPACE);			
				
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
				.click();
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote"))
						.sendKeys(contractSigningTestData.get("SpeicalCharacterInvalidData"));			
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("NumberOfPromissoryNote_InvalidData"))
						.getAttribute("ng-reflect-model").equals("2");	
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user_0482 Verify the promissory note frequency field in promissory details list view")
	public void user_0482_verify_the_promissory_note_frequency_field_in_promissory_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("Promissory Note Frequency_List")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}

	@And("user_0482 Verify the number of promissory note field in promissory details list view")
	public void user_0482_verify_the_number_of_promissory_note_field_in_promissory_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("Number of Promissory Note_List ")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}

	@And("user_0482 Verify the promissory status field in promissory details list view")
	public void user_0482_verify_the_promissory_status_field_in_promissory_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("Promissory Status_List")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}
	@And("user_0482 click first view icon in promissory details list  view")
	public void user_0482_click_first_view_icon_in_promissory_details_list_view() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contractSigningElements.getElement("PromissoryDetailsFirstViewIcon"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_0482 Verify the promissory Note Percentage field in promissory note details list view")
	public void user_0482_verify_the_promissory_note_percentage_field_in_promissory_note_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("PromissoryNotePercentage")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}

	@And("user_0482 Verify the promissory Note Amount field in promissory note details list view")
	public void user_0482_verify_the_promissory_note_amount_field_in_promissory_note_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("PromissoryNoteAmount")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}

	@And("user_0482 Verify the promissory Note Date field in promissory note details list view")
	public void user_0482_verify_the_promissory_note_date_field_in_promissory_note_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("PromissoryNoteDate")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}

	@And("user_0482 Verify the Is promissory Note signed field in promissory note details list view")
	public void user_0482_verify_the_is_promissory_note_signed_field_in_promissory_note_details_list_view() {
		for (int i = 0; i <=10; i++) {
			try {
				Assert.assertTrue(!javascriptHelper.executeScript("return "+contractSigningElements.getElement("IsPromissoryNoteSigned")).toString().isEmpty());
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
				
			}
			catch (AssertionError e2) {
				if (i == 300) {
					Assert.fail(e2.getMessage());
				}
			}
			
		}
	}

	
	
	
	
	}
	
	



