package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarruq_Steps {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;

	JSPaths jsPaths2 = new JSPaths(excelPath, "Ijara_AD_DocumentDetails", "Ijara_LoginFieldName", "JSPath");
	JSPaths jsPaths3 = new JSPaths(excelPath, "Murabha_Module", "Murabha_LoginFieldName", "JSPath");
														
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");

	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	ExcelData ad_CustomerFolllowUpDetails_610 = new ExcelData(path, "AD_CustomerFolllowUpDetails_610", "DataSet ID");
	Map<String, String> testData;
	
	ExcelData morabha_AppDataEntry = new ExcelData(path, "Morabha_AppDataEntry", "DataSet ID");
	Map<String, String> testData01;
	
	ExcelData mura_ADEntery_CustomerEMPdet = new ExcelData(path, "Mura_ADEntery_CustomerEMPdet", "DataSet ID");
	Map<String, String> testData02;
	
	
}
