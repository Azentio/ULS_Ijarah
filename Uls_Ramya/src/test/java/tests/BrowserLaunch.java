package tests;

import java.util.Map;

import dataprovider.ExcelData;
import helper.JavascriptHelper;
import pageobjects.JSPaths;
import resources.BaseClass;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) {
		
//		String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
//		JSPaths Murabha_offering_documentDetail= new JSPaths(excelPath, "AL_MM_JS","MarginMoneyFieldName", "JSPath");
//		System.out.println(Murabha_offering_documentDetail.getElement("saveButton"));
		
		String excelPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
		//ExcelData ContactDetail_TestData  = new ExcelData(excelPath,"AL_AppDataEn_ContactDetail","Dataset ID");
		ExcelData AddressDetails_TestData  = new ExcelData(excelPath,"AL_AppDataEn_ContactDetail","Dataset ID");
		Map<String, String> testData;
		testData = AddressDetails_TestData.getTestdata("DS01_AT_AL_CD_07");
		System.out.println(testData.get("Phone number"));
		
	}
	
	
	
}
