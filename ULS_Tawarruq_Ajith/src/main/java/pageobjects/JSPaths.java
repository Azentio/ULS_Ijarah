package pageobjects;

import dataProvider.ExcelReader;

public class JSPaths {
	String excelFilePath;
	String sheetName;
	String columnName;
	String jsPathColumnName;
	ExcelReader excelReader;;

	public JSPaths(String excelFilePath, String sheetName, String columnName,String jsPathColumnName) {
		this.excelFilePath = excelFilePath;
		this.sheetName = sheetName;
		this.columnName = columnName;
		this.jsPathColumnName=jsPathColumnName;
	}
	public String getElement(String elementName) {
		excelReader = new ExcelReader(excelFilePath);
		int cellRowNum = excelReader.getCellRowNum(sheetName, columnName, elementName);
		String jsPath = excelReader.getCellData(sheetName, jsPathColumnName, cellRowNum);
		return jsPath;
	}

	public static void main(String args[]) {
		String excelPath = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
		System.out.println(excelPath);
		JSPaths jsPaths = new JSPaths(excelPath, "Tawarruq_CommonElements", "Tawarruq_CommonFieldName", "JSPath");
		System.out.println(jsPaths.getElement("userName"));
	}

}
