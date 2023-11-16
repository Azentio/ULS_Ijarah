package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) {
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelData TawaAppDataEntryIncomeDetailstexelData = new ExcelData(excelTestDataPath, "TawaAppDataEntryIncomeDetails", "Data Set ID");
		Map<String, String> testdata = TawaAppDataEntryIncomeDetailstexelData.getTestdata("DS_AT_MU_INC_05");
		System.out.println(testdata.get("Lumpsum Amount"));
		
	}
	
}
