package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.JSPaths;

public class TestMobileEmulator {
	public static void main(String args[]) {
		//WebDriver driver = new ChromeDriver();
		String excelPath = System.getProperty("user.dir") + "\\TestData\\TawarruqJSPaths.xlsx";
		//driver.get("https://engineeringinterviewquestions.com/selenium-multiple-choice-questions/");
		JSPaths jsPaths = new JSPaths(excelPath, "Tawarruq_loginElements", "Tawarruq_CommonFieldName", "JSPath");
		System.out.println(jsPaths.getElement("userName"));
        
}
}
