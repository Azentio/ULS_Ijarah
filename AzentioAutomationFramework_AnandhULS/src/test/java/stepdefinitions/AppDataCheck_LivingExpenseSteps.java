package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AppDataCheck_LivingExpenseSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JSPaths livingExpenseWebElements = new JSPaths(configFileReader.getJSFilePath(), "LivingExpense_JSPaths",
			"LivingExpense_Elements", "JSPaths");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 click on living expense tab at app data check stage$")
	public void user_076_click_on_living_expense_tab_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(livingExpenseWebElements.getElement("living_expense_tab"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user_076 click on view button of living expense screen at app data check stage$")
	public void user_076_click_on_view_button_of_living_expense_screen_at_app_data_check_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						livingExpenseWebElements.getElement("living_expense_listView_view_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^user_076 verify expense type should show in living expense screen at app data check stage$")
	public void user_076_verify_expense_type_should_show_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		boolean isExpenseTypeFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isExpenseTypeFieldIsVisible = javascriptHelper.executeScriptWithWebElement(
						livingExpenseWebElements.getElement("expense_type_field_verification")).isDisplayed();
				if (isExpenseTypeFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isExpenseTypeFieldIsVisible, "Expense type field is not visible hence failed");
	}

	@Then("^user_076 verify amount should show in living expense screen at app data check stage$")
	public void user_076_verify_amount_should_show_in_living_expense_screen_at_app_data_check_stage() throws Throwable {
		boolean isAmountFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isAmountFieldIsVisible = javascriptHelper.executeScriptWithWebElement(
						livingExpenseWebElements.getElement("expense_amount_field_verification")).isDisplayed();
				if (isAmountFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isAmountFieldIsVisible, "Amount field is not visible hence failed");
	}

	@Then("^user_076 verify expected cost of living should show in living expense screen at app data check stage$")
	public void user_076_verify_expected_cost_of_living_should_show_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		boolean isCostOfLivingFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isCostOfLivingFieldIsVisible = javascriptHelper
						.executeScriptWithWebElement(
								livingExpenseWebElements.getElement("expected_cost_of_living_field_verification"))
						.isDisplayed();
				if (isCostOfLivingFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isCostOfLivingFieldIsVisible, "Cost of living field is not visible hence failed");
	}

	@Then("^user_076 verify minimum cost of living should show in living expense screen at app data check stage$")
	public void user_076_verify_minimum_cost_of_living_should_show_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		boolean isMinimumCostOfLivingFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isMinimumCostOfLivingFieldIsVisible = javascriptHelper
						.executeScriptWithWebElement(
								livingExpenseWebElements.getElement("minimum_living_cost_field_verification"))
						.isDisplayed();
				if (isMinimumCostOfLivingFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isMinimumCostOfLivingFieldIsVisible,
				"Minimum Cost of living field is not visible hence failed");
	}

	@Then("^user_076 verify total living cost should show in living expense screen at app data check stage$")
	public void user_076_verify_total_living_cost_should_show_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		boolean isMinimumCostOfLivingFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isMinimumCostOfLivingFieldIsVisible = javascriptHelper
						.executeScriptWithWebElement(
								livingExpenseWebElements.getElement("minimum_living_cost_field_verification"))
						.isDisplayed();
				if (isMinimumCostOfLivingFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isMinimumCostOfLivingFieldIsVisible,
				"Minimum Cost of living field is not visible hence failed");
	}

	@Then("^user_076 verify accredit cost should show in living expense screen at app data check stage$")
	public void user_076_verify_accredit_cost_should_show_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		boolean isAccreditedCostFieldIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isAccreditedCostFieldIsVisible = javascriptHelper
						.executeScriptWithWebElement(
								livingExpenseWebElements.getElement("Accredited_cost_field_verification"))
						.isDisplayed();
				if (isAccreditedCostFieldIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isAccreditedCostFieldIsVisible, "Accredit Cost field is not visible hence failed");
	}

	@Then("^user_076 verify total living expense should show in living expense screen at app data check stage$")
	public void user_076_verify_total_living_expense_should_show_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		boolean isTotalLivingExpenseIsVisible = false;
		for (int i = 0; i <= 300; i++) {
			try {
				isTotalLivingExpenseIsVisible = javascriptHelper
						.executeScriptWithWebElement(
								livingExpenseWebElements.getElement("total_living_expense_field_verification"))
						.isDisplayed();
				if (isTotalLivingExpenseIsVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isTotalLivingExpenseIsVisible, "Total Living Expense field is not visible hence failed");
	}

	@Then("^user_076 verify customer name field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_customer_name_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String customerNameFieldStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				customerNameFieldStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("customer_name_field_readonlymode_validation"))
						.toString();
				if (customerNameFieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(customerNameFieldStatus.equals("true"),
				" customer name field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify total living expense field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_total_living_expense_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String totalLivingExpenseFieldStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				totalLivingExpenseFieldStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("total_living_expense_readonlyMode_validation"))
						.toString();
				if (totalLivingExpenseFieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(totalLivingExpenseFieldStatus.equals("true"),
				" Total living expense field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify Accredit cost field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_Accredit_cost_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String accreditCostFieldStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				accreditCostFieldStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("accredited_cost_readonly_mode_validation"))
						.toString();
				if (accreditCostFieldStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(accreditCostFieldStatus.equals("true"),
				" Accredit cost field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify Is Spouse employed field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_Is_Spouse_employed_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String isSpouseEmployedStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				isSpouseEmployedStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("is_spouse_employed_readonly_mode_validation"))
						.toString();
				if (isSpouseEmployedStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isSpouseEmployedStatus.equals("true"),
				" is spouse employed field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify Spouse salary field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_Spouse_salary_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String spouseSalary = "";
		for (int i = 0; i <= 300; i++) {
			try {
				spouseSalary = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("spouse_salary_readonly_mode_verification"))
						.toString();
				if (spouseSalary.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(spouseSalary.equals("true"),
				" Spouse Salary field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify Living allowance field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_Living_allowance_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String livingAllowanceStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				livingAllowanceStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("living_allowance_readonly_mode_verification"))
						.toString();
				if (livingAllowanceStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(livingAllowanceStatus.equals("true"),
				" Living allowance field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify expected cost of living field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_expected_cost_of_living_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String expectedCostOfLiving = "";
		for (int i = 0; i <= 300; i++) {
			try {
				expectedCostOfLiving = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("expected_cost_ofLivng_readonly_mode_verification"))
						.toString();
				if (expectedCostOfLiving.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(expectedCostOfLiving.equals("true"),
				" Expected cost of living field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify minimum cost of living field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_minimum_cost_of_living_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String minimumCostfLivingStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				minimumCostfLivingStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("minimum_living_cost_readonly_mode_validation"))
						.toString();
				if (minimumCostfLivingStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(minimumCostfLivingStatus.equals("true"),
				" Minimum cost of living field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify expense type field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_expense_type_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String expenseTypeStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				expenseTypeStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("expense_type_readonly_mode_validation"))
						.toString();
				if (expenseTypeStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(expenseTypeStatus.equals("true"),
				" Expense type field is not in read only mode status hence failed");
	}

	@Then("^user_076 verify amount field should be read only mode in living expense screen at app data check stage$")
	public void user_076_verify_amount_field_should_be_read_only_mode_in_living_expense_screen_at_app_data_check_stage()
			throws Throwable {
		String amountStatus = "";
		for (int i = 0; i <= 300; i++) {
			try {
				amountStatus = javascriptHelper
						.executeScript("return "
								+ livingExpenseWebElements.getElement("expense_amount_readonly_mode_validation"))
						.toString();
				if (amountStatus.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(amountStatus.equals("true"),
				" amount field is not in read only mode status hence failed");
	}

	@And("^user_076 invoke softAssert in data check living expense screen$")
	public void user_076_invoke_softAssert_in_data_check_living_expense_screen() throws Throwable {
		softAssert.assertAll();
	}

}
