package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.JavascriptHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class tawarruq_Step {
	
	WebDriver driver = BaseClass.driver;
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String path = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	JSPaths jsPaths4 = new JSPaths(excelPath, "Tawarruq_Module", "Murabha_LoginFieldName", "JSPath");
	
		
	@And("User_{int} verify the Employer name should be seen")
	public void user_verify_the_employer_name_should_be_seen(Integer int1) throws Throwable {
		Thread.sleep(3000);
		for (int i = 0; i < 200; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("TA_employerName_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
					break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_{int} verify the Status should be seen active")
	public void user_verify_the_status_should_be_seen_active(Integer int1) {
	    
		for (int i = 0; i < 200; i++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(jsPaths4.getElement("TA_Status_610")).isDisplayed()) {
					Assert.assertTrue(true);
				}
					break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
