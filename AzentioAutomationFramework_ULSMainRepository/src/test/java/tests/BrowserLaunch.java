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
		System.out.println(excelPath);
		JSPaths repaymentModeJsPaths = new JSPaths(excelPath, "RepaymentMode_Elements", "RepaymentMode_FieldName",
				"JSPath");
		System.out.println(repaymentModeJsPaths.getElement("inboxSearchInput"));
	}
	
	
}
