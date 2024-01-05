package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_APPDATAENTRY_QuotationInfo {
	ConfigFileReader configfilereader = new ConfigFileReader();
	String excelPath = configfilereader.getJSFilePath();
	String excelTestDataPath = configfilereader.getMurabhaTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths MurabhAppdataEntryQuotationInfo = new JSPaths(excelPath, "MurabhAppdataEntryQuotationInfo", "FieldName",
			"JSPath");

	ExcelData MurabhAppdataEntryQuotationInfoexelData = new ExcelData(excelTestDataPath,
			"MurabhAppdataEntryQuotationInfo", "Data Set ID");
	Map<String, String> testData;
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();

	@And("User_607 Update testdata from AT_MU_QIA_001")
	public void user_607_update_test_data_set_id_for_AT_MU_QIA_001() {
		testData = MurabhAppdataEntryQuotationInfoexelData.getTestdata("DS_AT_MU_QIA_001");
	}

	@And("^User_607 Update testdata from AT_MU_QIA_002$")
	public void user_607_update_test_data_set_id_for_AT_MU_QIA_002() throws Throwable {
		testData = MurabhAppdataEntryQuotationInfoexelData.getTestdata("DS_AT_MU_QIA_002");
	}

	@Then("User_607 click quotation info tab")
	public void user_607_click_quotation_info_tab() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("quotationInfoSection"))
						.click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@Then("User_607 verify the insurance company field")
	public void user_607_verify_the_insurance_company_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("insuranceCompany"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the base premium field")
	public void user_607_verify_the_base_premium_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("basePremium"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the VAT on Base Premium field")
	public void user_607_verify_the_vat_on_base_premium_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremium"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Net Base Premium field")
	public void user_607_verify_the_net_base_premium_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("netBasePremium"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Total Discount field")
	public void user_607_verify_the_total_discount_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("totalDiscountAmount"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Expiry Date field")
	public void user_607_verify_the_expiry_date_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("expiryDateValidation"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Quotation Reference Number field")
	public void user_607_verify_the_quotation_reference_number_field() throws InterruptedException {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("quotationRefNo"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(3000);
	}

	@Then("User_607 click back button")
	public void user_607_click_back_button() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("backButton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 update test data set id for AT_QIA_002")
	public void user_607_607_update_test_data_set_id_for_at_qia002() {
		testData = MurabhAppdataEntryQuotationInfoexelData.getTestdata("AT_QIA_002_D2");
	}

	@Then("User_607 update test data set id for AT_QIA_003")
	public void user_607_607_update_test_data_set_id_for_at_qia003() {
		testData = MurabhAppdataEntryQuotationInfoexelData.getTestdata("AT_QIA_003_D3");
	}

	@Then("User_607 update test data set id for AT_QIA_004")
	public void user_607_607_update_test_data_set_id_for_at_qia004() {
		testData = MurabhAppdataEntryQuotationInfoexelData.getTestdata("AT_QIA_004_D4");
	}

	@Then("User_607 update test data set id for AT_QIA_005")
	public void user_607_607_update_test_data_set_id_for_at_qia005() {
		testData = MurabhAppdataEntryQuotationInfoexelData.getTestdata("AT_QIA_005_D5");
	}

	@Then("User_607 verify insurance company field is mandatory")
	public void user_607_607_verify_insurance_company_field_is_mandatory() {

		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatoryInsuranceCompany");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify insurance company field is editable")
	public void user_607_607_verify_insurance_company_field_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("insuranceCompanyInput")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}
		// System.out.println(testData.get("InsuranceCompanyInput"));
		// userUtility.selectRadioButton(driver,testData.get("InsuranceCompanyInput"));
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

			System.out.println("Map " + testData.get("InsuranceCompanyInput").trim());

			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("InsuranceCompanyInput")).trim())) {

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

	@Then("User_607 verify the base premium field is mandatory")
	public void user_607_607_verify_the_base_premium_field_is_mandatory() {
		// userUtility.verifyGivenFieldIsMandatory(driver,
		// MurabhAppdataEntryQuotationInfo.getElement("mandatorybasePremium"));
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatorybasePremium");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_607 verify the base premium field is editable")
	public void user_607_607_verify_the_base_premium_field_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("basePremiumInputField")).click();
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("basePremiumInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("basePremiumInputField"))
						.sendKeys(testData.get("Base_Premium_Input"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}

		}
	}

	@Then("User_607 verify the base premium field only accept the numeric values")
	public void user_607_607_verify_the_base_premium_field_only_accept_the_numeric_values() {
		String basePremiumNumericField = javascriptHelper
				.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("numericFieldValidation"))
				.getAttribute("ng-reflect-type");
		System.err.println("first print  " + basePremiumNumericField);
		String assertbasePremiumNumericField = "number";
		Assert.assertEquals(assertbasePremiumNumericField, basePremiumNumericField);
	}

	@Then("User_607 verify the VAT on Base Premium field is mandatory")
	public void user_607_607_verify_the_vat_on_base_premium_field_is_mandatory() {
		// userUtility.verifyGivenFieldIsMandatory(driver,
		// MurabhAppdataEntryQuotationInfo.getElement("mandatoryvatOnBasePremium"));

		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatoryvatOnBasePremium");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the VAT on Base Premium is editable")
	public void user_607_607_verify_the_vat_on_base_premium_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumInputField")).click();
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumInputField"))
						.sendKeys(testData.get("Vat_On_Base_Premium"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}

		}
	}

	@Then("User_607 verify the VAT on Base Premium field only accept the numeric values")
	public void user_607_607_verify_the_vat_on_base_premium_field_only_accept_the_numeric_values() {
		String vatNumericField = javascriptHelper
				.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumNumericValidation"))
				.getAttribute("ng-reflect-type");
		System.err.println("first print  " + vatNumericField);
		String assertvatNumericField = "number";
		Assert.assertEquals(assertvatNumericField, vatNumericField);
	}

	@Then("User_607 verify the Net Base Premium field is mandatory")
	public void user_607_607_verify_the_net_base_premium_field_is_mandatory() {
		// userUtility.verifyGivenFieldIsMandatory(driver,
		// MurabhAppdataEntryQuotationInfo.getElement("mandatorynetBasePremium"));

		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatorynetBasePremium");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Net Base Premium field is editable")
	public void user_607_607_verify_the_net_base_premium_field_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("netBasePremiumInputField")).click();
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("netBasePremiumInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("netBasePremiumInputField"))
						.sendKeys(testData.get("Net_Base_Premium"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}

		}
	}

	@Then("User_607 verify the Net Base Premium field only accept the numeric values")
	public void user_607_607_verify_the_net_base_premium_field_only_accept_the_numeric_values() {
		String netBasePremiumNumericField = javascriptHelper
				.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("netBasePremiumNumericValidation"))
				.getAttribute("ng-reflect-type");
		System.err.println("first print  " + netBasePremiumNumericField);
		String assertnetNumericField = "number";
		Assert.assertEquals(assertnetNumericField, netBasePremiumNumericField);
	}

	@Then("User_607 verify the Total Discount field is mandatory")
	public void user_607_607_verify_the_total_discount_field_is_mandatory() {
		// userUtility.verifyGivenFieldIsMandatory(driver,
		// MurabhAppdataEntryQuotationInfo.getElement("mandatorytotalDiscountAmount"));

		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatorytotalDiscountAmount");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Total Discount field is editable")
	public void user_607_607_verify_the_total_discount_field_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("totalDiscountAmountInputField")).click();
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("totalDiscountAmountInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("totalDiscountAmountInputField"))
						.sendKeys(testData.get("Total_Discount"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}

		}
	}

	@Then("User_607 verify Total Discount field is only accept the numeric values")
	public void user_607_607_verify_total_discount_field_is_only_accept_the_numeric_values() {
		String totalDiscountNumericField = javascriptHelper
				.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("totalDiscountNumericValidation"))
				.getAttribute("ng-reflect-type");
		System.err.println("first print  " + totalDiscountNumericField);
		String asserttotalDiscountNumericField = "number";
		Assert.assertEquals(asserttotalDiscountNumericField, totalDiscountNumericField);
	}

	@Then("User_607 verify the Expiry Date field is mandatory")
	public void user_607_607_verify_the_expiry_date_field_is_mandatory() {
		// userUtility.verifyGivenFieldIsMandatory(driver,
		// .getElement("mandatoryexpiryDate"));

		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatoryexpiryDate");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Expiry Date field is editable")
	public void user_607_607_verify_the_expiry_date_field_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("expiryDateValidation"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}
		}

		for (int j = 0; j < 200; j++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("expiryDateInput"))
						.click();
				break;
			} catch (Exception e) {
				if (j == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("User_607 verify the Expiry Date field should be in date format")
	public void user_607_607_verify_the_expiry_date_field_should_be_in_date_format() {
		String expiryDateFormat = javascriptHelper
				.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("expiryDateValidation"))
				.getAttribute("ng-reflect-icon");
		System.err.println("first print  " + expiryDateFormat);
		String assertexpiryDateFormat = "pi pi-calendar";
		Assert.assertEquals(assertexpiryDateFormat, expiryDateFormat);
	}

	@Then("User_607 verify the Quotation Reference Number field is mandatory")
	public void user_607_607_verify_the_quotation_reference_number_field_is_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = MurabhAppdataEntryQuotationInfo.getElement("mandatoryquotationRefNo");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_607 verify the Quotation Reference Number field is editable")
	public void user_607_607_verify_the_quotation_reference_number_field_is_editable() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField")).click();
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField"))
						.sendKeys(testData.get("Quotation_Ref_No"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());

				}
			}

		}
	}

	@Then("User_607 verify Quotation Reference Number field is only accept the numeric values")
	public void user_607_607_verify_quotation_reference_number_field_is_only_accept_the_numeric_values() {
		String quotationRefNo = javascriptHelper
				.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoNumericValidation"))
				.getAttribute("ng-reflect-type");
		System.err.println("first print  " + quotationRefNo);
		String assertquotationRefNo = "number";
		Assert.assertEquals(assertquotationRefNo, quotationRefNo);
	}

	@Then("User_607 verify Quotation Reference Number field should be in textbox")
	public void user_607_607_verify_quotation_reference_number_field_should_be_in_textbox() {
		String quotationRefNoTextbox = javascriptHelper
				.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoNumericValidation"))
				.getAttribute("ng-reflect-type");
		System.err.println("first print  " + quotationRefNoTextbox);
		String assertquotationRefNoTextbox = "text";
		Assert.assertEquals(assertquotationRefNoTextbox, quotationRefNoTextbox);
	}

	@Then("User_607 click base premium amount field")
	public void user_607_607_click_base_premium_amount_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("basePremiumInputField")).click();
				break;
			} catch (Exception e) {

			}

		}
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("basePremiumInputField")).clear();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	@Then("User_607 verify the please fill the details popup")
	public void user_607_607_verify_the_please_fill_the_details_popup() throws IOException {
//    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("invalidDataPopup")));
		for (int i = 0; i < 2000; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("invalidDataPopup"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("User_607 click VAt on base premium amount field")
	public void user_607_607_click_v_at_on_base_premium_amount_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumInputField")).click();
				break;
			} catch (Exception e) {

			}

		}
	}

	@Then("User_607 enter the negative value in VAt on base premium amount field")
	public void user_607_607_enter_the_negative_value_in_v_at_on_base_premium_amount_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumInputField"))
						.sendKeys(testData.get("Vat_On_Base_Premium"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	@Then("User_607 verify the invalid data entry popup")
	public void user_607_607_verify_the_invalid_data_entry_popup() throws IOException {

	}

	@Then("User_607 click quotation reference no field")
	public void user_607_607_click_quotation_reference_no_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField")).click();
				break;
			} catch (Exception e) {

			}

		}
	}

	@Then("User_607 enter the character values in quotation reference field")
	public void user_607_607_enter_the_character_values_in_quotation_reference_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField"))
						.sendKeys(testData.get("Quotation_Ref_No"));
				break;
			} catch (Exception e) {

			}

		}
	}

	@Then("User_607 validate the invalid data entry popup")
	public void user_607_607_validate_the_invalid_data_entry_popup() {

	}

	@Then("User_607 enter the special character value in quotation reference field")
	public void user_607_607_enter_the_special_character_value_in_quotation_reference_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField")).clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField"))
						.sendKeys(testData.get("Quotation_Ref_No1"));
				break;
			} catch (Exception e) {

			}

		}
	}

	@Then("User_607 validate the popup for invalid data")
	public void user_607_607_validate_the_popup_for_invalid_data() {

	}

	@Then("User_607 verify the save button under quotation info tab")
	public void user_607_607_verify_the_save_button_under_quotation_info_tab() {
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("saveButton"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("User_607 verify the back button under quotation info tab")
	public void user_607_607_verify_the_back_button_under_quotation_info_tab() {
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("backButton"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail();
				}
			}

		}
	}

	@And("User_607 enter the value in quotation reference no field")
	public void user_607_enter_the_value_in_quotation_reference_no_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField"))
						.sendKeys(Keys.CLEAR);
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("quotationRefNoInputField"))
						.sendKeys(testData.get(""));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	@Given("User_607 Check back button and save button present in the screen")
	public void user_607_check_back_button_and_save_button_present_in_the_screen() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("backButton"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("UpdateButton"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 to modify the Quotation Info")
	public void user_607_to_modify_the_quotation_info() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumNumericValidation"))
						.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumNumericValidation"))
						.sendKeys("1234");
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Clear Vat On Base Premium Amount value")
	public void user_607_clear_vat_on_base_premium_amount_value() throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumNumericValidation"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Enter invalid data in Vat On Base Premium Amount value")
	public void user_607_enter_invalid_data_in_vat_on_base_premium_amount_value() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumNumericValidation"))
						.clear();
				javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumNumericValidation"))
						.sendKeys("-1256");
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check show Please enter a value that is no less then zero popup")
	public void user_607_check_show_please_enter_a_value_that_is_no_less_then_zero_popup() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(
						MurabhAppdataEntryQuotationInfo.getElement("Please enter a value that is no less then zero"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Base premium Amount field in list view")
	public void user_607_check_base_premium_amount_field() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("basePremiumAmountInListView"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check VAT on Base Premium field in list view")
	public void user_607_check_vat_on_base_premium_field() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("vatOnBasePremiumAmountInListView"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Net Base Premium field in list view")
	public void user_607_check_net_base_premium_field() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("netBasePremiumAmountInListView"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Quotation Reference Number field in list view")
	public void user_607_check_quotation_reference_number_field() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(
								MurabhAppdataEntryQuotationInfo.getElement("quoteReferenceNoInListView"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Status field in list view")
	public void user_607_check_status_field() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("StatusInListView"))
						.isDisplayed()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 verify the values in List view")
	public void user_607_verify_the_values_in_list_view() {
		for (int i = 0; i < 500; i++) {
			try {
				String text = javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("StatusInListView"))
						.getText();
				if (text.isBlank() || text.isEmpty()) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 To verify the functionality of Export to PDF dropdown")
	public void user_607_to_verify_the_functionality_of_export_to_pdf_dropdown() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("DropDownInListView"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
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

			System.out.println("Map " + "PDF".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(("PDF").trim())) {

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

	@Given("User_607 To verify the functionality of Export to Excel dropdown")
	public void user_607_to_verify_the_functionality_of_export_to_excel_dropdown() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("DropDownInListView"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
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

			System.out.println("Map " + "XLS".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(("XLS").trim())) {

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

	@Given("User_607 Check the Status should be active in list view")
	public void user_607_check_the_status_should_be_active_in_list_view() throws Throwable {
		Thread.sleep(2000);
		for (int i = 0; i < 700; i++) {
			try {	
				String text = javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("StatusValueInListView")).getText();
				Assert.assertTrue(text.equals("Active"));
				break;
			} catch (Exception e) {
				if (i == 700) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Deactive the status")
	public void user_607_deactive_the_status() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("Status"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	@Given("User_607 active the status")
	public void user_607_active_the_status() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("Status"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check the Status should be Deactive in list view")
	public void user_607_check_the_status_should_be_deactive_in_list_view() throws Throwable {
		Thread.sleep(2000);
		for (int i = 0; i < 700; i++) {
			try {	
				String text = javascriptHelper.executeScriptWithWebElement(MurabhAppdataEntryQuotationInfo.getElement("StatusValueInListView")).getText();
				Assert.assertTrue(text.equals("In-active"));
				break;
			} catch (Exception e) {
				if (i == 700) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}