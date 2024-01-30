package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarruq_AppDataCheck_InsuranceInfo {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	SoftAssert softAssert = new SoftAssert();
	//ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	JSPaths Tawa_InsuranceInfo_js = new JSPaths(excelPath, "Tawa_Commodity_InsuranceInfo", "InsuranceInfoElement", "JSPath");
	ExcelData Tawa_InsuranceInfo_TestData  = new ExcelData(excelTestDataPath,"Tawa_check_InsuranceInfo","Dataset ID");
	
	

	@And("User_6047 Get the test data for test case ID AT_TW_INS_01")
	public void user_6047_get_the_test_data_for_test_case_id_AT_TW_ins_01() {
		testData = Tawa_InsuranceInfo_TestData.getTestdata("DS01_AT_TW_INS_01");

	}
	@And("User_6047 search the Refe id under Inbox")
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
	@Then("User_6047 To verify the back button field in Insurance Info screen")
	public void user_6047_to_verify_the_back_button_field_in_insurance_info_screen() {
		boolean back = false;
		for ( int i = 0; i <= 300; i++) {
			try {
				back = javascriptHelper
						.executeScriptWithWebElement(iJarah_CommonElements.getElement("back_button")).isDisplayed();
				if (back == true) {
					break;
				}
			} catch (Exception e) {

			}
		}
		softAssert.assertTrue(back, "back buttonis  not visisble hence failed");
	}
	
	@Then("User_6047 verify the functionality of back button in InsuranceInfo")
	public void user_6047_verify_the_functionality_of_back_button_in_insurance_info() {
		String title = javascriptHelper.executeScriptWithWebElement(Tawa_InsuranceInfo_js.getElement("backButton_fun_verify")).getText();

		for (int i = 0; i <2000; i++) {

	      try {
	          Assert.assertTrue((title.equals("Insurance Info")));
	          break;
	      } catch (Exception e) {
	          if (i==1999) {
	              Assert.fail(e.getMessage());
	          }
	      }

		}}
	
}
