package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import pageobjects.JSPaths;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) {
//		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
//		ExcelData TawaAppDataEntryIncomeDetailstexelData = new ExcelData(excelTestDataPath, "New_Application", "Data Set ID");
//		Map<String, String> testdata = TawaAppDataEntryIncomeDetailstexelData.getTestdata("DS_AT_NEWAPP_02");
//		System.out.println(testdata.get("SelectOptionInProduct"));
		
		String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
		JSPaths ALADEntryIdentificationDetails = new JSPaths(excelPath, "New_Application", "FieldName", "JSPath");
		System.out.println(ALADEntryIdentificationDetails.getElement("Product*1"));
		
		
	}
	
}
