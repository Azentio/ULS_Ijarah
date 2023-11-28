package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
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

public class TawaraqCommodityPurchaseMakerCustomerDetails {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");	
	JSPaths dataCheck_IncomeJsPaths = new JSPaths(excelPath, "DataCheckIncome_Elements", "DataCheckIncome_FieldName", "JSPath");
	JSPaths dataCheck_ApplicationDetailsJsPaths = new JSPaths(excelPath, "TWCommodityPurchaseAppDetails", "DataCheckAppDetails_FieldName", "JSPath");
	JSPaths offering_OfferDetailsJsPaths = new JSPaths(excelPath, "OfferingOfferDetails_Elements", "Offering_OfferDetails_FieldName", "JSPath");
	JSPaths appDataCustomerDetailsJsPaths = new JSPaths(excelPath, "TWCommodityPurchaseCustoDetails", "AppData_CustomerDetails_FieldName", "JSPath");
	
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
	
	ExcelData TWCommodityPurchaseCustoDetailsExcelData  = new ExcelData(excelTestDataPath,"TWCommodityPurchaseCustoDetails","DataSet ID");
	Map<String, String> testData;
	
	@And("^User_604 get the test data for test case AT_TW_CSM_11$")
    public void get_the_test_data_for_test_case_AT_TW_CSM_11() throws Throwable {
		testData = TWCommodityPurchaseCustoDetailsExcelData.getTestdata("DS_AT_TW_CSM_11");
    }

