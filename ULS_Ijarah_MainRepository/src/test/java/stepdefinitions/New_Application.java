package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class New_Application {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getIjarahTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths New_ApplicationPaths = new JSPaths(excelPath, "New_Application", "FieldName", "JSPath");
	ExcelData excelDataForExecutionData = new ExcelData(excelTestDataPath,
			"Ijarah_ExecutionTracker", "TestCase ID");
	Map<String, String> executionData;
	ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "New_Application", "Data Set ID");
	Map<String, String> testData;
	ExcelData Customer_Search = new ExcelData(excelTestDataPath, "Customer_Search", "Data Set ID");
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();

	@Given("User_607 Update testdata from AT_NEWAPP_02")
	public void user_update_testdata_from_at_newapp_02() {
		testData = IncomeDetailsListexelData.getTestdata("DS_AT_NEWAPP_02");
	}

	@Given("User_607 Update testdata from AT_NWP_03")
	public void user_update_testdata_from_at_nwp_03() {
		testData = IncomeDetailsListexelData.getTestdata("DS_AT_NWP_03");
	}

	@Given("User_607 Update testdata from AT_NWP_04")
	public void user_update_testdata_from_at_nwp_04() {
		testData = IncomeDetailsListexelData.getTestdata("DS_AT_NWP_04");
	}

	@Given("User_607 Check GoBack Field")
	public void user_check_go_back_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("GoBack")).isDisplayed()) {
			SoftAssert.fail();
		}
	}

	@Given("User_607 Check Save button Field")
	public void user_check_save_button_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Savebutton"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Submit button Field")
	public void user_check_submit_button_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Submitbutton"))
				.isDisplayed()) {
			SoftAssert.fail();
		}
	}

	@Given("User_607 Check Return button Field")
	public void user_check_return_button_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Returnbutton"))
				.isDisplayed()) {
			SoftAssert.fail();
		}
	}

	@Given("User_607 Check Views summary Field")
	public void user_check_views_summary_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Viewsummary"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Product Field")
	public void user_check_product_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Product")).isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Subproduct Field")
	public void user_check_subproduct_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Subproduct"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Total Finance Amount Requested Field")
	public void user_check_total_finance_amount_requested_field() {
		if (!javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Declared Net Monthly Income Field")
	public void user_check_declared_net_monthly_income_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Declared Current Obligations Field")
	public void user_check_declared_current_obligations_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredCurrentObligations"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Special Promotion\\/Campaign Field")
	public void user_check_special_promotion_campaign_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Special Promotion/Campaign"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Sourcing Channel Field")
	public void user_check_sourcing_channel_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingChannel"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Business Center Code Field")
	public void user_check_business_center_code_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("BusinessCenterCode"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Servicing Type Field")
	public void user_check_servicing_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ServicingType"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Region Field")
	public void user_check_region_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Region")).isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Servicing Branch Field")
	public void user_check_servicing_branch_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ServicingBranch"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Spoke Location Field")
	public void user_check_spoke_location_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SpokeLocation"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Closing Staff Or Servicing Staff Or RM Field")
	public void user_check_closing_staff_or_servicing_staff_or_rm_field() {
		if (!javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("ClosingStaffOrServicingStaffOrRM"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Topup Type Field")
	public void user_check_topup_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupType")).isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check Topup Application No Field")
	public void user_check_topup_application_no_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupApplicationNo"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check SourcingType Field")
	public void user_check_sourcing_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingType"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check SourcingOffice Field")
	public void user_check_sourcing_office_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingOffice"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check SourcingEntity Field")
	public void user_check_sourcing_entity_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingEntity"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check SourcingStaff Field")
	public void user_check_sourcing_staff_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingStaff"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check ReferenceType Field")
	public void user_check_reference_type_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceType"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check ReferenceEntity Field")
	public void user_check_reference_entity_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceEntity"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Check ReferenceCode Field")
	public void user_check_reference_code_field() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode"))
				.isDisplayed()) {
			SoftAssert.fail();
		}

	}

	@Given("User_607 Save the record")
	public void user_save_the_record() throws Throwable {
//		for (int i = 0; i < 500; i++) {
//		try {
//			javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ScrollToInbox")));
//			break;
//		} catch (Exception e) {
//			if (i==499) {
//				Assert.fail(e.getMessage());
//			}
//		}	
//		}
		javascriptHelper.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("Application Details Text")));
		Thread.sleep(3000);
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Savebutton")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check popup after save the record")
	public void user_check_popup_after_save_the_record() throws Throwable {
		Thread.sleep(2000);
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SuccessSavePopup"))
				.isDisplayed()) {
			SoftAssert.fail();
		}
		SoftAssert.assertAll();
	}

	@Given("User_607 Click back button to move main page")
	public void user_click_back_button_to_move_main_page() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("backButton")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Product field should be mandatory")
	public void user_check_product_field_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("Product*");
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Product Field should be editable")
	public void user_check_product_field_should_be_editable() {

		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Product")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("SelectOptionInProduct").trim());

			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("SelectOptionInProduct")).trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}
	}

	@Given("User_607 Check Sub Product field should be mandatory")
	public void user_check_sub_product_field_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("Subproduct*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Sub Product Field should be editable")
	public void user_check_sub_product_field_should_be_editable() {

		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Subproduct")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + (testData.get("SubProductField")).trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("SubProductField").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}
	}

	@Given("User_607 Check Total Finance Amount Requested should be mandatory")
	public void user_check_total_finance_amount_requested_should_be_mandatory() throws Throwable {
		Thread.sleep(3000);
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("TotalFinanceAmountRequested*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Total Finance Amount Requested should be editable")
	public void user_check_total_finance_amount_requested_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))));
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
						.sendKeys(testData.get("TotalFinanceAmountRequested"));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Declared Net Monthly Income should be mandatory")
	public void user_check_declared_net_monthly_income_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Declared Net Monthly Income should be editable")
	public void user_check_declared_net_monthly_income_should_be_editable() {

		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))));
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))
						.sendKeys(testData.get("DeclaredNetMonthlyIncome"));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Declared Current Obligations should be non mandatory")
	public void user_check_declared_current_obligations_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("CheckNonManDeclaredCurrentObligations");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Declared Current Obligations should be editable")
	public void user_check_declared_current_obligations_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredCurrentObligations"))
						.sendKeys(testData.get("DeclaredCurrentObligations"));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Special Promotion Campaign should be non mandatory")
	public void user_check_special_promotion_campaign_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SpecialPromotion/CampaignCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Special Promotion Campaign should be editable")
	public void user_check_special_promotion_campaign_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("Special Promotion/Campaign"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("Special Promotion/Campaign").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Special Promotion/Campaign").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Sourcing Channel should be mandatory")
	public void user_check_sourcing_channel_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SourcingChannel*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Sourcing Channel should be editable")
	public void user_check_sourcing_channel_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingChannel"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("SourcingChannel").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("SourcingChannel").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Business Center Code should be mandatory")
	public void user_check_business_center_code_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("BusinessCenterCode*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Business Center Code should be editable")
	public void user_check_business_center_code_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("BusinessCenterCode"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("BusinessCenterCode").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("BusinessCenterCode").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Servicing Type should be mandatory")
	public void user_check_servicing_type_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("ServicingType*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Servicing Type should be editable")
	public void user_check_servicing_type_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ServicingType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("ServicingType").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ServicingType").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Region should be mandatory")
	public void user_check_region_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("Region*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Region should be editable")
	public void user_check_region_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Region")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("Region").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Region").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Servicing Branch should be mandatory")
	public void user_check_servicing_branch_should_be_mandatory() throws Throwable {
		Thread.sleep(3000);
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("ServicingBranch*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Servicing Branch should be editable")
	public void user_check_servicing_branch_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ServicingBranch"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("ServicingBranch").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ServicingBranch").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Spoke Location should be Non mandatory")
	public void user_check_spoke_location_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SpokeLocationCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Spoke Location should be editable")
	public void user_check_spoke_location_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SpokeLocation")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("SpokeLocation").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("SpokeLocation").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Closing Staff Or Servicing Staff Or RM should be mandatory")
	public void user_check_closing_staff_or_servicing_staff_or_rm_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("ClosingStaffOrServicingStaffOrRM*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Closing Staff Or Servicing Staff Or RM should be editable")
	public void user_check_closing_staff_or_servicing_staff_or_rm_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						New_ApplicationPaths.getElement("ClosingStaffOrServicingStaffOrRM")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("ClosingStaffOrServicingStaffOrRM").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ClosingStaffOrServicingStaffOrRM").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Topup Type should be Non mandatory")
	public void user_check_topup_type_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("TopupTypeCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Topup Type should be editable")
	public void user_check_topup_type_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";

		String dropdownLength = "";

		boolean isDropdownValueSelected = false;

		String dropdownString = "";

		for (int i = 0; i <= 300; i++) {

			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;

				}

			} catch (Exception e) {

				if (i == 300) {

					Assert.fail(e.getMessage());

				}

			}

		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("TopupType").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" BT Topup ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Topup Application No should be Non mandatory")
	public void user_check_topup_application_no_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("TopupApplicationNoCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Topup Application No should be editable")
	public void user_check_topup_application_no_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupApplicationNo"))
						.click();
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TopupApplicationNo"))
						.sendKeys(testData.get("TopupApplicationNo"));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Sourcing Type should be mandatory")
	public void user_check_sourcing_type_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SourcingType*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Sourcing Type should be editable")
	public void user_check_sourcing_type_should_be_editable() {

		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("SourcingType").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("SourcingType").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}
	}

	@Given("User_607 Check Sourcing Office should be mandatory")
	public void user_check_sourcing_office_should_be_mandatory() throws Throwable {
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Status")));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Thread.sleep(2000);
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SourcingOffice*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Sourcing Office should be editable")
	public void user_check_sourcing_office_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingOffice")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + " Bangalore ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" Bangalore ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Sourcing Entity should be mandatory")
	public void user_check_sourcing_entity_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SourcingEntity*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Sourcing Entity should be editable")
	public void user_check_sourcing_entity_should_be_editable() {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode")));

		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingEntity")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + " Cent Bank Finance LTD. ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" Cent Bank Finance LTD. ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Sourcing Staff should be mandatory")
	public void user_check_sourcing_staff_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SourcingStaff*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Sourcing Staff should be editable")
	public void user_check_sourcing_staff_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SourcingStaff")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + " Narayan Shrivastava ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" Narayan Shrivastava ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Reference Type should be non mandatory")
	public void user_check_reference_type_should_be_non_mandatory() {
		for (int i = 0; i < 100; i++) {
			try {
				javascriptHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode")));
				break;
			} catch (Exception e) {
				if (i == 99) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("ReferenceTypeCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Reference Type should be editable")
	public void user_check_reference_type_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + " Bank ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" Bank ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Reference Entity should be non mandatory")
	public void user_check_reference_entity_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("ReferenceEntityCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Reference Entity should be editable")
	public void user_check_reference_entity_should_be_editable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceEntity"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + " RIYADH BK ".trim());

			if ((dropdownString.trim()).equalsIgnoreCase(" RIYADH BK ".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Reference Code should be non mandatory")
	public void user_check_reference_code_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("ReferenceCodeCheckNonMan");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Reference Code should be editable")
	public void user_check_reference_code_should_be_editable() {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode")));
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode"))
						.sendKeys("1500");
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Click Back button")
	public void user_click_back_button() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("GoBack")));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check system should navigate to the previous screen")
	public void user_check_system_should_navigate_to_the_previous_screen() {
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("selectRecord"))
				.isDisplayed()) {
			Assert.fail();
		}

	}

	@Given("User_607 Click Add button in application details")
	public void user_click_add_button_in_application_details() throws Throwable {
		Thread.sleep(3000);
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.JSEClick(
						javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("AddButton")));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Select ID type")
	public void user_select_id_type() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("IdType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ID Type").trim())) {

				for (int k = 0; k <= 300; k++) {
					try {
						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
						isDropdownValueSelected = true;
						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;
			}
		}
	}

	@Given("User_607 Enter Customer ID number")
	public void user_enter_customer_id_number() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("IdNumber"))
						.sendKeys(testData.get("Customer ID"));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Enter date of birth")
	public void user_enter_date_of_birth() throws Throwable {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DateOfBirth")).click();
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DateOfBirth"))
				.sendKeys(testData.get("Date Of Birth"));
		Thread.sleep(1000);
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SelectDate")).click();

	}

	@Given("User_607 Click Search button after filled the fields")
	public void user_click_search_button_after_filled_the_fields() throws Throwable {
		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("SearchButton")).click();
				WebElement search = javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("SearchButton"));
				javascriptHelper.JSEClick(search);
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Click Create New button")
	public void user_click_create_new_button() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CreateNewbutton"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Click save button in creating new reord screen")
	public void user_click_save_button_in_creating_new_reord_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Savebutton")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Please Fill Details Popup showing or not")
	public void user_check_please_fill_details_popup_showing_or_not() throws Throwable {
		Thread.sleep(1000);
		for (int i = 0; i < 2000; i++) {
			try {
				String text = javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("PleaseFillDetailsPopup"))
						.getText();
				Assert.assertTrue(text.contains("Please fill all the details"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 User Check negative value accepct or not in the numaric field")
	public void user_user_check_negative_value_accepct_or_not_in_the_numaric_field() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
				.sendKeys("-10");
		for (int i = 0; i < 2000; i++) {
			try {
				String CheckField = javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
						.getAttribute("aria-valuenow");
				String accountholdername = javascriptHelper.executeScript("return " + CheckField).toString();
				Assert.assertFalse(accountholdername.contains("-"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Negative Total Finance Amount Requested should be editable")
	public void user_check_negative_total_finance_amount_requested_should_be_editable() {

		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))));
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
						.sendKeys("-100");
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Update testdata from AT_IJCS_01")
	public void user_update_testdata_from_AT_IJCS_01() {
		executionData  = excelDataForExecutionData.getTestdata("AT_IJCS_01");
		testData = Customer_Search.getTestdata(executionData.get("dataSet_ID"));
	}

	@Given("User_607 Update testdata from AT_IJCS_02")
	public void user_update_testdata_from_AT_IJCS_02() {
		executionData  = excelDataForExecutionData.getTestdata("AT_IJCS_02");
		testData = Customer_Search.getTestdata(executionData.get("dataSet_ID"));
	}

	@Given("User_607 Update testdata from AT_IJCS_03")
	public void user_update_testdata_from_AT_IJCS_03() {
		executionData  = excelDataForExecutionData.getTestdata("AT_IJCS_03");
		testData = Customer_Search.getTestdata(executionData.get("dataSet_ID"));
	}

	@Given("User_607 Update testdata from AT_IJCS_04")
	public void user_update_testdata_from_AT_IJCS_04() {
		executionData  = excelDataForExecutionData.getTestdata("AT_IJCS_04");
		testData = Customer_Search.getTestdata(executionData.get("dataSet_ID"));
	}

	@Given("User_607 click the menu icon in after login screen")
	public void user_click_the_menu_icon_in_after_login_screen() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("MenuButton")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 navigate to the Transactions flag")
	public void user_navigate_to_the_transactions_flag() {
		for (int i = 0; i < 500; i++) {
			try {
				System.out.println(New_ApplicationPaths.getElement("MenuButton"));
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("Transactions")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 navigate to the Application manager flag")
	public void user_navigate_to_the_application_manager_flag() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ApplicationManager"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click the Application details flag")
	public void user_click_the_application_details_flag() throws Throwable {
//		for (int i = 0; i < 500; i++) {
//			try {
//				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ApplicationDetails"))
//						.click();
//				break;
//			} catch (Exception e) {
//				if (i == 499) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
		Thread.sleep(1000);
		String listOfAddButtonQuery = "document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item').length";
		String listOfAddButton = "";
		String addButtonScreenName = "";
		boolean isAddButtonClicked = false;
		for (int i = 0; i <= 300; i++) {
			try {
				listOfAddButton = javascriptHelper.executeScript("return " + listOfAddButtonQuery).toString();
				System.out.println("List of add button " + listOfAddButton);
				if (!(listOfAddButton.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveListOfAddButton = Integer.parseInt(listOfAddButton);
		for (int j = 0; j < premitiveListOfAddButton; j++) {
			for (int k = 0; k <= 500; k++) {
				try {
					addButtonScreenName = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item')[" + j
									+ "].textContent")
							.toString();
					System.out.println("Screen Name " + addButtonScreenName);
					if (!(addButtonScreenName.isBlank())) {
						System.out.println("Screen Name" + addButtonScreenName + " is Not null");
						if ((addButtonScreenName.trim()).equalsIgnoreCase(("Application Details").trim())) {
							System.out.println("Inside nested loop");
							System.out.println(
									"document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item')[" + j
											+ "].querySelector('ion-button')");
							javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-accordion[value=\"Transactions\"] ion-item')[" + j
											+ "].querySelector('ion-button')")
									.click();
							isAddButtonClicked = true;
							break;
						}
					}
				} catch (Exception e) {
					if (k == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isAddButtonClicked == true) {
				break;
			}
		}

	}

	@And("User_607 click the add icon to add the customer details")
	public void user_click_the_add_icon_to_add_the_customer_details() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("AddIcon")).click();
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check Customer Type should be mandatory")
	public void user_check_customer_type_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("CustomerType*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Select Customer type")
	public void user_select_customer_type() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CustomerType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("Customer Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Customer Type").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check Customer Type Field should be Selectable")
	public void user_check_customer_type_field_should_be_selectable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CustomerType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("Customer Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("Customer Type").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {

				break;

			}
		}

	}

	@Given("User_607 Check CIF ID Field should be Editable")
	public void user_check_cif_id_field_should_be_editable() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CustomerType"))
				.sendKeys(testData.get("CIF ID"));

	}

	@Given("User_607 Check CIF ID Field should be numeric")
	public void user_check_cif_id_field_should_be_numeric() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CustomerType"))
				.sendKeys(testData.get("Check CIF ID"));
		String attribute = javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("CIFIDGetValue"))
				.getAttribute("ng-reflect-model");
		if (!(attribute == null)) {
			Assert.fail();
		}
	}

	@Given("User_607 Check ID Type Field should be Selectable")
	public void user_check_id_type_field_should_be_selectable() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("IDType")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + testData.get("ID Type").trim());

			if ((dropdownString.trim()).equalsIgnoreCase(testData.get("ID Type").trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}

	}

	@Given("User_607 Enter Customer Name")
	public void user_enter_customer_name() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CustomerName"))
						.sendKeys(testData.get("Customer Name"));
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Check ID Number Field should be Alphanumeric")
	public void user_check_id_number_field_should_be_alphanumeric() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("IDNumber"))
				.sendKeys(testData.get("Check ID Number"));
		String attribute = javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("IDNumbergetValue"))
				.getAttribute("ng-reflect-model");
		System.out.println(attribute);
		if (!attribute.matches("[A-Za-z0-9]+")) {
			Assert.fail();
		}
	}

	@Given("User_607 Check Customer Name Field should be Editable")
	public void user_check_customer_name_field_should_be_editable() {
		for (int i = 0; i < 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("CustomerName"))
						.sendKeys(testData.get("Customer Name"));
				break;
			} catch (Exception e) {
			}
		}
	}

	@Given("User_607 Check Mobile Number Field should be non mandatory")
	public void user_check_mobile_number_field_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("MobileNumberNon*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Mobile Number Field should accept only numeric values")
	public void user_check_mobile_number_field_should_accept_only_numeric_values() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("MobileNumber"))
				.sendKeys(testData.get("Check Mobile Number numeric"));
		String attribute = javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("MobileNumberGetValue"))
				.getAttribute("ng-reflect-model");
		if (!(attribute == null)) {
			Assert.fail();
		}
	}

	@Given("User_607 Check Mobile Number Field should be editable")
	public void user_check_mobile_number_field_should_be_editable() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("MobileNumber"))
				.sendKeys("9123121233");

	}

	@Given("User_607 Check Date of birth Field should be mandatory")
	public void user_check_date_of_birth_field_should_be_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("DateofBirth*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Email ID Field should be non-mandatory")
	public void user_check_email_id_field_should_be_non_mandatory() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("EmailIDNon*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(!accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Check Email ID Field should be alphanumeric")
	public void user_check_email_id_field_should_be_alphanumeric() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("EmailID"))
				.sendKeys(testData.get("Check Email ID alphanumeric"));

	}

	@Given("User_607 Check System must redirect the Application Details page")
	public void user_check_system_must_redirect_the_application_details_page() throws Throwable {
		Thread.sleep(3000);
		if (!javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ApplicationDetails"))
				.isDisplayed()) {
			Assert.fail();
		}
	}

	@Given("User_607 Check able to enter characters value in numeric field")
	public void user_check_able_to_enter_characters_value_in_numeric_field() throws Throwable {
		Thread.sleep(1000);
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))
				.sendKeys("enter");
		String attribute = javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))
				.getAttribute("aria-valuenow");
		if (!(attribute == null)) {
			Assert.fail();
		}
	}

	@Given("User_607 Check able to enter special characters in any field")
	public void user_check_able_to_enter_special_characters_in_any_field() {
		javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
				.sendKeys(testData.get("special characters"));
		String attribute = javascriptHelper
				.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
				.getAttribute("aria-valuenow");
		if (!(attribute == null)) {
			Assert.fail();
		}
	}

	@Given("User_607 Select LOS in module name")
	public void user_select_los_in_module_name() {

		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ModuleName")).click();
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
		String dropdownLength = "";
		boolean isDropdownValueSelected = false;
		String dropdownString = "";
		for (int i = 0; i <= 300; i++) {
			try {

				dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();

				System.out.println("Dropdown length " + dropdownLength);

				if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		int premitiveDropdownLength = Integer.parseInt(dropdownLength);

		for (int j = 0; j <= premitiveDropdownLength; j++) {

			for (int l = 0; l <= 300; l++) {

				try {

					System.out.println("L value is " + l);

					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

					dropdownString = javascriptHelper.executeScript(

							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")

							.toString();

					if (!(dropdownString.isEmpty())) {

						System.out.println(dropdownString);

						System.out.println("Loop count " + l + " got breaked");

						break;

					}

				} catch (Exception e) {

					if (l == 300 && !(dropdownString.isBlank())) {

						Assert.fail(e.getMessage());

					}

				}

				if (!(dropdownString.isEmpty())) {

					System.out.println(dropdownString);

					System.out.println("Loop count " + l + " got breaked");

					break;

				}

			}

			System.out.println("String " + dropdownString.trim());

			System.out.println("Map " + "LOS".trim());

			if ((dropdownString.trim()).equalsIgnoreCase("LOS".trim())) {

				for (int k = 0; k <= 300; k++) {

					try {

						clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(

								"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));

						isDropdownValueSelected = true;

						break;

					} catch (Exception e) {

						if (k == 300) {

							Assert.fail(e.getMessage());
						}
					}
				}
			}
			if (isDropdownValueSelected == true) {
				break;
			}
		}
	}

	@Given("User_607 Check Sourcing Office should be mandatory in application Details")
	public void user_check_sourcing_office_should_be_mandatory_in_application_details() {
		for (int i = 0; i < 2000; i++) {
			try {
				String repayment = New_ApplicationPaths.getElement("SourcingOffice*");
				// String repayment
				// ="document.querySelector('ion-label[ng-reflect-text=\"SCR.PRODUCT.TOOLTIP\"]').innerText";
				String accountholdername = (String) javascriptHelper.executeScript("return " + repayment);
				System.out.println(accountholdername);
				Assert.assertTrue(accountholdername.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Given("User_607 Enter characters in Total Finance Amount Requested")
	public void user_enter_characters_in_total_finance_amount_requested() {
		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))));
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("TotalFinanceAmountRequested"))
						.sendKeys("Test");
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Enter characters in Declared Net Monthly Income")
	public void user_enter_characters_in_declared_net_monthly_income() {
		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))));
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))
						.sendKeys("Test");
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Enter characters in characters in Declared Current Obligations")
	public void user_enter_characters_in_characters_in_declared_current_obligations() {
		for (int i = 0; i < 700; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome")).click();
				clicksAndActionsHelper.doubleClick((javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))));
				javascriptHelper
						.executeScriptWithWebElement(New_ApplicationPaths.getElement("DeclaredNetMonthlyIncome"))
						.sendKeys("Test");
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Given("User_607 Enter characters in Reference Code")
	public void user_enter_characters_in_reference_code() {
		javascriptHelper.scrollIntoView(
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode")));
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(New_ApplicationPaths.getElement("ReferenceCode"))
						.sendKeys("Test");
				break;
			} catch (Exception e) {
				if (i == 699) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

}
