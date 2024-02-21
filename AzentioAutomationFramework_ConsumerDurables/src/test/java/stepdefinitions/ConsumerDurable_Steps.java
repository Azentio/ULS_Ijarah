package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
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
								"Back button should be displayed in Customer Debt screen");
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
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("saveBtn"));
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
				WebElement element = javascriptHelper.executeScriptWithWebElement(
						contactDetailsJsPaths.getElement("emailTypeDropdown"));
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
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("saveBtn"));
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

		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("alert_closeBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
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
						clicksAndActionsHelper.scrollIntoView(section);
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

	@And("^User_608 click the Save button user keep any mandatory field blank in Contact Details screen$")
	public void user_608_click_the_save_button_user_keep_any_mandatory_field_blank_in_contact_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				WebElement saveBtn = javascriptHelper
						.executeScriptWithWebElement(contactDetailsJsPaths.getElement("saveBtn"));
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

	
	
	
	

}
