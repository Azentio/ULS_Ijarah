package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_DisbursmentMaker_PaymentScheduleSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths commonWebElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths paymentScheduleElements = new JSPaths(configFileReader.getJSFilePath(), "PaymentSchedule_JSPaths",
			"PaymentSchedule_fieldname", "JSPaths");
	// PaymentDetails_JSPaths
	JSPaths paymentDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "PaymentDetails_JSPaths",
			"PaymentDetails_fieldname", "JSPaths");
	JSPaths facilityDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "facilityInfo_JSpaths",
			"FacilityInfo_Elements", "JSPaths");
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData paymentScheduleExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DSBMKRCHR_PaymentSchedTestData", "Dataset ID");

	Map<String, String> autoloanExecutionData = new HashMap<>();
	Map<String, String> paymentScheuleTestData = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	@And("^user_076 click on payment schedule in disbursement maker stage$")
	public void user_076_click_on_payment_schedule_in_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(paymentScheduleElements.getElement("DSBR_PaymentSchedule_Tab"))
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

	@And("^user_076 click on edit button in payment schedule at disbursement maker stage$")
	public void user_076_click_on_edit_button_in_payment_schedule_at_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(paymentScheduleElements.getElement("payment_schedule_edit_button"))
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

	@Then("^user_076 payment schedule section should have facility details at disbursement maker stage$")
	public void user_076_payment_schedule_section_should_have_facility_details_at_disbursement_maker_stage()
			throws Throwable {
		int sectionLength = 0;
		boolean isSectionVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				String sectionStr = javascriptHelper
						.executeScript("return " + "document.querySelectorAll('ion-item ion-title').length").toString();
				sectionLength = Integer.parseInt(sectionStr);
				if (sectionLength >= 2) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		outer: for (int i = 0; i < sectionLength; i++) {
			inner: for (int j = 0; j <= 150; j++) {
				try {
					String sectionName = javascriptHelper
							.executeScript(
									"return " + "document.querySelectorAll('ion-item ion-title')[" + i + "].innerText")
							.toString();
					if (sectionName.equalsIgnoreCase("Facility Details")) {
						isSectionVisible = true;
						softAssert.assertTrue(isSectionVisible, "Facility details is not visible hence failed");

						break inner;

					}
				} catch (Exception e) {
					if (j == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}

				}

			}
			if (isSectionVisible == true) {
				break outer;
			}

		}
	}

	@Then("^user_076 payment schedule section should have payment details section at disbursement maker stage$")
	public void user_076_payment_schedule_section_should_have_payment_details_section_at_disbursement_maker_stage()
			throws Throwable {
		int sectionLength = 0;
		boolean isSectionVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				String sectionStr = javascriptHelper
						.executeScript("return " + "document.querySelectorAll('ion-item ion-title').length").toString();
				sectionLength = Integer.parseInt(sectionStr);
				if (sectionLength >= 2) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		outer: for (int i = 0; i < sectionLength; i++) {
			inner: for (int j = 0; j <= 150; j++) {
				try {
					String sectionName = javascriptHelper
							.executeScript(
									"return " + "document.querySelectorAll('ion-item ion-title')[" + i + "].innerText")
							.toString();
					if (sectionName.equalsIgnoreCase("Payment Details")) {
						isSectionVisible = true;
						softAssert.assertTrue(isSectionVisible, "Payment Details is not visible hence failed");

						break inner;

					}
				} catch (Exception e) {
					if (j == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}

				}

			}
			if (isSectionVisible == true) {
				break outer;
			}

		}
	}

	@Then("^user_076 payment schedule section should have back button at disbursement maker stage$")
	public void user_076_payment_schedule_section_should_have_back_button_at_disbursement_maker_stage()
			throws Throwable {
		boolean isBackButtonVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isBackButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonWebElements.getElement("back_button")).isDisplayed();
				if (isBackButtonVisible == true) {
					softAssert.assertTrue(isBackButtonVisible, "Back button not visible hence failed");
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify product field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_product_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("product_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " Product field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify sub product field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_sub_product_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("sub_product_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " sub Product field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify scheme field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_scheme_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("scheme_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " scheme field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify sanction date field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_sanction_date_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("sanction_date_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " sanction date field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify last disbursement date field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_last_disbursement_date_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("last_disbursement_date_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " last disbursment date field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify is tranche allowed field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_is_tranche_allowed_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("is_tranche_allowed_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " is tranche allowed field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify is loan no field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_is_loan_no_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("loan_no_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " loan no field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify is sanction amount field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_is_sanction_amount_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("sanction_amount_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " sanction amount field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify is disbursed amount field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_is_disbursed_amount_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("disbursed_amount_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " disbursed amount field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify is available amount field should be visible in facility details section at disbursement maker stage$")
	public void user_076_verify_is_available_amount_field_should_be_visible_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityDetailsElements.getElement("available_amount_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isFieldVisible, " available amount field is not visible hence failed");
				}
			}
		}
	}

	@And("^user_076 get the test data for test case ID AT_AL_PS_DSP_02$")
	public void user_076_get_the_test_data_for_test_case_id_at_al_ps_dsp_02() throws Throwable {
		autoloanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_PS_DSP_02");
		paymentScheuleTestData = paymentScheduleExcelTestData.getTestdata(autoloanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 click on add button in payment details at disbursement maker stage$")
	public void user_076_click_on_add_button_in_payment_details_at_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println(paymentDetailsElements.getElement("payment_details_add_button"));
				javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("payment_details_add_button"))
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

	@Then("^user_076 verify payment type field should be mandatory editable dropdown$")
	public void user_076_verify_payment_type_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String getMandatoryAttribute = "";
		String getFieldType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getMandatoryAttribute = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("payment_type_mandatory_verification"))
						.toString();
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("payment_type_dropdowm"))
						.getAttribute("ng-reflect-placeholder");
				if ((getMandatoryAttribute.length() > 0) && (getFieldType.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(getMandatoryAttribute.contains("*"), "Payment type field is non mandatory hence failed");
		softAssert.assertTrue(getFieldType.contains("Select"),
				"Payment type field is not a dropdown hence filed hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(paymentDetailsElements.getElement("payment_type_dropdowm"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(paymentScheuleTestData.get("Payment_type"));
	}

	@Then("^user_076 verify payee field should be mandatory editable dropdown$")
	public void user_076_verify_payee_field_should_be_mandatory_editable_dropdown() throws Throwable {
		String getMandatoryAttribute = "";
		String getFieldType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getMandatoryAttribute = javascriptHelper
						.executeScript("return " + paymentDetailsElements.getElement("payee_mandatory_verification"))
						.toString();
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("payee_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if ((getMandatoryAttribute.length() > 0) && (getFieldType.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(getMandatoryAttribute.contains("*"), "Payee field is non mandatory hence failed");
		softAssert.assertTrue(getFieldType.contains("Select"),
				"payee field is not a dropdown hence filed hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(paymentDetailsElements.getElement("payee_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(paymentScheuleTestData.get("payee"));
	}

	@Then("^user_076 verify planned date field should be non mandatory editable date field$")
	public void user_076_verify_planned_date_field_should_be_non_mandatory_editable_date_field() throws Throwable {
		String getMandatoryAttribute = "";
		String getFieldType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getMandatoryAttribute = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("planned_date_mandatory_verification"))
						.toString();
				getFieldType = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("planned_date_calendar_validation"))
						.toString();
				if ((getMandatoryAttribute.length() > 0) && (getFieldType.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(getMandatoryAttribute.contains("*")), "Planned date is mandatory field hence failed");
		softAssert.assertTrue(getFieldType.contains("p-calendar"), "Planned date is not a calendar field hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(paymentDetailsElements.getElement("planned_date_input"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonWebElements.getElement("today_date")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^user_076 verify planned scheduled amount field should be non mandatory editable input field$")
	public void user_076_verify_planned_scheduled_amount_field_should_be_non_mandatory_editable_input_field()
			throws Throwable {
		String getMandatoryAttribute = "";
		String getFieldType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getMandatoryAttribute = javascriptHelper
						.executeScript("return "
								+ paymentDetailsElements.getElement("planned_schedule_amount_mandatory_verification"))
						.toString();
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("planned_scheduled_amont_input"))
						.getAttribute("type");
				if ((getMandatoryAttribute.length() > 0) && (getFieldType.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(!(getMandatoryAttribute.contains("*")),
				"Planned scheduled amount field is mandatory hence failed");
		softAssert.assertTrue(getFieldType.contains("number"),
				"Planned scheduled amount field is not a textbox hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("planned_scheduled_amont_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("planned_scheduled_amont_input"))
						.sendKeys(paymentScheuleTestData.get("planned_scheduled_amount"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify currency field should be mandatory editable input field$")
	public void user_076_verify_currency_field_should_be_mandatory_editable_input_field() throws Throwable {
		String getMandatoryAttribute = "";
		String getFieldType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getMandatoryAttribute = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("currency_id_mandatory_verification"))
						.toString();
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("currency_id_dropdown"))
						.getAttribute("ng-reflect-placeholder");
				if ((getMandatoryAttribute.length() > 0) && (getFieldType.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(getMandatoryAttribute.contains("*"), "CUrrency field is non mandatory hence failed");
		softAssert.assertTrue(getFieldType.contains("Select"),
				"Currency field is not a dropdown hence filed hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(paymentDetailsElements.getElement("currency_id_dropdown"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(paymentScheuleTestData.get("currency"));
	}

	@Then("^user_076 verify scheduled notes field should be non mandatory editable textbox$")
	public void user_076_verify_scheduled_notes_field_should_be_non_mandatory_editable_textbox() throws Throwable {
		String getMandatoryAttribute = "";
		String getFieldType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getMandatoryAttribute = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("schedule_note_mandatory_verification"))
						.toString();
				getFieldType = javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("schedule_note_input"))
						.getAttribute("type");
				if ((getMandatoryAttribute.length() > 0) && (getFieldType.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertTrue(!(getMandatoryAttribute.contains("*")),
				"Planned scheduled note field is mandatory hence failed");
		softAssert.assertTrue(getFieldType.contains("text"),
				"Planned scheduled note field is not a textbox hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(paymentDetailsElements.getElement("schedule_note_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(paymentDetailsElements.getElement("schedule_note_input"))
						.sendKeys(paymentScheuleTestData.get("schedule_notes"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on save button in payment details screen$")
	public void user_076_click_on_save_button_in_payment_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(paymentDetailsElements.getElement("payment_details_save_button"))
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

	@Then("^user_076 verify system should show the save successful popup in payment details screen$")
	public void user_076_verify_system_should_show_the_save_successful_popup_in_payment_details_screen()
			throws Throwable {
		String savePopupMessage;
		for (int i = 0; i <= 150; i++) {
			try {
				savePopupMessage = javascriptHelper
						.executeScript("return " + commonWebElements.getElement("toast_container_message")).toString();
				if (savePopupMessage.length() > 0) {
					System.out.println(savePopupMessage);
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

	@Then("^user_076 verify payment details screen list view should have configured fields$")
	public void user_076_verify_payment_details_screen_list_view_should_have_configured_fields() throws Throwable {
		int listViewFieldLength = 0;
		String listViewFieldQuery = "document.querySelectorAll('p-table[class=\"p-element ng-star-inserted\"] th').length";
		boolean isDeleteButtonVisible = false;
		boolean isPaymentTypeFieldVisible = false;
		boolean isScheduleAmountFieldVisible = false;
		boolean isPlannedDateFieldVisible = false;
		boolean isCurrencyFieldVisible = false;
		boolean isScheduleNotesFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				String ListVieFieldStr = javascriptHelper.executeScript("return " + listViewFieldQuery).toString();
				listViewFieldLength = Integer.parseInt(ListVieFieldStr);

				if (listViewFieldLength > 5) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		outer: for (int i = 0; i < listViewFieldLength; i++) {

			inner: for (int j = 0; j <= 150; j++) {

				try {
					String fieldName = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('p-table[class=\"p-element ng-star-inserted\"] th')["
									+ i + "].innerText")
							.toString();
					if (fieldName.equalsIgnoreCase("Delete")) {
						isDeleteButtonVisible = true;
						break;
					}
					if (fieldName.equalsIgnoreCase("Payment Type")) {
						isPaymentTypeFieldVisible = true;
						break;
					}
					if (fieldName.equalsIgnoreCase("Schedule Amount")) {
						isScheduleAmountFieldVisible = true;
						break;
					}
					if (fieldName.equalsIgnoreCase("Planned Date")) {
						isPlannedDateFieldVisible = true;
						break;
					}
					if (fieldName.equalsIgnoreCase("Currency")) {
						isCurrencyFieldVisible = true;
						break;
					}
					if (fieldName.equalsIgnoreCase("Schedule Notes")) {
						isScheduleNotesFieldVisible = true;
						break;
					}

				}

				catch (Exception e) {
					if (j == 150) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}
		}
		softAssert.assertTrue(isDeleteButtonVisible, " Delete Button not visible hence failed");
		softAssert.assertTrue(isPaymentTypeFieldVisible, " Payment type field not visible hence failed");
		softAssert.assertTrue(isScheduleAmountFieldVisible, " Scheduled amount field not visible hence failed");
		softAssert.assertTrue(isPlannedDateFieldVisible, " Planned date field not visible hence failed");
		softAssert.assertTrue(isCurrencyFieldVisible, " Currency field not visible hence failed");
		softAssert.assertTrue(isScheduleNotesFieldVisible, " Scheduled notes field not visible hence failed");
	}

	@Then("^user_076 verify payment type field value should be matched with our saved record value in payment details screen$")
	public void user_076_verify_payment_type_field_value_should_be_matched_with_our_saved_record_value_in_payment_details_screen()
			throws Throwable {
		String paymentType = "";
		for (int i = 0; i <= 150; i++) {
			try {
				paymentType = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("get_list_view_payment_type_value"))
						.toString();
				if (paymentType.length() > 0) {
					System.out.println("Payment type " + paymentType);
					System.out.println("Map Payment type " + paymentScheuleTestData.get("Payment_type"));
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(paymentType.contains(paymentScheuleTestData.get("Payment_type")),
				"Payment type list view record is not matched with excel data hence failed ");
	}

	@Then("^user_076 verify scheduled amount field value should be matched with our saved record value in payment details screen$")
	public void user_076_verify_scheduled_amount_field_value_should_be_matched_with_our_saved_record_value_in_payment_details_screen()
			throws Throwable {
		String scheduledAmount = "";
		for (int i = 0; i <= 150; i++) {
			try {
				scheduledAmount = javascriptHelper
						.executeScript(
								"return " + paymentDetailsElements.getElement("get_list_view_scheduled_amount_value"))
						.toString();
				if (scheduledAmount.length() > 0) {
					System.out.println("Scheduled amount " + scheduledAmount);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(scheduledAmount, paymentScheuleTestData.get("planned_scheduled_amount"),
				"Planned scheduled amount list view record is not matched with excel data hence failed ");
	}

	@Then("^user_076 verify currency field value should be matched with our saved record value in payment details screen$")
	public void user_076_verify_currency_field_value_should_be_matched_with_our_saved_record_value_in_payment_details_screen()
			throws Throwable {
		String currency = "";
		for (int i = 0; i <= 150; i++) {
			try {
				currency = javascriptHelper
						.executeScript("return " + paymentDetailsElements.getElement("get_list_view_currency_value"))
						.toString();
				if (currency.length() > 0) {
					System.out.println("Currency " + currency);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(currency, paymentScheuleTestData.get("currency"),
				"Currency list view record is not matched with excel data hence failed ");
	}

	@Then("^user_076 verify scheduled notes field value should be matched with our saved record value in payment details screen$")
	public void user_076_verify_scheduled_notes_field_value_should_be_matched_with_our_saved_record_value_in_payment_details_screen()
			throws Throwable {
		String scheduledNotes = "";
		for (int i = 0; i <= 150; i++) {
			try {
				scheduledNotes = javascriptHelper
						.executeScript("return " + paymentDetailsElements.getElement("get_scheduled_note_value"))
						.toString();
				if (scheduledNotes.length() > 0) {
					System.out.println("Scheduled notes " + scheduledNotes);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertEquals(scheduledNotes, paymentScheuleTestData.get("schedule_notes"),
				"Scheduled notes list view record is not matched with excel data hence failed ");
	}

	@And("^user_076 invoke soft assert in payment schedule at disbursement stage$")
	public void user_076_invoke_soft_assert_in_payment_schedule_at_disbursement_stage() throws Throwable {
		softAssert.assertAll();
	}

}
