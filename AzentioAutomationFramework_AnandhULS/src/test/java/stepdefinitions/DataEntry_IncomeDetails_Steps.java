package stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class DataEntry_IncomeDetails_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	IjaraLogin login = new IjaraLogin();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths CommonJsElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths incomeDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "IncomeDetails_JSPaths",
			"IncomeDetails_Elements", "JSPaths");
	ExcelData murabahaExecutionSheet = new ExcelData(configFileReader.getTestDataFilePath(),
			"Murabaha_ExecutionTracker", "TestCase ID");
	ExcelData excelUserID = new ExcelData(configFileReader.getTestDataFilePath(),
			"ijara_LoginCredentials", "UserType");
	ExcelData murabahaIncomeDetailsExcelTestData = new ExcelData(configFileReader.getTestDataFilePath(),
			"MurabahIncomeDetailsDC_TestData", "Dataset ID");
	Map<String, String> murabahaExecutionData = new HashMap<>();
	Map<String, String> incomeDetailsTestData = new HashMap<>();
	int incomeDetailsScreenLocation = 0;

	@And("^user_076 login with valid data entry user ID for murabaha product$")
	public void user_076_login_with_valid_data_entry_user_id_for_murabaha_product() throws Throwable {
		login.loginWithIjaraApplication("userType13");
	}

	@And("^user_076 search the app data entry record reference number in murabah data entry stage$")
	public void user_076_search_the_app_data_entry_record_reference_number_in_murabah_data_entry_stage()
			throws Throwable {
		WebElement searchTextBox;
		for (int i = 0; i <= 150; i++) {
			try {
				searchTextBox = javascriptHelper
						.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"));
				searchTextBox.sendKeys(configFileReader.getMurabahaDataCheckRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 select the app data entry record reference number in murabah data entry stage$")
	public void user_076_select_the_app_data_entry_record_reference_number_in_murabah_data_entry_stage()
			throws Throwable {
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
					if (recordRefNumber.equals(configFileReader.getMurabahaDataCheckRecordReferenceNumber())) {
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

	@And("^user_076 get the test data for test case ID PRE_REQ_02_AT_MU_IDC_03$")
	public void user_076_get_the_test_data_for_test_case_id_pre_req_02_at_mu_idc_03() throws Throwable {
		murabahaExecutionData = murabahaExecutionSheet.getTestdata("PRE_REQ_02_AT_MU_IDC_03");
		System.out.println(murabahaExecutionData.get("dataSet_ID"));
		incomeDetailsTestData = murabahaIncomeDetailsExcelTestData.getTestdata(murabahaExecutionData.get("dataSet_ID"));
	}

	@And("^user_076 select the Murabaha app data entry record reference number from mail box$")
	public void user_076_select_the_murabaha_app_data_entry_record_reference_number_from_mail_box() throws Throwable {
	}

	@And("^user_076 select the customer financials tab at app data entry stage$")
	public void user_076_select_the_customer_financials_tab_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(incomeDetailsElements.getElement("customer_financials_tab"))
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

	@And("^user_076 select the customer personal information record at app data entry stage$")
	public void user_076_select_the_customer_personal_information_record_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(
								incomeDetailsElements.getElement("customer_personal_information_list_view_record"))
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

	@And("^user_076 find the income details screen location at app data entry stage$")
	public void user_076_find_the_income_details_screen_location_at_app_data_entry_stage() throws Throwable {
		String titleLength = "document.querySelectorAll('ion-title[class=\"pl-2 pr-2 ion-color ion-color-dark md title-default hydrated\"]').length";
		String lengthOfTitle = "";
		int premitiveTitleLength = 0;
		String titleText = "";
		boolean isLoopNeedToBreak = false;
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println(" i Value " + i);
				lengthOfTitle = javascriptHelper.executeScript("return " + titleLength).toString();
				premitiveTitleLength = Integer.parseInt(lengthOfTitle);
				System.out.println("Length of the query " + premitiveTitleLength);
				if (premitiveTitleLength >= 5) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= premitiveTitleLength; i++) {
			for (int j = 0; j <= 600; j++) {
				try {
					System.out.println("Premitive Title length " + premitiveTitleLength);
					titleText = javascriptHelper
							.executeScript("return document.querySelectorAll('ion-col ion-title')[" + i + "].innerText")
							.toString();
					System.out.println("Title text " + titleText);
					System.out.println(
							"Query " + "return document.querySelectorAll('ion-col ion-title')[" + i + "].innerText");
					if (titleText.equals("Income")) {
						incomeDetailsScreenLocation = i;
						isLoopNeedToBreak = true;
						break;
					} else {
						break;
					}
				} catch (Exception e) {
					if (i == 600) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}
			}
			if (isLoopNeedToBreak == true) {
				break;
			}

		}
		if (isLoopNeedToBreak == false) {
			throw new Throwable("Unable to find the income details location index");
		}
	}

	@And("^user_076 select the income details record at app data entry stage$")
	public void user_076_select_the_income_details_record_at_app_data_entry_stage() throws Throwable {
		String incomeDetailsEyeQuery = "document.querySelectorAll('table')[" + (incomeDetailsScreenLocation + 1)
				+ "].querySelector('button[ng-reflect-text=\"View\"]')";
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper
						.scrollIntoView(javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery));
				javascriptHelper.executeScriptWithWebElement(incomeDetailsEyeQuery).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 get the income screen amount value at app data entry stage$")
	public void user_076_get_the_income_screen_amount_value_at_app_data_entry_stage() throws Throwable {
		String incomeAmount = "";
		for (int i = 0; i <= 300; i++) {
			try {
				incomeAmount = javascriptHelper
						.executeScript("return " + incomeDetailsElements.getElement("get_income_amount_value"))
						.toString();
				if (incomeAmount.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Updated data Set ID "+incomeDetailsTestData.get("update_datasetID_one"));
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"), "income_amount",
				incomeAmount);
	}

	@And("^user_076 get the income screen income defined percentage value at app data entry stage$")
	public void user_076_get_the_income_screen_income_defined_percentage_value_at_app_data_entry_stage()
			throws Throwable {

		String incomeDefinedPercentage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				incomeDefinedPercentage = javascriptHelper
						.executeScript(
								"return " + incomeDetailsElements.getElement("get_income_defined_percentage_value"))
						.toString();
				if (incomeDefinedPercentage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"),
				"income_define_percentage", incomeDefinedPercentage);
	}

	@And("^user_076 get the income screen income adjusted percentage value at app data entry stage$")
	public void user_076_get_the_income_screen_income_adjusted_percentage_value_at_app_data_entry_stage()
			throws Throwable {
		String incomeAdjustedPercentage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				incomeAdjustedPercentage = javascriptHelper
						.executeScript(
								"return " + incomeDetailsElements.getElement("get_income_adjusted_percentage_value"))
						.toString();
				if (incomeAdjustedPercentage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"),
				"income_adjusted_percentage", incomeAdjustedPercentage);
	}

	@And("^user_076 get the income screen income amount considered value at app data entry stage$")
	public void user_076_get_the_income_screen_income_amount_considered_value_at_app_data_entry_stage()
			throws Throwable {
		String incomeAmountConsidered = "";
		for (int i = 0; i <= 300; i++) {
			try {
				incomeAmountConsidered = javascriptHelper
						.executeScript(
								"return " + incomeDetailsElements.getElement("get_total_income_considered_value"))
						.toString();
				if (incomeAmountConsidered.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"),
				"income_amount_considered", incomeAmountConsidered);
	}

	@And("^user_076 get the income screen deduction amount value at app data entry stage$")
	public void user_076_get_the_income_screen_deduction_amount_value_at_app_data_entry_stage() throws Throwable {
		String deductionAmount = "";
		for (int i = 0; i <= 300; i++) {
			try {
				deductionAmount = javascriptHelper
						.executeScript("return " + incomeDetailsElements.getElement("get_deduction_amount_value"))
						.toString();
				if (deductionAmount.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"), "deduction_amount",
				deductionAmount);
	}

	@And("^user_076 get the income screen deduction defined percentage value at app data entry stage$")
	public void user_076_get_the_income_screen_deduction_defined_percentage_value_at_app_data_entry_stage()
			throws Throwable {
		String deductionDefinedPercentage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				deductionDefinedPercentage = javascriptHelper
						.executeScript(
								"return " + incomeDetailsElements.getElement("get_deduction_defind_percentage_value"))
						.toString();
				if (deductionDefinedPercentage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"),
				"deduction_define_percentage", deductionDefinedPercentage);
	}

	@And("^user_076 get the income screen deduction adjusted percentage value at app data entry stage$")
	public void user_076_get_the_income_screen_deduction_adjusted_percentage_value_at_app_data_entry_stage()
			throws Throwable {
		String deductionAdjustedPercentage = "";
		for (int i = 0; i <= 300; i++) {
			try {
				deductionAdjustedPercentage = javascriptHelper
						.executeScript(
								"return " + incomeDetailsElements.getElement("get_deduction_adjusted_percentage_value"))
						.toString();
				if (deductionAdjustedPercentage.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"),
				"deduction_adjusted_percentage", deductionAdjustedPercentage);
	}

	@And("^user_076 get the income screen deduction amount considered value at app data entry stage$")
	public void user_076_get_the_income_screen_deduction_amount_considered_value_at_app_data_entry_stage()
			throws Throwable {
		String deductionAmountConsidered = "";
		for (int i = 0; i <= 300; i++) {
			try {
				deductionAmountConsidered = javascriptHelper
						.executeScript(
								"return " + incomeDetailsElements.getElement("get_deduction_amount_considered_value"))
						.toString();
				if (deductionAmountConsidered.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		murabahaIncomeDetailsExcelTestData.updateTestData(incomeDetailsTestData.get("update_datasetID_one"),
				"deduction_amount_considered", deductionAmountConsidered);
	}

	@And("^user_076 click on application details in app data entry stage$")
	public void user_076_click_on_application_details_in_app_data_entry_stage() throws Throwable {
		List<WebElement> applicationDetailsWebElementList = new ArrayList<>();
		String applicationDetailstabQuery = "document.querySelectorAll('ion-segment-button[id=\"seg1\"]').length";
		int applicationDetailsPosition = 0;
		for (int i = 0; i <= 300; i++) {
			try {
				String tempApplicationDetailsPosition = javascriptHelper
						.executeScript("return " + applicationDetailstabQuery).toString();
				applicationDetailsPosition = Integer.parseInt(tempApplicationDetailsPosition);
				System.out.println("Application details positions " + applicationDetailsPosition);
				if (applicationDetailsPosition >= 3) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int j = 0; j < applicationDetailsPosition; j++) {

			try {
				WebElement applicationTabELement = javascriptHelper.executeScriptWithWebElement(
						"document.querySelectorAll('ion-segment-button[id=\"seg1\"]')[" + j + "]");
				applicationDetailsWebElementList.add(applicationTabELement);
			} catch (Exception e) {

			}

			for (WebElement webElement : applicationDetailsWebElementList) {
				try {
					webElement.click();
					break;
				} catch (Exception e) {
					if (applicationDetailsWebElementList.size() == applicationDetailsWebElementList
							.indexOf(webElement)) {
						e.printStackTrace();
						Assert.fail(e.getMessage());
					}
				}

			}

		}

	}

	@And("^user_076 click on submit button in app data entry stage$")
	public void user_076_click_on_submit_button_in_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				clicksAndActionsHelper.scrollIntoView(
						javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("submit_button")));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("submit_button")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 enter the alert remark in app data entry stage$")
	public void user_076_enter_the_alert_remark_in_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_ok")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on alert submit button in app dat entry stage$")
	public void user_076_click_on_alert_submit_button_in_app_dat_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("alert_submit")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 get the app data check user id from the toast popup and extract the user id at app data entry stage$")
	public void user_076_get_the_app_data_check_user_id_from_the_toast_popup_and_extract_the_user_id_at_app_data_entry_stage()
			throws Throwable {
		String toastPopup = "";
		for (int i = 0; i <= 300; i++) {
			try {
				toastPopup = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("toast_container_message")).toString();
				if (toastPopup.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());

				}
			}
		}
		System.out.println(toastPopup);
		String finalDataEntryUserID = (toastPopup.substring(86)).replace(".", "").trim();
		System.out.println("userID " + finalDataEntryUserID);
		excelUserID.updateTestData("userType12", "UserName", finalDataEntryUserID);
	}

}
