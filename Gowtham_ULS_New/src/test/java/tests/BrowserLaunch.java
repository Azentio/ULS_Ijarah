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
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelData TawaAppDataEntryIncomeDetailstexelData = new ExcelData(excelTestDataPath, "ALADEntryIdentificationDetails", "Data Set ID");
		Map<String, String> testdata = TawaAppDataEntryIncomeDetailstexelData.getTestdata("DS_AT_AL_IND_01");
		System.out.println(testdata.get("id_type"));
		
//		String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
//		JSPaths ALADEntryIdentificationDetails = new JSPaths(excelPath, "ALADEntryIdentificationDetails", "FieldName", "JSPath");
//		System.out.println(ALADEntryIdentificationDetails.getElement("additional_customer_info_tab"));
		
		
	}
	
}
