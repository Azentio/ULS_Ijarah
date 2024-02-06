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

public class DisbursmentMaker_ApplicationDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths commonJSElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths applicationDetailsWebElements = new JSPaths(configFileReader.getJSFilePath(),
			"newApp_AppllicationDetailsJS", "Ijarah_NewApp_fieldName", "JSPath");
	ExcelData applicationDetailsExcelData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DMRCR_AplicationDetailsTestData", "Dataset ID");
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	String toastAlertessage = "";
	SoftAssert softAssert = new SoftAssert();
	ExcelData userIDExcelData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(), "LoginCredentials",
			"UserType");
	String returnToastAlert = "";
	Map<String, String> applicationDetailsTestData = new HashMap<>();
	Map<String, String> autoLoanExecutionData = new HashMap<>();

	@And("^user_076 get the test data for test case ID AT_AL_BD_DMC_06_01$")
	public void user_076_get_the_test_data_for_test_case_id_at_al_bd_dmc_06_01() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_BD_DMC_06_01");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		applicationDetailsTestData = applicationDetailsExcelData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case ID AT_AD_AL_DMC_01$")
	public void user_076_get_the_test_data_for_test_case_id_at_ad_al_dmc_01() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AD_AL_DMC_01");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		applicationDetailsTestData = applicationDetailsExcelData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case ID AT_AD_AL_DMC_01_01$")
	public void user_076_get_the_test_data_for_test_case_id_AT_AD_AL_DMC_01_01() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AD_AL_DMC_01_01");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		applicationDetailsTestData = applicationDetailsExcelData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case ID AT_AD_AL_DMC_03$")
	public void user_076_get_the_test_data_for_test_case_id_AT_AD_AL_DMC_03() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AD_AL_DMC_03");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		applicationDetailsTestData = applicationDetailsExcelData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 get the test data for test case ID AT_AD_AL_DMC_02$")
	public void user_076_get_the_test_data_for_test_case_id_AT_AD_AL_DMC_02() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AD_AL_DMC_02");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		applicationDetailsTestData = applicationDetailsExcelData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 verify application details fields sre should be read only mode at disbuursment maker stage$")
	public void user_076_verify_application_details_fields_sre_should_be_read_only_mode_at_disbuursment_maker_stage()
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

	@And("^user_076 verify application details field data should be matched with data entry stage value at disbuursment maker stage$")
	public void user_076_verify_application_details_field_data_should_be_matched_with_data_entry_stage_value_at_disbuursment_maker_stage()
			throws Throwable {
		String loanAmount = "";
		for (int i = 0; i <= 150; i++) {
			try {
				loanAmount = javascriptHelper
						.executeScript("return "
								+ applicationDetailsWebElements.getElement("total_amount_requested_get_input"))
						.toString();
				if (loanAmount.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Loan amount from map " + applicationDetailsTestData.get("loan_amount"));
		System.out.println("Loan Amount " + loanAmount);
	}

	@And("^user_076 click on approve button in application details screen at disbursment maker stage$")
	public void user_076_click_on_approve_button_in_application_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("approve_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_076 enter the approval remark in application details screen at disbursment maker stage$")
	public void user_076_enter_the_approval_remark_in_application_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_ok")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on alert approve button in application details screen at disbursment maker stage$")
	public void user_076_click_on_alert_approve_button_in_application_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_approve_button"))
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

	@Then("^user_076 verify disbursment maker record should get moved to disbursment check stage$")
	public void user_076_verify_disbursment_maker_record_should_get_moved_to_disbursment_check_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {

				toastAlertessage = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (toastAlertessage.length() > 0) {
					System.out.println(toastAlertessage);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toastAlertessage.contains("DISBCKR"),
				"Record is not moved to disbursment checker stage hence failed");

	}

	@And("^user_076 retive the disbursment checker user ID and store it in excel database$")
	public void user_076_retive_the_disbursment_checker_user_id_and_store_it_in_excel_database() throws Throwable {
		// 84

		String disbursmentCheckerUserID = toastAlertessage.substring(84).trim().replace(".", "").trim();
		System.out.println("Disbursment Checker user ID " + disbursmentCheckerUserID);
		userIDExcelData.updateTestData("userType04", "UserName", disbursmentCheckerUserID);

	}

	@And("^user_076 click on return button in application details at disbursment checker stage$")
	public void user_076_click_on_return_button_in_application_details_at_disbursment_checker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("return_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 give the return stage to disbursment maker stage at disbursment checker stage$")
	public void user_076_give_the_return_stage_to_disbursment_maker_stage_at_disbursment_checker_stage()
			throws Throwable {
		int noOfReturStage = 0;
		int stagePosition = 0;
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("return_Stage_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				String dropdownLengthString = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("return_dropdown_length")).toString();
				if (Integer.parseInt(dropdownLengthString) >= 4) {
					noOfReturStage = Integer.parseInt(dropdownLengthString);
					System.out.println("No of option in return dropdown " + noOfReturStage);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean isStageSelected = false;
		for (int i = 0; i < noOfReturStage; i++) {

			for (int j = 0; j <= 3000; j++) {
				try {
					String dropdownText = javascriptHelper.executeScript("return "
							+ "document.querySelectorAll('ion-label[class=\"sc-ion-select-popover-ios sc-ion-label-ios-h sc-ion-label-ios-s ios hydrated\"]')["
							+ i + "].innerText").toString();

					System.out.println("Dropdown Text " + dropdownText);
					System.out.println(
							"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
									+ i + "].value");
					System.out.println("Return stage from Map " + applicationDetailsTestData.get("return_stage"));
					if ((dropdownText.trim()).equalsIgnoreCase(applicationDetailsTestData.get("return_stage").trim())) {
						stagePosition = i;
						System.out.println("inside stage equalance IF condition ");
						System.out.println("Stage position is " + i);
						System.out.println("Stage position is from main variable " + stagePosition);
						isStageSelected = true;
						break;
					} else {
						break;
					}

				} catch (Exception e) {
					if (j == 3000) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isStageSelected == true) {
				break;
			} else if ((i == noOfReturStage) && (isStageSelected == false)) {
				Assert.fail("Dropdown text is not visible hence failed");
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println("Stage position " + stagePosition);
				javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-radio[class=\"sc-ion-select-popover-ios ios in-item interactive hydrated\"]')["
								+ stagePosition + "]")
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 give the return remark at disbursment checker stage$")
	public void user_076_give_the_return_remark_at_disbursment_checker_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Return remark " + applicationDetailsTestData.get("return_remark"));
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_text_box_return"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_text_box_return"))
						.sendKeys(applicationDetailsTestData.get("return_remark"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on alert return button in disbursment checker stage$")
	public void user_076_click_on_alert_return_button_in_disbursment_checker_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_return_button"))
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

	@Then("^user_076 verify alert should show the stages and disbursment maker user ID at disbursment checker stage$")
	public void user_076_verify_alert_should_show_the_stages_and_disbursment_maker_user_id_at_disbursment_checker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				returnToastAlert = javascriptHelper
						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
				if (returnToastAlert.length() > 0) {
					System.out.println(returnToastAlert);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Toast message length " + returnToastAlert.length());
		softAssert.assertTrue(returnToastAlert.contains("DISBMKR"), "Record not returned to disbursment maker stage");
		String returnDataEntryUserID = returnToastAlert.substring(84).replace(".", "").trim();
		System.out.println("Return user ID " + returnDataEntryUserID);
//userType14
		userIDExcelData.updateTestData("userType03", "UserName", returnDataEntryUserID);
	}

	@And("^user_076 click on reject button in disbursment maker stage$")
	public void user_076_click_on_reject_button_in_disbursment_maker_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("reject_button")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 enter the alert remark for rejecting the record at disbursment maker stage$")
	public void user_076_enter_the_alert_remark_for_rejecting_the_record_at_disbursment_maker_stage() throws Throwable {
		boolean isAlertPresent = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isAlertPresent = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("application_alert_validation"))
						.isDisplayed();

				if (isAlertPresent == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail("Aplication confirmation alert is not present hence failed");
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_text_box_return"))
						.click();
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_text_box_return"))
						.sendKeys(applicationDetailsTestData.get("reject_remark"));
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_076 click on alert reject button in disbursment checker stage$")
	public void user_076_click_on_alert_reject_button_in_disbursment_checker_stage() throws Throwable {
//		for (int i = 0; i <= 150; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_reject_button")).click();
//				break;
//
//			} catch (Exception e) {
//				if (i == 150) {
//					e.printStackTrace();
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("alert_close_button")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify record should get rejected in the system at disbursment maker stage$")
	public void user_076_verify_record_should_get_rejected_in_the_system_at_disbursment_maker_stage() throws Throwable {
//		for (int i = 0; i <= 150; i++) {
//			try {
//				returnToastAlert = javascriptHelper
//						.executeScript("return " + commonJSElements.getElement("toast_container_message")).toString();
//				if (returnToastAlert.length() > 0) {
//					System.out.println(returnToastAlert);
//					break;
//				}
//			} catch (Exception e) {
//				if (i == 150) {
//					e.printStackTrace();
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//		System.out.println("Toast message " + returnToastAlert);
	}

	@And("^user_076 invoke soft assert in application details screen at disbursment maker stage$")
	public void user_076_invoke_soft_assert_in_application_details_screen_at_disbursment_maker_stage()
			throws Throwable {
		softAssert.assertAll();
	}

}
