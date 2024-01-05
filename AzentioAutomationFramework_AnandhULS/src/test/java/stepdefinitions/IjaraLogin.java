package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.JavascriptHelper;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjaraLogin extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	public void loginWithIjaraApplication(String userType) {
		//userType01
		//userType02
		loginTestData = exelData.getTestdata(userType);
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(loginTestData.get("UserName"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
		

		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isEmpty())) {

					
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
						.sendKeys(loginTestData.get("Password"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isEmpty())) {

					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}

	public void logoutFromIjara() {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userProfile")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("logoutButton")).click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

}
