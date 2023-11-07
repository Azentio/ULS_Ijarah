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
		ExcelData IncomeDetailsListexelData = new ExcelData(excelTestDataPath, "IncomeDetailsList", "Data Set ID");
		Map<String, String> testdata = IncomeDetailsListexelData.getTestdata("DS_AT_INC_01");
		System.out.println(testdata.get("FrequencyInput"));
		
	}
	
}
