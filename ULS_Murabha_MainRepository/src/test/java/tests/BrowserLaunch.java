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
		JSPaths CommonJsElements = new JSPaths(excelPath, "Murabha_CommonElements", "Murabha_CommonFieldName",
				"JSPath");
		System.err.println(CommonJsElements.getElement("mail_box_search_text"));
	}
	
	
}
