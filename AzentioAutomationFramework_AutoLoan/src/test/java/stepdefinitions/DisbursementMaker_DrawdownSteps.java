package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.JSPaths;
import resources.BaseClass;

public class DisbursementMaker_DrawdownSteps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths drawdownJSPaths = new JSPaths(configFileReader.getJSFilePath(), "Drawdown_JSPaths", "Drawdown_Field_name",
			"JSPaths");
	JSPaths commonWebElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	int listViewIndex;

	@And("^user_076 click on drawdown section at disbursement maker stage$")
	public void user_076_click_on_drawdown_section_at_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(drawdownJSPaths.getElement("DSBR_Drawdown_section"))
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

	@And("^user_076 click on edit button in drawdown section at disbursement maker stage$")
	public void user_076_click_on_edit_button_in_drawdown_section_at_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(drawdownJSPaths.getElement("drawdown_section_edit_button"))
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

	@Then("^user_076 verify facility details section should be visible in drawdown at disbursement maker stage$")
	public void user_076_verify_facility_details_section_should_be_visible_in_drawdown_at_disbursement_maker_stage()
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

	@Then("^user_076 verify schedule details section should be visible in drawdown at disbursement maker stage$")
	public void user_076_verify_schedule_details_section_should_be_visible_in_drawdown_at_disbursement_maker_stage()
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

	@Then("^user_076 verify payment details section should be visible in drawdown at disbursement maker stage$")
	public void user_076_verify_payment_details_section_should_be_visible_in_drawdown_at_disbursement_maker_stage()
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

	@When("^user_076 click on back button in facility details section at disbursement maker stage$")
	public void user_076_click_on_back_button_in_facility_details_section_at_disbursement_maker_stage()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(commonWebElements.getElement("back_button")));
				javascriptHelper.executeScriptWithWebElement(commonWebElements.getElement("back_button")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	@Then("^user_076 verify system should navigate to back screen in drawdown at disbursement stage$")
	public void user_076_verify_system_should_navigate_to_back_screen_in_drawdown_at_disbursement_stage()
			throws Throwable {
		boolean isBackButtonWorking = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isBackButtonWorking = javascriptHelper
						.executeScriptWithWebElement(drawdownJSPaths.getElement("drawdown_section_edit_button"))
						.isDisplayed();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(isBackButtonWorking, "Back Button is not working in drawdown section hence failed");
	}

	@And("^user_076 find the payment details section index at disbursement in drawdown section maker stage$")
	public void user_076_find_the_payment_details_section_index_at_disbursement_in_drawdown_section_maker_stage()
			throws Throwable {
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

	@Then("^user_076 verify edit field should be visible in payment details list view in drawdown section at disbursement maker stage$")
	public void user_076_verify_edit_field_should_be_visible_in_payment_details_list_view_in_drawdown_section_at_disbursement_maker_stage()
			throws Throwable {
		String editQuery = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(1)').innerText";
		String editFieldValidation = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(1)')";
		String editFieldString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				System.out.println("Edit button query " + editQuery);
				editFieldString = javascriptHelper.executeScript("return " + editQuery).toString();

				if (editFieldString.length() > 0) {
					System.out.println("edit label " + editFieldString);
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
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(editFieldValidation));
				javascriptHelper.executeScriptWithWebElement(editFieldValidation).sendKeys("abcd");

			} catch (Exception e) {
				e.printStackTrace();
				isFieldEditble = true;
				break;
			}
		}
		softAssert.assertTrue(editFieldString.contains("Edit"), "Edit field name not mathed hence failed");
		softAssert.assertTrue(isFieldEditble, "Edit field is editable hence failed");
	}

	@Then("^user_076 verify disbursement amount field should be visible in payment details list view in drawdown section at disbursement maker stage$")
	public void user_076_verify_disbursement_amount_field_should_be_visible_in_payment_details_list_view_in_drawdown_section_at_disbursement_maker_stage()
			throws Throwable {
		String disbursementAmountQuery = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(2)').innerText";
		String disbursementAmountFieldValidation = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(2)')";
		String disbursementAmountString = "";
		boolean isFieldEditble = false;
		for (int i = 0; i <= 150; i++) {
			try {
				disbursementAmountString = javascriptHelper.executeScript("return " + disbursementAmountQuery)
						.toString();
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
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(disbursementAmountFieldValidation));
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

	@Then("^user_076 verify currency field should be visible in payment details list view in drawdown section at disbursement maker stage$")
	public void user_076_verify_currency_field_should_be_visible_in_payment_details_list_view_in_drawdown_section_at_disbursement_maker_stage()
			throws Throwable {
		String currencyQuery = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(3)').innerText";
		String currencyFieldValidation = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(3)')";
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
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(currencyFieldValidation));
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

	@Then("^user_076 verify loan account field should be visible in payment details list view in drawdown section at disbursement maker stage$")
	public void user_076_verify_loan_account_field_should_be_visible_in_payment_details_list_view_in_drawdown_section_at_disbursement_maker_stage()
			throws Throwable {
		String loanAccountNoQuery = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(4)').innerText";
		String loanAccountNoFieldValidation = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(4)')";
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

	@Then("^user_076 verify disbursement status field should be visible in payment details list view in drawdown section at disbursement maker stage$")
	public void user_076_verify_disbursement_status_field_should_be_visible_in_payment_details_list_view_in_drawdown_section_at_disbursement_maker_stage()
			throws Throwable {
		String disbursementStatusQuery = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(5)').innerText";
		String disbursementStatusFieldValidation = "document.querySelectorAll('ion-title[class=\"p-2 pull-left ion-color ion-color-dark md title-default hydrated\"]')["
				+ listViewIndex
				+ "].parentElement.parentElement.parentElement.nextSibling.nextSibling.querySelector('thead th:nth-child(5)')";
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

	@And("^user_076 invoke softAssert in drawdown section at disbursemnt stage$")
	public void user_076_invoke_softassert_in_drawdown_section_at_disbursemnt_stage() throws Throwable {
		softAssert.assertAll();
	}

}
