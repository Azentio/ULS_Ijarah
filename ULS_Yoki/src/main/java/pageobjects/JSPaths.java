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
		String path = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
		System.out.println(path);
		JSPaths jsPaths = new JSPaths(path, "Ijara_loginElements", "Ijara_LoginFieldName","JSPath");
		System.out.println(jsPaths.getElement("userName"));
	}

}
