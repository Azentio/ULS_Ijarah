package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Ijarah_AppDataEntry_FacilityInfoSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	JSPaths facilityInfoElements = new JSPaths(configFileReader.getJSFilePath(), "facilityInfo_JSpaths",
			"FacilityInfo_Elements", "JSPaths");
	JSPaths CommonJsElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	ExcelData excelDataForFacilityInfoTestData = new ExcelData(configFileReader.getTestDataFilePath(),
			"Ijarah_FacilityInfo_DE_TestData", "Dataset ID");
	ExcelData ijarahExecutionSheet = new ExcelData(configFileReader.getTestDataFilePath(), "Ijarah_ExecutionTracker",
			"TestCase ID");
	Map<String, String> facilityInfoTestData = new HashMap<>();
	Map<String, String> ijarahExecutionData = new HashMap<>();
	IjaraLogin ijaraLogin = new IjaraLogin();

	@And("user_076 login with valid app data entry user credentials for ijarah product")
	public void user_076_login_with_valid_app_data_entry_user_credentials_for_ijarah_product() throws Throwable {

		ijaraLogin.loginWithIjaraApplication("userType09");
	}

	@And("user_076 get the test data for test case ID AT_FAC_DET_08")
	public void user_076_get_the_test_data_for_test_case_id_AT_FAC_DET_08() throws Throwable {
		ijarahExecutionData = ijarahExecutionSheet.getTestdata("AT_FAC_DET_08");
		System.out.println("Data Set ID " + ijarahExecutionData.get("dataSet_ID"));
		facilityInfoTestData = excelDataForFacilityInfoTestData.getTestdata(ijarahExecutionData.get("dataSet_ID"));
	}

	@And("user_076 search the ijarah app data entry record in mail box")
	public void user_076_search_the_ijarah_app_data_entry_record_in_mail_box() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("mail_box_search_text"))
						.sendKeys(configFileReader.getIjarahAppDataEntryRecordReferenceNumber());
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user_076 select the ijarah app data entry record")
	public void user_076_select_the_ijarah_app_data_entry_record() throws Throwable {
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
					if (recordRefNumber.equals(configFileReader.getIjarahAppDataEntryRecordReferenceNumber())) {
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

	@And("user_076 click on facility info tab at app data entry stage")
	public void user_076_click_on_facility_info_tab_at_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(facilityInfoElements.getElement("facility_info_tab"))
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

	@And("user_076 click on search button in facility info app data entry stage")
	public void user_076_click_on_search_button_in_facility_info_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_button"))
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

	@And("user_076 search the valid search test in facility info app data entry stage")
	public void user_076_search_the_valid_search_test_in_facility_info_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				System.out.println("Valid search text " + facilityInfoTestData.get("valid_search_text"));
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(facilityInfoTestData.get("valid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify facility info list view grid should show the valid matches at app data entry stage")
	public void user_076_verify_facility_info_list_view_grid_should_show_the_valid_matches_at_app_data_entry_stage()
			throws Throwable {
		String listViewSearchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewSearchResult = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("list_view_search_result")).toString();
				if (listViewSearchResult.length() > 0) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		// Showing 0 to 0 of 0 entries
		System.out.println("List view searh result " + listViewSearchResult);
		softAssert.assertTrue(!(listViewSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")));

	}

	@And("user_076 search the in valid search test in facility info app data entry stage")
	public void user_076_search_the_in_valid_search_test_in_facility_info_app_data_entry_stage() throws Throwable {
		for (int i = 0; i <= 3; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.click();
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_search_input"))
						.sendKeys(facilityInfoTestData.get("invalid_search_text"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("user_076 verify facility info list view grid should not show the record at app data entry stage")
	public void user_076_verify_facility_info_list_view_grid_should_not_show_the_record_at_app_data_entry_stage()
			throws Throwable {
		Thread.sleep(5000);
		String listViewSearchResult = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewSearchResult = javascriptHelper
						.executeScript("return " + CommonJsElements.getElement("list_view_search_result")).toString();
				if (listViewSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries")) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("List view searh result " + listViewSearchResult);
		softAssert.assertTrue(listViewSearchResult.equalsIgnoreCase("Showing 0 to 0 of 0 entries"));
	}

	@And("user_076 click on export button in facility info screen at app data entry stage")
	public void user_076_click_on_export_button_in_facility_info_screen_at_app_data_entry_stage() throws Throwable {

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("list_view_export_button"))
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

	@And("user_076 choose pdf option in facility info at app data entry")
	public void user_076_choose_pdf_option_in_facility_info_at_app_data_entry() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("pdf_download"))
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

	@Then("user_076 verify facility info list view record should downloaded in pdf format")
	public void user_076_verify_facility_info_list_view_record_should_downloaded_in_pdf_format() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("FacilityDetailsDataFile")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("FacilityDetailsDataFile"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}

		}
	}

	@And("user_076 choose xlsx option in facility info at app data entry")
	public void user_076_choose_xlsx_option_in_facility_info_at_app_data_entry() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CommonJsElements.getElement("pdf_download"))
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

	@Then("user_076 verify facility info list view record should downloaded in xlsx format")
	public void user_076_verify_facility_info_list_view_record_should_downloaded_in_xlsx_format() throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("FacilityDetailsDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("FacilityDetailsDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
	}

	@And("invoke softAssert at facility info app data entry stage")
	public void invoke_soft_assert_at_facility_info_app_data_entry_stage() throws Throwable {
		softAssert.assertAll();
	}
}
