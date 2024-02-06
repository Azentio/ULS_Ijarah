package stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataEntry_EmploymentDetailsSteps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ExcelData employmentDetailsExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData excelDataForEmploymentDetails = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AppDataEntry_EmploymentTestData", "Dataset ID");
	Map<String, String> employmentDetailsExecution = new HashMap<>();
	Map<String, String> employmentDetailsTestData = new HashMap<>();
	JSPaths employmentDetailsJSPaths = new JSPaths(configFileReader.getJSFilePath(), "CustomerEmploymentJSPaths",
			"CustomerEmployments_Elements", "JSPaths");
	JSPaths commonJSElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	int listViewIndex = 0;
	IjaraLogin ijaraLogin = new IjaraLogin();
	@Given("login with valid credentials for auto loan app data entry stage")
	public void login_with_valid_credentials_for_auto_loan_app_data_entry_stage() {
		ijaraLogin.loginWithIjaraApplication("userType02");
	}
	@And("user_076 click on customer financial tab in app data entry of auto loan")
	public void user_076_click_on_customer_financial_tab_in_app_data_entry_of_auto_loan() throws Throwable {
		String customerFinancialsTabQuery = "document.querySelectorAll('ion-segment-button[id=\"seg5\"]').length";
		String tabLength = "";
		int premitiveTabLength = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				tabLength = javascriptHelper.executeScript("return " + customerFinancialsTabQuery).toString();
				if (tabLength.equals("0") && (tabLength.length() > 0)) {
					System.out.println("Tab length " + tabLength);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean isTabClicked = false;
		premitiveTabLength = Integer.parseInt(tabLength);
		for (int i = 0; i < premitiveTabLength; i++) {
			for (int j = 0; j <= 150; j++) {
				try {
					javascriptHelper.executeScriptWithWebElement(
							"document.querySelectorAll('ion-segment-button[id=\"seg5\"]')[" + i + "]").click();
					isTabClicked = true;
					break;
				} catch (Exception e) {
					if (j == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isTabClicked == true) {
				break;
			}

		}

	}

	@And("user_076 click on edit button in customer financial record of auto loan product")
	public void user_076_click_on_edit_button_in_customer_financial_record_of_auto_loan_product() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("customer_personal_info_edit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on add button in employment list which is in customer financials")
	public void user_076_click_on_add_button_in_employment_list_which_is_in_customer_financials() throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isAddButttonClicked = false;
		String labelName = "";
		for (int i = 0; i <= 20; i++) {
			try {
				lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
				if ((lengthOfTheLabel.length() > 0) && !(lengthOfTheLabel.equals("0"))
						&& (lengthOfTheLabel.equals("5"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
		System.out.println("Length of the label " + premitiveLabelLength);

		for (int i = 0; i < premitiveLabelLength; i++) {
			for (int j = 0; j <= 1000; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isEmpty())
							&& (labelName.trim()).equalsIgnoreCase(("Customer Employment List").trim())) {
						if (j > 250) {
							System.out.println("Inside final if condition");
							clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]"));
						}
						System.out.println("Inside final if condition");
						System.out.println("Label Name " + labelName);
						javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-plus\"]')[" + i + "]").click();
						isAddButttonClicked = true;
						break;
					} else {
						isAddButttonClicked = false;
						break;
					}
				} catch (Exception e) {
					if (j == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButttonClicked == true) {
				break;
			}
		}
		if (isAddButttonClicked == false) {
			Assert.fail("Add button is not clicked hence test case failed");
		}
	}

	@Then("user_076 verify employment screen should have the save and back button")
	public void user_076_verify_employment_screen_should_have_the_save_and_back_button() throws Throwable {
		boolean isSaveButtonVisible = false;
		boolean isBackButtonVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isSaveButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("save_button")).isDisplayed();
				isBackButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("back_button")).isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isSaveButtonVisible, "Save Button is not visible hence failed");
		softAssert.assertTrue(isBackButtonVisible, "Back Button is not visible hence failed");

	}

	// user_076 verify employment screen shoul have all the fields at app data entry
	// stage
	@Then("user_076 verify employment screen should have all the fields at app data entry stage")
	public void user_076_verify_employment_screen_should_have_all_the_fields_at_app_data_entry_stage()
			throws Throwable {
		List<String> listOfAllField = new ArrayList<>();

		String getFieldSizeQuery = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String totalNumberOfFields = "";
		int premitiveTotalNumberOfFields = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				totalNumberOfFields = javascriptHelper.executeScript("return " + getFieldSizeQuery).toString();
				if (!(totalNumberOfFields.equals("0")) && totalNumberOfFields.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Total Number of field " + totalNumberOfFields);
		premitiveTotalNumberOfFields = Integer.parseInt(totalNumberOfFields);
		for (int i = 0; i < premitiveTotalNumberOfFields; i++) {
			for (int j = 0; j < 150; j++) {
				try {
					String fieldName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();

					if (fieldName.length() > 0) {
						System.out.println("Field Name " + fieldName);
						listOfAllField.add(fieldName);
						break;
					}
				} catch (Exception e) {
					if (i == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (i == (premitiveTotalNumberOfFields - 1)) {
				break;
			}
		}
		softAssert.assertTrue(listOfAllField.contains("Primary Employment"),
				"Primary employment field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employment Period *"),
				"Employment period field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Nature Of Employment *"),
				"Nature Of Employment field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Company Type"),
				"Company Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Profession"), "Profession field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Profession Type"),
				"Profession Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Statutory Authority"),
				"Statutory Authority field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Name"),
				"Employer Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Name If (Others) *"),
				"Employer Name If (Others) field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employee ID *"),
				"Employee ID field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Date Of Joining *"),
				"Date Of Joining field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Department"), "Department field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Designation"),
				"Designation field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employment Type *"),
				"Employment Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Direct Manager Contact Number Extension"),
				"Direct Manager Contact Number Extension field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Direct Manager Telephone"),
				"Direct Manager Telephone field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Income Paymode"),
				"Income Paymode field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Phone Extension"),
				"Employer Phone Extension field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Phone Number"),
				"Employer Phone Number field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("State"), "State field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("City"), "City field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Pincode"), "Pincode field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Sector"), "Sector field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Industry Sub Sector"),
				"Industry Sub Sector field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("No Of Partners"),
				"No Of Partners field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Registered Business Name"),
				"Registered Business Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Registered Bussiness Number"),
				"Registered Bussiness Number field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Business Registration Date"),
				"Business Registration Date field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Office Premises Type"),
				"Office Premises Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Share Holder Percentage *"),
				"Share Holder Percentage field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("No Of Employees"),
				"No Of Employees field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Total Experience(Years) *"),
				"Total Experience(Years) field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Experience At Current Employment"),
				"Experience At Current Employment field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Direct Manager Name"),
				"Direct Manager Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer City Code"),
				"Employer City Code field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Retirement Age(Years)"),
				"Retirement Age(Years) field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Remarks"), "Remarks field is not available hence failed");

	}

	@Then("user_076 verify primary employment period should be enable at employment details screen")
	public void user_076_verify_primary_employment_period_should_be_enable_at_employment_details_screen()
			throws Throwable {
		String getToggleStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getToggleStatus = javascriptHelper
						.executeScript(
								"return " + employmentDetailsJSPaths.getElement("primary_employment_toggle_status"))
						.toString();
				if (getToggleStatus.length() > 0) {
					System.out.println("Toggle status " + getToggleStatus);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getToggleStatus.contains("true"),
				" Primary employment field is not enabled hence failed");
	}

	@And("user_076 search the app data entry record reference number of auto loan")
	public void user_076_search_the_app_data_entry_record_reference_number_of_auto_loan() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				System.out.println("Record reference Number " + configFileReader.getAutioLoanAppDataEntryRefNo());
				searchTextBox.sendKeys(configFileReader.getAutioLoanAppDataEntryRefNo());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the app data entry record of auto loan")
	public void user_076_select_the_app_data_entry_record_of_auto_loan() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 150; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(configFileReader.getAutioLoanAppDataEntryRefNo())) {
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

	@And("user_076 get the test data for AT_AL_APPDATAENTRY_REFDETAILS_01")
	public void user_076_get_the_test_data_for_AT_AL_APPDATAENTRY_REFDETAILS_01() throws Throwable {
		employmentDetailsExecution = employmentDetailsExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_01");
		System.out.println("Data Set ID " + employmentDetailsExecution.get("dataSet_ID"));
		employmentDetailsTestData = excelDataForEmploymentDetails
				.getTestdata(employmentDetailsExecution.get("dataSet_ID"));
	}

	@And("user_076 get the test data for AT_AL_APPDATAENTRY_REFDETAILS_02")
	public void user_076_get_the_test_data_for_AT_AL_APPDATAENTRY_REFDETAILS_02() throws Throwable {
		employmentDetailsExecution = employmentDetailsExecutionSheet.getTestdata("AT_AL_APPDATAENTRY_REFDETAILS_02");
		System.out.println("Data Set ID " + employmentDetailsExecution.get("dataSet_ID"));
		employmentDetailsTestData = excelDataForEmploymentDetails
				.getTestdata(employmentDetailsExecution.get("dataSet_ID"));

	}

	@And("user_076 choose nature of employment as company firm in employment details screen")
	public void user_076_choose_nature_of_employment_as_company_firm_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("nature_of_employment_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("nature_of_employment_one"));
	}

	@And("user_076 choose nature of employment as Self_employed Professional in employment details screen")
	public void user_076_choose_nature_of_employment_as_self_employed_professional_in_employment_details_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("nature_of_employment_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("nature_of_employment_two"));

	}

	@And("user_076 choose nature of employment as Salaried in employment details screen")
	public void user_076_choose_nature_of_employment_as_salaried_in_employment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("nature_of_employment_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("nature_of_employment_three"));
	}

	@Then("user_076 verify employment details field should be changed as per company firm")
	public void user_076_verify_employment_details_field_should_be_changed_as_per_company_firm() throws Throwable {
		List<String> listOfAllField = new ArrayList<>();

		String getFieldSizeQuery = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String totalNumberOfFields = "";
		int premitiveTotalNumberOfFields = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				totalNumberOfFields = javascriptHelper.executeScript("return " + getFieldSizeQuery).toString();
				if (!(totalNumberOfFields.equals("0")) && totalNumberOfFields.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Total Number of field " + totalNumberOfFields);
		premitiveTotalNumberOfFields = Integer.parseInt(totalNumberOfFields);
		for (int i = 0; i < premitiveTotalNumberOfFields; i++) {
			for (int j = 0; j < 150; j++) {
				try {
					String fieldName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();

					if (fieldName.length() > 0) {
						System.out.println("Field Name " + fieldName);
						listOfAllField.add(fieldName);
						break;
					}
				} catch (Exception e) {
					if (i == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (i == (premitiveTotalNumberOfFields - 1)) {
				break;
			}
		}

		softAssert.assertTrue(listOfAllField.contains("Nature Of Employment *"),
				"When we choose company firm Nature Of Employment field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Company Type"),
				"When we choose company firm Company Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Profession"),
				"When we choose company firm Profession field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Profession Type"),
				"When we choose company firm Profession Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Statutory Authority"),
				"When we choose company firm Statutory Authority field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employment End Date"),
				"When we choose company firm Employment end date field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Phone Extension"),
				"When we choose company firm Employer Phone Extension field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("No Of Partners"),
				"When we choose company firm No Of Partners field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Income Paymode"),
				"When we choose company firm Income Paymode field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Nature OF Business"),
				"When we choose company firm Nature OF Business field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Registered Business Name"),
				"When we choose company firm Registered Business Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Registered Bussiness Number"),
				"When we choose company firm Registered Bussiness Number field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Business Registration Date"),
				"When we choose company firm Business Registration Date field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Office Premises Type"),
				"When we choose company firm Office Premises Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Share Holder Percentage *"),
				"When we choose company firm Share Holder Percentage field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("No Of Employees"),
				"When we choose company firm No Of Employees field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Remarks"),
				"When we choose company firm Remarks field is not available hence failed");

	}

	@Then("user_076 verify employment details field should be changed as per Self_employed Professional")
	public void user_076_verify_employment_details_field_should_be_changed_as_per_self_employed_professional()
			throws Throwable {

		List<String> listOfAllField = new ArrayList<>();

		String getFieldSizeQuery = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String totalNumberOfFields = "";
		int premitiveTotalNumberOfFields = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				totalNumberOfFields = javascriptHelper.executeScript("return " + getFieldSizeQuery).toString();
				if (!(totalNumberOfFields.equals("0")) && totalNumberOfFields.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Total Number of field " + totalNumberOfFields);
		premitiveTotalNumberOfFields = Integer.parseInt(totalNumberOfFields);
		for (int i = 0; i < premitiveTotalNumberOfFields; i++) {
			for (int j = 0; j < 150; j++) {
				try {
					String fieldName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();

					if (fieldName.length() > 0) {
						System.out.println("Field Name " + fieldName);
						listOfAllField.add(fieldName);
						break;
					}
				} catch (Exception e) {
					if (i == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (i == (premitiveTotalNumberOfFields - 1)) {
				break;
			}
		}
		softAssert.assertTrue(listOfAllField.contains("Nature Of Employment *"),
				"When we choose self employed professionals Nature Of Employment field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Company Type"),
				"When we choose self employed professionals Company Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Profession"),
				"When we choose self employed professionals Profession field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Profession Type"),
				"When we choose self employed professionals Profession Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Statutory Authority"),
				"When we choose self employed professionals Statutory Authority field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employment End Date"),
				"When we choose self employed professionals Employment end date field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Phone Extension"),
				"When we choose self employed professionals Employer Phone Extension field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("No Of Partners"),
				"When we choose self employed professionals No Of Partners field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Nature OF Business"),
				"When we choose self employed professionals Nature OF Business field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Designation"),
				"When we choose self employed professionals Designation field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Registered Business Name"),
				"When we choose self employed professionals Registered Business Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Registered Bussiness Number"),
				"When we choose self employed professionals Registered Bussiness Number field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Business Registration Date"),
				"When we choose self employed professionals Business Registration Date field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Office Premises Type"),
				"When we choose self employed professionals Office Premises Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Share Holder Percentage *"),
				"When we choose self employed professionals Share Holder Percentage field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("No Of Employees"),
				"When we choose self employed professionals No Of Employees field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Remarks"),
				"When we choose self employed professionals Remarks field is not available hence failed");
	}

	@Then("user_076 verify employment details field should be changed as per Salaried")
	public void user_076_verify_employment_details_field_should_be_changed_as_per_salaried() throws Throwable {

		List<String> listOfAllField = new ArrayList<>();

		String getFieldSizeQuery = "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length";
		String totalNumberOfFields = "";
		int premitiveTotalNumberOfFields = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				totalNumberOfFields = javascriptHelper.executeScript("return " + getFieldSizeQuery).toString();
				if (!(totalNumberOfFields.equals("0")) && totalNumberOfFields.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Total Number of field " + totalNumberOfFields);
		premitiveTotalNumberOfFields = Integer.parseInt(totalNumberOfFields);
		for (int i = 0; i < premitiveTotalNumberOfFields; i++) {
			for (int j = 0; j < 150; j++) {
				try {
					String fieldName = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i + "].innerText")
							.toString();

					if (fieldName.length() > 0) {
						System.out.println("Field Name " + fieldName);
						listOfAllField.add(fieldName);
						break;
					}
				} catch (Exception e) {
					if (i == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (i == (premitiveTotalNumberOfFields - 1)) {
				break;
			}
		}

		softAssert.assertTrue(listOfAllField.contains("Nature Of Employment *"),
				"When we choose Salaried Nature Of Employment field is not available hence failed");

		softAssert.assertTrue(listOfAllField.contains("Employer Name"),
				"When we choose Salaried Employer Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Name If (Others) *"),
				"When we choose Salaried  Employer Name If (Others) field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employee ID *"),
				"When we choose Salaried  Employee ID field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Date Of Joining *"),
				"When we choose Salaried  Date Of Joining field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employment End Date"),
				"When we choose Salaried Employment end date field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Department"), "Department field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Designation"),
				"When we choose Salaried Designation field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employment Type *"),
				"When we choose Salaried Employment Type field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Direct Manager Contact Number Extension"),
				"When we choose Salaried Direct Manager Contact Number Extension field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Direct Manager Telephone"),
				"When we choose Salaried Direct Manager Telephone field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Income Paymode"),
				"When we choose Salaried Income Paymode field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Phone Extension"),
				"When we choose Salaried Employer Phone Extension field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer Phone Number"),
				"When we choose Salaried Employer Phone Number field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("State"),
				"When we choose Salaried State field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Pincode"),
				"When we choose Salaried Pincode field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Total Experience(Years) *"),
				"When we choose Salaried Total Experience(Years) field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Experience At Current Employment"),
				"When we choose Salaried Experience At Current Employment field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Direct Manager Name"),
				"When we choose Salaried Direct Manager Name field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Employer City Code"),
				"When we choose Salaried Employer City Code field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Retirement Age(Years)"),
				"When we choose Salaried Retirement Age(Years) field is not available hence failed");
		softAssert.assertTrue(listOfAllField.contains("Remarks"),
				"When we choose Salaried Remarks field is not available hence failed");
	}

	@Then("user_076 verify primary employment field should be non mandatory toggle button")
	public void user_076_verify_primary_employment_field_should_be_non_mandatory_toggle_button() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		String isfieldEditable = "";

		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("primary_employment_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("primary_employment_fieldType_validation"))
						.toString();
				isfieldEditable = javascriptHelper
						.executeScript(
								"return " + employmentDetailsJSPaths.getElement("primary_employment_toggle_status"))
						.toString();
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0
						&& isfieldEditable.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"primary employment is not a non mandatory field hence failed");
		softAssert.assertTrue(fieldTypeValidation.contains("switch"),
				"primary employment is not a toggle field hence failed");
		softAssert.assertTrue(isfieldEditable.contains("false"),
				"primary employment is non editable field hence failed");
	}

	@Then("user_076 verify employment period field should be mandatory dropdown")
	public void user_076_verify_employment_period_field_should_be_mandatory_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employment_period_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employment_period_dropdown"))
						.getAttribute("aria-label");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employment_period_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("employment_period"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"employment period is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"employment period is non mandatory field hence failed");

	}

	@Then("user_076 verify nature of employment feld should be mandatory dropdown")
	public void user_076_verify_nature_of_employment_feld_should_be_mandatory_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								employmentDetailsJSPaths.getElement("nature_of_employment_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(
								employmentDetailsJSPaths.getElement("nature_of_employment_dropdown"))
						.getAttribute("aria-label");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("nature_of_employment_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("nature_of_employment"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"),
				"nature of employment is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"nature of employment is non mandatory field hence failed");
	}

	@Then("user_076 verify employer name field should be mandatory dropdown")
	public void user_076_verify_employer_name_field_should_be_mandatory_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_name_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_name_dropdown"))
						.getAttribute("aria-label");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_name_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("employer_name"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "employer name is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"), "employer name is non mandatory field hence failed");
	}

	@Then("user_076 verify employer name if others field should be non mandatory text box")
	public void user_076_verify_employer_name_if_others_field_should_be_non_mandatory_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + employmentDetailsJSPaths.getElement("employer_name_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_name_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_name_input"))
				.click();
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_name_input"))
				.sendKeys(employmentDetailsTestData.get("employer_name_other"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"employer name if other is not a textbox hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"employer name if other is non mandatory field hence failed");
	}

	@Then("user_076 verify employee ID field should be mandatory text box")
	public void user_076_verify_employee_id_field_should_be_mandatory_text_box() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + employmentDetailsJSPaths.getElement("employeeID_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employeeID_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employeeID_input")).click();
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employeeID_input"))
				.sendKeys(employmentDetailsTestData.get("employee_ID"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"employee ID if other is not a textbox hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"employee ID if other is non mandatory field hence failed");
	}

	@Then("user_076 verify Date of joining field should be mandatory date")
	public void user_076_verify_date_of_joining_field_should_be_mandatory_date() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("date_of_joining_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScript(
								"return " + employmentDetailsJSPaths.getElement("date_of_joining_fieldType_validation"))
						.toString();
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		// dd-M-yy
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("date_of_joining_calendar_input")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldTypeValidation.contains("dd-M-yy"), "date of joining is not a date hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"date of joining is non mandatory field hence failed");
	}

	@Then("user_076 verify empoyment end date field should be non mandatory date")
	public void user_076_verify_empoyment_end_date_field_should_be_non_mandatory_date() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("employment_end_date_mandatory_validation"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("employment_end_date_fieldType_validation"))
						.toString();
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		// dd-M-yy
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employment_end_date_input"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldTypeValidation.contains("dd-M-yy"),
				"employment end date is not a date hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"employment end date is mandatory field hence failed");
	}

	@Then("user_076 verify department field should be non mandatory editable dropdown")
	public void user_076_verify_department_field_should_be_non_mandatory_editable_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("department_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("department_dropdown"))
						.getAttribute("aria-label");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("department_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("Department"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "department is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")), "department is mandatory field hence failed");
	}

	@Then("user_076 verify designation field should be non mandatory dropdown")
	public void user_076_verify_designation_field_should_be_non_mandatory_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("designation_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("designation_dropdown"))
						.getAttribute("aria-label");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("designation_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("designation"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "designation is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")), "designation is mandatory field hence failed");
	}

	@Then("user_076 verify employment type field should be mandatory dropdown")
	public void user_076_verify_employment_type_field_should_be_mandatory_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employmentType_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				mandatoryVerification = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employmentType_dropdown"))
						.getAttribute("aria-label");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employmentType_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(employmentDetailsTestData.get("employment_type"));
		softAssert.assertTrue(fieldTypeValidation.contains("Select"), "employment type is not a dropdown hence failed");
		softAssert.assertTrue(mandatoryVerification.contains("*"),
				"employment type is non mandatory field hence failed");
	}

	@Then("user_076 verify direct manager contact extension field should be non mandatory textbox")
	public void user_076_verify_direct_manager_contact_extension_field_should_be_non_mandatory_textbox()
			throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper.executeScript("return " + employmentDetailsJSPaths
						.getElement("direct_manager_contact_extension_mandatory_verification")).toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								employmentDetailsJSPaths.getElement("direct_manager_contact_extension_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(
				employmentDetailsJSPaths.getElement("direct_manager_contact_extension_input")).click();
		javascriptHelper
				.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("direct_manager_contact_extension_input"))
				.sendKeys(employmentDetailsTestData.get("direct_manager_contact_number_extension"));
		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"direct manager contact extension is not a textbox hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"direct manager contact extension is mandatory field hence failed");
	}

	@Then("user_076 verify direct manager contact no field should be non mandatory textbox")
	public void user_076_verify_direct_manager_contact_no_field_should_be_non_mandatory_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper.executeScript("return "
						+ employmentDetailsJSPaths.getElement("direct_manager_contact_number_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								employmentDetailsJSPaths.getElement("direct_manager_contact_number_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("direct_manager_contact_number_input"))
				.click();
		javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("direct_manager_contact_number_input"))
				.sendKeys(employmentDetailsTestData.get("direct_manager_contact_number"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"direct manager contact number is not a textbox hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"direct manager contact number is mandatory field hence failed");
	}

	@Then("user_076 verify employer phone extension field should be non mandatory textbox")
	public void user_076_verify_employer_phone_extension_field_should_be_non_mandatory_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {// employer_phone_extension_mandatory_verification
				mandatoryVerification = javascriptHelper.executeScript("return "
						+ employmentDetailsJSPaths.getElement("employer_phone_extension_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								employmentDetailsJSPaths.getElement("employer_phone_extension_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_phone_extension_input"))
				.click();
		javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_phone_extension_input"))
				.sendKeys(employmentDetailsTestData.get("employer_phone_extension"));
		softAssert.assertTrue(fieldTypeValidation.contains("number"),
				"employer phone extension is not a textbox hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"employer phone extension is mandatory field hence failed");
	}

	@Then("user_076 verify direct manager name field should be non mandatory textbox")
	public void user_076_verify_direct_manager_name_field_should_be_non_mandatory_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {// employer_phone_extension_mandatory_verification
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("direct_manager_name_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("direct_manager_name_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("direct_manager_name_input")));
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("direct_manager_name_input"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("direct_manager_name_input"))
				.sendKeys(employmentDetailsTestData.get("direct_manager_name"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"direct manager name is not a textbox hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"direct manager name is mandatory field hence failed");
	}

	@Then("user_076 verify employer phone number field should be non mandatory textbox")
	public void user_076_verify_employer_phone_number_field_should_be_non_mandatory_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {// employer_phone_extension_mandatory_verification
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("employer_phone_number_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_phone_number_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_phone_number_input"))
				.click();
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_phone_number_input"))
				.sendKeys(employmentDetailsTestData.get("employer_phone_number"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"employer phone number is not a textbox hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"employer phone number is mandatory field hence failed");
	}

	@Then("user_076 verify employer city code field should be non mandatory textbox")
	public void user_076_verify_employer_city_code_field_should_be_non_mandatory_textbox() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {// employer_phone_extension_mandatory_verification
				mandatoryVerification = javascriptHelper.executeScript("return "
						+ employmentDetailsJSPaths.getElement("employer_phone_city_code_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(
								employmentDetailsJSPaths.getElement("employer_phone_city_code_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("employer_phone_city_code_input")));
				javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("employer_phone_city_code_input")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		javascriptHelper
				.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("employer_phone_city_code_input"))
				.sendKeys(employmentDetailsTestData.get("employer_city_code"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"), "employer city code is not a textbox hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"employer city code is mandatory field hence failed");
	}

	@Then("user_076 verify emplyer phone extension field should be non mandatory textbox")
	public void user_076_verify_emplyer_phone_extension_field_should_be_non_mandatory_textbox() throws Throwable {

	}

	@Then("user_076 verify total experience years field should be non mandatory dropdown")
	public void user_076_verify_total_experience_years_field_should_be_non_mandatory_dropdown() throws Throwable {
		String mandatoryVerification = "";
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript("return "
								+ employmentDetailsJSPaths.getElement("total_experience_mandatory_verification"))
						.toString();
				fieldTypeValidation = javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("total_experience_input"))
						.getAttribute("type");
				if (mandatoryVerification.length() > 0 && fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("total_experience_input")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("total_experience_input"))
				.sendKeys(employmentDetailsTestData.get("total_experience_years"));
		softAssert.assertTrue(fieldTypeValidation.contains("text"),
				"total experience years is not a dropdown hence failed");
		softAssert.assertTrue(!(mandatoryVerification.contains("*")),
				"total experience years is mandatory field hence failed");
	}

	@Then("user_076 verify remarks field should be non mandatory textbox")
	public void user_076_verify_remarks_field_should_be_non_mandatory_textbox() throws Throwable {
		String mandatoryVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryVerification = javascriptHelper
						.executeScript(
								"return " + employmentDetailsJSPaths.getElement("remarks_mandatory_verification"))
						.toString();
				if (mandatoryVerification.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("remarks_input")));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("remarks_input")).click();
		javascriptHelper.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("remarks_input"))
				.sendKeys(employmentDetailsTestData.get("remarks"));
		softAssert.assertTrue(!(mandatoryVerification.contains("*")), "remarks is a mandatory field hence failed");
	}

	@And("user_076 click on save button in customer financials record at app data entry stage")
	public void user_076_click_on_save_button_in_customer_financials_record_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement((commonJSElements.getElement("save_button"))));
				javascriptHelper.executeScriptWithWebElement((commonJSElements.getElement("save_button"))).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("user_076 verify customer financials record got saved at app data entry stage")
	public void user_076_verify_customer_financials_record_got_saved_at_app_data_entry_stage() throws Throwable {
		String saveButtonValidationMsg = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveButtonValidationMsg = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (saveButtonValidationMsg.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Save button validation message " + saveButtonValidationMsg);
		Assert.assertTrue(saveButtonValidationMsg.contains("Success"), "Record is not got saved hence failed");
	}

	@And("user_076 get the customer employment list view at app data entry stage")
	public void user_076_get_the_customer_employment_list_view_at_app_data_entry_stage() throws Throwable {
		String labelLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTheLabel = "";
		boolean isIndexFound = false;
		String labelName = "";
		for (int i = 0; i <= 20; i++) {
			try {
				lengthOfTheLabel = javascriptHelper.executeScript("return " + labelLength).toString();
				if ((lengthOfTheLabel.length() > 0) && !(lengthOfTheLabel.equals("0"))
						&& (lengthOfTheLabel.equals("5"))) {
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveLabelLength = Integer.parseInt(lengthOfTheLabel);
		System.out.println("Length of the label " + premitiveLabelLength);

		for (int i = 0; i < premitiveLabelLength; i++) {
			for (int j = 0; j <= 1000; j++) {
				try {
					labelName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]')["
									+ i + "].innerText")
							.toString();
					System.out.println("label Name is " + labelName);
					if (!(labelName.isEmpty())
							&& (labelName.trim()).equalsIgnoreCase(("Customer Employment List").trim())) {
						listViewIndex = i;
						isIndexFound = true;
						break;
					} else {
						isIndexFound = false;
						break;
					}
				} catch (Exception e) {
					if (j == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isIndexFound == true) {
				break;
			}
		}
		if (isIndexFound == false)

		{
			Assert.fail("Index is not found hence failed");
		}

	}

	@And("user_076 filter the active record in customer employment list view")
	public void user_076_filter_the_active_record_in_customer_employment_list_view() throws Throwable {
		String asecendingOrderQuery = "document.querySelectorAll('kub-prime-table')[" + listViewIndex
				+ "].querySelector('th[ng-reflect-field=\"recStatus\"]')";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(asecendingOrderQuery));
				javascriptHelper.executeScriptWithWebElement(asecendingOrderQuery).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 click on edit button in customer employment list view")
	public void user_076_click_on_edit_button_in_customer_employment_list_view() throws Throwable {
		String editButtonQuery = "document.querySelectorAll('kub-prime-table')[" + listViewIndex
				+ "].querySelector('button[ng-reflect-text=\"Edit\"]')";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(editButtonQuery));
				javascriptHelper.executeScriptWithWebElement(editButtonQuery).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 change the record status to inactive of customer employment list view")
	public void user_076_change_the_record_status_to_inactive_of_customer_employment_list_view() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(
						employmentDetailsJSPaths.getElement("record_status_toggle_button")));
				javascriptHelper
						.executeScriptWithWebElement(employmentDetailsJSPaths.getElement("record_status_toggle_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("logout from the ULS Application")
	public void logout_from_the_ULS_application() throws Throwable {
		ijaraLogin.logoutFromIjara();
	}
	@And("user_076 invoke soft assert in employment details screen")
	public void user_076_invoke_soft_assert_in_employment_details_screen() throws Throwable {
		softAssert.assertAll();
	}
}
