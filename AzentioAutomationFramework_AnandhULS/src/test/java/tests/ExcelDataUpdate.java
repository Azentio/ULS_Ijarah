package tests;

import java.util.HashMap;
import java.util.Map;

import dataProvider.ExcelData;
import dataProvider.ExcelReader;

public class ExcelDataUpdate {
	public static void main(String args[])
	{
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ulsTestData.xlsx";
		ExcelData commodityPOMakerTestData = new ExcelData(excelTestDataPath, "TW_CommodityPO_TestData", "Dataset ID");
		ExcelData tawruqqExecutioSheet = new ExcelData(excelTestDataPath, "Tawruqq_ExecutionTracker", "TestCase ID");
		Map<String, String> commodityExecution = new HashMap<>();
		Map<String,String> testData= new HashMap<>();
		commodityExecution=tawruqqExecutioSheet.getTestdata("AT_TW_CSM_03");
		System.out.println(commodityExecution.get("dataSet_ID"));
		testData=commodityPOMakerTestData.getTestdata(commodityExecution.get("dataSet_ID"));
		System.out.println(testData.get("Dataset ID"));
		System.out.println(testData.get("valid_search_text"));
	}

}
