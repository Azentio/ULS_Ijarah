package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import pageobjects.JSPaths;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	
	WebDriver driver;
	public static void main(String[] args) {
		ConfigFileReader confileReader = new ConfigFileReader();
		String excelPath = confileReader.getJSFilePath();
		String employmentDetailsExcelDataPath = confileReader.getMurabhaTestDataFilePath();
		ExcelData excelDataForEmploymentDetailsMurabhaExecutionData = new ExcelData(employmentDetailsExcelDataPath,
				"Appdata_EmployementDetailsExe", "TestCase ID");
		ExcelData excelDataForEmploymentDetailsTestData = new ExcelData(employmentDetailsExcelDataPath,
				"EmploymentDetails_AppData", "Dataset ID");
		
		Map<String, String> testdata = excelDataForEmploymentDetailsMurabhaExecutionData.getTestdata("AT_MU_EMPD_01");
		System.out.println(testdata.get("dataSet_ID"));
		Map<String, String> testdata2 = excelDataForEmploymentDetailsTestData
				.getTestdata(testdata.get("dataSet_ID"));
		System.out.println(testdata2.get("record_reference_number"));
	}
	
	
}
