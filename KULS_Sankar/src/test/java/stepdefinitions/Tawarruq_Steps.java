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

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarruq_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths appDataCustomerDetailsJsPaths = new JSPaths(excelPath, "AppData_CustomerDetail_Elements", "AppData_CustomerDetails_FieldName", "JSPath");
	JSPaths appDataAppDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements", "ApplicationDetails_FieldName", "JSPath");	
	JSPaths appDataDocumentDetailsJsPaths = new JSPaths(excelPath, "TW_AppData_DocumentDetails", "DocumentDetails_FieldName", "JSPath");
	JSPaths identificatioDetailsJsPaths = new JSPaths(excelPath, "IdentificationDetails_Elements", "IdentificationDetails_FieldName", "JSPath");
	
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
	
	ExcelData AppDataEntryCustomerDetails  = new ExcelData(excelTestDataPath,"TW_AppData_CustomerDetails","DataSet ID");
	ExcelData identificatioDetailsExcelData  = new ExcelData(excelTestDataPath,"TW_NewApp_IdentificationDetails","DataSet ID");
	ExcelData offerDetailsExcelData  = new ExcelData(excelTestDataPath,"TW_Offering_OfferDetails","DataSet ID");
	ExcelData ApplicationDetailsExcelData  = new ExcelData(excelTestDataPath,"TW_DataCheck_AppDetails","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	
//	Tawarruq -- App Data Entry Stage  -- Customer Details screen 
	@And("^User_608 get the test data for test case AT_TW_CD_01_01$")
    public void get_the_test_data_for_test_case_AT_TW_CD_01_01() throws Throwable {
		testData = AppDataEntryCustomerDetails.getTestdata("DS_AT_TW_CD_01_01");
    }
	
	@And("^User_608 get the test data for test case AT_TW_CD_01_02$")
    public void get_the_test_data_for_test_case_AT_TW_CD_01_02() throws Throwable {
		testData = AppDataEntryCustomerDetails.getTestdata("DS_AT_TW_CD_01_02");
    }
	
	@And("^User_608 get the test data for test case AT_TW_CD_02$")
    public void get_the_test_data_for_test_case_AT_TW_CD_02() throws Throwable {
		testData = AppDataEntryCustomerDetails.getTestdata("DS_AT_TW_CD_02");
    }
	
	
//	Tawarruq -- App Data Entry Stage  -- Application Details screen
	@And("^User_608 get the test data for test case AT_TW_AD_06$")
    public void get_the_test_data_for_test_case_AT_TW_AD_06() throws Throwable {
		testData = AppDataEntryCustomerDetails.getTestdata("DS_AT_TW_AD_06");
    }
	
	
//	Tawarruq -- App Data Entry Stage  -- Document Details screen
	@And("^User_608 get the test data for test case AT_TW_AD_DOC_05$")
    public void get_the_test_data_for_test_case_AT_TW_AD_DOC_05() throws Throwable {
		testData = AppDataEntryCustomerDetails.getTestdata("DS_AT_TW_AD_DOC_05");
    }
	
	
//	Tawarruq -- App Data Entry Stage  -- Idetification Details screen	
	@And("^User_608 get the test data for test case AT_IDA_03$")
    public void get_the_test_data_for_test_case_AT_IDA_03() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_IDA_03");
    }
	
	
//	Tawarruq -- New Application Stage  -- Idetification Details screen
	@And("^User_608 get the test data for test case AT_TW_NEWAPP_IDA_01$")
    public void get_the_test_data_for_test_case_AT_TW_NEWAPP_IDA_01() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_TW_NEWAPP_IDA_01");
    }
	
	@And("^User_608 get the test data for test case AT_TW_NEWAPP_IDA_02$")
    public void get_the_test_data_for_test_case_AT_TW_NEWAPP_IDA_02() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_TW_NEWAPP_IDA_02");
    }
	
	@And("^User_608 get the test data for test case AT_TW_NEWAPP_IDA_03$")
    public void get_the_test_data_for_test_case_AT_TW_NEWAPP_IDA_03() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_TW_NEWAPP_IDA_03");
    }
	
	@And("^User_608 get the test data for test case AT_TW_NEWAPP_IDA_04$")
    public void get_the_test_data_for_test_case_AT_TW_NEWAPP_IDA_04() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_TW_NEWAPP_IDA_04");
    }
	
	@And("^User_608 get the test data for test case AT_TW_NEWAPP_IDA_05$")
    public void get_the_test_data_for_test_case_AT_TW_NEWAPP_IDA_05() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_TW_NEWAPP_IDA_05");
    }	
	
	@And("^User_608 get the test data for test case AT_TW_NEWAPP_IDA_06$")
    public void get_the_test_data_for_test_case_AT_TW_NEWAPP_IDA_06() throws Throwable {
		testData = identificatioDetailsExcelData.getTestdata("DS_AT_TW_NEWAPP_IDA_06");
    }
	
	
//	Offering -- Offer Details
	@And("^User_608 get the test data for test case AT_TW_OFO_12$")
    public void get_the_test_data_for_test_case_AT_TW_OFO_12() throws Throwable {
		testData = offerDetailsExcelData.getTestdata("DS_AT_TW_OFO_12");
    }
	
	
