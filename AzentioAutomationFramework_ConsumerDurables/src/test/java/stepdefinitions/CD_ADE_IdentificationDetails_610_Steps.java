package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class CD_ADE_IdentificationDetails_610_Steps {

	ConfigFileReader configFileReader = new ConfigFileReader();
	String excelPath = configFileReader.getJSPathFilePath();
	String excelTestDataPath = configFileReader.getTestDataFilePath();
    
	
	WebDriver driver = BaseClass.driver;
	BrowserHelper browserHelper = new BrowserHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Actions actions = new Actions(driver);

	
	ExcelData testExecution = new ExcelData(excelTestDataPath, "ConumerDurablesExeSheet", "TestCase ID");
	ExcelData IdentificationDetailsExcelData = new ExcelData(excelTestDataPath,"ADE_IdentificationDet_610","DataSet ID");
	Map<String, String> testExecutionData;			
	Map<String, String> testData;
	
	JSPaths commonElementsJsPaths = new JSPaths(excelPath, "CommonElements", "CommonFieldName", "JSPath");
	JSPaths ADE_IdentificationDetails_610 = new JSPaths(excelPath, "ADE_IdentificationDet_610", "IdentificationDetails_FieldName", "JSPath");

	
	
	 //---------- Consumer Durable AppData Entry Identification Details 
	
	@And("User_610 get the test data set id for DS_AT_CON_DUR_ADE_ID_01")
	public void get_the_test_data_set_id_for_DS_AT_CON_DUR_ADE_ID_01() {
		testExecutionData = testExecution.getTestdata("AT_CON_DUR_ADE_ID_01");
		testData = IdentificationDetailsExcelData.getTestdata(testExecutionData.get("dataSet_ID"));
		}
	
	
	//        *********************************      steps        ****************************
	
	//    -------REF NO
	
	@And("User_610 search the Reference ID for Consumer Durable in Identification Details")
	public void user_search_the_reference_id_for_consumer_durable_identification_details() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("mail_box_search_text"))
						.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}	
	
	// -----------------------------	@DS_AT_CON_DUR_ADE_AD_01        -------------
	
	
			@And("User_610 click the Edit button under identification Details section in Additional Customer Info tab")
			public void user_610_click_the_edit_button_under_identification_details_section_in_additional_customer_info_tab() throws Throwable {
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
//							System.out.println(titlename.trim());
							if (titlename.trim().contains("Customer Identification")) {
//								System.out.println("Condition true");
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
								WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
								actions.scrollToElement(eyeBtn).build().perform();
								eyeBtn.click();
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
	
			@And("User_610 click the Add button under Identification Details section in Additional Customer Info tab")
			public void user_610_click_the_add_button_under_identification_details_section_in_additional_customer_info_tab() throws Throwable {
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
//							System.out.println(titlename.trim());
							if (titlename.trim().contains("Customer Identification")) {
//								System.out.println("Condition true");
								//                                                                                                                                             pi pi-plus
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-plus\"]')";
								WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
								actions.scrollToElement(eyeBtn).build().perform();
								eyeBtn.click();
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			
			@And("^User_610 verify the Id Type field in identification details Screen$")
			public void user_610_verify_the_id_type_field_in_identification_details_screen()throws Throwable{
				Thread.sleep(1000);
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("Id_Type_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 Select drop down value in Id Type in identification details Screen$")
			public void user_610_select_drop_down_value_in_id_type_in_identification_details_screen()throws Throwable{
				for (int a = 0; a < 300; a++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("Id_Type_UnderCustomerIdentificationDetails_610")).click();
						break;
					} catch (Exception e) {
						if (a == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
					
					//  dropdown
					
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";

			for (int i = 0; i <= 300; i++) {
				try {
					dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
					System.out.println("Dropdown length " + dropdownLength);
					if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}

			int premitiveDropdownLength = Integer.parseInt(dropdownLength);

			for (int j = 0; j <= premitiveDropdownLength; j++) {
				for (int l = 0; l <= 300; l++) {
					try {
						System.out.println("L value is " + l);
						System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
						dropdownString = javascriptHelper.executeScript(
								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
								.toString();
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					} catch (Exception e) {
						if (l == 300 && !(dropdownString.isBlank())) {
							Assert.fail(e.getMessage());
						}
					}
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				}

				System.out.println("String " + dropdownString.trim());
				
//				System.out.println("Map " + testData.get("CustomerResponce").trim());
				
				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("ID TYPE")).trim())) {
					for (int k = 0; k <= 300; k++) {
						try {
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							isDropdownValueSelected = true;
							break;
						} catch (Exception e) {
							if (k == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				if (isDropdownValueSelected == true) {
					break;
				}
			}
			}
			@And("^User_610 verify the Id Number field in identification details Screen$")
			public void user_610_verify_the_id_number_field_in_identification_details_screen()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("Id_Number_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 Enter the value in Id Number field under identification details Screen$")
			public void user_610_enter_the_value_in_id_number_field_under_identification_details_screen()throws Throwable{
				for (int i = 0; i <= 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("Id_Number_UnderCustomerIdentificationDetails_610"))
						.sendKeys(testData.get("ID NUMBER"));
						break;
					} catch (Exception e) {
						if (i == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			@And("^User_610 verify the field in Issue Date under identification details Screen$")
			public void user_610_verify_the_field_in_issue_date_under_identification_details_screen()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("Issue_Date_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 verify the field in Expiry Date under identification details Screen$")
			public void user_610_verify_the_field_in_expiry_date_under_identification_details_screen()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("Expiry_Date_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 verify the field in Issuing Authority under identification details Screen$")
			public void user_610_verify_the_field_in_issuing_authority_under_identification_details_screen()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("IssuingAuthority_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 Select drop down value in Issuing Authority in under identification details Screen$")
			public void user_610_select_drop_down_value_in_issuing_authority_in_under_identification_details_screen()throws Throwable{
				for (int a = 0; a < 300; a++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("IssuingAuthority_UnderCustomerIdentificationDetails_610")).click();
						break;
					} catch (Exception e) {
						if (a == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
					
					//  dropdown
					
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";

			for (int i = 0; i <= 300; i++) {
				try {
					dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
					System.out.println("Dropdown length " + dropdownLength);
					if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}

			int premitiveDropdownLength = Integer.parseInt(dropdownLength);

			for (int j = 0; j <= premitiveDropdownLength; j++) {
				for (int l = 0; l <= 300; l++) {
					try {
						System.out.println("L value is " + l);
						System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
						dropdownString = javascriptHelper.executeScript(
								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
								.toString();
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					} catch (Exception e) {
						if (l == 300 && !(dropdownString.isBlank())) {
							Assert.fail(e.getMessage());
						}
					}
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				}

				System.out.println("String " + dropdownString.trim());
				
//				System.out.println("Map " + testData.get("CustomerResponce").trim());
				
				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("ISSUING AUTHORITY")).trim())) {
					for (int k = 0; k <= 300; k++) {
						try {
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							isDropdownValueSelected = true;
							break;
						} catch (Exception e) {
							if (k == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				if (isDropdownValueSelected == true) {
					break;
				}
			}
				
			}
			@And("^User_610 verify the field in Country Of Issue under identification details Screen$")
			public void user_610_verify_the_field_in_country_of_issue_under_identification_details_screen()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("CountryOfIssue_UnderCustomerIdentificationDetails_610")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 Select drop down value in Country Of Issue in identification details Screen$")
			public void user_610_select_drop_down_value_in_country_of_issue_in_identification_details_screen()throws Throwable{
				for (int a = 0; a < 300; a++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("CountryOfIssue_UnderCustomerIdentificationDetails_610")).click();
						break;
					} catch (Exception e) {
						if (a == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
					
					//  dropdown
					
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";

			for (int i = 0; i <= 300; i++) {
				try {
					dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
					System.out.println("Dropdown length " + dropdownLength);
					if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}

			int premitiveDropdownLength = Integer.parseInt(dropdownLength);

			for (int j = 0; j <= premitiveDropdownLength; j++) {
				for (int l = 0; l <= 300; l++) {
					try {
						System.out.println("L value is " + l);
						System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
						dropdownString = javascriptHelper.executeScript(
								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
								.toString();
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					} catch (Exception e) {
						if (l == 300 && !(dropdownString.isBlank())) {
							Assert.fail(e.getMessage());
						}
					}
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				}

				System.out.println("String " + dropdownString.trim());
				
//				System.out.println("Map " + testData.get("CustomerResponce").trim());
				
				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("COUNTRY OF ISSUING")).trim())) {
					for (int k = 0; k <= 300; k++) {
						try {
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							isDropdownValueSelected = true;
							break;
						} catch (Exception e) {
							if (k == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				if (isDropdownValueSelected == true) {
					break;
				}
			}
			}
			@And("^User_610 verify the field in primary Id Flag under identification details Screen$")
			public void user_610_verify_the_field_in_primary_id_flag_under_identification_details_screen()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("primaryIdFlag")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			
			//-------------------  @AT_CON_DUR_ADE_ID_02  ------------
			
			@And("User_610 verify ID Type field should be mandatory display and text box")
			public void user_610_verify_id_type_field_should_be_mandatory_display_and_text_box() throws Throwable {
				
				// ----------------validate mandatory field

						for (int i = 0; i < 300; i++) {
							try {
								String IdType = "document.querySelector('[ng-reflect-text=\"ID Type tooltip\"]').innerText";
								String IdTypeName = (String) javascriptHelper.executeScript("return " + IdType);
								
								System.err.println("IdType:"+IdTypeName);
								System.out.println("print");
								
								Assert.assertTrue(IdTypeName.contains("*"));
								break;
							} catch (Exception e) {
								if (i == 299) {
									Assert.fail(e.getMessage());
								}
							}
											}
						
																		
							}

			@And("User_610 verify ID Type number should be mandatory display and numberic")
			public void user_610_verify_id_type_number_should_be_mandatory_display_and_numberic() throws Throwable {
				
				// ----------------validate mandatory field

				for (int i = 0; i < 300; i++) {
					try {
						String IdNumber = "document.querySelector('[ng-reflect-text=\\\"SCR.ID_NUMBER.TOOLTIP\\\"]').innerText";
						String IdNumberName = (String) javascriptHelper.executeScript("return " + IdNumber);
						
						System.err.println("IdNumber:"+ IdNumberName);
						Assert.assertTrue(IdNumberName.contains("*"));
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				//------ select
				
				String IdNumberFormat = javascriptHelper
						.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("Id_Type_UnderCustomerIdentificationDetails_610"))
						.getTagName();
				
				System.err.println("IdType:  " + IdNumberFormat);

				String assertIdNumberFormat = "ion-select";
				
				Assert.assertEquals(assertIdNumberFormat, IdNumberFormat);
				
			}

			@And("User_610 verify Issue Date field should be non mandatory display and calender")
			public void user_610_verify_id_type_field_should_be_non_mandatory_display_and_calender() throws Throwable {
			    
				// ----------------validate non-mandatory field

				for (int i = 0; i < 300; i++) {
					try {
						String IssueDate = "document.querySelector('label[ng-reflect-text=\"Issue Date\"]').innerText";
						String IssueDateName = (String) javascriptHelper.executeScript("return " + IssueDate);
						
						System.err.println("IssueDate:"+IssueDateName);
						Assert.assertTrue(!IssueDateName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
							}
				
				
				// -------------------validate type  date

								
				String IssueDateFormat = javascriptHelper
						.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("getAtribute_InIssueDate_610"))
						.getTagName();
				
				System.err.println("IdType:  " + IssueDateFormat);

				String assertIssueDateFormat = "p-calendar";
				
				Assert.assertEquals(assertIssueDateFormat, IssueDateFormat);
				
				
			}
			
						
			
			@And("User_610 verify Expiry Date field should be non mandatory display and text box")
			public void user_610_verify_expiry_date_field_should_be_mandatory_display_and_text_box() throws Throwable {
				
				// ----------------validate non-mandatory field

						for (int i = 0; i < 300; i++) {
							try {
								String ExpiryDate = "document.querySelector('label[ng-reflect-text=\"Expiry Date\"').innerText";
								String ExpiryDateName = (String) javascriptHelper.executeScript("return " + ExpiryDate);
								
								System.err.println("ExpiryDate:"+ExpiryDateName);
								Assert.assertTrue(!ExpiryDateName.contains("*"));
								
								break;
							} catch (Exception e) {
								if (i == 299) {
									Assert.fail(e.getMessage());
								}
							}
									}
						
						
						
						// -------------------validate type  date

												
						String ExpiryDateFormat = javascriptHelper
								.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("getAtribute_InExpiryeDate_610"))
								.getTagName();
						
						System.err.println("ExpiryDate:  " + ExpiryDateFormat);

						String assertExpiryDateFormat = "p-calendar";
						
						Assert.assertEquals(assertExpiryDateFormat, ExpiryDateFormat);
			    
			}

			@And("User_610 verify Issuing Authority number should be mandatory display and numberic")
			public void user_610_verify_issuing_authority_number_should_be_mandatory_display_and_numberic() {
				
				// ----------------validate mandatory field

						for (int i = 0; i < 300; i++) {
							try {
								String IssuingAuthority = "document.querySelector('ion-label[ng-reflect-text=\"Issuing Authority\"]').innerText";
								String IssuingAuthorityName = (String) javascriptHelper.executeScript("return " + IssuingAuthority);
								
								System.err.println("IssuingAuthority:"+IssuingAuthorityName);
								Assert.assertTrue(IssuingAuthorityName.contains("*"));
								
								break;
							} catch (Exception e) {
								if (i == 299) {
									Assert.fail(e.getMessage());
								}
							}
									}
				
				//---------select 
						
						String IssuingAuthorityFormat = javascriptHelper
								.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("IssuingAuthority_UnderCustomerIdentificationDetails_610"))
								.getTagName();
						
						System.err.println("IssuingAuthorityFormat:  " + IssuingAuthorityFormat);

						String assertIIssuingAuthorityFormat = "ion-select";
						
						Assert.assertEquals(assertIIssuingAuthorityFormat, IssuingAuthorityFormat);
			}

			@And("User_610 verify Country of Issue field should be mandatory display and calender")
			public void user_610_verify_country_of_issue_field_should_be_mandatory_display_and_calender() {
				
				// ----------------validate mandatory field

						for (int i = 0; i < 300; i++) {
							try {
								String CountryofIssue = "document.querySelector('ion-label[ng-reflect-text=\"Country of Issue\"').innerText";
								String CountryofIssueName = (String) javascriptHelper.executeScript("return " + CountryofIssue);
								
								System.err.println("CountryofIssue:"+CountryofIssueName);
								Assert.assertTrue(CountryofIssueName.contains("*"));
								
								break;
							} catch (Exception e) {
								if (i == 299) {
									Assert.fail(e.getMessage());
								}
							}
									}
				
				//---------- select
						
						String CountryofIssueFormat = javascriptHelper
								.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("CountryOfIssue_UnderCustomerIdentificationDetails_610"))
								.getTagName();
						
						System.err.println("CountryofIssueFormat:  " + CountryofIssueFormat);

						String assertCountryofIssueFormat = "ion-select";
						
						Assert.assertEquals(assertCountryofIssueFormat, CountryofIssueFormat);
			}
			
			
			//------------------      @AT_CON_DUR_ADE_ID_03     ----------------------
			
			
			@And("^User_610 proper validation message for blank field which is mandatory ID$")
			public void user_610_proper_validation_message_for_blank_field_which_is_mandatory_id()throws Throwable{
				Thread.sleep(3000);
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement("document.querySelector('button[ng-reflect-icon=\"pi pi-save\"]')"));

			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("fillAllTheDetailsPopup_610")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					if (i==299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			}
			
			@And("^User_610 To verify the impact when user enters only special characters in Id Number$")
			public void user_610_to_verify_the_impact_when_user_enters_only_special_characters_in_id_number()throws Throwable{
				for (int i = 0; i <= 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("Id_Number_UnderCustomerIdentificationDetails_610"))
						.sendKeys(testData.get("ID NUMBER CHAR"));
						break;
					} catch (Exception e) {
						if (i == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			
			
			for (int i = 0; i < 300; i++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("onlyAlphaNumericCharterPopup_610")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					if (i==299) {
						Assert.fail(e.getMessage());
					}
				}
			}
			
			}
			
			//------------------------------------ @AT_CON_DUR_ADE_ID_04 ---------------------------
			
			@And("^User_610 verify save button$")
			public void user_610_verify_save_button()throws Throwable{
				Thread.sleep(1000);
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths
								.getElement("save_button")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 verify back button$")
			public void user_610_verify_back_button()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths
								.getElement("back_button")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			
			@And("^User_610 UnSelect drop down value in Id Type in identification details Screen$")
			public void user_610_unselect_drop_down_value_in_id_type_in_identification_details_screen()throws Throwable{
				for (int a = 0; a < 300; a++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("Id_Type_UnderCustomerIdentificationDetails_610")).click();
						break;
					} catch (Exception e) {
						if (a == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
					
					//  dropdown
					
			String jqueryForDropdownLength = "document.querySelectorAll('ion-radio-group ion-radio').length";
			String dropdownLength = "";
			boolean isDropdownValueSelected = false;
			String dropdownString = "";

			for (int i = 0; i <= 300; i++) {
				try {
					dropdownLength = javascriptHelper.executeScript("return " + jqueryForDropdownLength).toString();
					System.out.println("Dropdown length " + dropdownLength);
					if (!(dropdownLength.isBlank()) && !(dropdownLength.equals("0"))) {
						break;
					}
				} catch (Exception e) {
					if (i == 300) {
						Assert.fail(e.getMessage());
					}
				}
			}

			int premitiveDropdownLength = Integer.parseInt(dropdownLength);

			for (int j = 0; j <= premitiveDropdownLength; j++) {
				for (int l = 0; l <= 300; l++) {
					try {
						System.out.println("L value is " + l);
						System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
						dropdownString = javascriptHelper.executeScript(
								"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText")
								.toString();
						if (!(dropdownString.isEmpty())) {
							System.out.println(dropdownString);
							System.out.println("Loop count " + l + " got breaked");
							break;
						}
					} catch (Exception e) {
						if (l == 300 && !(dropdownString.isBlank())) {
							Assert.fail(e.getMessage());
						}
					}
					if (!(dropdownString.isEmpty())) {
						System.out.println(dropdownString);
						System.out.println("Loop count " + l + " got breaked");
						break;
					}
				}

				System.out.println("String " + dropdownString.trim());
				
//				System.out.println("Map " + testData.get("CustomerResponce").trim());
				
				if ((dropdownString.trim())
						.equalsIgnoreCase((testData.get("ID TYPE NA")).trim())) {
					for (int k = 0; k <= 300; k++) {
						try {
							clicksAndActionsHelper.moveToElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							clicksAndActionsHelper.clickOnElement(javascriptHelper.executeScriptWithWebElement(
									"document.querySelectorAll('ion-radio-group ion-radio')[" + j + "]"));
							isDropdownValueSelected = true;
							break;
						} catch (Exception e) {
							if (k == 300) {
								Assert.fail(e.getMessage());
							}
						}
					}
				}
				if (isDropdownValueSelected == true) {
					break;
				}
			}
			}

			@And("^User_610 To verify the functionality of Back button in Identification details Screen$")
			public void user_610_to_verify_the_functionality_of_back_button_in_identification_details_screen()throws Throwable{
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
//							System.out.println(titlename.trim());
							if (titlename.trim().contains("Customer Identification")) {
//								System.out.println("Condition true");
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
								WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
								actions.scrollToElement(eyeBtn).build().perform();
								eyeBtn.click();
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				for (int a = 0; a < 300; a++) {
					try {
						javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths.getElement("back_button")).click();
						break;
					} catch (Exception e) {
						if (a == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				
				
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(commonElementsJsPaths
								.getElement("AddBtn")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
				
			}
			
			@And("User_610 validate the status active under Address Details section in Additional Customer Info tab")
			public void user_610_validate_the_status_active_under_Address_Details_section_in_Additional_Customer_Info_tab() throws Throwable {
				Thread.sleep(3000);
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
//							System.out.println(titlename.trim());
							if (titlename.equalsIgnoreCase("Address Details")) {
//								System.out.println("Condition true");
								//document.querySelectorAll('p-tag[ng-reflect-value="Active"]')
								String jspath = "document.querySelectorAll('p-tag[ng-reflect-value=\"Active\"]')[" + j + "]";
								WebElement ActiveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
								actions.scrollToElement(ActiveBtn).build().perform();
								System.err.println("Active : " + ActiveBtn.getText()); 
								String Status = ActiveBtn.getText();
								
								Assert.assertEquals("Active", Status);
								System.err.println("Active2 : " + ActiveBtn.getText()); 
								break;
							}
								}
						             break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				Thread.sleep(300);
			}
			
			@And("User_610 validate the status Inactive under Address Details section in Additional Customer Info tab")
			public void user_610_change_the_status_INactive_under_Address_Details_section_in_Additional_Customer_Info_tab() throws Throwable {
				Thread.sleep(3000);
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
//							System.out.println(titlename.trim());
							if (titlename.equalsIgnoreCase("Address Details")) {
//								System.out.println("Condition true");
								String jspath = "document.querySelectorAll('p-tag[ng-reflect-value=\"In-active\"]')[" + j + "]";
								WebElement ActiveBtn = javascriptHelper.executeScriptWithWebElement(jspath);
								actions.scrollToElement(ActiveBtn).build().perform();
								System.err.println("In-active : " +ActiveBtn.getText()); 
								String Status = ActiveBtn.getText();
								
								Assert.assertEquals("In-active", Status);
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

   //---------------------------------- @AT_CON_DUR_ADE_ID_06 ---------------------------
			
			
			@And("User_610 Scroll the Edit button under identification Details section in Additional Customer Info tab")
			public void user_610_scroll_the_edit_button_under_identification_details_section_in_additional_customer_info_tab() throws Throwable {
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
//							System.out.println(titlename.trim());
							if (titlename.trim().contains("Customer Identification")) {
//								System.out.println("Condition true");
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].parentElement.parentElement.querySelector('button[icon=\"pi pi-pencil\"]')";
								WebElement eyeBtn = javascriptHelper.executeScriptWithWebElement(jspath);
								actions.scrollToElement(eyeBtn).build().perform();
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
			
			@And("^User_610 To Verify Id Type fields on List view of Identification details$")
			public void user_610_to_verify_id_type_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("IdTypeLV")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify Id Number fields on List view of Identification details$")
			public void user_610_to_verify_id_number_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("IdNumber")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify Date of Issue fields on List view of Identification details$")
			public void user_610_to_verify_date_of_issue_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("DateOfissueLV")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify Place of Issue fields on List view of Identification details$")
			public void user_610_to_verify_place_of_issue_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("PlaceOfIssueLV")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify Date of Expiry fields on List view of Identification details$")
			public void user_610_to_verify_date_of_expiry_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("DateOfExpiryLV")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify Primary Id Flag fields on List view of Identification details$")
			public void user_610_to_verify_primary_id_flag_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("PrimaryIdFlagLV")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify Status fields on List view of Identification details$")
			public void user_610_to_verify_status_fields_on_list_view_of_identification_details()throws Throwable{
				for (int j = 0; j < 300; j++) {
					try {
						if (javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610
								.getElement("StatusLV")).isDisplayed()) {
							Assert.assertTrue(true);
							break;
						}
					} catch (Exception e) {
						if (j == 299) {
							Assert.fail(e.getMessage());
						}
						// TODO: handle exception
					}
				}
			}
			@And("^User_610 To Verify fields List view should be non editable.$")
			public void user_610_to_verify_fields_list_view_should_be_non_editable()throws Throwable{
				String length = null;
				for (int i = 0; i < 150; i++) {
					try {
						length = javascriptHelper
								.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length").toString();
//						System.out.println(length);
						if (!length.isBlank() && !length.equals("0")) {
							break;
						}
					} catch (Exception e) {
						if (i == 149) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 150; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
							if (titlename.trim().contains("Customer Identification")) {
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
										+ ".parentElement.parentElement.querySelector('table').querySelectorAll('td p-celleditor')[1]";
								WebElement field = javascriptHelper.executeScriptWithWebElement(jspath);
								String output = field.getAttribute("readonly");
								System.out.println("Out: " + output);
								javascriptHelper.backgroundBorder(field);
								softAssert.assertNull(output,
										"Listview values should be non editable under References List View section");
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 149) {
							Assert.fail(e.getMessage());
						}
					}
				}
		
			}
			
			
			@And("^User_610 click the Search button under Address Details section in Customer Identification Info tab$")
			public void user_610_click_the_search_button_under_address_details_section_in_Customer_Identification_info_tab()
					throws Throwable {
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
//						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
							if (titlename.trim().contains("Customer Identification")) {
								String titlePath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]";
								WebElement element = javascriptHelper.executeScriptWithWebElement(titlePath);
								javascriptHelper.scrollIntoView(element);
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
										+ ".parentElement.parentElement.querySelector('button[icon=\"pi pi-search\"]')";
								WebElement btn = javascriptHelper.executeScriptWithWebElement(jspath);
								btn.click();
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

			//----------  matching data
			
			@And("^User_610 to verify the functionality of Search box with matching data under Customer Identification section$")
			public void user_610_to_verify_the_functionality_of_search_box_with_matching_data_under_Customer_Identification_section()
					throws Throwable {
				for (int i = 0; i <= 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("listview_SearchBox"))
						.sendKeys(testData.get("Matching_Data"));
						break;
					} catch (Exception e) {
						if (i == 300) {


						}
					}
				}
			}

			@And("^User_610 to verify post entering any matching value system display all the possible matching records in Customer Identification section$")
			public void user_610_to_verify_post_entering_any_matching_value_system_display_all_the_possible_matching_records_in_Customer_Identification_section()
					throws Throwable {
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
//						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
							if (titlename.trim().contains("Customer Identification")) {
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
										+ ".parentElement.parentElement.querySelector('span[class*=\"p-paginator-current\"]')";
								WebElement searchResult = javascriptHelper.executeScriptWithWebElement(jspath);
								javascriptHelper.backgroundColor(searchResult);
								String text = searchResult.getText().substring(13, 14);
								System.out.println("Result value: "+text);
								softAssert.assertTrue(Integer.parseInt(text)>0,
										"System should display all the possible matching records in Address Details section");
								
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

			@And("^User_610 to verify the functionality of Search box with mismatch data under Customer Identification section$")
			public void user_610_to_verify_the_functionality_of_search_box_with_mismatch_data_under_Customer_Identification_section()
					throws Throwable {
				for (int i = 0; i <= 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("listview_SearchBox"))
						.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
						javascriptHelper.executeScriptWithWebElement(ADE_IdentificationDetails_610.getElement("listview_SearchBox"))
						.sendKeys(testData.get("Mismatch_Data"),Keys.TAB);
						break;
					} catch (Exception e) {
						if (i == 300) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

			@And("^User_610 to verify post entering any mismatch value system should not display any records in Customer Identification section$")
			public void user_610_to_verify_post_entering_any_mismatch_value_system_should_not_display_any_records_in_Customer_Identification_section()
					throws Throwable {
				String length = null;
				for (int i = 0; i < 300; i++) {
					try {
						length = javascriptHelper.executeScript("return document.querySelectorAll('ion-title[mode=\"md\"]').length")
								.toString();
//						System.out.println(length);
						if (!length.isBlank() && !length.equals("0") && !length.equals("1")) {
							break;
						}
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				for (int i = 0; i < 300; i++) {
					try {
						for (int j = 0; j < Integer.parseInt(length); j++) {
							String title = "return document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "].textContent";
							String titlename = javascriptHelper.executeScript(title).toString();
							if (titlename.trim().contains("Customer Identification")) {
								String jspath = "document.querySelectorAll('ion-title[mode=\"md\"]')[" + j + "]"
										+ ".parentElement.parentElement.querySelector('span[class*=\"p-paginator-current\"]')";
								WebElement searchResult = javascriptHelper.executeScriptWithWebElement(jspath);
								javascriptHelper.backgroundColor(searchResult);
								String text = searchResult.getText().substring(13, 14);
								System.out.println("Result value: "+text);
								softAssert.assertTrue(Integer.parseInt(text)==0,
										"System should display the message as No data found in Address Details section");						
								break;
							}
						}
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}

}
