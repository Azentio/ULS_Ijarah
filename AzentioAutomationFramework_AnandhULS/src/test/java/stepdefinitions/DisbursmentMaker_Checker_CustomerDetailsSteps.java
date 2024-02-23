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

public class DisbursmentMaker_Checker_CustomerDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData customerDetailsExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DSBMKRCHR_CustmrDetailsTestData", "Dataset ID");
	JSPaths commonJSElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths customerDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "NewApp_CustomerDetailsElements",
			"New_App_CustomerDetailsElements", "JSPath");
	Map<String, String> auloLoanEXecutionSheet = new HashMap<>();
	Map<String, String> customerDetailsTestData = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 get the test data for test case ID AT_ADC_AL_DMC_01_MKR$")
	public void user_076_get_the_test_data_for_test_case_id_at_adc_al_dmc_01_mkr() throws Throwable {
		auloLoanEXecutionSheet = autoLoanExecutionSheet.getTestdata("AT_ADC_AL_DMC_01_MKR");
		System.out.println(auloLoanEXecutionSheet.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsExcelTestData.getTestdata(auloLoanEXecutionSheet.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_ADC_AL_DMC_01_CHR$")
	public void user_076_get_the_test_data_for_test_case_id_at_adc_al_dmc_01_chr() throws Throwable {
		auloLoanEXecutionSheet = autoLoanExecutionSheet.getTestdata("AT_ADC_AL_DMC_01_CHR");
		System.out.println(auloLoanEXecutionSheet.get("dataSet_ID"));
		customerDetailsTestData = customerDetailsExcelTestData.getTestdata(auloLoanEXecutionSheet.get("dataSet_ID"));

	}

	@And("^user_076 click on customer details tab in disbursment maker stage$")
	public void user_076_click_on_customer_details_tab_in_disbursment_maker_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("customer_details_tab"))
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

	@And("^user_076 click on customer details tab in disbursment checker stage$")
	public void user_076_click_on_customer_details_tab_in_disbursment_checker_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(customerDetailsElements.getElement("customer_details_tab"))
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

	@And("^user_076 click on view button of customer details record in disbursment maker stage$")
	public void user_076_click_on_view_button_of_customer_details_record_in_disbursment_maker_stage() throws Throwable {
		// customer_details_list_view_view_button
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("customer_details_list_view_view_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on view button of customer details record in disbursment checker stage$")
	public void user_076_click_on_view_button_of_customer_details_record_in_disbursment_checker_stage()
			throws Throwable {
		// customer_details_list_view_view_button
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						customerDetailsElements.getElement("customer_details_list_view_view_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify all the customer details fields are should be read only mode at disbursment maker stage$")
	public void user_076_verify_all_the_customer_details_fields_are_should_be_read_only_mode_at_disbursment_maker_stage()
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
					System.out.println("Total number of fields " + numberOfFields);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < (numberOfFields-2); i++) {
			for (int j = 0; j <= 150; j++) {
				try {
					System.out.println("I value " + i);
					String fieldType = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					System.out.println("Label Query "
							+ "\"document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"] ion-label')[" + i
							+ "].innerText");
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

	@Then("^user_076 verify customer details field value should be matched with data entry stage at disbursment maker stage$")
	public void user_076_verify_customer_details_field_value_should_be_matched_with_data_entry_stage_at_disbursment_maker_stage()
			throws Throwable {
		String firstName = "";
		String lastname = "";
		String fatherFirstName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				firstName = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_first_name_value"))
						.toString();
				if (firstName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map "+customerDetailsTestData.get("Customer_First_Name"));
		softAssert.assertTrue(firstName.contains(customerDetailsTestData.get("Customer_First_Name")),
				firstName + " is not matched with data entry record  hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				lastname = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_last_name_value"))
						.toString();
				if (lastname.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(lastname.contains(customerDetailsTestData.get("Customer_last_name")),
				lastname + " is not matched with data entry record  hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				fatherFirstName = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_father_first_name_value"))
						.toString();
				if (fatherFirstName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fatherFirstName.contains(customerDetailsTestData.get("father_first_name")),
				fatherFirstName + " is not matched with data entry record  hence failed");
	}

	@Then("^user_076 verify all the customer details fields are should be read only mode at disbursment checker stage$")
	public void user_076_verify_all_the_customer_details_fields_are_should_be_read_only_mode_at_disbursment_checker_stage()
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
		for (int i = 0; i < (numberOfFields-2); i++) {
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

	@Then("^user_076 verify customer details field value should be matched with data entry stage at disbursment checker stage$")
	public void user_076_verify_customer_details_field_value_should_be_matched_with_data_entry_stage_at_disbursment_checker_stage()
			throws Throwable {
		String firstName = "";
		String lastname = "";
		String fatherFirstName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				firstName = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_first_name_value"))
						.toString();
				if (firstName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(firstName.contains(customerDetailsTestData.get("Customer_First_Name")),
				firstName + " is not matched with data entry record  hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				lastname = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_last_name_value"))
						.toString();
				if (lastname.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(lastname.contains(customerDetailsTestData.get("Customer_last_name")),
				lastname + " is not matched with data entry record  hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				fatherFirstName = javascriptHelper
						.executeScript("return " + customerDetailsElements.getElement("get_father_first_name_value"))
						.toString();
				if (fatherFirstName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(fatherFirstName.contains(customerDetailsTestData.get("father_first_name")),
				fatherFirstName + " is not matched with data entry record  hence failed");
	}

	@And("^user_076 invoke soft assert in customer details screen at disbursment maker checker stage$")
	public void user_076_invoke_soft_assert_in_customer_details_screen_at_disbursment_maker_checker_stage()
			throws Throwable {
	}

}
