package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class AutoLoan_DisbursionMaker_MarginMoney {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");

//	JSPaths MarginMoney_JSPaths  = new JSPaths(excelPath, "Mura_offering_documentDetail",
//			"DocumentDetailsElement", "JSPath");
	JSPaths MarginMoney_JSPaths  = new JSPaths(excelPath, "AL_MM_JS",
			"MarginMoneyFieldName", "JSPath");

	ExcelData AL_DSB_MM_TestData = new ExcelData(excelTestDataPath, "AL_MarginMoney",
			"Dataset ID");

	@And("User_6047 Get the test data for test case ID AT_AL_DSB_MM_04")
	public void user_6047_get_the_test_data_for_test_case_id_at_al_dsb_mm_04() {
		testData = AL_DSB_MM_TestData.getTestdata("DS01_AT_AL_DSB_MM_04");
	}
	@And("User_6047 search the refer id under Inbox")
	public void user_6047_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
		}
@Then("User_6047 Click the Margin money screen")
public void user_6047_click_the_margin_money_screen() {
	for (int i = 0; i < 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(
					MarginMoney_JSPaths  .getElement("dsb_margin_money_section")).click();
			//javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("dsb_margin_money_section")).click();
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}

	}
}

@Then("User_6047 to verify the back button in Margin money screen")
public void user_6047_to_verify_the_back_button_in_margin_money_screen() {

		for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("BackButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}

}

@Then("User_6047 to verify the save button in Margin money screen")
public void user_6047_to_verify_the_save_button_in_margin_money_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("saveButton")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 to verify the Margin money money in Margin money screen")
public void user_6047_to_verify_the_margin_money_money_in_margin_money_screen() {
//	for (int i = 0; i <200; i++) {
//		try {
//			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("Marginmoney_innerscreen")).isDisplayed());
//			break;
//		} catch (Exception e) {
//			if (i==199) {
//				Assert.fail(e.getMessage());
//			}
//		}
//	}
	
	String text ="";
	for (int i = 0; i <= 300; i++) {
		try {
			text = javascriptHelper
					.executeScript("return " + MarginMoney_JSPaths  .getElement("Marginmoney_innerscreen")).toString();
			if (!(text.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	softAssert.assertTrue(text.contains("Margin Money"),
			" Not present the Margin Money, hence failed");


}

@Then("User_6047 to verify the Margin money section in Margin money screen")
public void user_6047_to_verify_the_margin_money_section_in_margin_money_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("own_contribution_amount_input")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("own_contribution_amount_paid")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 to modify the data in Margin money")
public void user_6047_to_modify_the_data_in_margin_money() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input"))
			//.sendKeys(testData.get("address_line_1"));
			.sendKeys(testData.get("Amount"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 click the save button and verify the data updated")
public void user_6047_click_the_save_button_and_verify_the_data_updated() {
	for (int i = 0; i < 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(
					MarginMoney_JSPaths  .getElement("saveButton")).click();
			
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}

	}

		String toastMessage ="";
		for (int i = 0; i <= 300; i++) {
			try {
				 toastMessage = javascriptHelper
						.executeScript("return " + iJarah_CommonElements.getElement("toast_container_message")).toString();
				if (!(toastMessage.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(toastMessage.contains("Success! Record created with ID"),
				"Record is not saved hence failed");
	}


@Then("User_6047 to modify the valid data in Margin money")
public void user_6047_to_modify_the_valid_data_in_margin_money() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input"))
		
			.sendKeys(testData.get("valid data"));
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	}


@Then("User_6047 to modify and verify system should not allow user to do a modification with invalid data")
public void user_6047_to_modify_and_verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data() throws Throwable {
	//boolean status = false;
	for (int i = 0; i <= 20; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input")).sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_input"))
			.sendKeys(testData.get("invalid data"));

		} catch (Exception e) {
			if (i == 20) {
				//status = true;
			}
		}
	}
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.JSEClick(
					javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("saveButton")));

			break;
		} catch (Exception e) {
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <= 1000; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("editIcon")).click();
			break;
		} catch (Exception e) { 
			if (i == 1000) {
				Assert.fail(e.getMessage());
			}
		}
	}
	Thread.sleep(3000);
	String fieldName = javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("amount_inputdata")).getAttribute("ng-reflect-model");
	//Assert.assertTrue(fieldName.contains("null"));
	Assert.assertFalse(fieldName.contains(testData.get("invalid data")));
	

}

@Then("User_6047 verify the confirmation of save message")
public void user_6047_verify_the_confirmation_of_save_message() {
	String toastMessage ="";
	for (int i = 0; i <= 300; i++) {
		try {
			 toastMessage = javascriptHelper
					.executeScript("return " + iJarah_CommonElements.getElement("toast_container_message")).toString();
			if (!(toastMessage.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	softAssert.assertTrue(toastMessage.contains("Success! Record created with ID"),
			"Record is not saved hence failed");
}

@Then("User_6047 click back button")
public void user_6047_click_back_button() {
	for (int i = 0; i < 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(
					MarginMoney_JSPaths  .getElement("BackButton")).click();
		
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}

	}
}

@Then("User_6047 click verify the functionality of pre back button")
public void user_6047_click_verify_the_functionality_of_pre_back_button() {
	
	String text ="";
	for (int i = 0; i <= 300; i++) {
		try {
			text = javascriptHelper
					.executeScript("return " + MarginMoney_JSPaths  .getElement("inbox_title")).toString();
			if (!(text.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	softAssert.assertTrue(text.contains("Inbox"),
			" Not navigate to previous screen, hence failed");
}

@Then("User_6047 click verify the functionality of back button")
public void user_6047_click_verify_the_functionality_of_back_button() {
	
	String text ="";
	for (int i = 0; i <= 300; i++) {
		try {
			text = javascriptHelper
					.executeScript("return " + MarginMoney_JSPaths  .getElement("marginmoney")).toString();
			if (!(text.isBlank())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	softAssert.assertTrue(text.contains("Margin Money"),
			" Not navigate to previous screen, hence failed");
}

@Then("User_6047 To verify Back button in listview screen")
public void user_6047_to_verify_back_button_in_listview_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("BackButton_prev")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify Add button in listview screen")
public void user_6047_to_verify_add_button_in_listview_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("dsb_margin_money_add_button")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify edit button in listview screen")
public void user_6047_to_verify_edit_button_in_listview_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("editIcon")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify Search box in listview screen")
public void user_6047_to_verify_search_box_in_listview_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(MarginMoney_JSPaths  .getElement("listview_search")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 Click the export button")
public void user_6047_click_the_export_button() {

	for (int i = 0; i < 200; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(
					iJarah_CommonElements.getElement("ExportButton")).click();
		
			break;
		} catch (Exception e) {
			if (i == 199) {
				Assert.fail(e.getMessage());
			}
		}

	}
}

@Then("User_6047 To verify Export to PDF in listview screen")
public void user_to_verify_export_to_pdf_in_listview_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("pdf_download")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify Export to Excel in listview screen")
public void user_6047_to_verify_export_to_excel_in_listview_screen() {
	for (int i = 0; i <200; i++) {
		try {
			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("xls_download")).isDisplayed());
			break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 To verify the fields in list view of margin money")
public void user_6047_to_verify_the_fields_in_list_view_of_margin_money() {
	String fieldName="";
	for (int l = 0; l <= 20; l++) {
	try {

		fieldName = javascriptHelper.executeScript(
				"return document.querySelectorAll('thead[class=\"p-datatable-thead\"] tr')[1].innerText")
				.toString();

		System.out.println(fieldName);
		if (!(fieldName.isBlank())) {


			break;
		}
	} catch (Exception e) {
		if (l == 20) {
			Assert.fail(e.getMessage());
		}
	}
}

System.out.println("Field Name " + fieldName);
Assert.assertTrue(fieldName.contains("Select"));
Assert.assertTrue(fieldName.contains("Action"));
Assert.assertTrue(fieldName.contains("Own Contribution Amount"));
Assert.assertTrue(fieldName.contains("Amount"));
Assert.assertTrue(fieldName.contains("Own Contribution Amount Paid?"));
Assert.assertTrue(fieldName.contains("Status"));

}

@Then("User_6047 To verify the system should display the records on the list view")
public void user_6047_to_verify_the_system_should_display_the_records_on_the_list_view() {
	String NumberOFlistViewRecord = "";
	
	for (int i = 0; i <= 300; i++) {

		try {

			if (i > 200) {

				NumberOFlistViewRecord = javascriptHelper.executeScript(

						"return document.querySelector('ion-col[class=\"m-0 p-0 ng-star-inserted md hydrated\"]').querySelector('span[class=\"p-paginator-current ng-star-inserted\"]').innerText")

						.toString();

				break;

			}
} 
		catch (Exception e) {
			if (i == 300) {
             	Assert.fail(e.getMessage());

			}

		}

	}

	System.out.println(NumberOFlistViewRecord);


}

@Then("User_6047 to verify Add button system should allow user to create new record in Margin money")
public void user_6047_to_verify_add_button_system_should_allow_user_to_create_new_record_in_Margin_money() {

String listViewRecordLabels = "";
for (int i = 0; i <= 300; i++) {
	try {
		listViewRecordLabels = javascriptHelper
				.executeScript("return "
						+ MarginMoney_JSPaths  .getElement("Marginmoney_innerscreen"))
				.toString();
		if (!(listViewRecordLabels.isEmpty())) {
			break;
		}
	} catch (Exception e) {
		if (i == 300) {
			Assert.fail(e.getMessage());
		}
	}
}
softAssert.assertTrue(listViewRecordLabels.contains("Margin Money"), "add button not work");

}
@Then("User_6047 click the Search button and search the matching record in listview")
public void user_6047_click_the_search_button_and_search_the_matching_record_in_listview() {
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement("document.querySelector('button[ng-reflect-icon=\"pi pi-search\"] span[class=\"p-button-icon pi pi-search\"]')").click();
		
			javascriptHelper
					.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_listView"))
					.click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <= 500; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
					.sendKeys(testData.get("matching data"));
			Thread.sleep(3000);
			break;
		}

		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 check the matching result data in list view")
public void user_6047_check_the_matching_result_data_in_list_view() {
	String searchResult = "";
	for (int i = 0; i <= 300; i++) {
		try {
			searchResult = javascriptHelper.executeScript("return " + iJarah_CommonElements
					.getElement("list_view_search_result")).toString();
			System.out.println(searchResult);
			if (!(searchResult.isEmpty())) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
		softAssert.assertNotEquals(searchResult, "Showing 0 to 0 of 0 entries",
				"system is not showing the matched result");
	}
}

@Then("User_6047 clear the search box in listview")
public void user_6047_clear_the_search_box_in_listview() {
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
					.clear();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 click the Search button and search the mismatching record in listview")
public void user_6047_click_the_search_button_and_search_the_mismatching_record_in_listview() {
	for (int i = 0; i <= 500; i++) {
		try {
			//javascriptHelper.executeScriptWithWebElement("document.querySelector('button[ng-reflect-icon=\"pi pi-search\"] span[class=\"p-button-icon pi pi-search\"]')").click();
		
			javascriptHelper
					.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_listView"))
					.click();
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
	for (int i = 0; i <= 500; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
					.sendKeys(testData.get("mismatching data"));
			Thread.sleep(3000);
			break;
		}

		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}

@Then("User_6047 check the mismatching result in list view")
public void user_6047_check_the_mismatching_result_in_list_view() {
	String searchResult = "";
	for (int i = 0; i <= 300; i++) {
		try {
			searchResult = javascriptHelper.executeScript("return " + iJarah_CommonElements
					.getElement("list_view_search_result")).toString();
		
			if (!(searchResult.isEmpty()) && i > 250) {
				break;
			}
		} catch (Exception e) {
			if (i == 300) {
				Assert.fail(e.getMessage());
			}
		}
	}
	System.out.println(searchResult);
	softAssert.assertEquals(searchResult, "Showing 0 to 0 of 0 entries",
			"system is  showing the un matched result");
}

@Then("User_6047 click on export to excel button")
public void user_6047_click_on_export_to_excel_button() {
	for (int i = 0; i <= 500; i++) {
		try {
			
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("xls_download")).click();
			Thread.sleep(6000);
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}  
			


}

@Then("User_6047 verify the system is downloading the excel file")
public void user_6047_verify_the_system_is_downloading_the_excel_file() 
	throws Throwable {
		String homePath = System.getProperty("user.home");
		String filePath = homePath + "/Downloads";
		File file = new File(filePath);
		File[] listFiles = file.listFiles();
		file.delete();
		for (File downloadsFile : listFiles) {
			System.out.println(downloadsFile.getName());
			if (downloadsFile.getName().contains("MorginMoneyDataFile_export_")) {
				System.out.println("If condition " + downloadsFile.getName());
				softAssert.assertTrue(downloadsFile.getName().contains("MorginMoneyDataFile_export_"),
						"File is not downloaded hence failed");
				downloadsFile.delete();
			}
		}
}

@Then("User_6047 click on export to pdf button")
public void user_6047_click_on_export_to_pdf_button() {
	
	for (int i = 0; i <= 500; i++) {
		try {
			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("pdf_download")).click();
			Thread.sleep(3000);
			break;
		} catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}  
}

@Then("User_6047 verify the system is downloading the pdf file")
public void user_6047_verify_the_system_is_downloading_the_pdf_file() 
	throws Throwable {
	browserHelper.SwitchToWindow(1);
	browserHelper.switchToParentWithChildClose();

	String homePath = System.getProperty("user.home");
	String filePath = homePath + "/Downloads";
	File file = new File(filePath);
	File[] listFiles = file.listFiles();
	file.delete();
	for (File downloadsFile : listFiles) {
		System.out.println(downloadsFile.getName());
		if (downloadsFile.getName().contains("MorginMoneyDataFile")) {
			System.out.println("If condition " + downloadsFile.getName());
			softAssert.assertTrue(downloadsFile.getName().contains("MorginMoneyDataFile"),
					"File is not downloaded hence failed");
			downloadsFile.delete();
		}

	}
}
@Then("User_6047 search the record in list view")
public void user_6047search_the_record_in_list_view() {
	for (int i = 0; i <= 500; i++) {
		try {

			javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
					.sendKeys(testData.get("valid data"));
			break;
		}

		catch (Exception e) {
			if (i == 500) {
				Assert.fail(e.getMessage());
			}
		}
	}
}
}