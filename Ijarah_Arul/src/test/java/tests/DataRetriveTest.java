package tests;

import dataProvider.ExcelData;

public class DataRetriveTest {

	public static void main(String[] args) {
		String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		ExcelData DataCheckEmpDetailsExcelData = new ExcelData(excelTestDataPath, "Tawarraq_EmploymentDetails",
		   		   //DataSet ID
					"DataSet ID");
		                                                                               //AT_TW_AD_EMPD_11_D1
		System.out.println("Test data set ID "+DataCheckEmpDetailsExcelData.getTestdata("AT_TW_AD_EMPD_11_D1".trim()).get("DataSet ID"));
	}

}
