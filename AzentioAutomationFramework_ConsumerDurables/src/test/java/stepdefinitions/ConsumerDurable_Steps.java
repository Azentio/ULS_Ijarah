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
import pageobjects.JSPaths;
import resources.BaseClass;

public class ConsumerDurable_Steps {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths commonElementsJsPaths = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");
	JSPaths contactDetailsJsPaths = new JSPaths(excelPath, "ContactDetails_Elements", "ContactDetails_FieldName",
			"JSPath");
	JSPaths referenceDetailsJsPaths = new JSPaths(excelPath, "ReferenceDetails_Elements", "ReferenceDetails_FieldName",
			"JSPath");

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

	ExcelData contactDetailsExcelData = new ExcelData(excelTestDataPath, "ADE_ContactDetails", "DataSet ID");
	ExcelData referenceDetailsExcelData = new ExcelData(excelTestDataPath, "ADE_ReferenceDetails", "DataSet ID");

	ExcelData testExecution = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

//	Consumer Durable -- App Data Entry Stage  -- Contact Details screen
	@And("^User_608 get the test data for test case AT_CD_ADE_CD_01$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_01");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_02$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_02");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_03$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_03");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_04$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_04");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_05$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_05");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_06$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_06() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_06");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_07$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_07() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_07");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_08$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_08() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_08");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CD_09$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CD_09() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CD_09");
		testData = contactDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

//	Consumer Durable -- App Data Entry Stage  -- Reference Details screen
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_01$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_01() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_01");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CR_02$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_02() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_02");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}

	@And("^User_608 get the test data for test case AT_CD_ADE_CR_03$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_03() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_03");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_04$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_04() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_04");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_05$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_05() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_05");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_06$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_06() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_06");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_07$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_07() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_07");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_08$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_08() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_08");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	@And("^User_608 get the test data for test case AT_CD_ADE_CR_09$")
	public void get_the_test_data_for_test_case_AT_CD_ADE_CR_09() throws Throwable {
		testExecutionData = testExecution.getTestdata("AT_CD_ADE_CR_09");
		testData = referenceDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
	}
	
	
	
	
