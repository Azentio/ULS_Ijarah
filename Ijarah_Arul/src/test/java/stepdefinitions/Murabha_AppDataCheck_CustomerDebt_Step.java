package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Murabha_AppDataCheck_CustomerDebt_Step {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	ExcelData excelDataForAddressDetailsTestData = new ExcelData(excelTestDataPath, "ijarah_AddressDetailsTestData",
			"Dataset ID");
	ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"customerDebtExcelData","Dataset ID");
	Map<String, String> addressDetailsTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	// String recordReferenceNumber = "2945";
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JSPaths Ijarah_CustomerDebt = new JSPaths(excelPath, "CustomerDebt", "Ijarah_CustomerDebt", "JSPath");
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> AssetDetailsTestData = new HashMap<>();
	ExcelData excelDataForAssetDetailsTestData = new ExcelData(excelTestDataPath, "AssetDetai lsTestData",
			"Dataset ID");

	@And("User search the Ref id under inbox for Murabha_App data check_Customer Debt")
	public void user_search_the_ref_id_under_inbox_for_murabha_app_data_check_customer_debt() {
		System.out.println(testData.get("Ref No"));
		System.out.println(Ijarah_CustomerDebt.getElement("inboxSearchInput"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(Ijarah_CustomerDebt.getElement("inboxSearchInput"))
				.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		} 
	}
	@And("^User get the test data for test case AT_DC_CD_001$")
	public void get_the_test_data_for_test_case_AT_DC_CD_001() throws Throwable {
		testData = customerDebtExcelData.getTestdata("AT_DC_CD_001_D1");
	}

}
