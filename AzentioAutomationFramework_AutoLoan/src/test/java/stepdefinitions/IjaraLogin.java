package stepdefinitions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.JavascriptHelper;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjaraLogin extends BaseClass {
	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSFilePath();
	String excelTestDataPath = configFileReader.getAutoLoanTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths commonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	ExcelData exelData = new ExcelData(excelTestDataPath, "LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	boolean isApplicationLoggedIn = false;

	public void loginWithIjaraApplication(String userType) {
		// userType01
		// userType02

		for (int j = 0; j <= 3; j++) {
			try {
				loginTestData = exelData.getTestdata(userType);
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
						.sendKeys(loginTestData.get("UserName"));
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();

				for (int i = 0; i <= 150; i++) {

					try {

						String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField"))
								.toString();
						System.out.println("OTP is " + otp);
						if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
								.isEmpty())) {

							break;
						}
					} catch (Exception e) {
						if (i == 150) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i <= 150; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
						javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
								.sendKeys(loginTestData.get("Password"));
						break;
					} catch (Exception e) {
						if (i == 150) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i <= 150; i++) {

					try {

						String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField"))
								.toString();
						System.out.println("OTP is " + otp);
						if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
								.isEmpty())) {

							javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
							break;
						}
					} catch (Exception e) {
						if (i == 150) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i <= 50; i++) {
					try {
						isApplicationLoggedIn = javascriptHelper
								.executeScriptWithWebElement(commonElements.getElement("module_dropdown"))
								.isDisplayed();
						System.out.println("From Try Block "+isApplicationLoggedIn);
						if (isApplicationLoggedIn == true) {
							System.out.println("From IF Block "+isApplicationLoggedIn);
							System.out.println("I value "+i);
							break;
						}
					} catch (Exception e) {
						if (i == 50) {
							throw new ElementNotInteractableException(
									commonElements.getElement("module_dropdown") + "is Not visible");

						}
					}
				}
				if (isApplicationLoggedIn == true) {
					break;
				}
			} catch (Exception e) {
				if (j < 3) {
					driver.get(configFileReader.getIjaraApplicationURL());
				}
				if (j == 3) {
					e.printStackTrace();
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	public void logoutFromIjara() {
		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userProfile")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

		for (int i = 0; i <= 150; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("logoutButton")).click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

}
