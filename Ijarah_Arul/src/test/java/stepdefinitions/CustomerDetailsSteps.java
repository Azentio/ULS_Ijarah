package stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CustomerDetailsSteps extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String testDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	JSPaths customerSearchJSPaths = new JSPaths(excelFilePathForJS, "customer_search_JS",
			"Ijarah_customer_search_fieldName", "JSPath");
	JSPaths commonJSElements = new JSPaths(excelFilePathForJS, "iJarah_CommonElements", "Ijarah_CommonFieldName",
			"JSPath");
	JSPaths customerDetailsJSElements = new JSPaths(excelFilePathForJS, "NewApp_CustomerDetailsElements",
			"New_App_CustomerDetailsElements", "JSPath");
	WebDriver driver = BaseClass.driver;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ExcelData newAppExecutionSheet = new ExcelData(testDataPath, "PersonalLoanExecution", "TestCase ID");
	ExcelData customerDetailsTestData = new ExcelData(testDataPath, "PL_AppDetails_NewAPP_TestData", "Dataset ID");
	Map<String, String> autoLoanExecutionData = new HashMap<>();
	Map<String, String> newAppCustomerDetailsTestData = new HashMap<>();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	

}
