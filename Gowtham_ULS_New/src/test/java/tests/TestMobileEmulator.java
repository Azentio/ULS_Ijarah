package tests;

import java.util.Map;

import dataprovider.ExcelData;
import pageobjects.JSPaths;

public class TestMobileEmulator {
	public static void main(String args[]) {
		
//		String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
//		JSPaths jsPaths = new JSPaths(excelPath, "MurabAppDataEntryLivingExpenses", "FieldName", "JSPath");
//		System.out.println(excelPath);
//		System.out.println(jsPaths.getElement("MessageBox"));
		
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelData IjaraAppDataCheckQuationInfoexelData = new ExcelData(excelTestDataPath, "IjaraAppDataCheckQuationInfo", "Data Set ID");
		Map<String, String> testData;
		testData = IjaraAppDataCheckQuationInfoexelData.getTestdata("DS_AT_IJ_QA_01");
		System.out.println(testData.get("Search Record"));
		
	}

}
