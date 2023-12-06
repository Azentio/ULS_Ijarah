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
		loginTestData = exelData.getTestdata("userType08");
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
	//commodityMaker-offering-offerDetails
	public void loginWithIjaraApplication_offoring() {
		loginTestData = exelData.getTestdata("userType08");
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
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString().isBlank())) {

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
	//commodityMaker-commodity Purchase maker - insurance info,Document Details
	public void loginWithIjaraApplication_commodity_insuranceIfo_documentDetails() {
		loginTestData = exelData.getTestdata("userType09");
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
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString().isBlank())) {
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

	//Tawarruq-NewApp-CustomerDetails
	public void loginWithIjaraApplication_Tawarruq_NewApp_CustomerDetails() {
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

	
		//Tawarruq - AppDataEntry - Document Details
		public void loginWithIjaraApplication_Tawarruq_AppDataEntry_DocumentDetails() {
			loginTestData = exelData.getTestdata("userType07");
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
					if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString().isBlank())) {
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

		
		//Tawarruq-AppDataEntry-Repayment
		public void loginWithIjaraApplication_Tawarruq_AppDataEntry_Repayment() {
			loginTestData = exelData.getTestdata("userType03");
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
					if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString().isBlank())) {
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
		//Murabha-offering-Document Details
		public void loginWithIjaraApplication_Murabha_offering_Document_Details() {
			loginTestData = exelData.getTestdata("userType10");
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
					if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString().isBlank())) {
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

		//Murabha-offering-offer Details
				public void loginWithIjaraApplication_murabha_offering_offerDetail() {
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
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString().isBlank())) {
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
	//		loginTestData = exelData.getTestdata("userType02");
	//		//loginTestData = exelData.getTestdata("userType03");
	//		//loginTestData = exelData.getTestdata("userType06");
	//		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
	//		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
	//				.sendKeys(loginTestData.get("UserName"));
	//		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
	//		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
	//		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
	//				.sendKeys(loginTestData.get("Password"));
	//		for (int i = 0; i <= 300; i++) {
	//
	//			try {
	//
	//				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
	//				System.out.println("OTP is " + otp);
	//				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
	//						.isBlank())) {
	//
	//					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();
	//					break;
	//				}
	//			} catch (Exception e) {
	//				if (i == 300) {
	//					Assert.fail(e.getMessage());
	//				}
	//			}
	//		}
	//		for (int i = 0; i <= 300; i++) {
	//			try {
	//				Assert.assertTrue(
	//						javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
	//				break;
	//			} catch (Exception e) {
	//
	//			}
	//		}
	//	}
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

