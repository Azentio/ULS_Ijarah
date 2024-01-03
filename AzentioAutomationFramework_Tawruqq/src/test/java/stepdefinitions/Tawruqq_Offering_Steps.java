package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawruqq_Offering_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	String jsPathExcelFile = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getTawruqqTestDataFile();
	JSPaths commonJSElements = new JSPaths(jsPathExcelFile, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths offeringJSpaths = new JSPaths(jsPathExcelFile, "Offering_Jspaths", "Offering_fieldName", "JSPaths");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	@And("user_076 search for tawruqq offering stage record reference number")
	public void user_076_search_for_tawruqq_offering_stage_record_reference_number() throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(commonJSElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getTawruqqOfferingRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("user_076 select the tawruqq offering stage record")
	public void user_076_select_the_tawruqq_offering_stage_record() throws Throwable {
		String mailBoxRecordList = "document.querySelectorAll('td[class=\"ng-star-inserted\"]>span').length";
		String numberOfRecordInMailBox = "";
		for (int i = 0; i <= 150; i++) {
			try {
				numberOfRecordInMailBox = javascriptHelper.executeScript("return " + mailBoxRecordList).toString();
				System.out.println("Number of record in mail box " + numberOfRecordInMailBox);
				if (!(numberOfRecordInMailBox.isEmpty())) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		int premitiveNumberOfRecordInMailBox = Integer.parseInt(numberOfRecordInMailBox);
		// document.querySelectorAll('td[class="ng-star-inserted"]>span')[0].textContent
		for (int j = 0; j < premitiveNumberOfRecordInMailBox; j++) {
			for (int k = 0; k <= 150; k++) {
				try {
					String recordRefNumber = javascriptHelper
							.executeScript("return document.querySelectorAll('td[class=\"ng-star-inserted\"]>span')["
									+ j + "].textContent")
							.toString();
					System.out.println("Number of record in mail box " + recordRefNumber);
					if (recordRefNumber.equals(configFileReader.getTawruqqOfferingRecordReferenceNumber())) {
						System.out.println("document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]");
						// document.querySelectorAll('button[icon="pi pi-user-edit"]')[0]
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('button[icon=\"pi pi-user-edit\"]')[" + j + "]"));
						break;
					}
				} catch (Exception e) {

				}
			}
		}
	}

	@And("user_076 click on offering tab in tawruqq offering tab")
	public void user_076_click_on_offering_tab_in_tawruqq_offering_tab() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offeringJSpaths.getElement("offering_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the tawruqq offering list view record")
	public void user_076_select_the_tawruqq_offering_list_view_record() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(offeringJSpaths.getElement("offering_listview_editbutton"))
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

	@And("user_076 verify product field should field should be read only mode in tawruqq offering")
	public void user_076_verify_product_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("Product_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Product field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);

	}

	@And("user_076 verify sub product field should field should be read only mode in tawruqq offering")
	public void user_076_verify_sub_product_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("subProduct_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Sub Product field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);

	}

	@And("user_076 verify scheme field should field should be read only mode in tawruqq offering")
	public void user_076_verify_scheme_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("Scheme_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Scheme field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);
	}

	@And("user_076 verify Pricing Indicator field should field should be read only mode in tawruqq offering")
	public void user_076_verify_pricing_indicator_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("pricing_indecator_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Pricing indecator field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);
	}

	@And("user_076 verify Offered Amount field should field should be read only mode in tawruqq offering")
	public void user_076_verify_offered_amount_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("offered_amount_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Offered Amount field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);
	}

	@And("user_076 verify Tenure field should field should be read only mode in tawruqq offering")
	public void user_076_verify_tenure_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("tenure_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Tenure field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);
	}

	@And("user_076 verify Nature of Finance field should field should be read only mode in tawruqq offering")
	public void user_076_verify_nature_of_finance_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("nature_of_finance_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** Nature of finance field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);
	}

	@And("user_076 verify Currency field should field should be read only mode in tawruqq offering")
	public void user_076_verify_currency_field_should_field_should_be_read_only_mode_in_tawruqq_offering()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("currency_field"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"), "** currency field is editable hence failed ");
		System.out.println("Is field read only mode " + isFieldReadOnly);
	}

	@And("user_076 click on back button in tawruqq ofeering screen")
	public void user_076_click_on_back_button_in_tawruqq_ofeering_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonJSElements.getElement("back_button")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify offering screen should get move backward while clicking on back button")
	public void user_076_verify_offering_screen_should_get_move_backward_while_clicking_on_back_button()
			throws Throwable {
		boolean isBackButtonWorking = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isBackButtonWorking = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("offering_listview_editbutton"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Back Button Status " + isBackButtonWorking);
	}

	@And("user_076 verify product field should field should be visible in tawruqq offering")
	public void user_076_verify_product_field_should_field_should_be_visible_in_tawruqq_offering() throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("Product_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify sub product field should field should be visible in tawruqq offering")
	public void user_076_verify_sub_product_field_should_field_should_be_visible_in_tawruqq_offering()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("subProduct_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify scheme field should field should be visible in tawruqq offering")
	public void user_076_verify_scheme_field_should_field_should_be_visible_in_tawruqq_offering() throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("Scheme_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify Pricing Indicator field should field should be visible in tawruqq offering")
	public void user_076_verify_pricing_indicator_field_should_field_should_be_visible_in_tawruqq_offering()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("pricing_indecator_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify Offered Amount field should field should be visible in tawruqq offering")
	public void user_076_verify_offered_amount_field_should_field_should_be_visible_in_tawruqq_offering()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("offered_amount_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify Tenure field should field should be visible in tawruqq offering")
	public void user_076_verify_tenure_field_should_field_should_be_visible_in_tawruqq_offering() throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("tenure_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify Nature of Finance field should field should be visible in tawruqq offering")
	public void user_076_verify_nature_of_finance_field_should_field_should_be_visible_in_tawruqq_offering()
			throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("nature_of_finance_field"))
						.isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	@And("user_076 verify Currency field should field should be visible in tawruqq offering")
	public void user_076_verify_currency_field_should_field_should_be_visible_in_tawruqq_offering() throws Throwable {
		boolean isFieldVisible = false;
		for (int i = 0; i <= 150; i++) {
			try {
				isFieldVisible = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("currency_field")).isDisplayed();
				if (isFieldVisible == true) {
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldVisible, "** Product field is not visible hence failed ");
		System.out.println("Is field read only mode " + isFieldVisible);
	}

	// AT_TW_OFO_11
	@And("user_076 verify credit risk factor field should have mentioned field")
	public void user_076_verify_credit_risk_factor_field_should_have_mentioned_field() throws Throwable {

		String fieldName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldName = javascriptHelper
						.executeScript("return " + offeringJSpaths.getElement("credit_risk_factor_field_validation"))
						.toString();
				if (fieldName.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Credit risk factor field name " + fieldName);
		softAssert.assertTrue(fieldName.contains("Total Score"), "Total score field is not available hence failed");
		softAssert.assertTrue(fieldName.contains("Risk Level"), "Total score field is not available hence failed");
	}

	@And("user_076 verify credit risk factor field should not be editable")
	public void user_076_verify_credit_risk_factory_field_should_not_be_editable() throws Throwable {
		boolean isFieldEditable = false;
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								offeringJSpaths.getElement("credit_risk_factor_field_editable_validation"))
						.sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 10) {
					isFieldEditable = true;
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "credit risk factor field is editable hence failed");
	}

	@And("user_076 verify credit score details field should have mentioned field")
	public void user_076_verify_credit_score_details_field_should_have_mentioned_field() throws Throwable {
		String fieldName = "";
		for (int i = 0; i <= 300; i++) {
			try {
				fieldName = javascriptHelper
						.executeScript("return " + offeringJSpaths.getElement("credit_score_details_field_validation"))
						.toString();
				if (fieldName.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Credit score details field name " + fieldName);
		softAssert.assertTrue(fieldName.contains("Sr. No"), "Sr. No field is not available hence failed");
		softAssert.assertTrue(fieldName.contains("Customer Name"), "Customer Name field is not available hence failed");
		softAssert.assertTrue(fieldName.contains("Credit Bureau Score"),
				"Credit Bureau Score field is not available hence failed");
	}

	@And("user_076 verify credit score details field should not be editable")
	public void user_076_verify_credit_score_details_field_should_not_be_editable() throws Throwable {
		boolean isFieldEditable = false;
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								offeringJSpaths.getElement("credit_score_details_field_editable_validation"))
						.sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 10) {
					isFieldEditable = true;
				}
			}
		}
		softAssert.assertTrue(isFieldEditable, "credit score details field is editable hence failed");
	}

//Financing details field validation
	@Then("user_076 verify total downpayment percentage field should be readonly and data should populate as per the calculation")
	public void user_076_verify_total_downpayment_percentage_field_should_be_readonly_and_data_should_populate_as_per_the_calculation()
			throws Throwable {

		String isFieldReadOnly = "";
		for (int i = 0; i <= 300; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(
								offeringJSpaths.getElement("total_down_payment_editable_validation"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("is Field Editable " + isFieldReadOnly);
		softAssert.assertTrue(isFieldReadOnly.equals("true"),
				" total downpayment percentage field is not editable hence failed");
		softAssert.fail(" Total downpayment percentage calculation problem hence failed");
	}

	@Then("user_076 verify profit amount field should be readonly and data should populate as per the calculation")
	public void user_076_verify_profit_amount_field_should_be_readonly_and_data_should_populate_as_per_the_calculation()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 300; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(offeringJSpaths.getElement("profit_amount_editable_validation"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("is Field Editable " + isFieldReadOnly);
		softAssert.assertTrue(isFieldReadOnly.equals("true"), " profit amount field is not editable hence failed");
		softAssert.fail(" profit amount calculation problem hence failed");
	}

	@Then("user_076 verify total contract value field should be readonly and data should populate as per the calculation")
	public void user_076_verify_total_contract_value_field_should_be_readonly_and_data_should_populate_as_per_the_calculation()
			throws Throwable {
		String isFieldReadOnly = "";
		String offeredAmount = "";
		String profitAmount = "";
		String totalContractAmt = "";
		for (int i = 0; i <= 300; i++) {
			try {
				offeredAmount = javascriptHelper
						.executeScript("return " + offeringJSpaths.getElement("get_offered_amount_value")).toString();
				if (offeredAmount.length() > 0) {
					System.out.println("Offered amount " + offeredAmount);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				profitAmount = javascriptHelper
						.executeScript("return " + offeringJSpaths.getElement("get_profit_amount_value")).toString();
				if (profitAmount.length() > 0) {
					System.out.println("profit amount " + profitAmount);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				totalContractAmt = javascriptHelper
						.executeScript("return " + offeringJSpaths.getElement("get_total_contract_value")).toString();
				if (totalContractAmt.length() > 0) {
					System.out.println("Contract amount " + totalContractAmt);
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		double premitiveProfitAmount = Double.parseDouble(profitAmount);
		double premitiveOfferedAmount = Double.parseDouble(offeredAmount);
		String stringCalTotalContractValue = String.valueOf(premitiveProfitAmount + premitiveOfferedAmount);

		softAssert.assertEquals(stringCalTotalContractValue, totalContractAmt,
				" Contract value is not populating as per the calculation hence failed");
		System.out.println("Contract Value as per screen " + totalContractAmt);
		System.out.println("Contract value as per the calculation " + stringCalTotalContractValue);
		for (int i = 0; i <= 300; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(
								offeringJSpaths.getElement("total_contract_value_editable_validation"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(isFieldReadOnly.equals("true"),
				" total contract value field is not editable hence failed");
		System.out.println("is Field Editable " + isFieldReadOnly);

	}

	@Then("user_076 verify additional down payment field should be readonly and data should populate as per the calculation")
	public void user_076_verify_additional_down_payment_field_should_be_readonly_and_data_should_populate_as_per_the_calculation()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 300; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(
								offeringJSpaths.getElement("Additional_downpayment_editable_validation"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("is Field Editable " + isFieldReadOnly);
		softAssert.assertTrue(isFieldReadOnly.equals("true"),
				" additional downpayment field is not editable hence failed");
		softAssert.fail(" additional downpayment calculation problem hence failed");
	}

	@Then("user_076 verify downpayment percentage field should be readonly and data should populate as per the calculation")
	public void user_076_verify_downpayment_percentage_field_should_be_readonly_and_data_should_populate_as_per_the_calculation()
			throws Throwable {
		String isFieldReadOnly = "";
		for (int i = 0; i <= 300; i++) {
			try {
				isFieldReadOnly = javascriptHelper
						.executeScriptWithWebElement(
								offeringJSpaths.getElement("downpayment_perentage_editable_validation"))
						.getAttribute("ng-reflect-readonly");
				if (isFieldReadOnly.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("is Field Editable " + isFieldReadOnly);
		softAssert.assertTrue(isFieldReadOnly.equals("true"),
				"Downpayment percentage field is not editable hence failed");
		softAssert.fail(" downpayment percentage calculation problem hence failed");
	}

	@And("user_076 invoke soft assert in tawruqq offering screen")
	public void user_076_invoke_soft_assert_in_tawruqq_offering_screen() throws Throwable {
		softAssert.assertAll();
	}

}
