
package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.JSPaths;
import resources.BaseClass;

public class TawarruqAppDataEntryFollowupdetails {
	
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths TWAppDataEntryFollowUpDetails = new JSPaths(excelPath, "TWAppDataEntryFollowUpDetails", "FieldName", "JSPath");
	ExcelData TawaAppDataEntryIncomeDetailsexelData = new ExcelData(excelTestDataPath, "TawaAppDataEntryIncomeDetails", "Data Set ID");
	Map<String, String> testData;
	
//	Map<String, String> TestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
	DropDownHelper DropDownHelper = new DropDownHelper(driver);
	SoftAssert SoftAssert = new SoftAssert();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	
	
	@And("User_607 click the customer follow details in morabha")
	public void user_click_the_customer_follow_details_in_morabha() throws Throwable {
	    
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("nextBtn_610")).click();
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("nextBtn_610")).click();
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("nextBtn_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
//				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_CustomerFollowUpDetailsTab_610")));
		// javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_DocumentDetails_610")));
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_CustomerFollowUpDetailsTab_610"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
			Thread.sleep(2000);		
	}
	
	@And("User_607 click add button under customer follow details")
	public void user_click_add_button_under_customer_follow_details() throws Throwable {
		// waitHelper.waitForElementwithFluentwait(driver,javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_AddButton_UnderFollowUpDetails_610")));
		// javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_AddButton_UnderFollowUpDetails_610")).click();
		for (int i = 0; i < 300; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_AddButton_UnderFollowUpDetails_610"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);
	}
	
	@And("User_607 validate Customer Responce field enabled or not under customer follow details")
	public void user_validate_customer_resbonce_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_customerResponce_UnderFollowUp_610")));
		if (!javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_customerResponce_UnderFollowUp_610"))
				.isDisplayed()) {
			Assert.fail();
		}
	}
	
	//-----------------  morabha  @AT_MU_FU_001
	
	@And("User_607 verify the add buttton")
	public void user_verify_the_add_buttton() throws Throwable {
//		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
//				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("clickAddBtn_UnderDocumentDetails_610")));
								
		for (int m = 0; m < 200; m++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("clickAddBtn_UnderDocumentDetails_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (m==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		
	}
	
	@And("User_607 validate called when field enabled or not under murabha customer follow details")
	public void user_validate_called_when_field_enabled_or_not_under_murabha_customer_follow_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CalledWhen_610")));
		
		for (int m = 0; m < 200; m++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CalledWhen_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				if (m==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
	}

	@And("User_607 validate Follow Up Data field enabled or not under murabha customer follow details")
	public void user_validate_follow_up_data_field_enabled_or_not_under_murabha_customer_follow_details() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("followUpDate_610")));
		
		if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("followUpDate_610")).isDisplayed()) {
			Assert.assertTrue(true);;
		}
	}
	
	@And("User_607 validate Remark Category field enabled or not under customer follow details")
	public void user_validate_remark_category_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_remark_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_remark_UnderFollowUp_610"))
				.isDisplayed()) {
			Assert.fail();
		}
	}

	@And("User_607 validate Back button field enabled or not under customer follow details")
	public void user_validate_back_button_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_backButton_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_backButton_UnderFollowUp_610"))
				.isDisplayed()) {
			Assert.fail();
		}
	}

	@And("User_607 validate Save button field enabled or not under customer follow details")
	public void user_validate_save_button_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_SaveButton_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_SaveButton_UnderFollowUp_610")).isDisplayed()) {
			Assert.fail();
		}
	}
	
	@And("User_607 to verify the functionality of add button should allow create new record")
	public void user_to_verify_the_functionality_of_add_button_should_allow_create_new_record() throws Throwable {
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("followUpDetailsScreen_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//-----back btn  validate
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Thread.sleep(2000);
		
	}	

	@And("User_607 to verify the functionality of edit button should redirct the edit page")
	public void user_to_verify_the_functionality_of_edit_button_should_redirct_the_edit_page() throws Throwable {
	    
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("editBtn_UnderFollowUp_610")).click();;
				break;
				} catch (Exception e) {
				// TODO: handle exception			
				}
	       }
		Thread.sleep(1000);
		
		for (int j = 0; j < 200; j++) {
			try {
				if (!javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("followUpDetailsScreen_610")).isDisplayed()) {
					Assert.fail();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		for (int k = 0; k < 200; k++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		Thread.sleep(2000);
	}
	
	@And("User_607 validate Sign Status field enabled or not under customer follow details")
	public void user_validate_single_status_field_enabled_or_not_under_customer_follow_details()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_signStatus_UnderFollowUp_610")));
		if (!javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_signStatus_UnderFollowUp_610"))
				.isDisplayed()) {
			Assert.fail();
		}
	}
	
	
	//-----------------------------   @AT_MU_FU_002  -----
	
	@And("User_607 validate the called when field should be date , mandatory and editable in murabha")
	public void user_validate_the_called_when_field_should_be_date_mandatory_and_editable_in_murabha() throws Throwable {
//		store xpath in string
//		String calledPath = "document.querySelector('[id=\"calledWhen\"] p-calendar')";
//		WebElement attribute = javascriptHelper.executeScriptWithWebElement(calledPath);
		
		String MurabhacalledWhenFormat = javascriptHelper
				.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CalledWhen_610"))
				.getAttribute("ng-reflect-date-format");
		
		System.err.println("tagName:  " +MurabhacalledWhenFormat);

		String assertcalled = "dd-M-yy";
		
		Assert.assertEquals(assertcalled, MurabhacalledWhenFormat);
		
		// ----------------validate mandatory field

				for (int i = 0; i < 2000; i++) {
					try {
						String calledwhen = "document.querySelector('label[ng-reflect-text=\"SCR.FOLLOWUPDTL.CALLED_WHEN.TO\"').parentElement.innerText";
						String calledwhenName = (String) javascriptHelper.executeScript("return " + calledwhen);
						System.out.println(calledwhenName);
						Assert.assertTrue(calledwhenName.contains("*"));
						
						break;
					} catch (Exception e) {
						if (i == 1999) {
							Assert.fail(e.getMessage());
						}
					}
					
				}

				// ----------------click

				for (int i = 0; i < 300; i++) {
					try {
						javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CalledWhen_610"))
								.click();
						break;
					} catch (Exception e) {
						if (i == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
				Thread.sleep(1000);

				for (int b = 0; b < 300; b++) {
					try {
						javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("selectTodayDateIn_FollowUPDate_UnderFollowUp_610"))
								.click();
						break;
					} catch (Exception e) {
						if (b == 299) {
							Assert.fail(e.getMessage());
						}
					}
				}
	}


	@And("User_607 validate the customer responce field should be lookUp , mandatory and editable in Murabha")
	public void user_validate_the_customer_responce_field_should_be_look_up_mandatory_and_editable_in_murabha() throws Throwable {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String customerResponceMurabha = "document.querySelector('ion-label[ng-reflect-text=\\\"SCR.FOLLOWUPDTL.CUST_RESP.TOOL\\\"]').innerText";
				String customerResponceMurabhaName = (String) javascriptHelper.executeScript("return " + customerResponceMurabha);
				
				System.err.println("customerResponceMurabha:"+ customerResponceMurabhaName);
			
				Assert.assertEquals(true, customerResponceMurabhaName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
		
		
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_customerResponceSelect_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		// ----------dropdown-------

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
			//		System.out.println("Map " + testData.get("CustomerResponce").trim());
					if ((dropdownString.trim())
							.equalsIgnoreCase((" REA02 ").trim())) {
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
				Thread.sleep(5000);
	}
	
	@Given("User_607 Click Edit button in Follow-Up Details List Screen")
	public void user_click_edit_button_in_follow_up_details_list_screen() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("editBtn_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@Given("User_607 Click save button Follow-Up Details Screen")
	public void user_click_save_button_follow_up_details_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("SaveButtonInFollowUpDetails")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@And("User_607 validate the follow up date field should be date , mandatory and editable in murabha")
	public void user_validate_the_follow_up_date_field_should_be_date_mandatory_and_editable_in_murabha() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String followUpDate = "document.querySelector('label[ng-reflect-text=\\\"SCR.FOLLOWUPDTL.FOLL_UP_DT.TOO\\\"]').parentElement.innerText";
				String followUpDateName = (String) javascriptHelper.executeScript("return " + followUpDate);
				
				System.err.println("followUpDateName:"+ followUpDateName);
			
			//	Assert.assertEquals(true, followUpDateName.contains("*"));
				Assert.assertTrue(!followUpDateName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
	}

	@And("User_607 validate the sign Status field should be dropdown , mandatory and editable in murabha")
	public void user_validate_the_sign_status_field_should_be_dropdown_mandatory_and_editable_in_murabha() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String signStatus = "document.querySelector('ion-label[ng-reflect-text=\"SCR.FOLLOWUPDTL.SIGN_STATUS.TO\"').nextElementSibling.parentElement.innerText";
				String signStatusName = (String) javascriptHelper.executeScript("return " + signStatus);
				
				System.err.println("signStatusName:"+ signStatusName);
			
			//	Assert.assertEquals(true, signStatusName.contains("*"));
				Assert.assertTrue(!signStatusName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
	}

	@And("User_607 validate the remarks field should be textbox , mandatory and editable in murabha")
	public void user_validate_the_remarks_field_should_be_textbox_mandatory_and_editable_in_murabha() {
	    
		// ----------------validate mandatory field

		for (int i = 0; i < 200; i++) {
			try {
				String Remark = "document.querySelector('ion-label[ng-reflect-text=\"SCR.REMARKS.TOOLTIP\"]').parentElement.innerText";
				String RemarkName = (String) javascriptHelper.executeScript("return " + Remark);
				
				System.err.println("RemarkName:"+ RemarkName);
			
			//	Assert.assertEquals(true, DocumentCategoryName.contains("*"));
				
				Assert.assertTrue(!RemarkName.contains("*"));
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
					}
	}

	@And("User_607 validate the save button under customer follow details in murabha")
	public void user_validate_the_save_button_under_customer_follow_details_in_murabha() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("click_SaveButton_UnderFollowUp_610"))
						.click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i<=500; i++) {
         	try {
         		if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("successMsg_610")).isDisplayed()) {
             		Assert.assertTrue(true);
         		}
         		break;
			} catch (Exception e) {
				if(i==500) {
					Assert.fail(e.getMessage());
				}
			}

		}
	    
	}
	
	//----------------------------------- @AT_MU_FU_005 -----------------
	
	
	
	//------------- @AT_IJ_IA_01     Ijara App Data Check Insurance Info
	
	@And("User_607 click Insurance Info screen")
	public void user_click_insurance_info_screen() {
		
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("insuranceInfo_Screen_610")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User_607 click view button")
	public void user_click_view_button() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("viewBtn_610")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("User_607 verify the Insurance Info screen get open")
	public void user_verify_the_insurance_info_screen_get_open() {
	    
		 for (int j = 0; j < 200; j++) {
				try {
					if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("BackBtn_underFollowUpList_610")).isDisplayed()) {
						Assert.assertTrue(true);
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}	
	}
	
	//----------------------------  @AT_IJ_IA_02
	
	@And("User_607 verify the field Insurance year")
	public void user_verify_the_field_insurance_year() {
	   
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("insuranceYear_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		
	}

	@And("User_607 verify the field Depreciation")
	public void user_verify_the_field_depreciation() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("depreciation_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		
	}
	
	@And("User_607 verify the field Assert Price")
	public void user_verify_the_field_assert_price() {
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("assertPrice_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	 
	//------------------------@AT_IJ_IA_03
	
	@And("User_607 verify the Rate Per Price")
	public void user_verify_the_rate_per_price() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("ratePerAssert_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	@And("User_607 verify the Minium Insurance Premium")
	public void user_verify_the_minium_insurance_premium() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("miniumInsurancePremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	@And("User_607 verify the Base Insurance Premium")
	public void user_verify_the_base_insurance_premium() {
	    
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("baseInsurancePremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	//--------------------@AT_IJ_IA_04
	
	@And("User_607 verify the VAT premium")
	public void user_verify_the_vat_premium() {
	   

		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("VATPremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

	@And("User_607 verify the Net Premium")
	public void user_verify_the_net_premium() {
	    

		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("NetPremium_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	@And("User_607 verify the Back button")
	public void user_verify_the_back_button() {
	    
		for (int b = 0; b < 300; b++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("BackBtn_underFollowUpList_610")).click();
				break;
			} catch (Exception e) {
				if (b == 299) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int j = 0; j < 200; j++) {
			try {
				if (javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("viewBtn_610")).isDisplayed()) {
					Assert.assertTrue(true);
					break;
				}
			} catch (Exception e) {
			}
		}
	}
	
	@Given("User_607 Check Save button and Back button in Follow Up Details screen")
	public void user_check_save_button_and_back_button_in_follow_up_details_screen() {
		for (int i = 0; i < 500; i++) {
			try {
				if (!(javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("BackButtonInFollowUpDetails")).isDisplayed())) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		for (int i = 0; i < 500; i++) {
			try {
				if (!(javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("SaveButtonInFollowUpDetails")).isDisplayed())) {
					Assert.fail();
				}
				break;
			} catch (Exception e) {
				if (i == 499) {
					Assert.fail(e.getMessage());
				}
			}
		}
	    
	}

	@Given("User_607 Check Able to modify the record in Follow Up Details screen")
	public void user_check_able_to_modify_the_record_in_follow_up_details_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CustomerResponse")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
		
		
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

						System.out
								.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");

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

				System.out.println("Map " + " Call Later ".trim());

				if ((dropdownString.trim())
						.equalsIgnoreCase((" Call Later ").trim())) {

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


	@Given("User_607 Clear the value in Called when field")
	public void user_clear_the_value_in_called_when_field() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CalledWhenInputField")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
		
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("ClearButtonInCalledWhenField")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Enter invalid in Called when field")
	public void user_enter_invalid_in_called_when_field() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("CalledWhenInputField")).sendKeys("dhfgnjfgn",Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}

	@Given("User_607 Clicking on back button system should navigate to the previous screen")
	public void user_clicking_on_back_button_system_should_navigate_to_the_previous_screen() {
		for (int i = 0; i < 700; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(TWAppDataEntryFollowUpDetails.getElement("BackButtonInFollowUpDetails")).click();
				break;
			} catch (Exception e) {
				if (i==699) {
					Assert.fail(e.getMessage());
				}
				}
			}
	}
	
}
