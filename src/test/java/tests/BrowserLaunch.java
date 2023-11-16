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
		ExcelData documentdetailsExcelData  = new ExcelData(excelTestDataPath,"Document_Details","DataSetID");
		Map<String, String> testdata = documentdetailsExcelData.getTestdata("AT_DOC_001_D1");
		System.out.println(testdata.get("Ref No"));
	}
}
