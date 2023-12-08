package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	
	WebDriver driver;
	public static void main(String[] args) {
		ConfigFileReader configFileReader = new ConfigFileReader();
		ExcelData excelDataForLivingExpense = new ExcelData(configFileReader.getIjarahTestDataFilePath(), "Living_Expense", "DataSetID");
		Map<String, String> testdata = excelDataForLivingExpense.getTestdata("AT_LEA_001_D1");
		System.out.println(testdata.get("ClientName"));
	}
	
	
}