//	===============================================================================================================================
	@And("User_608 click the module name dropdown in ULS application")
	public void user_608_click_the_module_name_dropdown_in_uls_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("module_dropdown"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 select the module name as LOS in ULS application")
	public void user_608_select_the_module_name_as_los_in_uls_application() throws Throwable {
		String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
		String moduleLength = "";
		for (int i = 0; i <= 300; i++) {
			try {
				moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
				System.out.println("Module Length " + moduleLength);
				if (!(moduleLength.isBlank()) && !moduleLength.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveIntegerLength = Integer.parseInt(moduleLength);
		for (int i = 0; i < premitiveIntegerLength; i++) {
			for (int j = 0; j <= 300; j++) {
				try {
					String moduleName = javascriptHelper.executeScript(
							"return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
							.toString();
					if (moduleName.equalsIgnoreCase("LOS")) {
						System.out
								.println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
						javascriptHelper
								.executeScriptWithWebElement(
										"document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
								.click();
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("User_608 click the Mail box in ULS application")
	public void user_608_click_the_mail_box_in_uls_application() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("mail_box"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Search button under inbox")
	public void user_608_click_the_search_button_under_inbox() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("mail_box_search_button"));
				element.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 search the Reference ID for Consumer Durable")
	public void user_search_the_reference_id_for_consumer_durable() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("mail_box_search_text"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Entitle button under inbox")
	public void user_608_click_the_entitle_button_under_inbox() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]').length")
						.toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
					break;
				}
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 300; i++) {
			try {
				String jspath = "document.querySelectorAll('button[ng-reflect-text=\"Entitle\"]')["
						+ (Integer.parseInt(length) - 1) + "]";
				WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 click the Additional Customer Info tab")
	public void user_608_click_the_additional_customer_info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
//					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("Additional Customer Info")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement tab = javascriptHelper.executeScriptWithWebElement(jspath);
						tab.click();
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

	@And("User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab")
	public void user_608_click_the_pencil_icon_button_in_customer_personal_info_section_under_additional_customer_info_tab()
			throws Throwable {
		String listOfRecords = "document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td').length";
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
							javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "].parentElement.querySelector('button')"));
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelector('button[icon=\"pi pi-plus\"]').parentElement.parentElement.parentElement.parentElement.querySelectorAll('td')["
											+ j + "].parentElement.querySelector('button')")
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

//	AT_CD_ADE_CD_01
	@And("^User_608 click Add button under Contact Details section in Additional Customer Info tab$")
	public void user_608_click_add_button_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
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

	@And("^User_608 verify Back button available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_back_button_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
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
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Back button should be displayed in Contact Details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Save button available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_save_button_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				javascriptHelper.backgroundBorder(saveBtn);
				softAssert.assertTrue(saveBtn.isDisplayed(), "Save button available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Details section available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_phone_details_section_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneDetailsSection"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Phone Details section available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email Details section available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_email_details_section_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailDetailsSection"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Email Details section available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Type field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_phone_type_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneTypeLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Phone Type field available in Contact Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Phone Type field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Number field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_phone_number_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Phone Number field available in Contact Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Phone Number field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Consent for Phone contact field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_consent_for_phone_contact_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("consentForPhContactLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Consent for Phone contact field available in Contact Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("consentForPhContactDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(),
						"Consent for Phone contact field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Prefered Phone Cotact Type field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_prefered_phone_cotact_type_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferedPhContactTypeLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Prefered Phone Cotact Type field available in Contact Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferedPhContactTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(),
						"Prefered Phone Cotact Type field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Prefered Time for Contact field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_prefered_time_for_contact_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferredtimeofcontactLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Prefered Time for Contact field available in Contact Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferredtimeofcontactInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Prefered Time for Contact field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email Type field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_email_type_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailTypeLabel"));
				actions.scrollToElement(label).build().perform();
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Email ID field available in Contact Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailTypeDropdown"));
				actions.scrollToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Email ID field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email ID field available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_email_id_field_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDLabel"));
				actions.scrollToElement(label).build().perform();
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Email ID field available in Contact Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDInput"));
				actions.scrollToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Email ID field available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 invoke soft assert in Contact details screen under Additional Customer Info tab at App Data Entry stage$")
	public void user_608_invoke_soft_assert_in_contact_details_screen_under_additional_customer_info_tab_at_app_data_entry_stage()
			throws Throwable {
		softAssert.assertAll();
	}

//	AT_CD_ADE_CD_02
	@And("^User_608 select Phone Type value from dropdown in Contact Details screen$")
	public void user_608_select_phone_type_value_from_dropdown_in_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("PhoneType"))) {
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

	@And("^User_608 enter the Phone Number in Contact Details screen$")
	public void user_608_enter_the_phone_number_in_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"))
						.sendKeys(testData.get("PhoneNumber"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 select Consent for Phone contact value from dropdown in Contact Details screen$")
	public void user_608_select_consent_for_phone_contact_value_from_dropdown_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("consentForPhContactDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("ConsentPhoneContact"))) {
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

	@And("^User_608 select Prefered Phone Cotact Type value from dropdown in Contact Details screen$")
	public void user_608_select_prefered_phone_cotact_type_value_from_dropdown_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferedPhContactTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("PreferedPhoneContactType"))) {
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

	@And("^User_608 select Email Type value from dropdown in Contact Details screen$")
	public void user_608_select_email_type_value_from_dropdown_in_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailTypeDropdown"));
				actions.scrollToElement(element).build().perform();
				element.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("EmailType"))) {
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

	@And("^User_608 enter the Email ID in Contact Details screen$")
	public void user_608_enter_the_email_id_in_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDInput"))
						.sendKeys(testData.get("EmailID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Save button under Contact Details screen$")
	public void user_608_click_the_save_button_under_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				actions.scrollToElement(saveBtn).build().perform();
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify the Confimation message post clicking on save button in Contact Details screen$")
	public void user_608_verify_the_confimation_message_post_clicking_on_save_button_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_SuccessMsg"));
				String text = alertMsg.getText();
				softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Type field as Mandatory, Editable and Dropdown in Contact Details screen$")
	public void user_608_verify_phone_type_field_as_mandatory_editable_and_dropdown_in_contact_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneTypeLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(text.contains("*"), "Phone Type field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneType"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Phone Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Phone Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Number field as Mandatory, Editable and Numeric in Contact Details screen$")
	public void user_608_verify_phone_number_field_as_mandatory_editable_and_numeric_in_contact_details_screen()
			throws Throwable {
//		Verify field as Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(text.contains("*"), "Phone Number field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Phone Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
//		Verify field as Numeric
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"), "Phone Number field should Numeric");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Consent for Phone contact field as Non-mandatory, Editable and Dropdown in Contact Details screen$")
	public void user_608_verify_consent_for_phone_contact_field_as_nonmandatory_editable_and_dropdown_in_contact_details_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("consentForPhContactLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Consent for Phone contact field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("consentForPhContact"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Consent for Phone contact field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("consentForPhContactDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Consent for Phone contact field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Prefered Phone Cotact Type field as Non-mandatory, Editable and Dropdown in Contact Details screen$")
	public void user_608_verify_prefered_phone_cotact_type_field_as_nonmandatory_editable_and_dropdown_in_contact_details_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferedPhContactTypeLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Prefered Phone Cotact Type field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferedPhContactType"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Prefered Phone Cotact Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferedPhContactTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Prefered Phone Cotact Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Prefered Time for Contact field as Non-mandatory, Editable and Textbox with HH:MM format in Contact Details screen$")
	public void user_608_verify_prefered_time_for_contact_field_as_nonmandatory_editable_and_textbox_with_hhmm_format_in_contact_details_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferredtimeofcontactLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Prefered Time for Contact field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferredtimeofcontact"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Prefered Time for Contact field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("preferredtimeofcontactInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Prefered Time for Contact field should Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email Type field as Non-mandatory, Editable and Dropdown in Contact Details screen$")
	public void user_608_verify_email_type_field_as_nonmandatory_editable_and_dropdown_in_contact_details_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailTypeLabel"));
				actions.scrollToElement(label).build().perform();
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Email Type field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailType"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Email Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailTypeDropdown"));
				actions.scrollToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Email Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email ID field as Non-mandatory, Editable and textbox with valid email id format in Contact Details screen$")
	public void user_608_verify_email_id_field_as_nonmandatory_editable_and_textbox_with_valid_email_id_format_in_contact_details_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Email ID field should Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailID"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Email ID field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"), "Email ID field should Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Help button under Contact Details screen$")
	public void user_608_click_the_help_button_under_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement helpBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("help_button"));
				javascriptHelper.backgroundBorder(helpBtn);
				actions.scrollToElement(helpBtn).build().perform();
				helpBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on help button system should display the description of all the fields in Contact Details screen$")
	public void user_608_verify_post_clicking_on_help_button_system_should_display_the_description_of_all_the_fields_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement description = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("help_description"));
				javascriptHelper.scrollIntoView(description);
				javascriptHelper.backgroundBorder(description);
				softAssert.assertTrue(description.isDisplayed(),
						"System should display the description of all the fields in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Back button under Contact Details screen$")
	public void user_608_click_the_back_button_under_contact_details_screen() throws Throwable {
//		javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("help_button"));
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
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
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on Back button system should navigate to the previous screen under Additional Customer Info tab$")
	public void user_608_verify_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen_under_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(titlePath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Clicking on Back button system should navigate to the previous screen under Additional Customer Info tab");
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

//	AT_CD_ADE_CD_04
	@And("^User_608 enter the Special Character value in any field under Contact Details screen$")
	public void user_608_enter_the_special_character_value_in_any_field_under_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"))
						.sendKeys(testData.get("SpecialChar"));
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user enters special characters value in Contact Details screen$")
	public void user_608_to_verify_the_impact_when_user_enters_special_characters_value_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("specialChar_error"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.contains("Only Alphanumeric characters are allowed"),
						"Impact when user enters special characters value in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter the Characters values in numeric field under Contact Details screen$")
	public void user_608_enter_the_characters_values_in_numeric_field_under_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"))
						.sendKeys(testData.get("CharValues"));
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user enter characters value in numeric field under Contact Details screen$")
	public void user_608_to_verify_the_impact_when_user_enter_characters_value_in_numeric_field_under_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("invalidNumber_error"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.contains("Invalid Mobile Number"),
						"Impact when user enters characters value in numberic field under Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Save button user keep any mandatory field blank in Contact Details screen$")
	public void user_608_click_the_save_button_user_keep_any_mandatory_field_blank_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				actions.scrollToElement(saveBtn).build().perform();
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user keep any mandatory field blank in Contact Details screen$")
	public void user_608_to_verify_the_impact_when_user_keep_any_mandatory_field_blank_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("mandatoryFillToastMsg"));
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"),
						"Mandatory field blank message in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CD_05
	@And("^User_608 click the Contact Details record Edit button under Contact Details section in Additional Customer Info tab$")
	public void user_608_click_the_contact_details_record_edit_button_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
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

	@And("^User_608 verify Update button available in Contact Details screen under Additional Customer Info tab$")
	public void user_608_verify_update_button_available_in_contact_details_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement updateBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				javascriptHelper.backgroundBorder(updateBtn);
				softAssert.assertTrue(updateBtn.isDisplayed(), "Update button available in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Update button while modification when user keep any mandatory field blank in Contact Details screen$")
	public void user_608_click_the_update_button_while_modification_when_user_keep_any_mandatory_field_blank_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"));
				actions.scrollToElement(element).build().perform();
				element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				WebElement updateBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				actions.scrollToElement(updateBtn).build().perform();
				updateBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify validation message for while modification when user keep any mandatory field blank in Contact Details screen$")
	public void user_608_verify_validation_message_for_while_modification_when_user_keep_any_mandatory_field_blank_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("mandatoryFillToastMsg"));
				actions.scrollToElement(element).build().perform();
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"),
						"Mandatory field blank message in Contact Details screen while modification");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 while modification system enters the invalid data in Contact Details screen$")
	public void user_608_while_modification_system_enters_the_invalid_data_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDInput"));
				actions.scrollToElement(element).build().perform();
				element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				element.sendKeys(testData.get("InvalidData"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should not allow user to do a modification with invalid data in Contact Details screen$")
	public void user_608_verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("invalidEmail_error"));
				actions.scrollToElement(element).build().perform();
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.contains("Invalid Email"),
						"Impact when user modification with invalid data in Contact Details screen");
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify system allow user to modify the record with valid data in Contact Details screen$")
	public void user_608_to_verify_system_allow_user_to_modify_the_record_with_valid_data_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("emailIDInput"));
				element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				element.sendKeys(testData.get("EmailID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("phoneNumberInput"));
				actions.scrollToElement(element).build().perform();
				element.sendKeys(testData.get("PhoneNumber"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify while modification system allow user to Update the record with valid data in Contact Details screen$")
	public void user_608_to_verify_while_modification_system_allow_user_to_update_the_record_with_valid_data_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement updateBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				actions.scrollToElement(updateBtn).build().perform();
				updateBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the Confimation message post clicking on Update button in Contact Details screen$")
	public void user_608_to_verify_the_confimation_message_post_clicking_on_update_button_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_SuccessMsg"));
				String text = alertMsg.getText();
				softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CD_06
	@And("^User_608 click the Active record Edit button in Contact Details section under Additional Customer Info tab$")
	public void user_608_click_the_active_record_edit_button_in_contact_details_section_under_additional_customer_info_tab()
			throws Throwable {
//		document.querySelector('[ng-reflect-field="PhoneTypeDesc"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[4].parentElement.parentElement.querySelector('button[icon="pi pi-pencil"]')
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript(
						"return document.querySelector('[ng-reflect-field=\"PhoneTypeDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('[ng-reflect-field=\"PhoneTypeDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("Active")) {
						System.out.println("condition true");
						String titlePath = "document.querySelector('[ng-reflect-field=\"PhoneTypeDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
								+ j + "]";
						actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(titlePath)).build()
								.perform();
						String jspath = "document.querySelector('[ng-reflect-field=\"PhoneTypeDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
								+ j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).build().perform();
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

	@And("^User_608 click the Status toggle button in Contact Details screen$")
	public void user_608_click_the_status_toggle_button_in_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement toggleBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("statusToggleBtn"));
				actions.scrollToElement(toggleBtn).build().perform();
				toggleBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Update button under Contact Details screen$")
	public void user_608_click_the_update_button_under_contact_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement updateBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				actions.scrollToElement(updateBtn).build().perform();
				updateBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify if Status is Active post clicking on toggle button system should show Deactivate in Contact Details screen$")
	public void user_608_verify_if_status_is_active_post_clicking_on_toggle_button_system_should_show_deactivate_in_contact_details_screen()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1].parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("In-active")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
								+ "]";
						WebElement status = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(status);
						softAssert.assertTrue(status.isDisplayed(),
								"If Status is Active post clicking on toggle button system should show Deactivate in Contact Details screen");
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

	@And("^User_608 click the Deactivate record Edit button in Contact Details section under Additional Customer Info tab$")
	public void user_608_click_the_deactivate_record_edit_button_in_contact_details_section_under_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
							+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("In-active")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
								+ "].parentElement.parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundColor(btn);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify if Status is Deactivate post clicking on toggle button system should show Active in Contact Details screen$")
	public void user_608_verify_if_status_is_deactivate_post_clicking_on_toggle_button_system_should_show_active_in_contact_details_screen()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1].parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("Active")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1].parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
								+ j + "]";
						actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(titlePath)).build()
								.perform();
						String jspath = "document.querySelectorAll('th[ng-reflect-field=\"PhoneTypeDesc\"]')[1]"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
								+ "]";
						WebElement status = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(status).build().perform();
						javascriptHelper.backgroundBorder(status);
						softAssert.assertTrue(status.isDisplayed(),
								"If Status is Deactivate post clicking on toggle button system should show Active in Contact Details screen");
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

//	AT_CD_ADE_CD_08
	@And("^User_608 verify Add button available under Contact details section in Additional Customer Info tab$")
	public void user_608_verify_add_button_available_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Verify Add button available under Contact details section");
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

	@And("^User_608 verify Search button available under Contact details section in Additional Customer Info tab$")
	public void user_608_verify_search_button_available_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Verify Search button available under Contact details section");
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

	@And("^User_608 verify Export PDF button available under Contact details section in Additional Customer Info tab$")
	public void user_608_verify_export_pdf_button_available_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('p-dropdown')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
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

		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("PDFBtn"));
				actions.scrollToElement(btn).build().perform();
				javascriptHelper.backgroundColor(btn);
				softAssert.assertTrue(btn.isDisplayed(),
						"Verify Export PDF button available under Contact details section");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Export Excel button available under Contact details section in Additional Customer Info tab$")
	public void user_608_verify_export_excel_button_available_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("XLSBtn"));
				actions.scrollToElement(btn).build().perform();
				javascriptHelper.backgroundColor(btn);
				softAssert.assertTrue(btn.isDisplayed(),
						"Verify Export Excel button available under Contact details section");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Type field available under Contact Details section listview in Additional Customer Info tab$")
	public void user_608_verify_phone_type_field_available_under_contact_details_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("listview_PhoneType"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Phone Type field available under Contact Details section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Phone Number field available under Contact Details section listview in Additional Customer Info tab$")
	public void user_608_verify_phone_number_field_available_under_contact_details_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("listview_PhoneNumber"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Phone Number field available under Contact Details section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email Type field available under Contact Details section listview in Additional Customer Info tab$")
	public void user_608_verify_email_type_field_available_under_contact_details_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("listview_EmailType"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Email type field available under Contact Details section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email ID field available under Contact Details section listview in Additional Customer Info tab$")
	public void user_608_verify_email_id_field_available_under_contact_details_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("listview_EmailID"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Email ID field available under Contact Details section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Status field available under Contact Details section listview in Additional Customer Info tab$")
	public void user_608_verify_status_field_available_under_contact_details_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("listview_Status"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Status field available under Contact Details section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify values in listview should be non-editable and must be populated correctly under Contact Details section")
	public void user_608_verify_values_in_listview_should_be_non_editable_and_must_be_populated_correctly_under_contact_details_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 150; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Contact Details")) {
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
								+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[0]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						String output = field.getAttribute("readonly");
						System.out.println("Out: " + output);
						javascriptHelper.backgroundBorder(field);
						softAssert.assertNull(output,
								"Listview values should be non editable under Contact Details section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the functionality of Add button under Contact Details section in Additional Customer Info tab$")
	public void user_608_to_verify_the_functionality_of_add_button_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
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

	@And("^User_608 verify post clicking on Add button system should allow user to create new record of Contact Details$")
	public void user_608_verify_post_clicking_on_add_button_system_should_allow_user_to_create_new_record_of_contact_details()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("contactDetailsScreen"));
				actions.scrollToElement(field).build().perform();
				javascriptHelper.backgroundBorder(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Create new record of Contact Details screen should be open");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CD_09
	@And("^User_608 click the Export button under Contact Details section in Additional Customer Info tab$")
	public void user_608_click_the_export_button_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('p-dropdown')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
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

	@And("^User_608 to verify the functionality of Export to PDF button under Contact Details section$")
	public void user_608_to_verify_the_functionality_of_export_to_pdf_button_under_contact_details_section()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("PDFBtn"));
				javascriptHelper.backgroundBorder(btn);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on PDF button system should download PDF file of that records in Contact Details section$")
	public void user_608_verify_post_clicking_on_pdf_button_system_should_download_pdf_file_of_that_records_in_contact_details_section()
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

	@And("^User_608 to verify the functionality of Export to Excel button under Contact Details section$")
	public void user_608_to_verify_the_functionality_of_export_to_excel_button_under_contact_details_section()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("XLSBtn"));
				javascriptHelper.backgroundBorder(btn);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on XLS button system should download Excel file of that records in Contact Details section$")
	public void user_608_verify_post_clicking_on_xls_button_system_should_download_excel_file_of_that_records_in_contact_details_section()
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

	@And("^User_608 click the Search button under Contact Details section in Additional Customer Info tab$")
	public void user_608_click_the_search_button_under_contact_details_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Contact Details")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
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

	@And("^User_608 to verify functionality of Search box with matching data under Contact Details section$")
	public void user_608_to_verify_functionality_of_search_box_with_matching_data_under_contact_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("contactDetailsSearchbox"))
						.sendKeys(testData.get("MatchingData"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should display all the possible matching records under Contact Details section$")
	public void user_608_verify_system_should_display_all_the_possible_matching_records_under_contact_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchResult = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("searchResult"));
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: " + text);
				softAssert.assertTrue(Integer.parseInt(text) > 0,
						"Matching Data Result should be greater than 0 in Contact Details section");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify functionality of Search box with mismatch data under Contact Details section$")
	public void user_608_to_verify_functionality_of_search_box_with_mismatch_data_under_contact_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("contactDetailsSearchbox"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("contactDetailsSearchbox"))
						.sendKeys(testData.get("MismatchingData"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should not display any records or system should display the message as No data found under Contact Details section$")
	public void user_608_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_contact_details_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchResult = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("searchResult"));
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: " + text);
				softAssert.assertTrue(Integer.parseInt(text) == 0,
						"Mismatch data should be display as 0 in Contact Details section");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CR_01
	@And("^User_608 click Add button under References List View section in Additional Customer Info tab$")
	public void user_608_click_add_button_under_references_list_view_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
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

	@And("^User_608 verify Back button available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_back_button_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
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
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Back button should be displayed in Reference Details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Save button available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_save_button_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				javascriptHelper.backgroundBorder(saveBtn);
				softAssert.assertTrue(saveBtn.isDisplayed(), "Save button available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Relationship Type field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_relationship_type_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("relationshipTypeLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Relationship Type field available in Reference Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("relationshipTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(),
						"Relationship Type field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Salutaion field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_salutaion_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("salutationLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Salutaion field available in Reference Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("salutationDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(), "Salutaion field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify First Name field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_first_name_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "First Name field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "First Name field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Middle Name field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_middle_name_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("middleNameLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Middle Name field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("middleNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Middle Name field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Last Name field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_last_name_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastNameLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Last Name field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Last Name field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Customer Full Name field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_customer_full_name_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("custFullNameLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Customer Full Name field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("custFullNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Customer Full Name field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Identification Type field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_identification_type_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationTypeLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Identification Type field available in Reference Details screen");
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.isDisplayed(),
						"Identification Type field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Identification Number field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_identification_number_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Identification Number field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Identification Number field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Residence Address field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_residence_address_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("residenceAddressLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Residence Address field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("residenceAddressInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Residence Address field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Office Address field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_office_address_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officeAddressLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Office Address field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officeAddressInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Office Address field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Contact Number field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_contact_number_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Contact Number field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Contact Number field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Office Phone Number field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_office_phone_number_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officePhoneNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Office Phone Number field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officePhoneNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Office Phone Number field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Primary Mobile Number field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_primary_mobile_number_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("primaryMobileNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Primary Mobile Number field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("primaryMobileNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Primary Mobile Number field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Alternative Mobile Number field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_alternative_mobile_number_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("alterMobileNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"Alternative Mobile Number field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("alterMobileNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"Alternative Mobile Number field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email ID field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_email_id_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("emailIdLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "Email ID field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("emailIdInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "Email ID field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify No of Years Known field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_no_of_years_known_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("noOfYearsKnownLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(),
						"No of Years Known field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("noOfYearsKnownInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(),
						"No of Years Known field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify CIF Number field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_cif_number_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("cifNumberLabel"));
				javascriptHelper.backgroundColor(label);
				softAssert.assertTrue(label.isDisplayed(), "CIF Number field available in Reference Details screen");
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("cifNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.isDisplayed(), "CIF Number field available in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 invoke soft assert in Reference details screen under Additional Customer Info tab at App Data Entry stage$")
	public void user_608_invoke_soft_assert_in_reference_details_screen_under_additional_customer_info_tab_at_app_data_entry_stage()
			throws Throwable {
		softAssert.assertAll();
	}

//	AT_CD_ADE_CR_02
	@And("^User_608 select Relationship Type from dropdown in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_select_relationship_type_from_dropdown_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("relationshipTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("RelationshipType"))) {
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

	@And("^User_608 select Salutaion from dropdown in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_select_salutaion_from_dropdown_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("salutationDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("Salutation"))) {
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

	@And("^User_608 enter the First Name value in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_enter_the_first_name_value_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameInput"))
						.sendKeys(testData.get("FirstName"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter the Last Name value in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_enter_the_last_name_value_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastNameInput"))
						.sendKeys(testData.get("LastName"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 select the Identification Type from dropdown in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_select_the_identification_type_from_dropdown_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationTypeDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j
							+ "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println("Option: " + titlename);
					if (titlename.trim().equalsIgnoreCase(testData.get("IdentificationType"))) {
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

	@And("^User_608 enter the Identification Number in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_enter_the_identification_number_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationNumberInput"))
						.sendKeys(testData.get("IdentificationNbr"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter the Primary Mobile Number in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_enter_the_primary_mobile_number_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("primaryMobileNumberInput"))
						.sendKeys(testData.get("MobileNumber"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter the Email ID in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_enter_the_email_id_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("emailIdInput"))
						.sendKeys(testData.get("EmailID"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter No of Years Known value in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_enter_no_of_years_known_value_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("noOfYearsKnownInput"))
						.sendKeys(testData.get("NoOfYearsKnown"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Save button under Customer Reference Details screen$")
	public void user_608_click_the_save_button_under_customer_reference_details_screen() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				System.out.println(i);
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("statusToggleBtn"));
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify the Confimation message post clicking on save button in Customer Reference Details screen$")
	public void user_608_verify_the_confimation_message_post_clicking_on_save_button_in_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_SuccessMsg"));
				String text = alertMsg.getText();
				softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CR_03
	@And("^User_608 verify Relationship Type field should be Mandatory, Editable and Dropdown in Customer Reference screen$")
	public void user_608_verify_relationship_type_field_should_be_mandatory_editable_and_dropdown_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("relationshipTypeLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(text.contains("*"), "Relationship Type field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("relationshipType"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Relationship Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("relationshipTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Relationship Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Salutaion field should be Mandatory, Editable and Dropdown in Customer Reference screen$")
	public void user_608_verify_salutaion_field_should_be_mandatory_editable_and_dropdown_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("salutationLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(text.contains("*"), "Phone Type field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("salutation"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Salutaion field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("salutationDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Salutaion field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify First Name field should be Mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_first_name_field_should_be_mandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(text.contains("*"), "First Name field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstName"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "First Name field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"), "First Name field should Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Middle Name field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_middle_name_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("middleNameLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Middle Name field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("middleName"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Middle Name field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("middleNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"), "Middle Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Last Name field should be Mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_last_name_field_should_be_mandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastNameLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(text.contains("*"), "Last Name field should Mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastName"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Last Name field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"), "Last Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Customer Full Name field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_customer_full_name_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("custFullNameLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Customer Full Name field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("custFullName"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Customer Full Name field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("custFullNameInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Customer Full Name field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Identification Type field should be Non-mandatory, Editable and Dropdown in Customer Reference screen$")
	public void user_608_verify_identification_type_field_should_be_nonmandatory_editable_and_dropdown_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationTypeLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Identification Type field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationType"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Identification Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Dropdown
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement dropdown = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationTypeDropdown"));
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Identification Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Identification Number field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_identification_number_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Identification Number field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Identification Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("identificationNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Identification Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Residence Address field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_residence_address_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("residenceAddressLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Residence Address field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("residenceAddress"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Residence Address field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("residenceAddressInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getTagName().contains("textarea"),
						"Residence Address field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Office Address field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_office_address_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officeAddressLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Office Address field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officeAddress"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Office Address field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officeAddressInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getTagName().contains("textarea"),
						"Office Address field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Contact Number field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_contact_number_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Contact Number field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Contact Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Contact Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Office Phone Number field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_office_phone_number_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officePhoneNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Office Phone Number field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officePhoneNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Office Phone Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("officePhoneNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Office Phone Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Primary Mobile Number field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_primary_mobile_number_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("primaryMobileNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Primary Mobile Number field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("primaryMobileNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Primary Mobile Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("primaryMobileNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Primary Mobile Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Alternative Mobile Number field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_alternative_mobile_number_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("alterMobileNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Alternative Mobile Number field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("alterMobileNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Alternative Mobile Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("alterMobileNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Alternative Mobile Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Email ID field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_email_id_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("emailIdLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "Email ID field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("emailId"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "Email ID field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("emailIdInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"Email ID field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify No of Years Known field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_no_of_years_known_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("noOfYearsKnownLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "No of Years Known field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("noOfYearsKnown"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "No of Years Known field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("noOfYearsKnownInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("number"),
						"No of Years Known field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify CIF Number field should be Non-mandatory, Editable and textbox in Customer Reference screen$")
	public void user_608_verify_cif_number_field_should_be_nonmandatory_editable_and_textbox_in_customer_reference_screen()
			throws Throwable {
//		Verify field as Non-Mandatory
		for (int i = 0; i < 150; i++) {
			try {
				WebElement label = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("cifNumberLabel"));
				javascriptHelper.backgroundColor(label);
				String text = label.getText();
				softAssert.assertTrue(!(text.contains("*")), "CIF Number field should be Non-mandatory");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Editable
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("cifNumber"));
				String read = field.getAttribute("ng-reflect-readonly");
				softAssert.assertTrue(read.contains("false"), "CIF Number field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

//		Verify field as Textbox
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement input = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("cifNumberInput"));
				javascriptHelper.backgroundBorder(input);
				softAssert.assertTrue(input.getAttribute("type").contains("text"),
						"CIF Number field should be Textbox");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Help button under Customer Reference screen$")
	public void user_608_click_the_help_button_under_customer_reference_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("help_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on help button system should display the description of all the fields in Customer Reference screen$")
	public void user_608_verify_post_clicking_on_help_button_system_should_display_the_description_of_all_the_fields_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement description = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("help_description"));
				javascriptHelper.scrollIntoView(description);
				javascriptHelper.backgroundBorder(description);
				softAssert.assertTrue(description.isDisplayed(),
						"System should display the description of all the fields in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Back button under Customer Reference screen$")
	public void user_608_click_the_back_button_under_customer_reference_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
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
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on Back button in Customer Reference screen system should navigate to the previous screen$")
	public void user_608_verify_post_clicking_on_back_button_in_customer_reference_screen_system_should_navigate_to_the_previous_screen()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(titlePath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Clicking on Back button system should navigate to the previous screen under Additional Customer Info tab");
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

//	AT_CD_ADE_CR_04
	@And("^User_608 click the Save button user keep any mandatory field blank in Customer Reference Details screen$")
	public void user_608_click_the_save_button_user_keep_any_mandatory_field_blank_in_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user keep any mandatory field blank in Customer Reference Details screen$")
	public void user_608_to_verify_the_impact_when_user_keep_any_mandatory_field_blank_in_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("mandatoryFillToastMsg"));
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"),
						"Mandatory field blank message in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("^User_608 enters the Special Character values in any field under Customer Reference Details screen$")
	public void user_608_enters_the_special_character_values_in_any_field_under_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameInput"))
						.sendKeys(testData.get("SpecialChar"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user enters special characters value in Customer Reference Details screen$")
	public void user_608_to_verify_the_impact_when_user_enters_special_characters_value_in_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("specialChar_error"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.contains("Only Alphanumeric characters are allowed"),
						"Impact when user enters special characters value in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 enter the Characters values in numeric field under Customer Reference Details screen$")
	public void user_608_enter_the_characters_values_in_numeric_field_under_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberInput"))
						.sendKeys(testData.get("CharValues"));
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the impact when user enter characters value in numeric field under Customer Reference Details screen$")
	public void user_608_to_verify_the_impact_when_user_enter_characters_value_in_numeric_field_under_customer_reference_details_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("invalidNumber_error"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.contains("Invalid Mobile Number"),
						"Impact when user enters characters value in numeric field under Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CR_05
	@And("^User_608 click the Reference Details record Edit button under References List View section in Additional Customer Info tab$")
	public void user_608_click_the_reference_details_record_edit_button_under_references_list_view_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
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
	
	@And("^User_608 verify Help button available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verify_help_button_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement helpBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("help_button"));
				javascriptHelper.backgroundBorder(helpBtn);
				softAssert.assertTrue(helpBtn.isDisplayed(),"Help button available in Customer Reference screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verfiy Status field available in Customer Reference screen under Additional Customer Info tab$")
	public void user_608_verfiy_status_field_available_in_customer_reference_screen_under_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement toggleBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("statusToggleBtn"));
				javascriptHelper.backgroundBorder(toggleBtn);
				softAssert.assertTrue(toggleBtn.isDisplayed(), "Status field available in Customer Reference screen");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Update button while modification when user keep any mandatory field blank in Customer Reference screen$")
	public void user_608_click_the_update_button_while_modification_when_user_keep_any_mandatory_field_blank_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameInput"));
				element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				WebElement updateBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				updateBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify validation message for while modification when user keep any mandatory field blank in Customer Reference screen$")
	public void user_608_verify_validation_message_for_while_modification_when_user_keep_any_mandatory_field_blank_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("mandatoryFillToastMsg"));
				actions.scrollToElement(element).build().perform();
				String madatoryErrorMsg = element.getText();
				System.err.println("Mandatory Error : " + madatoryErrorMsg);
				softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"),
						"Mandatory field blank message in Customer Reference screen while modification");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 while modification system enters the invalid data in Customer Reference screen$")
	public void user_608_while_modification_system_enters_the_invalid_data_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberInput"))
						.sendKeys(testData.get("InvalidData"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should not allow user to do a modification with invalid data in Customer Reference screen$")
	public void user_608_verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i < 150; i++) {
			try {
				WebElement element = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("invalidNumber_error"));
				String errorMsg = element.getText();
				javascriptHelper.backgroundBorder(element);
				softAssert.assertTrue(errorMsg.contains("Invalid Mobile Number"),
						"Impact when user modification with invalid data in Reference Details screen");
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify system allow user to modify the record with valid data in Customer Reference screen$")
	public void user_608_to_verify_system_allow_user_to_modify_the_record_with_valid_data_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("firstNameInput"))
						.sendKeys(testData.get("FirstName"));
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("lastNameInput"))
				.sendKeys(testData.get("LastName"));
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberInput"))
					.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("contactNumberInput"))
				.sendKeys(testData.get("ContactNumber"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	@And("^User_608 to verify while modification system allow user to Update the record with valid data in Customer Reference screen$")
	public void user_608_to_verify_while_modification_system_allow_user_to_update_the_record_with_valid_data_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the Confimation message post clicking on Update button in Customer Reference screen$")
	public void user_608_to_verify_the_confimation_message_post_clicking_on_update_button_in_customer_reference_screen()
			throws Throwable {
		for (int i = 0; i < 300; i++) {
			try {
				WebElement alertMsg = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_SuccessMsg"));
				String text = alertMsg.getText();
				softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CR_06
	@And("^User_608 click the Active records Edit button in References List View section under Additional Customer Info tab$")
	public void user_608_click_the_active_records_edit_button_in_references_list_view_section_under_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript(
						"return document.querySelector('[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("Active")) {
						System.out.println("condition true");
						String titlePath = "document.querySelector('[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
								+ j + "]";
						actions.scrollToElement(javascriptHelper.executeScriptWithWebElement(titlePath)).build()
								.perform();
						String jspath = "document.querySelector('[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
								+ j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).build().perform();
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

	@And("^User_608 click the Status toggle button in Customer Reference Details screen$")
	public void user_608_click_the_status_toggle_button_in_customer_reference_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement toggleBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("statusToggleBtn"));
				actions.scrollToElement(toggleBtn).build().perform();
				toggleBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Update button under Customer Reference Details screen$")
	public void user_608_click_the_update_button_under_customer_reference_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement updateBtn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("save_button"));
				actions.scrollToElement(updateBtn).build().perform();
				updateBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 get the updated record ID for Customer Reference Details record$")
	public void user_608_get_the_updated_record_id_for_customer_reference_details_record() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement successMsg = javascriptHelper.executeScriptWithWebElement(
						commonElementsJsPaths.getElement("alert_SuccessMsg"));
				String text = successMsg.getText();
				System.out.println("Message:"+text);
				System.out.println("Number: "+ text.substring(32, 36));
				referenceDetailsExcelData.updateTestData(testData.get("DataSet ID"),"RecordID", text.substring(32, 36));
				break;
			} catch (Exception e) { 
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 click the Search button under References List View section in Additional Customer Info tab$")
	public void user_608_click_the_search_button_under_references_list_view_section_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {		
				javascriptHelper.executeScriptWithWebElement(
						referenceDetailsJsPaths.getElement("listview_SearchBtn")).click();				
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 search the record ID under References List View section$")
	public void user_608_search_the_record_id_under_references_list_view_section() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {					
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("list_view_search_input"))
				.sendKeys(testData.get("RecordID"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify if Status is Active then click Status toggle button system should show Deactivate in References List View section$")
	public void user_608_to_verify_if_status_is_active_then_click_status_toggle_button_system_should_show_deactivate_in_references_list_view_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelector('th[ng-reflect-field=\"salutationDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("In-active")) {
						System.out.println("condition true");
						String jspath = "document.querySelector('th[ng-reflect-field=\"salutationDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
								+ "]";
						WebElement status = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(status);
						softAssert.assertTrue(status.isDisplayed(),
								"If Status is Active post clicking on toggle button system should show Deactivate in References List View section");
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

	@And("^User_608 click the Deactivate record Edit button in References List View section under Additional Customer Info tab$")
	public void user_608_click_the_deactivate_record_edit_button_in_references_list_view_section_under_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelector('th[ng-reflect-field=\"salutationDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("In-active")) {
						System.out.println("condition true");
						String jspath = "document.querySelector('th[ng-reflect-field=\"salutationDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
								+ "].parentElement.parentElement.querySelector('button')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
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

	@And("^User_608 verify if Status is Deactivate post clicking on toggle button system should show Active in References List View section$")
	public void user_608_verify_if_status_is_deactivate_post_clicking_on_toggle_button_system_should_show_active_in_references_list_view_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelector('th[ng-reflect-field=\"salutationDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor').length")
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelector('th[ng-reflect-field=\"salutationDesc\"]').parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')["
							+ j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().equalsIgnoreCase("Active")) {
						System.out.println("condition true");
						String jspath = "document.querySelector('th[ng-reflect-field=\"salutationDesc\"]')"
								+ ".parentElement.parentElement.parentElement.querySelectorAll('td p-celleditor')[" + j
								+ "]";
						WebElement status = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(status);
						softAssert.assertTrue(status.isDisplayed(),
								"If Status is Deactivate post clicking on toggle button system should show Active in References List View section");
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

	@And("^User_608 click the Back button in in Customer Reference Details screen$")
	public void user_608_click_the_back_button_in_in_customer_reference_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
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
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j
							+ "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Go Back")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on Back button system should navigate to the previous screen in Additional Customer Info tab$")
	public void user_608_verify_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						WebElement section = javascriptHelper.executeScriptWithWebElement(titlePath);
						actions.scrollToElement(section).build().perform();
						javascriptHelper.backgroundColor(section);
						softAssert.assertTrue(section.isDisplayed(),
								"Clicking on Back button system should navigate to the previous screen under Additional Customer Info tab");
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

//	AT_CD_ADE_CR_08
	@And("^User_608 verify Add button available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_add_button_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Verify Add button available under References List view section");
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

	@And("^User_608 verify Search button available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_search_button_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement searchBtn = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("listview_SearchBtn"));
				javascriptHelper.backgroundBorder(searchBtn);
				softAssert.assertTrue(searchBtn.isDisplayed(), "Search button available in References List view section");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Export PDF button available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_export_pdf_button_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('p-dropdown')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
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

		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("PDFBtn"));
				javascriptHelper.backgroundColor(btn);
				softAssert.assertTrue(btn.isDisplayed(),
						"Verify Export PDF button available under Customer Reference section");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Export Excel button available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_export_excel_button_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("XLSBtn"));
				javascriptHelper.backgroundColor(btn);
				softAssert.assertTrue(btn.isDisplayed(),
						"Verify Export Excel button available under Customer Reference section");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Salutation field available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_salutation_field_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("listview_Salutation"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Salutation field available under Customer Reference section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Name field available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_name_field_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("listview_Name"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Name field available under Customer Reference section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Mobile Number field available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_mobile_number_field_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("listview_MobileNumber"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Mobile Number field available under Customer Reference section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Years Known field available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_years_known_field_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("listview_YearsKnown"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Years Known field available under Customer Reference section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify Status field available under Customer Reference section listview in Additional Customer Info tab$")
	public void user_608_verify_status_field_available_under_customer_reference_section_listview_in_additional_customer_info_tab()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("listview_Status"));
				javascriptHelper.backgroundColor(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Status field available under Customer Reference section listview");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 verify values in listview should be non-editable and must be populated correctly under Customer Reference section")
	public void user_608_verify_values_in_listview_should_be_non_editable_and_must_be_populated_correctly_under_customer_reference_section()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 150; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
//				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 150; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("References List View")) {
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
								+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[1]";
						WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
						String output = field.getAttribute("readonly");
						System.out.println("Out: " + output);
						javascriptHelper.backgroundBorder(field);
						softAssert.assertNull(output,
								"Listview values should be non editable under References List View section");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 149) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify the functionality of Add button under Customer Reference section in Additional Customer Info tab$")
	public void user_608_to_verify_the_functionality_of_add_button_under_customer_reference_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
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

	@And("^User_608 verify post clicking on Add button system should navigate user to create a new record of Customer Reference details$")
	public void user_608_verify_post_clicking_on_add_button_system_should_navigate_user_to_create_a_new_record_of_customer_reference_details()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement field = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("customerReferenceScreen"));
				actions.scrollToElement(field).build().perform();
				javascriptHelper.backgroundBorder(field);
				softAssert.assertTrue(field.isDisplayed(),
						"Create new record of Customer Reference details screen should be open");
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

//	AT_CD_ADE_CR_09
	@And("^User_608 click the Export button under References List View section in Additional Customer Info tab$")
	public void user_608_click_the_export_button_under_references_list_view_section_in_additional_customer_info_tab()
			throws Throwable {
		String length = null;
		for (int i = 0; i < 300; i++) {
			try {
				length = javascriptHelper
						.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
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
		for (int i = 0; i < 300; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("References List View")) {
						System.out.println("condition true");
						String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
						javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
						String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j
								+ "].parentElement.parentElement.querySelector('p-dropdown')";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(btn).build().perform();
						javascriptHelper.backgroundBorder(btn);
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

	@And("^User_608 to verify the functionality of Export to PDF button under References List View section$")
	public void user_608_to_verify_the_functionality_of_export_to_pdf_button_under_references_list_view_section()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("PDFBtn"));
				javascriptHelper.backgroundBorder(btn);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on PDF button system should download PDF file of that records in References List View section$")
	public void user_608_verify_post_clicking_on_pdf_button_system_should_download_pdf_file_of_that_records_in_references_list_view_section()
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
			if (downloadsFile.getName().contains("CustomerReferenceDataFile")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerReferenceDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("^User_608 to verify the functionality of Export to Excel button under References List View section$")
	public void user_608_to_verify_the_functionality_of_export_to_excel_button_under_references_list_view_section()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement btn = javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("XLSBtn"));
				javascriptHelper.backgroundBorder(btn);
				btn.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify post clicking on XLS button system should download Excel file of that records in References List View section$")
	public void user_608_verify_post_clicking_on_xls_button_system_should_download_excel_file_of_that_records_in_references_list_view_section()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CustomerReferenceDataFile")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CustomerReferenceDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("^User_608 to verify functionality of Search box with matching data under References List View section$")
	public void user_608_to_verify_functionality_of_search_box_with_matching_data_under_references_list_view_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("list_view_search_input"))
						.sendKeys(testData.get("MatchingData"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should display all the possible matching records under References List View section$")
	public void user_608_verify_system_should_display_all_the_possible_matching_records_under_references_list_view_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchResult = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("searchResult"));
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: " + text);
				softAssert.assertTrue(Integer.parseInt(text) > 0,
						"Matching Data Result should be greater than 0 under References List View section");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 to verify functionality of Search box with mismatch data under References List View section$")
	public void user_608_to_verify_functionality_of_search_box_with_mismatch_data_under_references_list_view_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				javascriptHelper
						.executeScriptWithWebElement(commonElementsJsPaths.getElement("list_view_search_input"))
						.sendKeys(testData.get("MismatchingData"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User_608 verify system should not display any records or system should display the message as No data found under References List View section$")
	public void user_608_verify_system_should_not_display_any_records_or_system_should_display_the_message_as_no_data_found_under_references_list_view_section()
			throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				WebElement searchResult = javascriptHelper
						.executeScriptWithWebElement(referenceDetailsJsPaths.getElement("searchResult"));
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: " + text);
				softAssert.assertTrue(Integer.parseInt(text) == 0,
						"Mismatch data should be display as 0 under References List View section");
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
