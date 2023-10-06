package stepdefinitions;

import java.util.Iterator;
import java.util.Map;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Application_Detail_Customer_Search {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths New_ApplicationPaths = new JSPaths(excelPath, "New_Application", "FieldName", "JSPath");
	ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "New_Application", "Data Set ID");
	ExcelData Customer_Search = new ExcelData(excelTestDataPath, "Customer_Search", "Data Set ID");
	Map<String, String> testData;
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	
	
	
	

}
