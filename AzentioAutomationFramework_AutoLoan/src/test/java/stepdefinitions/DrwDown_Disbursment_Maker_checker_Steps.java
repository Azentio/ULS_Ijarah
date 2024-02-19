package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class DrwDown_Disbursment_Maker_checker_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths drawdownElements = new JSPaths(configFileReader.getJSFilePath(), "DrawdownDetails_JSPaths",
			"DrawdownDetails_Field_name", "JSPaths");
	JSPaths facilityElements = new JSPaths(configFileReader.getJSFilePath(), "facilityInfo_JSpaths",
			"FacilityInfo_Elements", "JSPaths");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	int listViewIndex = 0;

	@And("^user_076 click on drawdown details section in disbursement maker stage$")
	public void user_076_click_on_drawdown_details_section_in_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(drawdownElements.getElement("DSBR_Drawdown_section"))
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

	@And("^user_076 click on edit button in drawdown details at disbursement maker stage$")
	public void user_076_click_on_edit_button_in_drawdown_details_at_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(drawdownElements.getElement("drawdown_section_edit_button"))
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

	@Then("^user_076 verify facility details section should be visible in drawdown details at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_be_visible_in_drawdown_details_at_disbursement_maker_stage()
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
						softAssert.assertTrue(isSectionVisible, "Facility Details is not visible hence failed");

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

	@Then("^user_076 verify schedule details section should be visible in drawdown details at disbursement maker stage$")
	public void user_076_verify_schedule_details_section_should_be_visible_in_drawdown_details_at_disbursement_maker_stage()
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
					if (sectionName.equalsIgnoreCase("Schedule Details")) {
						isSectionVisible = true;
						softAssert.assertTrue(isSectionVisible, "Schedule Details is not visible hence failed");

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

	@Then("^user_076 verify payment details section should be visible in drawdown details at disbursement maker stage$")
	public void user_076_verify_payment_details_section_should_be_visible_in_drawdown_details_at_disbursement_maker_stage()
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

	@Then("^user_076 verify drawdown breakup section should be visible in drawdown details at disbursement maker stage$")
	public void user_076_verify_drawdown_breakup_section_should_be_visible_in_drawdown_details_at_disbursement_maker_stage()
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
					if (sectionName.equalsIgnoreCase("Drawdown BreakUp")) {
						isSectionVisible = true;
						softAssert.assertTrue(isSectionVisible, "Drawdown BreakUp is not visible hence failed");

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

	@Then("^user_076 verify facility details section should have product field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_product_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		// facilityElements
		boolean isProductFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isProductFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("product_field")).isDisplayed();
				if (isProductFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isProductFieldVisible, "Product field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have sub product field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_sub_product_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isSubProductFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isSubProductFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("sub_product_field")).isDisplayed();
				if (isSubProductFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isSubProductFieldVisible, "Sub Product field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have scheme field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_scheme_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isSchemeFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isSchemeFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("sub_product_field")).isDisplayed();
				if (isSchemeFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isSchemeFieldVisible, "Scheme field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have sanction date field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_sanction_date_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isSanctionDateFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isSanctionDateFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("sanction_date_field")).isDisplayed();
				if (isSanctionDateFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isSanctionDateFieldVisible,
							"Sanction date field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have last disbursement date field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_last_disbursement_date_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isLastDisbursedDateFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isLastDisbursedDateFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("last_disbursement_date_field"))
						.isDisplayed();
				if (isLastDisbursedDateFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isLastDisbursedDateFieldVisible,
							"Last disbursed date field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have is tranche allowed field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_is_tranche_allowed_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isTrancheAllwedFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isTrancheAllwedFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("is_tranche_allowed_field"))
						.isDisplayed();
				if (isTrancheAllwedFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isTrancheAllwedFieldVisible,
							"Is Tranche Allowed field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have loan no field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_loan_no_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isLoanNoFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isLoanNoFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("loan_no_field")).isDisplayed();
				if (isLoanNoFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isLoanNoFieldVisible, "Loan no field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have sanction amount field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_sanction_amount_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isSanctionAmountFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isSanctionAmountFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("sanction_amount_field"))
						.isDisplayed();
				if (isSanctionAmountFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isSanctionAmountFieldVisible,
							"Sanction amount field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have disbursed amount field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_disbursed_amount_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isDisbursedAmountFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isDisbursedAmountFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("disbursed_amount_field"))
						.isDisplayed();
				if (isDisbursedAmountFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isDisbursedAmountFieldVisible,
							"Disbursed amount field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have currenct disbursed amount field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_currenct_disbursed_amount_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isCurrenctDisbursedAmountFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isCurrenctDisbursedAmountFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("current_disbursed_amount_field"))
						.isDisplayed();
				if (isCurrenctDisbursedAmountFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isCurrenctDisbursedAmountFieldVisible,
							"Current Disbursed amount field is not visible hence failed");
				}
			}
		}
	}

	@Then("^user_076 verify facility details section should have available amount field in drawdown details section at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_have_available_amount_field_in_drawdown_details_section_at_disbursement_maker_stage()
			throws Throwable {
		boolean isAvailableAmountFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isAvailableAmountFieldVisible = javascriptHelper
						.executeScriptWithWebElement(facilityElements.getElement("available_amount_field"))
						.isDisplayed();
				if (isAvailableAmountFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(isAvailableAmountFieldVisible,
							"Available amount field is not visible hence failed");
				}
			}
		}
	}

	@And("^user_076 find the payment schedule details section at disbursment maker stage$")
	public void user_076_find_the_payment_schedule_details_section_at_disbursment_maker_stage() throws Throwable {
		String listViewLength = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]').length";
		int noOfListView = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				String strNoOfListView = javascriptHelper.executeScript("return " + listViewLength).toString();
				noOfListView = Integer.parseInt(strNoOfListView);
				if (noOfListView > 3) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		for (int i = 0; i < noOfListView; i++) {
			try {
				String listViewTitle = javascriptHelper.executeScript("return "
						+ "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText").toString();
				if (listViewTitle.equalsIgnoreCase("Schedule Details")) {
					listViewIndex = i;
					break;
				}
			} catch (Exception e) {
				if (i == noOfListView) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify payment for field should be visible in schedule section list view at disbursment maker stage$")
	public void user_076_verify_payment_for_field_should_be_visible_in_schedule_section_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String paymentTypeQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(1)').innerText";
		String paymentTypeFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(1)')";
		String paymentForString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				paymentForString = javascriptHelper.executeScript("return " + paymentTypeQuery).toString();
				if (paymentForString.length() > 0) {
					System.out.println("Payment For label Name " + paymentForString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(paymentTypeFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}

		softAssert.assertTrue(paymentForString.contains("Payment For"),
				"Payment for field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Payment for field is editable hence failed");
	}

	@Then("^user_076 verify schedule amount field should be visible in schedule section list view at disbursment maker stage$")
	public void user_076_verify_schedule_amount_field_should_be_visible_in_schedule_section_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String scheduleAmountQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(2)').innerText";
		String scheduleAmountFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(2)')";
		String scheduledAmountString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				scheduledAmountString = javascriptHelper.executeScript("return " + scheduleAmountQuery).toString();
				if (scheduledAmountString.length() > 0) {
					System.out.println("Payment For label Name " + scheduledAmountString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(scheduleAmountFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}

		softAssert.assertTrue(scheduledAmountString.contains("Schedule Amount"),
				"Schedule amount field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Schedule Amount field is editable hence failed");
	}

	@Then("^user_076 verify planned date field should be visible in schedule section list view at disbursment maker stage$")
	public void user_076_verify_planned_date_field_should_be_visible_in_schedule_section_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String plannedDateQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(3)').innerText";
		String plannedDateFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(3)')";
		String plannedDateString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				plannedDateString = javascriptHelper.executeScript("return " + plannedDateQuery).toString();
				if (plannedDateString.length() > 0) {
					System.out.println("Planned date Name " + plannedDateString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(plannedDateFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}

		softAssert.assertTrue(plannedDateString.contains("Planned Date"),
				"Planned Date field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Planned Date field is editable hence failed");
	}

	@Then("^user_076 verify currency field should be visible in schedule section list view at disbursment maker stage$")
	public void user_076_verify_currency_field_should_be_visible_in_schedule_section_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String currencyQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(4)').innerText";
		String currencyFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(4)')";
		String currencyString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				currencyString = javascriptHelper.executeScript("return " + currencyQuery).toString();
				if (currencyString.length() > 0) {
					System.out.println("Currency label " + currencyString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(currencyFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}

		softAssert.assertTrue(currencyString.contains("Currency"), "Currency field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Currency field is editable hence failed");
	}

	@Then("^user_076 verify schedule notes field should be visible in schedule section list view at disbursment maker stage$")
	public void user_076_verify_schedule_notes_field_should_be_visible_in_schedule_section_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String scheduleNotesQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(5)').innerText";
		String scheduleNotesFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(5)')";
		String scheduleNotesString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				scheduleNotesString = javascriptHelper.executeScript("return " + scheduleNotesQuery).toString();
				if (scheduleNotesString.length() > 0) {
					System.out.println("schedule Notes label " + scheduleNotesString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(scheduleNotesFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(scheduleNotesString.contains("Schedule Notes"),
				"Schedule notes field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Schedule notes field is editable hence failed");
	}

	@And("^user_076 find the dradown breakup section at disbursment maker stage$")
	public void user_076_find_the_dradown_breakup_section_at_disbursment_maker_stage() throws Throwable {
		String listViewLength = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]').length";
		int noOfListView = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				String strNoOfListView = javascriptHelper.executeScript("return " + listViewLength).toString();
				noOfListView = Integer.parseInt(strNoOfListView);
				if (noOfListView > 3) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		for (int i = 0; i < noOfListView; i++) {
			try {
				String listViewTitle = javascriptHelper.executeScript("return "
						+ "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText").toString();
				if (listViewTitle.equalsIgnoreCase("Drawdown BreakUp")) {
					listViewIndex = i;
					break;
				}
			} catch (Exception e) {
				if (i == noOfListView) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify edit field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_edit_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {

		String editQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(1)').innerText";
		String editFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(1)')";
		String editString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				editString = javascriptHelper.executeScript("return " + editQuery).toString();
				if (editString.length() > 0) {
					System.out.println("Edit label label " + editString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(editFieldValidation));
				javascriptHelper.executeScriptWithWebElement(editFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(editString.contains("Edit"),
				"Edit field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Edit field is editable hence failed");

	}

	@Then("^user_076 verify drawdown ID field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_drawdown_id_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String drawdownIDQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(2)').innerText";
		String drawdownIDFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(2)')";
		String drawdownIDString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				drawdownIDString = javascriptHelper.executeScript("return " + drawdownIDQuery).toString();
				if (drawdownIDString.length() > 0) {
					System.out.println("drawdown ID label label " + drawdownIDString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(drawdownIDFieldValidation));
				javascriptHelper.executeScriptWithWebElement(drawdownIDFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(drawdownIDString.contains("Drawdown Id"),
				"Drawdown Id field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Drawdown Id field is editable hence failed");
	}

	@Then("^user_076 verify beneficiary ID field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_beneficiary_id_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String beneficiaryIDQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(3)').innerText";
		String beneficiaryIDFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(3)')";
		String beneficiaryIDString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				beneficiaryIDString = javascriptHelper.executeScript("return " + beneficiaryIDQuery).toString();
				if (beneficiaryIDQuery.length() > 0) {
					System.out.println("beneficiary ID label label " + beneficiaryIDString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(beneficiaryIDFieldValidation));
				javascriptHelper.executeScriptWithWebElement(beneficiaryIDFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(beneficiaryIDString.contains("Beneficiary Id"),
				"Beneficiary Id field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Beneficiary Id field is editable hence failed");
	}

	@Then("^user_076 verify beneficiary name field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_beneficiary_name_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String beneficiaryNameQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(4)').innerText";
		String beneficiaryNameFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(4)')";
		String beneficiaryNameString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				beneficiaryNameString = javascriptHelper.executeScript("return " + beneficiaryNameQuery).toString();
				if (beneficiaryNameString.length() > 0) {
					System.out.println("beneficiary Name label label " + beneficiaryNameString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(beneficiaryNameFieldValidation));
				javascriptHelper.executeScriptWithWebElement(beneficiaryNameFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(beneficiaryNameString.contains("Beneficiary Name"),
				"Beneficiary Name field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Beneficiary Name field is editable hence failed");
	}

	@Then("^user_076 verify drawdown amount field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_drawdown_amount_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String drawdownAmountQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(5)').innerText";
		String drawdownamountFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(5)')";
		String drawdownAmountString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				drawdownAmountString = javascriptHelper.executeScript("return " + drawdownAmountQuery).toString();
				if (drawdownAmountString.length() > 0) {
					System.out.println("drawdown amount label " + drawdownAmountString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(drawdownamountFieldValidation));
				javascriptHelper.executeScriptWithWebElement(drawdownamountFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(drawdownAmountString.contains("Drawdown Amount"),
				"Drawdown Amount field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Drawdown Amount field is editable hence failed");
	}

	@Then("^user_076 verify currency field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_currency_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String currencyQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(6)').innerText";
		String currencyFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(6)')";
		String currencyString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				currencyString = javascriptHelper.executeScript("return " + currencyQuery).toString();
				if (currencyString.length() > 0) {
					System.out.println("currency label " + currencyString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(currencyFieldValidation));
				javascriptHelper.executeScriptWithWebElement(currencyFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(currencyString.contains("Currency"),
				"Currency field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Currency field is editable hence failed");
	}

	@Then("^user_076 verify payment status field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_payment_status_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String paymentStatusQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(7)').innerText";
		String paymentStatusFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(7)')";
		String paymentStatusString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				paymentStatusString = javascriptHelper.executeScript("return " + paymentStatusQuery).toString();
				if (paymentStatusString.length() > 0) {
					System.out.println("Payment status label " + paymentStatusString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(paymentStatusFieldValidation));
				javascriptHelper.executeScriptWithWebElement(paymentStatusFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(paymentStatusString.contains("Payment Status"),
				"Payment Status field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Payment Status field is editable hence failed");
	}
	

	@Then("^user_076 verify status field should be visible in drawdown breakup list view at disbursment maker stage$")
	public void user_076_verify_status_field_should_be_visible_in_drawdown_breakup_list_view_at_disbursment_maker_stage()
			throws Throwable {
		String statusQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(8)').innerText";
		String statusFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(8)')";
		String statusString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				statusString = javascriptHelper.executeScript("return " + statusQuery).toString();
				if (statusString.length() > 0) {
					System.out.println("Status label " + statusString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(statusFieldValidation));
				javascriptHelper.executeScriptWithWebElement(statusFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(statusString.contains("Status"),
				"Status field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Status field is editable hence failed");
	}
	@And("^user_076 find the payment details section index at disbursement maker stage$")
	public void user_076_find_the_payment_details_section_index_at_disbursement_maker_stage()throws Throwable{
		String listViewLength = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]').length";
		int noOfListView = 0;
		for (int i = 0; i <= 150; i++) {
			try {
				String strNoOfListView = javascriptHelper.executeScript("return " + listViewLength).toString();
				noOfListView = Integer.parseInt(strNoOfListView);
				if (noOfListView > 3) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		for (int i = 0; i < noOfListView; i++) {
			try {
				String listViewTitle = javascriptHelper.executeScript("return "
						+ "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
						+ i + "].innerText").toString();
				if (listViewTitle.equalsIgnoreCase("Payment Details")) {
					listViewIndex = i;
					break;
				}
			} catch (Exception e) {
				if (i == noOfListView) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("^user_076 verify disbursement amount field should be visible in payment details list view at disbursement maker stage$")
	public void user_076_verify_disbursement_amount_field_should_be_visible_in_payment_details_list_view_at_disbursement_maker_stage()throws Throwable{
		String disbursementAmountQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(1)').innerText";
		String disbursementAmountFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(1)')";
		String disbursementAmountString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				disbursementAmountString = javascriptHelper.executeScript("return " + disbursementAmountQuery).toString();
				if (disbursementAmountString.length() > 0) {
					System.out.println("disbursement amount label " + disbursementAmountString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(disbursementAmountFieldValidation));
				javascriptHelper.executeScriptWithWebElement(disbursementAmountFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(disbursementAmountString.contains("Disbursement Amount"),
				"Disbursement amount field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Disbursement amount field is editable hence failed");
	}
	@Then("^user_076 verify currency field should be visible in payment details list view at disbursement maker stage$")
	public void user_076_verify_currency_field_should_be_visible_in_payment_details_list_view_at_disbursement_maker_stage()throws Throwable{
		String currencyQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(2)').innerText";
		String currencyFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(2)')";
		String currencyString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				currencyString = javascriptHelper.executeScript("return " + currencyQuery).toString();
				if (currencyString.length() > 0) {
					System.out.println("Currency label " + currencyString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(currencyFieldValidation));
				javascriptHelper.executeScriptWithWebElement(currencyFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(currencyString.contains("Currency"),
				"Currency field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Currency field is editable hence failed");
	}
	@Then("^user_076 verify loan account field should be visible in payment details list view at disbursement maker stage$")
	public void user_076_verify_loan_account_field_should_be_visible_in_payment_details_list_view_at_disbursement_maker_stage()throws Throwable{
		String loanAccountNoQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(3)').innerText";
		String loanAccountNoFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(3)')";
		String loanAccountNoString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				loanAccountNoString = javascriptHelper.executeScript("return " + loanAccountNoQuery).toString();
				if (loanAccountNoString.length() > 0) {
					System.out.println("loan account label " + loanAccountNoString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(loanAccountNoFieldValidation));
				javascriptHelper.executeScriptWithWebElement(loanAccountNoFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(loanAccountNoString.contains("Loan Account No"),
				"Loan Account No field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Loan Account No field is editable hence failed");
	}
	@Then("^user_076 verify disbursement status field should be visible in payment details list view at disbursement maker stage$")
	public void user_076_verify_disbursement_status_field_should_be_visible_in_payment_details_list_view_at_disbursement_maker_stage()throws Throwable{
		String disbursementStatusQuery = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(4)').innerText";
		String disbursementStatusFieldValidation = "document.querySelectorAll('ion-title[class=\\\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\\\"]')["
				+ listViewIndex
				+ "].parentNode.parentElement.parentElement.nextElementSibling.querySelector('thead th:nth-child(4)')";
		String disbursementStatusString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				disbursementStatusString = javascriptHelper.executeScript("return " + disbursementStatusQuery).toString();
				if (disbursementStatusString.length() > 0) {
					System.out.println("disbursement status label " + disbursementStatusString);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 10; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(disbursementStatusFieldValidation));
				javascriptHelper.executeScriptWithWebElement(disbursementStatusFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(disbursementStatusString.contains("Disb Status"),
				"Disb Status field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Disb Status field is editable hence failed");
	}

	@And("^user_076 invoke soft assert in drawdown details at disbursment maker checker stage$")
	public void user_076_invoke_soft_assert_in_drawdown_details_at_disbursment_maker_checker_stage() throws Throwable {
		softAssert.assertAll();
	}
}
