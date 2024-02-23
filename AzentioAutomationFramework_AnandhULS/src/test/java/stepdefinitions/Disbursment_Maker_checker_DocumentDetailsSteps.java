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

public class Disbursment_Maker_checker_DocumentDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ExcelData autoLoanExecutionSheet = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"AutoLoanExecution", "TestCase ID");
	ExcelData documentDetailsExcelTestData = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(),
			"DSBMKRCHR_DocDetailsTestData", "Dataset ID");
	Map<String, String> auloLoanEXecutionSheet = new HashMap<>();
	Map<String, String> documentDetailsTestData = new HashMap<>();
	JSPaths commonJSElements = new JSPaths(configFileReader.getJSFilePath(), "iJarah_CommonElements",
			"Ijarah_CommonFieldName", "JSPath");
	JSPaths documentDetailsElements = new JSPaths(configFileReader.getJSFilePath(), "DocumentDetails_JSPaths",
			"DocumentDetails_ElementName", "JSPaths");
	SoftAssert softAssert = new SoftAssert();

	@And("^user_076 get the test data for test case ID AT_AL_DC_01_MKR$")
	public void user_076_get_the_test_data_for_test_case_id_at_al_dc_01_mkr() throws Throwable {
		auloLoanEXecutionSheet = autoLoanExecutionSheet.getTestdata("AT_AL_DC_01_MKR");
		System.out.println("data Set ID " + auloLoanEXecutionSheet.get("dataSet_ID"));
		documentDetailsTestData = documentDetailsExcelTestData.getTestdata(auloLoanEXecutionSheet.get("dataSet_ID"));

	}
	@And("^user_076 get the test data for test case ID AT_AL_DC_01_CHR$")
	public void user_076_get_the_test_data_for_test_case_id_at_al_dc_01_chr() throws Throwable {
		auloLoanEXecutionSheet = autoLoanExecutionSheet.getTestdata("AT_AL_DC_01_CHR");
		System.out.println("data Set ID " + auloLoanEXecutionSheet.get("dataSet_ID"));
		documentDetailsTestData = documentDetailsExcelTestData.getTestdata(auloLoanEXecutionSheet.get("dataSet_ID"));

	}

	@And("^user_076 click on document details section at disbursment maker stage$")
	public void user_076_click_on_document_details_section_at_disbursment_maker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						documentDetailsElements.getElement("disbursementMkrChr_document_details_tab")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user_076 click on document details section at disbursment checker stage$")
	public void user_076_click_on_document_details_section_at_disbursment_checker_stage() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						documentDetailsElements.getElement("disbursementMkrChr_document_details_tab")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("^user_076 click on list view view button in document details screen$")
	public void user_076_click_on_list_view_view_button_in_document_details_screen() throws Throwable {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						documentDetailsElements.getElement("documentDetails_Listview_viewButton")).click();
				break;

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^user_076 verify document details screen fields should be read only mode at disbursment maker stage$")
	public void user_076_verify_document_details_screen_fields_should_be_read_only_mode_at_disbursment_maker_stage()
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
					System.out.println("Total number of fields " + numberOfFields);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < (numberOfFields - 4); i++) {
			for (int j = 0; j <= 150; j++) {
				try {
					System.out.println("I value " + i);
					String fieldType = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					System.out.println("Label Query "
							+ "\"document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"] ion-label')[" + i
							+ "].innerText");
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
	@Then("^user_076 verify document details screen fields should be read only mode at disbursment checker stage$")
	public void user_076_verify_document_details_screen_fields_should_be_read_only_mode_at_disbursment_checker_stage()
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
					System.out.println("Total number of fields " + numberOfFields);
					break;
				}
			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < (numberOfFields - 4); i++) {
			for (int j = 0; j <= 150; j++) {
				try {
					System.out.println("I value " + i);
					String fieldType = javascriptHelper.executeScript(
							"return " + "document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"]')[" + i
									+ "].getAttribute('ng-reflect-readonly')")
							.toString();
					System.out.println("Label Query "
							+ "\"document.querySelectorAll('ion-col>*[class^=\"ng-untouched\"] ion-label')[" + i
							+ "].innerText");
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

	@Then("^user_076 verify document details field values should be matched with data entry value at disbursment maker stage$")
	public void user_076_verify_document_details_field_values_should_be_matched_with_data_entry_value_at_disbursment_maker_stage()
			throws Throwable {
		String customerName = "";
		String documentName = "";
		String documentStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				customerName = javascriptHelper
						.executeScript("return " + documentDetailsElements.getElement("get_customer_name_text"))
						.toString();
				if (customerName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map " + documentDetailsTestData.get("customer_name"));
		softAssert.assertTrue(customerName.contains(documentDetailsTestData.get("customer_name")),
				customerName + " is not matched with data entry record  hence failed");
		// document name

		for (int i = 0; i <= 150; i++) {
			try {
				documentName = javascriptHelper
						.executeScript("return " + documentDetailsElements.getElement("get_document_name_text"))
						.toString();
				if (documentName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map " + documentDetailsTestData.get("document_name"));
		softAssert.assertTrue(documentName.contains(documentDetailsTestData.get("document_name")),
				documentName + " is not matched with data entry record  hence failed");

		// Document Status
		for (int i = 0; i <= 150; i++) {
			try {
				documentStatus = javascriptHelper
						.executeScript("return " + documentDetailsElements.getElement("get_document_status_text"))
						.toString();
				if (documentStatus.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map " + documentDetailsTestData.get("document_status"));
		softAssert.assertTrue(documentStatus.contains(documentDetailsTestData.get("document_status")),
				documentStatus + " is not matched with data entry record  hence failed");
	}
	@Then("^user_076 verify document details field values should be matched with data entry value at disbursment checker stage$")
	public void user_076_verify_document_details_field_values_should_be_matched_with_data_entry_value_at_disbursment_checker_stage()
			throws Throwable {
		String customerName = "";
		String documentName = "";
		String documentStatus = "";
		for (int i = 0; i <= 150; i++) {
			try {
				customerName = javascriptHelper
						.executeScript("return " + documentDetailsElements.getElement("get_customer_name_text"))
						.toString();
				if (customerName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map " + documentDetailsTestData.get("customer_name"));
		softAssert.assertTrue(customerName.contains(documentDetailsTestData.get("customer_name")),
				customerName + " is not matched with data entry record  hence failed");
		// document name

		for (int i = 0; i <= 150; i++) {
			try {
				documentName = javascriptHelper
						.executeScript("return " + documentDetailsElements.getElement("get_document_name_text"))
						.toString();
				if (documentName.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map " + documentDetailsTestData.get("document_name"));
		softAssert.assertTrue(documentName.contains(documentDetailsTestData.get("document_name")),
				documentName + " is not matched with data entry record  hence failed");

		// Document Status
		for (int i = 0; i <= 150; i++) {
			try {
				documentStatus = javascriptHelper
						.executeScript("return " + documentDetailsElements.getElement("get_document_status_text"))
						.toString();
				if (documentStatus.length() > 0) {
					break;
				}

			} catch (Exception e) {
				if (i == 150) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
		System.out.println("Customer details first name map " + documentDetailsTestData.get("document_status"));
		softAssert.assertTrue(documentStatus.contains(documentDetailsTestData.get("document_status")),
				documentStatus + " is not matched with data entry record  hence failed");
	}

	@And("^user_076 invoke softAssert in document details at disbursment maker checker stage$")
	public void user_076_invoke_softassert_in_document_details_at_disbursment_maker_checker_stage() throws Throwable {
		softAssert.assertAll();
	}

}
