package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.JSPaths;
import resources.BaseClass;

public class Tawarruq_NewApp_CustomerDetails {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	IjaraLogin ijaraLogin = new IjaraLogin();
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	// Ijarah_CommonFieldName
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JSPaths commonJSPaths = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	Map<String, String> testData;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JSPaths iJarah_CommonElements = new JSPaths(excelPath, "iJarah_CommonElements", "Ijarah_CommonFieldName", "JSPath");
	JSPaths CustomerDetails_js = new JSPaths(excelPath, "NewApp_CustomerDetailsElements", "New_App_CustomerDetailsElements", "JSPath");
	ExcelData NewApp_CustomerDetails_TestData  = new ExcelData(excelTestDataPath,"Tawar_NewApp_CustomerDetails","Dataset ID");
	String listViewRecordStatus = "";
	JSPaths Tawarruq_NewApp_CustomerDetailsElements = new JSPaths(excelPath, "NewApp_CustomerDetailsElements",
			"New_App_CustomerDetailsElements", "JSPath");
	String recordStatus = "";
	@And("User_6047 Get the test data for test case ID AT_TW_NewApp_CD_01")
	public void user_get_the_test_data_for_test_case_id_at_tw_newapp_cd01() {
		testData =  NewApp_CustomerDetails_TestData.getTestdata("DS01_AT_TW_NewApp_CD_01");
	}
	@And("User_6047 Get the test data for test case ID AT_TW_NewApp_CD_06")
	public void user_get_the_test_data_for_test_case_id_at_tw_newapp_cd06() {
		testData =  NewApp_CustomerDetails_TestData.getTestdata("DS01_AT_TW_NewApp_CD_06");
	}
	@And("User_6047 Click the Customer Details tab")
	public void user_click_customer_details_tab() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(
						CustomerDetails_js.getElement("customer_details_tab")).click();
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}
	@And("User_6047 Search  the  Ref Id Under Inbox")
	public void user_search_the_ref_id_under_inbox() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text")));
		//javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
		//.sendKeys(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("mail_box_search_text"))
				.sendKeys(testData.get("Ref No")); 
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	}
	@Then("User_6047 verify the Customer Type Field")
	public void user_verify_the_customer_type_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(
								CustomerDetails_js.getElement("customerType_verification"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Applicant Type Field")
	public void user_verify_the_applicant_type_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(
						javascriptHelper
						.executeScriptWithWebElement(
								CustomerDetails_js.getElement("applicantType"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Title Field")
	public void user_verify_the_title_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("title"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the First Name Field")
	public void user_verify_the_first_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Middle Name  Field")
	public void user_verify_the_middle_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 verify the Third Name Field")
	public void user_verify_the_third_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Family Name Field")
	public void user_verify_the_family_name_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_mandi"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the First Name \\(Arabic) Field")
	public void user_verify_the_first_name_arabic_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName_arabic_input"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Middle Name \\(Arabic) Field")
	public void user_verify_the_middle_name_arabic_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName_arabic_input"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Third Name \\(Arabic) Field")
	public void user_verify_the_third_name_arabic_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName_arabic_input"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Family Name \\(Arabic) Field")
	public void user_verify_the_family_name_arabic_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_arabic_input"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Customer full name \\(Arabic) Field")
	public void user_verify_the_customer_full_name_arabic_field() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User_6047 verify the Date Of Birth Field")
	public void user_verify_the_date_of_birth_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("date_of_birth_field"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Age Field")
	public void user_verify_the_age_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("age"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Gender Field")
	public void user_verify_the_gender_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("gender_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Marital Status Field")
	public void user_verify_the_marital_status_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("maritalStatus"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Education Level Field")
	public void user_verify_the_education_level_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("education_level_dropdown"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Nationality Field")
	public void user_verify_the_nationality_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("nationality"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Residential Status Field")
	public void user_verify_the_residential_status_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("residentialStatus_verification")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("residentialStatus_verification"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Language Field")
	public void user_verify_the_language_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("language"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the No Of Dependents Field")
	public void user_verify_the_no_of_dependents_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Industry Segmentation Field")
	public void user_verify_the_industry_segmentation_field() {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("categoryOfClient")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("categoryOfClient"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Blacklisted Field")
	public void user_verify_the_blacklisted_field() {
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("blacklisted"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Remarks Field")
	public void user_verify_the_remarks_field() {
		for (int i = 0; i < 200; i++) {
			try {
				//				javascriptHelper
				//				.scrollIntoView(javascriptHelper
				//						.executeScriptWithWebElement(CustomerDetails_js.getElement("remarks_input")));
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("remarks_mandatory_verification"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 verify the Customer Type Field should be mandatory,editable,dropdown")
	public void user_verify_the_customer_type_field_should_be_mandatory_editable_dropdown() {
		javascriptHelper
		.scrollIntoView(javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_details_type_dropdown")));
		String CustomerType_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_details_type_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(CustomerType_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String  CustomerType_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_details_type_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue(( CustomerType_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String CustomerType_dropdown= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_details_type_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue( CustomerType_dropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Applicant Type Field should be mandatory,editable,dropdown")
	public void user_verify_the_applicant_type_field_should_be_mandatory_editable_textbox() {
		String ApplicantType_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("application_type_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(ApplicantType_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String ApplicantType_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("application_type_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((ApplicantType_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String ApplicantType_dropdown= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("application_type_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(ApplicantType_dropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Title Field should be mandatory,editable,dropdown")
	public void user_verify_the_title_field_should_be_mandatory_editable_dropdown() {
		String Title_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("title_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Title_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Title_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("title_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Title_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Title_dropdown= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("title_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Title_dropdown.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the First Name Field should be mandatory,editable,textbox")
	public void user_verify_the_first_name_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName_verification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName_verification")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Middle Name  Field should be nonmandatory,editable,textbox")
	public void user_verify_the_middle_name_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName_verification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName_verification")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Third Name Field should be mandatory,editable,textbox")
	public void user_verify_the_third_name_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName_verification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName_verification")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}

			}}}

	@Then("User_6047 verify the Family Name Field should be mandatory,editable,textbox")
	public void user_verify_the_family_name_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_mandi")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_input")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the First Name \\(Arabic) Field should be mandatory,editable,textbox")
	public void user_verify_the_first_name_arabic_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName_arabic_mandatory")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName_arabic_input")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstName_arabic_input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Middle Name \\(Arabic) Field should be mandatory,editable,textbox")
	public void user_verify_the_middle_name_arabic_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName_arabic_mandatory")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName_arabic_input")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("middleName_arabic_input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Third Name \\(Arabic) Field should be mandatory,editable,textbox")
	public void user_verify_the_third_name_arabic_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName_arabic_mandatory")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName_arabic_input")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("lastName_arabic_input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Family Name \\(Arabic) Field should be mandatory,editable,textbox")
	public void user_verify_the_family_name_arabic_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_arabic_mandatory")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_arabic_input")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("familyName_arabic_input")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Date Of Birth Field should be mandatory,editable,calendar")
	public void user_verify_the_date_of_birth_field_should_be_mandatory_editable_calendar() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("date_of_birth_field")).getAttribute("ng-reflect-required");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("true"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("date_of_birth_field")).getAttribute("ng-reflect-readonly");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("date_of_birth_field_calendar")).getAttribute("ng-reflect-icon");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("pi pi-calendar"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Age Field should be mandatory,editable,number")
	public void user_verify_the_age_field_should_be_mandatory_editable_calendar() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("age")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("age_input_verification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("age_input_verification")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("number"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Gender Field should be mandatory,editable,dropdown")
	public void user_verify_the_gender_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("gender_field_verification")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("gender_field_verification")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("gender_field_verification")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Marital Status Field should be mandatory,editable,dropdown")
	public void user_verify_the_marital_status_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("maritail_status_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("maritail_status_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("maritail_status_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Education Level Field should be mandatory,editable,dropdown")
	public void user_verify_the_education_level_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("education_level_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("education_level_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("education_level_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Nationality Field should be mandatory,editable,dropdown")
	public void user_verify_the_nationality_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("nationality_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("nationality_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("nationality_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Residential Status Field should be mandatory,editable,dropdown")
	public void user_verify_the_residential_status_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_residential_status_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_residential_status_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_residential_status_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Language Field should be mandatory,editable,dropdown")
	public void user_verify_the_language_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("languages_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("languages_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("languages_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Select"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the No Of Dependents Field should be mandatory,editable,textbox")
	public void user_verify_the_no_of_dependents_field_should_be_mandatory_editable_textbox() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Scheme_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Industry Segmentation Field should be mandatory,editable,dropdown")
	public void user_verify_the_industry_segmentation_field_should_be_mandatory_editable_dropdown() {
		String Scheme_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("client_category_dropdown")).getAttribute("aria-label");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Scheme_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("client_category_dropdown")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Scheme_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Scheme_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("client_category_dropdown")).getAttribute("ng-reflect-placeholder");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Scheme_text.contains("Client Category"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Blacklisted Field should be Non-mandatory,editable,toggle")
	public void user_verify_the_blacklisted_field_should_be_non_mandatory_editable_toggle() {
		String Blacklisted_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("blacklisted_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!Blacklisted_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String Blacklisted_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("blacklisted_toggle")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((Blacklisted_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String Blacklisted_toggle= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("blacklisted_toggle")).getAttribute("role");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(Blacklisted_toggle.contains("switch"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the Remarks Field should be mandatory,editable,text")
	public void user_verify_the_remarks_field_should_be_mandatory_editable_dropdown() {
		//javascriptHelper.scrollIntoView(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("remarks_mandatory_verification")));
		String remark_mandy= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("remarks_mandatory_verification")).getText();
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(!remark_mandy.contains("*"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}

		String remark_Edit = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("remarks_inputt")).getAttribute("ng-reflect-is-disabled");

		for (int i = 0; i <2000; i++) {

			try {
				Assert.assertTrue((remark_Edit.contains("false")));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String remark_text= javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("remarks_inputt")).getAttribute("type");
		for (int i = 0; i <2000; i++) {
			try {
				Assert.assertTrue(remark_text.contains("text"));
				break;
			} catch (Exception e) {
				if (i==1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("User_6047 give the input for Customer Type Field")
	public void user_give_the_input_for_customer_type_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("application_type_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Document Status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Document Status")).trim())) {
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



	@Then("User_6047 give the input for verify the Title Field")
	public void user_give_the_input_for_verify_the_title_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("title_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Title").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Title")).trim())) {
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

	@Then("User_6047 give the input for Third Name Field")
	public void user_verify_the_give_the_input_for_first_name_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")));
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						(CustomerDetails_js.getElement("last_name_input")))
				.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

				//javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").click();
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).sendKeys("last");
				Thread.sleep(7000);
				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the input for First Name Field")
	public void user_verify_the_give_the_input_for_third_name_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("first_name_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("first_name_input")).sendKeys("First");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the input for First Name \\(Arabic) Field")
	public void user_verify_the_give_the_input_for_first_name_arabic_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("first_name_arabic_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("first_name_arabic_input")).sendKeys("أولا");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the input for Third Name \\(Arabic) Field")
	public void user_verify_the_give_the_input_for_third_name_arabic_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_arabic_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_arabic_input")).sendKeys("ثالث");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the input for Date Of Birth Field")
	public void user_verify_the_give_the_input_for_date_of_birth_field() {

		javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("calender")).click();
		javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("today_button")).click();
		
	}

	@Then("User_6047 give the input for Gender Field")
	public void user_verify_the_give_the_input_for_gender_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("gender_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Gender").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Gender")).trim())) {
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

	@Then("User_6047 give the input for Marital Status Field")
	public void user_verify_the_give_the_input_for_marital_status_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("maritail_status_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Maritail status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Maritail status")).trim())) {
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

	@Then("User_6047 give the input for Education Level Field")
	public void user_verify_the_give_the_input_for_education_level_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("education_level_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("Education level").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("Education level")).trim())) {
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

	@Then("User_6047 give the input for Nationality Field")
	public void user_verify_the_give_the_input_for_nationality_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("nationality_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("nationality").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("nationality")).trim())) {
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

	@Then("User_6047 give the input for Residential Status Field")
	public void user_verify_the_give_the_input_for_residential_status_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_residential_status_dropdown")));
				//javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("customer_residential_status_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("residential status").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("residential status")).trim())) {
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

	@Then("User_6047 give the input for Language Field")
	public void user_verify_the_give_the_input_for_language_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("languages_dropdown")));
				//javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("languages_dropdown")));
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("languages_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("language").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("language")).trim())) {
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

	@Then("User_6047 give the input for No Of Dependents Field")
	public void user_verify_the_give_the_input_for_no_of_dependents_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")));
				//javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")).sendKeys("2");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the input for Industry Segmentation Field")
	public void user_verify_the_give_the_input_for_industry_segmentation_field() {
		for (int i = 0; i <= 2000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("client_category_dropdown")));
				//javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("client_category_dropdown")).click();
				break;
			} catch (Exception e) {
				if (i == 2000) {
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
					System.out.println("document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText");
					dropdownString = javascriptHelper.executeScript(
							"return document.querySelectorAll('ion-radio-group ion-label')[" + j + "].innerText").toString();
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
			System.out.println("Map " + testData.get("client_category").trim());
			if ((dropdownString.trim()).equalsIgnoreCase((testData.get("client_category")).trim())) {
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
	@Then("User_6047 give the negative numeric input for third Name Field")
	public void user_give_the_negative_numeric_input_for_first_name_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input"))
				.sendKeys(Keys.PAGE_UP);
				//javascriptHelper
				//.scrollIntoView(javascriptHelper
				//.executeScriptWithWebElement(CustomerDetails_js.getElement("first_name_input")));
				//javascriptHelper
				//.executeScriptWithWebElement(CustomerDetails_js.getElement("first_name_input")).click();
				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")));
				//javascriptHelper.executeScriptWithWebElement("document.querySelector('input[aria-labelledby=\"ion-input-4-lbl\"]')").click();
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).sendKeys("-1236");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the impact when user enter the negative numeric input")
	public void user_verify_the_impact_when_user_enter_the_negative_numeric_input() {
		for (int i = 0; i < 2000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input"))
				.sendKeys(Keys.PAGE_UP);
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("firstname_errMsg")));
				String text = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstname_errMsg"))
						.getText();
				System.out.println(text);
				Assert.assertTrue(text.contains("Only Alphabets are allowed"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the characters value input for No Of Dependents Field")
	public void user_give_the_characters_value_input_for_no_of_dependents_field() {
		for (int i = 0; i <= 1000; i++) {
			try {

				//				javascriptHelper
				//				.scrollIntoView(javascriptHelper
				//						.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")));

				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")).click();
				javascriptHelper
				.executeScriptWithWebElement(
						(CustomerDetails_js.getElement("no_of_dependents_input")))
				.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));

				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")).sendKeys("abc");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the impact when user enter characters value in numeric field\\(No Of Dependents Field)")
	public void user_verify_the_impact_when_user_enter_characters_value_in_numeric_field_no_of_dependents_field() {
		for (int i = 0; i < 2000; i++) {
			try {
				//				javascriptHelper
				//				.scrollIntoView(javascriptHelper
				//						.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents")));
				String text = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents")).getAttribute("ng-reflect-model");

				System.out.println(text);
				Assert.assertTrue(text.contains(""));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 give the only special characters input for third Name Field")
	public void user_give_the_only_special_characters_input_for_no_of_dependents_field() {
		for (int i = 0; i <= 1000; i++) {
			try {
				//				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input"))
				//				.sendKeys(Keys.PAGE_UP);

				javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")));

				javascriptHelper
				.executeScriptWithWebElement(
						(CustomerDetails_js.getElement("last_name_input")))
				.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				//javascriptHelper.JSEClick(javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")));
				//javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("no_of_dependents_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).sendKeys("#$%");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 verify the impact when user enters only special characters value in any field \\(first name)")
	public void user_verify_the_impact_when_user_enters_only_special_characters_value_in_any_field_first_name() {
		for (int i = 0; i < 2000; i++) {
			try {
				//javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input"))
				//.sendKeys(Keys.PAGE_UP);
				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("firstname_errMsg")));
				String text = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstname_errMsg"))
						.getText();
				System.out.println(text);
				Assert.assertTrue(text.contains("Only Alphabets are allowed"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 delete the data in customer detail record")
	public void user_delete_the_data_in_customer_detail_record() {
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
				.executeScriptWithWebElement(
						(CustomerDetails_js.getElement("last_name_input")))
				.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));


				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 update the customer detail record with invalid data")
	public void user_update_the_customer_detail_record_with_invalid_data() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).sendKeys("123");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 To verify modification of the invalid data is not allowed")
	public void user_to_verify_modification_of_the_invalid_data_is_not_allowed() {
		for (int i = 0; i < 2000; i++) {
			try {

				javascriptHelper
				.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("firstname_errMsg")));
				String text = javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("firstname_errMsg"))
						.getText();
				System.out.println(text);
				Assert.assertTrue(text.contains("Only Alphabets are allowed"));
				break;
			} catch (Exception e) {
				if (i == 1999) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("User_6047 update the customer detail record with valid data")
	public void user_update_the_customer_detail_record_with_valid_data() {
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement((CustomerDetails_js.getElement("last_name_input")))
				.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).click();
				javascriptHelper.executeScriptWithWebElement(CustomerDetails_js.getElement("last_name_input")).sendKeys("last");

				break;
			} catch (Exception e) { 
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}


	@Then("User_6047 To verify Customer Information list view fields")
	public void user_to_verify_customer_information_list_view_fields() {
		String listViewRecordLabels = "";
		for (int i = 0; i <= 300; i++) {
			try {
				listViewRecordLabels = javascriptHelper
						.executeScript(
								"return " + CustomerDetails_js.getElement("customer_details_list_view_record"))
						.toString();
				if (!(listViewRecordLabels.isBlank())) {
					break;
				}
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		softAssert.assertTrue(listViewRecordLabels.contains("First Name"), "First Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Middle Name"), "Middle Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Last Name"), "Last Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Family Name"), "Family Name is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Customer Type"),
				"Customer Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Applicant Type"),
				"Applicant Type is not visible in list view");
		softAssert.assertTrue(listViewRecordLabels.contains("Status"), "Status is not visible in list view");

		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("searchButton"))
						.isDisplayed());
				Assert.assertTrue(javascriptHelper
						.executeScriptWithWebElement(CustomerDetails_js.getElement("addButton"))
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}


	}
	@Then("User_6047 click the Search button under Customer details tab and search the matching data in listview")
	public void user_click_the_search_button_under_customer_details_tab_and_search_the_matching_data_in_listview() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("searchButton"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
				.sendKeys(testData.get("matching data"));
				Thread.sleep(3000);
				break;
			}

			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("User_6047 click the Search button under Customer details tab and search the mismatching data in listview")
	public void user_click_the_search_button_under_customer_details_tab_and_search_the_mismatching_data_in_listview() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(CustomerDetails_js.getElement("searchButton"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
				.sendKeys(testData.get("mismatch data"));
				Thread.sleep(3000);
				break;
			}

			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}


	@Then("User_6047 click the Search button under customer details tab listview")
	public void user_click_the_search_button_under_customer_details_tab_listview() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
				.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("searchButton"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 500; i++) {
			try {

				javascriptHelper.executeScriptWithWebElement(iJarah_CommonElements.getElement("search_box_search_text"))
				.sendKeys(testData.get("Record_Firstname"));
				Thread.sleep(3000);
				break;
			}

			catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	@Then("User_6047 change the address details Status to active to inactive or inactive to active")
	public void user_change_the_address_details_status_to_active_to_inactive_or_inactive_to_active() throws Throwable {
		for (int i = 0; i <= 300; i++) {
			try {
				javascriptHelper.scrollIntoView(javascriptHelper
						.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("Status")));
				javascriptHelper
				.executeScriptWithWebElement(Tawarruq_NewApp_CustomerDetailsElements.getElement("Status_toggle"))
				.click();
				break;
			} catch (Exception e) {
				if (i == 300) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(1000);

		for (int i = 0; i <= 100; i++) {
			try {
				recordStatus = javascriptHelper
						.executeScript(
								"return " + Tawarruq_NewApp_CustomerDetailsElements.getElement("CustomerDetail_Status"))
						.toString();
			} catch (Exception e) {

			}
		}
	}
	@Then("User_6047 verify system should show the record Status as active or inactive based on toggle")
	public void verify_system_should_show_the_record_status_as_active_or_inactive_based_on_toggle() throws Throwable {
		Thread.sleep(1000);
		// System.out.println("Index value in list view record validation " +
		// indexOfListView);
		for (int i = 0; i <= 3000; i++) {
			try {
				if (i > 2500) {
					System.out.println(
							"document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText");
					listViewRecordStatus = javascriptHelper.executeScript(
							"return document.querySelector('ion-col[class=\"p-2 md hydrated\"]').querySelector('td[ng-reflect-ng-switch=\"badge\"] span>span').innerText")
							.toString();

					System.out.println("List view Record status " + listViewRecordStatus);
					if (!(listViewRecordStatus.isBlank())) {
						break;
					}
				}
			} catch (Exception e) {
				if (i == 3000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (recordStatus.equals("false")) {
			softAssert.assertEquals(listViewRecordStatus, "In-active");
		} else if (recordStatus.equals("true")) {
			softAssert.assertEquals(listViewRecordStatus, "Active");
		}
	}
}
