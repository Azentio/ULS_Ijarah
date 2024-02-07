package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class PersonalLoan_NewApp_CustometDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths PL_Newapp_CustomerDetails_JS = new JSPaths(excelPath, "PL_NawApp_CustomerDetail",
			"CustomerDetailElements", "JSPath");
	ExcelData PL_Newapp_CustomerDetails_TestData = new ExcelData(excelTestDataPath, "PL_NewApp_CustomerDetail",
			"Dataset ID");
	//JSPaths appDataEntry_js = new JSPaths(excelPath, "appDataEntry_js", "AppDataEntryElements", "JSPath");
	
	@And("User_6047 Get the test data for test case ID AT_PL_NEWAPP_CD_11")
	public void user_6047_get_the_test_data_for_test_case_id_at_pl_newapp_cd_11() {
		testData = PL_Newapp_CustomerDetails_TestData.getTestdata("DS01_AT_PL_NEWAPP_CD_11");
	}
	@Then("User_6047 search the Reference Id Under Inbox")
	public void user_6047_search_the_reference_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));

		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				//.sendKeys(testData.get("Ref No")); 
				.sendKeys(testData.get("Ref No"));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}
	

	@Then("User_6047 To verify the field Remarks should be mandatory,editable,text")
	public void user_6047_to_verify_the_field_remarks_should_be_mandatory_editable_text() throws Throwable {
		Thread.sleep(3000);
		javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("remarks")));
		String mandatory= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("remarks")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(mandatory.contains("true"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Editable= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("remarks")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String text= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("remarks")).getAttribute("ng-reflect-show-text-area-box");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(text.contains("true"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify the field phone number should be number,editable")
	public void user_6047_to_verify_the_field_phone_number_should_be_number_editable() {
		String Editable= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("PhoneNumber")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String text= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("PhoneNumber")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@Then("User_6047 To verify the field Mobile number\\(Primary) should be number,editable")
	public void user_6047_to_verify_the_field_mobile_number_primary_should_be_number_editable() {
		String Editable= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("MobileNumber(primary)")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String text= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("MobileNumber(primary)")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@Then("User_6047 To verify the field Mobile number\\(Secondary) should be number,editable")
	public void user_6047_to_verify_the_field_mobile_number_secondary_should_be_number_editable() {
		String Editable= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("MobileNumber(secondary)_verify")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String text= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("MobileNumber(secondary)_verify")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@Then("User_6047 To verify the field Email should be email format,editable")
	public void user_6047_to_verify_the_field_email_should_be_email_format_editable() {
		String Editable= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("Email")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String text= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("Email")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@Then("User_6047 To verify the field Prefered Time for contact should be HH:MM format,editable")
	public void user_6047_to_verify_the_field_prefered_time_for_contact_should_be_hh_mm_format_editable() {
		String Editable= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("PreferedTimeForContact")).getAttribute("ng-reflect-readonly");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Editable.contains("false"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String text= javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("PreferedTimeForContact")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@Then("User_6047 to verify System should allow to add new record of Customer Information")
	public void user_6047_to_verify_system_should_allow_to_add_new_record_of_customer_information() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("searchCustomerTitle"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 Click the Initiate Video KYC button")
	public void user_6047_click_the_initiate_video_kyc_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("initiateVideoKYC")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@Then("User_6047 verify the functionality of the Initiate Video KYC button")
	public void user_6047_verify_the_functionality_of_the_initiate_video_kyc_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("User_6047 Click the back button")
	public void user_6047_click_the_back_button() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("Backbutton_customerdet")).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
	    	
	    	
		}
	}

	@Then("User_6047 verify the functionality of back button in customer detail")
	public void user_6047_verify_the_functionality_of_back_button_in_customer_detail() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(PL_Newapp_CustomerDetails_JS.getElement("AddButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

}
