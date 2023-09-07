package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import pageobjects.JSPaths;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	WebDriver driver;
	public static void main(String[] args) {
		String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelData excelData = new ExcelData(excelTestDataPath, "Ijara_Quotation_Info", "Data Set ID");
		Map<String, String> testdata = excelData.getTestdata("AT_QIA_002_D2");
		//System.out.println(testdata.get("Reference Id"));
		JSPaths repaymentModeJpaths = new JSPaths(excelPath, "Quotation_Info", "Ijara_LoginFieldName", "JSPath");
		System.out.println(testdata.get("InsuranceCompanyInput"));
	}
	
	
}
