package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.JavascriptHelper;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjaraLogin extends BaseClass {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	public void loginWithIjaraApplication() {
		loginTestData = exelData.getTestdata("userType01");
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(loginTestData.get("UserName"));
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
for (int i = 0; i <=100; i++) {
	try {
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
				.sendKeys(loginTestData.get("Password"));	
		break;
	} catch (Exception e) {
		if(i==100)
		{
			Assert.fail(e.getMessage());
		}
		else if(i>50 &&i<100)
		{
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
		}
	}
	
}
		
		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

	}
	
	public void loginWithIjaraApplication2() {
		loginTestData = exelData.getTestdata("userType02");
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(loginTestData.get("UserName"));
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
for (int i = 0; i <=100; i++) {
	try {
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
				.sendKeys(loginTestData.get("Password"));	
		break;
	} catch (Exception e) {
		if(i==100)
		{
			Assert.fail(e.getMessage());
		}
		else if(i>50 &&i<100)
		{
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
		}
	}
	
}
		
		for (int i = 0; i <= 300; i++) {

			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

	}

	public void logoutFromIjara() {
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userProfile")).click();
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
