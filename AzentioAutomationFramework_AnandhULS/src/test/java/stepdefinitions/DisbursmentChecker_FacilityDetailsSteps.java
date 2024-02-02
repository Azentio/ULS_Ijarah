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

public class DisbursmentChecker_FacilityDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths commonJSElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths facilityDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "facilityInfo_JSpaths",
			"FacilityInfo_Elements", "JSPaths");
	ExcelData facilityDetailsExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DBMRBeneficiaryDetails_TestData", "Dataset ID");
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	Map<String, String> facilityDetailsTestData = new HashMap<>();
	Map<String, String> autoLoanExecutionData = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 get the test data for test case ID AT_FD_AL_DMC_01$")
	public void user_076_get_the_test_data_for_test_case_id_at_fd_al_dmc_01() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_FD_AL_DMC_01");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		facilityDetailsTestData = facilityDetailsExcelTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 click on facility details tab at disbursment checker stage$")
	public void user_076_click_on_facility_details_tab_at_disbursment_checker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Facility Info tab JSPath "+facilityDetailsElements.getElement("disbursment_checker_facility_info_tab"));
				javascriptHelper.executeScriptWithWebElement(facilityDetailsElements.getElement("disbursment_checker_facility_info_tab"))
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
	@And("^user_076 click on view button in facility details at disbursment checker stage$")
	public void user_076_click_on_view_button_in_facility_details_at_disbursment_checker_stage()throws Throwable{
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilityDetailsElements.getElement("facility_list_view_button"))
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

	@Then("^user_076 verify all the facility details fields are in read only mode at disbursment checker stage$")
	public void user_076_verify_all_the_facility_details_fields_are_in_read_only_mode_at_disbursment_checker_stage()
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

	@Then("^user_076 verify facility details field values should matched with app data entry value at disbursment checker stage$")
	public void user_076_verify_facility_details_field_values_should_matched_with_app_data_entry_value_at_disbursment_checker_stage()
			throws Throwable {
		String loanTenure = "";
		for (int i = 0; i <= 150; i++) {
			try {
				loanTenure = javascriptHelper
						.executeScript("return " + facilityDetailsElements.getElement("get_requested_amount_value"))
						.toString();
				if (loanTenure.length() > 0) {
					System.out.println("Application value" + loanTenure);
					System.out.println("Map value" + facilityDetailsTestData.get("loan_tenure"));
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

	@And("^user_076 invoke soft assert in facility details section at disbursment maker stage$")
	public void user_076_invoke_soft_assert_in_facility_details_section_at_disbursment_maker_stage() throws Throwable {
		softAssert.assertAll();
	}

}
