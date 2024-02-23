package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_DisbursmentMaker_Checker_OfferingSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData offeringExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DSBMKRCHR_OfferingTestData", "Dataset ID");
	JSPaths offeringDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "Offering_Jspaths",
			"Offering_fieldName", "JSPaths");
	Map<String, String> autoLoanExecutionData = new HashMap<>();
	Map<String, String> offeringTestData = new HashMap<>();
	
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 get the test data for test case ID AT_OFD_AL_DMC_01_MKR$")
	public void user_076_get_the_test_data_for_test_case_id_at_ofd_al_dmc_01_mkr() throws Throwable {
		autoLoanExecutionData=autoLoanExecutionSheet.getTestdata("AT_OFD_AL_DMC_01_MKR");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		offeringTestData=offeringExcelTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
		
	}
	@And("^user_076 get the test data for test case ID AT_OFD_AL_DMC_01_CHR$")
	public void user_076_get_the_test_data_for_test_case_id_at_ofd_al_dmc_01_chr() throws Throwable {
		autoLoanExecutionData=autoLoanExecutionSheet.getTestdata("AT_OFD_AL_DMC_01_CHR");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		offeringTestData=offeringExcelTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
		
	}

	@And("^user_076 click on offering details section in disbursment maker stage$")
	public void user_076_click_on_offering_details_section_in_disbursment_maker_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(offeringDetailsElements.getElement("disbursment_offering_tab"))
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
	@And("^user_076 click on offering details section in disbursment checker stage$")
	public void user_076_click_on_offering_details_section_in_disbursment_checker_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(offeringDetailsElements.getElement("disbursment_offering_tab"))
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

	@Then("^user_076 clasification field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_clasification_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("product_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "Clasification field is not readonly hence failed");

	}
	@Then("^user_076 clasification field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_clasification_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("product_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "Clasification field is not readonly hence failed");

	}

	@Then("^user_076 product field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_product_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("sub_product_code_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "product field is not readonly hence failed");
	}
	@Then("^user_076 product field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_product_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("sub_product_code_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "product field is not readonly hence failed");
	}

	@Then("^user_076 scheme ID field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_scheme_id_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("schemeID_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "scheme ID field is not readonly hence failed");
	}
	@Then("^user_076 scheme ID field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_scheme_id_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("schemeID_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "scheme ID field is not readonly hence failed");
	}

	@Then("^user_076 Total amount financed field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_total_amount_financed_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("total_amount_financed_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "Total finaced amount field is not readonly hence failed");
	}
	@Then("^user_076 Total amount financed field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_total_amount_financed_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("total_amount_financed_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "Total finaced amount field is not readonly hence failed");
	}

	@Then("^user_076 Loan tenure field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_loan_tenure_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("loan_tenure_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "loan tenure field is not readonly hence failed");
	}
	@Then("^user_076 Loan tenure field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_loan_tenure_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("loan_tenure_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "loan tenure field is not readonly hence failed");
	}

	@Then("^user_076 currrency ID field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_currrency_id_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("currency_id_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "currency ID field is not readonly hence failed");
	}
	@Then("^user_076 currrency ID field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_currrency_id_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("currency_id_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "currency ID field is not readonly hence failed");
	}

	@Then("^user_076 eligibility income field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_eligibility_income_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("eligibility_income_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "eligibility income field is not readonly hence failed");
	}
	@Then("^user_076 eligibility income field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_eligibility_income_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("eligibility_income_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "eligibility income field is not readonly hence failed");
	}

	@Then("^user_076 insurance amount field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_insurance_amount_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("insurance_amount_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "insurance amount field is not readonly hence failed");
	}
	@Then("^user_076 insurance amount field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_insurance_amount_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("insurance_amount_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "insurance amount field is not readonly hence failed");
	}

	@Then("^user_076 pre retirement EMI field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_pre_retirement_emi_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("pre_retirement_emi_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "pre retirement EMI field is not readonly hence failed");
	}
	@Then("^user_076 pre retirement EMI field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_pre_retirement_emi_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("pre_retirement_emi_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "pre retirement EMI field is not readonly hence failed");
	}

	@Then("^user_076 post retirement EMI field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_post_retirement_emi_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("post_retirement_emi_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "post retirement EMI field is not readonly hence failed");
	}
	@Then("^user_076 post retirement EMI field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_post_retirement_emi_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("post_retirement_emi_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "post retirement EMI field is not readonly hence failed");
	}

	@Then("^user_076 previous EMI field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_previous_emi_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("prev_emi_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "Previous EMI EMI field is not readonly hence failed");
	}
	@Then("^user_076 previous EMI field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_previous_emi_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript(
								"return " + offeringDetailsElements.getElement("prev_emi_readonly_mode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "Previous EMI EMI field is not readonly hence failed");
	}

	@Then("^user_076 previous outstanding field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_previous_outstanding_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("previous_outstanding_emi_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "previous outstanding field is not readonly hence failed");
	}
	@Then("^user_076 previous outstanding field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_previous_outstanding_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("previous_outstanding_emi_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "previous outstanding field is not readonly hence failed");
	}

	@Then("^user_076 previous net realizable value field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_previous_net_realizable_value_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("previous_net_realizable_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"previous net readlizable field is not readonly hence failed");
	}
	@Then("^user_076 previous net realizable value field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_previous_net_realizable_value_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("previous_net_realizable_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"previous net readlizable field is not readonly hence failed");
	}

	@Then("^user_076 pre retirement tenure field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_pre_retirement_tenure_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("net_retirement_tenure_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "pre retirement tenure field is not readonly hence failed");
	}
	@Then("^user_076 pre retirement tenure field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_pre_retirement_tenure_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("net_retirement_tenure_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "pre retirement tenure field is not readonly hence failed");
	}

	@Then("^user_076 total offer amount field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_total_offer_amount_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("total_offer_amount_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "total offer amount field is not readonly hence failed");
	}
	@Then("^user_076 total offer amount field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_total_offer_amount_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("total_offer_amount_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "total offer amount field is not readonly hence failed");
	}

	@Then("^user_076 average account balance field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_average_account_balance_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("average_account_balance_readonlyMode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"average account balance field is not readonly hence failed");
	}
	@Then("^user_076 average account balance field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_average_account_balance_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("average_account_balance_readonlyMode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"average account balance field is not readonly hence failed");
	}

	@Then("^user_076 applicable LTV one field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_applicable_ltv_one_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("applicable_ltvone_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "applicable ltv one field is not readonly hence failed");
	}
	@Then("^user_076 applicable LTV one field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_applicable_ltv_one_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("applicable_ltvone_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "applicable ltv one field is not readonly hence failed");
	}

	@Then("^user_076 applicable LTV two field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_applicable_ltv_two_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("applicable_ltvtwo_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "applicable ltv two field is not readonly hence failed");
	}

	@Then("^user_076 applicable LTV two field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_applicable_ltv_two_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return "
								+ offeringDetailsElements.getElement("applicable_ltvtwo_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"), "applicable ltv two field is not readonly hence failed");
	}
	@Then("^user_076 finance details loan tenure field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_finance_details_loan_tenure_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("finance_details_loan_tenure_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details loan tenure field is not readonly hence failed");
	}
	@Then("^user_076 finance details loan tenure field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_finance_details_loan_tenure_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("finance_details_loan_tenure_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details loan tenure field is not readonly hence failed");
	}

	@Then("^user_076 finance details number of installment field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_finance_details_number_of_installment_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return " + offeringDetailsElements
								.getElement("finance_details_number_of_instalments_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details number of installment field is not readonly hence failed");
	}
	@Then("^user_076 finance details number of installment field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_finance_details_number_of_installment_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return " + offeringDetailsElements
								.getElement("finance_details_number_of_instalments_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details number of installment field is not readonly hence failed");
	}

	@Then("^user_076 finance details repay frequency field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_finance_details_repay_frequency_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return " + offeringDetailsElements
						.getElement("finance_details_repay_frequence_readonlymode_verification")).toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details repay frequency field is not readonly hence failed");
	}
	@Then("^user_076 finance details repay frequency field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_finance_details_repay_frequency_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return " + offeringDetailsElements
						.getElement("finance_details_repay_frequence_readonlymode_verification")).toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details repay frequency field is not readonly hence failed");
	}

	@Then("^user_076 finance details internal rate of return field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_finance_details_internal_rate_of_return_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return " + offeringDetailsElements
								.getElement("finance_details_internal_rate_of_return_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details internal rate of return field is not readonly hence failed");
	}
	@Then("^user_076 finance details internal rate of return field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_finance_details_internal_rate_of_return_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return " + offeringDetailsElements
								.getElement("finance_details_internal_rate_of_return_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details internal rate of return field is not readonly hence failed");
	}

	@Then("^user_076 finance details total loan amount financed field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_finance_details_total_loan_amount_financed_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return " + offeringDetailsElements
								.getElement("finance_details_total_loan_amount_financed_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details total loan amount field is not readonly hence failed");
	}
	@Then("^user_076 finance details total loan amount financed field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_finance_details_total_loan_amount_financed_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper
						.executeScript("return " + offeringDetailsElements
								.getElement("finance_details_total_loan_amount_financed_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details total loan amount field is not readonly hence failed");
	}

	@Then("^user_076 finance details average account balance field should be readonly mode in offering screen at disbursment maker stage$")
	public void user_076_finance_details_average_account_balance_field_should_be_readonly_mode_in_offering_screen_at_disbursment_maker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("average_acount_balance_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details average account balance field is not readonly hence failed");
	}
	@Then("^user_076 finance details average account balance field should be readonly mode in offering screen at disbursment checker stage$")
	public void user_076_finance_details_average_account_balance_field_should_be_readonly_mode_in_offering_screen_at_disbursment_checker_stage()
			throws Throwable {
		String fieldStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				fieldStatus = javascriptHelper.executeScript("return "
						+ offeringDetailsElements.getElement("average_acount_balance_readonlymode_verification"))
						.toString();
				if (fieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fieldStatus.contains("true"),
				"finance details average account balance field is not readonly hence failed");
	}

	@Then("^user_076 verify offering field values should be matched with app data entry stage value at disbursment maker stage$")
	public void user_076_verify_offering_field_values_should_be_matched_with_app_data_entry_stage_value_at_disbursment_maker_stage()
			throws Throwable {
		String clasificationValue = "";
		String productValue = "";
		String schemeIDValue = "";
		for (int i = 0; i <= 150; i++) {
			try {
				clasificationValue = javascriptHelper
						.executeScript("return " + offeringDetailsElements.getElement("get_clasification_text"))
						.toString();
				if (clasificationValue.length() > 0) {
					System.out.println("Clasification Map value "+offeringTestData.get("clasification"));
					System.out.println(clasificationValue);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(clasificationValue.contains(offeringTestData.get("clasification")), "Clasification value not matched hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				productValue = javascriptHelper
						.executeScript("return " + offeringDetailsElements.getElement("get_product_text")).toString();
				if (productValue.length() > 0) {
					System.out.println("Product Map value "+offeringTestData.get("product"));
					System.out.println(productValue);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(productValue.contains(offeringTestData.get("product")), "Product value not matched hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				schemeIDValue = javascriptHelper
						.executeScript("return " + offeringDetailsElements.getElement("get_scheme_id_text")).toString();
				if (schemeIDValue.length() > 0) {
					System.out.println("Scheme ID Map value "+offeringTestData.get("scheme_ID"));
					System.out.println(schemeIDValue);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(schemeIDValue.contains(offeringTestData.get("scheme_ID")), "scheme ID value not matched hence failed");
	}
	@Then("^user_076 verify offering field values should be matched with app data entry stage value at disbursment checker stage$")
	public void user_076_verify_offering_field_values_should_be_matched_with_app_data_entry_stage_value_at_disbursment_checker_stage()
			throws Throwable {
		String clasificationValue = "";
		String productValue = "";
		String schemeIDValue = "";
		for (int i = 0; i <= 150; i++) {
			try {
				clasificationValue = javascriptHelper
						.executeScript("return " + offeringDetailsElements.getElement("get_clasification_text"))
						.toString();
				if (clasificationValue.length() > 0) {
					System.out.println("Clasification Map value "+offeringTestData.get("clasification"));
					System.out.println(clasificationValue);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(clasificationValue.contains(offeringTestData.get("clasification")), "Clasification value not matched hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				productValue = javascriptHelper
						.executeScript("return " + offeringDetailsElements.getElement("get_product_text")).toString();
				if (productValue.length() > 0) {
					System.out.println("Product Map value "+offeringTestData.get("product"));
					System.out.println(productValue);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(productValue.contains(offeringTestData.get("product")), "Product value not matched hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				schemeIDValue = javascriptHelper
						.executeScript("return " + offeringDetailsElements.getElement("get_scheme_id_text")).toString();
				if (schemeIDValue.length() > 0) {
					System.out.println("Scheme ID Map value "+offeringTestData.get("scheme_ID"));
					System.out.println(schemeIDValue);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(schemeIDValue.contains(offeringTestData.get("scheme_ID")), "scheme ID value not matched hence failed");
	}

	@Then("^user_076 invoke soft assert in disbursemen maker checker offering screen$")
	public void user_076_invoke_soft_assert_in_disbursemen_maker_checker_offering_screen() throws Throwable {
		softAssert.assertAll();
	}

}
