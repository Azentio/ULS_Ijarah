package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataprovider.ExcelData;
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
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
		for (int i = 0; i <= 300; i++) {
			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
				.sendKeys(loginTestData.get("Password"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

	}
	
	public void loginWithIjaraApplication02() {
		loginTestData = exelData.getTestdata("userType02");
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(loginTestData.get("UserName"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
		for (int i = 0; i <= 300; i++) {
			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
				.sendKeys(loginTestData.get("Password"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
	}
	
	//---------user 03
	
	public void loginWithIjaraApplication03() {
		loginTestData = exelData.getTestdata("userType03");
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
				.sendKeys(loginTestData.get("UserName"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
		for (int i = 0; i <= 300; i++) {
			try {

				String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
				System.out.println("OTP is " + otp);
				if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
						.isBlank())) {

					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
				.sendKeys(loginTestData.get("Password"));
		javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
	}
	
	//---------user 04
	
		public void loginWithIjaraApplication04() {
			loginTestData = exelData.getTestdata("userType04");
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
					.sendKeys(loginTestData.get("UserName"));
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
			for (int i = 0; i <= 300; i++) {
				try {

					String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
					System.out.println("OTP is " + otp);
					if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
							.isBlank())) {

						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
					.sendKeys(loginTestData.get("Password"));
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
		}
		
		
		//---------user 05
		
		public void loginWithIjaraApplication05() {
			loginTestData = exelData.getTestdata("userType05");
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
					.sendKeys(loginTestData.get("UserName"));
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
			for (int i = 0; i <= 300; i++) {
				try {

					String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
					System.out.println("OTP is " + otp);
					if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
							.isBlank())) {

						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
					.sendKeys(loginTestData.get("Password"));
			javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

			Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
		}
		
		//---------user 06
		
				public void loginWithIjaraApplication06() {
					loginTestData = exelData.getTestdata("userType06");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
				//---------user 07
				
				public void loginWithIjaraApplication07() {
					loginTestData = exelData.getTestdata("userType07");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
          //---------user 08
				
				public void loginWithIjaraApplication08() {
					loginTestData = exelData.getTestdata("userType08");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
                   //---------user 09 Tuwarruq App Data Entry Employment Details
				
				public void loginWithIjaraApplication09() {
					loginTestData = exelData.getTestdata("userType09");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
       //---------user 10 Tuwarruq App Data Entry Customer Financials --> Income details screen
				
				public void loginWithIjaraApplication10() {
					loginTestData = exelData.getTestdata("userType10");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
				
//---------user 11 Tuwarruq Offering - Offering Stage 
				
				public void loginWithIjaraApplication11() {
					loginTestData = exelData.getTestdata("userType11");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
    //---------user 12 Murabha Contract Singing
				
				public void loginWithIjaraApplication12() {
					loginTestData = exelData.getTestdata("userType12");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
         //---------user 13 Murabha Purchase checker
				
				public void loginWithIjaraApplication13() {
					loginTestData = exelData.getTestdata("userType13");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
           //---------user 14 Murabha UnderWriter
				
				public void loginWithIjaraApplication14() {
					loginTestData = exelData.getTestdata("userType14");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());

				}
				
				
           //---------user 15   AutoLoan AppData Entry Customer Details 
				
				public void loginWithIjaraApplication15() {
					
					loginTestData = exelData.getTestdata("userType15");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
										
				}
				
				
          //---------user 16   Tawarrq AppData check Document Details 
				
				public void loginWithIjaraApplication16() {
					
					loginTestData = exelData.getTestdata("userType16");
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userName"))
							.sendKeys(loginTestData.get("UserName"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("continueButton")).click();
					for (int i = 0; i <= 300; i++) {
						try {

							String otp = javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString();
							System.out.println("OTP is " + otp);
							if (!(javascriptHelper.executeScript("return " + jsPaths.getElement("otpField")).toString()
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
										
				}
				
				
        //---------user 17   Ijara AppData Entry Facility Details 
				
				public void loginWithIjaraApplication17(String userType) {
					
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
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
										
				}
				
				
        //---------user 18   Ijara AppData Entry Facility Details 
				
				public void loginWithIjaraApplication18(String userType) {
					
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
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
										
				}
				
           //---------user 19   Tawarruq AppData check employment Details 
				
				public void loginWithIjaraApplication19(String userType) {
					
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
									.isBlank())) {

								break;
							}
						} catch (Exception e) {
							if (i == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).click();
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password"))
							.sendKeys(loginTestData.get("Password"));
					javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("signInButton")).click();

					Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("password")).isDisplayed());
										
				}
		

	public void logoutFromIjara() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("userProfile")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(jsPaths.getElement("logoutButton")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	

}