	@And("User_604 click the Customer Details tab")
	public void user_click_the_customer_details_tab() throws Throwable {
		Thread.sleep(100);
		WebElement customerDetailsTab = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsTab"));
		for (int i = 0; i <= 2500; i++) {
			try {
				javascriptHelper.backgroundBorder(customerDetailsTab);
				javascriptHelper.JSEClick(customerDetailsTab);
				break;
			} catch (Exception e) {
				if (i == 2500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 click the View button under Customer Details tab")
	public void user_click_the_add_button_under_customer_details_tab() throws Throwable {
		Thread.sleep(100);
		WebElement customerDetailsAddBtn = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsViewBtn"));		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundBorder(customerDetailsAddBtn);
				javascriptHelper.JSEClick(customerDetailsAddBtn);				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_604 click the Pencil icon button under Customer Details tab")
	public void user_click_the_pencil_icon_under_customer_details_tab() throws Throwable {
		Thread.sleep(1000);
		WebElement customerDetailsPencilBtn = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsPencilBtn"));		
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.backgroundColor(customerDetailsPencilBtn);
				javascriptHelper.JSEClick(customerDetailsPencilBtn);				
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Back button is available under Customer Information screen")
	public void user_verify_back_button_is_available_under_customer_information_screen() throws Throwable {
		Thread.sleep(100);
		WebElement customerDetailsBackBtn = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsBackBtn"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(customerDetailsBackBtn);
				customerDetailsBackBtn.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Save button is available under Customer Information screen")
	public void user_verify_save_button_is_available_under_customer_information_screen() throws Throwable {
		WebElement customerDetailsSaveBtn = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerDetailsSaveBtn"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundBorder(customerDetailsSaveBtn);
				customerDetailsSaveBtn.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}		
	}
	
	
	@And("User_604 verify Applicant Type field available under Customer Information screen")
	public void user_verify_applicant_type_field_available_under_customer_information_screen() throws Throwable {
		WebElement applicantTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("applicantTypeLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(applicantTypeLabel);
				applicantTypeLabel.isDisplayed();
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
				applicantTypeDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_604 verify Customer Type field available under Customer Information screen")
	public void user_verify_customer_type_field_available_under_customer_information_screen() throws Throwable {
		WebElement customerTypeLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("customerTypeLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(customerTypeLabel);
				customerTypeLabel.isDisplayed();
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
				customerTypeDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Title field available under Customer Information screen")
	public void user_verify_title_field_available_under_customer_information_screen() throws Throwable {
		WebElement titleLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("titleLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(titleLabel);
				titleLabel.isDisplayed();
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
				titleDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify First Name field available under Customer Information screen")
	public void user_verify_first_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement firstNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(firstNameLabel);
				firstNameLabel.isDisplayed();
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
				firstNameInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Middle Name field available under Customer Information screen")
	public void user_verify_middle_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement middleNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(middleNameLabel);
				middleNameLabel.isDisplayed();
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
				middleNameInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Last Name field available under Customer Information screen")
	public void user_verify_last_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement lastNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(lastNameLabel);
				lastNameLabel.isDisplayed();
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
				lastNameInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Family Name	field available under Customer Information screen")
	public void user_verify_family_name_field_available_under_customer_information_screen() throws Throwable {
		WebElement familyNameLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(familyNameLabel);
				familyNameLabel.isDisplayed();
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
				familyNameInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify First Name\\(Arabic) field available under Customer Information screen")
	public void user_verify_first_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement firstNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("firstNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(firstNameArabicLabel);
				firstNameArabicLabel.isDisplayed();
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
				firstNameArabicInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Middle Name\\(Arabic) field available under Customer Information screen")
	public void user_verify_middle_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement middleNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("middleNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(middleNameArabicLabel);
				middleNameArabicLabel.isDisplayed();
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
				middleNameArabicInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Last Name\\(Arabic) field available under Customer Information screen")
	public void user_verify_last_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement lastNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("lastNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(lastNameArabicLabel);
				lastNameArabicLabel.isDisplayed();
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
				lastNameArabicInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Family Name\\(Arabic)	field available under Customer Information screen")
	public void user_verify_family_name_arabic_field_available_under_customer_information_screen() throws Throwable {
		WebElement familyNameArabicLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("familyNameArabicLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(familyNameArabicLabel);
				familyNameArabicLabel.isDisplayed();
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
				familyNameArabicInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Date of Birth field available under Customer Information screen")
	public void user_verify_date_of_birth_field_available_under_customer_information_screen() throws Throwable {
		WebElement dobLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(dobLabel);
				dobLabel.isDisplayed();
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
				dobInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Age field available under Customer Information screen")
	public void user_verify_age_field_available_under_customer_information_screen() throws Throwable {
		WebElement ageLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("ageLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(ageLabel);
				ageLabel.isDisplayed();
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
				ageInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Gender field available under Customer Information screen")
	public void user_verify_gender_field_available_under_customer_information_screen() throws Throwable {
		WebElement dobLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("dobLabel"));
		WebElement genderLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("genderLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.scrollIntoView(dobLabel);
				javascriptHelper.backgroundColor(genderLabel);
				genderLabel.isDisplayed();
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
				genderDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Marital Status field available under Customer Information screen")
	public void user_verify_marital_status_field_available_under_customer_information_screen() throws Throwable {
		WebElement maritalStatusLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("maritalStatusLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(maritalStatusLabel);
				maritalStatusLabel.isDisplayed();
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
				maritalStatusDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Education Level field available under Customer Information screen")
	public void user_verify_education_level_field_available_under_customer_information_screen() throws Throwable {
		WebElement educationLevelLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("educationLevelLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(educationLevelLabel);
				educationLevelLabel.isDisplayed();
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
				educationLevelDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Nationality field available under Customer Information screen")
	public void user_verify_nationality_field_available_under_customer_information_screen() throws Throwable {
		WebElement nationalityLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("nationalityLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(nationalityLabel);
				nationalityLabel.isDisplayed();
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
				nationalityDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Residential Status field available under Customer Information screen")
	public void user_verify_residential_status_field_available_under_customer_information_screen() throws Throwable {
		WebElement residentialStatusLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("residentialStatusLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(residentialStatusLabel);
				residentialStatusLabel.isDisplayed();
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
				residentialStatusDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Language field available under Customer Information screen")
	public void user_verify_language_field_available_under_customer_information_screen() throws Throwable {
		WebElement languageLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("languageLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(languageLabel);
				languageLabel.isDisplayed();
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
				languageDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify No of Dependents field available under Customer Information screen")
	public void user_verify_no_of_dependents_field_available_under_customer_information_screen() throws Throwable {
		WebElement noOfDependsLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("noOfDependsLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(noOfDependsLabel);
				noOfDependsLabel.isDisplayed();
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
				noOfDependsInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Client Category field available under Customer Information screen")
	public void user_verify_client_category_field_available_under_customer_information_screen() throws Throwable {
		WebElement clientCategoryLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("clientCategoryLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(clientCategoryLabel);
				clientCategoryLabel.isDisplayed();
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
				clientCategoryDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Blocklisted field available under Customer Information screen")
	public void user_verify_blocklisted_field_available_under_customer_information_screen() throws Throwable {
		WebElement blocklistLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("blocklistLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(blocklistLabel);
				blocklistLabel.isDisplayed();
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
				blocklistToggle.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Credit Bureau field available under Customer Information screen")
	public void user_verify_credit_bureau_field_available_under_customer_information_screen() throws Throwable {
		WebElement creditBureauLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("creditBureauLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(creditBureauLabel);
				creditBureauLabel.isDisplayed();
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
				creditBureauDropdown.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_604 verify Remarks field available under Customer Information screen")
	public void user_verify_remarks_field_available_under_customer_information_screen() throws Throwable {
		WebElement remarksLabel = javascriptHelper.executeScriptWithWebElement(appDataCustomerDetailsJsPaths.getElement("remarksLabel"));
		for (int i = 0; i <= 1500; i++) {
			try {
				javascriptHelper.backgroundColor(remarksLabel);
				remarksLabel.isDisplayed();
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
				remarksInput.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
}
