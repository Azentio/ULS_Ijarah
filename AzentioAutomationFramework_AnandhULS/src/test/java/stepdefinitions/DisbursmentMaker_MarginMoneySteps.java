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

public class DisbursmentMaker_MarginMoneySteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths marginMoneyWebElements = new JSPaths(configFileReader.getJSFilePath(), "MarginMoney_JSPaths",
			"MarginMoney_FieldName", "JSPaths");
	JSPaths commonWebElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	ExcelData marginMoneyExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DMRCR_MarginMoneyTestData", "Dataset ID");
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	Map<String, String> autoLoanExecutionData = new HashMap<>();
	Map<String, String> marginMoneyTestData = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 get the test data for test case ID AT_AL_DSB_MM_02$")
	public void user_076_get_the_test_data_for_test_case_id_at_al_dsb_mm_02() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_DSB_MM_02");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		marginMoneyTestData = marginMoneyExcelTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 get the test data for test case ID AT_AL_DSB_MM_03$")
	public void user_076_get_the_test_data_for_test_case_id_at_al_dsb_mm_03() throws Throwable {
		autoLoanExecutionData = autoLoanExecutionSheet.getTestdata("AT_AL_DSB_MM_03");
		System.out.println(autoLoanExecutionData.get("dataSet_ID"));
		marginMoneyTestData = marginMoneyExcelTestData.getTestdata(autoLoanExecutionData.get("dataSet_ID"));

	}

	@And("^user_076 click on margin money section at disbursement maker stage$")
	public void user_076_click_on_margin_money_section_at_disbursement_maker_stage() throws Throwable {

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("dsb_margin_money_section"))
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

	@And("^user_076 click on add button in margin money at disbursement maker stage$")
	public void user_076_click_on_add_button_in_margin_money_at_disbursement_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("dsb_margin_money_add_button"))
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

	@Then("^user_076 verify margin money screen should have save button$")
	public void user_076_verify_margin_money_screen_should_have_save_button() throws Throwable {
		boolean isSaveButtonVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isSaveButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonWebElements.getElement("save_button")).isDisplayed();
				if (isSaveButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					if (i == 150) {
						softAssert.fail("Save button is not visible");
					}

				}
			}
		}

	}

	@Then("^user_076 verify margin money screen should have back button$")
	public void user_076_verify_margin_money_screen_should_have_back_button() throws Throwable {
		boolean isBackButtonVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isBackButtonVisible = javascriptHelper
						.executeScriptWithWebElement(commonWebElements.getElement("back_button")).isDisplayed();
				if (isBackButtonVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					if (i == 150) {
						softAssert.fail("Back button is not visible");
					}

				}
			}
		}
	}

	@Then("^user_076 verify margin money screen should have own contribution field$")
	public void user_076_verify_margin_money_screen_should_have_own_contribution_field() throws Throwable {
		boolean isOwnContributionFieldVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isOwnContributionFieldVisible = javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.isDisplayed();
				if (isOwnContributionFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					if (i == 150) {
						softAssert.fail("Own contribution field not visible hence failed");
					}

				}
			}
		}
	}

	@Then("^user_076 verify margin money screen should have amount field$")
	public void user_076_verify_margin_money_screen_should_have_amount_field() throws Throwable {
		boolean isOwnContributionFieldVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isOwnContributionFieldVisible = javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input")).isDisplayed();
				if (isOwnContributionFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					if (i == 150) {
						softAssert.fail("Own contribution field not visible hence failed");
					}

				}
			}
		}
	}

	@Then("^user_076 verify margin money screen should have own contribution amount paid field$")
	public void user_076_verify_margin_money_screen_should_have_own_contribution_amount_paid_field() throws Throwable {
		boolean isOwnCOntributionAmountPaidVisible = false;

		for (int i = 0; i <= 150; i++) {
			try {
				isOwnCOntributionAmountPaidVisible = javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_paid"))
						.isDisplayed();
				if (isOwnCOntributionAmountPaidVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					if (i == 150) {
						softAssert.fail("Own contribution amount paid field not visible hence failed");
					}

				}
			}
		}
	}

	@And("^user_076 verify own contribution amount field should be non mandatory text box in margin money screen$")
	public void user_076_verify_own_contribution_amount_field_should_be_non_mandatory_text_box_in_margin_money_screen()
			throws Throwable {

		String mandatoryText = "";
		String tagName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryText = javascriptHelper
						.executeScript("return "
								+ marginMoneyWebElements.getElement("own_contribution_mandatory_verification"))
						.toString();
				tagName = javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.getTagName();
				if ((mandatoryText.length() > 0) && (tagName.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryText.contains("*")),
				" Own contribution amount field is a mandatory field hence failed");
		softAssert.assertTrue(tagName.contains("input"),
				" Own contribution amount field is not a input field hence failed");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.sendKeys(marginMoneyTestData.get("own_contribution_amount"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 verify amount field should be non mandatory text box in margin money screen in margin money screen$")
	public void user_076_verify_amount_field_should_be_non_mandatory_text_box_in_margin_money_screen_in_margin_money_screen()
			throws Throwable {
		String mandatoryText = "";
		String tagName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryText = javascriptHelper
						.executeScript(
								"return " + marginMoneyWebElements.getElement("amount_field_mandatory_verification"))
						.toString();
				tagName = javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input")).getTagName();
				if ((mandatoryText.length() > 0) && (tagName.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryText.contains("*")), "  Amount field is a mandatory field hence failed");
		softAssert.assertTrue(tagName.contains("input"), "  Amount field is not a input field hence failed");

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input")).click();
				javascriptHelper.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input"))
						.sendKeys(marginMoneyTestData.get("amount"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 verify own contribution amount paid field should be non mandatory dropdown in margin money screen$")
	public void user_076_verify_own_contribution_amount_paid_field_should_be_non_mandatory_dropdown_in_margin_money_screen()
			throws Throwable {
		String mandatoryText = "";
		String tagName = "";
		for (int i = 0; i <= 150; i++) {
			try {
				mandatoryText = javascriptHelper.executeScript("return "
						+ marginMoneyWebElements.getElement("own_contribution_amount_paid_mandatory_verification"))
						.toString();
				tagName = javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_paid"))
						.getTagName();

				if ((mandatoryText.length() > 0) && (tagName.length() > 0)) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(!(mandatoryText.contains("*")),
				"  own contribution amount paid field is a mandatory field hence failed");
		softAssert.assertTrue(tagName.contains("ion-select"),
				"  own contribution amount paid field is not a dropdown field hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_paid"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		clicksAndActionsHelper.jsSelectUsingText(marginMoneyTestData.get("own_contribution_amount_paid"));
	}

	@And("^user_076 click on save button in margin money screen$")
	public void user_076_click_on_save_button_in_margin_money_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonWebElements.getElement("save_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify margin money screen should show the save successful popup while save the record$")
	public void user_076_verify_margin_money_screen_should_show_the_save_successful_popup_while_save_the_record()
			throws Throwable {
		String saveButtonValidationMessgae = "";
		for (int i = 0; i <= 150; i++) {
			try {
				saveButtonValidationMessgae = javascriptHelper
						.executeScript("return " + commonWebElements.getElement("toast_container_message")).toString();
				if (saveButtonValidationMessgae.length() > 0) {
					System.out.println(saveButtonValidationMessgae);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(saveButtonValidationMessgae.contains("Success!"),
				" Margin money record not saved hence failed");
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						commonWebElements.getElement("toast_container_message_close_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 enter character input in own contribution amount field in margin money screen$")
	public void user_076_enter_character_input_in_own_contribution_amount_field_in_margin_money_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.sendKeys(marginMoneyTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^user_076 verify own contribution amount should not accept character input in margin money screen$")
	public void user_076_verify_own_contribution_amount_should_not_accept_character_input_in_margin_money_screen()
			throws Throwable {
		String getOwnContributionValue = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getOwnContributionValue = javascriptHelper
						.executeScript(
								"return " + marginMoneyWebElements.getElement("get_own_contribution_amount_value"))
						.toString();
				if (getOwnContributionValue.length() == 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(getOwnContributionValue.length() == 0,
							"Own contribution amount field accepts character input hence failed");
				}
			}
		}

	}

	@And("^user_076 enter special character input in own contribution amount field in margin money screen$")
	public void user_076_enter_special_character_input_in_own_contribution_amount_field_in_margin_money_screen()
			throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("own_contribution_amount_input"))
						.sendKeys(marginMoneyTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify own contribution amount should not accept special character input in margin money screen$")
	public void user_076_verify_own_contribution_amount_should_not_accept_special_character_input_in_margin_money_screen()
			throws Throwable {
		String getOwnContributionValue = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getOwnContributionValue = javascriptHelper
						.executeScript(
								"return " + marginMoneyWebElements.getElement("get_own_contribution_amount_value"))
						.toString();
				if (getOwnContributionValue.length() == 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(getOwnContributionValue.length() == 0,
							"Own contribution amount field accepts special character input hence failed");
				}
			}
		}
	}

	@And("^user_076 enter character input in amount field in margin money screen$")
	public void user_076_enter_character_input_in_amount_field_in_margin_money_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input"))
						.sendKeys(marginMoneyTestData.get("character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify amount should not accept character input in margin money screen$")
	public void user_076_verify_amount_should_not_accept_character_input_in_margin_money_screen() throws Throwable {
		String getOwnContributionValue = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getOwnContributionValue = javascriptHelper
						.executeScript(
								"return " + marginMoneyWebElements.getElement("get_amount_value"))
						.toString();
				if (getOwnContributionValue.length() == 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(getOwnContributionValue.length() == 0,
							" Amount field accepts character input hence failed");
				}
			}
		}
	}

	@And("^user_076 enter special character input in amount field in margin money screen$")
	public void user_076_enter_special_character_input_in_amount_field_in_margin_money_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input"))
						.click();
				javascriptHelper
						.executeScriptWithWebElement(marginMoneyWebElements.getElement("amount_input"))
						.sendKeys(marginMoneyTestData.get("special_character_input"));
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify amount should not accept special character input in margin money screen$")
	public void user_076_verify_amount_should_not_accept_special_character_input_in_margin_money_screen()
			throws Throwable {
		String getOwnContributionValue = "";
		for (int i = 0; i <= 150; i++) {
			try {
				getOwnContributionValue = javascriptHelper
						.executeScript(
								"return " + marginMoneyWebElements.getElement("get_amount_value"))
						.toString();
				if (getOwnContributionValue.length() == 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					softAssert.assertTrue(getOwnContributionValue.length() == 0,
							" Amount field accepts special character input hence failed");
				}
			}
		}
	}

	@Then("^user_076 invoke soft assert in margin money section$")
	public void user_076_invoke_soft_assert_in_margin_money_section() throws Throwable {
		softAssert.assertAll();
	}

}
