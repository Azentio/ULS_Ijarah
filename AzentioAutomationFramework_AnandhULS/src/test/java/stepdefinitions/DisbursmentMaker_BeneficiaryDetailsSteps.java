package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class DisbursmentMaker_BeneficiaryDetailsSteps extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijarahLogin = new IjaraLogin();
	String excelFilePathForJS = configFileReader.getJSFilePath();
	JSPaths commonJSElements = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths beneficiaryDetailsWebElements = new JSPaths(configFileReader.getJSFilePath(), "BeneficiaryDetails_JSPaths",
			"BeneficiaryDetails_FieldName", "JSPaths");
	ExcelData beneficiaryDetailsExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DBMRBeneficiaryDetails_TestData", "Dataset ID");
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");

	Map<String, String> beneficiaryDetailsTestData = new HashMap<>();
	Map<String, String> autoLoanExecutionData = new HashMap<>();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	@Given("^navigate to ULS URL$")
	public void navigate_to_uls_url() throws Throwable {
		driver.get(configFileReader.getIjaraApplicationURL());
	}

	@And("^user_076 login with valid disbursment maker user id for auto loan product$")
	public void user_076_login_with_valid_disbursment_maker_user_id_for_auto_loan_product() throws Throwable {
		ijarahLogin.loginWithIjaraApplication("userType14");
	}

	@And("^user_076 login with valid disbursment checker user id for auto loan product$")
	public void user_076_login_with_valid_disbursment_checker_user_id_for_auto_loan_product() throws Throwable {
		ijarahLogin.loginWithIjaraApplication("userType16");
	}

	@And("^user_076 search the auto loan disbursment maker record reference number at mail box$")
	public void user_076_search_the_auto_loan_disbursment_maker_record_reference_number_at_mail_box() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getAutoloanDisMkrRecordNo());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 select the auto loan disbursment maker record in mail box$")
	public void user_076_select_the_auto_loan_disbursment_maker_record_in_mail_box() throws Throwable {
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
					if (recordRefNumber.equals(configFileReader.getAutoloanDisMkrRecordNo())) {
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

	@And("^user_76 click on beneficiary details tab at disbursment maker stage$")
	public void user_76_click_on_beneficiary_details_tab_at_disbursment_maker_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("Beneficiary_tab"))
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

	@And("^user_76 click on add button in beneficiary details disbursment maker stage$")
	public void user_76_click_on_add_button_in_beneficiary_details_disbursment_maker_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_details_add_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 get the test data for test case ID AT_AL_BD_DMC_01_02$")
	public void user_076_get_the_test_data_for_test_case_id_AT_AL_BD_DMC_01_02() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_BD_DMC_01_02");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		beneficiaryDetailsTestData = beneficiaryDetailsExcelTestData
				.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_AL_BD_DMC_03$")
	public void user_076_get_the_test_data_for_test_case_id_AT_AL_BD_DMC_03() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_BD_DMC_03");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		beneficiaryDetailsTestData = beneficiaryDetailsExcelTestData
				.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_AL_BD_DMC_04$")
	public void user_076_get_the_test_data_for_test_case_id_AT_AL_BD_DMC_04() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_BD_DMC_04");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		beneficiaryDetailsTestData = beneficiaryDetailsExcelTestData
				.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 save button and back button isvisible in beneficiary details at disbursment maker stage$")
	public void user_076_save_button_and_back_button_isvisible_in_beneficiary_details_at_disbursment_maker_stage()
			throws Throwable {
	boolean isSaveButtonVisible=false;
	boolean isBackButtonVisible=false;
	for (int i = 0; i <=150; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("")).isDisplayed();
			
		} catch (Exception e) {
if(i==150)
{
	e.printStackTrace();
	Assert.fail(e.getMessage());
}
		}
	}
	}

	@Then("^user_076 verify facility application ID field should be visible non mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_facility_application_id_field_should_be_visible_non_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("facility_id_dropdown"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Facility ID is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("facility_id_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(beneficiaryDetailsTestData.get("facility_application_id"));
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("facility_application_id"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Facility application ID field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("facility_id_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("facility_id_dropdown"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "facility ID field is not a dropdown hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")), "facility ID field is mandatory hence failed");

	}

	@Then("^user_076 verify beneficiary name field should be visible mandatory editable text box at disbursment maker stage$")
	public void user_076_verify_beneficiary_name_field_should_be_visible_mandatory_editable_text_box_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary name is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.sendKeys(beneficiaryDetailsTestData.get("beneficiary_name"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "Beneficiary name is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.getAttribute("type");
				getFieldmandatoryStatus = javascriptHelper
						.executeScript("return "
								+ beneficiaryDetailsWebElements.getElement("beneficiary_name_mandatory_verification"))
						.toString();

				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("text"), "Beneficiary name field is not a textbox hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"),
				"Beneficiary name field is not mandatory hence failed");
	}

	@Then("^user_076 verify beneficiary type field should be visible mandatory editable dropdown at disbursment maker stage$")
	public void user_076_verify_beneficiary_type_field_should_be_visible_mandatory_editable_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_type_dropdown")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary type ID is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("beneficiary_type"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Beneficiary type field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_type_dropdown"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "Beneficiary type field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"),
				"Beneficiary type field is mandatory hence failed");
	}

	@Then("^user_076 verify beneficiary KYC field should be visible non mandatory editable text box at disbursment maker stage$")
	public void user_076_verify_beneficiary_kyc_field_should_be_visible_non_mandatory_editable_text_box_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_kyc"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary name is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_kyc"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_kyc"))
						.sendKeys(beneficiaryDetailsTestData.get("beneficiary_kyc"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "Beneficiary name is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_kyc"))
						.getAttribute("type");
				getFieldmandatoryStatus = javascriptHelper
						.executeScript("return "
								+ beneficiaryDetailsWebElements.getElement("bneficiary_kfc_mandatory_verification"))
						.toString();
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("text"), "beneficiary KFC field is not a textbox hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")), "beneficiary KFC field is not mandatory hence failed");
	}

	@Then("^user_076 verify beneficiary address field should be visible non mandatory text box at disbursment maker stage$")
	public void user_076_verify_beneficiary_address_field_should_be_visible_non_mandatory_text_box_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_address"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary Address is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_address"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_address"))
						.sendKeys(beneficiaryDetailsTestData.get("beneficiary_address"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "Beneficiary Address is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_address"))
						.getAttribute("type");
				getFieldmandatoryStatus = javascriptHelper.executeScript("return "
						+ beneficiaryDetailsWebElements.getElement("beneficiary_address_mandatory_verification"))
						.toString();
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("text"), "beneficiary Address field is not a textbox hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")), "beneficiary Address field is not mandatory hence failed");
	}

	@Then("^user_076 verify account type field should be visible mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_account_type_field_should_be_visible_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("bank_account_type"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Account type ID is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("bank_account_type"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("account_type"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Account type field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("bank_account_type"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("bank_account_type"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "Account type field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"), "Account type field is mandatory hence failed");
	}

	@Then("^user_076 verify IBAN account no field should be visible mandatory text box at disbursment maker stage$")
	public void user_076_verify_iban_account_no_field_should_be_visible_mandatory_text_box_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_bank_account_no")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "bank account no is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_bank_account_no")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_bank_account_no"))
						.sendKeys(beneficiaryDetailsTestData.get("iban_account_no"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "bank account no is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_bank_account_no"))
						.getAttribute("type");
				getFieldmandatoryStatus = javascriptHelper.executeScript("return " + beneficiaryDetailsWebElements
						.getElement("beneficiary_bank_account_no_mandatory_verification")).toString();
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("number"), "bank account no field is not a textbox hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")), "bank account no field is not mandatory hence failed");
	}

	@Then("^user_076 verify MICR type field should be visible non mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_micr_type_field_should_be_visible_non_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("micr_type"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "MICR type ID is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("micr_type"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("micr_type"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "MICR type field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("micr_type"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("micr_type"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "MICR type field is not a dropdown hence failed");
		softAssert.assertTrue(!(getFieldmandatoryStatus.contains("*")), "MICR type field is mandatory hence failed");
	}

	@Then("^user_076 verify beneficiary MICR code should be visible mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_beneficiary_micr_code_should_be_visible_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_micr_code"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "beneficiary MICR code ID is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_micr_code"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("beneficiary_micr_code"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "beneficiary MICR code field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_micr_code"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_micr_code"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"),
				"beneficiary MICR code field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"),
				"beneficiary MICR code field is non mandatory hence failed");
	}

	@Then("^user_076 verify bank code field shuould be visible mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_bank_code_field_shuould_be_visible_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_bank_code"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Bank code ID is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_bank_code"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("bank_code"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Bank code field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_bank_code"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_bank_code"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "Bank code field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"), "Bank code field is non mandatory hence failed");
	}

	@Then("^user_076 verify branch name field should be visble mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_branch_name_field_should_be_visble_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("Branch_Name"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "branch name is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("Branch_Name"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("branch_name"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Branch name field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("Branch_Name"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("Branch_Name"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "branch name field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"), "branch name field is non mandatory hence failed");
	}

	@Then("^user_076 verify IFSC Code field should be visible and non mandatory text box at disbursment maker stage$")
	public void user_076_verify_ifsc_code_field_should_be_visible_and_non_mandatory_text_box_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("ifsc_code"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary name is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("ifsc_code"))
						.click();
				javascriptHelper.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("ifsc_code"))
						.sendKeys(beneficiaryDetailsTestData.get("ifsc_code"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "Beneficiary name is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("ifsc_code"))
						.getAttribute("type");
				getFieldmandatoryStatus = javascriptHelper
						.executeScript("return "
								+ beneficiaryDetailsWebElements.getElement("ifsc_code_mandatory_verification"))
						.toString();
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("text"), "IFSC Code field is not a textbox hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")), "IFSC Code field is not mandatory hence failed");
	}

	@Then("^user_076 verify payment type field should be visible mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_payment_type_field_should_be_visible_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_type_dropdown"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Payment type is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_type_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("payment_type"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Payment type field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_type_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_type_dropdown"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "Payment type field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"),
				"Payment type field is non mandatory hence failed");
	}

	@Then("^user_076 verify payment mode field should be visible mandatory dropdown at disbursment maker stage$")
	public void user_076_verify_payment_mode_field_should_be_visible_mandatory_dropdown_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_mode_dropdown"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Payment mode is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_mode_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(beneficiaryDetailsTestData.get("payment_mode"));
		isFieldEditable = true;
		softAssert.assertTrue(isFieldEditable, "Payment mode field is non editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_mode_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				getFieldmandatoryStatus = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("payment_mode_dropdown"))
						.getAttribute("aria-label");
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("Select"), "Payment mode field is not a dropdown hence failed");
		softAssert.assertTrue(getFieldmandatoryStatus.contains("*"),
				"Payment mode field is non mandatory hence failed");
	}

	@Then("^user_076 verify beneficiary email ID field should be visible non mandatory textbox at disbursment maker stage$")
	public void user_076_verify_beneficiary_email_id_field_should_be_visible_non_mandatory_textbox_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_email_id_textbox")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary name is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_email_id_textbox")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_email_id_textbox"))
						.sendKeys(beneficiaryDetailsTestData.get("beneficiary_email"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "Beneficiary name is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_email_id_textbox"))
						.getAttribute("type");
				getFieldmandatoryStatus = javascriptHelper.executeScript("return "
						+ beneficiaryDetailsWebElements.getElement("beneficiary_email_id_mandatory_verification"))
						.toString();
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("text"),
				"Beneficiary email ID field is not a textbox hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")),
				"Beneficiary email ID field is not mandatory hence failed");
	}

	@Then("^user_076 verify remarks field should be visible non mandatory textbox at disbursment maker stage$")
	public void user_076_verify_remarks_field_should_be_visible_non_mandatory_textbox_at_disbursment_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		boolean isFieldEditable = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("remarks_input"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "Beneficiary name is not visible hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("remarks_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("remarks_input"))
						.sendKeys(beneficiaryDetailsTestData.get("beneficiary_email"));
				isFieldEditable = true;
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "Remarks is not editable hence failed");
		String getFieldType = "";
		String getFieldmandatoryStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("remarks_input"))
						.getAttribute("name");
				getFieldmandatoryStatus = javascriptHelper
						.executeScript(
								"return " + beneficiaryDetailsWebElements.getElement("remarks_mandatory_verification"))
						.toString();
				if ((getFieldType.length() > 0) && (getFieldmandatoryStatus.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(getFieldType.contains("textarea"), "Remarks field is not a textbox hence failed");
		softAssert.assertTrue(!(getFieldType.contains("*")), "Remarks field is not mandatory hence failed");
	}

	@And("^user_076 click on save button in beneficiary details at disbursment maker stage$")
	public void user_076_click_on_save_button_in_beneficiary_details_at_disbursment_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify record successfully saved alert message at disbursment maker stage$")
	public void user_076_verify_record_successfully_saved_alert_message_at_disbursment_maker_stage() throws Throwable {
		String saveButtonVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveButtonVerification = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (saveButtonVerification.length() > 0) {
					System.out.println(saveButtonVerification);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(saveButtonVerification.contains("Success!"), "Record not getting saved hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonJSElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on save button without entering the mandatory details in beneficiary details screen at disbursment maker stage$")
	public void user_076_click_on_save_button_without_entering_the_mandatory_details_in_beneficiary_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify system should show the mandatory blank field validation in beneficiary details screen at app disbursment maker stage$")
	public void user_076_verify_system_should_show_the_mandatory_blank_field_validation_in_beneficiary_details_screen_at_app_disbursment_maker_stage()
			throws Throwable {
		String saveButtonVerification = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveButtonVerification = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_message")).toString();
				if (saveButtonVerification.length() > 0) {
					System.out.println(saveButtonVerification);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 enter special character input in beneficiary name input field at disbursment maker stage$")
	public void user_076_enter_special_character_input_in_beneficiary_name_input_field_at_disbursment_maker_stage()
			throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.sendKeys(beneficiaryDetailsTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^user_076 verify beneficiary name field should show the validation for special character input to beneficiary name field at disbursment maker$")
	public void user_076_verify_beneficiary_name_field_should_show_the_validation_for_special_character_input_to_beneficiary_name_field_at_disbursment_maker()
			throws Throwable {
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScript("return "
								+ beneficiaryDetailsWebElements.getElement("beneficiary_name_field_validation"))
						.toString();
				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(fieldTypeValidation);
		softAssert.assertEquals(fieldTypeValidation, "Only Alphabets are allowed",
				"Beneficiary name field is accepting special character input hence failed");
	}

	@And("^user_076 enter special numeric input in beneficiary name input field at disbursment maker stage$")
	public void user_076_enter_special_numeric_input_in_beneficiary_name_input_field_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i < 5; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			} catch (Exception e) {

			}

		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(beneficiaryDetailsWebElements.getElement("beneficiary_name"))
						.sendKeys(beneficiaryDetailsTestData.get("numeric_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify beneficiary name field should show the validation for numeric input to beneficiary name field at disbursment maker$")
	public void user_076_verify_beneficiary_name_field_should_show_the_validation_for_numeric_input_to_beneficiary_name_field_at_disbursment_maker()
			throws Throwable {
		String fieldTypeValidation = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldTypeValidation = javascriptHelper
						.executeScript("return "
								+ beneficiaryDetailsWebElements.getElement("beneficiary_name_field_validation"))
						.toString();
				if (fieldTypeValidation.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println(fieldTypeValidation);
		softAssert.assertEquals(fieldTypeValidation, "Only Alphabets are allowed",
				"Beneficiary name field is accepting numeric character input hence failed");
	}

	@And("^user_076 enter character input in bank account number field in beneficiary details screen at disbursment maker stage$")
	public void user_076_enter_character_input_in_bank_account_number_field_in_beneficiary_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						beneficiaryDetailsWebElements.getElement("beneficiary_bank_account_no")).click();
				javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_bank_account_no"))
						.sendKeys(beneficiaryDetailsTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify bank account number field should not accept the character input in beeficiary details at disbursment maker stage$")
	public void user_076_verify_bank_account_number_field_should_not_accept_the_character_input_in_beeficiary_details_at_disbursment_maker_stage()
			throws Throwable {
		String getAccountNo = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getAccountNo = javascriptHelper
						.executeScript("return "
								+ beneficiaryDetailsWebElements.getElement("get_beneficiary_account_no_value"))
						.toString();
				if (getAccountNo.length() == 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Account no length " + getAccountNo.length());
		softAssert.assertTrue((getAccountNo.length() == 0),
				"Account number field is accepting character input hence failed");
	}

	@And("^user_076 click on back button in beneficiary details screen at disbursment maker stage$")
	public void user_076_click_on_back_button_in_beneficiary_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify system should get move backward in beneficiary details screen at disursment maker stage$")
	public void user_076_verify_system_should_get_move_backward_in_beneficiary_details_screen_at_disursment_maker_stage()
			throws Throwable {
		boolean isAddButtonVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isAddButtonVisible = javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("beneficiary_details_add_button"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isAddButtonVisible, "Back button is not working hence failed");
	}

	@And("^user_076 click on search button in beneficiary details list view at disbursment maker stage$")
	public void user_076_click_on_search_button_in_beneficiary_details_list_view_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 search with valid search text in beneficiary details screen at disbursment maker stage$")
	public void user_076_search_with_valid_search_text_in_beneficiary_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_input"))
						.sendKeys(beneficiaryDetailsTestData.get("valid_search_text"));
				System.out.println(beneficiaryDetailsTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify system should show the valid search result in beneficiary details list view at disbursment maker stage$")
	public void user_076_verify_system_should_show_the_valid_search_result_in_beneficiary_details_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String listViewSearchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewSearchResult = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("list_view_search_result")).toString();
				if (listViewSearchResult.length() > 0) {
					System.out.println(listViewSearchResult);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(listViewSearchResult.contains("Showing 0 to 0 of 0 entries")),
				"System is not showing matched result for valid search text");
	}

	@And("^user_076 search with in valid search text in beneficiary details screen at disbursment maker stage$")
	public void user_076_search_with_in_valid_search_text_in_beneficiary_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 4; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("list_view_search_input"))
						.sendKeys(beneficiaryDetailsTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify system should not show the valid search result in beneficiary details list view at disbursment maker stage$")
	public void user_076_verify_system_should_not_show_the_valid_search_result_in_beneficiary_details_list_view_at_disbursment_maker_stage()
			throws Throwable {
		Thread.sleep(6000);
		String listViewSearchResult = "";
		for (int i = 0; i <= 150; i++) {
			try {
				listViewSearchResult = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("list_view_search_result")).toString();
				if (listViewSearchResult.length() > 0
						&& (listViewSearchResult.contains("Showing 0 to 0 of 0 entries"))) {
					System.out.println(listViewSearchResult);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(listViewSearchResult.contains("Showing 0 to 0 of 0 entries"),
				"System is not showing matched result for valid search text");
	}

	@And("^user_076 click on export button in beneficiary details list view at disbursment maker stage$")
	public void user_076_click_on_export_button_in_beneficiary_details_list_view_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("export_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@And("^user_076 click on pdf option in beneficiary details list view at disbursment maker stage$")
	public void user_076_click_on_pdf_option_in_beneficiary_details_list_view_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("pdf_download")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("^user_076 verify beneficiary details list view details are downloaded as a pdf format at disbursment maker stage$")
	public void user_076_verify_beneficiary_details_list_view_details_are_downloaded_as_a_pdf_format_at_disbursment_maker_stage()
			throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("^user_076 click on xlsx option in beneficiary details list view at disbursment maker stage$")
	public void user_076_click_on_xlsx_option_in_beneficiary_details_list_view_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("xls_download")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("^user_076 verify beneficiary details list view details are downloaded at xlsx format at disbursment maker stage$")
	public void user_076_verify_beneficiary_details_list_view_details_are_downloaded_at_xlsx_format_at_disbursment_maker_stage()
			throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("CollateralDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("CollateralDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("^user_076 click on view button of beneficiary details list view at disbursment checker stage$")
	public void user_076_click_on_view_button_of_beneficiary_details_list_view_at_disbursment_checker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								beneficiaryDetailsWebElements.getElement("list_view_beneficiary_details_view_button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("^user_076 verify in beneficiary details fields rae in view only mode at disbursment checker stage$")
	public void user_076_verify_in_beneficiary_details_fields_rae_in_view_only_mode_at_disbursment_checker_stage()
			throws Throwable {
		int numberOfFields = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				String tempNumberOfFields = javascriptHelper
						.executeScript(
								"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]').length")
						.toString();
				numberOfFields = Integer.parseInt(tempNumberOfFields);
				if (numberOfFields > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < numberOfFields; i++) {
			for (int j = 0; j <= 150; j++) {
				try {
					String fieldType = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					String fieldLabel = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"] ion-label')[" + i
									+ "].innerText")
							.toString();
					if ((fieldType.length() > 0) && (fieldLabel.length() > 0)) {
						softAssert.assertTrue(fieldType.contains("true"),
								fieldLabel + " is not in read only mode hence failed");
						break;
					}
				} catch (Exception e) {
					if (j == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
		}
	}

	@Then("^user_076 verify beneficiary details record values should get matched with disbursment maker record at disbursment checker stage$")
	public void user_076_verify_beneficiary_details_record_values_should_get_matched_with_disbursment_maker_record_at_disbursment_checker_stage()
			throws Throwable {
		String facilityIDDropdownvalue = "";
		String beneficiaryNamevalue = "";
		String beneficiaryccountNo = "";

		for (int i = 0; i <= 150; i++) {
			try {
				facilityIDDropdownvalue = javascriptHelper
						.executeScript(
								"return " + beneficiaryDetailsWebElements.getElement("get_facility_id_dropdown_value"))
						.toString();
				if (facilityIDDropdownvalue.length() > 0) {
					softAssert.assertTrue(
							facilityIDDropdownvalue.contains(beneficiaryDetailsTestData.get("facility_application_id")),
							facilityIDDropdownvalue + " is not matched with "
									+ beneficiaryDetailsTestData.get("facility_application_id") + " hence failed");
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
				beneficiaryNamevalue = javascriptHelper
						.executeScript(
								"return " + beneficiaryDetailsWebElements.getElement("get_beneficiary_name_value"))
						.toString();
				if (beneficiaryNamevalue.length() > 0) {
					softAssert.assertTrue(
							beneficiaryNamevalue.contains(beneficiaryDetailsTestData.get("beneficiary_name")),
							beneficiaryNamevalue + " is not matched with "
									+ beneficiaryDetailsTestData.get("beneficiary_name") + " hence failed");
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
				beneficiaryccountNo = javascriptHelper
						.executeScript("return " + beneficiaryDetailsWebElements.getElement("get_account_no_value"))
						.toString();
				if (beneficiaryccountNo.length() > 0) {
					softAssert.assertTrue(
							beneficiaryccountNo.contains(beneficiaryDetailsTestData.get("iban_account_no")),
							beneficiaryccountNo + " is not matched with "
									+ beneficiaryDetailsTestData.get("iban_account_no") + " hence failed");
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_076 invoke soft assert at disbursment maker stage$")
	public void user_076_invoke_soft_assert_at_disbursment_maker_stage() throws Throwable {
		softAssert.assertAll();
	}

}
