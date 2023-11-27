package tests;

import java.util.Map;

import dataProvider.ExcelData;
import pageobjects.JSPaths;

public class TestMobileEmulator {
	public static void main(String args[]) {
		String excelFilePathForJS = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
		JSPaths commonJSPaths = new JSPaths(excelFilePathForJS, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName",
				"JSPath");
		JSPaths customerEmploymentDetailsElements = new JSPaths(excelFilePathForJS, "AppData_EmploymentDetails",
				"Tawarruq_Appdata_fieldName", "JSPath");
		String employmentDeatilsExcelDataPath = System.getProperty("user.dir") + "\\TestData\\TawarruqTestData.xlsx";
		ExcelData excelDataForemploymetDetailsTestData = new ExcelData(employmentDeatilsExcelDataPath,
				"EmploymentDetailsTestData", "Dataset ID");
		ExcelData excelDataForDetailsTawarruqExecutionData = new ExcelData(employmentDeatilsExcelDataPath,
				"Appdata_ApplicationDetailsExe", "TestCase ID");
		 Map<String, String> testdata = excelDataForDetailsTawarruqExecutionData.getTestdata("AT_TW_AD_EMPD_01");
		 Map<String, String> testdata2 = excelDataForemploymetDetailsTestData
				.getTestdata(testdata.get("dataSet_ID"));
		 System.out.println(customerEmploymentDetailsElements.getElement("Customer Financial Tab"));
        
}
}
