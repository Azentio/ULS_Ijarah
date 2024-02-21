package stepdefinitions;

import java.util.HashMap;
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
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "loginElements", "LoginFieldName", "JSPath");
	JSPaths commonElements = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");
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
				for (int i = 0; i <= 150; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
						javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
								.sendKeys(loginTestData.get("UserName"));
						break;
					}

					catch (Exception e) {
						if (i == 150) {
							e.printStackTrace();
							Assert.fail(e.getMessage());
						}
					}
				}

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
						if (isApplicationLoggedIn == true) {
							break;
						}
					} catch (Exception e) {
						if (i == 50) {
							throw new ElementNotInteractableException(
									commonElements.getElement("module_dropdown") + " is not visible hence failed");

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
