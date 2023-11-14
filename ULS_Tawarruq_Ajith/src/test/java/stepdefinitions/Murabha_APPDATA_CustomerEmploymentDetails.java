package stepdefinitions;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import pageobjects.JSPaths;
import resources.BaseClass;
import utilities.UserUtility_0482;

public class Murabha_APPDATA_CustomerEmploymentDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	TawarruqLogin tawarruqLogin = new TawarruqLogin();
	UserUtility_0482 userUtility = new UserUtility_0482();
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
	JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
			"JSPath");
	JSPaths applicationDetailsElements = new JSPaths(excelFilePathForJS, "AppData_AppllicationDetailsJS",
			"Tawarruq_NewApp_fieldName", "JSPath");
	String applicationDetailsExcelDataPath = System.getProperty("user.dir") + "\\TestData\\TawarruqTestData.xlsx";
	BrowserHelper browserHelper= new BrowserHelper(driver);
	ExcelData excelDataForApplicationDetailsTestData = new ExcelData(applicationDetailsExcelDataPath,
			"ApplicationDetails_AppData", "Dataset ID");
	ExcelData excelDataForApplicationDetailsTawarruqExecutionData = new ExcelData(applicationDetailsExcelDataPath,
			"Appdata_ApplicationDetailsExe", "TestCase ID");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> appdataEntrtyTestData = new HashMap<>();
	Map<String, String> appdataEntrtyExecutionData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	String toastMessageForReferenceNumber = "";

}
