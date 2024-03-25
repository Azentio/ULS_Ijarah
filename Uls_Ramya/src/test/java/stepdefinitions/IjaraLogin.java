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
				
				
				//ijara-Data Check-Employment Details
				public void loginWithIjaraApplication_ijara_data_check_employment_detail() {
					//loginTestData = exelData.getTestdata("userType02"); --> first
					loginTestData = exelData.getTestdata("userType12");
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
	
				
				//AutoLoan-App Data Entry-Address Details
				public void loginWithIjaraApplication_AutoLoan_AppDataEntry_AddresDetails(){
					//loginTestData = exelData.getTestdata("userType02");==>first
					loginTestData = exelData.getTestdata("userType06");
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
				
				//murabha_AppDataEntry_RepaymentMode
			
				public void loginWithIjaraApplication_murabha_AppDataEntry_RepaymentMode(){
					loginTestData = exelData.getTestdata("userType04");
					//for run
					//loginTestData = exelData.getTestdata("userType02"); 
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
				
				//Tawarruq_AppDataEntry_customerDetails
				
				public void loginWithIjaraApplication_Tawarruq_AppDataEntry_customerDetails(){
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
					//AutoLoan-App Data Entry-Address Details
					public void loginWithIjaraApplication_AppDataEntry_AutoLoan_AssetDetails(){
						//loginTestData = exelData.getTestdata("userType02");==>first
						loginTestData = exelData.getTestdata("userType06");
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
					
					//ijara-App Data Entry-FacilityInfo
					public void loginWithIjaraApplication_ijara_AppDataEntry_FacilityInfo(){
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
					//Tawarruq - App Data Check - InsuranceInfo
					
					public void loginWithIjaraApplication_Tawarruq_AppDataCheck_InsuranceInfo(){
						loginTestData = exelData.getTestdata("userType11");
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
                //Tawarruq - App Data Check - QuotationInfo
					
					public void loginWithIjaraApplication_Tawarruq_AppDataCheck_QuotationInfo(){
						loginTestData = exelData.getTestdata("userType11");
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
 //Tawarruq - App Data Check - RepaymentMode
					
					public void loginWithTawarruqApplication_Tawarruq_AppDataCheck_RepaymentMode(){
						loginTestData = exelData.getTestdata("userType11");
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
					//Tawarruq - AppDataEntry - Facility Details
					public void loginWithIjaraApplication_Tawarruq_AppDataEntry_FacilityDetails() {
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
					//Murabha - AppDataEntry - Identification Details
					public void loginWithIjaraApplication_Murabha_AppDataEntry_IdentificationDetails() {
						loginTestData = exelData.getTestdata("userType04");
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
					//Murabha - AppDataEntry - Address Details
					public void loginWithIjaraApplication_Murabha_AppDataEntry_AdressDetails() {
						loginTestData = exelData.getTestdata("userType04");
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
					//Murabha-App Check-ProductDetails
					public void loginWithIjaraApplication_Murabha_AppDataCheck_ProductDetails(){
						loginTestData = exelData.getTestdata("userType13");
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
					//AutoLoan-Offering-CustomerDetails
					public void loginWithIjaraApplication_AutoLoan_offering_CustomerDetails(){
						loginTestData = exelData.getTestdata("userType14");
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
					//AutoLoan-Disbursion maker-Margin Money
					public void loginWithIjaraApplication_AutoLoan_DisbursionMaker_MarginMoney(){
						loginTestData = exelData.getTestdata("userType15");
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
					//Personal Loan-NewApp-CustomerDetails
					public void loginWithIjaraApplication_PersonalLoan_NewApp_ustomerDetails(){
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
					//Retail-Auto Loan-AppDataEntry-ContactDetails
					public void loginWithIjaraApplication_AutoLoan_AppDataEntry_ContactDetails(){
						loginTestData = exelData.getTestdata("userType06");
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
					//Retail-Auto Loan-AppDataEntry-FacilityDetails
					public void loginWithIjaraApplication_Retail_AutoLoan_AppDataEntry_FacilityDetails(){
						loginTestData = exelData.getTestdata("userType06");
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
					//Consumer Durable-AppDataEntry-FacilityDetails
					public void loginWithIjaraApplication_consumerDurable_AppDataEntry_FacilityDetails(){
						loginTestData = exelData.getTestdata("userType16");
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

