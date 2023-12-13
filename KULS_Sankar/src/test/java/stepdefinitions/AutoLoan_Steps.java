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

public class AutoLoan_Steps {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths customerDebtJsPaths = new JSPaths(excelPath, "CF_Debt_Elements", "CF_Debt FieldName", "JSPath");
	JSPaths appDataAppDetailsJsPaths = new JSPaths(excelPath, "ApplicationDetails_Elements", "ApplicationDetails_FieldName", "JSPath");	
	
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
	
	ExcelData AppDataEntryApplicationDetails = new ExcelData(excelTestDataPath,"AL_AppData_AppDetails","DataSet ID");	
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	
//	Auto Loan -- App Data Entry Stage  -- Customer Details screen 
	@And("^User_608 get the test data for test case AT_AL_APP_01$")
    public void get_the_test_data_for_test_case_AT_AL_APP_01() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_01");
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_02$")
    public void get_the_test_data_for_test_case_AT_AL_APP_02() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_02");
    }
	
	@And("^User_608 get the test data for test case AT_AL_APP_03$")
    public void get_the_test_data_for_test_case_AT_AL_APP_03() throws Throwable {
		testData = AppDataEntryApplicationDetails.getTestdata("DS_AT_AL_APP_03");
    }
	
	
	
	
	
	
	
	
	
	
	
	@And("User_608 search the Reference ID for Auto Loan")
	public void user_search_the_reference_id_for_auto_loan() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDebtJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));
				;
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
//	AT_AL_APP_01
	@And("User_608 select the Customer Type under Application Details screen")
	public void user_608_select_the_customer_type_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerType"))
						.click();
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
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
							.toString();
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
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Customer_Type")).trim())) {
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

	@And("User_608 Enter the Customer Name under Application Details screen")
	public void user_608_enter_the_customer_name_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 5000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("customerName"))
						.sendKeys(testData.get("Customer_Name"));
				break;
			} catch (Exception e) {
				if (i == 5000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the ID Type under Application Details screen")
	public void user_608_select_the_id_type_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("idType"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ID_Type"))) {
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

	@And("User_608 Enter the ID Number under Application Details screen")
	public void user_608_enter_the_id_number_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("idNumber"))
						.sendKeys(testData.get("ID_Number"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	@And("User_608 Enter the Date of Birth under Application Details screen")
	public void user_608_enter_the_date_of_birth_under_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("dob"))
						.sendKeys(testData.get("DOB"));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("higlightedDate")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 click the Search button under Application Details screen")
	public void user_608_click_the_search_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 500; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button').length")
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
					String title = "return document.querySelectorAll('button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Search")) {
						System.out.println("condition true");
						String jspath = "document.querySelectorAll('button')[" + j + "]";
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
	}

	@And("User_608 click the Create New Request button under Application Details screen")
	public void user_608_click_the_create_new_request_button_under_application_details_screen() throws Throwable {
		String length = null;
		for (int i = 0; i < 5000; i++) {
			try {
				length = javascriptHelper.executeScript("return document.querySelectorAll('button').length")
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
					String title = "return document.querySelectorAll('button')[" + j + "].innerText";
					String titlename = javascriptHelper.executeScript(title).toString();
					System.out.println(titlename);
					if (titlename.trim().contains("Create New Request")) {
						String jspath = "document.querySelectorAll('button')[" + j + "]";
						WebElement reqBtn = javascriptHelper.executeScriptWithWebElement(jspath);
						javascriptHelper.scrollIntoView(reqBtn);
						javascriptHelper.JSEClick(reqBtn);
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
	
	@And("User_608 verify the Save button available under Application details screen")
	public void user_608_verify_the_save_button_available_under_application_details_screen() throws Throwable {
		Thread.sleep(1000);
		WebElement AppDetailsBackBtn = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("updateBtn"));
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.backgroundBorder(AppDetailsBackBtn);
				actions.moveToElement(AppDetailsBackBtn).perform();
				Assert.assertTrue(AppDetailsBackBtn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 20000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 verify the Reference Entity field available in Referral\\Sourcing Details section under Application Details tab")
	public void user_608_verify_the_reference_entity_field_available_in_referral_sourcing_details_section_under_application_details_tab()
			throws Throwable {
		WebElement referenceTypeLabel = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceEntityLabel"));
		WebElement referenceTypeDropdown = javascriptHelper
				.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("referenceEntityDropdown"));
		System.out.println("Field Name: " + referenceTypeLabel.getText());
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundColor(referenceTypeLabel);
				Assert.assertTrue(referenceTypeLabel.isDisplayed());
				javascriptHelper.backgroundBorder(referenceTypeDropdown);
				Assert.assertTrue(referenceTypeDropdown.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
//	AT_AL_APP_02
	@And("User_608 select the Product in Application details screen")
	public void user_608_select_the_product_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 20000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationDropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 20000) {
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Product"))) {
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

	@And("User_608 select the Sub-Product in Application details screen")
	public void user_608_select_the_sub_product_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sub_Product"))) {
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

	@And("User_608 enter the Total Finance Amount Requested in Application details screen")
	public void user_608_enter_the_total_finance_amount_requested_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"))
						.sendKeys(testData.get("Finance_Amt"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 enter the Declared Net Monthly Income in Application details screen")
	public void user_608_enter_the_declared_net_monthly_income_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"))
						.sendKeys(testData.get("Monthly_Income"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 select the Sourcing Channel in Application details screen")
	public void user_608_select_the_sourcing_channel_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingChannelDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Channel"))) {
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

	@And("User_608 select the Business Center Code in Application details screen")
	public void user_608_select_the_business_center_code_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("businessCenterCodeDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Business_Code"))) {
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

	@And("User_608 select the Servicing Type in Application details screen")
	public void user_608_select_the_servicing_type_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingTypeDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Servicing_Type"))) {
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

	@And("User_608 select the Region in Application details screen")
	public void user_608_select_the_region_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("regionDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Region"))) {
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

	@And("User_608 select the Servicing Branch in Application details screen")
	public void user_608_select_the_servicing_branch_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("servicingBranchDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Servicing_Branch"))) {
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

	@And("User_608 select the Closing Staff or Servicing Staff or RM in Application details screen")
	public void user_608_select_the_closing_staff_or_servicing_staff_or_rm_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown")));
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("closingStaffDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Closing_Staff"))) {
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
	
	@And("User_608 select the Sourcing Type under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_type_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingTypeDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Type"))) {
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

	@And("User_608 select the Sourcing Office under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_office_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingOfficeDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Office"))) {
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

	@And("User_608 select the Sourcing Entity under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_entity_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingEntityDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Entity"))) {
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

	@And("User_608 select the Sourcing Staff under Referral\\Sourcing Details section in Application Details screen")
	public void user_608_select_the_sourcing_staff_under_referral_sourcing_details_section_in_application_details_screen() throws Throwable {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("sourcingStaffDropdown"))
						.click();
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
			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Sourcing_Staff"))) {
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
	
	@And("User_608 post entering all valid details, clicking on save button in Application Details screen")
	public void user_608_post_entering_all_valid_details_clicking_on_save_button_in_application_details_screen() throws Throwable {
		WebElement saveBtn = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("saveBtn"));
		for (int i = 0; i <= 150000; i++) {
			try {
				actions.moveToElement(saveBtn).build().perform();
				saveBtn.click();
				break;
			} catch (Exception e) {
				if (i == 150000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User_608 invoke soft assert in Application details screen at Auto Loan App Data Entry stage")
	public void user_608_invoke_soft_assert_in_application_details_screen_at_auto_loan_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
	
	
//	AT_AL_APP_03
	@And("User_608 verify Classification field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_classification_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationLabel")).getText();
		for (int i = 0; i <20000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationLabel")));
        	  softAssert.assertTrue(label.contains("*"), "Product field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==19999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Editable
		WebElement classification = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classification"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Product field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("classificationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Product field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Product field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_product_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productLabel")));
              softAssert.assertTrue(label.contains("*"), "Sub-Product field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("product"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sub-Product field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("productDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sub-Product field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Total Finance Amount Requested field as Mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_total_finance_amount_requested_field_as_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtLabel")).getText();
		for (int i = 0; i <20000; i++) {
          try {
        	  javascriptHelper.backgroundColor(
        			  javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtLabel")));
        	  softAssert.assertTrue(label.contains("*"), "Total Finance Amount field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==19999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}	
		
//		Verify field as Editable
		WebElement classification = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmt"));
		String read = classification.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Total Finance Amount field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		WebElement totalFinanceAmtInput = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("totalFinanceAmtInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(totalFinanceAmtInput);
				softAssert.assertTrue(totalFinanceAmtInput.getAttribute("inputmode").contains("decimal"),
						"Total Finance Amount field should Accept Numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Declared Net Monthly Income field as Mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_declared_net_monthly_income_field_as_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(
        			  javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeLabel")));
        	  softAssert.assertTrue(label.contains("*"), "Monthly Income field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Editable
		WebElement declaredMonthlyIncome = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredMonthlyIncome"));
		String read = declaredMonthlyIncome.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Monthly Income field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		WebElement declaredMonthlyIncomeInput = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredMonthlyIncomeInput"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredMonthlyIncomeInput);
				softAssert.assertTrue(declaredMonthlyIncomeInput.getAttribute("inputmode").contains("decimal"),
						"Monthly Income field should Accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Declared Current Obligations field as Non-mandatory, Editable and accept only numeric values in Application details screen")
	public void user_608_verify_declared_current_obligations_field_as_non_mandatory_editable_and_accept_only_numeric_values_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsLabel")));
        	  softAssert.assertTrue(!(label.contains("*")), "Declared Current Obligations field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		}
		
//		Verify field as Editable
		WebElement declaredCurrentObligationsInput = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("declaredCurrentObligationsInput"));
		String read = declaredCurrentObligationsInput.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"), "Declared Current Obligations should Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Numeric
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(declaredCurrentObligationsInput);
				softAssert.assertTrue(declaredCurrentObligationsInput.getAttribute("mode").contains("decimal"),
						"Declared Current Obligations field accept numeric values only");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Special Promotion field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_special_promotion_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(
        			  javascriptHelper.executeScriptWithWebElement(appDataAppDetailsJsPaths.getElement("specialPromotionLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Special Promotion field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("specialPromotion"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Special Promotion field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("specialPromotionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Special Promotion field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Sourcing Channel field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_sourcing_channel_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingChannelLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("sourcingChannelLabel")));
              softAssert.assertTrue(label.contains("*"), "Sourcing Channel field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingChannel"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Sourcing Channel field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("sourcingChannelDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Sourcing Channel field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Business Center Code field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_business_center_code_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("businessCenterCodeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("businessCenterCodeLabel")));
              softAssert.assertTrue(label.contains("*"), "Business Center Code field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("businessCenterCode"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Business Center Code field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("businessCenterCodeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Business Center Code field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Servicing Type field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_servicing_type_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingTypeLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("servicingTypeLabel")));
              softAssert.assertTrue(label.contains("*"), "Servicing Type field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingType"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Servicing Type field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingTypeDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Servicing Type field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Region field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_region_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("regionLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("regionLabel")));
              softAssert.assertTrue(label.contains("*"), "Region field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("region"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Region field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("regionDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Region field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Servicing Branch field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_servicing_branch_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingBranchLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("servicingBranchLabel")));
              softAssert.assertTrue(label.contains("*"), "Servicing Branch field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingBranch"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Servicing Branch field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("servicingBranchDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Servicing Branch field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}

	@And("User_608 verify Spoke Location field as Non-mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_spoke_location_field_as_non_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Non-mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("spokeLocationLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("spokeLocationLabel")));
              softAssert.assertTrue(!(label.contains("*")), "Spoke Location field should Non-mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("spokeLocation"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Spoke Location field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("spokeLocationDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Spoke Location field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@And("User_608 verify Closing Staff or Servicing Staff or RM field as Mandatory, Editable and Dropdown in Application details screen")
	public void user_608_verify_closing_staff_or_servicing_staff_or_rm_field_as_mandatory_editable_and_dropdown_in_application_details_screen() throws Throwable {
//		Verify field as Mandatory
		String label = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("closingStaffLabel")).getText();
		for (int i = 0; i <2000; i++) {
          try {
        	  javascriptHelper.backgroundColor(javascriptHelper.executeScriptWithWebElement(
        			  appDataAppDetailsJsPaths.getElement("closingStaffLabel")));
              softAssert.assertTrue(label.contains("*"), "Closing Staff field should Mandatory");
              break;
          } catch (Exception e) {
              if (i==1999) {
                  Assert.fail(e.getMessage());
              	}
          	}
		} 
		
//		Verify field as Editable
		WebElement product = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("closingStaff"));
		String read = product.getAttribute("ng-reflect-readonly");
		for (int i = 0; i <= 2000; i++) {
			try {
				softAssert.assertTrue(read.contains("false"),"Closing Staff field should be Editable");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
//		Verify field as Dropdown
		WebElement dropdown = javascriptHelper.executeScriptWithWebElement(
				appDataAppDetailsJsPaths.getElement("closingStaffDropdown"));
		for (int i = 0; i <= 2000; i++) {
			try {	
				actions.moveToElement(dropdown).build().perform();
				javascriptHelper.backgroundBorder(dropdown);
				softAssert.assertTrue(dropdown.getAttribute("ng-reflect-placeholder").contains("Select"),
						"Closing Staff field should be Dropdown");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}	    
	}
	
	
	
	
	
	
	
	
	

	
	
}
