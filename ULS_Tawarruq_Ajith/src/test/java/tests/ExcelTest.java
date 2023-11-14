package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.util.ZipSecureFile;

import dataProvider.ExcelData;
import dataProvider.ExcelReader;

public class ExcelTest {
	String path;
	String sheetName;
	String columnName;

	public ExcelTest(String path, String sheetName, String columnName) {
		this.path = path;
		this.sheetName = sheetName;
		this.columnName = columnName;
	}

	public  List<String> getTestCaseTagsfromExcel() {
		ExcelReader excelReader = new ExcelReader(path);
		List<String> li = new ArrayList<String>();
		ZipSecureFile.setMinInflateRatio(0);
		int columnCount = excelReader.getRowCount(sheetName);
		
		for (int i = 2; i <=columnCount; i++) {
			String cellData = excelReader.getCellData(sheetName, columnName, i);
			if (!(cellData.isBlank())) {
				li.add(cellData);
			}
			
		}
		return li;
	}

	public static void main(String[] args) {
		String TestDataExcelDataPath = System.getProperty("user.dir") + "\\TestData\\TawarruqTestData.xlsx";
		ExcelData excelDataForInsuranceInfoTestData = new ExcelData(TestDataExcelDataPath,
				"InsuranceInfoTestData", "Dataset ID");
		ExcelData excelDataForApplicationDetailsTawarruqExecutionData = new ExcelData(TestDataExcelDataPath,
				"Appdata_ApplicationDetailsExe", "TestCase ID");
		 Map<String, String> testdata = excelDataForApplicationDetailsTawarruqExecutionData.getTestdata("AT_TW_INS_001");
		  Map<String, String> testdata2 = excelDataForInsuranceInfoTestData
				.getTestdata(testdata.get("dataSet_ID"));
		  System.out.println(testdata2.get("insuranceQuotationId"));
		  String test ="Depreciation (%) *";
		  System.out.println(test.contains("*"));
	}

}
