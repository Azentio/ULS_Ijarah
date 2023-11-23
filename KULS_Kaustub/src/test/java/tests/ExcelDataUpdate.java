package tests;

import java.util.HashMap;
import java.util.Map;

import dataProvider.ExcelData;
import dataProvider.ExcelReader;

public class ExcelDataUpdate {
	public static void main(String args[])
	{
		String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
		ExcelData updateFile = new ExcelData(testDataPath, "TransactionOnStaffAccount_Execu", "TestCaseID");
		Map<String,String> updatedMap= new HashMap<>();
		//ExcelData exelDataForGeneralLedger2 = new ExcelData(testDataPath, "TrasactionOnStaffAccountTestDat", "DataSet ID");
//		exelDataForGeneralLedger.updateTestData("CW_019", "ExecuteYes/No", "No");
//		exelDataForGeneralLedger.updateTestData("CW_020", "ExecuteYes/No", "No");
//		exelDataForGeneralLedger.updateTestData("TSA_001_01", "ExecuteYes/No", "No");
//		exelDataForGeneralLedger.updateTestData("TSA_001_02", "ExecuteYes/No", "No");
//		exelDataForGeneralLedger.updateTestData("TSA_002_01", "ExecuteYes/No", "Yes");
		//exelDataForGeneralLedger.updateTestData("TRS_003", "ExecuteYes/No", "Yes");
		updateFile.updateTestData("TSA_086_02", "Data Set ID", "DS01_TSA_086_01");
		updatedMap=updateFile.getTestdata("TSA_086_02");
		System.out.println(updatedMap.get("Data Set ID"));
//		excelReader.setCellData("Sheet1", "Sl No", 2, "3");
//		excelReader.setCellData("Sheet1", "Sl No", 3, "3");
//		excelReader.setCellData("Sheet1", "Sl No", 2, "4");
//		excelReader.setCellData("Sheet1", "Sl No", 3, "5");
		
		
//		exelDataForGeneralLedger.updateTestData("DS01_TA_070", "batch number", "");
//		testData=exelDataForGeneralLedger.getTestdata("DS01_TA_070");
//		
//		System.out.println("Batch number : "+testData.get("batch number"));
		//exelDataForGeneralLedger2.updateTestData("DS01_TSA_002_01", "populateCode", "22");
//		exelDataForGeneralLedger.updateTestData("CHB_123", "ExecuteYes/No", "Yes");
//		exelDataForGeneralLedger.updateTestData("ChequeBookPrerequisites_03", "ExecuteYes/No", "Yes");
//		exelDataForGeneralLedger.updateTestData("CHB_123_124_Prereq", "ExecuteYes/No", "Yes");
//		exelDataForGeneralLedger.updateTestData("CHB_124", "ExecuteYes/No", "Yes");
		//exelDataForGeneralLedger.updateTestData("CW_007", "ExecuteYes/No", "Yes");
		/*exelDataForGeneralLedger.updateTestData("CW_002", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_003", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_004", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_005", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_006", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_007", "ExecuteYes/No", "Yes");*/
	//CSM_Transaction
		/*ExcelData exelDataForGeneralLedger = new ExcelData(testDataPath, "CSM_Transaction", "DataSet ID");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_001", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_002", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_003", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_004", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_005", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_006", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_007", "Less Exemption Date", "01/01/2017");*/
	}

}