//	Tawarruq -- App Data Check  -- Application Details screen
	@And("^User_608 get the test data for test case AT_TW_ADC_AD_01$")
    public void get_the_test_data_for_test_case_AT_TW_ADC_AD_01() throws Throwable {
		testData = ApplicationDetailsExcelData.getTestdata("DS_AT_TW_ADC_AD_01");
    }
	
	@And("^User_608 get the test data for test case AT_TW_ADC_AD_02$")
    public void get_the_test_data_for_test_case_AT_TW_ADC_AD_02() throws Throwable {
		testData = ApplicationDetailsExcelData.getTestdata("DS_AT_TW_ADC_AD_02");
    }
	
	@And("^User_608 get the test data for test case AT_TW_ADC_AD_03$")
    public void get_the_test_data_for_test_case_AT_TW_ADC_AD_03() throws Throwable {
		testData = ApplicationDetailsExcelData.getTestdata("DS_AT_TW_ADC_AD_03");
    }
	
	@And("^User_608 get the test data for test case AT_TW_ADC_AD_04$")
    public void get_the_test_data_for_test_case_AT_TW_ADC_AD_04() throws Throwable {
		testData = ApplicationDetailsExcelData.getTestdata("DS_AT_TW_ADC_AD_04");
    }
	
	@And("^User_608 get the test data for test case AT_TW_ADC_AD_05$")
    public void get_the_test_data_for_test_case_AT_TW_ADC_AD_05() throws Throwable {
		testData = ApplicationDetailsExcelData.getTestdata("DS_AT_TW_ADC_AD_05");
    }
	
	
	
	
	@And("User_608 search the Reference id under inbox in ULS Application")
	public void user_608_search_the_reference_id_under_inbox_in_uls_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	AT_TW_CD_01
	@And("User_608 click the Customer Details tab")
	public void user_608_click_the_customer_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Customer details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						addButton.click();
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

	@And("User_608 click the Add button under Customer Details tab")
	public void user_608_click_the_add_button_under_customer_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('div[class*=\"grid \"] button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('div[class*=\"grid \"] button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("Add")) {
						String jspath = "document.querySelectorAll('div[class*=\"grid \"] button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						btn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 click the Pencil icon button under Customer Details tab")
	public void user_608_click_the_pencil_icon_under_customer_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("Customer Personal Information")) {
						String jspath = "document.querySelectorAll('button[icon=\"pi pi-pencil\"]')[" + j + "]";
						WebElement pencilBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						pencilBtn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Back button is available under Customer Information screen")
	public void user_608_verify_back_button_is_available_under_customer_information_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Go Back")) {
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Back button should be displayed in Customer Details Details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Save button is available under Customer Information screen")
	public void user_608_verify_save_button_is_available_under_customer_information_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Save")) {
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Save button should be displayed in Customer Details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	
	@And("User_608 verify Applicant Type field available under Customer Information screen")
	public void user_608_verify_applicant_type_field_available_under_customer_information_screen() throws Throwable {		
		for (int i = 0; i <= 1500; i++) {
			try {
				WebElement applicantTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("applicantTypeLabel"));
				javascriptHelper.backgroundColor(applicantTypeLabel);
				softAssert.assertTrue(applicantTypeLabel.isDisplayed(),
						"Applicant Type field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement applicantTypeDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("applicantTypeDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(applicantTypeDropdown);
				softAssert.assertTrue(applicantTypeDropdown.isDisplayed(),
						"Applicant Type field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Customer Type field available under Customer Information screen")
	public void user_608_verify_customer_type_field_available_under_customer_information_screen() throws Throwable {
		WebElement customerTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerTypeLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(customerTypeLabel);
				softAssert.assertTrue(customerTypeLabel.isDisplayed(),
						"Customer Type field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement customerTypeDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerTypeDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(customerTypeDropdown);
				softAssert.assertTrue(customerTypeDropdown.isDisplayed(),
						"Customer Type field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Title field available under Customer Information screen")
	public void user_608_verify_title_field_available_under_customer_information_screen() throws Throwable {
		WebElement titleLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(titleLabel);
				softAssert.assertTrue(titleLabel.isDisplayed(),
						"Title field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement titleDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(titleDropdown);
				softAssert.assertTrue(titleDropdown.isDisplayed(),
						"Title field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify First Name field available under Customer Information screen")
	public void user_608_verify_first_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement firstNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(firstNameLabel);
				softAssert.assertTrue(firstNameLabel.isDisplayed(),
						"First Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement firstNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(firstNameInput);
				softAssert.assertTrue(firstNameInput.isDisplayed(),
						"First Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Middle Name field available under Customer Information screen")
	public void user_608_verify_middle_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement middleNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(middleNameLabel);
				softAssert.assertTrue(middleNameLabel.isDisplayed(),
						"Middle Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement middleNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(middleNameInput);
				softAssert.assertTrue(middleNameInput.isDisplayed(),
						"Middle Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Last Name field available under Customer Information screen")
	public void user_608_verify_last_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement lastNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(lastNameLabel);
				softAssert.assertTrue(lastNameLabel.isDisplayed(),
						"Last Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement lastNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(lastNameInput);
				softAssert.assertTrue(lastNameInput.isDisplayed(),
						"Last Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Family Name	field available under Customer Information screen")
	public void user_608_verify_family_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement familyNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(familyNameLabel);
				softAssert.assertTrue(familyNameLabel.isDisplayed(),
						"Family Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement familyNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(familyNameInput);
				softAssert.assertTrue(familyNameInput.isDisplayed(),
						"Family Name field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify First Name\\(Arabic) field available under Customer Information screen")
	public void user_608_verify_first_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement firstNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(firstNameArabicLabel);
				softAssert.assertTrue(firstNameArabicLabel.isDisplayed(),
						"First Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement firstNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabicInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(firstNameArabicInput);
				softAssert.assertTrue(firstNameArabicInput.isDisplayed(),
						"First Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Middle Name\\(Arabic) field available under Customer Information screen")
	public void user_608_verify_middle_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement middleNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(middleNameArabicLabel);
				softAssert.assertTrue(middleNameArabicLabel.isDisplayed(),
						"Middle Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement middleNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabicInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(middleNameArabicInput);
				softAssert.assertTrue(middleNameArabicInput.isDisplayed(),
						"Middle Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Last Name\\(Arabic) field available under Customer Information screen")
	public void user_608_verify_last_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement lastNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(lastNameArabicLabel);
				softAssert.assertTrue(lastNameArabicLabel.isDisplayed(),
						"Last Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement lastNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabicInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(lastNameArabicInput);
				softAssert.assertTrue(lastNameArabicInput.isDisplayed(),
						"Last Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Family Name\\(Arabic)	field available under Customer Information screen")
	public void user_608_verify_family_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement familyNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(familyNameArabicLabel);
				softAssert.assertTrue(familyNameArabicLabel.isDisplayed(),
						"Family Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement familyNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabicInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(familyNameArabicInput);
				softAssert.assertTrue(familyNameArabicInput.isDisplayed(),
						"Family Name(Arabic) field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Date of Birth field available under Customer Information screen")
	public void user_608_verify_date_of_birth_field_available_under_customer_information_screen() throws Throwable {
		WebElement dobLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(dobLabel);
				softAssert.assertTrue(dobLabel.isDisplayed(),
						"Date of Birth field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement dobInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(dobInput);
				softAssert.assertTrue(dobInput.isDisplayed(),
						"Date of Birth field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Age field available under Customer Information screen")
	public void user_608_verify_age_field_available_under_customer_information_screen() throws Throwable {
		WebElement ageLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("ageLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(ageLabel);
				softAssert.assertTrue(ageLabel.isDisplayed(),
						"Age field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement ageInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("ageInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(ageInput);
				softAssert.assertTrue(ageInput.isDisplayed(),
						"Age field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Gender field available under Customer Information screen")
	public void user_608_verify_gender_field_available_under_customer_information_screen() throws Throwable {
		WebElement dobLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel"));
		WebElement genderLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("genderLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.scrollIntoView(dobLabel);
				javascriptHelper.backgroundColor(genderLabel);
				softAssert.assertTrue(genderLabel.isDisplayed(),
						"Gender field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement genderDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("genderDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(genderDropdown);
				softAssert.assertTrue(genderDropdown.isDisplayed(),
						"Gender field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Marital Status field available under Customer Information screen")
	public void user_608_verify_marital_status_field_available_under_customer_information_screen() throws Throwable {
		WebElement maritalStatusLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatusLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(maritalStatusLabel);
				softAssert.assertTrue(maritalStatusLabel.isDisplayed(),
						"Marital Status field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement maritalStatusDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatusDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(maritalStatusDropdown);
				softAssert.assertTrue(maritalStatusDropdown.isDisplayed(),
						"Marital Status field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Education Level field available under Customer Information screen")
	public void user_608_verify_education_level_field_available_under_customer_information_screen() throws Throwable {
		WebElement educationLevelLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevelLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(educationLevelLabel);
				softAssert.assertTrue(educationLevelLabel.isDisplayed(),
						"Education Level field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement educationLevelDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevelDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(educationLevelDropdown);
				softAssert.assertTrue(educationLevelDropdown.isDisplayed(),
						"Education Level field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Nationality field available under Customer Information screen")
	public void user_608_verify_nationality_field_available_under_customer_information_screen() throws Throwable {
		WebElement nationalityLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationalityLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(nationalityLabel);
				softAssert.assertTrue(nationalityLabel.isDisplayed(),
						"Nationality field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement nationalityDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationalityDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(nationalityDropdown);
				softAssert.assertTrue(nationalityDropdown.isDisplayed(),
						"Nationality field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Residential Status field available under Customer Information screen")
	public void user_608_verify_residential_status_field_available_under_customer_information_screen() throws Throwable {
		WebElement residentialStatusLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatusLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(residentialStatusLabel);
				softAssert.assertTrue(residentialStatusLabel.isDisplayed(),
						"Residential Status field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement residentialStatusDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatusDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(residentialStatusDropdown);
				softAssert.assertTrue(residentialStatusDropdown.isDisplayed(),
						"Residential Status field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Language field available under Customer Information screen")
	public void user_608_verify_language_field_available_under_customer_information_screen() throws Throwable {
		WebElement languageLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("languageLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(languageLabel);
				softAssert.assertTrue(languageLabel.isDisplayed(),
						"Language field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement languageDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("languageDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(languageDropdown);
				softAssert.assertTrue(languageDropdown.isDisplayed(),
						"Language field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify No of Dependents field available under Customer Information screen")
	public void user_608_verify_no_of_dependents_field_available_under_customer_information_screen() throws Throwable {
		WebElement noOfDependsLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(noOfDependsLabel);
				softAssert.assertTrue(noOfDependsLabel.isDisplayed(),
						"No of Dependents field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement noOfDependsInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(noOfDependsInput);
				softAssert.assertTrue(noOfDependsInput.isDisplayed(),
						"No of Dependents field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Client Category field available under Customer Information screen")
	public void user_608_verify_client_category_field_available_under_customer_information_screen() throws Throwable {
		WebElement clientCategoryLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategoryLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(clientCategoryLabel);
				softAssert.assertTrue(clientCategoryLabel.isDisplayed(),
						"Client Category field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement clientCategoryDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategoryDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(clientCategoryDropdown);
				softAssert.assertTrue(clientCategoryDropdown.isDisplayed(),
						"Client Category field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Blocklisted field available under Customer Information screen")
	public void user_608_verify_blocklisted_field_available_under_customer_information_screen() throws Throwable {
		WebElement blocklistLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklistLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(blocklistLabel);
				softAssert.assertTrue(blocklistLabel.isDisplayed(),
						"Blocklisted field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement blocklistToggle = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklistToggle"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(blocklistToggle);
				softAssert.assertTrue(blocklistToggle.isDisplayed(),
						"Blocklisted field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Credit Bureau field available under Customer Information screen")
	public void user_608_verify_credit_bureau_field_available_under_customer_information_screen() throws Throwable {
		WebElement creditBureauLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("creditBureauLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(creditBureauLabel);
				softAssert.assertTrue(creditBureauLabel.isDisplayed(),
						"Credit Bureau field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement creditBureauDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("creditBureauDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(creditBureauDropdown);
				softAssert.assertTrue(creditBureauDropdown.isDisplayed(),
						"Credit Bureau field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Remarks field available under Customer Information screen")
	public void user_608_verify_remarks_field_available_under_customer_information_screen() throws Throwable {
		WebElement remarksLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarksLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(remarksLabel);
				softAssert.assertTrue(remarksLabel.isDisplayed(),
						"Remarks field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		WebElement remarksInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarksInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(remarksInput);
				softAssert.assertTrue(remarksInput.isDisplayed(),
						"Remarks field available under Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 invoke soft assert in Customer Details screen at Tawarruq App Data Entry stage")
	public void user_608_invoke_soft_assert_in_customer_details_screen_at_tawarruq_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	@And("User_608 invoke soft assert in Contact Details screen at Tawarruq App Data Entry stage")
	public void user_608_invoke_soft_assert_in_contact_details_screen_at_tawarruq_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
	
//	TW_CD_01_01
	@And("User_608 verify Applicant Type field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_applicant_type_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		for (int i = 0; i <2000; i++) {
          try {
        	  String applicantTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("applicantTypeLabel")).getText();
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("applicantTypeLabel")));
        	  softAssert.assertTrue(applicantTypeLabel.contains("*"), "Applicant Type field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement applicantType = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("applicantType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(applicantType.getAttribute("ng-reflect-readonly").contains("false"),
						"Applicant Type field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement applicantTypeDropdown = javascriptHelper.executeScriptWithWebElement(
				appDataCustomerDetailsJsPaths.getElement("applicantTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(applicantTypeDropdown);
				softAssert.assertTrue(applicantTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Applicant Type field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Customer Type field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_customer_type_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String customerTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerTypeLabel")));
        	  softAssert.assertTrue(customerTypeLabel.contains("*"),"Customer Type field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement customerType = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(customerType.getAttribute("ng-reflect-readonly").contains("false"),
						"Customer Type field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement customerTypeDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(customerTypeDropdown);
				softAssert.assertTrue(customerTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Customer Type field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Title field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_title_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String titleLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleLabel")));
        	  softAssert.assertTrue(titleLabel.contains("*"),"Title field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement title = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("title"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(title.getAttribute("ng-reflect-readonly").contains("false"),
						"Title field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement titleDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(titleDropdown);
				softAssert.assertTrue(titleDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Title field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify First Name field as Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_first_name_field_as_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String firstNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameLabel")));
        	  softAssert.assertTrue(firstNameLabel.contains("*"),"First Name field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement firstName = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstName"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(firstName.getAttribute("ng-reflect-readonly").contains("false"),
						"First Name field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement firstNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(firstNameInput);
				softAssert.assertTrue(firstNameInput.getAttribute("type").contains("text"),
						"First Name field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Middle Name field as Non-Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_middle_name_field_as_non_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String middleNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameLabel")));
        	  softAssert.assertTrue(!(middleNameLabel.contains("*")),"Middle Name field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement middleName = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleName"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(middleName.getAttribute("ng-reflect-readonly").contains("false"),
						"Middle Name field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement middleNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(middleNameInput);
				softAssert.assertTrue(middleNameInput.getAttribute("type").contains("text"),
						"Middle Name field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Last Name field as Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_last_name_field_as_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String lastNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameLabel")));
        	  softAssert.assertTrue(lastNameLabel.contains("*"),"Last Name field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement lastName = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastName"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(lastName.getAttribute("ng-reflect-readonly").contains("false"),
						"Last Name field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement lastNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(lastNameInput);
				softAssert.assertTrue(lastNameInput.getAttribute("type").contains("text"),
						"Last Name field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_608 verify Family Name field as Non-Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_family_name_field_as_non_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String familyNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameLabel")));
        	  softAssert.assertTrue(!(familyNameLabel.contains("*")),"Family Name field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement familyName = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyName"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(familyName.getAttribute("ng-reflect-readonly").contains("false"),
						"Family Name field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement familyNameInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(familyNameInput);
				softAssert.assertTrue(familyNameInput.getAttribute("type").contains("text"),
						"Family Name field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify First Name\\(Arabic) field as Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_first_name_arabic_field_as_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String firstNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabicLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabicLabel")));
        	  softAssert.assertTrue(firstNameArabicLabel.contains("*"),"First Name(Arabic) field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement firstNameArabic = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabic"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(firstNameArabic.getAttribute("ng-reflect-readonly").contains("false"),
						"First Name(Arabic) field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement firstNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabicInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(firstNameArabicInput);
				softAssert.assertTrue(firstNameArabicInput.getAttribute("type").contains("text"),
						"First Name(Arabic) field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Middle Name\\(Arabic) field as Non-Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_middle_name_arabic_field_as_non_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String middleNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabicLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabicLabel")));
        	  softAssert.assertTrue(!(middleNameArabicLabel.contains("*")),"Middle Name(Arabic) field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement middleNameArabic = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabic"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(middleNameArabic.getAttribute("ng-reflect-readonly").contains("false"),
						"Middle Name(Arabic) field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement middleNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabicInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(middleNameArabicInput);
				softAssert.assertTrue(middleNameArabicInput.getAttribute("type").contains("text"),
						"Middle Name(Arabic) field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Last Name\\(Arabic) field as Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_last_name_arabic_field_as_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String lastNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabicLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabicLabel")));
        	  softAssert.assertTrue(lastNameArabicLabel.contains("*"),"Last Name(Arabic) field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement lastNameArabic = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabic"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(lastNameArabic.getAttribute("ng-reflect-readonly").contains("false"),
						"Last Name(Arabic) field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement lastNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabicInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(lastNameArabicInput);
				softAssert.assertTrue(lastNameArabicInput.getAttribute("type").contains("text"),
						"Last Name(Arabic) field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Family Name\\(Arabic) field as Non-Mandatory, Editable and Textbox under Customer Information screen")
	public void user_608_verify_family_name_arabic_field_as_non_mandatory_editable_and_textbox_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String familyNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabicLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabicLabel")));
        	  softAssert.assertTrue(!(familyNameArabicLabel.contains("*")),"Family Name(Arabic) field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement familyNameArabic = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabic"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(familyNameArabic.getAttribute("ng-reflect-readonly").contains("false"),
						"Family Name(Arabic) field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement familyNameArabicInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabicInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(familyNameArabicInput);
				softAssert.assertTrue(familyNameArabicInput.getAttribute("type").contains("text"),
						"Family Name(Arabic) field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	
	@And("User_608 verify Date of Birth field as Mandatory, Editable and Calender under Customer Information screen")
	public void user_608_verify_date_of_birth_field_as_mandatory_editable_and_calender_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String dobLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel")));
        	  softAssert.assertTrue(dobLabel.contains("*"),"Date of Birth field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement dateOfBirth = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dateOfBirth"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(dateOfBirth.getAttribute("ng-reflect-readonly").contains("false"),
						"Date of Birth field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Calender
		WebElement dobCalender = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dobCalender);
				System.out.println("Tag Name: "+dobCalender.getTagName());
				softAssert.assertTrue(dobCalender.getTagName().contains("calendar"),
						"Date of Birth field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify age field as Non-Mandatory, Non-Editable and Texbox under Customer Information screen")
	public void user_608_verify_age_field_as_non_mandatory_non_editable_and_texbox_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String ageLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("ageLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("ageLabel")));
        	  softAssert.assertTrue(!(ageLabel.contains("*")),"age field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Non-Editable
		WebElement age = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("age"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(age.getAttribute("ng-reflect-readonly").contains("true"),
						"Title field as Non-Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Textbox
		WebElement ageInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("ageInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(ageInput);
				softAssert.assertTrue(ageInput.getAttribute("type").contains("number"),
						"Age field as Number");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Gender field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_gender_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
		WebElement dobLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel"));
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(dobLabel);
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}	

//		Validate Mandatory
		String genderLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("genderLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("genderLabel")));
        	  softAssert.assertTrue(genderLabel.contains("*"),"Gender field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement gender = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("gender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(gender.getAttribute("ng-reflect-readonly").contains("false"),
						"Gender field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement genderDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("genderDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(genderDropdown);
				softAssert.assertTrue(genderDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Gender field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Marital Status field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_marital_status_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String maritalStatusLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatusLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatusLabel")));
        	  softAssert.assertTrue(maritalStatusLabel.contains("*"),"Marital Status field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement maritalStatus = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatus"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(maritalStatus.getAttribute("ng-reflect-readonly").contains("false"),
						"Marital Status field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement maritalStatusDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatusDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(maritalStatusDropdown);
				softAssert.assertTrue(maritalStatusDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Marital Status field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Education Level field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_education_level_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String educationLevelLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevelLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevelLabel")));
        	  softAssert.assertTrue(educationLevelLabel.contains("*"),"Education Level field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement educationLevel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevel"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(educationLevel.getAttribute("ng-reflect-readonly").contains("false"),
						"Education Level field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement educationLevelDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(educationLevelDropdown);
				softAssert.assertTrue(educationLevelDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Education Level field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Nationality field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_nationality_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String nationalityLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationalityLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationalityLabel")));
        	  softAssert.assertTrue(nationalityLabel.contains("*"),"Nationality field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement nationality = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationality"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(nationality.getAttribute("ng-reflect-readonly").contains("false"),
						"Nationality field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement nationalityDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationalityDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(nationalityDropdown);
				softAssert.assertTrue(nationalityDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Nationality field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}	
	
	@And("User_608 verify Residential Status field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_residential_status_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String residentialStatusLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatusLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatusLabel")));
        	  softAssert.assertTrue(residentialStatusLabel.contains("*"),"Residential Status field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement residentialStatus = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatus"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(residentialStatus.getAttribute("ng-reflect-readonly").contains("false"),
						"Residential Status field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement residentialStatusDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatusDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(residentialStatusDropdown);
				softAssert.assertTrue(residentialStatusDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Residential Status field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Language field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_language_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String languageLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("languageLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("languageLabel")));
        	  softAssert.assertTrue(languageLabel.contains("*"),"Language field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement Language = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("Language"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(Language.getAttribute("ng-reflect-readonly").contains("false"),
						"Language field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement languageDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("languageDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(languageDropdown);
				softAssert.assertTrue(languageDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Language field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify No of Dependents field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_no_of_dependents_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String noOfDependsLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsLabel")));
        	  softAssert.assertTrue(noOfDependsLabel.contains("*"),"No of Dependents field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement noOfDependents = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependents"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(noOfDependents.getAttribute("ng-reflect-readonly").contains("false"),
						"No of Dependents field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be TextBox
		WebElement noOfDependsInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(noOfDependsInput);
				softAssert.assertTrue(noOfDependsInput.getAttribute("type").contains("number"),
						"No of Dependents field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Client Category field as Mandatory, Editable and Dropdown under Customer Information screen")
	public void user_608_verify_client_category_field_as_mandatory_editable_and_dropdown_under_customer_information_screen() throws Throwable {
//		Validate Mandatory
		String clientCategoryLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategoryLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategoryLabel")));
        	  softAssert.assertTrue(clientCategoryLabel.contains("*"),"Client Category field as Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement clientCategory = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategory"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(clientCategory.getAttribute("ng-reflect-readonly").contains("false"),
						"Client Category field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be lookup value[Dropdown]
		WebElement clientCategoryDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategoryDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(clientCategoryDropdown);
				softAssert.assertTrue(clientCategoryDropdown.getTagName().contains("select"),
						"Client Category field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Blocklisted field as Non-Mandatory, Editable and Toggle button under Customer Information screen")
	public void user_608_verify_blocklisted_field_as_non_mandatory_editable_and_toggle_button_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String blocklistLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklistLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklistLabel")));
        	  softAssert.assertTrue(!(blocklistLabel.contains("*")),"Blocklisted field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement blocklisted = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklisted"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(blocklisted.getAttribute("ng-reflect-readonly").contains("false"),
						"Blocklisted field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be Toggle Button
		WebElement blocklistToggle = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklistToggle"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(blocklistToggle);
				softAssert.assertTrue(blocklistToggle.getTagName().contains("toggle"),
						"Blocklisted field as Toggle button");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Remarks field as Non-Mandatory, Editable and Texbox under Customer Information screen")
	public void user_608_verify_remarks_field_as_non_mandatory_editable_and_texbox_under_customer_information_screen() throws Throwable {
//		Validate Non-Mandatory
		String remarksLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarksLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarksLabel")));
        	  softAssert.assertTrue(!(remarksLabel.contains("*")),"Remarks field as Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              }
          	}
		}
		
//		Verify field as Editable
		WebElement remarks = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarks"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(remarks.getAttribute("ng-reflect-readonly").contains("false"),
						"Remarks field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Validate the field should be TextBox
		WebElement remarksInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarksInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(remarksInput);
				softAssert.assertTrue(remarksInput.getAttribute("type").contains("text"),
						"Remarks field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 click the Back button under Customer Information screen")
	public void user_608_click_the_back_button_under_customer_information_screen() throws Throwable {
		WebElement customerDetailsTab = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsTab"));
		WebElement customerDetailsBackBtn = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsBackBtn"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(customerDetailsTab);
				javascriptHelper.backgroundBorder(customerDetailsBackBtn);
				javascriptHelper.JSEClick(customerDetailsBackBtn);
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify post clicking on Back button system should navigate to the previous screen under Customer Details tab")
	public void user_608_verify_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen_under_customer_details_tab() throws Throwable {
		WebElement customerPersonalInfoScreen = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerPersonalInfoScreen"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(customerPersonalInfoScreen);
				customerPersonalInfoScreen.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	@AT_TW_CD_01_02
	@And("User_608 click the Add button under Contact details section in Additional Customer info tab")
	public void user_608_click_the_add_button_under_contact_details_section_in_additional_customer_info_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();			
					if (titlename.trim().contains("Contact Details")) {
						String jspath = "document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + j + "]";
						WebElement addBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.scrollToElement(addBtn).build().perform();
						addBtn.click();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verfiy Back button is available under Contact details screen")
	public void user_608_verfiy_back_button_is_available_under_contact_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Go Back")) {
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
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verfiy Save button is available under Contact details screen")
	public void user_608_verfiy_save_button_is_available_under_contact_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Save")) {
						String jspath = "document.querySelectorAll('form button')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.backgroundBorder(btn);
						softAssert.assertTrue(btn.isDisplayed(),
								"Save button should be displayed in Contact Details screen");
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 verify Phone Type is available and field should be LOV, editable under Contact details screen")
	public void user_608_verify_phone_type_is_available_and_field_should_be_lov_editable_under_contact_details_screen() throws Throwable {
		WebElement phoneTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("phoneTypeLabel"));
		WebElement phoneTypeDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("phoneTypeDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(phoneTypeLabel);
				softAssert.assertTrue(phoneTypeLabel.isDisplayed(), "Phone Type field available in Contact details screen");
				javascriptHelper.backgroundBorder(phoneTypeDropdown);
				softAssert.assertTrue(phoneTypeDropdown.isDisplayed(), "Phone Type field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(phoneTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Phone Type field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement phoneType = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("phoneType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(phoneType.getAttribute("ng-reflect-readonly").contains("false"),
						"Phone Type field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Phone Number is available and field should be number, editable under Contact details screen")
	public void user_608_verify_phone_number_is_available_and_field_should_be_number_editable_under_contact_details_screen() throws Throwable {
		WebElement phoneNumberLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("phoneNumberLabel"));
		WebElement phoneNumberInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("phoneNumberInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(phoneNumberLabel);
				softAssert.assertTrue(phoneNumberLabel.isDisplayed(), "Phone Number field available in Contact details screen");				
				javascriptHelper.backgroundBorder(phoneNumberInput);
				softAssert.assertTrue(phoneNumberInput.isDisplayed(), "Phone Number field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be Textbox
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(phoneNumberInput.getAttribute("type").contains("text"),
						"Phone Number field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement phoneNumber = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("phoneNumber"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(phoneNumber.getAttribute("ng-reflect-readonly").contains("false"),
						"Phone Number field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Consent For Phone Contact is available and field should be LOV, editable under Contact details screen")
	public void user_608_verify_consent_for_phone_contact_is_available_and_field_should_be_lov_editable_under_contact_details_screen() throws Throwable {
		WebElement consentPhoneLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("consentPhoneLabel"));
		WebElement consentPhoneDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("consentPhoneDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(consentPhoneLabel);
				softAssert.assertTrue(consentPhoneLabel.isDisplayed(), 
						"Consent For Phone Contact field available in Contact details screen");
				javascriptHelper.backgroundBorder(consentPhoneDropdown);
				softAssert.assertTrue(consentPhoneDropdown.isDisplayed(), 
						"Consent For Phone Contact field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(consentPhoneDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Consent For Phone Contact field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement consentPhone = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("consentPhone"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(consentPhone.getAttribute("ng-reflect-readonly").contains("false"),
						"Consent For Phone Contact field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Prefered Phone Contact Type is available and field should be LOV, editable under Contact details screen")
	public void user_608_verify_prefered_phone_contact_type_is_available_and_field_should_be_lov_editable_under_contact_details_screen() throws Throwable {
		WebElement contactTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("contactTypeLabel"));
		WebElement contactTypeDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("contactTypeDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(contactTypeLabel);
				softAssert.assertTrue(contactTypeLabel.isDisplayed(),
						"Prefered Phone Contact field available in Contact details screen");
				javascriptHelper.backgroundBorder(contactTypeDropdown);
				softAssert.assertTrue(contactTypeDropdown.isDisplayed(),
						"Prefered Phone Contact field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(contactTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Prefered Phone Contact field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement contactType = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("contactType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(contactType.getAttribute("ng-reflect-readonly").contains("false"),
						"Prefered Phone Contact field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Prefered Time For Contact is available and field should be HH:MM format, editable under Contact details screen")
	public void user_608_verify_prefered_time_for_contact_is_available_and_field_should_be_hh_mm_format_editable_under_contact_details_screen() throws Throwable {
		WebElement preferdTimeContactLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("preferdTimeContactLabel"));
		WebElement preferdTimeContactInput = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("preferdTimeContactInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(preferdTimeContactLabel);
				softAssert.assertTrue(preferdTimeContactLabel.isDisplayed(), 
						"Prefered Time For Contact field available in Contact details screen");
				javascriptHelper.backgroundBorder(preferdTimeContactInput);
				softAssert.assertTrue(preferdTimeContactInput.isDisplayed(), 
						"Prefered Time For Contact field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be Textbox
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(preferdTimeContactInput.getAttribute("type").contains("text"),
						"Prefered Time For Contact field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement preferdTimeContact = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("preferdTimeContact"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(preferdTimeContact.getAttribute("ng-reflect-readonly").contains("false"),
						"Prefered Time For Contact field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 verify Email Type is available and field should be LOV, editable under Contact details screen")
	public void user_608_verify_email_type_is_available_and_field_should_be_lov_editable_under_contact_details_screen() throws Throwable {
		WebElement emailTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("emailTypeLabel"));
		WebElement emailTypeDropdown = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("emailTypeDropdown"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(emailTypeLabel);
				softAssert.assertTrue(emailTypeLabel.isDisplayed(), "Email Type field available in Contact details screen");
				javascriptHelper.backgroundBorder(emailTypeDropdown);
				softAssert.assertTrue(emailTypeDropdown.isDisplayed(), "Email Type field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be lookup value[Dropdown]
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(emailTypeDropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Email Type field as Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement emailType = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("emailType"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(emailType.getAttribute("ng-reflect-readonly").contains("false"),
						"Email Type field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 verify Email ID is available and field should be Email format, editable under Contact details screen")
	public void user_608_verify_email_id_is_available_and_field_should_be_email_format_editable_under_contact_details_screen() throws Throwable {
		WebElement emailIDLabel = javascriptHelper.executeScriptWithWebElement(
				appDataCustomerDetailsJsPaths.getElement("emailIDLabel"));
		WebElement emailIDInput = javascriptHelper.executeScriptWithWebElement(
				appDataCustomerDetailsJsPaths.getElement("emailIDInput"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(emailIDLabel);
				softAssert.assertTrue(emailIDLabel.isDisplayed(), "Email ID field available in Contact details screen");
				javascriptHelper.backgroundBorder(emailIDInput);
				softAssert.assertTrue(emailIDInput.isDisplayed(), "Email ID field available in Contact details screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	 
		
//		Validate the field should be Textbox
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(emailIDInput.getAttribute("type").contains("text"),
						"Email ID field as Input");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}		
		
//		Verify field as Editable
		WebElement emailID = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("emailID"));
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(emailID.getAttribute("ng-reflect-readonly").contains("false"),
						"Email ID field as Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
//	@AT_TW_CD_02
	@And("User_608 select the Salutation Title in Customer Information screen")
	public void user_608_select_the_salutation_title_in_customer_information_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleDropdown"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 5000; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains(testData.get("Title"))) {
						String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
						WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(btn).click().build().perform();
						break;
					}
				}
				break;
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the First Name in Customer Information screen")
	public void user_608_enter_the_first_name_in_customer_information_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameInput"))
				.sendKeys(testData.get("First Name"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Last Name in Customer Information screen")
	public void user_608_enter_the_last_name_in_customer_information_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameInput"))
				.sendKeys(testData.get("Last Name"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the Save button with mandatory field is blank in Customer Information screen")
	public void user_608_click_the_save_button_with_mandatory_field_is_blank_in_customer_information_screen() throws Throwable {	    
		for (int i = 0; i <= 1500; i++) {
			try {
				WebElement customerDetailsSaveBtn = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsSaveBtn"));
				javascriptHelper.backgroundBorder(customerDetailsSaveBtn);
				customerDetailsSaveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Mandatory blank field validation message in Customer Information screen")
	public void user_608_verify_mandatory_blank_field_validation_message_in_customer_information_screen() throws Throwable {
		WebElement blankFieldError = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blankFieldError"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(blankFieldError);
				softAssert.assertTrue(blankFieldError.getText().contains("Please fill all the details"),
						"verify Mandatory blank field validation message in Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}    
	}
	
	
	@And("User_608 enter the Special charater in any field and verify the validation message in Customer Information screen")
	public void user_608_enter_the_special_charater_in_any_field_and_verify_the_validation_message_in_customer_information_screen() throws Throwable {
//		Keys.chord(Keys.CONTROL,"a", Keys.DELETE)
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameInput"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameInput"))
				.sendKeys(testData.get("Special Char"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify validation message
		WebElement alphabetError = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("alphabetError"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(alphabetError);
				softAssert.assertTrue(alphabetError.getText().contains("Only Alphabets are allowed"),
						"verify Only Alphabets are allowed validation message in Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 enter the Negative number in numberic field and verify the validation message in Customer Information screen")
	public void user_608_enter_the_negative_number_in_numberic_field_and_verify_the_validation_message_in_customer_information_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependents")));
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsInput")).click();
				javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsInput"))
				.sendKeys(testData.get("Negative Number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
//		Verify validation message
		WebElement negativeNbrError = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("negativeNbrError"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(negativeNbrError);
				softAssert.assertTrue(negativeNbrError.getText().contains("less than 0"),
						"verify the Negative number validation message in Customer Information screen");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	AT_TW_AD_06
	@And("User_608 click the Update button under Application Details screen")
	public void user_608_click_the_update_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-cards button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-cards button')[" + j + "].getAttribute('ng-reflect-text')";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Update")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('ion-cards button')[" + j + "]";
						WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.JSEClick(searchBtn);
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
		for (int i = 0; i <= 500000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("popupCloseBtn")).click();
				break;
			} catch (Exception e) {
				if (i == 500000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Action field available in list view under Application Details screen")
	public void user_608_verify_action_field_available_in_list_view_under_application_details_screen() throws Throwable {
		Thread.sleep(500);
		WebElement listview_Action = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_Action"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_Action);
				softAssert.assertTrue(listview_Action.isDisplayed(), "Action field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Client Name field available in list view under Application Details screen")
	public void user_608_verify_client_name_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_ClientName = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_ClientName"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_ClientName);
				softAssert.assertTrue(listview_ClientName.isDisplayed(), "Client Name field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Client Name\\(Alternate Lanuguage) field available in list view under Application Details screen")
	public void user_608_verify_client_name_alternate_lanuguage_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_ClientNameOtherLang = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_ClientNameOtherLang"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_ClientNameOtherLang);
				softAssert.assertTrue(listview_ClientNameOtherLang.isDisplayed(), "Client Name(Other Language) field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Product field available in list view under Application Details screen")
	public void user_608_verify_product_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_Product = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_Product"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_Product);
				softAssert.assertTrue(listview_Product.isDisplayed(), "Product field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sub Product field available in list view under Application Details screen")
	public void user_608_verify_sub_product_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_SubProduct = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_SubProduct"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_SubProduct);
				softAssert.assertTrue(listview_SubProduct.isDisplayed(), "Sub-Product field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Current Stage field available in list view under Application Details screen")
	public void user_608_verify_current_stage_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_CurrentStage = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_CurrentStage"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_CurrentStage);
				softAssert.assertTrue(listview_CurrentStage.isDisplayed(), "Current stage field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Location field available in list view under Application Details screen")
	public void user_608_verify_location_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_Location = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_Location"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_Location);
				softAssert.assertTrue(listview_Location.isDisplayed(), "Location field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Allocated To field available in list view under Application Details screen")
	public void user_608_verify_allocated_to_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_AllocatedTo = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_AllocatedTo"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_AllocatedTo);
				softAssert.assertTrue(listview_AllocatedTo.isDisplayed(), "Allocated To field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Service field available in list view under Application Details screen")
	public void user_608_verify_service_field_available_in_list_view_under_application_details_screen() {
		WebElement listview_Service = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_Service"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_Service);
				softAssert.assertTrue(listview_Service.isDisplayed(), "Service field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Status field available in list view under Application Details screen")
	public void user_608_verify_status_field_available_in_list_view_under_application_details_screen() throws Throwable {
		WebElement listview_Status = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("listview_Status"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(listview_Status);
				softAssert.assertTrue(listview_Status.isDisplayed(), "Status field should display in List view");
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	@And("User_608 click the Search Icon under Application Details screen")
	public void user_608_click_the_search_icon_under_application_details_screen() throws Throwable {
		WebElement searchBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBtn"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(searchBtn);
				searchBtn.click();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 search matching value system should display all the possible matching records under Application Details screen")
	public void user_608_search_matching_value_system_should_display_all_the_possible_matching_records_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(testData.get("Matching_Value"),Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify the all the possible matching records are displayed under Application Details screen")
	public void user_608_verify_the_all_the_possible_matching_records_are_displayed_under_application_details_screen() throws Throwable {
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				softAssert.assertTrue(Integer.parseInt(text)>0, "All possible Matching records are showing");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 search mismatch value system should not display any records under Application Details screen")
	public void user_608_search_mismatch_value_system_should_not_display_any_records_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {				
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchBox"))
				.sendKeys(testData.get("Mismatched_Value"), Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify the system is should not displayed any records under Application Details screen")
	public void user_608_verify_the_system_is_should_not_displayed_any_records_under_application_details_screen() throws Throwable {
		WebElement searchResult = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("searchResult"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(searchResult);
				String text = searchResult.getText().substring(13, 14);
				System.out.println("Result value: "+text);
				softAssert.assertTrue(Integer.parseInt(text)==0, "System is should not displayed any records");
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 click the Export button under Application Details screen")
	public void user_608_click_the_export_button_under_application_details_screen() throws Throwable {
		WebElement exportBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("exportBtn"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(exportBtn);
				exportBtn.click();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the PDF and verify under Application Details screen")
	public void user_608_click_the_pdf_and_verify_under_application_details_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("exportPDF")));
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("exportPDF")).click();
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
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application Details")) {
//				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application Details"),
						"File is nott downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}

	@And("User_608 click the XLS and verify under Application Details screen")
	public void user_608_click_the_xls_and_verify_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("exportXLS")).click();
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
//			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("Application")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("Application"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
        }	    
	}
	
	
	@And("User_608 click the Add button under Application Details screen")
	public void user_608_click_the_add_button_under_application_details_screen() throws Throwable {
		WebElement addBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("addBtn"));
		for (int i = 0; i <= 150000; i++) {
			try {
				javascriptHelper.backgroundBorder(addBtn);
				addBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verfiy the new record creation page under Application Details screen")
	public void user_608_verfiy_the_new_record_creation_page_under_application_details_screen() throws Throwable {		
		for (int i = 0; i <= 15000; i++) {
			try {
				WebElement customerSearchPage = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerSearchPage"));
				softAssert.assertTrue(customerSearchPage.isDisplayed(),"New record creation page in Application Details screen");
				break;
			} catch (Exception e) {
				if (i == 15000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 invoke soft assert in Application details screen at Tawarruq App Data Entry stage")
	public void user_608_invoke_soft_assert_in_application_details_screen_at_tawarruq_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	@And("User_608 invoke soft assert in Application details screen at Tawarruq App Data Check stage")
	public void user_608_invoke_soft_assert_in_application_details_screen_at_tawarruq_app_data_check_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	
//	@AT_TW_AD_DOC_05
	@And("User_608 click the Document Details tab")
	public void user_608_click_the_document_details_tab() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
						.toString();
				System.out.println(length);
				if (!length.isBlank() && !length.equals("0")) {
					break;
				}
			} catch (Exception e) {
				if (i == 4999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 500; i++) {
			try {
				for (int j = 0; j < Integer.parseInt(length); j++) {
					String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					if (titlename.trim().contains("Document Details")) {
						String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
						WebElement addButton = javascriptHelper.executeScriptWithWebElement(jspath);
						actions.moveToElement(addButton).build().perform();
						javascriptHelper.JSEClick(addButton);
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

	@And("User_608 click the Add button under Document Details tab")
	public void user_608_click_the_add_button_under_document_details_tab() throws Throwable {
		for (int i = 0; i <= 100000; i++) {
			try {
				WebElement addBtn = javascriptHelper.executeScriptWithWebElement(
						appDataDocumentDetailsJsPaths.getElement("documentsDetailsAddBtn"));
				addBtn.click();
				break;
			} catch (Exception e) {
				if (i == 100000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 verify Document Category field should be Mandatory and LOV Under Document Details tab")
	public void user_608_verify_document_category_field_should_be_mandatory_and_lov_under_document_details_tab() throws Throwable {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentStatus")));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentCategoryLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentCategoryLabel")));
        	  softAssert.assertTrue(text.contains("*"), "Document Category field should be Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Dropdown/LOV
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentCategoryLOV"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Document Category field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_608 verify Expected Receipt Date field should be Non-mandatory and Date Under Document Details tab")
	public void user_608_verify_expected_receipt_date_field_should_be_non_mandatory_and_date_under_document_details_tab() throws Throwable {
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("expectReceiptDateLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("expectReceiptDateLabel")));
        	  softAssert.assertTrue(!(text.contains("*")), "Expected Receipt Date field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Date
		WebElement calender = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("expectReceiptDateCalender"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(calender);
				softAssert.assertTrue(calender.getTagName().contains("calendar"), "Expected Receipt Date field should be Date");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 verify Def Approved By field should be Non-mandatory and LOV Under Document Details tab")
	public void user_608_verify_def_approved_by_field_should_be_non_mandatory_and_lov_under_document_details_tab() throws Throwable {
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("defApprovedByLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("defApprovedByLabel")));
        	  softAssert.assertTrue((!text.contains("*")), "Def Approved By field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Dropdown/LOV
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("defApprovedByLOV"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Def Approved By field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Change In Nature Approved By field should be Non-mandatory and LOV Under Document Details tab")
	public void user_608_verify_change_in_nature_approved_by_field_should_be_non_mandatory_and_lov_under_document_details_tab() throws Throwable {
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("changeNatureApprovedByLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("changeNatureApprovedByLabel")));
        	  softAssert.assertTrue((!text.contains("*")), "Change In Nature Approved By field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Dropdown/LOV
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("changeNatureApprovedByLOV"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Change In Nature Approved By field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Document Form field should be Non-mandatory, Editable and LOV Under Document Details tab")
	public void user_608_verify_document_form_field_should_be_non_mandatory_editable_and_lov_under_document_details_tab() throws Throwable {
//		Verify field as Non-Mandatory
		String text = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentFormLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentFormLabel")));
        	  softAssert.assertTrue((!text.contains("*")), "Document Form field should be Non-Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Dropdown/LOV
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentFormLOV"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Document Form field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	
		
//		Verify field as Editable only
		WebElement field = javascriptHelper.executeScriptWithWebElement(appDataDocumentDetailsJsPaths.getElement("documentForm"));
		String read = field.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Document Form field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("User_608 invoke soft assert in Document details screen under Document Details tab at Tawarruq App Data Entry stage")
	public void user_608_invoke_soft_assert_in_document_details_screen_under_document_details_tab_at_tawarruq_app_data_entry_stage() throws Throwable {
	    softAssert.assertAll();
	}
	
	
	// ************** Tawarruq -- App Data Entry stage -- Additional customer info tab *********************
//		Additional Customer Info Tab
		@And("User_608 click the Additional Customer Info tab")
		public void user_608_click_the_additional_customer_info_tab() throws Throwable {
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-segment-button').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 500; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-segment-button')[" + j + "].innerText";
						String titlename = javascriptHelper.executeScript(title).toString();
//						System.out.println(titlename);
						if (titlename.trim().equalsIgnoreCase("Additional Customer Info")) {
							System.out.println("condition true");
							String jspath = "document.querySelectorAll('ion-segment-button')[" + j + "]";
							WebElement tab = javascriptHelper.executeScriptWithWebElement(jspath);
							tab.click();
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

		@And("User_608 click the Pencil Icon button in Customer Personal Info section under Additional Customer Info tab")
		public void user_608_click_the_pencil_icon_button_in_customer_personal_info_section_under_additional_customer_info_tab() throws Throwable {
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();			
						if (titlename.trim().contains("Customer Personal Information")) {
							String jspath = "document.querySelectorAll('button[icon=\"pi pi-pencil\"]')[" + j + "]";
							WebElement pencilBtn = javascriptHelper.executeScriptWithWebElement(jspath);
							pencilBtn.click();
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 click the Add button in Customer Identification under Additional Customer Info tab")
		public void user_608_click_the_add_button_in_customer_identification_under_additional_customer_info_tab() throws Throwable {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationBackBtn")));
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationAddBtn")).click();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 select the ID Type in Customer Identification screen")
		public void user_608_select_the_id_type_in_customer_identification_screen() throws Throwable {
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType_Dropdown"))
					.click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
//						System.out.println("Option: "+titlename);
						if (titlename.trim().contains(testData.get("ID_Type"))) {
							String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.moveToElement(btn).click().build().perform();
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@And("User_608 enter the invalid ID number in Customer Identification screen")
		public void user_608_enter_the_invalid_id_number_in_customer_identification_screen() throws Throwable {
			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(testData.get("ID_Number"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 select the Issuing Authority in Customer Identification screen")
		public void user_608_select_the_issuing_authority_in_customer_identification_screen() throws Throwable {
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issuingAuthorityDropdown")).click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";
			for (int i = 0; i <= 300; i++) {
				try {
					dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
					System.out.println("Dropdown length " + dropdownLength);
					if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int premitiveDropdownLength = Integer.parseInt(dropdownLength);
			for (int j = 0; j <= premitiveDropdownLength; j++) {
				for (int l = 0; l <= 300; l++) {
					try {
						System.out.println("L value is " + l);
						System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
						dropdownString = javascriptHelper.executeScript(
								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					} catch (Exception e) {
						if (l == 300 && !(dropdownString.isBlank())) {
							Assert.fail(e.getMessage());
						}
					}
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				}
				System.out.println("String " + dropdownString.trim());
				System.out.println("Map " + testData.get("Issuing_Authority").trim());
				if ((dropdownString.trim()).contains((testData.get("Issuing_Authority")).trim())) {
					for (int k = 0; k <= 300; k++) {
						try {
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							isDropdownValueSelected = true;
							break;
						} catch (Exception e) {
							if (k == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				if (isDropdownValueSelected == true) {
					break;
				}
			}
		    
		}

		
		@And("User_608 verify the invalid data validation in Customer Identification screen")
		public void user_608_verify_the_invalid_data_validation_in_customer_identification_screen() throws Throwable {
			WebElement invalidData = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("invalidDataError"));
			System.err.println("Invalid Data Error : "+invalidData.getText());
			for (int i = 0; i<2000; i++) {
	          try {
	              Assert.assertTrue(invalidData.isDisplayed());
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}	    
		}
		
		@And("User_608 enter the special characters in ID number under Customer Identification screen")
		public void user_608_enter_the_special_characters_in_id_number_under_customer_identification_screen() throws Throwable {
			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(testData.get("ID_Number_SpecialChar"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User_608 verify the Special character validation in Customer Identification screen")
		public void user_608_verify_the_special_character_validation_in_customer_identification_screen() throws Throwable {
			WebElement specialCharError = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("specialCharError"));
			String specialChar = specialCharError.getText().trim();
			System.err.println("Speacial Char: "+specialChar);
			for (int i = 0; i<20000; i++) {
	          try {
//	        	  Thread.sleep(1000);
//	           Assert.assertTrue(specialChar.equalsIgnoreCase("Only Alphanumeric characters allowed"));
	        	  javascriptHelper.backgroundColor(specialCharError);
	        	  softAssert.assertTrue(specialCharError.isDisplayed(), "System should display - Only Alphanumeric characters allowed");
	        	  softAssert.assertTrue(specialChar.equalsIgnoreCase("Only Alphanumeric characters are allowed"), "System should display error msg");
	              break;
	          } catch (Exception e) {
	              if (i==19999) {
	                  Assert.fail(e.getMessage());
	              	}
	          	}
			}  
		}

		@And("User_608 click the save button with mandatory field blank in Customer Identification screen")
		public void user_608_click_the_save_button_with_mandatory_field_blank_in_customer_identification_screen() throws Throwable {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsSaveBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
		}

		@And("User_608 verify the Validation error msg in Customer Identification screen")
		public void user_608_verify_the_validation_error_msg_in_customer_identification_screen() throws Throwable {
			String madatoryErrorMsg = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("mandatoryFillToastMsg")).getText();
			System.err.println("Mandatory Error : "+madatoryErrorMsg);
			for (int i = 0; i<2000; i++) {
	          try {
	              Assert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"));
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			WebElement reqFieldError = javascriptHelper.executeScriptWithWebElement(additionalCustInfoJsPaths.getElement("requiredFieldError"));
////			System.err.println("Mandatory Error : "+reqFieldError.getText());
//			for (int i = 0; i<2000; i++) {
//	          try {
//	              Assert.assertTrue(reqFieldError.isDisplayed());
//	              break;
//	          } catch (Exception e) {
//	              if (i==1999) {
//	                  Assert.fail(e.getMessage());
//	              }
//	          	}
//			}		
		}
	
		
//		@AT_TW_NEWAPP_IDA_01
		@And("User_608 verify Back button available under Identification Details screen in Additional Customer Info tab")
		public void user_608_verify_back_button_available_under_identification_details_screen_in_additional_customer_info_tab() throws Throwable {
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
						String titlename = javascriptHelper.executeScript(title).toString();
						System.out.println(titlename);
						if (titlename.trim().contains("Go Back")) {
							System.out.println("condition true");
							String jspath = "document.querySelectorAll('form button')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundBorder(btn);
							softAssert.assertTrue(btn.isDisplayed(),"Back button should be displayed in Customer Debt screen");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			//			WebElement backBtn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsBackBtn"));
//			for (int i = 0; i <= 150000; i++) {
//				try {
//					javascriptHelper.backgroundBorder(backBtn);
//					backBtn.isDisplayed();
//					break;
//				} catch (Exception e) {
//					if (i == 150000) {
//						Assert.fail(e.getMessage());
//					}
//				}
//			}		    
		}

		@And("User_608 verify Save button available under Identification Details screen in Additional Customer Info tab")
		public void user_608_verify_save_button_available_under_identification_details_screen_in_additional_customer_info_tab() throws Throwable {
			WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsSaveBtn"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(saveBtn);
					saveBtn.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Help button available under Identification Details screen in Additional Customer Info tab")
		public void user_608_verify_help_button_available_under_identification_details_screen_in_additional_customer_info_tab() throws Throwable {
			WebElement helpBtn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsHelpBtn"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(helpBtn);
					helpBtn.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 enter the ID number in Customer Identification screen")
		public void user_608_enter_the_id_number_in_customer_identification_screen() {
//			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(testData.get("ID_Number"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 enter the Issue Date in Customer Identification screen")
		public void user_608_enter_the_issue_date_in_customer_identification_screen() {
//			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate_Input"))
					.sendKeys(testData.get("IssueDate"),Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 enter the Expiry Date in Customer Identification screen")
		public void user_608_enter_the_expiry_date_in_customer_identification_screen() {
//			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate_Input"))
					.sendKeys(testData.get("ExpiryDate"),Keys.TAB);
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 select the Country of Issue in Customer Identification screen")
		public void user_608_select_the_country_of_issue_in_customer_identification_screen() {
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("countryOfIssueDropdown")).click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";
			for (int i = 0; i <= 300; i++) {
				try {
					dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
					System.out.println("Dropdown length " + dropdownLength);
					if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			int premitiveDropdownLength = Integer.parseInt(dropdownLength);
			for (int j = 0; j <= premitiveDropdownLength; j++) {
				for (int l = 0; l <= 300; l++) {
					try {
						System.out.println("L value is " + l);
						System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
						dropdownString = javascriptHelper.executeScript(
								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					} catch (Exception e) {
						if (l == 300 && !(dropdownString.isBlank())) {
							Assert.fail(e.getMessage());
						}
					}
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				}
				System.out.println("String " + dropdownString.trim());
				System.out.println("Map " + testData.get("Country_of_Issue").trim());
				if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Country_of_Issue")).trim())) {
					for (int k = 0; k <= 300; k++) {
						try {
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							isDropdownValueSelected = true;
							break;
						} catch (Exception e) {
							if (k == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				if (isDropdownValueSelected == true) {
					break;
				}
			}		    
		}
	
		@And("User_608 click the Save button under Customer Identification screen")
		public void user_608_click_the_save_button_under_customer_identification_screen() {
			for (int i = 0; i <= 10000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsSaveBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 10000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
		@And("User_608 to verify system display the confirmation message post clicking on save button")
		public void user_608_to_verify_system_display_the_confirmation_message_post_clicking_on_save_button() {
			WebElement alertMsg = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("alert_SuccessMsg"));
			for (int i = 0; i < 20000; i++) {
				try {
		        	 String text = alertMsg.getText();
		        	 System.out.println("Alert Message: "+text);
		        	 softAssert.assertTrue((text.contains("Success")), "System display the confirmation message");
		             break;
		        } catch (Exception e) {
		            
		        }
			}
			
			for (int i = 0; i < 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("alert_closeBtn")).click();
		             break;
		        } catch (Exception e) {
		            if (i==1999) {
		                 Assert.fail(e.getMessage());
		            }
		        }
			}
		}
	
		@And("User_608 invoke soft assert in Identification details screen under Additional Customer Info tab at Tawarruq New Application stage")
		public void user_608_invoke_soft_assert_in_identification_details_screen_under_additional_customer_tab_at_tawarruq_new_app_stage() throws Throwable {
		    softAssert.assertAll();
		}
		
		
		
//		@AT_TW_NEWAPP_IDA_02
		@And("User_608 verify ID Type field is available under Customer Identification screen")
		public void user_608_verify_id_type_field_is_available_under_customer_identification_screen() throws Throwable {		
			for (int i = 0; i <= 1500; i++) {
				try {
					WebElement label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType_Label"));
					javascriptHelper.backgroundColor(label);
					label.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType_Dropdown"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(field);
					field.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify ID number field is available under Customer Identification screen")
		public void user_608_verify_id_number_field_is_available_under_customer_identification_screen() throws Throwable {
			WebElement label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Label"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundColor(label);
					label.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(field);
					field.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Issue Date field is available under Customer Identification screen")
		public void user_608_verify_issue_date_field_is_available_under_customer_identification_srcreen() throws Throwable {
			WebElement label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate_Label"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundColor(label);
					label.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate_Input"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(field);
					field.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Expiry Date field is available under Customer Identification screen")
		public void user_608_verify_expiry_date_field_is_available_under_customer_identification_screen() throws Throwable {
			WebElement label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate_Label"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundColor(label);
					label.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate_Input"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(field);
					field.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Issuing Authority field is available under Customer Identification screen")
		public void user_608_verify_issuing_authority_field_is_available_under_customer_identification_screen() throws Throwable {
			WebElement label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issuingAuthorityLabel"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundColor(label);
					label.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issuingAuthorityDropdown"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(field);
					field.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Country of Issue field is available under Customer Identification screen")
		public void user_608_verify_country_of_issue_field_is_available_under_customer_identification_screen() throws Throwable {
			WebElement label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("countryOfIssueLabel"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundColor(label);
					label.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("countryOfIssueDropdown"));
			for (int i = 0; i <= 1500; i++) {
				try {
					javascriptHelper.backgroundBorder(field);
					field.isDisplayed();
					break;
				} catch (Exception e) {
					if (i == 1500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
		
		@And("User_608 verify ID Type field should be Mandatory, Editable and Lookup under Customer Identification screen")
		public void user_608_verify_id_type_field_should_be_mandatory_editable_and_lookup_under_customer_identification_screen() throws Throwable {
//			Validate Mandatory
			String label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType_Label")).getText();
			for (int i = 0; i <2000; i++) {
	          try {
	        	  softAssert.assertTrue(label.contains("*"), "ID Type field should be mandatory");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			Verify field as Editable
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(field.getAttribute("ng-reflect-readonly").contains("false"), "ID Type field should be editable");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Validate the field should be lookup value[Dropdown]
			WebElement dropdown = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType_Dropdown"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "ID type field should be Dropdown/Lookup");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify ID number field should be Mandatory, Editable and Textbox under Customer Identification screen")
		public void user_608_verify_id_number_field_should_be_mandatory_editable_and_textbox_under_customer_identification_screen() throws Throwable {
//			Validate Mandatory
			String label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Label")).getText();
			for (int i = 0; i <2000; i++) {
	          try {
	        	  softAssert.assertTrue(label.contains("*"), "ID Number field should be Mandatory");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			Verify field as Editable
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(field.getAttribute("ng-reflect-readonly").contains("false"), "ID Number field should be editable");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Validate the field should be Textbox
			WebElement textbox = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(textbox.getAttribute("type").contains("text"), "ID Number field should be Textbox");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Issue Date field should be Non-mandatory, Editable and Calendar under Customer Identification screen")
		public void user_608_verify_issue_date_field_should_be_non_mandatory_editable_and_calendar_under_customer_identification_screen() throws Throwable {
//			Validate Non-mandatory
			String label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate_Label")).getText();
			for (int i = 0; i <2000; i++) {
	          try {
	        	  softAssert.assertTrue(!(label.contains("*")), "Issue Date field should be Non-mandatory");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			Verify field as Editable
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(field.getAttribute("ng-reflect-readonly").contains("false"), "Issue Date field should be editable");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Validate the field should be Calendar
			WebElement calendar = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issueDate_Calendar"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(calendar.getTagName().contains("calendar"), "Issue Date field should be Calendar");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Expiry Date field should be Non-mandatory, Editable and Calendar under Customer Identification screen")
		public void user_608_verify_expiry_date_field_should_be_non_mandatory_editable_and_calendar_under_customer_identification_screen() throws Throwable {
//			Validate Non-mandatory
			String label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate_Label")).getText();
			for (int i = 0; i <2000; i++) {
	          try {
	        	  softAssert.assertTrue(!(label.contains("*")), "Expiry Date field should be Non-mandatory");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			Verify field as Editable
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(field.getAttribute("ng-reflect-readonly").contains("false"), "Expiry Date field should be editable");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Validate the field should be Calendar
			WebElement calendar = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("expiryDate_Calendar"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(calendar.getTagName().contains("calendar"), "Expiry Date field should be Calendar");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Issuing Authority field should be Mandatory, Editable and Lookup under Customer Identification screen")
		public void user_608_verify_issuing_authority_field_should_be_mandatory_editable_and_lookup_under_customer_identification_screen() throws Throwable {
//			Validate Mandatory
			for (int i = 0; i <2000; i++) {
	          try {
	        	  String label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issuingAuthorityLabel")).getText();
	        	  System.out.println("Label:"+label);
	        	  softAssert.assertTrue(!(label.contains("*")), "Issuing Authority field should be mandatory");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			Verify field as Editable
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issuingAuthority"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(field.getAttribute("ng-reflect-readonly").contains("false"), "Issuing Authority field should be editable");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Validate the field should be lookup value[Dropdown]
			WebElement dropdown = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("issuingAuthorityDropdown"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Issuing Authority field should be Dropdown/Lookup");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 verify Country of Issue field should be Mandatory, Editable and Lookup under Customer Identification screen")
		public void user_608_verify_country_of_issue_field_should_be_mandatory_editable_and_lookup_under_customer_identification_screen() throws Throwable {
//			Validate Mandatory
			String label = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("countryOfIssueLabel")).getText();
			for (int i = 0; i <2000; i++) {
	          try {
	        	  softAssert.assertTrue(!(label.contains("*")), "Country Of Issue field should be mandatory");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              }
	          	}
			}
			
//			Verify field as Editable
			WebElement field = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("countryOfIssue"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(field.getAttribute("ng-reflect-readonly").contains("false"), "Country Of Issue field should be editable");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
//			Validate the field should be lookup value[Dropdown]
			WebElement dropdown = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("countryOfIssueDropdown"));
			for (int i = 0; i <= 2000; i++) {
				try {
					softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"), "Country Of Issue field should be Dropdown/Lookup");
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
		@And("User_608 to verify the functionality of Help button under Customer Identification screen")
		public void user_608_to_verify_the_functionality_of_help_button_under_customer_identification_screen() throws Throwable {
			WebElement backBtn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsHelpBtn"));
			for (int i = 0; i <= 150000; i++) {
				try {
					javascriptHelper.backgroundBorder(backBtn);
					backBtn.click();
					break;
				} catch (Exception e) {
					if (i == 150000) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		}

		@And("User_608 post clicking on Help button, system should display the description of all the fields in details")
		public void user_608_post_clicking_on_help_button_system_should_display_the_description_of_all_the_fields_in_details() throws Throwable {
			WebElement helpBtn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("help_fieldDescription"));
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.scrollIntoView(helpBtn);
					javascriptHelper.backgroundBorder(helpBtn);
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("help_fieldDescription")).isDisplayed();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			} 
		}		
				
		@And("User_608 to verify the functionality of Back button under Customer Identification screen")
		public void user_608_to_verify_the_functionality_of_back_button_under_customer_identification_screen() throws Throwable {
			String submitBtn = "document.querySelector('button[ng-reflect-label=\"Submit\"]')";
			WebElement backBtn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("identificationDetailsBackBtn"));
			for (int i = 0; i <= 150000; i++) {
				try {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(submitBtn));
					javascriptHelper.backgroundBorder(backBtn);
					backBtn.click();
					break;
				} catch (Exception e) {
					if (i == 150000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 post clicking on Back button, system should navigate to the previous screen in Additional Customer Info")
		public void user_608_post_clicking_on_back_button_system_should_navigate_to_the_previous_screen_in_additional_customer_info() throws Throwable {
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationAddBtn")));
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationAddBtn")).isDisplayed();
					break;
				} catch (Exception e) { 
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
		
//		@AT_TW_NEWAPP_IDA_04
		@And("User_608 click the any record under Customer Identification section in Additional Customer Info tab")
		public void user_608_click_the_any_record_under_customer_identification_section_in_additional_customer_info_tab() throws Throwable {
//			document.querySelector('button[icon="pi pi-arrow-left"]').parentElement.parentElement.parentElement.querySelectorAll('td')[2].parentElement.querySelector('button')
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationBackBtn")));
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationEditBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
					
		}
		
		@And("User_608 verify Update button available under Identification Details screen in Additional Customer Info tab")
		public void user_608_verify_update_button_available_under_identification_details_screen_in_additional_customer_info_tab() throws Throwable {
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
						String titlename = javascriptHelper.executeScript(title).toString();
						System.out.println(titlename);
						if (titlename.trim().contains("Update")) {
							System.out.println("condition true");
							String jspath = "document.querySelectorAll('form button')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundBorder(btn);
							softAssert.assertTrue(btn.isDisplayed(),"Back button should be displayed in Customer Debt screen");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User_608 to verify while modification, when user keep any mandatory field blank and click on save button under Identification Details screen")
		public void user_608_to_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_under_identification_details_screen() throws Throwable {
			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
							.toString();
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Update")) {
							String jspath = "document.querySelectorAll('form button')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.scrollToElement(btn).build().perform();
							javascriptHelper.JSEClick(btn);
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 to verify System should show the proper validation message for blank field which is mandatory under Identification Details screen")
		public void user_608_to_verify_system_should_show_the_proper_validation_message_for_blank_field_which_is_mandatory_under_identification_details_screen() throws Throwable {
			for (int i = 0; i<2000; i++) {
	          try {
	        	  String madatoryErrorMsg = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("mandatoryFillToastMsg")).getText();
	  			  System.err.println("Mandatory Error : "+madatoryErrorMsg);
	  			  javascriptHelper.backgroundBorder(
	  					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("mandatoryFillToastMsg")));
	        	  softAssert.assertTrue(madatoryErrorMsg.contains("Please fill all the details"),
	        			  "System should show the proper validation message for blank field");
	              break;
	          } catch (Exception e) {
	              if (i==1999) {
	                  Assert.fail(e.getMessage());
	              	}
	          	}		    
			}
		}		
		
		@And("User_608 to verify while modification system enters the invalid data under Customer Identification screen")
		public void user_608_to_verify_while_modification_system_enters_the_invalid_data_under_customer_identification_screen() throws Throwable {
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input")).click();
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(testData.get("ID_Number_SpecialChar"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 to verify system should not allow user to do a modification with invalid data in Customer Identification screen")
		public void user_608_to_verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data_in_customer_identification_screen() throws Throwable {
			for (int i = 0; i<20000; i++) {
	          try {
	        	  WebElement specialCharError = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("specialCharError"));
	  			  String specialChar = specialCharError.getText().trim();
	        	  javascriptHelper.backgroundBorder(specialCharError);
	        	  softAssert.assertTrue(specialCharError.isDisplayed(), "System should display - Only Alphanumeric characters allowed");
	        	  softAssert.assertTrue(specialChar.equalsIgnoreCase("Only Alphanumeric characters are allowed"), "System should display error msg");
	              break;
	          } catch (Exception e) {
	              if (i==19999) {
	                  Assert.fail(e.getMessage());
	              	}
	          	}
			}
		    
		}
		
		@And("User_608 to verify system allow user to modify the Identification details under Customer Identification screen")
		public void user_608_to_verify_system_allow_user_to_modify_the_identification_details_under_customer_identification_screen() throws Throwable {
			for (int i = 0; i <= 2000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDType_Dropdown"))
					.click();
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-radio-group ion-label').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains(testData.get("ID_Type"))) {
							String jspath = "document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.moveToElement(btn).click().build().perform();
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 to verify while modification system allow user to save the record with valid data under Customer Identification screen")
		public void user_608_to_verify_while_modification_system_allow_user_to_save_the_record_with_valid_data_under_customer_identification_screen() throws Throwable {
			javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input")).click();
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("IDNumber_Input"))
					.sendKeys(testData.get("ID_Number"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}
		
		@And("User_608 click the Update button under Customer Identification screen")
		public void user_608_click_the_update_button_under_customer_identification_screen() throws Throwable {
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('form button').length")
							.toString();
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('form button')[" + j + "].getAttribute('ng-reflect-text')";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Update")) {
							String jspath = "document.querySelectorAll('form button')[" + j + "]";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.scrollToElement(btn).build().perform();
							javascriptHelper.JSEClick(btn);
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
				
//		@AT_TW_NEWAPP_IDA_05
		@And("User_608 click the lable on button if the status of record is Active under Customer Identification section")
		public void user_608_click_the_lable_on_button_if_the_status_of_record_is_active_under_customer_identification_section() throws Throwable {
			for (int i = 0; i <= 300; i++) {
				try {
					javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("customerIdentificationBackBtn")));
					break;
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			String listOfRecords = "document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td').length";
			String listOfEyeBtn = "";
			String recordName = "";
			boolean isEyeBtnClicked = false;
			for (int i = 0; i <= 300; i++) {
				try {
					listOfEyeBtn = javascriptHelper.executeScript("return " + listOfRecords).toString();
//					System.out.println("List of add button " + listOfEyeBtn);
					if (!listOfEyeBtn.isBlank() && !listOfEyeBtn.equals("0") && listOfEyeBtn.equals("1")) {
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
//						System.out.println("Screen Name " + recordName);
						if (!(recordName.isBlank())) {
//							System.out.println("Screen Name" + recordName + " is Not null");
							if ((recordName.trim()).equalsIgnoreCase(("Active").trim())) {
//								System.out.println("Inside nested loop");
								javascriptHelper.backgroundColor(
										javascriptHelper
										.executeScriptWithWebElement(
												"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')"));
								javascriptHelper
										.executeScriptWithWebElement(
												"document.querySelector('button[icon=\"pi pi-arrow-left\"]').parentElement.parentElement.parentElement.querySelectorAll('td')[" + j + "].parentElement.querySelector('button')")
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
		
		@And("User_608 to verify the functionality of Activate\\Deactivate button under Customer Identification screen")
		public void user_608_to_verify_the_functionality_of_activate_deactivate_button_under_customer_identification_screen() throws Throwable {
			Thread.sleep(1000);
			for (int i = 0; i <= 100000; i++) {
				try {
					javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("statusToggleBtn")));
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("statusToggleBtn")).click();
					break;
				} catch (Exception e) { 
					if (i == 100000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
		@And("User_608 get the updated record ID under Customer Identification section")
		public void user_608_get_the_updated_record_id_under_customer_identification_section() throws Throwable {			
			for (int i = 0; i <= 10000; i++) {
				try {
					WebElement successMsg = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("alert_SuccessMsg"));
					String text = successMsg.getText();
					System.out.println("Number: "+ text.substring(32, 36));
					identificatioDetailsExcelData.updateTestData(testData.get("DataSet ID"),"Record_ID", text.substring(32, 36));
					break;
				} catch (Exception e) { 
					e.printStackTrace();
					if (i == 10000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 500; i++) {
				try {
					WebElement popup = javascriptHelper.executeScriptWithWebElement(
							identificatioDetailsJsPaths.getElement("alert_closeBtn"));
					javascriptHelper.JSEClick(popup);
		            break;
		        } catch (Exception e) {
		            if (i==499) {
		                 Assert.fail(e.getMessage());
		            }
		        }
			}
		}

		@And("User_608 to verify if Status is Active then click the button system should show Deactivate under Customer Identification section")
		public void user_608_to_verify_if_status_is_active_then_click_the_button_system_should_show_deactivate_under_customer_identification_section() throws Throwable {
//			document.querySelectorAll('ion-title[mode=\"md\"]')[1].parentElement.parentElement.querySelector('tbody tr').lastElementChild
			String length = null;
			for (int i = 0; i < 500; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Customer Identification")) {
							String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('tbody tr').lastElementChild";
							WebElement text = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundBorder(text);
							System.out.println("Get Text: "+text.getText());
							softAssert.assertTrue(text.getText().equalsIgnoreCase("In-active"));
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 click the Search button in Customer Identification section")
		public void user_608_click_the_search_button_in_customer_identification_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 500; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Customer Identification")) {
							String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
							WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
							actions.click(btn).build().perform();
							System.out.println("condition true");
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 search the Record ID in Customer Identification section")
		public void user_608_search_the_record_id_in_customer_identification_section() throws Throwable {
			System.out.println("Record ID:"+testData.get("Record_ID"));
			for (int i = 0; i <= 500; i++) {
				try {
					String jsPath = "document.querySelector('input[mode=\"ios\"]')";
					WebElement inputPath = javascriptHelper.executeScriptWithWebElement(jsPath);
					inputPath.sendKeys(testData.get("Record_ID"));
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
		    
		}
		
		@And("User_608 click the lable on button if the status of record is Deactive under Customer Identification section")
		public void user_608_click_the_lable_on_button_if_the_status_of_record_is_deactive_under_customer_identification_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 5000; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					System.out.println(length);
					if (!length.isBlank() && !length.equals("0")) {
						break;
					}
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();			
						if (titlename.trim().contains("Customer Identification")) {
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\\\"pi pi-pencil\\\"]')";
							WebElement pencilBtn = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundColor(pencilBtn);
							actions.click(pencilBtn).build().perform();
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 change the status Deactive to Active under Customer Identification section")
		public void user_608_change_the_status_deactive_to_active_under_customer_identification_section() throws Throwable {
			for (int i = 0; i <= 10000; i++) {
				try {
					javascriptHelper.backgroundBorder(javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("statusToggleBtn")));
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("statusToggleBtn")).click();
					break;
				} catch (Exception e) { 
					if (i == 10000) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}

		@And("User_608 to verify if Status is Deactive then click the button system should show Active under Customer Identification section")
		public void user_608_to_verify_if_status_is_deactive_then_click_the_button_system_should_show_active_under_customer_identification_section() throws Throwable {
			String length = null;
			for (int i = 0; i < 500; i++) {
				try {
					length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
							.toString();
					if (!length.isBlank() && !length.equals("0") && length.equals("1")) {
						break;
					}
				} catch (Exception e) {
					if (i == 499) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i < 5000; i++) {
				try {
					for (int j = 0; j < Integer.parseInt(length); j++) {
						String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
						String titlename = javascriptHelper.executeScript(title).toString();
						if (titlename.trim().contains("Customer Identification")) {
							String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
							javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(titlePath));
							String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('tbody tr').lastElementChild";
							WebElement text = javascriptHelper.executeScriptWithWebElement(jspath);
							javascriptHelper.backgroundBorder(text);
							System.out.println("Get Text: "+text.getText());
							softAssert.assertTrue(text.getText().equalsIgnoreCase("Active"));
							break;
						}
					}
					break;
				} catch (Exception e) {
					if (i == 4999) {
						Assert.fail(e.getMessage());
					}
				}
			}		    
		}
		
		
//		AT_TW_NEWAPP_IDA_06
		@And("User_608 click the View Summary button in Tawarruq application")
		public void user_608_click_the_view_summary_button_in_tawarruq_application() throws Throwable {
			WebElement btn = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("viewSummaryBtn"));
			for (int i = 0; i <= 150000; i++) {
				try {
					javascriptHelper.backgroundBorder(btn);
					btn.click();
					break;
				} catch (Exception e) {
					if (i == 150000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("User_608 post clicking on View Summary button system should display the workflow of the record")
		public void user_608_post_clicking_on_view_summary_button_system_should_display_the_workflow_of_the_record() throws Throwable {
			WebElement popup = javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("summaryPopup"));
			for (int i = 0; i <= 150000; i++) {
				try {
					javascriptHelper.backgroundBorder(popup);
					softAssert.assertTrue(popup.isDisplayed(), "Display the summary of workflow");
					break;
				} catch (Exception e) {
					if (i == 150000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			for (int i = 0; i <= 1000; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(identificatioDetailsJsPaths.getElement("popupCloseBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		
		
		
		
		
}
