package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	WebDriver driver;
	public static void main(String[] args) {
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"customerDebtExcelData","Dataset ID");
		Map<String, String> testdata = customerDebtExcelData.getTestdata("AT_TW_ADC_CD_001_D1");
		System.out.println(testdata.get("Ref No"));
	}
}
